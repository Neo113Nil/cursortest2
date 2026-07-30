package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcso implements zzbss {
    private final Context zza;
    private final zzbdb zzb;
    private final PowerManager zzc;

    public zzcso(Context context, zzbdb zzbdbVar) {
        this.zza = context;
        this.zzb = zzbdbVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcsr zzcsrVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbdd zzbddVar = zzcsrVar.zzf;
        if (zzbddVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbdb zzbdbVar = this.zzb;
            if (zzbdbVar.zzc() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzbddVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", zzbdbVar.zzb()).put("activeViewJSON", zzbdbVar.zzc()).put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, zzcsrVar.zzd).put("adFormat", zzbdbVar.zza()).put("hashCode", zzbdbVar.zzd()).put("isMraid", false);
            boolean z2 = zzcsrVar.zzc;
            JSONObject put2 = put.put("isStopped", false).put("isPaused", zzcsrVar.zzb).put("isNative", zzbdbVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            Context context = this.zza;
            put2.put("deviceVolume", com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject put3 = jSONObject3.put("windowVisibility", zzbddVar.zzb).put("isAttachedToWindow", z);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbddVar.zzc;
            JSONObject put4 = put3.put("viewBox", jSONObject4.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect.top).put("bottom", rect.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbddVar.zzd;
            JSONObject put5 = put4.put("adBox", jSONObject5.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect2.top).put("bottom", rect2.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbddVar.zze;
            JSONObject put6 = put5.put("globalVisibleBox", jSONObject6.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect3.top).put("bottom", rect3.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zzbddVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbddVar.zzg;
            JSONObject put7 = put6.put("localVisibleBox", jSONObject7.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect4.top).put("bottom", rect4.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zzbddVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbddVar.zzi;
            put7.put("hitBox", jSONObject8.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect5.top).put("bottom", rect5.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", zzcsrVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbW)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbddVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect6.top).put("bottom", rect6.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcsrVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
