package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    private class WidgetsList {
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget mBiggest = null;
        int mBiggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        WidgetsList(int i8, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i9) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i8;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i9;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.mBiggest = null;
            this.mBiggestDimension = 0;
            int i8 = this.mCount;
            for (int i9 = 0; i9 < i8 && this.mStartIndex + i9 < Flow.this.mDisplayedWidgetsCount; i9++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i9];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int i10 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i10 = 0;
                    }
                    this.mWidth += width + i10;
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetHeight;
                        this.mHeight = widgetHeight;
                    }
                } else {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i11 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i11 = 0;
                    }
                    this.mHeight += widgetHeight2 + i11;
                    if (this.mBiggest == null || this.mBiggestDimension < widgetWidth) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            if (this.mOrientation == 0) {
                int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                this.mWidth += widgetWidth + (constraintWidget.getVisibility() != 8 ? Flow.this.mHorizontalGap : 0);
                int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                this.mHeight += widgetHeight2 + (constraintWidget.getVisibility() != 8 ? Flow.this.mVerticalGap : 0);
                if (this.mBiggest == null || this.mBiggestDimension < widgetWidth2) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.mBiggestDimension = 0;
            this.mBiggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        public void createConstraints(boolean z7, int i8, boolean z8) {
            ConstraintWidget constraintWidget;
            float f8;
            float f9;
            int i9 = this.mCount;
            for (int i10 = 0; i10 < i9 && this.mStartIndex + i10 < Flow.this.mDisplayedWidgetsCount; i10++) {
                ConstraintWidget constraintWidget2 = Flow.this.mDisplayedWidgets[this.mStartIndex + i10];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i9 == 0 || this.mBiggest == null) {
                return;
            }
            boolean z9 = z8 && i8 == 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = z7 ? (i9 - 1) - i13 : i13;
                if (this.mStartIndex + i14 >= Flow.this.mDisplayedWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget3 = Flow.this.mDisplayedWidgets[this.mStartIndex + i14];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                    if (i11 == -1) {
                        i11 = i13;
                    }
                    i12 = i13;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.mOrientation != 0) {
                ConstraintWidget constraintWidget5 = this.mBiggest;
                constraintWidget5.setHorizontalChainStyle(Flow.this.mHorizontalStyle);
                int i15 = this.mPaddingLeft;
                if (i8 > 0) {
                    i15 += Flow.this.mHorizontalGap;
                }
                if (z7) {
                    constraintWidget5.mRight.connect(this.mRight, i15);
                    if (z8) {
                        constraintWidget5.mLeft.connect(this.mLeft, this.mPaddingRight);
                    }
                    if (i8 > 0) {
                        this.mRight.mOwner.mLeft.connect(constraintWidget5.mRight, 0);
                    }
                } else {
                    constraintWidget5.mLeft.connect(this.mLeft, i15);
                    if (z8) {
                        constraintWidget5.mRight.connect(this.mRight, this.mPaddingRight);
                    }
                    if (i8 > 0) {
                        this.mLeft.mOwner.mRight.connect(constraintWidget5.mLeft, 0);
                    }
                }
                for (int i16 = 0; i16 < i9 && this.mStartIndex + i16 < Flow.this.mDisplayedWidgetsCount; i16++) {
                    ConstraintWidget constraintWidget6 = Flow.this.mDisplayedWidgets[this.mStartIndex + i16];
                    if (constraintWidget6 != null) {
                        if (i16 == 0) {
                            constraintWidget6.connect(constraintWidget6.mTop, this.mTop, this.mPaddingTop);
                            int i17 = Flow.this.mVerticalStyle;
                            float f10 = Flow.this.mVerticalBias;
                            if (this.mStartIndex == 0 && Flow.this.mFirstVerticalStyle != -1) {
                                i17 = Flow.this.mFirstVerticalStyle;
                                f10 = Flow.this.mFirstVerticalBias;
                            } else if (z8 && Flow.this.mLastVerticalStyle != -1) {
                                i17 = Flow.this.mLastVerticalStyle;
                                f10 = Flow.this.mLastVerticalBias;
                            }
                            constraintWidget6.setVerticalChainStyle(i17);
                            constraintWidget6.setVerticalBiasPercent(f10);
                        }
                        if (i16 == i9 - 1) {
                            constraintWidget6.connect(constraintWidget6.mBottom, this.mBottom, this.mPaddingBottom);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.mTop.connect(constraintWidget4.mBottom, Flow.this.mVerticalGap);
                            if (i16 == i11) {
                                constraintWidget6.mTop.setGoneMargin(this.mPaddingTop);
                            }
                            constraintWidget4.mBottom.connect(constraintWidget6.mTop, 0);
                            if (i16 == i12 + 1) {
                                constraintWidget4.mBottom.setGoneMargin(this.mPaddingBottom);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (z7) {
                                int i18 = Flow.this.mHorizontalAlign;
                                if (i18 == 0) {
                                    constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                                } else if (i18 == 1) {
                                    constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                } else if (i18 == 2) {
                                    constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                    constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                                }
                            } else {
                                int i19 = Flow.this.mHorizontalAlign;
                                if (i19 == 0) {
                                    constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                } else if (i19 == 1) {
                                    constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                                } else if (i19 == 2) {
                                    if (z9) {
                                        constraintWidget6.mLeft.connect(this.mLeft, this.mPaddingLeft);
                                        constraintWidget6.mRight.connect(this.mRight, this.mPaddingRight);
                                    } else {
                                        constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                        constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                                    }
                                }
                                constraintWidget4 = constraintWidget6;
                            }
                        }
                        constraintWidget4 = constraintWidget6;
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.mBiggest;
            constraintWidget7.setVerticalChainStyle(Flow.this.mVerticalStyle);
            int i20 = this.mPaddingTop;
            if (i8 > 0) {
                i20 += Flow.this.mVerticalGap;
            }
            constraintWidget7.mTop.connect(this.mTop, i20);
            if (z8) {
                constraintWidget7.mBottom.connect(this.mBottom, this.mPaddingBottom);
            }
            if (i8 > 0) {
                this.mTop.mOwner.mBottom.connect(constraintWidget7.mTop, 0);
            }
            if (Flow.this.mVerticalAlign == 3 && !constraintWidget7.hasBaseline()) {
                for (int i21 = 0; i21 < i9; i21++) {
                    int i22 = z7 ? (i9 - 1) - i21 : i21;
                    if (this.mStartIndex + i22 >= Flow.this.mDisplayedWidgetsCount) {
                        break;
                    }
                    constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i22];
                    if (constraintWidget.hasBaseline()) {
                        break;
                    }
                }
            }
            constraintWidget = constraintWidget7;
            int i23 = 0;
            while (i23 < i9) {
                int i24 = z7 ? (i9 - 1) - i23 : i23;
                if (this.mStartIndex + i24 >= Flow.this.mDisplayedWidgetsCount) {
                    return;
                }
                ConstraintWidget constraintWidget8 = Flow.this.mDisplayedWidgets[this.mStartIndex + i24];
                if (constraintWidget8 == null) {
                    constraintWidget8 = constraintWidget4;
                } else {
                    if (i23 == 0) {
                        constraintWidget8.connect(constraintWidget8.mLeft, this.mLeft, this.mPaddingLeft);
                    }
                    if (i24 == 0) {
                        int i25 = Flow.this.mHorizontalStyle;
                        float f11 = Flow.this.mHorizontalBias;
                        if (z7) {
                            f11 = 1.0f - f11;
                        }
                        if (this.mStartIndex == 0 && Flow.this.mFirstHorizontalStyle != -1) {
                            i25 = Flow.this.mFirstHorizontalStyle;
                            if (z7) {
                                f9 = Flow.this.mFirstHorizontalBias;
                                f8 = 1.0f - f9;
                                f11 = f8;
                            } else {
                                f8 = Flow.this.mFirstHorizontalBias;
                                f11 = f8;
                            }
                        } else if (z8 && Flow.this.mLastHorizontalStyle != -1) {
                            i25 = Flow.this.mLastHorizontalStyle;
                            if (z7) {
                                f9 = Flow.this.mLastHorizontalBias;
                                f8 = 1.0f - f9;
                                f11 = f8;
                            } else {
                                f8 = Flow.this.mLastHorizontalBias;
                                f11 = f8;
                            }
                        }
                        constraintWidget8.setHorizontalChainStyle(i25);
                        constraintWidget8.setHorizontalBiasPercent(f11);
                    }
                    if (i23 == i9 - 1) {
                        constraintWidget8.connect(constraintWidget8.mRight, this.mRight, this.mPaddingRight);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.mLeft.connect(constraintWidget4.mRight, Flow.this.mHorizontalGap);
                        if (i23 == i11) {
                            constraintWidget8.mLeft.setGoneMargin(this.mPaddingLeft);
                        }
                        constraintWidget4.mRight.connect(constraintWidget8.mLeft, 0);
                        if (i23 == i12 + 1) {
                            constraintWidget4.mRight.setGoneMargin(this.mPaddingRight);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        if (Flow.this.mVerticalAlign == 3 && constraintWidget.hasBaseline() && constraintWidget8 != constraintWidget && constraintWidget8.hasBaseline()) {
                            constraintWidget8.mBaseline.connect(constraintWidget.mBaseline, 0);
                        } else {
                            int i26 = Flow.this.mVerticalAlign;
                            if (i26 == 0) {
                                constraintWidget8.mTop.connect(constraintWidget7.mTop, 0);
                            } else if (i26 == 1) {
                                constraintWidget8.mBottom.connect(constraintWidget7.mBottom, 0);
                            } else if (z9) {
                                constraintWidget8.mTop.connect(this.mTop, this.mPaddingTop);
                                constraintWidget8.mBottom.connect(this.mBottom, this.mPaddingBottom);
                            } else {
                                constraintWidget8.mTop.connect(constraintWidget7.mTop, 0);
                                constraintWidget8.mBottom.connect(constraintWidget7.mBottom, 0);
                            }
                        }
                        i23++;
                        constraintWidget4 = constraintWidget8;
                    }
                }
                i23++;
                constraintWidget4 = constraintWidget8;
            }
        }

        public int getHeight() {
            return this.mOrientation == 1 ? this.mHeight - Flow.this.mVerticalGap : this.mHeight;
        }

        public int getWidth() {
            return this.mOrientation == 0 ? this.mWidth - Flow.this.mHorizontalGap : this.mWidth;
        }

        public void measureMatchConstraints(int i8) {
            int i9 = this.mNbMatchConstraintsWidgets;
            if (i9 == 0) {
                return;
            }
            int i10 = this.mCount;
            int i11 = i8 / i9;
            for (int i12 = 0; i12 < i10 && this.mStartIndex + i12 < Flow.this.mDisplayedWidgetsCount; i12++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i12];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i11, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i11);
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i8) {
            this.mStartIndex = i8;
        }

        public void setup(int i8, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i9, int i10, int i11, int i12, int i13) {
            this.mOrientation = i8;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i9;
            this.mPaddingTop = i10;
            this.mPaddingRight = i11;
            this.mPaddingBottom = i12;
            this.mMax = i13;
        }
    }

    private void createAlignedConstraints(boolean z7) {
        ConstraintWidget constraintWidget;
        float f8;
        int i8;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i9 = 0; i9 < this.mDisplayedWidgetsCount; i9++) {
            this.mDisplayedWidgets[i9].resetAnchors();
        }
        int[] iArr = this.mAlignedDimensions;
        int i10 = iArr[0];
        int i11 = iArr[1];
        float f9 = this.mHorizontalBias;
        ConstraintWidget constraintWidget2 = null;
        int i12 = 0;
        while (i12 < i10) {
            if (z7) {
                i8 = (i10 - i12) - 1;
                f8 = 1.0f - this.mHorizontalBias;
            } else {
                f8 = f9;
                i8 = i12;
            }
            ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i8];
            if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                if (i12 == 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                    constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                    constraintWidget3.setHorizontalBiasPercent(f8);
                }
                if (i12 == i10 - 1) {
                    constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                }
                if (i12 > 0 && constraintWidget2 != null) {
                    constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                    constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i12++;
            f9 = f8;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i13];
            if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                if (i13 == 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                    constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                    constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                }
                if (i13 == i11 - 1) {
                    constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i13 > 0 && constraintWidget2 != null) {
                    constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                    constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = (i15 * i10) + i14;
                if (this.mOrientation == 1) {
                    i16 = (i14 * i11) + i15;
                }
                ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                if (i16 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i16]) != null && constraintWidget.getVisibility() != 8) {
                    ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i14];
                    ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i15];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                        constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                        constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetHeight(ConstraintWidget constraintWidget, int i8) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i9 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 2) {
                int i10 = (int) (constraintWidget.mMatchConstraintPercentHeight * i8);
                if (i10 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i10);
                }
                return i10;
            }
            if (i9 == 1) {
                return constraintWidget.getHeight();
            }
            if (i9 == 3) {
                return (int) ((constraintWidget.getWidth() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetWidth(ConstraintWidget constraintWidget, int i8) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i9 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 2) {
                int i10 = (int) (constraintWidget.mMatchConstraintPercentWidth * i8);
                if (i10 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i10, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i10;
            }
            if (i9 == 1) {
                return constraintWidget.getWidth();
            }
            if (i9 == 3) {
                return (int) ((constraintWidget.getHeight() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void measureAligned(ConstraintWidget[] constraintWidgetArr, int i8, int i9, int i10, int[] iArr) {
        int i11;
        int i12;
        boolean z7;
        ConstraintWidget constraintWidget;
        if (i9 == 0) {
            int i13 = this.mMaxElementsWrap;
            if (i13 <= 0) {
                i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i8; i15++) {
                    if (i15 > 0) {
                        i14 += this.mHorizontalGap;
                    }
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i15];
                    if (constraintWidget2 != null) {
                        i14 += getWidgetWidth(constraintWidget2, i10);
                        if (i14 > i10) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            i12 = i13;
            i11 = 0;
        } else {
            i11 = this.mMaxElementsWrap;
            if (i11 <= 0) {
                i11 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < i8; i17++) {
                    if (i17 > 0) {
                        i16 += this.mVerticalGap;
                    }
                    ConstraintWidget constraintWidget3 = constraintWidgetArr[i17];
                    if (constraintWidget3 != null) {
                        i16 += getWidgetHeight(constraintWidget3, i10);
                        if (i16 > i10) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            i12 = 0;
        }
        if (this.mAlignedDimensions == null) {
            this.mAlignedDimensions = new int[2];
        }
        if ((i11 != 0 || i9 != 1) && (i12 != 0 || i9 != 0)) {
            z7 = false;
            while (!z7) {
                if (i9 == 0) {
                    i11 = (int) Math.ceil(i8 / i12);
                } else {
                    i12 = (int) Math.ceil(i8 / i11);
                }
                ConstraintWidget[] constraintWidgetArr2 = this.mAlignedBiggestElementsInCols;
                if (constraintWidgetArr2 == null || constraintWidgetArr2.length < i12) {
                    this.mAlignedBiggestElementsInCols = new ConstraintWidget[i12];
                } else {
                    Arrays.fill(constraintWidgetArr2, (Object) null);
                }
                ConstraintWidget[] constraintWidgetArr3 = this.mAlignedBiggestElementsInRows;
                if (constraintWidgetArr3 == null || constraintWidgetArr3.length < i11) {
                    this.mAlignedBiggestElementsInRows = new ConstraintWidget[i11];
                } else {
                    Arrays.fill(constraintWidgetArr3, (Object) null);
                }
                for (int i18 = 0; i18 < i12; i18++) {
                    for (int i19 = 0; i19 < i11; i19++) {
                        int i20 = (i19 * i12) + i18;
                        if (i9 == 1) {
                            i20 = (i18 * i11) + i19;
                        }
                        if (i20 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i20]) != null) {
                            int widgetWidth = getWidgetWidth(constraintWidget, i10);
                            ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInCols[i18];
                            if (constraintWidget4 == null || constraintWidget4.getWidth() < widgetWidth) {
                                this.mAlignedBiggestElementsInCols[i18] = constraintWidget;
                            }
                            int widgetHeight = getWidgetHeight(constraintWidget, i10);
                            ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInRows[i19];
                            if (constraintWidget5 == null || constraintWidget5.getHeight() < widgetHeight) {
                                this.mAlignedBiggestElementsInRows[i19] = constraintWidget;
                            }
                        }
                    }
                }
                int i21 = 0;
                for (int i22 = 0; i22 < i12; i22++) {
                    ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInCols[i22];
                    if (constraintWidget6 != null) {
                        if (i22 > 0) {
                            i21 += this.mHorizontalGap;
                        }
                        i21 += getWidgetWidth(constraintWidget6, i10);
                    }
                }
                int i23 = 0;
                for (int i24 = 0; i24 < i11; i24++) {
                    ConstraintWidget constraintWidget7 = this.mAlignedBiggestElementsInRows[i24];
                    if (constraintWidget7 != null) {
                        if (i24 > 0) {
                            i23 += this.mVerticalGap;
                        }
                        i23 += getWidgetHeight(constraintWidget7, i10);
                    }
                }
                iArr[0] = i21;
                iArr[1] = i23;
                if (i9 != 0) {
                    if (i23 > i10 && i11 > 1) {
                        i11--;
                    }
                } else if (i21 > i10 && i12 > 1) {
                    i12--;
                }
                while (!z7) {
                }
            }
            int[] iArr2 = this.mAlignedDimensions;
            iArr2[0] = i12;
            iArr2[1] = i11;
        }
        z7 = true;
        while (!z7) {
        }
        int[] iArr22 = this.mAlignedDimensions;
        iArr22[0] = i12;
        iArr22[1] = i11;
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i8, int i9, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        int i14;
        if (i8 == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
        this.mChainList.add(widgetsList);
        if (i9 == 0) {
            i11 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < i8) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i16];
                int widgetWidth = getWidgetWidth(constraintWidget, i10);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i17 = i11;
                boolean z7 = (i15 == i10 || (this.mHorizontalGap + i15) + widgetWidth > i10) && widgetsList.mBiggest != null;
                if ((!z7 && i16 > 0 && (i14 = this.mMaxElementsWrap) > 0 && i16 % i14 == 0) || z7) {
                    widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
                    widgetsList.setStartIndex(i16);
                    this.mChainList.add(widgetsList);
                } else if (i16 > 0) {
                    i15 += this.mHorizontalGap + widgetWidth;
                    widgetsList.add(constraintWidget);
                    i16++;
                    i11 = i17;
                }
                i15 = widgetWidth;
                widgetsList.add(constraintWidget);
                i16++;
                i11 = i17;
            }
        } else {
            i11 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i8) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i19];
                int widgetHeight = getWidgetHeight(constraintWidget2, i10);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i20 = i11;
                boolean z8 = (i18 == i10 || (this.mVerticalGap + i18) + widgetHeight > i10) && widgetsList.mBiggest != null;
                if ((!z8 && i19 > 0 && (i12 = this.mMaxElementsWrap) > 0 && i19 % i12 == 0) || z8) {
                    widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
                    widgetsList.setStartIndex(i19);
                    this.mChainList.add(widgetsList);
                } else if (i19 > 0) {
                    i18 += this.mVerticalGap + widgetHeight;
                    widgetsList.add(constraintWidget2);
                    i19++;
                    i11 = i20;
                }
                i18 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i19++;
                i11 = i20;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z9 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i11 > 0 && z9) {
            for (int i21 = 0; i21 < size; i21++) {
                WidgetsList widgetsList2 = this.mChainList.get(i21);
                if (i9 == 0) {
                    widgetsList2.measureMatchConstraints(i10 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i10 - widgetsList2.getHeight());
                }
            }
        }
        int i22 = paddingTop;
        int i23 = paddingRight2;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i28 = paddingBottom2;
        while (i26 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i26);
            if (i9 == 0) {
                if (i26 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i26 + 1).mBiggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.mBiggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i29 = i24;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i30 = i25;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i13 = i26;
                widgetsList3.setup(i9, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i27, i22, i23, paddingBottom, i10);
                int max = Math.max(i30, widgetsList3.getWidth());
                i24 = i29 + widgetsList3.getHeight();
                if (i13 > 0) {
                    i24 += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                i25 = max;
                constraintAnchor7 = constraintAnchor9;
                i22 = 0;
                constraintAnchor = constraintAnchor14;
                int i31 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i28 = i31;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i32 = i24;
                int i33 = i25;
                i13 = i26;
                if (i13 < size - 1) {
                    constraintAnchor = this.mChainList.get(i13 + 1).mBiggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.mBiggest.mRight;
                widgetsList3.setup(i9, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i27, i22, paddingRight, i28, i10);
                i25 = i33 + widgetsList3.getWidth();
                int max2 = Math.max(i32, widgetsList3.getHeight());
                if (i13 > 0) {
                    i25 += this.mHorizontalGap;
                }
                i24 = max2;
                i23 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i27 = 0;
            }
            i26 = i13 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i25;
        iArr[1] = i24;
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i8, int i9, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        int i14;
        if (i8 == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
        this.mChainList.add(widgetsList);
        if (i9 == 0) {
            int i15 = 0;
            i11 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i17 < i8) {
                i15++;
                ConstraintWidget constraintWidget = constraintWidgetArr[i17];
                int widgetWidth = getWidgetWidth(constraintWidget, i10);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i18 = i11;
                boolean z7 = (i16 == i10 || (this.mHorizontalGap + i16) + widgetWidth > i10) && widgetsList.mBiggest != null;
                if ((z7 || i17 <= 0 || (i14 = this.mMaxElementsWrap) <= 0 || i15 <= i14) && !z7) {
                    i16 = i17 > 0 ? i16 + this.mHorizontalGap + widgetWidth : widgetWidth;
                } else {
                    widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
                    widgetsList.setStartIndex(i17);
                    this.mChainList.add(widgetsList);
                    i16 = widgetWidth;
                    i15 = 1;
                }
                widgetsList.add(constraintWidget);
                i17++;
                i11 = i18;
            }
        } else {
            int i19 = 0;
            i11 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i8) {
                i19++;
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i21];
                int widgetHeight = getWidgetHeight(constraintWidget2, i10);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i22 = i11;
                boolean z8 = (i20 == i10 || (this.mVerticalGap + i20) + widgetHeight > i10) && widgetsList.mBiggest != null;
                if ((z8 || i21 <= 0 || (i12 = this.mMaxElementsWrap) <= 0 || i19 <= i12) && !z8) {
                    i20 = i21 > 0 ? i20 + this.mVerticalGap + widgetHeight : widgetHeight;
                } else {
                    widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
                    widgetsList.setStartIndex(i21);
                    this.mChainList.add(widgetsList);
                    i20 = widgetHeight;
                    i19 = 1;
                }
                widgetsList.add(constraintWidget2);
                i21++;
                i11 = i22;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z9 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i11 > 0 && z9) {
            for (int i23 = 0; i23 < size; i23++) {
                WidgetsList widgetsList2 = this.mChainList.get(i23);
                if (i9 == 0) {
                    widgetsList2.measureMatchConstraints(i10 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i10 - widgetsList2.getHeight());
                }
            }
        }
        int i24 = paddingTop;
        int i25 = paddingRight2;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i30 = paddingBottom2;
        while (i28 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i28);
            if (i9 == 0) {
                if (i28 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i28 + 1).mBiggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.mBiggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i31 = i26;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i32 = i27;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i13 = i28;
                widgetsList3.setup(i9, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i29, i24, i25, paddingBottom, i10);
                int max = Math.max(i32, widgetsList3.getWidth());
                i26 = i31 + widgetsList3.getHeight();
                if (i13 > 0) {
                    i26 += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                i27 = max;
                constraintAnchor7 = constraintAnchor9;
                i24 = 0;
                constraintAnchor = constraintAnchor14;
                int i33 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i30 = i33;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i34 = i26;
                int i35 = i27;
                i13 = i28;
                if (i13 < size - 1) {
                    constraintAnchor = this.mChainList.get(i13 + 1).mBiggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.mBiggest.mRight;
                widgetsList3.setup(i9, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i29, i24, paddingRight, i30, i10);
                i27 = i35 + widgetsList3.getWidth();
                int max2 = Math.max(i34, widgetsList3.getHeight());
                if (i13 > 0) {
                    i27 += this.mHorizontalGap;
                }
                i26 = max2;
                i25 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i29 = 0;
            }
            i28 = i13 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i27;
        iArr[1] = i26;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i8, int i9, int i10, int[] iArr) {
        WidgetsList widgetsList;
        if (i8 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList = widgetsList2;
            widgetsList.setup(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i10);
        }
        for (int i11 = 0; i11 < i8; i11++) {
            widgetsList.add(constraintWidgetArr[i11]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z7) {
        super.addToSolver(linearSystem, z7);
        boolean z8 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i8 = this.mWrapMode;
        if (i8 != 0) {
            if (i8 == 1) {
                int size = this.mChainList.size();
                int i9 = 0;
                while (i9 < size) {
                    this.mChainList.get(i9).createConstraints(z8, i9, i9 == size + (-1));
                    i9++;
                }
            } else if (i8 == 2) {
                createAlignedConstraints(z8);
            } else if (i8 == 3) {
                int size2 = this.mChainList.size();
                int i10 = 0;
                while (i10 < size2) {
                    this.mChainList.get(i10).createConstraints(z8, i10, i10 == size2 + (-1));
                    i10++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z8, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measure(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int[] iArr;
        boolean z7;
        char c8;
        if (this.mWidgetsCount > 0 && !measureChildren()) {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr2 = new int[2];
        int i14 = (i9 - paddingLeft) - paddingRight;
        int i15 = this.mOrientation;
        if (i15 == 1) {
            i14 = (i11 - paddingTop) - paddingBottom;
        }
        int i16 = i14;
        if (i15 == 0) {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        } else {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i12 = this.mWidgetsCount;
            if (i17 >= i12) {
                break;
            }
            if (this.mWidgets[i17].getVisibility() == 8) {
                i18++;
            }
            i17++;
        }
        if (i18 > 0) {
            constraintWidgetArr = new ConstraintWidget[i12 - i18];
            int i19 = 0;
            for (int i20 = 0; i20 < this.mWidgetsCount; i20++) {
                ConstraintWidget constraintWidget = this.mWidgets[i20];
                if (constraintWidget.getVisibility() != 8) {
                    constraintWidgetArr[i19] = constraintWidget;
                    i19++;
                }
            }
            i13 = i19;
        } else {
            i13 = i12;
        }
        this.mDisplayedWidgets = constraintWidgetArr;
        this.mDisplayedWidgetsCount = i13;
        int i21 = this.mWrapMode;
        if (i21 == 0) {
            iArr = iArr2;
            z7 = true;
            measureNoWrap(constraintWidgetArr, i13, this.mOrientation, i16, iArr2);
        } else if (i21 == 1) {
            iArr = iArr2;
            z7 = true;
            measureChainWrap(constraintWidgetArr, i13, this.mOrientation, i16, iArr2);
        } else if (i21 == 2) {
            iArr = iArr2;
            z7 = true;
            measureAligned(constraintWidgetArr, i13, this.mOrientation, i16, iArr2);
        } else {
            if (i21 != 3) {
                iArr = iArr2;
                c8 = 0;
                z7 = true;
                int i22 = iArr[c8] + paddingLeft + paddingRight;
                int i23 = iArr[z7 ? 1 : 0] + paddingTop + paddingBottom;
                if (i8 != 1073741824) {
                    i22 = i9;
                } else if (i8 == Integer.MIN_VALUE) {
                    i22 = Math.min(i22, i9);
                } else if (i8 != 0) {
                    i22 = 0;
                }
                if (i10 != 1073741824) {
                    i23 = i11;
                } else if (i10 == Integer.MIN_VALUE) {
                    i23 = Math.min(i23, i11);
                } else if (i10 != 0) {
                    i23 = 0;
                }
                setMeasure(i22, i23);
                setWidth(i22);
                setHeight(i23);
                if (this.mWidgetsCount <= 0) {
                    z7 = false;
                }
                needsCallbackFromSolver(z7);
            }
            z7 = true;
            iArr = iArr2;
            measureChainWrap_new(constraintWidgetArr, i13, this.mOrientation, i16, iArr2);
        }
        c8 = 0;
        int i222 = iArr[c8] + paddingLeft + paddingRight;
        int i232 = iArr[z7 ? 1 : 0] + paddingTop + paddingBottom;
        if (i8 != 1073741824) {
        }
        if (i10 != 1073741824) {
        }
        setMeasure(i222, i232);
        setWidth(i222);
        setHeight(i232);
        if (this.mWidgetsCount <= 0) {
        }
        needsCallbackFromSolver(z7);
    }

    public void setFirstHorizontalBias(float f8) {
        this.mFirstHorizontalBias = f8;
    }

    public void setFirstHorizontalStyle(int i8) {
        this.mFirstHorizontalStyle = i8;
    }

    public void setFirstVerticalBias(float f8) {
        this.mFirstVerticalBias = f8;
    }

    public void setFirstVerticalStyle(int i8) {
        this.mFirstVerticalStyle = i8;
    }

    public void setHorizontalAlign(int i8) {
        this.mHorizontalAlign = i8;
    }

    public void setHorizontalBias(float f8) {
        this.mHorizontalBias = f8;
    }

    public void setHorizontalGap(int i8) {
        this.mHorizontalGap = i8;
    }

    public void setHorizontalStyle(int i8) {
        this.mHorizontalStyle = i8;
    }

    public void setLastHorizontalBias(float f8) {
        this.mLastHorizontalBias = f8;
    }

    public void setLastHorizontalStyle(int i8) {
        this.mLastHorizontalStyle = i8;
    }

    public void setLastVerticalBias(float f8) {
        this.mLastVerticalBias = f8;
    }

    public void setLastVerticalStyle(int i8) {
        this.mLastVerticalStyle = i8;
    }

    public void setMaxElementsWrap(int i8) {
        this.mMaxElementsWrap = i8;
    }

    public void setOrientation(int i8) {
        this.mOrientation = i8;
    }

    public void setVerticalAlign(int i8) {
        this.mVerticalAlign = i8;
    }

    public void setVerticalBias(float f8) {
        this.mVerticalBias = f8;
    }

    public void setVerticalGap(int i8) {
        this.mVerticalGap = i8;
    }

    public void setVerticalStyle(int i8) {
        this.mVerticalStyle = i8;
    }

    public void setWrapMode(int i8) {
        this.mWrapMode = i8;
    }
}
