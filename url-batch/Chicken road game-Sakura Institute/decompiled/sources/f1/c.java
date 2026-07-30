package f1;

import java.util.ArrayList;
import java.util.List;
import z0.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends d0 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f3085b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3086c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f3087d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f3088e = z0.u.f10057g;

    /* renamed from: f, reason: collision with root package name */
    public List f3089f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3090g;

    /* renamed from: h, reason: collision with root package name */
    public z0.j f3091h;

    /* renamed from: i, reason: collision with root package name */
    public q6.c f3092i;

    /* renamed from: j, reason: collision with root package name */
    public final c1.a f3093j;

    /* renamed from: k, reason: collision with root package name */
    public String f3094k;

    /* renamed from: l, reason: collision with root package name */
    public float f3095l;

    /* renamed from: m, reason: collision with root package name */
    public float f3096m;

    /* renamed from: n, reason: collision with root package name */
    public float f3097n;

    /* renamed from: o, reason: collision with root package name */
    public float f3098o;

    /* renamed from: p, reason: collision with root package name */
    public float f3099p;

    /* renamed from: q, reason: collision with root package name */
    public float f3100q;

    /* renamed from: r, reason: collision with root package name */
    public float f3101r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3102s;

    public c() {
        int i7 = i0.f3188a;
        this.f3089f = e6.u.f2826f;
        this.f3090g = true;
        this.f3093j = new c1.a(4, this);
        this.f3094k = "";
        this.f3098o = 1.0f;
        this.f3099p = 1.0f;
        this.f3102s = true;
    }

    @Override // f1.d0
    public final void a(b1.e eVar) {
        if (this.f3102s) {
            float[] fArr = this.f3085b;
            if (fArr == null) {
                fArr = z0.f0.a();
                this.f3085b = fArr;
            } else {
                z0.f0.d(fArr);
            }
            z0.f0.h(fArr, this.f3100q + this.f3096m, this.f3101r + this.f3097n);
            z0.f0.e(fArr, this.f3095l);
            z0.f0.f(fArr, this.f3098o, this.f3099p);
            z0.f0.h(fArr, -this.f3096m, -this.f3097n);
            this.f3102s = false;
        }
        if (this.f3090g) {
            if (!this.f3089f.isEmpty()) {
                z0.j jVar = this.f3091h;
                if (jVar == null) {
                    jVar = z0.l0.h();
                    this.f3091h = jVar;
                }
                b.d(this.f3089f, jVar);
            }
            this.f3090g = false;
        }
        b1.b B = eVar.B();
        long p6 = B.p();
        B.k().o();
        try {
            b1.b bVar = (b1.b) ((b6.c) B.f1230g).f1394g;
            float[] fArr2 = this.f3085b;
            if (fArr2 != null) {
                bVar.k().r(fArr2);
            }
            z0.j jVar2 = this.f3091h;
            if (!this.f3089f.isEmpty() && jVar2 != null) {
                bVar.k().i(jVar2);
            }
            ArrayList arrayList = this.f3086c;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((d0) arrayList.get(i7)).a(eVar);
            }
        } finally {
            a0.m.s(B, p6);
        }
    }

    @Override // f1.d0
    public final q6.c b() {
        return this.f3092i;
    }

    @Override // f1.d0
    public final void d(c1.a aVar) {
        this.f3092i = aVar;
    }

    public final void e(int i7, d0 d0Var) {
        ArrayList arrayList = this.f3086c;
        if (i7 < arrayList.size()) {
            arrayList.set(i7, d0Var);
        } else {
            arrayList.add(d0Var);
        }
        g(d0Var);
        d0Var.d(this.f3093j);
        c();
    }

    public final void f(long j8) {
        if (this.f3087d && j8 != 16) {
            long j9 = this.f3088e;
            if (j9 == 16) {
                this.f3088e = j8;
                return;
            }
            int i7 = i0.f3188a;
            if (z0.u.h(j9) == z0.u.h(j8) && z0.u.g(j9) == z0.u.g(j8) && z0.u.e(j9) == z0.u.e(j8)) {
                return;
            }
            this.f3087d = false;
            this.f3088e = z0.u.f10057g;
        }
    }

    public final void g(d0 d0Var) {
        if (!(d0Var instanceof i)) {
            if (d0Var instanceof c) {
                c cVar = (c) d0Var;
                if (cVar.f3087d && this.f3087d) {
                    f(cVar.f3088e);
                    return;
                } else {
                    this.f3087d = false;
                    this.f3088e = z0.u.f10057g;
                    return;
                }
            }
            return;
        }
        i iVar = (i) d0Var;
        z0.p pVar = iVar.f3169b;
        if (this.f3087d && pVar != null) {
            if (pVar instanceof r0) {
                f(((r0) pVar).f10045a);
            } else {
                this.f3087d = false;
                this.f3088e = z0.u.f10057g;
            }
        }
        z0.p pVar2 = iVar.f3174g;
        if (this.f3087d && pVar2 != null) {
            if (pVar2 instanceof r0) {
                f(((r0) pVar2).f10045a);
            } else {
                this.f3087d = false;
                this.f3088e = z0.u.f10057g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f3094k);
        ArrayList arrayList = this.f3086c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            d0 d0Var = (d0) arrayList.get(i7);
            sb.append("\t");
            sb.append(d0Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
