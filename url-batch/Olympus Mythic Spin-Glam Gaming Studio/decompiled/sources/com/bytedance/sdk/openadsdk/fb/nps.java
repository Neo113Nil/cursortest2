package com.bytedance.sdk.openadsdk.fb;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public class nps {
    private long btk;
    private long fb;
    private long fs;
    private long zmn;
    private long zn;

    public void zmn(long j) {
        if (this.zmn <= 0) {
            this.zmn = j;
        }
    }

    public void fs(long j) {
        if (this.fs <= 0) {
            this.fs = j;
        }
    }

    public void zn(long j) {
        if (this.zn <= 0) {
            this.zn = j;
        }
    }

    public void fb(long j) {
        if (this.fb <= 0) {
            this.fb = j;
        }
    }

    public void btk(long j) {
        if (this.btk <= 0) {
            this.btk = j;
        }
    }

    public boolean zmn() {
        return this.zmn > 0;
    }

    public void zmn(long j, float f) {
        if (f > 0.0f) {
            zmn(j);
        }
        double d = f;
        if (d >= 0.25d) {
            zmn(j);
            fs(j);
        }
        if (d >= 0.5d) {
            zmn(j);
            fs(j);
            zn(j);
        }
        if (d >= 0.75d) {
            zmn(j);
            fs(j);
            zn(j);
            fb(j);
        }
        if (f >= 1.0f) {
            zmn(j);
            fs(j);
            zn(j);
            fb(j);
            btk(j);
        }
    }

    public JSONObject fs() {
        return zmn((JSONObject) null);
    }

    public JSONObject zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j = this.zmn;
        if (j > 0) {
            jSONObject.put("show_start", j);
            long j2 = this.fs;
            if (j2 > 0) {
                jSONObject.put("show_firstQuartile", j2);
                long j3 = this.zn;
                if (j3 > 0) {
                    jSONObject.put("show_mid", j3);
                    long j4 = this.fb;
                    if (j4 > 0) {
                        jSONObject.put("show_thirdQuartile", j4);
                        long j5 = this.btk;
                        if (j5 > 0) {
                            jSONObject.put("show_full", j5);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
