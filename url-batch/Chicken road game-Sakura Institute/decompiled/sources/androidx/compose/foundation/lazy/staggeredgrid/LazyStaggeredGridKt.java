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
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013d  */
    /* renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m882LazyStaggeredGridLJWHXA8(final LazyStaggeredGridState lazyStaggeredGridState, final Orientation orientation, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Modifier modifier, PaddingValues paddingValues, boolean z, FlingBehavior flingBehavior, boolean z2, float f, float f2, final Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        FlingBehavior flingBehavior2;
        int i11;
        float f3;
        float m6299constructorimpl;
        boolean z4;
        PaddingValues paddingValues2;
        FlingBehavior flingBehavior3;
        float f4;
        int i12;
        Modifier modifier2;
        Object rememberedValue;
        Composer composer2;
        final boolean z5;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        final FlingBehavior flingBehavior4;
        final boolean z6;
        final float f5;
        final float f6;
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
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? startRestartGroup.changed(lazyGridStaggeredGridSlotsProvider) : startRestartGroup.changedInstance(lazyGridStaggeredGridSlotsProvider) ? 256 : 128;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? 536870912 : 268435456;
                }
                if ((i3 & 1024) != 0) {
                    i10 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i10 = i2 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                } else {
                    i10 = i2;
                }
                if ((i4 & 306783379) == 306783378 || (i10 & 3) != 2 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier;
                        PaddingValues m674PaddingValues0680j_4 = i5 != 0 ? PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(0)) : paddingValues;
                        z3 = i6 != 0 ? false : z;
                        if ((i3 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                            i4 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        boolean z7 = i7 != 0 ? true : z2;
                        if (i8 != 0) {
                            i11 = 0;
                            f3 = Dp.m6299constructorimpl(0);
                        } else {
                            i11 = 0;
                            f3 = f;
                        }
                        m6299constructorimpl = i9 != 0 ? Dp.m6299constructorimpl(i11) : f2;
                        z4 = z7;
                        paddingValues2 = m674PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        f4 = f3;
                        i12 = i4;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        modifier2 = modifier;
                        paddingValues2 = paddingValues;
                        z3 = z;
                        flingBehavior3 = flingBehavior;
                        z4 = z2;
                        f4 = f;
                        m6299constructorimpl = f2;
                        i12 = i4;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(288295126, i12, i10, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
                    }
                    int i14 = i12 & 14;
                    Function0<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, ((i10 << 3) & 112) | i14);
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
                    GraphicsContext graphicsContext = (GraphicsContext) consume;
                    int i15 = i12 >> 6;
                    int i16 = i15 & 7168;
                    int i17 = i12 >> 9;
                    int i18 = i12;
                    boolean z8 = z3;
                    Modifier modifier4 = modifier2;
                    Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m893rememberStaggeredGridMeasurePolicyqKj4JfE = LazyStaggeredGridMeasurePolicyKt.m893rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda, paddingValues2, z3, orientation, f4, m6299constructorimpl, coroutineScope, lazyGridStaggeredGridSlotsProvider, graphicsContext, startRestartGroup, (i15 & 896) | i14 | i16 | ((i12 << 9) & 57344) | (i17 & 458752) | (i17 & 3670016) | ((i12 << 18) & 234881024));
                    int i19 = i18 >> 12;
                    Modifier lazyLayoutSemantics = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier4.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z8, startRestartGroup, (i19 & 112) | i14), orientation, z4, z8, startRestartGroup, ((i18 << 6) & 7168) | (i17 & 57344) | (i18 & 458752));
                    LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState = LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i14);
                    LazyLayoutBeyondBoundsInfo beyondBoundsInfo = lazyStaggeredGridState.getBeyondBoundsInfo();
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i20 = i18 >> 3;
                    composer2 = startRestartGroup;
                    LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics, rememberLazyStaggeredGridBeyondBoundsState, beyondBoundsInfo, z8, (LayoutDirection) consume2, orientation, z4, startRestartGroup, (MutableVector.$stable << 6) | i16 | ((i18 << 12) & 458752) | (3670016 & i20)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z4, z8, flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource(), null, startRestartGroup, ((i18 << 3) & PointerIconCompat.TYPE_TEXT) | (i19 & 7168) | (i20 & 57344) | (i20 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), m893rememberStaggeredGridMeasurePolicyqKj4JfE, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z8;
                    modifier3 = modifier4;
                    paddingValues3 = paddingValues2;
                    flingBehavior4 = flingBehavior3;
                    z6 = z4;
                    f5 = f4;
                    f6 = m6299constructorimpl;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    paddingValues3 = paddingValues;
                    z5 = z;
                    flingBehavior4 = flingBehavior;
                    z6 = z2;
                    f5 = f;
                    composer2 = startRestartGroup;
                    f6 = f2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
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

                        public final void invoke(Composer composer3, int i21) {
                            LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(LazyStaggeredGridState.this, orientation, lazyGridStaggeredGridSlotsProvider, modifier3, paddingValues3, z5, flingBehavior4, z6, f5, f6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            z4 = z7;
            paddingValues2 = m674PaddingValues0680j_4;
            flingBehavior3 = flingBehavior2;
            f4 = f3;
            i12 = i4;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i142 = i12 & 14;
            Function0<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda2 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, ((i10 << 3) & 112) | i142);
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
            GraphicsContext graphicsContext2 = (GraphicsContext) consume3;
            int i152 = i12 >> 6;
            int i162 = i152 & 7168;
            int i172 = i12 >> 9;
            int i182 = i12;
            boolean z82 = z3;
            Modifier modifier42 = modifier2;
            Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m893rememberStaggeredGridMeasurePolicyqKj4JfE2 = LazyStaggeredGridMeasurePolicyKt.m893rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda2, paddingValues2, z3, orientation, f4, m6299constructorimpl, coroutineScope2, lazyGridStaggeredGridSlotsProvider, graphicsContext2, startRestartGroup, (i152 & 896) | i142 | i162 | ((i12 << 9) & 57344) | (i172 & 458752) | (i172 & 3670016) | ((i12 << 18) & 234881024));
            int i192 = i182 >> 12;
            Modifier lazyLayoutSemantics2 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier42.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda2, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z82, startRestartGroup, (i192 & 112) | i142), orientation, z4, z82, startRestartGroup, ((i182 << 6) & 7168) | (i172 & 57344) | (i182 & 458752));
            LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState2 = LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i142);
            LazyLayoutBeyondBoundsInfo beyondBoundsInfo2 = lazyStaggeredGridState.getBeyondBoundsInfo();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i202 = i182 >> 3;
            composer2 = startRestartGroup;
            LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda2, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics2, rememberLazyStaggeredGridBeyondBoundsState2, beyondBoundsInfo2, z82, (LayoutDirection) consume22, orientation, z4, startRestartGroup, (MutableVector.$stable << 6) | i162 | ((i182 << 12) & 458752) | (3670016 & i202)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z4, z82, flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource(), null, startRestartGroup, ((i182 << 3) & PointerIconCompat.TYPE_TEXT) | (i192 & 7168) | (i202 & 57344) | (i202 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), m893rememberStaggeredGridMeasurePolicyqKj4JfE2, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z82;
            modifier3 = modifier42;
            paddingValues3 = paddingValues2;
            flingBehavior4 = flingBehavior3;
            z6 = z4;
            f5 = f4;
            f6 = m6299constructorimpl;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        z4 = z7;
        paddingValues2 = m674PaddingValues0680j_4;
        flingBehavior3 = flingBehavior2;
        f4 = f3;
        i12 = i4;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1422 = i12 & 14;
        Function0<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda22 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, startRestartGroup, ((i10 << 3) & 112) | i1422);
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
        GraphicsContext graphicsContext22 = (GraphicsContext) consume32;
        int i1522 = i12 >> 6;
        int i1622 = i1522 & 7168;
        int i1722 = i12 >> 9;
        int i1822 = i12;
        boolean z822 = z3;
        Modifier modifier422 = modifier2;
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m893rememberStaggeredGridMeasurePolicyqKj4JfE22 = LazyStaggeredGridMeasurePolicyKt.m893rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda22, paddingValues2, z3, orientation, f4, m6299constructorimpl, coroutineScope22, lazyGridStaggeredGridSlotsProvider, graphicsContext22, startRestartGroup, (i1522 & 896) | i1422 | i1622 | ((i12 << 9) & 57344) | (i1722 & 458752) | (i1722 & 3670016) | ((i12 << 18) & 234881024));
        int i1922 = i1822 >> 12;
        Modifier lazyLayoutSemantics22 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier422.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), rememberStaggeredGridItemProviderLambda22, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z822, startRestartGroup, (i1922 & 112) | i1422), orientation, z4, z822, startRestartGroup, ((i1822 << 6) & 7168) | (i1722 & 57344) | (i1822 & 458752));
        LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState22 = LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i1422);
        LazyLayoutBeyondBoundsInfo beyondBoundsInfo22 = lazyStaggeredGridState.getBeyondBoundsInfo();
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localLayoutDirection22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i2022 = i1822 >> 3;
        composer2 = startRestartGroup;
        LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda22, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics22, rememberLazyStaggeredGridBeyondBoundsState22, beyondBoundsInfo22, z822, (LayoutDirection) consume222, orientation, z4, startRestartGroup, (MutableVector.$stable << 6) | i1622 | ((i1822 << 12) & 458752) | (3670016 & i2022)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z4, z822, flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource(), null, startRestartGroup, ((i1822 << 3) & PointerIconCompat.TYPE_TEXT) | (i1922 & 7168) | (i2022 & 57344) | (i2022 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), m893rememberStaggeredGridMeasurePolicyqKj4JfE22, composer2, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z822;
        modifier3 = modifier422;
        paddingValues3 = paddingValues2;
        flingBehavior4 = flingBehavior3;
        z6 = z4;
        f5 = f4;
        f6 = m6299constructorimpl;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
