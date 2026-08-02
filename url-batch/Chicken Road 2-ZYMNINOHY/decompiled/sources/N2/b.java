package N2;

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
    public static WindowManager f1807a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1808b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f1809c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i4, int i5, int i6, int i7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i4 / f1809c);
            jSONObject.put("y", i5 / f1809c);
            jSONObject.put("width", i6 / f1809c);
            jSONObject.put("height", i7 / f1809c);
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
        } catch (JSONException e4) {
            e4.printStackTrace();
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
        } catch (Exception e4) {
            throw new RuntimeException("Failed to parse JSON to Map", e4);
        }
    }

    public static void e(JSONObject jSONObject) {
        float f4;
        float f5;
        if (f1807a != null) {
            Point point = new Point(0, 0);
            f1807a.getDefaultDisplay().getRealSize(point);
            float f6 = point.x;
            float f7 = f1809c;
            f4 = f6 / f7;
            f5 = point.y / f7;
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
        }
        try {
            jSONObject.put("width", f4);
            jSONObject.put("height", f5);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            int i4 = 0;
            while (true) {
                if (i4 < 4) {
                    String str = f1808b[i4];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i4++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
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
                        z = false;
                        if ((optJSONArray3 == null && optJSONArray4 == null) || (optJSONArray3 != null && optJSONArray4 != null && optJSONArray3.length() == optJSONArray4.length())) {
                            for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                                if (!f(optJSONArray3.optJSONObject(i6), optJSONArray4.optJSONObject(i6))) {
                                    break;
                                }
                            }
                        }
                        if (!z) {
                            return true;
                        }
                    }
                    z = true;
                    if (!z) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
