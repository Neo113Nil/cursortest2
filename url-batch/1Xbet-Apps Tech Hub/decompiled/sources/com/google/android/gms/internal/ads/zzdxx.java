package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdxx implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzdxx(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfiu zzfiuVar = (zzfiu) this.zza.zzb();
        final CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb((Context) this.zzb.zzb());
        zzfil zzi = zzfie.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaM));
            }
        }, zzfio.WEBVIEW_COOKIE, zzfiuVar).zzi(1L, TimeUnit.SECONDS);
        final zzdxv zzdxvVar = new zzfhx() { // from class: com.google.android.gms.internal.ads.zzdxv
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzfif
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzgbb.zzh("");
            }
        }).zza();
    }
}
