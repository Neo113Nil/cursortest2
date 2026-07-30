package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hj3 extends in3 {
    private static final hj3 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private rn3 zzi = vo3.q;

    static {
        hj3 hj3Var = new hj3();
        zzj = hj3Var;
        in3.m(hj3.class, hj3Var);
    }

    public static fj3 B() {
        return (fj3) zzj.h();
    }

    public final int A() {
        return this.zzi.size();
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void E() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void H(double d) {
        this.zzb |= 16;
        this.zzh = d;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final void J(hj3 hj3Var) {
        rn3 rn3Var = this.zzi;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zzi = rn3Var.h(size + size);
        }
        this.zzi.add(hj3Var);
    }

    public final void K(ArrayList arrayList) {
        rn3 rn3Var = this.zzi;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zzi = rn3Var.h(size + size);
        }
        zl3.c(arrayList, this.zzi);
    }

    public final void L() {
        this.zzi = vo3.q;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", hj3.class});
        }
        if (i2 == 3) {
            return new hj3();
        }
        if (i2 == 4) {
            return new fj3(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final String q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final float w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 16) != 0;
    }

    public final double y() {
        return this.zzh;
    }

    public final List z() {
        return this.zzi;
    }
}
