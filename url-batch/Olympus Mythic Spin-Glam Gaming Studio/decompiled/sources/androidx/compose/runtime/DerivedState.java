package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.System_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001+B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/DerivedState;", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "readable", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "forceDependencyReads", "currentRecord", "(Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "", "displayValue", "()Ljava/lang/String;", "Landroidx/compose/runtime/snapshots/StateRecord;", "current", "(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "toString", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "Landroidx/compose/runtime/DerivedState$Record;", "getCurrentRecord", "()Landroidx/compose/runtime/DerivedState$Record;", "ResultRecord", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.DerivedSnapshotState, reason: from toString */
/* loaded from: classes.dex */
final class DerivedState<T> extends StateObjectImpl implements androidx.compose.runtime.DerivedState<T> {
    private final Function0 calculation;
    private ResultRecord first = new ResultRecord(SnapshotKt.currentSnapshot().getSnapshotId());
    private final SnapshotMutationPolicy policy;

    @Override // androidx.compose.runtime.DerivedState
    public SnapshotMutationPolicy getPolicy() {
        return this.policy;
    }

    public DerivedState(Function0 function0, SnapshotMutationPolicy snapshotMutationPolicy) {
        this.calculation = function0;
        this.policy = snapshotMutationPolicy;
    }

    /* compiled from: DerivedState.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\r\b\u0007\u0018\u0000 9*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00019B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00172\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u00060\u0004j\u0002`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR\"\u0010\u001f\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010 \u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u0014\u00108\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00101¨\u0006:"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "value", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState;", "derivedState", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "isValid", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)Z", "", "readableHash", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)I", "validSnapshotId", "J", "getValidSnapshotId", "()J", "setValidSnapshotId", "validSnapshotWriteCount", "I", "getValidSnapshotWriteCount", "()I", "setValidSnapshotWriteCount", "(I)V", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "dependencies", "Landroidx/collection/ObjectIntMap;", "getDependencies", "()Landroidx/collection/ObjectIntMap;", "setDependencies", "(Landroidx/collection/ObjectIntMap;)V", "", "result", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "resultHash", "getResultHash", "setResultHash", "getCurrentValue", "currentValue", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.DerivedSnapshotState$ResultRecord */
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {
        private ObjectIntMap dependencies;
        private Object result;
        private int resultHash;
        private long validSnapshotId;
        private int validSnapshotWriteCount;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final Object Unset = new Object();

        /* compiled from: DerivedState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "<init>", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.DerivedSnapshotState$ResultRecord$Companion, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Object getUnset() {
                return ResultRecord.Unset;
            }
        }

        public ResultRecord(long j) {
            super(j);
            this.dependencies = ObjectIntMapKt.emptyObjectIntMap();
            this.result = Unset;
        }

        public final void setValidSnapshotId(long j) {
            this.validSnapshotId = j;
        }

        public final void setValidSnapshotWriteCount(int i) {
            this.validSnapshotWriteCount = i;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public ObjectIntMap getDependencies() {
            return this.dependencies;
        }

        public void setDependencies(ObjectIntMap objectIntMap) {
            this.dependencies = objectIntMap;
        }

        public final Object getResult() {
            return this.result;
        }

        public final void setResult(Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i) {
            this.resultHash = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) value;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long snapshotId) {
            return new ResultRecord(snapshotId);
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        /* renamed from: getCurrentValue, reason: from getter */
        public Object getResult() {
            return this.result;
        }

        public final boolean isValid(androidx.compose.runtime.DerivedState derivedState, Snapshot snapshot) {
            boolean z;
            boolean z2;
            synchronized (SnapshotKt.getLock()) {
                z = true;
                if (this.validSnapshotId == snapshot.getSnapshotId()) {
                    if (this.validSnapshotWriteCount == snapshot.getWriteCount()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.result == Unset || (z2 && this.resultHash != readableHash(derivedState, snapshot))) {
                z = false;
            }
            if (z && z2) {
                synchronized (SnapshotKt.getLock()) {
                    this.validSnapshotId = snapshot.getSnapshotId();
                    this.validSnapshotWriteCount = snapshot.getWriteCount();
                    Unit unit = Unit.INSTANCE;
                }
            }
            return z;
        }

        public final int readableHash(androidx.compose.runtime.DerivedState derivedState, Snapshot snapshot) {
            ObjectIntMap dependencies;
            int i;
            int i2;
            StateRecord current;
            synchronized (SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            char c = 7;
            if (!dependencies.isNotEmpty()) {
                return 7;
            }
            MutableVector derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            Object[] objArr = derivedStateObservers.content;
            int size = derivedStateObservers.getSize();
            for (int i3 = 0; i3 < size; i3++) {
                ((DerivedStateObserver) objArr[i3]).start(derivedState);
            }
            try {
                Object[] objArr2 = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 7;
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    int i9 = (i5 << 3) + i8;
                                    StateObject stateObject = (StateObject) objArr2[i9];
                                    if (iArr[i9] == 1) {
                                        if (stateObject instanceof DerivedState) {
                                            current = ((DerivedState) stateObject).current(snapshot);
                                        } else {
                                            current = SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                                        }
                                        i4 = (((i4 * 31) + System_jvmKt.identityHashCode(current)) * 31) + Long.hashCode(current.getSnapshotId());
                                    }
                                    i2 = 8;
                                } else {
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8++;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        c = 7;
                    }
                    i = i4;
                } else {
                    i = 7;
                }
                Unit unit = Unit.INSTANCE;
                Object[] objArr3 = derivedStateObservers.content;
                int size2 = derivedStateObservers.getSize();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((DerivedStateObserver) objArr3[i10]).done(derivedState);
                }
                return i;
            } catch (Throwable th) {
                Object[] objArr4 = derivedStateObservers.content;
                int size3 = derivedStateObservers.getSize();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((DerivedStateObserver) objArr4[i11]).done(derivedState);
                }
                throw th;
            }
        }
    }

    public final StateRecord current(Snapshot snapshot) {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    /* JADX WARN: Finally extract failed */
    private final ResultRecord currentRecord(ResultRecord readable, Snapshot snapshot, boolean forceDependencyReads, Function0 calculation) {
        SnapshotThreadLocal snapshotThreadLocal;
        Snapshot.Companion companion;
        SnapshotThreadLocal snapshotThreadLocal2;
        SnapshotMutationPolicy policy;
        SnapshotThreadLocal snapshotThreadLocal3;
        SnapshotThreadLocal snapshotThreadLocal4;
        int i;
        int i2;
        SnapshotThreadLocal snapshotThreadLocal5;
        ResultRecord resultRecord = readable;
        int i3 = 1;
        if (!resultRecord.isValid(this, snapshot)) {
            int i4 = 0;
            final MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
            snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
            final IntRef intRef = (IntRef) snapshotThreadLocal.get();
            if (intRef == null) {
                intRef = new IntRef(0);
                snapshotThreadLocal3 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                snapshotThreadLocal3.set(intRef);
            }
            final int element = intRef.getElement();
            MutableVector derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            Object[] objArr = derivedStateObservers.content;
            int size = derivedStateObservers.getSize();
            for (int i5 = 0; i5 < size; i5++) {
                ((DerivedStateObserver) objArr[i5]).start(this);
            }
            try {
                intRef.setElement(element + 1);
                Object observe = Snapshot.INSTANCE.observe(new Function1() { // from class: androidx.compose.runtime.DerivedSnapshotState$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit currentRecord$lambda$5$lambda$4$lambda$3;
                        currentRecord$lambda$5$lambda$4$lambda$3 = DerivedState.currentRecord$lambda$5$lambda$4$lambda$3(DerivedState.this, intRef, mutableObjectIntMap, element, obj);
                        return currentRecord$lambda$5$lambda$4$lambda$3;
                    }
                }, null, calculation);
                intRef.setElement(element);
                Object[] objArr2 = derivedStateObservers.content;
                int size2 = derivedStateObservers.getSize();
                while (i4 < size2) {
                    ((DerivedStateObserver) objArr2[i4]).done(this);
                    i4++;
                }
                synchronized (SnapshotKt.getLock()) {
                    try {
                        companion = Snapshot.INSTANCE;
                        Snapshot current = companion.getCurrent();
                        if (readable.getResult() == ResultRecord.INSTANCE.getUnset() || (policy = getPolicy()) == null || !policy.equivalent(observe, readable.getResult())) {
                            resultRecord = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                            resultRecord.setDependencies(mutableObjectIntMap);
                            resultRecord.setResultHash(resultRecord.readableHash(this, current));
                            resultRecord.setResult(observe);
                        } else {
                            resultRecord.setDependencies(mutableObjectIntMap);
                            resultRecord.setResultHash(resultRecord.readableHash(this, current));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                snapshotThreadLocal2 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                IntRef intRef2 = (IntRef) snapshotThreadLocal2.get();
                if (intRef2 != null && intRef2.getElement() == 0) {
                    companion.notifyObjectsInitialized();
                    synchronized (SnapshotKt.getLock()) {
                        Snapshot current2 = companion.getCurrent();
                        resultRecord.setValidSnapshotId(current2.getSnapshotId());
                        resultRecord.setValidSnapshotWriteCount(current2.getWriteCount());
                        Unit unit = Unit.INSTANCE;
                    }
                }
                return resultRecord;
            } catch (Throwable th2) {
                Object[] objArr3 = derivedStateObservers.content;
                int size3 = derivedStateObservers.getSize();
                while (i4 < size3) {
                    ((DerivedStateObserver) objArr3[i4]).done(this);
                    i4++;
                }
                throw th2;
            }
        }
        if (forceDependencyReads) {
            MutableVector derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
            Object[] objArr4 = derivedStateObservers2.content;
            int size4 = derivedStateObservers2.getSize();
            for (int i6 = 0; i6 < size4; i6++) {
                ((DerivedStateObserver) objArr4[i6]).start(this);
            }
            try {
                ObjectIntMap dependencies = readable.getDependencies();
                snapshotThreadLocal4 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                IntRef intRef3 = (IntRef) snapshotThreadLocal4.get();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    snapshotThreadLocal5 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                    snapshotThreadLocal5.set(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr5 = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        long[] jArr2 = jArr;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j & 255) < 128) {
                                    int i11 = (i7 << 3) + i10;
                                    StateObject stateObject = (StateObject) objArr5[i11];
                                    intRef3.setElement(element2 + iArr[i11]);
                                    Function1 readObserver = snapshot.getReadObserver();
                                    if (readObserver != null) {
                                        readObserver.invoke(stateObject);
                                    }
                                    i2 = 8;
                                } else {
                                    i2 = i8;
                                }
                                j >>= i2;
                                i10++;
                                i8 = i2;
                                i3 = 1;
                            }
                            int i12 = i8;
                            i = i3;
                            if (i9 != i12) {
                                break;
                            }
                        } else {
                            i = i3;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7 += i;
                        i3 = i;
                        jArr = jArr2;
                    }
                }
                intRef3.setElement(element2);
                Unit unit2 = Unit.INSTANCE;
                Object[] objArr6 = derivedStateObservers2.content;
                int size5 = derivedStateObservers2.getSize();
                for (int i13 = 0; i13 < size5; i13++) {
                    ((DerivedStateObserver) objArr6[i13]).done(this);
                }
            } catch (Throwable th3) {
                Object[] objArr7 = derivedStateObservers2.content;
                int size6 = derivedStateObservers2.getSize();
                for (int i14 = 0; i14 < size6; i14++) {
                    ((DerivedStateObserver) objArr7[i14]).done(this);
                }
                throw th3;
            }
        }
        return resultRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit currentRecord$lambda$5$lambda$4$lambda$3(DerivedState derivedState, IntRef intRef, MutableObjectIntMap mutableObjectIntMap, int i, Object obj) {
        if (obj == derivedState) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof StateObject) {
            mutableObjectIntMap.set(obj, Math.min(intRef.getElement() - i, mutableObjectIntMap.getOrDefault(obj, Integer.MAX_VALUE)));
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (ResultRecord) value;
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Function1 readObserver = companion.getCurrent().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        Snapshot current = companion.getCurrent();
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.DerivedState
    public DerivedState.Record getCurrentRecord() {
        Snapshot current = Snapshot.INSTANCE.getCurrent();
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, false, this.calculation);
    }

    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.INSTANCE.getCurrent())) {
            return String.valueOf(resultRecord.getResult());
        }
        return "<Not calculated>";
    }
}
