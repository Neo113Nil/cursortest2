package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaur extends zzaux {
    private final zzatq zzi;
    private long zzj;

    public zzaur(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2, zzatq zzatqVar) {
        super(zzatjVar, "nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", zzapgVar, i, 53);
        this.zzi = zzatqVar;
        if (zzatqVar != null) {
            this.zzj = zzatqVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
