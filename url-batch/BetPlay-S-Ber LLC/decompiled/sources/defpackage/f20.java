package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class f20 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public f20 f;
    public f20 g;

    public f20(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final f20 a() {
        f20 f20Var = this.f;
        if (f20Var == this) {
            f20Var = null;
        }
        f20 f20Var2 = this.g;
        f20Var2.getClass();
        f20Var2.f = this.f;
        f20 f20Var3 = this.f;
        f20Var3.getClass();
        f20Var3.g = this.g;
        this.f = null;
        this.g = null;
        return f20Var;
    }

    public final void b(f20 f20Var) {
        f20Var.getClass();
        f20Var.g = this;
        f20Var.f = this.f;
        f20 f20Var2 = this.f;
        f20Var2.getClass();
        f20Var2.g = f20Var;
        this.f = f20Var;
    }

    public final f20 c() {
        this.d = true;
        return new f20(this.a, this.b, this.c, true);
    }

    public final void d(f20 f20Var, int i) {
        f20Var.getClass();
        byte[] bArr = f20Var.a;
        if (!f20Var.e) {
            o8.t("only owner can write");
            return;
        }
        int i2 = f20Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (f20Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = f20Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            h7.f0(bArr, bArr, 0, i4, i2);
            f20Var.c -= f20Var.b;
            f20Var.b = 0;
        }
        int i5 = f20Var.c;
        int i6 = this.b;
        h7.f0(this.a, bArr, i5, i6, i6 + i);
        f20Var.c += i;
        this.b += i;
    }

    public f20() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
