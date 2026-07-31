package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sz2 {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f12015a;

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f12016b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f12017c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i7, int i8, int i9, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i7 / f12017c);
            jSONObject.put("y", i8 / f12017c);
            jSONObject.put("width", i9 / f12017c);
            jSONObject.put("height", i10 / f12017c);
        } catch (JSONException e7) {
            tz2.a("Error with creating viewStateObject", e7);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e7) {
            tz2.a("Error with setting ad session id", e7);
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    public static void d(JSONObject jSONObject, wz2 wz2Var) {
        dz2 a7 = wz2Var.a();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> b7 = wz2Var.b();
        int size = b7.size();
        for (int i7 = 0; i7 < size; i7++) {
            jSONArray.put(b7.get(i7));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a7.d());
            jSONObject.put("friendlyObstructionPurpose", a7.a());
            jSONObject.put("friendlyObstructionReason", a7.c());
        } catch (JSONException e7) {
            tz2.a("Error with setting friendly obstruction", e7);
        }
    }

    public static void e(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e7) {
            tz2.a("Error with setting not visible reason", e7);
        }
    }

    public static void f(Context context) {
        if (context != null) {
            f12017c = context.getResources().getDisplayMetrics().density;
            f12015a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void g(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e7) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            tz2.a(sb.toString(), e7);
        }
    }

    public static void h(JSONObject jSONObject) {
        float f7;
        float f8 = 0.0f;
        if (Build.VERSION.SDK_INT >= 17) {
            if (f12015a != null) {
                Point point = new Point(0, 0);
                f12015a.getDefaultDisplay().getRealSize(point);
                float f9 = point.x;
                float f10 = f12017c;
                f7 = point.y / f10;
                f8 = f9 / f10;
            }
            f7 = 0.0f;
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                f7 = 0.0f;
                for (int i7 = 0; i7 < length; i7++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f8 = Math.max(f8, (float) (optDouble + optDouble3));
                        f7 = Math.max(f7, (float) (optDouble2 + optDouble4));
                    }
                }
            }
            f7 = 0.0f;
        }
        try {
            jSONObject.put("width", f8);
            jSONObject.put("height", f7);
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    public static boolean i(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f12016b;
            int i7 = 0;
            while (true) {
                if (i7 < 4) {
                    String str = strArr[i7];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i7++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (j(optJSONArray, optJSONArray2)) {
                            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                                if (!optJSONArray.optString(i8, "").equals(optJSONArray2.optString(i8, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (j(optJSONArray3, optJSONArray4)) {
                            for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                                if (i(optJSONArray3.optJSONObject(i9), optJSONArray4.optJSONObject(i9))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean j(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
