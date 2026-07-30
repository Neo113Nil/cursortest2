package f1;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends d0 {

    /* renamed from: b, reason: collision with root package name */
    public z0.p f3169b;

    /* renamed from: c, reason: collision with root package name */
    public float f3170c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f3171d;

    /* renamed from: e, reason: collision with root package name */
    public float f3172e;

    /* renamed from: f, reason: collision with root package name */
    public float f3173f;

    /* renamed from: g, reason: collision with root package name */
    public z0.p f3174g;

    /* renamed from: h, reason: collision with root package name */
    public int f3175h;

    /* renamed from: i, reason: collision with root package name */
    public int f3176i;

    /* renamed from: j, reason: collision with root package name */
    public float f3177j;

    /* renamed from: k, reason: collision with root package name */
    public float f3178k;

    /* renamed from: l, reason: collision with root package name */
    public float f3179l;

    /* renamed from: m, reason: collision with root package name */
    public float f3180m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3181n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3182o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3183p;

    /* renamed from: q, reason: collision with root package name */
    public b1.i f3184q;

    /* renamed from: r, reason: collision with root package name */
    public final z0.j f3185r;

    /* renamed from: s, reason: collision with root package name */
    public z0.j f3186s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f3187t;

    public i() {
        int i7 = i0.f3188a;
        this.f3171d = e6.u.f2826f;
        this.f3172e = 1.0f;
        this.f3175h = 0;
        this.f3176i = 0;
        this.f3177j = 4.0f;
        this.f3179l = 1.0f;
        this.f3181n = true;
        this.f3182o = true;
        z0.j h3 = z0.l0.h();
        this.f3185r = h3;
        this.f3186s = h3;
        this.f3187t = d6.a.c(d6.h.f2616g, h.f3156h);
    }

    @Override // f1.d0
    public final void a(b1.e eVar) {
        b1.e eVar2;
        b1.i iVar;
        if (this.f3181n) {
            b.d(this.f3171d, this.f3185r);
            e();
        } else if (this.f3183p) {
            e();
        }
        this.f3181n = false;
        this.f3183p = false;
        z0.p pVar = this.f3169b;
        if (pVar != null) {
            eVar2 = eVar;
            b1.e.n(eVar2, this.f3186s, pVar, this.f3170c, null, 56);
        } else {
            eVar2 = eVar;
        }
        z0.p pVar2 = this.f3174g;
        if (pVar2 != null) {
            b1.i iVar2 = this.f3184q;
            if (this.f3182o || iVar2 == null) {
                b1.i iVar3 = new b1.i(this.f3173f, this.f3177j, this.f3175h, this.f3176i, 16);
                this.f3184q = iVar3;
                this.f3182o = false;
                iVar = iVar3;
            } else {
                iVar = iVar2;
            }
            b1.e.n(eVar2, this.f3186s, pVar2, this.f3172e, iVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [d6.g, java.lang.Object] */
    public final void e() {
        float f9 = this.f3178k;
        z0.j jVar = this.f3185r;
        if (f9 == 0.0f && this.f3179l == 1.0f) {
            this.f3186s = jVar;
            return;
        }
        if (r6.k.a(this.f3186s, jVar)) {
            this.f3186s = z0.l0.h();
        } else {
            Path.FillType fillType = this.f3186s.f10002a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z8 = fillType == fillType2;
            this.f3186s.f10002a.rewind();
            Path path = this.f3186s.f10002a;
            if (!z8) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f3187t;
        ((z0.k) r02.getValue()).f10005a.setPath(jVar != null ? jVar.f10002a : null, false);
        float length = ((z0.k) r02.getValue()).f10005a.getLength();
        float f10 = this.f3178k;
        float f11 = this.f3180m;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f3179l + f11) % 1.0f) * length;
        if (f12 <= f13) {
            ((z0.k) r02.getValue()).a(f12, f13, this.f3186s);
        } else {
            ((z0.k) r02.getValue()).a(f12, length, this.f3186s);
            ((z0.k) r02.getValue()).a(0.0f, f13, this.f3186s);
        }
    }

    public final String toString() {
        return this.f3185r.toString();
    }
}
