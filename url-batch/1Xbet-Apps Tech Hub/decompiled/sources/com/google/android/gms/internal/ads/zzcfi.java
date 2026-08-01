package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcfi implements zzbkd {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzcbn.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfh zzcfhVar;
        zzcez zza;
        zzcdw zzcdwVar = (zzcdw) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcbn.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcfa zzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzy.zzd(zzcdwVar)) {
                return;
            }
            zzcbn.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcdv zzcdvVar = new zzcdv((String) map.get("flags"));
        boolean z = zzcdvVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzcbn.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zza = null;
                        break;
                    }
                    zzcez zzcezVar = (zzcez) it.next();
                    if (zzcezVar.zza == zzcdwVar && str.equals(zzcezVar.zze())) {
                        zza = zzcezVar;
                        break;
                    }
                }
            } else {
                zza = zzy.zza(zzcdwVar);
            }
            if (zza != null) {
                zzcbn.zzj("Precache task is already running.");
                return;
            }
            if (zzcdwVar.zzj() == null) {
                zzcbn.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer zzb4 = zzb(map, "player");
            if (zzb4 == null) {
                zzb4 = 0;
            }
            if (zzb != null) {
                zzcdwVar.zzA(zzb.intValue());
            }
            if (zzb2 != null) {
                zzcdwVar.zzy(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzcdwVar.zzx(zzb3.intValue());
            }
            int intValue = zzb4.intValue();
            zzcet zzcetVar = zzcdwVar.zzj().zzb;
            if (intValue > 0) {
                int i2 = zzcdvVar.zzh;
                int zzu = zzcdn.zzu();
                zzcfhVar = zzu < i2 ? new zzcfq(zzcdwVar, zzcdvVar) : zzu < zzcdvVar.zzb ? new zzcfn(zzcdwVar, zzcdvVar) : new zzcfl(zzcdwVar);
            } else {
                zzcfhVar = new zzcfk(zzcdwVar);
            }
            new zzcez(zzcdwVar, zzcfhVar, str, strArr).zzb();
        } else {
            zzcez zza2 = zzy.zza(zzcdwVar);
            if (zza2 == null) {
                zzcbn.zzj("Precache must specify a source.");
                return;
            }
            zzcfhVar = zza2.zzb;
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzcfhVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzcfhVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzcfhVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzcfhVar.zzq(zzb8.intValue());
        }
    }
}
