package l1;

import a0.g1;
import f1.k0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends t {

    /* renamed from: b, reason: collision with root package name */
    public float[] f4733b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4734c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f4735d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f4736e = f1.s.f2704h;

    /* renamed from: f, reason: collision with root package name */
    public List f4737f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4738g;

    /* renamed from: h, reason: collision with root package name */
    public f1.j f4739h;
    public p6.c i;

    /* renamed from: j, reason: collision with root package name */
    public final b1.e f4740j;

    /* renamed from: k, reason: collision with root package name */
    public String f4741k;

    /* renamed from: l, reason: collision with root package name */
    public float f4742l;

    /* renamed from: m, reason: collision with root package name */
    public float f4743m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4744n;

    public b() {
        int i = y.f4827a;
        this.f4737f = d6.u.f2326d;
        this.f4738g = true;
        this.f4740j = new b1.e(8, this);
        this.f4741k = "";
        this.f4742l = 1.0f;
        this.f4743m = 1.0f;
        this.f4744n = true;
    }

    @Override // l1.t
    public final void a(h1.d dVar) {
        if (this.f4744n) {
            float[] fArr = this.f4733b;
            if (fArr == null) {
                fArr = f1.p.i();
                this.f4733b = fArr;
            } else {
                f1.p.o(fArr);
            }
            f1.p.z(fArr, 0.0f, 0.0f);
            if (fArr.length >= 16) {
                double d8 = 0.0f * 0.017453292519943295d;
                float sin = (float) Math.sin(d8);
                float cos = (float) Math.cos(d8);
                float f6 = fArr[0];
                float f8 = fArr[4];
                float f9 = (sin * f8) + (cos * f6);
                float f10 = -sin;
                float f11 = (f8 * cos) + (f6 * f10);
                float f12 = fArr[1];
                float f13 = fArr[5];
                float f14 = (sin * f13) + (cos * f12);
                float f15 = (f13 * cos) + (f12 * f10);
                float f16 = fArr[2];
                float f17 = fArr[6];
                float f18 = (sin * f17) + (cos * f16);
                float f19 = (f17 * cos) + (f16 * f10);
                float f20 = fArr[3];
                float f21 = fArr[7];
                fArr[0] = f9;
                fArr[1] = f14;
                fArr[2] = f18;
                fArr[3] = (sin * f21) + (cos * f20);
                fArr[4] = f11;
                fArr[5] = f15;
                fArr[6] = f19;
                fArr[7] = (cos * f21) + (f10 * f20);
            }
            float f22 = this.f4742l;
            float f23 = this.f4743m;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f22;
                fArr[1] = fArr[1] * f22;
                fArr[2] = fArr[2] * f22;
                fArr[3] = fArr[3] * f22;
                fArr[4] = fArr[4] * f23;
                fArr[5] = fArr[5] * f23;
                fArr[6] = fArr[6] * f23;
                fArr[7] = fArr[7] * f23;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            f1.p.z(fArr, -0.0f, -0.0f);
            this.f4744n = false;
        }
        if (this.f4738g) {
            if (!this.f4737f.isEmpty()) {
                f1.j jVar = this.f4739h;
                if (jVar == null) {
                    jVar = f1.l.a();
                    this.f4739h = jVar;
                }
                h0.a.W(this.f4737f, jVar);
            }
            this.f4738g = false;
        }
        g1 y7 = dVar.y();
        long u7 = y7.u();
        y7.m().h();
        try {
            g1 g1Var = (g1) ((b1.b) y7.f84b).f1050e;
            float[] fArr2 = this.f4733b;
            if (fArr2 != null) {
                g1Var.m().l(fArr2);
            }
            f1.j jVar2 = this.f4739h;
            if (!this.f4737f.isEmpty() && jVar2 != null) {
                g1Var.m().g(jVar2);
            }
            ArrayList arrayList = this.f4734c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((t) arrayList.get(i)).a(dVar);
            }
        } finally {
            y7.m().f();
            y7.M(u7);
        }
    }

    @Override // l1.t
    public final p6.c b() {
        return this.i;
    }

    @Override // l1.t
    public final void d(b1.e eVar) {
        this.i = eVar;
    }

    public final void e(int i, t tVar) {
        ArrayList arrayList = this.f4734c;
        if (i < arrayList.size()) {
            arrayList.set(i, tVar);
        } else {
            arrayList.add(tVar);
        }
        g(tVar);
        tVar.d(this.f4740j);
        c();
    }

    public final void f(long j7) {
        if (this.f4735d && j7 != 16) {
            long j8 = this.f4736e;
            if (j8 == 16) {
                this.f4736e = j7;
                return;
            }
            int i = y.f4827a;
            if (f1.s.h(j8) == f1.s.h(j7) && f1.s.g(j8) == f1.s.g(j7) && f1.s.e(j8) == f1.s.e(j7)) {
                return;
            }
            this.f4735d = false;
            this.f4736e = f1.s.f2704h;
        }
    }

    public final void g(t tVar) {
        if (tVar instanceof g) {
            k0 k0Var = ((g) tVar).f4771b;
            if (this.f4735d && k0Var != null) {
                f(k0Var.f2682e);
                return;
            }
            return;
        }
        if (tVar instanceof b) {
            b bVar = (b) tVar;
            if (bVar.f4735d && this.f4735d) {
                f(bVar.f4736e);
            } else {
                this.f4735d = false;
                this.f4736e = f1.s.f2704h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f4741k);
        ArrayList arrayList = this.f4734c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            t tVar = (t) arrayList.get(i);
            sb.append("\t");
            sb.append(tVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
