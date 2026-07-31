package androidx.work.impl;

import Q.b;
import Q.f;
import U.e;
import V.c;
import android.database.Cursor;
import android.os.Looper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.i;
import l5.C0512p;
import l5.q;
import l5.r;
import u0.C0673c;
import u0.C0675e;
import u0.C0679i;
import u0.C0682l;
import u0.C0684n;
import u0.C0687q;
import u0.C0689s;

/* loaded from: classes.dex */
public abstract class WorkDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile c f3561a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f3562b;

    /* renamed from: c, reason: collision with root package name */
    public U.c f3563c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3565e;

    /* renamed from: f, reason: collision with root package name */
    public List f3566f;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f3570j;

    /* renamed from: d, reason: collision with root package name */
    public final f f3564d = d();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f3567g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f3568h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f3569i = new ThreadLocal();

    public WorkDatabase() {
        i.d(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f3570j = new LinkedHashMap();
    }

    public static Object q(Class cls, U.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof Q.c) {
            return q(cls, ((Q.c) cVar).a());
        }
        return null;
    }

    public final void a() {
        if (!this.f3565e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!h().E().n() && this.f3569i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        c E6 = h().E();
        this.f3564d.c(E6);
        if (E6.v()) {
            E6.d();
        } else {
            E6.a();
        }
    }

    public abstract f d();

    public abstract U.c e(b bVar);

    public abstract C0673c f();

    public List g(Map autoMigrationSpecs) {
        i.e(autoMigrationSpecs, "autoMigrationSpecs");
        return C0512p.f5303f;
    }

    public final U.c h() {
        U.c cVar = this.f3563c;
        if (cVar != null) {
            return cVar;
        }
        i.l("internalOpenHelper");
        throw null;
    }

    public Set i() {
        return r.f5305f;
    }

    public Map j() {
        return q.f5304f;
    }

    public final void k() {
        h().E().g();
        if (h().E().n()) {
            return;
        }
        f fVar = this.f3564d;
        if (fVar.f1920e.compareAndSet(false, true)) {
            Executor executor = fVar.f1916a.f3562b;
            if (executor != null) {
                executor.execute(fVar.f1927l);
            } else {
                i.l("internalQueryExecutor");
                throw null;
            }
        }
    }

    public abstract C0675e l();

    public final Cursor m(e eVar) {
        a();
        b();
        return h().E().y(eVar);
    }

    public final Object n(Callable callable) {
        c();
        try {
            Object call = callable.call();
            o();
            return call;
        } finally {
            k();
        }
    }

    public final void o() {
        h().E().G();
    }

    public abstract C0679i p();

    public abstract C0682l r();

    public abstract C0684n s();

    public abstract C0687q t();

    public abstract C0689s u();
}
