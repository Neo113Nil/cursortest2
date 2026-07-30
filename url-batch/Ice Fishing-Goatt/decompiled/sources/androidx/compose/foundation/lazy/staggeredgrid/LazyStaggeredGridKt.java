package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyStaggeredGrid.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"LazyStaggeredGrid", "", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyStaggeredGrid-LJWHXA8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /* renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m874LazyStaggeredGridLJWHXA8(final LazyStaggeredGridState lazyStaggeredGridState, final Orientation orientation, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Modifier modifier, PaddingValues paddingValues, boolean z, FlingBehavior flingBehavior, boolean z2, float f, float f2, final Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        FlingBehavior flingBehavior2;
        int i15;
        float f3;
        boolean z4;
        FlingBehavior flingBehavior3;
        int i16;
        float f4;
        Modifier modifier3;
        PaddingValues paddingValues3;
        Object rememberedValue;
        final boolean z5;
        Composer composer2;
        final Modifier modifier4;
        final PaddingValues paddingValues4;
        final float f5;
        final float f6;
        final FlingBehavior flingBehavior4;
        final boolean z6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(288295126);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyStaggeredGrid)P(9,6,8,5,1,7,3,10,4:c#ui.unit.Dp,2:c#ui.unit.Dp)51@2370L15,61@2769L55,62@2850L24,63@2922L7,64@2954L266,76@3245L60,82@3456L278,90@3804L57,93@4024L7,89@3748L385,98@4194L316,78@3311L1332:LazyStaggeredGrid.kt#fzvcnm");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(lazyStaggeredGridState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(orientation) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= (i & 512) == 0 ? startRestartGroup.changed(lazyGridStaggeredGridSlotsProvider) : startRestartGroup.changedInstance(lazyGridStaggeredGridSlotsProvider) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    paddingValues2 = paddingValues;
                    i4 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i11 = i3 & 512;
                        if (i11 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i12 = i11;
                            i4 |= startRestartGroup.changed(f2) ? 536870912 : 268435456;
                            if ((i3 & 1024) == 0) {
                                i13 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i13 = i2 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                            } else {
                                i13 = i2;
                            }
                            i14 = i4;
                            if ((i14 & 306783379) == 306783378 || (i13 & 3) != 2 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                    PaddingValues m666PaddingValues0680j_4 = i6 == 0 ? PaddingKt.m666PaddingValues0680j_4(Dp.m6265constructorimpl(0.0f)) : paddingValues2;
                                    if (i7 != 0) {
                                        z3 = false;
                                    }
                                    if ((i3 & 64) == 0) {
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        i15 = i14 & (-3670017);
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                        i15 = i14;
                                    }
                                    boolean z7 = i8 == 0 ? true : z2;
                                    float m6265constructorimpl = i10 == 0 ? Dp.m6265constructorimpl(0.0f) : f;
                                    if (i12 == 0) {
                                        z4 = z7;
                                        f3 = Dp.m6265constructorimpl(0.0f);
                                    } else {
                                        f3 = f2;
                                        z4 = z7;
                                    }
                                    flingBehavior3 = flingBehavior2;
                                    i16 = i15;
                                    f4 = m6265constructorimpl;
                                    modifier3 = companion;
                                    paddingValues3 = m666PaddingValues0680j_4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        flingBehavior3 = flingBehavior;
                                        z4 = z2;
                                        f4 = f;
                                        f3 = f2;
                                        i16 = i14 & (-3670017);
                                    } else {
                                        flingBehavior3 = flingBehavior;
                                        z4 = z2;
                                        f4 = f;
                                        f3 = f2;
                                        i16 = i14;
                                    }
                                    modifier3 = modifier2;
                                    paddingValues3 = paddingValues2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(288295126, i16, i13, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
                                }
                                int i17 = i16 & 14;
                                Function0<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, ((i13 << 3) & 112) | i17);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                    startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ProvidableCompositionLocal<GraphicsContext> localGraphicsContext = CompositionLocalsKt.getLocalGraphicsContext();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localGraphicsContext);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i18 = i16 >> 6;
                                int i19 = (i18 & 896) | i17;
                                int i20 = i18 & 7168;
                                int i21 = i16 >> 9;
                                int i22 = i19 | i20 | ((i16 << 9) & 57344) | (i21 & 458752) | (i21 & 3670016) | ((i16 << 18) & 234881024);
                                boolean z8 = z3;
                                int i23 = i16;
                                Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m885rememberStaggeredGridMeasurePolicyqKj4JfE = LazyStaggeredGridMeasurePolicyKt.m885rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda, paddingValues3, z8, orientation, f4, f3, coroutineScope, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) consume, startRestartGroup, i22);
                                PaddingValues paddingValues5 = paddingValues3;
                                float f7 = f4;
                                float f8 = f3;
                                int i24 = i23 >> 12;
                                boolean z9 = z4;
                                Modifier lazyLayoutSemantics = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z8, startRestartGroup, (i24 & 112) | i17), orientation, z9, z8, startRestartGroup, ((i23 << 6) & 7168) | (i21 & 57344) | (i23 & 458752));
                                LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState = LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i17);
                                LazyLayoutBeyondBoundsInfo beyondBoundsInfo = lazyStaggeredGridState.getBeyondBoundsInfo();
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i25 = i23 >> 3;
                                FlingBehavior flingBehavior5 = flingBehavior3;
                                LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics, rememberLazyStaggeredGridBeyondBoundsState, beyondBoundsInfo, z8, (LayoutDirection) consume2, orientation, z9, startRestartGroup, (3670016 & i25) | (MutableVector.$stable << 6) | i20 | ((i23 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z9, z8, flingBehavior5, lazyStaggeredGridState.getMutableInteractionSource(), null, startRestartGroup, ((i23 << 3) & PointerIconCompat.TYPE_TEXT) | (i24 & 7168) | (i25 & 57344) | (i25 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), m885rememberStaggeredGridMeasurePolicyqKj4JfE, startRestartGroup, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z9;
                                composer2 = startRestartGroup;
                                modifier4 = modifier3;
                                paddingValues4 = paddingValues5;
                                f5 = f7;
                                f6 = f8;
                                flingBehavior4 = flingBehavior5;
                                z6 = z8;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z5 = z2;
                                f6 = f2;
                                z6 = z3;
                                composer2 = startRestartGroup;
                                modifier4 = modifier2;
                                paddingValues4 = paddingValues2;
                                flingBehavior4 = flingBehavior;
                                f5 = f;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
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

                                    public final void invoke(Composer composer3, int i26) {
                                        LazyStaggeredGridKt.m874LazyStaggeredGridLJWHXA8(LazyStaggeredGridState.this, orientation, lazyGridStaggeredGridSlotsProvider, modifier4, paddingValues4, z6, flingBehavior4, z5, f5, f6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i12 = i11;
                        if ((i3 & 1024) == 0) {
                        }
                        i14 = i4;
                        if ((i14 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        flingBehavior3 = flingBehavior2;
                        i16 = i15;
                        f4 = m6265constructorimpl;
                        modifier3 = companion;
                        paddingValues3 = m666PaddingValues0680j_4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i172 = i16 & 14;
                        Function0<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda2 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, ((i13 << 3) & 112) | i172);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ProvidableCompositionLocal<GraphicsContext> localGraphicsContext2 = CompositionLocalsKt.getLocalGraphicsContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(localGraphicsContext2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i182 = i16 >> 6;
                        int i192 = (i182 & 896) | i172;
                        int i202 = i182 & 7168;
                        int i212 = i16 >> 9;
                        int i222 = i192 | i202 | ((i16 << 9) & 57344) | (i212 & 458752) | (i212 & 3670016) | ((i16 << 18) & 234881024);
                        boolean z82 = z3;
                        int i232 = i16;
                        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m885rememberStaggeredGridMeasurePolicyqKj4JfE2 = LazyStaggeredGridMeasurePolicyKt.m885rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda2, paddingValues3, z82, orientation, f4, f3, coroutineScope2, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) consume3, startRestartGroup, i222);
                        PaddingValues paddingValues52 = paddingValues3;
                        float f72 = f4;
                        float f82 = f3;
                        int i242 = i232 >> 12;
                        boolean z92 = z4;
                        Modifier lazyLayoutSemantics2 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda2, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z82, startRestartGroup, (i242 & 112) | i172), orientation, z92, z82, startRestartGroup, ((i232 << 6) & 7168) | (i212 & 57344) | (i232 & 458752));
                        LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState2 = LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i172);
                        LazyLayoutBeyondBoundsInfo beyondBoundsInfo2 = lazyStaggeredGridState.getBeyondBoundsInfo();
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i252 = i232 >> 3;
                        FlingBehavior flingBehavior52 = flingBehavior3;
                        LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda2, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics2, rememberLazyStaggeredGridBeyondBoundsState2, beyondBoundsInfo2, z82, (LayoutDirection) consume22, orientation, z92, startRestartGroup, (3670016 & i252) | (MutableVector.$stable << 6) | i202 | ((i232 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z92, z82, flingBehavior52, lazyStaggeredGridState.getMutableInteractionSource(), null, startRestartGroup, ((i232 << 3) & PointerIconCompat.TYPE_TEXT) | (i242 & 7168) | (i252 & 57344) | (i252 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), m885rememberStaggeredGridMeasurePolicyqKj4JfE2, startRestartGroup, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z92;
                        composer2 = startRestartGroup;
                        modifier4 = modifier3;
                        paddingValues4 = paddingValues52;
                        f5 = f72;
                        f6 = f82;
                        flingBehavior4 = flingBehavior52;
                        z6 = z82;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if ((i3 & 1024) == 0) {
                    }
                    i14 = i4;
                    if ((i14 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    flingBehavior3 = flingBehavior2;
                    i16 = i15;
                    f4 = m6265constructorimpl;
                    modifier3 = companion;
                    paddingValues3 = m666PaddingValues0680j_4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1722 = i16 & 14;
                    Function0<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda22 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, ((i13 << 3) & 112) | i1722);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ProvidableCompositionLocal<GraphicsContext> localGraphicsContext22 = CompositionLocalsKt.getLocalGraphicsContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(localGraphicsContext22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i1822 = i16 >> 6;
                    int i1922 = (i1822 & 896) | i1722;
                    int i2022 = i1822 & 7168;
                    int i2122 = i16 >> 9;
                    int i2222 = i1922 | i2022 | ((i16 << 9) & 57344) | (i2122 & 458752) | (i2122 & 3670016) | ((i16 << 18) & 234881024);
                    boolean z822 = z3;
                    int i2322 = i16;
                    Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m885rememberStaggeredGridMeasurePolicyqKj4JfE22 = LazyStaggeredGridMeasurePolicyKt.m885rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda22, paddingValues3, z822, orientation, f4, f3, coroutineScope22, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) consume32, startRestartGroup, i2222);
                    PaddingValues paddingValues522 = paddingValues3;
                    float f722 = f4;
                    float f822 = f3;
                    int i2422 = i2322 >> 12;
                    boolean z922 = z4;
                    Modifier lazyLayoutSemantics22 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda22, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z822, startRestartGroup, (i2422 & 112) | i1722), orientation, z922, z822, startRestartGroup, ((i2322 << 6) & 7168) | (i2122 & 57344) | (i2322 & 458752));
                    LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState22 = LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i1722);
                    LazyLayoutBeyondBoundsInfo beyondBoundsInfo22 = lazyStaggeredGridState.getBeyondBoundsInfo();
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(localLayoutDirection22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i2522 = i2322 >> 3;
                    FlingBehavior flingBehavior522 = flingBehavior3;
                    LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda22, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics22, rememberLazyStaggeredGridBeyondBoundsState22, beyondBoundsInfo22, z822, (LayoutDirection) consume222, orientation, z922, startRestartGroup, (3670016 & i2522) | (MutableVector.$stable << 6) | i2022 | ((i2322 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z922, z822, flingBehavior522, lazyStaggeredGridState.getMutableInteractionSource(), null, startRestartGroup, ((i2322 << 3) & PointerIconCompat.TYPE_TEXT) | (i2422 & 7168) | (i2522 & 57344) | (i2522 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), m885rememberStaggeredGridMeasurePolicyqKj4JfE22, startRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z922;
                    composer2 = startRestartGroup;
                    modifier4 = modifier3;
                    paddingValues4 = paddingValues522;
                    f5 = f722;
                    f6 = f822;
                    flingBehavior4 = flingBehavior522;
                    z6 = z822;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                paddingValues2 = paddingValues;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i3 & 1024) == 0) {
                }
                i14 = i4;
                if ((i14 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if (i8 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                flingBehavior3 = flingBehavior2;
                i16 = i15;
                f4 = m6265constructorimpl;
                modifier3 = companion;
                paddingValues3 = m666PaddingValues0680j_4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i17222 = i16 & 14;
                Function0<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda222 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, ((i13 << 3) & 112) | i17222);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<GraphicsContext> localGraphicsContext222 = CompositionLocalsKt.getLocalGraphicsContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(localGraphicsContext222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i18222 = i16 >> 6;
                int i19222 = (i18222 & 896) | i17222;
                int i20222 = i18222 & 7168;
                int i21222 = i16 >> 9;
                int i22222 = i19222 | i20222 | ((i16 << 9) & 57344) | (i21222 & 458752) | (i21222 & 3670016) | ((i16 << 18) & 234881024);
                boolean z8222 = z3;
                int i23222 = i16;
                Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m885rememberStaggeredGridMeasurePolicyqKj4JfE222 = LazyStaggeredGridMeasurePolicyKt.m885rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda222, paddingValues3, z8222, orientation, f4, f3, coroutineScope222, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) consume322, startRestartGroup, i22222);
                PaddingValues paddingValues5222 = paddingValues3;
                float f7222 = f4;
                float f8222 = f3;
                int i24222 = i23222 >> 12;
                boolean z9222 = z4;
                Modifier lazyLayoutSemantics222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda222, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z8222, startRestartGroup, (i24222 & 112) | i17222), orientation, z9222, z8222, startRestartGroup, ((i23222 << 6) & 7168) | (i21222 & 57344) | (i23222 & 458752));
                LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState222 = LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i17222);
                LazyLayoutBeyondBoundsInfo beyondBoundsInfo222 = lazyStaggeredGridState.getBeyondBoundsInfo();
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i25222 = i23222 >> 3;
                FlingBehavior flingBehavior5222 = flingBehavior3;
                LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda222, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics222, rememberLazyStaggeredGridBeyondBoundsState222, beyondBoundsInfo222, z8222, (LayoutDirection) consume2222, orientation, z9222, startRestartGroup, (3670016 & i25222) | (MutableVector.$stable << 6) | i20222 | ((i23222 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z9222, z8222, flingBehavior5222, lazyStaggeredGridState.getMutableInteractionSource(), null, startRestartGroup, ((i23222 << 3) & PointerIconCompat.TYPE_TEXT) | (i24222 & 7168) | (i25222 & 57344) | (i25222 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), m885rememberStaggeredGridMeasurePolicyqKj4JfE222, startRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z9222;
                composer2 = startRestartGroup;
                modifier4 = modifier3;
                paddingValues4 = paddingValues5222;
                f5 = f7222;
                f6 = f8222;
                flingBehavior4 = flingBehavior5222;
                z6 = z8222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            paddingValues2 = paddingValues;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i3 & 1024) == 0) {
            }
            i14 = i4;
            if ((i14 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if (i8 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            flingBehavior3 = flingBehavior2;
            i16 = i15;
            f4 = m6265constructorimpl;
            modifier3 = companion;
            paddingValues3 = m666PaddingValues0680j_4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i172222 = i16 & 14;
            Function0<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda2222 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, ((i13 << 3) & 112) | i172222);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<GraphicsContext> localGraphicsContext2222 = CompositionLocalsKt.getLocalGraphicsContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(localGraphicsContext2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i182222 = i16 >> 6;
            int i192222 = (i182222 & 896) | i172222;
            int i202222 = i182222 & 7168;
            int i212222 = i16 >> 9;
            int i222222 = i192222 | i202222 | ((i16 << 9) & 57344) | (i212222 & 458752) | (i212222 & 3670016) | ((i16 << 18) & 234881024);
            boolean z82222 = z3;
            int i232222 = i16;
            Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m885rememberStaggeredGridMeasurePolicyqKj4JfE2222 = LazyStaggeredGridMeasurePolicyKt.m885rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda2222, paddingValues3, z82222, orientation, f4, f3, coroutineScope2222, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) consume3222, startRestartGroup, i222222);
            PaddingValues paddingValues52222 = paddingValues3;
            float f72222 = f4;
            float f82222 = f3;
            int i242222 = i232222 >> 12;
            boolean z92222 = z4;
            Modifier lazyLayoutSemantics2222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda2222, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z82222, startRestartGroup, (i242222 & 112) | i172222), orientation, z92222, z82222, startRestartGroup, ((i232222 << 6) & 7168) | (i212222 & 57344) | (i232222 & 458752));
            LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState2222 = LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i172222);
            LazyLayoutBeyondBoundsInfo beyondBoundsInfo2222 = lazyStaggeredGridState.getBeyondBoundsInfo();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(localLayoutDirection2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i252222 = i232222 >> 3;
            FlingBehavior flingBehavior52222 = flingBehavior3;
            LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda2222, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics2222, rememberLazyStaggeredGridBeyondBoundsState2222, beyondBoundsInfo2222, z82222, (LayoutDirection) consume22222, orientation, z92222, startRestartGroup, (3670016 & i252222) | (MutableVector.$stable << 6) | i202222 | ((i232222 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z92222, z82222, flingBehavior52222, lazyStaggeredGridState.getMutableInteractionSource(), null, startRestartGroup, ((i232222 << 3) & PointerIconCompat.TYPE_TEXT) | (i242222 & 7168) | (i252222 & 57344) | (i252222 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), m885rememberStaggeredGridMeasurePolicyqKj4JfE2222, startRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z92222;
            composer2 = startRestartGroup;
            modifier4 = modifier3;
            paddingValues4 = paddingValues52222;
            f5 = f72222;
            f6 = f82222;
            flingBehavior4 = flingBehavior52222;
            z6 = z82222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        paddingValues2 = paddingValues;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i3 & 1024) == 0) {
        }
        i14 = i4;
        if ((i14 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        flingBehavior3 = flingBehavior2;
        i16 = i15;
        f4 = m6265constructorimpl;
        modifier3 = companion;
        paddingValues3 = m666PaddingValues0680j_4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1722222 = i16 & 14;
        Function0<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda22222 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, ((i13 << 3) & 112) | i1722222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        CoroutineScope coroutineScope22222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<GraphicsContext> localGraphicsContext22222 = CompositionLocalsKt.getLocalGraphicsContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(localGraphicsContext22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i1822222 = i16 >> 6;
        int i1922222 = (i1822222 & 896) | i1722222;
        int i2022222 = i1822222 & 7168;
        int i2122222 = i16 >> 9;
        int i2222222 = i1922222 | i2022222 | ((i16 << 9) & 57344) | (i2122222 & 458752) | (i2122222 & 3670016) | ((i16 << 18) & 234881024);
        boolean z822222 = z3;
        int i2322222 = i16;
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m885rememberStaggeredGridMeasurePolicyqKj4JfE22222 = LazyStaggeredGridMeasurePolicyKt.m885rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda22222, paddingValues3, z822222, orientation, f4, f3, coroutineScope22222, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) consume32222, startRestartGroup, i2222222);
        PaddingValues paddingValues522222 = paddingValues3;
        float f722222 = f4;
        float f822222 = f3;
        int i2422222 = i2322222 >> 12;
        boolean z922222 = z4;
        Modifier lazyLayoutSemantics22222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda22222, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z822222, startRestartGroup, (i2422222 & 112) | i1722222), orientation, z922222, z822222, startRestartGroup, ((i2322222 << 6) & 7168) | (i2122222 & 57344) | (i2322222 & 458752));
        LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState22222 = LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i1722222);
        LazyLayoutBeyondBoundsInfo beyondBoundsInfo22222 = lazyStaggeredGridState.getBeyondBoundsInfo();
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(localLayoutDirection22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i2522222 = i2322222 >> 3;
        FlingBehavior flingBehavior522222 = flingBehavior3;
        LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda22222, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics22222, rememberLazyStaggeredGridBeyondBoundsState22222, beyondBoundsInfo22222, z822222, (LayoutDirection) consume222222, orientation, z922222, startRestartGroup, (3670016 & i2522222) | (MutableVector.$stable << 6) | i2022222 | ((i2322222 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z922222, z822222, flingBehavior522222, lazyStaggeredGridState.getMutableInteractionSource(), null, startRestartGroup, ((i2322222 << 3) & PointerIconCompat.TYPE_TEXT) | (i2422222 & 7168) | (i2522222 & 57344) | (i2522222 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), m885rememberStaggeredGridMeasurePolicyqKj4JfE22222, startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z922222;
        composer2 = startRestartGroup;
        modifier4 = modifier3;
        paddingValues4 = paddingValues522222;
        f5 = f722222;
        f6 = f822222;
        flingBehavior4 = flingBehavior522222;
        z6 = z822222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
