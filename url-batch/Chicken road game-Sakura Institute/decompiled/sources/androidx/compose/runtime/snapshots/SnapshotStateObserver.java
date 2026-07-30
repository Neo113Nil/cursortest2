package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: SnapshotStateObserver.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00017B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\u0016\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0002J\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0001J)\u0010!\u001a\u00020\u00052!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00150\u0003J\b\u0010#\u001a\u00020\u0015H\u0002J&\u0010$\u001a\u00020\u0011\"\b\b\u0000\u0010%*\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u001d\u0010'\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bJ\u001e\u0010)\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010+\u001a\u00020\rH\u0007J?\u0010,\u001a\u00020\u0005\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010 \u001a\u0002H%2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0002J\u001d\u00100\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0003H\u0082\bJ\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u0005H\u0002J\u0006\u00104\u001a\u00020\u0005J\u0006\u00105\u001a\u00020\u0005J\u0016\u00106\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R&\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "callback", "(Lkotlin/jvm/functions/Function1;)V", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "currentMapThreadId", "", "isPaused", "", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "readObserver", "sendingNotifications", "addChanges", "set", "clear", "scope", "clearIf", "predicate", "drainChanges", "ensureMap", "T", "onChanged", "forEachScopeMap", "block", "notifyChanges", "changes", "snapshot", "observeReads", "onValueChangedForScope", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "removeChanges", "removeScopeMapIf", "report", "", "sendNotifications", "start", "stop", "withNoObservations", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
            invoke2(set, snapshot);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Set<? extends Object> set, Snapshot snapshot) {
            boolean drainChanges;
            SnapshotStateObserver.this.addChanges(set);
            drainChanges = SnapshotStateObserver.this.drainChanges();
            if (drainChanges) {
                SnapshotStateObserver.this.sendNotifications();
            }
        }
    };
    private final Function1<Object, Unit> readObserver = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            boolean z;
            MutableVector mutableVector;
            SnapshotStateObserver.ObservedScopeMap observedScopeMap;
            z = SnapshotStateObserver.this.isPaused;
            if (z) {
                return;
            }
            mutableVector = SnapshotStateObserver.this.observedScopeMaps;
            SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
            synchronized (mutableVector) {
                observedScopeMap = snapshotStateObserver.currentMap;
                Intrinsics.checkNotNull(observedScopeMap);
                observedScopeMap.recordRead(obj);
                Unit unit = Unit.INSTANCE;
            }
        }
    };
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(Function1<? super Function0<Unit>, Unit> function1) {
        this.onChangedExecutor = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMaps) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> removeChanges = removeChanges();
            if (removeChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMaps) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        if (!content[i].recordInvalidation(removeChanges) && !z2) {
                            z2 = false;
                            i++;
                        }
                        z2 = true;
                        i++;
                    } while (i < size);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MutableVector mutableVector;
                boolean z;
                boolean drainChanges;
                MutableVector mutableVector2;
                do {
                    mutableVector = SnapshotStateObserver.this.observedScopeMaps;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (mutableVector) {
                        z = snapshotStateObserver.sendingNotifications;
                        if (!z) {
                            snapshotStateObserver.sendingNotifications = true;
                            try {
                                mutableVector2 = snapshotStateObserver.observedScopeMaps;
                                int size = mutableVector2.getSize();
                                if (size > 0) {
                                    Object[] content = mutableVector2.getContent();
                                    int i = 0;
                                    do {
                                        ((SnapshotStateObserver.ObservedScopeMap) content[i]).notifyInvalidatedScopes();
                                        i++;
                                    } while (i < size);
                                }
                                snapshotStateObserver.sendingNotifications = false;
                            } finally {
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    drainChanges = SnapshotStateObserver.this.drainChanges();
                } while (drainChanges);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        List plus;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                plus = set;
            } else if (obj instanceof Set) {
                plus = CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                plus = CollectionsKt.plus((Collection) obj, (Iterable) CollectionsKt.listOf(set));
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pendingChanges, obj, plus));
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                report();
                throw new KotlinNothingValueException();
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pendingChanges, obj, obj2));
        return set;
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    private final void forEachScopeMap(Function1<? super ObservedScopeMap, Unit> block) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        block.invoke(content[i]);
                        i++;
                    } while (i < size);
                }
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    private final void removeScopeMapIf(Function1<? super ObservedScopeMap, Boolean> block) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    if (block.invoke(mutableVector.getContent()[i2]).booleanValue()) {
                        i++;
                    } else if (i > 0) {
                        mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt.fill(mutableVector.getContent(), (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    public final <T> void observeReads(T scope, Function1<? super T, Unit> onValueChangedForScope, Function0<Unit> block) {
        ObservedScopeMap ensureMap;
        synchronized (this.observedScopeMaps) {
            ensureMap = ensureMap(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j = this.currentMapThreadId;
        if (j != -1) {
            if (!(j == ActualJvm_jvmKt.currentThreadId())) {
                PreconditionsKt.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + ActualJvm_jvmKt.currentThreadId() + ", name=" + ActualJvm_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = ensureMap;
            this.currentMapThreadId = ActualJvm_jvmKt.currentThreadId();
            ensureMap.observe(scope, this.readObserver, block);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z;
            this.currentMapThreadId = j;
        }
    }

    @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(Function0<Unit> block) {
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    public final void notifyChanges(Set<? extends Object> changes, Snapshot snapshot) {
        this.applyObserver.invoke(changes, snapshot);
    }

    private final <T> ObservedScopeMap ensureMap(Function1<? super T, Unit> onChanged) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ObservedScopeMap[] content = mutableVector.getContent();
            int i = 0;
            do {
                observedScopeMap = content[i];
                if (observedScopeMap.getOnChanged() == onChanged) {
                    break;
                }
                i++;
            } while (i < size);
        }
        observedScopeMap = null;
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        Intrinsics.checkNotNull(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onChanged, 1));
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001f\u001a\u00020\u0004J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0001H\u0002J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0001J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0004J0\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)J\u0014\u0010*\u001a\u00020$2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010,J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0001J.\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0002J\u0018\u00100\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002J)\u00101\u001a\u00020\u00042!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020$0\u0003J\u0012\u00105\u001a\u00020\u00042\n\u00106\u001a\u0006\u0012\u0002\b\u00030\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R6\u0010\u0017\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "onChanged", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "currentScope", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "currentToken", "", "dependencyToDerivedStates", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/DerivedState;", "deriveStateScopeCount", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "invalidated", "Landroidx/collection/MutableScatterSet;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "scopeToValues", "Landroidx/collection/MutableScatterMap;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "valueToScopes", "clear", "clearObsoleteStateReads", "scope", "clearScopeObservations", "hasScopeObservations", "", "notifyInvalidatedScopes", "observe", "readObserver", "block", "Lkotlin/Function0;", "recordInvalidation", "changes", "", "recordRead", "value", "recordedValues", "removeObservation", "removeScopeIf", "predicate", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "rereadDerivedState", "derivedState", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class ObservedScopeMap {
        private Object currentScope;
        private MutableObjectIntMap<Object> currentScopeReads;
        private int deriveStateScopeCount;
        private final MutableScatterSet<Object> invalidated;
        private final Function1<Object, Unit> onChanged;
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues;
        private int currentToken = -1;
        private final ScopeMap<Object, Object> valueToScopes = new ScopeMap<>();
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                int i;
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                i = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i + 1;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                int i;
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                i = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i - 1;
            }
        };
        private final ScopeMap<Object, DerivedState<?>> dependencyToDerivedStates = new ScopeMap<>();
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(Function1<Object, Unit> function1) {
            this.onChanged = function1;
            int i = 0;
            int i2 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            this.scopeToValues = new MutableScatterMap<>(i, i2, defaultConstructorMarker);
            this.invalidated = new MutableScatterSet<>(i, i2, defaultConstructorMarker);
        }

        public final Function1<Object, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final void recordRead(Object value) {
            Object obj = this.currentScope;
            Intrinsics.checkNotNull(obj);
            int i = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj, mutableObjectIntMap);
                Unit unit = Unit.INSTANCE;
            }
            recordRead(value, i, obj, mutableObjectIntMap);
        }

        private final void recordRead(Object value, int currentToken, Object currentScope, MutableObjectIntMap<Object> recordedValues) {
            int i;
            int i2;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int put = recordedValues.put(value, currentToken, -1);
            if (!(value instanceof DerivedState) || put == currentToken) {
                i = -1;
            } else {
                DerivedState.Record currentRecord = ((DerivedState) value).getCurrentRecord();
                this.recordedDerivedStateValues.put(value, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                ScopeMap<Object, DerivedState<?>> scopeMap = this.dependencyToDerivedStates;
                scopeMap.removeScope(value);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j & 255) < 128) {
                                    StateObject stateObject = (StateObject) objArr[(i3 << 3) + i6];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ReaderKind.Companion companion = ReaderKind.INSTANCE;
                                        ((StateObjectImpl) stateObject).m3444recordReadInh_f27i8$runtime_release(ReaderKind.m3431constructorimpl(2));
                                    }
                                    scopeMap.add(stateObject, value);
                                    i2 = 8;
                                } else {
                                    i2 = i4;
                                }
                                j >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                i = -1;
            }
            if (put == i) {
                if (value instanceof StateObjectImpl) {
                    ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                    ((StateObjectImpl) value).m3444recordReadInh_f27i8$runtime_release(ReaderKind.m3431constructorimpl(2));
                }
                this.valueToScopes.add(value, currentScope);
            }
        }

        public final void observe(Object scope, Function1<Object, Unit> readObserver, Function0<Unit> block) {
            Object obj = this.currentScope;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.get(scope);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.INSTANCE.observe(readObserver, null, block);
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                Object obj2 = this.currentScope;
                Intrinsics.checkNotNull(obj2);
                clearObsoleteStateReads(obj2);
                this.currentScope = obj;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i;
            } catch (Throwable th) {
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        private final void clearObsoleteStateReads(Object scope) {
            int i = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                return;
            }
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = mutableObjectIntMap.keys[i5];
                            boolean z = mutableObjectIntMap.values[i5] != i;
                            if (z) {
                                removeObservation(scope, obj);
                            }
                            if (z) {
                                mutableObjectIntMap.removeValueAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        public final void clearScopeObservations(Object scope) {
            MutableObjectIntMap<Object> remove = this.scopeToValues.remove(scope);
            if (remove == null) {
                return;
            }
            MutableObjectIntMap<Object> mutableObjectIntMap = remove;
            Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            int i5 = iArr[i4];
                            removeObservation(scope, obj);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        public final void removeScopeIf(Function1<Object, Boolean> predicate) {
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            long j;
            int i3;
            long j2;
            int i4;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j3 = jArr3[i5];
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & 255) < 128) {
                            int i9 = (i5 << 3) + i8;
                            Object obj = mutableScatterMap.keys[i9];
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.values[i9];
                            Boolean invoke = predicate.invoke(obj);
                            if (invoke.booleanValue()) {
                                MutableObjectIntMap mutableObjectIntMap2 = mutableObjectIntMap;
                                Object[] objArr = mutableObjectIntMap2.keys;
                                int[] iArr = mutableObjectIntMap2.values;
                                long[] jArr4 = mutableObjectIntMap2.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i3 = i7;
                                    int i10 = 0;
                                    while (true) {
                                        long j5 = jArr4[i10];
                                        i2 = i5;
                                        j = j3;
                                        j2 = -9187201950435737472L;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                if ((j5 & 255) < 128) {
                                                    int i13 = (i10 << 3) + i12;
                                                    Object obj2 = objArr[i13];
                                                    int i14 = iArr[i13];
                                                    removeObservation(obj, obj2);
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i11 != 8) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        i5 = i2;
                                        j3 = j;
                                    }
                                } else {
                                    i2 = i5;
                                    j = j3;
                                    i3 = i7;
                                    j2 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                j = j3;
                                i3 = i7;
                                j2 = j4;
                            }
                            if (invoke.booleanValue()) {
                                mutableScatterMap.removeValueAt(i9);
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr3;
                            i2 = i5;
                            j = j3;
                            i3 = i7;
                            j2 = j4;
                            i4 = i6;
                        }
                        j3 = j >> i4;
                        i8++;
                        i6 = i4;
                        j4 = j2;
                        jArr3 = jArr2;
                        i7 = i3;
                        i5 = i2;
                    }
                    jArr = jArr3;
                    int i15 = i5;
                    if (i7 != i6) {
                        return;
                    } else {
                        i = i15;
                    }
                } else {
                    jArr = jArr3;
                    i = i5;
                }
                if (i == length) {
                    return;
                }
                i5 = i + 1;
                jArr3 = jArr;
            }
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        private final void removeObservation(Object scope, Object value) {
            this.valueToScopes.remove(value, scope);
            if (!(value instanceof DerivedState) || this.valueToScopes.contains(value)) {
                return;
            }
            this.dependencyToDerivedStates.removeScope(value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
        
            if (((androidx.compose.runtime.snapshots.StateObjectImpl) r14).m3443isReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m3431constructorimpl(2)) == false) goto L122;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean recordInvalidation(Set<? extends Object> changes) {
            boolean z;
            Iterator it;
            HashMap<DerivedState<?>, Object> hashMap;
            Object obj;
            String str;
            int i;
            char c;
            Object obj2;
            char c2;
            HashMap<DerivedState<?>, Object> hashMap2;
            long[] jArr;
            Object[] objArr;
            Iterator it2;
            HashMap<DerivedState<?>, Object> hashMap3;
            Object obj3;
            ScopeMap<Object, DerivedState<?>> scopeMap;
            long[] jArr2;
            Object[] objArr2;
            int i2;
            String str2;
            long[] jArr3;
            long[] jArr4;
            char c3;
            long[] jArr5;
            ScopeMap<Object, DerivedState<?>> scopeMap2;
            HashMap<DerivedState<?>, Object> hashMap4;
            ScopeMap<Object, Object> scopeMap3;
            Object[] objArr3;
            String str3;
            int i3;
            long[] jArr6;
            ScopeMap<Object, DerivedState<?>> scopeMap4;
            HashMap<DerivedState<?>, Object> hashMap5;
            ScopeMap<Object, Object> scopeMap5;
            Object[] objArr4;
            String str4;
            int i4;
            int i5;
            long j;
            int i6;
            Object obj4;
            int i7;
            char c4;
            Object obj5;
            char c5;
            HashMap<DerivedState<?>, Object> hashMap6;
            Object[] objArr5;
            ScopeMap<Object, DerivedState<?>> scopeMap6;
            HashMap<DerivedState<?>, Object> hashMap7;
            ScopeMap<Object, Object> scopeMap7;
            String str5;
            long j2;
            Object obj6;
            Object[] objArr6;
            ScopeMap<Object, Object> scopeMap8;
            char c6;
            ScopeMap<Object, DerivedState<?>> scopeMap9 = this.dependencyToDerivedStates;
            HashMap<DerivedState<?>, Object> hashMap8 = this.recordedDerivedStateValues;
            ScopeMap<Object, Object> scopeMap10 = this.valueToScopes;
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            String str6 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            char c7 = 7;
            long j3 = -9187201950435737472L;
            int i8 = 0;
            if (changes instanceof ScatterSetWrapper) {
                ScatterSet set$runtime_release = ((ScatterSetWrapper) changes).getSet$runtime_release();
                Object[] objArr7 = set$runtime_release.elements;
                long[] jArr7 = set$runtime_release.metadata;
                int length = jArr7.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    z = false;
                    while (true) {
                        long j4 = jArr7[i9];
                        int i10 = length;
                        if ((((~j4) << c7) & j4 & j3) != j3) {
                            int i11 = 8 - ((~(i9 - i10)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j4 & 255) < 128) {
                                    Object obj7 = objArr7[(i9 << 3) + i12];
                                    if (obj7 instanceof StateObjectImpl) {
                                        ReaderKind.Companion companion = ReaderKind.INSTANCE;
                                    }
                                    if (!scopeMap9.contains(obj7) || (obj5 = scopeMap9.getMap().get(obj7)) == null) {
                                        jArr6 = jArr7;
                                        scopeMap4 = scopeMap9;
                                        hashMap5 = hashMap8;
                                        scopeMap5 = scopeMap10;
                                        objArr4 = objArr7;
                                        str4 = str6;
                                        i4 = i11;
                                        i5 = i12;
                                        j = j4;
                                        i6 = i9;
                                        obj4 = obj7;
                                    } else if (obj5 instanceof MutableScatterSet) {
                                        MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj5;
                                        Object[] objArr8 = mutableScatterSet2.elements;
                                        long[] jArr8 = mutableScatterSet2.metadata;
                                        jArr6 = jArr7;
                                        int length2 = jArr8.length - 2;
                                        if (length2 >= 0) {
                                            objArr4 = objArr7;
                                            i4 = i11;
                                            i5 = i12;
                                            int i13 = 0;
                                            while (true) {
                                                long j5 = jArr8[i13];
                                                long[] jArr9 = jArr8;
                                                i6 = i9;
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                    int i15 = 0;
                                                    while (i15 < i14) {
                                                        if ((j5 & 255) < 128) {
                                                            objArr6 = objArr8;
                                                            DerivedState<?> derivedState = (DerivedState) objArr8[(i13 << 3) + i15];
                                                            Intrinsics.checkNotNull(derivedState, str6);
                                                            str5 = str6;
                                                            Object obj8 = hashMap8.get(derivedState);
                                                            SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                                                            if (policy == null) {
                                                                policy = SnapshotStateKt.structuralEqualityPolicy();
                                                            }
                                                            scopeMap6 = scopeMap9;
                                                            j2 = j4;
                                                            if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj8)) {
                                                                hashMap7 = hashMap8;
                                                                scopeMap7 = scopeMap10;
                                                                obj6 = obj7;
                                                                this.statesToReread.add(derivedState);
                                                            } else {
                                                                Object obj9 = scopeMap10.getMap().get(derivedState);
                                                                if (obj9 != null) {
                                                                    if (obj9 instanceof MutableScatterSet) {
                                                                        MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj9;
                                                                        Object[] objArr9 = mutableScatterSet3.elements;
                                                                        long[] jArr10 = mutableScatterSet3.metadata;
                                                                        int length3 = jArr10.length - 2;
                                                                        if (length3 >= 0) {
                                                                            obj6 = obj7;
                                                                            int i16 = 0;
                                                                            while (true) {
                                                                                long j6 = jArr10[i16];
                                                                                long[] jArr11 = jArr10;
                                                                                hashMap7 = hashMap8;
                                                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                                                                    int i18 = 0;
                                                                                    while (i18 < i17) {
                                                                                        if ((j6 & 255) < 128) {
                                                                                            scopeMap8 = scopeMap10;
                                                                                            mutableScatterSet.add(objArr9[(i16 << 3) + i18]);
                                                                                            c6 = '\b';
                                                                                            z = true;
                                                                                        } else {
                                                                                            scopeMap8 = scopeMap10;
                                                                                            c6 = '\b';
                                                                                        }
                                                                                        j6 >>= c6;
                                                                                        i18++;
                                                                                        scopeMap10 = scopeMap8;
                                                                                    }
                                                                                    scopeMap7 = scopeMap10;
                                                                                    if (i17 != 8) {
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    scopeMap7 = scopeMap10;
                                                                                }
                                                                                if (i16 != length3) {
                                                                                    i16++;
                                                                                    hashMap8 = hashMap7;
                                                                                    jArr10 = jArr11;
                                                                                    scopeMap10 = scopeMap7;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        hashMap7 = hashMap8;
                                                                        scopeMap7 = scopeMap10;
                                                                        obj6 = obj7;
                                                                        mutableScatterSet.add(obj9);
                                                                        z = true;
                                                                    }
                                                                }
                                                                hashMap7 = hashMap8;
                                                                scopeMap7 = scopeMap10;
                                                                obj6 = obj7;
                                                            }
                                                        } else {
                                                            scopeMap6 = scopeMap9;
                                                            hashMap7 = hashMap8;
                                                            scopeMap7 = scopeMap10;
                                                            str5 = str6;
                                                            j2 = j4;
                                                            obj6 = obj7;
                                                            objArr6 = objArr8;
                                                        }
                                                        j5 >>= 8;
                                                        i15++;
                                                        str6 = str5;
                                                        objArr8 = objArr6;
                                                        obj7 = obj6;
                                                        scopeMap9 = scopeMap6;
                                                        j4 = j2;
                                                        hashMap8 = hashMap7;
                                                        scopeMap10 = scopeMap7;
                                                    }
                                                    scopeMap4 = scopeMap9;
                                                    hashMap6 = hashMap8;
                                                    scopeMap5 = scopeMap10;
                                                    str4 = str6;
                                                    j = j4;
                                                    obj4 = obj7;
                                                    objArr5 = objArr8;
                                                    if (i14 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    scopeMap4 = scopeMap9;
                                                    hashMap6 = hashMap8;
                                                    scopeMap5 = scopeMap10;
                                                    str4 = str6;
                                                    j = j4;
                                                    obj4 = obj7;
                                                    objArr5 = objArr8;
                                                }
                                                if (i13 == length2) {
                                                    break;
                                                }
                                                i13++;
                                                i9 = i6;
                                                jArr8 = jArr9;
                                                str6 = str4;
                                                objArr8 = objArr5;
                                                obj7 = obj4;
                                                scopeMap9 = scopeMap4;
                                                j4 = j;
                                                hashMap8 = hashMap6;
                                                scopeMap10 = scopeMap5;
                                            }
                                        } else {
                                            scopeMap4 = scopeMap9;
                                            hashMap6 = hashMap8;
                                            scopeMap5 = scopeMap10;
                                            objArr4 = objArr7;
                                            str4 = str6;
                                            i4 = i11;
                                            i5 = i12;
                                            j = j4;
                                            i6 = i9;
                                            obj4 = obj7;
                                        }
                                        hashMap5 = hashMap6;
                                    } else {
                                        jArr6 = jArr7;
                                        scopeMap4 = scopeMap9;
                                        scopeMap5 = scopeMap10;
                                        objArr4 = objArr7;
                                        str4 = str6;
                                        i4 = i11;
                                        i5 = i12;
                                        j = j4;
                                        i6 = i9;
                                        obj4 = obj7;
                                        DerivedState<?> derivedState2 = (DerivedState) obj5;
                                        hashMap5 = hashMap8;
                                        Object obj10 = hashMap5.get(derivedState2);
                                        SnapshotMutationPolicy<?> policy2 = derivedState2.getPolicy();
                                        if (policy2 == null) {
                                            policy2 = SnapshotStateKt.structuralEqualityPolicy();
                                        }
                                        if (policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj10)) {
                                            this.statesToReread.add(derivedState2);
                                        } else {
                                            Object obj11 = scopeMap5.getMap().get(derivedState2);
                                            if (obj11 != null) {
                                                if (obj11 instanceof MutableScatterSet) {
                                                    MutableScatterSet mutableScatterSet4 = (MutableScatterSet) obj11;
                                                    Object[] objArr10 = mutableScatterSet4.elements;
                                                    long[] jArr12 = mutableScatterSet4.metadata;
                                                    int length4 = jArr12.length - 2;
                                                    if (length4 >= 0) {
                                                        int i19 = 0;
                                                        while (true) {
                                                            long j7 = jArr12[i19];
                                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i20 = 8 - ((~(i19 - length4)) >>> 31);
                                                                for (int i21 = 0; i21 < i20; i21++) {
                                                                    if ((j7 & 255) < 128) {
                                                                        mutableScatterSet.add(objArr10[(i19 << 3) + i21]);
                                                                        c5 = '\b';
                                                                        z = true;
                                                                    } else {
                                                                        c5 = '\b';
                                                                    }
                                                                    j7 >>= c5;
                                                                }
                                                                if (i20 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i19 == length4) {
                                                                break;
                                                            }
                                                            i19++;
                                                        }
                                                    }
                                                } else {
                                                    mutableScatterSet.add(obj11);
                                                    z = true;
                                                }
                                            }
                                        }
                                    }
                                    Object obj12 = scopeMap5.getMap().get(obj4);
                                    if (obj12 != null) {
                                        if (obj12 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj12;
                                            Object[] objArr11 = mutableScatterSet5.elements;
                                            long[] jArr13 = mutableScatterSet5.metadata;
                                            int length5 = jArr13.length - 2;
                                            if (length5 >= 0) {
                                                while (true) {
                                                    long j8 = jArr13[i7];
                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i22 = 8 - ((~(i7 - length5)) >>> 31);
                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                            if ((j8 & 255) < 128) {
                                                                mutableScatterSet.add(objArr11[(i7 << 3) + i23]);
                                                                c4 = '\b';
                                                                z = true;
                                                            } else {
                                                                c4 = '\b';
                                                            }
                                                            j8 >>= c4;
                                                        }
                                                        if (i22 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    i7 = i7 != length5 ? i7 + 1 : 0;
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.add(obj12);
                                            z = true;
                                        }
                                    }
                                    j4 = j >> 8;
                                    i12 = i5 + 1;
                                    hashMap8 = hashMap5;
                                    jArr7 = jArr6;
                                    objArr7 = objArr4;
                                    i11 = i4;
                                    i9 = i6;
                                    str6 = str4;
                                    scopeMap9 = scopeMap4;
                                    scopeMap10 = scopeMap5;
                                }
                                jArr6 = jArr7;
                                scopeMap4 = scopeMap9;
                                hashMap5 = hashMap8;
                                scopeMap5 = scopeMap10;
                                objArr4 = objArr7;
                                str4 = str6;
                                i4 = i11;
                                i5 = i12;
                                j = j4;
                                i6 = i9;
                                j4 = j >> 8;
                                i12 = i5 + 1;
                                hashMap8 = hashMap5;
                                jArr7 = jArr6;
                                objArr7 = objArr4;
                                i11 = i4;
                                i9 = i6;
                                str6 = str4;
                                scopeMap9 = scopeMap4;
                                scopeMap10 = scopeMap5;
                            }
                            jArr5 = jArr7;
                            scopeMap2 = scopeMap9;
                            hashMap4 = hashMap8;
                            scopeMap3 = scopeMap10;
                            objArr3 = objArr7;
                            str3 = str6;
                            int i24 = i9;
                            if (i11 != 8) {
                                break;
                            }
                            length = i10;
                            i3 = i24;
                        } else {
                            jArr5 = jArr7;
                            scopeMap2 = scopeMap9;
                            hashMap4 = hashMap8;
                            scopeMap3 = scopeMap10;
                            objArr3 = objArr7;
                            str3 = str6;
                            length = i10;
                            i3 = i9;
                        }
                        if (i3 == length) {
                            break;
                        }
                        i9 = i3 + 1;
                        hashMap8 = hashMap4;
                        jArr7 = jArr5;
                        objArr7 = objArr3;
                        str6 = str3;
                        scopeMap9 = scopeMap2;
                        scopeMap10 = scopeMap3;
                        c7 = 7;
                        j3 = -9187201950435737472L;
                    }
                } else {
                    z = false;
                }
            } else {
                ScopeMap<Object, DerivedState<?>> scopeMap11 = scopeMap9;
                HashMap<DerivedState<?>, Object> hashMap9 = hashMap8;
                String str7 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
                Iterator it3 = changes.iterator();
                z = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof StateObjectImpl) {
                        ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                        if (!((StateObjectImpl) next).m3443isReadInh_f27i8$runtime_release(ReaderKind.m3431constructorimpl(2))) {
                            it = it3;
                            hashMap = hashMap9;
                            str = str7;
                            hashMap9 = hashMap;
                            str7 = str;
                            it3 = it;
                        }
                    }
                    ScopeMap<Object, DerivedState<?>> scopeMap12 = scopeMap11;
                    if (!scopeMap12.contains(next) || (obj2 = scopeMap12.getMap().get(next)) == null) {
                        it = it3;
                        hashMap = hashMap9;
                        obj = next;
                        scopeMap11 = scopeMap12;
                        str = str7;
                    } else if (obj2 instanceof MutableScatterSet) {
                        MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj2;
                        Object[] objArr12 = mutableScatterSet6.elements;
                        long[] jArr14 = mutableScatterSet6.metadata;
                        int length6 = jArr14.length - 2;
                        if (length6 >= 0) {
                            int i25 = 0;
                            while (true) {
                                long j9 = jArr14[i25];
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i26 = 8 - ((~(i25 - length6)) >>> 31);
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        if ((j9 & 255) < 128) {
                                            DerivedState<?> derivedState3 = (DerivedState) objArr12[(i25 << 3) + i27];
                                            str2 = str7;
                                            Intrinsics.checkNotNull(derivedState3, str2);
                                            it2 = it3;
                                            Object obj13 = hashMap9.get(derivedState3);
                                            SnapshotMutationPolicy<?> policy3 = derivedState3.getPolicy();
                                            if (policy3 == null) {
                                                policy3 = SnapshotStateKt.structuralEqualityPolicy();
                                            }
                                            scopeMap = scopeMap12;
                                            jArr2 = jArr14;
                                            if (policy3.equivalent(derivedState3.getCurrentRecord().getCurrentValue(), obj13)) {
                                                hashMap3 = hashMap9;
                                                obj3 = next;
                                                objArr2 = objArr12;
                                                i2 = length6;
                                                this.statesToReread.add(derivedState3);
                                            } else {
                                                Object obj14 = scopeMap10.getMap().get(derivedState3);
                                                if (obj14 != null) {
                                                    if (obj14 instanceof MutableScatterSet) {
                                                        MutableScatterSet mutableScatterSet7 = (MutableScatterSet) obj14;
                                                        Object[] objArr13 = mutableScatterSet7.elements;
                                                        long[] jArr15 = mutableScatterSet7.metadata;
                                                        int length7 = jArr15.length - 2;
                                                        if (length7 >= 0) {
                                                            hashMap3 = hashMap9;
                                                            obj3 = next;
                                                            int i28 = 0;
                                                            while (true) {
                                                                long j10 = jArr15[i28];
                                                                objArr2 = objArr12;
                                                                i2 = length6;
                                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i29 = 8 - ((~(i28 - length7)) >>> 31);
                                                                    int i30 = 0;
                                                                    while (i30 < i29) {
                                                                        if ((j10 & 255) < 128) {
                                                                            jArr4 = jArr15;
                                                                            mutableScatterSet.add(objArr13[(i28 << 3) + i30]);
                                                                            c3 = '\b';
                                                                            z = true;
                                                                        } else {
                                                                            jArr4 = jArr15;
                                                                            c3 = '\b';
                                                                        }
                                                                        j10 >>= c3;
                                                                        i30++;
                                                                        jArr15 = jArr4;
                                                                    }
                                                                    jArr3 = jArr15;
                                                                    if (i29 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr3 = jArr15;
                                                                }
                                                                if (i28 != length7) {
                                                                    i28++;
                                                                    objArr12 = objArr2;
                                                                    length6 = i2;
                                                                    jArr15 = jArr3;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        hashMap3 = hashMap9;
                                                        obj3 = next;
                                                        objArr2 = objArr12;
                                                        i2 = length6;
                                                        mutableScatterSet.add(obj14);
                                                        z = true;
                                                    }
                                                }
                                                hashMap3 = hashMap9;
                                                obj3 = next;
                                                objArr2 = objArr12;
                                                i2 = length6;
                                            }
                                        } else {
                                            it2 = it3;
                                            hashMap3 = hashMap9;
                                            obj3 = next;
                                            scopeMap = scopeMap12;
                                            jArr2 = jArr14;
                                            objArr2 = objArr12;
                                            i2 = length6;
                                            str2 = str7;
                                        }
                                        j9 >>= 8;
                                        i27++;
                                        it3 = it2;
                                        str7 = str2;
                                        next = obj3;
                                        jArr14 = jArr2;
                                        objArr12 = objArr2;
                                        length6 = i2;
                                        scopeMap12 = scopeMap;
                                        hashMap9 = hashMap3;
                                    }
                                    it = it3;
                                    hashMap2 = hashMap9;
                                    obj = next;
                                    scopeMap11 = scopeMap12;
                                    jArr = jArr14;
                                    objArr = objArr12;
                                    int i31 = length6;
                                    str = str7;
                                    if (i26 != 8) {
                                        break;
                                    }
                                    length6 = i31;
                                } else {
                                    it = it3;
                                    hashMap2 = hashMap9;
                                    obj = next;
                                    scopeMap11 = scopeMap12;
                                    jArr = jArr14;
                                    objArr = objArr12;
                                    str = str7;
                                }
                                if (i25 == length6) {
                                    break;
                                }
                                i25++;
                                it3 = it;
                                str7 = str;
                                next = obj;
                                jArr14 = jArr;
                                objArr12 = objArr;
                                scopeMap12 = scopeMap11;
                                hashMap9 = hashMap2;
                            }
                        } else {
                            it = it3;
                            hashMap2 = hashMap9;
                            obj = next;
                            scopeMap11 = scopeMap12;
                            str = str7;
                        }
                        hashMap = hashMap2;
                    } else {
                        it = it3;
                        obj = next;
                        scopeMap11 = scopeMap12;
                        str = str7;
                        DerivedState<?> derivedState4 = (DerivedState) obj2;
                        hashMap = hashMap9;
                        Object obj15 = hashMap.get(derivedState4);
                        SnapshotMutationPolicy<?> policy4 = derivedState4.getPolicy();
                        if (policy4 == null) {
                            policy4 = SnapshotStateKt.structuralEqualityPolicy();
                        }
                        if (policy4.equivalent(derivedState4.getCurrentRecord().getCurrentValue(), obj15)) {
                            this.statesToReread.add(derivedState4);
                        } else {
                            Object obj16 = scopeMap10.getMap().get(derivedState4);
                            if (obj16 != null) {
                                if (obj16 instanceof MutableScatterSet) {
                                    MutableScatterSet mutableScatterSet8 = (MutableScatterSet) obj16;
                                    Object[] objArr14 = mutableScatterSet8.elements;
                                    long[] jArr16 = mutableScatterSet8.metadata;
                                    int length8 = jArr16.length - 2;
                                    if (length8 >= 0) {
                                        int i32 = 0;
                                        while (true) {
                                            long j11 = jArr16[i32];
                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i33 = 8 - ((~(i32 - length8)) >>> 31);
                                                for (int i34 = 0; i34 < i33; i34++) {
                                                    if ((j11 & 255) < 128) {
                                                        mutableScatterSet.add(objArr14[(i32 << 3) + i34]);
                                                        c2 = '\b';
                                                        z = true;
                                                    } else {
                                                        c2 = '\b';
                                                    }
                                                    j11 >>= c2;
                                                }
                                                if (i33 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i32 == length8) {
                                                break;
                                            }
                                            i32++;
                                        }
                                    }
                                } else {
                                    mutableScatterSet.add(obj16);
                                    z = true;
                                }
                            }
                        }
                    }
                    Object obj17 = scopeMap10.getMap().get(obj);
                    if (obj17 != null) {
                        if (obj17 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet9 = (MutableScatterSet) obj17;
                            Object[] objArr15 = mutableScatterSet9.elements;
                            long[] jArr17 = mutableScatterSet9.metadata;
                            int length9 = jArr17.length - 2;
                            if (length9 >= 0) {
                                while (true) {
                                    long j12 = jArr17[i];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i35 = 8 - ((~(i - length9)) >>> 31);
                                        for (int i36 = 0; i36 < i35; i36++) {
                                            if ((j12 & 255) < 128) {
                                                mutableScatterSet.add(objArr15[(i << 3) + i36]);
                                                c = '\b';
                                                z = true;
                                            } else {
                                                c = '\b';
                                            }
                                            j12 >>= c;
                                        }
                                        if (i35 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length9 ? i + 1 : 0;
                                }
                            }
                        } else {
                            mutableScatterSet.add(obj17);
                            z = true;
                        }
                        hashMap9 = hashMap;
                        str7 = str;
                        it3 = it;
                    }
                    hashMap9 = hashMap;
                    str7 = str;
                    it3 = it;
                }
            }
            if (this.statesToReread.isNotEmpty()) {
                MutableVector<DerivedState<?>> mutableVector = this.statesToReread;
                int size = mutableVector.getSize();
                if (size > 0) {
                    DerivedState<?>[] content = mutableVector.getContent();
                    while (true) {
                        rereadDerivedState(content[i8]);
                        int i37 = i8 + 1;
                        if (i37 >= size) {
                            break;
                        }
                        i8 = i37;
                    }
                }
                this.statesToReread.clear();
            }
            return z;
        }

        public final void rereadDerivedState(DerivedState<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            int i;
            MutableObjectIntMap<Object> mutableObjectIntMap;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            int id = SnapshotKt.currentSnapshot().getId();
            Object obj = this.valueToScopes.getMap().get(derivedState);
            if (obj == null) {
                return;
            }
            if (!(obj instanceof MutableScatterSet)) {
                MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj);
                if (mutableObjectIntMap2 == null) {
                    mutableObjectIntMap2 = new MutableObjectIntMap<>(0, 1, null);
                    mutableScatterMap.set(obj, mutableObjectIntMap2);
                    Unit unit = Unit.INSTANCE;
                }
                recordRead(derivedState, id, obj, mutableObjectIntMap2);
                return;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr3 = mutableScatterSet.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            Object obj2 = objArr[(i2 << 3) + i5];
                            MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj2);
                            jArr2 = jArr3;
                            if (mutableObjectIntMap3 == null) {
                                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                                mutableScatterMap.set(obj2, mutableObjectIntMap);
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                mutableObjectIntMap = mutableObjectIntMap3;
                            }
                            recordRead(derivedState, id, obj2, mutableObjectIntMap);
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        public final void notifyInvalidatedScopes() {
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            MutableScatterSet<Object> mutableScatterSet2 = mutableScatterSet;
            Function1<Object, Unit> function1 = this.onChanged;
            Object[] objArr = mutableScatterSet2.elements;
            long[] jArr = mutableScatterSet2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                function1.invoke(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
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
            mutableScatterSet.clear();
        }
    }

    public final void clear(Object scope) {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                mutableVector.getContent()[i2].clearScopeObservations(scope);
                if (!r5.hasScopeObservations()) {
                    i++;
                } else if (i > 0) {
                    mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                }
            }
            int i3 = size - i;
            ArraysKt.fill(mutableVector.getContent(), (Object) null, i3, size);
            mutableVector.setSize(i3);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clearIf(Function1<Object, Boolean> predicate) {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                mutableVector.getContent()[i2].removeScopeIf(predicate);
                if (!r5.hasScopeObservations()) {
                    i++;
                } else if (i > 0) {
                    mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                }
            }
            int i3 = size - i;
            ArraysKt.fill(mutableVector.getContent(), (Object) null, i3, size);
            mutableVector.setSize(i3);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i = 0;
                do {
                    content[i].clear();
                    i++;
                } while (i < size);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
