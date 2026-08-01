package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class kc0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public kc0 f;
    public kc0 g;

    public kc0(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final kc0 a() {
        kc0 kc0Var = this.f;
        if (kc0Var == this) {
            kc0Var = null;
        }
        kc0 kc0Var2 = this.g;
        kc0Var2.getClass();
        kc0Var2.f = this.f;
        kc0 kc0Var3 = this.f;
        kc0Var3.getClass();
        kc0Var3.g = this.g;
        this.f = null;
        this.g = null;
        return kc0Var;
    }

    public final void b(kc0 kc0Var) {
        kc0Var.getClass();
        kc0Var.g = this;
        kc0Var.f = this.f;
        kc0 kc0Var2 = this.f;
        kc0Var2.getClass();
        kc0Var2.g = kc0Var;
        this.f = kc0Var;
    }

    public final kc0 c() {
        this.d = true;
        return new kc0(this.a, this.b, this.c, true);
    }

    public final void d(kc0 kc0Var, int i) {
        kc0Var.getClass();
        byte[] bArr = kc0Var.a;
        if (!kc0Var.e) {
            s9.u("only owner can write");
            return;
        }
        int i2 = kc0Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (kc0Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = kc0Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            j7.X(bArr, bArr, 0, i4, i2);
            kc0Var.c -= kc0Var.b;
            kc0Var.b = 0;
        }
        int i5 = kc0Var.c;
        int i6 = this.b;
        j7.X(this.a, bArr, i5, i6, i6 + i);
        kc0Var.c += i;
        this.b += i;
    }

    public kc0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
