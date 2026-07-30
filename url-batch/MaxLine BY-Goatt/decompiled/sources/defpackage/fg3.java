package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fg3 extends in3 {
    private static final fg3 zzi;
    private int zzb;
    private int zzd;
    private rn3 zze;
    private rn3 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        fg3 fg3Var = new fg3();
        zzi = fg3Var;
        in3.m(fg3.class, fg3Var);
    }

    public fg3() {
        vo3 vo3Var = vo3.q;
        this.zze = vo3Var;
        this.zzf = vo3Var;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", pg3.class, "zzf", ig3.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new fg3();
        }
        if (i2 == 4) {
            return new eg3(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final pg3 t(int i) {
        return (pg3) this.zze.get(i);
    }

    public final rn3 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final ig3 w(int i) {
        return (ig3) this.zzf.get(i);
    }

    public final void x(int i, pg3 pg3Var) {
        rn3 rn3Var = this.zze;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zze = rn3Var.h(size + size);
        }
        this.zze.set(i, pg3Var);
    }

    public final void y(int i, ig3 ig3Var) {
        rn3 rn3Var = this.zzf;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zzf = rn3Var.h(size + size);
        }
        this.zzf.set(i, ig3Var);
    }
}
