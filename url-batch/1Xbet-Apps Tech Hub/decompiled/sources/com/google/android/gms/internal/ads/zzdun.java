package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdun implements AppEventListener, zzdbc, com.google.android.gms.ads.internal.client.zza, zzcyh, zzczb, zzczc, zzczv, zzcyk, zzfiv {
    private final List zza;
    private final zzdub zzb;
    private long zzc;

    public zzdun(zzdub zzdubVar, zzciq zzciqVar) {
        this.zzb = zzdubVar;
        this.zza = Collections.singletonList(zzciqVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(cls.getSimpleName())), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zza() {
        zzg(zzcyh.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzb() {
        zzg(zzcyh.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final void zzbG(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzcyk.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbH(zzfio zzfioVar, String str) {
        zzg(zzfin.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbI(zzfio zzfioVar, String str, Throwable th) {
        zzg(zzfin.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbJ(zzfio zzfioVar, String str) {
        zzg(zzfin.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzbo(Context context) {
        zzg(zzczc.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzbq(Context context) {
        zzg(zzczc.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzbr(Context context) {
        zzg(zzczc.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbs(zzbwa zzbwaVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        zzg(zzdbc.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbt(zzfeh zzfehVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    @ParametersAreNonnullByDefault
    public final void zzbx(zzbwq zzbwqVar, String str, String str2) {
        zzg(zzcyh.class, "onRewarded", zzbwqVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzc() {
        zzg(zzcyh.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzd(zzfio zzfioVar, String str) {
        zzg(zzfin.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zze() {
        zzg(zzcyh.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzf() {
        zzg(zzcyh.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzq() {
        zzg(zzczb.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzr() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
        zzg(zzczv.class, "onAdLoaded", new Object[0]);
    }
}
