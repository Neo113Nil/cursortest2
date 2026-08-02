package r1;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f10261a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f10262b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f10263c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i3, int i4, int i5, int i6) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i3 / f10263c);
            jSONObject.put("y", i4 / f10263c);
            jSONObject.put("width", i5 / f10263c);
            jSONObject.put("height", i6 / f10263c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException unused) {
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
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    public static HashMap d(JSONObject jSONObject) {
        try {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    hashMap.put(next, (String) obj);
                }
            }
            return hashMap;
        } catch (Exception e3) {
            throw new RuntimeException("Failed to parse JSON to Map", e3);
        }
    }

    public static void e(JSONObject jSONObject) {
        float f;
        float f3;
        if (f10261a != null) {
            Point point = new Point(0, 0);
            f10261a.getDefaultDisplay().getRealSize(point);
            float f4 = point.x;
            float f5 = f10263c;
            f = f4 / f5;
            f3 = point.y / f5;
        } else {
            f = 0.0f;
            f3 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f3);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    public static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f10262b;
            int i3 = 0;
            while (true) {
                if (i3 < 4) {
                    String str = strArr[i3];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i3++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                                if (!optJSONArray.optString(i4, "").equals(optJSONArray2.optString(i4, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    boolean z = true;
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if ((optJSONArray3 == null && optJSONArray4 == null) || !(optJSONArray3 == null || optJSONArray4 == null || optJSONArray3.length() != optJSONArray4.length())) {
                            for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                                if (f(optJSONArray3.optJSONObject(i5), optJSONArray4.optJSONObject(i5))) {
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
