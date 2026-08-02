package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzcky extends com.google.android.gms.ads.internal.client.zzcn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdqb zzc;
    private final zzeev zzd;
    private final zzelg zze;
    private final zzdun zzf;
    private final zzbya zzg;
    private final zzdqg zzh;
    private final zzdvi zzi;
    private final zzbel zzj;
    private final zzfki zzk;
    private final zzfgc zzl;
    private final zzcui zzm;
    private final zzdsk zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());

    zzcky(Context context, VersionInfoParcel versionInfoParcel, zzdqb zzdqbVar, zzeev zzeevVar, zzelg zzelgVar, zzdun zzdunVar, zzbya zzbyaVar, zzdqg zzdqgVar, zzdvi zzdviVar, zzbel zzbelVar, zzfki zzfkiVar, zzfgc zzfgcVar, zzcui zzcuiVar, zzdsk zzdskVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdqbVar;
        this.zzd = zzeevVar;
        this.zze = zzelgVar;
        this.zzf = zzdunVar;
        this.zzg = zzbyaVar;
        this.zzh = zzdqgVar;
        this.zzi = zzdviVar;
        this.zzj = zzbelVar;
        this.zzk = zzfkiVar;
        this.zzl = zzfgcVar;
        this.zzm = zzcuiVar;
        this.zzn = zzdskVar;
    }

    final void zzb() {
        if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzR()) {
            String zzl = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzl();
            if (com.google.android.gms.ads.internal.zzu.zzs().zzj(this.zza, zzl, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzC(false);
            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzB("");
        }
    }

    final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap hashMap = new HashMap();
            Iterator it = zze.values().iterator();
            while (it.hasNext()) {
                for (zzbof zzbofVar : ((zzbog) it.next()).zza) {
                    String str = zzbofVar.zzb;
                    for (String str2 : zzbofVar.zza) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzeew zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzfge zzfgeVar = (zzfge) zza.zzb;
                        if (!zzfgeVar.zzC() && zzfgeVar.zzB()) {
                            zzfgeVar.zzj(this.zza, (zzegq) zza.zzc, (List) entry.getValue());
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzffn e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    final /* synthetic */ void zzd() {
        zzfgl.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzu.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.zzo) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbbw.zza(this.zza);
        com.google.android.gms.ads.internal.zzu.zzo().zzu(this.zza, this.zzb);
        this.zzm.zzd();
        com.google.android.gms.ads.internal.zzu.zzc().zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdE)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzip)).booleanValue()) {
            zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckt
                @Override // java.lang.Runnable
                public final void run() {
                    zzcky.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjY)).booleanValue()) {
            zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckv
                @Override // java.lang.Runnable
                public final void run() {
                    zzcky.this.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcA)).booleanValue()) {
            zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcku
                @Override // java.lang.Runnable
                public final void run() {
                    zzcky.this.zzd();
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    @Override // com.google.android.gms.ads.internal.client.zzco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzl(String str, IObjectWrapper iObjectWrapper) {
        String zzp;
        String str2;
        Runnable runnable;
        zzbbw.zza(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdI)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzu.zzp();
                zzp = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "NonagonMobileAdsSettingManager_AppId");
            }
            boolean z = true;
            str2 = true != TextUtils.isEmpty(zzp) ? str : zzp;
            if (TextUtils.isEmpty(str2)) {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdC)).booleanValue() | ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaH)).booleanValue();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaH)).booleanValue()) {
                    final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
                    runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzckw
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzgcu zzgcuVar = zzbzo.zze;
                            final zzcky zzckyVar = zzcky.this;
                            final Runnable runnable3 = runnable2;
                            zzgcuVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzcky.this.zzc(runnable3);
                                }
                            });
                        }
                    };
                } else {
                    runnable = null;
                    z = booleanValue;
                }
                Runnable runnable3 = runnable;
                if (z) {
                    com.google.android.gms.ads.internal.zzu.zza().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzp);
                    return;
                }
                return;
            }
            return;
        }
        zzp = "";
        boolean z2 = true;
        if (true != TextUtils.isEmpty(zzp)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(com.google.android.gms.ads.internal.client.zzda zzdaVar) throws RemoteException {
        this.zzi.zzh(zzdaVar, zzdvh.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.zzb.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbom zzbomVar) throws RemoteException {
        this.zzl.zzf(zzbomVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z) {
        com.google.android.gms.ads.internal.zzu.zzr().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f) {
        com.google.android.gms.ads.internal.zzu.zzr().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        zzbbw.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zza().zza(this.zza, this.zzb, str, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzblc zzblcVar) throws RemoteException {
        this.zzf.zzs(zzblcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziA)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(com.google.android.gms.ads.internal.client.zzff zzffVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzu.zzr().zze();
    }

    final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbtv());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) throws RemoteException {
        try {
            zzfsc.zzi(this.zza).zzn(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }
}
