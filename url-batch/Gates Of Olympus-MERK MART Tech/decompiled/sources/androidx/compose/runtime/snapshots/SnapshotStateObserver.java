package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.exifinterface.media.ExifInterface;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: SnapshotStateObserver.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001<B0\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\u0016\u0010\u0017\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0002J\u0010\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001d\u0010#\u001a\u00020\u00052\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bJ\u001d\u0010%\u001a\u00020\u00052\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00100\u0003H\u0082\bJ?\u0010,\u001a\u00020\u0005\"\b\b\u0000\u0010-*\u00020\u00012\u0006\u0010.\u001a\u0002H-2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u00100J\u0016\u00101\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u000e\u00102\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0001J)\u00103\u001a\u00020\u00052!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00100\u0003J\u0006\u00105\u001a\u00020\u0005J\u0006\u00106\u001a\u00020\u0005J\u001e\u00107\u001a\u00020\u00052\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u00109\u001a\u00020\u0014H\u0007J\u0006\u00102\u001a\u00020\u0005J&\u0010:\u001a\u00020\u001f\"\b\b\u0000\u0010-*\u00020\u00012\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020\u00050\u0003H\u0002R/\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00060\u0001j\u0002`!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sendingNotifications", "", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "drainChanges", "sendNotifications", "addChanges", "set", "removeChanges", "report", "", "readObserver", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "observedScopeMapsLock", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "forEachScopeMap", "block", "removeScopeMapIf", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "isPaused", "currentMap", "currentMapThreadId", "", "observeReads", ExifInterface.GPS_DIRECTION_TRUE, "scope", "onValueChangedForScope", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "withNoObservations", "clear", "clearIf", "predicate", "start", "stop", "notifyChanges", "changes", "snapshot", "ensureMap", "onChanged", "ObservedScopeMap", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver = new Function2() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit applyObserver$lambda$0;
            applyObserver$lambda$0 = SnapshotStateObserver.applyObserver$lambda$0(SnapshotStateObserver.this, (Set) obj, (Snapshot) obj2);
            return applyObserver$lambda$0;
        }
    };
    private final Function1<Object, Unit> readObserver = new Function1() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit readObserver$lambda$0;
            readObserver$lambda$0 = SnapshotStateObserver.readObserver$lambda$0(SnapshotStateObserver.this, obj);
            return readObserver$lambda$0;
        }
    };
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private final Object observedScopeMapsLock = new Object();
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(Function1<? super Function0<Unit>, Unit> function1) {
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
            Set<? extends Object> removeChanges = removeChanges();
            if (removeChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMapsLock) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    if (!observedScopeMapArr[i].recordInvalidation(removeChanges) && !z2) {
                        z2 = false;
                    }
                    z2 = true;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    private final void sendNotifications() {
        this.onChangedExecutor.invoke(new Function0() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit sendNotifications$lambda$0;
                sendNotifications$lambda$0 = SnapshotStateObserver.sendNotifications$lambda$0(SnapshotStateObserver.this);
                return sendNotifications$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendNotifications$lambda$0(SnapshotStateObserver snapshotStateObserver) {
        do {
            synchronized (snapshotStateObserver.observedScopeMapsLock) {
                if (!snapshotStateObserver.sendingNotifications) {
                    snapshotStateObserver.sendingNotifications = true;
                    try {
                        MutableVector<ObservedScopeMap> mutableVector = snapshotStateObserver.observedScopeMaps;
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        int size = mutableVector.getSize();
                        for (int i = 0; i < size; i++) {
                            observedScopeMapArr[i].notifyInvalidatedScopes();
                        }
                        snapshotStateObserver.sendingNotifications = false;
                    } finally {
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        } while (snapshotStateObserver.drainChanges());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addChanges(Set<? extends Object> set) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readObserver$lambda$0(SnapshotStateObserver snapshotStateObserver, Object obj) {
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

    private final void forEachScopeMap(Function1<? super ObservedScopeMap, Unit> block) {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                block.invoke(observedScopeMapArr[i]);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void removeScopeMapIf(Function1<? super ObservedScopeMap, Boolean> block) {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (block.invoke(mutableVector.content[i2]).booleanValue()) {
                    i++;
                } else if (i > 0) {
                    mutableVector.content[i2 - i] = mutableVector.content[i2];
                }
            }
            int i3 = size - i;
            ArraysKt.fill(mutableVector.content, (Object) null, i3, size);
            mutableVector.setSize(i3);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void observeReads(T scope, Function1<? super T, Unit> onValueChangedForScope, Function0<Unit> block) {
        ObservedScopeMap ensureMap;
        long j;
        MutableVector<DerivedStateObserver> mutableVector;
        SnapshotThreadLocal snapshotThreadLocal;
        long j2;
        TransparentObserverMutableSnapshot transparentObserverMutableSnapshot;
        Snapshot snapshot;
        Snapshot makeCurrent;
        synchronized (this.observedScopeMapsLock) {
            ensureMap = ensureMap(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j3 = this.currentMapThreadId;
        if (j3 != -1) {
            if (!(j3 == Thread_jvmKt.currentThreadId())) {
                PreconditionsKt.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j3 + "), currentThread={id=" + Thread_jvmKt.currentThreadId() + ", name=" + Thread_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = ensureMap;
            this.currentMapThreadId = Thread_jvmKt.currentThreadId();
            Function1<Object, Unit> function1 = this.readObserver;
            Object obj = ensureMap.currentScope;
            MutableObjectIntMap mutableObjectIntMap = ensureMap.currentScopeReads;
            int i = ensureMap.currentToken;
            ensureMap.currentScope = scope;
            ensureMap.currentScopeReads = (MutableObjectIntMap) ensureMap.scopeToValues.get(scope);
            if (ensureMap.currentToken == -1) {
                ensureMap.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            }
            DerivedStateObserver derivedStateObserver = ensureMap.getDerivedStateObserver();
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.Companion companion = Snapshot.INSTANCE;
                if (function1 == null) {
                    block.invoke();
                    j2 = j3;
                    mutableVector = derivedStateObservers;
                } else {
                    snapshotThreadLocal = SnapshotKt.threadSnapshot;
                    Snapshot snapshot2 = (Snapshot) snapshotThreadLocal.get();
                    try {
                        if (snapshot2 instanceof TransparentObserverMutableSnapshot) {
                            try {
                                if (((TransparentObserverMutableSnapshot) snapshot2).getThreadId() == Thread_jvmKt.currentThreadId()) {
                                    Function1<Object, Unit> readObserver = ((TransparentObserverMutableSnapshot) snapshot2).getReadObserver();
                                    Function1<Object, Unit> writeObserver$runtime = ((TransparentObserverMutableSnapshot) snapshot2).getWriteObserver$runtime();
                                    try {
                                        j2 = j3;
                                        try {
                                            ((TransparentObserverMutableSnapshot) snapshot2).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(function1, readObserver, false, 4, null));
                                            ((TransparentObserverMutableSnapshot) snapshot2).setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(null, writeObserver$runtime));
                                            block.invoke();
                                            ((TransparentObserverMutableSnapshot) snapshot2).setReadObserver$runtime(readObserver);
                                            ((TransparentObserverMutableSnapshot) snapshot2).setWriteObserver$runtime(writeObserver$runtime);
                                            mutableVector = derivedStateObservers;
                                        } catch (Throwable th) {
                                            th = th;
                                            ((TransparentObserverMutableSnapshot) snapshot2).setReadObserver$runtime(readObserver);
                                            ((TransparentObserverMutableSnapshot) snapshot2).setWriteObserver$runtime(writeObserver$runtime);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                j2 = j3;
                                mutableVector = derivedStateObservers;
                                j = j2;
                                try {
                                    mutableVector.removeAt(mutableVector.getSize() - 1);
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    this.currentMap = observedScopeMap;
                                    this.isPaused = z;
                                    this.currentMapThreadId = j;
                                    throw th;
                                }
                            }
                        }
                        j2 = j3;
                        try {
                            try {
                                try {
                                    if (snapshot2 != null && !(snapshot2 instanceof MutableSnapshot)) {
                                        transparentObserverMutableSnapshot = snapshot2.takeNestedSnapshot(function1);
                                        mutableVector = derivedStateObservers;
                                        snapshot = transparentObserverMutableSnapshot;
                                        makeCurrent = snapshot.makeCurrent();
                                        block.invoke();
                                        snapshot.restoreCurrent(makeCurrent);
                                        snapshot.dispose();
                                    }
                                    block.invoke();
                                    snapshot.restoreCurrent(makeCurrent);
                                    snapshot.dispose();
                                } catch (Throwable th5) {
                                    j = j2;
                                    try {
                                        snapshot.restoreCurrent(makeCurrent);
                                        throw th5;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        try {
                                            snapshot.dispose();
                                            throw th;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            mutableVector.removeAt(mutableVector.getSize() - 1);
                                            throw th;
                                        }
                                    }
                                }
                                makeCurrent = snapshot.makeCurrent();
                            } catch (Throwable th8) {
                                th = th8;
                                j = j2;
                            }
                            transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot2 instanceof MutableSnapshot ? (MutableSnapshot) snapshot2 : null, function1, null, true, false);
                            snapshot = transparentObserverMutableSnapshot;
                        } catch (Throwable th9) {
                            th = th9;
                            j = j2;
                            mutableVector.removeAt(mutableVector.getSize() - 1);
                            throw th;
                        }
                        mutableVector = derivedStateObservers;
                    } catch (Throwable th10) {
                        th = th10;
                    }
                }
                try {
                    mutableVector.removeAt(mutableVector.getSize() - 1);
                    Object obj2 = ensureMap.currentScope;
                    Intrinsics.checkNotNull(obj2);
                    ensureMap.clearObsoleteStateReads(obj2);
                    ensureMap.currentScope = obj;
                    ensureMap.currentScopeReads = mutableObjectIntMap;
                    ensureMap.currentToken = i;
                    this.currentMap = observedScopeMap;
                    this.isPaused = z;
                    this.currentMapThreadId = j2;
                } catch (Throwable th11) {
                    th = th11;
                    j = j2;
                    this.currentMap = observedScopeMap;
                    this.isPaused = z;
                    this.currentMapThreadId = j;
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
                j = j3;
                mutableVector = derivedStateObservers;
            }
        } catch (Throwable th13) {
            th = th13;
            j = j3;
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
        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i = 0;
        while (true) {
            if (i >= size) {
                observedScopeMap = null;
                break;
            }
            observedScopeMap = observedScopeMapArr[i];
            if (observedScopeMap.getOnChanged() == onChanged) {
                break;
            }
            i++;
        }
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
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0001J.\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002J7\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00012\u0014\b\b\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\b\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0086\bJ\u0010\u0010/\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0001H\u0002J\u000e\u00100\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0001J)\u00101\u001a\u00020\u00042!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u001d0\u0003J\u0006\u00105\u001a\u00020\u001dJ\u0018\u00106\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0002J\u0006\u00107\u001a\u00020\u0004J\u0014\u00108\u001a\u00020\u001d2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010:J\u0012\u0010;\u001a\u00020\u00042\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\u0017J\u0006\u0010=\u001a\u00020\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R6\u0010$\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010%j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0001`&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "onChanged", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "currentScope", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "currentToken", "", "valueToScopes", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/collection/MutableScatterMap;", "scopeToValues", "Landroidx/collection/MutableScatterMap;", "invalidated", "Landroidx/collection/MutableScatterSet;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedState;", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "readingDerivedStates", "", "getReadingDerivedStates", "()Z", "setReadingDerivedStates", "(Z)V", "deriveStateScopeCount", "dependencyToDerivedStates", "recordedDerivedStateValues", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordRead", "value", "recordedValues", "observe", "scope", "readObserver", "block", "Lkotlin/Function0;", "clearObsoleteStateReads", "clearScopeObservations", "removeScopeIf", "predicate", "Lkotlin/ParameterName;", "name", "hasScopeObservations", "removeObservation", "clear", "recordInvalidation", "changes", "", "rereadDerivedState", "derivedState", "notifyInvalidatedScopes", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ObservedScopeMap {
        private Object currentScope;
        private MutableObjectIntMap<Object> currentScopeReads;
        private int deriveStateScopeCount;
        private final MutableScatterSet<Object> invalidated;
        private final Function1<Object, Unit> onChanged;
        private boolean readingDerivedStates;
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues;
        private int currentToken = -1;
        private final MutableScatterMap<Object, Object> valueToScopes = ScopeMap.m4748constructorimpl$default(null, 1, null);
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                int i;
                i = SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount;
                SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount = i + 1;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                int i;
                i = SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount;
                SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount = i - 1;
            }
        };
        private final MutableScatterMap<Object, Object> dependencyToDerivedStates = ScopeMap.m4748constructorimpl$default(null, 1, null);
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(Function1<Object, Unit> function1) {
            this.onChanged = function1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i = 1;
            int i2 = 0;
            this.scopeToValues = new MutableScatterMap<>(i2, i, defaultConstructorMarker);
            this.invalidated = new MutableScatterSet<>(i2, i, defaultConstructorMarker);
        }

        public final Function1<Object, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final boolean getReadingDerivedStates() {
            return this.readingDerivedStates;
        }

        public final void setReadingDerivedStates(boolean z) {
            this.readingDerivedStates = z;
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
            int i3;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int put = recordedValues.put(value, currentToken, -1);
            int i4 = 2;
            if (!(value instanceof DerivedState) || put == currentToken) {
                i = 2;
                i2 = -1;
            } else {
                DerivedState.Record currentRecord = ((DerivedState) value).getCurrentRecord();
                this.recordedDerivedStateValues.put(value, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                MutableScatterMap<Object, Object> mutableScatterMap = this.dependencyToDerivedStates;
                ScopeMap.m4757removeScopeimpl(mutableScatterMap, value);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    i3 = i4;
                                    StateObject stateObject = (StateObject) objArr[(i5 << 3) + i7];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ReaderKind.Companion companion = ReaderKind.INSTANCE;
                                        ((StateObjectImpl) stateObject).m4854recordReadInh_f27i8$runtime(ReaderKind.m4837constructorimpl(i3));
                                    }
                                    ScopeMap.m4742addimpl(mutableScatterMap, stateObject, value);
                                } else {
                                    i3 = i4;
                                }
                                j >>= 8;
                                i7++;
                                i4 = i3;
                            }
                            i = i4;
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            i = i4;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        i4 = i;
                    }
                } else {
                    i = 2;
                }
                i2 = -1;
            }
            if (put == i2) {
                if (value instanceof StateObjectImpl) {
                    ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                    ((StateObjectImpl) value).m4854recordReadInh_f27i8$runtime(ReaderKind.m4837constructorimpl(i));
                }
                ScopeMap.m4742addimpl(this.valueToScopes, value, currentScope);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void observe(Object scope, Function1<Object, Unit> readObserver, Function0<Unit> block) {
            SnapshotThreadLocal snapshotThreadLocal;
            TransparentObserverMutableSnapshot transparentObserverMutableSnapshot;
            Snapshot makeCurrent;
            Object obj = this.currentScope;
            MutableObjectIntMap mutableObjectIntMap = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = (MutableObjectIntMap) this.scopeToValues.get(scope);
            if (this.currentToken == -1) {
                this.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            }
            DerivedStateObserver derivedStateObserver = getDerivedStateObserver();
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.Companion companion = Snapshot.INSTANCE;
                if (readObserver != null) {
                    snapshotThreadLocal = SnapshotKt.threadSnapshot;
                    Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
                    if ((snapshot instanceof TransparentObserverMutableSnapshot) && ((TransparentObserverMutableSnapshot) snapshot).getThreadId() == Thread_jvmKt.currentThreadId()) {
                        Function1<Object, Unit> readObserver2 = ((TransparentObserverMutableSnapshot) snapshot).getReadObserver();
                        Function1<Object, Unit> writeObserver$runtime = ((TransparentObserverMutableSnapshot) snapshot).getWriteObserver$runtime();
                        try {
                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(readObserver, readObserver2, false, 4, null));
                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(null, writeObserver$runtime));
                            block.invoke();
                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(readObserver2);
                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(writeObserver$runtime);
                        } catch (Throwable th) {
                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(readObserver2);
                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(writeObserver$runtime);
                            throw th;
                        }
                    } else {
                        try {
                            try {
                                if (snapshot != null && !(snapshot instanceof MutableSnapshot)) {
                                    transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(readObserver);
                                    makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                                    block.invoke();
                                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                    transparentObserverMutableSnapshot.dispose();
                                }
                                block.invoke();
                                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                transparentObserverMutableSnapshot.dispose();
                            } catch (Throwable th2) {
                                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                throw th2;
                            }
                            makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                        } catch (Throwable th3) {
                            transparentObserverMutableSnapshot.dispose();
                            throw th3;
                        }
                        transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, readObserver, null, true, false);
                    }
                } else {
                    block.invoke();
                }
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                Object obj2 = this.currentScope;
                Intrinsics.checkNotNull(obj2);
                clearObsoleteStateReads(obj2);
                this.currentScope = obj;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i;
            } catch (Throwable th4) {
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                throw th4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearObsoleteStateReads(Object scope) {
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

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void removeScopeIf(Function1<Object, Boolean> predicate) {
            long[] jArr;
            long[] jArr2;
            long j;
            char c;
            long j2;
            int i;
            long j3;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j4 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = mutableScatterMap.keys[i6];
                            j2 = j5;
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.values[i6];
                            Boolean invoke = predicate.invoke(obj);
                            if (invoke.booleanValue()) {
                                MutableObjectIntMap mutableObjectIntMap2 = mutableObjectIntMap;
                                Object[] objArr = mutableObjectIntMap2.keys;
                                int[] iArr = mutableObjectIntMap2.values;
                                long[] jArr4 = mutableObjectIntMap2.metadata;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j4;
                                    int i8 = 0;
                                    while (true) {
                                        long j6 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j6 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    j3 = j6;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    removeObservation(obj, obj2);
                                                } else {
                                                    j3 = j6;
                                                }
                                                j6 = j3 >> i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                    if (invoke.booleanValue()) {
                                        mutableScatterMap.removeValueAt(i6);
                                    }
                                    i = 8;
                                }
                            }
                            jArr2 = jArr3;
                            j = j4;
                            if (invoke.booleanValue()) {
                            }
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j4 = j >> i;
                        c2 = c;
                        j5 = j2;
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

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        private final void removeObservation(Object scope, Object value) {
            ScopeMap.m4755removeimpl(this.valueToScopes, value, scope);
            if (!(value instanceof DerivedState) || ScopeMap.m4749containsimpl(this.valueToScopes, value)) {
                return;
            }
            ScopeMap.m4757removeScopeimpl(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            ScopeMap.m4746clearimpl(this.valueToScopes);
            this.scopeToValues.clear();
            ScopeMap.m4746clearimpl(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:255:0x054d  */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [int] */
        /* JADX WARN: Type inference failed for: r12v19 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3, types: [int] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean recordInvalidation(Set<? extends Object> changes) {
            boolean z;
            Iterator it;
            Object obj;
            String str;
            HashMap<DerivedState<?>, Object> hashMap;
            boolean z2;
            Object obj2;
            boolean z3;
            long[] jArr;
            Iterator it2;
            Object obj3;
            MutableScatterMap<Object, Object> mutableScatterMap;
            long[] jArr2;
            String str2;
            long j;
            HashMap<DerivedState<?>, Object> hashMap2;
            int i;
            long[] jArr3;
            MutableScatterMap<Object, Object> mutableScatterMap2;
            HashMap<DerivedState<?>, Object> hashMap3;
            Object[] objArr;
            long[] jArr4;
            MutableScatterMap<Object, Object> mutableScatterMap3;
            HashMap<DerivedState<?>, Object> hashMap4;
            Object[] objArr2;
            int i2;
            long j2;
            int i3;
            MutableScatterMap<Object, Object> mutableScatterMap4;
            HashMap<DerivedState<?>, Object> hashMap5;
            long j3;
            int i4;
            int i5;
            boolean z4;
            int i6;
            MutableScatterMap<Object, Object> mutableScatterMap5 = this.dependencyToDerivedStates;
            HashMap<DerivedState<?>, Object> hashMap6 = this.recordedDerivedStateValues;
            MutableScatterMap<Object, Object> mutableScatterMap6 = this.valueToScopes;
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i7 = 8;
            if (changes instanceof ScatterSetWrapper) {
                ScatterSet set$runtime = ((ScatterSetWrapper) changes).getSet$runtime();
                Object[] objArr3 = set$runtime.elements;
                long[] jArr5 = set$runtime.metadata;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    z = false;
                    while (true) {
                        long j4 = jArr5[i8];
                        int i9 = length;
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i8 - i9)) >>> 31);
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((j4 & 255) < 128) {
                                    Object obj4 = objArr3[(i8 << 3) + i11];
                                    int i12 = i7;
                                    if (obj4 instanceof StateObjectImpl) {
                                        ReaderKind.Companion companion = ReaderKind.INSTANCE;
                                        if (!((StateObjectImpl) obj4).m4853isReadInh_f27i8$runtime(ReaderKind.m4837constructorimpl(2))) {
                                            jArr4 = jArr5;
                                            mutableScatterMap3 = mutableScatterMap5;
                                            hashMap4 = hashMap6;
                                            objArr2 = objArr3;
                                            i2 = i11;
                                            j2 = j4;
                                            i3 = 8;
                                        }
                                    }
                                    if (this.readingDerivedStates || !ScopeMap.m4749containsimpl(mutableScatterMap5, obj4)) {
                                        jArr4 = jArr5;
                                        mutableScatterMap3 = mutableScatterMap5;
                                        hashMap4 = hashMap6;
                                        objArr2 = objArr3;
                                        i2 = i11;
                                        j2 = j4;
                                    } else {
                                        this.readingDerivedStates = true;
                                        try {
                                            Object obj5 = mutableScatterMap5.get(obj4);
                                            if (obj5 == null) {
                                                jArr4 = jArr5;
                                            } else if (obj5 instanceof MutableScatterSet) {
                                                MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj5;
                                                Object[] objArr4 = mutableScatterSet2.elements;
                                                long[] jArr6 = mutableScatterSet2.metadata;
                                                jArr4 = jArr5;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    objArr2 = objArr3;
                                                    int i13 = 0;
                                                    while (true) {
                                                        long j5 = jArr6[i13];
                                                        j2 = j4;
                                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                            int i15 = 0;
                                                            while (i15 < i14) {
                                                                if ((j5 & 255) < 128) {
                                                                    j3 = j5;
                                                                    DerivedState<?> derivedState = (DerivedState) objArr4[(i13 << 3) + i15];
                                                                    Intrinsics.checkNotNull(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                    Object obj6 = hashMap6.get(derivedState);
                                                                    SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                                                                    if (policy == null) {
                                                                        policy = SnapshotStateKt.structuralEqualityPolicy();
                                                                    }
                                                                    i4 = i11;
                                                                    i5 = i15;
                                                                    if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj6)) {
                                                                        mutableScatterMap4 = mutableScatterMap5;
                                                                        hashMap5 = hashMap6;
                                                                        Boolean.valueOf(this.statesToReread.add(derivedState));
                                                                    } else {
                                                                        Object obj7 = mutableScatterMap6.get(derivedState);
                                                                        if (obj7 != null) {
                                                                            if (obj7 instanceof MutableScatterSet) {
                                                                                MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj7;
                                                                                Object[] objArr5 = mutableScatterSet3.elements;
                                                                                long[] jArr7 = mutableScatterSet3.metadata;
                                                                                int length3 = jArr7.length - 2;
                                                                                if (length3 >= 0) {
                                                                                    int i16 = 0;
                                                                                    while (true) {
                                                                                        long j6 = jArr7[i16];
                                                                                        mutableScatterMap4 = mutableScatterMap5;
                                                                                        hashMap5 = hashMap6;
                                                                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                            int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                                                                            int i18 = 0;
                                                                                            while (i18 < i17) {
                                                                                                if ((j6 & 255) < 128) {
                                                                                                    i6 = i18;
                                                                                                    mutableScatterSet.add(objArr5[(i16 << 3) + i18]);
                                                                                                    z = true;
                                                                                                } else {
                                                                                                    i6 = i18;
                                                                                                }
                                                                                                j6 >>= i12;
                                                                                                i18 = i6 + 1;
                                                                                            }
                                                                                            if (i17 != i12) {
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (i16 == length3) {
                                                                                            break;
                                                                                        }
                                                                                        i16++;
                                                                                        mutableScatterMap5 = mutableScatterMap4;
                                                                                        hashMap6 = hashMap5;
                                                                                        i12 = 8;
                                                                                    }
                                                                                    z4 = z;
                                                                                    Unit unit = Unit.INSTANCE;
                                                                                    z = z4;
                                                                                }
                                                                            } else {
                                                                                mutableScatterMap4 = mutableScatterMap5;
                                                                                hashMap5 = hashMap6;
                                                                                mutableScatterSet.add(obj7);
                                                                                z4 = true;
                                                                                Unit unit2 = Unit.INSTANCE;
                                                                                z = z4;
                                                                            }
                                                                        }
                                                                        mutableScatterMap4 = mutableScatterMap5;
                                                                        hashMap5 = hashMap6;
                                                                        z4 = z;
                                                                        Unit unit22 = Unit.INSTANCE;
                                                                        z = z4;
                                                                    }
                                                                } else {
                                                                    mutableScatterMap4 = mutableScatterMap5;
                                                                    hashMap5 = hashMap6;
                                                                    j3 = j5;
                                                                    i4 = i11;
                                                                    i5 = i15;
                                                                }
                                                                j5 = j3 >> 8;
                                                                i15 = i5 + 1;
                                                                i12 = 8;
                                                                i11 = i4;
                                                                mutableScatterMap5 = mutableScatterMap4;
                                                                hashMap6 = hashMap5;
                                                            }
                                                            mutableScatterMap3 = mutableScatterMap5;
                                                            hashMap4 = hashMap6;
                                                            i2 = i11;
                                                            if (i14 != i12) {
                                                                break;
                                                            }
                                                        } else {
                                                            mutableScatterMap3 = mutableScatterMap5;
                                                            hashMap4 = hashMap6;
                                                            i2 = i11;
                                                        }
                                                        if (i13 == length2) {
                                                            break;
                                                        }
                                                        i13++;
                                                        j4 = j2;
                                                        i11 = i2;
                                                        mutableScatterMap5 = mutableScatterMap3;
                                                        hashMap6 = hashMap4;
                                                        i12 = 8;
                                                    }
                                                }
                                            } else {
                                                jArr4 = jArr5;
                                                mutableScatterMap3 = mutableScatterMap5;
                                                objArr2 = objArr3;
                                                i2 = i11;
                                                j2 = j4;
                                                DerivedState<?> derivedState2 = (DerivedState) obj5;
                                                HashMap<DerivedState<?>, Object> hashMap7 = hashMap6;
                                                Object obj8 = hashMap7.get(derivedState2);
                                                SnapshotMutationPolicy<?> policy2 = derivedState2.getPolicy();
                                                if (policy2 == null) {
                                                    policy2 = SnapshotStateKt.structuralEqualityPolicy();
                                                }
                                                if (policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj8)) {
                                                    hashMap4 = hashMap7;
                                                    Boolean.valueOf(this.statesToReread.add(derivedState2));
                                                } else {
                                                    Object obj9 = mutableScatterMap6.get(derivedState2);
                                                    if (obj9 != null) {
                                                        if (obj9 instanceof MutableScatterSet) {
                                                            MutableScatterSet mutableScatterSet4 = (MutableScatterSet) obj9;
                                                            Object[] objArr6 = mutableScatterSet4.elements;
                                                            long[] jArr8 = mutableScatterSet4.metadata;
                                                            int length4 = jArr8.length - 2;
                                                            if (length4 >= 0) {
                                                                int i19 = 0;
                                                                while (true) {
                                                                    long j7 = jArr8[i19];
                                                                    hashMap4 = hashMap7;
                                                                    Object[] objArr7 = objArr6;
                                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i20 = 8 - ((~(i19 - length4)) >>> 31);
                                                                        for (int i21 = 0; i21 < i20; i21++) {
                                                                            if ((j7 & 255) < 128) {
                                                                                mutableScatterSet.add(objArr7[(i19 << 3) + i21]);
                                                                                z = true;
                                                                            }
                                                                            j7 >>= 8;
                                                                        }
                                                                        if (i20 != 8) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i19 == length4) {
                                                                        break;
                                                                    }
                                                                    i19++;
                                                                    objArr6 = objArr7;
                                                                    hashMap7 = hashMap4;
                                                                }
                                                            }
                                                        } else {
                                                            hashMap4 = hashMap7;
                                                            mutableScatterSet.add(obj9);
                                                            z = true;
                                                        }
                                                        Unit unit3 = Unit.INSTANCE;
                                                    }
                                                    hashMap4 = hashMap7;
                                                    Unit unit32 = Unit.INSTANCE;
                                                }
                                            }
                                            mutableScatterMap3 = mutableScatterMap5;
                                            hashMap4 = hashMap6;
                                            objArr2 = objArr3;
                                            i2 = i11;
                                            j2 = j4;
                                        } finally {
                                        }
                                    }
                                    Object obj10 = mutableScatterMap6.get(obj4);
                                    if (obj10 != null) {
                                        if (obj10 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj10;
                                            Object[] objArr8 = mutableScatterSet5.elements;
                                            long[] jArr9 = mutableScatterSet5.metadata;
                                            int length5 = jArr9.length - 2;
                                            if (length5 >= 0) {
                                                int i22 = 0;
                                                while (true) {
                                                    long j8 = jArr9[i22];
                                                    Object[] objArr9 = objArr8;
                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i23 = 8 - ((~(i22 - length5)) >>> 31);
                                                        for (int i24 = 0; i24 < i23; i24++) {
                                                            if ((j8 & 255) < 128) {
                                                                mutableScatterSet.add(objArr9[(i22 << 3) + i24]);
                                                                z = true;
                                                            }
                                                            j8 >>= 8;
                                                        }
                                                        if (i23 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i22 == length5) {
                                                        break;
                                                    }
                                                    i22++;
                                                    objArr8 = objArr9;
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.add(obj10);
                                            z = true;
                                        }
                                    }
                                    i3 = 8;
                                } else {
                                    jArr4 = jArr5;
                                    mutableScatterMap3 = mutableScatterMap5;
                                    hashMap4 = hashMap6;
                                    objArr2 = objArr3;
                                    i2 = i11;
                                    j2 = j4;
                                    i3 = i7;
                                }
                                j4 = j2 >> i3;
                                i11 = i2 + 1;
                                i7 = i3;
                                jArr5 = jArr4;
                                objArr3 = objArr2;
                                mutableScatterMap5 = mutableScatterMap3;
                                hashMap6 = hashMap4;
                            }
                            jArr3 = jArr5;
                            mutableScatterMap2 = mutableScatterMap5;
                            hashMap3 = hashMap6;
                            objArr = objArr3;
                            if (i10 != i7) {
                                break;
                            }
                        } else {
                            jArr3 = jArr5;
                            mutableScatterMap2 = mutableScatterMap5;
                            hashMap3 = hashMap6;
                            objArr = objArr3;
                        }
                        length = i9;
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                        jArr5 = jArr3;
                        objArr3 = objArr;
                        mutableScatterMap5 = mutableScatterMap2;
                        hashMap6 = hashMap3;
                        i7 = 8;
                    }
                } else {
                    z = false;
                }
            } else {
                MutableScatterMap<Object, Object> mutableScatterMap7 = mutableScatterMap5;
                HashMap<DerivedState<?>, Object> hashMap8 = hashMap6;
                Iterator it3 = changes.iterator();
                boolean z5 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof StateObjectImpl) {
                        ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                        if (!((StateObjectImpl) next).m4853isReadInh_f27i8$runtime(ReaderKind.m4837constructorimpl(2))) {
                            it = it3;
                            str = str3;
                            hashMap = hashMap8;
                            hashMap8 = hashMap;
                            str3 = str;
                            it3 = it;
                        }
                    }
                    if (!this.readingDerivedStates) {
                        MutableScatterMap<Object, Object> mutableScatterMap8 = mutableScatterMap7;
                        if (ScopeMap.m4749containsimpl(mutableScatterMap8, next)) {
                            this.readingDerivedStates = true;
                            try {
                                Object obj11 = mutableScatterMap8.get(next);
                                if (obj11 != null) {
                                    if (obj11 instanceof MutableScatterSet) {
                                        MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj11;
                                        Object[] objArr10 = mutableScatterSet6.elements;
                                        long[] jArr10 = mutableScatterSet6.metadata;
                                        int length6 = jArr10.length - 2;
                                        if (length6 >= 0) {
                                            int i25 = 0;
                                            while (true) {
                                                long j9 = jArr10[i25];
                                                Object[] objArr11 = objArr10;
                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i26 = 8 - ((~(i25 - length6)) >>> 31);
                                                    int i27 = 0;
                                                    while (i27 < i26) {
                                                        if ((j9 & 255) < 128) {
                                                            DerivedState<?> derivedState3 = (DerivedState) objArr11[(i25 << 3) + i27];
                                                            Intrinsics.checkNotNull(derivedState3, str3);
                                                            it2 = it3;
                                                            mutableScatterMap = mutableScatterMap8;
                                                            hashMap2 = hashMap8;
                                                            Object obj12 = hashMap2.get(derivedState3);
                                                            SnapshotMutationPolicy<?> policy3 = derivedState3.getPolicy();
                                                            if (policy3 == null) {
                                                                policy3 = SnapshotStateKt.structuralEqualityPolicy();
                                                            }
                                                            jArr2 = jArr10;
                                                            str2 = str3;
                                                            if (policy3.equivalent(derivedState3.getCurrentRecord().getCurrentValue(), obj12)) {
                                                                obj3 = next;
                                                                j = j9;
                                                                Boolean.valueOf(this.statesToReread.add(derivedState3));
                                                            } else {
                                                                Object obj13 = mutableScatterMap6.get(derivedState3);
                                                                if (obj13 != null) {
                                                                    if (obj13 instanceof MutableScatterSet) {
                                                                        MutableScatterSet mutableScatterSet7 = (MutableScatterSet) obj13;
                                                                        Object[] objArr12 = mutableScatterSet7.elements;
                                                                        long[] jArr11 = mutableScatterSet7.metadata;
                                                                        int length7 = jArr11.length - 2;
                                                                        if (length7 >= 0) {
                                                                            j = j9;
                                                                            int i28 = 0;
                                                                            while (true) {
                                                                                long j10 = jArr11[i28];
                                                                                obj3 = next;
                                                                                long[] jArr12 = jArr11;
                                                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i29 = 8 - ((~(i28 - length7)) >>> 31);
                                                                                    int i30 = 0;
                                                                                    while (i30 < i29) {
                                                                                        if ((j10 & 255) < 128) {
                                                                                            i = i30;
                                                                                            mutableScatterSet.add(objArr12[(i28 << 3) + i30]);
                                                                                            z5 = true;
                                                                                        } else {
                                                                                            i = i30;
                                                                                        }
                                                                                        j10 >>= 8;
                                                                                        i30 = i + 1;
                                                                                    }
                                                                                    if (i29 != 8) {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (i28 == length7) {
                                                                                    break;
                                                                                }
                                                                                i28++;
                                                                                next = obj3;
                                                                                jArr11 = jArr12;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        obj3 = next;
                                                                        j = j9;
                                                                        mutableScatterSet.add(obj13);
                                                                        z5 = true;
                                                                    }
                                                                    Unit unit4 = Unit.INSTANCE;
                                                                }
                                                                obj3 = next;
                                                                j = j9;
                                                                Unit unit42 = Unit.INSTANCE;
                                                            }
                                                        } else {
                                                            it2 = it3;
                                                            obj3 = next;
                                                            mutableScatterMap = mutableScatterMap8;
                                                            jArr2 = jArr10;
                                                            str2 = str3;
                                                            j = j9;
                                                            hashMap2 = hashMap8;
                                                        }
                                                        j9 = j >> 8;
                                                        i27++;
                                                        hashMap8 = hashMap2;
                                                        next = obj3;
                                                        jArr10 = jArr2;
                                                        str3 = str2;
                                                        mutableScatterMap8 = mutableScatterMap;
                                                        it3 = it2;
                                                    }
                                                    it = it3;
                                                    obj = next;
                                                    mutableScatterMap7 = mutableScatterMap8;
                                                    jArr = jArr10;
                                                    str = str3;
                                                    hashMap = hashMap8;
                                                    if (i26 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    it = it3;
                                                    obj = next;
                                                    mutableScatterMap7 = mutableScatterMap8;
                                                    jArr = jArr10;
                                                    str = str3;
                                                    hashMap = hashMap8;
                                                }
                                                if (i25 == length6) {
                                                    break;
                                                }
                                                i25++;
                                                hashMap8 = hashMap;
                                                objArr10 = objArr11;
                                                next = obj;
                                                jArr10 = jArr;
                                                str3 = str;
                                                mutableScatterMap8 = mutableScatterMap7;
                                                it3 = it;
                                            }
                                        }
                                    } else {
                                        it = it3;
                                        obj = next;
                                        mutableScatterMap7 = mutableScatterMap8;
                                        str = str3;
                                        hashMap = hashMap8;
                                        DerivedState<?> derivedState4 = (DerivedState) obj11;
                                        Object obj14 = hashMap.get(derivedState4);
                                        SnapshotMutationPolicy<?> policy4 = derivedState4.getPolicy();
                                        if (policy4 == null) {
                                            policy4 = SnapshotStateKt.structuralEqualityPolicy();
                                        }
                                        if (policy4.equivalent(derivedState4.getCurrentRecord().getCurrentValue(), obj14)) {
                                            Boolean.valueOf(this.statesToReread.add(derivedState4));
                                        } else {
                                            Object obj15 = mutableScatterMap6.get(derivedState4);
                                            if (obj15 != null) {
                                                if (obj15 instanceof MutableScatterSet) {
                                                    MutableScatterSet mutableScatterSet8 = (MutableScatterSet) obj15;
                                                    Object[] objArr13 = mutableScatterSet8.elements;
                                                    long[] jArr13 = mutableScatterSet8.metadata;
                                                    int length8 = jArr13.length - 2;
                                                    if (length8 >= 0) {
                                                        int i31 = 0;
                                                        while (true) {
                                                            long j11 = jArr13[i31];
                                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i32 = 8 - ((~(i31 - length8)) >>> 31);
                                                                for (int i33 = 0; i33 < i32; i33++) {
                                                                    if ((j11 & 255) < 128) {
                                                                        mutableScatterSet.add(objArr13[(i31 << 3) + i33]);
                                                                        z5 = true;
                                                                    }
                                                                    j11 >>= 8;
                                                                }
                                                                if (i32 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i31 == length8) {
                                                                break;
                                                            }
                                                            i31++;
                                                        }
                                                    }
                                                } else {
                                                    mutableScatterSet.add(obj15);
                                                    z3 = true;
                                                    Unit unit5 = Unit.INSTANCE;
                                                    z5 = z3;
                                                }
                                            }
                                            z3 = z5;
                                            Unit unit52 = Unit.INSTANCE;
                                            z5 = z3;
                                        }
                                    }
                                    boolean z6 = z5;
                                    obj2 = mutableScatterMap6.get(obj);
                                    if (obj2 != null) {
                                        if (obj2 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet9 = (MutableScatterSet) obj2;
                                            Object[] objArr14 = mutableScatterSet9.elements;
                                            long[] jArr14 = mutableScatterSet9.metadata;
                                            int length9 = jArr14.length - 2;
                                            if (length9 >= 0) {
                                                ?? r7 = z2;
                                                while (true) {
                                                    long j12 = jArr14[r7];
                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i34 = 8 - ((~(r7 - length9)) >>> 31);
                                                        for (?? r12 = z2; r12 < i34; r12++) {
                                                            if ((j12 & 255) < 128) {
                                                                mutableScatterSet.add(objArr14[(r7 << 3) + r12]);
                                                                z6 = true;
                                                            }
                                                            j12 >>= 8;
                                                        }
                                                        if (i34 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (r7 == length9) {
                                                        break;
                                                    }
                                                    r7++;
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.add(obj2);
                                            z6 = true;
                                        }
                                        z5 = z6;
                                        hashMap8 = hashMap;
                                        str3 = str;
                                        it3 = it;
                                    }
                                    z5 = z6;
                                    hashMap8 = hashMap;
                                    str3 = str;
                                    it3 = it;
                                }
                                it = it3;
                                obj = next;
                                mutableScatterMap7 = mutableScatterMap8;
                                str = str3;
                                hashMap = hashMap8;
                                boolean z62 = z5;
                                obj2 = mutableScatterMap6.get(obj);
                                if (obj2 != null) {
                                }
                                z5 = z62;
                                hashMap8 = hashMap;
                                str3 = str;
                                it3 = it;
                            } finally {
                            }
                        } else {
                            mutableScatterMap7 = mutableScatterMap8;
                        }
                    }
                    it = it3;
                    obj = next;
                    str = str3;
                    hashMap = hashMap8;
                    z2 = false;
                    boolean z622 = z5;
                    obj2 = mutableScatterMap6.get(obj);
                    if (obj2 != null) {
                    }
                    z5 = z622;
                    hashMap8 = hashMap;
                    str3 = str;
                    it3 = it;
                }
                z = z5;
            }
            if (!this.readingDerivedStates && this.statesToReread.getSize() != 0) {
                MutableVector<DerivedState<?>> mutableVector = this.statesToReread;
                DerivedState<?>[] derivedStateArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i35 = 0; i35 < size; i35++) {
                    rereadDerivedState(derivedStateArr[i35]);
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
            int hashCode = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            Object obj = this.valueToScopes.get(derivedState);
            if (obj == null) {
                return;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i2 = 1;
            int i3 = 0;
            if (!(obj instanceof MutableScatterSet)) {
                MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj);
                if (mutableObjectIntMap2 == null) {
                    mutableObjectIntMap2 = new MutableObjectIntMap<>(i3, i2, defaultConstructorMarker);
                    mutableScatterMap.set(obj, mutableObjectIntMap2);
                    Unit unit = Unit.INSTANCE;
                }
                recordRead(derivedState, hashCode, obj, mutableObjectIntMap2);
                return;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr3 = mutableScatterSet.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j = jArr3[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            i = i5;
                            Object obj2 = objArr[(i4 << 3) + i7];
                            MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj2);
                            jArr2 = jArr3;
                            if (mutableObjectIntMap3 == null) {
                                mutableObjectIntMap = new MutableObjectIntMap<>(i3, i2, defaultConstructorMarker);
                                mutableScatterMap.set(obj2, mutableObjectIntMap);
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                mutableObjectIntMap = mutableObjectIntMap3;
                            }
                            recordRead(derivedState, hashCode, obj2, mutableObjectIntMap);
                        } else {
                            jArr2 = jArr3;
                            i = i5;
                        }
                        j >>= i;
                        i7++;
                        i5 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i6 != i5) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i4 == length) {
                    return;
                }
                i4++;
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
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ObservedScopeMap observedScopeMap = mutableVector.content[i2];
                observedScopeMap.clearScopeObservations(scope);
                if (!observedScopeMap.hasScopeObservations()) {
                    i++;
                } else if (i > 0) {
                    mutableVector.content[i2 - i] = mutableVector.content[i2];
                }
            }
            int i3 = size - i;
            ArraysKt.fill(mutableVector.content, (Object) null, i3, size);
            mutableVector.setSize(i3);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clearIf(Function1<Object, Boolean> predicate) {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ObservedScopeMap observedScopeMap = mutableVector.content[i2];
                observedScopeMap.removeScopeIf(predicate);
                if (!observedScopeMap.hasScopeObservations()) {
                    i++;
                } else if (i > 0) {
                    mutableVector.content[i2 - i] = mutableVector.content[i2];
                }
            }
            int i3 = size - i;
            ArraysKt.fill(mutableVector.content, (Object) null, i3, size);
            mutableVector.setSize(i3);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                observedScopeMapArr[i].clear();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
