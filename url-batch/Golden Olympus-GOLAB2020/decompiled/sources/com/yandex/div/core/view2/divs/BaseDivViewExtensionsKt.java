package com.yandex.div.core.view2.divs;

import O1.AbstractC0738b7;
import O1.AbstractC0849ha;
import O1.AbstractC1130x5;
import O1.Bc;
import O1.C0720a7;
import O1.C0754c5;
import O1.C0765cg;
import O1.C0839h0;
import O1.C0860i3;
import O1.C0867ia;
import O1.C0892k0;
import O1.C0925lf;
import O1.C0974oa;
import O1.C1127x2;
import O1.EnumC0717a4;
import O1.EnumC0770d3;
import O1.EnumC0779dc;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.G4;
import O1.H3;
import O1.Ha;
import O1.InterfaceC0752c3;
import O1.J4;
import O1.Ld;
import O1.M4;
import O1.Nb;
import O1.Ob;
import O1.Qc;
import O1.R3;
import O1.S5;
import O1.T2;
import O1.Wf;
import O1.X4;
import O1.Xb;
import O1.Y6;
import O1.Yb;
import O1.Z;
import O1.Z3;
import W1.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC1293g0;
import androidx.core.view.M;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.expression.local.ChildPathUnitCache;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.BitmapEffectHelper;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.spannable.TextVerticalAlignment;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.drawable.CircleDrawable;
import com.yandex.div.internal.drawable.RoundedRectDrawable;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import j2.AbstractC3185a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y1.AbstractC3523a;

