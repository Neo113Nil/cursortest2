package androidx.work.impl;

import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import androidx.work.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l0.e;
import l0.k;
import l0.n;
import l0.q;
import l0.t;
import w.c;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends h {

    /* renamed from: l, reason: collision with root package name */
    private static final long f1449l = TimeUnit.DAYS.toMillis(1);

    class a implements c.InterfaceC0147c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1450a;

        a(Context context) {
            this.f1450a = context;
        }

        @Override // w.c.InterfaceC0147c
        public c a(c.b bVar) {
            c.b.a a7 = c.b.a(this.f1450a);
            a7.c(bVar.f22843b).b(bVar.f22844c).d(true);
            return new x.c().a(a7.a());
        }
    }

    class b extends h.b {
        b() {
        }

        @Override // androidx.room.h.b
        public void c(w.b bVar) {
            super.c(bVar);
            bVar.g();
            try {
                bVar.k(WorkDatabase.w());
                bVar.A();
            } finally {
                bVar.d();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z6) {
        h.a a7;
        if (z6) {
            a7 = g.c(context, WorkDatabase.class).c();
        } else {
            a7 = g.a(context, WorkDatabase.class, e0.h.d());
            a7.f(new a(context));
        }
        return (WorkDatabase) a7.g(executor).a(u()).b(androidx.work.impl.a.f1459a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f1460b).b(androidx.work.impl.a.f1461c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f1462d).b(androidx.work.impl.a.f1463e).b(androidx.work.impl.a.f1464f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f1465g).e().d();
    }

    static h.b u() {
        return new b();
    }

    static long v() {
        return System.currentTimeMillis() - f1449l;
    }

    static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract l0.b t();

    public abstract e x();

    public abstract l0.h y();

    public abstract k z();
}
