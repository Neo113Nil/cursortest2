package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnapshotStateSet.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"$\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"T", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "Lkotlin/Function1;", "", "", "block", "mutateBoolean", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Lkotlin/jvm/functions/Function1;)Z", "Landroidx/compose/runtime/snapshots/StateSetStateRecord;", "", "currentModification", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "newSet", "attemptUpdate", "(Landroidx/compose/runtime/snapshots/StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z", "set", "Landroidx/compose/runtime/snapshots/StateRecord;", "stateRecordWith", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "sync", "Ljava/lang/Object;", "getModification", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)I", "modification", "getReadable", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)Landroidx/compose/runtime/snapshots/StateSetStateRecord;", "getReadable$annotations", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)V", "readable", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SnapshotStateSetKt {
    private static final Object sync = new Object();

    public static final StateSetStateRecord getReadable(SnapshotStateSet snapshotStateSet) {
        StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (StateSetStateRecord) SnapshotKt.readable((StateSetStateRecord) firstStateRecord, snapshotStateSet);
    }

    public static final int getModification(SnapshotStateSet snapshotStateSet) {
        StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getModification$runtime();
    }

    public static final boolean mutateBoolean(SnapshotStateSet snapshotStateSet, Function1 function1) {
        int modification$runtime;
        PersistentSet set$runtime;
        PersistentSet.Builder builder;
        Object invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime = stateSetStateRecord.getModification$runtime();
                set$runtime = stateSetStateRecord.getSet$runtime();
                Unit unit = Unit.INSTANCE;
            }
            if (set$runtime != null && (builder = set$runtime.builder()) != null) {
                invoke = function1.invoke(builder);
                PersistentSet build = builder.build();
                if (Intrinsics.areEqual(build, set$runtime)) {
                    break;
                }
                StateRecord firstStateRecord2 = snapshotStateSet.getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.INSTANCE.getCurrent();
                    attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, snapshotStateSet, current), modification$runtime, build);
                }
                SnapshotKt.notifyWrite(current, snapshotStateSet);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!attemptUpdate);
        return ((Boolean) invoke).booleanValue();
    }

    public static final boolean attemptUpdate(StateSetStateRecord stateSetStateRecord, int i, PersistentSet persistentSet) {
        boolean z;
        synchronized (sync) {
            if (stateSetStateRecord.getModification$runtime() == i) {
                stateSetStateRecord.setSet$runtime(persistentSet);
                z = true;
                stateSetStateRecord.setModification$runtime(stateSetStateRecord.getModification$runtime() + 1);
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final StateRecord stateRecordWith(SnapshotStateSet snapshotStateSet, PersistentSet persistentSet) {
        StateSetStateRecord stateSetStateRecord = new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), persistentSet);
        if (Snapshot.INSTANCE.isInSnapshot()) {
            stateSetStateRecord.setNext$runtime(new StateSetStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentSet));
        }
        return stateSetStateRecord;
    }
}
