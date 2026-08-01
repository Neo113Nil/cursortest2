package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.load.Key;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PglArmorCallApi.java */
/* renamed from: com.pgl.ssdk.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1141v {
    private static Context a;

    /* compiled from: PglArmorCallApi.java */
    /* renamed from: com.pgl.ssdk.v$a */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.b(C1141v.b());
            com.pgl.ssdk.ces.a.meta(226, C1141v.b(), null);
            C1136p.a(C1141v.b());
        }
    }

    @DungeonFlag
    public static String a(Context context) {
        TelephonyManager telephonyManager;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
            jSONObject.put("envcode", ((Long) com.pgl.ssdk.ces.a.meta(154, context, null)).longValue());
            jSONObject.put("bootcount", r.a(context));
            Object meta = com.pgl.ssdk.ces.a.meta(155, context, null);
            jSONObject.put("usb_debug", meta instanceof Boolean ? ((Boolean) meta).booleanValue() : false);
            JSONArray[] b = r.b(context);
            if (b != null) {
                jSONObject.put("sdata", b[0]);
                jSONObject.put("sdmta", b[1]);
                jSONObject.put("curtime", System.currentTimeMillis() / 1000);
            }
            int i = C1139t.b;
            if (i == -1) {
                SharedPreferences a2 = L.a(b());
                if (a2 == null || (i = a2.getInt("camera_count", -1)) == -1) {
                    AbstractC1123c.a(new RunnableC1138s());
                    i = -1;
                } else {
                    C1139t.b = i;
                }
            }
            jSONObject.put("camera_count", i);
            if (C1139t.a == -1 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                C1139t.a = telephonyManager.getSimState();
            }
            jSONObject.put("sim", C1139t.a);
            jSONObject.put("virtual_display", w.a(context));
            jSONObject.put("acbs", C1136p.c(context));
            Object meta2 = com.pgl.ssdk.ces.a.meta(156, context, null);
            jSONObject.put("bl_unlock", meta2 instanceof Boolean ? ((Boolean) meta2).booleanValue() : false);
            jSONObject.put("easyclick", C1136p.a());
            C1140u.g();
            C1140u.a(jSONObject);
            String d = C1137q.d();
            jSONObject.put("romtype", r.c());
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put("sign", d);
            }
            return (String) com.pgl.ssdk.ces.a.meta(227, context, jSONObject.toString());
        } catch (Throwable th) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, 3);
                jSONObject2.put("exception", th.toString());
                jSONObject2.put("stacktrace", Arrays.toString(th.getStackTrace()));
                jSONObject2.put("cause", String.valueOf(th.getCause()));
                return Base64.encodeToString(jSONObject2.toString().getBytes(Key.STRING_CHARSET_NAME), 0);
            } catch (Throwable unused) {
                return "eyJzdGF0dXMiOjN9";
            }
        }
    }

    public static void b(Context context) {
        a = context;
    }

    public static String c() {
        String a2 = a(a);
        a();
        return a2;
    }

    public static Context b() {
        return a;
    }

    @DungeonFlag
    public static void a() {
        AbstractC1123c.a(new a());
    }
}
