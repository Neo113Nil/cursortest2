package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private static final boolean USE_RELAX_GONE = false;
    private static final boolean USE_RESOLUTION = true;
    private int mBarrierType = 0;
    private boolean mAllowsGoneWidget = true;
    private int mMargin = 0;
    boolean mResolved = false;

    public Barrier() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z7) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z8;
        int i8;
        int i9;
        int i10;
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i11 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i11 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i11];
            constraintAnchor.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor);
            i11++;
        }
        int i12 = this.mBarrierType;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i12];
        if (!this.mResolved) {
            allSolved();
        }
        if (this.mResolved) {
            this.mResolved = false;
            int i13 = this.mBarrierType;
            if (i13 == 0 || i13 == 1) {
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mX);
                linearSystem.addEquality(this.mRight.mSolverVariable, this.mX);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    linearSystem.addEquality(this.mTop.mSolverVariable, this.mY);
                    linearSystem.addEquality(this.mBottom.mSolverVariable, this.mY);
                    return;
                }
                return;
            }
        }
        for (int i14 = 0; i14 < this.mWidgetsCount; i14++) {
            ConstraintWidget constraintWidget = this.mWidgets[i14];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i9 = this.mBarrierType) == 0 || i9 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i10 = this.mBarrierType) == 2 || i10 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                z8 = true;
                break;
            }
        }
        z8 = false;
        boolean z9 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
        boolean z10 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
        int i15 = !(!z8 && (((i8 = this.mBarrierType) == 0 && z9) || ((i8 == 2 && z10) || ((i8 == 1 && z9) || (i8 == 3 && z10))))) ? 4 : 5;
        for (int i16 = 0; i16 < this.mWidgetsCount; i16++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i16];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.mBarrierType]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                int i17 = this.mBarrierType;
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i17];
                constraintAnchor3.mSolverVariable = createObjectVariable;
                ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
                int i18 = (constraintAnchor4 == null || constraintAnchor4.mOwner != this) ? 0 : constraintAnchor3.mMargin;
                if (i17 == 0 || i17 == 2) {
                    linearSystem.addLowerBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin - i18, z8);
                } else {
                    linearSystem.addGreaterBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin + i18, z8);
                }
                linearSystem.addEquality(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin + i18, i15);
            }
        }
        int i19 = this.mBarrierType;
        if (i19 == 0) {
            linearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 0);
            return;
        }
        if (i19 == 1) {
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 0);
        } else if (i19 == 2) {
            linearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 0);
        } else if (i19 == 3) {
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 0);
        }
    }

    public boolean allSolved() {
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        boolean z7 = true;
        while (true) {
            i8 = this.mWidgetsCount;
            if (i11 >= i8) {
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i11];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i9 = this.mBarrierType) == 0 || i9 == 1) && !constraintWidget.isResolvedHorizontally()) || (((i10 = this.mBarrierType) == 2 || i10 == 3) && !constraintWidget.isResolvedVertically()))) {
                z7 = false;
            }
            i11++;
        }
        if (!z7 || i8 <= 0) {
            return false;
        }
        int i12 = 0;
        boolean z8 = false;
        for (int i13 = 0; i13 < this.mWidgetsCount; i13++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i13];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                if (!z8) {
                    int i14 = this.mBarrierType;
                    if (i14 == 0) {
                        i12 = constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue();
                    } else if (i14 == 1) {
                        i12 = constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue();
                    } else if (i14 == 2) {
                        i12 = constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue();
                    } else if (i14 == 3) {
                        i12 = constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue();
                    }
                    z8 = true;
                }
                int i15 = this.mBarrierType;
                if (i15 == 0) {
                    i12 = Math.min(i12, constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue());
                } else if (i15 == 1) {
                    i12 = Math.max(i12, constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue());
                } else if (i15 == 2) {
                    i12 = Math.min(i12, constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue());
                } else if (i15 == 3) {
                    i12 = Math.max(i12, constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue());
                }
            }
        }
        int i16 = i12 + this.mMargin;
        int i17 = this.mBarrierType;
        if (i17 == 0 || i17 == 1) {
            setFinalHorizontal(i16, i16);
        } else {
            setFinalVertical(i16, i16);
        }
        this.mResolved = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Barrier barrier = (Barrier) constraintWidget;
        this.mBarrierType = barrier.mBarrierType;
        this.mAllowsGoneWidget = barrier.mAllowsGoneWidget;
        this.mMargin = barrier.mMargin;
    }

    public boolean getAllowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public int getBarrierType() {
        return this.mBarrierType;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public int getOrientation() {
        int i8 = this.mBarrierType;
        if (i8 == 0 || i8 == 1) {
            return 0;
        }
        return (i8 == 2 || i8 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.mResolved;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.mResolved;
    }

    protected void markWidgets() {
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            ConstraintWidget constraintWidget = this.mWidgets[i8];
            if (this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) {
                int i9 = this.mBarrierType;
                if (i9 == 0 || i9 == 1) {
                    constraintWidget.setInBarrier(0, true);
                } else if (i9 == 2 || i9 == 3) {
                    constraintWidget.setInBarrier(1, true);
                }
            }
        }
    }

    public void setAllowsGoneWidget(boolean z7) {
        this.mAllowsGoneWidget = z7;
    }

    public void setBarrierType(int i8) {
        this.mBarrierType = i8;
    }

    public void setMargin(int i8) {
        this.mMargin = i8;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + getDebugName() + " {";
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            ConstraintWidget constraintWidget = this.mWidgets[i8];
            if (i8 > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.getDebugName();
        }
        return str + "}";
    }

    public Barrier(String str) {
        setDebugName(str);
    }
}
