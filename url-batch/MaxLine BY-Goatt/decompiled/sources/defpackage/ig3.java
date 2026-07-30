package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ig3 extends in3 {
    private static final ig3 zzl;
    private int zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private rn3 zzf = vo3.q;
    private boolean zzg;
    private ng3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        ig3 ig3Var = new ig3();
        zzl = ig3Var;
        in3.m(ig3.class, ig3Var);
    }

    public static hg3 B() {
        return (hg3) zzl.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void D(int i, kg3 kg3Var) {
        rn3 rn3Var = this.zzf;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zzf = rn3Var.h(size + size);
        }
        this.zzf.set(i, kg3Var);
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", kg3.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new ig3();
        }
        if (i2 == 4) {
            return new hg3(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final kg3 u(int i) {
        return (kg3) this.zzf.get(i);
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final ng3 w() {
        ng3 ng3Var = this.zzh;
        return ng3Var == null ? ng3.y() : ng3Var;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return (this.zzb & 64) != 0;
    }
}
