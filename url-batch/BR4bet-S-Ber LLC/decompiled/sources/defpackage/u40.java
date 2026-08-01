package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class u40 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public u40 f;
    public u40 g;

    public u40(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final u40 a() {
        u40 u40Var = this.f;
        if (u40Var == this) {
            u40Var = null;
        }
        u40 u40Var2 = this.g;
        u40Var2.getClass();
        u40Var2.f = this.f;
        u40 u40Var3 = this.f;
        u40Var3.getClass();
        u40Var3.g = this.g;
        this.f = null;
        this.g = null;
        return u40Var;
    }

    public final void b(u40 u40Var) {
        u40Var.getClass();
        u40Var.g = this;
        u40Var.f = this.f;
        u40 u40Var2 = this.f;
        u40Var2.getClass();
        u40Var2.g = u40Var;
        this.f = u40Var;
    }

    public final u40 c() {
        this.d = true;
        return new u40(this.a, this.b, this.c, true);
    }

    public final void d(u40 u40Var, int i) {
        u40Var.getClass();
        byte[] bArr = u40Var.a;
        if (!u40Var.e) {
            g9.s("only owner can write");
            return;
        }
        int i2 = u40Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (u40Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = u40Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            a7.Y(bArr, bArr, 0, i4, i2);
            u40Var.c -= u40Var.b;
            u40Var.b = 0;
        }
        int i5 = u40Var.c;
        int i6 = this.b;
        a7.Y(this.a, bArr, i5, i6, i6 + i);
        u40Var.c += i;
        this.b += i;
    }

    public u40() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
