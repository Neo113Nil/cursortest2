package u0;

import a0.AbstractC0158a;
import android.graphics.Outline;
import android.os.Build;
import b0.AbstractC0257H;
import b0.AbstractC0259J;
import b0.C0254E;
import b0.C0255F;
import b0.C0256G;
import b0.C0278k;
import b0.InterfaceC0258I;
import b0.InterfaceC0285r;

/* renamed from: u0.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991p0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8382a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f8383b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0257H f8384c;

    /* renamed from: d, reason: collision with root package name */
    public C0278k f8385d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0258I f8386e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8387f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8388g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0258I f8389h;

    /* renamed from: i, reason: collision with root package name */
    public a0.e f8390i;

    /* renamed from: j, reason: collision with root package name */
    public float f8391j;

    /* renamed from: k, reason: collision with root package name */
    public long f8392k;

    /* renamed from: l, reason: collision with root package name */
    public long f8393l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8394m;

    public C0991p0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f8383b = outline;
        this.f8392k = 0L;
        this.f8393l = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (a0.AbstractC0158a.b(r5.f3499e) == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0285r interfaceC0285r) {
        d();
        InterfaceC0258I interfaceC0258I = this.f8386e;
        if (interfaceC0258I != null) {
            interfaceC0285r.i(interfaceC0258I, 1);
            return;
        }
        float f3 = this.f8391j;
        if (f3 <= 0.0f) {
            interfaceC0285r.q(a0.c.d(this.f8392k), a0.c.e(this.f8392k), a0.c.d(this.f8392k) + a0.f.d(this.f8393l), a0.c.e(this.f8392k) + a0.f.b(this.f8393l), 1);
            return;
        }
        InterfaceC0258I interfaceC0258I2 = this.f8389h;
        a0.e eVar = this.f8390i;
        if (interfaceC0258I2 != null) {
            long j3 = this.f8392k;
            long j4 = this.f8393l;
            if (eVar != null && M1.B.H(eVar)) {
                if (eVar.f3495a == a0.c.d(j3)) {
                    if (eVar.f3496b == a0.c.e(j3)) {
                        if (eVar.f3497c == a0.f.d(j4) + a0.c.d(j3)) {
                            if (eVar.f3498d == a0.f.b(j4) + a0.c.e(j3)) {
                            }
                        }
                    }
                }
            }
        }
        float d3 = a0.c.d(this.f8392k);
        float e3 = a0.c.e(this.f8392k);
        float d4 = a0.f.d(this.f8393l) + a0.c.d(this.f8392k);
        float b2 = a0.f.b(this.f8393l) + a0.c.e(this.f8392k);
        float f4 = this.f8391j;
        long a3 = M1.B.a(f4, f4);
        long a4 = M1.B.a(AbstractC0158a.b(a3), AbstractC0158a.c(a3));
        a0.e eVar2 = new a0.e(d3, e3, d4, b2, a4, a4, a4, a4);
        if (interfaceC0258I2 == null) {
            interfaceC0258I2 = AbstractC0259J.g();
        } else {
            ((C0278k) interfaceC0258I2).h();
        }
        InterfaceC0258I.a(interfaceC0258I2, eVar2);
        this.f8390i = eVar2;
        this.f8389h = interfaceC0258I2;
        interfaceC0285r.i(interfaceC0258I2, 1);
    }

    public final Outline b() {
        d();
        if (this.f8394m && this.f8382a) {
            return this.f8383b;
        }
        return null;
    }

    public final boolean c(AbstractC0257H abstractC0257H, float f3, boolean z3, float f4, long j3) {
        this.f8383b.setAlpha(f3);
        boolean a3 = Z1.i.a(this.f8384c, abstractC0257H);
        boolean z4 = !a3;
        if (!a3) {
            this.f8384c = abstractC0257H;
            this.f8387f = true;
        }
        this.f8393l = j3;
        boolean z5 = abstractC0257H != null && (z3 || f4 > 0.0f);
        if (this.f8394m != z5) {
            this.f8394m = z5;
            this.f8387f = true;
        }
        return z4;
    }

    public final void d() {
        if (this.f8387f) {
            this.f8392k = 0L;
            this.f8391j = 0.0f;
            this.f8386e = null;
            this.f8387f = false;
            this.f8388g = false;
            AbstractC0257H abstractC0257H = this.f8384c;
            Outline outline = this.f8383b;
            if (abstractC0257H == null || !this.f8394m || a0.f.d(this.f8393l) <= 0.0f || a0.f.b(this.f8393l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f8382a = true;
            if (abstractC0257H instanceof C0255F) {
                a0.d dVar = ((C0255F) abstractC0257H).f4212a;
                float f3 = dVar.f3491a;
                float f4 = dVar.f3492b;
                this.f8392k = I2.l.f(f3, f4);
                this.f8393l = I2.d.h(dVar.c(), dVar.b());
                outline.setRect(Math.round(f3), Math.round(f4), Math.round(dVar.f3493c), Math.round(dVar.f3494d));
                return;
            }
            if (!(abstractC0257H instanceof C0256G)) {
                if (abstractC0257H instanceof C0254E) {
                    e(((C0254E) abstractC0257H).f4211a);
                    return;
                }
                return;
            }
            a0.e eVar = ((C0256G) abstractC0257H).f4213a;
            float b2 = AbstractC0158a.b(eVar.f3499e);
            float f5 = eVar.f3495a;
            float f6 = eVar.f3496b;
            this.f8392k = I2.l.f(f5, f6);
            this.f8393l = I2.d.h(eVar.b(), eVar.a());
            if (M1.B.H(eVar)) {
                this.f8383b.setRoundRect(Math.round(f5), Math.round(f6), Math.round(eVar.f3497c), Math.round(eVar.f3498d), b2);
                this.f8391j = b2;
                return;
            }
            C0278k c0278k = this.f8385d;
            if (c0278k == null) {
                c0278k = AbstractC0259J.g();
                this.f8385d = c0278k;
            }
            c0278k.h();
            InterfaceC0258I.a(c0278k, eVar);
            e(c0278k);
        }
    }

    public final void e(InterfaceC0258I interfaceC0258I) {
        int i3 = Build.VERSION.SDK_INT;
        Outline outline = this.f8383b;
        if (i3 <= 28 && !((C0278k) interfaceC0258I).f4278a.isConvex()) {
            this.f8382a = false;
            outline.setEmpty();
            this.f8388g = true;
        } else {
            if (!(interfaceC0258I instanceof C0278k)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C0278k) interfaceC0258I).f4278a);
            this.f8388g = !outline.canClip();
        }
        this.f8386e = interfaceC0258I;
    }
}
