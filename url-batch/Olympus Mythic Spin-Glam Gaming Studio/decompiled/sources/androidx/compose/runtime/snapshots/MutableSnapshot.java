package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Snapshot.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0019\b\u0017\u0018\u0000 r2\u00020\u0001:\u0001rBI\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0016\u001a\u00020\u00002\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ%\u0010\u001c\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\"\u0010 J\u000f\u0010%\u001a\u00020\tH\u0010¢\u0006\u0004\b$\u0010\u000fJ\u000f\u0010'\u001a\u00020\tH\u0010¢\u0006\u0004\b&\u0010\u000fJ\u000f\u0010)\u001a\u00020\tH\u0010¢\u0006\u0004\b(\u0010\u000fJG\u00104\u001a\u00020\u00182\n\u0010*\u001a\u00060\u0002j\u0002`\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0018\u00010.2\u0006\u00101\u001a\u00020\u0005H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00106\u001a\u00020\tH\u0000¢\u0006\u0004\b5\u0010\u000fJ\u001b\u0010:\u001a\u00020\t2\n\u00107\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010>\u001a\u00020\t2\u0006\u00107\u001a\u00020;H\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010C\u001a\u00020\t2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010G\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u0005H\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010K\u001a\u00020\t2\u0006\u0010H\u001a\u00020,H\u0010¢\u0006\u0004\bI\u0010JR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bM\u0010NR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bO\u0010NR\"\u0010P\u001a\u00020;8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010=R*\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b-\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR*\u0010[\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010a\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010FR\"\u0010f\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010BR\u0016\u0010D\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010QR\"\u0010k\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010\u0015\"\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u0015¨\u0006s"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "validateNotApplied", "()V", "validateNotAppliedOrPinned", "abandon", "releasePreviouslyPinnedSnapshotsLocked", "", "hasPendingChanges", "()Z", "takeNestedMutableSnapshot", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "nestedActivated$runtime", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime", "nestedDeactivated", "notifyObjectsInitialized$runtime", "notifyObjectsInitialized", "closeLocked$runtime", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime", "releasePinnedSnapshotsForCloseLocked", "nextId", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "modified", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "optimisticMerges", "invalidSnapshots", "innerApplyLocked$runtime", "(JLandroidx/collection/MutableScatterSet;Ljava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "innerApplyLocked", "advance$runtime", "advance", "id", "recordPrevious$runtime", "(J)V", "recordPrevious", "", "recordPreviousPinnedSnapshot$runtime", "(I)V", "recordPreviousPinnedSnapshot", "", "handles", "recordPreviousPinnedSnapshots$runtime", "([I)V", "recordPreviousPinnedSnapshots", "snapshots", "recordPreviousList$runtime", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "recordPreviousList", "state", "recordModified$runtime", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime", "()Lkotlin/jvm/functions/Function1;", "getWriteObserver$runtime", "writeCount", "I", "getWriteCount$runtime", "()I", "setWriteCount$runtime", "Landroidx/collection/MutableScatterSet;", "getModified$runtime", "()Landroidx/collection/MutableScatterSet;", "setModified$runtime", "(Landroidx/collection/MutableScatterSet;)V", "", "merged", "Ljava/util/List;", "getMerged$runtime", "()Ljava/util/List;", "setMerged$runtime", "(Ljava/util/List;)V", "previousIds", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getPreviousIds$runtime", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime", "previousPinnedSnapshots", "[I", "getPreviousPinnedSnapshots$runtime", "()[I", "setPreviousPinnedSnapshots$runtime", "applied", "Z", "getApplied$runtime", "setApplied$runtime", "(Z)V", "getReadOnly", "readOnly", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;
    private List merged;
    private MutableScatterSet modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final Function1 readObserver;
    private int snapshots;
    private int writeCount;
    private final Function1 writeObserver;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyIntArray = new int[0];

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: from getter */
    public Function1 getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getWriteObserver$runtime, reason: from getter */
    public Function1 getWriteObserver() {
        return this.writeObserver;
    }

    public MutableSnapshot(long j, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12) {
        super(j, snapshotIdSet, null);
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = SnapshotIdSet.INSTANCE.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    public boolean hasPendingChanges() {
        MutableScatterSet modified = getModified();
        return modified != null && modified.isNotEmpty();
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1 readObserver, Function1 writeObserver) {
        PersistentList persistentList;
        Map map;
        long j;
        long j2;
        long j3;
        SnapshotIdSet snapshotIdSet;
        NestedMutableSnapshot nestedMutableSnapshot;
        Function1 mergedWriteObserver;
        long j4;
        long j5;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime();
        validateNotAppliedOrPinned();
        persistentList = SnapshotObserverKt.observers;
        Function1 function1 = readObserver;
        Function1 function12 = writeObserver;
        if (persistentList != null) {
            Pair mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, false, function1, function12);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) mergeObservers.getFirst();
            Function1 readObserver2 = snapshotInstanceObservers.getReadObserver();
            function12 = snapshotInstanceObservers.getWriteObserver();
            map = (Map) mergeObservers.getSecond();
            function1 = readObserver2;
        } else {
            map = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            j = SnapshotKt.nextSnapshotId;
            j2 = SnapshotKt.nextSnapshotId;
            j3 = 1;
            SnapshotKt.nextSnapshotId = j2 + j3;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(j);
            SnapshotIdSet invalid = getInvalid();
            setInvalid$runtime(invalid.set(j));
            SnapshotIdSet addRange = SnapshotKt.addRange(invalid, getSnapshotId() + j3, j);
            Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null);
            mergedWriteObserver = SnapshotKt.mergedWriteObserver(function12, getWriteObserver());
            nestedMutableSnapshot = new NestedMutableSnapshot(j, addRange, mergedReadObserver$default, mergedWriteObserver, this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                j4 = SnapshotKt.nextSnapshotId;
                j5 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = j5 + j3;
                setSnapshotId$runtime(j4);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId + j3, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedMutableSnapshot, map);
        }
        return nestedMutableSnapshot;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd A[LOOP:1: B:32:0x00db->B:33:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SnapshotApplyResult apply() {
        Map map;
        GlobalSnapshot globalSnapshot;
        Function1 function1;
        List list;
        MutableScatterSet mutableScatterSet;
        List list2;
        int i;
        long j;
        int size;
        int i2;
        GlobalSnapshot globalSnapshot2;
        long j2;
        SnapshotIdSet snapshotIdSet;
        Function1 function12;
        GlobalSnapshot globalSnapshot3;
        SnapshotIdSet snapshotIdSet2;
        Map optimisticMerges;
        MutableScatterSet modified = getModified();
        if (modified != null) {
            globalSnapshot3 = SnapshotKt.globalSnapshot;
            long snapshotId = globalSnapshot3.getSnapshotId();
            snapshotIdSet2 = SnapshotKt.openSnapshots;
            optimisticMerges = SnapshotKt.optimisticMerges(snapshotId, this, snapshotIdSet2.clear(globalSnapshot3.getSnapshotId()));
            map = optimisticMerges;
        } else {
            map = null;
        }
        List emptyList = CollectionsKt.emptyList();
        synchronized (SnapshotKt.getLock()) {
            try {
                SnapshotKt.validateOpen(this);
                if (modified != null && modified.get_size() != 0) {
                    globalSnapshot2 = SnapshotKt.globalSnapshot;
                    j2 = SnapshotKt.nextSnapshotId;
                    snapshotIdSet = SnapshotKt.openSnapshots;
                    SnapshotApplyResult innerApplyLocked$runtime = innerApplyLocked$runtime(j2, modified, map, snapshotIdSet.clear(globalSnapshot2.getSnapshotId()));
                    if (!Intrinsics.areEqual(innerApplyLocked$runtime, SnapshotApplyResult.Success.INSTANCE)) {
                        return innerApplyLocked$runtime;
                    }
                    closeLocked$runtime();
                    mutableScatterSet = globalSnapshot2.getModified();
                    function12 = SnapshotKt.emptyLambda;
                    SnapshotKt.resetGlobalSnapshotLocked(globalSnapshot2, function12);
                    setModified$runtime(null);
                    globalSnapshot2.setModified$runtime(null);
                    list = SnapshotKt.applyObservers;
                    Unit unit = Unit.INSTANCE;
                    this.applied = true;
                    if (mutableScatterSet != null) {
                        Set wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
                        if (!wrapIntoSet.isEmpty()) {
                            int size2 = list.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                ((Function2) list.get(i3)).invoke(wrapIntoSet, this);
                            }
                        }
                    }
                    if (modified != null && modified.isNotEmpty()) {
                        Set wrapIntoSet2 = ScatterSetWrapperKt.wrapIntoSet(modified);
                        size = list.size();
                        for (i2 = 0; i2 < size; i2++) {
                            ((Function2) list.get(i2)).invoke(wrapIntoSet2, this);
                        }
                    }
                    SnapshotObserverKt.dispatchObserverOnApplied(this, modified);
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            releasePinnedSnapshotsForCloseLocked$runtime();
                            SnapshotKt.checkAndOverwriteUnusedRecordsLocked();
                            if (mutableScatterSet != null) {
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr = mutableScatterSet.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j3 = jArr[i4];
                                        long[] jArr2 = jArr;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                                            for (int i6 = 0; i6 < i5; i6++) {
                                                if ((j3 & 255) < 128) {
                                                    SnapshotKt.processForUnusedRecordsLocked((StateObject) objArr[(i4 << 3) + i6]);
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i5 != 8) {
                                                break;
                                            }
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        jArr = jArr2;
                                    }
                                }
                            }
                            if (modified != null) {
                                Object[] objArr2 = modified.elements;
                                long[] jArr3 = modified.metadata;
                                int length2 = jArr3.length - 2;
                                if (length2 >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j4 = jArr3[i7];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                            for (int i9 = 0; i9 < i8; i9++) {
                                                if ((j4 & 255) < 128) {
                                                    SnapshotKt.processForUnusedRecordsLocked((StateObject) objArr2[(i7 << 3) + i9]);
                                                }
                                                j4 >>= 8;
                                            }
                                            i = 1;
                                            j = 255;
                                            if (i8 != 8) {
                                                break;
                                            }
                                        } else {
                                            i = 1;
                                            j = 255;
                                        }
                                        if (i7 == length2) {
                                            break;
                                        }
                                        i7 += i;
                                    }
                                }
                            }
                            List list3 = this.merged;
                            if (list3 != null) {
                                int size3 = list3.size();
                                for (int i10 = 0; i10 < size3; i10++) {
                                    SnapshotKt.processForUnusedRecordsLocked((StateObject) list3.get(i10));
                                }
                            }
                            this.merged = null;
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return SnapshotApplyResult.Success.INSTANCE;
                }
                closeLocked$runtime();
                globalSnapshot = SnapshotKt.globalSnapshot;
                MutableScatterSet modified2 = globalSnapshot.getModified();
                function1 = SnapshotKt.emptyLambda;
                SnapshotKt.resetGlobalSnapshotLocked(globalSnapshot, function1);
                if (modified2 == null || !modified2.isNotEmpty()) {
                    list = emptyList;
                    mutableScatterSet = null;
                } else {
                    list2 = SnapshotKt.applyObservers;
                    list = list2;
                    mutableScatterSet = modified2;
                }
                Unit unit3 = Unit.INSTANCE;
                this.applied = true;
                if (mutableScatterSet != null) {
                }
                if (modified != null) {
                    Set wrapIntoSet22 = ScatterSetWrapperKt.wrapIntoSet(modified);
                    size = list.size();
                    while (i2 < size) {
                    }
                }
                SnapshotObserverKt.dispatchObserverOnApplied(this, modified);
                synchronized (SnapshotKt.getLock()) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        mo1213nestedDeactivated$runtime(this);
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 readObserver) {
        PersistentList persistentList;
        Map map;
        long j;
        long j2;
        long j3;
        SnapshotIdSet snapshotIdSet;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        long j4;
        long j5;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime();
        validateNotAppliedOrPinned();
        long snapshotId = getSnapshotId();
        MutableSnapshot mutableSnapshot = this instanceof GlobalSnapshot ? null : this;
        persistentList = SnapshotObserverKt.observers;
        Function1 function1 = readObserver;
        if (persistentList != null) {
            Pair mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, mutableSnapshot, true, function1, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) mergeObservers.getFirst();
            Function1 readObserver2 = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) mergeObservers.getSecond();
            function1 = readObserver2;
        } else {
            map = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            j = SnapshotKt.nextSnapshotId;
            j2 = SnapshotKt.nextSnapshotId;
            j3 = 1;
            SnapshotKt.nextSnapshotId = j2 + j3;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(j);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(j, SnapshotKt.addRange(getInvalid(), snapshotId + j3, j), SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId2 = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                j4 = SnapshotKt.nextSnapshotId;
                j5 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = j5 + j3;
                setSnapshotId$runtime(j4);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId2 + j3, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, mutableSnapshot, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime */
    public void mo1212nestedActivated$runtime(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime */
    public void mo1213nestedDeactivated$runtime(Snapshot snapshot) {
        if (!(this.snapshots > 0)) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        if (this.applied || getDisposed()) {
            return;
        }
        advance$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getSnapshotId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime();
    }

    private final void validateNotApplied() {
        if (this.applied) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void validateNotAppliedOrPinned() {
        boolean z;
        int i;
        if (this.applied) {
            i = ((Snapshot) this).pinningTrackingHandle;
            if (i < 0) {
                z = false;
                if (z) {
                    PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
                    return;
                }
                return;
            }
        }
        z = true;
        if (z) {
        }
    }

    private final void abandon() {
        long j;
        MutableScatterSet modified = getModified();
        if (modified != null) {
            validateNotApplied();
            setModified$runtime(null);
            long snapshotId = getSnapshotId();
            Object[] objArr = modified.elements;
            long[] jArr = modified.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j2 = jArr[i];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j2) < 128) {
                                for (StateRecord firstStateRecord = ((StateObject) objArr[(i << 3) + i3]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                                    if (firstStateRecord.getSnapshotId() == snapshotId || CollectionsKt.contains(this.previousIds, Long.valueOf(firstStateRecord.getSnapshotId()))) {
                                        j = SnapshotKt.INVALID_SNAPSHOT;
                                        firstStateRecord.setSnapshotId$runtime(j);
                                    }
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        closeAndReleasePinning$runtime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        r2 = androidx.compose.runtime.snapshots.SnapshotKt.readable(r7, getSnapshotId(), r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SnapshotApplyResult innerApplyLocked$runtime(long nextId, MutableScatterSet modified, Map optimisticMerges, SnapshotIdSet invalidSnapshots) {
        SnapshotIdSet snapshotIdSet;
        Object[] objArr;
        long[] jArr;
        int i;
        int i2;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        StateRecord readable;
        StateRecord readable2;
        StateRecord readable3;
        StateRecord mergeRecords;
        long j = nextId;
        SnapshotIdSet or = getInvalid().set(getSnapshotId()).or(this.previousIds);
        Object[] objArr3 = modified.elements;
        long[] jArr3 = modified.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List list = null;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j2 = jArr3[i4];
                List list2 = list;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j2 & 255) < 128) {
                            StateObject stateObject = (StateObject) objArr3[(i4 << 3) + i6];
                            objArr2 = objArr3;
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            jArr2 = jArr3;
                            readable = SnapshotKt.readable(firstStateRecord, j, invalidSnapshots);
                            if (readable == null || readable2 == null || readable2.getSnapshotId() == SnapshotId_jvmKt.toSnapshotId(1) || Intrinsics.areEqual(readable, readable2)) {
                                snapshotIdSet2 = or;
                            } else {
                                i3 = length;
                                snapshotIdSet2 = or;
                                readable3 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), getInvalid());
                                if (readable3 == null) {
                                    SnapshotKt.readError();
                                    throw new KotlinNothingValueException();
                                }
                                if (optimisticMerges == null || (mergeRecords = (StateRecord) optimisticMerges.get(readable)) == null) {
                                    mergeRecords = stateObject.mergeRecords(readable2, readable, readable3);
                                }
                                if (mergeRecords == null) {
                                    return new SnapshotApplyResult.Failure(this);
                                }
                                if (!Intrinsics.areEqual(mergeRecords, readable3)) {
                                    if (Intrinsics.areEqual(mergeRecords, readable)) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(TuplesKt.to(stateObject, readable.create(getSnapshotId())));
                                        if (list2 == null) {
                                            list2 = new ArrayList();
                                        }
                                        List list3 = list2;
                                        list3.add(stateObject);
                                        list2 = list3;
                                    } else {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(!Intrinsics.areEqual(mergeRecords, readable2) ? TuplesKt.to(stateObject, mergeRecords) : TuplesKt.to(stateObject, readable2.create(getSnapshotId())));
                                    }
                                }
                                j2 >>= 8;
                                i6++;
                                length = i3;
                                objArr3 = objArr2;
                                jArr3 = jArr2;
                                or = snapshotIdSet2;
                                j = nextId;
                            }
                        } else {
                            snapshotIdSet2 = or;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                        }
                        i3 = length;
                        j2 >>= 8;
                        i6++;
                        length = i3;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        or = snapshotIdSet2;
                        j = nextId;
                    }
                    snapshotIdSet = or;
                    objArr = objArr3;
                    jArr = jArr3;
                    i = length;
                    i2 = 1;
                    list = list2;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    snapshotIdSet = or;
                    objArr = objArr3;
                    jArr = jArr3;
                    i = length;
                    i2 = 1;
                    list = list2;
                }
                if (i4 == i) {
                    break;
                }
                i4 += i2;
                length = i;
                objArr3 = objArr;
                jArr3 = jArr;
                or = snapshotIdSet;
                j = nextId;
            }
        }
        if (arrayList != null) {
            advance$runtime();
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Pair pair = (Pair) arrayList.get(i7);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord = (StateRecord) pair.component2();
                stateRecord.setSnapshotId$runtime(nextId);
                synchronized (SnapshotKt.getLock()) {
                    stateRecord.setNext$runtime(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (list != null) {
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                modified.remove((StateObject) list.get(i8));
            }
            List list4 = this.merged;
            if (list4 != null) {
                list = CollectionsKt.plus((Collection) list4, (Iterable) list);
            }
            this.merged = list;
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    public final void advance$runtime() {
        long j;
        long j2;
        long j3;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime(getSnapshotId());
        Unit unit = Unit.INSTANCE;
        if (getApplied() || getDisposed()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            j = SnapshotKt.nextSnapshotId;
            j2 = SnapshotKt.nextSnapshotId;
            j3 = 1;
            SnapshotKt.nextSnapshotId = j2 + j3;
            setSnapshotId$runtime(j);
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(getSnapshotId());
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId + j3, getSnapshotId()));
    }

    public final void recordPreviousPinnedSnapshot$runtime(int id) {
        if (id >= 0) {
            this.previousPinnedSnapshots = ArraysKt.plus(this.previousPinnedSnapshots, id);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = ArraysKt.plus(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i = 0; i < length; i++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i]);
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime */
    public void mo1214recordModified$runtime(StateObject state) {
        MutableScatterSet modified = getModified();
        if (modified == null) {
            modified = ScatterSetKt.mutableScatterSetOf();
            setModified$runtime(modified);
        }
        modified.add(state);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getWriteCount$runtime, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime(int i) {
        this.writeCount = i;
    }

    /* renamed from: getModified$runtime, reason: from getter */
    public MutableScatterSet getModified() {
        return this.modified;
    }

    public void setModified$runtime(MutableScatterSet mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    /* renamed from: getPreviousIds$runtime, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    /* renamed from: getPreviousPinnedSnapshots$runtime, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    /* renamed from: getApplied$runtime, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public final void setApplied$runtime(boolean z) {
        this.applied = z;
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot$Companion;", "", "<init>", "()V", "EmptyIntArray", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void recordPrevious$runtime(long id) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(id);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime(SnapshotIdSet snapshots) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshots);
            Unit unit = Unit.INSTANCE;
        }
    }
}
