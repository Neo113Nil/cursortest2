package com.iab.omid.library.ironsrc.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.ironsrc.adsession.OutputDeviceStatus;
import com.iab.omid.library.ironsrc.walking.a;
import com.ironsource.b9;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f14587a;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f14588b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f14589c = Resources.getSystem().getDisplayMetrics().density;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14590a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f14590a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final float f14591a;

        /* renamed from: b, reason: collision with root package name */
        final float f14592b;

        b(float f4, float f5) {
            this.f14591a = f4;
            this.f14592b = f5;
        }
    }

    static float a(int i4) {
        return i4 / f14589c;
    }

    public static void b(JSONObject jSONObject) {
        b a4 = a(jSONObject);
        try {
            jSONObject.put("width", a4.f14591a);
            jSONObject.put("height", a4.f14592b);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
            if (!optJSONArray.optString(i4, "").equals(optJSONArray2.optString(i4, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f14588b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }

    private static b a(JSONObject jSONObject) {
        float f4;
        float f5;
        if (f14587a != null) {
            Point point = new Point(0, 0);
            f14587a.getDefaultDisplay().getRealSize(point);
            f4 = a(point.x);
            f5 = a(point.y);
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
        }
        return new b(f4, f5);
    }

    public static void b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e4) {
                d.a("Error with setting is picture-in-picture active", e4);
            }
        }
    }

    public static JSONObject a(int i4, int i5, int i6, int i7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i4));
            jSONObject.put("y", a(i5));
            jSONObject.put("width", a(i6));
            jSONObject.put("height", a(i7));
            return jSONObject;
        } catch (JSONException e4) {
            d.a("Error with creating viewStateObject", e4);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e4) {
            d.a("Error with setting not visible reason", e4);
        }
    }

    public static void a(Context context) {
        if (context != null) {
            f14589c = context.getResources().getDisplayMetrics().density;
            f14587a = (WindowManager) context.getSystemService("window");
        }
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
            if (!h(optJSONArray.optJSONObject(i4), optJSONArray2.optJSONObject(i4))) {
                return false;
            }
        }
        return true;
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e4) {
            d.a("Error with setting output device status", e4);
        }
    }

    public static void a(JSONObject jSONObject, a.C0143a c0143a) {
        com.iab.omid.library.ironsrc.internal.e a4 = c0143a.a();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> b4 = c0143a.b();
        int size = b4.size();
        int i4 = 0;
        while (i4 < size) {
            String str = b4.get(i4);
            i4++;
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a4.d());
            jSONObject.put("friendlyObstructionPurpose", a4.b());
            jSONObject.put("friendlyObstructionReason", a4.a());
        } catch (JSONException e4) {
            d.a("Error with setting friendly obstruction", e4);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e4) {
            d.a("Error with setting has window focus", e4);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e4) {
            d.a("Error with setting ad session id", e4);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e4) {
            d.a("JSONException during JSONObject.put for name [" + str + b9.i.f15552e, e4);
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
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f14590a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
