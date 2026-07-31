package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGrid.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0096\u0001\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0094\u0001\u0010&\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%0\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010*\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "", "slotSizesSums", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "content", "LazyGrid", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "ScrollPositionUpdater", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureResult;", "rememberLazyGridMeasurePolicy", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "result", "refreshOverscrollInfo", "(Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyGrid(Modifier modifier, final LazyGridState state, final Function2 slotSizesSums, PaddingValues paddingValues, boolean z, final boolean z2, FlingBehavior flingBehavior, final boolean z3, final Arrangement.Vertical verticalArrangement, final Arrangement.Horizontal horizontalArrangement, final Function1 content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        int i7;
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        boolean z4;
        PaddingValues paddingValues3;
        Object rememberedValue;
        Composer.Companion companion;
        boolean changed;
        Object rememberedValue2;
        Composer composer2;
        final PaddingValues paddingValues4;
        final Modifier modifier3;
        final boolean z5;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(slotSizesSums, "slotSizesSums");
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(152645664);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(slotSizesSums) ? 256 : 128;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 32) != 0) {
                i9 = (i & 458752) == 0 ? startRestartGroup.changed(z2) ? 131072 : 65536 : 196608;
                if ((i & 3670016) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                    if ((i3 & 256) != 0) {
                        i8 = (i & 234881024) == 0 ? startRestartGroup.changed(verticalArrangement) ? 67108864 : 33554432 : 100663296;
                        if ((i3 & 512) == 0) {
                            if ((1879048192 & i) == 0) {
                                i6 = startRestartGroup.changed(horizontalArrangement) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i7 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                i7 = i2 | (startRestartGroup.changed(content) ? 4 : 2);
                            } else {
                                i7 = i2;
                            }
                            if ((i4 & 1533916891) == 306783378 || (i7 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier;
                                    PaddingValues m329PaddingValues0680j_4 = i11 == 0 ? PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(0)) : paddingValues2;
                                    boolean z6 = i5 == 0 ? z : false;
                                    if ((i3 & 64) == 0) {
                                        i4 &= -3670017;
                                        z4 = z6;
                                        paddingValues3 = m329PaddingValues0680j_4;
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        modifier2 = modifier4;
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                        modifier2 = modifier4;
                                        z4 = z6;
                                        paddingValues3 = m329PaddingValues0680j_4;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    z4 = z;
                                    flingBehavior2 = flingBehavior;
                                    paddingValues3 = paddingValues2;
                                    modifier2 = modifier;
                                }
                                startRestartGroup.endDefaults();
                                OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                                int i12 = i4 >> 3;
                                LazyGridItemProvider rememberItemProvider = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i12 & 14) | ((i7 << 3) & 112));
                                startRestartGroup.startReplaceableGroup(773894976);
                                startRestartGroup.startReplaceableGroup(-492369756);
                                rememberedValue = startRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (rememberedValue == companion.getEmpty()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                    startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                startRestartGroup.endReplaceableGroup();
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                startRestartGroup.endReplaceableGroup();
                                Boolean valueOf = Boolean.valueOf(z2);
                                Modifier modifier5 = modifier2;
                                startRestartGroup.startReplaceableGroup(511388516);
                                changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(state);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue2 == companion.getEmpty()) {
                                    rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope, z2);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = (LazyGridItemPlacementAnimator) rememberedValue2;
                                state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator);
                                int i13 = i4 & 112;
                                int i14 = i4 << 3;
                                int i15 = i14 & 458752;
                                composer2 = startRestartGroup;
                                Function2 rememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(rememberItemProvider, state, overscrollEffect, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator, composer2, 1073741824 | i13 | (i14 & 7168) | (i14 & 57344) | i15 | (i14 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
                                state.setVertical$foundation_release(z2);
                                ScrollPositionUpdater(rememberItemProvider, state, composer2, i13);
                                Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                                Modifier overscroll = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier5.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider, state, coroutineScope, z2, z4, z3, composer2, (i14 & 896) | 4096 | (i12 & 57344) | i15 | (i12 & 3670016)), orientation), overscrollEffect);
                                composer2.startReplaceableGroup(-1163690407);
                                boolean z7 = (composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl || z2) ? !z4 : z4;
                                composer2.endReplaceableGroup();
                                LazyLayoutKt.LazyLayout(rememberItemProvider, ScrollableKt.scrollable(overscroll, state, orientation, overscrollEffect, z3, z7, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy, composer2, 0, 0);
                                paddingValues4 = paddingValues3;
                                modifier3 = modifier5;
                                z5 = z4;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z5 = z;
                                paddingValues4 = paddingValues2;
                                composer2 = startRestartGroup;
                                flingBehavior3 = flingBehavior;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i16) {
                                    LazyGridKt.LazyGrid(Modifier.this, state, slotSizesSums, paddingValues4, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, i | 1, i2, i3);
                                }
                            });
                            return;
                        }
                        i6 = C.ENCODING_PCM_32BIT;
                        i4 |= i6;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        startRestartGroup.endDefaults();
                        OverscrollEffect overscrollEffect2 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                        int i122 = i4 >> 3;
                        LazyGridItemProvider rememberItemProvider2 = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i122 & 14) | ((i7 << 3) & 112));
                        startRestartGroup.startReplaceableGroup(773894976);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        startRestartGroup.endReplaceableGroup();
                        Boolean valueOf2 = Boolean.valueOf(z2);
                        Modifier modifier52 = modifier2;
                        startRestartGroup.startReplaceableGroup(511388516);
                        changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(state);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope2, z2);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2 = (LazyGridItemPlacementAnimator) rememberedValue2;
                        state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator2);
                        int i132 = i4 & 112;
                        int i142 = i4 << 3;
                        int i152 = i142 & 458752;
                        composer2 = startRestartGroup;
                        Function2 rememberLazyGridMeasurePolicy2 = rememberLazyGridMeasurePolicy(rememberItemProvider2, state, overscrollEffect2, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator2, composer2, 1073741824 | i132 | (i142 & 7168) | (i142 & 57344) | i152 | (i142 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
                        state.setVertical$foundation_release(z2);
                        ScrollPositionUpdater(rememberItemProvider2, state, composer2, i132);
                        Orientation orientation2 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                        Modifier overscroll2 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier52.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider2, state, coroutineScope2, z2, z4, z3, composer2, (i142 & 896) | 4096 | (i122 & 57344) | i152 | (i122 & 3670016)), orientation2), overscrollEffect2);
                        composer2.startReplaceableGroup(-1163690407);
                        if (composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        }
                        composer2.endReplaceableGroup();
                        LazyLayoutKt.LazyLayout(rememberItemProvider2, ScrollableKt.scrollable(overscroll2, state, orientation2, overscrollEffect2, z3, z7, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy2, composer2, 0, 0);
                        paddingValues4 = paddingValues3;
                        modifier3 = modifier52;
                        z5 = z4;
                        flingBehavior3 = flingBehavior2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i4 |= i8;
                    if ((i3 & 512) == 0) {
                    }
                    i4 |= i6;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    startRestartGroup.endDefaults();
                    OverscrollEffect overscrollEffect22 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                    int i1222 = i4 >> 3;
                    LazyGridItemProvider rememberItemProvider22 = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i1222 & 14) | ((i7 << 3) & 112));
                    startRestartGroup.startReplaceableGroup(773894976);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    Boolean valueOf22 = Boolean.valueOf(z2);
                    Modifier modifier522 = modifier2;
                    startRestartGroup.startReplaceableGroup(511388516);
                    changed = startRestartGroup.changed(valueOf22) | startRestartGroup.changed(state);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope22, z2);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator22 = (LazyGridItemPlacementAnimator) rememberedValue2;
                    state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator22);
                    int i1322 = i4 & 112;
                    int i1422 = i4 << 3;
                    int i1522 = i1422 & 458752;
                    composer2 = startRestartGroup;
                    Function2 rememberLazyGridMeasurePolicy22 = rememberLazyGridMeasurePolicy(rememberItemProvider22, state, overscrollEffect22, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator22, composer2, 1073741824 | i1322 | (i1422 & 7168) | (i1422 & 57344) | i1522 | (i1422 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
                    state.setVertical$foundation_release(z2);
                    ScrollPositionUpdater(rememberItemProvider22, state, composer2, i1322);
                    Orientation orientation22 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                    Modifier overscroll22 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier522.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider22, state, coroutineScope22, z2, z4, z3, composer2, (i1422 & 896) | 4096 | (i1222 & 57344) | i1522 | (i1222 & 3670016)), orientation22), overscrollEffect22);
                    composer2.startReplaceableGroup(-1163690407);
                    if (composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    }
                    composer2.endReplaceableGroup();
                    LazyLayoutKt.LazyLayout(rememberItemProvider22, ScrollableKt.scrollable(overscroll22, state, orientation22, overscrollEffect22, z3, z7, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy22, composer2, 0, 0);
                    paddingValues4 = paddingValues3;
                    modifier3 = modifier522;
                    z5 = z4;
                    flingBehavior3 = flingBehavior2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i3 & 256) != 0) {
                }
                i4 |= i8;
                if ((i3 & 512) == 0) {
                }
                i4 |= i6;
                if ((i3 & 1024) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                startRestartGroup.endDefaults();
                OverscrollEffect overscrollEffect222 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                int i12222 = i4 >> 3;
                LazyGridItemProvider rememberItemProvider222 = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i12222 & 14) | ((i7 << 3) & 112));
                startRestartGroup.startReplaceableGroup(773894976);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                Boolean valueOf222 = Boolean.valueOf(z2);
                Modifier modifier5222 = modifier2;
                startRestartGroup.startReplaceableGroup(511388516);
                changed = startRestartGroup.changed(valueOf222) | startRestartGroup.changed(state);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope222, z2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator222 = (LazyGridItemPlacementAnimator) rememberedValue2;
                state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator222);
                int i13222 = i4 & 112;
                int i14222 = i4 << 3;
                int i15222 = i14222 & 458752;
                composer2 = startRestartGroup;
                Function2 rememberLazyGridMeasurePolicy222 = rememberLazyGridMeasurePolicy(rememberItemProvider222, state, overscrollEffect222, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator222, composer2, 1073741824 | i13222 | (i14222 & 7168) | (i14222 & 57344) | i15222 | (i14222 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
                state.setVertical$foundation_release(z2);
                ScrollPositionUpdater(rememberItemProvider222, state, composer2, i13222);
                Orientation orientation222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                Modifier overscroll222 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier5222.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider222, state, coroutineScope222, z2, z4, z3, composer2, (i14222 & 896) | 4096 | (i12222 & 57344) | i15222 | (i12222 & 3670016)), orientation222), overscrollEffect222);
                composer2.startReplaceableGroup(-1163690407);
                if (composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                }
                composer2.endReplaceableGroup();
                LazyLayoutKt.LazyLayout(rememberItemProvider222, ScrollableKt.scrollable(overscroll222, state, orientation222, overscrollEffect222, z3, z7, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy222, composer2, 0, 0);
                paddingValues4 = paddingValues3;
                modifier3 = modifier5222;
                z5 = z4;
                flingBehavior3 = flingBehavior2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i4 |= i9;
            if ((i & 3670016) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            i4 |= i8;
            if ((i3 & 512) == 0) {
            }
            i4 |= i6;
            if ((i3 & 1024) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            startRestartGroup.endDefaults();
            OverscrollEffect overscrollEffect2222 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
            int i122222 = i4 >> 3;
            LazyGridItemProvider rememberItemProvider2222 = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i122222 & 14) | ((i7 << 3) & 112));
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Boolean valueOf2222 = Boolean.valueOf(z2);
            Modifier modifier52222 = modifier2;
            startRestartGroup.startReplaceableGroup(511388516);
            changed = startRestartGroup.changed(valueOf2222) | startRestartGroup.changed(state);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope2222, z2);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2222 = (LazyGridItemPlacementAnimator) rememberedValue2;
            state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator2222);
            int i132222 = i4 & 112;
            int i142222 = i4 << 3;
            int i152222 = i142222 & 458752;
            composer2 = startRestartGroup;
            Function2 rememberLazyGridMeasurePolicy2222 = rememberLazyGridMeasurePolicy(rememberItemProvider2222, state, overscrollEffect2222, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator2222, composer2, 1073741824 | i132222 | (i142222 & 7168) | (i142222 & 57344) | i152222 | (i142222 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
            state.setVertical$foundation_release(z2);
            ScrollPositionUpdater(rememberItemProvider2222, state, composer2, i132222);
            Orientation orientation2222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
            Modifier overscroll2222 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier52222.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider2222, state, coroutineScope2222, z2, z4, z3, composer2, (i142222 & 896) | 4096 | (i122222 & 57344) | i152222 | (i122222 & 3670016)), orientation2222), overscrollEffect2222);
            composer2.startReplaceableGroup(-1163690407);
            if (composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
            }
            composer2.endReplaceableGroup();
            LazyLayoutKt.LazyLayout(rememberItemProvider2222, ScrollableKt.scrollable(overscroll2222, state, orientation2222, overscrollEffect2222, z3, z7, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy2222, composer2, 0, 0);
            paddingValues4 = paddingValues3;
            modifier3 = modifier52222;
            z5 = z4;
            flingBehavior3 = flingBehavior2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i9;
        if ((i & 3670016) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        i4 |= i8;
        if ((i3 & 512) == 0) {
        }
        i4 |= i6;
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        startRestartGroup.endDefaults();
        OverscrollEffect overscrollEffect22222 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
        int i1222222 = i4 >> 3;
        LazyGridItemProvider rememberItemProvider22222 = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i1222222 & 14) | ((i7 << 3) & 112));
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope22222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        Boolean valueOf22222 = Boolean.valueOf(z2);
        Modifier modifier522222 = modifier2;
        startRestartGroup.startReplaceableGroup(511388516);
        changed = startRestartGroup.changed(valueOf22222) | startRestartGroup.changed(state);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope22222, z2);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator22222 = (LazyGridItemPlacementAnimator) rememberedValue2;
        state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator22222);
        int i1322222 = i4 & 112;
        int i1422222 = i4 << 3;
        int i1522222 = i1422222 & 458752;
        composer2 = startRestartGroup;
        Function2 rememberLazyGridMeasurePolicy22222 = rememberLazyGridMeasurePolicy(rememberItemProvider22222, state, overscrollEffect22222, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator22222, composer2, 1073741824 | i1322222 | (i1422222 & 7168) | (i1422222 & 57344) | i1522222 | (i1422222 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
        state.setVertical$foundation_release(z2);
        ScrollPositionUpdater(rememberItemProvider22222, state, composer2, i1322222);
        Orientation orientation22222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
        Modifier overscroll22222 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier522222.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider22222, state, coroutineScope22222, z2, z4, z3, composer2, (i1422222 & 896) | 4096 | (i1222222 & 57344) | i1522222 | (i1222222 & 3670016)), orientation22222), overscrollEffect22222);
        composer2.startReplaceableGroup(-1163690407);
        if (composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
        }
        composer2.endReplaceableGroup();
        LazyLayoutKt.LazyLayout(rememberItemProvider22222, ScrollableKt.scrollable(overscroll22222, state, orientation22222, overscrollEffect22222, z3, z7, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy22222, composer2, 0, 0);
        paddingValues4 = paddingValues3;
        modifier3 = modifier522222;
        z5 = z4;
        flingBehavior3 = flingBehavior2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScrollPositionUpdater(final LazyGridItemProvider lazyGridItemProvider, final LazyGridState lazyGridState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(950944068);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(lazyGridItemProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (lazyGridItemProvider.getItemCount() > 0) {
                lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$ScrollPositionUpdater$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                LazyGridKt.ScrollPositionUpdater(LazyGridItemProvider.this, lazyGridState, composer2, i | 1);
            }
        });
    }

    private static final Function2 rememberLazyGridMeasurePolicy(final LazyGridItemProvider lazyGridItemProvider, final LazyGridState lazyGridState, final OverscrollEffect overscrollEffect, final Function2 function2, final PaddingValues paddingValues, final boolean z, final boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1958911962);
        Arrangement.Horizontal horizontal2 = (i2 & 128) != 0 ? null : horizontal;
        Arrangement.Vertical vertical2 = (i2 & 256) == 0 ? vertical : null;
        Object[] objArr = {lazyGridState, overscrollEffect, function2, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal2, vertical2, lazyGridItemPlacementAnimator};
        composer.startReplaceableGroup(-568225417);
        boolean z3 = false;
        for (int i3 = 0; i3 < 9; i3++) {
            z3 |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            final Arrangement.Vertical vertical3 = vertical2;
            final Arrangement.Horizontal horizontal3 = horizontal2;
            rememberedValue = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m460invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).getValue());
                }

                @NotNull
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m460invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int mo265roundToPx0680j_4;
                    int mo265roundToPx0680j_42;
                    int i4;
                    float spacing;
                    float spacing2;
                    int m2487getMaxWidthimpl;
                    long IntOffset;
                    int firstVisibleItemScrollOffset;
                    int i5;
                    Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m168checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z2) {
                        mo265roundToPx0680j_4 = lazyLayoutMeasureScope.mo265roundToPx0680j_4(paddingValues.mo320calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        mo265roundToPx0680j_4 = lazyLayoutMeasureScope.mo265roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        mo265roundToPx0680j_42 = lazyLayoutMeasureScope.mo265roundToPx0680j_4(paddingValues.mo321calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        mo265roundToPx0680j_42 = lazyLayoutMeasureScope.mo265roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int mo265roundToPx0680j_43 = lazyLayoutMeasureScope.mo265roundToPx0680j_4(paddingValues.getTop());
                    int mo265roundToPx0680j_44 = lazyLayoutMeasureScope.mo265roundToPx0680j_4(paddingValues.getBottom());
                    final int i6 = mo265roundToPx0680j_43 + mo265roundToPx0680j_44;
                    final int i7 = mo265roundToPx0680j_4 + mo265roundToPx0680j_42;
                    boolean z4 = z2;
                    int i8 = z4 ? i6 : i7;
                    if (z4 && !z) {
                        i4 = mo265roundToPx0680j_43;
                    } else if (z4 && z) {
                        i4 = mo265roundToPx0680j_44;
                    } else {
                        i4 = (z4 || z) ? mo265roundToPx0680j_42 : mo265roundToPx0680j_4;
                    }
                    final int i9 = i8 - i4;
                    long m2503offsetNN6EwU = ConstraintsKt.m2503offsetNN6EwU(j, -i7, -i6);
                    lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
                    final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProvider.getSpanLayoutProvider();
                    final List list = (List) function2.invoke(lazyLayoutMeasureScope, Constraints.m2475boximpl(j));
                    spanLayoutProvider.setSlotsPerLine(list.size());
                    lazyGridState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyGridState.setSlotsPerLine$foundation_release(list.size());
                    if (z2) {
                        Arrangement.Vertical vertical4 = vertical3;
                        if (vertical4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        spacing = vertical4.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal4 = horizontal3;
                        if (horizontal4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        spacing = horizontal4.getSpacing();
                    }
                    int mo265roundToPx0680j_45 = lazyLayoutMeasureScope.mo265roundToPx0680j_4(spacing);
                    if (z2) {
                        Arrangement.Horizontal horizontal5 = horizontal3;
                        spacing2 = horizontal5 != null ? horizontal5.getSpacing() : Dp.m2507constructorimpl(0);
                    } else {
                        Arrangement.Vertical vertical5 = vertical3;
                        spacing2 = vertical5 != null ? vertical5.getSpacing() : Dp.m2507constructorimpl(0);
                    }
                    final int mo265roundToPx0680j_46 = lazyLayoutMeasureScope.mo265roundToPx0680j_4(spacing2);
                    int itemCount = lazyGridItemProvider.getItemCount();
                    if (z2) {
                        m2487getMaxWidthimpl = Constraints.m2486getMaxHeightimpl(j) - i6;
                    } else {
                        m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(j) - i7;
                    }
                    int i10 = m2487getMaxWidthimpl;
                    if (!z || i10 > 0) {
                        IntOffset = IntOffsetKt.IntOffset(mo265roundToPx0680j_4, mo265roundToPx0680j_43);
                    } else {
                        boolean z5 = z2;
                        if (!z5) {
                            mo265roundToPx0680j_4 += i10;
                        }
                        if (z5) {
                            mo265roundToPx0680j_43 += i10;
                        }
                        IntOffset = IntOffsetKt.IntOffset(mo265roundToPx0680j_4, mo265roundToPx0680j_43);
                    }
                    final long j2 = IntOffset;
                    LazyGridItemProvider lazyGridItemProvider2 = lazyGridItemProvider;
                    final boolean z6 = z2;
                    final boolean z7 = z;
                    final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2 = lazyGridItemPlacementAnimator;
                    final int i11 = i4;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(lazyGridItemProvider2, lazyLayoutMeasureScope, mo265roundToPx0680j_45, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        @Override // androidx.compose.foundation.lazy.grid.MeasuredItemFactory
                        /* renamed from: createItem-PU_OBEw, reason: not valid java name */
                        public final LazyMeasuredItem mo462createItemPU_OBEw(int i12, Object key, int i13, int i14, Placeable[] placeables) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(placeables, "placeables");
                            return new LazyMeasuredItem(i12, key, z6, i13, i14, z7, LazyLayoutMeasureScope.this.getLayoutDirection(), i11, i9, placeables, lazyGridItemPlacementAnimator2, j2, null);
                        }
                    });
                    final boolean z8 = z2;
                    final LazyMeasuredLineProvider lazyMeasuredLineProvider = new LazyMeasuredLineProvider(z8, list, mo265roundToPx0680j_46, itemCount, mo265roundToPx0680j_45, lazyMeasuredItemProvider, spanLayoutProvider, new MeasuredLineFactory() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        @Override // androidx.compose.foundation.lazy.grid.MeasuredLineFactory
                        /* renamed from: createLine-H9FfpSk, reason: not valid java name */
                        public final LazyMeasuredLine mo463createLineH9FfpSk(int i12, LazyMeasuredItem[] items, List spans, int i13) {
                            Intrinsics.checkNotNullParameter(items, "items");
                            Intrinsics.checkNotNullParameter(spans, "spans");
                            return new LazyMeasuredLine(i12, items, spans, z8, list.size(), lazyLayoutMeasureScope.getLayoutDirection(), i13, mo265roundToPx0680j_46, null);
                        }
                    });
                    lazyGridState.setPrefetchInfoRetriever$foundation_release(new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return m461invokebKFJvoY(((LineIndex) obj).getValue());
                        }

                        @NotNull
                        /* renamed from: invoke-bKFJvoY, reason: not valid java name */
                        public final ArrayList<Pair<Integer, Constraints>> m461invokebKFJvoY(int i12) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = LazyGridSpanLayoutProvider.this.getLineConfiguration(i12);
                            int m439constructorimpl = ItemIndex.m439constructorimpl(lineConfiguration.getFirstItemIndex());
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List spans = lineConfiguration.getSpans();
                            LazyMeasuredLineProvider lazyMeasuredLineProvider2 = lazyMeasuredLineProvider;
                            int size = spans.size();
                            int i13 = 0;
                            for (int i14 = 0; i14 < size; i14++) {
                                int m434getCurrentLineSpanimpl = GridItemSpan.m434getCurrentLineSpanimpl(((GridItemSpan) spans.get(i14)).getPackedValue());
                                arrayList.add(TuplesKt.to(Integer.valueOf(m439constructorimpl), lazyMeasuredLineProvider2.getChildConstraints().invoke(Integer.valueOf(i13), Integer.valueOf(m434getCurrentLineSpanimpl))));
                                m439constructorimpl = ItemIndex.m439constructorimpl(m439constructorimpl + 1);
                                i13 += m434getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    });
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState2 = lazyGridState;
                    Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                        try {
                            if (lazyGridState2.getFirstVisibleItemIndex() >= itemCount && itemCount > 0) {
                                i5 = spanLayoutProvider.m475getLineIndexOfItem_Ze7BM(itemCount - 1);
                                firstVisibleItemScrollOffset = 0;
                                Unit unit = Unit.INSTANCE;
                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                createNonObservableSnapshot.dispose();
                                LazyGridMeasureResult m464measureLazyGridzIfe3eg = LazyGridMeasureKt.m464measureLazyGridzIfe3eg(itemCount, lazyMeasuredLineProvider, lazyMeasuredItemProvider, i10, list.size(), i4, i9, i5, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), m2503offsetNN6EwU, z2, vertical3, horizontal3, z, lazyLayoutMeasureScope, lazyGridItemPlacementAnimator, new Function3() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
                                    }

                                    @NotNull
                                    public final MeasureResult invoke(int i12, int i13, @NotNull Function1 placement) {
                                        Intrinsics.checkNotNullParameter(placement, "placement");
                                        return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m2501constrainWidthK40F9xA(j, i12 + i7), ConstraintsKt.m2500constrainHeightK40F9xA(j, i13 + i6), MapsKt.emptyMap(), placement);
                                    }
                                });
                                LazyGridState lazyGridState3 = lazyGridState;
                                OverscrollEffect overscrollEffect2 = overscrollEffect;
                                lazyGridState3.applyMeasureResult$foundation_release(m464measureLazyGridzIfe3eg);
                                LazyGridKt.refreshOverscrollInfo(overscrollEffect2, m464measureLazyGridzIfe3eg);
                                return m464measureLazyGridzIfe3eg;
                            }
                            int m475getLineIndexOfItem_Ze7BM = spanLayoutProvider.m475getLineIndexOfItem_Ze7BM(lazyGridState2.getFirstVisibleItemIndex());
                            firstVisibleItemScrollOffset = lazyGridState2.getFirstVisibleItemScrollOffset();
                            i5 = m475getLineIndexOfItem_Ze7BM;
                            Unit unit2 = Unit.INSTANCE;
                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                            createNonObservableSnapshot.dispose();
                            LazyGridMeasureResult m464measureLazyGridzIfe3eg2 = LazyGridMeasureKt.m464measureLazyGridzIfe3eg(itemCount, lazyMeasuredLineProvider, lazyMeasuredItemProvider, i10, list.size(), i4, i9, i5, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), m2503offsetNN6EwU, z2, vertical3, horizontal3, z, lazyLayoutMeasureScope, lazyGridItemPlacementAnimator, new Function3() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
                                }

                                @NotNull
                                public final MeasureResult invoke(int i12, int i13, @NotNull Function1 placement) {
                                    Intrinsics.checkNotNullParameter(placement, "placement");
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m2501constrainWidthK40F9xA(j, i12 + i7), ConstraintsKt.m2500constrainHeightK40F9xA(j, i13 + i6), MapsKt.emptyMap(), placement);
                                }
                            });
                            LazyGridState lazyGridState32 = lazyGridState;
                            OverscrollEffect overscrollEffect22 = overscrollEffect;
                            lazyGridState32.applyMeasureResult$foundation_release(m464measureLazyGridzIfe3eg2);
                            LazyGridKt.refreshOverscrollInfo(overscrollEffect22, m464measureLazyGridzIfe3eg2);
                            return m464measureLazyGridzIfe3eg2;
                        } catch (Throwable th) {
                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        createNonObservableSnapshot.dispose();
                        throw th2;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2 function22 = (Function2) rememberedValue;
        composer.endReplaceableGroup();
        return function22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshOverscrollInfo(OverscrollEffect overscrollEffect, LazyGridMeasureResult lazyGridMeasureResult) {
        Object obj;
        LazyMeasuredItem[] items;
        boolean canScrollForward = lazyGridMeasureResult.getCanScrollForward();
        LazyMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        if (firstVisibleLine == null || (items = firstVisibleLine.getItems()) == null || (obj = (LazyMeasuredItem) ArraysKt.firstOrNull(items)) == null) {
            obj = 0;
        }
        overscrollEffect.setEnabled(canScrollForward || (!Intrinsics.areEqual(obj, (Object) 0) || lazyGridMeasureResult.getFirstVisibleLineScrollOffset() != 0));
    }
}
