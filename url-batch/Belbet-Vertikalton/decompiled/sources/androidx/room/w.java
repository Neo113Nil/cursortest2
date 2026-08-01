package androidx.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
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
import k0.InterfaceC0199a;
import k0.InterfaceC0200b;
import k0.InterfaceC0202d;
import k0.InterfaceC0203e;

/* loaded from: classes.dex */
public abstract class w {
    public static final v Companion = new v();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AbstractC0084a autoCloser;
    private final Map<String, Object> backingFieldMap;
    private InterfaceC0200b internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<Object> mCallbacks;
    protected volatile InterfaceC0199a mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final r invalidationTracker = createInvalidationTracker();
    private Map<Class<Object>, Object> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public w() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        j1.h.d(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(w wVar, InterfaceC0202d interfaceC0202d, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return wVar.query(interfaceC0202d, cancellationSignal);
    }

    public final void a() {
        assertNotMainThread();
        InterfaceC0199a d2 = ((l0.h) getOpenHelper()).d();
        getInvalidationTracker().d(d2);
        if (d2.o()) {
            d2.c();
        } else {
            d2.f();
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
        ((l0.h) getOpenHelper()).d().e();
        if (inTransaction()) {
            return;
        }
        r invalidationTracker = getInvalidationTracker();
        if (invalidationTracker.f2125f.compareAndSet(false, true)) {
            invalidationTracker.f2121a.getQueryExecutor().execute(invalidationTracker.f2130m);
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        a();
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            j1.h.d(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().getClass();
                ((l0.h) getOpenHelper()).close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public InterfaceC0203e compileStatement(String str) {
        j1.h.e(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return ((l0.h) getOpenHelper()).d().C(str);
    }

    public abstract r createInvalidationTracker();

    public abstract InterfaceC0200b createOpenHelper(j jVar);

    public void endTransaction() {
        b();
    }

    public final Map<Class<Object>, Object> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        j1.h.e(map, "autoMigrationSpecs");
        return X0.t.f1385a;
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        j1.h.d(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public r getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public InterfaceC0200b getOpenHelper() {
        InterfaceC0200b interfaceC0200b = this.internalOpenHelper;
        if (interfaceC0200b != null) {
            return interfaceC0200b;
        }
        j1.h.h("internalOpenHelper");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        j1.h.h("internalQueryExecutor");
        throw null;
    }

    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return X0.v.f1387a;
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return X0.u.f1386a;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        j1.h.h("internalTransactionExecutor");
        throw null;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        j1.h.e(cls, "klass");
        return (T) this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return ((l0.h) getOpenHelper()).d().x();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0159 A[LOOP:4: B:50:0x012a->B:62:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(j jVar) {
        j1.h.e(jVar, "configuration");
        this.internalOpenHelper = createOpenHelper(jVar);
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList = jVar.j;
            int i = -1;
            if (hasNext) {
                Class<Object> next = it.next();
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(arrayList.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, arrayList.get(i));
            } else {
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                Iterator<Object> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                InterfaceC0200b openHelper = getOpenHelper();
                if (!A.class.isInstance(openHelper)) {
                    openHelper = null;
                }
                if (openHelper != null) {
                    throw new ClassCastException();
                }
                InterfaceC0200b openHelper2 = getOpenHelper();
                if ((AbstractC0085b.class.isInstance(openHelper2) ? openHelper2 : null) != null) {
                    throw new ClassCastException();
                }
                boolean z2 = jVar.f2105d == 3;
                l0.h hVar = (l0.h) getOpenHelper();
                if (hVar.f3265d.f1342b != W0.h.f1344a) {
                    l0.g a2 = hVar.a();
                    j1.h.e(a2, "sQLiteOpenHelper");
                    a2.setWriteAheadLoggingEnabled(z2);
                }
                hVar.e = z2;
                this.mCallbacks = jVar.f2104c;
                this.internalQueryExecutor = jVar.e;
                this.internalTransactionExecutor = new D(jVar.f2106f);
                this.allowMainThreadQueries = false;
                this.writeAheadLoggingEnabled = z2;
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = requiredTypeConverters.entrySet().iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    ArrayList arrayList2 = jVar.i;
                    if (hasNext2) {
                        Map.Entry<Class<?>, List<Class<?>>> next2 = it3.next();
                        Class<?> key = next2.getKey();
                        for (Class<?> cls : next2.getValue()) {
                            int size3 = arrayList2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i4 = size3 - 1;
                                    if (cls.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i4 < 0) {
                                        break;
                                    } else {
                                        size3 = i4;
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
                            int i5 = size4 - 1;
                            if (!bitSet2.get(size4)) {
                                throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i5 < 0) {
                                return;
                            } else {
                                size4 = i5;
                            }
                        }
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(InterfaceC0199a interfaceC0199a) {
        j1.h.e(interfaceC0199a, "db");
        r invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        synchronized (invalidationTracker.f2129l) {
            if (invalidationTracker.f2126g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            interfaceC0199a.r("PRAGMA temp_store = MEMORY;");
            interfaceC0199a.r("PRAGMA recursive_triggers='ON';");
            interfaceC0199a.r("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.d(interfaceC0199a);
            invalidationTracker.f2127h = interfaceC0199a.C("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f2126g = true;
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        InterfaceC0199a interfaceC0199a = this.mDatabase;
        return j1.h.a(interfaceC0199a != null ? Boolean.valueOf(interfaceC0199a.isOpen()) : null, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        InterfaceC0199a interfaceC0199a = this.mDatabase;
        return interfaceC0199a != null && interfaceC0199a.isOpen();
    }

    public final Cursor query(InterfaceC0202d interfaceC0202d) {
        j1.h.e(interfaceC0202d, "query");
        return query$default(this, interfaceC0202d, null, 2, null);
    }

    public void runInTransaction(Runnable runnable) {
        j1.h.e(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public final void setAutoMigrationSpecs(Map<Class<Object>, Object> map) {
        j1.h.e(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public void setTransactionSuccessful() {
        ((l0.h) getOpenHelper()).d().w();
    }

    public Cursor query(String str, Object[] objArr) {
        j1.h.e(str, "query");
        return ((l0.h) getOpenHelper()).d().g(new B1.c(str, objArr));
    }

    public Cursor query(InterfaceC0202d interfaceC0202d, CancellationSignal cancellationSignal) {
        j1.h.e(interfaceC0202d, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return ((l0.h) getOpenHelper()).d().i(interfaceC0202d, cancellationSignal);
        }
        return ((l0.h) getOpenHelper()).d().g(interfaceC0202d);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        j1.h.e(callable, "body");
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
