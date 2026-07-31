package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyListItemProviderImpl.kt */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\bH\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemProviderImpl;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemsSnapshot", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/LazyListItemsSnapshot;", "(Landroidx/compose/runtime/State;)V", "headerIndexes", "", "", "getHeaderIndexes", "()Ljava/util/List;", "itemCount", "getItemCount", "()I", "itemScope", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "getItemScope", "()Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "keyToIndexMap", "", "", "getKeyToIndexMap", "()Ljava/util/Map;", "Item", "", "index", "(ILandroidx/compose/runtime/Composer;I)V", "getContentType", "getKey", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LazyListItemProviderImpl implements LazyListItemProvider {
    private final LazyItemScopeImpl itemScope;
    private final State itemsSnapshot;

    public LazyListItemProviderImpl(State itemsSnapshot) {
        Intrinsics.checkNotNullParameter(itemsSnapshot, "itemsSnapshot");
        this.itemsSnapshot = itemsSnapshot;
        this.itemScope = new LazyItemScopeImpl();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public List getHeaderIndexes() {
        return ((LazyListItemsSnapshot) this.itemsSnapshot.getValue()).getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return ((LazyListItemsSnapshot) this.itemsSnapshot.getValue()).getItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int index) {
        return ((LazyListItemsSnapshot) this.itemsSnapshot.getValue()).getKey(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public void Item(final int i, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1704733014);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            ((LazyListItemsSnapshot) this.itemsSnapshot.getValue()).Item(getItemScope(), i, startRestartGroup, ((i3 << 3) & 112) | 512);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                LazyListItemProviderImpl.this.Item(i, composer2, i2 | 1);
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Map getKeyToIndexMap() {
        return ((LazyListItemsSnapshot) this.itemsSnapshot.getValue()).getKeyToIndexMap();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int index) {
        return ((LazyListItemsSnapshot) this.itemsSnapshot.getValue()).getContentType(index);
    }
}
