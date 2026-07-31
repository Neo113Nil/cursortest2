package com.bytedance.sdk.openadsdk.component.btk;

import java.util.Comparator;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class fs {
    public static final Comparator<fs> zmn = new Comparator<fs>() { // from class: com.bytedance.sdk.openadsdk.component.btk.fs.1
        @Override // java.util.Comparator
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public int compare(fs fsVar, fs fsVar2) {
            if (fsVar.btk() != fsVar2.btk()) {
                return Long.compare(fsVar2.btk(), fsVar.btk());
            }
            return Long.compare(fsVar2.zn(), fsVar.zn());
        }
    };
    private final long btk;
    private final long fb;
    private final String fs;
    private final long hhw;
    private final String nps;
    private final String zn;

    public fs(String str, String str2, long j, long j2, long j3, String str3) {
        this.fs = str;
        this.zn = str2;
        this.fb = j;
        this.btk = j2;
        this.hhw = j3;
        this.nps = str3;
    }

    public static fs zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new fs(jSONObject.optString("rit"), jSONObject.optString("material"), jSONObject.optLong("expire_time"), jSONObject.optLong("create_time"), jSONObject.optLong("price"), jSONObject.optString("req_id"));
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject zmn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("rit", this.fs);
            jSONObject.putOpt("material", this.zn);
            jSONObject.putOpt("expire_time", Long.valueOf(this.fb));
            jSONObject.putOpt("create_time", Long.valueOf(this.btk));
            jSONObject.putOpt("price", Long.valueOf(this.hhw));
            jSONObject.putOpt("req_id", this.nps);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String fs() {
        return this.zn;
    }

    public long zn() {
        return this.fb;
    }

    public long fb() {
        return this.btk;
    }

    public long btk() {
        return this.hhw;
    }

    public String hhw() {
        return this.nps;
    }

    public String toString() {
        return "AdCache{mRit=" + this.fs + ", mExpireTime=" + this.fb + ", mCreateTime=" + this.btk + ", mPrice=" + this.hhw + ", mReqId='" + this.nps + '}';
    }
}
