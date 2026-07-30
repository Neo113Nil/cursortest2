package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cj3 extends in3 {
    private static final cj3 zzj;
    private int zzb;
    private rn3 zzd = vo3.q;
    private String zze = BuildConfig.FLAVOR;
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        cj3 cj3Var = new cj3();
        zzj = cj3Var;
        in3.m(cj3.class, cj3Var);
    }

    public static bj3 z() {
        return (bj3) zzj.h();
    }

    public final /* synthetic */ void A(int i, hj3 hj3Var) {
        J();
        this.zzd.set(i, hj3Var);
    }

    public final /* synthetic */ void B(hj3 hj3Var) {
        hj3Var.getClass();
        J();
        this.zzd.add(hj3Var);
    }

    public final /* synthetic */ void C(Iterable iterable) {
        J();
        zl3.c(iterable, this.zzd);
    }

    public final void D() {
        this.zzd = vo3.q;
    }

    public final /* synthetic */ void E(int i) {
        J();
        this.zzd.remove(i);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final void J() {
        rn3 rn3Var = this.zzd;
        if (((bm3) rn3Var).m) {
            return;
        }
        int size = rn3Var.size();
        this.zzd = rn3Var.h(size + size);
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", hj3.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new cj3();
        }
        if (i2 == 4) {
            return new bj3(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final hj3 r(int i) {
        return (hj3) this.zzd.get(i);
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final int y() {
        return this.zzh;
    }
}
