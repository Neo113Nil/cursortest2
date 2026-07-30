package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import cn.hutool.core.text.l;
import com.baidu.ar.util.SystemInfoUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class WidgetGroup {
    private static final boolean DEBUG = false;
    static int sCount;
    int mId;
    int mOrientation;
    ArrayList<ConstraintWidget> mWidgets = new ArrayList<>();
    boolean mAuthoritative = false;
    ArrayList<MeasureResult> mResults = null;
    private int mMoveTo = -1;

    static class MeasureResult {
        int mBaseline;
        int mBottom;
        int mLeft;
        int mOrientation;
        int mRight;
        int mTop;
        WeakReference<ConstraintWidget> mWidgetRef;

        MeasureResult(ConstraintWidget constraintWidget, LinearSystem linearSystem, int i8) {
            this.mWidgetRef = new WeakReference<>(constraintWidget);
            this.mLeft = linearSystem.getObjectVariableValue(constraintWidget.mLeft);
            this.mTop = linearSystem.getObjectVariableValue(constraintWidget.mTop);
            this.mRight = linearSystem.getObjectVariableValue(constraintWidget.mRight);
            this.mBottom = linearSystem.getObjectVariableValue(constraintWidget.mBottom);
            this.mBaseline = linearSystem.getObjectVariableValue(constraintWidget.mBaseline);
            this.mOrientation = i8;
        }

        public void apply() {
            ConstraintWidget constraintWidget = this.mWidgetRef.get();
            if (constraintWidget != null) {
                constraintWidget.setFinalFrame(this.mLeft, this.mTop, this.mRight, this.mBottom, this.mBaseline, this.mOrientation);
            }
        }
    }

    public WidgetGroup(int i8) {
        int i9 = sCount;
        sCount = i9 + 1;
        this.mId = i9;
        this.mOrientation = i8;
    }

    private boolean contains(ConstraintWidget constraintWidget) {
        return this.mWidgets.contains(constraintWidget);
    }

    private String getOrientationString() {
        int i8 = this.mOrientation;
        return i8 == 0 ? "Horizontal" : i8 == 1 ? "Vertical" : i8 == 2 ? "Both" : "Unknown";
    }

    private int measureWrap(int i8, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(i8);
        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            return i8 == 0 ? constraintWidget.getWidth() : constraintWidget.getHeight();
        }
        return -1;
    }

    private int solverMeasure(LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i8) {
        int objectVariableValue;
        int objectVariableValue2;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) arrayList.get(0).getParent();
        linearSystem.reset();
        constraintWidgetContainer.addToSolver(linearSystem, false);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            arrayList.get(i9).addToSolver(linearSystem, false);
        }
        if (i8 == 0 && constraintWidgetContainer.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i8 == 1 && constraintWidgetContainer.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.minimize();
        } catch (Exception e8) {
            System.err.println(e8.toString() + "\n" + Arrays.toString(e8.getStackTrace()).replace("[", "   at ").replace(SystemInfoUtil.COMMA, "\n   at").replace("]", ""));
        }
        this.mResults = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.mResults.add(new MeasureResult(arrayList.get(i10), linearSystem, i8));
        }
        if (i8 == 0) {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mLeft);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mRight);
            linearSystem.reset();
        } else {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mTop);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mBottom);
            linearSystem.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public boolean add(ConstraintWidget constraintWidget) {
        if (this.mWidgets.contains(constraintWidget)) {
            return false;
        }
        this.mWidgets.add(constraintWidget);
        return true;
    }

    public void apply() {
        if (this.mResults != null && this.mAuthoritative) {
            for (int i8 = 0; i8 < this.mResults.size(); i8++) {
                this.mResults.get(i8).apply();
            }
        }
    }

    public void cleanup(ArrayList<WidgetGroup> arrayList) {
        int size = this.mWidgets.size();
        if (this.mMoveTo != -1 && size > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                WidgetGroup widgetGroup = arrayList.get(i8);
                if (this.mMoveTo == widgetGroup.mId) {
                    moveTo(this.mOrientation, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void clear() {
        this.mWidgets.clear();
    }

    public int getId() {
        return this.mId;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean intersectWith(WidgetGroup widgetGroup) {
        for (int i8 = 0; i8 < this.mWidgets.size(); i8++) {
            if (widgetGroup.contains(this.mWidgets.get(i8))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAuthoritative() {
        return this.mAuthoritative;
    }

    public void moveTo(int i8, WidgetGroup widgetGroup) {
        Iterator<ConstraintWidget> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            widgetGroup.add(next);
            if (i8 == 0) {
                next.horizontalGroup = widgetGroup.getId();
            } else {
                next.verticalGroup = widgetGroup.getId();
            }
        }
        this.mMoveTo = widgetGroup.mId;
    }

    public void setAuthoritative(boolean z7) {
        this.mAuthoritative = z7;
    }

    public void setOrientation(int i8) {
        this.mOrientation = i8;
    }

    public int size() {
        return this.mWidgets.size();
    }

    public String toString() {
        String str = getOrientationString() + " [" + this.mId + "] <";
        Iterator<ConstraintWidget> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            str = str + l.SPACE + it.next().getDebugName();
        }
        return str + " >";
    }

    public int measureWrap(LinearSystem linearSystem, int i8) {
        if (this.mWidgets.size() == 0) {
            return 0;
        }
        return solverMeasure(linearSystem, this.mWidgets, i8);
    }
}
