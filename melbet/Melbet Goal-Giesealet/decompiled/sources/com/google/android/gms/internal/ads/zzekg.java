package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzekg extends zzbqy {
    private final String zza;
    private final zzbqw zzb;
    private final zzbzm zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzekg(String str, zzbqw zzbqwVar, zzbzm zzbzmVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzbzmVar;
        this.zza = str;
        this.zzb = zzbqwVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbqwVar.zzf().toString());
            jSONObject.put("sdk_version", zzbqwVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzd(String str, zzbzm zzbzmVar) {
        synchronized (zzekg.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbN)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzbzmVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    private final synchronized void zzh(String str, int i) {
        if (this.zzf) {
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signal_error", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbO)).booleanValue()) {
                jSONObject.put("latency", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbN)).booleanValue()) {
                jSONObject.put("signal_error_code", i);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzb() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbN)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbO)).booleanValue()) {
                jSONObject.put("latency", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbN)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
