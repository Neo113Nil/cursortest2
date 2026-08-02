package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzccw implements zzbix {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzccv zzccvVar;
        zzccn zza;
        zzcbk zzcbkVar = (zzcbk) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzm.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcco zzy = com.google.android.gms.ads.internal.zzu.zzy();
        if (map.containsKey("abort")) {
            if (zzy.zzd(zzcbkVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcbj zzcbjVar = new zzcbj((String) map.get("flags"));
        boolean z = zzcbjVar.zzk;
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
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Malformed demuxed URL list for precache: ".concat(str2));
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
                    zzccn zzccnVar = (zzccn) it.next();
                    if (zzccnVar.zza == zzcbkVar && str.equals(zzccnVar.zze())) {
                        zza = zzccnVar;
                        break;
                    }
                }
            } else {
                zza = zzy.zza(zzcbkVar);
            }
            if (zza != null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache task is already running.");
                return;
            }
            if (zzcbkVar.zzj() == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer zzb4 = zzb(map, "player");
            if (zzb4 == null) {
                zzb4 = 0;
            }
            if (zzb != null) {
                zzcbkVar.zzA(zzb.intValue());
            }
            if (zzb2 != null) {
                zzcbkVar.zzy(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzcbkVar.zzx(zzb3.intValue());
            }
            int intValue = zzb4.intValue();
            zzcch zzcchVar = zzcbkVar.zzj().zzb;
            if (intValue > 0) {
                int i2 = zzcbjVar.zzg;
                int zzu = zzcbb.zzu();
                zzccvVar = zzu < i2 ? new zzcde(zzcbkVar, zzcbjVar) : zzu < zzcbjVar.zzb ? new zzcdb(zzcbkVar, zzcbjVar) : new zzccz(zzcbkVar);
            } else {
                zzccvVar = new zzccy(zzcbkVar);
            }
            new zzccn(zzcbkVar, zzccvVar, str, strArr).zzb();
        } else {
            zzccn zza2 = zzy.zza(zzcbkVar);
            if (zza2 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache must specify a source.");
                return;
            }
            zzccvVar = zza2.zzb;
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzccvVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzccvVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzccvVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzccvVar.zzq(zzb8.intValue());
        }
    }
}
