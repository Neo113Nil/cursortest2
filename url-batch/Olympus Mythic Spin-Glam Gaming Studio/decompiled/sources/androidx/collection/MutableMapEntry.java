package androidx.collection;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00028\u00018VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001e"}, d2 = {"Landroidx/collection/MutableMapEntry;", "K", "V", "", "", "", "keys", "values", "", "index", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;I)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "getValues", "I", "getIndex", "()I", "getKey", "()Ljava/lang/Object;", "getKey$annotations", "()V", "key", "getValue", "getValue$annotations", "value", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
    private final int index;
    private final Object[] keys;
    private final Object[] values;

    public MutableMapEntry(Object[] keys, Object[] values, int i) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.keys = keys;
        this.values = values;
        this.index = i;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object newValue) {
        Object[] objArr = this.values;
        int i = this.index;
        Object obj = objArr[i];
        objArr[i] = newValue;
        return obj;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.keys[this.index];
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.values[this.index];
    }
}
