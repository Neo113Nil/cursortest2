package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0010'\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bR\u0016\u0010\u0002\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\u00028\u0001X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0005\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"androidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1", "", "key", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "value", "getValue", "setValue", "(Ljava/lang/Object;)V", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StateMapMutableEntriesIterator$next$1<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
    private final Object key;
    final /* synthetic */ StateMapMutableEntriesIterator this$0;
    private Object value;

    StateMapMutableEntriesIterator$next$1(StateMapMutableEntriesIterator stateMapMutableEntriesIterator) {
        this.this$0 = stateMapMutableEntriesIterator;
        Map.Entry current = stateMapMutableEntriesIterator.getCurrent();
        Intrinsics.checkNotNull(current);
        this.key = current.getKey();
        Map.Entry current2 = stateMapMutableEntriesIterator.getCurrent();
        Intrinsics.checkNotNull(current2);
        this.value = current2.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public void setValue(Object obj) {
        this.value = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map.Entry
    public Object setValue(Object newValue) {
        StateMapMutableEntriesIterator stateMapMutableEntriesIterator = this.this$0;
        if (stateMapMutableEntriesIterator.getMap().getModification$runtime() != ((StateMapMutableIterator) stateMapMutableEntriesIterator).modification) {
            throw new ConcurrentModificationException();
        }
        Object value = getValue();
        stateMapMutableEntriesIterator.getMap().put(getKey(), newValue);
        setValue(newValue);
        return value;
    }
}
