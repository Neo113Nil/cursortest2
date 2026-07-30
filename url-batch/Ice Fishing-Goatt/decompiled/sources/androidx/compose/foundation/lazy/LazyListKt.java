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
    /* JADX WARN: Removed duplicated region for block: B:100:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(final Modifier modifier, LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final FlingBehavior flingBehavior, final boolean z3, int i, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        PaddingValues paddingValues2;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Object rememberedValue;
        final Alignment.Vertical vertical3;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Horizontal horizontal4;
        final Arrangement.Vertical vertical4;
        final int i17;
        ScopeUpdateScope endRestartGroup;
        final LazyListState lazyListState2 = lazyListState;
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
            i5 |= startRestartGroup.changed(lazyListState2) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            paddingValues2 = paddingValues;
            i5 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z4 = z;
                i5 |= startRestartGroup.changed(z4) ? 2048 : 1024;
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
                        i7 = i;
                    } else {
                        i7 = i;
                        if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(i7) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i4 & 256;
                    if (i8 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= startRestartGroup.changed(horizontal) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i4 & 512;
                    if (i9 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i10 = i9;
                        i5 |= startRestartGroup.changed(vertical) ? 536870912 : 268435456;
                        i11 = i4 & 1024;
                        if (i11 != 0) {
                            i13 = i3 | 6;
                            i12 = i11;
                        } else if ((i3 & 6) == 0) {
                            i12 = i11;
                            i13 = i3 | (startRestartGroup.changed(vertical2) ? 4 : 2);
                        } else {
                            i12 = i11;
                            i13 = i3;
                        }
                        i14 = i4 & 2048;
                        if (i14 != 0) {
                            i13 |= 48;
                            i15 = i14;
                        } else if ((i3 & 48) == 0) {
                            i15 = i14;
                            i13 |= startRestartGroup.changed(horizontal2) ? 32 : 16;
                        } else {
                            i15 = i14;
                        }
                        i16 = i13;
                        if ((i4 & 4096) != 0) {
                            i16 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i16 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                        }
                        if ((306783379 & i5) == 306783378 || (i16 & 147) != 146 || !startRestartGroup.getSkipping()) {
                            int i18 = i6 != 0 ? 0 : i7;
                            Alignment.Horizontal horizontal5 = i8 != 0 ? null : horizontal;
                            Arrangement.Vertical vertical5 = i10 != 0 ? null : vertical;
                            Alignment.Vertical vertical6 = i12 != 0 ? null : vertical2;
                            Arrangement.Horizontal horizontal6 = i15 == 0 ? horizontal2 : null;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(620764179, i5, i16, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                            }
                            int i19 = (i5 >> 3) & 14;
                            Function0<LazyListItemProvider> rememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState2, function1, startRestartGroup, i19 | ((i16 >> 3) & 112));
                            int i20 = i5 >> 9;
                            LazyLayoutSemanticState rememberLazyListSemanticState = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState2, z2, startRestartGroup, i19 | (i20 & 112));
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
                            int i21 = i5 & 112;
                            int i22 = i5 & 7168;
                            int i23 = i5 >> 6;
                            int i24 = i16 << 21;
                            int i25 = (i5 & 65520) | (i23 & 458752) | (i23 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | (i5 & 1879048192);
                            int i26 = i5;
                            Alignment.Horizontal horizontal7 = horizontal5;
                            boolean z5 = z4;
                            Alignment.Vertical vertical7 = vertical6;
                            PaddingValues paddingValues3 = paddingValues2;
                            Arrangement.Vertical vertical8 = vertical5;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda, lazyListState, paddingValues3, z5, z2, i18, horizontal7, vertical7, horizontal6, vertical8, coroutineScope, graphicsContext, !((Boolean) consume2).booleanValue(), startRestartGroup, i25, 0);
                            lazyListState2 = lazyListState;
                            Orientation orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
                            Modifier lazyLayoutSemantics = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState2.getRemeasurementModifier()).then(lazyListState2.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda, rememberLazyListSemanticState, orientation, z3, z, startRestartGroup, (i23 & 57344) | ((i26 << 6) & 458752));
                            LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState2, i18, startRestartGroup, i19 | ((i26 >> 18) & 112));
                            LazyLayoutBeyondBoundsInfo beyondBoundsInfo = lazyListState2.getBeyondBoundsInfo();
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume3 = startRestartGroup.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier scrollingContainer = ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics, rememberLazyListBeyondBoundsState, beyondBoundsInfo, z, (LayoutDirection) consume3, orientation, z3, startRestartGroup, (MutableVector.$stable << 6) | i22 | (i26 & 3670016)).then(lazyListState2.getItemAnimator$foundation_release().getModifier()), lazyListState2, orientation, z3, z, flingBehavior, lazyListState2.getInternalInteractionSource(), null, startRestartGroup, i21 | (i20 & 7168) | (57344 & (i26 << 3)) | (i26 & 458752), 64);
                            startRestartGroup = startRestartGroup;
                            LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda, scrollingContainer, lazyListState2.getPrefetchState(), rememberLazyListMeasurePolicy, startRestartGroup, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            vertical3 = vertical7;
                            horizontal3 = horizontal7;
                            horizontal4 = horizontal6;
                            vertical4 = vertical8;
                            i17 = i18;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            horizontal3 = horizontal;
                            vertical4 = vertical;
                            vertical3 = vertical2;
                            horizontal4 = horizontal2;
                            i17 = i7;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
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

                                public final void invoke(Composer composer2, int i27) {
                                    LazyListKt.LazyList(Modifier.this, lazyListState2, paddingValues, z, z2, flingBehavior, z3, i17, horizontal3, vertical4, vertical3, horizontal4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i9;
                    i11 = i4 & 1024;
                    if (i11 != 0) {
                    }
                    i14 = i4 & 2048;
                    if (i14 != 0) {
                    }
                    i16 = i13;
                    if ((i4 & 4096) != 0) {
                    }
                    if ((306783379 & i5) == 306783378) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    Arrangement.Horizontal horizontal62 = i15 == 0 ? horizontal2 : null;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i192 = (i5 >> 3) & 14;
                    Function0<LazyListItemProvider> rememberLazyListItemProviderLambda2 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState2, function1, startRestartGroup, i192 | ((i16 >> 3) & 112));
                    int i202 = i5 >> 9;
                    LazyLayoutSemanticState rememberLazyListSemanticState2 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState2, z2, startRestartGroup, i192 | (i202 & 112));
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
                    int i212 = i5 & 112;
                    int i222 = i5 & 7168;
                    int i232 = i5 >> 6;
                    int i242 = i16 << 21;
                    int i252 = (i5 & 65520) | (i232 & 458752) | (i232 & 3670016) | (i242 & 29360128) | (i242 & 234881024) | (i5 & 1879048192);
                    int i262 = i5;
                    Alignment.Horizontal horizontal72 = horizontal5;
                    boolean z52 = z4;
                    Alignment.Vertical vertical72 = vertical6;
                    PaddingValues paddingValues32 = paddingValues2;
                    Arrangement.Vertical vertical82 = vertical5;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda2, lazyListState, paddingValues32, z52, z2, i18, horizontal72, vertical72, horizontal62, vertical82, coroutineScope2, graphicsContext2, !((Boolean) consume22).booleanValue(), startRestartGroup, i252, 0);
                    lazyListState2 = lazyListState;
                    Orientation orientation2 = z2 ? Orientation.Vertical : Orientation.Horizontal;
                    Modifier lazyLayoutSemantics2 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState2.getRemeasurementModifier()).then(lazyListState2.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda2, rememberLazyListSemanticState2, orientation2, z3, z, startRestartGroup, (i232 & 57344) | ((i262 << 6) & 458752));
                    LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState2 = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState2, i18, startRestartGroup, i192 | ((i262 >> 18) & 112));
                    LazyLayoutBeyondBoundsInfo beyondBoundsInfo2 = lazyListState2.getBeyondBoundsInfo();
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(localLayoutDirection2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier scrollingContainer2 = ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics2, rememberLazyListBeyondBoundsState2, beyondBoundsInfo2, z, (LayoutDirection) consume32, orientation2, z3, startRestartGroup, (MutableVector.$stable << 6) | i222 | (i262 & 3670016)).then(lazyListState2.getItemAnimator$foundation_release().getModifier()), lazyListState2, orientation2, z3, z, flingBehavior, lazyListState2.getInternalInteractionSource(), null, startRestartGroup, i212 | (i202 & 7168) | (57344 & (i262 << 3)) | (i262 & 458752), 64);
                    startRestartGroup = startRestartGroup;
                    LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda2, scrollingContainer2, lazyListState2.getPrefetchState(), rememberLazyListMeasurePolicy2, startRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    vertical3 = vertical72;
                    horizontal3 = horizontal72;
                    horizontal4 = horizontal62;
                    vertical4 = vertical82;
                    i17 = i18;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i4 & 64) == 0) {
                }
                i6 = i4 & 128;
                if (i6 == 0) {
                }
                i8 = i4 & 256;
                if (i8 == 0) {
                }
                i9 = i4 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i4 & 1024;
                if (i11 != 0) {
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                }
                i16 = i13;
                if ((i4 & 4096) != 0) {
                }
                if ((306783379 & i5) == 306783378) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                Arrangement.Horizontal horizontal622 = i15 == 0 ? horizontal2 : null;
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1922 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> rememberLazyListItemProviderLambda22 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState2, function1, startRestartGroup, i1922 | ((i16 >> 3) & 112));
                int i2022 = i5 >> 9;
                LazyLayoutSemanticState rememberLazyListSemanticState22 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState2, z2, startRestartGroup, i1922 | (i2022 & 112));
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
                int i2122 = i5 & 112;
                int i2222 = i5 & 7168;
                int i2322 = i5 >> 6;
                int i2422 = i16 << 21;
                int i2522 = (i5 & 65520) | (i2322 & 458752) | (i2322 & 3670016) | (i2422 & 29360128) | (i2422 & 234881024) | (i5 & 1879048192);
                int i2622 = i5;
                Alignment.Horizontal horizontal722 = horizontal5;
                boolean z522 = z4;
                Alignment.Vertical vertical722 = vertical6;
                PaddingValues paddingValues322 = paddingValues2;
                Arrangement.Vertical vertical822 = vertical5;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy22 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda22, lazyListState, paddingValues322, z522, z2, i18, horizontal722, vertical722, horizontal622, vertical822, coroutineScope22, graphicsContext22, !((Boolean) consume222).booleanValue(), startRestartGroup, i2522, 0);
                lazyListState2 = lazyListState;
                Orientation orientation22 = z2 ? Orientation.Vertical : Orientation.Horizontal;
                Modifier lazyLayoutSemantics22 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState2.getRemeasurementModifier()).then(lazyListState2.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda22, rememberLazyListSemanticState22, orientation22, z3, z, startRestartGroup, (i2322 & 57344) | ((i2622 << 6) & 458752));
                LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState22 = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState2, i18, startRestartGroup, i1922 | ((i2622 >> 18) & 112));
                LazyLayoutBeyondBoundsInfo beyondBoundsInfo22 = lazyListState2.getBeyondBoundsInfo();
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(localLayoutDirection22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier scrollingContainer22 = ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics22, rememberLazyListBeyondBoundsState22, beyondBoundsInfo22, z, (LayoutDirection) consume322, orientation22, z3, startRestartGroup, (MutableVector.$stable << 6) | i2222 | (i2622 & 3670016)).then(lazyListState2.getItemAnimator$foundation_release().getModifier()), lazyListState2, orientation22, z3, z, flingBehavior, lazyListState2.getInternalInteractionSource(), null, startRestartGroup, i2122 | (i2022 & 7168) | (57344 & (i2622 << 3)) | (i2622 & 458752), 64);
                startRestartGroup = startRestartGroup;
                LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda22, scrollingContainer22, lazyListState2.getPrefetchState(), rememberLazyListMeasurePolicy22, startRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                vertical3 = vertical722;
                horizontal3 = horizontal722;
                horizontal4 = horizontal622;
                vertical4 = vertical822;
                i17 = i18;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) == 0) {
            }
            i6 = i4 & 128;
            if (i6 == 0) {
            }
            i8 = i4 & 256;
            if (i8 == 0) {
            }
            i9 = i4 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i4 & 1024;
            if (i11 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            i16 = i13;
            if ((i4 & 4096) != 0) {
            }
            if ((306783379 & i5) == 306783378) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            Arrangement.Horizontal horizontal6222 = i15 == 0 ? horizontal2 : null;
            if (ComposerKt.isTraceInProgress()) {
            }
            int i19222 = (i5 >> 3) & 14;
            Function0<LazyListItemProvider> rememberLazyListItemProviderLambda222 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState2, function1, startRestartGroup, i19222 | ((i16 >> 3) & 112));
            int i20222 = i5 >> 9;
            LazyLayoutSemanticState rememberLazyListSemanticState222 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState2, z2, startRestartGroup, i19222 | (i20222 & 112));
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
            int i21222 = i5 & 112;
            int i22222 = i5 & 7168;
            int i23222 = i5 >> 6;
            int i24222 = i16 << 21;
            int i25222 = (i5 & 65520) | (i23222 & 458752) | (i23222 & 3670016) | (i24222 & 29360128) | (i24222 & 234881024) | (i5 & 1879048192);
            int i26222 = i5;
            Alignment.Horizontal horizontal7222 = horizontal5;
            boolean z5222 = z4;
            Alignment.Vertical vertical7222 = vertical6;
            PaddingValues paddingValues3222 = paddingValues2;
            Arrangement.Vertical vertical8222 = vertical5;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy222 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda222, lazyListState, paddingValues3222, z5222, z2, i18, horizontal7222, vertical7222, horizontal6222, vertical8222, coroutineScope222, graphicsContext222, !((Boolean) consume2222).booleanValue(), startRestartGroup, i25222, 0);
            lazyListState2 = lazyListState;
            Orientation orientation222 = z2 ? Orientation.Vertical : Orientation.Horizontal;
            Modifier lazyLayoutSemantics222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState2.getRemeasurementModifier()).then(lazyListState2.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda222, rememberLazyListSemanticState222, orientation222, z3, z, startRestartGroup, (i23222 & 57344) | ((i26222 << 6) & 458752));
            LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState222 = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState2, i18, startRestartGroup, i19222 | ((i26222 >> 18) & 112));
            LazyLayoutBeyondBoundsInfo beyondBoundsInfo222 = lazyListState2.getBeyondBoundsInfo();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(localLayoutDirection222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier scrollingContainer222 = ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics222, rememberLazyListBeyondBoundsState222, beyondBoundsInfo222, z, (LayoutDirection) consume3222, orientation222, z3, startRestartGroup, (MutableVector.$stable << 6) | i22222 | (i26222 & 3670016)).then(lazyListState2.getItemAnimator$foundation_release().getModifier()), lazyListState2, orientation222, z3, z, flingBehavior, lazyListState2.getInternalInteractionSource(), null, startRestartGroup, i21222 | (i20222 & 7168) | (57344 & (i26222 << 3)) | (i26222 & 458752), 64);
            startRestartGroup = startRestartGroup;
            LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda222, scrollingContainer222, lazyListState2.getPrefetchState(), rememberLazyListMeasurePolicy222, startRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            vertical3 = vertical7222;
            horizontal3 = horizontal7222;
            horizontal4 = horizontal6222;
            vertical4 = vertical8222;
            i17 = i18;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        if ((i4 & 8) == 0) {
        }
        z4 = z;
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) == 0) {
        }
        i6 = i4 & 128;
        if (i6 == 0) {
        }
        i8 = i4 & 256;
        if (i8 == 0) {
        }
        i9 = i4 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i4 & 1024;
        if (i11 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        i16 = i13;
        if ((i4 & 4096) != 0) {
        }
        if ((306783379 & i5) == 306783378) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        Arrangement.Horizontal horizontal62222 = i15 == 0 ? horizontal2 : null;
        if (ComposerKt.isTraceInProgress()) {
        }
        int i192222 = (i5 >> 3) & 14;
        Function0<LazyListItemProvider> rememberLazyListItemProviderLambda2222 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState2, function1, startRestartGroup, i192222 | ((i16 >> 3) & 112));
        int i202222 = i5 >> 9;
        LazyLayoutSemanticState rememberLazyListSemanticState2222 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState2, z2, startRestartGroup, i192222 | (i202222 & 112));
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
        Object consume4222 = startRestartGroup.consume(localGraphicsContext2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        GraphicsContext graphicsContext2222 = (GraphicsContext) consume4222;
        CompositionLocal<Boolean> localScrollCaptureInProgress2222 = CompositionLocalsKt.getLocalScrollCaptureInProgress();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localScrollCaptureInProgress2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i212222 = i5 & 112;
        int i222222 = i5 & 7168;
        int i232222 = i5 >> 6;
        int i242222 = i16 << 21;
        int i252222 = (i5 & 65520) | (i232222 & 458752) | (i232222 & 3670016) | (i242222 & 29360128) | (i242222 & 234881024) | (i5 & 1879048192);
        int i262222 = i5;
        Alignment.Horizontal horizontal72222 = horizontal5;
        boolean z52222 = z4;
        Alignment.Vertical vertical72222 = vertical6;
        PaddingValues paddingValues32222 = paddingValues2;
        Arrangement.Vertical vertical82222 = vertical5;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy2222 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda2222, lazyListState, paddingValues32222, z52222, z2, i18, horizontal72222, vertical72222, horizontal62222, vertical82222, coroutineScope2222, graphicsContext2222, !((Boolean) consume22222).booleanValue(), startRestartGroup, i252222, 0);
        lazyListState2 = lazyListState;
        Orientation orientation2222 = z2 ? Orientation.Vertical : Orientation.Horizontal;
        Modifier lazyLayoutSemantics2222 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState2.getRemeasurementModifier()).then(lazyListState2.getAwaitLayoutModifier()), rememberLazyListItemProviderLambda2222, rememberLazyListSemanticState2222, orientation2222, z3, z, startRestartGroup, (i232222 & 57344) | ((i262222 << 6) & 458752));
        LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState2222 = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState2, i18, startRestartGroup, i192222 | ((i262222 >> 18) & 112));
        LazyLayoutBeyondBoundsInfo beyondBoundsInfo2222 = lazyListState2.getBeyondBoundsInfo();
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(localLayoutDirection2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier scrollingContainer2222 = ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(lazyLayoutSemantics2222, rememberLazyListBeyondBoundsState2222, beyondBoundsInfo2222, z, (LayoutDirection) consume32222, orientation2222, z3, startRestartGroup, (MutableVector.$stable << 6) | i222222 | (i262222 & 3670016)).then(lazyListState2.getItemAnimator$foundation_release().getModifier()), lazyListState2, orientation2222, z3, z, flingBehavior, lazyListState2.getInternalInteractionSource(), null, startRestartGroup, i212222 | (i202222 & 7168) | (57344 & (i262222 << 3)) | (i262222 & 458752), 64);
        startRestartGroup = startRestartGroup;
        LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda2222, scrollingContainer2222, lazyListState2.getPrefetchState(), rememberLazyListMeasurePolicy2222, startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        vertical3 = vertical72222;
        horizontal3 = horizontal72222;
        horizontal4 = horizontal62222;
        vertical4 = vertical82222;
        i17 = i18;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r34.changed(r4) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r34.changed(r9) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r34.changed(r12) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        if (r34.changed(r13) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
    
        if (r34.changed(r14) == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final Function0<? extends LazyListItemProvider> function0, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, boolean z2, final int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, final boolean z3, Composer composer, int i2, int i3) {
        boolean z4;
        boolean z5;
        Alignment.Horizontal horizontal3;
        boolean z6;
        Alignment.Vertical vertical3;
        boolean z7;
        Arrangement.Horizontal horizontal4;
        boolean z8;
        Arrangement.Vertical vertical4;
        boolean z9;
        boolean changed;
        Object rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, 1972347046, "C(rememberLazyListMeasurePolicy)P(7,9,1,8,6!1,4,11,5,12)170@7305L8413:LazyList.kt#428nma");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1972347046, i2, i3, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:170)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 581121742, "CC(remember):LazyList.kt#9igjgp");
        boolean z10 = ((((i2 & 112) ^ 48) > 32 && composer.changed(lazyListState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i2 & 3072) == 2048);
        if (((57344 & i2) ^ 24576) > 16384) {
            z4 = z2;
        } else {
            z4 = z2;
        }
        if ((i2 & 24576) != 16384) {
            z5 = false;
            boolean z11 = z10 | z5;
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
                horizontal3 = horizontal;
            } else {
                horizontal3 = horizontal;
            }
            if ((1572864 & i2) != 1048576) {
                z6 = false;
                boolean z12 = z11 | z6;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                    vertical3 = vertical;
                } else {
                    vertical3 = vertical;
                }
                if ((12582912 & i2) != 8388608) {
                    z7 = false;
                    boolean z13 = z12 | z7;
                    if (((234881024 & i2) ^ 100663296) <= 67108864) {
                        horizontal4 = horizontal2;
                    } else {
                        horizontal4 = horizontal2;
                    }
                    if ((100663296 & i2) != 67108864) {
                        z8 = false;
                        boolean z14 = z13 | z8;
                        if (((1879048192 & i2) ^ 805306368) > 536870912) {
                            vertical4 = vertical2;
                        } else {
                            vertical4 = vertical2;
                        }
                        if ((i2 & 805306368) != 536870912) {
                            z9 = false;
                            changed = z9 | z14 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
                            rememberedValue = composer.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                final Arrangement.Vertical vertical5 = vertical4;
                                final Arrangement.Horizontal horizontal5 = horizontal4;
                                final Alignment.Horizontal horizontal6 = horizontal3;
                                final Alignment.Vertical vertical6 = vertical3;
                                final boolean z15 = z4;
                                rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                        return m775invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                    }

                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final LazyListMeasureResult m775invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                        int i4;
                                        int i5;
                                        final int i6;
                                        float spacing;
                                        int m6218getMaxWidthimpl;
                                        long IntOffset;
                                        float scrollToBeConsumed;
                                        List<Integer> emptyList;
                                        ObservableScopeInvalidator.m847attachToScopeimpl(LazyListState.this.m790getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                        boolean z16 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                                        CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z15 ? Orientation.Vertical : Orientation.Horizontal);
                                        boolean z17 = z15;
                                        PaddingValues paddingValues2 = paddingValues;
                                        if (z17) {
                                            i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                        } else {
                                            i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                                        }
                                        boolean z18 = z15;
                                        PaddingValues paddingValues3 = paddingValues;
                                        if (z18) {
                                            i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                        } else {
                                            i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                                        }
                                        int i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                                        int i8 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                                        final int i9 = i7 + i8;
                                        final int i10 = i4 + i5;
                                        boolean z19 = z15;
                                        int i11 = z19 ? i9 : i10;
                                        if (z19 && !z) {
                                            i6 = i7;
                                        } else if (z19 && z) {
                                            i6 = i8;
                                        } else {
                                            i6 = (z19 || z) ? i5 : i4;
                                        }
                                        final int i12 = i11 - i6;
                                        final long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i10, -i9);
                                        final LazyListItemProvider invoke = function0.invoke();
                                        invoke.getItemScope().setMaxSize(Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU), Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU));
                                        if (z15) {
                                            Arrangement.Vertical vertical7 = vertical5;
                                            if (vertical7 == null) {
                                                throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                                            }
                                            spacing = vertical7.getSpacing();
                                        } else {
                                            Arrangement.Horizontal horizontal7 = horizontal5;
                                            if (horizontal7 == null) {
                                                throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                                            }
                                            spacing = horizontal7.getSpacing();
                                        }
                                        final int i13 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(spacing);
                                        final int itemCount = invoke.getItemCount();
                                        if (z15) {
                                            m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i9;
                                        } else {
                                            m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i10;
                                        }
                                        int i14 = m6218getMaxWidthimpl;
                                        if (!z || i14 > 0) {
                                            IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                        } else {
                                            boolean z20 = z15;
                                            if (!z20) {
                                                i4 += i14;
                                            }
                                            if (z20) {
                                                i7 += i14;
                                            }
                                            IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                        }
                                        final boolean z21 = z15;
                                        final Alignment.Horizontal horizontal8 = horizontal6;
                                        final Alignment.Vertical vertical8 = vertical6;
                                        final boolean z22 = z;
                                        final LazyListState lazyListState2 = LazyListState.this;
                                        final long j2 = IntOffset;
                                        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6237offsetNN6EwU, z21, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal8, vertical8, z22, i6, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
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
                                                this.$isVertical = z21;
                                                this.$this_null = lazyLayoutMeasureScope;
                                                this.$itemsCount = itemCount;
                                                this.$spaceBetweenItems = i13;
                                                this.$horizontalAlignment = horizontal8;
                                                this.$verticalAlignment = vertical8;
                                                this.$reverseLayout = z22;
                                                this.$beforeContentPadding = i6;
                                                this.$afterContentPadding = i12;
                                                this.$visualItemOffset = j2;
                                                this.$state = lazyListState2;
                                            }

                                            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                            /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                                            public LazyListMeasuredItem mo776createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
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
                                            if (lazyLayoutMeasureScope.isLookingAhead() || !z16) {
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
                                            LazyListMeasureResult m780measureLazyListx0Ok8Vo = LazyListMeasureKt.m780measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6237offsetNN6EwU, z15, emptyList, vertical5, horizontal5, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z16, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m791getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                }

                                                public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                                }
                                            });
                                            LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m780measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                            return m780measureLazyListx0Ok8Vo;
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
                        z9 = true;
                        changed = z9 | z14 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
                        rememberedValue = composer.rememberedValue();
                        if (!changed) {
                        }
                        final Arrangement.Vertical vertical52 = vertical4;
                        final Arrangement.Horizontal horizontal52 = horizontal4;
                        final Alignment.Horizontal horizontal62 = horizontal3;
                        final Alignment.Vertical vertical62 = vertical3;
                        final boolean z152 = z4;
                        rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                return m775invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final LazyListMeasureResult m775invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                int i4;
                                int i5;
                                final int i6;
                                float spacing;
                                int m6218getMaxWidthimpl;
                                long IntOffset;
                                float scrollToBeConsumed;
                                List<Integer> emptyList;
                                ObservableScopeInvalidator.m847attachToScopeimpl(LazyListState.this.m790getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                boolean z16 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                                CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z152 ? Orientation.Vertical : Orientation.Horizontal);
                                boolean z17 = z152;
                                PaddingValues paddingValues2 = paddingValues;
                                if (z17) {
                                    i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                } else {
                                    i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                                }
                                boolean z18 = z152;
                                PaddingValues paddingValues3 = paddingValues;
                                if (z18) {
                                    i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                } else {
                                    i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                                }
                                int i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                                int i8 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                                final int i9 = i7 + i8;
                                final int i10 = i4 + i5;
                                boolean z19 = z152;
                                int i11 = z19 ? i9 : i10;
                                if (z19 && !z) {
                                    i6 = i7;
                                } else if (z19 && z) {
                                    i6 = i8;
                                } else {
                                    i6 = (z19 || z) ? i5 : i4;
                                }
                                final int i12 = i11 - i6;
                                final long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i10, -i9);
                                final LazyListItemProvider invoke = function0.invoke();
                                invoke.getItemScope().setMaxSize(Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU), Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU));
                                if (z152) {
                                    Arrangement.Vertical vertical7 = vertical52;
                                    if (vertical7 == null) {
                                        throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                                    }
                                    spacing = vertical7.getSpacing();
                                } else {
                                    Arrangement.Horizontal horizontal7 = horizontal52;
                                    if (horizontal7 == null) {
                                        throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                                    }
                                    spacing = horizontal7.getSpacing();
                                }
                                final int i13 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(spacing);
                                final int itemCount = invoke.getItemCount();
                                if (z152) {
                                    m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i9;
                                } else {
                                    m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i10;
                                }
                                int i14 = m6218getMaxWidthimpl;
                                if (!z || i14 > 0) {
                                    IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                } else {
                                    boolean z20 = z152;
                                    if (!z20) {
                                        i4 += i14;
                                    }
                                    if (z20) {
                                        i7 += i14;
                                    }
                                    IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                }
                                final boolean z21 = z152;
                                final Alignment.Horizontal horizontal8 = horizontal62;
                                final Alignment.Vertical vertical8 = vertical62;
                                final boolean z22 = z;
                                final LazyListState lazyListState2 = LazyListState.this;
                                final long j2 = IntOffset;
                                LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6237offsetNN6EwU, z21, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal8, vertical8, z22, i6, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
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
                                        this.$isVertical = z21;
                                        this.$this_null = lazyLayoutMeasureScope;
                                        this.$itemsCount = itemCount;
                                        this.$spaceBetweenItems = i13;
                                        this.$horizontalAlignment = horizontal8;
                                        this.$verticalAlignment = vertical8;
                                        this.$reverseLayout = z22;
                                        this.$beforeContentPadding = i6;
                                        this.$afterContentPadding = i12;
                                        this.$visualItemOffset = j2;
                                        this.$state = lazyListState2;
                                    }

                                    @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                    /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                                    public LazyListMeasuredItem mo776createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
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
                                    if (lazyLayoutMeasureScope.isLookingAhead() || !z16) {
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
                                    LazyListMeasureResult m780measureLazyListx0Ok8Vo = LazyListMeasureKt.m780measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6237offsetNN6EwU, z152, emptyList, vertical52, horizontal52, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z16, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m791getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                        }

                                        public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                            return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                        }
                                    });
                                    LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m780measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                    return m780measureLazyListx0Ok8Vo;
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
                    z8 = true;
                    boolean z142 = z13 | z8;
                    if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    }
                    if ((i2 & 805306368) != 536870912) {
                    }
                    z9 = true;
                    changed = z9 | z142 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
                    rememberedValue = composer.rememberedValue();
                    if (!changed) {
                    }
                    final Arrangement.Vertical vertical522 = vertical4;
                    final Arrangement.Horizontal horizontal522 = horizontal4;
                    final Alignment.Horizontal horizontal622 = horizontal3;
                    final Alignment.Vertical vertical622 = vertical3;
                    final boolean z1522 = z4;
                    rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                            return m775invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                        }

                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final LazyListMeasureResult m775invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                            int i4;
                            int i5;
                            final int i6;
                            float spacing;
                            int m6218getMaxWidthimpl;
                            long IntOffset;
                            float scrollToBeConsumed;
                            List<Integer> emptyList;
                            ObservableScopeInvalidator.m847attachToScopeimpl(LazyListState.this.m790getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                            boolean z16 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                            CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z1522 ? Orientation.Vertical : Orientation.Horizontal);
                            boolean z17 = z1522;
                            PaddingValues paddingValues2 = paddingValues;
                            if (z17) {
                                i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                            } else {
                                i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                            }
                            boolean z18 = z1522;
                            PaddingValues paddingValues3 = paddingValues;
                            if (z18) {
                                i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                            } else {
                                i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                            }
                            int i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                            int i8 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                            final int i9 = i7 + i8;
                            final int i10 = i4 + i5;
                            boolean z19 = z1522;
                            int i11 = z19 ? i9 : i10;
                            if (z19 && !z) {
                                i6 = i7;
                            } else if (z19 && z) {
                                i6 = i8;
                            } else {
                                i6 = (z19 || z) ? i5 : i4;
                            }
                            final int i12 = i11 - i6;
                            final long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i10, -i9);
                            final LazyListItemProvider invoke = function0.invoke();
                            invoke.getItemScope().setMaxSize(Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU), Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU));
                            if (z1522) {
                                Arrangement.Vertical vertical7 = vertical522;
                                if (vertical7 == null) {
                                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                                }
                                spacing = vertical7.getSpacing();
                            } else {
                                Arrangement.Horizontal horizontal7 = horizontal522;
                                if (horizontal7 == null) {
                                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                                }
                                spacing = horizontal7.getSpacing();
                            }
                            final int i13 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(spacing);
                            final int itemCount = invoke.getItemCount();
                            if (z1522) {
                                m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i9;
                            } else {
                                m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i10;
                            }
                            int i14 = m6218getMaxWidthimpl;
                            if (!z || i14 > 0) {
                                IntOffset = IntOffsetKt.IntOffset(i4, i7);
                            } else {
                                boolean z20 = z1522;
                                if (!z20) {
                                    i4 += i14;
                                }
                                if (z20) {
                                    i7 += i14;
                                }
                                IntOffset = IntOffsetKt.IntOffset(i4, i7);
                            }
                            final boolean z21 = z1522;
                            final Alignment.Horizontal horizontal8 = horizontal622;
                            final Alignment.Vertical vertical8 = vertical622;
                            final boolean z22 = z;
                            final LazyListState lazyListState2 = LazyListState.this;
                            final long j2 = IntOffset;
                            LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6237offsetNN6EwU, z21, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal8, vertical8, z22, i6, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
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
                                    this.$isVertical = z21;
                                    this.$this_null = lazyLayoutMeasureScope;
                                    this.$itemsCount = itemCount;
                                    this.$spaceBetweenItems = i13;
                                    this.$horizontalAlignment = horizontal8;
                                    this.$verticalAlignment = vertical8;
                                    this.$reverseLayout = z22;
                                    this.$beforeContentPadding = i6;
                                    this.$afterContentPadding = i12;
                                    this.$visualItemOffset = j2;
                                    this.$state = lazyListState2;
                                }

                                @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                                public LazyListMeasuredItem mo776createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
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
                                if (lazyLayoutMeasureScope.isLookingAhead() || !z16) {
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
                                LazyListMeasureResult m780measureLazyListx0Ok8Vo = LazyListMeasureKt.m780measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6237offsetNN6EwU, z1522, emptyList, vertical522, horizontal522, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z16, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m791getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                    }

                                    public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                        return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                    }
                                });
                                LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m780measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                return m780measureLazyListx0Ok8Vo;
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
                z7 = true;
                boolean z132 = z12 | z7;
                if (((234881024 & i2) ^ 100663296) <= 67108864) {
                }
                if ((100663296 & i2) != 67108864) {
                }
                z8 = true;
                boolean z1422 = z132 | z8;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                }
                if ((i2 & 805306368) != 536870912) {
                }
                z9 = true;
                changed = z9 | z1422 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                final Arrangement.Vertical vertical5222 = vertical4;
                final Arrangement.Horizontal horizontal5222 = horizontal4;
                final Alignment.Horizontal horizontal6222 = horizontal3;
                final Alignment.Vertical vertical6222 = vertical3;
                final boolean z15222 = z4;
                rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return m775invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final LazyListMeasureResult m775invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                        int i4;
                        int i5;
                        final int i6;
                        float spacing;
                        int m6218getMaxWidthimpl;
                        long IntOffset;
                        float scrollToBeConsumed;
                        List<Integer> emptyList;
                        ObservableScopeInvalidator.m847attachToScopeimpl(LazyListState.this.m790getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                        boolean z16 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                        CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z15222 ? Orientation.Vertical : Orientation.Horizontal);
                        boolean z17 = z15222;
                        PaddingValues paddingValues2 = paddingValues;
                        if (z17) {
                            i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        boolean z18 = z15222;
                        PaddingValues paddingValues3 = paddingValues;
                        if (z18) {
                            i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        int i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                        int i8 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                        final int i9 = i7 + i8;
                        final int i10 = i4 + i5;
                        boolean z19 = z15222;
                        int i11 = z19 ? i9 : i10;
                        if (z19 && !z) {
                            i6 = i7;
                        } else if (z19 && z) {
                            i6 = i8;
                        } else {
                            i6 = (z19 || z) ? i5 : i4;
                        }
                        final int i12 = i11 - i6;
                        final long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i10, -i9);
                        final LazyListItemProvider invoke = function0.invoke();
                        invoke.getItemScope().setMaxSize(Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU), Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU));
                        if (z15222) {
                            Arrangement.Vertical vertical7 = vertical5222;
                            if (vertical7 == null) {
                                throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                            }
                            spacing = vertical7.getSpacing();
                        } else {
                            Arrangement.Horizontal horizontal7 = horizontal5222;
                            if (horizontal7 == null) {
                                throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                            }
                            spacing = horizontal7.getSpacing();
                        }
                        final int i13 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(spacing);
                        final int itemCount = invoke.getItemCount();
                        if (z15222) {
                            m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i9;
                        } else {
                            m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i10;
                        }
                        int i14 = m6218getMaxWidthimpl;
                        if (!z || i14 > 0) {
                            IntOffset = IntOffsetKt.IntOffset(i4, i7);
                        } else {
                            boolean z20 = z15222;
                            if (!z20) {
                                i4 += i14;
                            }
                            if (z20) {
                                i7 += i14;
                            }
                            IntOffset = IntOffsetKt.IntOffset(i4, i7);
                        }
                        final boolean z21 = z15222;
                        final Alignment.Horizontal horizontal8 = horizontal6222;
                        final Alignment.Vertical vertical8 = vertical6222;
                        final boolean z22 = z;
                        final LazyListState lazyListState2 = LazyListState.this;
                        final long j2 = IntOffset;
                        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6237offsetNN6EwU, z21, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal8, vertical8, z22, i6, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
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
                                this.$isVertical = z21;
                                this.$this_null = lazyLayoutMeasureScope;
                                this.$itemsCount = itemCount;
                                this.$spaceBetweenItems = i13;
                                this.$horizontalAlignment = horizontal8;
                                this.$verticalAlignment = vertical8;
                                this.$reverseLayout = z22;
                                this.$beforeContentPadding = i6;
                                this.$afterContentPadding = i12;
                                this.$visualItemOffset = j2;
                                this.$state = lazyListState2;
                            }

                            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                            /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                            public LazyListMeasuredItem mo776createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
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
                            if (lazyLayoutMeasureScope.isLookingAhead() || !z16) {
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
                            LazyListMeasureResult m780measureLazyListx0Ok8Vo = LazyListMeasureKt.m780measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6237offsetNN6EwU, z15222, emptyList, vertical5222, horizontal5222, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z16, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m791getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                }
                            });
                            LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m780measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                            return m780measureLazyListx0Ok8Vo;
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
            z6 = true;
            boolean z122 = z11 | z6;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
            }
            if ((12582912 & i2) != 8388608) {
            }
            z7 = true;
            boolean z1322 = z122 | z7;
            if (((234881024 & i2) ^ 100663296) <= 67108864) {
            }
            if ((100663296 & i2) != 67108864) {
            }
            z8 = true;
            boolean z14222 = z1322 | z8;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
            }
            if ((i2 & 805306368) != 536870912) {
            }
            z9 = true;
            changed = z9 | z14222 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            final Arrangement.Vertical vertical52222 = vertical4;
            final Arrangement.Horizontal horizontal52222 = horizontal4;
            final Alignment.Horizontal horizontal62222 = horizontal3;
            final Alignment.Vertical vertical62222 = vertical3;
            final boolean z152222 = z4;
            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m775invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m775invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i4;
                    int i5;
                    final int i6;
                    float spacing;
                    int m6218getMaxWidthimpl;
                    long IntOffset;
                    float scrollToBeConsumed;
                    List<Integer> emptyList;
                    ObservableScopeInvalidator.m847attachToScopeimpl(LazyListState.this.m790getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    boolean z16 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                    CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z152222 ? Orientation.Vertical : Orientation.Horizontal);
                    boolean z17 = z152222;
                    PaddingValues paddingValues2 = paddingValues;
                    if (z17) {
                        i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    boolean z18 = z152222;
                    PaddingValues paddingValues3 = paddingValues;
                    if (z18) {
                        i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                    int i8 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                    final int i9 = i7 + i8;
                    final int i10 = i4 + i5;
                    boolean z19 = z152222;
                    int i11 = z19 ? i9 : i10;
                    if (z19 && !z) {
                        i6 = i7;
                    } else if (z19 && z) {
                        i6 = i8;
                    } else {
                        i6 = (z19 || z) ? i5 : i4;
                    }
                    final int i12 = i11 - i6;
                    final long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i10, -i9);
                    final LazyListItemProvider invoke = function0.invoke();
                    invoke.getItemScope().setMaxSize(Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU), Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU));
                    if (z152222) {
                        Arrangement.Vertical vertical7 = vertical52222;
                        if (vertical7 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        spacing = vertical7.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal7 = horizontal52222;
                        if (horizontal7 == null) {
                            throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                        }
                        spacing = horizontal7.getSpacing();
                    }
                    final int i13 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(spacing);
                    final int itemCount = invoke.getItemCount();
                    if (z152222) {
                        m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i9;
                    } else {
                        m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i10;
                    }
                    int i14 = m6218getMaxWidthimpl;
                    if (!z || i14 > 0) {
                        IntOffset = IntOffsetKt.IntOffset(i4, i7);
                    } else {
                        boolean z20 = z152222;
                        if (!z20) {
                            i4 += i14;
                        }
                        if (z20) {
                            i7 += i14;
                        }
                        IntOffset = IntOffsetKt.IntOffset(i4, i7);
                    }
                    final boolean z21 = z152222;
                    final Alignment.Horizontal horizontal8 = horizontal62222;
                    final Alignment.Vertical vertical8 = vertical62222;
                    final boolean z22 = z;
                    final LazyListState lazyListState2 = LazyListState.this;
                    final long j2 = IntOffset;
                    LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6237offsetNN6EwU, z21, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal8, vertical8, z22, i6, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
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
                            this.$isVertical = z21;
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$itemsCount = itemCount;
                            this.$spaceBetweenItems = i13;
                            this.$horizontalAlignment = horizontal8;
                            this.$verticalAlignment = vertical8;
                            this.$reverseLayout = z22;
                            this.$beforeContentPadding = i6;
                            this.$afterContentPadding = i12;
                            this.$visualItemOffset = j2;
                            this.$state = lazyListState2;
                        }

                        @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                        /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                        public LazyListMeasuredItem mo776createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
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
                        if (lazyLayoutMeasureScope.isLookingAhead() || !z16) {
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
                        LazyListMeasureResult m780measureLazyListx0Ok8Vo = LazyListMeasureKt.m780measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6237offsetNN6EwU, z152222, emptyList, vertical52222, horizontal52222, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z16, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m791getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                            }

                            public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                            }
                        });
                        LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m780measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                        return m780measureLazyListx0Ok8Vo;
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
        z5 = true;
        boolean z112 = z10 | z5;
        if (((3670016 & i2) ^ 1572864) <= 1048576) {
        }
        if ((1572864 & i2) != 1048576) {
        }
        z6 = true;
        boolean z1222 = z112 | z6;
        if (((29360128 & i2) ^ 12582912) > 8388608) {
        }
        if ((12582912 & i2) != 8388608) {
        }
        z7 = true;
        boolean z13222 = z1222 | z7;
        if (((234881024 & i2) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i2) != 67108864) {
        }
        z8 = true;
        boolean z142222 = z13222 | z8;
        if (((1879048192 & i2) ^ 805306368) > 536870912) {
        }
        if ((i2 & 805306368) != 536870912) {
        }
        z9 = true;
        changed = z9 | z142222 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        final Arrangement.Vertical vertical522222 = vertical4;
        final Arrangement.Horizontal horizontal522222 = horizontal4;
        final Alignment.Horizontal horizontal622222 = horizontal3;
        final Alignment.Vertical vertical622222 = vertical3;
        final boolean z1522222 = z4;
        rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                return m775invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
            }

            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final LazyListMeasureResult m775invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                int i4;
                int i5;
                final int i6;
                float spacing;
                int m6218getMaxWidthimpl;
                long IntOffset;
                float scrollToBeConsumed;
                List<Integer> emptyList;
                ObservableScopeInvalidator.m847attachToScopeimpl(LazyListState.this.m790getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                boolean z16 = LazyListState.this.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z1522222 ? Orientation.Vertical : Orientation.Horizontal);
                boolean z17 = z1522222;
                PaddingValues paddingValues2 = paddingValues;
                if (z17) {
                    i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i4 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                boolean z18 = z1522222;
                PaddingValues paddingValues3 = paddingValues;
                if (z18) {
                    i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i5 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                int i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                int i8 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                final int i9 = i7 + i8;
                final int i10 = i4 + i5;
                boolean z19 = z1522222;
                int i11 = z19 ? i9 : i10;
                if (z19 && !z) {
                    i6 = i7;
                } else if (z19 && z) {
                    i6 = i8;
                } else {
                    i6 = (z19 || z) ? i5 : i4;
                }
                final int i12 = i11 - i6;
                final long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i10, -i9);
                final LazyListItemProvider invoke = function0.invoke();
                invoke.getItemScope().setMaxSize(Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU), Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU));
                if (z1522222) {
                    Arrangement.Vertical vertical7 = vertical522222;
                    if (vertical7 == null) {
                        throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                    }
                    spacing = vertical7.getSpacing();
                } else {
                    Arrangement.Horizontal horizontal7 = horizontal522222;
                    if (horizontal7 == null) {
                        throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                    }
                    spacing = horizontal7.getSpacing();
                }
                final int i13 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(spacing);
                final int itemCount = invoke.getItemCount();
                if (z1522222) {
                    m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i9;
                } else {
                    m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i10;
                }
                int i14 = m6218getMaxWidthimpl;
                if (!z || i14 > 0) {
                    IntOffset = IntOffsetKt.IntOffset(i4, i7);
                } else {
                    boolean z20 = z1522222;
                    if (!z20) {
                        i4 += i14;
                    }
                    if (z20) {
                        i7 += i14;
                    }
                    IntOffset = IntOffsetKt.IntOffset(i4, i7);
                }
                final boolean z21 = z1522222;
                final Alignment.Horizontal horizontal8 = horizontal622222;
                final Alignment.Vertical vertical8 = vertical622222;
                final boolean z22 = z;
                final LazyListState lazyListState2 = LazyListState.this;
                final long j2 = IntOffset;
                LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6237offsetNN6EwU, z21, invoke, lazyLayoutMeasureScope, itemCount, i13, horizontal8, vertical8, z22, i6, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
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
                        this.$isVertical = z21;
                        this.$this_null = lazyLayoutMeasureScope;
                        this.$itemsCount = itemCount;
                        this.$spaceBetweenItems = i13;
                        this.$horizontalAlignment = horizontal8;
                        this.$verticalAlignment = vertical8;
                        this.$reverseLayout = z22;
                        this.$beforeContentPadding = i6;
                        this.$afterContentPadding = i12;
                        this.$visualItemOffset = j2;
                        this.$state = lazyListState2;
                    }

                    @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                    /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                    public LazyListMeasuredItem mo776createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
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
                    if (lazyLayoutMeasureScope.isLookingAhead() || !z16) {
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
                    LazyListMeasureResult m780measureLazyListx0Ok8Vo = LazyListMeasureKt.m780measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m6237offsetNN6EwU, z1522222, emptyList, vertical522222, horizontal522222, z, lazyLayoutMeasureScope, LazyListState.this.getItemAnimator$foundation_release(), i, calculateLazyLayoutPinnedIndices, z16, lazyLayoutMeasureScope.isLookingAhead(), LazyListState.this.getPostLookaheadLayoutInfo(), coroutineScope, LazyListState.this.m791getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                        }

                        public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                            return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6234constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                        }
                    });
                    LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m780measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                    return m780measureLazyListx0Ok8Vo;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
        };
        composer.updateRememberedValue(rememberedValue);
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222222 = (Function2) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function222222;
    }
}
