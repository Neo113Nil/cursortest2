package androidx.work.impl;

import P0.c;
import P0.e;
import P0.i;
import P0.l;
import P0.n;
import P0.q;
import P0.s;
import android.database.Cursor;
import android.os.Looper;
import h0.C0456b;
import h0.C0460f;
import h0.InterfaceC0457c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.A;
import kotlin.collections.C;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC0656c;
import m0.C0684c;

@Metadata
/* loaded from: classes.dex */
public abstract class WorkDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0684c f4091a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f4092b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0656c f4093c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4095e;

    /* renamed from: f, reason: collision with root package name */
    public List f4096f;
    public final LinkedHashMap j;

    /* renamed from: d, reason: collision with root package name */
    public final C0460f f4094d = d();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f4097g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f4098h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f4099i = new ThreadLocal();

    public WorkDatabase() {
        Intrinsics.checkNotNullExpressionValue(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.j = new LinkedHashMap();
    }

    public static Object q(Class cls, InterfaceC0656c interfaceC0656c) {
        if (cls.isInstance(interfaceC0656c)) {
            return interfaceC0656c;
        }
        if (interfaceC0656c instanceof InterfaceC0457c) {
            return q(cls, ((InterfaceC0457c) interfaceC0656c).a());
        }
        return null;
    }

    public final void a() {
        if (!this.f4095e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!h().C().t() && this.f4099i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        C0684c C7 = h().C();
        this.f4094d.c(C7);
        if (C7.B()) {
            C7.d();
        } else {
            C7.a();
        }
    }

    public abstract C0460f d();

    public abstract InterfaceC0656c e(C0456b c0456b);

    public abstract c f();

    public List g(Map autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return A.f6115d;
    }

    public final InterfaceC0656c h() {
        InterfaceC0656c interfaceC0656c = this.f4093c;
        if (interfaceC0656c != null) {
            return interfaceC0656c;
        }
        Intrinsics.h("internalOpenHelper");
        throw null;
    }

    public Set i() {
        return C.f6117d;
    }

    public Map j() {
        return I.c();
    }

    public final void k() {
        h().C().h();
        if (h().C().t()) {
            return;
        }
        C0460f c0460f = this.f4094d;
        if (c0460f.f5080e.compareAndSet(false, true)) {
            Executor executor = c0460f.f5076a.f4092b;
            if (executor != null) {
                executor.execute(c0460f.f5086l);
            } else {
                Intrinsics.h("internalQueryExecutor");
                throw null;
            }
        }
    }

    public abstract e l();

    public final Cursor m(l0.e query) {
        Intrinsics.checkNotNullParameter(query, "query");
        a();
        b();
        return h().C().F(query);
    }

    public final Object n(Callable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        c();
        try {
            Object call = body.call();
            o();
            return call;
        } finally {
            k();
        }
    }

    public final void o() {
        h().C().G();
    }

    public abstract i p();

    public abstract l r();

    public abstract n s();

    public abstract q t();

    public abstract s u();
}
