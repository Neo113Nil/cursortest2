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
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyGrid(Modifier modifier, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z, final boolean z2, FlingBehavior flingBehavior, final boolean z3, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final Function1<? super LazyGridScope, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        FlingBehavior flingBehavior2;
        Modifier modifier3;
        PaddingValues paddingValues3;
        boolean z4;
        int i7;
        Object rememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final PaddingValues paddingValues4;
        final FlingBehavior flingBehavior3;
        final boolean z5;
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
                i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
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
                                    PaddingValues m674PaddingValues0680j_4 = i9 == 0 ? PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(0)) : paddingValues2;
                                    boolean z6 = i5 == 0 ? false : z;
                                    if ((i3 & 64) == 0) {
                                        i4 &= -3670017;
                                        modifier3 = companion;
                                        paddingValues3 = m674PaddingValues0680j_4;
                                        z4 = z6;
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                        modifier3 = companion;
                                        paddingValues3 = m674PaddingValues0680j_4;
                                        z4 = z6;
                                    }
                                    i7 = i4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    flingBehavior2 = flingBehavior;
                                    modifier3 = modifier2;
                                    i7 = i4;
                                    paddingValues3 = paddingValues2;
                                    z4 = z;
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
                                boolean z7 = z4;
                                Modifier modifier5 = modifier3;
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope, (GraphicsContext) consume, startRestartGroup, (524272 & i7) | (i12 & 3670016) | (29360128 & i10));
                                Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                                Modifier lazyLayoutSemantics = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier5.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda, rememberLazyGridSemanticState, orientation, z3, z7, startRestartGroup, (i12 & 57344) | ((i15 << 3) & 458752));
                                LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i11);
                                LazyLayoutBeyondBoundsInfo beyondBoundsInfo = lazyGridState.getBeyondBoundsInfo();
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                composer2 = startRestartGroup;
                                LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics, rememberLazyGridBeyondBoundsState, beyondBoundsInfo, z7, (LayoutDirection) consume2, orientation, z3, startRestartGroup, (MutableVector.$stable << 6) | (i10 & 7168) | (3670016 & i10)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation, z3, z7, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i13 | ((i15 >> 12) & 7168) | i14 | (458752 & i10), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier5;
                                paddingValues4 = paddingValues3;
                                flingBehavior3 = flingBehavior2;
                                z5 = z7;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z5 = z;
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
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        i7 = i4;
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
                        boolean z72 = z4;
                        Modifier modifier52 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy2 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda2, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope2, (GraphicsContext) consume3, startRestartGroup, (524272 & i7) | (i122 & 3670016) | (29360128 & i102));
                        Orientation orientation2 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                        Modifier lazyLayoutSemantics2 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier52.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda2, rememberLazyGridSemanticState2, orientation2, z3, z72, startRestartGroup, (i122 & 57344) | ((i152 << 3) & 458752));
                        LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState2 = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i112);
                        LazyLayoutBeyondBoundsInfo beyondBoundsInfo2 = lazyGridState.getBeyondBoundsInfo();
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        composer2 = startRestartGroup;
                        LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda2, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics2, rememberLazyGridBeyondBoundsState2, beyondBoundsInfo2, z72, (LayoutDirection) consume22, orientation2, z3, startRestartGroup, (MutableVector.$stable << 6) | (i102 & 7168) | (3670016 & i102)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation2, z3, z72, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i132 | ((i152 >> 12) & 7168) | i142 | (458752 & i102), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy2, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier52;
                        paddingValues4 = paddingValues3;
                        flingBehavior3 = flingBehavior2;
                        z5 = z72;
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
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    i7 = i4;
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
                    boolean z722 = z4;
                    Modifier modifier522 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy22 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda22, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope22, (GraphicsContext) consume32, startRestartGroup, (524272 & i7) | (i1222 & 3670016) | (29360128 & i1022));
                    Orientation orientation22 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                    Modifier lazyLayoutSemantics22 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier522.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda22, rememberLazyGridSemanticState22, orientation22, z3, z722, startRestartGroup, (i1222 & 57344) | ((i1522 << 3) & 458752));
                    LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState22 = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i1122);
                    LazyLayoutBeyondBoundsInfo beyondBoundsInfo22 = lazyGridState.getBeyondBoundsInfo();
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(localLayoutDirection22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    composer2 = startRestartGroup;
                    LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda22, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics22, rememberLazyGridBeyondBoundsState22, beyondBoundsInfo22, z722, (LayoutDirection) consume222, orientation22, z3, startRestartGroup, (MutableVector.$stable << 6) | (i1022 & 7168) | (3670016 & i1022)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation22, z3, z722, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i1322 | ((i1522 >> 12) & 7168) | i1422 | (458752 & i1022), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy22, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier522;
                    paddingValues4 = paddingValues3;
                    flingBehavior3 = flingBehavior2;
                    z5 = z722;
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
                if (i5 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                i7 = i4;
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
                boolean z7222 = z4;
                Modifier modifier5222 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda222, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope222, (GraphicsContext) consume322, startRestartGroup, (524272 & i7) | (i12222 & 3670016) | (29360128 & i10222));
                Orientation orientation222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                Modifier lazyLayoutSemantics222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier5222.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda222, rememberLazyGridSemanticState222, orientation222, z3, z7222, startRestartGroup, (i12222 & 57344) | ((i15222 << 3) & 458752));
                LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState222 = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i11222);
                LazyLayoutBeyondBoundsInfo beyondBoundsInfo222 = lazyGridState.getBeyondBoundsInfo();
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                composer2 = startRestartGroup;
                LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda222, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics222, rememberLazyGridBeyondBoundsState222, beyondBoundsInfo222, z7222, (LayoutDirection) consume2222, orientation222, z3, startRestartGroup, (MutableVector.$stable << 6) | (i10222 & 7168) | (3670016 & i10222)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation222, z3, z7222, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i13222 | ((i15222 >> 12) & 7168) | i14222 | (458752 & i10222), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy222, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier5222;
                paddingValues4 = paddingValues3;
                flingBehavior3 = flingBehavior2;
                z5 = z7222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
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
            if (i5 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            i7 = i4;
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
            boolean z72222 = z4;
            Modifier modifier52222 = modifier3;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy2222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda2222, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope2222, (GraphicsContext) consume3222, startRestartGroup, (524272 & i7) | (i122222 & 3670016) | (29360128 & i102222));
            Orientation orientation2222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
            Modifier lazyLayoutSemantics2222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier52222.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda2222, rememberLazyGridSemanticState2222, orientation2222, z3, z72222, startRestartGroup, (i122222 & 57344) | ((i152222 << 3) & 458752));
            LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState2222 = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i112222);
            LazyLayoutBeyondBoundsInfo beyondBoundsInfo2222 = lazyGridState.getBeyondBoundsInfo();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(localLayoutDirection2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda2222, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics2222, rememberLazyGridBeyondBoundsState2222, beyondBoundsInfo2222, z72222, (LayoutDirection) consume22222, orientation2222, z3, startRestartGroup, (MutableVector.$stable << 6) | (i102222 & 7168) | (3670016 & i102222)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation2222, z3, z72222, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i132222 | ((i152222 >> 12) & 7168) | i142222 | (458752 & i102222), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy2222, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier52222;
            paddingValues4 = paddingValues3;
            flingBehavior3 = flingBehavior2;
            z5 = z72222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
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
        if (i5 == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i7 = i4;
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
        boolean z722222 = z4;
        Modifier modifier522222 = modifier3;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy22222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda22222, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope22222, (GraphicsContext) consume32222, startRestartGroup, (524272 & i7) | (i1222222 & 3670016) | (29360128 & i1022222));
        Orientation orientation22222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
        Modifier lazyLayoutSemantics22222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier522222.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), rememberLazyGridItemProviderLambda22222, rememberLazyGridSemanticState22222, orientation22222, z3, z722222, startRestartGroup, (i1222222 & 57344) | ((i1522222 << 3) & 458752));
        LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState22222 = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i1122222);
        LazyLayoutBeyondBoundsInfo beyondBoundsInfo22222 = lazyGridState.getBeyondBoundsInfo();
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(localLayoutDirection22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        composer2 = startRestartGroup;
        LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda22222, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics22222, rememberLazyGridBeyondBoundsState22222, beyondBoundsInfo22222, z722222, (LayoutDirection) consume222222, orientation22222, z3, startRestartGroup, (MutableVector.$stable << 6) | (i1022222 & 7168) | (3670016 & i1022222)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation22222, z3, z722222, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, startRestartGroup, i1322222 | ((i1522222 >> 12) & 7168) | i1422222 | (458752 & i1022222), 64), lazyGridState.getPrefetchState(), rememberLazyGridMeasurePolicy22222, composer2, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier522222;
        paddingValues4 = paddingValues3;
        flingBehavior3 = flingBehavior2;
        z5 = z722222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r27.changed(r18) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final Function0<? extends LazyGridItemProvider> function0, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, final PaddingValues paddingValues, final boolean z, final boolean z2, final Arrangement.Horizontal horizontal, final Arrangement.Vertical vertical, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, Composer composer, int i) {
        boolean z3;
        boolean changed;
        Object rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, -1585069765, "C(rememberLazyGridMeasurePolicy)P(5,8,7!1,6,4,3,9)161@6721L9334:LazyGrid.kt#7791vq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1585069765, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:161)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1026581015, "CC(remember):LazyGrid.kt#9igjgp");
        if (((i & 112) ^ 48) <= 32) {
        }
        if ((i & 48) != 32) {
            z3 = false;
            changed = z3 | ((((i & 896) ^ 384) <= 256 && composer.changed(lazyGridSlotsProvider)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) <= 2048 && composer.changed(paddingValues)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) <= 16384 && composer.changed(z)) || (i & 24576) == 16384) | ((((458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(z2)) || (i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) > 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
            rememberedValue = composer.rememberedValue();
            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return m819invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    /* JADX WARN: Type inference failed for: r18v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
                    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final LazyGridMeasureResult m819invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                        int i2;
                        int i3;
                        int i4;
                        float spacing;
                        int m6252getMaxWidthimpl;
                        long IntOffset;
                        int lineIndexOfItem;
                        int firstVisibleItemScrollOffset;
                        ObservableScopeInvalidator.m855attachToScopeimpl(LazyGridState.this.m827getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                        CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                        if (z2) {
                            i2 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i2 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        if (z2) {
                            i3 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i3 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        int i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                        int i6 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                        final int i7 = i5 + i6;
                        final int i8 = i2 + i3;
                        boolean z4 = z2;
                        int i9 = z4 ? i7 : i8;
                        if (z4 && !z) {
                            i4 = i5;
                        } else if (z4 && z) {
                            i4 = i6;
                        } else {
                            i4 = (z4 || z) ? i3 : i2;
                        }
                        final int i10 = i9 - i4;
                        long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i8, -i7);
                        final LazyGridItemProvider invoke = function0.invoke();
                        final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
                        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                        final LazyGridSlots mo808invoke0kLqBqw = lazyGridSlotsProvider.mo808invoke0kLqBqw(lazyLayoutMeasureScope2, j);
                        int length = mo808invoke0kLqBqw.getSizes().length;
                        spanLayoutProvider.setSlotsPerLine(length);
                        if (z2) {
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
                        final int i11 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(spacing);
                        final int itemCount = invoke.getItemCount();
                        if (z2) {
                            m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i7;
                        } else {
                            m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i8;
                        }
                        int i12 = m6252getMaxWidthimpl;
                        if (!z || i12 > 0) {
                            IntOffset = IntOffsetKt.IntOffset(i2, i5);
                        } else {
                            boolean z5 = z2;
                            if (!z5) {
                                i2 += i12;
                            }
                            if (z5) {
                                i5 += i12;
                            }
                            IntOffset = IntOffsetKt.IntOffset(i2, i5);
                        }
                        final long j2 = IntOffset;
                        final LazyGridState lazyGridState2 = LazyGridState.this;
                        final boolean z6 = z2;
                        final boolean z7 = z;
                        final int i13 = i4;
                        final ?? r18 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, i11, lazyGridState2, z6, z7, i13, i10, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
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
                                this.$isVertical = z6;
                                this.$reverseLayout = z7;
                                this.$beforeContentPadding = i13;
                                this.$afterContentPadding = i10;
                                this.$visualItemOffset = j2;
                            }

                            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                            /* renamed from: createItem-O3s9Psw, reason: not valid java name */
                            public LazyGridMeasuredItem mo820createItemO3s9Psw(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Placeable> placeables, long constraints, int lane, int span) {
                                return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getItemAnimator$foundation_release(), constraints, lane, span, null);
                            }
                        };
                        final boolean z8 = z2;
                        final ?? r2 = new LazyGridMeasuredLineProvider(z8, mo808invoke0kLqBqw, itemCount, i11, r18, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                            final /* synthetic */ boolean $isVertical;
                            final /* synthetic */ LazyGridSlots $resolvedSlots;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(z8, mo808invoke0kLqBqw, itemCount, i11, r18, spanLayoutProvider);
                                this.$isVertical = z8;
                                this.$resolvedSlots = mo808invoke0kLqBqw;
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
                                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r2;
                                int size = spans.size();
                                int i15 = 0;
                                for (int i16 = 0; i16 < size; i16++) {
                                    int m804getCurrentLineSpanimpl = GridItemSpan.m804getCurrentLineSpanimpl(spans.get(i16).getPackedValue());
                                    arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m6240boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m826childConstraintsJhjzzOo$foundation_release(i15, m804getCurrentLineSpanimpl))));
                                    firstItemIndex++;
                                    i15 += m804getCurrentLineSpanimpl;
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
                                Unit unit = Unit.INSTANCE;
                                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                LazyGridMeasureResult m822measureLazyGridOZKpZRA = LazyGridMeasureKt.m822measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r2, (LazyGridMeasuredItemProvider) r18, i12, i4, i10, i11, lineIndexOfItem, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6271offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m828getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                                    }

                                    public final MeasureResult invoke(int i14, int i15, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                        return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i14 + i8), ConstraintsKt.m6268constrainHeightK40F9xA(j, i15 + i7), MapsKt.emptyMap(), function12);
                                    }
                                });
                                LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m822measureLazyGridOZKpZRA, false, 2, null);
                                return m822measureLazyGridOZKpZRA;
                            }
                            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                            firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                            Unit unit2 = Unit.INSTANCE;
                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            LazyGridMeasureResult m822measureLazyGridOZKpZRA2 = LazyGridMeasureKt.m822measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r2, (LazyGridMeasuredItemProvider) r18, i12, i4, i10, i11, lineIndexOfItem, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6271offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m828getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                                }

                                public final MeasureResult invoke(int i14, int i15, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i14 + i8), ConstraintsKt.m6268constrainHeightK40F9xA(j, i15 + i7), MapsKt.emptyMap(), function12);
                                }
                            });
                            LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m822measureLazyGridOZKpZRA2, false, 2, null);
                            return m822measureLazyGridOZKpZRA2;
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
        z3 = true;
        if (((29360128 & i) ^ 12582912) > 8388608) {
            changed = z3 | ((((i & 896) ^ 384) <= 256 && composer.changed(lazyGridSlotsProvider)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) <= 2048 && composer.changed(paddingValues)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) <= 16384 && composer.changed(z)) || (i & 24576) == 16384) | ((((458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(z2)) || (i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) > 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m819invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX WARN: Type inference failed for: r18v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
                /* JADX WARN: Type inference failed for: r2v15, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m819invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i2;
                    int i3;
                    int i4;
                    float spacing;
                    int m6252getMaxWidthimpl;
                    long IntOffset;
                    int lineIndexOfItem;
                    int firstVisibleItemScrollOffset;
                    ObservableScopeInvalidator.m855attachToScopeimpl(LazyGridState.this.m827getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z2) {
                        i2 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i2 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        i3 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i3 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                    int i6 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                    final int i7 = i5 + i6;
                    final int i8 = i2 + i3;
                    boolean z4 = z2;
                    int i9 = z4 ? i7 : i8;
                    if (z4 && !z) {
                        i4 = i5;
                    } else if (z4 && z) {
                        i4 = i6;
                    } else {
                        i4 = (z4 || z) ? i3 : i2;
                    }
                    final int i10 = i9 - i4;
                    long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i8, -i7);
                    final LazyGridItemProvider invoke = function0.invoke();
                    final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    final LazyGridSlots mo808invoke0kLqBqw = lazyGridSlotsProvider.mo808invoke0kLqBqw(lazyLayoutMeasureScope2, j);
                    int length = mo808invoke0kLqBqw.getSizes().length;
                    spanLayoutProvider.setSlotsPerLine(length);
                    if (z2) {
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
                    final int i11 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(spacing);
                    final int itemCount = invoke.getItemCount();
                    if (z2) {
                        m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i7;
                    } else {
                        m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i8;
                    }
                    int i12 = m6252getMaxWidthimpl;
                    if (!z || i12 > 0) {
                        IntOffset = IntOffsetKt.IntOffset(i2, i5);
                    } else {
                        boolean z5 = z2;
                        if (!z5) {
                            i2 += i12;
                        }
                        if (z5) {
                            i5 += i12;
                        }
                        IntOffset = IntOffsetKt.IntOffset(i2, i5);
                    }
                    final long j2 = IntOffset;
                    final LazyGridState lazyGridState2 = LazyGridState.this;
                    final boolean z6 = z2;
                    final boolean z7 = z;
                    final int i13 = i4;
                    final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 r18 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, i11, lazyGridState2, z6, z7, i13, i10, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
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
                            this.$isVertical = z6;
                            this.$reverseLayout = z7;
                            this.$beforeContentPadding = i13;
                            this.$afterContentPadding = i10;
                            this.$visualItemOffset = j2;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                        /* renamed from: createItem-O3s9Psw, reason: not valid java name */
                        public LazyGridMeasuredItem mo820createItemO3s9Psw(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Placeable> placeables, long constraints, int lane, int span) {
                            return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getItemAnimator$foundation_release(), constraints, lane, span, null);
                        }
                    };
                    final boolean z8 = z2;
                    final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 r2 = new LazyGridMeasuredLineProvider(z8, mo808invoke0kLqBqw, itemCount, i11, r18, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ LazyGridSlots $resolvedSlots;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(z8, mo808invoke0kLqBqw, itemCount, i11, r18, spanLayoutProvider);
                            this.$isVertical = z8;
                            this.$resolvedSlots = mo808invoke0kLqBqw;
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
                            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r2;
                            int size = spans.size();
                            int i15 = 0;
                            for (int i16 = 0; i16 < size; i16++) {
                                int m804getCurrentLineSpanimpl = GridItemSpan.m804getCurrentLineSpanimpl(spans.get(i16).getPackedValue());
                                arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m6240boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m826childConstraintsJhjzzOo$foundation_release(i15, m804getCurrentLineSpanimpl))));
                                firstItemIndex++;
                                i15 += m804getCurrentLineSpanimpl;
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
                            Unit unit2 = Unit.INSTANCE;
                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            LazyGridMeasureResult m822measureLazyGridOZKpZRA2 = LazyGridMeasureKt.m822measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r2, (LazyGridMeasuredItemProvider) r18, i12, i4, i10, i11, lineIndexOfItem, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6271offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m828getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                                }

                                public final MeasureResult invoke(int i14, int i15, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i14 + i8), ConstraintsKt.m6268constrainHeightK40F9xA(j, i15 + i7), MapsKt.emptyMap(), function12);
                                }
                            });
                            LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m822measureLazyGridOZKpZRA2, false, 2, null);
                            return m822measureLazyGridOZKpZRA2;
                        }
                        lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                        firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                        Unit unit22 = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        LazyGridMeasureResult m822measureLazyGridOZKpZRA22 = LazyGridMeasureKt.m822measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r2, (LazyGridMeasuredItemProvider) r18, i12, i4, i10, i11, lineIndexOfItem, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6271offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m828getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                            }

                            public final MeasureResult invoke(int i14, int i15, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i14 + i8), ConstraintsKt.m6268constrainHeightK40F9xA(j, i15 + i7), MapsKt.emptyMap(), function12);
                            }
                        });
                        LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m822measureLazyGridOZKpZRA22, false, 2, null);
                        return m822measureLazyGridOZKpZRA22;
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
        changed = z3 | ((((i & 896) ^ 384) <= 256 && composer.changed(lazyGridSlotsProvider)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) <= 2048 && composer.changed(paddingValues)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) <= 16384 && composer.changed(z)) || (i & 24576) == 16384) | ((((458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(z2)) || (i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) > 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                return m819invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
            }

            /* JADX WARN: Type inference failed for: r18v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
            /* JADX WARN: Type inference failed for: r2v15, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final LazyGridMeasureResult m819invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                int i2;
                int i3;
                int i4;
                float spacing;
                int m6252getMaxWidthimpl;
                long IntOffset;
                int lineIndexOfItem;
                int firstVisibleItemScrollOffset;
                ObservableScopeInvalidator.m855attachToScopeimpl(LazyGridState.this.m827getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                if (z2) {
                    i2 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i2 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                if (z2) {
                    i3 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i3 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                int i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                int i6 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                final int i7 = i5 + i6;
                final int i8 = i2 + i3;
                boolean z4 = z2;
                int i9 = z4 ? i7 : i8;
                if (z4 && !z) {
                    i4 = i5;
                } else if (z4 && z) {
                    i4 = i6;
                } else {
                    i4 = (z4 || z) ? i3 : i2;
                }
                final int i10 = i9 - i4;
                long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i8, -i7);
                final LazyGridItemProvider invoke = function0.invoke();
                final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                final LazyGridSlots mo808invoke0kLqBqw = lazyGridSlotsProvider.mo808invoke0kLqBqw(lazyLayoutMeasureScope2, j);
                int length = mo808invoke0kLqBqw.getSizes().length;
                spanLayoutProvider.setSlotsPerLine(length);
                if (z2) {
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
                final int i11 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(spacing);
                final int itemCount = invoke.getItemCount();
                if (z2) {
                    m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i7;
                } else {
                    m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i8;
                }
                int i12 = m6252getMaxWidthimpl;
                if (!z || i12 > 0) {
                    IntOffset = IntOffsetKt.IntOffset(i2, i5);
                } else {
                    boolean z5 = z2;
                    if (!z5) {
                        i2 += i12;
                    }
                    if (z5) {
                        i5 += i12;
                    }
                    IntOffset = IntOffsetKt.IntOffset(i2, i5);
                }
                final long j2 = IntOffset;
                final LazyGridState lazyGridState2 = LazyGridState.this;
                final boolean z6 = z2;
                final boolean z7 = z;
                final int i13 = i4;
                final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 r18 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, i11, lazyGridState2, z6, z7, i13, i10, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
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
                        this.$isVertical = z6;
                        this.$reverseLayout = z7;
                        this.$beforeContentPadding = i13;
                        this.$afterContentPadding = i10;
                        this.$visualItemOffset = j2;
                    }

                    @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                    /* renamed from: createItem-O3s9Psw, reason: not valid java name */
                    public LazyGridMeasuredItem mo820createItemO3s9Psw(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Placeable> placeables, long constraints, int lane, int span) {
                        return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getItemAnimator$foundation_release(), constraints, lane, span, null);
                    }
                };
                final boolean z8 = z2;
                final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 r2 = new LazyGridMeasuredLineProvider(z8, mo808invoke0kLqBqw, itemCount, i11, r18, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                    final /* synthetic */ boolean $isVertical;
                    final /* synthetic */ LazyGridSlots $resolvedSlots;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(z8, mo808invoke0kLqBqw, itemCount, i11, r18, spanLayoutProvider);
                        this.$isVertical = z8;
                        this.$resolvedSlots = mo808invoke0kLqBqw;
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
                        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r2;
                        int size = spans.size();
                        int i15 = 0;
                        for (int i16 = 0; i16 < size; i16++) {
                            int m804getCurrentLineSpanimpl = GridItemSpan.m804getCurrentLineSpanimpl(spans.get(i16).getPackedValue());
                            arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m6240boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m826childConstraintsJhjzzOo$foundation_release(i15, m804getCurrentLineSpanimpl))));
                            firstItemIndex++;
                            i15 += m804getCurrentLineSpanimpl;
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
                        Unit unit22 = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        LazyGridMeasureResult m822measureLazyGridOZKpZRA22 = LazyGridMeasureKt.m822measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r2, (LazyGridMeasuredItemProvider) r18, i12, i4, i10, i11, lineIndexOfItem, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6271offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m828getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                            }

                            public final MeasureResult invoke(int i14, int i15, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i14 + i8), ConstraintsKt.m6268constrainHeightK40F9xA(j, i15 + i7), MapsKt.emptyMap(), function12);
                            }
                        });
                        LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m822measureLazyGridOZKpZRA22, false, 2, null);
                        return m822measureLazyGridOZKpZRA22;
                    }
                    lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                    firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                    Unit unit222 = Unit.INSTANCE;
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    LazyGridMeasureResult m822measureLazyGridOZKpZRA222 = LazyGridMeasureKt.m822measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r2, (LazyGridMeasuredItemProvider) r18, i12, i4, i10, i11, lineIndexOfItem, firstVisibleItemScrollOffset, LazyGridState.this.getScrollToBeConsumed(), m6271offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope2, LazyGridState.this.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyGridState.this.getPinnedItems(), LazyGridState.this.getBeyondBoundsInfo()), coroutineScope, LazyGridState.this.m828getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                        }

                        public final MeasureResult invoke(int i14, int i15, Function1<? super Placeable.PlacementScope, Unit> function12) {
                            return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i14 + i8), ConstraintsKt.m6268constrainHeightK40F9xA(j, i15 + i7), MapsKt.emptyMap(), function12);
                        }
                    });
                    LazyGridState.applyMeasureResult$foundation_release$default(LazyGridState.this, m822measureLazyGridOZKpZRA222, false, 2, null);
                    return m822measureLazyGridOZKpZRA222;
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
