package Q0;

import G0.A;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.UUID;
import m.C0681f;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2338e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2339i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2340l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2341m;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f2337d = i2;
        this.f2341m = obj;
        this.f2338e = obj2;
        this.f2339i = obj3;
        this.f2340l = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P0.p g7;
        switch (this.f2337d) {
            case 0:
                R0.k kVar = (R0.k) this.f2340l;
                UUID uuid = (UUID) this.f2338e;
                String uuid2 = uuid.toString();
                G0.s d7 = G0.s.d();
                String str = u.f2342c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                G0.h hVar = (G0.h) this.f2339i;
                sb.append(hVar);
                sb.append(")");
                d7.a(str, sb.toString());
                u uVar = (u) this.f2341m;
                WorkDatabase workDatabase = uVar.f2343a;
                WorkDatabase workDatabase2 = uVar.f2343a;
                workDatabase.c();
                try {
                    g7 = workDatabase2.t().g(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (g7 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (g7.f2221b == A.f771e) {
                    P0.m mVar = new P0.m(uuid2, hVar);
                    P0.n s7 = workDatabase2.s();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s7.f2214e;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((P0.b) s7.f2215i).f(mVar);
                        workDatabase_Impl.o();
                        workDatabase_Impl.k();
                    } catch (Throwable th) {
                        workDatabase_Impl.k();
                        throw th;
                    }
                } else {
                    G0.s.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                kVar.i(null);
                workDatabase2.o();
                return;
            default:
                m.g gVar = (m.g) ((l4.b) this.f2341m).f6272e;
                m.o oVar = (m.o) this.f2339i;
                C0681f c0681f = (C0681f) this.f2338e;
                if (c0681f != null) {
                    gVar.f6377H = true;
                    c0681f.f6368b.c(false);
                    gVar.f6377H = false;
                }
                if (oVar.isEnabled() && oVar.hasSubMenu()) {
                    ((m.m) this.f2340l).q(oVar, null, 4);
                    return;
                }
                return;
        }
    }
}
