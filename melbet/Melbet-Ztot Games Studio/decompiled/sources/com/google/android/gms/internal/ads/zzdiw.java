package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdiw extends zzcru {
    private final Executor zzc;
    private final zzdjb zzd;
    private final zzdjj zze;
    private final zzdkb zzf;
    private final zzdjg zzg;
    private final zzdjm zzh;
    private final zzhew zzi;
    private final zzhew zzj;
    private final zzhew zzk;
    private final zzhew zzl;
    private final zzhew zzm;
    private zzdkx zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private final zzbxw zzr;
    private final zzauo zzs;
    private final VersionInfoParcel zzt;
    private final Context zzu;
    private final zzdiy zzv;
    private final zzemn zzw;
    private final Map zzx;
    private final List zzy;

    static {
        zzfxr.zzr("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdiw(zzcrt zzcrtVar, Executor executor, zzdjb zzdjbVar, zzdjj zzdjjVar, zzdkb zzdkbVar, zzdjg zzdjgVar, zzdjm zzdjmVar, zzhew zzhewVar, zzhew zzhewVar2, zzhew zzhewVar3, zzhew zzhewVar4, zzhew zzhewVar5, zzbxw zzbxwVar, zzauo zzauoVar, VersionInfoParcel versionInfoParcel, Context context, zzdiy zzdiyVar, zzemn zzemnVar, zzaxy zzaxyVar) {
        super(zzcrtVar);
        this.zzc = executor;
        this.zzd = zzdjbVar;
        this.zze = zzdjjVar;
        this.zzf = zzdkbVar;
        this.zzg = zzdjgVar;
        this.zzh = zzdjmVar;
        this.zzi = zzhewVar;
        this.zzj = zzhewVar2;
        this.zzk = zzhewVar3;
        this.zzl = zzhewVar4;
        this.zzm = zzhewVar5;
        this.zzr = zzbxwVar;
        this.zzs = zzauoVar;
        this.zzt = versionInfoParcel;
        this.zzu = context;
        this.zzv = zzdiyVar;
        this.zzw = zzemnVar;
        this.zzx = new HashMap();
        this.zzy = new ArrayList();
    }

    public static boolean zzX(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjJ)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        long zzw = com.google.android.gms.ads.internal.util.zzt.zzw(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzw >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjK)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized ImageView.ScaleType zzZ() {
        zzdkx zzdkxVar = this.zzn;
        if (zzdkxVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj = zzdkxVar.zzj();
        if (zzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj);
        }
        return zzdkb.zza;
    }

    private final void zzaa(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeH)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        ListenableFuture zzw = this.zzd.zzw();
        if (zzw == null) {
            return;
        }
        zzgcj.zzr(zzw, new zzdiu(this, "Google", true), this.zzc);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzf.zzd(this.zzn);
        this.zze.zzq(view, map, map2, zzZ());
        this.zzp = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(View view, zzeeo zzeeoVar) {
        zzcej zzr = this.zzd.zzr();
        if (!this.zzg.zzd() || zzeeoVar == null || zzr == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzj(zzeeoVar.zza(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzz(zzdkx zzdkxVar) {
        Iterator<String> keys;
        View view;
        zzauk zzc;
        if (!this.zzo) {
            this.zzn = zzdkxVar;
            this.zzf.zze(zzdkxVar);
            this.zze.zzy(zzdkxVar.zzf(), zzdkxVar.zzm(), zzdkxVar.zzn(), zzdkxVar, zzdkxVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcq)).booleanValue() && (zzc = this.zzs.zzc()) != null) {
                zzc.zzo(zzdkxVar.zzf());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbA)).booleanValue()) {
                zzfel zzfelVar = this.zzb;
                if (zzfelVar.zzak && (keys = zzfelVar.zzaj.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        WeakReference weakReference = (WeakReference) this.zzn.zzl().get(next);
                        this.zzx.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzaxx zzaxxVar = new zzaxx(this.zzu, view);
                            this.zzy.add(zzaxxVar);
                            zzaxxVar.zzc(new zzdit(this, next));
                        }
                    }
                }
            }
            if (zzdkxVar.zzi() != null) {
                zzdkxVar.zzi().zzc(this.zzr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzA(zzdkx zzdkxVar) {
        this.zze.zzz(zzdkxVar.zzf(), zzdkxVar.zzl());
        if (zzdkxVar.zzh() != null) {
            zzdkxVar.zzh().setClickable(false);
            zzdkxVar.zzh().removeAllViews();
        }
        if (zzdkxVar.zzi() != null) {
            zzdkxVar.zzi().zze(this.zzr);
        }
        this.zzn = null;
    }

    public final synchronized void zzB(View view, Map map, Map map2, boolean z) {
        if (!this.zzp) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbA)).booleanValue() && this.zzb.zzak) {
                Iterator it = this.zzx.keySet().iterator();
                while (it.hasNext()) {
                    if (!((Boolean) this.zzx.get((String) it.next())).booleanValue()) {
                        break;
                    }
                }
            }
            if (z) {
                zzab(view, map, map2);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdy)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view2 != null && zzX(view2)) {
                        zzab(view, map, map2);
                        return;
                    }
                }
            }
        }
    }

    public final synchronized void zzC(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zze.zzj(zzcwVar);
    }

    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z) {
        this.zzf.zzc(this.zzn);
        this.zze.zzk(view, view2, map, map2, z, zzZ());
        if (this.zzq) {
            zzdjb zzdjbVar = this.zzd;
            if (zzdjbVar.zzs() != null) {
                zzdjbVar.zzs().zzd("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    public final synchronized void zzE(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkE)).booleanValue()) {
            zzdkx zzdkxVar = this.zzn;
            if (zzdkxVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdkxVar instanceof zzdjv;
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdiw.this.zzx(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized void zzF(String str) {
        this.zze.zzl(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zze.zzm(bundle);
    }

    public final synchronized void zzH() {
        zzdkx zzdkxVar = this.zzn;
        if (zzdkxVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdkxVar instanceof zzdjv;
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdis
                @Override // java.lang.Runnable
                public final void run() {
                    zzdiw.this.zzy(z);
                }
            });
        }
    }

    public final synchronized void zzI() {
        if (this.zzp) {
            return;
        }
        this.zze.zzr();
    }

    public final void zzJ(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeH)).booleanValue()) {
            zzac(view, this.zzd.zzu());
            return;
        }
        zzbzt zzp = this.zzd.zzp();
        if (zzp == null) {
            return;
        }
        zzgcj.zzr(zzp, new zzdiv(this, view), this.zzc);
    }

    public final synchronized void zzK(View view, MotionEvent motionEvent, View view2) {
        this.zze.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzL(Bundle bundle) {
        this.zze.zzt(bundle);
    }

    public final synchronized void zzM(View view) {
        this.zze.zzu(view);
    }

    public final synchronized void zzN() {
        this.zze.zzv();
    }

    public final synchronized void zzO(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zze.zzw(zzcsVar);
    }

    public final synchronized void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzw.zza(zzdgVar);
    }

    public final synchronized void zzQ(zzbgx zzbgxVar) {
        this.zze.zzx(zzbgxVar);
    }

    public final synchronized void zzR(final zzdkx zzdkxVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzby)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdim
                @Override // java.lang.Runnable
                public final void run() {
                    zzdiw.this.zzz(zzdkxVar);
                }
            });
        } else {
            zzz(zzdkxVar);
        }
    }

    public final synchronized void zzS(final zzdkx zzdkxVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzby)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdin
                @Override // java.lang.Runnable
                public final void run() {
                    zzdiw.this.zzA(zzdkxVar);
                }
            });
        } else {
            zzA(zzdkxVar);
        }
    }

    public final boolean zzT() {
        return this.zzg.zze();
    }

    public final synchronized boolean zzU() {
        return this.zze.zzA();
    }

    public final synchronized boolean zzV() {
        return this.zze.zzB();
    }

    public final boolean zzW() {
        return this.zzg.zzd();
    }

    public final synchronized boolean zzY(Bundle bundle) {
        if (this.zzp) {
            return true;
        }
        boolean zzC = this.zze.zzC(bundle);
        this.zzp = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final synchronized void zzb() {
        this.zzo = true;
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdir
            @Override // java.lang.Runnable
            public final void run() {
                zzdiw.this.zzw();
            }
        });
        super.zzb();
    }

    public final zzdiy zzc() {
        return this.zzv;
    }

    public final zzeeo zzf(String str, boolean z) {
        String str2;
        zzeel zzeelVar;
        zzeek zzeekVar;
        if (!this.zzg.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdjb zzdjbVar = this.zzd;
        zzcej zzr = zzdjbVar.zzr();
        zzcej zzs = zzdjbVar.zzs();
        if (zzr == null && zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z2 = false;
        boolean z3 = zzr != null;
        boolean z4 = zzs != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeF)).booleanValue()) {
            this.zzg.zza();
            int zzc = this.zzg.zza().zzc();
            int i = zzc - 1;
            if (i != 0) {
                if (i != 1) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unknown omid media type: " + (zzc != 1 ? zzc != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return null;
                }
                if (zzr == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = true;
                z4 = false;
            } else {
                if (zzs == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzr = zzs;
        }
        zzr.zzG();
        if (!com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zzu)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        VersionInfoParcel versionInfoParcel = this.zzt;
        String str3 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
        if (z4) {
            zzeekVar = zzeek.VIDEO;
            zzeelVar = zzeel.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdjb zzdjbVar2 = this.zzd;
            zzeek zzeekVar2 = zzeek.NATIVE_DISPLAY;
            zzeelVar = zzdjbVar2.zzc() == 3 ? zzeel.UNSPECIFIED : zzeel.ONE_PIXEL;
            zzeekVar = zzeekVar2;
        }
        zzeeo zzb = com.google.android.gms.ads.internal.zzu.zzA().zzb(str3, zzr.zzG(), "", "javascript", str2, str, zzeelVar, zzeekVar, this.zzb.zzal);
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zzd.zzW(zzb);
        zzr.zzat(zzb);
        if (z4) {
            com.google.android.gms.ads.internal.zzu.zzA().zzj(zzb.zza(), zzs.zzF());
            this.zzq = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzu.zzA().zzk(zzb.zza());
            zzr.zzd("onSdkLoaded", new ArrayMap());
        }
        return zzb;
    }

    public final String zzg() {
        return this.zzg.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zze.zze(view, map, map2, zzZ());
    }

    public final synchronized JSONObject zzj(View view, Map map, Map map2) {
        return this.zze.zzf(view, map, map2, zzZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final void zzk() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdio
            @Override // java.lang.Runnable
            public final void run() {
                zzdiw.zzl(zzdiw.this);
            }
        });
        if (this.zzd.zzc() != 7) {
            Executor executor = this.zzc;
            final zzdjj zzdjjVar = this.zze;
            Objects.requireNonNull(zzdjjVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdip
                @Override // java.lang.Runnable
                public final void run() {
                    zzdjj.this.zzp();
                }
            });
        }
        super.zzk();
    }

    public final void zzu(View view) {
        zzeeo zzu = this.zzd.zzu();
        if (!this.zzg.zzd() || zzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzg(zzu.zza(), view);
    }

    public final synchronized void zzv() {
        this.zze.zzh();
    }

    final /* synthetic */ void zzw() {
        this.zze.zzi();
        this.zzd.zzI();
    }

    final /* synthetic */ void zzx(View view, boolean z, int i) {
        this.zze.zzo(view, this.zzn.zzf(), this.zzn.zzl(), this.zzn.zzm(), z, zzZ(), i);
    }

    final /* synthetic */ void zzy(boolean z) {
        this.zze.zzo(null, this.zzn.zzf(), this.zzn.zzl(), this.zzn.zzm(), z, zzZ(), 0);
    }

    public static /* synthetic */ void zzl(zzdiw zzdiwVar) {
        try {
            zzdjb zzdjbVar = zzdiwVar.zzd;
            int zzc = zzdjbVar.zzc();
            if (zzc == 1) {
                if (zzdiwVar.zzh.zzb() != null) {
                    zzdiwVar.zzaa("Google", true);
                    zzdiwVar.zzh.zzb().zze((zzbfu) zzdiwVar.zzi.zzb());
                    return;
                }
                return;
            }
            if (zzc == 2) {
                if (zzdiwVar.zzh.zza() != null) {
                    zzdiwVar.zzaa("Google", true);
                    zzdiwVar.zzh.zza().zze((zzbfs) zzdiwVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzc == 3) {
                if (zzdiwVar.zzh.zzd(zzdjbVar.zzA()) != null) {
                    if (zzdiwVar.zzd.zzs() != null) {
                        zzdiwVar.zzf("Google", true);
                    }
                    zzdiwVar.zzh.zzd(zzdiwVar.zzd.zzA()).zze((zzbfx) zzdiwVar.zzm.zzb());
                    return;
                }
                return;
            }
            if (zzc == 6) {
                if (zzdiwVar.zzh.zzf() != null) {
                    zzdiwVar.zzaa("Google", true);
                    zzdiwVar.zzh.zzf().zze((zzbha) zzdiwVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzc != 7) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrong native template id!");
                return;
            }
            zzdjm zzdjmVar = zzdiwVar.zzh;
            if (zzdjmVar.zzg() != null) {
                zzdjmVar.zzg().zzg((zzblk) zzdiwVar.zzl.zzb());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}
