package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdwn implements zzdxl, zzdvy {
    private final zzdwv zza;
    private final zzdxm zzb;
    private final zzdvz zzc;
    private final zzdwi zzd;
    private final zzdvx zze;
    private final zzdxh zzf;
    private final String zzg;

    @Nullable
    private final String zzh;
    private JSONObject zzm;
    private boolean zzp;
    private int zzq;
    private boolean zzr;
    private final Map zzi = new HashMap();
    private final Map zzj = new HashMap();
    private final Map zzk = new HashMap();
    private String zzl = "{}";
    private long zzn = Long.MAX_VALUE;
    private zzdwj zzo = zzdwj.NONE;
    private zzdwm zzs = zzdwm.UNKNOWN;
    private long zzt = 0;

    zzdwn(zzdwv zzdwvVar, zzdxm zzdxmVar, zzdvz zzdvzVar, Context context, zzcbt zzcbtVar, zzdwi zzdwiVar, zzdxh zzdxhVar, @Nullable String str) {
        this.zza = zzdwvVar;
        this.zzb = zzdxmVar;
        this.zzc = zzdvzVar;
        this.zze = new zzdvx(context);
        this.zzg = zzcbtVar.zza;
        this.zzh = str;
        this.zzd = zzdwiVar;
        this.zzf = zzdxhVar;
        com.google.android.gms.ads.internal.zzt.zzs().zzg(this);
    }

    private final synchronized JSONObject zzs() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzi.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdwb zzdwbVar : (List) entry.getValue()) {
                if (zzdwbVar.zzg()) {
                    jSONArray.put(zzdwbVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzt() {
        this.zzr = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzc(this);
        this.zzc.zzc(this);
        this.zzf.zzf(this);
        zzz(com.google.android.gms.ads.internal.zzt.zzo().zzi().zzo());
    }

    private final void zzu() {
        com.google.android.gms.ads.internal.zzt.zzo().zzi().zzG(zzd());
    }

    private final synchronized void zzv(zzdwj zzdwjVar, boolean z) {
        if (this.zzo != zzdwjVar) {
            if (zzp()) {
                zzx();
            }
            this.zzo = zzdwjVar;
            if (zzp()) {
                zzy();
            }
            if (z) {
                zzu();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:15:0x0026, B:17:0x0035, B:21:0x002a, B:23:0x0030), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void zzw(boolean z, boolean z2) {
        if (this.zzp != z) {
            this.zzp = z;
            if (z) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziY)).booleanValue() || !com.google.android.gms.ads.internal.zzt.zzs().zzl()) {
                    zzy();
                    if (z2) {
                        zzu();
                        return;
                    }
                }
            }
            if (!zzp()) {
                zzx();
            }
            if (z2) {
            }
        }
    }

    private final synchronized void zzx() {
        zzdwj zzdwjVar = zzdwj.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal == 1) {
            this.zzb.zza();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zza();
        }
    }

    private final synchronized void zzy() {
        zzdwj zzdwjVar = zzdwj.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzz(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzw(jSONObject.optBoolean("isTestMode", false), false);
            zzv((zzdwj) Enum.valueOf(zzdwj.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzl = jSONObject.optString("networkExtras", "{}");
            this.zzn = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final zzdwj zza() {
        return this.zzo;
    }

    public final synchronized ListenableFuture zzb(String str) {
        zzccf zzccfVar;
        zzccfVar = new zzccf();
        if (this.zzj.containsKey(str)) {
            zzccfVar.zzc((zzdwb) this.zzj.get(str));
        } else {
            if (!this.zzk.containsKey(str)) {
                this.zzk.put(str, new ArrayList());
            }
            ((List) this.zzk.get(str)).add(zzccfVar);
        }
        return zzccfVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue() && zzp()) {
            if (this.zzn < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                this.zzl = "{}";
                this.zzn = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzl.equals("{}")) {
                return this.zzl;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzp);
            jSONObject.put("gesture", this.zzo);
            if (this.zzn > com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzl);
                jSONObject.put("networkExtrasExpirationSecs", this.zzn);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            if (!TextUtils.isEmpty(this.zzh)) {
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "afma-sdk-a-v" + this.zzh);
            }
            jSONObject.put("internalSdkVersion", this.zzg);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjj)).booleanValue()) {
                String zzn = com.google.android.gms.ads.internal.zzt.zzo().zzn();
                if (!TextUtils.isEmpty(zzn)) {
                    jSONObject.put("plugin", zzn);
                }
            }
            if (this.zzn < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                this.zzl = "{}";
            }
            jSONObject.put("networkExtras", this.zzl);
            jSONObject.put("adSlots", zzs());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzi().zzh().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziZ)).booleanValue() && (jSONObject2 = this.zzm) != null) {
                zzcbn.zze("Server data: " + jSONObject2.toString());
                jSONObject.put("serverData", this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziY)).booleanValue()) {
                jSONObject.put("openAction", this.zzs);
                jSONObject.put("gesture", this.zzo);
            }
            jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzt.zzs().zzl());
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.client.zzay.zzb();
            jSONObject.put("isSimulator", zzcbg.zzr());
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzv(e, "Inspector.toJson");
            zzcbn.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdwb zzdwbVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue() && zzp()) {
            if (this.zzq >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziL)).intValue()) {
                zzcbn.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzi.containsKey(str)) {
                this.zzi.put(str, new ArrayList());
            }
            this.zzq++;
            ((List) this.zzi.get(str)).add(zzdwbVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjh)).booleanValue()) {
                String zzc = zzdwbVar.zzc();
                this.zzj.put(zzc, zzdwbVar);
                if (this.zzk.containsKey(zzc)) {
                    List list = (List) this.zzk.get(zzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzccf) it.next()).zzc(zzdwbVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziY)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzi().zzP()) {
                zzt();
                return;
            }
            String zzo = com.google.android.gms.ads.internal.zzt.zzo().zzi().zzo();
            if (TextUtils.isEmpty(zzo)) {
                return;
            }
            try {
                if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                    zzt();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzdwm zzdwmVar) {
        if (!zzp()) {
            try {
                zzdaVar.zze(zzffr.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzcbn.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue()) {
            this.zzs = zzdwmVar;
            this.zza.zzj(zzdaVar, new zzbkw(this), new zzbkp(this.zzf));
            return;
        } else {
            try {
                zzdaVar.zze(zzffr.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzcbn.zzj("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzi(String str, long j) {
        this.zzl = str;
        this.zzn = j;
        zzu();
    }

    public final synchronized void zzj(long j) {
        this.zzt += j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:
    
        if (r2 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzk(boolean z) {
        if (!this.zzr) {
            if (z) {
                zzt();
                if (!this.zzp) {
                    zzy();
                    return;
                }
            }
            if (zzp()) {
                return;
            }
            zzx();
        }
    }

    public final void zzl(zzdwj zzdwjVar) {
        zzv(zzdwjVar, true);
    }

    public final synchronized void zzm(JSONObject jSONObject) {
        this.zzm = jSONObject;
    }

    public final void zzn(boolean z) {
        if (!this.zzr && z) {
            zzt();
        }
        zzw(z, true);
    }

    public final boolean zzo() {
        return this.zzm != null;
    }

    public final synchronized boolean zzp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziY)).booleanValue()) {
            return this.zzp || com.google.android.gms.ads.internal.zzt.zzs().zzl();
        }
        return this.zzp;
    }

    public final synchronized boolean zzq() {
        return this.zzp;
    }

    public final boolean zzr() {
        return this.zzt < ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzje)).longValue();
    }
}
