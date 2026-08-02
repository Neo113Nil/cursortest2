package E2;

import android.os.Build;
import b2.C0190d;
import b2.C0191e;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final D2.d f459a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.e f460b;

    /* renamed from: c, reason: collision with root package name */
    public D2.a f461c;

    /* renamed from: d, reason: collision with root package name */
    public final V0.e f462d;

    /* renamed from: e, reason: collision with root package name */
    public h f463e;
    public F2.c f;

    /* renamed from: g, reason: collision with root package name */
    public float f464g;

    /* renamed from: h, reason: collision with root package name */
    public float f465h;

    /* renamed from: i, reason: collision with root package name */
    public float f466i;

    /* renamed from: j, reason: collision with root package name */
    public D2.f f467j;

    /* renamed from: k, reason: collision with root package name */
    public D2.e f468k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f469l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f470m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f471n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public final C2.b f472p;

    public p(D2.d ref, V0.e eVar, D2.a aVar, V0.e soundPoolManager) {
        kotlin.jvm.internal.j.e(ref, "ref");
        kotlin.jvm.internal.j.e(soundPoolManager, "soundPoolManager");
        this.f459a = ref;
        this.f460b = eVar;
        this.f461c = aVar;
        this.f462d = soundPoolManager;
        this.f464g = 1.0f;
        this.f466i = 1.0f;
        this.f467j = D2.f.f240a;
        this.f468k = D2.e.f238a;
        this.f469l = true;
        this.o = -1;
        n nVar = new n(0, this);
        o oVar = new o(0, this);
        this.f472p = Build.VERSION.SDK_INT >= 26 ? new b(this, nVar, oVar, 1) : new b(this, nVar, oVar, 0);
    }

    public static void j(h hVar, float f, float f3) {
        hVar.o(Math.min(1.0f, 1.0f - f3) * f, Math.min(1.0f, f3 + 1.0f) * f);
    }

    public final void a(h hVar) {
        j(hVar, this.f464g, this.f465h);
        hVar.c(this.f467j == D2.f.f241b);
        hVar.h();
    }

    public final h b() {
        int ordinal = this.f468k.ordinal();
        if (ordinal == 0) {
            return new V0.e(this);
        }
        if (ordinal == 1) {
            return new l(this, this.f462d);
        }
        throw new O0.b();
    }

    public final void c(String message) {
        kotlin.jvm.internal.j.e(message, "message");
        this.f459a.getClass();
        this.f460b.E("audio.onLog", c2.p.b0(new C0190d("value", message)));
    }

    public final void d() {
        h hVar;
        if (this.f471n) {
            this.f471n = false;
            if (!this.f470m || (hVar = this.f463e) == null) {
                return;
            }
            hVar.b();
        }
    }

    public final void e() {
        h hVar;
        this.f472p.v();
        if (this.f469l) {
            return;
        }
        if (this.f471n && (hVar = this.f463e) != null) {
            hVar.e();
        }
        i(null);
        this.f463e = null;
    }

    public final void f() {
        C2.b bVar = this.f472p;
        if (!kotlin.jvm.internal.j.a(bVar.n(), bVar.s().f461c)) {
            bVar.D(bVar.s().f461c);
            bVar.J();
        }
        if (bVar.w()) {
            bVar.C();
        } else {
            bVar.p().invoke();
        }
    }

    public final void g(D2.e eVar) {
        Object obj;
        if (this.f468k != eVar) {
            this.f468k = eVar;
            h hVar = this.f463e;
            if (hVar != null) {
                try {
                    Integer p3 = hVar.p();
                    if (p3 == null) {
                        obj = p3;
                    } else {
                        int intValue = p3.intValue();
                        obj = p3;
                        if (intValue == 0) {
                            obj = null;
                        }
                    }
                } catch (Throwable th) {
                    obj = android.support.v4.media.session.a.k(th);
                }
                Integer num = (Integer) (obj instanceof C0191e ? null : obj);
                this.o = num != null ? num.intValue() : -1;
                h(false);
                hVar.release();
            }
            h b3 = b();
            this.f463e = b3;
            F2.c cVar = this.f;
            if (cVar != null) {
                b3.g(cVar);
                a(b3);
            }
        }
    }

    public final void h(boolean z) {
        if (this.f470m != z) {
            this.f470m = z;
            this.f459a.getClass();
            D2.d.c(this, z);
        }
    }

    public final void i(F2.c cVar) {
        if (kotlin.jvm.internal.j.a(this.f, cVar)) {
            this.f459a.getClass();
            D2.d.c(this, true);
            return;
        }
        if (cVar != null) {
            h hVar = this.f463e;
            if (this.f469l || hVar == null) {
                hVar = b();
                this.f463e = hVar;
                this.f469l = false;
            } else if (this.f470m) {
                hVar.reset();
                h(false);
            }
            hVar.g(cVar);
            a(hVar);
        } else {
            this.f469l = true;
            h(false);
            this.f471n = false;
            h hVar2 = this.f463e;
            if (hVar2 != null) {
                hVar2.release();
            }
        }
        this.f = cVar;
    }

    public final void k() {
        h hVar;
        this.f472p.v();
        if (this.f469l) {
            return;
        }
        if (this.f467j == D2.f.f240a) {
            e();
            return;
        }
        d();
        if (this.f470m) {
            h hVar2 = this.f463e;
            int i3 = 0;
            if (hVar2 == null || !hVar2.j()) {
                if (this.f470m && ((hVar = this.f463e) == null || !hVar.j())) {
                    h hVar3 = this.f463e;
                    if (hVar3 != null) {
                        hVar3.m(0);
                    }
                    i3 = -1;
                }
                this.o = i3;
                return;
            }
            h hVar4 = this.f463e;
            if (hVar4 != null) {
                hVar4.e();
            }
            h(false);
            h hVar5 = this.f463e;
            if (hVar5 != null) {
                hVar5.h();
            }
        }
    }

    public final void l(D2.a aVar) {
        if (this.f461c.equals(aVar)) {
            return;
        }
        if (this.f461c.f229e != 0 && aVar.f229e == 0) {
            this.f472p.v();
        }
        this.f461c = D2.a.b(aVar);
        D2.d dVar = this.f459a;
        dVar.a().setMode(this.f461c.f);
        dVar.a().setSpeakerphoneOn(this.f461c.f225a);
        h hVar = this.f463e;
        if (hVar != null) {
            hVar.e();
            h(false);
            hVar.l(this.f461c);
            F2.c cVar = this.f;
            if (cVar != null) {
                hVar.g(cVar);
                a(hVar);
            }
        }
    }
}
