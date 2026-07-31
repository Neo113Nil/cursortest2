package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x21 implements vb0<a31> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14008a;

    /* renamed from: b, reason: collision with root package name */
    private final un f14009b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f14010c;

    public x21(Context context, un unVar) {
        this.f14008a = context;
        this.f14009b = unVar;
        this.f14010c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.vb0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject a(a31 a31Var) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        xn xnVar = a31Var.f2596f;
        if (xnVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f14009b.d() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z6 = xnVar.f14249a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f14009b.b()).put("activeViewJSON", this.f14009b.d()).put("timestamp", a31Var.f2594d).put("adFormat", this.f14009b.a()).put("hashCode", this.f14009b.c()).put("isMraid", false).put("isStopped", false).put("isPaused", a31Var.f2592b).put("isNative", this.f14009b.e()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.f14010c.isInteractive() : this.f14010c.isScreenOn()).put("appMuted", y2.t.s().e()).put("appVolume", y2.t.s().a()).put("deviceVolume", a3.g.b(this.f14008a.getApplicationContext()));
            if (((Boolean) sw.c().b(m10.f8197f4)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f14008a.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f14008a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", xnVar.f14250b).put("isAttachedToWindow", z6).put("viewBox", new JSONObject().put("top", xnVar.f14251c.top).put("bottom", xnVar.f14251c.bottom).put("left", xnVar.f14251c.left).put("right", xnVar.f14251c.right)).put("adBox", new JSONObject().put("top", xnVar.f14252d.top).put("bottom", xnVar.f14252d.bottom).put("left", xnVar.f14252d.left).put("right", xnVar.f14252d.right)).put("globalVisibleBox", new JSONObject().put("top", xnVar.f14253e.top).put("bottom", xnVar.f14253e.bottom).put("left", xnVar.f14253e.left).put("right", xnVar.f14253e.right)).put("globalVisibleBoxVisible", xnVar.f14254f).put("localVisibleBox", new JSONObject().put("top", xnVar.f14255g.top).put("bottom", xnVar.f14255g.bottom).put("left", xnVar.f14255g.left).put("right", xnVar.f14255g.right)).put("localVisibleBoxVisible", xnVar.f14256h).put("hitBox", new JSONObject().put("top", xnVar.f14257i.top).put("bottom", xnVar.f14257i.bottom).put("left", xnVar.f14257i.left).put("right", xnVar.f14257i.right)).put("screenDensity", this.f14008a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", a31Var.f2591a);
            if (((Boolean) sw.c().b(m10.f8154a1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = xnVar.f14259k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(a31Var.f2595e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
