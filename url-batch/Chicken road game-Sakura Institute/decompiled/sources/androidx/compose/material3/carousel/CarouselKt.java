package androidx.compose.material3.carousel;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Iterator;
import java.util.NoSuchElementException;
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
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a»\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000526\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u001621\u0010\u0017\u001a-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0091\u0001\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\u000e\u001a\u00020\u000f21\u0010\u0017\u001a-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a}\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00142\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000e\u001a\u00020\u000f21\u0010\u0017\u001a-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0018\u0010(\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H\u0000\u001a\u0018\u0010+\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H\u0001\u001a \u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\bH\u0002\u001a\u0019\u00101\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u00102\u001a\u0019\u00103\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u00102\u001a:\u00104\u001a\u00020\u0013*\u00020\u00132\u0006\u00105\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Carousel", "", "state", "Landroidx/compose/material3/carousel/CarouselState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "keylineList", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "availableSpace", "itemSpacing", "Landroidx/compose/material3/carousel/KeylineList;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "maxNonFocalVisibleItemCount", "", "modifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "content", "Landroidx/compose/material3/carousel/CarouselItemScope;", "itemIndex", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Carousel-V-95POc", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ILandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalMultiBrowseCarousel", "preferredItemWidth", "minSmallItemWidth", "maxSmallItemWidth", "HorizontalMultiBrowseCarousel-zCIJ0Nk", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;FFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalUncontainedCarousel", "itemWidth", "HorizontalUncontainedCarousel-9QcgTRs", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "calculateCurrentScrollOffset", "strategy", "Landroidx/compose/material3/carousel/Strategy;", "calculateMaxScrollOffset", "getProgress", "before", "Landroidx/compose/material3/carousel/Keyline;", "after", "unadjustedOffset", "calculateAfterContentPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)F", "calculateBeforeContentPadding", "carouselItem", "index", "Lkotlin/Function0;", "carouselItemInfo", "Landroidx/compose/material3/carousel/CarouselItemInfoImpl;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fb  */
    /* renamed from: HorizontalMultiBrowseCarousel-zCIJ0Nk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2564HorizontalMultiBrowseCarouselzCIJ0Nk(final CarouselState carouselState, final float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, float f3, float f4, PaddingValues paddingValues, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final float f5;
        final TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        float f6;
        int i6;
        float f7;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        Modifier modifier2;
        float m6299constructorimpl;
        boolean z;
        PaddingValues m674PaddingValues0680j_4;
        TargetedFlingBehavior targetedFlingBehavior3;
        boolean changed;
        Object rememberedValue;
        final float f8;
        final float f9;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1825706865);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalMultiBrowseCarousel)P(8,7:c#ui.unit.Dp,6,3:c#ui.unit.Dp,2,5:c#ui.unit.Dp,4:c#ui.unit.Dp,1)106@5374L41,112@5703L7,116@5816L554,113@5715L1048:Carousel.kt#dcf9yb");
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
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
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
                    f6 = f3;
                    i3 |= startRestartGroup.changed(f6) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        f7 = f4;
                    } else {
                        f7 = f4;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f7) ? 1048576 : 524288;
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
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
                        i8 = i3;
                        if ((i8 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i10 != 0 ? Modifier.INSTANCE : modifier;
                                m6299constructorimpl = i4 != 0 ? Dp.m6299constructorimpl(0) : f5;
                                if ((i2 & 16) != 0) {
                                    TargetedFlingBehavior singleAdvanceFlingBehavior = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState, null, startRestartGroup, (i8 & 14) | 384, 2);
                                    i8 &= -57345;
                                    targetedFlingBehavior2 = singleAdvanceFlingBehavior;
                                }
                                if (i5 != 0) {
                                    f6 = CarouselDefaults.INSTANCE.m2561getMinSmallItemSizeD9Ej5fM$material3_release();
                                }
                                if (i6 != 0) {
                                    f7 = CarouselDefaults.INSTANCE.m2560getMaxSmallItemSizeD9Ej5fM$material3_release();
                                }
                                z = false;
                                if (i7 != 0) {
                                    m674PaddingValues0680j_4 = PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(0));
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    final float f10 = f7;
                                    int i11 = i8;
                                    final float f11 = f6;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1825706865, i11, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:111)");
                                    }
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density = (Density) consume;
                                    Orientation orientation = Orientation.Horizontal;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1995157598, "CC(remember):Carousel.kt#9igjgp");
                                    changed = startRestartGroup.changed(density) | ((i11 & 112) != 32 ? true : z) | startRestartGroup.changedInstance(carouselState) | ((i11 & 458752) != 131072 ? true : z) | ((3670016 & i11) != 1048576 ? z : true);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ KeylineList invoke(Float f12, Float f13) {
                                                return invoke(f12.floatValue(), f13.floatValue());
                                            }

                                            public final KeylineList invoke(float f12, float f13) {
                                                Density density2 = Density.this;
                                                return KeylinesKt.multiBrowseKeylineList(density2, f12, density2.mo373toPx0680j_4(f), f13, carouselState.getItemCountState().getValue().invoke().intValue(), density2.mo373toPx0680j_4(f11), density2.mo373toPx0680j_4(f10));
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    Function2 function2 = (Function2) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i12 = i11 << 9;
                                    m2563CarouselV95POc(carouselState, orientation, function2, m674PaddingValues0680j_4, 2, modifier2, m6299constructorimpl, targetedFlingBehavior3, function4, startRestartGroup, (i11 & 14) | 24624 | ((i11 >> 12) & 7168) | (458752 & i12) | (3670016 & i12) | (i12 & 29360128) | (i11 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    targetedFlingBehavior2 = targetedFlingBehavior3;
                                    f8 = f11;
                                    f9 = f10;
                                    modifier3 = modifier2;
                                    f5 = m6299constructorimpl;
                                    paddingValues3 = m674PaddingValues0680j_4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i8 &= -57345;
                                }
                                modifier2 = modifier;
                                z = false;
                                m6299constructorimpl = f5;
                            }
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            m674PaddingValues0680j_4 = paddingValues2;
                            final float f102 = f7;
                            int i112 = i8;
                            final float f112 = f6;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density2 = (Density) consume2;
                            Orientation orientation2 = Orientation.Horizontal;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1995157598, "CC(remember):Carousel.kt#9igjgp");
                            changed = startRestartGroup.changed(density2) | ((i112 & 112) != 32 ? true : z) | startRestartGroup.changedInstance(carouselState) | ((i112 & 458752) != 131072 ? true : z) | ((3670016 & i112) != 1048576 ? z : true);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ KeylineList invoke(Float f12, Float f13) {
                                    return invoke(f12.floatValue(), f13.floatValue());
                                }

                                public final KeylineList invoke(float f12, float f13) {
                                    Density density22 = Density.this;
                                    return KeylinesKt.multiBrowseKeylineList(density22, f12, density22.mo373toPx0680j_4(f), f13, carouselState.getItemCountState().getValue().invoke().intValue(), density22.mo373toPx0680j_4(f112), density22.mo373toPx0680j_4(f102));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            Function2 function22 = (Function2) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i122 = i112 << 9;
                            m2563CarouselV95POc(carouselState, orientation2, function22, m674PaddingValues0680j_4, 2, modifier2, m6299constructorimpl, targetedFlingBehavior3, function4, startRestartGroup, (i112 & 14) | 24624 | ((i112 >> 12) & 7168) | (458752 & i122) | (3670016 & i122) | (i122 & 29360128) | (i112 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            targetedFlingBehavior2 = targetedFlingBehavior3;
                            f8 = f112;
                            f9 = f102;
                            modifier3 = modifier2;
                            f5 = m6299constructorimpl;
                            paddingValues3 = m674PaddingValues0680j_4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            paddingValues3 = paddingValues2;
                            f9 = f7;
                            f8 = f6;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i13) {
                                    CarouselKt.m2564HorizontalMultiBrowseCarouselzCIJ0Nk(CarouselState.this, f, modifier3, f5, targetedFlingBehavior2, f8, f9, paddingValues3, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i3;
                    if ((i8 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    z = false;
                    if (i7 != 0) {
                    }
                    targetedFlingBehavior3 = targetedFlingBehavior2;
                    m674PaddingValues0680j_4 = paddingValues2;
                    final float f1022 = f7;
                    int i1122 = i8;
                    final float f1122 = f6;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localDensity22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density22 = (Density) consume22;
                    Orientation orientation22 = Orientation.Horizontal;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1995157598, "CC(remember):Carousel.kt#9igjgp");
                    changed = startRestartGroup.changed(density22) | ((i1122 & 112) != 32 ? true : z) | startRestartGroup.changedInstance(carouselState) | ((i1122 & 458752) != 131072 ? true : z) | ((3670016 & i1122) != 1048576 ? z : true);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ KeylineList invoke(Float f12, Float f13) {
                            return invoke(f12.floatValue(), f13.floatValue());
                        }

                        public final KeylineList invoke(float f12, float f13) {
                            Density density222 = Density.this;
                            return KeylinesKt.multiBrowseKeylineList(density222, f12, density222.mo373toPx0680j_4(f), f13, carouselState.getItemCountState().getValue().invoke().intValue(), density222.mo373toPx0680j_4(f1122), density222.mo373toPx0680j_4(f1022));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    Function2 function222 = (Function2) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i1222 = i1122 << 9;
                    m2563CarouselV95POc(carouselState, orientation22, function222, m674PaddingValues0680j_4, 2, modifier2, m6299constructorimpl, targetedFlingBehavior3, function4, startRestartGroup, (i1122 & 14) | 24624 | ((i1122 >> 12) & 7168) | (458752 & i1222) | (3670016 & i1222) | (i1222 & 29360128) | (i1122 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    targetedFlingBehavior2 = targetedFlingBehavior3;
                    f8 = f1122;
                    f9 = f1022;
                    modifier3 = modifier2;
                    f5 = m6299constructorimpl;
                    paddingValues3 = m674PaddingValues0680j_4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f6 = f3;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i8 = i3;
                if ((i8 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                z = false;
                if (i7 != 0) {
                }
                targetedFlingBehavior3 = targetedFlingBehavior2;
                m674PaddingValues0680j_4 = paddingValues2;
                final float f10222 = f7;
                int i11222 = i8;
                final float f11222 = f6;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localDensity222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density222 = (Density) consume222;
                Orientation orientation222 = Orientation.Horizontal;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1995157598, "CC(remember):Carousel.kt#9igjgp");
                changed = startRestartGroup.changed(density222) | ((i11222 & 112) != 32 ? true : z) | startRestartGroup.changedInstance(carouselState) | ((i11222 & 458752) != 131072 ? true : z) | ((3670016 & i11222) != 1048576 ? z : true);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ KeylineList invoke(Float f12, Float f13) {
                        return invoke(f12.floatValue(), f13.floatValue());
                    }

                    public final KeylineList invoke(float f12, float f13) {
                        Density density2222 = Density.this;
                        return KeylinesKt.multiBrowseKeylineList(density2222, f12, density2222.mo373toPx0680j_4(f), f13, carouselState.getItemCountState().getValue().invoke().intValue(), density2222.mo373toPx0680j_4(f11222), density2222.mo373toPx0680j_4(f10222));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                Function2 function2222 = (Function2) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i12222 = i11222 << 9;
                m2563CarouselV95POc(carouselState, orientation222, function2222, m674PaddingValues0680j_4, 2, modifier2, m6299constructorimpl, targetedFlingBehavior3, function4, startRestartGroup, (i11222 & 14) | 24624 | ((i11222 >> 12) & 7168) | (458752 & i12222) | (3670016 & i12222) | (i12222 & 29360128) | (i11222 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                targetedFlingBehavior2 = targetedFlingBehavior3;
                f8 = f11222;
                f9 = f10222;
                modifier3 = modifier2;
                f5 = m6299constructorimpl;
                paddingValues3 = m674PaddingValues0680j_4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f5 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f6 = f3;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i8 = i3;
            if ((i8 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            z = false;
            if (i7 != 0) {
            }
            targetedFlingBehavior3 = targetedFlingBehavior2;
            m674PaddingValues0680j_4 = paddingValues2;
            final float f102222 = f7;
            int i112222 = i8;
            final float f112222 = f6;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localDensity2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density2222 = (Density) consume2222;
            Orientation orientation2222 = Orientation.Horizontal;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1995157598, "CC(remember):Carousel.kt#9igjgp");
            changed = startRestartGroup.changed(density2222) | ((i112222 & 112) != 32 ? true : z) | startRestartGroup.changedInstance(carouselState) | ((i112222 & 458752) != 131072 ? true : z) | ((3670016 & i112222) != 1048576 ? z : true);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ KeylineList invoke(Float f12, Float f13) {
                    return invoke(f12.floatValue(), f13.floatValue());
                }

                public final KeylineList invoke(float f12, float f13) {
                    Density density22222 = Density.this;
                    return KeylinesKt.multiBrowseKeylineList(density22222, f12, density22222.mo373toPx0680j_4(f), f13, carouselState.getItemCountState().getValue().invoke().intValue(), density22222.mo373toPx0680j_4(f112222), density22222.mo373toPx0680j_4(f102222));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            Function2 function22222 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i122222 = i112222 << 9;
            m2563CarouselV95POc(carouselState, orientation2222, function22222, m674PaddingValues0680j_4, 2, modifier2, m6299constructorimpl, targetedFlingBehavior3, function4, startRestartGroup, (i112222 & 14) | 24624 | ((i112222 >> 12) & 7168) | (458752 & i122222) | (3670016 & i122222) | (i122222 & 29360128) | (i112222 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            targetedFlingBehavior2 = targetedFlingBehavior3;
            f8 = f112222;
            f9 = f102222;
            modifier3 = modifier2;
            f5 = m6299constructorimpl;
            paddingValues3 = m674PaddingValues0680j_4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f5 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f6 = f3;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i8 = i3;
        if ((i8 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        z = false;
        if (i7 != 0) {
        }
        targetedFlingBehavior3 = targetedFlingBehavior2;
        m674PaddingValues0680j_4 = paddingValues2;
        final float f1022222 = f7;
        int i1122222 = i8;
        final float f1122222 = f6;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localDensity22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density22222 = (Density) consume22222;
        Orientation orientation22222 = Orientation.Horizontal;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1995157598, "CC(remember):Carousel.kt#9igjgp");
        changed = startRestartGroup.changed(density22222) | ((i1122222 & 112) != 32 ? true : z) | startRestartGroup.changedInstance(carouselState) | ((i1122222 & 458752) != 131072 ? true : z) | ((3670016 & i1122222) != 1048576 ? z : true);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ KeylineList invoke(Float f12, Float f13) {
                return invoke(f12.floatValue(), f13.floatValue());
            }

            public final KeylineList invoke(float f12, float f13) {
                Density density222222 = Density.this;
                return KeylinesKt.multiBrowseKeylineList(density222222, f12, density222222.mo373toPx0680j_4(f), f13, carouselState.getItemCountState().getValue().invoke().intValue(), density222222.mo373toPx0680j_4(f1122222), density222222.mo373toPx0680j_4(f1022222));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        Function2 function222222 = (Function2) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i1222222 = i1122222 << 9;
        m2563CarouselV95POc(carouselState, orientation22222, function222222, m674PaddingValues0680j_4, 2, modifier2, m6299constructorimpl, targetedFlingBehavior3, function4, startRestartGroup, (i1122222 & 14) | 24624 | ((i1122222 >> 12) & 7168) | (458752 & i1222222) | (3670016 & i1222222) | (i1222222 & 29360128) | (i1122222 & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        targetedFlingBehavior2 = targetedFlingBehavior3;
        f8 = f1122222;
        f9 = f1022222;
        modifier3 = modifier2;
        f5 = m6299constructorimpl;
        paddingValues3 = m674PaddingValues0680j_4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x006a  */
    /* renamed from: HorizontalUncontainedCarousel-9QcgTRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2565HorizontalUncontainedCarousel9QcgTRs(final CarouselState carouselState, final float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, PaddingValues paddingValues, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f3;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        PaddingValues paddingValues2;
        boolean z;
        int i6;
        final float f4;
        TargetedFlingBehavior targetedFlingBehavior3;
        PaddingValues paddingValues3;
        boolean z2;
        Object rememberedValue;
        final TargetedFlingBehavior targetedFlingBehavior4;
        final PaddingValues paddingValues4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(529322840);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalUncontainedCarousel)P(6,4:c#ui.unit.Dp,5,3:c#ui.unit.Dp,2,1)175@8483L21,179@8666L7,183@8779L337,180@8678L818:Carousel.kt#dcf9yb");
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
        int i8 = i2 & 4;
        if (i8 != 0) {
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
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function4) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                f3 = Dp.m6299constructorimpl(0);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                targetedFlingBehavior2 = CarouselDefaults.INSTANCE.noSnapFlingBehavior(startRestartGroup, 6);
                            }
                            z = false;
                            if (i5 == 0) {
                                i6 = i3;
                                paddingValues3 = PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(0));
                                f4 = f3;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                            } else {
                                i6 = i3;
                                f4 = f3;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                paddingValues3 = paddingValues2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i6 = i3;
                            f4 = f3;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            paddingValues3 = paddingValues2;
                            z = false;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(529322840, i6, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:178)");
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Density density = (Density) consume;
                        Orientation orientation = Orientation.Horizontal;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1883505148, "CC(remember):Carousel.kt#9igjgp");
                        boolean changed = startRestartGroup.changed(density);
                        if ((i6 & 112) == 32) {
                            z = true;
                        }
                        z2 = z | changed;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalUncontainedCarousel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ KeylineList invoke(Float f5, Float f6) {
                                    return invoke(f5.floatValue(), f6.floatValue());
                                }

                                public final KeylineList invoke(float f5, float f6) {
                                    Density density2 = Density.this;
                                    return KeylinesKt.uncontainedKeylineList(density2, f5, density2.mo373toPx0680j_4(f), f6);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        Function2 function2 = (Function2) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i9 = i6 << 9;
                        m2563CarouselV95POc(carouselState, orientation, function2, paddingValues3, 0, modifier2, f4, targetedFlingBehavior3, function4, startRestartGroup, (i6 & 14) | 24624 | ((i6 >> 6) & 7168) | (458752 & i9) | (3670016 & i9) | (i9 & 29360128) | ((i6 << 6) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        targetedFlingBehavior4 = targetedFlingBehavior3;
                        paddingValues4 = paddingValues3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        f4 = f3;
                        targetedFlingBehavior4 = targetedFlingBehavior2;
                        paddingValues4 = paddingValues2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalUncontainedCarousel$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                CarouselKt.m2565HorizontalUncontainedCarousel9QcgTRs(CarouselState.this, f, modifier3, f4, targetedFlingBehavior4, paddingValues4, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                paddingValues2 = paddingValues;
                if ((i2 & 64) == 0) {
                }
                if ((599187 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                z = false;
                if (i5 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density2 = (Density) consume2;
                Orientation orientation2 = Orientation.Horizontal;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1883505148, "CC(remember):Carousel.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(density2);
                if ((i6 & 112) == 32) {
                }
                z2 = z | changed2;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalUncontainedCarousel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ KeylineList invoke(Float f5, Float f6) {
                        return invoke(f5.floatValue(), f6.floatValue());
                    }

                    public final KeylineList invoke(float f5, float f6) {
                        Density density22 = Density.this;
                        return KeylinesKt.uncontainedKeylineList(density22, f5, density22.mo373toPx0680j_4(f), f6);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                Function2 function22 = (Function2) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i92 = i6 << 9;
                m2563CarouselV95POc(carouselState, orientation2, function22, paddingValues3, 0, modifier2, f4, targetedFlingBehavior3, function4, startRestartGroup, (i6 & 14) | 24624 | ((i6 >> 6) & 7168) | (458752 & i92) | (3670016 & i92) | (i92 & 29360128) | ((i6 << 6) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                targetedFlingBehavior4 = targetedFlingBehavior3;
                paddingValues4 = paddingValues3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            if ((i2 & 64) == 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            z = false;
            if (i5 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density22 = (Density) consume22;
            Orientation orientation22 = Orientation.Horizontal;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1883505148, "CC(remember):Carousel.kt#9igjgp");
            boolean changed22 = startRestartGroup.changed(density22);
            if ((i6 & 112) == 32) {
            }
            z2 = z | changed22;
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalUncontainedCarousel$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ KeylineList invoke(Float f5, Float f6) {
                    return invoke(f5.floatValue(), f6.floatValue());
                }

                public final KeylineList invoke(float f5, float f6) {
                    Density density222 = Density.this;
                    return KeylinesKt.uncontainedKeylineList(density222, f5, density222.mo373toPx0680j_4(f), f6);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            Function2 function222 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i922 = i6 << 9;
            m2563CarouselV95POc(carouselState, orientation22, function222, paddingValues3, 0, modifier2, f4, targetedFlingBehavior3, function4, startRestartGroup, (i6 & 14) | 24624 | ((i6 >> 6) & 7168) | (458752 & i922) | (3670016 & i922) | (i922 & 29360128) | ((i6 << 6) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            targetedFlingBehavior4 = targetedFlingBehavior3;
            paddingValues4 = paddingValues3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
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
        paddingValues2 = paddingValues;
        if ((i2 & 64) == 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        z = false;
        if (i5 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density222 = (Density) consume222;
        Orientation orientation222 = Orientation.Horizontal;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1883505148, "CC(remember):Carousel.kt#9igjgp");
        boolean changed222 = startRestartGroup.changed(density222);
        if ((i6 & 112) == 32) {
        }
        z2 = z | changed222;
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalUncontainedCarousel$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ KeylineList invoke(Float f5, Float f6) {
                return invoke(f5.floatValue(), f6.floatValue());
            }

            public final KeylineList invoke(float f5, float f6) {
                Density density2222 = Density.this;
                return KeylinesKt.uncontainedKeylineList(density2222, f5, density2222.mo373toPx0680j_4(f), f6);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        Function2 function2222 = (Function2) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i9222 = i6 << 9;
        m2563CarouselV95POc(carouselState, orientation222, function2222, paddingValues3, 0, modifier2, f4, targetedFlingBehavior3, function4, startRestartGroup, (i6 & 14) | 24624 | ((i6 >> 6) & 7168) | (458752 & i9222) | (3670016 & i9222) | (i9222 & 29360128) | ((i6 << 6) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        targetedFlingBehavior4 = targetedFlingBehavior3;
        paddingValues4 = paddingValues3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b7  */
    /* renamed from: Carousel-V-95POc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2563CarouselV95POc(final CarouselState carouselState, final Orientation orientation, final Function2<? super Float, ? super Float, KeylineList> function2, final PaddingValues paddingValues, final int i, Modifier modifier, float f, TargetedFlingBehavior targetedFlingBehavior, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        float f2;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i6;
        boolean z;
        TargetedFlingBehavior targetedFlingBehavior3;
        Modifier modifier2;
        Object rememberedValue;
        Composer composer2;
        Modifier modifier3;
        float f3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-2035733443);
        ComposerKt.sourceInformation(startRestartGroup, "C(Carousel)P(8,7,4,1,5,6,3:c#ui.unit.Dp,2)239@11411L41,242@11572L42,243@11660L41,245@11729L118:Carousel.kt#dcf9yb");
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
            i4 |= startRestartGroup.changed(orientation) ? 32 : 16;
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
        } else if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(i) ? 16384 : 8192;
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i7 = 8388608;
                            i4 |= i7;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i7 = 4194304;
                    i4 |= i7;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i6 = i4;
                if ((38347923 & i6) == 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier;
                        float m6299constructorimpl = i5 != 0 ? Dp.m6299constructorimpl(0) : f2;
                        if ((i3 & 128) != 0) {
                            z = false;
                            TargetedFlingBehavior singleAdvanceFlingBehavior = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState, null, startRestartGroup, (i6 & 14) | 384, 2);
                            i6 &= -29360129;
                            targetedFlingBehavior3 = singleAdvanceFlingBehavior;
                        } else {
                            z = false;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                        }
                        modifier2 = modifier4;
                        f2 = m6299constructorimpl;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 128) != 0) {
                            i6 &= -29360129;
                        }
                        modifier2 = modifier;
                        z = false;
                        targetedFlingBehavior3 = targetedFlingBehavior2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2035733443, i6, -1, "androidx.compose.material3.carousel.Carousel (Carousel.kt:241)");
                    }
                    int i9 = ((i6 >> 9) & 14) | (i6 & 112);
                    float calculateBeforeContentPadding = calculateBeforeContentPadding(paddingValues, orientation, startRestartGroup, i9);
                    float calculateAfterContentPadding = calculateAfterContentPadding(paddingValues, orientation, startRestartGroup, i9);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2025986753, "CC(remember):Carousel.kt#9igjgp");
                    if ((i6 & 896) == 256) {
                        z = true;
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new CarouselPageSize(function2, calculateBeforeContentPadding, calculateAfterContentPadding);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final CarouselPageSize carouselPageSize = (CarouselPageSize) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SnapPosition KeylineSnapPosition = KeylineSnapPositionKt.KeylineSnapPosition(carouselPageSize);
                    if (orientation == Orientation.Horizontal) {
                        startRestartGroup.startReplaceGroup(-1618653092);
                        ComposerKt.sourceInformation(startRestartGroup, "266@12589L1014,252@11960L1643");
                        composer2 = startRestartGroup;
                        PagerKt.m918HorizontalPageroI3XNZo(carouselState.getPagerState(), modifier2, PaddingKt.m678PaddingValuesa9UjIt4$default(0.0f, paddingValues.getTop(), 0.0f, paddingValues.getBottom(), 5, null), carouselPageSize, i, f2, null, targetedFlingBehavior3, false, false, null, null, KeylineSnapPosition, ComposableLambdaKt.rememberComposableLambda(687111200, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                                invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PagerScope pagerScope, int i10, Composer composer3, int i11) {
                                ComposerKt.sourceInformation(composer3, "C267@12634L35,268@12694L63,269@12786L389,286@13376L21,281@13189L404:Carousel.kt#dcf9yb");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(687111200, i11, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:267)");
                                }
                                ComposerKt.sourceInformationMarkerStart(composer3, -685906675, "CC(remember):Carousel.kt#9igjgp");
                                Object rememberedValue2 = composer3.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new CarouselItemInfoImpl();
                                    composer3.updateRememberedValue(rememberedValue2);
                                }
                                final CarouselItemInfoImpl carouselItemInfoImpl = (CarouselItemInfoImpl) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerStart(composer3, -685904727, "CC(remember):Carousel.kt#9igjgp");
                                Object rememberedValue3 = composer3.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new CarouselItemScopeImpl(carouselItemInfoImpl);
                                    composer3.updateRememberedValue(rememberedValue3);
                                }
                                CarouselItemScopeImpl carouselItemScopeImpl = (CarouselItemScopeImpl) rememberedValue3;
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerStart(composer3, -685901457, "CC(remember):Carousel.kt#9igjgp");
                                Object rememberedValue4 = composer3.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1$clipShape$1$1
                                        @Override // androidx.compose.ui.graphics.Shape
                                        /* renamed from: createOutline-Pq9zytI */
                                        public Outline mo284createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
                                            return new Outline.Rectangle(CarouselItemInfoImpl.this.getMaskRect());
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue4);
                                }
                                CarouselKt$Carousel$1$clipShape$1$1 carouselKt$Carousel$1$clipShape$1$1 = (CarouselKt$Carousel$1$clipShape$1$1) rememberedValue4;
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                CarouselState carouselState2 = CarouselState.this;
                                ComposerKt.sourceInformationMarkerStart(composer3, -685882945, "CC(remember):Carousel.kt#9igjgp");
                                boolean changed = composer3.changed(carouselPageSize);
                                final CarouselPageSize carouselPageSize2 = carouselPageSize;
                                Object rememberedValue5 = composer3.rememberedValue();
                                if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = (Function0) new Function0<Strategy>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1$1$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Strategy invoke() {
                                            return CarouselPageSize.this.getStrategy();
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue5);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Modifier carouselItem = CarouselKt.carouselItem(companion, i10, carouselState2, (Function0) rememberedValue5, carouselItemInfoImpl, carouselKt$Carousel$1$clipShape$1$1);
                                Function4<CarouselItemScope, Integer, Composer, Integer, Unit> function42 = function4;
                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, carouselItem);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m3333constructorimpl = Updater.m3333constructorimpl(composer3);
                                Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer3, 1112607687, "C291@13566L13:Carousel.kt#dcf9yb");
                                function42.invoke(carouselItemScopeImpl, Integer.valueOf(i10), composer3, Integer.valueOf(i11 & 112));
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), composer2, ((i6 >> 12) & 112) | (57344 & i6) | ((i6 >> 3) & 458752) | (29360128 & i6), 3072, 3904);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = startRestartGroup;
                        if (orientation == Orientation.Vertical) {
                            composer2.startReplaceGroup(-1616959128);
                            ComposerKt.sourceInformation(composer2, "300@13962L7,301@14054L7,309@14347L1014,295@13666L1695");
                            PagerState pagerState = carouselState.getPagerState();
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) consume);
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer2.consume(localLayoutDirection2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            PagerKt.m919VerticalPageroI3XNZo(pagerState, modifier2, PaddingKt.m678PaddingValuesa9UjIt4$default(calculateStartPadding, 0.0f, PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) consume2), 0.0f, 10, null), carouselPageSize, i, f2, null, targetedFlingBehavior3, false, false, null, null, KeylineSnapPosition, ComposableLambdaKt.rememberComposableLambda(-817308503, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                                    invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PagerScope pagerScope, int i10, Composer composer3, int i11) {
                                    ComposerKt.sourceInformation(composer3, "C310@14392L35,311@14452L63,312@14544L389,329@15134L21,324@14947L404:Carousel.kt#dcf9yb");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-817308503, i11, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:310)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(composer3, -685850419, "CC(remember):Carousel.kt#9igjgp");
                                    Object rememberedValue2 = composer3.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new CarouselItemInfoImpl();
                                        composer3.updateRememberedValue(rememberedValue2);
                                    }
                                    final CarouselItemInfoImpl carouselItemInfoImpl = (CarouselItemInfoImpl) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -685848471, "CC(remember):Carousel.kt#9igjgp");
                                    Object rememberedValue3 = composer3.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new CarouselItemScopeImpl(carouselItemInfoImpl);
                                        composer3.updateRememberedValue(rememberedValue3);
                                    }
                                    CarouselItemScopeImpl carouselItemScopeImpl = (CarouselItemScopeImpl) rememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -685845201, "CC(remember):Carousel.kt#9igjgp");
                                    Object rememberedValue4 = composer3.rememberedValue();
                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$2$clipShape$1$1
                                            @Override // androidx.compose.ui.graphics.Shape
                                            /* renamed from: createOutline-Pq9zytI */
                                            public Outline mo284createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
                                                return new Outline.Rectangle(CarouselItemInfoImpl.this.getMaskRect());
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue4);
                                    }
                                    CarouselKt$Carousel$2$clipShape$1$1 carouselKt$Carousel$2$clipShape$1$1 = (CarouselKt$Carousel$2$clipShape$1$1) rememberedValue4;
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    CarouselState carouselState2 = CarouselState.this;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -685826689, "CC(remember):Carousel.kt#9igjgp");
                                    boolean changed = composer3.changed(carouselPageSize);
                                    final CarouselPageSize carouselPageSize2 = carouselPageSize;
                                    Object rememberedValue5 = composer3.rememberedValue();
                                    if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = (Function0) new Function0<Strategy>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$2$1$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Strategy invoke() {
                                                return CarouselPageSize.this.getStrategy();
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue5);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Modifier carouselItem = CarouselKt.carouselItem(companion, i10, carouselState2, (Function0) rememberedValue5, carouselItemInfoImpl, carouselKt$Carousel$2$clipShape$1$1);
                                    Function4<CarouselItemScope, Integer, Composer, Integer, Unit> function42 = function4;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, carouselItem);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m3333constructorimpl = Updater.m3333constructorimpl(composer3);
                                    Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1114351623, "C334@15324L13:Carousel.kt#dcf9yb");
                                    function42.invoke(carouselItemScopeImpl, Integer.valueOf(i10), composer3, Integer.valueOf(i11 & 112));
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, ((i6 >> 12) & 112) | (57344 & i6) | ((i6 >> 3) & 458752) | (29360128 & i6), 3072, 3904);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1615314857);
                            composer2.endReplaceGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    targetedFlingBehavior2 = targetedFlingBehavior3;
                    f3 = f2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    f3 = f2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    final float f4 = f3;
                    final TargetedFlingBehavior targetedFlingBehavior4 = targetedFlingBehavior2;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            CarouselKt.m2563CarouselV95POc(CarouselState.this, orientation, function2, paddingValues, i, modifier5, f4, targetedFlingBehavior4, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            if ((i2 & 12582912) == 0) {
            }
            if ((i3 & 256) != 0) {
            }
            i6 = i4;
            if ((38347923 & i6) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            modifier2 = modifier4;
            f2 = m6299constructorimpl;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i92 = ((i6 >> 9) & 14) | (i6 & 112);
            float calculateBeforeContentPadding2 = calculateBeforeContentPadding(paddingValues, orientation, startRestartGroup, i92);
            float calculateAfterContentPadding2 = calculateAfterContentPadding(paddingValues, orientation, startRestartGroup, i92);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2025986753, "CC(remember):Carousel.kt#9igjgp");
            if ((i6 & 896) == 256) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new CarouselPageSize(function2, calculateBeforeContentPadding2, calculateAfterContentPadding2);
            startRestartGroup.updateRememberedValue(rememberedValue);
            final CarouselPageSize carouselPageSize2 = (CarouselPageSize) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SnapPosition KeylineSnapPosition2 = KeylineSnapPositionKt.KeylineSnapPosition(carouselPageSize2);
            if (orientation == Orientation.Horizontal) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            targetedFlingBehavior2 = targetedFlingBehavior3;
            f3 = f2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        f2 = f;
        if ((i2 & 12582912) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        i6 = i4;
        if ((38347923 & i6) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        modifier2 = modifier4;
        f2 = m6299constructorimpl;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i922 = ((i6 >> 9) & 14) | (i6 & 112);
        float calculateBeforeContentPadding22 = calculateBeforeContentPadding(paddingValues, orientation, startRestartGroup, i922);
        float calculateAfterContentPadding22 = calculateAfterContentPadding(paddingValues, orientation, startRestartGroup, i922);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2025986753, "CC(remember):Carousel.kt#9igjgp");
        if ((i6 & 896) == 256) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new CarouselPageSize(function2, calculateBeforeContentPadding22, calculateAfterContentPadding22);
        startRestartGroup.updateRememberedValue(rememberedValue);
        final CarouselPageSize carouselPageSize22 = (CarouselPageSize) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SnapPosition KeylineSnapPosition22 = KeylineSnapPositionKt.KeylineSnapPosition(carouselPageSize22);
        if (orientation == Orientation.Horizontal) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        targetedFlingBehavior2 = targetedFlingBehavior3;
        f3 = f2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final float calculateBeforeContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i) {
        float calculateStartPadding;
        ComposerKt.sourceInformationMarkerStart(composer, 1896839347, "C(calculateBeforeContentPadding)*349@15698L7:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896839347, i, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:341)");
        }
        composer.startReplaceGroup(295830617);
        ComposerKt.sourceInformation(composer, "346@15649L7");
        if (orientation == Orientation.Vertical) {
            calculateStartPadding = paddingValues.getTop();
        } else {
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) consume);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float mo373toPx0680j_4 = ((Density) consume2).mo373toPx0680j_4(calculateStartPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mo373toPx0680j_4;
    }

    private static final float calculateAfterContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i) {
        float calculateEndPadding;
        ComposerKt.sourceInformationMarkerStart(composer, 1018496720, "C(calculateAfterContentPadding)*361@16056L7:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018496720, i, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:353)");
        }
        composer.startReplaceGroup(-587616383);
        ComposerKt.sourceInformation(composer, "358@16007L7");
        if (orientation == Orientation.Vertical) {
            calculateEndPadding = paddingValues.getBottom();
        } else {
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) consume);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float mo373toPx0680j_4 = ((Density) consume2).mo373toPx0680j_4(calculateEndPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mo373toPx0680j_4;
    }

    public static final Modifier carouselItem(Modifier modifier, final int i, final CarouselState carouselState, final Function0<Strategy> function0, final CarouselItemInfoImpl carouselItemInfoImpl, final Shape shape) {
        return LayoutModifierKt.layout(modifier, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.carousel.CarouselKt$carouselItem$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m2566invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m2566invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                long m6242copyZbe2FdA;
                final Strategy invoke = function0.invoke();
                if (!invoke.getIsValid()) {
                    return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$carouselItem$1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                final boolean z = carouselState.getPagerState().getLayoutInfo().getOrientation() == Orientation.Vertical;
                final boolean z2 = measureScope.getLayoutDirection() == LayoutDirection.Rtl;
                float itemMainAxisSize = invoke.getItemMainAxisSize();
                if (z) {
                    m6242copyZbe2FdA = Constraints.m6242copyZbe2FdA(j, Constraints.m6254getMinWidthimpl(j), Constraints.m6252getMaxWidthimpl(j), MathKt.roundToInt(itemMainAxisSize), MathKt.roundToInt(itemMainAxisSize));
                } else {
                    m6242copyZbe2FdA = Constraints.m6242copyZbe2FdA(j, MathKt.roundToInt(itemMainAxisSize), MathKt.roundToInt(itemMainAxisSize), Constraints.m6253getMinHeightimpl(j), Constraints.m6251getMaxHeightimpl(j));
                }
                final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(m6242copyZbe2FdA);
                int width = mo5175measureBRTryo0.getWidth();
                int height = mo5175measureBRTryo0.getHeight();
                final CarouselState carouselState2 = carouselState;
                final int i2 = i;
                final CarouselItemInfoImpl carouselItemInfoImpl2 = carouselItemInfoImpl;
                final Shape shape2 = shape;
                return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$carouselItem$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        Placeable placeable = Placeable.this;
                        final CarouselState carouselState3 = carouselState2;
                        final Strategy strategy = invoke;
                        final int i3 = i2;
                        final boolean z3 = z;
                        final CarouselItemInfoImpl carouselItemInfoImpl3 = carouselItemInfoImpl2;
                        final Shape shape3 = shape2;
                        final boolean z4 = z2;
                        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                invoke2(graphicsLayerScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                float progress;
                                float calculateCurrentScrollOffset = CarouselKt.calculateCurrentScrollOffset(CarouselState.this, strategy);
                                float calculateMaxScrollOffset = CarouselKt.calculateMaxScrollOffset(CarouselState.this, strategy);
                                KeylineList keylineListForScrollOffset$material3_release$default = Strategy.getKeylineListForScrollOffset$material3_release$default(strategy, calculateCurrentScrollOffset, calculateMaxScrollOffset, false, 4, null);
                                KeylineList keylineListForScrollOffset$material3_release = strategy.getKeylineListForScrollOffset$material3_release(calculateCurrentScrollOffset, calculateMaxScrollOffset, true);
                                float itemMainAxisSize2 = ((i3 * (strategy.getItemMainAxisSize() + strategy.getItemSpacing())) + (strategy.getItemMainAxisSize() / 2.0f)) - calculateCurrentScrollOffset;
                                Keyline keylineBefore = keylineListForScrollOffset$material3_release$default.getKeylineBefore(itemMainAxisSize2);
                                Keyline keylineAfter = keylineListForScrollOffset$material3_release$default.getKeylineAfter(itemMainAxisSize2);
                                progress = CarouselKt.getProgress(keylineBefore, keylineAfter, itemMainAxisSize2);
                                Keyline lerp = KeylineListKt.lerp(keylineBefore, keylineAfter, progress);
                                boolean areEqual = Intrinsics.areEqual(keylineBefore, keylineAfter);
                                float m3665getHeightimpl = (z3 ? Size.m3665getHeightimpl(graphicsLayerScope.getSize()) : strategy.getItemMainAxisSize()) / 2.0f;
                                float itemMainAxisSize3 = (z3 ? strategy.getItemMainAxisSize() : Size.m3665getHeightimpl(graphicsLayerScope.getSize())) / 2.0f;
                                float m3668getWidthimpl = (z3 ? Size.m3668getWidthimpl(graphicsLayerScope.getSize()) : lerp.getSize()) / 2.0f;
                                float size = (z3 ? lerp.getSize() : Size.m3665getHeightimpl(graphicsLayerScope.getSize())) / 2.0f;
                                Rect rect = new Rect(m3665getHeightimpl - m3668getWidthimpl, itemMainAxisSize3 - size, m3665getHeightimpl + m3668getWidthimpl, itemMainAxisSize3 + size);
                                carouselItemInfoImpl3.setSizeState(lerp.getSize());
                                CarouselItemInfoImpl carouselItemInfoImpl4 = carouselItemInfoImpl3;
                                Iterator<Keyline> it = keylineListForScrollOffset$material3_release.iterator();
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
                                carouselItemInfoImpl4.setMinSizeState(next.getSize());
                                carouselItemInfoImpl3.setMaxSizeState(keylineListForScrollOffset$material3_release.getFirstFocal().getSize());
                                carouselItemInfoImpl3.setMaskRectState(rect);
                                graphicsLayerScope.setClip(!Intrinsics.areEqual(rect, new Rect(0.0f, 0.0f, Size.m3668getWidthimpl(graphicsLayerScope.getSize()), Size.m3665getHeightimpl(graphicsLayerScope.getSize()))));
                                graphicsLayerScope.setShape(shape3);
                                float offset = lerp.getOffset() - itemMainAxisSize2;
                                if (areEqual) {
                                    offset += (itemMainAxisSize2 - lerp.getUnadjustedOffset()) / lerp.getSize();
                                }
                                if (z3) {
                                    graphicsLayerScope.setTranslationY(offset);
                                    return;
                                }
                                if (z4) {
                                    offset = -offset;
                                }
                                graphicsLayerScope.setTranslationX(offset);
                            }
                        }, 4, (Object) null);
                    }
                }, 4, null);
            }
        });
    }

    public static final float calculateCurrentScrollOffset(CarouselState carouselState, Strategy strategy) {
        float itemMainAxisSize = strategy.getItemMainAxisSize() + strategy.getItemSpacing();
        return ((carouselState.getPagerState().getCurrentPage() * itemMainAxisSize) + (carouselState.getPagerState().getCurrentPageOffsetFraction() * itemMainAxisSize)) - KeylineSnapPositionKt.getSnapPositionOffset(strategy, carouselState.getPagerState().getCurrentPage(), carouselState.getPagerState().getPageCount());
    }

    public static final float calculateMaxScrollOffset(CarouselState carouselState, Strategy strategy) {
        float pageCount = carouselState.getPagerState().getPageCount();
        return RangesKt.coerceAtLeast(((strategy.getItemMainAxisSize() * pageCount) + (strategy.getItemSpacing() * (pageCount - 1))) - strategy.getAvailableSpace(), 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getProgress(Keyline keyline, Keyline keyline2, float f) {
        if (Intrinsics.areEqual(keyline, keyline2)) {
            return 1.0f;
        }
        return (f - keyline.getUnadjustedOffset()) / (keyline2.getUnadjustedOffset() - keyline.getUnadjustedOffset());
    }
}
