package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcev implements zzbkd {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i = zzcbg.zzx(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzcbn.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    private static void zzc(zzcdk zzcdkVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcdkVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzcbn.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcdkVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcdkVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcdkVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcdkVar.zzD(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int min;
        int min2;
        Integer valueOf;
        String str;
        zzcdw zzcdwVar = (zzcdw) obj;
        String str2 = (String) map.get("action");
        if (str2 == null) {
            zzcbn.zzj("Action missing from video GMSG.");
            return;
        }
        Integer valueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer zzb = zzcdwVar.zzo() != null ? zzcdwVar.zzo().zzb() : null;
        int i = 0;
        if (valueOf2 != null && zzb != null && !valueOf2.equals(zzb) && !str2.equals("load")) {
            zzcbn.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf2, zzb));
            return;
        }
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcbn.zze("Video GMSG: " + str2 + " " + jSONObject.toString());
        }
        if ("background".equals(str2)) {
            String str3 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str3)) {
                zzcbn.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcdwVar.setBackgroundColor(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused) {
                zzcbn.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str2)) {
            String str4 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str4)) {
                zzcbn.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcdwVar.zzB(Color.parseColor(str4));
                return;
            } catch (IllegalArgumentException unused2) {
                zzcbn.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str2)) {
            String str5 = (String) map.get("mimeTypes");
            if (str5 == null) {
                zzcbn.zzj("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                zzcdwVar.zzd("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            String[] split = str5.split(",");
            int length = split.length;
            while (i < length) {
                String str6 = split[i];
                hashMap2.put(str6, com.google.android.gms.ads.internal.util.zzcn.zza(str6.trim()));
                i++;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzcdwVar.zzd("onVideoEvent", hashMap3);
            return;
        }
        zzcdl zzo = zzcdwVar.zzo();
        if (zzo == null) {
            zzcbn.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str2);
        boolean equals2 = "position".equals(str2);
        if (equals || equals2) {
            Context context = zzcdwVar.getContext();
            int zzb2 = zzb(context, map, "x", 0);
            int zzb3 = zzb(context, map, "y", 0);
            int zzb4 = zzb(context, map, "w", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdI)).booleanValue()) {
                min = zzb4 == -1 ? zzcdwVar.zzh() : Math.min(zzb4, zzcdwVar.zzh());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate width with original width " + zzb4 + ", videoHost.getVideoBoundingWidth() " + zzcdwVar.zzh() + ", x " + zzb2 + ".");
                }
                min = Math.min(zzb4, zzcdwVar.zzh() - zzb2);
            }
            int zzb5 = zzb(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdI)).booleanValue()) {
                min2 = zzb5 == -1 ? zzcdwVar.zzg() : Math.min(zzb5, zzcdwVar.zzg());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate height with original height " + zzb5 + ", videoHost.getVideoBoundingHeight() " + zzcdwVar.zzg() + ", y " + zzb3 + ".");
                }
                min2 = Math.min(zzb5, zzcdwVar.zzg() - zzb3);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i2 = i;
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || zzo.zza() != null) {
                zzo.zzc(zzb2, zzb3, min, min2);
                return;
            }
            zzo.zzd(zzb2, zzb3, min, min2, i2, parseBoolean, new zzcdv((String) map.get("flags")));
            zzcdk zza = zzo.zza();
            if (zza != null) {
                zzc(zza, map);
                return;
            }
            return;
        }
        zzchr zzq = zzcdwVar.zzq();
        if (zzq != null) {
            if ("timeupdate".equals(str2)) {
                String str7 = (String) map.get("currentTime");
                if (str7 == null) {
                    zzcbn.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzq.zzt(Float.parseFloat(str7));
                    return;
                } catch (NumberFormatException unused4) {
                    zzcbn.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str7));
                    return;
                }
            }
            if ("skip".equals(str2)) {
                zzq.zzu();
                return;
            }
        }
        zzcdk zza2 = zzo.zza();
        if (zza2 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzcdwVar.zzd("onVideoEvent", hashMap4);
            return;
        }
        if ("click".equals(str2)) {
            Context context2 = zzcdwVar.getContext();
            int zzb6 = zzb(context2, map, "x", 0);
            float zzb7 = zzb(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb6, zzb7, 0);
            zza2.zzx(obtain);
            obtain.recycle();
            return;
        }
        if ("currentTime".equals(str2)) {
            String str8 = (String) map.get("time");
            if (str8 == null) {
                zzcbn.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zza2.zzw((int) (Float.parseFloat(str8) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                zzcbn.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str8));
                return;
            }
        }
        if ("hide".equals(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzG)).booleanValue()) {
                zza2.setVisibility(8);
                return;
            } else {
                zza2.setVisibility(4);
                return;
            }
        }
        if ("load".equals(str2)) {
            zza2.zzr(valueOf2);
            return;
        }
        if ("loadControl".equals(str2)) {
            zzc(zza2, map);
            return;
        }
        if ("muted".equals(str2)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zza2.zzs();
                return;
            } else {
                zza2.zzI();
                return;
            }
        }
        if ("pause".equals(str2)) {
            zza2.zzu();
            return;
        }
        if ("play".equals(str2)) {
            zza2.zzv();
            return;
        }
        if ("show".equals(str2)) {
            zza2.setVisibility(0);
            return;
        }
        if (!"src".equals(str2)) {
            if ("touchMove".equals(str2)) {
                Context context3 = zzcdwVar.getContext();
                zza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcdwVar.zzu();
                this.zza = true;
                return;
            }
            if (!"volume".equals(str2)) {
                if ("watermark".equals(str2)) {
                    zza2.zzn();
                    return;
                } else {
                    zzcbn.zzj("Unknown video action: ".concat(str2));
                    return;
                }
            }
            String str9 = (String) map.get("volume");
            if (str9 == null) {
                zzcbn.zzj("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zza2.zzG(Float.parseFloat(str9));
                return;
            } catch (NumberFormatException unused6) {
                zzcbn.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str9));
                return;
            }
        }
        String str10 = (String) map.get("src");
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                valueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
            } catch (NumberFormatException unused7) {
                zzcbn.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
            }
            String[] strArr = {str10};
            str = (String) map.get("demuxed");
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        strArr2[i3] = jSONArray.getString(i3);
                    }
                    strArr = strArr2;
                } catch (JSONException unused8) {
                    zzcbn.zzj("Malformed demuxed URL list for playback: ".concat(str));
                    strArr = new String[]{str10};
                }
            }
            if (valueOf != null) {
                zzcdwVar.zzA(valueOf.intValue());
            }
            zza2.zzE(str10, strArr);
        }
        valueOf = null;
        String[] strArr3 = {str10};
        str = (String) map.get("demuxed");
        if (str != null) {
        }
        if (valueOf != null) {
        }
        zza2.zzE(str10, strArr3);
    }
}
