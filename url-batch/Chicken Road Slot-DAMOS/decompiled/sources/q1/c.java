package q1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f7800b;

    /* renamed from: h, reason: collision with root package name */
    public k1.g f7805h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f7806i;

    /* renamed from: l, reason: collision with root package name */
    public float f7808l;

    /* renamed from: m, reason: collision with root package name */
    public float f7809m;

    /* renamed from: n, reason: collision with root package name */
    public float f7810n;

    /* renamed from: q, reason: collision with root package name */
    public float f7813q;

    /* renamed from: r, reason: collision with root package name */
    public float f7814r;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7801c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f7802d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f7803e = k1.p.g;

    /* renamed from: f, reason: collision with root package name */
    public List f7804f = g0.f7869a;
    public boolean g = true;
    public final a3.e j = new a3.e(17, this);

    /* renamed from: k, reason: collision with root package name */
    public String f7807k = "";

    /* renamed from: o, reason: collision with root package name */
    public float f7811o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f7812p = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7815s = true;

    @Override // q1.c0
    public final void a(m1.d dVar) {
        if (this.f7815s) {
            float[] fArr = this.f7800b;
            if (fArr == null) {
                fArr = k1.v.g();
                this.f7800b = fArr;
            } else {
                k1.v.o(fArr);
            }
            k1.v.v(fArr, this.f7813q + this.f7809m, this.f7814r + this.f7810n);
            float f3 = this.f7808l;
            if (fArr.length >= 16) {
                double d10 = f3 * 0.017453292519943295d;
                float sin = (float) Math.sin(d10);
                float cos = (float) Math.cos(d10);
                float f10 = fArr[0];
                float f11 = fArr[4];
                float f12 = (sin * f11) + (cos * f10);
                float f13 = -sin;
                float f14 = (f11 * cos) + (f10 * f13);
                float f15 = fArr[1];
                float f16 = fArr[5];
                float f17 = (sin * f16) + (cos * f15);
                float f18 = (f16 * cos) + (f15 * f13);
                float f19 = fArr[2];
                float f20 = fArr[6];
                float f21 = (sin * f20) + (cos * f19);
                float f22 = (f20 * cos) + (f19 * f13);
                float f23 = fArr[3];
                float f24 = fArr[7];
                fArr[0] = f12;
                fArr[1] = f17;
                fArr[2] = f21;
                fArr[3] = (sin * f24) + (cos * f23);
                fArr[4] = f14;
                fArr[5] = f18;
                fArr[6] = f22;
                fArr[7] = (cos * f24) + (f13 * f23);
            }
            float f25 = this.f7811o;
            float f26 = this.f7812p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f25;
                fArr[1] = fArr[1] * f25;
                fArr[2] = fArr[2] * f25;
                fArr[3] = fArr[3] * f25;
                fArr[4] = fArr[4] * f26;
                fArr[5] = fArr[5] * f26;
                fArr[6] = fArr[6] * f26;
                fArr[7] = fArr[7] * f26;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            k1.v.v(fArr, -this.f7809m, -this.f7810n);
            this.f7815s = false;
        }
        if (this.g) {
            if (!this.f7804f.isEmpty()) {
                k1.g gVar = this.f7805h;
                if (gVar == null) {
                    gVar = k1.i.a();
                    this.f7805h = gVar;
                }
                b.e(this.f7804f, gVar);
            }
            this.g = false;
        }
        a1.n s3 = dVar.s();
        long u2 = s3.u();
        s3.p().h();
        try {
            a1.n nVar = (a1.n) ((l.d) s3.f41i).f5643e;
            float[] fArr2 = this.f7800b;
            if (fArr2 != null) {
                nVar.p().m(fArr2);
            }
            k1.g gVar2 = this.f7805h;
            if (!this.f7804f.isEmpty() && gVar2 != null) {
                nVar.p().n(gVar2);
            }
            ArrayList arrayList = this.f7801c;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((c0) arrayList.get(i3)).a(dVar);
            }
        } finally {
            s3.p().f();
            s3.K(u2);
        }
    }

    @Override // q1.c0
    public final Function1 b() {
        return this.f7806i;
    }

    @Override // q1.c0
    public final void d(a3.e eVar) {
        this.f7806i = eVar;
    }

    public final void e(int i3, c0 c0Var) {
        ArrayList arrayList = this.f7801c;
        if (i3 < arrayList.size()) {
            arrayList.set(i3, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        g(c0Var);
        c0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.f7802d && j != 16) {
            long j3 = this.f7803e;
            if (j3 == 16) {
                this.f7803e = j;
                return;
            }
            kotlin.collections.j0 j0Var = g0.f7869a;
            if (k1.p.g(j3) == k1.p.g(j) && k1.p.f(j3) == k1.p.f(j) && k1.p.e(j3) == k1.p.e(j)) {
                return;
            }
            this.f7802d = false;
            this.f7803e = k1.p.g;
        }
    }

    public final void g(c0 c0Var) {
        if (!(c0Var instanceof h)) {
            if (c0Var instanceof c) {
                c cVar = (c) c0Var;
                if (cVar.f7802d && this.f7802d) {
                    f(cVar.f7803e);
                    return;
                } else {
                    this.f7802d = false;
                    this.f7803e = k1.p.g;
                    return;
                }
            }
            return;
        }
        h hVar = (h) c0Var;
        k1.v vVar = hVar.f7870b;
        if (this.f7802d && vVar != null) {
            if (vVar instanceof k1.h0) {
                f(((k1.h0) vVar).f5325f);
            } else {
                this.f7802d = false;
                this.f7803e = k1.p.g;
            }
        }
        k1.v vVar2 = hVar.g;
        if (this.f7802d && vVar2 != null) {
            if (vVar2 instanceof k1.h0) {
                f(((k1.h0) vVar2).f5325f);
            } else {
                this.f7802d = false;
                this.f7803e = k1.p.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f7807k);
        ArrayList arrayList = this.f7801c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            c0 c0Var = (c0) arrayList.get(i3);
            sb2.append("\t");
            sb2.append(c0Var.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
