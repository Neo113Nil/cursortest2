package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ChainRun extends WidgetRun {
    private int mChainStyle;
    ArrayList<WidgetRun> mWidgets;

    public ChainRun(ConstraintWidget constraintWidget, int i8) {
        super(constraintWidget);
        this.mWidgets = new ArrayList<>();
        this.orientation = i8;
        build();
    }

    private void build() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.mWidget;
        ConstraintWidget previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        while (true) {
            ConstraintWidget constraintWidget3 = previousChainMember;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
            }
        }
        this.mWidget = constraintWidget;
        this.mWidgets.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.mWidgets.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        Iterator<WidgetRun> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i8 = this.orientation;
            if (i8 == 0) {
                next.mWidget.horizontalChainRun = this;
            } else if (i8 == 1) {
                next.mWidget.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.mWidget.getParent()).isRtl() && this.mWidgets.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.mWidgets;
            this.mWidget = arrayList.get(arrayList.size() - 1).mWidget;
        }
        this.mChainStyle = this.orientation == 0 ? this.mWidget.getHorizontalChainStyle() : this.mWidget.getVerticalChainStyle();
    }

    private ConstraintWidget getFirstVisibleWidget() {
        for (int i8 = 0; i8 < this.mWidgets.size(); i8++) {
            WidgetRun widgetRun = this.mWidgets.get(i8);
            if (widgetRun.mWidget.getVisibility() != 8) {
                return widgetRun.mWidget;
            }
        }
        return null;
    }

    private ConstraintWidget getLastVisibleWidget() {
        for (int size = this.mWidgets.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.mWidgets.get(size);
            if (widgetRun.mWidget.getVisibility() != 8) {
                return widgetRun.mWidget;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void apply() {
        Iterator<WidgetRun> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
        int size = this.mWidgets.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.mWidgets.get(0).mWidget;
        ConstraintWidget constraintWidget2 = this.mWidgets.get(size - 1).mWidget;
        if (this.orientation == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target = getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
            if (firstVisibleWidget != null) {
                margin = firstVisibleWidget.mLeft.getMargin();
            }
            if (target != null) {
                addTarget(this.start, target, margin);
            }
            DependencyNode target2 = getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
            if (lastVisibleWidget != null) {
                margin2 = lastVisibleWidget.mRight.getMargin();
            }
            if (target2 != null) {
                addTarget(this.end, target2, -margin2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
            if (firstVisibleWidget2 != null) {
                margin3 = firstVisibleWidget2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            DependencyNode target4 = getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
            if (lastVisibleWidget2 != null) {
                margin4 = lastVisibleWidget2.mBottom.getMargin();
            }
            if (target4 != null) {
                addTarget(this.end, target4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for (int i8 = 0; i8 < this.mWidgets.size(); i8++) {
            this.mWidgets.get(i8).applyToWidget();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void clear() {
        this.mRunGroup = null;
        Iterator<WidgetRun> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        int size = this.mWidgets.size();
        long j8 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            j8 = j8 + r4.start.mMargin + this.mWidgets.get(i8).getWrapDimension() + r4.end.mMargin;
        }
        return j8;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean supportsWrapComputation() {
        int size = this.mWidgets.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!this.mWidgets.get(i8).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        Iterator<WidgetRun> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0400, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update(Dependency dependency) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f8;
        boolean z7;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f9;
        boolean z8;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        if (this.start.resolved && this.end.resolved) {
            ConstraintWidget parent = this.mWidget.getParent();
            boolean isRtl = parent instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer) parent).isRtl() : false;
            int i23 = this.end.value - this.start.value;
            int size = this.mWidgets.size();
            int i24 = 0;
            while (true) {
                i8 = -1;
                i9 = 8;
                if (i24 >= size) {
                    i24 = -1;
                    break;
                } else if (this.mWidgets.get(i24).mWidget.getVisibility() != 8) {
                    break;
                } else {
                    i24++;
                }
            }
            int i25 = size - 1;
            int i26 = i25;
            while (true) {
                if (i26 < 0) {
                    break;
                }
                if (this.mWidgets.get(i26).mWidget.getVisibility() != 8) {
                    i8 = i26;
                    break;
                }
                i26--;
            }
            int i27 = 0;
            while (i27 < 2) {
                int i28 = 0;
                i11 = 0;
                i12 = 0;
                int i29 = 0;
                f8 = 0.0f;
                while (i28 < size) {
                    WidgetRun widgetRun = this.mWidgets.get(i28);
                    if (widgetRun.mWidget.getVisibility() != i9) {
                        i29++;
                        if (i28 > 0 && i28 >= i24) {
                            i11 += widgetRun.start.mMargin;
                        }
                        DimensionDependency dimensionDependency = widgetRun.mDimension;
                        int i30 = dimensionDependency.value;
                        boolean z9 = widgetRun.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z9) {
                            int i31 = this.orientation;
                            if (i31 == 0 && !widgetRun.mWidget.mHorizontalRun.mDimension.resolved) {
                                return;
                            }
                            if (i31 == 1 && !widgetRun.mWidget.mVerticalRun.mDimension.resolved) {
                                return;
                            } else {
                                i21 = i30;
                            }
                        } else {
                            i21 = i30;
                            if (widgetRun.matchConstraintsType == 1 && i27 == 0) {
                                i22 = dimensionDependency.wrapValue;
                                i12++;
                            } else if (dimensionDependency.resolved) {
                                i22 = i21;
                            }
                            z9 = true;
                            if (z9) {
                                i12++;
                                float f10 = widgetRun.mWidget.mWeight[this.orientation];
                                if (f10 >= 0.0f) {
                                    f8 += f10;
                                }
                            } else {
                                i11 += i22;
                            }
                            if (i28 < i25 && i28 < i8) {
                                i11 += -widgetRun.end.mMargin;
                            }
                        }
                        i22 = i21;
                        if (z9) {
                        }
                        if (i28 < i25) {
                            i11 += -widgetRun.end.mMargin;
                        }
                    }
                    i28++;
                    i9 = 8;
                }
                if (i11 < i23 || i12 == 0) {
                    i10 = i29;
                    break;
                } else {
                    i27++;
                    i9 = 8;
                }
            }
            i10 = 0;
            i11 = 0;
            i12 = 0;
            f8 = 0.0f;
            int i32 = this.start.value;
            if (isRtl) {
                i32 = this.end.value;
            }
            if (i11 > i23) {
                i32 = isRtl ? i32 + ((int) (((i11 - i23) / 2.0f) + 0.5f)) : i32 - ((int) (((i11 - i23) / 2.0f) + 0.5f));
            }
            if (i12 > 0) {
                float f11 = i23 - i11;
                int i33 = (int) ((f11 / i12) + 0.5f);
                int i34 = 0;
                int i35 = 0;
                while (i34 < size) {
                    WidgetRun widgetRun2 = this.mWidgets.get(i34);
                    int i36 = i33;
                    int i37 = i11;
                    if (widgetRun2.mWidget.getVisibility() != 8 && widgetRun2.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        DimensionDependency dimensionDependency2 = widgetRun2.mDimension;
                        if (!dimensionDependency2.resolved) {
                            if (f8 > 0.0f) {
                                i16 = i32;
                                i17 = (int) (((widgetRun2.mWidget.mWeight[this.orientation] * f11) / f8) + 0.5f);
                            } else {
                                i16 = i32;
                                i17 = i36;
                            }
                            if (this.orientation == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.mWidget;
                                f9 = f11;
                                i19 = constraintWidget.mMatchConstraintMaxWidth;
                                i18 = constraintWidget.mMatchConstraintMinWidth;
                                z8 = isRtl;
                            } else {
                                f9 = f11;
                                ConstraintWidget constraintWidget2 = widgetRun2.mWidget;
                                int i38 = constraintWidget2.mMatchConstraintMaxHeight;
                                z8 = isRtl;
                                i18 = constraintWidget2.mMatchConstraintMinHeight;
                                i19 = i38;
                            }
                            i20 = i10;
                            int max = Math.max(i18, widgetRun2.matchConstraintsType == 1 ? Math.min(i17, dimensionDependency2.wrapValue) : i17);
                            if (i19 > 0) {
                                max = Math.min(i19, max);
                            }
                            if (max != i17) {
                                i35++;
                                i17 = max;
                            }
                            widgetRun2.mDimension.resolve(i17);
                            i34++;
                            i33 = i36;
                            i11 = i37;
                            i32 = i16;
                            f11 = f9;
                            isRtl = z8;
                            i10 = i20;
                        }
                    }
                    z8 = isRtl;
                    i20 = i10;
                    i16 = i32;
                    f9 = f11;
                    i34++;
                    i33 = i36;
                    i11 = i37;
                    i32 = i16;
                    f11 = f9;
                    isRtl = z8;
                    i10 = i20;
                }
                z7 = isRtl;
                i13 = i10;
                i14 = i32;
                int i39 = i11;
                if (i35 > 0) {
                    i12 -= i35;
                    i11 = 0;
                    for (int i40 = 0; i40 < size; i40++) {
                        WidgetRun widgetRun3 = this.mWidgets.get(i40);
                        if (widgetRun3.mWidget.getVisibility() != 8) {
                            if (i40 > 0 && i40 >= i24) {
                                i11 += widgetRun3.start.mMargin;
                            }
                            i11 += widgetRun3.mDimension.value;
                            if (i40 < i25 && i40 < i8) {
                                i11 += -widgetRun3.end.mMargin;
                            }
                        }
                    }
                } else {
                    i11 = i39;
                }
                i15 = 2;
                if (this.mChainStyle == 2 && i35 == 0) {
                    this.mChainStyle = 0;
                }
            } else {
                z7 = isRtl;
                i13 = i10;
                i14 = i32;
                i15 = 2;
            }
            if (i11 > i23) {
                this.mChainStyle = i15;
            }
            if (i13 > 0 && i12 == 0 && i24 == i8) {
                this.mChainStyle = i15;
            }
            int i41 = this.mChainStyle;
            if (i41 == 1) {
                int i42 = i13;
                int i43 = i42 > 1 ? (i23 - i11) / (i42 - 1) : i42 == 1 ? (i23 - i11) / 2 : 0;
                if (i12 > 0) {
                    i43 = 0;
                }
                int i44 = i14;
                for (int i45 = 0; i45 < size; i45++) {
                    WidgetRun widgetRun4 = this.mWidgets.get(z7 ? size - (i45 + 1) : i45);
                    if (widgetRun4.mWidget.getVisibility() == 8) {
                        widgetRun4.start.resolve(i44);
                        widgetRun4.end.resolve(i44);
                    } else {
                        if (i45 > 0) {
                            i44 = z7 ? i44 - i43 : i44 + i43;
                        }
                        if (i45 > 0 && i45 >= i24) {
                            i44 = z7 ? i44 - widgetRun4.start.mMargin : i44 + widgetRun4.start.mMargin;
                        }
                        if (z7) {
                            widgetRun4.end.resolve(i44);
                        } else {
                            widgetRun4.start.resolve(i44);
                        }
                        DimensionDependency dimensionDependency3 = widgetRun4.mDimension;
                        int i46 = dimensionDependency3.value;
                        if (widgetRun4.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.matchConstraintsType == 1) {
                            i46 = dimensionDependency3.wrapValue;
                        }
                        i44 = z7 ? i44 - i46 : i44 + i46;
                        if (z7) {
                            widgetRun4.start.resolve(i44);
                        } else {
                            widgetRun4.end.resolve(i44);
                        }
                        widgetRun4.mResolved = true;
                        if (i45 < i25 && i45 < i8) {
                            i44 = z7 ? i44 - (-widgetRun4.end.mMargin) : i44 + (-widgetRun4.end.mMargin);
                        }
                    }
                }
                return;
            }
            int i47 = i13;
            if (i41 == 0) {
                int i48 = (i23 - i11) / (i47 + 1);
                if (i12 > 0) {
                    i48 = 0;
                }
                int i49 = i14;
                for (int i50 = 0; i50 < size; i50++) {
                    WidgetRun widgetRun5 = this.mWidgets.get(z7 ? size - (i50 + 1) : i50);
                    if (widgetRun5.mWidget.getVisibility() == 8) {
                        widgetRun5.start.resolve(i49);
                        widgetRun5.end.resolve(i49);
                    } else {
                        int i51 = z7 ? i49 - i48 : i49 + i48;
                        if (i50 > 0 && i50 >= i24) {
                            i51 = z7 ? i51 - widgetRun5.start.mMargin : i51 + widgetRun5.start.mMargin;
                        }
                        if (z7) {
                            widgetRun5.end.resolve(i51);
                        } else {
                            widgetRun5.start.resolve(i51);
                        }
                        DimensionDependency dimensionDependency4 = widgetRun5.mDimension;
                        int i52 = dimensionDependency4.value;
                        if (widgetRun5.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.matchConstraintsType == 1) {
                            i52 = Math.min(i52, dimensionDependency4.wrapValue);
                        }
                        i49 = z7 ? i51 - i52 : i51 + i52;
                        if (z7) {
                            widgetRun5.start.resolve(i49);
                        } else {
                            widgetRun5.end.resolve(i49);
                        }
                        if (i50 < i25 && i50 < i8) {
                            i49 = z7 ? i49 - (-widgetRun5.end.mMargin) : i49 + (-widgetRun5.end.mMargin);
                        }
                    }
                }
                return;
            }
            if (i41 == 2) {
                float horizontalBiasPercent = this.orientation == 0 ? this.mWidget.getHorizontalBiasPercent() : this.mWidget.getVerticalBiasPercent();
                if (z7) {
                    horizontalBiasPercent = 1.0f - horizontalBiasPercent;
                }
                int i53 = (int) (((i23 - i11) * horizontalBiasPercent) + 0.5f);
                if (i53 < 0 || i12 > 0) {
                    i53 = 0;
                }
                int i54 = z7 ? i14 - i53 : i14 + i53;
                for (int i55 = 0; i55 < size; i55++) {
                    WidgetRun widgetRun6 = this.mWidgets.get(z7 ? size - (i55 + 1) : i55);
                    if (widgetRun6.mWidget.getVisibility() == 8) {
                        widgetRun6.start.resolve(i54);
                        widgetRun6.end.resolve(i54);
                    } else {
                        if (i55 > 0 && i55 >= i24) {
                            i54 = z7 ? i54 - widgetRun6.start.mMargin : i54 + widgetRun6.start.mMargin;
                        }
                        if (z7) {
                            widgetRun6.end.resolve(i54);
                        } else {
                            widgetRun6.start.resolve(i54);
                        }
                        DimensionDependency dimensionDependency5 = widgetRun6.mDimension;
                        int i56 = dimensionDependency5.value;
                        if (widgetRun6.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.matchConstraintsType == 1) {
                            i56 = dimensionDependency5.wrapValue;
                        }
                        i54 += i56;
                        if (z7) {
                            widgetRun6.start.resolve(i54);
                        } else {
                            widgetRun6.end.resolve(i54);
                        }
                        if (i55 < i25 && i55 < i8) {
                            i54 = z7 ? i54 - (-widgetRun6.end.mMargin) : i54 + (-widgetRun6.end.mMargin);
                        }
                    }
                }
            }
        }
    }
}
