package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgrz extends zzgwm implements zzgxx {
    private static final zzgrz zzb;
    private int zzd;
    private zzgwv zze = zzaN();

    static {
        zzgrz zzgrzVar = new zzgrz();
        zzb = zzgrzVar;
        zzgwm.zzaU(zzgrz.class, zzgrzVar);
    }

    private zzgrz() {
    }

    public static zzgrw zzd() {
        return (zzgrw) zzb.zzaA();
    }

    public static zzgrz zzg(InputStream inputStream, zzgvy zzgvyVar) throws IOException {
        return (zzgrz) zzgwm.zzaH(zzb, inputStream, zzgvyVar);
    }

    static /* synthetic */ void zzj(zzgrz zzgrzVar, zzgry zzgryVar) {
        zzgryVar.getClass();
        zzgwv zzgwvVar = zzgrzVar.zze;
        if (!zzgwvVar.zzc()) {
            zzgrzVar.zze = zzgwm.zzaO(zzgwvVar);
        }
        zzgrzVar.zze.add(zzgryVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgry.class});
        }
        if (i2 == 3) {
            return new zzgrz();
        }
        zzgrv zzgrvVar = null;
        if (i2 == 4) {
            return new zzgrw(zzgrvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzgry zze(int i) {
        return (zzgry) this.zze.get(i);
    }

    public final List zzh() {
        return this.zze;
    }
}
