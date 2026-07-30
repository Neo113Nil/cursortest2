package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyGrid.kt */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a~\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001a~\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\u0002\b\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyGrid(Modifier modifier, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z, final boolean z2, FlingBehavior flingBehavior, final boolean z3, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final Function1<? super LazyGridScope, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z4;
        int i6;
        PaddingValues paddingValues3;
        FlingBehavior flingBehavior2;
        Modifier modifier3;
        int i7;
        Object rememberedValue;
        Composer composer2;
        final boolean z5;
        final FlingBehavior flingBehavior3;
        final Modifier modifier4;
        final PaddingValues paddingValues4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-649686062);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyGrid)P(5,8,7,1,6,4,2,9,10,3)68@3233L15,78@3657L50,80@3733L51,82@3811L24,83@3883L7,84@3915L269,102@4422L278,110@4770L48,113@4981L7,109@4714L376,118@5151L317,98@4277L1324:LazyGrid.kt#7791vq");
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? startRestartGroup.changed(lazyGridSlotsProvider) : startRestartGroup.changedInstance(lazyGridSlotsProvider) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z4 = z;
                i4 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i3 & 512) != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changed(horizontal) ? 536870912 : 268435456;
                            if ((i3 & 1024) == 0) {
                                i6 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i6 = i2 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                            } else {
                                i6 = i2;
                            }
                            if ((i4 & 306783379) == 306783378 || (i6 & 3) != 2 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    PaddingValues m666PaddingValues0680j_4 = i9 == 0 ? PaddingKt.m666PaddingValues0680j_4(Dp.m6265constructorimpl(0.0f)) : paddingValues2;
                                    if (i5 != 0) {
                                        z4 = false;
                                    }
                                    if ((i3 & 64) == 0) {
                                        paddingValues3 = m666PaddingValues0680j_4;
                                        modifier3 = companion;
                                        i7 = i4 & (-3670017);
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    } else {
                                        paddingValues3 = m666PaddingValues0680j_4;
                                        flingBehavior2 = flingBehavior;
                                        modifier3 = companion;
                                        i7 = i4;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    flingBehavior2 = flingBehavior;
                                    modifier3 = modifier2;
                                    i7 = i4;
                                    paddingValues3 = paddingValues2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-649686062, i7, i6, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                                }
                                int i10 = i7 >> 3;
                                int i11 = i10 & 14;
                                Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i6 << 3) & 112) | i11);
                                int i12 = i7 >> 9;
                                LazyLayoutSemanticState rememberLazyGridSemanticState = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i12 & 112) | i11);
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
                                int i13 = i7 & 112;
                                int i14 = i7 & 57344;
                                int i15 = i7;
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope, (GraphicsContext) consume, startRestartGroup, (29360128 & i10) | (524272 & i7) | (i12 & 3670016));
                                PaddingValues paddingValues5 = paddingValues3;
                                Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                                boolean z6 = z4;
                                Modifier lazyLayoutSemantics = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda, rememberLazyGridSemanticState, orientation, z3, z6, startRestartGroup, (i12 & 57344) | ((i15 << 3) & 458752));
                                LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i11);
                                LazyLayoutBeyondBoundsInfo beyondBoundsInfo = lazyGridState.getBeyondBoundsInfo();
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                FlingBehavior flingBehavior4 = flingBehavior2;
                                LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics, rememberLazyGridBeyondBoundsState, beyondBoundsInfo, z6, (LayoutDirection) consume2, orientation, z3, startRestartGroup, (3670016 & i10) | (MutableVector.$stable << 6) | (i10 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation, z3, z6, flingBehavior4, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i13 | ((i15 >> 12) & 7168) | i14 | (458752 & i10), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy, startRestartGroup, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = startRestartGroup;
                                z5 = z6;
                                flingBehavior3 = flingBehavior4;
                                modifier4 = modifier3;
                                paddingValues4 = paddingValues5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z5 = z4;
                                modifier4 = modifier2;
                                paddingValues4 = paddingValues2;
                                composer2 = startRestartGroup;
                                flingBehavior3 = flingBehavior;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
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

                                    public final void invoke(Composer composer3, int i16) {
                                        LazyGridKt.LazyGrid(Modifier.this, lazyGridState, lazyGridSlotsProvider, paddingValues4, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i7 >> 3;
                        int i112 = i102 & 14;
                        Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda2 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i6 << 3) & 112) | i112);
                        int i122 = i7 >> 9;
                        LazyLayoutSemanticState rememberLazyGridSemanticState2 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i122 & 112) | i112);
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
                        int i132 = i7 & 112;
                        int i142 = i7 & 57344;
                        int i152 = i7;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy2 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda2, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope2, (GraphicsContext) consume3, startRestartGroup, (29360128 & i102) | (524272 & i7) | (i122 & 3670016));
                        PaddingValues paddingValues52 = paddingValues3;
                        Orientation orientation2 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                        boolean z62 = z4;
                        Modifier lazyLayoutSemantics2 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda2, rememberLazyGridSemanticState2, orientation2, z3, z62, startRestartGroup, (i122 & 57344) | ((i152 << 3) & 458752));
                        LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState2 = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i112);
                        LazyLayoutBeyondBoundsInfo beyondBoundsInfo2 = lazyGridState.getBeyondBoundsInfo();
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        FlingBehavior flingBehavior42 = flingBehavior2;
                        LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda2, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics2, rememberLazyGridBeyondBoundsState2, beyondBoundsInfo2, z62, (LayoutDirection) consume22, orientation2, z3, startRestartGroup, (3670016 & i102) | (MutableVector.$stable << 6) | (i102 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation2, z3, z62, flingBehavior42, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i132 | ((i152 >> 12) & 7168) | i142 | (458752 & i102), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy2, startRestartGroup, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        z5 = z62;
                        flingBehavior3 = flingBehavior42;
                        modifier4 = modifier3;
                        paddingValues4 = paddingValues52;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1022 = i7 >> 3;
                    int i1122 = i1022 & 14;
                    Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda22 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i6 << 3) & 112) | i1122);
                    int i1222 = i7 >> 9;
                    LazyLayoutSemanticState rememberLazyGridSemanticState22 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i1222 & 112) | i1122);
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
                    int i1322 = i7 & 112;
                    int i1422 = i7 & 57344;
                    int i1522 = i7;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy22 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda22, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope22, (GraphicsContext) consume32, startRestartGroup, (29360128 & i1022) | (524272 & i7) | (i1222 & 3670016));
                    PaddingValues paddingValues522 = paddingValues3;
                    Orientation orientation22 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                    boolean z622 = z4;
                    Modifier lazyLayoutSemantics22 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda22, rememberLazyGridSemanticState22, orientation22, z3, z622, startRestartGroup, (i1222 & 57344) | ((i1522 << 3) & 458752));
                    LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState22 = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i1122);
                    LazyLayoutBeyondBoundsInfo beyondBoundsInfo22 = lazyGridState.getBeyondBoundsInfo();
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(localLayoutDirection22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FlingBehavior flingBehavior422 = flingBehavior2;
                    LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda22, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics22, rememberLazyGridBeyondBoundsState22, beyondBoundsInfo22, z622, (LayoutDirection) consume222, orientation22, z3, startRestartGroup, (3670016 & i1022) | (MutableVector.$stable << 6) | (i1022 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation22, z3, z622, flingBehavior422, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i1322 | ((i1522 >> 12) & 7168) | i1422 | (458752 & i1022), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy22, startRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    z5 = z622;
                    flingBehavior3 = flingBehavior422;
                    modifier4 = modifier3;
                    paddingValues4 = paddingValues522;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 64) == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i10222 = i7 >> 3;
                int i11222 = i10222 & 14;
                Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda222 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i6 << 3) & 112) | i11222);
                int i12222 = i7 >> 9;
                LazyLayoutSemanticState rememberLazyGridSemanticState222 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i12222 & 112) | i11222);
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
                int i13222 = i7 & 112;
                int i14222 = i7 & 57344;
                int i15222 = i7;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda222, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope222, (GraphicsContext) consume322, startRestartGroup, (29360128 & i10222) | (524272 & i7) | (i12222 & 3670016));
                PaddingValues paddingValues5222 = paddingValues3;
                Orientation orientation222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                boolean z6222 = z4;
                Modifier lazyLayoutSemantics222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda222, rememberLazyGridSemanticState222, orientation222, z3, z6222, startRestartGroup, (i12222 & 57344) | ((i15222 << 3) & 458752));
                LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState222 = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i11222);
                LazyLayoutBeyondBoundsInfo beyondBoundsInfo222 = lazyGridState.getBeyondBoundsInfo();
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                FlingBehavior flingBehavior4222 = flingBehavior2;
                LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda222, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics222, rememberLazyGridBeyondBoundsState222, beyondBoundsInfo222, z6222, (LayoutDirection) consume2222, orientation222, z3, startRestartGroup, (3670016 & i10222) | (MutableVector.$stable << 6) | (i10222 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation222, z3, z6222, flingBehavior4222, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i13222 | ((i15222 >> 12) & 7168) | i14222 | (458752 & i10222), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy222, startRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                z5 = z6222;
                flingBehavior3 = flingBehavior4222;
                modifier4 = modifier3;
                paddingValues4 = paddingValues5222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z;
            if ((i3 & 32) != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 64) == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i102222 = i7 >> 3;
            int i112222 = i102222 & 14;
            Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda2222 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i6 << 3) & 112) | i112222);
            int i122222 = i7 >> 9;
            LazyLayoutSemanticState rememberLazyGridSemanticState2222 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i122222 & 112) | i112222);
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
            int i132222 = i7 & 112;
            int i142222 = i7 & 57344;
            int i152222 = i7;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy2222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda2222, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope2222, (GraphicsContext) consume3222, startRestartGroup, (29360128 & i102222) | (524272 & i7) | (i122222 & 3670016));
            PaddingValues paddingValues52222 = paddingValues3;
            Orientation orientation2222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
            boolean z62222 = z4;
            Modifier lazyLayoutSemantics2222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda2222, rememberLazyGridSemanticState2222, orientation2222, z3, z62222, startRestartGroup, (i122222 & 57344) | ((i152222 << 3) & 458752));
            LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState2222 = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i112222);
            LazyLayoutBeyondBoundsInfo beyondBoundsInfo2222 = lazyGridState.getBeyondBoundsInfo();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(localLayoutDirection2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FlingBehavior flingBehavior42222 = flingBehavior2;
            LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda2222, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics2222, rememberLazyGridBeyondBoundsState2222, beyondBoundsInfo2222, z62222, (LayoutDirection) consume22222, orientation2222, z3, startRestartGroup, (3670016 & i102222) | (MutableVector.$stable << 6) | (i102222 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation2222, z3, z62222, flingBehavior42222, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i132222 | ((i152222 >> 12) & 7168) | i142222 | (458752 & i102222), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy2222, startRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            z5 = z62222;
            flingBehavior3 = flingBehavior42222;
            modifier4 = modifier3;
            paddingValues4 = paddingValues52222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z;
        if ((i3 & 32) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1022222 = i7 >> 3;
        int i1122222 = i1022222 & 14;
        Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda22222 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, startRestartGroup, ((i6 << 3) & 112) | i1122222);
        int i1222222 = i7 >> 9;
        LazyLayoutSemanticState rememberLazyGridSemanticState22222 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, startRestartGroup, (i1222222 & 112) | i1122222);
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
        int i1322222 = i7 & 112;
        int i1422222 = i7 & 57344;
        int i1522222 = i7;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy22222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda22222, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope22222, (GraphicsContext) consume32222, startRestartGroup, (29360128 & i1022222) | (524272 & i7) | (i1222222 & 3670016));
        PaddingValues paddingValues522222 = paddingValues3;
        Orientation orientation22222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
        boolean z622222 = z4;
        Modifier lazyLayoutSemantics22222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda22222, rememberLazyGridSemanticState22222, orientation22222, z3, z622222, startRestartGroup, (i1222222 & 57344) | ((i1522222 << 3) & 458752));
        LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState22222 = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i1122222);
        LazyLayoutBeyondBoundsInfo beyondBoundsInfo22222 = lazyGridState.getBeyondBoundsInfo();
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(localLayoutDirection22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FlingBehavior flingBehavior422222 = flingBehavior2;
        LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda22222, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics22222, rememberLazyGridBeyondBoundsState22222, beyondBoundsInfo22222, z622222, (LayoutDirection) consume222222, orientation22222, z3, startRestartGroup, (3670016 & i1022222) | (MutableVector.$stable << 6) | (i1022222 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation22222, z3, z622222, flingBehavior422222, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i1322222 | ((i1522222 >> 12) & 7168) | i1422222 | (458752 & i1022222), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy22222, startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        z5 = z622222;
        flingBehavior3 = flingBehavior422222;
        modifier4 = modifier3;
        paddingValues4 = paddingValues522222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r27.changed(r3) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final Function0<? extends LazyGridItemProvider> function0, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, final PaddingValues paddingValues, final boolean z, boolean z2, final Arrangement.Horizontal horizontal, final Arrangement.Vertical vertical, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, Composer composer, int i) {
        boolean z3;
        boolean z4;
        boolean changed;
        Object rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, -1585069765, "C(rememberLazyGridMeasurePolicy)P(5,8,7!1,6,4,3,9)161@6721L9334:LazyGrid.kt#7791vq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1585069765, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:161)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1026581015, "CC(remember):LazyGrid.kt#9igjgp");
        boolean z5 = ((((i & 112) ^ 48) > 32 && composer.changed(lazyGridState)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(lazyGridSlotsProvider)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(paddingValues)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(z)) || (i & 24576) == 16384);
        if (((458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072) {
            z3 = z2;
        } else {
            z3 = z2;
        }
        if ((196608 & i) != 131072) {
            z4 = false;
            changed = z5 | z4 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) > 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
            rememberedValue = composer.rememberedValue();
            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                final boolean z6 = z3;
                rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return m811invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
                    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final LazyGridMeasureResult m811invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                        int i2;
                        int i3;
                        int i4;
                        float spacing;
                        int m6218getMaxWidthimpl;
                        long IntOffset;
                        int lineIndexOfItem;
                        int firstVisibleItemScrollOffset;
                        ObservableScopeInvalidator.m847attachToScopeimpl(LazyGridState.this.m819getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                        CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z6 ? Orientation.Vertical : Orientation.Horizontal);
                        boolean z7 = z6;
                        PaddingValues paddingValues2 = paddingValues;
                        if (z7) {
                            i2 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i2 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        boolean z8 = z6;
                        PaddingValues paddingValues3 = paddingValues;
                        if (z8) {
                            i3 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i3 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        int i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                        int i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                        final int i7 = i5 + i6;
                        final int i8 = i2 + i3;
                        boolean z9 = z6;
                        int i9 = z9 ? i7 : i8;
                        if (z9 && !z) {
                            i4 = i5;
                        } else if (z9 && z) {
                            i4 = i6;
                        } else {
                            i4 = (z9 || z) ? i3 : i2;
                        }
                        final int i10 = i9 - i4;
                        long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i8, -i7);
                        final LazyGridItemProvider invoke = function0.invoke();
                        final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
                        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                        final LazyGridSlots mo800invoke0kLqBqw = lazyGridSlotsProvider.mo800invoke0kLqBqw(lazyLayoutMeasureScope2, j);
                        int length = mo800invoke0kLqBqw.getSizes().length;
                        spanLayoutProvider.setSlotsPerLine(length);
                        if (z6) {
                            Arrangement.Vertical vertical2 = vertical;
                            if (vertical2 == null) {
                                throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                            }
                            spacing = vertical2.getSpacing();
                        } else {
                            Arrangement.Horizontal horizontal2 = horizontal;
                            if (horizontal2 == null) {
                                throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                            }
                            spacing = horizontal2.getSpacing();
                        }
                        final int i11 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(spacing);
                        final int itemCount = invoke.getItemCount();
                        if (z6) {
                            m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i7;
                        } else {
                            m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i8;
                        }
                        int i12 = m6218getMaxWidthimpl;
                        if (!z || i12 > 0) {
                            IntOffset = IntOffsetKt.IntOffset(i2, i5);
                        } else {
                            boolean z10 = z6;
                            if (!z10) {
                                i2 += i12;
                            }
                            if (z10) {
                                i5 += i12;
                            }
                            IntOffset = IntOffsetKt.IntOffset(i2, i5);
                        }
                        final long j2 = IntOffset;
                        final LazyGridState lazyGridState2 = LazyGridState.this;
                        final boolean z11 = z6;
                        final boolean z12 = z;
                        final int i13 = i4;
                        final ?? r1 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, i11, lazyGridState2, z11, z12, i13, i10, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                            final /* synthetic */ int $afterContentPadding;
                            final /* synthetic */ int $beforeContentPadding;
                            final /* synthetic */ boolean $isVertical;
                            final /* synthetic */ boolean $reverseLayout;
                            final /* synthetic */ LazyGridState $state;
                            final /* synthetic */ LazyLayoutMeasureScope $this_null;
                            final /* synthetic */ long $visualItemOffset;

                            {
                                this.$this_null = lazyLayoutMeasureScope;
                                this.$state = lazyGridState2;
                                this.$isVertical = z11;
                                this.$reverseLayout = z12;
                                this.$beforeContentPadding = i13;
                                this.$afterContentPadding = i10;
                                this.$visualItemOffset = j2;
                            }

                            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                            /* renamed from: createItem-O3s9Psw, reason: not valid java name */
                            public LazyGridMeasuredItem mo812createItemO3s9Psw(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Placeable> placeables, long constraints, int lane, int span) {
                                return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getItemAnimator$foundation_release(), constraints, lane, span, null);
                            }
                        };
                        final boolean z13 = z6;
                        final ?? r5 = new LazyGridMeasuredLineProvider(z13, mo800invoke0kLqBqw, itemCount, i11, r1, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                            final /* synthetic */ boolean $isVertical;
                            final /* synthetic */ LazyGridSlots $resolvedSlots;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(z13, mo800invoke0kLqBqw, itemCount, i11, r1, spanLayoutProvider);
                                this.$isVertical = z13;
                                this.$resolvedSlots = mo800invoke0kLqBqw;
                            }

                            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                            public LazyGridMeasuredLine createLine(int index, LazyGridMeasuredItem[] items, List<GridItemSpan> spans, int mainAxisSpacing) {
                                return new LazyGridMeasuredLine(index, items, this.$resolvedSlots, spans, this.$isVertical, mainAxisSpacing);
                            }
                        };
                        Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> function1 = new Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            public final ArrayList<Pair<Integer, Constraints>> invoke(int i14) {
                                LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = LazyGridSpanLayoutProvider.this.getLineConfiguration(i14);
                                int firstItemIndex = lineConfiguration.getFirstItemIndex();
                                ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                                List<GridItemSpan> spans = lineConfiguration.getSpans();
                                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r5;
                                int size = spans.size();
                                int i15 = 0;
                                for (int i16 = 0; i16 < size; i16++) {
                                    int m796getCurrentLineSpanimpl = GridItemSpan.m796getCurrentLineSpanimpl(spans.get(i16).getPackedValue());
                                    arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m6206boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m818childConstraintsJhjzzOo$foundation_release(i15, m796getCurrentLineSpanimpl))));
                                    firstItemIndex++;
                                    i15 += m796getCurrentLineSpanimpl;
                                }
                                return arrayList;
                            }
                        };
                        Snapshot.Companion companion = Snapshot.INSTANCE;
                        LazyGridState lazyGridState3 = LazyGridState.this;
                        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                        try {
                            int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyGridState3.getFirstVisibleItemIndex());
                            if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release >= itemCount && itemCount > 0) {
                                lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                                firstVisibleItemScrollOffset = 0;
                                int i14 = lineIndexOfItem;
                                Unit unit = Unit.INSTANCE;
                                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                LazyGridMeasureResult m814measureLazyGridOZKpZRA = LazyGridMeasureKt.m814measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r5, (LazyGridMeasuredItemProvider) r1, i12, i4, i10, i11, i14, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6237offsetNN6EwU, z6, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m820getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                                    }

                                    public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                        return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i8), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i7), MapsKt.emptyMap(), function12);
                                    }
                                });
                                LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m814measureLazyGridOZKpZRA, false, 2, null);
                                return m814measureLazyGridOZKpZRA;
                            }
                            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                            firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                            int i142 = lineIndexOfItem;
                            Unit unit2 = Unit.INSTANCE;
                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            LazyGridMeasureResult m814measureLazyGridOZKpZRA2 = LazyGridMeasureKt.m814measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r5, (LazyGridMeasuredItemProvider) r1, i12, i4, i10, i11, i142, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6237offsetNN6EwU, z6, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m820getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                                }

                                public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i8), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i7), MapsKt.emptyMap(), function12);
                                }
                            });
                            LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m814measureLazyGridOZKpZRA2, false, 2, null);
                            return m814measureLazyGridOZKpZRA2;
                        } catch (Throwable th) {
                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            throw th;
                        }
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function2;
        }
        z4 = true;
        if (((29360128 & i) ^ 12582912) > 8388608) {
            changed = z5 | z4 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) > 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            final boolean z62 = z3;
            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m811invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
                /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m811invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i2;
                    int i3;
                    int i4;
                    float spacing;
                    int m6218getMaxWidthimpl;
                    long IntOffset;
                    int lineIndexOfItem;
                    int firstVisibleItemScrollOffset;
                    ObservableScopeInvalidator.m847attachToScopeimpl(LazyGridState.this.m819getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z62 ? Orientation.Vertical : Orientation.Horizontal);
                    boolean z7 = z62;
                    PaddingValues paddingValues2 = paddingValues;
                    if (z7) {
                        i2 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i2 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    boolean z8 = z62;
                    PaddingValues paddingValues3 = paddingValues;
                    if (z8) {
                        i3 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i3 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                    int i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                    final int i7 = i5 + i6;
                    final int i8 = i2 + i3;
                    boolean z9 = z62;
                    int i9 = z9 ? i7 : i8;
                    if (z9 && !z) {
                        i4 = i5;
                    } else if (z9 && z) {
                        i4 = i6;
                    } else {
                        i4 = (z9 || z) ? i3 : i2;
                    }
                    final int i10 = i9 - i4;
                    long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i8, -i7);
                    final LazyGridItemProvider invoke = function0.invoke();
                    final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    final LazyGridSlots mo800invoke0kLqBqw = lazyGridSlotsProvider.mo800invoke0kLqBqw(lazyLayoutMeasureScope2, j);
                    int length = mo800invoke0kLqBqw.getSizes().length;
                    spanLayoutProvider.setSlotsPerLine(length);
                    if (z62) {
                        Arrangement.Vertical vertical2 = vertical;
                        if (vertical2 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        spacing = vertical2.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal2 = horizontal;
                        if (horizontal2 == null) {
                            throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                        }
                        spacing = horizontal2.getSpacing();
                    }
                    final int i11 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(spacing);
                    final int itemCount = invoke.getItemCount();
                    if (z62) {
                        m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i7;
                    } else {
                        m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i8;
                    }
                    int i12 = m6218getMaxWidthimpl;
                    if (!z || i12 > 0) {
                        IntOffset = IntOffsetKt.IntOffset(i2, i5);
                    } else {
                        boolean z10 = z62;
                        if (!z10) {
                            i2 += i12;
                        }
                        if (z10) {
                            i5 += i12;
                        }
                        IntOffset = IntOffsetKt.IntOffset(i2, i5);
                    }
                    final long j2 = IntOffset;
                    final LazyGridState lazyGridState2 = LazyGridState.this;
                    final boolean z11 = z62;
                    final boolean z12 = z;
                    final int i13 = i4;
                    final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 r1 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, i11, lazyGridState2, z11, z12, i13, i10, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ LazyGridState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$state = lazyGridState2;
                            this.$isVertical = z11;
                            this.$reverseLayout = z12;
                            this.$beforeContentPadding = i13;
                            this.$afterContentPadding = i10;
                            this.$visualItemOffset = j2;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                        /* renamed from: createItem-O3s9Psw, reason: not valid java name */
                        public LazyGridMeasuredItem mo812createItemO3s9Psw(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Placeable> placeables, long constraints, int lane, int span) {
                            return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getItemAnimator$foundation_release(), constraints, lane, span, null);
                        }
                    };
                    final boolean z13 = z62;
                    final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 r5 = new LazyGridMeasuredLineProvider(z13, mo800invoke0kLqBqw, itemCount, i11, r1, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ LazyGridSlots $resolvedSlots;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(z13, mo800invoke0kLqBqw, itemCount, i11, r1, spanLayoutProvider);
                            this.$isVertical = z13;
                            this.$resolvedSlots = mo800invoke0kLqBqw;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                        public LazyGridMeasuredLine createLine(int index, LazyGridMeasuredItem[] items, List<GridItemSpan> spans, int mainAxisSpacing) {
                            return new LazyGridMeasuredLine(index, items, this.$resolvedSlots, spans, this.$isVertical, mainAxisSpacing);
                        }
                    };
                    Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> function1 = new Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final ArrayList<Pair<Integer, Constraints>> invoke(int i14) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = LazyGridSpanLayoutProvider.this.getLineConfiguration(i14);
                            int firstItemIndex = lineConfiguration.getFirstItemIndex();
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<GridItemSpan> spans = lineConfiguration.getSpans();
                            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r5;
                            int size = spans.size();
                            int i15 = 0;
                            for (int i16 = 0; i16 < size; i16++) {
                                int m796getCurrentLineSpanimpl = GridItemSpan.m796getCurrentLineSpanimpl(spans.get(i16).getPackedValue());
                                arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m6206boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m818childConstraintsJhjzzOo$foundation_release(i15, m796getCurrentLineSpanimpl))));
                                firstItemIndex++;
                                i15 += m796getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    };
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState3 = LazyGridState.this;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyGridState3.getFirstVisibleItemIndex());
                        if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release >= itemCount && itemCount > 0) {
                            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                            firstVisibleItemScrollOffset = 0;
                            int i142 = lineIndexOfItem;
                            Unit unit2 = Unit.INSTANCE;
                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            LazyGridMeasureResult m814measureLazyGridOZKpZRA2 = LazyGridMeasureKt.m814measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r5, (LazyGridMeasuredItemProvider) r1, i12, i4, i10, i11, i142, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6237offsetNN6EwU, z62, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m820getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                                }

                                public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i8), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i7), MapsKt.emptyMap(), function12);
                                }
                            });
                            LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m814measureLazyGridOZKpZRA2, false, 2, null);
                            return m814measureLazyGridOZKpZRA2;
                        }
                        lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                        firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                        int i1422 = lineIndexOfItem;
                        Unit unit22 = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        LazyGridMeasureResult m814measureLazyGridOZKpZRA22 = LazyGridMeasureKt.m814measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r5, (LazyGridMeasuredItemProvider) r1, i12, i4, i10, i11, i1422, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6237offsetNN6EwU, z62, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m820getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                            }

                            public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i8), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i7), MapsKt.emptyMap(), function12);
                            }
                        });
                        LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m814measureLazyGridOZKpZRA22, false, 2, null);
                        return m814measureLazyGridOZKpZRA22;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function22;
        }
        changed = z5 | z4 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) > 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        final boolean z622 = z3;
        rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                return m811invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
            }

            /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
            /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final LazyGridMeasureResult m811invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                int i2;
                int i3;
                int i4;
                float spacing;
                int m6218getMaxWidthimpl;
                long IntOffset;
                int lineIndexOfItem;
                int firstVisibleItemScrollOffset;
                ObservableScopeInvalidator.m847attachToScopeimpl(LazyGridState.this.m819getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z622 ? Orientation.Vertical : Orientation.Horizontal);
                boolean z7 = z622;
                PaddingValues paddingValues2 = paddingValues;
                if (z7) {
                    i2 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i2 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                boolean z8 = z622;
                PaddingValues paddingValues3 = paddingValues;
                if (z8) {
                    i3 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i3 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                int i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                int i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                final int i7 = i5 + i6;
                final int i8 = i2 + i3;
                boolean z9 = z622;
                int i9 = z9 ? i7 : i8;
                if (z9 && !z) {
                    i4 = i5;
                } else if (z9 && z) {
                    i4 = i6;
                } else {
                    i4 = (z9 || z) ? i3 : i2;
                }
                final int i10 = i9 - i4;
                long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i8, -i7);
                final LazyGridItemProvider invoke = function0.invoke();
                final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                final LazyGridSlots mo800invoke0kLqBqw = lazyGridSlotsProvider.mo800invoke0kLqBqw(lazyLayoutMeasureScope2, j);
                int length = mo800invoke0kLqBqw.getSizes().length;
                spanLayoutProvider.setSlotsPerLine(length);
                if (z622) {
                    Arrangement.Vertical vertical2 = vertical;
                    if (vertical2 == null) {
                        throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                    }
                    spacing = vertical2.getSpacing();
                } else {
                    Arrangement.Horizontal horizontal2 = horizontal;
                    if (horizontal2 == null) {
                        throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                    }
                    spacing = horizontal2.getSpacing();
                }
                final int i11 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(spacing);
                final int itemCount = invoke.getItemCount();
                if (z622) {
                    m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i7;
                } else {
                    m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i8;
                }
                int i12 = m6218getMaxWidthimpl;
                if (!z || i12 > 0) {
                    IntOffset = IntOffsetKt.IntOffset(i2, i5);
                } else {
                    boolean z10 = z622;
                    if (!z10) {
                        i2 += i12;
                    }
                    if (z10) {
                        i5 += i12;
                    }
                    IntOffset = IntOffsetKt.IntOffset(i2, i5);
                }
                final long j2 = IntOffset;
                final LazyGridState lazyGridState2 = LazyGridState.this;
                final boolean z11 = z622;
                final boolean z12 = z;
                final int i13 = i4;
                final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 r1 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, i11, lazyGridState2, z11, z12, i13, i10, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                    final /* synthetic */ int $afterContentPadding;
                    final /* synthetic */ int $beforeContentPadding;
                    final /* synthetic */ boolean $isVertical;
                    final /* synthetic */ boolean $reverseLayout;
                    final /* synthetic */ LazyGridState $state;
                    final /* synthetic */ LazyLayoutMeasureScope $this_null;
                    final /* synthetic */ long $visualItemOffset;

                    {
                        this.$this_null = lazyLayoutMeasureScope;
                        this.$state = lazyGridState2;
                        this.$isVertical = z11;
                        this.$reverseLayout = z12;
                        this.$beforeContentPadding = i13;
                        this.$afterContentPadding = i10;
                        this.$visualItemOffset = j2;
                    }

                    @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                    /* renamed from: createItem-O3s9Psw, reason: not valid java name */
                    public LazyGridMeasuredItem mo812createItemO3s9Psw(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Placeable> placeables, long constraints, int lane, int span) {
                        return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getItemAnimator$foundation_release(), constraints, lane, span, null);
                    }
                };
                final boolean z13 = z622;
                final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 r5 = new LazyGridMeasuredLineProvider(z13, mo800invoke0kLqBqw, itemCount, i11, r1, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                    final /* synthetic */ boolean $isVertical;
                    final /* synthetic */ LazyGridSlots $resolvedSlots;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(z13, mo800invoke0kLqBqw, itemCount, i11, r1, spanLayoutProvider);
                        this.$isVertical = z13;
                        this.$resolvedSlots = mo800invoke0kLqBqw;
                    }

                    @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                    public LazyGridMeasuredLine createLine(int index, LazyGridMeasuredItem[] items, List<GridItemSpan> spans, int mainAxisSpacing) {
                        return new LazyGridMeasuredLine(index, items, this.$resolvedSlots, spans, this.$isVertical, mainAxisSpacing);
                    }
                };
                Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> function1 = new Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final ArrayList<Pair<Integer, Constraints>> invoke(int i14) {
                        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = LazyGridSpanLayoutProvider.this.getLineConfiguration(i14);
                        int firstItemIndex = lineConfiguration.getFirstItemIndex();
                        ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                        List<GridItemSpan> spans = lineConfiguration.getSpans();
                        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r5;
                        int size = spans.size();
                        int i15 = 0;
                        for (int i16 = 0; i16 < size; i16++) {
                            int m796getCurrentLineSpanimpl = GridItemSpan.m796getCurrentLineSpanimpl(spans.get(i16).getPackedValue());
                            arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m6206boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m818childConstraintsJhjzzOo$foundation_release(i15, m796getCurrentLineSpanimpl))));
                            firstItemIndex++;
                            i15 += m796getCurrentLineSpanimpl;
                        }
                        return arrayList;
                    }
                };
                Snapshot.Companion companion = Snapshot.INSTANCE;
                LazyGridState lazyGridState3 = LazyGridState.this;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyGridState3.getFirstVisibleItemIndex());
                    if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release >= itemCount && itemCount > 0) {
                        lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                        firstVisibleItemScrollOffset = 0;
                        int i1422 = lineIndexOfItem;
                        Unit unit22 = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        LazyGridMeasureResult m814measureLazyGridOZKpZRA22 = LazyGridMeasureKt.m814measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r5, (LazyGridMeasuredItemProvider) r1, i12, i4, i10, i11, i1422, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6237offsetNN6EwU, z622, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m820getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                            }

                            public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i8), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i7), MapsKt.emptyMap(), function12);
                            }
                        });
                        LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m814measureLazyGridOZKpZRA22, false, 2, null);
                        return m814measureLazyGridOZKpZRA22;
                    }
                    lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                    firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                    int i14222 = lineIndexOfItem;
                    Unit unit222 = Unit.INSTANCE;
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    LazyGridMeasureResult m814measureLazyGridOZKpZRA222 = LazyGridMeasureKt.m814measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r5, (LazyGridMeasuredItemProvider) r1, i12, i4, i10, i11, i14222, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6237offsetNN6EwU, z622, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m820getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                        }

                        public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function12) {
                            return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i8), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i7), MapsKt.emptyMap(), function12);
                        }
                    });
                    LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m814measureLazyGridOZKpZRA222, false, 2, null);
                    return m814measureLazyGridOZKpZRA222;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
        };
        composer.updateRememberedValue(rememberedValue);
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222 = (Function2) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function222;
    }
}