@Metadata
/* loaded from: classes2.dex */
public abstract class BaseDivViewExtensionsKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[EnumC0779dc.values().length];
            try {
                iArr[EnumC0779dc.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0779dc.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0779dc.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC1091v2.values().length];
            try {
                iArr2[EnumC1091v2.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC1091v2.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC1091v2.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC1091v2.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC1091v2.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC1109w2.values().length];
            try {
                iArr3[EnumC1109w2.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC1109w2.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC1109w2.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Z3.values().length];
            try {
                iArr4[Z3.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[Z3.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[Z3.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[Z3.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[Z3.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[Z3.SPACE_AROUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[Z3.SPACE_BETWEEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[Z3.SPACE_EVENLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[EnumC0717a4.values().length];
            try {
                iArr5[EnumC0717a4.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[EnumC0717a4.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[EnumC0717a4.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[EnumC0717a4.SPACE_AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[EnumC0717a4.SPACE_BETWEEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[EnumC0717a4.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[EnumC0717a4.BASELINE.ordinal()] = 7;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[Y6.values().length];
            try {
                iArr6[Y6.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[Y6.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[Y6.STRETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[Y6.NO_SCALE.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[Ld.values().length];
            try {
                iArr7[Ld.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[Ld.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[Ld.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[Ld.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[EnumC0770d3.values().length];
            try {
                iArr8[EnumC0770d3.SOURCE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[EnumC0770d3.SOURCE_ATOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[EnumC0770d3.DARKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr8[EnumC0770d3.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr8[EnumC0770d3.MULTIPLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr8[EnumC0770d3.SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    public static final void applyAlignment(@NotNull View view, @Nullable EnumC1091v2 enumC1091v2, @Nullable EnumC1109w2 enumC1109w2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        applyGravity(view, evaluateGravity(enumC1091v2, enumC1109w2));
        applyBaselineAlignment(view, enumC1109w2 == EnumC1109w2.BASELINE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyAlpha(@NotNull View view, double d4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha((float) d4);
        DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
        if (divBorderSupports != null) {
            divBorderSupports.invalidateBorder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAspectRatio(AspectView aspectView, Double d4) {
        aspectView.setAspectRatio(d4 != null ? (float) d4.doubleValue() : 0.0f);
    }

    private static final void applyBaselineAlignment(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.isBaselineAligned() == z4) {
            return;
        }
        divLayoutParams.setBaselineAligned(z4);
        view.requestLayout();
    }

    public static final void applyBitmapFilters(@NotNull final View view, @NotNull BindingContext context, @NotNull final Bitmap bitmap, @Nullable final List<? extends AbstractC1130x5> list, @NotNull final Function1<? super Bitmap, Unit> actionAfterFilters) {
        int i4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(actionAfterFilters, "actionAfterFilters");
        List<? extends AbstractC1130x5> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            actionAfterFilters.invoke(bitmap);
            return;
        }
        final ExpressionResolver expressionResolver = context.getExpressionResolver();
        final BitmapEffectHelper bitmapEffectHelper = context.getDivView().getDiv2Component$div_release().getBitmapEffectHelper();
        Intrinsics.checkNotNullExpressionValue(bitmapEffectHelper, "context.divView.div2Component.bitmapEffectHelper");
        if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt$applyBitmapFilters$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    int i13;
                    view2.removeOnLayoutChangeListener(this);
                    float max = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (r4.getWidth() * max), (int) (max * bitmap.getHeight()), false);
                    for (AbstractC1130x5 abstractC1130x5 : list) {
                        if (abstractC1130x5 instanceof AbstractC1130x5.a) {
                            long longValue = ((Number) ((AbstractC1130x5.a) abstractC1130x5).c().f6074a.evaluate(expressionResolver)).longValue();
                            long j4 = longValue >> 31;
                            if (j4 == 0 || j4 == -1) {
                                i13 = (int) longValue;
                            } else {
                                KAssert kAssert = KAssert.INSTANCE;
                                if (Assert.isEnabled()) {
                                    Assert.fail("Unable convert '" + longValue + "' to Int");
                                }
                                i13 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                            }
                            Integer valueOf = Integer.valueOf(i13);
                            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                            createScaledBitmap = bitmapEffectHelper.blurBitmap(createScaledBitmap, BaseDivViewExtensionsKt.dpToPx(valueOf, displayMetrics));
                        } else if ((abstractC1130x5 instanceof AbstractC1130x5.d) && ViewsKt.isLayoutRtl(view)) {
                            createScaledBitmap = bitmapEffectHelper.mirrorBitmap$div_release(createScaledBitmap);
                        }
                    }
                    actionAfterFilters.invoke(createScaledBitmap);
                }
            });
            return;
        }
        float max = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * max), (int) (max * bitmap.getHeight()), false);
        for (AbstractC1130x5 abstractC1130x5 : list) {
            if (abstractC1130x5 instanceof AbstractC1130x5.a) {
                long longValue = ((Number) ((AbstractC1130x5.a) abstractC1130x5).c().f6074a.evaluate(expressionResolver)).longValue();
                long j4 = longValue >> 31;
                if (j4 == 0 || j4 == -1) {
                    i4 = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue + "' to Int");
                    }
                    i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                Integer valueOf = Integer.valueOf(i4);
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                createScaledBitmap = bitmapEffectHelper.blurBitmap(createScaledBitmap, dpToPx(valueOf, displayMetrics));
            } else if ((abstractC1130x5 instanceof AbstractC1130x5.d) && ViewsKt.isLayoutRtl(view)) {
                createScaledBitmap = bitmapEffectHelper.mirrorBitmap$div_release(createScaledBitmap);
            }
        }
        actionAfterFilters.invoke(createScaledBitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyClipChildren(@NotNull ViewGroup viewGroup, boolean z4) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.setNeedClipping(z4);
        }
        ViewParent parent = viewGroup.getParent();
        if (z4 || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).setClipChildren(false);
    }

    public static final void applyDivActions(@NotNull View view, @NotNull BindingContext context, @Nullable C0892k0 c0892k0, @Nullable List<C0892k0> list, @Nullable List<C0892k0> list2, @Nullable List<C0892k0> list3, @Nullable List<C0892k0> list4, @Nullable List<C0892k0> list5, @Nullable List<C0892k0> list6, @Nullable List<C0892k0> list7, @NotNull C1127x2 actionAnimation, @Nullable C0839h0 c0839h0, @NotNull Expression<Boolean> captureFocusOnAction) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionAnimation, "actionAnimation");
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "captureFocusOnAction");
        DivActionBinder actionBinder = context.getDivView().getDiv2Component$div_release().getActionBinder();
        Intrinsics.checkNotNullExpressionValue(actionBinder, "context.divView.div2Component.actionBinder");
        List<C0892k0> list8 = list;
        if (list8 == null || list8.isEmpty()) {
            list = c0892k0 != null ? CollectionsKt.listOf(c0892k0) : null;
        }
        actionBinder.bindDivActions(context, view, list, list2, list3, list4, list5, list6, list7, actionAnimation, c0839h0, captureFocusOnAction);
    }

    private static final void applyGravity(View view, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getGravity() != i4) {
                divLayoutParams.setGravity(i4);
                view.requestLayout();
                return;
            }
            return;
        }
        Log.e("DivView", "tag=" + view.getTag() + ": Can't cast " + layoutParams + " to get gravity");
    }

    public static final void applyHeight(@NotNull View view, @NotNull InterfaceC0752c3 div, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Yb height = div.getHeight();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        int layoutParamsSize = toLayoutParamsSize(height, displayMetrics, resolver, view.getLayoutParams());
        if (view.getLayoutParams().height != layoutParamsSize) {
            view.getLayoutParams().height = layoutParamsSize;
            view.requestLayout();
        }
        applyTransform(view, div.b(), resolver);
    }

    public static final void applyHorizontalWeightValue(@NotNull View view, float f4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.getHorizontalWeight() == f4) {
            return;
        }
        divLayoutParams.setHorizontalWeight(f4);
        view.requestLayout();
    }

    public static final void applyId(@NotNull View view, @Nullable String str, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(str);
        view.setId(i4);
    }

    public static final void applyMargins(@NotNull View view, @Nullable C0754c5 c0754c5, @NotNull ExpressionResolver resolver) {
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        DisplayMetrics metrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (c0754c5 != null) {
            EnumC0779dc enumC0779dc = (EnumC0779dc) c0754c5.f5856g.evaluate(resolver);
            Long l4 = (Long) c0754c5.f5852c.evaluate(resolver);
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            i4 = unitToPx(l4, metrics, enumC0779dc);
            i5 = unitToPx((Long) c0754c5.f5855f.evaluate(resolver), metrics, enumC0779dc);
            i6 = unitToPx((Long) c0754c5.f5853d.evaluate(resolver), metrics, enumC0779dc);
            i7 = unitToPx((Long) c0754c5.f5850a.evaluate(resolver), metrics, enumC0779dc);
            Expression expression = c0754c5.f5854e;
            Integer valueOf = expression != null ? Integer.valueOf(unitToPx((Long) expression.evaluate(resolver), metrics, enumC0779dc)) : null;
            Expression expression2 = c0754c5.f5851b;
            num = expression2 != null ? Integer.valueOf(unitToPx((Long) expression2.evaluate(resolver), metrics, enumC0779dc)) : null;
            r3 = valueOf;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            num = null;
        }
        if (marginLayoutParams.leftMargin == i4 && marginLayoutParams.topMargin == i5 && marginLayoutParams.rightMargin == i6 && marginLayoutParams.bottomMargin == i7 && ((r3 == null || marginLayoutParams.getMarginStart() == r3.intValue()) && (num == null || marginLayoutParams.getMarginEnd() == num.intValue()))) {
            return;
        }
        marginLayoutParams.topMargin = i5;
        marginLayoutParams.bottomMargin = i7;
        if (r3 == null && num == null) {
            marginLayoutParams.leftMargin = i4;
            marginLayoutParams.rightMargin = i6;
        } else {
            marginLayoutParams.setMarginStart(r3 != null ? r3.intValue() : 0);
            marginLayoutParams.setMarginEnd(num != null ? num.intValue() : 0);
        }
        view.requestLayout();
    }

    public static final void applyMaxHeight(@NotNull View view, @Nullable C0765cg.c cVar, @NotNull ExpressionResolver resolver) {
        int i4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (cVar != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            i4 = toPx(cVar, displayMetrics, resolver);
        } else {
            i4 = Integer.MAX_VALUE;
        }
        if (divLayoutParams.getMaxHeight() != i4) {
            divLayoutParams.setMaxHeight(i4);
            view.requestLayout();
        }
    }

    public static final void applyMaxWidth(@NotNull View view, @Nullable C0765cg.c cVar, @NotNull ExpressionResolver resolver) {
        int i4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (cVar != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            i4 = toPx(cVar, displayMetrics, resolver);
        } else {
            i4 = Integer.MAX_VALUE;
        }
        if (divLayoutParams.getMaxWidth() != i4) {
            divLayoutParams.setMaxWidth(i4);
            view.requestLayout();
        }
    }

    public static final void applyMinHeight(@NotNull View view, @Nullable C0765cg.c cVar, @NotNull ExpressionResolver resolver) {
        int i4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (cVar != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            i4 = toPx(cVar, displayMetrics, resolver);
        } else {
            i4 = 0;
        }
        if (view.getMinimumHeight() != i4) {
            view.setMinimumHeight(i4);
            view.requestLayout();
        }
    }

    public static final void applyMinWidth(@NotNull View view, @Nullable C0765cg.c cVar, @NotNull ExpressionResolver resolver) {
        int i4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (cVar != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            i4 = toPx(cVar, displayMetrics, resolver);
        } else {
            i4 = 0;
        }
        if (view.getMinimumWidth() != i4) {
            view.setMinimumWidth(i4);
            view.requestLayout();
        }
    }

    public static final void applyPaddings(@NotNull View view, @Nullable C0754c5 c0754c5, @NotNull ExpressionResolver resolver) {
        int i4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (c0754c5 == null) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        DisplayMetrics metrics = view.getResources().getDisplayMetrics();
        EnumC0779dc enumC0779dc = (EnumC0779dc) c0754c5.f5856g.evaluate(resolver);
        Expression expression = c0754c5.f5854e;
        if (expression == null && c0754c5.f5851b == null) {
            long longValue = ((Number) c0754c5.f5852c.evaluate(resolver)).longValue();
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            view.setPadding(toPx(longValue, enumC0779dc, metrics), toPx(((Number) c0754c5.f5855f.evaluate(resolver)).longValue(), enumC0779dc, metrics), toPx(((Number) c0754c5.f5853d.evaluate(resolver)).longValue(), enumC0779dc, metrics), toPx(((Number) c0754c5.f5850a.evaluate(resolver)).longValue(), enumC0779dc, metrics));
            return;
        }
        if (expression != null) {
            long longValue2 = ((Number) expression.evaluate(resolver)).longValue();
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            i4 = toPx(longValue2, enumC0779dc, metrics);
        } else {
            i4 = 0;
        }
        long longValue3 = ((Number) c0754c5.f5855f.evaluate(resolver)).longValue();
        Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
        int px = toPx(longValue3, enumC0779dc, metrics);
        Expression expression2 = c0754c5.f5851b;
        view.setPaddingRelative(i4, px, expression2 != null ? toPx(((Number) expression2.evaluate(resolver)).longValue(), enumC0779dc, metrics) : 0, toPx(((Number) c0754c5.f5850a.evaluate(resolver)).longValue(), enumC0779dc, metrics));
    }

    public static final void applyTransform(@NotNull final View view, @Nullable final C0925lf c0925lf, @NotNull final ExpressionResolver resolver) {
        Expression expression;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Float valueOf = (c0925lf == null || (expression = c0925lf.f6956c) == null) ? null : Float.valueOf((float) ((Number) expression.evaluate(resolver)).doubleValue());
        if (valueOf == null) {
            view.setRotation(0.0f);
            return;
        }
        view.setRotation(valueOf.floatValue());
        if (view.getWidth() == 0 && view.getHeight() == 0) {
            M.a(view, new Runnable() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt$applyTransform$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    float pivotValue;
                    float pivotValue2;
                    View view2 = view;
                    pivotValue = BaseDivViewExtensionsKt.getPivotValue(view2, view2.getWidth(), c0925lf.f6954a, resolver);
                    view2.setPivotX(pivotValue);
                    View view3 = view;
                    pivotValue2 = BaseDivViewExtensionsKt.getPivotValue(view3, view3.getHeight(), c0925lf.f6955b, resolver);
                    view3.setPivotY(pivotValue2);
                }
            });
        } else {
            view.setPivotX(getPivotValue(view, view.getWidth(), c0925lf.f6954a, resolver));
            view.setPivotY(getPivotValue(view, view.getHeight(), c0925lf.f6955b, resolver));
        }
    }

    public static final void applyVerticalWeightValue(@NotNull View view, float f4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.getVerticalWeight() == f4) {
            return;
        }
        divLayoutParams.setVerticalWeight(f4);
        view.requestLayout();
    }

    public static final void applyWidth(@NotNull View view, @NotNull InterfaceC0752c3 div, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Yb width = div.getWidth();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        int layoutParamsSize = toLayoutParamsSize(width, displayMetrics, resolver, view.getLayoutParams());
        if (view.getLayoutParams().width != layoutParamsSize) {
            view.getLayoutParams().width = layoutParamsSize;
            view.requestLayout();
        }
        applyTransform(view, div.b(), resolver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindAspectRatio(@NotNull View view, @Nullable T2 t22, @Nullable T2 t23, @NotNull ExpressionResolver resolver) {
        Expression expression;
        Expression expression2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (view instanceof AspectView) {
            Disposable disposable = null;
            if (ExpressionsKt.equalsToConstant(t22 != null ? t22.f4859a : null, t23 != null ? t23.f4859a : null)) {
                return;
            }
            applyAspectRatio((AspectView) view, (t22 == null || (expression2 = t22.f4859a) == null) ? null : (Double) expression2.evaluate(resolver));
            if (ExpressionsKt.isConstantOrNull(t22 != null ? t22.f4859a : null) || !(view instanceof ExpressionSubscriber)) {
                return;
            }
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
            if (t22 != null && (expression = t22.f4859a) != null) {
                disposable = expression.observe(resolver, new BaseDivViewExtensionsKt$bindAspectRatio$1(view));
            }
            expressionSubscriber.addSubscription(disposable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindClipChildren(@NotNull ViewGroup viewGroup, @NotNull Expression<Boolean> newClipToBounds, @Nullable Expression<Boolean> expression, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(newClipToBounds, "newClipToBounds");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (ExpressionsKt.equalsToConstant(newClipToBounds, expression)) {
            return;
        }
        applyClipChildren(viewGroup, newClipToBounds.evaluate(resolver).booleanValue());
        if (ExpressionsKt.isConstant(newClipToBounds)) {
            return;
        }
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.addSubscription(newClipToBounds.observe(resolver, new BaseDivViewExtensionsKt$bindClipChildren$1(viewGroup)));
        }
    }

    public static final void bindItemBuilder(@NotNull H3 builder, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        builder.f2947a.observe(resolver, callback);
        ExpressionResolver itemResolver = DivCollectionExtensionsKt.getItemResolver(builder, null, resolver);
        Iterator it = builder.f2949c.iterator();
        while (it.hasNext()) {
            ((H3.c) it.next()).f2957c.observe(itemResolver, callback);
        }
    }

    public static final void bindLayoutParams(@NotNull View view, @NotNull InterfaceC0752c3 div, @NotNull ExpressionResolver resolver) {
        boolean isExpressionResolveFail;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        try {
            applyWidth(view, div, resolver);
            applyHeight(view, div, resolver);
            Expression l4 = div.l();
            EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
            Expression s4 = div.s();
            applyAlignment(view, enumC1091v2, s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null);
        } catch (ParsingException e4) {
            isExpressionResolveFail = ExpressionFallbacksHelperKt.isExpressionResolveFail(e4);
            if (!isExpressionResolveFail) {
                throw e4;
            }
        }
    }

    public static final void bindStates(@NotNull View view, @NotNull BindingContext bindingContext, @NotNull DivBinder binder) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(binder, "binder");
        traverseViewHierarchy(view, new BaseDivViewExtensionsKt$bindStates$1(binder, bindingContext));
    }

    public static final boolean canWrap(@NotNull Yb yb, @NotNull ExpressionResolver resolver) {
        Expression expression;
        Intrinsics.checkNotNullParameter(yb, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return !(yb instanceof Yb.e) || ((expression = ((Yb.e) yb).c().f5970a) != null && ((Boolean) expression.evaluate(resolver)).booleanValue());
    }

    public static final void clearFocusOnClick(@NotNull View view, @NotNull InputFocusTracker focusTracker) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(focusTracker, "focusTracker");
        if (view.isFocused() || !view.isInTouchMode()) {
            return;
        }
        focusTracker.removeFocusFromFocusedInput();
    }

    @Nullable
    public static final Function2<View, MotionEvent, Boolean> createAnimatedTouchListener(@NotNull View view, @NotNull BindingContext context, @Nullable C1127x2 c1127x2, @Nullable DivGestureListener divGestureListener) {
        GestureDetector gestureDetector;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Function2<View, MotionEvent, Unit> asTouchListener = c1127x2 != null ? UtilsKt.asTouchListener(c1127x2, context.getExpressionResolver(), view) : null;
        if (divGestureListener != null) {
            if (((divGestureListener.getOnSingleTapListener() == null && divGestureListener.getOnDoubleTapListener() == null) ? null : divGestureListener) != null) {
                gestureDetector = new GestureDetector(context.getDivView().getContext$div_release(), divGestureListener, new Handler(Looper.getMainLooper()));
                if (asTouchListener == null || gestureDetector != null) {
                    return new BaseDivViewExtensionsKt$createAnimatedTouchListener$1(asTouchListener, gestureDetector);
                }
                return null;
            }
        }
        gestureDetector = null;
        if (asTouchListener == null) {
        }
        return new BaseDivViewExtensionsKt$createAnimatedTouchListener$1(asTouchListener, gestureDetector);
    }

    @NotNull
    public static final IndicatorParams$Shape createCircle(int i4, float f4, float f5) {
        return new IndicatorParams$Shape.Circle(i4, new IndicatorParams$ItemSize.Circle(f4 * f5));
    }

    @NotNull
    public static final IndicatorParams$Shape createRoundedRectangle(int i4, float f4, float f5, float f6, float f7, @Nullable Float f8, @Nullable Integer num) {
        return new IndicatorParams$Shape.RoundedRect(i4, new IndicatorParams$ItemSize.RoundedRect(f4 * f7, f5 * f7, f6 * f7), f8 != null ? f8.floatValue() : 0.0f, num != null ? num.intValue() : 0);
    }

    public static final <T extends Number> int dpToPx(@Nullable T t4, @NotNull DisplayMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return AbstractC3185a.c(dpToPxF(t4, metrics));
    }

    public static final <T extends Number> float dpToPxF(@Nullable T t4, @NotNull DisplayMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return TypedValue.applyDimension(1, t4 != null ? t4.floatValue() : 0.0f, metrics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void drawShadow(@NotNull View view, @NotNull Canvas canvas) {
        DivBorderDrawer divBorderDrawer;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int save = canvas.save();
        try {
            canvas.translate(view.getX(), view.getY());
            canvas.rotate(view.getRotation(), view.getPivotX(), view.getPivotY());
            DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
            if (divBorderSupports != null && (divBorderDrawer = divBorderSupports.getDivBorderDrawer()) != null) {
                divBorderDrawer.drawShadow(canvas);
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public static final int evaluateGravity(@Nullable EnumC1091v2 enumC1091v2, @Nullable EnumC1109w2 enumC1109w2) {
        int i4;
        int i5 = enumC1091v2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[enumC1091v2.ordinal()];
        if (i5 == 1) {
            i4 = 3;
        } else if (i5 != 2) {
            i4 = 5;
            if (i5 != 3) {
                i4 = (i5 == 4 || i5 != 5) ? 8388611 : 8388613;
            }
        } else {
            i4 = 1;
        }
        int i6 = enumC1109w2 != null ? WhenMappings.$EnumSwitchMapping$2[enumC1109w2.ordinal()] : -1;
        int i7 = 48;
        if (i6 != 1) {
            if (i6 == 2) {
                i7 = 16;
            } else if (i6 == 3) {
                i7 = 80;
            }
        }
        return i7 | i4;
    }

    private static final float evaluatePxFloatByUnit(long j4, EnumC0779dc enumC0779dc, DisplayMetrics displayMetrics) {
        int i4 = WhenMappings.$EnumSwitchMapping$0[enumC0779dc.ordinal()];
        if (i4 == 1) {
            return dpToPxF(Long.valueOf(j4), displayMetrics);
        }
        if (i4 == 2) {
            return spToPxF(Long.valueOf(j4), displayMetrics);
        }
        if (i4 == 3) {
            return j4;
        }
        throw new m();
    }

    @Nullable
    public static final Z3 extractParentContentAlignmentHorizontal(@NotNull View view, @NotNull ExpressionResolver resolver) {
        R3 c4;
        Expression expression;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        ViewParent parent = view.getParent();
        DivHolderView divHolderView = parent instanceof DivHolderView ? (DivHolderView) parent : null;
        Z div = divHolderView != null ? divHolderView.getDiv() : null;
        Z.c cVar = div instanceof Z.c ? (Z.c) div : null;
        if (cVar == null || (c4 = cVar.c()) == null || (expression = c4.f4552o) == null) {
            return null;
        }
        return (Z3) expression.evaluate(resolver);
    }

    @Nullable
    public static final EnumC0717a4 extractParentContentAlignmentVertical(@NotNull View view, @NotNull ExpressionResolver resolver) {
        R3 c4;
        Expression expression;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        ViewParent parent = view.getParent();
        DivHolderView divHolderView = parent instanceof DivHolderView ? (DivHolderView) parent : null;
        Z div = divHolderView != null ? divHolderView.getDiv() : null;
        Z.c cVar = div instanceof Z.c ? (Z.c) div : null;
        if (cVar == null || (c4 = cVar.c()) == null || (expression = c4.f4553p) == null) {
            return null;
        }
        return (EnumC0717a4) expression.evaluate(resolver);
    }

    @NotNull
    public static final <T extends Xb> List<T> filterEnabled(@NotNull List<? extends T> list, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) ((Xb) obj).isEnabled().evaluate(resolver)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final float fontSizeToPx(long j4, @NotNull EnumC0779dc unit, @NotNull DisplayMetrics metrics) {
        Number valueOf;
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        int i4 = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i4 == 1) {
            valueOf = Integer.valueOf(dpToPx(Long.valueOf(j4), metrics));
        } else if (i4 == 2) {
            valueOf = Integer.valueOf(spToPx(Long.valueOf(j4), metrics));
        } else {
            if (i4 != 3) {
                throw new m();
            }
            valueOf = Long.valueOf(j4);
        }
        return valueOf.floatValue();
    }

    public static final void gainAccessibilityFocus(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(1);
    }

    @NotNull
    public static final List<Wf> getAllAppearActions(@NotNull InterfaceC0752c3 interfaceC0752c3) {
        Intrinsics.checkNotNullParameter(interfaceC0752c3, "<this>");
        List<Wf> c4 = interfaceC0752c3.c();
        if (c4 != null) {
            return c4;
        }
        Wf q4 = interfaceC0752c3.q();
        List<Wf> listOf = q4 != null ? CollectionsKt.listOf(q4) : null;
        return listOf == null ? CollectionsKt.emptyList() : listOf;
    }

    @NotNull
    public static final List<M4> getAllDisappearActions(@NotNull InterfaceC0752c3 interfaceC0752c3) {
        Intrinsics.checkNotNullParameter(interfaceC0752c3, "<this>");
        List<M4> a4 = interfaceC0752c3.a();
        return a4 == null ? CollectionsKt.emptyList() : a4;
    }

    @NotNull
    public static final List<Xb> getAllSightActions(@NotNull InterfaceC0752c3 interfaceC0752c3) {
        Intrinsics.checkNotNullParameter(interfaceC0752c3, "<this>");
        return CollectionsKt.plus((Collection) getAllDisappearActions(interfaceC0752c3), (Iterable) getAllAppearActions(interfaceC0752c3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final BindingContext getBindingContext(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        if (divHolderView != null) {
            return divHolderView.getBindingContext();
        }
        return null;
    }

    @NotNull
    public static final String getChildPathUnit(@NotNull InterfaceC0752c3 interfaceC0752c3, int i4) {
        Intrinsics.checkNotNullParameter(interfaceC0752c3, "<this>");
        if (interfaceC0752c3 instanceof Bc) {
            return DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, (Bc) interfaceC0752c3, null, 1, null);
        }
        String id = interfaceC0752c3.getId();
        return id == null ? ChildPathUnitCache.INSTANCE.getValue$div_release(i4) : id;
    }

    public static final boolean getHasSightActions(@NotNull InterfaceC0752c3 interfaceC0752c3) {
        Intrinsics.checkNotNullParameter(interfaceC0752c3, "<this>");
        if (interfaceC0752c3.q() != null) {
            return true;
        }
        List c4 = interfaceC0752c3.c();
        if (c4 != null && !c4.isEmpty()) {
            return true;
        }
        List a4 = interfaceC0752c3.a();
        return (a4 == null || a4.isEmpty()) ? false : true;
    }

    @NotNull
    public static final AbstractC0738b7 getItemsPlacementCompat(@NotNull C0720a7 c0720a7) {
        Intrinsics.checkNotNullParameter(c0720a7, "<this>");
        AbstractC0738b7 abstractC0738b7 = c0720a7.f5693v;
        return abstractC0738b7 == null ? new AbstractC0738b7.c(new G4(c0720a7.f5658F)) : abstractC0738b7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getPivotValue(View view, int i4, AbstractC0849ha abstractC0849ha, ExpressionResolver expressionResolver) {
        Object b4 = abstractC0849ha.b();
        if (!(b4 instanceof C0867ia)) {
            return b4 instanceof C0974oa ? (((float) ((Number) ((C0974oa) b4).f7367a.evaluate(expressionResolver)).doubleValue()) / 100.0f) * i4 : i4 / 2.0f;
        }
        C0867ia c0867ia = (C0867ia) b4;
        Expression expression = c0867ia.f6483b;
        if (expression == null) {
            return i4 / 2.0f;
        }
        float longValue = ((Number) expression.evaluate(expressionResolver)).longValue();
        int i5 = WhenMappings.$EnumSwitchMapping$0[((EnumC0779dc) c0867ia.f6482a.evaluate(expressionResolver)).ordinal()];
        if (i5 == 1) {
            Float valueOf = Float.valueOf(longValue);
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            return dpToPxF(valueOf, displayMetrics);
        }
        if (i5 != 2) {
            if (i5 == 3) {
                return longValue;
            }
            throw new m();
        }
        Float valueOf2 = Float.valueOf(longValue);
        DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "resources.displayMetrics");
        return spToPxF(valueOf2, displayMetrics2);
    }

    public static final float getWeight(@NotNull Yb yb, @NotNull ExpressionResolver resolver) {
        Expression expression;
        Intrinsics.checkNotNullParameter(yb, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(yb instanceof Yb.d) || (expression = ((Yb.d) yb).c().f3146a) == null) {
            return 0.0f;
        }
        return (float) ((Number) expression.evaluate(resolver)).doubleValue();
    }

    private static final float getWidthPxF(Qc qc, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return unitToPxF((Number) qc.f4479d.evaluate(expressionResolver), displayMetrics, (EnumC0779dc) qc.f4478c.evaluate(expressionResolver));
    }

    public static final boolean isConstantlyEmpty(@Nullable C0860i3 c0860i3) {
        if (c0860i3 == null) {
            return true;
        }
        return c0860i3.f6459a == null && c0860i3.f6460b == null && Intrinsics.areEqual(c0860i3.f6461c, Expression.Companion.constant(Boolean.FALSE)) && c0860i3.f6462d == null && c0860i3.f6463e == null;
    }

    public static final boolean isHorizontal(@NotNull R3 r32, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(r32, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return r32.f4516G.evaluate(resolver) == R3.d.HORIZONTAL;
    }

    public static final boolean isWrapContainer(@NotNull R3 r32, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(r32, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (r32.f4511B.evaluate(resolver) != R3.c.WRAP || r32.f4516G.evaluate(resolver) == R3.d.OVERLAP) {
            return false;
        }
        if (isHorizontal(r32, resolver)) {
            return canWrap(r32.getWidth(), resolver);
        }
        if (canWrap(r32.getHeight(), resolver)) {
            return true;
        }
        T2 t22 = r32.f4546i;
        if (t22 != null) {
            return !(((float) ((Number) t22.f4859a.evaluate(resolver)).doubleValue()) == 0.0f);
        }
        return false;
    }

    public static final <T extends Number> int pxToDp(@Nullable T t4, @NotNull DisplayMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return AbstractC3185a.c(pxToDpF(t4, metrics));
    }

    public static final <T extends Number> float pxToDpF(@Nullable T t4, @NotNull DisplayMetrics metrics) {
        float deriveDimension;
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (Build.VERSION.SDK_INT < 34) {
            return (t4 != null ? t4.floatValue() : 0.0f) / metrics.density;
        }
        deriveDimension = TypedValue.deriveDimension(1, t4 != null ? t4.floatValue() : 0.0f, metrics);
        return deriveDimension;
    }

    @NotNull
    public static final DivStatePath resolvePath(@NotNull InterfaceC0752c3 interfaceC0752c3, int i4, @NotNull DivStatePath parentPath) {
        Intrinsics.checkNotNullParameter(interfaceC0752c3, "<this>");
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        return parentPath.appendDiv(getChildPathUnit(interfaceC0752c3, i4));
    }

    public static final void sendAccessibilityEventUnchecked(int i4, @Nullable View view, @NotNull AccessibilityStateProvider accessibilityStateProvider) {
        Intrinsics.checkNotNullParameter(accessibilityStateProvider, "accessibilityStateProvider");
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        if (accessibilityStateProvider.isAccessibilityEnabled(context)) {
            view.sendAccessibilityEventUnchecked(Build.VERSION.SDK_INT >= 30 ? AbstractC3523a.a(i4) : AccessibilityEvent.obtain(i4));
        }
    }

    public static final void setAnimatedTouchListener(@NotNull View view, @NotNull BindingContext context, @Nullable C1127x2 c1127x2, @Nullable DivGestureListener divGestureListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        final Function2<View, MotionEvent, Boolean> createAnimatedTouchListener = createAnimatedTouchListener(view, context, c1127x2, divGestureListener);
        view.setOnTouchListener(createAnimatedTouchListener != null ? new View.OnTouchListener() { // from class: y1.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean animatedTouchListener$lambda$5;
                animatedTouchListener$lambda$5 = BaseDivViewExtensionsKt.setAnimatedTouchListener$lambda$5(Function2.this, view2, motionEvent);
                return animatedTouchListener$lambda$5;
            }
        } : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setAnimatedTouchListener$lambda$5(Function2 function2, View view, MotionEvent motionEvent) {
        return ((Boolean) function2.invoke(view, motionEvent)).booleanValue();
    }

    public static final <T extends Number> int spToPx(@Nullable T t4, @NotNull DisplayMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return AbstractC3185a.c(spToPxF(t4, metrics));
    }

    public static final <T extends Number> float spToPxF(@Nullable T t4, @NotNull DisplayMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return TypedValue.applyDimension(2, t4 != null ? t4.floatValue() : 0.0f, metrics);
    }

    @NotNull
    public static final EnumC1091v2 toAlignmentHorizontal(@NotNull Z3 z32) {
        Intrinsics.checkNotNullParameter(z32, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$3[z32.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? EnumC1091v2.START : EnumC1091v2.END : EnumC1091v2.START : EnumC1091v2.RIGHT : EnumC1091v2.CENTER : EnumC1091v2.LEFT;
    }

    @NotNull
    public static final EnumC1109w2 toAlignmentVertical(@NotNull EnumC0717a4 enumC0717a4) {
        Intrinsics.checkNotNullParameter(enumC0717a4, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$4[enumC0717a4.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 7 ? EnumC1109w2.TOP : EnumC1109w2.BASELINE : EnumC1109w2.BOTTOM : EnumC1109w2.CENTER : EnumC1109w2.TOP;
    }

    public static final int toAndroidUnit(@NotNull EnumC0779dc enumC0779dc) {
        Intrinsics.checkNotNullParameter(enumC0779dc, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[enumC0779dc.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2) {
                if (i4 == 3) {
                    return 0;
                }
                throw new m();
            }
        }
        return i5;
    }

    @Nullable
    public static final Drawable toDrawable(@NotNull X4 x4, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(x4, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (x4 instanceof X4.c) {
            return toDrawable(((X4.c) x4).c(), metrics, resolver);
        }
        throw new m();
    }

    @NotNull
    public static final ScalingDrawable.AlignmentHorizontal toHorizontalAlignment(@NotNull EnumC1091v2 enumC1091v2, boolean z4) {
        Intrinsics.checkNotNullParameter(enumC1091v2, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$1[enumC1091v2.ordinal()];
        if (i4 == 1) {
            return ScalingDrawable.AlignmentHorizontal.LEFT;
        }
        if (i4 == 2) {
            return ScalingDrawable.AlignmentHorizontal.CENTER;
        }
        if (i4 == 3) {
            return ScalingDrawable.AlignmentHorizontal.RIGHT;
        }
        if (i4 == 4) {
            return z4 ? ScalingDrawable.AlignmentHorizontal.RIGHT : ScalingDrawable.AlignmentHorizontal.LEFT;
        }
        if (i4 == 5) {
            return z4 ? ScalingDrawable.AlignmentHorizontal.LEFT : ScalingDrawable.AlignmentHorizontal.RIGHT;
        }
        throw new m();
    }

    @NotNull
    public static final AspectImageView.Scale toImageScale(@NotNull Y6 y6) {
        Intrinsics.checkNotNullParameter(y6, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$5[y6.ordinal()];
        if (i4 == 1) {
            return AspectImageView.Scale.FILL;
        }
        if (i4 == 2) {
            return AspectImageView.Scale.FIT;
        }
        if (i4 == 3) {
            return AspectImageView.Scale.STRETCH;
        }
        if (i4 == 4) {
            return AspectImageView.Scale.NO_SCALE;
        }
        throw new m();
    }

    public static final int toLayoutParamsSize(@Nullable Yb yb, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (yb == null) {
            return -2;
        }
        if (yb instanceof Yb.d) {
            return -1;
        }
        if (yb instanceof Yb.c) {
            return toPx(((Yb.c) yb).c(), metrics, resolver);
        }
        if (!(yb instanceof Yb.e)) {
            throw new m();
        }
        Expression expression = ((Yb.e) yb).c().f5970a;
        return (expression != null && ((Boolean) expression.evaluate(resolver)).booleanValue() && (layoutParams instanceof DivLayoutParams)) ? -3 : -2;
    }

    public static /* synthetic */ int toLayoutParamsSize$default(Yb yb, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ViewGroup.LayoutParams layoutParams, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            layoutParams = null;
        }
        return toLayoutParamsSize(yb, displayMetrics, expressionResolver, layoutParams);
    }

    @NotNull
    public static final PorterDuff.Mode toPorterDuffMode(@NotNull EnumC0770d3 enumC0770d3) {
        Intrinsics.checkNotNullParameter(enumC0770d3, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$7[enumC0770d3.ordinal()]) {
            case 1:
                return PorterDuff.Mode.SRC_IN;
            case 2:
                return PorterDuff.Mode.SRC_ATOP;
            case 3:
                return PorterDuff.Mode.DARKEN;
            case 4:
                return PorterDuff.Mode.LIGHTEN;
            case 5:
                return PorterDuff.Mode.MULTIPLY;
            case 6:
                return PorterDuff.Mode.SCREEN;
            default:
                throw new m();
        }
    }

    public static final int toPx(long j4, @NotNull EnumC0779dc unit, @NotNull DisplayMetrics metrics) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        int i4 = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i4 == 1) {
            return dpToPx(Long.valueOf(j4), metrics);
        }
        if (i4 == 2) {
            return spToPx(Long.valueOf(j4), metrics);
        }
        if (i4 != 3) {
            throw new m();
        }
        long j5 = j4 >> 31;
        if (j5 == 0 || j5 == -1) {
            return (int) j4;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable convert '" + j4 + "' to Int");
        }
        return j4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final float toPxF(@NotNull S5 s5, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(s5, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return evaluatePxFloatByUnit(((Number) s5.f4715b.evaluate(resolver)).longValue(), (EnumC0779dc) s5.f4714a.evaluate(resolver), metrics);
    }

    @NotNull
    public static final ScalingDrawable.ScaleType toScaleType(@NotNull Y6 y6) {
        Intrinsics.checkNotNullParameter(y6, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$5[y6.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? ScalingDrawable.ScaleType.NO_SCALE : ScalingDrawable.ScaleType.STRETCH : ScalingDrawable.ScaleType.FIT : ScalingDrawable.ScaleType.FILL;
    }

    @NotNull
    public static final TextVerticalAlignment toTextVerticalAlignment(@NotNull Ld ld) {
        Intrinsics.checkNotNullParameter(ld, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$6[ld.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? TextVerticalAlignment.BASELINE : TextVerticalAlignment.BOTTOM : TextVerticalAlignment.BASELINE : TextVerticalAlignment.CENTER : TextVerticalAlignment.TOP;
    }

    @NotNull
    public static final ScalingDrawable.AlignmentVertical toVerticalAlignment(@NotNull EnumC1109w2 enumC1109w2) {
        Intrinsics.checkNotNullParameter(enumC1109w2, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$2[enumC1109w2.ordinal()];
        return i4 != 2 ? i4 != 3 ? ScalingDrawable.AlignmentVertical.TOP : ScalingDrawable.AlignmentVertical.BOTTOM : ScalingDrawable.AlignmentVertical.CENTER;
    }

    public static final void trackVisibilityActions(@NotNull final ViewGroup viewGroup, @NotNull final Div2View divView, @NotNull final List<DivItemBuilderResult> newItems, @Nullable List<DivItemBuilderResult> list) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        final DivVisibilityActionTracker visibilityActionTracker = divView.getDiv2Component$div_release().getVisibilityActionTracker();
        Intrinsics.checkNotNullExpressionValue(visibilityActionTracker, "divView.div2Component.visibilityActionTracker");
        List<DivItemBuilderResult> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = newItems.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, getAllSightActions(((DivItemBuilderResult) it.next()).getDiv().b()));
            }
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                hashSet.add(((Xb) obj).g());
            }
            for (DivItemBuilderResult divItemBuilderResult : list) {
                List<Wf> allAppearActions = getAllAppearActions(divItemBuilderResult.getDiv().b());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : allAppearActions) {
                    if (!hashSet.contains(((Wf) obj2).g())) {
                        arrayList2.add(obj2);
                    }
                }
                List<M4> allDisappearActions = getAllDisappearActions(divItemBuilderResult.getDiv().b());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : allDisappearActions) {
                    if (!hashSet.contains(((M4) obj3).g())) {
                        arrayList3.add(obj3);
                    }
                }
                visibilityActionTracker.trackVisibilityActionsOf(divView, divItemBuilderResult.getExpressionResolver(), null, divItemBuilderResult.getDiv(), arrayList2, arrayList3);
            }
        }
        if (newItems.isEmpty()) {
            return;
        }
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt$trackVisibilityActions$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                view.removeOnLayoutChangeListener(this);
                for (Pair pair : k.F(AbstractC1293g0.b(viewGroup), CollectionsKt.asSequence(newItems))) {
                    View view2 = (View) pair.component1();
                    DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) pair.component2();
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, divView, divItemBuilderResult2.getExpressionResolver(), view2, divItemBuilderResult2.getDiv(), null, null, 48, null);
                }
            }
        });
    }

    private static final void traverseViewHierarchy(View view, Function1<? super View, Boolean> function1) {
        if (((Boolean) function1.invoke(view)).booleanValue() && (view instanceof ViewGroup)) {
            Iterator it = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it.hasNext()) {
                traverseViewHierarchy((View) it.next(), function1);
            }
        }
    }

    public static final <T extends Number> int unitToPx(@Nullable T t4, @NotNull DisplayMetrics metrics, @NotNull EnumC0779dc unit) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return AbstractC3185a.c(unitToPxF(t4, metrics, unit));
    }

    public static final <T extends Number> float unitToPxF(@Nullable T t4, @NotNull DisplayMetrics metrics, @NotNull EnumC0779dc unit) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return TypedValue.applyDimension(toAndroidUnit(unit), t4 != null ? t4.floatValue() : 0.0f, metrics);
    }

    public static final int dpToPx(@Nullable Long l4, @NotNull DisplayMetrics metrics) {
        Integer num;
        int i4;
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (l4 != null) {
            long longValue = l4.longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i4 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        return dpToPx(num, metrics);
    }

    public static final int spToPx(@Nullable Long l4, @NotNull DisplayMetrics metrics) {
        Integer num;
        int i4;
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (l4 != null) {
            long longValue = l4.longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i4 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        return spToPx(num, metrics);
    }

    @Nullable
    public static final Drawable toDrawable(@NotNull Ob ob, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver) {
        Expression expression;
        Expression expression2;
        Intrinsics.checkNotNullParameter(ob, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Nb nb = ob.f4274b;
        if (nb instanceof Nb.d) {
            Nb.d dVar = (Nb.d) nb;
            float pxF = toPxF(dVar.c().f5811d, metrics, resolver);
            float pxF2 = toPxF(dVar.c().f5810c, metrics, resolver);
            Expression expression3 = dVar.c().f5808a;
            if (expression3 == null) {
                expression3 = ob.f4273a;
            }
            int intValue = ((Number) expression3.evaluate(resolver)).intValue();
            float pxF3 = toPxF(dVar.c().f5809b, metrics, resolver);
            Qc qc = dVar.c().f5812e;
            if (qc == null) {
                qc = ob.f4275c;
            }
            Integer num = (qc == null || (expression2 = qc.f4476a) == null) ? null : (Integer) expression2.evaluate(resolver);
            Qc qc2 = dVar.c().f5812e;
            if (qc2 == null) {
                qc2 = ob.f4275c;
            }
            return new RoundedRectDrawable(new RoundedRectDrawable.Params(pxF, pxF2, intValue, pxF3, num, qc2 != null ? Float.valueOf(getWidthPxF(qc2, metrics, resolver)) : null));
        }
        if (!(nb instanceof Nb.a)) {
            return null;
        }
        Nb.a aVar = (Nb.a) nb;
        float pxF4 = toPxF(aVar.c().f1303b, metrics, resolver);
        Expression expression4 = aVar.c().f1302a;
        if (expression4 == null) {
            expression4 = ob.f4273a;
        }
        int intValue2 = ((Number) expression4.evaluate(resolver)).intValue();
        Qc qc3 = aVar.c().f1304c;
        if (qc3 == null) {
            qc3 = ob.f4275c;
        }
        Integer num2 = (qc3 == null || (expression = qc3.f4476a) == null) ? null : (Integer) expression.evaluate(resolver);
        Qc qc4 = aVar.c().f1304c;
        if (qc4 == null) {
            qc4 = ob.f4275c;
        }
        return new CircleDrawable(new CircleDrawable.Params(pxF4, intValue2, num2, qc4 != null ? Float.valueOf(getWidthPxF(qc4, metrics, resolver)) : null));
    }

    public static final float toPxF(@NotNull Ha ha, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(ha, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return evaluatePxFloatByUnit(((Number) ha.f2990b.evaluate(resolver)).longValue(), (EnumC0779dc) ha.f2989a.evaluate(resolver), metrics);
    }

    public static final int unitToPx(@Nullable Long l4, @NotNull DisplayMetrics metrics, @NotNull EnumC0779dc unit) {
        Integer num;
        int i4;
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (l4 != null) {
            long longValue = l4.longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i4 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        return unitToPx(num, metrics, unit);
    }

    public static final int evaluateGravity(@Nullable Z3 z32, @Nullable EnumC0717a4 enumC0717a4) {
        int i4 = 8388611;
        switch (z32 == null ? -1 : WhenMappings.$EnumSwitchMapping$3[z32.ordinal()]) {
            case 1:
                i4 = 3;
                break;
            case 2:
                i4 = 1;
                break;
            case 3:
                i4 = 5;
                break;
            case 5:
                i4 = 8388613;
                break;
            case 6:
                i4 = 16777216;
                break;
            case 7:
                i4 = 33554432;
                break;
            case 8:
                i4 = 67108864;
                break;
        }
        int i5 = 48;
        switch (enumC0717a4 != null ? WhenMappings.$EnumSwitchMapping$4[enumC0717a4.ordinal()] : -1) {
            case 2:
                i5 = 16;
                break;
            case 3:
                i5 = 80;
                break;
            case 4:
                i5 = 268435456;
                break;
            case 5:
                i5 = 536870912;
                break;
            case 6:
                i5 = 1073741824;
                break;
        }
        return i5 | i4;
    }

    public static final int toPx(@NotNull S5 s5, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(s5, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        int i4 = WhenMappings.$EnumSwitchMapping$0[((EnumC0779dc) s5.f4714a.evaluate(resolver)).ordinal()];
        if (i4 == 1) {
            return dpToPx((Long) s5.f4715b.evaluate(resolver), metrics);
        }
        if (i4 == 2) {
            return spToPx((Long) s5.f4715b.evaluate(resolver), metrics);
        }
        if (i4 == 3) {
            long longValue = ((Number) s5.f4715b.evaluate(resolver)).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                return (int) longValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue + "' to Int");
            }
            return longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        throw new m();
    }

    public static final int toPx(@NotNull C0765cg.c cVar, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        int i4 = WhenMappings.$EnumSwitchMapping$0[((EnumC0779dc) cVar.f5978a.evaluate(resolver)).ordinal()];
        if (i4 == 1) {
            return dpToPx((Long) cVar.f5979b.evaluate(resolver), metrics);
        }
        if (i4 == 2) {
            return spToPx((Long) cVar.f5979b.evaluate(resolver), metrics);
        }
        if (i4 == 3) {
            long longValue = ((Number) cVar.f5979b.evaluate(resolver)).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                return (int) longValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue + "' to Int");
            }
            return longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        throw new m();
    }

    public static final int toPx(@NotNull J4 j4, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(j4, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        int i4 = WhenMappings.$EnumSwitchMapping$0[((EnumC0779dc) j4.f3317a.evaluate(resolver)).ordinal()];
        if (i4 == 1) {
            return dpToPx((Number) j4.f3318b.evaluate(resolver), metrics);
        }
        if (i4 == 2) {
            return spToPx((Number) j4.f3318b.evaluate(resolver), metrics);
        }
        if (i4 == 3) {
            return (int) ((Number) j4.f3318b.evaluate(resolver)).doubleValue();
        }
        throw new m();
    }
}
