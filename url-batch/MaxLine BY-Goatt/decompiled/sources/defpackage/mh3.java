package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mh3 extends in3 {
    private static final mh3 zzu;
    private int zzb;
    private long zzd;
    private String zze = BuildConfig.FLAVOR;
    private int zzf;
    private rn3 zzg;
    private rn3 zzh;
    private rn3 zzi;
    private String zzj;
    private boolean zzk;
    private rn3 zzl;
    private rn3 zzm;
    private String zzn;
    private String zzo;
    private dh3 zzp;
    private qh3 zzq;
    private wh3 zzr;
    private sh3 zzs;
    private oh3 zzt;

    static {
        mh3 mh3Var = new mh3();
        zzu = mh3Var;
        in3.m(mh3.class, mh3Var);
    }

    public mh3() {
        vo3 vo3Var = vo3.q;
        this.zzg = vo3Var;
        this.zzh = vo3Var;
        this.zzi = vo3Var;
        this.zzj = BuildConfig.FLAVOR;
        this.zzl = vo3Var;
        this.zzm = vo3Var;
        this.zzn = BuildConfig.FLAVOR;
        this.zzo = BuildConfig.FLAVOR;
    }

    public static kh3 F() {
        return (kh3) zzu.h();
    }

    public static mh3 G() {
        return zzu;
    }

    public final String A() {
        return this.zzn;
    }

    public final boolean B() {
        return (this.zzb & 128) != 0;
    }

    public final dh3 C() {
        dh3 dh3Var = this.zzp;
        return dh3Var == null ? dh3.v() : dh3Var;
    }

    public final boolean D() {
        return (this.zzb & 512) != 0;
    }

    public final wh3 E() {
        wh3 wh3Var = this.zzr;
        return wh3Var == null ? wh3.r() : wh3Var;
    }

    public final void H(int i, ih3 ih3Var) {
        rn3 rn3Var = this.zzh;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zzh = rn3Var.h(size + size);
        }
        this.zzh.set(i, ih3Var);
    }

    public final void I() {
        this.zzi = vo3.q;
    }

    public final void J() {
        this.zzl = vo3.q;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", uh3.class, "zzh", ih3.class, "zzi", fg3.class, "zzj", "zzk", "zzl", lk3.class, "zzm", fh3.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new mh3();
        }
        if (i2 == 4) {
            return new kh3(zzu);
        }
        if (i2 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final long q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final String s() {
        return this.zze;
    }

    public final rn3 t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final ih3 v(int i) {
        return (ih3) this.zzh.get(i);
    }

    public final rn3 w() {
        return this.zzi;
    }

    public final rn3 x() {
        return this.zzl;
    }

    public final int y() {
        return this.zzl.size();
    }

    public final List z() {
        return this.zzm;
    }
}
