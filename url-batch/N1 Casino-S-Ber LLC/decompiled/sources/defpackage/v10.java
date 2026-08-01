package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class v10 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public v10 f;
    public v10 g;

    public v10(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final v10 a() {
        v10 v10Var = this.f;
        if (v10Var == this) {
            v10Var = null;
        }
        v10 v10Var2 = this.g;
        v10Var2.getClass();
        v10Var2.f = this.f;
        v10 v10Var3 = this.f;
        v10Var3.getClass();
        v10Var3.g = this.g;
        this.f = null;
        this.g = null;
        return v10Var;
    }

    public final void b(v10 v10Var) {
        v10Var.getClass();
        v10Var.g = this;
        v10Var.f = this.f;
        v10 v10Var2 = this.f;
        v10Var2.getClass();
        v10Var2.g = v10Var;
        this.f = v10Var;
    }

    public final v10 c() {
        this.d = true;
        return new v10(this.a, this.b, this.c, true);
    }

    public final void d(v10 v10Var, int i) {
        v10Var.getClass();
        byte[] bArr = v10Var.a;
        if (!v10Var.e) {
            t8.t("only owner can write");
            return;
        }
        int i2 = v10Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (v10Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = v10Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            q6.c0(bArr, bArr, 0, i4, i2);
            v10Var.c -= v10Var.b;
            v10Var.b = 0;
        }
        int i5 = v10Var.c;
        int i6 = this.b;
        q6.c0(this.a, bArr, i5, i6, i6 + i);
        v10Var.c += i;
        this.b += i;
    }

    public v10() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
