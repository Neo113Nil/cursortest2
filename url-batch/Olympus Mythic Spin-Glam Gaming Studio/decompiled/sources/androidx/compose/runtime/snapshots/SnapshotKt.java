package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aI\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\"\u0010#\u001a)\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010&\u001a-\u0010'\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010+\u001a/\u0010-\u001a\u00020\u00132\n\u0010\r\u001a\u00060\u0000j\u0002`\u00012\n\u0010,\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010.\u001a+\u0010-\u001a\u00020\u00132\u0006\u00100\u001a\u00020/2\n\u0010)\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u00101\u001a7\u00104\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001e*\u00020/2\u0006\u00102\u001a\u00028\u00002\n\u00103\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105\u001a#\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u000206¢\u0006\u0004\b4\u00108\u001a\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0019\u0010<\u001a\u0004\u0018\u00010/2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b<\u0010=\u001a\u0017\u0010>\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b>\u0010?\u001a\u000f\u0010@\u001a\u00020\tH\u0002¢\u0006\u0004\b@\u0010&\u001a\u0017\u0010A\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bA\u0010B\u001a-\u0010C\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u0002062\u0006\u0010)\u001a\u00020\fH\u0001¢\u0006\u0004\bC\u0010D\u001a5\u0010F\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u0002062\u0006\u0010)\u001a\u00020\f2\u0006\u0010E\u001a\u00028\u0000H\u0000¢\u0006\u0004\bF\u0010G\u001a-\u0010H\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u0002062\u0006\u0010)\u001a\u00020\fH\u0000¢\u0006\u0004\bH\u0010D\u001a-\u0010I\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u0002062\u0006\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\bI\u0010D\u001a%\u0010J\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/*\u00028\u00002\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\bJ\u00108\u001a\u001f\u0010K\u001a\u00020\t2\u0006\u0010)\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\bK\u0010L\u001a9\u0010R\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0018\u00010Q2\n\u0010M\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020\u0003H\u0002¢\u0006\u0004\bR\u0010S\u001a\u000f\u0010T\u001a\u000209H\u0002¢\u0006\u0004\bT\u0010;\u001a)\u0010U\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/2\u0006\u00102\u001a\u00028\u00002\u0006\u0010)\u001a\u00020\fH\u0001¢\u0006\u0004\bU\u0010V\u001a!\u0010U\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020/2\u0006\u00102\u001a\u00028\u0000H\u0001¢\u0006\u0004\bU\u0010W\u001a+\u0010Z\u001a\u00020\u0003*\u00020\u00032\n\u0010X\u001a\u00060\u0000j\u0002`\u00012\n\u0010Y\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\bZ\u0010[\" \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]\"\u0018\u0010^\u001a\u00060\u0000j\u0002`\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\f0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b\"$\u0010d\u001a\u00060\u0011j\u0002`c8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bd\u0010e\u0012\u0004\bh\u0010&\u001a\u0004\bf\u0010g\"\u0016\u0010i\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j\"\u001a\u0010k\u001a\u00060\u0000j\u0002`\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010_\"\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n\"\u001a\u0010p\u001a\b\u0012\u0004\u0012\u0002060o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q\"4\u0010u\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0s0r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010v\"(\u0010w\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00100r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010v\"\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010x\" \u0010y\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\by\u0010z\u0012\u0004\b|\u0010&\u001a\u0004\b{\u0010\u000e\"\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0080\u0001"}, d2 = {"", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "", "trackPinning", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)I", "handle", "", "releasePinningLocked", "(I)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "createTransparentSnapshotWithNoParentReadObserver", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/runtime/snapshots/Snapshot;", "parentObserver", "mergeReadObserver", "mergedReadObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;", "writeObserver", "mergedWriteObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "T", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "globalSnapshot", "block", "resetGlobalSnapshotLocked", "(Landroidx/compose/runtime/snapshots/GlobalSnapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "advanceGlobalSnapshot", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "()V", "takeNewSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "validateOpen", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "candidateSnapshot", "valid", "(JJLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "Landroidx/compose/runtime/snapshots/StateRecord;", "data", "(Landroidx/compose/runtime/snapshots/StateRecord;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "r", "id", "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "readError", "()Ljava/lang/Void;", "usedLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "overwriteUnusedRecordsLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)Z", "checkAndOverwriteUnusedRecordsLocked", "processForUnusedRecordsLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "writableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "newWritableRecordLocked", "newOverwritableRecordLocked", "notifyWrite", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V", "currentSnapshotId", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "", "optimisticMerges", "(JLandroidx/compose/runtime/snapshots/MutableSnapshot;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Ljava/util/Map;", "reportReadonlySnapshotWrite", "current", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "from", "until", "addRange", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;JJ)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "emptyLambda", "Lkotlin/jvm/functions/Function1;", "INVALID_SNAPSHOT", "J", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "threadSnapshot", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "openSnapshots", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "extraStateObjects", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", "Lkotlin/Function2;", "", "applyObservers", "Ljava/util/List;", "globalWriteObservers", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "snapshotInitializer", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "Landroidx/compose/runtime/internal/AtomicInt;", "pendingApplyObserverCount", "Landroidx/compose/runtime/internal/AtomicInt;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapshotKt {
    private static final long INVALID_SNAPSHOT = 0;
    private static List applyObservers;
    private static final SnapshotWeakSet extraStateObjects;
    private static final GlobalSnapshot globalSnapshot;
    private static List globalWriteObservers;
    private static long nextSnapshotId;
    private static SnapshotIdSet openSnapshots;
    private static AtomicInt pendingApplyObserverCount;
    private static final SnapshotDoubleIndexHeap pinningTable;
    private static final Snapshot snapshotInitializer;
    private static final Function1 emptyLambda = new Function1() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit emptyLambda$lambda$1;
            emptyLambda$lambda$1 = SnapshotKt.emptyLambda$lambda$1((SnapshotIdSet) obj);
            return emptyLambda$lambda$1;
        }
    };
    private static final SnapshotThreadLocal threadSnapshot = new SnapshotThreadLocal();
    private static final Object lock = new Object();

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, long j, long j2) {
        while (Intrinsics.compare(j, j2) < 0) {
            snapshotIdSet = snapshotIdSet.set(j);
            j++;
        }
        return snapshotIdSet;
    }

    public static final int trackPinning(long j, SnapshotIdSet snapshotIdSet) {
        int add;
        long lowest = snapshotIdSet.lowest(j);
        synchronized (getLock()) {
            add = pinningTable.add(lowest);
        }
        return add;
    }

    public static final void releasePinningLocked(int i) {
        pinningTable.remove(i);
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = (Snapshot) threadSnapshot.get();
        return snapshot == null ? globalSnapshot : snapshot;
    }

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        openSnapshots = companion.getEMPTY();
        long j = 1;
        nextSnapshotId = SnapshotId_jvmKt.toSnapshotId(1) + j;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet();
        applyObservers = CollectionsKt.emptyList();
        globalWriteObservers = CollectionsKt.emptyList();
        long j2 = nextSnapshotId;
        nextSnapshotId = j + j2;
        GlobalSnapshot globalSnapshot2 = new GlobalSnapshot(j2, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot2.getSnapshotId());
        globalSnapshot = globalSnapshot2;
        snapshotInitializer = globalSnapshot2;
        pendingApplyObserverCount = new AtomicInt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emptyLambda$lambda$1(SnapshotIdSet snapshotIdSet) {
        return Unit.INSTANCE;
    }

    static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, function1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, Function1 function1, boolean z) {
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (z2 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z2 ? (MutableSnapshot) snapshot : null, function1, null, false, z);
        }
        return new TransparentObserverSnapshot(snapshot, function1, false, z);
    }

    static /* synthetic */ Function1 mergedReadObserver$default(Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return mergedReadObserver(function1, function12, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 mergedReadObserver(final Function1 function1, final Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        if (function1 == null || function12 == null || function1 == function12) {
            return function1 == null ? function12 : function1;
        }
        return new Function1() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit mergedReadObserver$lambda$2;
                mergedReadObserver$lambda$2 = SnapshotKt.mergedReadObserver$lambda$2(Function1.this, function12, obj);
                return mergedReadObserver$lambda$2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mergedReadObserver$lambda$2(Function1 function1, Function1 function12, Object obj) {
        function1.invoke(obj);
        function12.invoke(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 mergedWriteObserver(final Function1 function1, final Function1 function12) {
        if (function1 == null || function12 == null || function1 == function12) {
            return function1 == null ? function12 : function1;
        }
        return new Function1() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit mergedWriteObserver$lambda$3;
                mergedWriteObserver$lambda$3 = SnapshotKt.mergedWriteObserver$lambda$3(Function1.this, function12, obj);
                return mergedWriteObserver$lambda$3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mergedWriteObserver$lambda$3(Function1 function1, Function1 function12, Object obj) {
        function1.invoke(obj);
        function12.invoke(obj);
        return Unit.INSTANCE;
    }

    public static final Object getLock() {
        return lock;
    }

    public static final StateRecord newWritableRecord(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord newWritableRecordLocked;
        synchronized (getLock()) {
            newWritableRecordLocked = newWritableRecordLocked(stateRecord, stateObject, snapshot);
        }
        return newWritableRecordLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, Function1 function1) {
        long snapshotId = globalSnapshot2.getSnapshotId();
        Object invoke = function1.invoke(openSnapshots.clear(snapshotId));
        long j = nextSnapshotId;
        nextSnapshotId = 1 + j;
        openSnapshots = openSnapshots.clear(snapshotId);
        globalSnapshot2.setSnapshotId$runtime(j);
        globalSnapshot2.setInvalid$runtime(openSnapshots);
        globalSnapshot2.setWriteCount$runtime(0);
        globalSnapshot2.setModified$runtime(null);
        globalSnapshot2.releasePinnedSnapshotLocked$runtime();
        openSnapshots = openSnapshots.set(j);
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object advanceGlobalSnapshot(Function1 function1) {
        MutableScatterSet modified$runtime;
        Object resetGlobalSnapshotLocked;
        GlobalSnapshot globalSnapshot2 = globalSnapshot;
        synchronized (getLock()) {
            try {
                modified$runtime = globalSnapshot2.getModified$runtime();
                if (modified$runtime != null) {
                    pendingApplyObserverCount.add(1);
                }
                resetGlobalSnapshotLocked = resetGlobalSnapshotLocked(globalSnapshot2, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (modified$runtime != null) {
            try {
                List list = applyObservers;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Function2) list.get(i)).invoke(ScatterSetWrapperKt.wrapIntoSet(modified$runtime), globalSnapshot2);
                }
            } finally {
                pendingApplyObserverCount.add(-1);
            }
        }
        synchronized (getLock()) {
            try {
                checkAndOverwriteUnusedRecordsLocked();
                if (modified$runtime != null) {
                    Object[] objArr = modified$runtime.elements;
                    long[] jArr = modified$runtime.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        processForUnusedRecordsLocked((StateObject) objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return resetGlobalSnapshotLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(emptyLambda);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot takeNewSnapshot(final Function1 function1) {
        return (Snapshot) advanceGlobalSnapshot(new Function1() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Snapshot takeNewSnapshot$lambda$12;
                takeNewSnapshot$lambda$12 = SnapshotKt.takeNewSnapshot$lambda$12(Function1.this, (SnapshotIdSet) obj);
                return takeNewSnapshot$lambda$12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot takeNewSnapshot$lambda$12(Function1 function1, SnapshotIdSet snapshotIdSet) {
        Snapshot snapshot = (Snapshot) function1.invoke(snapshotIdSet);
        synchronized (getLock()) {
            openSnapshots = openSnapshots.set(snapshot.getSnapshotId());
            Unit unit = Unit.INSTANCE;
        }
        return snapshot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        long lowestOrDefault;
        if (openSnapshots.get(snapshot.getSnapshotId())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: snapshotId=");
        sb.append(snapshot.getSnapshotId());
        sb.append(", disposed=");
        sb.append(snapshot.getDisposed());
        sb.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied$runtime()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (getLock()) {
            lowestOrDefault = pinningTable.lowestOrDefault(-1L);
        }
        sb.append(lowestOrDefault);
        throw new IllegalStateException(sb.toString().toString());
    }

    private static final boolean valid(long j, long j2, SnapshotIdSet snapshotIdSet) {
        return (j2 == INVALID_SNAPSHOT || Intrinsics.compare(j2, j) > 0 || snapshotIdSet.get(j2)) ? false : true;
    }

    private static final boolean valid(StateRecord stateRecord, long j, SnapshotIdSet snapshotIdSet) {
        return valid(j, stateRecord.getSnapshotId(), snapshotIdSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateRecord readable(StateRecord stateRecord, long j, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord2 = null;
        while (stateRecord != null) {
            if (valid(stateRecord, j, snapshotIdSet) && (stateRecord2 == null || Intrinsics.compare(stateRecord2.getSnapshotId(), stateRecord.getSnapshotId()) < 0)) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext();
        }
        if (stateRecord2 != null) {
            return stateRecord2;
        }
        return null;
    }

    public static final StateRecord readable(StateRecord stateRecord, StateObject stateObject) {
        StateRecord readable;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        Function1 readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        StateRecord readable2 = readable(stateRecord, current.getSnapshotId(), current.getInvalid());
        if (readable2 != null) {
            return readable2;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            readable = readable(firstStateRecord, current2.getSnapshotId(), current2.getInvalid());
            if (readable == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return readable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        long lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.INSTANCE.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            if (firstStateRecord.getSnapshotId() == INVALID_SNAPSHOT) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, lowestOrDefault, empty)) {
                if (stateRecord != null) {
                    return Intrinsics.compare(firstStateRecord.getSnapshotId(), stateRecord.getSnapshotId()) < 0 ? firstStateRecord : stateRecord;
                }
                stateRecord = firstStateRecord;
            }
        }
        return null;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        long lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        int i = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            long snapshotId = firstStateRecord.getSnapshotId();
            if (snapshotId != INVALID_SNAPSHOT) {
                if (Intrinsics.compare(snapshotId, lowestOrDefault) >= 0) {
                    i++;
                } else if (stateRecord2 == null) {
                    i++;
                    stateRecord2 = firstStateRecord;
                } else {
                    if (Intrinsics.compare(firstStateRecord.getSnapshotId(), stateRecord2.getSnapshotId()) < 0) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord;
                    } else {
                        stateRecord = firstStateRecord;
                    }
                    if (stateRecord3 == null) {
                        stateRecord3 = stateObject.getFirstStateRecord();
                        StateRecord stateRecord4 = stateRecord3;
                        while (true) {
                            if (stateRecord3 == null) {
                                stateRecord3 = stateRecord4;
                                break;
                            }
                            if (Intrinsics.compare(stateRecord3.getSnapshotId(), lowestOrDefault) >= 0) {
                                break;
                            }
                            if (Intrinsics.compare(stateRecord4.getSnapshotId(), stateRecord3.getSnapshotId()) < 0) {
                                stateRecord4 = stateRecord3;
                            }
                            stateRecord3 = stateRecord3.getNext();
                        }
                    }
                    stateRecord2.setSnapshotId$runtime(INVALID_SNAPSHOT);
                    stateRecord2.assign(stateRecord3);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet snapshotWeakSet = extraStateObjects;
        int size = snapshotWeakSet.getSize();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            WeakReference weakReference = snapshotWeakSet.getValues()[i];
            Object obj = weakReference != null ? weakReference.get() : null;
            if (obj != null && overwriteUnusedRecordsLocked((StateObject) obj)) {
                if (i2 != i) {
                    snapshotWeakSet.getValues()[i2] = weakReference;
                    snapshotWeakSet.getHashes()[i2] = snapshotWeakSet.getHashes()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size; i3++) {
            snapshotWeakSet.getValues()[i3] = null;
            snapshotWeakSet.getHashes()[i3] = 0;
        }
        if (i2 != size) {
            snapshotWeakSet.setSize$runtime(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    public static final StateRecord writableRecord(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord readable;
        if (snapshot.getReadOnly()) {
            snapshot.mo1214recordModified$runtime(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        StateRecord readable2 = readable(stateRecord, snapshotId, snapshot.getInvalid());
        if (readable2 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (readable2.getSnapshotId() == snapshot.getSnapshotId()) {
            return readable2;
        }
        synchronized (getLock()) {
            readable = readable(stateObject.getFirstStateRecord(), snapshotId, snapshot.getInvalid());
            if (readable == null) {
                readError();
                throw new KotlinNothingValueException();
            }
            if (readable.getSnapshotId() != snapshotId) {
                readable = newWritableRecordLocked(readable, stateObject, snapshot);
            }
        }
        Intrinsics.checkNotNull(readable, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (readable2.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo1214recordModified$runtime(stateObject);
        }
        return readable;
    }

    public static final StateRecord overwritableRecord(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot, StateRecord stateRecord2) {
        StateRecord newOverwritableRecordLocked;
        if (snapshot.getReadOnly()) {
            snapshot.mo1214recordModified$runtime(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        if (stateRecord2.getSnapshotId() == snapshotId) {
            return stateRecord2;
        }
        synchronized (getLock()) {
            newOverwritableRecordLocked = newOverwritableRecordLocked(stateRecord, stateObject);
        }
        newOverwritableRecordLocked.setSnapshotId$runtime(snapshotId);
        if (stateRecord2.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo1214recordModified$runtime(stateObject);
        }
        return newOverwritableRecordLocked;
    }

    private static final StateRecord newWritableRecordLocked(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord newOverwritableRecordLocked = newOverwritableRecordLocked(stateRecord, stateObject);
        newOverwritableRecordLocked.assign(stateRecord);
        newOverwritableRecordLocked.setSnapshotId$runtime(snapshot.getSnapshotId());
        return newOverwritableRecordLocked;
    }

    public static final StateRecord newOverwritableRecordLocked(StateRecord stateRecord, StateObject stateObject) {
        StateRecord usedLocked = usedLocked(stateObject);
        if (usedLocked != null) {
            usedLocked.setSnapshotId$runtime(Long.MAX_VALUE);
            return usedLocked;
        }
        StateRecord create = stateRecord.create(Long.MAX_VALUE);
        create.setNext$runtime(stateObject.getFirstStateRecord());
        Intrinsics.checkNotNull(create, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        stateObject.prependStateRecord(create);
        Intrinsics.checkNotNull(create, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return create;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        snapshot.setWriteCount$runtime(snapshot.getWriteCount$runtime() + 1);
        Function1 writeObserver = snapshot.getWriteObserver();
        if (writeObserver != null) {
            writeObserver.invoke(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map optimisticMerges(long j, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        HashMap hashMap;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr2;
        HashMap hashMap2;
        SnapshotIdSet snapshotIdSet3;
        long j2 = j;
        MutableScatterSet modified$runtime = mutableSnapshot.getModified$runtime();
        HashMap hashMap3 = null;
        if (modified$runtime == null) {
            return null;
        }
        SnapshotIdSet or = mutableSnapshot.getInvalid().set(mutableSnapshot.getSnapshotId()).or(mutableSnapshot.getPreviousIds$runtime());
        Object[] objArr = modified$runtime.elements;
        long[] jArr3 = modified$runtime.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            HashMap hashMap4 = null;
            int i = 0;
            while (true) {
                long j3 = jArr3[i];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j3) < 128) {
                            StateObject stateObject = (StateObject) objArr[(i << 3) + i4];
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            StateRecord readable = readable(firstStateRecord, j2, snapshotIdSet);
                            if (readable == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                StateRecord readable2 = readable(firstStateRecord, j2, or);
                                if (readable2 != null && !Intrinsics.areEqual(readable, readable2)) {
                                    snapshotIdSet3 = or;
                                    StateRecord readable3 = readable(firstStateRecord, mutableSnapshot.getSnapshotId(), mutableSnapshot.getInvalid());
                                    if (readable3 == null) {
                                        readError();
                                        throw new KotlinNothingValueException();
                                    }
                                    StateRecord mergeRecords = stateObject.mergeRecords(readable2, readable, readable3);
                                    if (mergeRecords == null) {
                                        return null;
                                    }
                                    if (hashMap4 == null) {
                                        hashMap4 = new HashMap();
                                    }
                                    hashMap4.put(readable, mergeRecords);
                                    hashMap4 = hashMap4;
                                    hashMap2 = null;
                                }
                            }
                            snapshotIdSet3 = or;
                            hashMap2 = null;
                        } else {
                            jArr2 = jArr3;
                            hashMap2 = hashMap3;
                            snapshotIdSet3 = or;
                        }
                        j3 >>= 8;
                        i4++;
                        hashMap3 = hashMap2;
                        i2 = 8;
                        jArr3 = jArr2;
                        or = snapshotIdSet3;
                        j2 = j;
                    }
                    jArr = jArr3;
                    hashMap = hashMap3;
                    snapshotIdSet2 = or;
                    if (i3 != i2) {
                        return hashMap4;
                    }
                } else {
                    jArr = jArr3;
                    hashMap = hashMap3;
                    snapshotIdSet2 = or;
                }
                if (i == length) {
                    hashMap3 = hashMap4;
                    break;
                }
                i++;
                hashMap3 = hashMap;
                jArr3 = jArr;
                or = snapshotIdSet2;
                j2 = j;
            }
        }
        return hashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final StateRecord current(StateRecord stateRecord, Snapshot snapshot) {
        StateRecord readable;
        StateRecord readable2 = readable(stateRecord, snapshot.getSnapshotId(), snapshot.getInvalid());
        if (readable2 != null) {
            return readable2;
        }
        synchronized (getLock()) {
            readable = readable(stateRecord, snapshot.getSnapshotId(), snapshot.getInvalid());
        }
        if (readable != null) {
            return readable;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final StateRecord current(StateRecord stateRecord) {
        StateRecord readable;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        StateRecord readable2 = readable(stateRecord, current.getSnapshotId(), current.getInvalid());
        if (readable2 != null) {
            return readable2;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            readable = readable(stateRecord, current2.getSnapshotId(), current2.getInvalid());
        }
        if (readable != null) {
            return readable;
        }
        readError();
        throw new KotlinNothingValueException();
    }
}
