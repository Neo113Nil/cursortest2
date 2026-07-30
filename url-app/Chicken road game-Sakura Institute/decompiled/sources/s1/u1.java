package s1;

import android.graphics.Outline;
import android.os.Build;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8435a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f8436b;

    /* renamed from: c, reason: collision with root package name */
    public z0.j0 f8437c;

    /* renamed from: d, reason: collision with root package name */
    public z0.j f8438d;

    /* renamed from: e, reason: collision with root package name */
    public z0.k0 f8439e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8440f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8441g;

    /* renamed from: h, reason: collision with root package name */
    public z0.k0 f8442h;

    /* renamed from: i, reason: collision with root package name */
    public y0.e f8443i;

    /* renamed from: j, reason: collision with root package name */
    public float f8444j;

    /* renamed from: k, reason: collision with root package name */
    public long f8445k;

    /* renamed from: l, reason: collision with root package name */
    public long f8446l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8447m;

    public u1() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f8436b = outline;
        this.f8445k = 0L;
        this.f8446l = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (y0.a.b(r4.f9788e) == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(z0.r rVar) {
        d();
        z0.k0 k0Var = this.f8439e;
        if (k0Var != null) {
            rVar.i(k0Var);
            return;
        }
        float f9 = this.f8444j;
        if (f9 <= 0.0f) {
            rVar.j(y0.c.d(this.f8445k), y0.c.e(this.f8445k), y0.c.d(this.f8445k) + y0.f.d(this.f8446l), y0.c.e(this.f8445k) + y0.f.b(this.f8446l), 1);
            return;
        }
        z0.k0 k0Var2 = this.f8442h;
        y0.e eVar = this.f8443i;
        if (k0Var2 != null) {
            long j8 = this.f8445k;
            long j9 = this.f8446l;
            if (eVar != null && u3.z.i(eVar) && eVar.f9784a == y0.c.d(j8) && eVar.f9785b == y0.c.e(j8)) {
                if (eVar.f9786c == y0.f.d(j9) + y0.c.d(j8)) {
                    if (eVar.f9787d == y0.f.b(j9) + y0.c.e(j8)) {
                    }
                }
            }
        }
        float d8 = y0.c.d(this.f8445k);
        float e9 = y0.c.e(this.f8445k);
        float d9 = y0.f.d(this.f8446l) + y0.c.d(this.f8445k);
        float b9 = y0.f.b(this.f8446l) + y0.c.e(this.f8445k);
        float f10 = this.f8444j;
        long a3 = v1.g.a(f10, f10);
        long a9 = v1.g.a(y0.a.b(a3), y0.a.c(a3));
        y0.e eVar2 = new y0.e(d8, e9, d9, b9, a9, a9, a9, a9);
        if (k0Var2 == null) {
            k0Var2 = z0.l0.h();
        } else {
            ((z0.j) k0Var2).d();
        }
        z0.k0.a(k0Var2, eVar2);
        this.f8443i = eVar2;
        this.f8442h = k0Var2;
        rVar.i(k0Var2);
    }

    public final Outline b() {
        d();
        if (this.f8447m && this.f8435a) {
            return this.f8436b;
        }
        return null;
    }

    public final boolean c(z0.j0 j0Var, float f9, boolean z8, float f10, long j8) {
        this.f8436b.setAlpha(f9);
        boolean a3 = r6.k.a(this.f8437c, j0Var);
        boolean z9 = !a3;
        if (!a3) {
            this.f8437c = j0Var;
            this.f8440f = true;
        }
        this.f8446l = j8;
        boolean z10 = j0Var != null && (z8 || f10 > 0.0f);
        if (this.f8447m != z10) {
            this.f8447m = z10;
            this.f8440f = true;
        }
        return z9;
    }

    public final void d() {
        if (this.f8440f) {
            this.f8445k = 0L;
            this.f8444j = 0.0f;
            this.f8439e = null;
            this.f8440f = false;
            this.f8441g = false;
            z0.j0 j0Var = this.f8437c;
            Outline outline = this.f8436b;
            if (j0Var == null || !this.f8447m || y0.f.d(this.f8446l) <= 0.0f || y0.f.b(this.f8446l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f8435a = true;
            if (j0Var instanceof z0.h0) {
                y0.d dVar = ((z0.h0) j0Var).f9997a;
                float f9 = dVar.f9780a;
                float f10 = dVar.f9781b;
                this.f8445k = u3.r.a(f9, f10);
                this.f8446l = v0.d.a(dVar.c(), dVar.b());
                outline.setRect(Math.round(f9), Math.round(f10), Math.round(dVar.f9782c), Math.round(dVar.f9783d));
                return;
            }
            if (!(j0Var instanceof z0.i0)) {
                if (j0Var instanceof z0.g0) {
                    e(((z0.g0) j0Var).f9995a);
                    return;
                }
                return;
            }
            y0.e eVar = ((z0.i0) j0Var).f10000a;
            float b9 = y0.a.b(eVar.f9788e);
            float f11 = eVar.f9784a;
            float f12 = eVar.f9785b;
            this.f8445k = u3.r.a(f11, f12);
            this.f8446l = v0.d.a(eVar.b(), eVar.a());
            if (u3.z.i(eVar)) {
                this.f8436b.setRoundRect(Math.round(f11), Math.round(f12), Math.round(eVar.f9786c), Math.round(eVar.f9787d), b9);
                this.f8444j = b9;
                return;
            }
            z0.j jVar = this.f8438d;
            if (jVar == null) {
                jVar = z0.l0.h();
                this.f8438d = jVar;
            }
            jVar.d();
            z0.k0.a(jVar, eVar);
            e(jVar);
        }
    }

    public final void e(z0.k0 k0Var) {
        int i7 = Build.VERSION.SDK_INT;
        Outline outline = this.f8436b;
        if (i7 <= 28 && !((z0.j) k0Var).f10002a.isConvex()) {
            this.f8435a = false;
            outline.setEmpty();
            this.f8441g = true;
        } else {
            if (!(k0Var instanceof z0.j)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((z0.j) k0Var).f10002a);
            this.f8441g = !outline.canClip();
        }
        this.f8439e = k0Var;
    }
}
