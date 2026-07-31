package com.bytedance.adsdk.ugeno.fb;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fb.hhw;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class klz {
    public static hhw.zmn zmn(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        hhw.zmn zmnVar = new hhw.zmn();
        String zmn = com.bytedance.adsdk.ugeno.zn.fs.zmn(str, jSONObject);
        if (zmn.contains("#")) {
            zmn = zmn.replace("#", "%23");
        }
        Uri parse = Uri.parse(zmn);
        if (parse == null) {
            return null;
        }
        zmnVar.zn(zmn);
        if (!TextUtils.isEmpty(parse.getScheme())) {
            zmnVar.zmn(parse.getScheme());
        }
        String authority = parse.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = parse.getPath();
        }
        zmnVar.fs(authority);
        zmnVar.fb(zmnVar.zmn() + "://" + zmnVar.fs());
        HashMap hashMap = new HashMap();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                hashMap.put(str2, com.bytedance.adsdk.ugeno.zn.fs.zmn(parse.getQueryParameter(str2), jSONObject));
            }
        }
        zmnVar.zmn(hashMap);
        return zmnVar;
    }

    public static hhw.zmn zmn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        hhw.zmn zmnVar = new hhw.zmn();
        String zmn = com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("protocol"), jSONObject2);
        zmnVar.fs(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("name"), jSONObject2));
        if (TextUtils.isEmpty(zmn)) {
            zmnVar.zmn("global");
        } else {
            zmnVar.zmn(zmn);
        }
        zmnVar.fb(zmnVar.zmn() + "://" + zmnVar.fs());
        zmnVar.zn(String.valueOf(jSONObject.hashCode()));
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, com.bytedance.adsdk.ugeno.zn.fs.zmn(optJSONObject.opt(next), jSONObject2));
            }
        }
        zmnVar.zmn(hashMap);
        return zmnVar;
    }
}
