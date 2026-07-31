package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* compiled from: SnapshotStateMap.kt */
@Stable
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001EB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0006J!\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u00132\u0014\u0010%\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010*\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b)\u0010\u0018R$\u0010+\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R,\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u00105\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R \u00108\u001a\b\u0012\u0004\u0012\u00028\u0001078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R&\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078@X\u0080\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "Landroidx/compose/runtime/snapshots/StateObject;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "", "currentModification", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "newMap", "", "attemptUpdate", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Z", "commitUpdate", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)I", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "key", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", "removeValue$runtime", "removeValue", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "", "", "entries", "Ljava/util/Set;", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "", "values", "Ljava/util/Collection;", "getValues", "()Ljava/util/Collection;", "getSize", "()I", "size", "getModification$runtime", "modification", "getReadable$runtime", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime$annotations", "readable", "StateMapStateRecord", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, KMutableMap {
    private final Set entries;
    private StateRecord firstStateRecord;
    private final Set keys;
    private final Collection values;

    public SnapshotStateMap() {
        PersistentMap persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(currentSnapshot.getSnapshotId(), persistentHashMapOf);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateMapStateRecord.setNext$runtime(new StateMapStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentHashMapOf));
        }
        this.firstStateRecord = stateMapStateRecord;
        this.entries = new SnapshotMapEntrySet(this);
        this.keys = new SnapshotMapKeySet(this);
        this.values = new SnapshotMapValueSet(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return getValues();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (StateMapStateRecord) value;
    }

    public int getSize() {
        return getReadable$runtime().getMap().size();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return getReadable$runtime().getMap().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return getReadable$runtime().getMap().containsValue(value);
    }

    @Override // java.util.Map
    public Object get(Object key) {
        return getReadable$runtime().getMap().get(key);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime().getMap().isEmpty();
    }

    public Set getEntries() {
        return this.entries;
    }

    public Set getKeys() {
        return this.keys;
    }

    public Collection getValues() {
        return this.values;
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap() + ")@" + hashCode();
    }

    public final int getModification$runtime() {
        return getReadable$runtime().getModification();
    }

    public final boolean removeValue$runtime(Object value) {
        Object obj;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Map.Entry) obj).getValue(), value)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    public final StateMapStateRecord getReadable$runtime() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) firstStateRecord, this);
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap();
        PersistentMap persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentHashMapOf != stateMapStateRecord.getMap()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), persistentHashMapOf);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public Object put(Object key, Object value) {
        Object obj;
        PersistentMap map;
        int modification;
        V put;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map = stateMapStateRecord.getMap();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map);
            PersistentMap.Builder builder = map.builder();
            put = builder.put(key, value);
            PersistentMap build = builder.build();
            if (Intrinsics.areEqual(build, map)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Object obj;
        PersistentMap map;
        int modification;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map = stateMapStateRecord.getMap();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map);
            PersistentMap.Builder builder = map.builder();
            builder.putAll(from);
            PersistentMap build = builder.build();
            if (Intrinsics.areEqual(build, map)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.Map
    public Object remove(Object key) {
        Object obj;
        PersistentMap map;
        int modification;
        V remove;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map = stateMapStateRecord.getMap();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map);
            PersistentMap.Builder builder = map.builder();
            remove = builder.remove(key);
            PersistentMap build = builder.build();
            if (Intrinsics.areEqual(build, map)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean attemptUpdate(StateMapStateRecord stateMapStateRecord, int i, PersistentMap persistentMap) {
        Object obj;
        boolean z;
        obj = SnapshotStateMapKt.sync;
        synchronized (obj) {
            if (stateMapStateRecord.getModification() == i) {
                stateMapStateRecord.setMap$runtime(persistentMap);
                z = true;
                stateMapStateRecord.setModification$runtime(stateMapStateRecord.getModification() + 1);
            } else {
                z = false;
            }
        }
        return z;
    }

    private final int commitUpdate(StateMapStateRecord stateMapStateRecord, PersistentMap persistentMap) {
        Object obj;
        int modification;
        obj = SnapshotStateMapKt.sync;
        synchronized (obj) {
            stateMapStateRecord.setMap$runtime(persistentMap);
            modification = stateMapStateRecord.getModification();
            stateMapStateRecord.setModification$runtime(modification + 1);
        }
        return modification;
    }

    /* compiled from: SnapshotStateMap.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B)\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0019\u0010\u0018\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0002\u0010\u0019R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", "V", "Landroidx/compose/runtime/snapshots/StateRecord;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "<init>", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "getMap$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "modification", "", "getModification$runtime", "()I", "setModification$runtime", "(I)V", "assign", "", "value", "create", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        private PersistentMap map;
        private int modification;

        /* renamed from: getMap$runtime, reason: from getter */
        public final PersistentMap getMap() {
            return this.map;
        }

        public final void setMap$runtime(PersistentMap persistentMap) {
            this.map = persistentMap;
        }

        public StateMapStateRecord(long j, PersistentMap persistentMap) {
            super(j);
            this.map = persistentMap;
        }

        /* renamed from: getModification$runtime, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setModification$runtime(int i) {
            this.modification = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord value) {
            Object obj;
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) value;
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateMapStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.map);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long snapshotId) {
            return new StateMapStateRecord(snapshotId, this.map);
        }
    }
}
