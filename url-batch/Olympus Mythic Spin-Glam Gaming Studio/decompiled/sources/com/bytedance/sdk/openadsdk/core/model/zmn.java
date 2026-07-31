package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class zmn {
    private nqi btk;
    private int bvs;
    private int fs;
    private bjh hhw;
    private doe iv;
    private nqi klz;
    private String rc;
    private String zmn;
    private String zn;
    private List<nqi> fb = new ArrayList();
    private JSONObject nps = new JSONObject();
    private volatile boolean zg = false;

    public JSONObject zmn() {
        return this.nps;
    }

    public void zmn(JSONObject jSONObject) {
        this.nps = jSONObject;
    }

    public String fs() {
        return this.zmn;
    }

    public String zn() {
        nqi nps = nps();
        if (nps != null) {
            return nps.wbj();
        }
        return "";
    }

    public void zmn(String str) {
        this.zmn = str;
    }

    public int fb() {
        return this.fs;
    }

    public void zmn(int i) {
        this.fs = i;
    }

    public void fs(String str) {
        this.zn = str;
    }

    public List<nqi> btk() {
        return this.fb;
    }

    public void zmn(nqi nqiVar) {
        this.fb.add(nqiVar);
        if (this.klz == null) {
            this.klz = nqiVar;
        }
    }

    public void zmn(List<nqi> list) {
        this.fb = list;
        if (list.isEmpty()) {
            return;
        }
        this.klz = list.get(0);
    }

    public static Map<String, nqi> zmn(zmn zmnVar) {
        if (zmnVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (nqi nqiVar : zmnVar.btk()) {
            if (!TextUtils.isEmpty(nqiVar.ltf())) {
                hashMap.put(nqiVar.ltf(), nqiVar);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    public boolean hhw() {
        List<nqi> list = this.fb;
        return list != null && list.size() > 0;
    }

    public nqi nps() {
        if (this.fb.size() > 0) {
            return this.fb.get(0);
        }
        return null;
    }

    public doe zg() {
        return this.iv;
    }

    public void zmn(doe doeVar) {
        this.iv = doeVar;
    }

    public void fs(int i) {
        this.bvs = i;
    }

    public boolean bvs() {
        return this.bvs == 1;
    }

    public nqi iv() {
        return this.klz;
    }

    public void zmn(bjh bjhVar) {
        this.hhw = bjhVar;
    }

    public bjh rc() {
        return this.hhw;
    }

    public static zmn fs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            zmn zmnVar = new zmn();
            zmnVar.zmn(doe.zmn(jSONObject.optJSONObject("loop_config")));
            zmnVar.fs(jSONObject.optInt("multi_ad_style", 0));
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    nqi zmn = com.bytedance.sdk.openadsdk.core.fs.zmn(optJSONArray.optJSONObject(i), null, null, zmnVar, i);
                    if (zmn != null) {
                        arrayList.add(zmn);
                    }
                }
                zmnVar.zmn(arrayList);
            }
            zmnVar.zmn(jSONObject.optString("request_id", ""));
            String optString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(optString)) {
                zmnVar.zmn(bjh.zmn(optString));
            }
            return zmnVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn(c.a, "fromJson: ", th);
            return null;
        }
    }

    public void zn(String str) {
        this.rc = str;
    }

    public String klz() {
        return this.rc;
    }

    public nqi mw() {
        return this.btk;
    }

    public void fs(nqi nqiVar) {
        this.btk = nqiVar;
    }
}
