package androidx.work.impl;

import S0.c;
import S0.e;
import S0.i;
import S0.l;
import S0.n;
import S0.s;
import android.database.Cursor;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.h;
import r7.C4985p;
import r7.q;
import r7.r;
import u0.C5091b;
import u0.C5095f;
import u0.InterfaceC5092c;
import y0.b;
import y0.d;
import z0.C5260c;

/* loaded from: classes.dex */
public abstract class WorkDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile C5260c f5478a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f5479b;

    /* renamed from: c, reason: collision with root package name */
    public b f5480c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5482e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f5483f;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f5486j;

    /* renamed from: d, reason: collision with root package name */
    public final C5095f f5481d = d();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f5484g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f5485h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public WorkDatabase() {
        h.d(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f5486j = new LinkedHashMap();
    }

    public static Object q(Class cls, b bVar) {
        if (cls.isInstance(bVar)) {
            return bVar;
        }
        if (bVar instanceof InterfaceC5092c) {
            return q(cls, ((InterfaceC5092c) bVar).b());
        }
        return null;
    }

    public final void a() {
        if (!this.f5482e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!h().R().C() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        C5260c R8 = h().R();
        this.f5481d.c(R8);
        if (R8.D()) {
            R8.j();
        } else {
            R8.b();
        }
    }

    public abstract C5095f d();

    public abstract b e(C5091b c5091b);

    public abstract c f();

    public List g(LinkedHashMap autoMigrationSpecs) {
        h.e(autoMigrationSpecs, "autoMigrationSpecs");
        return C4985p.f40358n;
    }

    public final b h() {
        b bVar = this.f5480c;
        if (bVar != null) {
            return bVar;
        }
        h.k("internalOpenHelper");
        throw null;
    }

    public Set i() {
        return r.f40360n;
    }

    public Map j() {
        return q.f40359n;
    }

    public final void k() {
        h().R().z();
        if (h().R().C()) {
            return;
        }
        C5095f c5095f = this.f5481d;
        if (c5095f.f41020e.compareAndSet(false, true)) {
            Executor executor = c5095f.f41016a.f5479b;
            if (executor != null) {
                executor.execute(c5095f.f41026l);
            } else {
                h.k("internalQueryExecutor");
                throw null;
            }
        }
    }

    public abstract e l();

    public final Cursor m(d dVar) {
        a();
        b();
        return h().R().F(dVar);
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
        h().R().G();
    }

    public abstract i p();

    public abstract l r();

    public abstract n s();

    public abstract S0.q t();

    public abstract s u();
}
