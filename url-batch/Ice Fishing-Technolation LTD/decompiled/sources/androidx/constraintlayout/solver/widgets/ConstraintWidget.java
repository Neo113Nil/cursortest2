package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public HorizontalWidgetRun horizontalRun;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
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
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    public ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    boolean mOptimizerMeasurable;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    protected int mX;
    protected int mY;
    public boolean measured;
    public WidgetRun[] run;
    public ChainRun verticalChainRun;
    public VerticalWidgetRun verticalRun;
    public int[] wrapMeasure;

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

    public boolean isInVirtualLayout() {
        return this.mInVirtuaLayout;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtuaLayout = z;
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

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
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
        this.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
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
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtuaLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = new HorizontalWidgetRun(this);
        this.verticalRun = new VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
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
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        addAnchors();
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = new HorizontalWidgetRun(this);
        this.verticalRun = new VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
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
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.mX = i;
        this.mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
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

    public boolean isRoot() {
        return this.mParent == null;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        immediateConnect(ConstraintAnchor.Type.CENTER, constraintWidget, ConstraintAnchor.Type.CENTER, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        createObjectVariable.setName(str + ".left");
        createObjectVariable2.setName(str + ".top");
        createObjectVariable3.setName(str + ".right");
        createObjectVariable4.setName(str + ".bottom");
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline).setName(str + ".baseline");
        }
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
        return (this.mType != null ? "type: " + this.mType + " " : "") + (this.mDebugName != null ? "id: " + this.mDebugName + " " : "") + "(" + this.mX + ", " + this.mY + ") - (" + this.mWidth + " x " + this.mHeight + ")";
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

    public int getOptimizerWrapWidth() {
        int i;
        int i2 = this.mWidth;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            i = Math.max(this.mMatchConstraintMinWidth, i2);
        } else {
            i = this.mMatchConstraintMinWidth;
            if (i > 0) {
                this.mWidth = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.mMatchConstraintMaxWidth;
        return (i3 <= 0 || i3 >= i) ? i : i3;
    }

    public int getOptimizerWrapHeight() {
        int i;
        int i2 = this.mHeight;
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            i = Math.max(this.mMatchConstraintMinHeight, i2);
        } else {
            i = this.mMatchConstraintMinHeight;
            if (i > 0) {
                this.mHeight = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.mMatchConstraintMaxHeight;
        return (i3 <= 0 || i3 >= i) ? i : i3;
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

    protected int getRootX() {
        return this.mX + this.mOffsetX;
    }

    protected int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getLeft() {
        return getX();
    }

    public int getTop() {
        return getY();
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

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
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

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i) {
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.mGoneMargin = i;
            return;
        }
        if (i2 == 2) {
            this.mTop.mGoneMargin = i;
        } else if (i2 == 3) {
            this.mRight.mGoneMargin = i;
        } else {
            if (i2 != 4) {
                return;
            }
            this.mBottom.mGoneMargin = i;
        }
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

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
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

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
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

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
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
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i8 < (i5 = this.mHeight)) {
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
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
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

    int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.hasBaseline = i > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
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
        boolean z;
        if (type == ConstraintAnchor.Type.CENTER) {
            if (type2 == ConstraintAnchor.Type.CENTER) {
                ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
                ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
                ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(ConstraintAnchor.Type.LEFT, constraintWidget, ConstraintAnchor.Type.LEFT, 0);
                    connect(ConstraintAnchor.Type.RIGHT, constraintWidget, ConstraintAnchor.Type.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(ConstraintAnchor.Type.TOP, constraintWidget, ConstraintAnchor.Type.TOP, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, ConstraintAnchor.Type.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER), 0);
                    return;
                } else if (z) {
                    getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER_X), 0);
                    return;
                } else {
                    if (z2) {
                        getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER_Y), 0);
                        return;
                    }
                    return;
                }
            }
            if (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT) {
                connect(ConstraintAnchor.Type.LEFT, constraintWidget, type2, 0);
                connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                return;
            } else {
                if (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM) {
                    connect(ConstraintAnchor.Type.TOP, constraintWidget, type2, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
        }
        if (type == ConstraintAnchor.Type.CENTER_X && (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(anchor6, 0);
            return;
        }
        if (type == ConstraintAnchor.Type.CENTER_Y && (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(ConstraintAnchor.Type.TOP).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(anchor8, 0);
            return;
        }
        if (type == ConstraintAnchor.Type.CENTER_X && type2 == ConstraintAnchor.Type.CENTER_X) {
            getAnchor(ConstraintAnchor.Type.LEFT).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT), 0);
            getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT), 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        if (type == ConstraintAnchor.Type.CENTER_Y && type2 == ConstraintAnchor.Type.CENTER_Y) {
            getAnchor(ConstraintAnchor.Type.TOP).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.TOP), 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM), 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor anchor9 = getAnchor(type);
        ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
        if (anchor9.isValidConnection(anchor10)) {
            if (type == ConstraintAnchor.Type.BASELINE) {
                ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
                i = 0;
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor anchor13 = getAnchor(ConstraintAnchor.Type.BASELINE);
                if (anchor13 != null) {
                    anchor13.reset();
                }
                ConstraintAnchor anchor14 = getAnchor(ConstraintAnchor.Type.CENTER);
                if (anchor14.getTarget() != anchor10) {
                    anchor14.reset();
                }
                ConstraintAnchor opposite = getAnchor(type).getOpposite();
                ConstraintAnchor anchor15 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
                if (anchor15.isConnected()) {
                    opposite.reset();
                    anchor15.reset();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor anchor16 = getAnchor(ConstraintAnchor.Type.CENTER);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                ConstraintAnchor anchor17 = getAnchor(ConstraintAnchor.Type.CENTER_X);
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

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
            if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor5.reset();
            }
        } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor5.reset();
        }
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).reset();
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[type.ordinal()]) {
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
        if (this.mLeft.mTarget == null || this.mLeft.mTarget.mTarget != this.mLeft) {
            return this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight;
        }
        return true;
    }

    public ConstraintWidget getPreviousChainMember(int i) {
        if (i == 0) {
            if (this.mLeft.mTarget == null) {
                return null;
            }
            ConstraintAnchor constraintAnchor = this.mLeft.mTarget.mTarget;
            ConstraintAnchor constraintAnchor2 = this.mLeft;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mTop.mTarget == null) {
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mTop.mTarget.mTarget;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public ConstraintWidget getNextChainMember(int i) {
        if (i == 0) {
            if (this.mRight.mTarget == null) {
                return null;
            }
            ConstraintAnchor constraintAnchor = this.mRight.mTarget.mTarget;
            ConstraintAnchor constraintAnchor2 = this.mRight;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mBottom.mTarget == null) {
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom.mTarget.mTarget;
        ConstraintAnchor constraintAnchor4 = this.mBottom;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public boolean isInVerticalChain() {
        if (this.mTop.mTarget == null || this.mTop.mTarget.mTarget != this.mTop) {
            return this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom;
        }
        return true;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    private boolean isChainHead(int i) {
        int i2 = i * 2;
        if (this.mListAnchors[i2].mTarget != null) {
            ConstraintAnchor constraintAnchor = this.mListAnchors[i2].mTarget.mTarget;
            ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
            if (constraintAnchor != constraintAnchorArr[i2]) {
                int i3 = i2 + 1;
                if (constraintAnchorArr[i3].mTarget != null && this.mListAnchors[i3].mTarget.mTarget == this.mListAnchors[i3]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x027b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addToSolver(LinearSystem linearSystem) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        SolverVariable solverVariable;
        int i;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        SolverVariable solverVariable2;
        boolean z8;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        boolean z9;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        LinearSystem linearSystem2;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        int i4;
        int i5;
        int i6;
        int i7;
        SolverVariable solverVariable10;
        SolverVariable solverVariable11;
        boolean z10;
        int i8;
        int i9;
        boolean isInHorizontalChain;
        boolean isInVerticalChain;
        ConstraintWidget constraintWidget = this;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(constraintWidget.mRight);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(constraintWidget.mTop);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(constraintWidget.mBottom);
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(constraintWidget.mBaseline);
        if (LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.widgets++;
        }
        if (constraintWidget.horizontalRun.start.resolved && constraintWidget.horizontalRun.end.resolved && constraintWidget.verticalRun.start.resolved && constraintWidget.verticalRun.end.resolved) {
            if (LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.graphSolved++;
            }
            linearSystem.addEquality(createObjectVariable, constraintWidget.horizontalRun.start.value);
            linearSystem.addEquality(createObjectVariable2, constraintWidget.horizontalRun.end.value);
            linearSystem.addEquality(createObjectVariable3, constraintWidget.verticalRun.start.value);
            linearSystem.addEquality(createObjectVariable4, constraintWidget.verticalRun.end.value);
            linearSystem.addEquality(createObjectVariable5, constraintWidget.verticalRun.baseline.value);
            ConstraintWidget constraintWidget2 = constraintWidget.mParent;
            if (constraintWidget2 != null) {
                boolean z11 = constraintWidget2 != null && constraintWidget2.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
                ConstraintWidget constraintWidget3 = constraintWidget.mParent;
                boolean z12 = constraintWidget3 != null && constraintWidget3.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
                if (z11 && constraintWidget.isTerminalWidget[0] && !isInHorizontalChain()) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mParent.mRight), createObjectVariable2, 0, 8);
                }
                if (z12 && constraintWidget.isTerminalWidget[1] && !isInVerticalChain()) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mParent.mBottom), createObjectVariable4, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.linearSolved++;
        }
        ConstraintWidget constraintWidget4 = constraintWidget.mParent;
        if (constraintWidget4 != null) {
            boolean z13 = constraintWidget4 != null && constraintWidget4.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            ConstraintWidget constraintWidget5 = constraintWidget.mParent;
            boolean z14 = constraintWidget5 != null && constraintWidget5.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            if (constraintWidget.isChainHead(0)) {
                ((ConstraintWidgetContainer) constraintWidget.mParent).addChain(constraintWidget, 0);
                isInHorizontalChain = true;
            } else {
                isInHorizontalChain = isInHorizontalChain();
            }
            if (constraintWidget.isChainHead(1)) {
                ((ConstraintWidgetContainer) constraintWidget.mParent).addChain(constraintWidget, 1);
                isInVerticalChain = true;
            } else {
                isInVerticalChain = isInVerticalChain();
            }
            if (!isInHorizontalChain && z13 && constraintWidget.mVisibility != 8 && constraintWidget.mLeft.mTarget == null && constraintWidget.mRight.mTarget == null) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mParent.mRight), createObjectVariable2, 0, 1);
            }
            if (!isInVerticalChain && z14 && constraintWidget.mVisibility != 8 && constraintWidget.mTop.mTarget == null && constraintWidget.mBottom.mTarget == null && constraintWidget.mBaseline == null) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mParent.mBottom), createObjectVariable4, 0, 1);
            }
            z2 = z13;
            z = z14;
            z4 = isInHorizontalChain;
            z3 = isInVerticalChain;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        int i10 = constraintWidget.mWidth;
        int i11 = constraintWidget.mMinWidth;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = constraintWidget.mHeight;
        int i13 = constraintWidget.mMinHeight;
        if (i12 < i13) {
            i12 = i13;
        }
        boolean z15 = constraintWidget.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z16 = constraintWidget.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT;
        constraintWidget.mResolvedDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        float f = constraintWidget.mDimensionRatio;
        constraintWidget.mResolvedDimensionRatio = f;
        int i14 = constraintWidget.mMatchConstraintDefaultWidth;
        int i15 = constraintWidget.mMatchConstraintDefaultHeight;
        if (f <= 0.0f || constraintWidget.mVisibility == 8) {
            solverVariable = createObjectVariable5;
            i = i15;
            i2 = i12;
        } else {
            solverVariable = createObjectVariable5;
            if (constraintWidget.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && i14 == 0) {
                i14 = 3;
            }
            if (constraintWidget.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i15 == 0) {
                i15 = 3;
            }
            if (constraintWidget.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i14 == 3 && i15 == 3) {
                constraintWidget.setupDimensionRatio(z2, z, z15, z16);
            } else if (constraintWidget.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && i14 == 3) {
                constraintWidget.mResolvedDimensionRatioSide = 0;
                i10 = (int) (constraintWidget.mResolvedDimensionRatio * constraintWidget.mHeight);
                z5 = true;
                i = i15;
                i2 = i12;
                if (constraintWidget.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                    i3 = 4;
                    z5 = false;
                    int[] iArr = constraintWidget.mResolvedMatchConstraintDefault;
                    iArr[0] = i3;
                    iArr[1] = i;
                    constraintWidget.mResolvedHasRatio = z5;
                    if (z5 && ((i9 = constraintWidget.mResolvedDimensionRatioSide) == 0 || i9 == -1)) {
                        z6 = true;
                        boolean z17 = constraintWidget.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT && (constraintWidget instanceof ConstraintWidgetContainer);
                        int i16 = !z17 ? 0 : i10;
                        boolean z18 = !constraintWidget.mCenter.isConnected();
                        boolean[] zArr = constraintWidget.mIsInBarrier;
                        boolean z19 = zArr[0];
                        boolean z20 = zArr[1];
                        if (constraintWidget.mHorizontalResolution != 2) {
                            z7 = z;
                            solverVariable2 = createObjectVariable4;
                            z8 = z5;
                            solverVariable3 = createObjectVariable2;
                            solverVariable4 = createObjectVariable;
                            z9 = z2;
                            solverVariable5 = createObjectVariable3;
                            solverVariable6 = solverVariable;
                        } else if (!constraintWidget.horizontalRun.start.resolved || !constraintWidget.horizontalRun.end.resolved) {
                            ConstraintWidget constraintWidget6 = constraintWidget.mParent;
                            SolverVariable createObjectVariable6 = constraintWidget6 != null ? linearSystem.createObjectVariable(constraintWidget6.mRight) : null;
                            ConstraintWidget constraintWidget7 = constraintWidget.mParent;
                            z9 = z2;
                            z7 = z;
                            solverVariable6 = solverVariable;
                            solverVariable2 = createObjectVariable4;
                            z8 = z5;
                            solverVariable5 = createObjectVariable3;
                            solverVariable3 = createObjectVariable2;
                            solverVariable4 = createObjectVariable;
                            applyConstraints(linearSystem, true, z9, z7, constraintWidget.isTerminalWidget[0], constraintWidget7 != null ? linearSystem.createObjectVariable(constraintWidget7.mLeft) : null, createObjectVariable6, constraintWidget.mListDimensionBehaviors[0], z17, constraintWidget.mLeft, constraintWidget.mRight, constraintWidget.mX, i16, constraintWidget.mMinWidth, constraintWidget.mMaxDimension[0], constraintWidget.mHorizontalBiasPercent, z6, z4, z3, z19, i3, i, constraintWidget.mMatchConstraintMinWidth, constraintWidget.mMatchConstraintMaxWidth, constraintWidget.mMatchConstraintPercentWidth, z18);
                        } else {
                            linearSystem.addEquality(createObjectVariable, constraintWidget.horizontalRun.start.value);
                            linearSystem.addEquality(createObjectVariable2, constraintWidget.horizontalRun.end.value);
                            if (constraintWidget.mParent != null && z2 && constraintWidget.isTerminalWidget[0] && !isInHorizontalChain()) {
                                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mParent.mRight), createObjectVariable2, 0, 8);
                            }
                            z7 = z;
                            solverVariable2 = createObjectVariable4;
                            z8 = z5;
                            solverVariable3 = createObjectVariable2;
                            solverVariable4 = createObjectVariable;
                            z9 = z2;
                            solverVariable5 = createObjectVariable3;
                            solverVariable6 = solverVariable;
                            if (constraintWidget.verticalRun.start.resolved || !constraintWidget.verticalRun.end.resolved) {
                                linearSystem2 = linearSystem;
                                solverVariable7 = solverVariable6;
                                solverVariable8 = solverVariable2;
                                solverVariable9 = solverVariable5;
                                i4 = 8;
                                i5 = 0;
                                i6 = 1;
                                i7 = 1;
                            } else {
                                linearSystem2 = linearSystem;
                                solverVariable9 = solverVariable5;
                                linearSystem2.addEquality(solverVariable9, constraintWidget.verticalRun.start.value);
                                solverVariable8 = solverVariable2;
                                linearSystem2.addEquality(solverVariable8, constraintWidget.verticalRun.end.value);
                                solverVariable7 = solverVariable6;
                                linearSystem2.addEquality(solverVariable7, constraintWidget.verticalRun.baseline.value);
                                ConstraintWidget constraintWidget8 = constraintWidget.mParent;
                                if (constraintWidget8 == null || z3 || !z7) {
                                    i4 = 8;
                                    i5 = 0;
                                    i6 = 1;
                                } else {
                                    i6 = 1;
                                    if (constraintWidget.isTerminalWidget[1]) {
                                        i4 = 8;
                                        i5 = 0;
                                        linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(constraintWidget8.mBottom), solverVariable8, 0, 8);
                                    } else {
                                        i4 = 8;
                                        i5 = 0;
                                    }
                                }
                                i7 = i5;
                            }
                            if ((constraintWidget.mVerticalResolution == 2 ? i5 : i7) != 0) {
                                boolean z21 = (constraintWidget.mListDimensionBehaviors[i6] == DimensionBehaviour.WRAP_CONTENT && (constraintWidget instanceof ConstraintWidgetContainer)) ? i6 : i5;
                                if (z21) {
                                    i2 = i5;
                                }
                                int i17 = (z8 && ((i8 = constraintWidget.mResolvedDimensionRatioSide) == i6 || i8 == -1)) ? i6 : i5;
                                ConstraintWidget constraintWidget9 = constraintWidget.mParent;
                                SolverVariable createObjectVariable7 = constraintWidget9 != null ? linearSystem2.createObjectVariable(constraintWidget9.mBottom) : null;
                                ConstraintWidget constraintWidget10 = constraintWidget.mParent;
                                SolverVariable createObjectVariable8 = constraintWidget10 != null ? linearSystem2.createObjectVariable(constraintWidget10.mTop) : null;
                                if (constraintWidget.mBaselineDistance > 0 || constraintWidget.mVisibility == i4) {
                                    linearSystem2.addEquality(solverVariable7, solverVariable9, getBaselineDistance(), i4);
                                    if (constraintWidget.mBaseline.mTarget != null) {
                                        linearSystem2.addEquality(solverVariable7, linearSystem2.createObjectVariable(constraintWidget.mBaseline.mTarget), i5, i4);
                                        if (z7) {
                                            linearSystem2.addGreaterThan(createObjectVariable7, linearSystem2.createObjectVariable(constraintWidget.mBottom), i5, 5);
                                        }
                                        z10 = i5;
                                        solverVariable10 = solverVariable8;
                                        solverVariable11 = solverVariable9;
                                        applyConstraints(linearSystem, false, z7, z9, constraintWidget.isTerminalWidget[i6], createObjectVariable8, createObjectVariable7, constraintWidget.mListDimensionBehaviors[i6], z21, constraintWidget.mTop, constraintWidget.mBottom, constraintWidget.mY, i2, constraintWidget.mMinHeight, constraintWidget.mMaxDimension[i6], constraintWidget.mVerticalBiasPercent, i17, z3, z4, z20, i, i3, constraintWidget.mMatchConstraintMinHeight, constraintWidget.mMatchConstraintMaxHeight, constraintWidget.mMatchConstraintPercentHeight, z10);
                                    } else if (constraintWidget.mVisibility == i4) {
                                        linearSystem2.addEquality(solverVariable7, solverVariable9, i5, i4);
                                    }
                                }
                                z10 = z18;
                                solverVariable10 = solverVariable8;
                                solverVariable11 = solverVariable9;
                                applyConstraints(linearSystem, false, z7, z9, constraintWidget.isTerminalWidget[i6], createObjectVariable8, createObjectVariable7, constraintWidget.mListDimensionBehaviors[i6], z21, constraintWidget.mTop, constraintWidget.mBottom, constraintWidget.mY, i2, constraintWidget.mMinHeight, constraintWidget.mMaxDimension[i6], constraintWidget.mVerticalBiasPercent, i17, z3, z4, z20, i, i3, constraintWidget.mMatchConstraintMinHeight, constraintWidget.mMatchConstraintMaxHeight, constraintWidget.mMatchConstraintPercentHeight, z10);
                            } else {
                                solverVariable10 = solverVariable8;
                                solverVariable11 = solverVariable9;
                            }
                            if (z8) {
                                if (this.mResolvedDimensionRatioSide == 1) {
                                    linearSystem.addRatio(solverVariable10, solverVariable11, solverVariable3, solverVariable4, this.mResolvedDimensionRatio, 8);
                                } else {
                                    linearSystem.addRatio(solverVariable3, solverVariable4, solverVariable10, solverVariable11, this.mResolvedDimensionRatio, 8);
                                }
                            }
                            if (this.mCenter.isConnected()) {
                                linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                                return;
                            }
                            return;
                        }
                        constraintWidget = this;
                        if (constraintWidget.verticalRun.start.resolved) {
                        }
                        linearSystem2 = linearSystem;
                        solverVariable7 = solverVariable6;
                        solverVariable8 = solverVariable2;
                        solverVariable9 = solverVariable5;
                        i4 = 8;
                        i5 = 0;
                        i6 = 1;
                        i7 = 1;
                        if ((constraintWidget.mVerticalResolution == 2 ? i5 : i7) != 0) {
                        }
                        if (z8) {
                        }
                        if (this.mCenter.isConnected()) {
                        }
                    }
                    z6 = false;
                    if (constraintWidget.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT) {
                    }
                    if (!z17) {
                    }
                    boolean z182 = !constraintWidget.mCenter.isConnected();
                    boolean[] zArr2 = constraintWidget.mIsInBarrier;
                    boolean z192 = zArr2[0];
                    boolean z202 = zArr2[1];
                    if (constraintWidget.mHorizontalResolution != 2) {
                    }
                    constraintWidget = this;
                    if (constraintWidget.verticalRun.start.resolved) {
                    }
                    linearSystem2 = linearSystem;
                    solverVariable7 = solverVariable6;
                    solverVariable8 = solverVariable2;
                    solverVariable9 = solverVariable5;
                    i4 = 8;
                    i5 = 0;
                    i6 = 1;
                    i7 = 1;
                    if ((constraintWidget.mVerticalResolution == 2 ? i5 : i7) != 0) {
                    }
                    if (z8) {
                    }
                    if (this.mCenter.isConnected()) {
                    }
                } else {
                    i3 = i14;
                    int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
                    iArr2[0] = i3;
                    iArr2[1] = i;
                    constraintWidget.mResolvedHasRatio = z5;
                    if (z5) {
                        z6 = true;
                        if (constraintWidget.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT) {
                        }
                        if (!z17) {
                        }
                        boolean z1822 = !constraintWidget.mCenter.isConnected();
                        boolean[] zArr22 = constraintWidget.mIsInBarrier;
                        boolean z1922 = zArr22[0];
                        boolean z2022 = zArr22[1];
                        if (constraintWidget.mHorizontalResolution != 2) {
                        }
                        constraintWidget = this;
                        if (constraintWidget.verticalRun.start.resolved) {
                        }
                        linearSystem2 = linearSystem;
                        solverVariable7 = solverVariable6;
                        solverVariable8 = solverVariable2;
                        solverVariable9 = solverVariable5;
                        i4 = 8;
                        i5 = 0;
                        i6 = 1;
                        i7 = 1;
                        if ((constraintWidget.mVerticalResolution == 2 ? i5 : i7) != 0) {
                        }
                        if (z8) {
                        }
                        if (this.mCenter.isConnected()) {
                        }
                    }
                    z6 = false;
                    if (constraintWidget.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT) {
                    }
                    if (!z17) {
                    }
                    boolean z18222 = !constraintWidget.mCenter.isConnected();
                    boolean[] zArr222 = constraintWidget.mIsInBarrier;
                    boolean z19222 = zArr222[0];
                    boolean z20222 = zArr222[1];
                    if (constraintWidget.mHorizontalResolution != 2) {
                    }
                    constraintWidget = this;
                    if (constraintWidget.verticalRun.start.resolved) {
                    }
                    linearSystem2 = linearSystem;
                    solverVariable7 = solverVariable6;
                    solverVariable8 = solverVariable2;
                    solverVariable9 = solverVariable5;
                    i4 = 8;
                    i5 = 0;
                    i6 = 1;
                    i7 = 1;
                    if ((constraintWidget.mVerticalResolution == 2 ? i5 : i7) != 0) {
                    }
                    if (z8) {
                    }
                    if (this.mCenter.isConnected()) {
                    }
                }
            } else if (constraintWidget.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i15 == 3) {
                constraintWidget.mResolvedDimensionRatioSide = 1;
                if (constraintWidget.mDimensionRatioSide == -1) {
                    constraintWidget.mResolvedDimensionRatio = 1.0f / constraintWidget.mResolvedDimensionRatio;
                }
                i12 = (int) (constraintWidget.mResolvedDimensionRatio * constraintWidget.mWidth);
                if (constraintWidget.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
                    i2 = i12;
                    i = 4;
                }
            }
            i = i15;
            i2 = i12;
            i3 = i14;
            z5 = true;
            int[] iArr22 = constraintWidget.mResolvedMatchConstraintDefault;
            iArr22[0] = i3;
            iArr22[1] = i;
            constraintWidget.mResolvedHasRatio = z5;
            if (z5) {
            }
            z6 = false;
            if (constraintWidget.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT) {
            }
            if (!z17) {
            }
            boolean z182222 = !constraintWidget.mCenter.isConnected();
            boolean[] zArr2222 = constraintWidget.mIsInBarrier;
            boolean z192222 = zArr2222[0];
            boolean z202222 = zArr2222[1];
            if (constraintWidget.mHorizontalResolution != 2) {
            }
            constraintWidget = this;
            if (constraintWidget.verticalRun.start.resolved) {
            }
            linearSystem2 = linearSystem;
            solverVariable7 = solverVariable6;
            solverVariable8 = solverVariable2;
            solverVariable9 = solverVariable5;
            i4 = 8;
            i5 = 0;
            i6 = 1;
            i7 = 1;
            if ((constraintWidget.mVerticalResolution == 2 ? i5 : i7) != 0) {
            }
            if (z8) {
            }
            if (this.mCenter.isConnected()) {
            }
        }
        i3 = i14;
        z5 = false;
        int[] iArr222 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr222[0] = i3;
        iArr222[1] = i;
        constraintWidget.mResolvedHasRatio = z5;
        if (z5) {
        }
        z6 = false;
        if (constraintWidget.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT) {
        }
        if (!z17) {
        }
        boolean z1822222 = !constraintWidget.mCenter.isConnected();
        boolean[] zArr22222 = constraintWidget.mIsInBarrier;
        boolean z1922222 = zArr22222[0];
        boolean z2022222 = zArr22222[1];
        if (constraintWidget.mHorizontalResolution != 2) {
        }
        constraintWidget = this;
        if (constraintWidget.verticalRun.start.resolved) {
        }
        linearSystem2 = linearSystem;
        solverVariable7 = solverVariable6;
        solverVariable8 = solverVariable2;
        solverVariable9 = solverVariable5;
        i4 = 8;
        i5 = 0;
        i6 = 1;
        i7 = 1;
        if ((constraintWidget.mVerticalResolution == 2 ? i5 : i7) != 0) {
        }
        if (z8) {
        }
        if (this.mCenter.isConnected()) {
        }
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

    /* JADX WARN: Removed duplicated region for block: B:118:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0320 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void applyConstraints(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, int i5, int i6, int i7, int i8, float f2, boolean z10) {
        int i9;
        boolean z11;
        int i10;
        SolverVariable solverVariable3;
        int i11;
        int i12;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        SolverVariable createObjectVariable;
        SolverVariable createObjectVariable2;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        LinearSystem linearSystem2;
        SolverVariable solverVariable10;
        int i15;
        int i16;
        boolean z14;
        int i17;
        boolean z15;
        boolean z16;
        int i18;
        int i19;
        boolean z17;
        boolean z18;
        boolean z19;
        int i20;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariable11;
        int i21;
        LinearSystem linearSystem3;
        int i22;
        SolverVariable solverVariable12;
        int i23;
        int i24;
        SolverVariable solverVariable13;
        ConstraintWidget constraintWidget3;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z20;
        boolean z21;
        SolverVariable solverVariable14;
        int i29;
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
        int i30 = isConnected2 ? (isConnected ? 1 : 0) + 1 : isConnected ? 1 : 0;
        if (isConnected3) {
            i30++;
        }
        int i31 = z6 ? 3 : i5;
        int i32 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour.ordinal()];
        if (i32 == 1 || i32 == 2 || i32 == 3 || i32 != 4) {
            i9 = i31;
        } else {
            i9 = i31;
            if (i9 != 4) {
                z11 = true;
                if (this.mVisibility != 8) {
                    i10 = 0;
                    z11 = false;
                } else {
                    i10 = i2;
                }
                if (z10) {
                    solverVariable3 = createObjectVariable6;
                    i11 = 8;
                } else {
                    if (!isConnected && !isConnected2 && !isConnected3) {
                        linearSystem.addEquality(createObjectVariable3, i);
                    } else if (isConnected && !isConnected2) {
                        solverVariable3 = createObjectVariable6;
                        i11 = 8;
                        linearSystem.addEquality(createObjectVariable3, createObjectVariable5, constraintAnchor.getMargin(), 8);
                    }
                    solverVariable3 = createObjectVariable6;
                    i11 = 8;
                }
                if (z11) {
                    if (z5) {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, 0, 3);
                        if (i3 > 0) {
                            linearSystem.addGreaterThan(createObjectVariable4, createObjectVariable3, i3, 8);
                        }
                        if (i4 < Integer.MAX_VALUE) {
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i4, 8);
                        }
                    } else {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, i11);
                    }
                    i14 = i7;
                    i12 = i8;
                    solverVariable4 = createObjectVariable5;
                    solverVariable5 = createObjectVariable4;
                } else {
                    if (i30 != 2 && !z6 && (i9 == 1 || i9 == 0)) {
                        int max = Math.max(i7, i10);
                        if (i8 > 0) {
                            max = Math.min(i8, max);
                        }
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, max, 8);
                        z13 = z4;
                        i14 = i7;
                        i12 = i8;
                        solverVariable4 = createObjectVariable5;
                        solverVariable5 = createObjectVariable4;
                        solverVariable6 = solverVariable3;
                        z12 = false;
                        i13 = i30;
                        if (z10) {
                        }
                        if (i16 >= 2) {
                            return;
                        } else {
                            return;
                        }
                    }
                    int i33 = i7 == -2 ? i10 : i7;
                    i12 = i8 == -2 ? i10 : i8;
                    if (i10 > 0 && i9 != 1) {
                        i10 = 0;
                    }
                    if (i33 > 0) {
                        linearSystem.addGreaterThan(createObjectVariable4, createObjectVariable3, i33, 8);
                        i10 = Math.max(i10, i33);
                    }
                    if (i12 > 0) {
                        if (!z2 || i9 != 1) {
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i12, 8);
                        }
                        i10 = Math.min(i10, i12);
                    }
                    if (i9 != 1) {
                        if (i9 == 2) {
                            if (constraintAnchor.getType() == ConstraintAnchor.Type.TOP || constraintAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                                createObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.TOP));
                                createObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                            } else {
                                createObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                                createObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
                            }
                            int i34 = i33;
                            solverVariable6 = solverVariable3;
                            i13 = i30;
                            solverVariable4 = createObjectVariable5;
                            solverVariable5 = createObjectVariable4;
                            linearSystem.addConstraint(linearSystem.createRow().createRowDimensionRatio(createObjectVariable4, createObjectVariable3, createObjectVariable2, createObjectVariable, f2));
                            z13 = z4;
                            i14 = i34;
                            z12 = false;
                        } else {
                            solverVariable4 = createObjectVariable5;
                            solverVariable5 = createObjectVariable4;
                            int i35 = i33;
                            solverVariable6 = solverVariable3;
                            i13 = i30;
                            i14 = i35;
                            z12 = z11;
                            z13 = true;
                        }
                        if (z10) {
                            solverVariable7 = solverVariable;
                            solverVariable8 = solverVariable2;
                            solverVariable9 = createObjectVariable3;
                            linearSystem2 = linearSystem;
                            solverVariable10 = solverVariable5;
                            i15 = 8;
                            i16 = i13;
                        } else if (z7) {
                            solverVariable7 = solverVariable;
                            solverVariable8 = solverVariable2;
                            solverVariable9 = createObjectVariable3;
                            linearSystem2 = linearSystem;
                            solverVariable10 = solverVariable5;
                            i16 = i13;
                            i15 = 8;
                        } else {
                            if ((isConnected || isConnected2 || isConnected3) && (!isConnected || isConnected2)) {
                                if (!isConnected && isConnected2) {
                                    linearSystem.addEquality(solverVariable5, solverVariable6, -constraintAnchor2.getMargin(), 8);
                                    if (z2) {
                                        linearSystem.addGreaterThan(createObjectVariable3, solverVariable, 0, 5);
                                    }
                                } else if (isConnected && isConnected2) {
                                    ConstraintWidget constraintWidget4 = constraintAnchor.mTarget.mOwner;
                                    ConstraintWidget constraintWidget5 = constraintAnchor2.mTarget.mOwner;
                                    ConstraintWidget parent = getParent();
                                    int i36 = 6;
                                    if (z12) {
                                        if (i9 == 0) {
                                            if (i12 == 0 && i14 == 0) {
                                                i27 = 8;
                                                i28 = 8;
                                                z20 = false;
                                                z21 = true;
                                            } else {
                                                i27 = 5;
                                                i28 = 5;
                                                z20 = true;
                                                z21 = false;
                                            }
                                            if ((constraintWidget4 instanceof Barrier) || (constraintWidget5 instanceof Barrier)) {
                                                z16 = z20;
                                                z17 = z21;
                                                z15 = false;
                                                i18 = 4;
                                                i19 = i27;
                                                i17 = 6;
                                            } else {
                                                z16 = z20;
                                                z17 = z21;
                                                i19 = i27;
                                                i18 = i28;
                                                i17 = 6;
                                                z15 = false;
                                            }
                                        } else if (i9 == 1) {
                                            i17 = 6;
                                            z15 = true;
                                            z16 = true;
                                            i18 = 4;
                                            i19 = 8;
                                            z17 = false;
                                        } else if (i9 == 3) {
                                            if (this.mResolvedDimensionRatioSide == -1) {
                                                i17 = z8 ? z2 ? 5 : 4 : 8;
                                                z15 = true;
                                                z16 = true;
                                                i18 = 5;
                                                i19 = 8;
                                            } else if (z6) {
                                                if (i6 == 2 || i6 == 1) {
                                                    i25 = 5;
                                                    i26 = 4;
                                                } else {
                                                    i25 = 8;
                                                    i26 = 5;
                                                }
                                                i19 = i25;
                                                i18 = i26;
                                                i17 = 6;
                                                z15 = true;
                                                z16 = true;
                                            } else {
                                                if (i12 > 0) {
                                                    i17 = 6;
                                                    z15 = true;
                                                    z16 = true;
                                                    i18 = 5;
                                                } else if (i12 != 0 || i14 != 0) {
                                                    i17 = 6;
                                                    z15 = true;
                                                    z16 = true;
                                                    i18 = 4;
                                                } else if (z8) {
                                                    i19 = (constraintWidget4 == parent || constraintWidget5 == parent) ? 5 : 4;
                                                    i17 = 6;
                                                    z15 = true;
                                                    z16 = true;
                                                    i18 = 4;
                                                } else {
                                                    i17 = 6;
                                                    z15 = true;
                                                    z16 = true;
                                                    i18 = 8;
                                                }
                                                i19 = 5;
                                            }
                                            z17 = true;
                                        } else {
                                            i17 = 6;
                                            z15 = false;
                                            z16 = false;
                                        }
                                        if (z15 || solverVariable4 != solverVariable6 || constraintWidget4 == parent) {
                                            z18 = z15;
                                            z19 = true;
                                        } else {
                                            z18 = false;
                                            z19 = false;
                                        }
                                        if (z16) {
                                            i20 = i9;
                                            constraintWidget = parent;
                                            constraintWidget2 = constraintWidget5;
                                            solverVariable11 = createObjectVariable3;
                                            i21 = 8;
                                        } else {
                                            i20 = i9;
                                            constraintWidget = parent;
                                            constraintWidget2 = constraintWidget5;
                                            i21 = 8;
                                            solverVariable11 = createObjectVariable3;
                                            linearSystem.addCentering(createObjectVariable3, solverVariable4, constraintAnchor.getMargin(), f, solverVariable6, solverVariable5, constraintAnchor2.getMargin(), this.mVisibility == 8 ? 4 : i17);
                                        }
                                        if (this.mVisibility != i21) {
                                            return;
                                        }
                                        if (z18) {
                                            int i37 = (!z2 || solverVariable4 == solverVariable6 || z12 || !((constraintWidget4 instanceof Barrier) || (constraintWidget2 instanceof Barrier))) ? i19 : 6;
                                            linearSystem3 = linearSystem;
                                            i22 = i21;
                                            solverVariable12 = solverVariable11;
                                            linearSystem3.addGreaterThan(solverVariable12, solverVariable4, constraintAnchor.getMargin(), i37);
                                            linearSystem3.addLowerThan(solverVariable5, solverVariable6, -constraintAnchor2.getMargin(), i37);
                                            i19 = i37;
                                        } else {
                                            linearSystem3 = linearSystem;
                                            i22 = i21;
                                            solverVariable12 = solverVariable11;
                                        }
                                        if (!z2 || !z9 || (constraintWidget4 instanceof Barrier) || (constraintWidget2 instanceof Barrier)) {
                                            i23 = i18;
                                            i24 = i19;
                                        } else {
                                            i23 = 6;
                                            i24 = 6;
                                            z19 = true;
                                        }
                                        if (z19) {
                                            if (!z17 || (z8 && !z3)) {
                                                constraintWidget3 = constraintWidget;
                                            } else {
                                                constraintWidget3 = constraintWidget;
                                                if (constraintWidget4 != constraintWidget3 && constraintWidget2 != constraintWidget3) {
                                                    i36 = i23;
                                                }
                                                if ((constraintWidget4 instanceof Guideline) || (constraintWidget2 instanceof Guideline)) {
                                                    i36 = 5;
                                                }
                                                if ((constraintWidget4 instanceof Barrier) || (constraintWidget2 instanceof Barrier)) {
                                                    i36 = 5;
                                                }
                                                i23 = Math.max(z8 ? 5 : i36, i23);
                                            }
                                            if (z2) {
                                                i23 = Math.min(i24, i23);
                                                if (z6 && !z8 && (constraintWidget4 == constraintWidget3 || constraintWidget2 == constraintWidget3)) {
                                                    i23 = 4;
                                                }
                                            }
                                            linearSystem3.addEquality(solverVariable12, solverVariable4, constraintAnchor.getMargin(), i23);
                                            linearSystem3.addEquality(solverVariable5, solverVariable6, -constraintAnchor2.getMargin(), i23);
                                        }
                                        if (z2) {
                                            int margin = solverVariable == solverVariable4 ? constraintAnchor.getMargin() : 0;
                                            if (solverVariable4 != solverVariable) {
                                                linearSystem3.addGreaterThan(solverVariable12, solverVariable, margin, 5);
                                            }
                                        }
                                        if (z2 && z12) {
                                            solverVariable13 = solverVariable5;
                                            if (i3 == 0 && i14 == 0) {
                                                if (z12 && i20 == 3) {
                                                    linearSystem3.addGreaterThan(solverVariable13, solverVariable12, 0, i22);
                                                } else {
                                                    linearSystem3.addGreaterThan(solverVariable13, solverVariable12, 0, 5);
                                                }
                                            }
                                            if (z2 && z13) {
                                                if (constraintAnchor2.mTarget != null) {
                                                    i29 = constraintAnchor2.getMargin();
                                                    solverVariable14 = solverVariable2;
                                                } else {
                                                    solverVariable14 = solverVariable2;
                                                    i29 = 0;
                                                }
                                                if (solverVariable6 != solverVariable14) {
                                                    linearSystem3.addGreaterThan(solverVariable14, solverVariable13, i29, 5);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        solverVariable13 = solverVariable5;
                                        if (z2) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    i17 = 6;
                                    z15 = true;
                                    z16 = true;
                                    i18 = 4;
                                    i19 = 5;
                                    z17 = false;
                                    if (z15) {
                                    }
                                    z18 = z15;
                                    z19 = true;
                                    if (z16) {
                                    }
                                    if (this.mVisibility != i21) {
                                    }
                                }
                            }
                            linearSystem3 = linearSystem;
                            solverVariable13 = solverVariable5;
                            if (z2) {
                            }
                        }
                        if (i16 >= 2 && z2 && z13) {
                            linearSystem2.addGreaterThan(solverVariable9, solverVariable7, 0, i15);
                            boolean z22 = z || this.mBaseline.mTarget == null;
                            if (z || this.mBaseline.mTarget == null) {
                                z14 = z22;
                            } else {
                                ConstraintWidget constraintWidget6 = this.mBaseline.mTarget.mOwner;
                                z14 = constraintWidget6.mDimensionRatio != 0.0f && constraintWidget6.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget6.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
                            }
                            if (z14) {
                                linearSystem2.addGreaterThan(solverVariable8, solverVariable10, 0, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (z2) {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, 8);
                    } else if (z7) {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, 5);
                        linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i10, 8);
                    } else {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, 5);
                        linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i10, 8);
                    }
                    solverVariable4 = createObjectVariable5;
                    solverVariable5 = createObjectVariable4;
                    i14 = i33;
                }
                z12 = z11;
                solverVariable6 = solverVariable3;
                z13 = z4;
                i13 = i30;
                if (z10) {
                }
                if (i16 >= 2) {
                }
            }
        }
        z11 = false;
        if (this.mVisibility != 8) {
        }
        if (z10) {
        }
        if (z11) {
        }
        z12 = z11;
        solverVariable6 = solverVariable3;
        z13 = z4;
        i13 = i30;
        if (z10) {
        }
        if (i16 >= 2) {
        }
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem) {
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (this.horizontalRun.start.resolved && this.horizontalRun.end.resolved) {
            objectVariableValue = this.horizontalRun.start.value;
            objectVariableValue3 = this.horizontalRun.end.value;
        }
        if (this.verticalRun.start.resolved && this.verticalRun.end.resolved) {
            objectVariableValue2 = this.verticalRun.start.value;
            objectVariableValue4 = this.verticalRun.end.value;
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

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
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
        this.mParent = this.mParent == null ? null : hashMap.get(constraintWidget.mParent);
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
        this.mOptimizerMeasurable = constraintWidget.mOptimizerMeasurable;
        this.mGroupsToSolver = constraintWidget.mGroupsToSolver;
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
        this.mHorizontalNextWidget = constraintWidget2 == null ? null : hashMap.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget3 != null ? hashMap.get(constraintWidget3) : null;
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean isResolved = z & this.horizontalRun.isResolved();
        boolean isResolved2 = z2 & this.verticalRun.isResolved();
        int i3 = this.horizontalRun.start.value;
        int i4 = this.verticalRun.start.value;
        int i5 = this.horizontalRun.end.value;
        int i6 = this.verticalRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
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
}
