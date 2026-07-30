package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdoc extends zzcwf {
    public static final zzguf zzc = zzguf.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdoh zze;
    private final zzdop zzf;
    private final zzdpg zzg;
    private final zzdom zzh;
    private final zzdor zzi;
    private final zzika zzj;
    private final zzika zzk;
    private final zzika zzl;
    private final zzika zzm;
    private final zzika zzn;
    private zzdqe zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzccn zzt;
    private final zzazh zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdoe zzx;
    private final zzers zzy;
    private final Map zzz;

    public zzdoc(zzcwe zzcweVar, Executor executor, zzdoh zzdohVar, zzdop zzdopVar, zzdpg zzdpgVar, zzdom zzdomVar, zzdor zzdorVar, zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, zzika zzikaVar4, zzika zzikaVar5, zzccn zzccnVar, zzazh zzazhVar, VersionInfoParcel versionInfoParcel, Context context, zzdoe zzdoeVar, zzers zzersVar, zzbdh zzbdhVar) {
        super(zzcweVar);
        this.zzd = executor;
        this.zze = zzdohVar;
        this.zzf = zzdopVar;
        this.zzg = zzdpgVar;
        this.zzh = zzdomVar;
        this.zzi = zzdorVar;
        this.zzj = zzikaVar;
        this.zzk = zzikaVar2;
        this.zzl = zzikaVar3;
        this.zzm = zzikaVar4;
        this.zzn = zzikaVar5;
        this.zzt = zzccnVar;
        this.zzu = zzazhVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdoeVar;
        this.zzy = zzersVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmb)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long zzA = com.google.android.gms.ads.internal.util.zzs.zzA(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (zzA >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmc)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdqe zzdqeVar) {
        Iterator<String> keys;
        View view;
        zzazc zzb;
        if (!this.zzp) {
            this.zzo = zzdqeVar;
            this.zzg.zza(zzdqeVar);
            this.zzf.zza(zzdqeVar.zzdE(), zzdqeVar.zzk(), zzdqeVar.zzl(), zzdqeVar, zzdqeVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdq)).booleanValue() && (zzb = this.zzu.zzb()) != null) {
                zzb.zzh(zzdqeVar.zzdE());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcq)).booleanValue()) {
                zzfir zzfirVar = this.zzb;
                if (zzfirVar.zzak && (keys = zzfirVar.zzaj.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        zzdqe zzdqeVar2 = this.zzo;
                        WeakReference weakReference = zzdqeVar2 == null ? null : (WeakReference) zzdqeVar2.zzj().get(next);
                        this.zzz.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzbdg zzbdgVar = new zzbdg(this.zzw, view);
                            this.zzA.add(zzbdgVar);
                            zzbdgVar.zza(new zzdnr(this, next));
                        }
                    }
                }
            }
            if (zzdqeVar.zzh() != null) {
                zzdqeVar.zzh().zza(this.zzt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdqe zzdqeVar) {
        this.zzf.zzb(zzdqeVar.zzdE(), zzdqeVar.zzj());
        if (zzdqeVar.zzdA() != null) {
            zzdqeVar.zzdA().setClickable(false);
            zzdqeVar.zzdA().removeAllViews();
        }
        if (zzdqeVar.zzh() != null) {
            zzdqeVar.zzh().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View zzag;
        if (!this.zzr && (zzag = zzag(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpc)).booleanValue()) {
                Rect rect = new Rect();
                if (zzag.getGlobalVisibleRect(rect, new Point()) && zzag.getHeight() == rect.height() && zzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpd)).booleanValue()) {
                zzbgv zzbgvVar = zzbhe.zzpe;
                if (((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).floatValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    double floatValue = ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).floatValue();
                    if (zzag.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r1.height() * r1.width() >= zzag.getHeight() * zzag.getWidth() * (floatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(zzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzguf zzgufVar = zzc;
            int size = zzgufVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgufVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzah() {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzo = zzdqeVar.zzo();
        if (zzo != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzo);
        }
        return zzdpg.zza;
    }

    private final void zzai(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        ListenableFuture zzX = this.zze.zzX();
        if (zzX == null) {
            return;
        }
        zzgzo.zzr(zzX, new zzdns(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, zzekb zzekbVar) {
        zzcjl zzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzekbVar == null || zzW == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzekbVar.zza(), view);
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        this.zzf.zzr(zzdjVar);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzf.zzs(zzdfVar);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdqeVar instanceof zzdpa;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdoc.this.zzW(z);
                }
            });
        }
    }

    public final synchronized void zzE(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmX)).booleanValue()) {
            zzdqe zzdqeVar = this.zzo;
            if (zzdqeVar == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdqeVar instanceof zzdpa;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdny
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdoc.this.zzX(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    public final zzekb zzL(String str, boolean z) {
        boolean z2;
        String str2;
        zzejx zzejxVar;
        zzejy zzejyVar;
        zzdom zzdomVar = this.zzh;
        if (zzdomVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdoh zzdohVar = this.zze;
            zzcjl zzW = zzdohVar.zzW();
            zzcjl zzT = zzdohVar.zzT();
            if (zzW == null && zzT == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdomVar.zzg();
            int zzc2 = zzdomVar.zzg().zzc();
            int i2 = zzc2 - 1;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    String str3 = zzc2 != 1 ? zzc2 != 2 ? "UNKNOWN" : "DISPLAY" : ShareConstants.VIDEO_URL;
                    StringBuilder sb = new StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    String sb2 = sb.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                    return null;
                }
                if (zzW == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = false;
                z3 = true;
            } else if (zzT != null) {
                z2 = true;
            } else {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzW = zzT;
            }
            if (zzW == null) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzw)) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzv;
            int i8 = versionInfoParcel.buddyApkVersion;
            int i9 = versionInfoParcel.clientJarVersion;
            StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 1 + String.valueOf(i9).length());
            sb3.append(i8);
            sb3.append(".");
            sb3.append(i9);
            String sb4 = sb3.toString();
            if (z2) {
                zzejxVar = zzejx.VIDEO;
                zzejyVar = zzejy.DEFINED_BY_JAVASCRIPT;
            } else {
                zzejxVar = zzejx.NATIVE_DISPLAY;
                zzejyVar = zzdohVar.zzx() == 3 ? zzejy.UNSPECIFIED : zzejy.ONE_PIXEL;
            }
            zzekb zzd = com.google.android.gms.ads.internal.zzt.zzu().zzd(sb4, zzW.zzD(), "", "javascript", str2, str, zzejyVar, zzejxVar, this.zzb.zzal);
            if (zzd == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdohVar.zzq(zzd);
            zzW.zzak(zzd);
            if (z2) {
                zzfsj zza = zzd.zza();
                if (zzT != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza, zzT.zzE());
                }
                this.zzs = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzd.zza());
                zzW.zze("onSdkLoaded", new ArrayMap());
            }
            return zzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue()) {
            zzdoh zzdohVar = this.zze;
            if (zzdohVar.zzx() != 3) {
                zzcen zzY = zzdohVar.zzY();
                if (zzY == null) {
                    return;
                }
                zzgzo.zzr(zzY, new zzdnt(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzekb zzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzZ == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzZ.zza(), view);
    }

    public final zzdoe zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzy.zza(zzdtVar);
    }

    public final void zzR(Bundle bundle) {
        final zzcjl zzT = this.zze.zzT();
        if (zzT == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzguf zzgufVar = zzdoc.zzc;
                    zzcjl.this.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error reading event signals", e);
        }
    }

    final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    final /* synthetic */ void zzW(boolean z) {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar != null) {
            this.zzf.zzf(null, zzdqeVar.zzdE(), this.zzo.zzj(), this.zzo.zzk(), z, zzah(), 0);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    final /* synthetic */ void zzX(View view, boolean z, int i) {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar != null) {
            this.zzf.zzf(view, zzdqeVar.zzdE(), this.zzo.zzj(), this.zzo.zzk(), z, zzah(), i);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    final /* synthetic */ zzdoh zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    final /* synthetic */ zzdqe zzaa() {
        return this.zzo;
    }

    final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcwf
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdoc.this.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzz = this.zzf.zzz(bundle);
        this.zzq = zzz;
        return zzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdqe zzdqeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzco)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdoc.this.zzU(zzdqeVar);
                }
            });
        } else {
            zzU(zzdqeVar);
        }
    }

    public final synchronized void zzh(final zzdqe zzdqeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzco)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdoc.this.zzV(zzdqeVar);
                }
            });
        } else {
            zzV(zzdqeVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z) {
        zzcjl zzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z, zzah());
        if (this.zzs) {
            zzdoh zzdohVar = this.zze;
            if (zzdohVar.zzT() != null && (zzT = zzdohVar.zzT()) != null) {
                zzT.zze("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwf
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdoc.this.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdop zzdopVar = this.zzf;
            Objects.requireNonNull(zzdopVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdob
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdop.this.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    public final synchronized void zzu(View view, Map map, Map map2, boolean z) {
        if (this.zzq) {
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcq)).booleanValue() && this.zzb.zzak) {
            Map map3 = this.zzz;
            Iterator it = map3.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) map3.get((String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (z) {
            zzae(view, map, map2);
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeL)).booleanValue() && map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view2 != null && zzI(view2)) {
                    zzae(view, map, map2);
                    return;
                }
            }
        }
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzbmj zzbmjVar) {
        this.zzf.zzp(zzbmjVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }

    final /* synthetic */ void zzS() {
        try {
            zzdoh zzdohVar = this.zze;
            int zzx = zzdohVar.zzx();
            if (zzx == 1) {
                zzblt zza = this.zzi.zza();
                if (zza != null) {
                    zzai("Google", true);
                    zza.zze((zzblj) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzx == 2) {
                zzblq zzb = this.zzi.zzb();
                if (zzb != null) {
                    zzai("Google", true);
                    zzb.zze((zzblh) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzx == 3) {
                zzblz zzf = this.zzi.zzf(zzdohVar.zzS());
                if (zzf != null) {
                    if (zzdohVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzf.zze((zzblm) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (zzx == 6) {
                zzbmg zzc2 = this.zzi.zzc();
                if (zzc2 != null) {
                    zzai("Google", true);
                    zzc2.zze((zzbmm) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (zzx != 7) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrong native template id!");
            } else {
                zzbrb zze = this.zzi.zze();
                if (zze != null) {
                    zze.zze((zzbqv) this.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
