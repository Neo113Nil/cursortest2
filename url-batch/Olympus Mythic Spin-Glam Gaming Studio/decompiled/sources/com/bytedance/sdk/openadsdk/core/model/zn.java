package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zn {
    public AdSlot btk;
    public ArrayList<Integer> fb;
    public int fs;
    public String hhw;
    public int nps;
    public String zmn;
    public int zn = 1;

    public String zmn() {
        return this.zmn;
    }

    public void zmn(String str) {
        this.zmn = str;
    }

    public int fs() {
        return this.fs;
    }

    public void zmn(int i) {
        this.fs = i;
    }

    public int zn() {
        return this.zn;
    }

    public void fs(int i) {
        this.zn = i;
    }

    public AdSlot fb() {
        return this.btk;
    }

    public void zmn(AdSlot adSlot) {
        this.btk = adSlot;
    }

    public ArrayList<Integer> btk() {
        return this.fb;
    }

    public void zmn(ArrayList<Integer> arrayList) {
        this.fb = arrayList;
    }

    public void fs(String str) {
        this.hhw = str;
    }

    public void zn(int i) {
        this.nps = i;
    }

    public static void zmn(zn znVar) {
        int fs;
        if (znVar == null || znVar.fb() == null || (fs = znVar.fs()) >= 0 || fs == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.model.zn.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", zn.this.zn());
                jSONObject.put("err_code", zn.this.fs());
                jSONObject.put("err_msg", zn.this.hhw);
                jSONObject.put("ext_from", zn.this.nps);
                jSONObject.put("server_res_str", zn.this.zmn());
                if (zn.this.btk() != null && zn.this.btk().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) zn.this.btk()).toString());
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("rd_client_custom_error").zmn(zn.this.fb().getDurationSlotType()).fs(jSONObject.toString());
            }
        });
    }
}
