package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import android.text.TextUtils;
import com.bytedance.zmn.zn;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class zmn extends com.bytedance.zmn.fs<bvs> {
    @Override // com.bytedance.zmn.fs
    public void zmn(ArrayList<bvs> arrayList, zn.fs<bvs> fsVar) {
        fb.zmn(arrayList, fsVar);
    }

    @Override // com.bytedance.zmn.fs
    public String fb() {
        return "app_log_event";
    }

    @Override // com.bytedance.zmn.fs
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public bvs zmn(String str, byte[] bArr, int i, int i2) {
        bvs bvsVar;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            bvsVar = new bvs(str, PangleNetworkBridge.jsonObjectInit(new String(bArr, StandardCharsets.UTF_8)));
            try {
                bvsVar.zmn(i);
                bvsVar.fs(i2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            bvsVar = null;
        }
        if (bvsVar == null) {
            return null;
        }
        try {
            JSONObject zn = bvsVar.zn();
            String optString = zn.optString("ad_extra_data");
            if (!TextUtils.isEmpty(optString)) {
                jSONObject = PangleNetworkBridge.jsonObjectInit(optString);
            } else {
                jSONObject = new JSONObject();
            }
            String optString2 = jSONObject.optString("pag_json_data");
            if (!TextUtils.isEmpty(optString2)) {
                jSONObject2 = PangleNetworkBridge.jsonObjectInit(optString2);
            } else {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.putOpt("_reqc", Integer.valueOf(bvsVar.btk()));
            jSONObject.putOpt("pag_json_data", jSONObject2.toString());
            zn.putOpt("ad_extra_data", jSONObject.toString());
        } catch (Throwable unused3) {
        }
        return bvsVar;
    }

    @Override // com.bytedance.zmn.fs
    public long zmn() {
        return zn.zmn().zmn().zmn;
    }

    @Override // com.bytedance.zmn.fs
    public int fs() {
        return zn.zmn().zmn().fs;
    }

    @Override // com.bytedance.zmn.fs
    public long btk() {
        return zn.zmn().zmn().zn;
    }

    @Override // com.bytedance.zmn.fs
    public zn.InterfaceC0213zn nps() {
        return fs.zmn();
    }

    @Override // com.bytedance.zmn.fs
    public int zg() {
        return zn.zmn().zmn().hhw;
    }

    @Override // com.bytedance.zmn.fs
    public int bvs() {
        return zn.zmn().zmn().nps;
    }

    @Override // com.bytedance.zmn.fs
    public long iv() {
        return zn.zmn().zmn().zg;
    }

    @Override // com.bytedance.zmn.fs
    public boolean hhw() {
        return fs.fs();
    }
}
