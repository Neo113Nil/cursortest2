package androidx.compose.material3.carousel;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: Carousel.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0084\u0001\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b \u0010!\u001az\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u009a\u0001\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b&\u0010'\u001aÂ\u0001\u0010(\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110,¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110,¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020.0\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f21\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b0\u00101\u001a\u0019\u00102\u001a\u00020,*\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0003¢\u0006\u0002\u00103\u001a\u0019\u00104\u001a\u00020,*\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0003¢\u0006\u0002\u00103\u001a:\u00105\u001a\u00020\u0007*\u00020\u00072\u0006\u00106\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\f\u00107\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0000\u001a7\u0010>\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020\u0005H\u0002¢\u0006\u0004\bD\u0010E\u001a\u0018\u0010F\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u000209H\u0000\u001a\u0018\u0010G\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u000209H\u0001\u001a \u0010H\u001a\u00020,2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020,H\u0002¨\u0006M"}, d2 = {"HorizontalMultiBrowseCarousel", "", "state", "Landroidx/compose/material3/carousel/CarouselState;", "preferredItemWidth", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "itemSpacing", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "", "minSmallItemWidth", "maxSmallItemWidth", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function2;", "Landroidx/compose/material3/carousel/CarouselItemScope;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itemIndex", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalMultiBrowseCarousel-3tcCNu0", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalMultiBrowseCarousel-zCIJ0Nk", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;FFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalUncontainedCarousel", "itemWidth", "HorizontalUncontainedCarousel-VUP9l70", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalUncontainedCarousel-9QcgTRs", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalCenteredHeroCarousel", "maxItemWidth", "HorizontalCenteredHeroCarousel-p2lB3Bg", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/ui/Modifier;FFLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Carousel", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "keylineList", "", "availableSpace", "Landroidx/compose/material3/carousel/KeylineList;", "maxNonFocalVisibleItemCount", "Carousel-cJHQLPU", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ILandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "calculateBeforeContentPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)F", "calculateAfterContentPadding", "carouselItem", "index", "strategy", "Lkotlin/Function0;", "Landroidx/compose/material3/carousel/Strategy;", "carouselItemDrawInfo", "Landroidx/compose/material3/carousel/CarouselItemDrawInfoImpl;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "drawDebugLines", "pageSize", "Landroidx/compose/material3/carousel/CarouselPageSize;", "strokeColor", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "drawDebugLines-1Yev-eo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/material3/carousel/CarouselPageSize;JF)Landroidx/compose/ui/Modifier;", "calculateCurrentScrollOffset", "calculateMaxScrollOffset", "getProgress", "before", "Landroidx/compose/material3/carousel/Keyline;", "after", "unadjustedOffset", "material3"}, k = 2, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class CarouselKt {
    static final Unit Carousel_cJHQLPU$lambda$19(CarouselState carouselState, Orientation orientation, Function2 function2, PaddingValues paddingValues, int i, Modifier modifier, float f, TargetedFlingBehavior targetedFlingBehavior, boolean z, Function4 function4, int i2, int i3, Composer composer, int i4) {
        m2972CarouselcJHQLPU(carouselState, orientation, function2, paddingValues, i, modifier, f, targetedFlingBehavior, z, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    static final Unit HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$13(CarouselState carouselState, Modifier modifier, float f, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, Function4 function4, int i, int i2, Composer composer, int i3) {
        m2973HorizontalCenteredHeroCarouselp2lB3Bg(carouselState, modifier, f, f2, targetedFlingBehavior, z, f3, f4, paddingValues, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit HorizontalMultiBrowseCarousel_3tcCNu0$lambda$3(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, Function4 function4, int i, int i2, Composer composer, int i3) {
        m2974HorizontalMultiBrowseCarousel3tcCNu0(carouselState, f, modifier, f2, targetedFlingBehavior, z, f3, f4, paddingValues, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit HorizontalMultiBrowseCarousel_zCIJ0Nk$lambda$4(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, float f3, float f4, PaddingValues paddingValues, Function4 function4, int i, int i2, Composer composer, int i3) {
        m2975HorizontalMultiBrowseCarouselzCIJ0Nk(carouselState, f, modifier, f2, targetedFlingBehavior, f3, f4, paddingValues, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit HorizontalUncontainedCarousel_9QcgTRs$lambda$9(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, PaddingValues paddingValues, Function4 function4, int i, int i2, Composer composer, int i3) {
        m2976HorizontalUncontainedCarousel9QcgTRs(carouselState, f, modifier, f2, targetedFlingBehavior, paddingValues, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit HorizontalUncontainedCarousel_VUP9l70$lambda$8(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, PaddingValues paddingValues, Function4 function4, int i, int i2, Composer composer, int i3) {
        m2977HorizontalUncontainedCarouselVUP9l70(carouselState, f, modifier, f2, targetedFlingBehavior, z, paddingValues, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022b  */
    /* renamed from: HorizontalMultiBrowseCarousel-3tcCNu0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2974HorizontalMultiBrowseCarousel3tcCNu0(final CarouselState carouselState, final float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f5;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        boolean z2;
        int i6;
        final float f6;
        int i7;
        int i8;
        int i9;
        PaddingValues paddingValues2;
        int i10;
        float f7;
        float f8;
        final TargetedFlingBehavior targetedFlingBehavior3;
        boolean z3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        CarouselState carouselState2;
        float f9;
        float f10;
        TargetedFlingBehavior targetedFlingBehavior4;
        Modifier modifier3;
        int i11;
        PaddingValues paddingValues4;
        boolean changed;
        Object rememberedValue;
        float f11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-221490402);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalMultiBrowseCarousel)N(state,preferredItemWidth:c#ui.unit.Dp,modifier,itemSpacing:c#ui.unit.Dp,flingBehavior,userScrollEnabled,minSmallItemWidth:c#ui.unit.Dp,maxSmallItemWidth:c#ui.unit.Dp,contentPadding,content)121@6176L7,125@6289L565,122@6188L1107:Carousel.kt#dcf9yb");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f5 = f2;
                i3 |= startRestartGroup.changed(f5) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i12 = 16384;
                            i3 |= i12;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        f6 = f3;
                    } else {
                        f6 = f3;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f6) ? 1048576 : 524288;
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        paddingValues2 = paddingValues;
                        i3 |= startRestartGroup.changed(paddingValues2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i10 = i3;
                        if ((i2 & 512) != 0) {
                            i10 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i10 |= startRestartGroup.changedInstance(function4) ? 536870912 : 268435456;
                            if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "114@5807L41");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i10 &= -57345;
                                    }
                                    carouselState2 = carouselState;
                                    modifier3 = modifier2;
                                    f8 = f5;
                                    z3 = z2;
                                    f9 = f4;
                                    paddingValues4 = paddingValues2;
                                } else {
                                    Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        f5 = Dp.m7522constructorimpl(0.0f);
                                    }
                                    if ((i2 & 16) != 0) {
                                        int i14 = (i10 & 14) | 384;
                                        carouselState2 = carouselState;
                                        i10 &= -57345;
                                        targetedFlingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i14, 2);
                                    } else {
                                        carouselState2 = carouselState;
                                    }
                                    if (i5 != 0) {
                                        z2 = true;
                                    }
                                    if (i6 != 0) {
                                        f6 = CarouselDefaults.INSTANCE.m2971getMinSmallItemSizeD9Ej5fM();
                                    }
                                    float m2970getMaxSmallItemSizeD9Ej5fM = i7 != 0 ? CarouselDefaults.INSTANCE.m2970getMaxSmallItemSizeD9Ej5fM() : f4;
                                    if (i9 == 0) {
                                        f9 = m2970getMaxSmallItemSizeD9Ej5fM;
                                        f10 = f6;
                                        f8 = f5;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        z3 = z2;
                                        modifier3 = modifier4;
                                        i11 = i10;
                                        paddingValues4 = paddingValues;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-221490402, i11, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:120)");
                                        }
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final Density density = (Density) consume;
                                        Orientation orientation = Orientation.Horizontal;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1896112723, "CC(remember):Carousel.kt#9igjgp");
                                        changed = startRestartGroup.changed(density) | ((i11 & 112) != 32) | startRestartGroup.changedInstance(carouselState2) | ((3670016 & i11) != 1048576) | ((29360128 & i11) == 8388608);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            final CarouselState carouselState3 = carouselState2;
                                            final float f12 = f10;
                                            final float f13 = f9;
                                            rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda15
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    KeylineList multiBrowseKeylineList;
                                                    multiBrowseKeylineList = KeylinesKt.multiBrowseKeylineList(r0, ((Float) obj).floatValue(), r0.mo407toPx0680j_4(f), ((Float) obj2).floatValue(), carouselState3.getPagerState().getPageCountState().getValue().invoke().intValue(), r0.mo407toPx0680j_4(f12), Density.this.mo407toPx0680j_4(f13));
                                                    return multiBrowseKeylineList;
                                                }
                                            };
                                            f11 = f12;
                                            f7 = f13;
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        } else {
                                            f11 = f10;
                                            f7 = f9;
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        int i15 = i11 << 9;
                                        PaddingValues paddingValues5 = paddingValues4;
                                        m2972CarouselcJHQLPU(carouselState, orientation, (Function2) rememberedValue, paddingValues5, 2, modifier3, f8, targetedFlingBehavior4, z3, function4, startRestartGroup, (i11 & 14) | 24624 | ((i11 >> 15) & 7168) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024) | (1879048192 & i11), 0);
                                        startRestartGroup = startRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        paddingValues3 = paddingValues5;
                                        modifier2 = modifier3;
                                        targetedFlingBehavior3 = targetedFlingBehavior4;
                                        f6 = f11;
                                    } else {
                                        f8 = f5;
                                        z3 = z2;
                                        modifier3 = modifier4;
                                        paddingValues4 = PaddingKt.m813PaddingValues0680j_4(Dp.m7522constructorimpl(0.0f));
                                        f9 = m2970getMaxSmallItemSizeD9Ej5fM;
                                    }
                                }
                                f10 = f6;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                i11 = i10;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Density density2 = (Density) consume2;
                                Orientation orientation2 = Orientation.Horizontal;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1896112723, "CC(remember):Carousel.kt#9igjgp");
                                changed = startRestartGroup.changed(density2) | ((i11 & 112) != 32) | startRestartGroup.changedInstance(carouselState2) | ((3670016 & i11) != 1048576) | ((29360128 & i11) == 8388608);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (changed) {
                                }
                                final CarouselState carouselState32 = carouselState2;
                                final float f122 = f10;
                                final float f132 = f9;
                                rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        KeylineList multiBrowseKeylineList;
                                        multiBrowseKeylineList = KeylinesKt.multiBrowseKeylineList(r0, ((Float) obj).floatValue(), r0.mo407toPx0680j_4(f), ((Float) obj2).floatValue(), carouselState32.getPagerState().getPageCountState().getValue().invoke().intValue(), r0.mo407toPx0680j_4(f122), Density.this.mo407toPx0680j_4(f132));
                                        return multiBrowseKeylineList;
                                    }
                                };
                                f11 = f122;
                                f7 = f132;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i152 = i11 << 9;
                                PaddingValues paddingValues52 = paddingValues4;
                                m2972CarouselcJHQLPU(carouselState, orientation2, (Function2) rememberedValue, paddingValues52, 2, modifier3, f8, targetedFlingBehavior4, z3, function4, startRestartGroup, (i11 & 14) | 24624 | ((i11 >> 15) & 7168) | (458752 & i152) | (3670016 & i152) | (29360128 & i152) | (i152 & 234881024) | (1879048192 & i11), 0);
                                startRestartGroup = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                paddingValues3 = paddingValues52;
                                modifier2 = modifier3;
                                targetedFlingBehavior3 = targetedFlingBehavior4;
                                f6 = f11;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                f7 = f4;
                                f8 = f5;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                z3 = z2;
                                paddingValues3 = paddingValues;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier5 = modifier2;
                                final float f14 = f8;
                                final boolean z4 = z3;
                                final float f15 = f7;
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CarouselKt.HorizontalMultiBrowseCarousel_3tcCNu0$lambda$3(CarouselState.this, f, modifier5, f14, targetedFlingBehavior3, z4, f6, f15, paddingValues3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    paddingValues2 = paddingValues;
                    i10 = i3;
                    if ((i2 & 512) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z2 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                paddingValues2 = paddingValues;
                i10 = i3;
                if ((i2 & 512) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f5 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            paddingValues2 = paddingValues;
            i10 = i3;
            if ((i2 & 512) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f5 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        paddingValues2 = paddingValues;
        i10 = i3;
        if ((i2 & 512) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c5  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility")
    /* renamed from: HorizontalMultiBrowseCarousel-zCIJ0Nk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2975HorizontalMultiBrowseCarouselzCIJ0Nk(final CarouselState carouselState, final float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, float f3, float f4, PaddingValues paddingValues, final Function4 function4, Composer composer, final int i, final int i2) {
        CarouselState carouselState2;
        int i3;
        float f5;
        int i4;
        float f6;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        float f7;
        int i6;
        int i7;
        float f8;
        int i8;
        PaddingValues paddingValues2;
        int i9;
        final Modifier modifier2;
        final PaddingValues paddingValues3;
        Composer composer2;
        final float f9;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final float f10;
        final float f11;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        int i10;
        float f12;
        PaddingValues paddingValues4;
        TargetedFlingBehavior targetedFlingBehavior4;
        float f13;
        float f14;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-118598974);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalMultiBrowseCarousel)N(state,preferredItemWidth:c#ui.unit.Dp,modifier,itemSpacing:c#ui.unit.Dp,flingBehavior,minSmallItemWidth:c#ui.unit.Dp,maxSmallItemWidth:c#ui.unit.Dp,contentPadding,content)165@7948L407:Carousel.kt#dcf9yb");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            carouselState2 = carouselState;
        } else {
            carouselState2 = carouselState;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(carouselState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            f5 = f;
        } else {
            f5 = f;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(f5) ? 32 : 16;
            }
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f6 = f2;
                i3 |= startRestartGroup.changed(f6) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i12 = 16384;
                            i3 |= i12;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    f7 = f3;
                    i3 |= startRestartGroup.changed(f7) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        i7 = 196608;
                        f8 = f4;
                    } else {
                        i7 = 196608;
                        f8 = f4;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f8) ? 1048576 : 524288;
                        }
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i9 = i3;
                        if (startRestartGroup.shouldExecute((i9 & 38347923) != 38347922, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "159@7645L41");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i9 &= -57345;
                                }
                                paddingValues4 = paddingValues2;
                                f14 = f6;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                f13 = f8;
                                i10 = i9;
                                i11 = -118598974;
                                f12 = f7;
                                modifier3 = modifier;
                            } else {
                                Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier;
                                float m7522constructorimpl = i4 != 0 ? Dp.m7522constructorimpl(0.0f) : f6;
                                if ((i2 & 16) != 0) {
                                    int i14 = (i9 & 14) | 384;
                                    i9 &= -57345;
                                    targetedFlingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i14, 2);
                                }
                                if (i5 != 0) {
                                    f7 = CarouselDefaults.INSTANCE.m2971getMinSmallItemSizeD9Ej5fM();
                                }
                                if (i6 != 0) {
                                    f8 = CarouselDefaults.INSTANCE.m2970getMaxSmallItemSizeD9Ej5fM();
                                }
                                if (i8 != 0) {
                                    float f15 = f7;
                                    modifier3 = companion;
                                    i10 = i9;
                                    f12 = f15;
                                    paddingValues4 = PaddingKt.m813PaddingValues0680j_4(Dp.m7522constructorimpl(0.0f));
                                } else {
                                    float f16 = f7;
                                    modifier3 = companion;
                                    i10 = i9;
                                    f12 = f16;
                                    paddingValues4 = paddingValues;
                                }
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                f13 = f8;
                                f14 = m7522constructorimpl;
                                i11 = -118598974;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i11, i10, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:165)");
                            }
                            int i15 = (i10 & 14) | i7 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10);
                            int i16 = i10 << 3;
                            m2974HorizontalMultiBrowseCarousel3tcCNu0(carouselState, f5, modifier3, f14, targetedFlingBehavior4, true, f12, f13, paddingValues4, function4, startRestartGroup, i15 | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier2 = modifier3;
                            f9 = f14;
                            targetedFlingBehavior3 = targetedFlingBehavior4;
                            f11 = f12;
                            f10 = f13;
                            paddingValues3 = paddingValues4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            paddingValues3 = paddingValues;
                            composer2 = startRestartGroup;
                            f9 = f6;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            f10 = f8;
                            f11 = f7;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CarouselKt.HorizontalMultiBrowseCarousel_zCIJ0Nk$lambda$4(CarouselState.this, f, modifier2, f9, targetedFlingBehavior3, f11, f10, paddingValues3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i3;
                    if (startRestartGroup.shouldExecute((i9 & 38347923) != 38347922, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f7 = f3;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i9 = i3;
                if (startRestartGroup.shouldExecute((i9 & 38347923) != 38347922, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f6 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f7 = f3;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i9 = i3;
            if (startRestartGroup.shouldExecute((i9 & 38347923) != 38347922, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f6 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f7 = f3;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i9 = i3;
        if (startRestartGroup.shouldExecute((i9 & 38347923) != 38347922, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a1  */
    /* renamed from: HorizontalUncontainedCarousel-VUP9l70, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2977HorizontalUncontainedCarouselVUP9l70(final CarouselState carouselState, final float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, PaddingValues paddingValues, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        CarouselState carouselState2;
        int i3;
        Modifier modifier2;
        int i4;
        float f3;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        boolean z2;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        Composer composer2;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        final float f4;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        float f5;
        boolean z4;
        boolean z5;
        PaddingValues m813PaddingValues0680j_4;
        boolean z6;
        TargetedFlingBehavior targetedFlingBehavior4;
        boolean z7;
        Object rememberedValue;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(534621863);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalUncontainedCarousel)N(state,itemWidth:c#ui.unit.Dp,modifier,itemSpacing:c#ui.unit.Dp,flingBehavior,userScrollEnabled,contentPadding,content)218@10352L7,222@10465L337,219@10364L866:Carousel.kt#dcf9yb");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            carouselState2 = carouselState;
        } else {
            carouselState2 = carouselState;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(carouselState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f3 = f2;
                i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues2) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function4) ? 8388608 : 4194304;
                        i7 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "213@10129L21");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i10 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    f3 = Dp.m7522constructorimpl(0.0f);
                                }
                                if ((i2 & 16) != 0) {
                                    i8 = i7 & (-57345);
                                    targetedFlingBehavior2 = CarouselDefaults.INSTANCE.noSnapFlingBehavior(startRestartGroup, 6);
                                } else {
                                    i8 = i7;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if (i6 != 0) {
                                    f5 = f3;
                                    z4 = true;
                                    z5 = z2;
                                    m813PaddingValues0680j_4 = PaddingKt.m813PaddingValues0680j_4(Dp.m7522constructorimpl(0.0f));
                                    z6 = false;
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(534621863, i8, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:217)");
                                    }
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density = (Density) consume;
                                    Orientation orientation = Orientation.Horizontal;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1624446376, "CC(remember):Carousel.kt#9igjgp");
                                    boolean changed = startRestartGroup.changed(density);
                                    if ((i8 & 112) == 32) {
                                        z6 = z4;
                                    }
                                    z7 = z6 | changed;
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z7 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                KeylineList uncontainedKeylineList;
                                                uncontainedKeylineList = KeylinesKt.uncontainedKeylineList(r0, ((Float) obj).floatValue(), Density.this.mo407toPx0680j_4(f), ((Float) obj2).floatValue());
                                                return uncontainedKeylineList;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i11 = i8 << 9;
                                    composer2 = startRestartGroup;
                                    Modifier modifier4 = modifier2;
                                    m2972CarouselcJHQLPU(carouselState2, orientation, (Function2) rememberedValue, m813PaddingValues0680j_4, 0, modifier4, f5, targetedFlingBehavior4, z5, function4, composer2, (i8 & 14) | 24624 | ((i8 >> 9) & 7168) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (i11 & 234881024) | ((i8 << 6) & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    paddingValues3 = m813PaddingValues0680j_4;
                                    modifier3 = modifier4;
                                    f4 = f5;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    z3 = z5;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i8 = i7 & (-57345);
                                } else {
                                    i8 = i7;
                                    z6 = false;
                                    z4 = true;
                                    f5 = f3;
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    z5 = z2;
                                    m813PaddingValues0680j_4 = paddingValues2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localDensity2);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density2 = (Density) consume2;
                                    Orientation orientation2 = Orientation.Horizontal;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1624446376, "CC(remember):Carousel.kt#9igjgp");
                                    boolean changed2 = startRestartGroup.changed(density2);
                                    if ((i8 & 112) == 32) {
                                    }
                                    z7 = z6 | changed2;
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z7) {
                                    }
                                    rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            KeylineList uncontainedKeylineList;
                                            uncontainedKeylineList = KeylinesKt.uncontainedKeylineList(r0, ((Float) obj).floatValue(), Density.this.mo407toPx0680j_4(f), ((Float) obj2).floatValue());
                                            return uncontainedKeylineList;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i112 = i8 << 9;
                                    composer2 = startRestartGroup;
                                    Modifier modifier42 = modifier2;
                                    m2972CarouselcJHQLPU(carouselState2, orientation2, (Function2) rememberedValue, m813PaddingValues0680j_4, 0, modifier42, f5, targetedFlingBehavior4, z5, function4, composer2, (i8 & 14) | 24624 | ((i8 >> 9) & 7168) | (458752 & i112) | (3670016 & i112) | (29360128 & i112) | (i112 & 234881024) | ((i8 << 6) & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    paddingValues3 = m813PaddingValues0680j_4;
                                    modifier3 = modifier42;
                                    f4 = f5;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    z3 = z5;
                                }
                            }
                            f5 = f3;
                            z6 = false;
                            z4 = true;
                            targetedFlingBehavior4 = targetedFlingBehavior2;
                            z5 = z2;
                            m813PaddingValues0680j_4 = paddingValues2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume22 = startRestartGroup.consume(localDensity22);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density22 = (Density) consume22;
                            Orientation orientation22 = Orientation.Horizontal;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1624446376, "CC(remember):Carousel.kt#9igjgp");
                            boolean changed22 = startRestartGroup.changed(density22);
                            if ((i8 & 112) == 32) {
                            }
                            z7 = z6 | changed22;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z7) {
                            }
                            rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    KeylineList uncontainedKeylineList;
                                    uncontainedKeylineList = KeylinesKt.uncontainedKeylineList(r0, ((Float) obj).floatValue(), Density.this.mo407toPx0680j_4(f), ((Float) obj2).floatValue());
                                    return uncontainedKeylineList;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i1122 = i8 << 9;
                            composer2 = startRestartGroup;
                            Modifier modifier422 = modifier2;
                            m2972CarouselcJHQLPU(carouselState2, orientation22, (Function2) rememberedValue, m813PaddingValues0680j_4, 0, modifier422, f5, targetedFlingBehavior4, z5, function4, composer2, (i8 & 14) | 24624 | ((i8 >> 9) & 7168) | (458752 & i1122) | (3670016 & i1122) | (29360128 & i1122) | (i1122 & 234881024) | ((i8 << 6) & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            paddingValues3 = m813PaddingValues0680j_4;
                            modifier3 = modifier422;
                            f4 = f5;
                            targetedFlingBehavior3 = targetedFlingBehavior4;
                            z3 = z5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            paddingValues3 = paddingValues2;
                            modifier3 = modifier2;
                            f4 = f3;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            z3 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CarouselKt.HorizontalUncontainedCarousel_VUP9l70$lambda$8(CarouselState.this, f, modifier3, f4, targetedFlingBehavior3, z3, paddingValues3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                i7 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i7 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i7 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0069  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility")
    /* renamed from: HorizontalUncontainedCarousel-9QcgTRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2976HorizontalUncontainedCarousel9QcgTRs(final CarouselState carouselState, final float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, PaddingValues paddingValues, final Function4 function4, Composer composer, final int i, final int i2) {
        CarouselState carouselState2;
        int i3;
        float f3;
        Modifier modifier2;
        int i4;
        float f4;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier3;
        final float f5;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        PaddingValues m813PaddingValues0680j_4;
        float f6;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-2013916597);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalUncontainedCarousel)N(state,itemWidth:c#ui.unit.Dp,modifier,itemSpacing:c#ui.unit.Dp,flingBehavior,contentPadding,content)256@11720L295:Carousel.kt#dcf9yb");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            carouselState2 = carouselState;
        } else {
            carouselState2 = carouselState;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(carouselState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            f3 = f;
        } else {
            f3 = f;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(f3) ? 32 : 16;
            }
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function4) ? 1048576 : 524288;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "252@11563L21");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                modifier4 = modifier2;
                            } else {
                                Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    f4 = Dp.m7522constructorimpl(0.0f);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    targetedFlingBehavior2 = CarouselDefaults.INSTANCE.noSnapFlingBehavior(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    modifier4 = companion;
                                    m813PaddingValues0680j_4 = PaddingKt.m813PaddingValues0680j_4(Dp.m7522constructorimpl(0.0f));
                                    f6 = f4;
                                    TargetedFlingBehavior targetedFlingBehavior4 = targetedFlingBehavior2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2013916597, i3, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:256)");
                                    }
                                    int i8 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                                    int i9 = i3 << 3;
                                    composer2 = startRestartGroup;
                                    m2977HorizontalUncontainedCarouselVUP9l70(carouselState2, f3, modifier4, f6, targetedFlingBehavior4, true, m813PaddingValues0680j_4, function4, composer2, i8 | (3670016 & i9) | (i9 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    f5 = f6;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    paddingValues3 = m813PaddingValues0680j_4;
                                } else {
                                    modifier4 = companion;
                                }
                            }
                            f6 = f4;
                            m813PaddingValues0680j_4 = paddingValues2;
                            TargetedFlingBehavior targetedFlingBehavior42 = targetedFlingBehavior2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i82 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                            int i92 = i3 << 3;
                            composer2 = startRestartGroup;
                            m2977HorizontalUncontainedCarouselVUP9l70(carouselState2, f3, modifier4, f6, targetedFlingBehavior42, true, m813PaddingValues0680j_4, function4, composer2, i82 | (3670016 & i92) | (i92 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            f5 = f6;
                            targetedFlingBehavior3 = targetedFlingBehavior42;
                            paddingValues3 = m813PaddingValues0680j_4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            f5 = f4;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            paddingValues3 = paddingValues2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CarouselKt.HorizontalUncontainedCarousel_9QcgTRs$lambda$9(CarouselState.this, f, modifier3, f5, targetedFlingBehavior3, paddingValues3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                paddingValues2 = paddingValues;
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f4 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: HorizontalCenteredHeroCarousel-p2lB3Bg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2973HorizontalCenteredHeroCarouselp2lB3Bg(final CarouselState carouselState, Modifier modifier, float f, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f5;
        int i5;
        float f6;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i6;
        boolean z2;
        int i7;
        final float f7;
        int i8;
        int i9;
        int i10;
        PaddingValues paddingValues2;
        int i11;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        final float f8;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final boolean z3;
        Composer composer2;
        final float f9;
        final float f10;
        ScopeUpdateScope endRestartGroup;
        CarouselState carouselState2;
        PaddingValues paddingValues4;
        float f11;
        float f12;
        float f13;
        TargetedFlingBehavior targetedFlingBehavior4;
        Modifier modifier4;
        int i12;
        float f14;
        float f15;
        float f16;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1493031269);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalCenteredHeroCarousel)N(state,modifier,maxItemWidth:c#ui.unit.Dp,itemSpacing:c#ui.unit.Dp,flingBehavior,userScrollEnabled,minSmallItemWidth:c#ui.unit.Dp,maxSmallItemWidth:c#ui.unit.Dp,contentPadding,content)305@14133L7,309@14246L625,306@14145L1168:Carousel.kt#dcf9yb");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f5 = f;
                i3 |= startRestartGroup.changed(f5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    f6 = f2;
                    i3 |= startRestartGroup.changed(f6) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                            if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                i13 = 16384;
                                i3 |= i13;
                            }
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i13 = 8192;
                        i3 |= i13;
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                            f7 = f3;
                        } else {
                            f7 = f3;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changed(f7) ? 1048576 : 524288;
                            }
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                        }
                        i9 = i2 & 256;
                        if (i9 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i10 = i9;
                            paddingValues2 = paddingValues;
                            i3 |= startRestartGroup.changed(paddingValues2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            i11 = i3;
                            if ((i2 & 512) == 0) {
                                i11 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i11 |= startRestartGroup.changedInstance(function4) ? 536870912 : 268435456;
                                if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "298@13764L41");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 16) != 0) {
                                            i11 &= -57345;
                                        }
                                        carouselState2 = carouselState;
                                        modifier4 = modifier2;
                                        f12 = f7;
                                        f13 = f6;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        i12 = i11;
                                        paddingValues4 = paddingValues2;
                                        f11 = f4;
                                    } else {
                                        Modifier modifier5 = i14 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i4 != 0) {
                                            f5 = Dp.INSTANCE.m7542getUnspecifiedD9Ej5fM();
                                        }
                                        if (i5 != 0) {
                                            f6 = Dp.m7522constructorimpl(0.0f);
                                        }
                                        if ((i2 & 16) != 0) {
                                            int i15 = (i11 & 14) | 384;
                                            carouselState2 = carouselState;
                                            i11 &= -57345;
                                            targetedFlingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i15, 2);
                                        } else {
                                            carouselState2 = carouselState;
                                        }
                                        if (i6 != 0) {
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            f7 = CarouselDefaults.INSTANCE.m2971getMinSmallItemSizeD9Ej5fM();
                                        }
                                        float m2970getMaxSmallItemSizeD9Ej5fM = i8 != 0 ? CarouselDefaults.INSTANCE.m2970getMaxSmallItemSizeD9Ej5fM() : f4;
                                        if (i10 != 0) {
                                            paddingValues4 = PaddingKt.m813PaddingValues0680j_4(Dp.m7522constructorimpl(0.0f));
                                            f13 = f6;
                                            modifier4 = modifier5;
                                            i12 = i11;
                                            f11 = m2970getMaxSmallItemSizeD9Ej5fM;
                                            f12 = f7;
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                        } else {
                                            paddingValues4 = paddingValues;
                                            f11 = m2970getMaxSmallItemSizeD9Ej5fM;
                                            f12 = f7;
                                            f13 = f6;
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            modifier4 = modifier5;
                                            i12 = i11;
                                        }
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1493031269, i12, -1, "androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel (Carousel.kt:304)");
                                    }
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density = (Density) consume;
                                    Orientation orientation = Orientation.Horizontal;
                                    final float f17 = f12;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 283997334, "CC(remember):Carousel.kt#9igjgp");
                                    boolean changed = startRestartGroup.changed(density) | ((i12 & 896) == 256) | startRestartGroup.changedInstance(carouselState2) | ((3670016 & i12) == 1048576) | ((29360128 & i12) == 8388608);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        final CarouselState carouselState3 = carouselState2;
                                        final float f18 = f11;
                                        final float f19 = f5;
                                        rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                KeylineList heroKeylineList;
                                                heroKeylineList = KeylinesKt.heroKeylineList(r0, ((Float) obj).floatValue(), !Float.isNaN(r9) ? Float.valueOf(r0.mo407toPx0680j_4(f19)) : null, ((Float) obj2).floatValue(), carouselState3.getPagerState().getPageCountState().getValue().invoke().intValue(), true, r0.mo407toPx0680j_4(f17), Density.this.mo407toPx0680j_4(f18));
                                                return heroKeylineList;
                                            }
                                        };
                                        f14 = f19;
                                        f15 = f17;
                                        f16 = f18;
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    } else {
                                        f15 = f17;
                                        f16 = f11;
                                        f14 = f5;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i16 = i12 << 9;
                                    PaddingValues paddingValues5 = paddingValues4;
                                    boolean z4 = z2;
                                    m2972CarouselcJHQLPU(carouselState, orientation, (Function2) rememberedValue, paddingValues5, 2, modifier4, f13, targetedFlingBehavior4, z4, function4, startRestartGroup, (i12 & 14) | 24624 | ((i12 >> 15) & 7168) | ((i12 << 12) & 458752) | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024) | (1879048192 & i12), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    paddingValues3 = paddingValues5;
                                    composer2 = startRestartGroup;
                                    modifier3 = modifier4;
                                    f8 = f13;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    z3 = z4;
                                    f9 = f14;
                                    f7 = f15;
                                    f10 = f16;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    paddingValues3 = paddingValues;
                                    modifier3 = modifier2;
                                    f8 = f6;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    z3 = z2;
                                    composer2 = startRestartGroup;
                                    f9 = f5;
                                    f10 = f4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return CarouselKt.HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$13(CarouselState.this, modifier3, f9, f8, targetedFlingBehavior3, z3, f7, f10, paddingValues3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        paddingValues2 = paddingValues;
                        i11 = i3;
                        if ((i2 & 512) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    z2 = z;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    paddingValues2 = paddingValues;
                    i11 = i3;
                    if ((i2 & 512) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f6 = f2;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z2 = z;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                paddingValues2 = paddingValues;
                i11 = i3;
                if ((i2 & 512) == 0) {
                }
                if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f5 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f6 = f2;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            paddingValues2 = paddingValues;
            i11 = i3;
            if ((i2 & 512) == 0) {
            }
            if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f5 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f6 = f2;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        paddingValues2 = paddingValues;
        i11 = i3;
        if ((i2 & 512) == 0) {
        }
        if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: Carousel-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2972CarouselcJHQLPU(CarouselState carouselState, final Orientation orientation, final Function2<? super Float, ? super Float, KeylineList> function2, final PaddingValues paddingValues, final int i, Modifier modifier, float f, TargetedFlingBehavior targetedFlingBehavior, boolean z, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        float f2;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i7;
        int i8;
        int i9;
        int i10;
        final CarouselState carouselState2;
        final boolean z2;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        boolean z3;
        TargetedFlingBehavior targetedFlingBehavior4;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-2077912500);
        ComposerKt.sourceInformation(startRestartGroup, "C(Carousel)N(state,orientation,keylineList,contentPadding,maxNonFocalVisibleItemCount,modifier,itemSpacing:c#ui.unit.Dp,flingBehavior,userScrollEnabled,content)375@17497L42,376@17585L41,378@17654L118:Carousel.kt#dcf9yb");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(orientation.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
            i5 = i;
        } else {
            i5 = i;
            if ((i2 & 24576) == 0) {
                i4 |= startRestartGroup.changed(i5) ? 16384 : 8192;
            }
        }
        int i12 = i3 & 32;
        if (i12 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i11 = 8388608;
                            i4 |= i11;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i11 = 4194304;
                    i4 |= i11;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i8 = i12;
                    i4 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i9 = i4;
                    if ((i3 & 512) != 0) {
                        if ((i2 & 805306368) == 0) {
                            i10 = i9 | (startRestartGroup.changedInstance(function4) ? 536870912 : 268435456);
                        }
                        boolean z4 = true;
                        if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "371@17296L41");
                            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 128) != 0) {
                                    i9 &= -29360129;
                                }
                                carouselState2 = carouselState;
                                z3 = z;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                            } else {
                                Modifier modifier3 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i6 != 0) {
                                    f2 = Dp.m7522constructorimpl(0.0f);
                                }
                                if ((i3 & 128) != 0) {
                                    int i13 = (i9 & 14) | 384;
                                    carouselState2 = carouselState;
                                    i9 &= -29360129;
                                    z4 = true;
                                    targetedFlingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i13, 2);
                                } else {
                                    carouselState2 = carouselState;
                                }
                                z3 = i7 != 0 ? z4 : z;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                modifier2 = modifier3;
                            }
                            int i14 = i9;
                            float f4 = f2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2077912500, i14, -1, "androidx.compose.material3.carousel.Carousel (Carousel.kt:374)");
                            }
                            int i15 = ((i14 >> 9) & 14) | (i14 & 112);
                            float calculateBeforeContentPadding = calculateBeforeContentPadding(paddingValues, orientation, startRestartGroup, i15);
                            float calculateAfterContentPadding = calculateAfterContentPadding(paddingValues, orientation, startRestartGroup, i15);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 285904898, "CC(remember):Carousel.kt#9igjgp");
                            boolean z5 = (i14 & 896) == 256;
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new CarouselPageSize(function2, calculateBeforeContentPadding, calculateAfterContentPadding);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            CarouselPageSize carouselPageSize = (CarouselPageSize) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            SnapPosition KeylineSnapPosition = KeylineSnapPositionKt.KeylineSnapPosition(carouselPageSize);
                            if (orientation == Orientation.Horizontal) {
                                startRestartGroup.startReplaceGroup(273387289);
                                ComposerKt.sourceInformation(startRestartGroup, "399@18566L24,400@18602L1024,385@17885L1741");
                                CarouselPagerState pagerState = carouselState2.getPagerState();
                                PaddingValues m817PaddingValuesa9UjIt4$default = PaddingKt.m817PaddingValuesa9UjIt4$default(0.0f, paddingValues.getTop(), 0.0f, paddingValues.getBottom(), 5, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 285933988, "CC(remember):Carousel.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CarouselKt.Carousel_cJHQLPU$lambda$16$lambda$15((SemanticsPropertyReceiver) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                PagerKt.m1074HorizontalPager8jOkeI(pagerState, SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue2, 1, null), m817PaddingValuesa9UjIt4$default, carouselPageSize, i5, f4, null, targetedFlingBehavior4, z3, false, null, null, KeylineSnapPosition, null, ComposableLambdaKt.rememberComposableLambda(-1817116752, true, new CarouselKt$Carousel$2(carouselState2, carouselPageSize, function4), startRestartGroup, 54), startRestartGroup, (i14 & 57344) | ((i14 >> 3) & 458752) | (i14 & 29360128) | (i14 & 234881024), 24576, 11840);
                                startRestartGroup.endReplaceGroup();
                            } else if (orientation == Orientation.Vertical) {
                                startRestartGroup.startReplaceGroup(275178469);
                                ComposerKt.sourceInformation(startRestartGroup, "434@19985L7,435@20077L7,443@20422L24,444@20458L1024,429@19689L1793");
                                CarouselPagerState pagerState2 = carouselState2.getPagerState();
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) consume);
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localLayoutDirection2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                PaddingValues m817PaddingValuesa9UjIt4$default2 = PaddingKt.m817PaddingValuesa9UjIt4$default(calculateStartPadding, 0.0f, PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) consume2), 0.0f, 10, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 285993380, "CC(remember):Carousel.kt#9igjgp");
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CarouselKt.Carousel_cJHQLPU$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                PagerKt.m1076VerticalPager8jOkeI(pagerState2, SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue3, 1, null), m817PaddingValuesa9UjIt4$default2, carouselPageSize, i, f4, null, targetedFlingBehavior4, z3, false, null, null, KeylineSnapPosition, null, ComposableLambdaKt.rememberComposableLambda(-1042567175, true, new CarouselKt$Carousel$4(carouselState2, carouselPageSize, function4), startRestartGroup, 54), startRestartGroup, (i14 & 57344) | ((i14 >> 3) & 458752) | (i14 & 29360128) | (i14 & 234881024), 24576, 11840);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(276916918);
                                startRestartGroup.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f3 = f4;
                            targetedFlingBehavior3 = targetedFlingBehavior4;
                            z2 = z3;
                        } else {
                            carouselState2 = carouselState;
                            startRestartGroup.skipToGroupEnd();
                            z2 = z;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            f3 = f2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CarouselKt.Carousel_cJHQLPU$lambda$19(CarouselState.this, orientation, function2, paddingValues, i, modifier4, f3, targetedFlingBehavior3, z2, function4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i9 | 805306368;
                    i9 = i10;
                    boolean z42 = true;
                    if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i12;
                i9 = i4;
                if ((i3 & 512) != 0) {
                }
                i9 = i10;
                boolean z422 = true;
                if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            if ((i2 & 12582912) == 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i12;
            i9 = i4;
            if ((i3 & 512) != 0) {
            }
            i9 = i10;
            boolean z4222 = true;
            if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        f2 = f;
        if ((i2 & 12582912) == 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i12;
        i9 = i4;
        if ((i3 & 512) != 0) {
        }
        i9 = i10;
        boolean z42222 = true;
        if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static final Unit Carousel_cJHQLPU$lambda$16$lambda$15(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6760setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6742getCarouselo7Vup1c());
        return Unit.INSTANCE;
    }

    static final Unit Carousel_cJHQLPU$lambda$18$lambda$17(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6760setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6742getCarouselo7Vup1c());
        return Unit.INSTANCE;
    }

    private static final float calculateBeforeContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i) {
        float calculateStartPadding;
        ComposerKt.sourceInformationMarkerStart(composer, 1896839347, "C(calculateBeforeContentPadding)N(orientation)484@21819L7:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896839347, i, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:476)");
        }
        if (orientation == Orientation.Vertical) {
            composer.startReplaceGroup(-143556958);
            composer.endReplaceGroup();
            calculateStartPadding = paddingValues.getTop();
        } else {
            composer.startReplaceGroup(-143505436);
            ComposerKt.sourceInformation(composer, "481@21770L7");
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) consume);
            composer.endReplaceGroup();
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float mo407toPx0680j_4 = ((Density) consume2).mo407toPx0680j_4(calculateStartPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mo407toPx0680j_4;
    }

    private static final float calculateAfterContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i) {
        float calculateEndPadding;
        ComposerKt.sourceInformationMarkerStart(composer, 1018496720, "C(calculateAfterContentPadding)N(orientation)496@22177L7:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018496720, i, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:488)");
        }
        if (orientation == Orientation.Vertical) {
            composer.startReplaceGroup(-1907991582);
            composer.endReplaceGroup();
            calculateEndPadding = paddingValues.getBottom();
        } else {
            composer.startReplaceGroup(-1907937239);
            ComposerKt.sourceInformation(composer, "493@22128L7");
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) consume);
            composer.endReplaceGroup();
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float mo407toPx0680j_4 = ((Density) consume2).mo407toPx0680j_4(calculateEndPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mo407toPx0680j_4;
    }

    public static final Modifier carouselItem(Modifier modifier, final int i, final CarouselState carouselState, final Function0<Strategy> function0, final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final Shape shape) {
        return LayoutModifierKt.layout(modifier, new Function3() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CarouselKt.carouselItem$lambda$26(Function0.this, carouselState, i, carouselItemDrawInfoImpl, shape, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    static final MeasureResult carouselItem$lambda$26(Function0 function0, final CarouselState carouselState, final int i, final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final Shape shape, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        long m7464copyZbe2FdA;
        final Strategy strategy = (Strategy) function0.invoke();
        if (!strategy.getIsValid()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, 4, null);
        }
        final boolean z = carouselState.getPagerState().getLayoutInfo().getOrientation() == Orientation.Vertical;
        final boolean z2 = measureScope.getLayoutDirection() == LayoutDirection.Rtl;
        float itemMainAxisSize = strategy.getItemMainAxisSize();
        if (z) {
            m7464copyZbe2FdA = Constraints.m7464copyZbe2FdA(constraints.getValue(), Constraints.m7477getMinWidthimpl(constraints.getValue()), Constraints.m7475getMaxWidthimpl(constraints.getValue()), MathKt.roundToInt(itemMainAxisSize), MathKt.roundToInt(itemMainAxisSize));
        } else {
            m7464copyZbe2FdA = Constraints.m7464copyZbe2FdA(constraints.getValue(), MathKt.roundToInt(itemMainAxisSize), MathKt.roundToInt(itemMainAxisSize), Constraints.m7476getMinHeightimpl(constraints.getValue()), Constraints.m7474getMaxHeightimpl(constraints.getValue()));
        }
        final Placeable mo6183measureBRTryo0 = measurable.mo6183measureBRTryo0(m7464copyZbe2FdA);
        final float f = i != carouselState.getPagerState().getCurrentPage() ? i == 0 ? 0.0f : 1.0f / i : 1.0f;
        return MeasureScope.layout$default(measureScope, mo6183measureBRTryo0.getWidth(), mo6183measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CarouselKt.carouselItem$lambda$26$lambda$25(Placeable.this, f, carouselState, strategy, i, z, carouselItemDrawInfoImpl, shape, z2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    static final Unit carouselItem$lambda$26$lambda$25(Placeable placeable, float f, final CarouselState carouselState, final Strategy strategy, final int i, final boolean z, final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final Shape shape, final boolean z2, Placeable.PlacementScope placementScope) {
        placementScope.placeWithLayer(placeable, 0, 0, f, new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CarouselKt.carouselItem$lambda$26$lambda$25$lambda$24(CarouselState.this, strategy, i, z, carouselItemDrawInfoImpl, shape, z2, (GraphicsLayerScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit carouselItem$lambda$26$lambda$25$lambda$24(CarouselState carouselState, Strategy strategy, int i, boolean z, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape, boolean z2, GraphicsLayerScope graphicsLayerScope) {
        float calculateCurrentScrollOffset = calculateCurrentScrollOffset(carouselState, strategy);
        float calculateMaxScrollOffset = calculateMaxScrollOffset(carouselState, strategy);
        KeylineList keylineListForScrollOffset$material3$default = Strategy.getKeylineListForScrollOffset$material3$default(strategy, calculateCurrentScrollOffset, calculateMaxScrollOffset, false, 4, null);
        KeylineList keylineListForScrollOffset$material3 = strategy.getKeylineListForScrollOffset$material3(calculateCurrentScrollOffset, calculateMaxScrollOffset, true);
        float itemMainAxisSize = ((i * (strategy.getItemMainAxisSize() + strategy.getItemSpacing())) + (strategy.getItemMainAxisSize() / 2.0f)) - calculateCurrentScrollOffset;
        Keyline keylineBefore = keylineListForScrollOffset$material3$default.getKeylineBefore(itemMainAxisSize);
        Keyline keylineAfter = keylineListForScrollOffset$material3$default.getKeylineAfter(itemMainAxisSize);
        Keyline lerp = KeylineListKt.lerp(keylineBefore, keylineAfter, getProgress(keylineBefore, keylineAfter, itemMainAxisSize));
        boolean areEqual = Intrinsics.areEqual(keylineBefore, keylineAfter);
        float intBitsToFloat = (z ? Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)) : strategy.getItemMainAxisSize()) / 2.0f;
        float itemMainAxisSize2 = (z ? strategy.getItemMainAxisSize() : Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L))) / 2.0f;
        float intBitsToFloat2 = (z ? Float.intBitsToFloat((int) (graphicsLayerScope.getSize() >> 32)) : lerp.getSize()) / 2.0f;
        float size = (z ? lerp.getSize() : Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L))) / 2.0f;
        Rect rect = new Rect(intBitsToFloat - intBitsToFloat2, itemMainAxisSize2 - size, intBitsToFloat + intBitsToFloat2, itemMainAxisSize2 + size);
        carouselItemDrawInfoImpl.setSizeState(lerp.getSize());
        Iterator<Keyline> it = keylineListForScrollOffset$material3.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Keyline next = it.next();
        if (it.hasNext()) {
            float size2 = next.getSize();
            do {
                Keyline next2 = it.next();
                float size3 = next2.getSize();
                if (Float.compare(size2, size3) > 0) {
                    next = next2;
                    size2 = size3;
                }
            } while (it.hasNext());
        }
        carouselItemDrawInfoImpl.setMinSizeState(next.getSize());
        carouselItemDrawInfoImpl.setMaxSizeState(keylineListForScrollOffset$material3.getFirstFocal().getSize());
        carouselItemDrawInfoImpl.setMaskRectState(rect);
        graphicsLayerScope.setClip(!Intrinsics.areEqual(rect, new Rect(0.0f, 0.0f, Float.intBitsToFloat((int) (graphicsLayerScope.getSize() >> 32)), Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)))));
        graphicsLayerScope.setShape(shape);
        float offset = lerp.getOffset() - itemMainAxisSize;
        if (areEqual) {
            offset += (itemMainAxisSize - lerp.getUnadjustedOffset()) / lerp.getSize();
        }
        if (z) {
            graphicsLayerScope.setTranslationY(offset);
        } else {
            if (z2) {
                offset = -offset;
            }
            graphicsLayerScope.setTranslationX(offset);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: drawDebugLines-1Yev-eo$default, reason: not valid java name */
    static /* synthetic */ Modifier m2979drawDebugLines1Yeveo$default(Modifier modifier, CarouselState carouselState, CarouselPageSize carouselPageSize, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            j = Color.INSTANCE.m4772getMagenta0d7_KjU();
        }
        long j2 = j;
        if ((i & 8) != 0) {
            f = Dp.m7522constructorimpl(4.0f);
        }
        return m2978drawDebugLines1Yeveo(modifier, carouselState, carouselPageSize, j2, f);
    }

    /* renamed from: drawDebugLines-1Yev-eo, reason: not valid java name */
    private static final Modifier m2978drawDebugLines1Yeveo(Modifier modifier, final CarouselState carouselState, final CarouselPageSize carouselPageSize, final long j, final float f) {
        return DrawModifierKt.drawWithContent(modifier, new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CarouselKt.drawDebugLines_1Yev_eo$lambda$28(CarouselPageSize.this, carouselState, f, j, (ContentDrawScope) obj);
            }
        });
    }

    static final Unit drawDebugLines_1Yev_eo$lambda$28(CarouselPageSize carouselPageSize, CarouselState carouselState, float f, long j, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        Strategy strategy = carouselPageSize.getStrategy();
        KeylineList keylineListForScrollOffset$material3$default = Strategy.getKeylineListForScrollOffset$material3$default(strategy, calculateCurrentScrollOffset(carouselState, strategy), calculateMaxScrollOffset(carouselState, strategy), false, 4, null);
        float f2 = contentDrawScope.mo407toPx0680j_4(f);
        for (Keyline keyline : keylineListForScrollOffset$material3$default) {
            DrawScope.m5299drawLineNGM6Ib0$default(contentDrawScope, j, Offset.m4486constructorimpl((Float.floatToRawIntBits(keyline.getOffset()) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m4486constructorimpl((Float.floatToRawIntBits(keyline.getOffset()) << 32) | (Float.floatToRawIntBits(100.0f) & 4294967295L)), f2, 0, null, 0.0f, null, 0, 496, null);
        }
        return Unit.INSTANCE;
    }

    public static final float calculateCurrentScrollOffset(CarouselState carouselState, Strategy strategy) {
        float itemMainAxisSize = strategy.getItemMainAxisSize() + strategy.getItemSpacing();
        return ((carouselState.getPagerState().getCurrentPage() * itemMainAxisSize) + (carouselState.getPagerState().getCurrentPageOffsetFraction() * itemMainAxisSize)) - KeylineSnapPositionKt.getSnapPositionOffset(strategy, carouselState.getPagerState().getCurrentPage(), carouselState.getPagerState().getPageCount());
    }

    public static final float calculateMaxScrollOffset(CarouselState carouselState, Strategy strategy) {
        float pageCount = carouselState.getPagerState().getPageCount();
        return RangesKt.coerceAtLeast(((strategy.getItemMainAxisSize() * pageCount) + (strategy.getItemSpacing() * (pageCount - 1.0f))) - strategy.getAvailableSpace(), 0.0f);
    }

    private static final float getProgress(Keyline keyline, Keyline keyline2, float f) {
        if (Intrinsics.areEqual(keyline, keyline2)) {
            return 1.0f;
        }
        return (f - keyline.getUnadjustedOffset()) / (keyline2.getUnadjustedOffset() - keyline.getUnadjustedOffset());
    }
}
