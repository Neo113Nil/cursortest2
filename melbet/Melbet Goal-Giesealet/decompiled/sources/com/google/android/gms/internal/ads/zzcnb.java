package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcnb implements zzbnw {
    private final Context zza;
    private final zzayf zzb;
    private final PowerManager zzc;

    public zzcnb(Context context, zzayf zzayfVar) {
        this.zza = context;
        this.zzb = zzayfVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcne zzcneVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzayh zzayhVar = zzcneVar.zzf;
        if (zzayhVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzayf zzayfVar = this.zzb;
            if (zzayfVar.zzc() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzayhVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", zzayfVar.zzb()).put("activeViewJSON", zzayfVar.zzc()).put("timestamp", zzcneVar.zzd).put("adFormat", zzayfVar.zza()).put("hashCode", zzayfVar.zzd()).put("isMraid", false);
            boolean z2 = zzcneVar.zzc;
            JSONObject put2 = put.put("isStopped", false).put("isPaused", zzcneVar.zzb).put("isNative", zzayfVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            Context context = this.zza;
            put2.put("deviceVolume", com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject put3 = jSONObject3.put("windowVisibility", zzayhVar.zzb).put("isAttachedToWindow", z);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzayhVar.zzc;
            JSONObject put4 = put3.put("viewBox", jSONObject4.put(ViewProps.TOP, rect.top).put(ViewProps.BOTTOM, rect.bottom).put(ViewProps.LEFT, rect.left).put(ViewProps.RIGHT, rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzayhVar.zzd;
            JSONObject put5 = put4.put("adBox", jSONObject5.put(ViewProps.TOP, rect2.top).put(ViewProps.BOTTOM, rect2.bottom).put(ViewProps.LEFT, rect2.left).put(ViewProps.RIGHT, rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzayhVar.zze;
            JSONObject put6 = put5.put("globalVisibleBox", jSONObject6.put(ViewProps.TOP, rect3.top).put(ViewProps.BOTTOM, rect3.bottom).put(ViewProps.LEFT, rect3.left).put(ViewProps.RIGHT, rect3.right)).put("globalVisibleBoxVisible", zzayhVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzayhVar.zzg;
            JSONObject put7 = put6.put("localVisibleBox", jSONObject7.put(ViewProps.TOP, rect4.top).put(ViewProps.BOTTOM, rect4.bottom).put(ViewProps.LEFT, rect4.left).put(ViewProps.RIGHT, rect4.right)).put("localVisibleBoxVisible", zzayhVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzayhVar.zzi;
            put7.put("hitBox", jSONObject8.put(ViewProps.TOP, rect5.top).put(ViewProps.BOTTOM, rect5.bottom).put(ViewProps.LEFT, rect5.left).put(ViewProps.RIGHT, rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", zzcneVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbD)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzayhVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put(ViewProps.TOP, rect6.top).put(ViewProps.BOTTOM, rect6.bottom).put(ViewProps.LEFT, rect6.left).put(ViewProps.RIGHT, rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcneVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
