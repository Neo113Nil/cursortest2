package com.bytedance.adsdk.ugeno.zmn;

import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.zmn.zn;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class fb {
    public static int zmn(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return Integer.MIN_VALUE;
        }
        return i - 1;
    }

    public static List<zn> zmn(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(zmn(optJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static zn zmn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        zn znVar = new zn();
        znVar.fs(com.bytedance.adsdk.ugeno.nps.zn.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString(POBCTAOverlayData.KEY_CTA_DELAY), jSONObject2), 0L));
        znVar.zn(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("name"), jSONObject2));
        znVar.fs(com.bytedance.adsdk.ugeno.nps.zn.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("playState"), jSONObject2), 1));
        znVar.zmn(Math.max(com.bytedance.adsdk.ugeno.nps.zn.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString(IronSourceConstants.EVENTS_DURATION), jSONObject2), 0L), 0L));
        znVar.zmn(com.bytedance.adsdk.ugeno.nps.zn.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("playCount"), jSONObject2), 1));
        znVar.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("playDirection"), jSONObject2));
        znVar.zmn(zn(jSONObject.optString("transformOrigin"), jSONObject2));
        znVar.fs(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        znVar.zmn(jSONObject.optJSONObject("effect"));
        znVar.zmn(zmn(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return znVar;
    }

    public static Map<String, TreeMap<Float, String>> zmn(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                float optDouble = (float) optJSONObject.optDouble("offset");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals(next, "offset")) {
                        TreeMap treeMap = (TreeMap) hashMap.get(next);
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                            hashMap.put(next, treeMap);
                        }
                        treeMap.put(Float.valueOf(optDouble), fb(optJSONObject.optString(next), jSONObject));
                    }
                }
            }
        }
        return hashMap;
    }

    private static String fb(String str, JSONObject jSONObject) {
        String zmn = com.bytedance.adsdk.ugeno.zn.fs.zmn(str, jSONObject);
        if (zn(zmn)) {
            return Arrays.toString(fs(zmn, jSONObject));
        }
        return com.bytedance.adsdk.ugeno.zn.fs.zmn(zmn, jSONObject);
    }

    public static int zmn(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1408024454) {
            return str.equals(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE) ? 2 : 1;
        }
        if (hashCode != -1039745817) {
            return 1;
        }
        str.equals(Constants.NORMAL);
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Interpolator fs(String str) {
        char c;
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new AccelerateInterpolator();
        }
        if (c == 1) {
            return new AccelerateDecelerateInterpolator();
        }
        if (c == 2) {
            return new DecelerateInterpolator();
        }
        return new LinearInterpolator();
    }

    public static float[] fs(String str, JSONObject jSONObject) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray zmn = com.bytedance.adsdk.ugeno.nps.fs.zmn(str, (JSONArray) null);
        if (zmn != null && zmn.length() == 2) {
            fArr[0] = (float) com.bytedance.adsdk.ugeno.nps.zn.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn(zmn.optString(0), jSONObject), 0.0d);
            fArr[1] = (float) com.bytedance.adsdk.ugeno.nps.zn.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn(zmn.optString(1), jSONObject), 0.0d);
        }
        return fArr;
    }

    public static boolean zn(String str) {
        JSONArray zmn = com.bytedance.adsdk.ugeno.nps.fs.zmn(str, (JSONArray) null);
        return zmn != null && zmn.length() > 0;
    }

    public static zn.zmn zn(String str, JSONObject jSONObject) {
        JSONArray zmn;
        if (TextUtils.isEmpty(str) || (zmn = com.bytedance.adsdk.ugeno.nps.fs.zmn(str, (JSONArray) null)) == null || zmn.length() != 2) {
            return null;
        }
        zn.zmn zmnVar = new zn.zmn();
        zmnVar.zmn = com.bytedance.adsdk.ugeno.zn.fs.zmn(zmn.optString(0), jSONObject);
        zmnVar.fs = com.bytedance.adsdk.ugeno.zn.fs.zmn(zmn.optString(1), jSONObject);
        return zmnVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0036, code lost:
    
        if (r6.equals(com.facebook.appevents.internal.ViewHierarchyConstants.DIMENSION_TOP_KEY) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zmn(String str, int i) {
        char c = 2;
        int i2 = i / 2;
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 115029:
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 4:
                return i;
            case 1:
                return i2;
            case 2:
            case 3:
                return 0;
            default:
                if (str.endsWith("%")) {
                    try {
                        return (int) ((i * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                    } catch (NumberFormatException unused) {
                        return i2;
                    }
                }
                try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException unused2) {
                    return i2;
                }
        }
    }
}
