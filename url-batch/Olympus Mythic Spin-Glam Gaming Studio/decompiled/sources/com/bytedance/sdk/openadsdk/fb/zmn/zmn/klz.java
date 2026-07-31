package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import android.text.TextUtils;
import com.bytedance.zmn.zn;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class klz extends com.bytedance.zmn.fs<rc> {
    @Override // com.bytedance.zmn.fs
    public void zmn(ArrayList<rc> arrayList, zn.fs<rc> fsVar) {
        fb.fs(arrayList, fsVar);
    }

    @Override // com.bytedance.zmn.fs
    public String fb() {
        return "stats_log_event";
    }

    @Override // com.bytedance.zmn.fs
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public rc zmn(String str, byte[] bArr, int i, int i2) {
        rc rcVar;
        JSONObject jSONObject;
        try {
            rcVar = new rc(str, PangleNetworkBridge.jsonObjectInit(new String(bArr, StandardCharsets.UTF_8)));
            try {
                rcVar.zmn(i);
                rcVar.fs(i2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            rcVar = null;
        }
        if (rcVar == null) {
            return null;
        }
        try {
            JSONObject zn = rcVar.zn();
            String optString = zn.optString("event_extra");
            if (!TextUtils.isEmpty(optString)) {
                jSONObject = PangleNetworkBridge.jsonObjectInit(optString);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.putOpt("_reqc", Integer.valueOf(rcVar.btk()));
            zn.putOpt("event_extra", jSONObject.toString());
        } catch (Throwable unused3) {
        }
        return rcVar;
    }

    @Override // com.bytedance.zmn.fs
    public long zmn() {
        return zn.zmn().fs().zmn;
    }

    @Override // com.bytedance.zmn.fs
    public int fs() {
        return zn.zmn().fs().fs;
    }

    @Override // com.bytedance.zmn.fs
    public long btk() {
        return zn.zmn().fs().zn;
    }

    @Override // com.bytedance.zmn.fs
    public zn.InterfaceC0213zn nps() {
        return fs.zmn();
    }

    @Override // com.bytedance.zmn.fs
    public int zg() {
        return zn.zmn().fs().hhw;
    }

    @Override // com.bytedance.zmn.fs
    public int bvs() {
        return zn.zmn().fs().nps;
    }

    @Override // com.bytedance.zmn.fs
    public long iv() {
        return zn.zmn().fs().zg;
    }

    @Override // com.bytedance.zmn.fs
    public boolean hhw() {
        return fs.fs();
    }
}
