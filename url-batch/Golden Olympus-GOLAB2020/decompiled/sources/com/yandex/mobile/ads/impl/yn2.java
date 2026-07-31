package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.ironsource.b9;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yn2 {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f35269a;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f35270b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f35271c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i4, int i5, int i6, int i7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i4 / f35271c);
            jSONObject.put("y", i5 / f35271c);
            jSONObject.put("width", i6 / f35271c);
            jSONObject.put("height", i7 / f35271c);
            return jSONObject;
        } catch (JSONException e4) {
            Log.e("OMIDLIB", "Error with creating viewStateObject", e4);
            return jSONObject;
        }
    }

    public static boolean b(@NonNull JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f35270b;
            int i4 = 0;
            while (true) {
                if (i4 < 4) {
                    String str = strArr[i4];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i4++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")) == Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus"))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                if (!optJSONArray.optString(i5, "").equals(optJSONArray2.optString(i5, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if ((optJSONArray3 == null && optJSONArray4 == null) || (optJSONArray3 != null && optJSONArray4 != null && optJSONArray3.length() == optJSONArray4.length())) {
                            for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                                if (b(optJSONArray3.optJSONObject(i6), optJSONArray4.optJSONObject(i6))) {
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

    public static void a(Context context) {
        if (context != null) {
            f35271c = context.getResources().getDisplayMetrics().density;
            f35269a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject) {
        float f4;
        float f5;
        if (f35269a != null) {
            Point point = new Point(0, 0);
            f35269a.getDefaultDisplay().getRealSize(point);
            float f6 = point.x;
            float f7 = f35271c;
            f4 = f6 / f7;
            f5 = point.y / f7;
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
        }
        try {
            jSONObject.put("width", f4);
            jSONObject.put("height", f5);
        } catch (JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e4) {
            Log.e("OMIDLIB", "JSONException during JSONObject.put for name [" + str + b9.i.f15552e, e4);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
