package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cl {
    public final hl a;
    public dg b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final da0 d = new da0();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public cl(hl hlVar, dg dgVar) {
        this.a = hlVar;
        this.b = dgVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            bt0 bt0Var = this.b.a;
            bt0Var.D(xs0.c);
            bt0Var.c[bt0Var.d - bt0Var.a[bt0Var.b - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        dg dgVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        dgVar.getClass();
        if (size != 0) {
            bt0 bt0Var2 = dgVar.a;
            bt0Var2.D(as0.c);
            y90.D(bt0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                bt0 bt0Var = this.b.a;
                bt0Var.D(ps0.c);
                int i3 = bt0Var.d - bt0Var.a[bt0Var.b - 1].a;
                int[] iArr = bt0Var.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                bt0 bt0Var2 = this.b.a;
                bt0Var2.D(ls0.c);
                int i6 = bt0Var2.d - bt0Var2.a[bt0Var2.b - 1].a;
                int[] iArr2 = bt0Var2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        za1 za1Var = this.a.G;
        int i = z ? za1Var.i : za1Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            kl.a("Tried to seek backward");
        }
        if (i2 > 0) {
            bt0 bt0Var = this.b.a;
            bt0Var.D(tr0.c);
            bt0Var.c[bt0Var.d - bt0Var.a[bt0Var.b - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                kl.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
