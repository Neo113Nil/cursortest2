package androidx.compose.foundation.lazy;

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
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyList.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0094\u0001\u0010(\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0$2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u001f\u0010,\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "content", "LazyList", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "ScrollPositionUpdater", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "rememberLazyListMeasurePolicy", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Lkotlin/jvm/functions/Function2;", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "refreshOverscrollInfo", "(Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/lazy/LazyListMeasureResult;)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x032b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(final Modifier modifier, final LazyListState state, final PaddingValues contentPadding, final boolean z, final boolean z2, final FlingBehavior flingBehavior, final boolean z3, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final Function1 content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object rememberedValue;
        Composer.Companion companion;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        Composer composer2;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final Alignment.Vertical vertical4;
        final Arrangement.Horizontal horizontal4;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(955299798);
        if ((i3 & 1) != 0) {
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
            i4 |= startRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i3 & 32) == 0) {
            i10 = (i & 458752) == 0 ? startRestartGroup.changed(flingBehavior) ? 131072 : 65536 : 196608;
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                i5 = i3 & 128;
                if (i5 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(horizontal) ? 8388608 : 4194304;
                }
                i6 = i3 & 256;
                if (i6 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= startRestartGroup.changed(vertical) ? 67108864 : 33554432;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changed(vertical2) ? 536870912 : 268435456;
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i9 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i9 = i2 | (startRestartGroup.changed(horizontal2) ? 4 : 2);
                } else {
                    i9 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i9 |= 48;
                } else if ((i2 & 112) == 0) {
                    i9 |= startRestartGroup.changed(content) ? 32 : 16;
                }
                if ((1533916891 & i4) == 306783378 || (i9 & 91) != 18 || !startRestartGroup.getSkipping()) {
                    Alignment.Horizontal horizontal5 = i5 != 0 ? null : horizontal;
                    Arrangement.Vertical vertical5 = i6 != 0 ? null : vertical;
                    Alignment.Vertical vertical6 = i7 != 0 ? null : vertical2;
                    Arrangement.Horizontal horizontal6 = i8 != 0 ? null : horizontal2;
                    OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                    int i11 = i4 >> 3;
                    LazyListItemProvider rememberItemProvider = LazyListItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i11 & 14) | (i9 & 112));
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new LazyListBeyondBoundsInfo();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo = (LazyListBeyondBoundsInfo) rememberedValue;
                    startRestartGroup.startReplaceableGroup(773894976);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                        startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    Boolean valueOf = Boolean.valueOf(z2);
                    startRestartGroup.startReplaceableGroup(511388516);
                    changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(state);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new LazyListItemPlacementAnimator(coroutineScope, z2);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceableGroup();
                    LazyListItemPlacementAnimator lazyListItemPlacementAnimator = (LazyListItemPlacementAnimator) rememberedValue3;
                    state.setPlacementAnimator$foundation_release(lazyListItemPlacementAnimator);
                    int i12 = i4 & 112;
                    int i13 = MutableVector.$stable;
                    int i14 = i4 << 6;
                    int i15 = i14 & 458752;
                    int i16 = i4;
                    Function2 rememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(rememberItemProvider, state, lazyListBeyondBoundsInfo, overscrollEffect, contentPadding, z, z2, horizontal5, vertical6, horizontal6, vertical5, lazyListItemPlacementAnimator, startRestartGroup, (i11 & 234881024) | (i13 << 6) | i12 | (i14 & 57344) | i15 | (i14 & 3670016) | (i4 & 29360128) | ((i9 << 27) & 1879048192), ((i4 >> 24) & 14) | 64, 0);
                    composer2 = startRestartGroup;
                    ScrollPositionUpdater(rememberItemProvider, state, composer2, i12);
                    Orientation orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
                    Modifier overscroll = OverscrollKt.overscroll(LazyListPinningModifierKt.lazyListPinningModifier(LazyBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyListSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider, state, coroutineScope, z2, z, z3, composer2, ((i16 << 3) & 896) | 4096 | (i16 & 57344) | i15 | (i16 & 3670016)), orientation), state, lazyListBeyondBoundsInfo, z, composer2, (i13 << 6) | i12 | (i16 & 7168)), state, lazyListBeyondBoundsInfo, composer2, (i13 << 6) | i12), overscrollEffect);
                    composer2.startReplaceableGroup(-908836175);
                    boolean z4 = (composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl || z2) ? !z : z;
                    composer2.endReplaceableGroup();
                    LazyLayoutKt.LazyLayout(rememberItemProvider, ScrollableKt.scrollable(overscroll, state, orientation, overscrollEffect, z3, z4, flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyListMeasurePolicy, composer2, 0, 0);
                    horizontal3 = horizontal5;
                    vertical3 = vertical5;
                    vertical4 = vertical6;
                    horizontal4 = horizontal6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    vertical3 = vertical;
                    vertical4 = vertical2;
                    horizontal4 = horizontal2;
                    composer2 = startRestartGroup;
                    horizontal3 = horizontal;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i17) {
                        LazyListKt.LazyList(Modifier.this, state, contentPadding, z, z2, flingBehavior, z3, horizontal3, vertical3, vertical4, horizontal4, content, composer3, i | 1, i2, i3);
                    }
                });
                return;
            }
            i5 = i3 & 128;
            if (i5 != 0) {
            }
            i6 = i3 & 256;
            if (i6 != 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if ((1533916891 & i4) == 306783378) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            OverscrollEffect overscrollEffect2 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
            int i112 = i4 >> 3;
            LazyListItemProvider rememberItemProvider2 = LazyListItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i112 & 14) | (i9 & 112));
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo2 = (LazyListBeyondBoundsInfo) rememberedValue;
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Boolean valueOf2 = Boolean.valueOf(z2);
            startRestartGroup.startReplaceableGroup(511388516);
            changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(state);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new LazyListItemPlacementAnimator(coroutineScope2, z2);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            LazyListItemPlacementAnimator lazyListItemPlacementAnimator2 = (LazyListItemPlacementAnimator) rememberedValue3;
            state.setPlacementAnimator$foundation_release(lazyListItemPlacementAnimator2);
            int i122 = i4 & 112;
            int i132 = MutableVector.$stable;
            int i142 = i4 << 6;
            int i152 = i142 & 458752;
            int i162 = i4;
            Function2 rememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(rememberItemProvider2, state, lazyListBeyondBoundsInfo2, overscrollEffect2, contentPadding, z, z2, horizontal5, vertical6, horizontal6, vertical5, lazyListItemPlacementAnimator2, startRestartGroup, (i112 & 234881024) | (i132 << 6) | i122 | (i142 & 57344) | i152 | (i142 & 3670016) | (i4 & 29360128) | ((i9 << 27) & 1879048192), ((i4 >> 24) & 14) | 64, 0);
            composer2 = startRestartGroup;
            ScrollPositionUpdater(rememberItemProvider2, state, composer2, i122);
            Orientation orientation2 = z2 ? Orientation.Vertical : Orientation.Horizontal;
            Modifier overscroll2 = OverscrollKt.overscroll(LazyListPinningModifierKt.lazyListPinningModifier(LazyBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyListSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider2, state, coroutineScope2, z2, z, z3, composer2, ((i162 << 3) & 896) | 4096 | (i162 & 57344) | i152 | (i162 & 3670016)), orientation2), state, lazyListBeyondBoundsInfo2, z, composer2, (i132 << 6) | i122 | (i162 & 7168)), state, lazyListBeyondBoundsInfo2, composer2, (i132 << 6) | i122), overscrollEffect2);
            composer2.startReplaceableGroup(-908836175);
            if (composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
            }
            composer2.endReplaceableGroup();
            LazyLayoutKt.LazyLayout(rememberItemProvider2, ScrollableKt.scrollable(overscroll2, state, orientation2, overscrollEffect2, z3, z4, flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyListMeasurePolicy2, composer2, 0, 0);
            horizontal3 = horizontal5;
            vertical3 = vertical5;
            vertical4 = vertical6;
            horizontal4 = horizontal6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 |= i10;
        if ((i3 & 64) == 0) {
        }
        i5 = i3 & 128;
        if (i5 != 0) {
        }
        i6 = i3 & 256;
        if (i6 != 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if ((1533916891 & i4) == 306783378) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        OverscrollEffect overscrollEffect22 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
        int i1122 = i4 >> 3;
        LazyListItemProvider rememberItemProvider22 = LazyListItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i1122 & 14) | (i9 & 112));
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo22 = (LazyListBeyondBoundsInfo) rememberedValue;
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        Boolean valueOf22 = Boolean.valueOf(z2);
        startRestartGroup.startReplaceableGroup(511388516);
        changed = startRestartGroup.changed(valueOf22) | startRestartGroup.changed(state);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new LazyListItemPlacementAnimator(coroutineScope22, z2);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        LazyListItemPlacementAnimator lazyListItemPlacementAnimator22 = (LazyListItemPlacementAnimator) rememberedValue3;
        state.setPlacementAnimator$foundation_release(lazyListItemPlacementAnimator22);
        int i1222 = i4 & 112;
        int i1322 = MutableVector.$stable;
        int i1422 = i4 << 6;
        int i1522 = i1422 & 458752;
        int i1622 = i4;
        Function2 rememberLazyListMeasurePolicy22 = rememberLazyListMeasurePolicy(rememberItemProvider22, state, lazyListBeyondBoundsInfo22, overscrollEffect22, contentPadding, z, z2, horizontal5, vertical6, horizontal6, vertical5, lazyListItemPlacementAnimator22, startRestartGroup, (i1122 & 234881024) | (i1322 << 6) | i1222 | (i1422 & 57344) | i1522 | (i1422 & 3670016) | (i4 & 29360128) | ((i9 << 27) & 1879048192), ((i4 >> 24) & 14) | 64, 0);
        composer2 = startRestartGroup;
        ScrollPositionUpdater(rememberItemProvider22, state, composer2, i1222);
        Orientation orientation22 = z2 ? Orientation.Vertical : Orientation.Horizontal;
        Modifier overscroll22 = OverscrollKt.overscroll(LazyListPinningModifierKt.lazyListPinningModifier(LazyBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyListSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider22, state, coroutineScope22, z2, z, z3, composer2, ((i1622 << 3) & 896) | 4096 | (i1622 & 57344) | i1522 | (i1622 & 3670016)), orientation22), state, lazyListBeyondBoundsInfo22, z, composer2, (i1322 << 6) | i1222 | (i1622 & 7168)), state, lazyListBeyondBoundsInfo22, composer2, (i1322 << 6) | i1222), overscrollEffect22);
        composer2.startReplaceableGroup(-908836175);
        if (composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
        }
        composer2.endReplaceableGroup();
        LazyLayoutKt.LazyLayout(rememberItemProvider22, ScrollableKt.scrollable(overscroll22, state, orientation22, overscrollEffect22, z3, z4, flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyListMeasurePolicy22, composer2, 0, 0);
        horizontal3 = horizontal5;
        vertical3 = vertical5;
        vertical4 = vertical6;
        horizontal4 = horizontal6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScrollPositionUpdater(final LazyListItemProvider lazyListItemProvider, final LazyListState lazyListState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(3173830);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(lazyListItemProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (lazyListItemProvider.getItemCount() > 0) {
                lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.LazyListKt$ScrollPositionUpdater$1
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
                LazyListKt.ScrollPositionUpdater(LazyListItemProvider.this, lazyListState, composer2, i | 1);
            }
        });
    }

    private static final Function2 rememberLazyListMeasurePolicy(final LazyListItemProvider lazyListItemProvider, final LazyListState lazyListState, final LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, final OverscrollEffect overscrollEffect, final PaddingValues paddingValues, final boolean z, final boolean z2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, final LazyListItemPlacementAnimator lazyListItemPlacementAnimator, Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(-1404987696);
        Alignment.Horizontal horizontal3 = (i3 & 128) != 0 ? null : horizontal;
        final Alignment.Vertical vertical3 = (i3 & 256) != 0 ? null : vertical;
        Arrangement.Horizontal horizontal4 = (i3 & 512) != 0 ? null : horizontal2;
        Arrangement.Vertical vertical4 = (i3 & 1024) == 0 ? vertical2 : null;
        Object[] objArr = {lazyListState, lazyListBeyondBoundsInfo, overscrollEffect, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal3, vertical3, horizontal4, vertical4, lazyListItemPlacementAnimator};
        composer.startReplaceableGroup(-568225417);
        boolean z3 = false;
        for (int i4 = 0; i4 < 11; i4++) {
            z3 |= composer.changed(objArr[i4]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            final Arrangement.Vertical vertical5 = vertical4;
            final Arrangement.Horizontal horizontal5 = horizontal4;
            final Alignment.Horizontal horizontal6 = horizontal3;
            rememberedValue = new Function2() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m414invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).getValue());
                }

                @NotNull
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m414invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int mo265roundToPx0680j_4;
                    int mo265roundToPx0680j_42;
                    int i5;
                    float spacing;
                    int m2487getMaxWidthimpl;
                    long IntOffset;
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
                        i5 = mo265roundToPx0680j_43;
                    } else if (z4 && z) {
                        i5 = mo265roundToPx0680j_44;
                    } else {
                        i5 = (z4 || z) ? mo265roundToPx0680j_42 : mo265roundToPx0680j_4;
                    }
                    final int i9 = i8 - i5;
                    long m2503offsetNN6EwU = ConstraintsKt.m2503offsetNN6EwU(j, -i7, -i6);
                    lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
                    lazyListState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyListItemProvider.getItemScope().m405setMaxWidth0680j_4(lazyLayoutMeasureScope.mo268toDpu2uoSUM(Constraints.m2487getMaxWidthimpl(m2503offsetNN6EwU)));
                    lazyListItemProvider.getItemScope().m404setMaxHeight0680j_4(lazyLayoutMeasureScope.mo268toDpu2uoSUM(Constraints.m2486getMaxHeightimpl(m2503offsetNN6EwU)));
                    if (z2) {
                        Arrangement.Vertical vertical6 = vertical5;
                        if (vertical6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        spacing = vertical6.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal7 = horizontal5;
                        if (horizontal7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        spacing = horizontal7.getSpacing();
                    }
                    final int mo265roundToPx0680j_45 = lazyLayoutMeasureScope.mo265roundToPx0680j_4(spacing);
                    final int itemCount = lazyListItemProvider.getItemCount();
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
                    final boolean z6 = z2;
                    LazyListItemProvider lazyListItemProvider2 = lazyListItemProvider;
                    final Alignment.Horizontal horizontal8 = horizontal6;
                    final Alignment.Vertical vertical7 = vertical3;
                    final boolean z7 = z;
                    final LazyListItemPlacementAnimator lazyListItemPlacementAnimator2 = lazyListItemPlacementAnimator;
                    final int i11 = i5;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(m2503offsetNN6EwU, z6, lazyListItemProvider2, lazyLayoutMeasureScope, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                        /* renamed from: createItem-HK0c1C0, reason: not valid java name */
                        public final LazyMeasuredItem mo415createItemHK0c1C0(int i12, Object key, Placeable[] placeables) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(placeables, "placeables");
                            return new LazyMeasuredItem(i12, placeables, z6, horizontal8, vertical7, lazyLayoutMeasureScope.getLayoutDirection(), z7, i11, i9, lazyListItemPlacementAnimator2, i12 == itemCount + (-1) ? 0 : mo265roundToPx0680j_45, j2, key, null);
                        }
                    }, null);
                    lazyListState.m426setPremeasureConstraintsBRTryo0$foundation_release(lazyMeasuredItemProvider.getChildConstraints());
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyListState lazyListState2 = lazyListState;
                    Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                        try {
                            int m396constructorimpl = DataIndex.m396constructorimpl(lazyListState2.getFirstVisibleItemIndex());
                            int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
                            Unit unit = Unit.INSTANCE;
                            createNonObservableSnapshot.dispose();
                            LazyListMeasureResult m416measureLazyList7Xnphek = LazyListMeasureKt.m416measureLazyList7Xnphek(itemCount, lazyMeasuredItemProvider, i10, i5, i9, m396constructorimpl, firstVisibleItemScrollOffset, lazyListState.getScrollToBeConsumed(), m2503offsetNN6EwU, z2, lazyListItemProvider.getHeaderIndexes(), vertical5, horizontal5, z, lazyLayoutMeasureScope, lazyListItemPlacementAnimator, lazyListBeyondBoundsInfo, new Function3() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.2
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
                            LazyListState lazyListState3 = lazyListState;
                            OverscrollEffect overscrollEffect2 = overscrollEffect;
                            lazyListState3.applyMeasureResult$foundation_release(m416measureLazyList7Xnphek);
                            LazyListKt.refreshOverscrollInfo(overscrollEffect2, m416measureLazyList7Xnphek);
                            return m416measureLazyList7Xnphek;
                        } finally {
                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                        }
                    } catch (Throwable th) {
                        createNonObservableSnapshot.dispose();
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2 function2 = (Function2) rememberedValue;
        composer.endReplaceableGroup();
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshOverscrollInfo(OverscrollEffect overscrollEffect, LazyListMeasureResult lazyListMeasureResult) {
        boolean canScrollForward = lazyListMeasureResult.getCanScrollForward();
        LazyMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        overscrollEffect.setEnabled(canScrollForward || ((firstVisibleItem != null ? firstVisibleItem.getIndex() : 0) != 0 || lazyListMeasureResult.getFirstVisibleItemScrollOffset() != 0));
    }
}
