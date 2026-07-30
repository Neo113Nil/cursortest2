package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdqh implements zzdbz {
    private final zzdoh zza;
    private final zzdom zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdqh(zzdoh zzdohVar, zzdom zzdomVar, Executor executor, Executor executor2) {
        this.zza = zzdohVar;
        this.zzb = zzdomVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzcjl zzcjlVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcjl.this.zze("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        if (this.zzb.zzd()) {
            zzdoh zzdohVar = this.zza;
            zzekb zzZ = zzdohVar.zzZ();
            if (zzZ == null && zzdohVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue()) {
                ListenableFuture zzX = zzdohVar.zzX();
                zzcen zzY = zzdohVar.zzY();
                if (zzX == null || zzY == null) {
                    return;
                }
                zzgzo.zzr(zzgzo.zzq(zzX, zzY), new zzdqf(this), this.zzd);
                return;
            }
            if (zzZ != null) {
                zzcjl zzW = zzdohVar.zzW();
                zzcjl zzT = zzdohVar.zzT();
                if (zzW == null) {
                    zzW = zzT == null ? null : zzT;
                }
                if (zzW != null) {
                    zza(zzW);
                }
            }
        }
    }
}
