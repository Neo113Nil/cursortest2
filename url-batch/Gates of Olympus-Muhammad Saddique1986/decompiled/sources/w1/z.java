package w1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.Looper;
import h.ExecutorC0444a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import z1.InterfaceC1263a;

/* loaded from: classes.dex */
public abstract class z {
    public static final y Companion = new y();

    /* renamed from: a, reason: collision with root package name */
    public volatile A1.c f9919a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorC0444a f9920b;

    /* renamed from: c, reason: collision with root package name */
    public ExecutorC1177D f9921c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1263a f9922d;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f9924f;

    /* renamed from: j, reason: collision with root package name */
    public final Map f9928j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f9929k;

    /* renamed from: e, reason: collision with root package name */
    public final q f9923e = c();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f9925g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f9926h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f9927i = new ThreadLocal();

    public z() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        f2.j.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f9928j = synchronizedMap;
        this.f9929k = new LinkedHashMap();
    }

    public static Object l(Class cls, InterfaceC1263a interfaceC1263a) {
        if (cls.isInstance(interfaceC1263a)) {
            return interfaceC1263a;
        }
        if (interfaceC1263a instanceof i) {
            return l(cls, ((i) interfaceC1263a).a());
        }
        return null;
    }

    public final void a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        A1.c t3 = g().t();
        this.f9923e.e(t3);
        if (t3.l()) {
            t3.b();
        } else {
            t3.a();
        }
    }

    public abstract q c();

    public abstract InterfaceC1263a d(G2.m mVar);

    public final void e() {
        g().t().e();
        if (g().t().h()) {
            return;
        }
        q qVar = this.f9923e;
        if (qVar.f9894f.compareAndSet(false, true)) {
            ExecutorC0444a executorC0444a = qVar.f9889a.f9920b;
            if (executorC0444a != null) {
                executorC0444a.execute(qVar.f9901m);
            } else {
                f2.j.j("internalQueryExecutor");
                throw null;
            }
        }
    }

    public List f(LinkedHashMap linkedHashMap) {
        f2.j.f(linkedHashMap, "autoMigrationSpecs");
        return S1.u.f4320d;
    }

    public final InterfaceC1263a g() {
        InterfaceC1263a interfaceC1263a = this.f9922d;
        if (interfaceC1263a != null) {
            return interfaceC1263a;
        }
        f2.j.j("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return S1.w.f4322d;
    }

    public Map i() {
        return S1.v.f4321d;
    }

    public final boolean j() {
        A1.c cVar = this.f9919a;
        return cVar != null && cVar.f202d.isOpen();
    }

    public final Cursor k(z1.c cVar, CancellationSignal cancellationSignal) {
        a();
        if (!g().t().h() && this.f9927i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
        if (cancellationSignal == null) {
            return g().t().q(cVar);
        }
        A1.c t3 = g().t();
        t3.getClass();
        String d3 = cVar.d();
        String[] strArr = A1.c.f201e;
        f2.j.c(cancellationSignal);
        A1.a aVar = new A1.a(0, cVar);
        SQLiteDatabase sQLiteDatabase = t3.f202d;
        f2.j.f(sQLiteDatabase, "sQLiteDatabase");
        f2.j.f(d3, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, d3, strArr, null, cancellationSignal);
        f2.j.e(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }
}
