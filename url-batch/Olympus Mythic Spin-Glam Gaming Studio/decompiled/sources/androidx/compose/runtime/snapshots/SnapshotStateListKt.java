package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnapshotStateList.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001a\"\u0018\u0010\"\u001a\u00060 j\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"$\u0010&\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\"0\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"T", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Function1;", "", "", "block", "mutateBoolean", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/jvm/functions/Function1;)Z", "Landroidx/compose/runtime/snapshots/StateListStateRecord;", "", "currentModification", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "newList", "structural", "attemptUpdate", "(Landroidx/compose/runtime/snapshots/StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z", "list", "Landroidx/compose/runtime/snapshots/StateRecord;", "stateRecordWith", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)Landroidx/compose/runtime/snapshots/StateRecord;", "size", "init", "SnapshotStateList", "(ILkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "modificationError", "()Ljava/lang/Void;", "index", "", "validateRange", "(II)V", "invalidIteratorSet", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "sync", "Ljava/lang/Object;", "getStructure", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)I", "structure", "getReadable", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Landroidx/compose/runtime/snapshots/StateListStateRecord;", "getReadable$annotations", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "readable", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SnapshotStateListKt {
    private static final Object sync = new Object();

    public static final int getStructure(SnapshotStateList snapshotStateList) {
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getStructuralChange$runtime();
    }

    public static final boolean mutateBoolean(SnapshotStateList snapshotStateList, Function1 function1) {
        int modification$runtime;
        PersistentList list$runtime;
        Object invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime);
            PersistentList.Builder builder = list$runtime.builder();
            invoke = function1.invoke(builder);
            PersistentList build = builder.build();
            if (Intrinsics.areEqual(build, list$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, build, true);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
        return ((Boolean) invoke).booleanValue();
    }

    public static final boolean attemptUpdate(StateListStateRecord stateListStateRecord, int i, PersistentList persistentList, boolean z) {
        boolean z2;
        synchronized (sync) {
            try {
                if (stateListStateRecord.getModification$runtime() == i) {
                    stateListStateRecord.setList$runtime(persistentList);
                    z2 = true;
                    if (z) {
                        stateListStateRecord.setStructuralChange$runtime(stateListStateRecord.getStructuralChange$runtime() + 1);
                    }
                    stateListStateRecord.setModification$runtime(stateListStateRecord.getModification$runtime() + 1);
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final StateRecord stateRecordWith(SnapshotStateList snapshotStateList, PersistentList persistentList) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(currentSnapshot.getSnapshotId(), persistentList);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateListStateRecord.setNext$runtime(new StateListStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentList));
        }
        return stateListStateRecord;
    }

    public static final StateListStateRecord getReadable(SnapshotStateList snapshotStateList) {
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, snapshotStateList);
    }

    public static final SnapshotStateList SnapshotStateList(int i, Function1 function1) {
        if (i == 0) {
            return new SnapshotStateList();
        }
        PersistentList.Builder builder = ExtensionsKt.persistentListOf().builder();
        for (int i2 = 0; i2 < i; i2++) {
            builder.add(function1.invoke(Integer.valueOf(i2)));
        }
        return new SnapshotStateList(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateRange(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void invalidIteratorSet() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }
}
