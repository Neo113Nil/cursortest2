package n0;

import java.util.ArrayList;
import m0.n0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final m0.s f5247a;

    /* renamed from: b, reason: collision with root package name */
    public a f5248b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5249c;

    /* renamed from: f, reason: collision with root package name */
    public int f5252f;

    /* renamed from: g, reason: collision with root package name */
    public int f5253g;

    /* renamed from: l, reason: collision with root package name */
    public int f5257l;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f5250d = new n0();

    /* renamed from: e, reason: collision with root package name */
    public boolean f5251e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f5254h = new ArrayList();
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f5255j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f5256k = -1;

    public b(m0.s sVar, a aVar) {
        this.f5247a = sVar;
        this.f5248b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f5254h;
        if (arrayList.isEmpty()) {
            this.f5253g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.f5253g;
        if (i > 0) {
            l0 l0Var = this.f5248b.f5245b;
            l0Var.b0(h0.f5271c);
            l0Var.f5281d[l0Var.f5282e - l0Var.f5279b[l0Var.f5280c - 1].f5275a] = i;
            this.f5253g = 0;
        }
        ArrayList arrayList = this.f5254h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.f5248b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i8] = arrayList.get(i8);
        }
        aVar.getClass();
        if (size != 0) {
            l0 l0Var2 = aVar.f5245b;
            l0Var2.b0(k.f5277c);
            m.a.O(l0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.f5257l;
        if (i > 0) {
            int i8 = this.i;
            if (i8 >= 0) {
                b();
                l0 l0Var = this.f5248b.f5245b;
                l0Var.b0(z.f5302c);
                int i9 = l0Var.f5282e - l0Var.f5279b[l0Var.f5280c - 1].f5275a;
                int[] iArr = l0Var.f5281d;
                iArr[i9] = i8;
                iArr[i9 + 1] = i;
                this.i = -1;
            } else {
                int i10 = this.f5256k;
                int i11 = this.f5255j;
                b();
                l0 l0Var2 = this.f5248b.f5245b;
                l0Var2.b0(v.f5298c);
                int i12 = l0Var2.f5282e - l0Var2.f5279b[l0Var2.f5280c - 1].f5275a;
                int[] iArr2 = l0Var2.f5281d;
                iArr2[i12 + 1] = i10;
                iArr2[i12] = i11;
                iArr2[i12 + 2] = i;
                this.f5255j = -1;
                this.f5256k = -1;
            }
            this.f5257l = 0;
        }
    }

    public final void d(boolean z3) {
        m0.s sVar = this.f5247a;
        int i = z3 ? sVar.G.i : sVar.G.f4913g;
        int i8 = i - this.f5252f;
        if (i8 < 0) {
            m0.t.c("Tried to seek backward");
        }
        if (i8 > 0) {
            l0 l0Var = this.f5248b.f5245b;
            l0Var.b0(d.f5262c);
            l0Var.f5281d[l0Var.f5282e - l0Var.f5279b[l0Var.f5280c - 1].f5275a] = i8;
            this.f5252f = i;
        }
    }

    public final void e(int i, int i8) {
        if (i8 > 0) {
            if (!(i >= 0)) {
                m0.t.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.f5257l += i8;
                return;
            }
            c();
            this.i = i;
            this.f5257l = i8;
        }
    }
}
