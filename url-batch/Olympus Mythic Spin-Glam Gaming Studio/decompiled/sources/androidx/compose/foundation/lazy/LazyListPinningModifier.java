package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.PinnableParent;
import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyListPinningModifier.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000  2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0002:\u0001 B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPinningModifier;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/lazy/layout/PinnableParent;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;)V", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "Landroidx/compose/foundation/lazy/layout/PinnableParent$PinnedItemsHandle;", "pinItems", "()Landroidx/compose/foundation/lazy/layout/PinnableParent$PinnedItemsHandle;", "Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "pinnableGrandParent", "Landroidx/compose/foundation/lazy/layout/PinnableParent;", "getPinnableGrandParent", "()Landroidx/compose/foundation/lazy/layout/PinnableParent;", "setPinnableGrandParent", "(Landroidx/compose/foundation/lazy/layout/PinnableParent;)V", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "value", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
final class LazyListPinningModifier implements ModifierLocalProvider<PinnableParent>, ModifierLocalConsumer, PinnableParent {
    private static final LazyListPinningModifier$Companion$EmptyPinnedItemsHandle$1 EmptyPinnedItemsHandle = new PinnableParent.PinnedItemsHandle() { // from class: androidx.compose.foundation.lazy.LazyListPinningModifier$Companion$EmptyPinnedItemsHandle$1
        @Override // androidx.compose.foundation.lazy.layout.PinnableParent.PinnedItemsHandle
        public void unpin() {
        }
    };
    private final LazyListBeyondBoundsInfo beyondBoundsInfo;
    private PinnableParent pinnableGrandParent;
    private final LazyListState state;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public PinnableParent getValue() {
        return this;
    }

    public LazyListPinningModifier(LazyListState state, LazyListBeyondBoundsInfo beyondBoundsInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
    }

    public final PinnableParent getPinnableGrandParent() {
        return this.pinnableGrandParent;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return PinnableParentKt.getModifierLocalPinnableParent();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.pinnableGrandParent = (PinnableParent) scope.getCurrent(PinnableParentKt.getModifierLocalPinnableParent());
    }

    @Override // androidx.compose.foundation.lazy.layout.PinnableParent
    public PinnableParent.PinnedItemsHandle pinItems() {
        PinnableParent.PinnedItemsHandle pinItems;
        final LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo = this.beyondBoundsInfo;
        if (lazyListBeyondBoundsInfo.hasIntervals()) {
            return new PinnableParent.PinnedItemsHandle(lazyListBeyondBoundsInfo) { // from class: androidx.compose.foundation.lazy.LazyListPinningModifier$pinItems$1$1
                final /* synthetic */ LazyListBeyondBoundsInfo $this_with;
                private final LazyListBeyondBoundsInfo.Interval interval;
                private final PinnableParent.PinnedItemsHandle parentPinnedItemsHandle;

                {
                    this.$this_with = lazyListBeyondBoundsInfo;
                    PinnableParent pinnableGrandParent = LazyListPinningModifier.this.getPinnableGrandParent();
                    this.parentPinnedItemsHandle = pinnableGrandParent != null ? pinnableGrandParent.pinItems() : null;
                    this.interval = lazyListBeyondBoundsInfo.addInterval(lazyListBeyondBoundsInfo.getStart(), lazyListBeyondBoundsInfo.getEnd());
                }

                @Override // androidx.compose.foundation.lazy.layout.PinnableParent.PinnedItemsHandle
                public void unpin() {
                    LazyListState lazyListState;
                    this.$this_with.removeInterval(this.interval);
                    PinnableParent.PinnedItemsHandle pinnedItemsHandle = this.parentPinnedItemsHandle;
                    if (pinnedItemsHandle != null) {
                        pinnedItemsHandle.unpin();
                    }
                    lazyListState = LazyListPinningModifier.this.state;
                    Remeasurement remeasurement$foundation_release = lazyListState.getRemeasurement$foundation_release();
                    if (remeasurement$foundation_release != null) {
                        remeasurement$foundation_release.forceRemeasure();
                    }
                }
            };
        }
        PinnableParent pinnableParent = this.pinnableGrandParent;
        return (pinnableParent == null || (pinItems = pinnableParent.pinItems()) == null) ? EmptyPinnedItemsHandle : pinItems;
    }
}
