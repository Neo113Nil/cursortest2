package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: SnapshotStateObserver.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001AB!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001e\u001a\u00020\u0004\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b#\u0010\u0007J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\fR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R(\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010'j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R,\u0010/\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00040-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010&R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0018028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u00060\u0001j\u0002`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010,R\u0018\u0010<\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "drainChanges", "()Z", "sendNotifications", "()V", "", "set", "addChanges", "(Ljava/util/Set;)V", "removeChanges", "()Ljava/util/Set;", "", CrashEvent.e, "()Ljava/lang/Void;", "T", "onChanged", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "ensureMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "scope", "onValueChangedForScope", "block", "observeReads", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "clear", "(Ljava/lang/Object;)V", "predicate", "clearIf", "start", "stop", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "sendingNotifications", "Z", "Lkotlin/Function2;", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyObserver", "Lkotlin/jvm/functions/Function2;", "readObserver", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "observedScopeMapsLock", "Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "isPaused", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "currentMapThreadId", "J", "ObservedScopeMap", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SnapshotStateObserver {
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final Function1 onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference pendingChanges = new AtomicReference(null);
    private final Function2 applyObserver = new Function2() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit applyObserver$lambda$0;
            applyObserver$lambda$0 = SnapshotStateObserver.applyObserver$lambda$0(SnapshotStateObserver.this, (Set) obj, (Snapshot) obj2);
            return applyObserver$lambda$0;
        }
    };
    private final Function1 readObserver = new Function1() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit readObserver$lambda$7;
            readObserver$lambda$7 = SnapshotStateObserver.readObserver$lambda$7(SnapshotStateObserver.this, obj);
            return readObserver$lambda$7;
        }
    };
    private final MutableVector observedScopeMaps = new MutableVector(new ObservedScopeMap[16], 0);
    private final Object observedScopeMapsLock = new Object();
    private long currentMapThreadId = -1;

    public SnapshotStateObserver(Function1 function1) {
        this.onChangedExecutor = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyObserver$lambda$0(SnapshotStateObserver snapshotStateObserver, Set set, Snapshot snapshot) {
        snapshotStateObserver.addChanges(set);
        if (snapshotStateObserver.drainChanges()) {
            snapshotStateObserver.sendNotifications();
        }
        return Unit.INSTANCE;
    }

    private final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMapsLock) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set removeChanges = removeChanges();
            if (removeChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMapsLock) {
                try {
                    MutableVector mutableVector = this.observedScopeMaps;
                    Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    for (int i = 0; i < size; i++) {
                        if (!((ObservedScopeMap) objArr[i]).recordInvalidation(removeChanges) && !z2) {
                            z2 = false;
                        }
                        z2 = true;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final void sendNotifications() {
        this.onChangedExecutor.invoke(new Function0() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit sendNotifications$lambda$5;
                sendNotifications$lambda$5 = SnapshotStateObserver.sendNotifications$lambda$5(SnapshotStateObserver.this);
                return sendNotifications$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendNotifications$lambda$5(SnapshotStateObserver snapshotStateObserver) {
        do {
            synchronized (snapshotStateObserver.observedScopeMapsLock) {
                try {
                    if (!snapshotStateObserver.sendingNotifications) {
                        snapshotStateObserver.sendingNotifications = true;
                        try {
                            MutableVector mutableVector = snapshotStateObserver.observedScopeMaps;
                            Object[] objArr = mutableVector.content;
                            int size = mutableVector.getSize();
                            for (int i = 0; i < size; i++) {
                                ((ObservedScopeMap) objArr[i]).notifyInvalidatedScopes();
                            }
                            snapshotStateObserver.sendingNotifications = false;
                        } finally {
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (snapshotStateObserver.drainChanges());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addChanges(Set set) {
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

    private final Set removeChanges() {
        Object obj;
        Object obj2;
        Set set;
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
                Set set2 = (Set) list.get(0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readObserver$lambda$7(SnapshotStateObserver snapshotStateObserver, Object obj) {
        if (!snapshotStateObserver.isPaused) {
            synchronized (snapshotStateObserver.observedScopeMapsLock) {
                ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                Intrinsics.checkNotNull(observedScopeMap);
                observedScopeMap.recordRead(obj);
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    public final void clear() {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector mutableVector = this.observedScopeMaps;
                Object[] objArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    ((ObservedScopeMap) objArr[i]).clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear(Object scope) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) mutableVector.content[i2];
                    observedScopeMap.clearScopeObservations(scope);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        Object[] objArr = mutableVector.content;
                        objArr[i2 - i] = objArr[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt.fill(mutableVector.content, (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearIf(Function1 predicate) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) mutableVector.content[i2];
                    observedScopeMap.removeScopeIf(predicate);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        Object[] objArr = mutableVector.content;
                        objArr[i2 - i] = objArr[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt.fill(mutableVector.content, (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void observeReads(Object scope, Function1 onValueChangedForScope, Function0 block) {
        ObservedScopeMap ensureMap;
        synchronized (this.observedScopeMapsLock) {
            ensureMap = ensureMap(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j = this.currentMapThreadId;
        if (j != -1) {
            if (!(j == Thread_jvmKt.currentThreadId())) {
                PreconditionsKt.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + Thread_jvmKt.currentThreadId() + ", name=" + Thread_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = ensureMap;
            this.currentMapThreadId = Thread_jvmKt.currentThreadId();
            ensureMap.observe(scope, this.readObserver, block);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z;
            this.currentMapThreadId = j;
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

    private final ObservedScopeMap ensureMap(Function1 onChanged) {
        Object obj;
        MutableVector mutableVector = this.observedScopeMaps;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = objArr[i];
            if (((ObservedScopeMap) obj).getOnChanged() == onChanged) {
                break;
            }
            i++;
        }
        ObservedScopeMap observedScopeMap = (ObservedScopeMap) obj;
        if (observedScopeMap != null) {
            return observedScopeMap;
        }
        Intrinsics.checkNotNull(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap2 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onChanged, 1));
        this.observedScopeMaps.add(observedScopeMap2);
        return observedScopeMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0011J7\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u0011J!\u0010\u001c\u001a\u00020\u00032\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001a0\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00032\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0003¢\u0006\u0004\b)\u0010 R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010-R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010=\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00100R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030%018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00103R<\u0010E\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\u0006\u0012\u0004\u0018\u00010\u00010Cj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\u0006\u0012\u0004\u0018\u00010\u0001`D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "Lkotlin/Function1;", "", "onChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "currentToken", "currentScope", "Landroidx/collection/MutableObjectIntMap;", "recordedValues", "recordRead", "(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/MutableObjectIntMap;)V", "scope", "clearObsoleteStateReads", "(Ljava/lang/Object;)V", "removeObservation", "(Ljava/lang/Object;Ljava/lang/Object;)V", "readObserver", "Lkotlin/Function0;", "block", "observe", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "clearScopeObservations", "", "predicate", "removeScopeIf", "hasScopeObservations", "()Z", "clear", "()V", "", "changes", "recordInvalidation", "(Ljava/util/Set;)Z", "Landroidx/compose/runtime/DerivedState;", "derivedState", "rereadDerivedState", "(Landroidx/compose/runtime/DerivedState;)V", "notifyInvalidatedScopes", "Lkotlin/jvm/functions/Function1;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "Ljava/lang/Object;", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "I", "Landroidx/compose/runtime/collection/ScopeMap;", "valueToScopes", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterMap;", "scopeToValues", "Landroidx/collection/MutableScatterSet;", "invalidated", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ObservedScopeMap {
        private Object currentScope;
        private MutableObjectIntMap currentScopeReads;
        private int deriveStateScopeCount;
        private final Function1 onChanged;
        private final MutableScatterMap scopeToValues;
        private int currentToken = -1;
        private final MutableScatterMap valueToScopes = ScopeMap.m1191constructorimpl$default(null, 1, null);
        private final MutableScatterSet invalidated = new MutableScatterSet(0, 1, null);
        private final MutableVector statesToReread = new MutableVector(new DerivedState[16], 0);
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState derivedState) {
                int i;
                i = SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount;
                SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount = i + 1;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState derivedState) {
                int i;
                i = SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount;
                SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount = i - 1;
            }
        };
        private final MutableScatterMap dependencyToDerivedStates = ScopeMap.m1191constructorimpl$default(null, 1, null);
        private final HashMap recordedDerivedStateValues = new HashMap();

        public ObservedScopeMap(Function1 function1) {
            this.onChanged = function1;
            int i = 0;
            this.scopeToValues = new MutableScatterMap(i, 1, null);
        }

        public final Function1 getOnChanged() {
            return this.onChanged;
        }

        public final void recordRead(Object value) {
            Object obj = this.currentScope;
            Intrinsics.checkNotNull(obj);
            int i = this.currentToken;
            MutableObjectIntMap mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj, mutableObjectIntMap);
                Unit unit = Unit.INSTANCE;
            }
            recordRead(value, i, obj, mutableObjectIntMap);
        }

        private final void recordRead(Object value, int currentToken, Object currentScope, MutableObjectIntMap recordedValues) {
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
                ObjectIntMap dependencies = currentRecord.getDependencies();
                MutableScatterMap mutableScatterMap = this.dependencyToDerivedStates;
                ScopeMap.m1197removeScopeimpl(mutableScatterMap, value);
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
                                        ((StateObjectImpl) stateObject).m1226recordReadInh_f27i8$runtime(ReaderKind.m1215constructorimpl(2));
                                    }
                                    ScopeMap.m1188addimpl(mutableScatterMap, stateObject, value);
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
                    ((StateObjectImpl) value).m1226recordReadInh_f27i8$runtime(ReaderKind.m1215constructorimpl(2));
                }
                ScopeMap.m1188addimpl(this.valueToScopes, value, currentScope);
            }
        }

        public final void observe(Object scope, Function1 readObserver, Function0 block) {
            Object obj = this.currentScope;
            MutableObjectIntMap mutableObjectIntMap = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = (MutableObjectIntMap) this.scopeToValues.get(scope);
            if (this.currentToken == -1) {
                this.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector derivedStateObservers = SnapshotStateKt.derivedStateObservers();
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
            MutableObjectIntMap mutableObjectIntMap = this.currentScopeReads;
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
            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) this.scopeToValues.remove(scope);
            if (mutableObjectIntMap == null) {
                return;
            }
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

        public final void removeScopeIf(Function1 predicate) {
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            long j;
            int i3;
            long j2;
            int i4;
            MutableScatterMap mutableScatterMap = this.scopeToValues;
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
                            Boolean bool = (Boolean) predicate.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = mutableObjectIntMap.keys;
                                int[] iArr = mutableObjectIntMap.values;
                                long[] jArr4 = mutableObjectIntMap.metadata;
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
                            if (bool.booleanValue()) {
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
            ScopeMap.m1196removeimpl(this.valueToScopes, value, scope);
            if (!(value instanceof DerivedState) || ScopeMap.m1192containsimpl(this.valueToScopes, value)) {
                return;
            }
            ScopeMap.m1197removeScopeimpl(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            ScopeMap.m1189clearimpl(this.valueToScopes);
            this.scopeToValues.clear();
            ScopeMap.m1189clearimpl(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        public final boolean recordInvalidation(java.util.Set r44) {
            /*
                Method dump skipped, instructions count: 1722
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordInvalidation(java.util.Set):boolean");
        }

        public final void rereadDerivedState(DerivedState derivedState) {
            long[] jArr;
            long[] jArr2;
            int i;
            MutableObjectIntMap mutableObjectIntMap;
            MutableScatterMap mutableScatterMap = this.scopeToValues;
            int hashCode = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            Object obj = this.valueToScopes.get(derivedState);
            if (obj == null) {
                return;
            }
            if (obj instanceof MutableScatterSet) {
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
                                MutableObjectIntMap mutableObjectIntMap2 = (MutableObjectIntMap) mutableScatterMap.get(obj2);
                                jArr2 = jArr3;
                                if (mutableObjectIntMap2 == null) {
                                    mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
                                    mutableScatterMap.set(obj2, mutableObjectIntMap);
                                    Unit unit = Unit.INSTANCE;
                                } else {
                                    mutableObjectIntMap = mutableObjectIntMap2;
                                }
                                recordRead(derivedState, hashCode, obj2, mutableObjectIntMap);
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
            } else {
                MutableObjectIntMap mutableObjectIntMap3 = (MutableObjectIntMap) mutableScatterMap.get(obj);
                if (mutableObjectIntMap3 == null) {
                    mutableObjectIntMap3 = new MutableObjectIntMap(0, 1, null);
                    mutableScatterMap.set(obj, mutableObjectIntMap3);
                    Unit unit2 = Unit.INSTANCE;
                }
                recordRead(derivedState, hashCode, obj, mutableObjectIntMap3);
            }
        }

        public final void notifyInvalidatedScopes() {
            MutableScatterSet mutableScatterSet = this.invalidated;
            Function1 function1 = this.onChanged;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
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
}
