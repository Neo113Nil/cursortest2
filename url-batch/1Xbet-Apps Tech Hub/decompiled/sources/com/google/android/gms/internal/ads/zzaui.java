package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaui extends zzaux {
    private final zzasm zzi;
    private final long zzj;
    private final long zzk;

    public zzaui(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2, zzasm zzasmVar, long j, long j2) {
        super(zzatjVar, "KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", zzapgVar, i, 11);
        this.zzi = zzasmVar;
        this.zzj = j;
        this.zzk = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzasm zzasmVar = this.zzi;
        if (zzasmVar != null) {
            zzask zzaskVar = new zzask((String) this.zzf.invoke(null, zzasmVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzz(zzaskVar.zza.longValue());
                if (zzaskVar.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzaskVar.zzb.longValue());
                }
                if (zzaskVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzaskVar.zzc.longValue());
                }
            }
        }
    }
}
