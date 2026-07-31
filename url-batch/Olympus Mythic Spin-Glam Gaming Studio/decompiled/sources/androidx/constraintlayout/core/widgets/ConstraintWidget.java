package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class ConstraintWidget {
    public static float DEFAULT_BIAS = 0.5f;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    private boolean inPlaceholder;
    protected ArrayList mAnchors;
    private boolean mAnimated;
    int mBaselineDistance;
    boolean mBottomHasCentered;
    public ConstraintAnchor mCenter;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    boolean mHorizontalWrapVisited;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    boolean mRightHasCentered;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    protected int mX;
    protected int mY;
    public String stringId;
    public ChainRun verticalChainRun;
    public int verticalGroup;
    public boolean measured = false;
    public WidgetRun[] run = new WidgetRun[2];
    public HorizontalWidgetRun horizontalRun = null;
    public VerticalWidgetRun verticalRun = null;
    public boolean[] isTerminalWidget = {true, true};
    boolean mResolvedHasRatio = false;
    private boolean mMeasureRequested = true;
    private boolean OPTIMIZE_WRAP = false;
    private boolean OPTIMIZE_WRAP_ON_RESOLVED = true;
    private int mWidthOverride = -1;
    private int mHeightOverride = -1;
    public WidgetFrame frame = new WidgetFrame(this);
    private boolean resolvedHorizontal = false;
    private boolean resolvedVertical = false;
    private boolean horizontalSolvingPass = false;
    private boolean verticalSolvingPass = false;
    public int mHorizontalResolution = -1;
    public int mVerticalResolution = -1;
    private int mWrapBehaviorInParent = 0;
    public int mMatchConstraintDefaultWidth = 0;
    public int mMatchConstraintDefaultHeight = 0;
    public int[] mResolvedMatchConstraintDefault = new int[2];
    public int mMatchConstraintMinWidth = 0;
    public int mMatchConstraintMaxWidth = 0;
    public float mMatchConstraintPercentWidth = 1.0f;
    public int mMatchConstraintMinHeight = 0;
    public int mMatchConstraintMaxHeight = 0;
    public float mMatchConstraintPercentHeight = 1.0f;
    int mResolvedDimensionRatioSide = -1;
    float mResolvedDimensionRatio = 1.0f;
    private int[] mMaxDimension = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float mCircleConstraintAngle = 0.0f;
    private boolean hasBaseline = false;
    private boolean mInVirtualLayout = false;
    private int mLastHorizontalMeasureSpec = 0;
    private int mLastVerticalMeasureSpec = 0;
    public ConstraintAnchor mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
    public ConstraintAnchor mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
    public ConstraintAnchor mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
    public ConstraintAnchor mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
    public ConstraintAnchor mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
    ConstraintAnchor mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
    ConstraintAnchor mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public void setFinalLeft(int i) {
        this.mLeft.setFinalValue(i);
        this.mX = i;
    }

    public void setFinalTop(int i) {
        this.mTop.setFinalValue(i);
        this.mY = i;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.horizontalSolvingPass;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.verticalSolvingPass;
    }

    public void markHorizontalSolvingPassDone() {
        this.horizontalSolvingPass = true;
    }

    public void markVerticalSolvingPassDone() {
        this.verticalSolvingPass = true;
    }

    public void setFinalHorizontal(int i, int i2) {
        if (this.resolvedHorizontal) {
            return;
        }
        this.mLeft.setFinalValue(i);
        this.mRight.setFinalValue(i2);
        this.mX = i;
        this.mWidth = i2 - i;
        this.resolvedHorizontal = true;
    }

    public void setFinalVertical(int i, int i2) {
        if (this.resolvedVertical) {
            return;
        }
        this.mTop.setFinalValue(i);
        this.mBottom.setFinalValue(i2);
        this.mY = i;
        this.mHeight = i2 - i;
        if (this.hasBaseline) {
            this.mBaseline.setFinalValue(i + this.mBaselineDistance);
        }
        this.resolvedVertical = true;
    }

    public void setFinalBaseline(int i) {
        if (this.hasBaseline) {
            int i2 = i - this.mBaselineDistance;
            int i3 = this.mHeight + i2;
            this.mY = i2;
            this.mTop.setFinalValue(i2);
            this.mBottom.setFinalValue(i3);
            this.mBaseline.setFinalValue(i);
            this.resolvedVertical = true;
        }
    }

    public boolean isResolvedHorizontally() {
        return this.resolvedHorizontal || (this.mLeft.hasFinalValue() && this.mRight.hasFinalValue());
    }

    public boolean isResolvedVertically() {
        return this.resolvedVertical || (this.mTop.hasFinalValue() && this.mBottom.hasFinalValue());
    }

    public void resetFinalResolution() {
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) this.mAnchors.get(i)).resetFinalResolution();
        }
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            if (((ConstraintAnchor) this.mAnchors.get(i)).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDanglingDimension(int i) {
        if (i == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasResolvedTargets(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.mLeft.mTarget;
            return constraintAnchor3 != null && constraintAnchor3.hasFinalValue() && (constraintAnchor2 = this.mRight.mTarget) != null && constraintAnchor2.hasFinalValue() && (this.mRight.mTarget.getFinalValue() - this.mRight.getMargin()) - (this.mLeft.mTarget.getFinalValue() + this.mLeft.getMargin()) >= i2;
        }
        ConstraintAnchor constraintAnchor4 = this.mTop.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.hasFinalValue() && (constraintAnchor = this.mBottom.mTarget) != null && constraintAnchor.hasFinalValue() && (this.mBottom.mTarget.getFinalValue() - this.mBottom.getMargin()) - (this.mTop.mTarget.getFinalValue() + this.mTop.getMargin()) >= i2;
        return false;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtualLayout;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtualLayout = z;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    protected void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public boolean isInBarrier(int i) {
        return this.mIsInBarrier[i];
    }

    public void setMeasureRequested(boolean z) {
        this.mMeasureRequested = z;
    }

    public boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public void setWrapBehaviorInParent(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.mWrapBehaviorInParent = i;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.mLastHorizontalMeasureSpec;
    }

    public int getLastVerticalMeasureSpec() {
        return this.mLastVerticalMeasureSpec;
    }

    public void setLastMeasureSpec(int i, int i2) {
        this.mLastHorizontalMeasureSpec = i;
        this.mLastVerticalMeasureSpec = i2;
        setMeasureRequested(false);
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtualLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
    }

    private void serializeAttribute(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    private void serializeAttribute(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    private void serializeDimensionRatio(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(StringUtils.COMMA);
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    public boolean oppositeDimensionsTied() {
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public boolean hasDimensionOverride() {
        return (this.mWidthOverride == -1 && this.mHeightOverride == -1) ? false : true;
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new HorizontalWidgetRun(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new VerticalWidgetRun(this);
        }
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        immediateConnect(type, constraintWidget, type, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public void setAnimated(boolean z) {
        this.mAnimated = z;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.mType != null) {
            str = "type: " + this.mType + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.mDebugName != null) {
            str2 = "id: " + this.mDebugName + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.mX);
        sb.append(", ");
        sb.append(this.mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        sb.append(this.mHeight);
        sb.append(")");
        return sb.toString();
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.mX;
        }
        return this.mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.mY;
        }
        return this.mY;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i = constraintAnchor != null ? constraintAnchor.mMargin : 0;
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i + constraintAnchor2.mMargin : i;
    }

    public int getVerticalMargin() {
        int i = this.mLeft != null ? this.mTop.mMargin : 0;
        return this.mRight != null ? i + this.mBottom.mMargin : i;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void setDimensionRatio(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (!substring.equalsIgnoreCase("W")) {
                i2 = substring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0 && indexOf2 < length - 1) {
            String substring2 = str.substring(i2, indexOf2);
            String substring3 = str.substring(indexOf2 + 1);
            if (substring2.length() > 0 && substring3.length() > 0) {
                float parseFloat = Float.parseFloat(substring2);
                float parseFloat2 = Float.parseFloat(substring3);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    if (i3 == 1) {
                        f = Math.abs(parseFloat2 / parseFloat);
                    } else {
                        f = Math.abs(parseFloat / parseFloat2);
                    }
                }
            }
            f = i;
        } else {
            String substring4 = str.substring(i2);
            if (substring4.length() > 0) {
                f = Float.parseFloat(substring4);
            }
            f = i;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.mDimensionRatio = f;
            this.mDimensionRatioSide = i3;
        }
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.mX = i;
        this.mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
        int i11 = this.mMatchConstraintMaxWidth;
        if (i11 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mWidth = Math.min(this.mWidth, i11);
        }
        int i12 = this.mMatchConstraintMaxHeight;
        if (i12 > 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mHeight = Math.min(this.mHeight, i12);
        }
        int i13 = this.mWidth;
        if (i7 != i13) {
            this.mWidthOverride = i13;
        }
        int i14 = this.mHeight;
        if (i8 != i14) {
            this.mHeightOverride = i14;
        }
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.hasBaseline = i > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 == type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                ConstraintAnchor anchor = getAnchor(type6);
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                ConstraintAnchor anchor2 = getAnchor(type7);
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.TOP;
                ConstraintAnchor anchor3 = getAnchor(type8);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BOTTOM;
                ConstraintAnchor anchor4 = getAnchor(type9);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(type6, constraintWidget, type6, 0);
                    connect(type7, constraintWidget, type7, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(type8, constraintWidget, type8, 0);
                    connect(type9, constraintWidget, type9, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(type5).connect(constraintWidget.getAnchor(type5), 0);
                    return;
                }
                if (z) {
                    ConstraintAnchor.Type type10 = ConstraintAnchor.Type.CENTER_X;
                    getAnchor(type10).connect(constraintWidget.getAnchor(type10), 0);
                    return;
                } else {
                    if (z2) {
                        ConstraintAnchor.Type type11 = ConstraintAnchor.Type.CENTER_Y;
                        getAnchor(type11).connect(constraintWidget.getAnchor(type11), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.LEFT;
            if (type2 == type12 || type2 == ConstraintAnchor.Type.RIGHT) {
                connect(type12, constraintWidget, type2, 0);
                connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
                return;
            }
            ConstraintAnchor.Type type13 = ConstraintAnchor.Type.TOP;
            if (type2 == type13 || type2 == ConstraintAnchor.Type.BOTTOM) {
                connect(type13, constraintWidget, type2, 0);
                connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
                return;
            }
            return;
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(type4);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(type14).connect(anchor6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(type3).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(type15).connect(anchor8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            getAnchor(type16).connect(constraintWidget.getAnchor(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            getAnchor(type17).connect(constraintWidget.getAnchor(type17), 0);
            getAnchor(type14).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            getAnchor(type18).connect(constraintWidget.getAnchor(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            getAnchor(type19).connect(constraintWidget.getAnchor(type19), 0);
            getAnchor(type15).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor anchor9 = getAnchor(type);
        ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
        if (anchor9.isValidConnection(anchor10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor anchor13 = getAnchor(type20);
                if (anchor13 != null) {
                    anchor13.reset();
                }
                ConstraintAnchor anchor14 = getAnchor(type5);
                if (anchor14.getTarget() != anchor10) {
                    anchor14.reset();
                }
                ConstraintAnchor opposite = getAnchor(type).getOpposite();
                ConstraintAnchor anchor15 = getAnchor(type15);
                if (anchor15.isConnected()) {
                    opposite.reset();
                    anchor15.reset();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor anchor16 = getAnchor(type5);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                ConstraintAnchor anchor17 = getAnchor(type14);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i);
        }
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) this.mAnchors.get(i)).reset();
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public ConstraintWidget getPreviousChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.mTop).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public ConstraintWidget getNextChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.mBottom).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    private boolean isChainHead(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return (constraintAnchor4 == null || constraintAnchor4.mTarget == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).mTarget) == null || constraintAnchor2.mTarget != constraintAnchor) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        Metrics metrics;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z7;
        int i13;
        boolean z8;
        DimensionBehaviour dimensionBehaviour;
        boolean z9;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        DimensionBehaviour dimensionBehaviour2;
        DimensionBehaviour dimensionBehaviour3;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        boolean z14;
        int i15;
        int i16;
        int i17;
        ConstraintWidget constraintWidget3;
        LinearSystem linearSystem2;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        int i18;
        SolverVariable solverVariable9;
        SolverVariable solverVariable10;
        boolean z15;
        HorizontalWidgetRun horizontalWidgetRun;
        DependencyNode dependencyNode;
        int i19;
        int i20;
        boolean isInHorizontalChain;
        boolean isInVerticalChain;
        HorizontalWidgetRun horizontalWidgetRun2;
        VerticalWidgetRun verticalWidgetRun;
        DependencyNode dependencyNode2;
        boolean[] zArr;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
        ConstraintWidget constraintWidget4 = this.mParent;
        if (constraintWidget4 != null) {
            boolean z16 = constraintWidget4 != null && constraintWidget4.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            boolean z17 = constraintWidget4 != null && constraintWidget4.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            int i21 = this.mWrapBehaviorInParent;
            if (i21 == 1) {
                z2 = z16;
                z3 = false;
            } else if (i21 == 2) {
                z3 = z17;
                z2 = false;
            } else if (i21 != 3) {
                z3 = z17;
                z2 = z16;
            }
            if (this.mVisibility == 8 && !this.mAnimated && !hasDependencies()) {
                zArr = this.mIsInBarrier;
                if (!zArr[0] && !zArr[1]) {
                    return;
                }
            }
            z4 = this.resolvedHorizontal;
            if (!z4 || this.resolvedVertical) {
                if (z4) {
                    linearSystem.addEquality(createObjectVariable, this.mX);
                    linearSystem.addEquality(createObjectVariable2, this.mX + this.mWidth);
                    if (z2 && (constraintWidget2 = this.mParent) != null) {
                        if (this.OPTIMIZE_WRAP_ON_RESOLVED) {
                            ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                            constraintWidgetContainer.addHorizontalWrapMinVariable(this.mLeft);
                            constraintWidgetContainer.addHorizontalWrapMaxVariable(this.mRight);
                        } else {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mRight), createObjectVariable2, 0, 5);
                        }
                    }
                }
                if (this.resolvedVertical) {
                    linearSystem.addEquality(createObjectVariable3, this.mY);
                    linearSystem.addEquality(createObjectVariable4, this.mY + this.mHeight);
                    if (this.mBaseline.hasDependents()) {
                        linearSystem.addEquality(createObjectVariable5, this.mY + this.mBaselineDistance);
                    }
                    if (z3 && (constraintWidget = this.mParent) != null) {
                        if (this.OPTIMIZE_WRAP_ON_RESOLVED) {
                            ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget;
                            constraintWidgetContainer2.addVerticalWrapMinVariable(this.mTop);
                            constraintWidgetContainer2.addVerticalWrapMaxVariable(this.mBottom);
                        } else {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mBottom), createObjectVariable4, 0, 5);
                        }
                    }
                }
                if (this.resolvedHorizontal && this.resolvedVertical) {
                    this.resolvedHorizontal = false;
                    this.resolvedVertical = false;
                    return;
                }
            }
            metrics = LinearSystem.sMetrics;
            if (metrics != null) {
                metrics.widgets++;
            }
            if (z && (horizontalWidgetRun2 = this.horizontalRun) != null && (verticalWidgetRun = this.verticalRun) != null) {
                dependencyNode2 = horizontalWidgetRun2.start;
                if (dependencyNode2.resolved && horizontalWidgetRun2.end.resolved && verticalWidgetRun.start.resolved && verticalWidgetRun.end.resolved) {
                    if (metrics != null) {
                        metrics.graphSolved++;
                    }
                    linearSystem.addEquality(createObjectVariable, dependencyNode2.value);
                    linearSystem.addEquality(createObjectVariable2, this.horizontalRun.end.value);
                    linearSystem.addEquality(createObjectVariable3, this.verticalRun.start.value);
                    linearSystem.addEquality(createObjectVariable4, this.verticalRun.end.value);
                    linearSystem.addEquality(createObjectVariable5, this.verticalRun.baseline.value);
                    if (this.mParent != null) {
                        if (z2 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                        }
                        if (z3 && this.isTerminalWidget[1] && !isInVerticalChain()) {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 8);
                        }
                    }
                    this.resolvedHorizontal = false;
                    this.resolvedVertical = false;
                    return;
                }
            }
            if (metrics != null) {
                metrics.linearSolved++;
            }
            if (this.mParent == null) {
                if (isChainHead(0)) {
                    ((ConstraintWidgetContainer) this.mParent).addChain(this, 0);
                    isInHorizontalChain = true;
                } else {
                    isInHorizontalChain = isInHorizontalChain();
                }
                if (isChainHead(1)) {
                    ((ConstraintWidgetContainer) this.mParent).addChain(this, 1);
                    isInVerticalChain = true;
                } else {
                    isInVerticalChain = isInVerticalChain();
                }
                if (!isInHorizontalChain && z2 && this.mVisibility != 8 && this.mLeft.mTarget == null && this.mRight.mTarget == null) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 1);
                }
                if (!isInVerticalChain && z3 && this.mVisibility != 8 && this.mTop.mTarget == null && this.mBottom.mTarget == null && this.mBaseline == null) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 1);
                }
                z6 = isInHorizontalChain;
                z5 = isInVerticalChain;
            } else {
                z5 = false;
                z6 = false;
            }
            i = this.mWidth;
            i2 = this.mMinWidth;
            if (i >= i2) {
                i2 = i;
            }
            i3 = this.mHeight;
            i4 = this.mMinHeight;
            if (i3 >= i4) {
                i4 = i3;
            }
            DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
            DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
            DimensionBehaviour dimensionBehaviour5 = DimensionBehaviour.MATCH_CONSTRAINT;
            i5 = i2;
            boolean z18 = dimensionBehaviour4 == dimensionBehaviour5;
            DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
            i6 = i4;
            boolean z19 = dimensionBehaviour6 == dimensionBehaviour5;
            int i22 = this.mDimensionRatioSide;
            this.mResolvedDimensionRatioSide = i22;
            f = this.mDimensionRatio;
            this.mResolvedDimensionRatio = f;
            i7 = this.mMatchConstraintDefaultWidth;
            i8 = this.mMatchConstraintDefaultHeight;
            if (f <= 0.0f && this.mVisibility != 8) {
                if (dimensionBehaviour4 == dimensionBehaviour5 && i7 == 0) {
                    i7 = 3;
                }
                if (dimensionBehaviour6 == dimensionBehaviour5 && i8 == 0) {
                    i8 = 3;
                }
                if (dimensionBehaviour4 == dimensionBehaviour5 && dimensionBehaviour6 == dimensionBehaviour5) {
                    i20 = 3;
                    if (i7 == 3 && i8 == 3) {
                        setupDimensionRatio(z2, z3, z18, z19);
                        i9 = i7;
                        i10 = i8;
                        i11 = i5;
                        i12 = i6;
                        z7 = true;
                        int[] iArr = this.mResolvedMatchConstraintDefault;
                        iArr[0] = i9;
                        iArr[1] = i10;
                        this.mResolvedHasRatio = z7;
                        if (z7) {
                            int i23 = this.mResolvedDimensionRatioSide;
                            i13 = -1;
                            if (i23 == 0 || i23 == -1) {
                                z8 = true;
                                boolean z20 = !z7 && ((i19 = this.mResolvedDimensionRatioSide) == 1 || i19 == i13);
                                DimensionBehaviour dimensionBehaviour7 = this.mListDimensionBehaviors[0];
                                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                                z9 = dimensionBehaviour7 != dimensionBehaviour && (this instanceof ConstraintWidgetContainer);
                                i14 = !z9 ? 0 : i11;
                                z10 = !this.mCenter.isConnected();
                                boolean[] zArr2 = this.mIsInBarrier;
                                z11 = zArr2[0];
                                boolean z21 = zArr2[1];
                                if (this.mHorizontalResolution != 2 && !this.resolvedHorizontal) {
                                    if (z && (horizontalWidgetRun = this.horizontalRun) != null) {
                                        dependencyNode = horizontalWidgetRun.start;
                                        if (dependencyNode.resolved && horizontalWidgetRun.end.resolved) {
                                            if (!z) {
                                                linearSystem.addEquality(createObjectVariable, dependencyNode.value);
                                                linearSystem.addEquality(createObjectVariable2, this.horizontalRun.end.value);
                                                if (this.mParent != null && z2 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                                                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                                                }
                                                z12 = z2;
                                                z13 = z3;
                                                dimensionBehaviour2 = dimensionBehaviour5;
                                                dimensionBehaviour3 = dimensionBehaviour;
                                                z14 = z7;
                                                solverVariable = createObjectVariable5;
                                                solverVariable2 = createObjectVariable4;
                                                solverVariable3 = createObjectVariable3;
                                                solverVariable4 = createObjectVariable2;
                                                solverVariable5 = createObjectVariable;
                                                if (z) {
                                                    constraintWidget3 = this;
                                                    VerticalWidgetRun verticalWidgetRun2 = constraintWidget3.verticalRun;
                                                    if (verticalWidgetRun2 != null) {
                                                        DependencyNode dependencyNode3 = verticalWidgetRun2.start;
                                                        if (dependencyNode3.resolved && verticalWidgetRun2.end.resolved) {
                                                            linearSystem2 = linearSystem;
                                                            solverVariable8 = solverVariable3;
                                                            linearSystem2.addEquality(solverVariable8, dependencyNode3.value);
                                                            solverVariable7 = solverVariable2;
                                                            linearSystem2.addEquality(solverVariable7, constraintWidget3.verticalRun.end.value);
                                                            solverVariable6 = solverVariable;
                                                            linearSystem2.addEquality(solverVariable6, constraintWidget3.verticalRun.baseline.value);
                                                            ConstraintWidget constraintWidget5 = constraintWidget3.mParent;
                                                            if (constraintWidget5 == null || z5 || !z13) {
                                                                i15 = 8;
                                                                i16 = 0;
                                                                i17 = 1;
                                                            } else {
                                                                i17 = 1;
                                                                if (constraintWidget3.isTerminalWidget[1]) {
                                                                    i15 = 8;
                                                                    i16 = 0;
                                                                    linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(constraintWidget5.mBottom), solverVariable7, 0, 8);
                                                                } else {
                                                                    i15 = 8;
                                                                    i16 = 0;
                                                                }
                                                            }
                                                            i18 = i16;
                                                            if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0 || constraintWidget3.resolvedVertical) {
                                                                solverVariable9 = solverVariable7;
                                                                solverVariable10 = solverVariable8;
                                                            } else {
                                                                boolean z22 = (constraintWidget3.mListDimensionBehaviors[i17] == dimensionBehaviour3 && (constraintWidget3 instanceof ConstraintWidgetContainer)) ? i17 : i16;
                                                                if (z22) {
                                                                    i12 = i16;
                                                                }
                                                                ConstraintWidget constraintWidget6 = constraintWidget3.mParent;
                                                                SolverVariable createObjectVariable6 = constraintWidget6 != null ? linearSystem2.createObjectVariable(constraintWidget6.mBottom) : null;
                                                                ConstraintWidget constraintWidget7 = constraintWidget3.mParent;
                                                                SolverVariable createObjectVariable7 = constraintWidget7 != null ? linearSystem2.createObjectVariable(constraintWidget7.mTop) : null;
                                                                if (constraintWidget3.mBaselineDistance > 0 || constraintWidget3.mVisibility == i15) {
                                                                    ConstraintAnchor constraintAnchor = constraintWidget3.mBaseline;
                                                                    if (constraintAnchor.mTarget != null) {
                                                                        linearSystem2.addEquality(solverVariable6, solverVariable8, getBaselineDistance(), i15);
                                                                        linearSystem2.addEquality(solverVariable6, linearSystem2.createObjectVariable(constraintWidget3.mBaseline.mTarget), constraintWidget3.mBaseline.getMargin(), i15);
                                                                        if (z13) {
                                                                            linearSystem2.addGreaterThan(createObjectVariable6, linearSystem2.createObjectVariable(constraintWidget3.mBottom), i16, 5);
                                                                        }
                                                                        z15 = i16;
                                                                        boolean z23 = constraintWidget3.isTerminalWidget[i17];
                                                                        DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget3.mListDimensionBehaviors;
                                                                        solverVariable9 = solverVariable7;
                                                                        solverVariable10 = solverVariable8;
                                                                        applyConstraints(linearSystem, false, z13, z12, z23, createObjectVariable7, createObjectVariable6, dimensionBehaviourArr2[i17], z22, constraintWidget3.mTop, constraintWidget3.mBottom, constraintWidget3.mY, i12, constraintWidget3.mMinHeight, constraintWidget3.mMaxDimension[i17], constraintWidget3.mVerticalBiasPercent, z20, dimensionBehaviourArr2[0] != dimensionBehaviour2, z5, z6, z21, i10, i9, constraintWidget3.mMatchConstraintMinHeight, constraintWidget3.mMatchConstraintMaxHeight, constraintWidget3.mMatchConstraintPercentHeight, z15);
                                                                    } else if (constraintWidget3.mVisibility == i15) {
                                                                        linearSystem2.addEquality(solverVariable6, solverVariable8, constraintAnchor.getMargin(), i15);
                                                                    } else {
                                                                        linearSystem2.addEquality(solverVariable6, solverVariable8, getBaselineDistance(), i15);
                                                                    }
                                                                }
                                                                z15 = z10;
                                                                boolean z232 = constraintWidget3.isTerminalWidget[i17];
                                                                DimensionBehaviour[] dimensionBehaviourArr22 = constraintWidget3.mListDimensionBehaviors;
                                                                solverVariable9 = solverVariable7;
                                                                solverVariable10 = solverVariable8;
                                                                applyConstraints(linearSystem, false, z13, z12, z232, createObjectVariable7, createObjectVariable6, dimensionBehaviourArr22[i17], z22, constraintWidget3.mTop, constraintWidget3.mBottom, constraintWidget3.mY, i12, constraintWidget3.mMinHeight, constraintWidget3.mMaxDimension[i17], constraintWidget3.mVerticalBiasPercent, z20, dimensionBehaviourArr22[0] != dimensionBehaviour2, z5, z6, z21, i10, i9, constraintWidget3.mMatchConstraintMinHeight, constraintWidget3.mMatchConstraintMaxHeight, constraintWidget3.mMatchConstraintPercentHeight, z15);
                                                            }
                                                            if (z14) {
                                                                if (this.mResolvedDimensionRatioSide == 1) {
                                                                    linearSystem.addRatio(solverVariable9, solverVariable10, solverVariable4, solverVariable5, this.mResolvedDimensionRatio, 8);
                                                                } else {
                                                                    linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable9, solverVariable10, this.mResolvedDimensionRatio, 8);
                                                                }
                                                            }
                                                            if (this.mCenter.isConnected()) {
                                                                linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                                                            }
                                                            this.resolvedHorizontal = false;
                                                            this.resolvedVertical = false;
                                                        }
                                                    }
                                                    linearSystem2 = linearSystem;
                                                    solverVariable6 = solverVariable;
                                                    solverVariable7 = solverVariable2;
                                                    solverVariable8 = solverVariable3;
                                                    i15 = 8;
                                                    i16 = 0;
                                                    i17 = 1;
                                                } else {
                                                    i15 = 8;
                                                    i16 = 0;
                                                    i17 = 1;
                                                    constraintWidget3 = this;
                                                    linearSystem2 = linearSystem;
                                                    solverVariable6 = solverVariable;
                                                    solverVariable7 = solverVariable2;
                                                    solverVariable8 = solverVariable3;
                                                }
                                                i18 = i17;
                                                if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
                                                }
                                                solverVariable9 = solverVariable7;
                                                solverVariable10 = solverVariable8;
                                                if (z14) {
                                                }
                                                if (this.mCenter.isConnected()) {
                                                }
                                                this.resolvedHorizontal = false;
                                                this.resolvedVertical = false;
                                            }
                                        }
                                    }
                                    ConstraintWidget constraintWidget8 = this.mParent;
                                    SolverVariable createObjectVariable8 = constraintWidget8 == null ? linearSystem.createObjectVariable(constraintWidget8.mRight) : null;
                                    ConstraintWidget constraintWidget9 = this.mParent;
                                    SolverVariable createObjectVariable9 = constraintWidget9 == null ? linearSystem.createObjectVariable(constraintWidget9.mLeft) : null;
                                    boolean z24 = this.isTerminalWidget[0];
                                    DimensionBehaviour[] dimensionBehaviourArr3 = this.mListDimensionBehaviors;
                                    z12 = z2;
                                    z13 = z3;
                                    dimensionBehaviour2 = dimensionBehaviour5;
                                    solverVariable = createObjectVariable5;
                                    solverVariable2 = createObjectVariable4;
                                    solverVariable3 = createObjectVariable3;
                                    solverVariable4 = createObjectVariable2;
                                    dimensionBehaviour3 = dimensionBehaviour;
                                    solverVariable5 = createObjectVariable;
                                    z14 = z7;
                                    applyConstraints(linearSystem, true, z2, z3, z24, createObjectVariable9, createObjectVariable8, dimensionBehaviourArr3[0], z9, this.mLeft, this.mRight, this.mX, i14, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, z8, dimensionBehaviourArr3[1] != dimensionBehaviour5, z6, z5, z11, i9, i10, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z10);
                                    if (z) {
                                    }
                                    i18 = i17;
                                    if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
                                    }
                                    solverVariable9 = solverVariable7;
                                    solverVariable10 = solverVariable8;
                                    if (z14) {
                                    }
                                    if (this.mCenter.isConnected()) {
                                    }
                                    this.resolvedHorizontal = false;
                                    this.resolvedVertical = false;
                                }
                                z12 = z2;
                                z13 = z3;
                                dimensionBehaviour2 = dimensionBehaviour5;
                                dimensionBehaviour3 = dimensionBehaviour;
                                solverVariable = createObjectVariable5;
                                solverVariable2 = createObjectVariable4;
                                solverVariable3 = createObjectVariable3;
                                solverVariable4 = createObjectVariable2;
                                solverVariable5 = createObjectVariable;
                                z14 = z7;
                                if (z) {
                                }
                                i18 = i17;
                                if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
                                }
                                solverVariable9 = solverVariable7;
                                solverVariable10 = solverVariable8;
                                if (z14) {
                                }
                                if (this.mCenter.isConnected()) {
                                }
                                this.resolvedHorizontal = false;
                                this.resolvedVertical = false;
                            }
                        } else {
                            i13 = -1;
                        }
                        z8 = false;
                        if (z7) {
                        }
                        DimensionBehaviour dimensionBehaviour72 = this.mListDimensionBehaviors[0];
                        dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour72 != dimensionBehaviour) {
                        }
                        if (!z9) {
                        }
                        z10 = !this.mCenter.isConnected();
                        boolean[] zArr22 = this.mIsInBarrier;
                        z11 = zArr22[0];
                        boolean z212 = zArr22[1];
                        if (this.mHorizontalResolution != 2) {
                            if (z) {
                                dependencyNode = horizontalWidgetRun.start;
                                if (dependencyNode.resolved) {
                                    if (!z) {
                                    }
                                }
                            }
                            ConstraintWidget constraintWidget82 = this.mParent;
                            if (constraintWidget82 == null) {
                            }
                            ConstraintWidget constraintWidget92 = this.mParent;
                            if (constraintWidget92 == null) {
                            }
                            boolean z242 = this.isTerminalWidget[0];
                            DimensionBehaviour[] dimensionBehaviourArr32 = this.mListDimensionBehaviors;
                            z12 = z2;
                            z13 = z3;
                            dimensionBehaviour2 = dimensionBehaviour5;
                            solverVariable = createObjectVariable5;
                            solverVariable2 = createObjectVariable4;
                            solverVariable3 = createObjectVariable3;
                            solverVariable4 = createObjectVariable2;
                            dimensionBehaviour3 = dimensionBehaviour;
                            solverVariable5 = createObjectVariable;
                            z14 = z7;
                            applyConstraints(linearSystem, true, z2, z3, z242, createObjectVariable9, createObjectVariable8, dimensionBehaviourArr32[0], z9, this.mLeft, this.mRight, this.mX, i14, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, z8, dimensionBehaviourArr32[1] != dimensionBehaviour5, z6, z5, z11, i9, i10, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z10);
                            if (z) {
                            }
                            i18 = i17;
                            if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
                            }
                            solverVariable9 = solverVariable7;
                            solverVariable10 = solverVariable8;
                            if (z14) {
                            }
                            if (this.mCenter.isConnected()) {
                            }
                            this.resolvedHorizontal = false;
                            this.resolvedVertical = false;
                        }
                        z12 = z2;
                        z13 = z3;
                        dimensionBehaviour2 = dimensionBehaviour5;
                        dimensionBehaviour3 = dimensionBehaviour;
                        solverVariable = createObjectVariable5;
                        solverVariable2 = createObjectVariable4;
                        solverVariable3 = createObjectVariable3;
                        solverVariable4 = createObjectVariable2;
                        solverVariable5 = createObjectVariable;
                        z14 = z7;
                        if (z) {
                        }
                        i18 = i17;
                        if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
                        }
                        solverVariable9 = solverVariable7;
                        solverVariable10 = solverVariable8;
                        if (z14) {
                        }
                        if (this.mCenter.isConnected()) {
                        }
                        this.resolvedHorizontal = false;
                        this.resolvedVertical = false;
                    }
                } else {
                    i20 = 3;
                }
                if (dimensionBehaviour4 == dimensionBehaviour5 && i7 == i20) {
                    this.mResolvedDimensionRatioSide = 0;
                    int i24 = (int) (f * i3);
                    if (dimensionBehaviour6 != dimensionBehaviour5) {
                        i9 = 4;
                        i10 = i8;
                        i12 = i6;
                        z7 = false;
                        i11 = i24;
                        int[] iArr2 = this.mResolvedMatchConstraintDefault;
                        iArr2[0] = i9;
                        iArr2[1] = i10;
                        this.mResolvedHasRatio = z7;
                        if (z7) {
                        }
                        z8 = false;
                        if (z7) {
                        }
                        DimensionBehaviour dimensionBehaviour722 = this.mListDimensionBehaviors[0];
                        dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour722 != dimensionBehaviour) {
                        }
                        if (!z9) {
                        }
                        z10 = !this.mCenter.isConnected();
                        boolean[] zArr222 = this.mIsInBarrier;
                        z11 = zArr222[0];
                        boolean z2122 = zArr222[1];
                        if (this.mHorizontalResolution != 2) {
                        }
                        z12 = z2;
                        z13 = z3;
                        dimensionBehaviour2 = dimensionBehaviour5;
                        dimensionBehaviour3 = dimensionBehaviour;
                        solverVariable = createObjectVariable5;
                        solverVariable2 = createObjectVariable4;
                        solverVariable3 = createObjectVariable3;
                        solverVariable4 = createObjectVariable2;
                        solverVariable5 = createObjectVariable;
                        z14 = z7;
                        if (z) {
                        }
                        i18 = i17;
                        if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
                        }
                        solverVariable9 = solverVariable7;
                        solverVariable10 = solverVariable8;
                        if (z14) {
                        }
                        if (this.mCenter.isConnected()) {
                        }
                        this.resolvedHorizontal = false;
                        this.resolvedVertical = false;
                    }
                    i11 = i24;
                    i9 = i7;
                    i10 = i8;
                    i12 = i6;
                    z7 = true;
                    int[] iArr22 = this.mResolvedMatchConstraintDefault;
                    iArr22[0] = i9;
                    iArr22[1] = i10;
                    this.mResolvedHasRatio = z7;
                    if (z7) {
                    }
                    z8 = false;
                    if (z7) {
                    }
                    DimensionBehaviour dimensionBehaviour7222 = this.mListDimensionBehaviors[0];
                    dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour7222 != dimensionBehaviour) {
                    }
                    if (!z9) {
                    }
                    z10 = !this.mCenter.isConnected();
                    boolean[] zArr2222 = this.mIsInBarrier;
                    z11 = zArr2222[0];
                    boolean z21222 = zArr2222[1];
                    if (this.mHorizontalResolution != 2) {
                    }
                    z12 = z2;
                    z13 = z3;
                    dimensionBehaviour2 = dimensionBehaviour5;
                    dimensionBehaviour3 = dimensionBehaviour;
                    solverVariable = createObjectVariable5;
                    solverVariable2 = createObjectVariable4;
                    solverVariable3 = createObjectVariable3;
                    solverVariable4 = createObjectVariable2;
                    solverVariable5 = createObjectVariable;
                    z14 = z7;
                    if (z) {
                    }
                    i18 = i17;
                    if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
                    }
                    solverVariable9 = solverVariable7;
                    solverVariable10 = solverVariable8;
                    if (z14) {
                    }
                    if (this.mCenter.isConnected()) {
                    }
                    this.resolvedHorizontal = false;
                    this.resolvedVertical = false;
                }
                if (dimensionBehaviour6 == dimensionBehaviour5 && i8 == i20) {
                    this.mResolvedDimensionRatioSide = 1;
                    if (i22 == -1) {
                        this.mResolvedDimensionRatio = 1.0f / f;
                    }
                    int i25 = (int) (this.mResolvedDimensionRatio * i);
                    if (dimensionBehaviour4 == dimensionBehaviour5) {
                        i12 = i25;
                        i9 = i7;
                        i10 = i8;
                        i11 = i5;
                        z7 = true;
                        int[] iArr222 = this.mResolvedMatchConstraintDefault;
                        iArr222[0] = i9;
                        iArr222[1] = i10;
                        this.mResolvedHasRatio = z7;
                        if (z7) {
                        }
                        z8 = false;
                        if (z7) {
                        }
                        DimensionBehaviour dimensionBehaviour72222 = this.mListDimensionBehaviors[0];
                        dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour72222 != dimensionBehaviour) {
                        }
                        if (!z9) {
                        }
                        z10 = !this.mCenter.isConnected();
                        boolean[] zArr22222 = this.mIsInBarrier;
                        z11 = zArr22222[0];
                        boolean z212222 = zArr22222[1];
                        if (this.mHorizontalResolution != 2) {
                        }
                        z12 = z2;
                        z13 = z3;
                        dimensionBehaviour2 = dimensionBehaviour5;
                        dimensionBehaviour3 = dimensionBehaviour;
                        solverVariable = createObjectVariable5;
                        solverVariable2 = createObjectVariable4;
                        solverVariable3 = createObjectVariable3;
                        solverVariable4 = createObjectVariable2;
                        solverVariable5 = createObjectVariable;
                        z14 = z7;
                        if (z) {
                        }
                        i18 = i17;
                        if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
                        }
                        solverVariable9 = solverVariable7;
                        solverVariable10 = solverVariable8;
                        if (z14) {
                        }
                        if (this.mCenter.isConnected()) {
                        }
                        this.resolvedHorizontal = false;
                        this.resolvedVertical = false;
                    }
                    i10 = 4;
                    i12 = i25;
                    i9 = i7;
                    i11 = i5;
                }
                i9 = i7;
                i10 = i8;
                i11 = i5;
                i12 = i6;
                z7 = true;
                int[] iArr2222 = this.mResolvedMatchConstraintDefault;
                iArr2222[0] = i9;
                iArr2222[1] = i10;
                this.mResolvedHasRatio = z7;
                if (z7) {
                }
                z8 = false;
                if (z7) {
                }
                DimensionBehaviour dimensionBehaviour722222 = this.mListDimensionBehaviors[0];
                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour722222 != dimensionBehaviour) {
                }
                if (!z9) {
                }
                z10 = !this.mCenter.isConnected();
                boolean[] zArr222222 = this.mIsInBarrier;
                z11 = zArr222222[0];
                boolean z2122222 = zArr222222[1];
                if (this.mHorizontalResolution != 2) {
                }
                z12 = z2;
                z13 = z3;
                dimensionBehaviour2 = dimensionBehaviour5;
                dimensionBehaviour3 = dimensionBehaviour;
                solverVariable = createObjectVariable5;
                solverVariable2 = createObjectVariable4;
                solverVariable3 = createObjectVariable3;
                solverVariable4 = createObjectVariable2;
                solverVariable5 = createObjectVariable;
                z14 = z7;
                if (z) {
                }
                i18 = i17;
                if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
                }
                solverVariable9 = solverVariable7;
                solverVariable10 = solverVariable8;
                if (z14) {
                }
                if (this.mCenter.isConnected()) {
                }
                this.resolvedHorizontal = false;
                this.resolvedVertical = false;
            }
            i9 = i7;
            i10 = i8;
            i11 = i5;
            i12 = i6;
            z7 = false;
            int[] iArr22222 = this.mResolvedMatchConstraintDefault;
            iArr22222[0] = i9;
            iArr22222[1] = i10;
            this.mResolvedHasRatio = z7;
            if (z7) {
            }
            z8 = false;
            if (z7) {
            }
            DimensionBehaviour dimensionBehaviour7222222 = this.mListDimensionBehaviors[0];
            dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour7222222 != dimensionBehaviour) {
            }
            if (!z9) {
            }
            z10 = !this.mCenter.isConnected();
            boolean[] zArr2222222 = this.mIsInBarrier;
            z11 = zArr2222222[0];
            boolean z21222222 = zArr2222222[1];
            if (this.mHorizontalResolution != 2) {
            }
            z12 = z2;
            z13 = z3;
            dimensionBehaviour2 = dimensionBehaviour5;
            dimensionBehaviour3 = dimensionBehaviour;
            solverVariable = createObjectVariable5;
            solverVariable2 = createObjectVariable4;
            solverVariable3 = createObjectVariable3;
            solverVariable4 = createObjectVariable2;
            solverVariable5 = createObjectVariable;
            z14 = z7;
            if (z) {
            }
            i18 = i17;
            if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
            }
            solverVariable9 = solverVariable7;
            solverVariable10 = solverVariable8;
            if (z14) {
            }
            if (this.mCenter.isConnected()) {
            }
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
        }
        z2 = false;
        z3 = false;
        if (this.mVisibility == 8) {
            zArr = this.mIsInBarrier;
            if (!zArr[0]) {
                return;
            }
        }
        z4 = this.resolvedHorizontal;
        if (!z4) {
        }
        if (z4) {
        }
        if (this.resolvedVertical) {
        }
        if (this.resolvedHorizontal) {
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
            return;
        }
        metrics = LinearSystem.sMetrics;
        if (metrics != null) {
        }
        if (z) {
            dependencyNode2 = horizontalWidgetRun2.start;
            if (dependencyNode2.resolved) {
                if (metrics != null) {
                }
                linearSystem.addEquality(createObjectVariable, dependencyNode2.value);
                linearSystem.addEquality(createObjectVariable2, this.horizontalRun.end.value);
                linearSystem.addEquality(createObjectVariable3, this.verticalRun.start.value);
                linearSystem.addEquality(createObjectVariable4, this.verticalRun.end.value);
                linearSystem.addEquality(createObjectVariable5, this.verticalRun.baseline.value);
                if (this.mParent != null) {
                }
                this.resolvedHorizontal = false;
                this.resolvedVertical = false;
                return;
            }
        }
        if (metrics != null) {
        }
        if (this.mParent == null) {
        }
        i = this.mWidth;
        i2 = this.mMinWidth;
        if (i >= i2) {
        }
        i3 = this.mHeight;
        i4 = this.mMinHeight;
        if (i3 >= i4) {
        }
        DimensionBehaviour[] dimensionBehaviourArr4 = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour42 = dimensionBehaviourArr4[0];
        DimensionBehaviour dimensionBehaviour52 = DimensionBehaviour.MATCH_CONSTRAINT;
        i5 = i2;
        if (dimensionBehaviour42 == dimensionBehaviour52) {
        }
        DimensionBehaviour dimensionBehaviour62 = dimensionBehaviourArr4[1];
        i6 = i4;
        if (dimensionBehaviour62 == dimensionBehaviour52) {
        }
        int i222 = this.mDimensionRatioSide;
        this.mResolvedDimensionRatioSide = i222;
        f = this.mDimensionRatio;
        this.mResolvedDimensionRatio = f;
        i7 = this.mMatchConstraintDefaultWidth;
        i8 = this.mMatchConstraintDefaultHeight;
        if (f <= 0.0f) {
        }
        i9 = i7;
        i10 = i8;
        i11 = i5;
        i12 = i6;
        z7 = false;
        int[] iArr222222 = this.mResolvedMatchConstraintDefault;
        iArr222222[0] = i9;
        iArr222222[1] = i10;
        this.mResolvedHasRatio = z7;
        if (z7) {
        }
        z8 = false;
        if (z7) {
        }
        DimensionBehaviour dimensionBehaviour72222222 = this.mListDimensionBehaviors[0];
        dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour72222222 != dimensionBehaviour) {
        }
        if (!z9) {
        }
        z10 = !this.mCenter.isConnected();
        boolean[] zArr22222222 = this.mIsInBarrier;
        z11 = zArr22222222[0];
        boolean z212222222 = zArr22222222[1];
        if (this.mHorizontalResolution != 2) {
        }
        z12 = z2;
        z13 = z3;
        dimensionBehaviour2 = dimensionBehaviour52;
        dimensionBehaviour3 = dimensionBehaviour;
        solverVariable = createObjectVariable5;
        solverVariable2 = createObjectVariable4;
        solverVariable3 = createObjectVariable3;
        solverVariable4 = createObjectVariable2;
        solverVariable5 = createObjectVariable;
        z14 = z7;
        if (z) {
        }
        i18 = i17;
        if ((constraintWidget3.mVerticalResolution != 2 ? i16 : i18) != 0) {
        }
        solverVariable9 = solverVariable7;
        solverVariable10 = solverVariable8;
        if (z14) {
        }
        if (this.mCenter.isConnected()) {
        }
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
    }

    boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else {
                if (i != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0433 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04cd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void applyConstraints(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        SolverVariable solverVariable3;
        int i11;
        int i12;
        int i13;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        int i14;
        boolean z13;
        boolean z14;
        SolverVariable createObjectVariable;
        SolverVariable createObjectVariable2;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        int i15;
        SolverVariable solverVariable10;
        int i16;
        int i17;
        int i18;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable11;
        int i19;
        SolverVariable solverVariable12;
        int i20;
        int i21;
        int i22;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i23;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariable13;
        SolverVariable solverVariable14;
        boolean z19;
        SolverVariable solverVariable15;
        ConstraintWidget constraintWidget3;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z20;
        int i28;
        int i29;
        int i30;
        boolean z21;
        int i31;
        boolean z22;
        ConstraintWidget constraintWidget4;
        int i32;
        SolverVariable solverVariable16;
        int i33;
        ConstraintWidget constraintWidget5;
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor2);
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        SolverVariable createObjectVariable6 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        if (LinearSystem.getMetrics() != null) {
            LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean isConnected = constraintAnchor.isConnected();
        boolean isConnected2 = constraintAnchor2.isConnected();
        boolean isConnected3 = this.mCenter.isConnected();
        int i34 = isConnected2 ? (isConnected ? 1 : 0) + 1 : isConnected ? 1 : 0;
        if (isConnected3) {
            i34++;
        }
        int i35 = z6 ? 3 : i5;
        int i36 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour.ordinal()];
        if (i36 == 1 || i36 == 2 || i36 == 3 || i36 != 4) {
            i9 = i35;
        } else {
            i9 = i35;
            if (i9 != 4) {
                z12 = true;
                i10 = this.mWidthOverride;
                if (i10 == -1 && z) {
                    this.mWidthOverride = -1;
                    solverVariable3 = createObjectVariable6;
                    z12 = false;
                } else {
                    i10 = i2;
                    solverVariable3 = createObjectVariable6;
                }
                i11 = this.mHeightOverride;
                if (i11 != -1 && !z) {
                    this.mHeightOverride = -1;
                    i10 = i11;
                    z12 = false;
                }
                if (this.mVisibility == 8) {
                    i10 = 0;
                    z12 = false;
                }
                if (z11) {
                    if (!isConnected && !isConnected2 && !isConnected3) {
                        linearSystem.addEquality(createObjectVariable3, i);
                    } else if (isConnected && !isConnected2) {
                        linearSystem.addEquality(createObjectVariable3, createObjectVariable5, constraintAnchor.getMargin(), 8);
                    }
                }
                if (z12) {
                    if (z5) {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, 0, 3);
                        if (i3 > 0) {
                            linearSystem.addGreaterThan(createObjectVariable4, createObjectVariable3, i3, 8);
                        }
                        if (i4 < Integer.MAX_VALUE) {
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i4, 8);
                        }
                    } else {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, 8);
                    }
                    i12 = i8;
                    i13 = i34;
                    solverVariable4 = createObjectVariable5;
                    solverVariable5 = createObjectVariable4;
                    z13 = z12;
                    solverVariable6 = solverVariable3;
                    z14 = z4;
                    i14 = i7;
                } else if (i34 == 2 || z6 || !(i9 == 1 || i9 == 0)) {
                    int i37 = i7 == -2 ? i10 : i7;
                    i12 = i8 == -2 ? i10 : i8;
                    if (i10 > 0 && i9 != 1) {
                        i10 = 0;
                    }
                    if (i37 > 0) {
                        linearSystem.addGreaterThan(createObjectVariable4, createObjectVariable3, i37, 8);
                        i10 = Math.max(i10, i37);
                    }
                    if (i12 > 0) {
                        if (!z2 || i9 != 1) {
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i12, 8);
                        }
                        i10 = Math.min(i10, i12);
                    }
                    if (i9 == 1) {
                        if (z2) {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, 8);
                        } else if (z8) {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, 5);
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i10, 8);
                        } else {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, 5);
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i10, 8);
                        }
                        i13 = i34;
                        solverVariable4 = createObjectVariable5;
                        solverVariable5 = createObjectVariable4;
                        z13 = z12;
                        solverVariable6 = solverVariable3;
                        z14 = z4;
                        i14 = i37;
                    } else if (i9 == 2) {
                        ConstraintAnchor.Type type = constraintAnchor.getType();
                        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
                        if (type == type2 || constraintAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                            createObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(type2));
                            createObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                        } else {
                            createObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                            createObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
                        }
                        i13 = i34;
                        solverVariable6 = solverVariable3;
                        i14 = i37;
                        solverVariable4 = createObjectVariable5;
                        solverVariable5 = createObjectVariable4;
                        linearSystem.addConstraint(linearSystem.createRow().createRowDimensionRatio(createObjectVariable4, createObjectVariable3, createObjectVariable2, createObjectVariable, f2));
                        if (z2) {
                            z12 = false;
                        }
                        z13 = z12;
                        z14 = z4;
                    } else {
                        i13 = i34;
                        solverVariable4 = createObjectVariable5;
                        solverVariable5 = createObjectVariable4;
                        solverVariable6 = solverVariable3;
                        i14 = i37;
                        z13 = z12;
                        z14 = true;
                    }
                } else {
                    int max = Math.max(i7, i10);
                    if (i8 > 0) {
                        max = Math.min(i8, max);
                    }
                    linearSystem.addEquality(createObjectVariable4, createObjectVariable3, max, 8);
                    z14 = z4;
                    i12 = i8;
                    i13 = i34;
                    solverVariable5 = createObjectVariable4;
                    z13 = false;
                    solverVariable6 = solverVariable3;
                    i14 = i7;
                    solverVariable4 = createObjectVariable5;
                }
                if (z11) {
                    solverVariable7 = solverVariable;
                    solverVariable8 = solverVariable2;
                    solverVariable9 = solverVariable5;
                    i15 = 0;
                    solverVariable10 = createObjectVariable3;
                    i16 = i13;
                    i17 = 2;
                } else if (z8) {
                    solverVariable7 = solverVariable;
                    solverVariable8 = solverVariable2;
                    i16 = i13;
                    solverVariable9 = solverVariable5;
                    i15 = 0;
                    i17 = 2;
                    solverVariable10 = createObjectVariable3;
                } else {
                    if (!isConnected && !isConnected2 && !isConnected3) {
                        solverVariable15 = solverVariable5;
                        i25 = 5;
                        i26 = 0;
                    } else if (!isConnected || isConnected2) {
                        if (!isConnected && isConnected2) {
                            linearSystem.addEquality(solverVariable5, solverVariable6, -constraintAnchor2.getMargin(), 8);
                            if (z2) {
                                if (this.OPTIMIZE_WRAP && createObjectVariable3.isFinalValue && (constraintWidget4 = this.mParent) != null) {
                                    ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget4;
                                    if (z) {
                                        constraintWidgetContainer.addHorizontalWrapMinVariable(constraintAnchor);
                                    } else {
                                        constraintWidgetContainer.addVerticalWrapMinVariable(constraintAnchor);
                                    }
                                } else {
                                    i25 = 5;
                                    linearSystem.addGreaterThan(createObjectVariable3, solverVariable, 0, 5);
                                    i26 = 0;
                                    solverVariable15 = solverVariable5;
                                }
                            }
                        } else if (isConnected && isConnected2) {
                            ConstraintWidget constraintWidget6 = constraintAnchor.mTarget.mOwner;
                            ConstraintWidget constraintWidget7 = constraintAnchor2.mTarget.mOwner;
                            ConstraintWidget parent = getParent();
                            if (z13) {
                                if (i9 == 0) {
                                    if (i12 != 0 || i14 != 0) {
                                        z21 = false;
                                        i29 = 5;
                                        i31 = 5;
                                        z22 = true;
                                        z15 = true;
                                    } else if (solverVariable4.isFinalValue && solverVariable6.isFinalValue) {
                                        linearSystem.addEquality(createObjectVariable3, solverVariable4, constraintAnchor.getMargin(), 8);
                                        linearSystem.addEquality(solverVariable5, solverVariable6, -constraintAnchor2.getMargin(), 8);
                                        return;
                                    } else {
                                        z22 = false;
                                        z15 = false;
                                        i29 = 8;
                                        i31 = 8;
                                        z21 = true;
                                    }
                                    if ((constraintWidget6 instanceof Barrier) || (constraintWidget7 instanceof Barrier)) {
                                        solverVariable12 = solverVariable2;
                                        i20 = i29;
                                        i21 = 6;
                                        z17 = z21;
                                        z16 = z22;
                                        i22 = 4;
                                        if (z15 || solverVariable4 != solverVariable6 || constraintWidget6 == parent) {
                                            z18 = true;
                                        } else {
                                            z15 = false;
                                            z18 = false;
                                        }
                                        if (z16) {
                                            i23 = i9;
                                            constraintWidget = parent;
                                            constraintWidget2 = constraintWidget7;
                                            solverVariable13 = solverVariable5;
                                            solverVariable14 = createObjectVariable3;
                                            z19 = z2;
                                        } else {
                                            if (z13 || z7 || z9 || solverVariable4 != solverVariable || solverVariable6 != solverVariable12) {
                                                z19 = z2;
                                                i27 = i21;
                                                z20 = z18;
                                                i28 = i20;
                                            } else {
                                                z19 = false;
                                                i28 = 8;
                                                i27 = 8;
                                                z20 = false;
                                            }
                                            i23 = i9;
                                            constraintWidget = parent;
                                            constraintWidget2 = constraintWidget7;
                                            SolverVariable solverVariable17 = solverVariable5;
                                            solverVariable13 = solverVariable5;
                                            solverVariable14 = createObjectVariable3;
                                            linearSystem.addCentering(createObjectVariable3, solverVariable4, constraintAnchor.getMargin(), f, solverVariable6, solverVariable17, constraintAnchor2.getMargin(), i27);
                                            i20 = i28;
                                            z18 = z20;
                                        }
                                        if (this.mVisibility != 8 && !constraintAnchor2.hasDependents()) {
                                            return;
                                        }
                                        if (z15) {
                                            solverVariable15 = solverVariable13;
                                        } else {
                                            if (z19 && solverVariable4 != solverVariable6 && !z13 && ((constraintWidget6 instanceof Barrier) || (constraintWidget2 instanceof Barrier))) {
                                                i20 = 6;
                                            }
                                            linearSystem.addGreaterThan(solverVariable14, solverVariable4, constraintAnchor.getMargin(), i20);
                                            solverVariable15 = solverVariable13;
                                            linearSystem.addLowerThan(solverVariable15, solverVariable6, -constraintAnchor2.getMargin(), i20);
                                        }
                                        if (z19 || !z10 || (constraintWidget6 instanceof Barrier) || (constraintWidget2 instanceof Barrier)) {
                                            constraintWidget3 = constraintWidget;
                                        } else {
                                            constraintWidget3 = constraintWidget;
                                            if (constraintWidget2 != constraintWidget3) {
                                                i20 = 6;
                                                i24 = 6;
                                                z18 = true;
                                                if (z18) {
                                                    if (z17 && (!z9 || z3)) {
                                                        int i38 = (constraintWidget6 == constraintWidget3 || constraintWidget2 == constraintWidget3) ? 6 : i24;
                                                        if ((constraintWidget6 instanceof Guideline) || (constraintWidget2 instanceof Guideline)) {
                                                            i38 = 5;
                                                        }
                                                        if ((constraintWidget6 instanceof Barrier) || (constraintWidget2 instanceof Barrier)) {
                                                            i38 = 5;
                                                        }
                                                        if (z9) {
                                                            i38 = 5;
                                                        }
                                                        i24 = Math.max(i38, i24);
                                                    }
                                                    if (z19) {
                                                        i24 = (z6 && !z9 && (constraintWidget6 == constraintWidget3 || constraintWidget2 == constraintWidget3)) ? 4 : Math.min(i20, i24);
                                                    }
                                                    linearSystem.addEquality(solverVariable14, solverVariable4, constraintAnchor.getMargin(), i24);
                                                    linearSystem.addEquality(solverVariable15, solverVariable6, -constraintAnchor2.getMargin(), i24);
                                                }
                                                if (z19) {
                                                    int margin = solverVariable == solverVariable4 ? constraintAnchor.getMargin() : 0;
                                                    if (solverVariable4 != solverVariable) {
                                                        linearSystem.addGreaterThan(solverVariable14, solverVariable, margin, 5);
                                                    }
                                                }
                                                if (z19 || !z13 || i3 != 0 || i14 != 0) {
                                                    i25 = 5;
                                                    i26 = 0;
                                                } else if (z13 && i23 == 3) {
                                                    i26 = 0;
                                                    linearSystem.addGreaterThan(solverVariable15, solverVariable14, 0, 8);
                                                    i25 = 5;
                                                } else {
                                                    i26 = 0;
                                                    i25 = 5;
                                                    linearSystem.addGreaterThan(solverVariable15, solverVariable14, 0, 5);
                                                }
                                            }
                                        }
                                        i24 = i22;
                                        if (z18) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i25 = 5;
                                        i26 = 0;
                                    } else {
                                        solverVariable12 = solverVariable2;
                                        z17 = z21;
                                        z16 = z22;
                                        i22 = i31;
                                        i20 = i29;
                                        i21 = 6;
                                        if (z15) {
                                        }
                                        z18 = true;
                                        if (z16) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z15) {
                                        }
                                        if (z19) {
                                        }
                                        constraintWidget3 = constraintWidget;
                                        i24 = i22;
                                        if (z18) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i25 = 5;
                                        i26 = 0;
                                    }
                                } else if (i9 == 2) {
                                    if (!(constraintWidget6 instanceof Barrier) && !(constraintWidget7 instanceof Barrier)) {
                                        solverVariable12 = solverVariable2;
                                        i21 = 6;
                                        i20 = 5;
                                        i22 = 5;
                                        z16 = true;
                                        z15 = true;
                                        z17 = false;
                                        if (z15) {
                                        }
                                        z18 = true;
                                        if (z16) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z15) {
                                        }
                                        if (z19) {
                                        }
                                        constraintWidget3 = constraintWidget;
                                        i24 = i22;
                                        if (z18) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i25 = 5;
                                        i26 = 0;
                                    }
                                } else if (i9 == 1) {
                                    solverVariable12 = solverVariable2;
                                    i21 = 6;
                                    i20 = 8;
                                    i22 = 4;
                                    z16 = true;
                                    z15 = true;
                                    z17 = false;
                                    if (z15) {
                                    }
                                    z18 = true;
                                    if (z16) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z15) {
                                    }
                                    if (z19) {
                                    }
                                    constraintWidget3 = constraintWidget;
                                    i24 = i22;
                                    if (z18) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i25 = 5;
                                    i26 = 0;
                                } else if (i9 == 3) {
                                    if (this.mResolvedDimensionRatioSide == -1) {
                                        if (z9) {
                                            solverVariable12 = solverVariable2;
                                            i21 = z2 ? 5 : 4;
                                        } else {
                                            solverVariable12 = solverVariable2;
                                            i21 = 8;
                                        }
                                        i20 = 8;
                                    } else if (z6) {
                                        if (i6 == 2 || i6 == 1) {
                                            i29 = 5;
                                            i30 = 4;
                                        } else {
                                            i29 = 8;
                                            i30 = 5;
                                        }
                                        solverVariable12 = solverVariable2;
                                        i22 = i30;
                                        z16 = true;
                                        z15 = true;
                                        z17 = true;
                                        i20 = i29;
                                        i21 = 6;
                                        if (z15) {
                                        }
                                        z18 = true;
                                        if (z16) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z15) {
                                        }
                                        if (z19) {
                                        }
                                        constraintWidget3 = constraintWidget;
                                        i24 = i22;
                                        if (z18) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i25 = 5;
                                        i26 = 0;
                                    } else if (i12 > 0) {
                                        solverVariable12 = solverVariable2;
                                        i21 = 6;
                                        i20 = 5;
                                    } else {
                                        if (i12 != 0 || i14 != 0) {
                                            solverVariable12 = solverVariable2;
                                            i21 = 6;
                                            i20 = 5;
                                        } else if (z9) {
                                            solverVariable12 = solverVariable2;
                                            i20 = (constraintWidget6 == parent || constraintWidget7 == parent) ? 5 : 4;
                                            i21 = 6;
                                        } else {
                                            solverVariable12 = solverVariable2;
                                            i21 = 6;
                                            i20 = 5;
                                            i22 = 8;
                                            z16 = true;
                                            z15 = true;
                                            z17 = true;
                                            if (z15) {
                                            }
                                            z18 = true;
                                            if (z16) {
                                            }
                                            if (this.mVisibility != 8) {
                                            }
                                            if (z15) {
                                            }
                                            if (z19) {
                                            }
                                            constraintWidget3 = constraintWidget;
                                            i24 = i22;
                                            if (z18) {
                                            }
                                            if (z19) {
                                            }
                                            if (z19) {
                                            }
                                            i25 = 5;
                                            i26 = 0;
                                        }
                                        i22 = 4;
                                        z16 = true;
                                        z15 = true;
                                        z17 = true;
                                        if (z15) {
                                        }
                                        z18 = true;
                                        if (z16) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z15) {
                                        }
                                        if (z19) {
                                        }
                                        constraintWidget3 = constraintWidget;
                                        i24 = i22;
                                        if (z18) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i25 = 5;
                                        i26 = 0;
                                    }
                                    i22 = 5;
                                    z16 = true;
                                    z15 = true;
                                    z17 = true;
                                    if (z15) {
                                    }
                                    z18 = true;
                                    if (z16) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z15) {
                                    }
                                    if (z19) {
                                    }
                                    constraintWidget3 = constraintWidget;
                                    i24 = i22;
                                    if (z18) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i25 = 5;
                                    i26 = 0;
                                } else {
                                    solverVariable12 = solverVariable2;
                                    i21 = 6;
                                    i20 = 5;
                                    i22 = 4;
                                    z16 = false;
                                    z15 = false;
                                    z17 = false;
                                    if (z15) {
                                    }
                                    z18 = true;
                                    if (z16) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z15) {
                                    }
                                    if (z19) {
                                    }
                                    constraintWidget3 = constraintWidget;
                                    i24 = i22;
                                    if (z18) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i25 = 5;
                                    i26 = 0;
                                }
                                i32 = i25;
                                if (z19 || !z14) {
                                    return;
                                }
                                if (constraintAnchor2.mTarget != null) {
                                    i33 = constraintAnchor2.getMargin();
                                    solverVariable16 = solverVariable2;
                                } else {
                                    solverVariable16 = solverVariable2;
                                    i33 = i26;
                                }
                                if (solverVariable6 != solverVariable16) {
                                    if (this.OPTIMIZE_WRAP && solverVariable15.isFinalValue && (constraintWidget5 = this.mParent) != null) {
                                        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget5;
                                        if (z) {
                                            constraintWidgetContainer2.addHorizontalWrapMaxVariable(constraintAnchor2);
                                            return;
                                        } else {
                                            constraintWidgetContainer2.addVerticalWrapMaxVariable(constraintAnchor2);
                                            return;
                                        }
                                    }
                                    linearSystem.addGreaterThan(solverVariable16, solverVariable15, i33, i32);
                                    return;
                                }
                                return;
                            }
                            if (solverVariable4.isFinalValue && solverVariable6.isFinalValue) {
                                linearSystem.addCentering(createObjectVariable3, solverVariable4, constraintAnchor.getMargin(), f, solverVariable6, solverVariable5, constraintAnchor2.getMargin(), 8);
                                if (z2 && z14) {
                                    if (constraintAnchor2.mTarget != null) {
                                        i19 = constraintAnchor2.getMargin();
                                        solverVariable11 = solverVariable2;
                                    } else {
                                        solverVariable11 = solverVariable2;
                                        i19 = 0;
                                    }
                                    if (solverVariable6 != solverVariable11) {
                                        linearSystem.addGreaterThan(solverVariable11, solverVariable5, i19, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            solverVariable12 = solverVariable2;
                            i21 = 6;
                            i20 = 5;
                            i22 = 4;
                            z16 = true;
                            z15 = true;
                            z17 = false;
                            if (z15) {
                            }
                            z18 = true;
                            if (z16) {
                            }
                            if (this.mVisibility != 8) {
                            }
                            if (z15) {
                            }
                            if (z19) {
                            }
                            constraintWidget3 = constraintWidget;
                            i24 = i22;
                            if (z18) {
                            }
                            if (z19) {
                            }
                            if (z19) {
                            }
                            i25 = 5;
                            i26 = 0;
                            i32 = i25;
                            if (z19) {
                                return;
                            } else {
                                return;
                            }
                        }
                        i26 = 0;
                        solverVariable15 = solverVariable5;
                        i25 = 5;
                    } else {
                        z19 = z2;
                        i26 = 0;
                        i32 = (z2 && (constraintAnchor.mTarget.mOwner instanceof Barrier)) ? 8 : 5;
                        solverVariable15 = solverVariable5;
                        if (z19) {
                        }
                    }
                    z19 = z2;
                    i32 = i25;
                    if (z19) {
                    }
                }
                if (i16 >= i17 && z2 && z14) {
                    linearSystem.addGreaterThan(solverVariable10, solverVariable7, i15, 8);
                    int i39 = (z || this.mBaseline.mTarget == null) ? 1 : i15;
                    if (z || (constraintAnchor3 = this.mBaseline.mTarget) == null) {
                        i18 = i39;
                    } else {
                        ConstraintWidget constraintWidget8 = constraintAnchor3.mOwner;
                        if (constraintWidget8.mDimensionRatio != 0.0f) {
                            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget8.mListDimensionBehaviors;
                            DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[i15];
                            DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                            if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                i18 = 1;
                            }
                        }
                        i18 = i15;
                    }
                    if (i18 != 0) {
                        linearSystem.addGreaterThan(solverVariable8, solverVariable9, i15, 8);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z12 = false;
        i10 = this.mWidthOverride;
        if (i10 == -1) {
        }
        i10 = i2;
        solverVariable3 = createObjectVariable6;
        i11 = this.mHeightOverride;
        if (i11 != -1) {
            this.mHeightOverride = -1;
            i10 = i11;
            z12 = false;
        }
        if (this.mVisibility == 8) {
        }
        if (z11) {
        }
        if (z12) {
        }
        if (z11) {
        }
        if (i16 >= i17) {
        }
    }

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z && (horizontalWidgetRun = this.horizontalRun) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.start;
            if (dependencyNode.resolved) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.end;
                if (dependencyNode2.resolved) {
                    objectVariableValue = dependencyNode.value;
                    objectVariableValue3 = dependencyNode2.value;
                }
            }
        }
        if (z && (verticalWidgetRun = this.verticalRun) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.start;
            if (dependencyNode3.resolved) {
                DependencyNode dependencyNode4 = verticalWidgetRun.end;
                if (dependencyNode4.resolved) {
                    objectVariableValue2 = dependencyNode3.value;
                    objectVariableValue4 = dependencyNode4.value;
                }
            }
        }
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void copy(ConstraintWidget constraintWidget, HashMap hashMap) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.hasBaseline = constraintWidget.hasBaseline;
        this.inPlaceholder = constraintWidget.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : (ConstraintWidget) hashMap.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.mX = constraintWidget.mX;
        this.mY = constraintWidget.mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mAnimated = constraintWidget.mAnimated;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget2 == null ? null : (ConstraintWidget) hashMap.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget3 != null ? (ConstraintWidget) hashMap.get(constraintWidget3) : null;
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean isResolved = z & this.horizontalRun.isResolved();
        boolean isResolved2 = z2 & this.verticalRun.isResolved();
        HorizontalWidgetRun horizontalWidgetRun = this.horizontalRun;
        int i3 = horizontalWidgetRun.start.value;
        VerticalWidgetRun verticalWidgetRun = this.verticalRun;
        int i4 = verticalWidgetRun.start.value;
        int i5 = horizontalWidgetRun.end.value;
        int i6 = verticalWidgetRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (isResolved) {
            this.mX = i3;
        }
        if (isResolved2) {
            this.mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (isResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.mWidth)) {
                i8 = i2;
            }
            this.mWidth = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.mWidth = i10;
            }
        }
        if (isResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i9 < (i = this.mHeight)) {
                i9 = i;
            }
            this.mHeight = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.mHeight = i11;
            }
        }
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.checkMatchParent(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
        }
        if (i == 0) {
            HashSet dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator it = dependents.iterator();
                while (it.hasNext()) {
                    ((ConstraintAnchor) it.next()).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    ((ConstraintAnchor) it2.next()).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator it3 = dependents3.iterator();
            while (it3.hasNext()) {
                ((ConstraintAnchor) it3.next()).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator it4 = dependents4.iterator();
            while (it4.hasNext()) {
                ((ConstraintAnchor) it4.next()).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator it5 = dependents5.iterator();
            while (it5.hasNext()) {
                ((ConstraintAnchor) it5.next()).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    public void getSceneString(StringBuilder sb) {
        sb.append("  " + this.stringId + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.mWidth);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.mHeight);
        sb.append("\n");
        sb.append("    actualLeft:" + this.mX);
        sb.append("\n");
        sb.append("    actualTop:" + this.mY);
        sb.append("\n");
        getSceneString(sb, "left", this.mLeft);
        getSceneString(sb, ViewHierarchyConstants.DIMENSION_TOP_KEY, this.mTop);
        getSceneString(sb, "right", this.mRight);
        getSceneString(sb, "bottom", this.mBottom);
        getSceneString(sb, "baseline", this.mBaseline);
        getSceneString(sb, "centerX", this.mCenterX);
        getSceneString(sb, "centerY", this.mCenterY);
        getSceneString(sb, "    width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        getSceneString(sb, "    height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "    horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    horizontalChainStyle", this.mHorizontalChainStyle, 0);
        serializeAttribute(sb, "    verticalChainStyle", this.mVerticalChainStyle, 0);
        sb.append("  }");
    }

    private void getSceneString(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "      size", i, 0);
        serializeAttribute(sb, "      min", i2, 0);
        serializeAttribute(sb, "      max", i3, Integer.MAX_VALUE);
        serializeAttribute(sb, "      matchMin", i5, 0);
        serializeAttribute(sb, "      matchDef", i6, 0);
        serializeAttribute(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    private void getSceneString(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("'");
        if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE || constraintAnchor.mMargin != 0) {
            sb.append(StringUtils.COMMA);
            sb.append(constraintAnchor.mMargin);
            if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE) {
                sb.append(StringUtils.COMMA);
                sb.append(constraintAnchor.mGoneMargin);
                sb.append(StringUtils.COMMA);
            }
        }
        sb.append(" ] ,\n");
    }
}
