package r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final n0.i0 f8084a;

    /* renamed from: b, reason: collision with root package name */
    public a f8085b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8086c;

    /* renamed from: f, reason: collision with root package name */
    public int f8089f;
    public int g;

    /* renamed from: l, reason: collision with root package name */
    public int f8093l;

    /* renamed from: d, reason: collision with root package name */
    public final c2.r f8087d = new c2.r();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8088e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8090h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f8091i = -1;
    public int j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f8092k = -1;

    public b(n0.i0 i0Var, a aVar) {
        this.f8084a = i0Var;
        this.f8085b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f8090h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i3 = this.g;
        if (i3 > 0) {
            k0 k0Var = this.f8085b.f8082a;
            k0Var.l0(g0.f8105c);
            k0Var.f8115c[k0Var.f8116d - k0Var.f8113a[k0Var.f8114b - 1].f8109a] = i3;
            this.g = 0;
        }
        ArrayList arrayList = this.f8090h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.f8085b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = arrayList.get(i10);
        }
        aVar.getClass();
        if (size != 0) {
            k0 k0Var2 = aVar.f8082a;
            k0Var2.l0(k.f8112c);
            z4.w.N(k0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i3 = this.f8093l;
        if (i3 > 0) {
            int i10 = this.f8091i;
            if (i10 >= 0) {
                b();
                k0 k0Var = this.f8085b.f8082a;
                k0Var.l0(y.f8135c);
                int i11 = k0Var.f8116d - k0Var.f8113a[k0Var.f8114b - 1].f8109a;
                int[] iArr = k0Var.f8115c;
                iArr[i11] = i10;
                iArr[i11 + 1] = i3;
                this.f8091i = -1;
            } else {
                int i12 = this.f8092k;
                int i13 = this.j;
                b();
                k0 k0Var2 = this.f8085b.f8082a;
                k0Var2.l0(v.f8132c);
                int i14 = k0Var2.f8116d - k0Var2.f8113a[k0Var2.f8114b - 1].f8109a;
                int[] iArr2 = k0Var2.f8115c;
                iArr2[i14 + 1] = i12;
                iArr2[i14] = i13;
                iArr2[i14 + 2] = i3;
                this.j = -1;
                this.f8092k = -1;
            }
            this.f8093l = 0;
        }
    }

    public final void d(boolean z10) {
        q0.g gVar = this.f8084a.G;
        int i3 = z10 ? gVar.f7741i : gVar.g;
        int i10 = i3 - this.f8089f;
        if (i10 < 0) {
            n0.m.a("Tried to seek backward");
        }
        if (i10 > 0) {
            k0 k0Var = this.f8085b.f8082a;
            k0Var.l0(d.f8098c);
            k0Var.f8115c[k0Var.f8116d - k0Var.f8113a[k0Var.f8114b - 1].f8109a] = i10;
            this.f8089f = i3;
        }
    }

    public final void e(int i3, int i10) {
        if (i10 > 0) {
            if (!(i3 >= 0)) {
                n0.m.a("Invalid remove index " + i3);
            }
            if (this.f8091i == i3) {
                this.f8093l += i10;
                return;
            }
            c();
            this.f8091i = i3;
            this.f8093l = i10;
        }
    }
}
