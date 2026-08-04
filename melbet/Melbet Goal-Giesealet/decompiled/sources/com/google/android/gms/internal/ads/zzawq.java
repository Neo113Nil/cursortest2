package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzawq implements Callable {
    private final zzavx zza;
    private final zzarw zzb;

    public zzawq(zzavx zzavxVar, zzarw zzarwVar) {
        this.zza = zzavxVar;
        this.zzb = zzarwVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzavx zzavxVar = this.zza;
        if (zzavxVar.zzm() != null) {
            zzavxVar.zzm().get();
        }
        zzast zzl = zzavxVar.zzl();
        if (zzl == null) {
            return null;
        }
        try {
            zzarw zzarwVar = this.zzb;
            synchronized (zzarwVar) {
                zzarwVar.zzaY(zzl.zzaN(), zzhhr.zza());
            }
            return null;
        } catch (zzhiw | NullPointerException unused) {
            return null;
        }
    }
}
