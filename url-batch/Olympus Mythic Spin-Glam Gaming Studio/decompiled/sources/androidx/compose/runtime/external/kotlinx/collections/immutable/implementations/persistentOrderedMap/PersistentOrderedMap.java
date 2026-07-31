package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;

/* compiled from: PersistentOrderedMap.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 .*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001.B5\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "", "firstKey", "lastKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "createEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Ljava/lang/Object;", "getFirstKey$runtime", "()Ljava/lang/Object;", "getLastKey$runtime", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getHashMap$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "getSize", "()I", "size", "getKeys", "keys", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "values", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PersistentOrderedMap<K, V> extends AbstractMap implements PersistentMap<K, V> {
    private static final PersistentOrderedMap EMPTY;
    private final Object firstKey;
    private final PersistentHashMap hashMap;
    private final Object lastKey;
    public static final int $stable = 8;

    /* renamed from: getFirstKey$runtime, reason: from getter */
    public final Object getFirstKey() {
        return this.firstKey;
    }

    /* renamed from: getLastKey$runtime, reason: from getter */
    public final Object getLastKey() {
        return this.lastKey;
    }

    /* renamed from: getHashMap$runtime, reason: from getter */
    public final PersistentHashMap getHashMap() {
        return this.hashMap;
    }

    public PersistentOrderedMap(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        this.firstKey = obj;
        this.lastKey = obj2;
        this.hashMap = persistentHashMap;
    }

    @Override // kotlin.collections.AbstractMap
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractMap
    public ImmutableSet getKeys() {
        return new PersistentOrderedMapKeys(this);
    }

    @Override // kotlin.collections.AbstractMap
    public ImmutableCollection getValues() {
        return new PersistentOrderedMapValues(this);
    }

    private final ImmutableSet createEntries() {
        return new PersistentOrderedMapEntries(this);
    }

    @Override // kotlin.collections.AbstractMap
    public final Set getEntries() {
        return createEntries();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.hashMap.containsKey(key);
    }

    @Override // java.util.Map
    public Object get(Object key) {
        LinkedValue linkedValue = (LinkedValue) this.hashMap.get(key);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap.Builder builder() {
        return new PersistentOrderedMapBuilder(this);
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedMap(endOfChain, endOfChain, PersistentHashMap.INSTANCE.emptyOf$runtime());
    }
}
