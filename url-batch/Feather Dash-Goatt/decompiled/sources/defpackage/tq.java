package defpackage;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tq {
    public long a;
    public final Object b;
    public final Object c;

    public tq() {
        ym1 ym1Var = ym1.d;
        this.b = new zm1();
        this.c = new zm1();
    }

    public static String b(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static tq c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new tq(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new tq(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public void a(long j, long j2) {
        ((zm1) this.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((zm1) this.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public tq(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.a = j;
    }
}
