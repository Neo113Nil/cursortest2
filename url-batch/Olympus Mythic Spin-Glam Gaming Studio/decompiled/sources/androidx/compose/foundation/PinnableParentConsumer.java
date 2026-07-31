package androidx.compose.foundation;

import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Focusable.kt */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R%\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/PinnableParentConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/PinnableParent;", "", "onPinnableParentAvailable", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/jvm/functions/Function1;", "getOnPinnableParentAvailable", "()Lkotlin/jvm/functions/Function1;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
final class PinnableParentConsumer implements ModifierLocalConsumer {
    private final Function1 onPinnableParentAvailable;

    public PinnableParentConsumer(Function1 onPinnableParentAvailable) {
        Intrinsics.checkNotNullParameter(onPinnableParentAvailable, "onPinnableParentAvailable");
        this.onPinnableParentAvailable = onPinnableParentAvailable;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.onPinnableParentAvailable.invoke(scope.getCurrent(PinnableParentKt.getModifierLocalPinnableParent()));
    }

    public boolean equals(Object other) {
        return (other instanceof PinnableParentConsumer) && Intrinsics.areEqual(((PinnableParentConsumer) other).onPinnableParentAvailable, this.onPinnableParentAvailable);
    }

    public int hashCode() {
        return this.onPinnableParentAvailable.hashCode();
    }
}
