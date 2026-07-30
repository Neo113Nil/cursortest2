package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oj3 extends in3 {
    private static final oj3 zzh;
    private int zzb;
    private rn3 zzd = vo3.q;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;

    static {
        oj3 oj3Var = new oj3();
        zzh = oj3Var;
        in3.m(oj3.class, oj3Var);
    }

    public static mj3 w() {
        return (mj3) zzh.h();
    }

    public static mj3 x(oj3 oj3Var) {
        en3 h = zzh.h();
        h.e(oj3Var);
        return (mj3) h;
    }

    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        zl3.c(arrayList, this.zzd);
    }

    public final void B() {
        this.zzd = vo3.q;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void E() {
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
            return new wo3(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", sj3.class, "zze", "zzf", "zzg", mg3.j});
        }
        if (i2 == 3) {
            return new oj3();
        }
        if (i2 == 4) {
            return new mj3(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final sj3 r(int i) {
        return (sj3) this.zzd.get(i);
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i, sj3 sj3Var) {
        E();
        this.zzd.set(i, sj3Var);
    }

    public final /* synthetic */ void z(sj3 sj3Var) {
        E();
        this.zzd.add(sj3Var);
    }
}
