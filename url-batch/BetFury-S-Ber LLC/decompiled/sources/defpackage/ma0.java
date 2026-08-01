package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class ma0 {
    public static final ga0 Companion = new ga0();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private s7 autoCloser;
    private ea0 connectionManager;
    private ah coroutineScope;
    private Executor internalQueryExecutor;
    private uv internalTracker;
    private Executor internalTransactionExecutor;
    protected List<? extends da0> mCallbacks;
    protected volatile ig0 mDatabase;
    private qg transactionContext;
    private final pc closeBarrier = new pc(new ia0(0, this, ma0.class, "onClosed", "onClosed()V", 0, 0));
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();
    private final Map<ow, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    public static final void access$onClosed(ma0 ma0Var) {
        ah ahVar = ma0Var.coroutineScope;
        if (ahVar == null) {
            mv.P("coroutineScope");
            throw null;
        }
        mw mwVar = (mw) ahVar.i().w(sl.k);
        if (mwVar == null) {
            s9.x(ahVar, "Scope cannot be cancelled because it does not have a job: ");
            return;
        }
        mwVar.g(new gw(mwVar.l(), null, mwVar));
        w20 w20Var = ma0Var.getInvalidationTracker().j;
        if (w20Var != null && w20Var.e.compareAndSet(false, true)) {
            w20Var.b.b(w20Var.i);
            try {
                tu tuVar = w20Var.g;
                if (tuVar != null) {
                    tuVar.c(w20Var.j, w20Var.f);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            w20Var.c.unbindService(w20Var.k);
        }
        ea0 ea0Var = ma0Var.connectionManager;
        if (ea0Var != null) {
            ea0Var.f.close();
        } else {
            mv.P("connectionManager");
            throw null;
        }
    }

    public static /* synthetic */ Cursor query$default(ma0 ma0Var, og0 og0Var, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            s9.y("Super calls with default arguments not supported in this target, function: query");
            return null;
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return ma0Var.query(og0Var, cancellationSignal);
    }

    public final void a() {
        assertNotMainThread();
        ig0 J = getOpenHelper().J();
        if (!J.t()) {
            uv invalidationTracker = getInvalidationTracker();
            invalidationTracker.getClass();
            d50.U(new sv(invalidationTracker, null, 2));
        }
        if (J.x()) {
            J.C();
        } else {
            J.e();
        }
    }

    public final void addTypeConverter$room_runtime_release(ow owVar, Object obj) {
        owVar.getClass();
        obj.getClass();
        this.typeConverters.put(owVar, obj);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            s9.u("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inCompatibilityMode$room_runtime_release() || inTransaction() || this.suspendingTransactionId.get() == null) {
            return;
        }
        s9.u("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public final Object b(ir irVar) {
        if (!inCompatibilityMode$room_runtime_release()) {
            h hVar = new h(6, irVar);
            assertNotMainThread();
            assertNotSuspendingTransaction();
            return d50.U(new je(this, hVar, null, 2));
        }
        beginTransaction();
        try {
            Object a = irVar.a();
            setTransactionSuccessful();
            return a;
        } finally {
            endTransaction();
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        a();
    }

    public abstract void clearAllTables();

    public void close() {
        pc pcVar = this.closeBarrier;
        synchronized (pcVar) {
            if (pcVar.c.compareAndSet(false, true)) {
                while (pcVar.b.get() != 0) {
                }
                pcVar.a.a();
            }
        }
    }

    public rg0 compileStatement(String str) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().J().k(str);
    }

    public List<Object> createAutoMigrations(Map<ow, Object> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(vz.Z(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(mv.u((ow) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final ea0 createConnectionManager$room_runtime_release(vh vhVar) {
        pa0 pa0Var;
        vhVar.getClass();
        try {
            qa0 createOpenDelegate = createOpenDelegate();
            createOpenDelegate.getClass();
            pa0Var = (pa0) createOpenDelegate;
        } catch (x30 unused) {
            pa0Var = null;
        }
        return pa0Var == null ? new ea0(vhVar, new h(5, this)) : new ea0(vhVar, pa0Var);
    }

    public abstract uv createInvalidationTracker();

    public qa0 createOpenDelegate() {
        throw new x30();
    }

    public jg0 createOpenHelper(vh vhVar) {
        vhVar.getClass();
        throw new x30();
    }

    public void endTransaction() {
        getOpenHelper().J().d();
        if (inTransaction()) {
            return;
        }
        uv invalidationTracker = getInvalidationTracker();
        invalidationTracker.c.e(invalidationTracker.f, invalidationTracker.g);
    }

    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        map.getClass();
        return wm.f;
    }

    public final pc getCloseBarrier$room_runtime_release() {
        return this.closeBarrier;
    }

    public final ah getCoroutineScope() {
        ah ahVar = this.coroutineScope;
        if (ahVar != null) {
            return ahVar;
        }
        mv.P("coroutineScope");
        throw null;
    }

    public uv getInvalidationTracker() {
        uv uvVar = this.internalTracker;
        if (uvVar != null) {
            return uvVar;
        }
        mv.P("internalTracker");
        throw null;
    }

    public jg0 getOpenHelper() {
        ea0 ea0Var = this.connectionManager;
        if (ea0Var == null) {
            mv.P("connectionManager");
            throw null;
        }
        jg0 c = ea0Var.c();
        if (c != null) {
            return c;
        }
        s9.u("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public final qg getQueryContext() {
        ah ahVar = this.coroutineScope;
        if (ahVar != null) {
            return ahVar.i();
        }
        mv.P("coroutineScope");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        mv.P("internalQueryExecutor");
        throw null;
    }

    public Set<ow> getRequiredAutoMigrationSpecClasses() {
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(wc.g0(requiredAutoMigrationSpecs));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            cls.getClass();
            arrayList.add(b90.a(cls));
        }
        return uc.s0(arrayList);
    }

    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return ym.f;
    }

    public Map<ow, List<ow>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> entrySet = getRequiredTypeConverters().entrySet();
        int Z = vz.Z(wc.g0(entrySet));
        if (Z < 16) {
            Z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            cls.getClass();
            dc a = b90.a(cls);
            ArrayList arrayList = new ArrayList(wc.g0(list));
            for (Class cls2 : list) {
                cls2.getClass();
                arrayList.add(b90.a(cls2));
            }
            linkedHashMap.put(a, arrayList);
        }
        return linkedHashMap;
    }

    public final Map<ow, List<ow>> getRequiredTypeConverterClassesMap$room_runtime_release() {
        return getRequiredTypeConverterClasses();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return xm.f;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public final qg getTransactionContext$room_runtime_release() {
        qg qgVar = this.transactionContext;
        if (qgVar != null) {
            return qgVar;
        }
        mv.P("transactionContext");
        throw null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        mv.P("internalTransactionExecutor");
        throw null;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        cls.getClass();
        return (T) this.typeConverters.get(b90.a(cls));
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
        ea0 ea0Var = this.connectionManager;
        if (ea0Var != null) {
            return ea0Var.c() != null;
        }
        mv.P("connectionManager");
        throw null;
    }

    public boolean inTransaction() {
        return isOpenInternal() && getOpenHelper().J().t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        defpackage.s9.k("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(vh vhVar) {
        ea0 ea0Var;
        Executor hkVar;
        qg i;
        int i2;
        int i3;
        sl slVar = sl.k;
        vhVar.getClass();
        String str = vhVar.b;
        Intent intent = vhVar.j;
        qg qgVar = vhVar.u;
        this.useTempTrackingTable = vhVar.v;
        this.connectionManager = createConnectionManager$room_runtime_release(vhVar);
        this.internalTracker = createInvalidationTracker();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<ow> requiredAutoMigrationSpecClasses = getRequiredAutoMigrationSpecClasses();
        List list = vhVar.r;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        Iterator<ow> it = requiredAutoMigrationSpecClasses.iterator();
        while (true) {
            int i4 = -1;
            if (it.hasNext()) {
                ow next = it.next();
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i5 = size2 - 1;
                        i2 = i4;
                        if (((dc) next).c(list.get(size2))) {
                            zArr[size2] = true;
                            i3 = size2;
                            break;
                        } else {
                            if (i5 < 0) {
                                break;
                            }
                            size2 = i5;
                            i4 = i2;
                        }
                    }
                } else {
                    i2 = -1;
                }
                i3 = i2;
                if (i3 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + ((dc) next).b() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(next, list.get(i3));
            } else {
                int size3 = list.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i6 = size3 - 1;
                        if (size3 >= size || !zArr[size3]) {
                            break;
                        } else if (i6 < 0) {
                            break;
                        } else {
                            size3 = i6;
                        }
                    }
                }
                Iterator<Object> it2 = createAutoMigrations(linkedHashMap).iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    s9.c();
                    return;
                }
                Map<ow, List<ow>> requiredTypeConverterClassesMap$room_runtime_release = getRequiredTypeConverterClassesMap$room_runtime_release();
                List list2 = vhVar.q;
                boolean[] zArr2 = new boolean[list2.size()];
                for (Map.Entry<ow, List<ow>> entry : requiredTypeConverterClassesMap$room_runtime_release.entrySet()) {
                    ow key = entry.getKey();
                    for (ow owVar : entry.getValue()) {
                        int size4 = list2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i7 = size4 - 1;
                                if (((dc) owVar).c(list2.get(size4))) {
                                    zArr2[size4] = true;
                                    break;
                                } else if (i7 < 0) {
                                    break;
                                } else {
                                    size4 = i7;
                                }
                            }
                        }
                        size4 = -1;
                        if (size4 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + ((dc) owVar).b() + ") for " + ((dc) key).b() + " is missing in the database configuration.").toString());
                        }
                        addTypeConverter$room_runtime_release(owVar, list2.get(size4));
                    }
                }
                int size5 = list2.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i8 = size5 - 1;
                        if (!zArr2[size5]) {
                            throw new IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        }
                        if (i8 < 0) {
                            break;
                        } else {
                            size5 = i8;
                        }
                    }
                }
                jg0 jg0Var = null;
                if (qgVar != null) {
                    og w = qgVar.w(sl.g);
                    w.getClass();
                    tg tgVar = (tg) w;
                    vn vnVar = tgVar instanceof vn ? (vn) tgVar : null;
                    if (vnVar == null || (hkVar = vnVar.R()) == null) {
                        hkVar = new hk(tgVar);
                    }
                    this.internalQueryExecutor = hkVar;
                    this.internalTransactionExecutor = new f4(hkVar);
                    qg r = qgVar.r(new ag0((mw) qgVar.w(slVar)));
                    if (r.w(slVar) == null) {
                        r = r.r(new hw(null));
                    }
                    this.coroutineScope = new bg(r);
                    boolean inCompatibilityMode$room_runtime_release = inCompatibilityMode$room_runtime_release();
                    ah ahVar = this.coroutineScope;
                    if (inCompatibilityMode$room_runtime_release) {
                        if (ahVar == null) {
                            mv.P("coroutineScope");
                            throw null;
                        }
                        i = ahVar.i().r(tgVar.Q(1));
                    } else {
                        if (ahVar == null) {
                            mv.P("coroutineScope");
                            throw null;
                        }
                        i = ahVar.i();
                    }
                    this.transactionContext = i;
                } else {
                    this.internalQueryExecutor = vhVar.h;
                    this.internalTransactionExecutor = new f4(vhVar.i);
                    Executor executor = this.internalQueryExecutor;
                    if (executor == null) {
                        mv.P("internalQueryExecutor");
                        throw null;
                    }
                    hk hkVar2 = executor instanceof hk ? (hk) executor : null;
                    qg U = bi.U(hkVar2 != null ? hkVar2.f : new wn(executor), new ag0(null));
                    if (U.w(slVar) == null) {
                        U = U.r(new hw(null));
                    }
                    this.coroutineScope = new bg(U);
                    Executor executor2 = this.internalTransactionExecutor;
                    if (executor2 == null) {
                        mv.P("internalTransactionExecutor");
                        throw null;
                    }
                    hk hkVar3 = executor2 instanceof hk ? (hk) executor2 : null;
                    this.transactionContext = U.r(hkVar3 != null ? hkVar3.f : new wn(executor2));
                }
                this.allowMainThreadQueries = vhVar.f;
                ea0 ea0Var2 = this.connectionManager;
                if (ea0Var2 == null) {
                    mv.P("connectionManager");
                    throw null;
                }
                jg0 c = ea0Var2.c();
                if (c != null) {
                    while (!(c instanceof h60)) {
                        if (c instanceof gj) {
                            c = ((gj) c).i();
                        }
                    }
                    ea0Var = this.connectionManager;
                    if (ea0Var != null) {
                        mv.P("connectionManager");
                        throw null;
                    }
                    jg0 c2 = ea0Var.c();
                    if (c2 != null) {
                        while (true) {
                            if (c2 instanceof t7) {
                                jg0Var = c2;
                                break;
                            } else if (!(c2 instanceof gj)) {
                                break;
                            } else {
                                c2 = ((gj) c2).i();
                            }
                        }
                    }
                    if (intent != null) {
                        if (str == null) {
                            s9.k("Required value was null.");
                            return;
                        }
                        uv invalidationTracker = getInvalidationTracker();
                        Context context = vhVar.a;
                        invalidationTracker.getClass();
                        context.getClass();
                        invalidationTracker.i = intent;
                        invalidationTracker.j = new w20(context, str, invalidationTracker);
                        return;
                    }
                    return;
                }
                c = null;
                ea0Var = this.connectionManager;
                if (ea0Var != null) {
                }
            }
        }
    }

    public final void internalInitInvalidationTracker(cb0 cb0Var) {
        cb0Var.getClass();
        uv invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        bk0 bk0Var = invalidationTracker.c;
        bk0Var.getClass();
        eb0 N = cb0Var.N("PRAGMA query_only");
        try {
            N.G();
            boolean z = N.getLong(0) != 0;
            mv.h(N, null);
            if (!z) {
                gk0.p(cb0Var, "PRAGMA temp_store = MEMORY");
                gk0.p(cb0Var, "PRAGMA recursive_triggers = 1");
                gk0.p(cb0Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (bk0Var.d) {
                    gk0.p(cb0Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    gk0.p(cb0Var, uf0.p("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                dq dqVar = bk0Var.h;
                ReentrantLock reentrantLock = (ReentrantLock) dqVar.b;
                reentrantLock.lock();
                try {
                    dqVar.a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (invalidationTracker.k) {
                w20 w20Var = invalidationTracker.j;
                if (w20Var != null) {
                    Intent intent = invalidationTracker.i;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (w20Var.e.compareAndSet(true, false)) {
                        w20Var.c.bindService(intent, w20Var.k, 1);
                        uv uvVar = w20Var.b;
                        u20 u20Var = w20Var.i;
                        u20Var.getClass();
                        uvVar.a(u20Var);
                    }
                }
            }
        } finally {
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        ea0 ea0Var = this.connectionManager;
        if (ea0Var == null) {
            mv.P("connectionManager");
            throw null;
        }
        ig0 ig0Var = ea0Var.g;
        if (ig0Var != null) {
            return ig0Var.isOpen();
        }
        return false;
    }

    public final boolean isOpenInternal() {
        ea0 ea0Var = this.connectionManager;
        if (ea0Var == null) {
            mv.P("connectionManager");
            throw null;
        }
        ig0 ig0Var = ea0Var.g;
        if (ig0Var != null) {
            return ig0Var.isOpen();
        }
        return false;
    }

    public final void performClear(boolean z, String... strArr) {
        strArr.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        d50.U(new la0(this, z, strArr, null));
    }

    public Cursor query(og0 og0Var, CancellationSignal cancellationSignal) {
        og0Var.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? getOpenHelper().J().A(og0Var, cancellationSignal) : getOpenHelper().J().f(og0Var);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        callable.getClass();
        return (V) b(new h2(7, callable));
    }

    public void setTransactionSuccessful() {
        getOpenHelper().J().z();
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z) {
        this.useTempTrackingTable = z;
    }

    public final <R> Object useConnection$room_runtime_release(boolean z, xr xrVar, dg dgVar) {
        ea0 ea0Var = this.connectionManager;
        if (ea0Var != null) {
            return ea0Var.f.u(z, xrVar, dgVar);
        }
        mv.P("connectionManager");
        throw null;
    }

    public final <T> T getTypeConverter(ow owVar) {
        owVar.getClass();
        T t = (T) this.typeConverters.get(owVar);
        t.getClass();
        return t;
    }

    public void runInTransaction(Runnable runnable) {
        runnable.getClass();
        b(new h2(6, runnable));
    }

    public Cursor query(String str, Object[] objArr) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().J().f(new i5(str, objArr, 28));
    }

    public final Cursor query(og0 og0Var) {
        og0Var.getClass();
        return query$default(this, og0Var, null, 2, null);
    }

    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public void internalInitInvalidationTracker(ig0 ig0Var) {
        ig0Var.getClass();
        internalInitInvalidationTracker(new gg0(ig0Var));
    }
}
