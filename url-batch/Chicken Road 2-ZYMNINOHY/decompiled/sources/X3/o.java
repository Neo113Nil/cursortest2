package X3;

import a.AbstractC0124a;
import android.os.Build;
import c3.C0292d;
import c3.C0293e;
import d3.t;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final W3.e f3652a;

    /* renamed from: b, reason: collision with root package name */
    public final W3.f f3653b;

    /* renamed from: c, reason: collision with root package name */
    public W3.a f3654c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.e f3655d;

    /* renamed from: e, reason: collision with root package name */
    public g f3656e;

    /* renamed from: f, reason: collision with root package name */
    public Y3.c f3657f;

    /* renamed from: g, reason: collision with root package name */
    public float f3658g;

    /* renamed from: h, reason: collision with root package name */
    public float f3659h;

    /* renamed from: i, reason: collision with root package name */
    public float f3660i;

    /* renamed from: j, reason: collision with root package name */
    public W3.h f3661j;

    /* renamed from: k, reason: collision with root package name */
    public W3.g f3662k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3663l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3664m;
    public boolean n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0124a f3665p;

    public o(W3.e ref, W3.f fVar, W3.a aVar, l2.e soundPoolManager) {
        kotlin.jvm.internal.i.e(ref, "ref");
        kotlin.jvm.internal.i.e(soundPoolManager, "soundPoolManager");
        this.f3652a = ref;
        this.f3653b = fVar;
        this.f3654c = aVar;
        this.f3655d = soundPoolManager;
        this.f3658g = 1.0f;
        this.f3660i = 1.0f;
        this.f3661j = W3.h.f3483a;
        this.f3662k = W3.g.f3481a;
        this.f3663l = true;
        this.o = -1;
        m mVar = new m(0, this);
        n nVar = new n(0, this);
        this.f3665p = Build.VERSION.SDK_INT >= 26 ? new a(this, mVar, nVar, 1) : new a(this, mVar, nVar, 0);
    }

    public static void j(g gVar, float f4, float f5) {
        gVar.c(Math.min(1.0f, 1.0f - f5) * f4, Math.min(1.0f, f5 + 1.0f) * f4);
    }

    public final void a(g gVar) {
        j(gVar, this.f3658g, this.f3659h);
        gVar.setLooping(this.f3661j == W3.h.f3484b);
        gVar.a();
    }

    public final g b() {
        int ordinal = this.f3662k.ordinal();
        if (ordinal == 0) {
            return new l2.e(this);
        }
        if (ordinal == 1) {
            return new k(this, this.f3655d);
        }
        throw new G1.a();
    }

    public final void c(String message) {
        kotlin.jvm.internal.i.e(message, "message");
        this.f3652a.getClass();
        this.f3653b.a("audio.onLog", t.B(new C0292d("value", message)));
    }

    public final void d() {
        g gVar;
        if (this.n) {
            this.n = false;
            if (!this.f3664m || (gVar = this.f3656e) == null) {
                return;
            }
            gVar.pause();
        }
    }

    public final void e() {
        g gVar;
        this.f3665p.E();
        if (this.f3663l) {
            return;
        }
        if (this.n && (gVar = this.f3656e) != null) {
            gVar.e();
        }
        i(null);
        this.f3656e = null;
    }

    public final void f() {
        AbstractC0124a abstractC0124a = this.f3665p;
        if (!kotlin.jvm.internal.i.a(abstractC0124a.y(), abstractC0124a.C().f3654c)) {
            abstractC0124a.N(abstractC0124a.C().f3654c);
            abstractC0124a.S();
        }
        if (abstractC0124a.F()) {
            abstractC0124a.M();
        } else {
            abstractC0124a.A().invoke();
        }
    }

    public final void g(W3.g gVar) {
        Object obj;
        if (this.f3662k != gVar) {
            this.f3662k = gVar;
            g gVar2 = this.f3656e;
            if (gVar2 != null) {
                try {
                    Integer currentPosition = gVar2.getCurrentPosition();
                    if (currentPosition == null) {
                        obj = currentPosition;
                    } else {
                        int intValue = currentPosition.intValue();
                        obj = currentPosition;
                        if (intValue == 0) {
                            obj = null;
                        }
                    }
                } catch (Throwable th) {
                    obj = O3.l.h(th);
                }
                Integer num = (Integer) (obj instanceof C0293e ? null : obj);
                this.o = num != null ? num.intValue() : -1;
                h(false);
                gVar2.release();
            }
            g b4 = b();
            this.f3656e = b4;
            Y3.c cVar = this.f3657f;
            if (cVar != null) {
                b4.d(cVar);
                a(b4);
            }
        }
    }

    public final void h(boolean z) {
        if (this.f3664m != z) {
            this.f3664m = z;
            this.f3652a.getClass();
            W3.e.c(this, z);
        }
    }

    public final void i(Y3.c cVar) {
        if (kotlin.jvm.internal.i.a(this.f3657f, cVar)) {
            this.f3652a.getClass();
            W3.e.c(this, true);
            return;
        }
        if (cVar != null) {
            g gVar = this.f3656e;
            if (this.f3663l || gVar == null) {
                gVar = b();
                this.f3656e = gVar;
                this.f3663l = false;
            } else if (this.f3664m) {
                gVar.reset();
                h(false);
            }
            gVar.d(cVar);
            a(gVar);
        } else {
            this.f3663l = true;
            h(false);
            this.n = false;
            g gVar2 = this.f3656e;
            if (gVar2 != null) {
                gVar2.release();
            }
        }
        this.f3657f = cVar;
    }

    public final void k() {
        g gVar;
        this.f3665p.E();
        if (this.f3663l) {
            return;
        }
        if (this.f3661j == W3.h.f3483a) {
            e();
            return;
        }
        d();
        if (this.f3664m) {
            g gVar2 = this.f3656e;
            int i4 = 0;
            if (gVar2 == null || !gVar2.g()) {
                if (this.f3664m && ((gVar = this.f3656e) == null || !gVar.g())) {
                    g gVar3 = this.f3656e;
                    if (gVar3 != null) {
                        gVar3.seekTo(0);
                    }
                    i4 = -1;
                }
                this.o = i4;
                return;
            }
            g gVar4 = this.f3656e;
            if (gVar4 != null) {
                gVar4.e();
            }
            h(false);
            g gVar5 = this.f3656e;
            if (gVar5 != null) {
                gVar5.a();
            }
        }
    }

    public final void l(W3.a aVar) {
        if (this.f3654c.equals(aVar)) {
            return;
        }
        if (this.f3654c.f3469e != 0 && aVar.f3469e == 0) {
            this.f3665p.E();
        }
        this.f3654c = W3.a.b(aVar);
        W3.e eVar = this.f3652a;
        eVar.a().setMode(this.f3654c.f3470f);
        eVar.a().setSpeakerphoneOn(this.f3654c.f3465a);
        g gVar = this.f3656e;
        if (gVar != null) {
            gVar.e();
            h(false);
            gVar.b(this.f3654c);
            Y3.c cVar = this.f3657f;
            if (cVar != null) {
                gVar.d(cVar);
                a(gVar);
            }
        }
    }
}
