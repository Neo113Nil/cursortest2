package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.C5067a;

/* renamed from: com.google.android.gms.internal.ads.Wi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2844Wi implements InterfaceC2838Wc {

    /* renamed from: n, reason: collision with root package name */
    public final Context f28445n;

    /* renamed from: u, reason: collision with root package name */
    public final C3617n8 f28446u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager f28447v;

    public C2844Wi(Context context, C3617n8 c3617n8) {
        this.f28445n = context;
        this.f28446u = c3617n8;
        this.f28447v = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2838Wc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject l(C2878Yi c2878Yi) {
        boolean z8;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C3671o8 c3671o8 = c2878Yi.f28851e;
        if (c3671o8 == null) {
            jSONObject = new JSONObject();
        } else {
            C3617n8 c3617n8 = this.f28446u;
            if (c3617n8.f32835b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", c3617n8.f32837d).put("activeViewJSON", c3617n8.f32835b).put(com.anythink.expressad.foundation.d.d.f18754u, c2878Yi.f28849c).put("adFormat", c3617n8.f32834a).put("hashCode", c3617n8.f32836c).put("isMraid", false).put("isStopped", false).put("isPaused", c2878Yi.f28848b).put("isNative", c3617n8.f32838e).put("isScreenOn", this.f28447v.isInteractive());
            C5067a c5067a = p2.j.f39798C.i;
            synchronized (c5067a) {
                z8 = c5067a.f40873a;
            }
            JSONObject put2 = put.put("appMuted", z8).put("appVolume", r5.i.a());
            Context context = this.f28445n;
            put2.put("deviceVolume", C5067a.b(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject put3 = jSONObject3.put("windowVisibility", c3671o8.f33104b).put("isAttachedToWindow", c3671o8.f33103a);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = c3671o8.f33105c;
            JSONObject put4 = put3.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = c3671o8.f33106d;
            JSONObject put5 = put4.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = c3671o8.f33107e;
            JSONObject put6 = put5.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", c3671o8.f33108f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = c3671o8.f33109g;
            JSONObject put7 = put6.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", c3671o8.f33110h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = c3671o8.i;
            put7.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", c2878Yi.f28847a);
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31589X1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c3671o8.f33112k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c2878Yi.f28850d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
