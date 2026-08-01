package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class e30 implements Comparable {
    public boolean f;
    public float j;
    public int q;
    public int g = -1;
    public int h = -1;
    public int i = 0;
    public boolean k = false;
    public final float[] l = new float[9];
    public final float[] m = new float[9];
    public o6[] n = new o6[16];
    public int o = 0;
    public int p = 0;

    public e30(int i) {
        this.q = i;
    }

    public final void a(o6 o6Var) {
        int i = 0;
        while (true) {
            int i2 = this.o;
            o6[] o6VarArr = this.n;
            if (i >= i2) {
                if (i2 >= o6VarArr.length) {
                    this.n = (o6[]) Arrays.copyOf(o6VarArr, o6VarArr.length * 2);
                }
                o6[] o6VarArr2 = this.n;
                int i3 = this.o;
                o6VarArr2[i3] = o6Var;
                this.o = i3 + 1;
                return;
            }
            if (o6VarArr[i] == o6Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(o6 o6Var) {
        int i = this.o;
        int i2 = 0;
        while (i2 < i) {
            if (this.n[i2] == o6Var) {
                while (i2 < i - 1) {
                    o6[] o6VarArr = this.n;
                    int i3 = i2 + 1;
                    o6VarArr[i2] = o6VarArr[i3];
                    i2 = i3;
                }
                this.o--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.q = 5;
        this.i = 0;
        this.g = -1;
        this.h = -1;
        this.j = 0.0f;
        this.k = false;
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2] = null;
        }
        this.o = 0;
        this.p = 0;
        this.f = false;
        Arrays.fill(this.m, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.g - ((e30) obj).g;
    }

    public final void d(kq kqVar, float f) {
        this.j = f;
        this.k = true;
        int i = this.o;
        this.h = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].h(kqVar, this, false);
        }
        this.o = 0;
    }

    public final void e(kq kqVar, o6 o6Var) {
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].i(kqVar, o6Var, false);
        }
        this.o = 0;
    }

    public final String toString() {
        return "" + this.g;
    }
}
