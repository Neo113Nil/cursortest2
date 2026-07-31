package androidx.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import h.C0413b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v1.InterfaceC1018a;

/* loaded from: classes.dex */
public abstract class s {
    public static final r Companion = new r();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private a autoCloser;
    private final Map<String, Object> backingFieldMap;
    private v1.b internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<Object> mCallbacks;
    protected volatile InterfaceC1018a mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final o invalidationTracker = createInvalidationTracker();
    private Map<Class<Object>, Object> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public s() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Z1.i.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    @L1.c
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @L1.c
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(s sVar, v1.d dVar, CancellationSignal cancellationSignal, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i3 & 2) != 0) {
            cancellationSignal = null;
        }
        return sVar.query(dVar, cancellationSignal);
    }

    public final void a() {
        assertNotMainThread();
        InterfaceC1018a a3 = ((w1.g) getOpenHelper()).a();
        getInvalidationTracker().d(a3);
        if (a3.n()) {
            a3.y();
        } else {
            a3.f();
        }
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void b() {
        ((w1.g) getOpenHelper()).a().d();
        if (inTransaction()) {
            return;
        }
        o invalidationTracker = getInvalidationTracker();
        if (invalidationTracker.f4094f.compareAndSet(false, true)) {
            invalidationTracker.f4089a.getQueryExecutor().execute(invalidationTracker.f4101m);
        }
    }

    @L1.c
    public void beginTransaction() {
        assertNotMainThread();
        a();
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            Z1.i.e(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().getClass();
                ((w1.g) getOpenHelper()).close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public v1.e compileStatement(String str) {
        Z1.i.f(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return ((w1.g) getOpenHelper()).a().w(str);
    }

    public abstract o createInvalidationTracker();

    public abstract v1.b createOpenHelper(i iVar);

    @L1.c
    public void endTransaction() {
        b();
    }

    public final Map<Class<Object>, Object> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        Z1.i.f(map, "autoMigrationSpecs");
        return M1.u.f2803d;
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        Z1.i.e(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public o getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public v1.b getOpenHelper() {
        v1.b bVar = this.internalOpenHelper;
        if (bVar != null) {
            return bVar;
        }
        Z1.i.j("internalOpenHelper");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Z1.i.j("internalQueryExecutor");
        throw null;
    }

    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return M1.w.f2805d;
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return M1.v.f2804d;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Z1.i.j("internalTransactionExecutor");
        throw null;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        Z1.i.f(cls, "klass");
        return (T) this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return ((w1.g) getOpenHelper()).a().M();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015b A[LOOP:4: B:50:0x012c->B:62:0x015b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(i iVar) {
        Z1.i.f(iVar, "configuration");
        this.internalOpenHelper = createOpenHelper(iVar);
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList = iVar.f4080f;
            int i3 = -1;
            if (hasNext) {
                Class<Object> next = it.next();
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i4 = size - 1;
                        if (next.isAssignableFrom(arrayList.get(size).getClass())) {
                            bitSet.set(size);
                            i3 = size;
                            break;
                        } else if (i4 < 0) {
                            break;
                        } else {
                            size = i4;
                        }
                    }
                }
                if (i3 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, arrayList.get(i3));
            } else {
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i5 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i5 < 0) {
                            break;
                        } else {
                            size2 = i5;
                        }
                    }
                }
                Iterator<Object> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                v1.b openHelper = getOpenHelper();
                if (!w.class.isInstance(openHelper)) {
                    openHelper = null;
                }
                if (openHelper != null) {
                    throw new ClassCastException();
                }
                v1.b openHelper2 = getOpenHelper();
                if ((b.class.isInstance(openHelper2) ? openHelper2 : null) != null) {
                    throw new ClassCastException();
                }
                boolean z3 = iVar.f4078d == 3;
                w1.g gVar = (w1.g) getOpenHelper();
                if (gVar.f8597g.f2715e != L1.w.f2726a) {
                    w1.f fVar = (w1.f) gVar.f8597g.getValue();
                    Z1.i.f(fVar, "sQLiteOpenHelper");
                    fVar.setWriteAheadLoggingEnabled(z3);
                }
                gVar.f8598h = z3;
                this.mCallbacks = iVar.f4077c;
                this.internalQueryExecutor = C0413b.f4860c;
                this.internalTransactionExecutor = new z();
                this.allowMainThreadQueries = false;
                this.writeAheadLoggingEnabled = z3;
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = requiredTypeConverters.entrySet().iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    ArrayList arrayList2 = iVar.f4079e;
                    if (hasNext2) {
                        Map.Entry<Class<?>, List<Class<?>>> next2 = it3.next();
                        Class<?> key = next2.getKey();
                        for (Class<?> cls : next2.getValue()) {
                            int size3 = arrayList2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i6 = size3 - 1;
                                    if (cls.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i6 < 0) {
                                        break;
                                    } else {
                                        size3 = i6;
                                    }
                                }
                                if (size3 >= 0) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                this.typeConverters.put(cls, arrayList2.get(size3));
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                            }
                        }
                    } else {
                        int size4 = arrayList2.size() - 1;
                        if (size4 < 0) {
                            return;
                        }
                        while (true) {
                            int i7 = size4 - 1;
                            if (!bitSet2.get(size4)) {
                                throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i7 < 0) {
                                return;
                            } else {
                                size4 = i7;
                            }
                        }
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(InterfaceC1018a interfaceC1018a) {
        Z1.i.f(interfaceC1018a, "db");
        o invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        synchronized (invalidationTracker.f4100l) {
            if (invalidationTracker.f4095g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            interfaceC1018a.q("PRAGMA temp_store = MEMORY;");
            interfaceC1018a.q("PRAGMA recursive_triggers='ON';");
            interfaceC1018a.q("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.d(interfaceC1018a);
            invalidationTracker.f4096h = interfaceC1018a.w("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f4095g = true;
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        InterfaceC1018a interfaceC1018a = this.mDatabase;
        return Z1.i.a(interfaceC1018a != null ? Boolean.valueOf(interfaceC1018a.isOpen()) : null, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        InterfaceC1018a interfaceC1018a = this.mDatabase;
        return interfaceC1018a != null && interfaceC1018a.isOpen();
    }

    public final Cursor query(v1.d dVar) {
        Z1.i.f(dVar, "query");
        return query$default(this, dVar, null, 2, null);
    }

    public void runInTransaction(Runnable runnable) {
        Z1.i.f(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public final void setAutoMigrationSpecs(Map<Class<Object>, Object> map) {
        Z1.i.f(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @L1.c
    public void setTransactionSuccessful() {
        ((w1.g) getOpenHelper()).a().s();
    }

    public Cursor query(String str, Object[] objArr) {
        Z1.i.f(str, "query");
        return ((w1.g) getOpenHelper()).a().H(new C2.c(str, objArr));
    }

    public Cursor query(v1.d dVar, CancellationSignal cancellationSignal) {
        Z1.i.f(dVar, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return ((w1.g) getOpenHelper()).a().E(dVar, cancellationSignal);
        }
        return ((w1.g) getOpenHelper()).a().H(dVar);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        Z1.i.f(callable, "body");
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
