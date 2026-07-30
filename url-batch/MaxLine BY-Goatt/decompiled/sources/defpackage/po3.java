package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class po3 implements yo3 {
    public final zl3 a;
    public final gg3 b;

    public po3(gg3 gg3Var, zl3 zl3Var) {
        gg3 gg3Var2 = um3.a;
        this.b = gg3Var;
        this.a = zl3Var;
    }

    @Override // defpackage.yo3
    public final void a(Object obj) {
        this.b.getClass();
        jp3 jp3Var = ((in3) obj).zzc;
        if (jp3Var.e) {
            jp3Var.e = false;
        }
        gg3 gg3Var = um3.a;
        throw q40.h(obj);
    }

    @Override // defpackage.yo3
    public final void b(Object obj, ot2 ot2Var) {
        throw q40.h(obj);
    }

    @Override // defpackage.yo3
    public final int c(in3 in3Var) {
        return in3Var.zzc.hashCode();
    }

    @Override // defpackage.yo3
    public final int d(zl3 zl3Var) {
        jp3 jp3Var = ((in3) zl3Var).zzc;
        int i = jp3Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < jp3Var.a; i3++) {
            int i4 = jp3Var.b[i3] >>> 3;
            im3 im3Var = (im3) jp3Var.c[i3];
            int r = lm3.r(8);
            int r2 = lm3.r(i4) + lm3.r(16);
            int r3 = lm3.r(24);
            int c = im3Var.c();
            i2 += r + r + r2 + in1.f(c, c, r3);
        }
        jp3Var.d = i2;
        return i2;
    }

    @Override // defpackage.yo3
    public final void e(Object obj, Object obj2) {
        ap3.b(obj, obj2);
    }

    @Override // defpackage.yo3
    public final boolean f(in3 in3Var, in3 in3Var2) {
        return in3Var.zzc.equals(in3Var2.zzc);
    }

    @Override // defpackage.yo3
    public final boolean g(Object obj) {
        throw q40.h(obj);
    }

    @Override // defpackage.yo3
    public final void h(Object obj, byte[] bArr, int i, int i2, tn0 tn0Var) {
        in3 in3Var = (in3) obj;
        if (in3Var.zzc == jp3.f) {
            in3Var.zzc = jp3.a();
        }
        throw q40.h(obj);
    }

    @Override // defpackage.yo3
    public final in3 zza() {
        zl3 zl3Var = this.a;
        if (zl3Var instanceof in3) {
            return (in3) ((in3) zl3Var).o(4);
        }
        en3 en3Var = (en3) ((in3) zl3Var).o(5);
        boolean e = en3Var.n.e();
        in3 in3Var = en3Var.n;
        if (!e) {
            return in3Var;
        }
        in3Var.g();
        return en3Var.n;
    }
}
