package androidx.compose.runtime.snapshots.tooling;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: SnapshotObserver.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aq\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\r0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0012\u001aA\u0010\u0015\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "Landroidx/compose/runtime/snapshots/Snapshot;", "parent", "", "readonly", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "Lkotlin/Pair;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "", "mergeObservers", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "a", "b", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "result", "observerMap", "dispatchCreatedObservers", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V", "snapshot", "dispatchObserverOnPreDispose", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "changes", "dispatchObserverOnApplied", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/collection/ScatterSet;)V", "observers", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getObservers$annotations", "()V", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnapshotObserverKt {
    private static PersistentList observers;

    public static final void dispatchCreatedObservers(PersistentList persistentList, Snapshot snapshot, Snapshot snapshot2, Map map) {
        int size = persistentList.size();
        for (int i = 0; i < size; i++) {
            SnapshotObserver snapshotObserver = (SnapshotObserver) persistentList.get(i);
            snapshotObserver.onCreated(snapshot2, snapshot, map != null ? (SnapshotInstanceObservers) map.get(snapshotObserver) : null);
        }
    }

    public static final Pair mergeObservers(PersistentList persistentList, Snapshot snapshot, boolean z, Function1 function1, Function1 function12) {
        int size = persistentList.size();
        LinkedHashMap linkedHashMap = null;
        for (int i = 0; i < size; i++) {
            SnapshotObserver snapshotObserver = (SnapshotObserver) persistentList.get(i);
            SnapshotInstanceObservers onPreCreate = snapshotObserver.onPreCreate(snapshot, z);
            if (onPreCreate != null) {
                function1 = mergeObservers(onPreCreate.getReadObserver(), function1);
                function12 = mergeObservers(onPreCreate.getWriteObserver(), function12);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, onPreCreate);
            }
        }
        return TuplesKt.to(new SnapshotInstanceObservers(function1, function12), linkedHashMap);
    }

    private static final Function1 mergeObservers(final Function1 function1, final Function1 function12) {
        if (function1 == null || function12 == null) {
            return function1 == null ? function12 : function1;
        }
        return new Function1() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit mergeObservers$lambda$6;
                mergeObservers$lambda$6 = SnapshotObserverKt.mergeObservers$lambda$6(Function1.this, function12, obj);
                return mergeObservers$lambda$6;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mergeObservers$lambda$6(Function1 function1, Function1 function12, Object obj) {
        function1.invoke(obj);
        function12.invoke(obj);
        return Unit.INSTANCE;
    }

    public static final void dispatchObserverOnPreDispose(Snapshot snapshot) {
        PersistentList persistentList = observers;
        if (persistentList != null) {
            int size = persistentList.size();
            for (int i = 0; i < size; i++) {
                ((SnapshotObserver) persistentList.get(i)).onPreDispose(snapshot);
            }
        }
    }

    public static final void dispatchObserverOnApplied(Snapshot snapshot, ScatterSet scatterSet) {
        Set emptySet;
        PersistentList persistentList = observers;
        if (persistentList == null || persistentList.isEmpty()) {
            return;
        }
        if (scatterSet == null || (emptySet = ScatterSetWrapperKt.wrapIntoSet(scatterSet)) == null) {
            emptySet = SetsKt.emptySet();
        }
        int size = persistentList.size();
        for (int i = 0; i < size; i++) {
            ((SnapshotObserver) persistentList.get(i)).onApplied(snapshot, emptySet);
        }
    }
}
