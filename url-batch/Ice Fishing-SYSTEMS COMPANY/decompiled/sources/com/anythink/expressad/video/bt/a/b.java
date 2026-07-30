package com.anythink.expressad.video.bt.a;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.video.bt.a.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20993c = "HandlerH5MessageManager";

    /* renamed from: a, reason: collision with root package name */
    int f20994a;

    /* renamed from: b, reason: collision with root package name */
    int f20995b;

    /* renamed from: d, reason: collision with root package name */
    private String f20996d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static b f20997a = new b(0);

        private a() {
        }
    }

    public /* synthetic */ b(byte b9) {
        this();
    }

    public static b a() {
        return a.f20997a;
    }

    private b() {
        this.f20996d = "handlerNativeResult";
        this.f20994a = 0;
        this.f20995b = 1;
    }

    public final void a(Object obj, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(jSONObject.toString())) {
                a(this.f20995b, "params is null", obj);
                return;
            }
            String optString = jSONObject.optString("uniqueIdentifier");
            String optString2 = jSONObject.optString("name");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                jSONObject.optJSONArray("parameters");
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                    optJSONObject.optInt("type", 0);
                }
                a(this.f20994a, "receivedMessage", obj);
                if (optString.equalsIgnoreCase("reporter") || !optString.equalsIgnoreCase("MediaPlayer")) {
                    return;
                }
                com.anythink.expressad.video.bt.a.a unused = a.C0132a.f20992a;
                return;
            }
            a(this.f20995b, "module or method is null", obj);
        } catch (Exception e6) {
            e6.getMessage();
            a(this.f20995b, e6.getMessage(), obj);
        } catch (Throwable th) {
            th.getMessage();
            a(this.f20995b, th.getMessage(), obj);
        }
    }

    private static void a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e6) {
            e6.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
