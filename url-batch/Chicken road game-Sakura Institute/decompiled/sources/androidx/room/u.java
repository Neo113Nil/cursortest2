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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class u {
    public static final t Companion = new t();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private a autoCloser;
    private final Map<String, Object> backingFieldMap;
    private y3.b internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<? extends s> mCallbacks;
    protected volatile y3.a mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final p invalidationTracker = createInvalidationTracker();
    private Map<Class<Object>, Object> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public u() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        r6.k.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public static /* synthetic */ Cursor query$default(u uVar, y3.d dVar, CancellationSignal cancellationSignal, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i7 & 2) != 0) {
            cancellationSignal = null;
        }
        return uVar.query(dVar, cancellationSignal);
    }

    public final void a() {
        assertNotMainThread();
        y3.a b9 = ((z3.g) getOpenHelper()).b();
        getInvalidationTracker().d(b9);
        if (b9.x()) {
            b9.C();
        } else {
            b9.e();
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
        ((z3.g) getOpenHelper()).b().d();
        if (inTransaction()) {
            return;
        }
        p invalidationTracker = getInvalidationTracker();
        if (invalidationTracker.f1109f.compareAndSet(false, true)) {
            invalidationTracker.f1104a.getQueryExecutor().execute(invalidationTracker.f1116m);
        }
    }

    @d6.c
    public void beginTransaction() {
        assertNotMainThread();
        a();
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            r6.k.e(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().getClass();
                ((z3.g) getOpenHelper()).close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public y3.e compileStatement(String str) {
        r6.k.f(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return ((z3.g) getOpenHelper()).b().m(str);
    }

    public abstract p createInvalidationTracker();

    public abstract y3.b createOpenHelper(g gVar);

    @d6.c
    public void endTransaction() {
        b();
    }

    public final Map<Class<Object>, Object> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        r6.k.f(map, "autoMigrationSpecs");
        return e6.u.f2826f;
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        r6.k.e(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public p getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public y3.b getOpenHelper() {
        y3.b bVar = this.internalOpenHelper;
        if (bVar != null) {
            return bVar;
        }
        r6.k.j("internalOpenHelper");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        r6.k.j("internalQueryExecutor");
        throw null;
    }

    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return e6.w.f2828f;
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return e6.v.f2827f;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        r6.k.j("internalTransactionExecutor");
        throw null;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        r6.k.f(cls, "klass");
        return (T) this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return ((z3.g) getOpenHelper()).b().s();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015b A[LOOP:4: B:50:0x012c->B:62:0x015b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(g gVar) {
        r6.k.f(gVar, "configuration");
        ArrayList arrayList = gVar.f1089g;
        ArrayList arrayList2 = gVar.f1088f;
        this.internalOpenHelper = createOpenHelper(gVar);
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i7 = -1;
            if (it.hasNext()) {
                Class<Object> next = it.next();
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i8 = size - 1;
                        if (next.isAssignableFrom(arrayList.get(size).getClass())) {
                            bitSet.set(size);
                            i7 = size;
                            break;
                        } else if (i8 < 0) {
                            break;
                        } else {
                            size = i8;
                        }
                    }
                }
                if (i7 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, arrayList.get(i7));
            } else {
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i9 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i9 < 0) {
                            break;
                        } else {
                            size2 = i9;
                        }
                    }
                }
                Iterator<Object> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                y3.b openHelper = getOpenHelper();
                if (!y.class.isInstance(openHelper)) {
                    openHelper = null;
                }
                if (openHelper != null) {
                    throw new ClassCastException();
                }
                y3.b openHelper2 = getOpenHelper();
                if ((b.class.isInstance(openHelper2) ? openHelper2 : null) != null) {
                    throw new ClassCastException();
                }
                boolean z8 = gVar.f1086d == 3;
                z3.g gVar2 = (z3.g) getOpenHelper();
                if (gVar2.f10088i.f2625g != d6.w.f2636a) {
                    z3.f fVar = (z3.f) gVar2.f10088i.getValue();
                    r6.k.f(fVar, "sQLiteOpenHelper");
                    fVar.setWriteAheadLoggingEnabled(z8);
                }
                gVar2.f10089j = z8;
                this.mCallbacks = gVar.f1085c;
                this.internalQueryExecutor = g.b.f3654f;
                this.internalTransactionExecutor = new c0();
                this.allowMainThreadQueries = false;
                this.writeAheadLoggingEnabled = z8;
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = arrayList2.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i10 = size3 - 1;
                                if (cls.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i10 < 0) {
                                    break;
                                } else {
                                    size3 = i10;
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
                }
                int size4 = arrayList2.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i11 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i11 < 0) {
                        return;
                    } else {
                        size4 = i11;
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(y3.a aVar) {
        r6.k.f(aVar, "db");
        p invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        synchronized (invalidationTracker.f1115l) {
            if (invalidationTracker.f1110g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            aVar.i("PRAGMA temp_store = MEMORY;");
            aVar.i("PRAGMA recursive_triggers='ON';");
            aVar.i("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.d(aVar);
            invalidationTracker.f1111h = aVar.m("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f1110g = true;
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        y3.a aVar = this.mDatabase;
        return r6.k.a(aVar != null ? Boolean.valueOf(aVar.isOpen()) : null, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        y3.a aVar = this.mDatabase;
        return aVar != null && aVar.isOpen();
    }

    public final Cursor query(y3.d dVar) {
        r6.k.f(dVar, "query");
        return query$default(this, dVar, null, 2, null);
    }

    public void runInTransaction(Runnable runnable) {
        r6.k.f(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public final void setAutoMigrationSpecs(Map<Class<Object>, Object> map) {
        r6.k.f(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @d6.c
    public void setTransactionSuccessful() {
        ((z3.g) getOpenHelper()).b().A();
    }

    public Cursor query(String str, Object[] objArr) {
        r6.k.f(str, "query");
        return ((z3.g) getOpenHelper()).b().p(new q5.g(str, objArr));
    }

    public Cursor query(y3.d dVar, CancellationSignal cancellationSignal) {
        r6.k.f(dVar, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return ((z3.g) getOpenHelper()).b().g(dVar, cancellationSignal);
        }
        return ((z3.g) getOpenHelper()).b().p(dVar);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        r6.k.f(callable, "body");
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }

    @d6.c
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @d6.c
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }
}
