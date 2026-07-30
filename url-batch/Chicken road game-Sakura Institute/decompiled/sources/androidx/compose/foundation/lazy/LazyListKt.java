package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyList.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a\u009a\u0001\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e¢\u0006\u0002\b\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tH\u0003¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyHeadersEnabled", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;ZLandroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(final Modifier modifier, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final FlingBehavior flingBehavior, final boolean z3, int i, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object rememberedValue;
        Composer composer2;
        final int i13;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final Alignment.Vertical vertical4;
        final Arrangement.Horizontal horizontal4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(620764179);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyList)P(7,9,2,8,6,3,10!1,4,12,11,5)81@3859L50,83@3935L48,84@4009L24,85@4081L7,86@4150L7,88@4183L395,109@4816L278,117@5164L153,123@5480L7,116@5108L481,128@5650L317,105@4671L1429:LazyList.kt#428nma");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i4 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i4 & 32) != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i5 |= startRestartGroup.changed(flingBehavior) ? 131072 : 65536;
                    if ((i4 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i6 = i4 & 128;
                    if (i6 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i7 = i4 & 256;
                    if (i7 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= startRestartGroup.changed(horizontal) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i8 = i4 & 512;
                    if (i8 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i5 |= startRestartGroup.changed(vertical) ? 536870912 : 268435456;
                    }
                    i9 = i4 & 1024;
                    if (i9 == 0) {
                        i10 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        i10 = i3 | (startRestartGroup.changed(vertical2) ? 4 : 2);
                    } else {
                        i10 = i3;
                    }
                    i11 = i4 & 2048;
                    if (i11 == 0) {
                        i10 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i10 |= startRestartGroup.changed(horizontal2) ? 32 : 16;
                    }
                    i12 = i10;
                    if ((i4 & 4096) == 0) {
                        i12 |= 384;
                    } else if ((i3 & 384) == 0) {
                        i12 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                    }
                    if ((306783379 & i5) == 306783378 || (i12 & 147) != 146 || !startRestartGroup.getSkipping()) {
                        int i14 = i6 == 0 ? 0 : i;
                        Alignment.Horizontal horizontal5 = i7 == 0 ? null : horizontal;
                        Arrangement.Vertical vertical5 = i8 == 0 ? null : vertical;
                        Alignment.Vertical vertical6 = i9 == 0 ? null : vertical2;
                        Arrangement.Horizontal horizontal6 = i11 == 0 ? null : horizontal2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(620764179, i5, i12, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                        }
                        int i15 = (i5 >> 3) & 14;
                        Function0<LazyListItemProvider> rememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, startRestartGroup, i15 | ((i12 >> 3) & 112));
                        int i16 = i5 >> 9;
                        LazyLayoutSemanticState rememberLazyListSemanticState = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i15 | (i16 & 112));
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
                        CompositionLocal<Boolean> localScrollCaptureInProgress = CompositionLocalsKt.getLocalScrollCaptureInProgress();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localScrollCaptureInProgress);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i17 = i5 & 112;
                        int i18 = i5 & 7168;
                        int i19 = i5 >> 6;
                        int i20 = i12 << 21;
                        int i21 = i5;
                        int i22 = i14;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda, lazyListState, paddingValues, z, z2, i14, horizontal5, vertical6, horizontal6, vertical5, coroutineScope, graphicsContext, !((Boolean) consume2).booleanValue(), startRestartGroup, (65520 & i5) | (i19 & 458752) | (i19 & 3670016) | (29360128 & i20) | (i20 & 234881024) | (1879048192 & i5), 0);
                        Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                        Modifier lazyLayoutSemantics = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda, rememberLazyListSemanticState, orientation, z3, z, startRestartGroup, (i19 & 57344) | ((i21 << 6) & 458752));
                        composer2 = startRestartGroup;
                        LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i22, composer2, i15 | ((i21 >> 18) & 112));
                        LazyLayoutBeyondBoundsInfo beyondBoundsInfo = lazyListState.getBeyondBoundsInfo();
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics, rememberLazyListBeyondBoundsState, beyondBoundsInfo, z, (LayoutDirection) consume3, orientation, z3, composer2, (MutableVector.$stable << 6) | i18 | (i21 & 3670016)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, i17 | (i16 & 7168) | (57344 & (i21 << 3)) | (i21 & 458752), 64), lazyListState.getPrefetchState(), rememberLazyListMeasurePolicy, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i13 = i22;
                        horizontal3 = horizontal5;
                        vertical3 = vertical5;
                        vertical4 = vertical6;
                        horizontal4 = horizontal6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        i13 = i;
                        horizontal3 = horizontal;
                        vertical4 = vertical2;
                        horizontal4 = horizontal2;
                        composer2 = startRestartGroup;
                        vertical3 = vertical;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
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

                            public final void invoke(Composer composer3, int i23) {
                                LazyListKt.LazyList(Modifier.this, lazyListState, paddingValues, z, z2, flingBehavior, z3, i13, horizontal3, vertical3, vertical4, horizontal4, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i4 & 64) == 0) {
                }
                i6 = i4 & 128;
                if (i6 == 0) {
                }
                i7 = i4 & 256;
                if (i7 == 0) {
                }
                i8 = i4 & 512;
                if (i8 == 0) {
                }
                i9 = i4 & 1024;
                if (i9 == 0) {
                }
                i11 = i4 & 2048;
                if (i11 == 0) {
                }
                i12 = i10;
                if ((i4 & 4096) == 0) {
                }
                if ((306783379 & i5) == 306783378) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i11 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i152 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> rememberLazyListItemProviderLambda2 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, startRestartGroup, i152 | ((i12 >> 3) & 112));
                int i162 = i5 >> 9;
                LazyLayoutSemanticState rememberLazyListSemanticState2 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i152 | (i162 & 112));
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
                Object consume4 = startRestartGroup.consume(localGraphicsContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                GraphicsContext graphicsContext2 = (GraphicsContext) consume4;
                CompositionLocal<Boolean> localScrollCaptureInProgress2 = CompositionLocalsKt.getLocalScrollCaptureInProgress();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localScrollCaptureInProgress2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i172 = i5 & 112;
                int i182 = i5 & 7168;
                int i192 = i5 >> 6;
                int i202 = i12 << 21;
                int i212 = i5;
                int i222 = i14;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda2, lazyListState, paddingValues, z, z2, i14, horizontal5, vertical6, horizontal6, vertical5, coroutineScope2, graphicsContext2, !((Boolean) consume22).booleanValue(), startRestartGroup, (65520 & i5) | (i192 & 458752) | (i192 & 3670016) | (29360128 & i202) | (i202 & 234881024) | (1879048192 & i5), 0);
                Orientation orientation2 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                Modifier lazyLayoutSemantics2 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda2, rememberLazyListSemanticState2, orientation2, z3, z, startRestartGroup, (i192 & 57344) | ((i212 << 6) & 458752));
                composer2 = startRestartGroup;
                LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState2 = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i222, composer2, i152 | ((i212 >> 18) & 112));
                LazyLayoutBeyondBoundsInfo beyondBoundsInfo2 = lazyListState.getBeyondBoundsInfo();
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume32 = composer2.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda2, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics2, rememberLazyListBeyondBoundsState2, beyondBoundsInfo2, z, (LayoutDirection) consume32, orientation2, z3, composer2, (MutableVector.$stable << 6) | i182 | (i212 & 3670016)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation2, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, i172 | (i162 & 7168) | (57344 & (i212 << 3)) | (i212 & 458752), 64), lazyListState.getPrefetchState(), rememberLazyListMeasurePolicy2, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                i13 = i222;
                horizontal3 = horizontal5;
                vertical3 = vertical5;
                vertical4 = vertical6;
                horizontal4 = horizontal6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) == 0) {
            }
            i6 = i4 & 128;
            if (i6 == 0) {
            }
            i7 = i4 & 256;
            if (i7 == 0) {
            }
            i8 = i4 & 512;
            if (i8 == 0) {
            }
            i9 = i4 & 1024;
            if (i9 == 0) {
            }
            i11 = i4 & 2048;
            if (i11 == 0) {
            }
            i12 = i10;
            if ((i4 & 4096) == 0) {
            }
            if ((306783379 & i5) == 306783378) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i11 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1522 = (i5 >> 3) & 14;
            Function0<LazyListItemProvider> rememberLazyListItemProviderLambda22 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, startRestartGroup, i1522 | ((i12 >> 3) & 112));
            int i1622 = i5 >> 9;
            LazyLayoutSemanticState rememberLazyListSemanticState22 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i1522 | (i1622 & 112));
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
            Object consume42 = startRestartGroup.consume(localGraphicsContext22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            GraphicsContext graphicsContext22 = (GraphicsContext) consume42;
            CompositionLocal<Boolean> localScrollCaptureInProgress22 = CompositionLocalsKt.getLocalScrollCaptureInProgress();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localScrollCaptureInProgress22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i1722 = i5 & 112;
            int i1822 = i5 & 7168;
            int i1922 = i5 >> 6;
            int i2022 = i12 << 21;
            int i2122 = i5;
            int i2222 = i14;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy22 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda22, lazyListState, paddingValues, z, z2, i14, horizontal5, vertical6, horizontal6, vertical5, coroutineScope22, graphicsContext22, !((Boolean) consume222).booleanValue(), startRestartGroup, (65520 & i5) | (i1922 & 458752) | (i1922 & 3670016) | (29360128 & i2022) | (i2022 & 234881024) | (1879048192 & i5), 0);
            Orientation orientation22 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
            Modifier lazyLayoutSemantics22 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda22, rememberLazyListSemanticState22, orientation22, z3, z, startRestartGroup, (i1922 & 57344) | ((i2122 << 6) & 458752));
            composer2 = startRestartGroup;
            LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState22 = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i2222, composer2, i1522 | ((i2122 >> 18) & 112));
            LazyLayoutBeyondBoundsInfo beyondBoundsInfo22 = lazyListState.getBeyondBoundsInfo();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume322 = composer2.consume(localLayoutDirection22);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda22, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics22, rememberLazyListBeyondBoundsState22, beyondBoundsInfo22, z, (LayoutDirection) consume322, orientation22, z3, composer2, (MutableVector.$stable << 6) | i1822 | (i2122 & 3670016)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation22, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, i1722 | (i1622 & 7168) | (57344 & (i2122 << 3)) | (i2122 & 458752), 64), lazyListState.getPrefetchState(), rememberLazyListMeasurePolicy22, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            i13 = i2222;
            horizontal3 = horizontal5;
            vertical3 = vertical5;
            vertical4 = vertical6;
            horizontal4 = horizontal6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) == 0) {
        }
        i6 = i4 & 128;
        if (i6 == 0) {
        }
        i7 = i4 & 256;
        if (i7 == 0) {
        }
        i8 = i4 & 512;
        if (i8 == 0) {
        }
        i9 = i4 & 1024;
        if (i9 == 0) {
        }
        i11 = i4 & 2048;
        if (i11 == 0) {
        }
        i12 = i10;
        if ((i4 & 4096) == 0) {
        }
        if ((306783379 & i5) == 306783378) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i11 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i15222 = (i5 >> 3) & 14;
        Function0<LazyListItemProvider> rememberLazyListItemProviderLambda222 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, startRestartGroup, i15222 | ((i12 >> 3) & 112));
        int i16222 = i5 >> 9;
        LazyLayoutSemanticState rememberLazyListSemanticState222 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i15222 | (i16222 & 112));
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
        Object consume422 = startRestartGroup.consume(localGraphicsContext222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        GraphicsContext graphicsContext222 = (GraphicsContext) consume422;
        CompositionLocal<Boolean> localScrollCaptureInProgress222 = CompositionLocalsKt.getLocalScrollCaptureInProgress();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localScrollCaptureInProgress222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i17222 = i5 & 112;
        int i18222 = i5 & 7168;
        int i19222 = i5 >> 6;
        int i20222 = i12 << 21;
        int i21222 = i5;
        int i22222 = i14;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy222 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda222, lazyListState, paddingValues, z, z2, i14, horizontal5, vertical6, horizontal6, vertical5, coroutineScope222, graphicsContext222, !((Boolean) consume2222).booleanValue(), startRestartGroup, (65520 & i5) | (i19222 & 458752) | (i19222 & 3670016) | (29360128 & i20222) | (i20222 & 234881024) | (1879048192 & i5), 0);
        Orientation orientation222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
        Modifier lazyLayoutSemantics222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda222, rememberLazyListSemanticState222, orientation222, z3, z, startRestartGroup, (i19222 & 57344) | ((i21222 << 6) & 458752));
        composer2 = startRestartGroup;
        LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState222 = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i22222, composer2, i15222 | ((i21222 >> 18) & 112));
        LazyLayoutBeyondBoundsInfo beyondBoundsInfo222 = lazyListState.getBeyondBoundsInfo();
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3222 = composer2.consume(localLayoutDirection222);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda222, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics222, rememberLazyListBeyondBoundsState222, beyondBoundsInfo222, z, (LayoutDirection) consume3222, orientation222, z3, composer2, (MutableVector.$stable << 6) | i18222 | (i21222 & 3670016)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation222, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, i17222 | (i16222 & 7168) | (57344 & (i21222 << 3)) | (i21222 & 458752), 64), lazyListState.getPrefetchState(), rememberLazyListMeasurePolicy222, composer2, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        i13 = i22222;
        horizontal3 = horizontal5;
        vertical3 = vertical5;
        vertical4 = vertical6;
        horizontal4 = horizontal6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        if (r34.changed(r29) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
    
        if (r34.changed(r30) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        if (r34.changed(r33) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r34.changed(r22) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final Function0<? extends LazyListItemProvider> function0, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final int i, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final Arrangement.Horizontal horizontal2, final Arrangement.Vertical vertical2, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, final boolean z3, Composer composer, int i2, int i3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Object rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, 1972347046, "C(rememberLazyListMeasurePolicy)P(7,9,1,8,6!1,4,11,5,12)170@7305L8413:LazyList.kt#428nma");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1972347046, i2, i3, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:170)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 581121742, "CC(remember):LazyList.kt#9igjgp");
        if (((i2 & 112) ^ 48) <= 32) {
        }
        if ((i2 & 48) != 32) {
            z4 = false;
            boolean z9 = z4 | ((((i2 & 896) ^ 384) <= 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) <= 2048 && composer.changed(z)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) <= 16384 && composer.changed(z2)) || (i2 & 24576) == 16384) | ((((3670016 & i2) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i2 & 1572864) == 1048576) | ((((29360128 & i2) ^ 12582912) <= 8388608 && composer.changed(vertical)) || (i2 & 12582912) == 8388608);
            if (((234881024 & i2) ^ 100663296) <= 67108864) {
            }
            if ((100663296 & i2) != 67108864) {
                z5 = false;
                boolean z10 = z9 | z5;
                if (((1879048192 & i2) ^ 805306368) <= 536870912) {
                }
                if ((i2 & 805306368) != 536870912) {
                    z6 = false;
                    boolean changed = z6 | z10 | composer.changed(graphicsContext);
                    if (((i3 & 896) ^ 384) <= 256) {
                    }
                    if ((i3 & 384) != 256) {
                        z7 = false;
                        z8 = changed | z7;
                        rememberedValue = composer.rememberedValue();
                        if (!z8 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                    return m783invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                }

                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final LazyListMeasureResult m783invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                    int i4;
                                    int i5;
                                    int i6;
                                    float spacing;
                                    int m6252getMaxWidthimpl;
                                    long IntOffset;
                                    float scrollToBeConsumed;
                                    List<Integer> emptyList;
                                    ObservableScopeInvalidator.m855attachToScopeimpl(LazyListState.this.m798getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                    boolean z11 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                                    CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                                    if (z2) {
                                        i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                    } else {
                                        i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                    }
                                    if (z2) {
                                        i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                    } else {
                                        i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                    }
                                    int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                                    int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                                    final int i9 = i7 + i8;
                                    final int i10 = i4 + i5;
                                    boolean z12 = z2;
                                    int i11 = z12 ? i9 : i10;
                                    if (z12 && !z) {
                                        i6 = i7;
                                    } else if (z12 && z) {
                                        i6 = i8;
                                    } else {
                                        i6 = (z12 || z) ? i5 : i4;
                                    }
                                    final int i12 = i11 - i6;
                                    final long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                                    final LazyListItemProvider invoke = function0.invoke();
                                    invoke.getItemScope().setMaxSize(Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU), Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU));
                                    if (z2) {
                                        Arrangement.Vertical vertical3 = vertical2;
                                        if (vertical3 == null) {
                                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                                        }
                                        spacing = vertical3.getSpacing();
                                    } else {
                                        Arrangement.Horizontal horizontal3 = horizontal2;
                                        if (horizontal3 == null) {
                                            throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                                        }
                                        spacing = horizontal3.getSpacing();
                                    }
                                    final int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(spacing);
                                    final int itemCount = invoke.getItemCount();
                                    if (z2) {
                                        m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                                    } else {
                                        m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                                    }
                                    int i14 = m6252getMaxWidthimpl;
                                    if (!z || i14 > 0) {
                                        IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                    } else {
                                        boolean z13 = z2;
                                        if (!z13) {
                                            i4 += i14;
                                        }
                                        if (z13) {
                                            i7 += i14;
                                        }
                                        IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                    }
                                    final long j2 = IntOffset;
                                    final boolean z14 = z2;
                                    final Alignment.Horizontal horizontal4 = horizontal;
                                    final Alignment.Vertical vertical4 = vertical;
                                    final boolean z15 = z;
                                    final LazyListState lazyListState2 = LazyListState.this;
                                    final int i15 = i6;
                                    LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6271offsetNN6EwU, z14, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal4, vertical4, z15, i15, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                                        final /* synthetic */ int $afterContentPadding;
                                        final /* synthetic */ int $beforeContentPadding;
                                        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                                        final /* synthetic */ boolean $isVertical;
                                        final /* synthetic */ int $itemsCount;
                                        final /* synthetic */ boolean $reverseLayout;
                                        final /* synthetic */ int $spaceBetweenItems;
                                        final /* synthetic */ LazyListState $state;
                                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                                        final /* synthetic */ Alignment.Vertical $verticalAlignment;
                                        final /* synthetic */ long $visualItemOffset;

                                        {
                                            this.$isVertical = z14;
                                            this.$this_null = lazyLayoutMeasureScope;
                                            this.$itemsCount = itemCount;
                                            this.$spaceBetweenItems = i13;
                                            this.$horizontalAlignment = horizontal4;
                                            this.$verticalAlignment = vertical4;
                                            this.$reverseLayout = z15;
                                            this.$beforeContentPadding = i15;
                                            this.$afterContentPadding = i12;
                                            this.$visualItemOffset = j2;
                                            this.$state = lazyListState2;
                                        }

                                        @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                        /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                                        public LazyListMeasuredItem mo784createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                                            return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator$foundation_release(), constraints, null);
                                        }
                                    };
                                    Snapshot.Companion companion = Snapshot.INSTANCE;
                                    LazyListState lazyListState3 = LazyListState.this;
                                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                    Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                    try {
                                        int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyListState3.getFirstVisibleItemIndex());
                                        int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                                        Unit unit = Unit.INSTANCE;
                                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                        List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyListState.this.getPinnedItems(), LazyListState.this.getBeyondBoundsInfo());
                                        if (lazyLayoutMeasureScope.isLookingAhead() || !z11) {
                                            scrollToBeConsumed = LazyListState.this.getScrollToBeConsumed();
                                        } else {
                                            scrollToBeConsumed = LazyListState.this.getScrollDeltaBetweenPasses$foundation_release();
                                        }
                                        float f = scrollToBeConsumed;
                                        if (z3) {
                                            emptyList = invoke.getHeaderIndexes();
                                        } else {
                                            emptyList = CollectionsKt.emptyList();
                                        }
                                        LazyListMeasureResult m788measureLazyListx0Ok8Vo = LazyListMeasureKt.m788measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6271offsetNN6EwU, z2, emptyList, vertical2, horizontal2, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z11, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m799getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                            }

                                            public final MeasureResult invoke(int i16, int i17, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i16 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i17 + i9), MapsKt.emptyMap(), function1);
                                            }
                                        });
                                        LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m788measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                        return m788measureLazyListx0Ok8Vo;
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
                    z7 = true;
                    z8 = changed | z7;
                    rememberedValue = composer.rememberedValue();
                    if (!z8) {
                    }
                    rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                            return m783invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                        }

                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final LazyListMeasureResult m783invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                            int i4;
                            int i5;
                            int i6;
                            float spacing;
                            int m6252getMaxWidthimpl;
                            long IntOffset;
                            float scrollToBeConsumed;
                            List<Integer> emptyList;
                            ObservableScopeInvalidator.m855attachToScopeimpl(LazyListState.this.m798getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                            boolean z11 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                            CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                            if (z2) {
                                i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                            } else {
                                i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                            }
                            if (z2) {
                                i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                            } else {
                                i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                            }
                            int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                            int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                            final int i9 = i7 + i8;
                            final int i10 = i4 + i5;
                            boolean z12 = z2;
                            int i11 = z12 ? i9 : i10;
                            if (z12 && !z) {
                                i6 = i7;
                            } else if (z12 && z) {
                                i6 = i8;
                            } else {
                                i6 = (z12 || z) ? i5 : i4;
                            }
                            final int i12 = i11 - i6;
                            final long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                            final LazyListItemProvider invoke = function0.invoke();
                            invoke.getItemScope().setMaxSize(Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU), Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU));
                            if (z2) {
                                Arrangement.Vertical vertical3 = vertical2;
                                if (vertical3 == null) {
                                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                                }
                                spacing = vertical3.getSpacing();
                            } else {
                                Arrangement.Horizontal horizontal3 = horizontal2;
                                if (horizontal3 == null) {
                                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                                }
                                spacing = horizontal3.getSpacing();
                            }
                            final int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(spacing);
                            final int itemCount = invoke.getItemCount();
                            if (z2) {
                                m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                            } else {
                                m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                            }
                            int i14 = m6252getMaxWidthimpl;
                            if (!z || i14 > 0) {
                                IntOffset = IntOffsetKt.IntOffset(i4, i7);
                            } else {
                                boolean z13 = z2;
                                if (!z13) {
                                    i4 += i14;
                                }
                                if (z13) {
                                    i7 += i14;
                                }
                                IntOffset = IntOffsetKt.IntOffset(i4, i7);
                            }
                            final long j2 = IntOffset;
                            final boolean z14 = z2;
                            final Alignment.Horizontal horizontal4 = horizontal;
                            final Alignment.Vertical vertical4 = vertical;
                            final boolean z15 = z;
                            final LazyListState lazyListState2 = LazyListState.this;
                            final int i15 = i6;
                            LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6271offsetNN6EwU, z14, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal4, vertical4, z15, i15, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                                final /* synthetic */ int $afterContentPadding;
                                final /* synthetic */ int $beforeContentPadding;
                                final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                                final /* synthetic */ boolean $isVertical;
                                final /* synthetic */ int $itemsCount;
                                final /* synthetic */ boolean $reverseLayout;
                                final /* synthetic */ int $spaceBetweenItems;
                                final /* synthetic */ LazyListState $state;
                                final /* synthetic */ LazyLayoutMeasureScope $this_null;
                                final /* synthetic */ Alignment.Vertical $verticalAlignment;
                                final /* synthetic */ long $visualItemOffset;

                                {
                                    this.$isVertical = z14;
                                    this.$this_null = lazyLayoutMeasureScope;
                                    this.$itemsCount = itemCount;
                                    this.$spaceBetweenItems = i13;
                                    this.$horizontalAlignment = horizontal4;
                                    this.$verticalAlignment = vertical4;
                                    this.$reverseLayout = z15;
                                    this.$beforeContentPadding = i15;
                                    this.$afterContentPadding = i12;
                                    this.$visualItemOffset = j2;
                                    this.$state = lazyListState2;
                                }

                                @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                                public LazyListMeasuredItem mo784createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                                    return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator$foundation_release(), constraints, null);
                                }
                            };
                            Snapshot.Companion companion = Snapshot.INSTANCE;
                            LazyListState lazyListState3 = LazyListState.this;
                            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                            try {
                                int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyListState3.getFirstVisibleItemIndex());
                                int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                                Unit unit = Unit.INSTANCE;
                                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyListState.this.getPinnedItems(), LazyListState.this.getBeyondBoundsInfo());
                                if (lazyLayoutMeasureScope.isLookingAhead() || !z11) {
                                    scrollToBeConsumed = LazyListState.this.getScrollToBeConsumed();
                                } else {
                                    scrollToBeConsumed = LazyListState.this.getScrollDeltaBetweenPasses$foundation_release();
                                }
                                float f = scrollToBeConsumed;
                                if (z3) {
                                    emptyList = invoke.getHeaderIndexes();
                                } else {
                                    emptyList = CollectionsKt.emptyList();
                                }
                                LazyListMeasureResult m788measureLazyListx0Ok8Vo = LazyListMeasureKt.m788measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6271offsetNN6EwU, z2, emptyList, vertical2, horizontal2, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z11, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m799getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                    }

                                    public final MeasureResult invoke(int i16, int i17, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                        return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i16 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i17 + i9), MapsKt.emptyMap(), function1);
                                    }
                                });
                                LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m788measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                return m788measureLazyListx0Ok8Vo;
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
                z6 = true;
                boolean changed2 = z6 | z10 | composer.changed(graphicsContext);
                if (((i3 & 896) ^ 384) <= 256) {
                }
                if ((i3 & 384) != 256) {
                }
                z7 = true;
                z8 = changed2 | z7;
                rememberedValue = composer.rememberedValue();
                if (!z8) {
                }
                rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return m783invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final LazyListMeasureResult m783invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                        int i4;
                        int i5;
                        int i6;
                        float spacing;
                        int m6252getMaxWidthimpl;
                        long IntOffset;
                        float scrollToBeConsumed;
                        List<Integer> emptyList;
                        ObservableScopeInvalidator.m855attachToScopeimpl(LazyListState.this.m798getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                        boolean z11 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                        CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                        if (z2) {
                            i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        if (z2) {
                            i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                        int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                        final int i9 = i7 + i8;
                        final int i10 = i4 + i5;
                        boolean z12 = z2;
                        int i11 = z12 ? i9 : i10;
                        if (z12 && !z) {
                            i6 = i7;
                        } else if (z12 && z) {
                            i6 = i8;
                        } else {
                            i6 = (z12 || z) ? i5 : i4;
                        }
                        final int i12 = i11 - i6;
                        final long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                        final LazyListItemProvider invoke = function0.invoke();
                        invoke.getItemScope().setMaxSize(Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU), Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU));
                        if (z2) {
                            Arrangement.Vertical vertical3 = vertical2;
                            if (vertical3 == null) {
                                throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                            }
                            spacing = vertical3.getSpacing();
                        } else {
                            Arrangement.Horizontal horizontal3 = horizontal2;
                            if (horizontal3 == null) {
                                throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                            }
                            spacing = horizontal3.getSpacing();
                        }
                        final int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(spacing);
                        final int itemCount = invoke.getItemCount();
                        if (z2) {
                            m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                        } else {
                            m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                        }
                        int i14 = m6252getMaxWidthimpl;
                        if (!z || i14 > 0) {
                            IntOffset = IntOffsetKt.IntOffset(i4, i7);
                        } else {
                            boolean z13 = z2;
                            if (!z13) {
                                i4 += i14;
                            }
                            if (z13) {
                                i7 += i14;
                            }
                            IntOffset = IntOffsetKt.IntOffset(i4, i7);
                        }
                        final long j2 = IntOffset;
                        final boolean z14 = z2;
                        final Alignment.Horizontal horizontal4 = horizontal;
                        final Alignment.Vertical vertical4 = vertical;
                        final boolean z15 = z;
                        final LazyListState lazyListState2 = LazyListState.this;
                        final int i15 = i6;
                        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6271offsetNN6EwU, z14, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal4, vertical4, z15, i15, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                            final /* synthetic */ int $afterContentPadding;
                            final /* synthetic */ int $beforeContentPadding;
                            final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                            final /* synthetic */ boolean $isVertical;
                            final /* synthetic */ int $itemsCount;
                            final /* synthetic */ boolean $reverseLayout;
                            final /* synthetic */ int $spaceBetweenItems;
                            final /* synthetic */ LazyListState $state;
                            final /* synthetic */ LazyLayoutMeasureScope $this_null;
                            final /* synthetic */ Alignment.Vertical $verticalAlignment;
                            final /* synthetic */ long $visualItemOffset;

                            {
                                this.$isVertical = z14;
                                this.$this_null = lazyLayoutMeasureScope;
                                this.$itemsCount = itemCount;
                                this.$spaceBetweenItems = i13;
                                this.$horizontalAlignment = horizontal4;
                                this.$verticalAlignment = vertical4;
                                this.$reverseLayout = z15;
                                this.$beforeContentPadding = i15;
                                this.$afterContentPadding = i12;
                                this.$visualItemOffset = j2;
                                this.$state = lazyListState2;
                            }

                            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                            /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                            public LazyListMeasuredItem mo784createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                                return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator$foundation_release(), constraints, null);
                            }
                        };
                        Snapshot.Companion companion = Snapshot.INSTANCE;
                        LazyListState lazyListState3 = LazyListState.this;
                        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                        try {
                            int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyListState3.getFirstVisibleItemIndex());
                            int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                            Unit unit = Unit.INSTANCE;
                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyListState.this.getPinnedItems(), LazyListState.this.getBeyondBoundsInfo());
                            if (lazyLayoutMeasureScope.isLookingAhead() || !z11) {
                                scrollToBeConsumed = LazyListState.this.getScrollToBeConsumed();
                            } else {
                                scrollToBeConsumed = LazyListState.this.getScrollDeltaBetweenPasses$foundation_release();
                            }
                            float f = scrollToBeConsumed;
                            if (z3) {
                                emptyList = invoke.getHeaderIndexes();
                            } else {
                                emptyList = CollectionsKt.emptyList();
                            }
                            LazyListMeasureResult m788measureLazyListx0Ok8Vo = LazyListMeasureKt.m788measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6271offsetNN6EwU, z2, emptyList, vertical2, horizontal2, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z11, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m799getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                public final MeasureResult invoke(int i16, int i17, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i16 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i17 + i9), MapsKt.emptyMap(), function1);
                                }
                            });
                            LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m788measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                            return m788measureLazyListx0Ok8Vo;
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
            z5 = true;
            boolean z102 = z9 | z5;
            if (((1879048192 & i2) ^ 805306368) <= 536870912) {
            }
            if ((i2 & 805306368) != 536870912) {
            }
            z6 = true;
            boolean changed22 = z6 | z102 | composer.changed(graphicsContext);
            if (((i3 & 896) ^ 384) <= 256) {
            }
            if ((i3 & 384) != 256) {
            }
            z7 = true;
            z8 = changed22 | z7;
            rememberedValue = composer.rememberedValue();
            if (!z8) {
            }
            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m783invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m783invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i4;
                    int i5;
                    int i6;
                    float spacing;
                    int m6252getMaxWidthimpl;
                    long IntOffset;
                    float scrollToBeConsumed;
                    List<Integer> emptyList;
                    ObservableScopeInvalidator.m855attachToScopeimpl(LazyListState.this.m798getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    boolean z11 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                    CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z2) {
                        i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                    int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                    final int i9 = i7 + i8;
                    final int i10 = i4 + i5;
                    boolean z12 = z2;
                    int i11 = z12 ? i9 : i10;
                    if (z12 && !z) {
                        i6 = i7;
                    } else if (z12 && z) {
                        i6 = i8;
                    } else {
                        i6 = (z12 || z) ? i5 : i4;
                    }
                    final int i12 = i11 - i6;
                    final long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                    final LazyListItemProvider invoke = function0.invoke();
                    invoke.getItemScope().setMaxSize(Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU), Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU));
                    if (z2) {
                        Arrangement.Vertical vertical3 = vertical2;
                        if (vertical3 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        spacing = vertical3.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal3 = horizontal2;
                        if (horizontal3 == null) {
                            throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                        }
                        spacing = horizontal3.getSpacing();
                    }
                    final int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(spacing);
                    final int itemCount = invoke.getItemCount();
                    if (z2) {
                        m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                    } else {
                        m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                    }
                    int i14 = m6252getMaxWidthimpl;
                    if (!z || i14 > 0) {
                        IntOffset = IntOffsetKt.IntOffset(i4, i7);
                    } else {
                        boolean z13 = z2;
                        if (!z13) {
                            i4 += i14;
                        }
                        if (z13) {
                            i7 += i14;
                        }
                        IntOffset = IntOffsetKt.IntOffset(i4, i7);
                    }
                    final long j2 = IntOffset;
                    final boolean z14 = z2;
                    final Alignment.Horizontal horizontal4 = horizontal;
                    final Alignment.Vertical vertical4 = vertical;
                    final boolean z15 = z;
                    final LazyListState lazyListState2 = LazyListState.this;
                    final int i15 = i6;
                    LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6271offsetNN6EwU, z14, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal4, vertical4, z15, i15, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ int $itemsCount;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ int $spaceBetweenItems;
                        final /* synthetic */ LazyListState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ Alignment.Vertical $verticalAlignment;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$isVertical = z14;
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$itemsCount = itemCount;
                            this.$spaceBetweenItems = i13;
                            this.$horizontalAlignment = horizontal4;
                            this.$verticalAlignment = vertical4;
                            this.$reverseLayout = z15;
                            this.$beforeContentPadding = i15;
                            this.$afterContentPadding = i12;
                            this.$visualItemOffset = j2;
                            this.$state = lazyListState2;
                        }

                        @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                        /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                        public LazyListMeasuredItem mo784createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                            return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator$foundation_release(), constraints, null);
                        }
                    };
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyListState lazyListState3 = LazyListState.this;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyListState3.getFirstVisibleItemIndex());
                        int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                        Unit unit = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyListState.this.getPinnedItems(), LazyListState.this.getBeyondBoundsInfo());
                        if (lazyLayoutMeasureScope.isLookingAhead() || !z11) {
                            scrollToBeConsumed = LazyListState.this.getScrollToBeConsumed();
                        } else {
                            scrollToBeConsumed = LazyListState.this.getScrollDeltaBetweenPasses$foundation_release();
                        }
                        float f = scrollToBeConsumed;
                        if (z3) {
                            emptyList = invoke.getHeaderIndexes();
                        } else {
                            emptyList = CollectionsKt.emptyList();
                        }
                        LazyListMeasureResult m788measureLazyListx0Ok8Vo = LazyListMeasureKt.m788measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6271offsetNN6EwU, z2, emptyList, vertical2, horizontal2, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z11, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m799getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                            }

                            public final MeasureResult invoke(int i16, int i17, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i16 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i17 + i9), MapsKt.emptyMap(), function1);
                            }
                        });
                        LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m788measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                        return m788measureLazyListx0Ok8Vo;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2222 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function2222;
        }
        z4 = true;
        boolean z92 = z4 | ((((i2 & 896) ^ 384) <= 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) <= 2048 && composer.changed(z)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) <= 16384 && composer.changed(z2)) || (i2 & 24576) == 16384) | ((((3670016 & i2) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i2 & 1572864) == 1048576) | ((((29360128 & i2) ^ 12582912) <= 8388608 && composer.changed(vertical)) || (i2 & 12582912) == 8388608);
        if (((234881024 & i2) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i2) != 67108864) {
        }
        z5 = true;
        boolean z1022 = z92 | z5;
        if (((1879048192 & i2) ^ 805306368) <= 536870912) {
        }
        if ((i2 & 805306368) != 536870912) {
        }
        z6 = true;
        boolean changed222 = z6 | z1022 | composer.changed(graphicsContext);
        if (((i3 & 896) ^ 384) <= 256) {
        }
        if ((i3 & 384) != 256) {
        }
        z7 = true;
        z8 = changed222 | z7;
        rememberedValue = composer.rememberedValue();
        if (!z8) {
        }
        rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                return m783invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
            }

            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final LazyListMeasureResult m783invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                int i4;
                int i5;
                int i6;
                float spacing;
                int m6252getMaxWidthimpl;
                long IntOffset;
                float scrollToBeConsumed;
                List<Integer> emptyList;
                ObservableScopeInvalidator.m855attachToScopeimpl(LazyListState.this.m798getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                boolean z11 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                if (z2) {
                    i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                if (z2) {
                    i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                final int i9 = i7 + i8;
                final int i10 = i4 + i5;
                boolean z12 = z2;
                int i11 = z12 ? i9 : i10;
                if (z12 && !z) {
                    i6 = i7;
                } else if (z12 && z) {
                    i6 = i8;
                } else {
                    i6 = (z12 || z) ? i5 : i4;
                }
                final int i12 = i11 - i6;
                final long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                final LazyListItemProvider invoke = function0.invoke();
                invoke.getItemScope().setMaxSize(Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU), Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU));
                if (z2) {
                    Arrangement.Vertical vertical3 = vertical2;
                    if (vertical3 == null) {
                        throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                    }
                    spacing = vertical3.getSpacing();
                } else {
                    Arrangement.Horizontal horizontal3 = horizontal2;
                    if (horizontal3 == null) {
                        throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                    }
                    spacing = horizontal3.getSpacing();
                }
                final int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(spacing);
                final int itemCount = invoke.getItemCount();
                if (z2) {
                    m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                } else {
                    m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                }
                int i14 = m6252getMaxWidthimpl;
                if (!z || i14 > 0) {
                    IntOffset = IntOffsetKt.IntOffset(i4, i7);
                } else {
                    boolean z13 = z2;
                    if (!z13) {
                        i4 += i14;
                    }
                    if (z13) {
                        i7 += i14;
                    }
                    IntOffset = IntOffsetKt.IntOffset(i4, i7);
                }
                final long j2 = IntOffset;
                final boolean z14 = z2;
                final Alignment.Horizontal horizontal4 = horizontal;
                final Alignment.Vertical vertical4 = vertical;
                final boolean z15 = z;
                final LazyListState lazyListState2 = LazyListState.this;
                final int i15 = i6;
                LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6271offsetNN6EwU, z14, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal4, vertical4, z15, i15, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                    final /* synthetic */ int $afterContentPadding;
                    final /* synthetic */ int $beforeContentPadding;
                    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                    final /* synthetic */ boolean $isVertical;
                    final /* synthetic */ int $itemsCount;
                    final /* synthetic */ boolean $reverseLayout;
                    final /* synthetic */ int $spaceBetweenItems;
                    final /* synthetic */ LazyListState $state;
                    final /* synthetic */ LazyLayoutMeasureScope $this_null;
                    final /* synthetic */ Alignment.Vertical $verticalAlignment;
                    final /* synthetic */ long $visualItemOffset;

                    {
                        this.$isVertical = z14;
                        this.$this_null = lazyLayoutMeasureScope;
                        this.$itemsCount = itemCount;
                        this.$spaceBetweenItems = i13;
                        this.$horizontalAlignment = horizontal4;
                        this.$verticalAlignment = vertical4;
                        this.$reverseLayout = z15;
                        this.$beforeContentPadding = i15;
                        this.$afterContentPadding = i12;
                        this.$visualItemOffset = j2;
                        this.$state = lazyListState2;
                    }

                    @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                    /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                    public LazyListMeasuredItem mo784createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                        return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator$foundation_release(), constraints, null);
                    }
                };
                Snapshot.Companion companion = Snapshot.INSTANCE;
                LazyListState lazyListState3 = LazyListState.this;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyListState3.getFirstVisibleItemIndex());
                    int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                    Unit unit = Unit.INSTANCE;
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyListState.this.getPinnedItems(), LazyListState.this.getBeyondBoundsInfo());
                    if (lazyLayoutMeasureScope.isLookingAhead() || !z11) {
                        scrollToBeConsumed = LazyListState.this.getScrollToBeConsumed();
                    } else {
                        scrollToBeConsumed = LazyListState.this.getScrollDeltaBetweenPasses$foundation_release();
                    }
                    float f = scrollToBeConsumed;
                    if (z3) {
                        emptyList = invoke.getHeaderIndexes();
                    } else {
                        emptyList = CollectionsKt.emptyList();
                    }
                    LazyListMeasureResult m788measureLazyListx0Ok8Vo = LazyListMeasureKt.m788measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6271offsetNN6EwU, z2, emptyList, vertical2, horizontal2, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z11, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m799getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                        }

                        public final MeasureResult invoke(int i16, int i17, Function1<? super Placeable.PlacementScope, Unit> function1) {
                            return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i16 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i17 + i9), MapsKt.emptyMap(), function1);
                        }
                    });
                    LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m788measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                    return m788measureLazyListx0Ok8Vo;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
        };
        composer.updateRememberedValue(rememberedValue);
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22222 = (Function2) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function22222;
    }
}
