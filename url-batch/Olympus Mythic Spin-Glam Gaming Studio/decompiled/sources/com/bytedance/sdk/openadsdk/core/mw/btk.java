package com.bytedance.sdk.openadsdk.core.mw;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw;
import com.facebook.internal.NativeProtocol;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class btk {
    private static String zmn = "";

    public static boolean zmn(int i) {
        return i == 10 || i == 9 || i == 11;
    }

    public static JSONObject zmn(nqi nqiVar, String str) {
        JSONObject mw = nqiVar.mw(false);
        try {
            mw.put("show_dislike", nqiVar.bn());
            mw.put(POBConstants.KEY_LANGUAGE, mw.fs());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String zg = iv.fs().zg();
                int bvs = iv.fs().bvs();
                jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, zg);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(bvs)));
                mw.put("open_app_info", jSONObject);
            }
            mw.put("os", "Android");
            JSONArray zn = zn(nqiVar);
            if (zn != null) {
                mw.put("dpa_data", zn);
            }
        } catch (Throwable th) {
            iqz.zn("UgenUtils", "parseUGenDataInfo exception", th.getMessage());
        }
        return mw;
    }

    private static JSONArray zn(nqi nqiVar) {
        try {
            nqi.zmn ouf = nqiVar.ouf();
            if (ouf == null) {
                return null;
            }
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(ouf.bvs());
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("original_price", Double.valueOf(jsonObjectInit.optDouble("original_price", 0.0d)));
            jSONObject.putOpt("price_unit", jsonObjectInit.optString("price_unit"));
            jSONObject.putOpt("discount", Double.valueOf(jsonObjectInit.optDouble("discount", 0.0d)));
            jSONObject.putOpt("product_name", jsonObjectInit.optString("dpa_product_name"));
            jSONObject.putOpt("description", jsonObjectInit.optString("dpa_description"));
            JSONArray optJSONArray = jsonObjectInit.optJSONArray("dpa_images");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                jSONObject.putOpt("image", optJSONArray.get(0));
            }
            jSONObject.putOpt("brand_name", jsonObjectInit.optString("dpa_brand_name"));
            jSONObject.putOpt("sale_price_i18n", Integer.valueOf(jsonObjectInit.optInt("sale_price_i18n")));
            jSONObject.putOpt("real_price", Double.valueOf(jsonObjectInit.optDouble("real_price", 0.0d)));
            jSONObject.put("button_text", nqiVar.gt());
            JSONArray jSONArray = new JSONArray();
            JSONArray optJSONArray2 = jsonObjectInit.optJSONArray("dpa_related_products");
            if (optJSONArray2 != null) {
                jSONArray.put(jSONObject);
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put("button_text", nqiVar.gt());
                        jSONArray.put(jSONObject2);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean zmn(nqi nqiVar) {
        return nqiVar != null && nqiVar.skn() == 7;
    }

    public static String zmn() {
        return zmn;
    }

    public static boolean fs(nqi nqiVar) {
        return nqiVar != null && nqiVar.skn() == 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static JSONObject zmn(nqi nqiVar, com.bytedance.sdk.openadsdk.core.mw.nps.zn znVar) {
        nqi.zmn ouf;
        JSONObject jsonObjectInit;
        znVar.zmn("ad");
        String str = "";
        zmn = "";
        ?? r4 = 0;
        try {
            ouf = nqiVar.ouf();
            if (ouf != null) {
                str = ouf.cn();
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(ouf.rt()) && !TextUtils.isEmpty(ouf.fb())) {
                    str = com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn("ad", ouf.fb(), ouf.rt());
                }
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                } catch (JSONException unused) {
                }
                try {
                    zmn = "getTemplate success";
                    znVar.fs("local");
                    return jsonObjectInit;
                } catch (JSONException unused2) {
                    String concat = "parse json exception data is ".concat(String.valueOf(str));
                    zmn = concat;
                    znVar.zmn(2, concat, "local");
                    return null;
                }
            }
            String str2 = "local data is null id is " + ouf.fb() + " md5 is " + ouf.rt();
            zmn = str2;
            znVar.zmn(3, str2, "net");
            return null;
        } catch (Throwable th2) {
            r4 = ouf;
            th = th2;
            String str3 = "get template error " + th.getMessage();
            zmn = str3;
            znVar.zmn(2, str3, "local");
            return r4;
        }
    }
}
