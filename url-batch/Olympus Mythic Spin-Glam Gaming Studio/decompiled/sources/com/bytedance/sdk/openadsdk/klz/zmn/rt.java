package com.bytedance.sdk.openadsdk.klz.zmn;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.zmn.zn;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.uqh;
import com.ironsource.C4701ic;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class rt extends com.bytedance.sdk.component.zmn.zn<JSONObject, JSONObject> {
    private final WeakReference<fkt> zmn;

    public rt(fkt fktVar) {
        this.zmn = new WeakReference<>(fktVar);
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, final fkt fktVar) {
        cnVar.zmn("request", new zn.fs() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.rt.1
            @Override // com.bytedance.sdk.component.zmn.zn.fs
            public com.bytedance.sdk.component.zmn.zn zmn() {
                return new rt(fkt.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.zmn.zn
    public void zmn(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        fkt fktVar = this.zmn.get();
        final JSONObject jSONObject2 = new JSONObject();
        if (fktVar == null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("net_code", Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            jSONObject3.put("msg", "ttAndroidObject is null");
            jSONObject2.put("code", 0);
            jSONObject2.put("data", jSONObject3);
            zmn((rt) jSONObject2);
            com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "ttAndroidObject is null", null, null);
            return;
        }
        if (jSONObject == null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("net_code", Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            jSONObject4.put("msg", "params is null");
            jSONObject2.put("code", 0);
            jSONObject2.put("data", jSONObject4);
            zmn((rt) jSONObject2);
            com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "params is null", null, null);
            return;
        }
        if (!jSONObject.has("url") || !jSONObject.has("method")) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("net_code", Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            jSONObject5.put("msg", "url or method is empty");
            jSONObject2.put("code", 0);
            jSONObject2.put("data", jSONObject5);
            zmn((rt) jSONObject2);
            com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "url or method is empty", null, null);
            return;
        }
        zmn(jSONObject, new com.bytedance.sdk.openadsdk.mw.hhw() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.rt.3
            @Override // com.bytedance.sdk.openadsdk.mw.hhw
            public void zmn(int i, int i2, String str, JSONObject jSONObject6, Object obj, int i3) {
                try {
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("net_code", i2);
                    if (str != null && !str.isEmpty()) {
                        jSONObject7.put("msg", str);
                    }
                    jSONObject7.put(POBCTAOverlayData.KEY_CTA_HEADER, jSONObject6);
                    if (obj != null) {
                        jSONObject7.put("response", obj);
                        jSONObject7.put("decode", i3);
                    }
                    jSONObject2.put("code", i);
                    jSONObject2.put("data", jSONObject7);
                    rt.this.zmn((rt) jSONObject2);
                    Objects.toString(obj);
                } catch (Exception unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.mw.hhw
            public void zmn(int i, int i2, String str) {
                try {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("net_code", i2);
                    jSONObject6.put("msg", str);
                    jSONObject2.put("code", i);
                    jSONObject2.put("data", jSONObject6);
                    rt.this.zmn((rt) jSONObject2);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|2|3|(2:5|(9:7|8|(1:12)|13|14|15|(2:20|(2:28|(2:30|31)(2:32|(2:34|35)(2:36|(2:38|39)(2:40|41))))(2:25|26))|42|43))(1:47)|46|8|(2:10|12)|13|14|15|(5:17|20|(0)|28|(0)(0))|42|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0067, code lost:
    
        r0 = "param is null";
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:3:0x0005, B:5:0x0027, B:7:0x0033, B:8:0x0044, B:10:0x0053, B:12:0x0059, B:15:0x0069, B:17:0x006f, B:20:0x0077, B:23:0x007f, B:25:0x0083, B:28:0x0092, B:30:0x009e, B:32:0x00ad, B:34:0x00b5, B:36:0x00bd, B:38:0x00c5, B:40:0x00cd, B:42:0x00e4), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:3:0x0005, B:5:0x0027, B:7:0x0033, B:8:0x0044, B:10:0x0053, B:12:0x0059, B:15:0x0069, B:17:0x006f, B:20:0x0077, B:23:0x007f, B:25:0x0083, B:28:0x0092, B:30:0x009e, B:32:0x00ad, B:34:0x00b5, B:36:0x00bd, B:38:0x00c5, B:40:0x00cd, B:42:0x00e4), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(JSONObject jSONObject, com.bytedance.sdk.openadsdk.mw.hhw hhwVar) {
        JSONArray jSONArray;
        Boolean bool;
        List<String> arrayList;
        try {
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("method");
            Object opt = jSONObject.opt("bodyParams");
            JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            JSONObject optJSONObject2 = jSONObject.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER);
            Boolean bool2 = Boolean.TRUE;
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray("fallbackUrls");
                if (optJSONObject.has("encrypt")) {
                    bool = Boolean.valueOf(optJSONObject.optBoolean("encrypt"));
                    Map<String, String> zmn = zmn(optJSONObject2, bool.booleanValue());
                    arrayList = new ArrayList<>();
                    if (jSONArray != null && jSONArray.length() > 0) {
                        arrayList = zmn(jSONArray);
                    }
                    String str = new URL(optString).getPath();
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if (!bool.booleanValue() && opt != null && !(opt instanceof JSONObject)) {
                            hhwVar.zmn(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "bodyParams must be JSONObject when encrypt is true");
                            com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", optString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "bodyParams must be JSONObject when encrypt is true", str, arrayList);
                            return;
                        }
                        if ("https".equalsIgnoreCase(fs(optString))) {
                            hhwVar.zmn(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "non-https url is not allowed");
                            com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", optString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "non-https url is not allowed", str, arrayList);
                            return;
                        } else if (C4701ic.a.equalsIgnoreCase(optString2)) {
                            zmn(optString, zmn, arrayList, str, bool, hhwVar);
                            return;
                        } else {
                            if ("POST".equalsIgnoreCase(optString2)) {
                                zmn(optString, zmn, arrayList, opt, bool, str, hhwVar);
                                return;
                            }
                            String concat = "unsupported method: ".concat(String.valueOf(optString2));
                            hhwVar.zmn(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, concat);
                            com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", optString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, concat, str, arrayList);
                            return;
                        }
                    }
                    hhwVar.zmn(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "null url or method");
                    com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", optString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "null url or method", str, arrayList);
                }
            } else {
                jSONArray = null;
            }
            bool = bool2;
            Map<String, String> zmn2 = zmn(optJSONObject2, bool.booleanValue());
            arrayList = new ArrayList<>();
            if (jSONArray != null) {
                arrayList = zmn(jSONArray);
            }
            String str2 = new URL(optString).getPath();
            if (!TextUtils.isEmpty(optString)) {
                if (!bool.booleanValue()) {
                }
                if ("https".equalsIgnoreCase(fs(optString))) {
                }
            }
            hhwVar.zmn(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "null url or method");
            com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", optString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "null url or method", str2, arrayList);
        } catch (Exception e) {
            try {
                hhwVar.zmn(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, e.getMessage());
            } catch (JSONException e2) {
                com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "JSONException: " + e2.getMessage(), null, null);
            }
        }
    }

    private Map<String, String> zmn(JSONObject jSONObject, boolean z) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    String optString = jSONObject.optString(next, "");
                    if (!TextUtils.isEmpty(optString)) {
                        hashMap.put(next, optString);
                    }
                }
            }
        }
        if (z && !hashMap.containsKey("x-pgli18n")) {
            hashMap.put("x-pgli18n", "4");
        }
        return hashMap;
    }

    private List<String> zmn(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if ("https".equalsIgnoreCase(fs(jSONArray.optString(i)))) {
                    arrayList.add(jSONArray.optString(i));
                }
            }
        }
        return arrayList;
    }

    public String fs(String str) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme != null) {
                return scheme.toLowerCase();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONObject zmn(JSONObject jSONObject) {
        return uqh.zmn(PangleEncryptConstant.CryptDataScene.JSB_REQUEST, jSONObject);
    }

    private Pair<Boolean, JSONObject> fs(JSONObject jSONObject) {
        JSONObject jsonObjectInit;
        boolean z;
        if (jSONObject == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (!jSONObject.has("cypher") || !jSONObject.has("message")) {
            return new Pair<>(Boolean.FALSE, jSONObject);
        }
        String zmn = uqh.zmn(jSONObject.optInt("cypher", -1), jSONObject.optString("message"));
        if (!TextUtils.isEmpty(zmn)) {
            try {
                jsonObjectInit = PangleNetworkBridge.jsonObjectInit(zmn);
                z = true;
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", null, -3, "decryptBody error" + e.getMessage(), null, null);
            }
            return new Pair<>(Boolean.valueOf(z), jsonObjectInit);
        }
        jsonObjectInit = jSONObject;
        z = false;
        return new Pair<>(Boolean.valueOf(z), jsonObjectInit);
    }

    private void zmn(final String str, Map<String, String> map, final List<String> list, final String str2, final Boolean bool, final com.bytedance.sdk.openadsdk.mw.hhw hhwVar) {
        com.bytedance.sdk.component.nps.fs.fs zn = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zn();
        zmn(zn, "jsb_request", str2);
        zn.zn(str);
        if (map != null && !map.isEmpty()) {
            zn.fb(map);
        }
        if (com.bytedance.sdk.openadsdk.utils.fs.fs() && !list.isEmpty()) {
            zn.zmn(list);
            zn.zmn(60L, TimeUnit.SECONDS);
        }
        zn.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.rt.4
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                rt.this.zmn(fsVar, str2, bool, hhwVar);
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                rt.this.zmn(iOException.getMessage(), str2, hhwVar);
                com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", str, iOException.hashCode(), iOException.getMessage(), str2, list);
            }
        });
    }

    private void zmn(final String str, Map<String, String> map, final List<String> list, Object obj, final Boolean bool, final String str2, final com.bytedance.sdk.openadsdk.mw.hhw hhwVar) {
        JSONObject jSONObject;
        try {
            com.bytedance.sdk.component.nps.fs.fb fs = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
            zmn(fs, "jsb_request", str2);
            fs.zn(str);
            if (map != null && !map.isEmpty()) {
                fs.fb(map);
            }
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    if (bool.booleanValue()) {
                        jSONObject = zmn((JSONObject) obj);
                    } else {
                        jSONObject = (JSONObject) obj;
                    }
                    fs.zmn(jSONObject);
                } else {
                    fs.zmn(PangleNetworkBridge.jsonObjectInit(obj.toString()));
                }
            } else {
                fs.zmn(new JSONObject());
            }
            if (com.bytedance.sdk.openadsdk.utils.fs.fs() && !list.isEmpty()) {
                fs.zmn(list);
                fs.zmn(60L, TimeUnit.SECONDS);
            }
            fs.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.rt.5
                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                    rt.this.zmn(fsVar, str2, bool, hhwVar);
                }

                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                    rt.this.zmn(iOException.getMessage(), str2, hhwVar);
                    com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", str, iOException.hashCode(), iOException.getMessage(), str2, list);
                }
            });
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", str, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "executePostRequest error" + e.getMessage(), str2, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:12:0x0004, B:14:0x000a, B:16:0x0019, B:17:0x0021, B:19:0x0027, B:24:0x003d, B:30:0x0044, B:33:0x004c, B:34:0x0052, B:36:0x0061, B:39:0x0067, B:41:0x006b, B:43:0x0079, B:45:0x007d, B:51:0x008b, B:56:0x0098, B:58:0x009e, B:59:0x00a6, B:3:0x00ad, B:5:0x00b3, B:7:0x00bd, B:8:0x00c1), top: B:11:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(com.bytedance.sdk.component.nps.fs fsVar, final String str, Boolean bool, com.bytedance.sdk.openadsdk.mw.hhw hhwVar) {
        String str2;
        Object obj;
        if (fsVar != null) {
            try {
                if (fsVar.hhw()) {
                    int zmn = fsVar.zmn();
                    Map<String, String> zn = fsVar.zn();
                    JSONObject jSONObject = new JSONObject();
                    if (zn != null) {
                        for (Map.Entry<String, String> entry : zn.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (key != null && value != null) {
                                jSONObject.put(key, value);
                            }
                        }
                    }
                    String fb = fsVar.fb() != null ? fsVar.fb() : "";
                    JSONObject jSONObject2 = null;
                    new Pair(Boolean.FALSE, null);
                    int i = -1;
                    if (!TextUtils.isEmpty(fb) && bool.booleanValue()) {
                        try {
                            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(fb);
                            try {
                                Pair<Boolean, JSONObject> fs = fs(jsonObjectInit);
                                if (!((Boolean) fs.first).booleanValue() || (obj = fs.second) == null) {
                                    jSONObject2 = jsonObjectInit;
                                } else {
                                    i = 4;
                                    r1 = 1;
                                    jSONObject2 = (JSONObject) obj;
                                }
                            } catch (JSONException e) {
                                e = e;
                                jSONObject2 = jsonObjectInit;
                                e.getMessage();
                                str2 = "body is not valid JSON";
                                int i2 = i;
                                if (r1 != 0) {
                                }
                                if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                                }
                                hhwVar.zmn(1, zmn, str2, jSONObject, r8, i2);
                                return;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    }
                    str2 = "";
                    int i22 = i;
                    Object obj2 = (r1 != 0 || jSONObject2 == null) ? fb : jSONObject2;
                    if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                        com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.rt.6
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("jsb_request");
                                if (!TextUtils.isEmpty(str)) {
                                    zmnVar.nps(str);
                                }
                                return zmnVar;
                            }
                        });
                    }
                    hhwVar.zmn(1, zmn, str2, jSONObject, obj2, i22);
                    return;
                }
            } catch (Exception e3) {
                if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.rt.8
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("jsb_request");
                            if (!TextUtils.isEmpty(str)) {
                                zmnVar.nps(str);
                            }
                            return zmnVar;
                        }
                    });
                }
                try {
                    hhwVar.zmn(1, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, e3.getMessage());
                    return;
                } catch (JSONException e4) {
                    com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "JSONException: " + e4.getMessage(), null, null);
                    return;
                }
            }
        }
        if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.rt.7
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("jsb_request");
                    if (!TextUtils.isEmpty(str)) {
                        zmnVar.nps(str);
                    }
                    return zmnVar;
                }
            });
        }
        hhwVar.zmn(1, fsVar != null ? fsVar.zmn() : 0, "HTTP error : response is empty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(String str, final String str2, com.bytedance.sdk.openadsdk.mw.hhw hhwVar) {
        if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.rt.9
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("jsb_request");
                    if (!TextUtils.isEmpty(str2)) {
                        zmnVar.nps(str2);
                    }
                    return zmnVar;
                }
            });
        }
        try {
            hhwVar.zmn(1, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, str);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.cyb.zmn.btk.fs("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "JSONException: " + e.getMessage(), null, null);
        }
    }

    private void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, final String str, final String str2) {
        if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.rt.10
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs(str);
                    if (!TextUtils.isEmpty(str2)) {
                        zmnVar.nps(str2);
                    }
                    return zmnVar;
                }
            });
        } else {
            znVar.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.rt.2
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs(str);
                    if (!TextUtils.isEmpty(str2)) {
                        zmnVar.nps(str2);
                    }
                    return zmnVar;
                }
            });
        }
    }
}
