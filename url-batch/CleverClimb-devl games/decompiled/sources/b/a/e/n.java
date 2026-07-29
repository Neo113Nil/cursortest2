package b.a.e;

import java.util.Arrays;

/* compiled from: Settings.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private int f1994a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f1995b = new int[10];

    void a() {
        this.f1994a = 0;
        Arrays.fill(this.f1995b, 0);
    }

    n a(int i, int i2) {
        if (i >= this.f1995b.length) {
            return this;
        }
        this.f1994a = (1 << i) | this.f1994a;
        this.f1995b[i] = i2;
        return this;
    }

    boolean a(int i) {
        return ((1 << i) & this.f1994a) != 0;
    }

    int b(int i) {
        return this.f1995b[i];
    }

    int b() {
        return Integer.bitCount(this.f1994a);
    }

    int c() {
        if ((this.f1994a & 2) != 0) {
            return this.f1995b[1];
        }
        return -1;
    }

    int c(int i) {
        return (this.f1994a & 16) != 0 ? this.f1995b[4] : i;
    }

    int d(int i) {
        return (this.f1994a & 32) != 0 ? this.f1995b[5] : i;
    }

    int d() {
        if ((this.f1994a & 128) != 0) {
            return this.f1995b[7];
        }
        return 65535;
    }

    void a(n nVar) {
        for (int i = 0; i < 10; i++) {
            if (nVar.a(i)) {
                a(i, nVar.b(i));
            }
        }
    }
}
