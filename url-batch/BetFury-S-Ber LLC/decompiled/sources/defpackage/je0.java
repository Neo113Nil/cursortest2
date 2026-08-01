package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class je0 implements Comparable {
    public boolean f;
    public float j;
    public ie0 n;
    public int g = -1;
    public int h = -1;
    public int i = 0;
    public boolean k = false;
    public final float[] l = new float[9];
    public final float[] m = new float[9];
    public h7[] o = new h7[16];
    public int p = 0;
    public int q = 0;

    public je0(ie0 ie0Var) {
        this.n = ie0Var;
    }

    public final void a(h7 h7Var) {
        int i = 0;
        while (true) {
            int i2 = this.p;
            h7[] h7VarArr = this.o;
            if (i >= i2) {
                if (i2 >= h7VarArr.length) {
                    this.o = (h7[]) Arrays.copyOf(h7VarArr, h7VarArr.length * 2);
                }
                h7[] h7VarArr2 = this.o;
                int i3 = this.p;
                h7VarArr2[i3] = h7Var;
                this.p = i3 + 1;
                return;
            }
            if (h7VarArr[i] == h7Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(h7 h7Var) {
        int i = this.p;
        int i2 = 0;
        while (i2 < i) {
            if (this.o[i2] == h7Var) {
                while (i2 < i - 1) {
                    h7[] h7VarArr = this.o;
                    int i3 = i2 + 1;
                    h7VarArr[i2] = h7VarArr[i3];
                    i2 = i3;
                }
                this.p--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = ie0.UNKNOWN;
        this.i = 0;
        this.g = -1;
        this.h = -1;
        this.j = 0.0f;
        this.k = false;
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            this.o[i2] = null;
        }
        this.p = 0;
        this.q = 0;
        this.f = false;
        Arrays.fill(this.m, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.g - ((je0) obj).g;
    }

    public final void d(xx xxVar, float f) {
        this.j = f;
        this.k = true;
        int i = this.p;
        this.h = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.o[i2].h(xxVar, this, false);
        }
        this.p = 0;
    }

    public final void e(xx xxVar, h7 h7Var) {
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            this.o[i2].i(xxVar, h7Var, false);
        }
        this.p = 0;
    }

    public final String toString() {
        return "" + this.g;
    }
}
