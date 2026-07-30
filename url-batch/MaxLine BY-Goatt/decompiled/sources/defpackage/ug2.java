package defpackage;

import com.facebook.internal.Utility;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ug2 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public ug2 f;
    public ug2 g;

    public ug2(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final ug2 a() {
        ug2 ug2Var = this.f;
        if (ug2Var == this) {
            ug2Var = null;
        }
        ug2 ug2Var2 = this.g;
        ug2Var2.getClass();
        ug2Var2.f = this.f;
        ug2 ug2Var3 = this.f;
        ug2Var3.getClass();
        ug2Var3.g = this.g;
        this.f = null;
        this.g = null;
        return ug2Var;
    }

    public final void b(ug2 ug2Var) {
        ug2Var.getClass();
        ug2Var.g = this;
        ug2Var.f = this.f;
        ug2 ug2Var2 = this.f;
        ug2Var2.getClass();
        ug2Var2.g = ug2Var;
        this.f = ug2Var;
    }

    public final ug2 c() {
        this.d = true;
        return new ug2(this.a, this.b, this.c, true);
    }

    public final void d(ug2 ug2Var, int i) {
        ug2Var.getClass();
        byte[] bArr = ug2Var.a;
        if (!ug2Var.e) {
            lh.g("only owner can write");
            return;
        }
        int i2 = ug2Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (ug2Var.d) {
                b71.t();
                return;
            }
            int i4 = ug2Var.b;
            if (i3 - i4 > 8192) {
                b71.t();
                return;
            } else {
                ni.c(0, i4, i2, bArr, bArr);
                ug2Var.c -= ug2Var.b;
                ug2Var.b = 0;
            }
        }
        int i5 = ug2Var.c;
        int i6 = this.b;
        ni.c(i5, i6, i6 + i, this.a, bArr);
        ug2Var.c += i;
        this.b += i;
    }

    public ug2() {
        this.a = new byte[Utility.DEFAULT_STREAM_BUFFER_SIZE];
        this.e = true;
        this.d = false;
    }
}
