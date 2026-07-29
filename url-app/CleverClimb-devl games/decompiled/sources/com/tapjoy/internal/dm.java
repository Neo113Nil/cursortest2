package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class dm {

    /* renamed from: b, reason: collision with root package name */
    private static WindowManager f7950b;

    /* renamed from: c, reason: collision with root package name */
    private static String[] f7951c = {"x", "y", "width", "height"};

    /* renamed from: a, reason: collision with root package name */
    static float f7949a = Resources.getSystem().getDisplayMetrics().density;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final float f7952a;

        /* renamed from: b, reason: collision with root package name */
        final float f7953b;

        a(float f, float f2) {
            this.f7952a = f;
            this.f7953b = f2;
        }
    }

    public static void a(Context context) {
        if (context != null) {
            f7949a = context.getResources().getDisplayMetrics().density;
            f7950b = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            dn.a("Error with setting ad session id", e);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            dn.a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    public static void a(JSONObject jSONObject, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
        } catch (JSONException e) {
            dn.a("Error with setting friendly obstruction", e);
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
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f7949a);
            jSONObject.put("y", i2 / f7949a);
            jSONObject.put("width", i3 / f7949a);
            jSONObject.put("height", i4 / f7949a);
        } catch (JSONException e) {
            dn.a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT >= 17) {
            if (f7950b != null) {
                f7950b.getDefaultDisplay().getRealSize(new Point(0, 0));
                f2 = r0.x / f7949a;
                f = r0.y / f7949a;
            }
            f = 0.0f;
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
            }
            f = 0.0f;
        }
        a aVar = new a(f2, f);
        try {
            jSONObject.put("width", aVar.f7952a);
            jSONObject.put("height", aVar.f7953b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = f7951c;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            String str = strArr[i];
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                z = false;
                break;
            }
            i++;
        }
        if (z && jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
            JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
            if (optJSONArray != null || optJSONArray2 != null) {
                if (a(optJSONArray, optJSONArray2)) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        if (optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (a(optJSONArray3, optJSONArray4)) {
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                if (b(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                }
                            }
                        }
                        z3 = false;
                        if (!z3) {
                            return true;
                        }
                    }
                    z3 = true;
                    if (!z3) {
                    }
                }
            }
            z2 = true;
            if (z2) {
            }
        }
        return false;
    }
}
