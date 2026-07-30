package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tz {
    public final a00 a;
    public et b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final y31 d = new y31();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public tz(a00 a00Var, et etVar) {
        this.a = a00Var;
        this.b = etVar;
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
            rw1 rw1Var = this.b.s;
            rw1Var.Y(nw1.c);
            rw1Var.u[rw1Var.v - rw1Var.s[rw1Var.t - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        et etVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        etVar.getClass();
        if (size != 0) {
            rw1 rw1Var2 = etVar.s;
            rw1Var2.Y(rv1.c);
            s03.M(rw1Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                rw1 rw1Var = this.b.s;
                rw1Var.Y(fw1.c);
                int i3 = rw1Var.v - rw1Var.s[rw1Var.t - 1].a;
                int[] iArr = rw1Var.u;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                rw1 rw1Var2 = this.b.s;
                rw1Var2.Y(cw1.c);
                int i6 = rw1Var2.v - rw1Var2.s[rw1Var2.t - 1].a;
                int[] iArr2 = rw1Var2.u;
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
        vl2 vl2Var = this.a.G;
        int i = z ? vl2Var.i : vl2Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            b00.c("Tried to seek backward");
        }
        if (i2 > 0) {
            rw1 rw1Var = this.b.s;
            rw1Var.Y(kv1.c);
            rw1Var.u[rw1Var.v - rw1Var.s[rw1Var.t - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                b00.c("Invalid remove index " + i);
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
