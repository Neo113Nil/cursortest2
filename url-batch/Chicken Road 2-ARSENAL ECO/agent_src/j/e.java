package j;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.UUID;
import u0.C0672b;
import u0.C0683m;
import u0.C0684n;
import u0.C0686p;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4757g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4758h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4759i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4760j;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f4756f = i7;
        this.f4760j = obj;
        this.f4757g = obj2;
        this.f4758h = obj3;
        this.f4759i = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0686p g7;
        switch (this.f4756f) {
            case 0:
                g gVar = (g) ((V5.g) this.f4760j).f2734g;
                k kVar = (k) this.f4758h;
                f fVar = (f) this.f4757g;
                if (fVar != null) {
                    gVar.f4768E = true;
                    fVar.f4762b.c(false);
                    gVar.f4768E = false;
                }
                if (kVar.isEnabled() && kVar.hasSubMenu()) {
                    ((j) this.f4759i).p(kVar, null, 4);
                    return;
                }
                return;
            default:
                w0.j jVar = (w0.j) this.f4759i;
                UUID uuid = (UUID) this.f4757g;
                String uuid2 = uuid.toString();
                l0.q d7 = l0.q.d();
                String str = v0.r.f6096c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                l0.g gVar2 = (l0.g) this.f4758h;
                sb.append(gVar2);
                sb.append(")");
                d7.a(str, sb.toString());
                v0.r rVar = (v0.r) this.f4760j;
                WorkDatabase workDatabase = rVar.f6097a;
                WorkDatabase workDatabase2 = rVar.f6097a;
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
                if (g7.f6001b == 2) {
                    C0683m c0683m = new C0683m(uuid2, gVar2);
                    C0684n s6 = workDatabase2.s();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s6.f5994g;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((C0672b) s6.f5995h).q(c0683m);
                        workDatabase_Impl.o();
                        workDatabase_Impl.k();
                    } catch (Throwable th) {
                        workDatabase_Impl.k();
                        throw th;
                    }
                } else {
                    l0.q.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                jVar.i(null);
                workDatabase2.o();
                return;
        }
    }
}
