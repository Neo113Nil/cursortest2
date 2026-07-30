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
import androidx.exifinterface.media.ExifInterface;
import cn.hutool.core.text.l;
import com.arthenica.ffmpegkit.x;
import com.baidu.ar.util.SystemInfoUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    private static final boolean DO_NOT_USE = false;
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
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    public WidgetFrame frame;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    private boolean mAnimated;
    public ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    public ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    public float mCircleConstraintAngle;
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
    private boolean mHasBaseline;
    int mHeight;
    private int mHeightOverride;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    public HorizontalWidgetRun mHorizontalRun;
    private boolean mHorizontalSolvingPass;
    boolean mHorizontalWrapVisited;
    private boolean mInPlaceholder;
    private boolean mInVirtualLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
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
    private boolean mMeasureRequested;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    private boolean mOptimizeWrapO;
    private boolean mOptimizeWrapOnResolved;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    private boolean mResolvedHorizontal;
    public int[] mResolvedMatchConstraintDefault;
    private boolean mResolvedVertical;
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
    public VerticalWidgetRun mVerticalRun;
    private boolean mVerticalSolvingPass;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    private int mWidthOverride;
    private int mWrapBehaviorInParent;
    protected int mX;
    protected int mY;
    public boolean measured;
    public WidgetRun[] run;
    public String stringId;
    public ChainRun verticalChainRun;
    public int verticalGroup;

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.mOptimizeWrapO = false;
        this.mOptimizeWrapOnResolved = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
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
        this.mCircleConstraintAngle = Float.NaN;
        this.mHasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
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
        float f8 = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f8;
        this.mVerticalBiasPercent = f8;
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

    /* JADX WARN: Removed duplicated region for block: B:110:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0447 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04e3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void applyConstraints(LinearSystem linearSystem, boolean z7, boolean z8, boolean z9, boolean z10, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z11, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i8, int i9, int i10, int i11, float f8, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i12, int i13, int i14, int i15, float f9, boolean z17) {
        int i16;
        SolverVariable solverVariable3;
        boolean z18;
        boolean z19;
        boolean z20;
        int i17;
        boolean z21;
        int i18;
        int i19;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        int i20;
        boolean z22;
        boolean z23;
        SolverVariable createObjectVariable;
        SolverVariable createObjectVariable2;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        int i21;
        SolverVariable solverVariable10;
        int i22;
        int i23;
        ConstraintAnchor constraintAnchor3;
        int i24;
        SolverVariable solverVariable11;
        SolverVariable solverVariable12;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        ConstraintWidget constraintWidget;
        SolverVariable solverVariable13;
        int i29;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariable14;
        boolean z28;
        SolverVariable solverVariable15;
        ConstraintWidget constraintWidget3;
        int i30;
        int i31;
        int i32;
        boolean z29;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z30;
        boolean z31;
        ConstraintWidget constraintWidget4;
        int i37;
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
        int i38 = isConnected2 ? (isConnected ? 1 : 0) + 1 : isConnected ? 1 : 0;
        if (isConnected3) {
            i38++;
        }
        if (z12) {
            solverVariable3 = createObjectVariable6;
            i16 = 3;
        } else {
            i16 = i12;
            solverVariable3 = createObjectVariable6;
        }
        int ordinal = dimensionBehaviour.ordinal();
        boolean z32 = (ordinal == 0 || ordinal == 1 || ordinal != 2 || i16 == 4) ? false : true;
        int i39 = this.mWidthOverride;
        if (i39 == -1 || !z7) {
            i39 = i9;
            z18 = z32;
        } else {
            this.mWidthOverride = -1;
            z18 = false;
        }
        int i40 = this.mHeightOverride;
        if (i40 == -1 || z7) {
            z19 = z18;
        } else {
            this.mHeightOverride = -1;
            i39 = i40;
            z19 = false;
        }
        int i41 = i39;
        if (this.mVisibility == 8) {
            i17 = 0;
            z20 = false;
        } else {
            z20 = z19;
            i17 = i41;
        }
        if (z17) {
            if (!isConnected && !isConnected2 && !isConnected3) {
                linearSystem.addEquality(createObjectVariable3, i8);
            } else if (isConnected && !isConnected2) {
                z21 = isConnected2;
                linearSystem.addEquality(createObjectVariable3, createObjectVariable5, constraintAnchor.getMargin(), 8);
                if (z20) {
                    if (z11) {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, 0, 3);
                        if (i10 > 0) {
                            linearSystem.addGreaterThan(createObjectVariable4, createObjectVariable3, i10, 8);
                        }
                        if (i11 < Integer.MAX_VALUE) {
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i11, 8);
                        }
                    } else {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i17, 8);
                    }
                    z23 = z10;
                    i20 = i14;
                    i18 = i15;
                    i19 = i38;
                    solverVariable6 = createObjectVariable5;
                    solverVariable4 = createObjectVariable4;
                    z22 = z20;
                    solverVariable5 = solverVariable3;
                } else if (i38 == 2 || z12 || !(i16 == 1 || i16 == 0)) {
                    int i42 = i14 == -2 ? i17 : i14;
                    i18 = i15 == -2 ? i17 : i15;
                    if (i17 > 0 && i16 != 1) {
                        i17 = 0;
                    }
                    if (i42 > 0) {
                        linearSystem.addGreaterThan(createObjectVariable4, createObjectVariable3, i42, 8);
                        i17 = Math.max(i17, i42);
                    }
                    if (i18 > 0) {
                        if (!z8 || i16 != 1) {
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i18, 8);
                        }
                        i17 = Math.min(i17, i18);
                    }
                    if (i16 == 1) {
                        if (z8) {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i17, 8);
                        } else if (z14) {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i17, 5);
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i17, 8);
                        } else {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i17, 5);
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i17, 8);
                        }
                        z23 = z10;
                        i19 = i38;
                        solverVariable4 = createObjectVariable4;
                        z22 = z20;
                        i20 = i42;
                        solverVariable5 = solverVariable3;
                        solverVariable6 = createObjectVariable5;
                    } else if (i16 == 2) {
                        ConstraintAnchor.Type type = constraintAnchor.getType();
                        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
                        if (type == type2 || constraintAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                            createObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(type2));
                            createObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                        } else {
                            createObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                            createObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
                        }
                        boolean z33 = z20;
                        solverVariable5 = solverVariable3;
                        int i43 = i42;
                        solverVariable6 = createObjectVariable5;
                        i19 = i38;
                        solverVariable4 = createObjectVariable4;
                        linearSystem.addConstraint(linearSystem.createRow().createRowDimensionRatio(createObjectVariable4, createObjectVariable3, createObjectVariable2, createObjectVariable, f9));
                        if (z8) {
                            z33 = false;
                        }
                        i20 = i43;
                        z22 = z33;
                        z23 = z10;
                    } else {
                        i19 = i38;
                        solverVariable4 = createObjectVariable4;
                        boolean z34 = z20;
                        int i44 = i42;
                        solverVariable5 = solverVariable3;
                        solverVariable6 = createObjectVariable5;
                        i20 = i44;
                        z22 = z34;
                        z23 = true;
                    }
                } else {
                    int max = Math.max(i14, i17);
                    if (i15 > 0) {
                        max = Math.min(i15, max);
                    }
                    linearSystem.addEquality(createObjectVariable4, createObjectVariable3, max, 8);
                    z23 = z10;
                    i20 = i14;
                    i18 = i15;
                    i19 = i38;
                    solverVariable6 = createObjectVariable5;
                    solverVariable4 = createObjectVariable4;
                    solverVariable5 = solverVariable3;
                    z22 = false;
                }
                if (z17) {
                    solverVariable7 = solverVariable;
                    solverVariable8 = solverVariable2;
                    solverVariable9 = solverVariable4;
                    i21 = 0;
                    solverVariable10 = createObjectVariable3;
                    i22 = i19;
                    i23 = 2;
                } else if (z14) {
                    solverVariable7 = solverVariable;
                    solverVariable8 = solverVariable2;
                    solverVariable9 = solverVariable4;
                    i22 = i19;
                    i21 = 0;
                    i23 = 2;
                    solverVariable10 = createObjectVariable3;
                } else {
                    if (isConnected || z21 || isConnected3) {
                        if (isConnected && !z21) {
                            i37 = (z8 && (constraintAnchor.mTarget.mOwner instanceof Barrier)) ? 8 : 5;
                            z28 = z8;
                            solverVariable15 = solverVariable4;
                            i31 = 0;
                            if (z28) {
                            }
                        } else if (!isConnected && z21) {
                            linearSystem.addEquality(solverVariable4, solverVariable5, -constraintAnchor2.getMargin(), 8);
                            if (z8) {
                                if (this.mOptimizeWrapO && createObjectVariable3.isFinalValue && (constraintWidget4 = this.mParent) != null) {
                                    ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget4;
                                    if (z7) {
                                        constraintWidgetContainer.addHorizontalWrapMinVariable(constraintAnchor);
                                    } else {
                                        constraintWidgetContainer.addVerticalWrapMinVariable(constraintAnchor);
                                    }
                                } else {
                                    linearSystem.addGreaterThan(createObjectVariable3, solverVariable, 0, 5);
                                    solverVariable15 = solverVariable4;
                                    i31 = 0;
                                    z28 = z8;
                                    i37 = 5;
                                    if (z28) {
                                    }
                                }
                            }
                        } else if (isConnected && z21) {
                            ConstraintWidget constraintWidget6 = constraintAnchor.mTarget.mOwner;
                            ConstraintWidget constraintWidget7 = constraintAnchor2.mTarget.mOwner;
                            ConstraintWidget parent = getParent();
                            int i45 = 6;
                            if (z22) {
                                if (i16 == 0) {
                                    if (i18 != 0 || i20 != 0) {
                                        i34 = 5;
                                        i36 = 5;
                                        z30 = true;
                                        z31 = false;
                                        z24 = true;
                                    } else if (solverVariable6.isFinalValue && solverVariable5.isFinalValue) {
                                        linearSystem.addEquality(createObjectVariable3, solverVariable6, constraintAnchor.getMargin(), 8);
                                        linearSystem.addEquality(solverVariable4, solverVariable5, -constraintAnchor2.getMargin(), 8);
                                        return;
                                    } else {
                                        i34 = 8;
                                        i36 = 8;
                                        z30 = false;
                                        z31 = true;
                                        z24 = false;
                                    }
                                    if ((constraintWidget6 instanceof Barrier) || (constraintWidget7 instanceof Barrier)) {
                                        solverVariable11 = solverVariable2;
                                        i24 = i16;
                                        z26 = z31;
                                        i26 = i34;
                                        z25 = z30;
                                        i27 = 6;
                                        i28 = 4;
                                        if (z24 || solverVariable6 != solverVariable5 || constraintWidget6 == parent) {
                                            z27 = true;
                                        } else {
                                            z24 = false;
                                            z27 = false;
                                        }
                                        if (z25) {
                                            constraintWidget = constraintWidget7;
                                            solverVariable13 = solverVariable4;
                                            i29 = i24;
                                            constraintWidget2 = parent;
                                            solverVariable14 = createObjectVariable3;
                                            z28 = z8;
                                        } else {
                                            if (z22 || z13 || z15 || solverVariable6 != solverVariable || solverVariable5 != solverVariable11) {
                                                z28 = z8;
                                                i32 = i27;
                                                z29 = z27;
                                                i33 = i26;
                                            } else {
                                                z28 = false;
                                                i33 = 8;
                                                i32 = 8;
                                                z29 = false;
                                            }
                                            i29 = i24;
                                            constraintWidget2 = parent;
                                            constraintWidget = constraintWidget7;
                                            SolverVariable solverVariable16 = solverVariable4;
                                            solverVariable13 = solverVariable4;
                                            solverVariable14 = createObjectVariable3;
                                            linearSystem.addCentering(createObjectVariable3, solverVariable6, constraintAnchor.getMargin(), f8, solverVariable5, solverVariable16, constraintAnchor2.getMargin(), i32);
                                            i26 = i33;
                                            z27 = z29;
                                        }
                                        if (this.mVisibility != 8 && !constraintAnchor2.hasDependents()) {
                                            return;
                                        }
                                        if (z24) {
                                            solverVariable15 = solverVariable13;
                                        } else {
                                            if (z28 && solverVariable6 != solverVariable5 && !z22 && ((constraintWidget6 instanceof Barrier) || (constraintWidget instanceof Barrier))) {
                                                i26 = 6;
                                            }
                                            linearSystem.addGreaterThan(solverVariable14, solverVariable6, constraintAnchor.getMargin(), i26);
                                            solverVariable15 = solverVariable13;
                                            linearSystem.addLowerThan(solverVariable15, solverVariable5, -constraintAnchor2.getMargin(), i26);
                                        }
                                        if (z28 || !z16 || (constraintWidget6 instanceof Barrier) || (constraintWidget instanceof Barrier)) {
                                            constraintWidget3 = constraintWidget2;
                                        } else {
                                            constraintWidget3 = constraintWidget2;
                                            if (constraintWidget != constraintWidget3) {
                                                i26 = 6;
                                                i30 = 6;
                                                z27 = true;
                                                if (z27) {
                                                    if (z26 && (!z15 || z9)) {
                                                        if (constraintWidget6 != constraintWidget3 && constraintWidget != constraintWidget3) {
                                                            i45 = i30;
                                                        }
                                                        if ((constraintWidget6 instanceof Guideline) || (constraintWidget instanceof Guideline)) {
                                                            i45 = 5;
                                                        }
                                                        if ((constraintWidget6 instanceof Barrier) || (constraintWidget instanceof Barrier)) {
                                                            i45 = 5;
                                                        }
                                                        i30 = Math.max(z15 ? 5 : i45, i30);
                                                    }
                                                    if (z28) {
                                                        i30 = (z12 && !z15 && (constraintWidget6 == constraintWidget3 || constraintWidget == constraintWidget3)) ? 4 : Math.min(i26, i30);
                                                    }
                                                    linearSystem.addEquality(solverVariable14, solverVariable6, constraintAnchor.getMargin(), i30);
                                                    linearSystem.addEquality(solverVariable15, solverVariable5, -constraintAnchor2.getMargin(), i30);
                                                }
                                                if (z28) {
                                                    int margin = solverVariable == solverVariable6 ? constraintAnchor.getMargin() : 0;
                                                    if (solverVariable6 != solverVariable) {
                                                        linearSystem.addGreaterThan(solverVariable14, solverVariable, margin, 5);
                                                    }
                                                }
                                                if (z28 || !z22 || i10 != 0 || i20 != 0) {
                                                    i31 = 0;
                                                } else if (z22 && i29 == 3) {
                                                    i31 = 0;
                                                    linearSystem.addGreaterThan(solverVariable15, solverVariable14, 0, 8);
                                                } else {
                                                    i31 = 0;
                                                    linearSystem.addGreaterThan(solverVariable15, solverVariable14, 0, 5);
                                                }
                                            }
                                        }
                                        i30 = i28;
                                        if (z27) {
                                        }
                                        if (z28) {
                                        }
                                        if (z28) {
                                        }
                                        i31 = 0;
                                    } else {
                                        solverVariable11 = solverVariable2;
                                        z26 = z31;
                                        z25 = z30;
                                        i28 = i36;
                                        i24 = i16;
                                        i26 = i34;
                                        i27 = 6;
                                        if (z24) {
                                        }
                                        z27 = true;
                                        if (z25) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z24) {
                                        }
                                        if (z28) {
                                        }
                                        constraintWidget3 = constraintWidget2;
                                        i30 = i28;
                                        if (z27) {
                                        }
                                        if (z28) {
                                        }
                                        if (z28) {
                                        }
                                        i31 = 0;
                                    }
                                } else if (i16 == 2) {
                                    if ((constraintWidget6 instanceof Barrier) || (constraintWidget7 instanceof Barrier)) {
                                        solverVariable11 = solverVariable2;
                                        i24 = i16;
                                    } else {
                                        solverVariable11 = solverVariable2;
                                        i24 = i16;
                                        i27 = 6;
                                        i26 = 5;
                                        i28 = 5;
                                        z25 = true;
                                        z24 = true;
                                        z26 = false;
                                        if (z24) {
                                        }
                                        z27 = true;
                                        if (z25) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z24) {
                                        }
                                        if (z28) {
                                        }
                                        constraintWidget3 = constraintWidget2;
                                        i30 = i28;
                                        if (z27) {
                                        }
                                        if (z28) {
                                        }
                                        if (z28) {
                                        }
                                        i31 = 0;
                                    }
                                } else if (i16 == 1) {
                                    solverVariable11 = solverVariable2;
                                    i24 = i16;
                                    i27 = 6;
                                    i26 = 8;
                                    i28 = 4;
                                    z25 = true;
                                    z24 = true;
                                    z26 = false;
                                    if (z24) {
                                    }
                                    z27 = true;
                                    if (z25) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z24) {
                                    }
                                    if (z28) {
                                    }
                                    constraintWidget3 = constraintWidget2;
                                    i30 = i28;
                                    if (z27) {
                                    }
                                    if (z28) {
                                    }
                                    if (z28) {
                                    }
                                    i31 = 0;
                                } else if (i16 == 3) {
                                    i24 = i16;
                                    if (this.mResolvedDimensionRatioSide == -1) {
                                        if (z15) {
                                            solverVariable11 = solverVariable2;
                                            i27 = z8 ? 5 : 4;
                                        } else {
                                            solverVariable11 = solverVariable2;
                                            i27 = 8;
                                        }
                                        i26 = 8;
                                    } else if (z12) {
                                        if (i13 == 2 || i13 == 1) {
                                            i34 = 5;
                                            i35 = 4;
                                        } else {
                                            i34 = 8;
                                            i35 = 5;
                                        }
                                        solverVariable11 = solverVariable2;
                                        i28 = i35;
                                        z25 = true;
                                        z24 = true;
                                        z26 = true;
                                        i26 = i34;
                                        i27 = 6;
                                        if (z24) {
                                        }
                                        z27 = true;
                                        if (z25) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z24) {
                                        }
                                        if (z28) {
                                        }
                                        constraintWidget3 = constraintWidget2;
                                        i30 = i28;
                                        if (z27) {
                                        }
                                        if (z28) {
                                        }
                                        if (z28) {
                                        }
                                        i31 = 0;
                                    } else if (i18 > 0) {
                                        solverVariable11 = solverVariable2;
                                        i27 = 6;
                                        i26 = 5;
                                    } else {
                                        if (i18 != 0 || i20 != 0) {
                                            solverVariable11 = solverVariable2;
                                            i27 = 6;
                                            i26 = 5;
                                        } else if (z15) {
                                            solverVariable11 = solverVariable2;
                                            i26 = (constraintWidget6 == parent || constraintWidget7 == parent) ? 5 : 4;
                                            i27 = 6;
                                        } else {
                                            solverVariable11 = solverVariable2;
                                            i27 = 6;
                                            i26 = 5;
                                            i28 = 8;
                                            z25 = true;
                                            z24 = true;
                                            z26 = true;
                                            if (z24) {
                                            }
                                            z27 = true;
                                            if (z25) {
                                            }
                                            if (this.mVisibility != 8) {
                                            }
                                            if (z24) {
                                            }
                                            if (z28) {
                                            }
                                            constraintWidget3 = constraintWidget2;
                                            i30 = i28;
                                            if (z27) {
                                            }
                                            if (z28) {
                                            }
                                            if (z28) {
                                            }
                                            i31 = 0;
                                        }
                                        i28 = 4;
                                        z25 = true;
                                        z24 = true;
                                        z26 = true;
                                        if (z24) {
                                        }
                                        z27 = true;
                                        if (z25) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z24) {
                                        }
                                        if (z28) {
                                        }
                                        constraintWidget3 = constraintWidget2;
                                        i30 = i28;
                                        if (z27) {
                                        }
                                        if (z28) {
                                        }
                                        if (z28) {
                                        }
                                        i31 = 0;
                                    }
                                    i28 = 5;
                                    z25 = true;
                                    z24 = true;
                                    z26 = true;
                                    if (z24) {
                                    }
                                    z27 = true;
                                    if (z25) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z24) {
                                    }
                                    if (z28) {
                                    }
                                    constraintWidget3 = constraintWidget2;
                                    i30 = i28;
                                    if (z27) {
                                    }
                                    if (z28) {
                                    }
                                    if (z28) {
                                    }
                                    i31 = 0;
                                } else {
                                    i24 = i16;
                                    solverVariable11 = solverVariable2;
                                    i27 = 6;
                                    i26 = 5;
                                    i28 = 4;
                                    z25 = false;
                                    z24 = false;
                                    z26 = false;
                                    if (z24) {
                                    }
                                    z27 = true;
                                    if (z25) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z24) {
                                    }
                                    if (z28) {
                                    }
                                    constraintWidget3 = constraintWidget2;
                                    i30 = i28;
                                    if (z27) {
                                    }
                                    if (z28) {
                                    }
                                    if (z28) {
                                    }
                                    i31 = 0;
                                }
                                i37 = 5;
                                if (z28 && z23) {
                                    if (constraintAnchor2.mTarget != null) {
                                        i31 = constraintAnchor2.getMargin();
                                    }
                                    if (solverVariable5 != solverVariable2) {
                                        if (!this.mOptimizeWrapO || !solverVariable15.isFinalValue || (constraintWidget5 = this.mParent) == null) {
                                            linearSystem.addGreaterThan(solverVariable2, solverVariable15, i31, i37);
                                            return;
                                        }
                                        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget5;
                                        if (z7) {
                                            constraintWidgetContainer2.addHorizontalWrapMaxVariable(constraintAnchor2);
                                            return;
                                        } else {
                                            constraintWidgetContainer2.addVerticalWrapMaxVariable(constraintAnchor2);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            i24 = i16;
                            if (solverVariable6.isFinalValue && solverVariable5.isFinalValue) {
                                linearSystem.addCentering(createObjectVariable3, solverVariable6, constraintAnchor.getMargin(), f8, solverVariable5, solverVariable4, constraintAnchor2.getMargin(), 8);
                                if (z8 && z23) {
                                    if (constraintAnchor2.mTarget != null) {
                                        i25 = constraintAnchor2.getMargin();
                                        solverVariable12 = solverVariable2;
                                    } else {
                                        solverVariable12 = solverVariable2;
                                        i25 = 0;
                                    }
                                    if (solverVariable5 != solverVariable12) {
                                        linearSystem.addGreaterThan(solverVariable12, solverVariable4, i25, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            solverVariable11 = solverVariable2;
                            i27 = 6;
                            i26 = 5;
                            i28 = 4;
                            z25 = true;
                            z24 = true;
                            z26 = false;
                            if (z24) {
                            }
                            z27 = true;
                            if (z25) {
                            }
                            if (this.mVisibility != 8) {
                            }
                            if (z24) {
                            }
                            if (z28) {
                            }
                            constraintWidget3 = constraintWidget2;
                            i30 = i28;
                            if (z27) {
                            }
                            if (z28) {
                            }
                            if (z28) {
                            }
                            i31 = 0;
                            i37 = 5;
                            if (z28) {
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    solverVariable15 = solverVariable4;
                    i31 = 0;
                    z28 = z8;
                    i37 = 5;
                    if (z28) {
                    }
                }
                if (i22 >= i23 && z8 && z23) {
                    linearSystem.addGreaterThan(solverVariable10, solverVariable7, i21, 8);
                    boolean z35 = z7 || this.mBaseline.mTarget == null;
                    if (!z7 && (constraintAnchor3 = this.mBaseline.mTarget) != null) {
                        ConstraintWidget constraintWidget8 = constraintAnchor3.mOwner;
                        if (constraintWidget8.mDimensionRatio == 0.0f) {
                            return;
                        }
                        DimensionBehaviour[] dimensionBehaviourArr = constraintWidget8.mListDimensionBehaviors;
                        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[i21];
                        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour2 != dimensionBehaviour3 || dimensionBehaviourArr[1] != dimensionBehaviour3) {
                            return;
                        }
                    } else if (!z35) {
                        return;
                    }
                    linearSystem.addGreaterThan(solverVariable8, solverVariable9, i21, 8);
                    return;
                }
                return;
            }
        }
        z21 = isConnected2;
        if (z20) {
        }
        if (z17) {
        }
        if (i22 >= i23) {
        }
    }

    private boolean isChainHead(int i8) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i9 = i8 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i9];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return (constraintAnchor4 == null || constraintAnchor4.mTarget == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i9 + 1]).mTarget) == null || constraintAnchor2.mTarget != constraintAnchor) ? false : true;
    }

    private void serializeAnchor(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(constraintAnchor.mGoneMargin);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(" ] ,\n");
    }

    private void serializeAttribute(StringBuilder sb, String str, float f8, float f9) {
        if (f8 == f9) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f8);
        sb.append(",\n");
    }

    private void serializeCircle(StringBuilder sb, ConstraintAnchor constraintAnchor, float f8) {
        if (constraintAnchor.mTarget == null || Float.isNaN(f8)) {
            return;
        }
        sb.append("circle : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f8);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(" ] ,\n");
    }

    private void serializeDimensionRatio(StringBuilder sb, String str, float f8, int i8) {
        if (f8 == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f8);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(i8);
        sb.append("");
        sb.append("],\n");
    }

    private void serializeSize(StringBuilder sb, String str, int i8, int i9, int i10, int i11, int i12, int i13, float f8, float f9) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "size", i8, Integer.MIN_VALUE);
        serializeAttribute(sb, "min", i9, 0);
        serializeAttribute(sb, "max", i10, Integer.MAX_VALUE);
        serializeAttribute(sb, "matchMin", i12, 0);
        serializeAttribute(sb, "matchDef", i13, 0);
        serializeAttribute(sb, "matchPercent", i13, 1);
        serializeAttribute(sb, "matchConstraintPercent", f8, 1.0f);
        serializeAttribute(sb, "weight", f9, 1.0f);
        serializeAttribute(sb, "override", i11, 1);
        sb.append("},\n");
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i8, boolean z7) {
        if (z7) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.checkMatchParent(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
        }
        if (i8 == 0) {
            HashSet<ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i8, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i8, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i8, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i8, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i8, true);
            }
        }
    }

    boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addToSolver(LinearSystem linearSystem, boolean z7) {
        boolean z8;
        boolean z9;
        boolean z10;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        Metrics metrics;
        boolean z11;
        boolean z12;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f8;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z13;
        int i20;
        boolean z14;
        DimensionBehaviour dimensionBehaviour;
        boolean z15;
        int i21;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        DimensionBehaviour dimensionBehaviour2;
        DimensionBehaviour dimensionBehaviour3;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        boolean z20;
        LinearSystem linearSystem2;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        int i22;
        int i23;
        char c8;
        boolean z21;
        SolverVariable solverVariable9;
        SolverVariable solverVariable10;
        ConstraintWidget constraintWidget3;
        Metrics metrics2;
        boolean z22;
        ConstraintAnchor constraintAnchor;
        boolean z23;
        VerticalWidgetRun verticalWidgetRun;
        DependencyNode dependencyNode;
        ConstraintWidget constraintWidget4;
        HorizontalWidgetRun horizontalWidgetRun;
        DependencyNode dependencyNode2;
        int i24;
        int i25;
        boolean isInHorizontalChain;
        boolean isInVerticalChain;
        HorizontalWidgetRun horizontalWidgetRun2;
        VerticalWidgetRun verticalWidgetRun2;
        DependencyNode dependencyNode3;
        boolean[] zArr;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
        ConstraintWidget constraintWidget5 = this.mParent;
        if (constraintWidget5 != null) {
            boolean z24 = constraintWidget5 != null && constraintWidget5.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            boolean z25 = constraintWidget5 != null && constraintWidget5.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            int i26 = this.mWrapBehaviorInParent;
            if (i26 != 1) {
                if (i26 == 2) {
                    z9 = z25;
                    z8 = false;
                } else if (i26 != 3) {
                    z9 = z25;
                    z8 = z24;
                }
                if (this.mVisibility == 8 && !this.mAnimated && !hasDependencies()) {
                    zArr = this.mIsInBarrier;
                    if (!zArr[0] && !zArr[1]) {
                        return;
                    }
                }
                z10 = this.mResolvedHorizontal;
                if (!z10 || this.mResolvedVertical) {
                    if (z10) {
                        linearSystem.addEquality(createObjectVariable, this.mX);
                        linearSystem.addEquality(createObjectVariable2, this.mX + this.mWidth);
                        if (z8 && (constraintWidget2 = this.mParent) != null) {
                            if (this.mOptimizeWrapOnResolved) {
                                ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                                constraintWidgetContainer.addHorizontalWrapMinVariable(this.mLeft);
                                constraintWidgetContainer.addHorizontalWrapMaxVariable(this.mRight);
                            } else {
                                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mRight), createObjectVariable2, 0, 5);
                            }
                        }
                    }
                    if (this.mResolvedVertical) {
                        linearSystem.addEquality(createObjectVariable3, this.mY);
                        linearSystem.addEquality(createObjectVariable4, this.mY + this.mHeight);
                        if (this.mBaseline.hasDependents()) {
                            linearSystem.addEquality(createObjectVariable5, this.mY + this.mBaselineDistance);
                        }
                        if (z9 && (constraintWidget = this.mParent) != null) {
                            if (this.mOptimizeWrapOnResolved) {
                                ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget;
                                constraintWidgetContainer2.addVerticalWrapMinVariable(this.mTop);
                                constraintWidgetContainer2.addVerticalWrapMaxVariable(this.mBottom);
                            } else {
                                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mBottom), createObjectVariable4, 0, 5);
                            }
                        }
                    }
                    if (this.mResolvedHorizontal && this.mResolvedVertical) {
                        this.mResolvedHorizontal = false;
                        this.mResolvedVertical = false;
                        return;
                    }
                }
                metrics = LinearSystem.sMetrics;
                if (metrics != null) {
                    metrics.widgets++;
                }
                if (z7 && (horizontalWidgetRun2 = this.mHorizontalRun) != null && (verticalWidgetRun2 = this.mVerticalRun) != null) {
                    dependencyNode3 = horizontalWidgetRun2.start;
                    if (dependencyNode3.resolved && horizontalWidgetRun2.end.resolved && verticalWidgetRun2.start.resolved && verticalWidgetRun2.end.resolved) {
                        if (metrics != null) {
                            metrics.graphSolved++;
                        }
                        linearSystem.addEquality(createObjectVariable, dependencyNode3.value);
                        linearSystem.addEquality(createObjectVariable2, this.mHorizontalRun.end.value);
                        linearSystem.addEquality(createObjectVariable3, this.mVerticalRun.start.value);
                        linearSystem.addEquality(createObjectVariable4, this.mVerticalRun.end.value);
                        linearSystem.addEquality(createObjectVariable5, this.mVerticalRun.baseline.value);
                        if (this.mParent != null) {
                            if (z8 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                                linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                            }
                            if (z9 && this.isTerminalWidget[1] && !isInVerticalChain()) {
                                linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 8);
                            }
                        }
                        this.mResolvedHorizontal = false;
                        this.mResolvedVertical = false;
                        return;
                    }
                }
                if (metrics != null) {
                    metrics.linearSolved++;
                }
                if (this.mParent != null) {
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
                    if (!isInHorizontalChain && z8 && this.mVisibility != 8 && this.mLeft.mTarget == null && this.mRight.mTarget == null) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 1);
                    }
                    if (!isInVerticalChain && z9 && this.mVisibility != 8 && this.mTop.mTarget == null && this.mBottom.mTarget == null && this.mBaseline == null) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 1);
                    }
                    z12 = isInHorizontalChain;
                    z11 = isInVerticalChain;
                } else {
                    z11 = false;
                    z12 = false;
                }
                i8 = this.mWidth;
                i9 = this.mMinWidth;
                if (i8 >= i9) {
                    i9 = i8;
                }
                i10 = this.mHeight;
                i11 = this.mMinHeight;
                if (i10 >= i11) {
                    i11 = i10;
                }
                DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
                DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
                DimensionBehaviour dimensionBehaviour5 = DimensionBehaviour.MATCH_CONSTRAINT;
                i12 = i9;
                boolean z26 = dimensionBehaviour4 != dimensionBehaviour5;
                DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
                i13 = i11;
                boolean z27 = dimensionBehaviour6 != dimensionBehaviour5;
                int i27 = this.mDimensionRatioSide;
                this.mResolvedDimensionRatioSide = i27;
                f8 = this.mDimensionRatio;
                this.mResolvedDimensionRatio = f8;
                i14 = this.mMatchConstraintDefaultWidth;
                i15 = this.mMatchConstraintDefaultHeight;
                if (f8 > 0.0f || this.mVisibility == 8) {
                    i16 = i14;
                    i17 = i15;
                    i18 = i12;
                    i19 = i13;
                    z13 = false;
                } else {
                    if (dimensionBehaviour4 == dimensionBehaviour5 && i14 == 0) {
                        i14 = 3;
                    }
                    if (dimensionBehaviour6 == dimensionBehaviour5 && i15 == 0) {
                        i15 = 3;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour5 && dimensionBehaviour6 == dimensionBehaviour5) {
                        i25 = 3;
                        if (i14 == 3 && i15 == 3) {
                            setupDimensionRatio(z8, z9, z26, z27);
                            i16 = i14;
                            i17 = i15;
                            i18 = i12;
                            i19 = i13;
                            z13 = true;
                        }
                    } else {
                        i25 = 3;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour5 && i14 == i25) {
                        this.mResolvedDimensionRatioSide = 0;
                        i18 = (int) (f8 * i10);
                        if (dimensionBehaviour6 != dimensionBehaviour5) {
                            i17 = i15;
                            i19 = i13;
                            z13 = false;
                            i16 = 4;
                        } else {
                            i16 = i14;
                            i17 = i15;
                            i19 = i13;
                            z13 = true;
                        }
                    } else {
                        if (dimensionBehaviour6 == dimensionBehaviour5 && i15 == i25) {
                            this.mResolvedDimensionRatioSide = 1;
                            if (i27 == -1) {
                                this.mResolvedDimensionRatio = 1.0f / f8;
                            }
                            i19 = (int) (this.mResolvedDimensionRatio * i8);
                            i16 = i14;
                            if (dimensionBehaviour4 != dimensionBehaviour5) {
                                i18 = i12;
                                z13 = false;
                                i17 = 4;
                            } else {
                                i17 = i15;
                                i18 = i12;
                                z13 = true;
                            }
                        }
                        i16 = i14;
                        i17 = i15;
                        i18 = i12;
                        i19 = i13;
                        z13 = true;
                    }
                }
                int[] iArr = this.mResolvedMatchConstraintDefault;
                iArr[0] = i16;
                iArr[1] = i17;
                this.mResolvedHasRatio = z13;
                if (z13) {
                    int i28 = this.mResolvedDimensionRatioSide;
                    i20 = -1;
                    if (i28 == 0 || i28 == -1) {
                        z14 = true;
                        boolean z28 = !z13 && ((i24 = this.mResolvedDimensionRatioSide) == 1 || i24 == i20);
                        DimensionBehaviour dimensionBehaviour7 = this.mListDimensionBehaviors[0];
                        dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                        z15 = dimensionBehaviour7 != dimensionBehaviour && (this instanceof ConstraintWidgetContainer);
                        i21 = !z15 ? 0 : i18;
                        z16 = !this.mCenter.isConnected();
                        boolean[] zArr2 = this.mIsInBarrier;
                        z17 = zArr2[0];
                        boolean z29 = zArr2[1];
                        if (this.mHorizontalResolution != 2 && !this.mResolvedHorizontal) {
                            if (z7 && (horizontalWidgetRun = this.mHorizontalRun) != null) {
                                dependencyNode2 = horizontalWidgetRun.start;
                                if (dependencyNode2.resolved && horizontalWidgetRun.end.resolved) {
                                    if (!z7) {
                                        linearSystem.addEquality(createObjectVariable, dependencyNode2.value);
                                        linearSystem.addEquality(createObjectVariable2, this.mHorizontalRun.end.value);
                                        if (this.mParent != null && z8 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                                        }
                                        z18 = z8;
                                        z19 = z9;
                                        dimensionBehaviour2 = dimensionBehaviour5;
                                        dimensionBehaviour3 = dimensionBehaviour;
                                        z20 = z13;
                                        solverVariable = createObjectVariable5;
                                        solverVariable2 = createObjectVariable4;
                                        solverVariable3 = createObjectVariable3;
                                        solverVariable4 = createObjectVariable2;
                                        solverVariable5 = createObjectVariable;
                                        if (z7 && (verticalWidgetRun = this.mVerticalRun) != null) {
                                            dependencyNode = verticalWidgetRun.start;
                                            if (dependencyNode.resolved && verticalWidgetRun.end.resolved) {
                                                linearSystem2 = linearSystem;
                                                solverVariable8 = solverVariable3;
                                                linearSystem2.addEquality(solverVariable8, dependencyNode.value);
                                                solverVariable7 = solverVariable2;
                                                linearSystem2.addEquality(solverVariable7, this.mVerticalRun.end.value);
                                                solverVariable6 = solverVariable;
                                                linearSystem2.addEquality(solverVariable6, this.mVerticalRun.baseline.value);
                                                constraintWidget4 = this.mParent;
                                                if (constraintWidget4 == null && !z11 && z19) {
                                                    c8 = 1;
                                                    if (this.isTerminalWidget[1]) {
                                                        i22 = 8;
                                                        i23 = 0;
                                                        linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(constraintWidget4.mBottom), solverVariable7, 0, 8);
                                                    } else {
                                                        i22 = 8;
                                                        i23 = 0;
                                                    }
                                                } else {
                                                    i22 = 8;
                                                    i23 = 0;
                                                    c8 = 1;
                                                }
                                                z21 = false;
                                                if (this.mVerticalResolution == 2 || !z21 || this.mResolvedVertical) {
                                                    solverVariable9 = solverVariable7;
                                                    solverVariable10 = solverVariable8;
                                                } else {
                                                    z22 = this.mListDimensionBehaviors[c8] != dimensionBehaviour3 && (this instanceof ConstraintWidgetContainer);
                                                    if (z22) {
                                                        i19 = 0;
                                                    }
                                                    ConstraintWidget constraintWidget6 = this.mParent;
                                                    SolverVariable createObjectVariable6 = constraintWidget6 == null ? linearSystem2.createObjectVariable(constraintWidget6.mBottom) : null;
                                                    ConstraintWidget constraintWidget7 = this.mParent;
                                                    SolverVariable createObjectVariable7 = constraintWidget7 == null ? linearSystem2.createObjectVariable(constraintWidget7.mTop) : null;
                                                    if (this.mBaselineDistance <= 0 || this.mVisibility == i22) {
                                                        constraintAnchor = this.mBaseline;
                                                        if (constraintAnchor.mTarget == null) {
                                                            linearSystem2.addEquality(solverVariable6, solverVariable8, getBaselineDistance(), i22);
                                                            linearSystem2.addEquality(solverVariable6, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i22);
                                                            if (z19) {
                                                                linearSystem2.addGreaterThan(createObjectVariable6, linearSystem2.createObjectVariable(this.mBottom), i23, 5);
                                                            }
                                                            z23 = false;
                                                            boolean z30 = this.isTerminalWidget[c8];
                                                            DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
                                                            solverVariable9 = solverVariable7;
                                                            solverVariable10 = solverVariable8;
                                                            applyConstraints(linearSystem, false, z19, z18, z30, createObjectVariable7, createObjectVariable6, dimensionBehaviourArr2[c8], z22, this.mTop, this.mBottom, this.mY, i19, this.mMinHeight, this.mMaxDimension[c8], this.mVerticalBiasPercent, z28, dimensionBehaviourArr2[0] != dimensionBehaviour2, z11, z12, z29, i17, i16, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z23);
                                                        } else if (this.mVisibility == i22) {
                                                            linearSystem2.addEquality(solverVariable6, solverVariable8, constraintAnchor.getMargin(), i22);
                                                        } else {
                                                            linearSystem2.addEquality(solverVariable6, solverVariable8, getBaselineDistance(), i22);
                                                        }
                                                    }
                                                    z23 = z16;
                                                    boolean z302 = this.isTerminalWidget[c8];
                                                    DimensionBehaviour[] dimensionBehaviourArr22 = this.mListDimensionBehaviors;
                                                    solverVariable9 = solverVariable7;
                                                    solverVariable10 = solverVariable8;
                                                    applyConstraints(linearSystem, false, z19, z18, z302, createObjectVariable7, createObjectVariable6, dimensionBehaviourArr22[c8], z22, this.mTop, this.mBottom, this.mY, i19, this.mMinHeight, this.mMaxDimension[c8], this.mVerticalBiasPercent, z28, dimensionBehaviourArr22[0] != dimensionBehaviour2, z11, z12, z29, i17, i16, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z23);
                                                }
                                                if (z20) {
                                                    constraintWidget3 = this;
                                                    if (constraintWidget3.mResolvedDimensionRatioSide == 1) {
                                                        linearSystem.addRatio(solverVariable9, solverVariable10, solverVariable4, solverVariable5, constraintWidget3.mResolvedDimensionRatio, 8);
                                                    } else {
                                                        linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable9, solverVariable10, constraintWidget3.mResolvedDimensionRatio, 8);
                                                    }
                                                } else {
                                                    constraintWidget3 = this;
                                                }
                                                if (constraintWidget3.mCenter.isConnected()) {
                                                    linearSystem.addCenterPoint(constraintWidget3, constraintWidget3.mCenter.getTarget().getOwner(), (float) Math.toRadians(constraintWidget3.mCircleConstraintAngle + 90.0f), constraintWidget3.mCenter.getMargin());
                                                }
                                                constraintWidget3.mResolvedHorizontal = false;
                                                constraintWidget3.mResolvedVertical = false;
                                                metrics2 = LinearSystem.sMetrics;
                                                if (metrics2 != null) {
                                                    metrics2.mEquations = linearSystem.getNumEquations();
                                                    LinearSystem.sMetrics.mVariables = linearSystem.getNumVariables();
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        linearSystem2 = linearSystem;
                                        solverVariable6 = solverVariable;
                                        solverVariable7 = solverVariable2;
                                        solverVariable8 = solverVariable3;
                                        i22 = 8;
                                        i23 = 0;
                                        c8 = 1;
                                        z21 = true;
                                        if (this.mVerticalResolution == 2) {
                                            if (this.mListDimensionBehaviors[c8] != dimensionBehaviour3) {
                                            }
                                            if (z22) {
                                            }
                                            ConstraintWidget constraintWidget62 = this.mParent;
                                            if (constraintWidget62 == null) {
                                            }
                                            ConstraintWidget constraintWidget72 = this.mParent;
                                            if (constraintWidget72 == null) {
                                            }
                                            if (this.mBaselineDistance <= 0) {
                                            }
                                            constraintAnchor = this.mBaseline;
                                            if (constraintAnchor.mTarget == null) {
                                            }
                                        }
                                        solverVariable9 = solverVariable7;
                                        solverVariable10 = solverVariable8;
                                        if (z20) {
                                        }
                                        if (constraintWidget3.mCenter.isConnected()) {
                                        }
                                        constraintWidget3.mResolvedHorizontal = false;
                                        constraintWidget3.mResolvedVertical = false;
                                        metrics2 = LinearSystem.sMetrics;
                                        if (metrics2 != null) {
                                        }
                                    }
                                }
                            }
                            ConstraintWidget constraintWidget8 = this.mParent;
                            SolverVariable createObjectVariable8 = constraintWidget8 == null ? linearSystem.createObjectVariable(constraintWidget8.mRight) : null;
                            ConstraintWidget constraintWidget9 = this.mParent;
                            SolverVariable createObjectVariable9 = constraintWidget9 == null ? linearSystem.createObjectVariable(constraintWidget9.mLeft) : null;
                            boolean z31 = this.isTerminalWidget[0];
                            DimensionBehaviour[] dimensionBehaviourArr3 = this.mListDimensionBehaviors;
                            z18 = z8;
                            z19 = z9;
                            dimensionBehaviour2 = dimensionBehaviour5;
                            solverVariable = createObjectVariable5;
                            solverVariable2 = createObjectVariable4;
                            solverVariable3 = createObjectVariable3;
                            solverVariable4 = createObjectVariable2;
                            dimensionBehaviour3 = dimensionBehaviour;
                            solverVariable5 = createObjectVariable;
                            z20 = z13;
                            applyConstraints(linearSystem, true, z8, z9, z31, createObjectVariable9, createObjectVariable8, dimensionBehaviourArr3[0], z15, this.mLeft, this.mRight, this.mX, i21, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, z14, dimensionBehaviourArr3[1] != dimensionBehaviour5, z12, z11, z17, i16, i17, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z16);
                            if (z7) {
                                dependencyNode = verticalWidgetRun.start;
                                if (dependencyNode.resolved) {
                                    linearSystem2 = linearSystem;
                                    solverVariable8 = solverVariable3;
                                    linearSystem2.addEquality(solverVariable8, dependencyNode.value);
                                    solverVariable7 = solverVariable2;
                                    linearSystem2.addEquality(solverVariable7, this.mVerticalRun.end.value);
                                    solverVariable6 = solverVariable;
                                    linearSystem2.addEquality(solverVariable6, this.mVerticalRun.baseline.value);
                                    constraintWidget4 = this.mParent;
                                    if (constraintWidget4 == null) {
                                    }
                                    i22 = 8;
                                    i23 = 0;
                                    c8 = 1;
                                    z21 = false;
                                    if (this.mVerticalResolution == 2) {
                                    }
                                    solverVariable9 = solverVariable7;
                                    solverVariable10 = solverVariable8;
                                    if (z20) {
                                    }
                                    if (constraintWidget3.mCenter.isConnected()) {
                                    }
                                    constraintWidget3.mResolvedHorizontal = false;
                                    constraintWidget3.mResolvedVertical = false;
                                    metrics2 = LinearSystem.sMetrics;
                                    if (metrics2 != null) {
                                    }
                                }
                            }
                            linearSystem2 = linearSystem;
                            solverVariable6 = solverVariable;
                            solverVariable7 = solverVariable2;
                            solverVariable8 = solverVariable3;
                            i22 = 8;
                            i23 = 0;
                            c8 = 1;
                            z21 = true;
                            if (this.mVerticalResolution == 2) {
                            }
                            solverVariable9 = solverVariable7;
                            solverVariable10 = solverVariable8;
                            if (z20) {
                            }
                            if (constraintWidget3.mCenter.isConnected()) {
                            }
                            constraintWidget3.mResolvedHorizontal = false;
                            constraintWidget3.mResolvedVertical = false;
                            metrics2 = LinearSystem.sMetrics;
                            if (metrics2 != null) {
                            }
                        }
                        z18 = z8;
                        z19 = z9;
                        dimensionBehaviour2 = dimensionBehaviour5;
                        dimensionBehaviour3 = dimensionBehaviour;
                        solverVariable = createObjectVariable5;
                        solverVariable2 = createObjectVariable4;
                        solverVariable3 = createObjectVariable3;
                        solverVariable4 = createObjectVariable2;
                        solverVariable5 = createObjectVariable;
                        z20 = z13;
                        if (z7) {
                        }
                        linearSystem2 = linearSystem;
                        solverVariable6 = solverVariable;
                        solverVariable7 = solverVariable2;
                        solverVariable8 = solverVariable3;
                        i22 = 8;
                        i23 = 0;
                        c8 = 1;
                        z21 = true;
                        if (this.mVerticalResolution == 2) {
                        }
                        solverVariable9 = solverVariable7;
                        solverVariable10 = solverVariable8;
                        if (z20) {
                        }
                        if (constraintWidget3.mCenter.isConnected()) {
                        }
                        constraintWidget3.mResolvedHorizontal = false;
                        constraintWidget3.mResolvedVertical = false;
                        metrics2 = LinearSystem.sMetrics;
                        if (metrics2 != null) {
                        }
                    }
                } else {
                    i20 = -1;
                }
                z14 = false;
                if (z13) {
                }
                DimensionBehaviour dimensionBehaviour72 = this.mListDimensionBehaviors[0];
                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour72 != dimensionBehaviour) {
                }
                if (!z15) {
                }
                z16 = !this.mCenter.isConnected();
                boolean[] zArr22 = this.mIsInBarrier;
                z17 = zArr22[0];
                boolean z292 = zArr22[1];
                if (this.mHorizontalResolution != 2) {
                    if (z7) {
                        dependencyNode2 = horizontalWidgetRun.start;
                        if (dependencyNode2.resolved) {
                            if (!z7) {
                            }
                        }
                    }
                    ConstraintWidget constraintWidget82 = this.mParent;
                    if (constraintWidget82 == null) {
                    }
                    ConstraintWidget constraintWidget92 = this.mParent;
                    if (constraintWidget92 == null) {
                    }
                    boolean z312 = this.isTerminalWidget[0];
                    DimensionBehaviour[] dimensionBehaviourArr32 = this.mListDimensionBehaviors;
                    z18 = z8;
                    z19 = z9;
                    dimensionBehaviour2 = dimensionBehaviour5;
                    solverVariable = createObjectVariable5;
                    solverVariable2 = createObjectVariable4;
                    solverVariable3 = createObjectVariable3;
                    solverVariable4 = createObjectVariable2;
                    dimensionBehaviour3 = dimensionBehaviour;
                    solverVariable5 = createObjectVariable;
                    z20 = z13;
                    applyConstraints(linearSystem, true, z8, z9, z312, createObjectVariable9, createObjectVariable8, dimensionBehaviourArr32[0], z15, this.mLeft, this.mRight, this.mX, i21, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, z14, dimensionBehaviourArr32[1] != dimensionBehaviour5, z12, z11, z17, i16, i17, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z16);
                    if (z7) {
                    }
                    linearSystem2 = linearSystem;
                    solverVariable6 = solverVariable;
                    solverVariable7 = solverVariable2;
                    solverVariable8 = solverVariable3;
                    i22 = 8;
                    i23 = 0;
                    c8 = 1;
                    z21 = true;
                    if (this.mVerticalResolution == 2) {
                    }
                    solverVariable9 = solverVariable7;
                    solverVariable10 = solverVariable8;
                    if (z20) {
                    }
                    if (constraintWidget3.mCenter.isConnected()) {
                    }
                    constraintWidget3.mResolvedHorizontal = false;
                    constraintWidget3.mResolvedVertical = false;
                    metrics2 = LinearSystem.sMetrics;
                    if (metrics2 != null) {
                    }
                }
                z18 = z8;
                z19 = z9;
                dimensionBehaviour2 = dimensionBehaviour5;
                dimensionBehaviour3 = dimensionBehaviour;
                solverVariable = createObjectVariable5;
                solverVariable2 = createObjectVariable4;
                solverVariable3 = createObjectVariable3;
                solverVariable4 = createObjectVariable2;
                solverVariable5 = createObjectVariable;
                z20 = z13;
                if (z7) {
                }
                linearSystem2 = linearSystem;
                solverVariable6 = solverVariable;
                solverVariable7 = solverVariable2;
                solverVariable8 = solverVariable3;
                i22 = 8;
                i23 = 0;
                c8 = 1;
                z21 = true;
                if (this.mVerticalResolution == 2) {
                }
                solverVariable9 = solverVariable7;
                solverVariable10 = solverVariable8;
                if (z20) {
                }
                if (constraintWidget3.mCenter.isConnected()) {
                }
                constraintWidget3.mResolvedHorizontal = false;
                constraintWidget3.mResolvedVertical = false;
                metrics2 = LinearSystem.sMetrics;
                if (metrics2 != null) {
                }
            } else {
                z8 = z24;
                z9 = false;
                if (this.mVisibility == 8) {
                    zArr = this.mIsInBarrier;
                    if (!zArr[0]) {
                        return;
                    }
                }
                z10 = this.mResolvedHorizontal;
                if (!z10) {
                }
                if (z10) {
                }
                if (this.mResolvedVertical) {
                }
                if (this.mResolvedHorizontal) {
                    this.mResolvedHorizontal = false;
                    this.mResolvedVertical = false;
                    return;
                }
                metrics = LinearSystem.sMetrics;
                if (metrics != null) {
                }
                if (z7) {
                    dependencyNode3 = horizontalWidgetRun2.start;
                    if (dependencyNode3.resolved) {
                        if (metrics != null) {
                        }
                        linearSystem.addEquality(createObjectVariable, dependencyNode3.value);
                        linearSystem.addEquality(createObjectVariable2, this.mHorizontalRun.end.value);
                        linearSystem.addEquality(createObjectVariable3, this.mVerticalRun.start.value);
                        linearSystem.addEquality(createObjectVariable4, this.mVerticalRun.end.value);
                        linearSystem.addEquality(createObjectVariable5, this.mVerticalRun.baseline.value);
                        if (this.mParent != null) {
                        }
                        this.mResolvedHorizontal = false;
                        this.mResolvedVertical = false;
                        return;
                    }
                }
                if (metrics != null) {
                }
                if (this.mParent != null) {
                }
                i8 = this.mWidth;
                i9 = this.mMinWidth;
                if (i8 >= i9) {
                }
                i10 = this.mHeight;
                i11 = this.mMinHeight;
                if (i10 >= i11) {
                }
                DimensionBehaviour[] dimensionBehaviourArr4 = this.mListDimensionBehaviors;
                DimensionBehaviour dimensionBehaviour42 = dimensionBehaviourArr4[0];
                DimensionBehaviour dimensionBehaviour52 = DimensionBehaviour.MATCH_CONSTRAINT;
                i12 = i9;
                if (dimensionBehaviour42 != dimensionBehaviour52) {
                }
                DimensionBehaviour dimensionBehaviour62 = dimensionBehaviourArr4[1];
                i13 = i11;
                if (dimensionBehaviour62 != dimensionBehaviour52) {
                }
                int i272 = this.mDimensionRatioSide;
                this.mResolvedDimensionRatioSide = i272;
                f8 = this.mDimensionRatio;
                this.mResolvedDimensionRatio = f8;
                i14 = this.mMatchConstraintDefaultWidth;
                i15 = this.mMatchConstraintDefaultHeight;
                if (f8 > 0.0f) {
                }
                i16 = i14;
                i17 = i15;
                i18 = i12;
                i19 = i13;
                z13 = false;
                int[] iArr2 = this.mResolvedMatchConstraintDefault;
                iArr2[0] = i16;
                iArr2[1] = i17;
                this.mResolvedHasRatio = z13;
                if (z13) {
                }
                z14 = false;
                if (z13) {
                }
                DimensionBehaviour dimensionBehaviour722 = this.mListDimensionBehaviors[0];
                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour722 != dimensionBehaviour) {
                }
                if (!z15) {
                }
                z16 = !this.mCenter.isConnected();
                boolean[] zArr222 = this.mIsInBarrier;
                z17 = zArr222[0];
                boolean z2922 = zArr222[1];
                if (this.mHorizontalResolution != 2) {
                }
                z18 = z8;
                z19 = z9;
                dimensionBehaviour2 = dimensionBehaviour52;
                dimensionBehaviour3 = dimensionBehaviour;
                solverVariable = createObjectVariable5;
                solverVariable2 = createObjectVariable4;
                solverVariable3 = createObjectVariable3;
                solverVariable4 = createObjectVariable2;
                solverVariable5 = createObjectVariable;
                z20 = z13;
                if (z7) {
                }
                linearSystem2 = linearSystem;
                solverVariable6 = solverVariable;
                solverVariable7 = solverVariable2;
                solverVariable8 = solverVariable3;
                i22 = 8;
                i23 = 0;
                c8 = 1;
                z21 = true;
                if (this.mVerticalResolution == 2) {
                }
                solverVariable9 = solverVariable7;
                solverVariable10 = solverVariable8;
                if (z20) {
                }
                if (constraintWidget3.mCenter.isConnected()) {
                }
                constraintWidget3.mResolvedHorizontal = false;
                constraintWidget3.mResolvedVertical = false;
                metrics2 = LinearSystem.sMetrics;
                if (metrics2 != null) {
                }
            }
        }
        z8 = false;
        z9 = false;
        if (this.mVisibility == 8) {
        }
        z10 = this.mResolvedHorizontal;
        if (!z10) {
        }
        if (z10) {
        }
        if (this.mResolvedVertical) {
        }
        if (this.mResolvedHorizontal) {
        }
        metrics = LinearSystem.sMetrics;
        if (metrics != null) {
        }
        if (z7) {
        }
        if (metrics != null) {
        }
        if (this.mParent != null) {
        }
        i8 = this.mWidth;
        i9 = this.mMinWidth;
        if (i8 >= i9) {
        }
        i10 = this.mHeight;
        i11 = this.mMinHeight;
        if (i10 >= i11) {
        }
        DimensionBehaviour[] dimensionBehaviourArr42 = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour422 = dimensionBehaviourArr42[0];
        DimensionBehaviour dimensionBehaviour522 = DimensionBehaviour.MATCH_CONSTRAINT;
        i12 = i9;
        if (dimensionBehaviour422 != dimensionBehaviour522) {
        }
        DimensionBehaviour dimensionBehaviour622 = dimensionBehaviourArr42[1];
        i13 = i11;
        if (dimensionBehaviour622 != dimensionBehaviour522) {
        }
        int i2722 = this.mDimensionRatioSide;
        this.mResolvedDimensionRatioSide = i2722;
        f8 = this.mDimensionRatio;
        this.mResolvedDimensionRatio = f8;
        i14 = this.mMatchConstraintDefaultWidth;
        i15 = this.mMatchConstraintDefaultHeight;
        if (f8 > 0.0f) {
        }
        i16 = i14;
        i17 = i15;
        i18 = i12;
        i19 = i13;
        z13 = false;
        int[] iArr22 = this.mResolvedMatchConstraintDefault;
        iArr22[0] = i16;
        iArr22[1] = i17;
        this.mResolvedHasRatio = z13;
        if (z13) {
        }
        z14 = false;
        if (z13) {
        }
        DimensionBehaviour dimensionBehaviour7222 = this.mListDimensionBehaviors[0];
        dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour7222 != dimensionBehaviour) {
        }
        if (!z15) {
        }
        z16 = !this.mCenter.isConnected();
        boolean[] zArr2222 = this.mIsInBarrier;
        z17 = zArr2222[0];
        boolean z29222 = zArr2222[1];
        if (this.mHorizontalResolution != 2) {
        }
        z18 = z8;
        z19 = z9;
        dimensionBehaviour2 = dimensionBehaviour522;
        dimensionBehaviour3 = dimensionBehaviour;
        solverVariable = createObjectVariable5;
        solverVariable2 = createObjectVariable4;
        solverVariable3 = createObjectVariable3;
        solverVariable4 = createObjectVariable2;
        solverVariable5 = createObjectVariable;
        z20 = z13;
        if (z7) {
        }
        linearSystem2 = linearSystem;
        solverVariable6 = solverVariable;
        solverVariable7 = solverVariable2;
        solverVariable8 = solverVariable3;
        i22 = 8;
        i23 = 0;
        c8 = 1;
        z21 = true;
        if (this.mVerticalResolution == 2) {
        }
        solverVariable9 = solverVariable7;
        solverVariable10 = solverVariable8;
        if (z20) {
        }
        if (constraintWidget3.mCenter.isConnected()) {
        }
        constraintWidget3.mResolvedHorizontal = false;
        constraintWidget3.mResolvedVertical = false;
        metrics2 = LinearSystem.sMetrics;
        if (metrics2 != null) {
        }
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i8) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i8);
        }
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f8, int i8) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        immediateConnect(type, constraintWidget, type, i8, 0);
        this.mCircleConstraintAngle = f8;
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
        this.mHasBaseline = constraintWidget.mHasBaseline;
        this.mInPlaceholder = constraintWidget.mInPlaceholder;
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
        this.mHorizontalNextWidget = constraintWidget2 == null ? null : hashMap.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget3 != null ? hashMap.get(constraintWidget3) : null;
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

    public void ensureMeasureRequested() {
        this.mMeasureRequested = true;
    }

    public void ensureWidgetRuns() {
        if (this.mHorizontalRun == null) {
            this.mHorizontalRun = new HorizontalWidgetRun(this);
        }
        if (this.mVerticalRun == null) {
            this.mVerticalRun = new VerticalWidgetRun(this);
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

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public float getBiasPercent(int i8) {
        if (i8 == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i8 == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public DimensionBehaviour getDimensionBehaviour(int i8) {
        if (i8 == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i8 == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public boolean getHasBaseline() {
        return this.mHasBaseline;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
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

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i8 = constraintAnchor != null ? constraintAnchor.mMargin : 0;
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i8 + constraintAnchor2.mMargin : i8;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.mLastHorizontalMeasureSpec;
    }

    public int getLastVerticalMeasureSpec() {
        return this.mLastVerticalMeasureSpec;
    }

    public int getLeft() {
        return getX();
    }

    public int getLength(int i8) {
        if (i8 == 0) {
            return getWidth();
        }
        if (i8 == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public ConstraintWidget getNextChainMember(int i8) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i8 != 0) {
            if (i8 == 1 && (constraintAnchor2 = (constraintAnchor = this.mBottom).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
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

    public int getOptimizerWrapHeight() {
        int i8;
        int i9 = this.mHeight;
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i9;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            i8 = Math.max(this.mMatchConstraintMinHeight, i9);
        } else {
            i8 = this.mMatchConstraintMinHeight;
            if (i8 > 0) {
                this.mHeight = i8;
            } else {
                i8 = 0;
            }
        }
        int i10 = this.mMatchConstraintMaxHeight;
        return (i10 <= 0 || i10 >= i8) ? i8 : i10;
    }

    public int getOptimizerWrapWidth() {
        int i8;
        int i9 = this.mWidth;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i9;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            i8 = Math.max(this.mMatchConstraintMinWidth, i9);
        } else {
            i8 = this.mMatchConstraintMinWidth;
            if (i8 > 0) {
                this.mWidth = i8;
            } else {
                i8 = 0;
            }
        }
        int i10 = this.mMatchConstraintMaxWidth;
        return (i10 <= 0 || i10 >= i8) ? i8 : i10;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public ConstraintWidget getPreviousChainMember(int i8) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i8 != 0) {
            if (i8 == 1 && (constraintAnchor2 = (constraintAnchor = this.mTop).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
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

    int getRelativePositioning(int i8) {
        if (i8 == 0) {
            return this.mRelX;
        }
        if (i8 == 1) {
            return this.mRelY;
        }
        return 0;
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    protected int getRootX() {
        return this.mX + this.mOffsetX;
    }

    protected int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public WidgetRun getRun(int i8) {
        if (i8 == 0) {
            return this.mHorizontalRun;
        }
        if (i8 == 1) {
            return this.mVerticalRun;
        }
        return null;
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
        getSceneString(sb, TtmlNode.LEFT, this.mLeft);
        getSceneString(sb, "top", this.mTop);
        getSceneString(sb, TtmlNode.RIGHT, this.mRight);
        getSceneString(sb, "bottom", this.mBottom);
        getSceneString(sb, "baseline", this.mBaseline);
        getSceneString(sb, "centerX", this.mCenterX);
        getSceneString(sb, "centerY", this.mCenterY);
        getSceneString(sb, "    width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mListDimensionBehaviors[0], this.mWeight[0]);
        getSceneString(sb, "    height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mListDimensionBehaviors[1], this.mWeight[1]);
        serializeDimensionRatio(sb, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "    horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    horizontalChainStyle", this.mHorizontalChainStyle, 0);
        serializeAttribute(sb, "    verticalChainStyle", this.mVerticalChainStyle, 0);
        sb.append("  }");
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.mType;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
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

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i8 = this.mLeft != null ? this.mTop.mMargin : 0;
        return this.mRight != null ? i8 + this.mBottom.mMargin : i8;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getWrapBehaviorInParent() {
        return this.mWrapBehaviorInParent;
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.mX : ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.mY : ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.mY;
    }

    public boolean hasBaseline() {
        return this.mHasBaseline;
    }

    public boolean hasDanglingDimension(int i8) {
        if (i8 == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.mAnchors.get(i8).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDimensionOverride() {
        return (this.mWidthOverride == -1 && this.mHeightOverride == -1) ? false : true;
    }

    public boolean hasResolvedTargets(int i8, int i9) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i8 == 0) {
            ConstraintAnchor constraintAnchor3 = this.mLeft.mTarget;
            return constraintAnchor3 != null && constraintAnchor3.hasFinalValue() && (constraintAnchor2 = this.mRight.mTarget) != null && constraintAnchor2.hasFinalValue() && (this.mRight.mTarget.getFinalValue() - this.mRight.getMargin()) - (this.mLeft.mTarget.getFinalValue() + this.mLeft.getMargin()) >= i9;
        }
        ConstraintAnchor constraintAnchor4 = this.mTop.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.hasFinalValue() && (constraintAnchor = this.mBottom.mTarget) != null && constraintAnchor.hasFinalValue() && (this.mBottom.mTarget.getFinalValue() - this.mBottom.getMargin()) - (this.mTop.mTarget.getFinalValue() + this.mTop.getMargin()) >= i9;
        return false;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i8, int i9) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i8, i9, true);
    }

    public boolean isAnimated() {
        return this.mAnimated;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.mHorizontalSolvingPass;
    }

    public boolean isInBarrier(int i8) {
        return this.mIsInBarrier[i8];
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

    public boolean isInPlaceholder() {
        return this.mInPlaceholder;
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

    public boolean isInVirtualLayout() {
        return this.mInVirtualLayout;
    }

    public boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public boolean isResolvedHorizontally() {
        return this.mResolvedHorizontal || (this.mLeft.hasFinalValue() && this.mRight.hasFinalValue());
    }

    public boolean isResolvedVertically() {
        return this.mResolvedVertical || (this.mTop.hasFinalValue() && this.mBottom.hasFinalValue());
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.mVerticalSolvingPass;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void markHorizontalSolvingPassDone() {
        this.mHorizontalSolvingPass = true;
    }

    public void markVerticalSolvingPassDone() {
        this.mVerticalSolvingPass = true;
    }

    public boolean oppositeDimensionDependsOn(int i8) {
        char c8 = i8 == 0 ? (char) 1 : (char) 0;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i8];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c8];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour3 && dimensionBehaviour2 == dimensionBehaviour3;
    }

    public boolean oppositeDimensionsTied() {
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
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
        this.mCircleConstraintAngle = Float.NaN;
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
        float f8 = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f8;
        this.mVerticalBiasPercent = f8;
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
        for (int i8 = 0; i8 < size; i8++) {
            this.mAnchors.get(i8).reset();
        }
    }

    public void resetFinalResolution() {
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        int size = this.mAnchors.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mAnchors.get(i8).resetFinalResolution();
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

    public void resetSolvingPassFlag() {
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
    }

    public StringBuilder serialize(StringBuilder sb) {
        sb.append("{\n");
        serializeAnchor(sb, TtmlNode.LEFT, this.mLeft);
        serializeAnchor(sb, "top", this.mTop);
        serializeAnchor(sb, TtmlNode.RIGHT, this.mRight);
        serializeAnchor(sb, "bottom", this.mBottom);
        serializeAnchor(sb, "baseline", this.mBaseline);
        serializeAnchor(sb, "centerX", this.mCenterX);
        serializeAnchor(sb, "centerY", this.mCenterY);
        serializeCircle(sb, this.mCenter, this.mCircleConstraintAngle);
        serializeSize(sb, x.KEY_WIDTH, this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        serializeSize(sb, x.KEY_HEIGHT, this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb, "dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        sb.append("}\n");
        return sb;
    }

    public void setAnimated(boolean z7) {
        this.mAnimated = z7;
    }

    public void setBaselineDistance(int i8) {
        this.mBaselineDistance = i8;
        this.mHasBaseline = i8 > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i8) {
        if (i8 >= 0) {
            this.mContainerItemSkip = i8;
        } else {
            this.mContainerItemSkip = 0;
        }
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
        linearSystem.createObjectVariable(this.mBaseline).setName(str + ".baseline");
    }

    public void setDimension(int i8, int i9) {
        this.mWidth = i8;
        int i10 = this.mMinWidth;
        if (i8 < i10) {
            this.mWidth = i10;
        }
        this.mHeight = i9;
        int i11 = this.mMinHeight;
        if (i9 < i11) {
            this.mHeight = i11;
        }
    }

    public void setDimensionRatio(float f8, int i8) {
        this.mDimensionRatio = f8;
        this.mDimensionRatioSide = i8;
    }

    public void setFinalBaseline(int i8) {
        if (this.mHasBaseline) {
            int i9 = i8 - this.mBaselineDistance;
            int i10 = this.mHeight + i9;
            this.mY = i9;
            this.mTop.setFinalValue(i9);
            this.mBottom.setFinalValue(i10);
            this.mBaseline.setFinalValue(i8);
            this.mResolvedVertical = true;
        }
    }

    public void setFinalFrame(int i8, int i9, int i10, int i11, int i12, int i13) {
        setFrame(i8, i9, i10, i11);
        setBaselineDistance(i12);
        if (i13 == 0) {
            this.mResolvedHorizontal = true;
            this.mResolvedVertical = false;
        } else if (i13 == 1) {
            this.mResolvedHorizontal = false;
            this.mResolvedVertical = true;
        } else if (i13 == 2) {
            this.mResolvedHorizontal = true;
            this.mResolvedVertical = true;
        } else {
            this.mResolvedHorizontal = false;
            this.mResolvedVertical = false;
        }
    }

    public void setFinalHorizontal(int i8, int i9) {
        if (this.mResolvedHorizontal) {
            return;
        }
        this.mLeft.setFinalValue(i8);
        this.mRight.setFinalValue(i9);
        this.mX = i8;
        this.mWidth = i9 - i8;
        this.mResolvedHorizontal = true;
    }

    public void setFinalLeft(int i8) {
        this.mLeft.setFinalValue(i8);
        this.mX = i8;
    }

    public void setFinalTop(int i8) {
        this.mTop.setFinalValue(i8);
        this.mY = i8;
    }

    public void setFinalVertical(int i8, int i9) {
        if (this.mResolvedVertical) {
            return;
        }
        this.mTop.setFinalValue(i8);
        this.mBottom.setFinalValue(i9);
        this.mY = i8;
        this.mHeight = i9 - i8;
        if (this.mHasBaseline) {
            this.mBaseline.setFinalValue(i8 + this.mBaselineDistance);
        }
        this.mResolvedVertical = true;
    }

    public void setFrame(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14 = i10 - i8;
        int i15 = i11 - i9;
        this.mX = i8;
        this.mY = i9;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i14 < (i13 = this.mWidth)) {
            i14 = i13;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i15 < (i12 = this.mHeight)) {
            i15 = i12;
        }
        this.mWidth = i14;
        this.mHeight = i15;
        int i16 = this.mMinHeight;
        if (i15 < i16) {
            this.mHeight = i16;
        }
        int i17 = this.mMinWidth;
        if (i14 < i17) {
            this.mWidth = i17;
        }
        int i18 = this.mMatchConstraintMaxWidth;
        if (i18 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mWidth = Math.min(this.mWidth, i18);
        }
        int i19 = this.mMatchConstraintMaxHeight;
        if (i19 > 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mHeight = Math.min(this.mHeight, i19);
        }
        int i20 = this.mWidth;
        if (i14 != i20) {
            this.mWidthOverride = i20;
        }
        int i21 = this.mHeight;
        if (i15 != i21) {
            this.mHeightOverride = i21;
        }
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i8) {
        int i9 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[type.ordinal()];
        if (i9 == 1) {
            this.mLeft.mGoneMargin = i8;
            return;
        }
        if (i9 == 2) {
            this.mTop.mGoneMargin = i8;
            return;
        }
        if (i9 == 3) {
            this.mRight.mGoneMargin = i8;
        } else if (i9 == 4) {
            this.mBottom.mGoneMargin = i8;
        } else {
            if (i9 != 5) {
                return;
            }
            this.mBaseline.mGoneMargin = i8;
        }
    }

    public void setHasBaseline(boolean z7) {
        this.mHasBaseline = z7;
    }

    public void setHeight(int i8) {
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
    }

    public void setHeightWrapContent(boolean z7) {
        this.mIsHeightWrapContent = z7;
    }

    public void setHorizontalBiasPercent(float f8) {
        this.mHorizontalBiasPercent = f8;
    }

    public void setHorizontalChainStyle(int i8) {
        this.mHorizontalChainStyle = i8;
    }

    public void setHorizontalDimension(int i8, int i9) {
        this.mX = i8;
        int i10 = i9 - i8;
        this.mWidth = i10;
        int i11 = this.mMinWidth;
        if (i10 < i11) {
            this.mWidth = i11;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setHorizontalMatchStyle(int i8, int i9, int i10, float f8) {
        this.mMatchConstraintDefaultWidth = i8;
        this.mMatchConstraintMinWidth = i9;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        this.mMatchConstraintMaxWidth = i10;
        this.mMatchConstraintPercentWidth = f8;
        if (f8 <= 0.0f || f8 >= 1.0f || i8 != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setHorizontalWeight(float f8) {
        this.mWeight[0] = f8;
    }

    protected void setInBarrier(int i8, boolean z7) {
        this.mIsInBarrier[i8] = z7;
    }

    public void setInPlaceholder(boolean z7) {
        this.mInPlaceholder = z7;
    }

    public void setInVirtualLayout(boolean z7) {
        this.mInVirtualLayout = z7;
    }

    public void setLastMeasureSpec(int i8, int i9) {
        this.mLastHorizontalMeasureSpec = i8;
        this.mLastVerticalMeasureSpec = i9;
        setMeasureRequested(false);
    }

    public void setLength(int i8, int i9) {
        if (i9 == 0) {
            setWidth(i8);
        } else if (i9 == 1) {
            setHeight(i8);
        }
    }

    public void setMaxHeight(int i8) {
        this.mMaxDimension[1] = i8;
    }

    public void setMaxWidth(int i8) {
        this.mMaxDimension[0] = i8;
    }

    public void setMeasureRequested(boolean z7) {
        this.mMeasureRequested = z7;
    }

    public void setMinHeight(int i8) {
        if (i8 < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i8;
        }
    }

    public void setMinWidth(int i8) {
        if (i8 < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i8;
        }
    }

    public void setOffset(int i8, int i9) {
        this.mOffsetX = i8;
        this.mOffsetY = i9;
    }

    public void setOrigin(int i8, int i9) {
        this.mX = i8;
        this.mY = i9;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    void setRelativePositioning(int i8, int i9) {
        if (i9 == 0) {
            this.mRelX = i8;
        } else if (i9 == 1) {
            this.mRelY = i8;
        }
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVerticalBiasPercent(float f8) {
        this.mVerticalBiasPercent = f8;
    }

    public void setVerticalChainStyle(int i8) {
        this.mVerticalChainStyle = i8;
    }

    public void setVerticalDimension(int i8, int i9) {
        this.mY = i8;
        int i10 = i9 - i8;
        this.mHeight = i10;
        int i11 = this.mMinHeight;
        if (i10 < i11) {
            this.mHeight = i11;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public void setVerticalMatchStyle(int i8, int i9, int i10, float f8) {
        this.mMatchConstraintDefaultHeight = i8;
        this.mMatchConstraintMinHeight = i9;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        this.mMatchConstraintMaxHeight = i10;
        this.mMatchConstraintPercentHeight = f8;
        if (f8 <= 0.0f || f8 >= 1.0f || i8 != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    public void setVerticalWeight(float f8) {
        this.mWeight[1] = f8;
    }

    public void setVisibility(int i8) {
        this.mVisibility = i8;
    }

    public void setWidth(int i8) {
        this.mWidth = i8;
        int i9 = this.mMinWidth;
        if (i8 < i9) {
            this.mWidth = i9;
        }
    }

    public void setWidthWrapContent(boolean z7) {
        this.mIsWidthWrapContent = z7;
    }

    public void setWrapBehaviorInParent(int i8) {
        if (i8 < 0 || i8 > 3) {
            return;
        }
        this.mWrapBehaviorInParent = i8;
    }

    public void setX(int i8) {
        this.mX = i8;
    }

    public void setY(int i8) {
        this.mY = i8;
    }

    public void setupDimensionRatio(boolean z7, boolean z8, boolean z9, boolean z10) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z9 && !z10) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z9 && z10) {
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
            int i8 = this.mMatchConstraintMinWidth;
            if (i8 > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else {
                if (i8 != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.mType != null) {
            str = "type: " + this.mType + l.SPACE;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.mDebugName != null) {
            str2 = "id: " + this.mDebugName + l.SPACE;
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

    public void updateFromRuns(boolean z7, boolean z8) {
        int i8;
        int i9;
        boolean isResolved = z7 & this.mHorizontalRun.isResolved();
        boolean isResolved2 = z8 & this.mVerticalRun.isResolved();
        HorizontalWidgetRun horizontalWidgetRun = this.mHorizontalRun;
        int i10 = horizontalWidgetRun.start.value;
        VerticalWidgetRun verticalWidgetRun = this.mVerticalRun;
        int i11 = verticalWidgetRun.start.value;
        int i12 = horizontalWidgetRun.end.value;
        int i13 = verticalWidgetRun.end.value;
        int i14 = i13 - i11;
        if (i12 - i10 < 0 || i14 < 0 || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE) {
            i12 = 0;
            i10 = 0;
            i13 = 0;
            i11 = 0;
        }
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        if (isResolved) {
            this.mX = i10;
        }
        if (isResolved2) {
            this.mY = i11;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (isResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i15 < (i9 = this.mWidth)) {
                i15 = i9;
            }
            this.mWidth = i15;
            int i17 = this.mMinWidth;
            if (i15 < i17) {
                this.mWidth = i17;
            }
        }
        if (isResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i16 < (i8 = this.mHeight)) {
                i16 = i8;
            }
            this.mHeight = i16;
            int i18 = this.mMinHeight;
            if (i16 < i18) {
                this.mHeight = i18;
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z7) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z7 && (horizontalWidgetRun = this.mHorizontalRun) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.start;
            if (dependencyNode.resolved) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.end;
                if (dependencyNode2.resolved) {
                    objectVariableValue = dependencyNode.value;
                    objectVariableValue3 = dependencyNode2.value;
                }
            }
        }
        if (z7 && (verticalWidgetRun = this.mVerticalRun) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.start;
            if (dependencyNode3.resolved) {
                DependencyNode dependencyNode4 = verticalWidgetRun.end;
                if (dependencyNode4.resolved) {
                    objectVariableValue2 = dependencyNode3.value;
                    objectVariableValue4 = dependencyNode4.value;
                }
            }
        }
        int i8 = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i8 < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0087 -> B:31:0x0088). Please report as a decompilation issue!!! */
    public void setDimensionRatio(String str) {
        float f8;
        int i8 = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i9 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i9 = substring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST) ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f8 = Float.parseFloat(substring2);
            }
            f8 = 0.0f;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f8 = i9 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f8 = 0.0f;
        }
        i8 = (f8 > i8 ? 1 : (f8 == i8 ? 0 : -1));
        if (i8 > 0) {
            this.mDimensionRatio = f8;
            this.mDimensionRatioSide = i9;
        }
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i8) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z7;
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
                boolean z8 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(type6, constraintWidget, type6, 0);
                    connect(type7, constraintWidget, type7, 0);
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(type8, constraintWidget, type8, 0);
                    connect(type9, constraintWidget, type9, 0);
                } else {
                    z8 = false;
                }
                if (z7 && z8) {
                    getAnchor(type5).connect(constraintWidget.getAnchor(type5), 0);
                    return;
                }
                if (z7) {
                    ConstraintAnchor.Type type10 = ConstraintAnchor.Type.CENTER_X;
                    getAnchor(type10).connect(constraintWidget.getAnchor(type10), 0);
                    return;
                } else {
                    if (z8) {
                        ConstraintAnchor.Type type11 = ConstraintAnchor.Type.CENTER_Y;
                        getAnchor(type11).connect(constraintWidget.getAnchor(type11), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.LEFT;
            if (type2 != type12 && type2 != ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor.Type type13 = ConstraintAnchor.Type.TOP;
                if (type2 == type13 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    connect(type13, constraintWidget, type2, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
            connect(type12, constraintWidget, type2, 0);
            connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
            getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
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
            } else if (type != ConstraintAnchor.Type.TOP && type != ConstraintAnchor.Type.BOTTOM) {
                if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                    ConstraintAnchor anchor13 = getAnchor(type5);
                    if (anchor13.getTarget() != anchor10) {
                        anchor13.reset();
                    }
                    ConstraintAnchor opposite = getAnchor(type).getOpposite();
                    ConstraintAnchor anchor14 = getAnchor(type14);
                    if (anchor14.isConnected()) {
                        opposite.reset();
                        anchor14.reset();
                    }
                }
            } else {
                ConstraintAnchor anchor15 = getAnchor(type20);
                if (anchor15 != null) {
                    anchor15.reset();
                }
                ConstraintAnchor anchor16 = getAnchor(type5);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                ConstraintAnchor anchor17 = getAnchor(type15);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i8);
        }
    }

    private void serializeAttribute(StringBuilder sb, String str, int i8, int i9) {
        if (i8 == i9) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i8);
        sb.append(",\n");
    }

    public void setFrame(int i8, int i9, int i10) {
        if (i10 == 0) {
            setHorizontalDimension(i8, i9);
        } else if (i10 == 1) {
            setVerticalDimension(i8, i9);
        }
    }

    private void serializeAttribute(StringBuilder sb, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(str2);
        sb.append(",\n");
    }

    public ConstraintWidget(String str) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.mOptimizeWrapO = false;
        this.mOptimizeWrapOnResolved = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
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
        this.mCircleConstraintAngle = Float.NaN;
        this.mHasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
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
        float f8 = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f8;
        this.mVerticalBiasPercent = f8;
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
        setDebugName(str);
    }

    private void getSceneString(StringBuilder sb, String str, int i8, int i9, int i10, int i11, int i12, int i13, float f8, DimensionBehaviour dimensionBehaviour, float f9) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "      behavior", dimensionBehaviour.toString(), DimensionBehaviour.FIXED.toString());
        serializeAttribute(sb, "      size", i8, 0);
        serializeAttribute(sb, "      min", i9, 0);
        serializeAttribute(sb, "      max", i10, Integer.MAX_VALUE);
        serializeAttribute(sb, "      matchMin", i12, 0);
        serializeAttribute(sb, "      matchDef", i13, 0);
        serializeAttribute(sb, "      matchPercent", f8, 1.0f);
        sb.append("    },\n");
    }

    public ConstraintWidget(int i8, int i9, int i10, int i11) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.mOptimizeWrapO = false;
        this.mOptimizeWrapOnResolved = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
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
        this.mCircleConstraintAngle = Float.NaN;
        this.mHasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
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
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f8 = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f8;
        this.mVerticalBiasPercent = f8;
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
        this.mX = i8;
        this.mY = i9;
        this.mWidth = i10;
        this.mHeight = i11;
        addAnchors();
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
            sb.append(SystemInfoUtil.COMMA);
            sb.append(constraintAnchor.mMargin);
            if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE) {
                sb.append(SystemInfoUtil.COMMA);
                sb.append(constraintAnchor.mGoneMargin);
                sb.append(SystemInfoUtil.COMMA);
            }
        }
        sb.append(" ] ,\n");
    }

    public ConstraintWidget(String str, int i8, int i9, int i10, int i11) {
        this(i8, i9, i10, i11);
        setDebugName(str);
    }

    public ConstraintWidget(int i8, int i9) {
        this(0, 0, i8, i9);
    }

    public ConstraintWidget(String str, int i8, int i9) {
        this(i8, i9);
        setDebugName(str);
    }
}
