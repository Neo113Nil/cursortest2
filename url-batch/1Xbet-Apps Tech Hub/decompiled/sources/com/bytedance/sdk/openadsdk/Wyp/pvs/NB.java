package com.bytedance.sdk.openadsdk.Wyp.pvs;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.bytedance.sdk.component.icD.pvs.IP;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.utils.ae;
import io.ktor.http.LinkHeader;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: RequestMonitor.java */
/* loaded from: classes2.dex */
public class NB {
    public static int pvs = -10;
    private long Jd;
    private boolean Mxy;
    private long NB;
    private String Wyp;
    private final int icD;
    private int qh;
    private long sUS;
    private int so;
    private String vG;
    private int yiw;

    public NB(int i) {
        this.icD = i;
    }

    public NB pvs(String str) {
        this.vG = str;
        return this;
    }

    public NB icD(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.yiw = bytes.length;
        }
        return this;
    }

    public NB pvs(IP ip) {
        if (ip != null) {
            if (ip.sUS == IP.pvs.STRING_TYPE && !TextUtils.isEmpty(ip.pvs())) {
                this.yiw = ip.pvs().getBytes().length;
            }
            if (ip.sUS == IP.pvs.BYTE_ARRAY_TYPE && ip.NB != null) {
                this.yiw = ip.NB.length;
            }
        }
        return this;
    }

    public void pvs() {
        this.Jd = SystemClock.elapsedRealtime();
    }

    public NB vG(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.so = bytes.length;
        }
        return this;
    }

    public NB pvs(int i) {
        this.qh = i;
        return this;
    }

    public void icD() {
        this.sUS = SystemClock.elapsedRealtime() - this.Jd;
    }

    public NB Jd(String str) {
        this.Wyp = str;
        return this;
    }

    public NB pvs(boolean z) {
        this.Mxy = z;
        return this;
    }

    public void vG() {
        this.NB = SystemClock.elapsedRealtime() - this.Jd;
        ae.vG().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Wyp.pvs.NB.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                pvs pvsVar;
                pvs pvsVar2;
                synchronized (NB.class) {
                    String icD = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("tt_sdk_req_monitor", "req_monitor_data", null);
                    try {
                        if (TextUtils.isEmpty(icD)) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(icD);
                        }
                    } catch (Exception e) {
                        Ju.icD(e.getMessage());
                    }
                    if (jSONObject.has(NB.this.vG)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject(NB.this.vG);
                        if (optJSONObject != null) {
                            pvsVar2 = pvs.pvs(optJSONObject);
                            pvsVar2.pvs(NB.this.Mxy, NB.this.NB, NB.this.yiw, NB.this.so, NB.this.qh);
                            jSONObject.put(NB.this.vG, pvsVar2.pvs());
                            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                        } else {
                            pvsVar = new pvs(NB.this.icD, NB.this.Mxy, NB.this.NB, NB.this.yiw, NB.this.so, NB.this.qh);
                        }
                    } else {
                        pvsVar = new pvs(NB.this.icD, NB.this.Mxy, NB.this.NB, NB.this.yiw, NB.this.so, NB.this.qh);
                    }
                    pvsVar2 = pvsVar;
                    jSONObject.put(NB.this.vG, pvsVar2.pvs());
                    com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                }
            }
        });
    }

    public static void Jd() {
        synchronized (NB.class) {
            long pvs2 = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_req_monitor", "req_monitor_las_req", 0L);
            if (pvs2 <= 0) {
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (System.currentTimeMillis() - pvs2 >= 86400000) {
                String icD = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("tt_sdk_req_monitor", "req_monitor_data", null);
                if (!TextUtils.isEmpty(icD)) {
                    com.bytedance.sdk.openadsdk.Wyp.vG.vG(icD);
                    com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_req_monitor");
                    com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    /* compiled from: RequestMonitor.java */
    private static class pvs {
        private long Jd;
        private long NB;
        private int icD;
        private int pvs;
        private int sUS;
        private final SparseIntArray so;
        private int vG;
        private int yiw;

        public pvs() {
            this.pvs = 0;
            this.icD = 0;
            this.vG = 0;
            this.Jd = 0L;
            this.NB = 0L;
            this.sUS = 0;
            this.yiw = 0;
            this.so = new SparseIntArray();
        }

        public pvs(int i, boolean z, long j, int i2, int i3, int i4) {
            this.pvs = 0;
            this.icD = 0;
            this.vG = 0;
            this.Jd = 0L;
            this.NB = 0L;
            this.sUS = 0;
            this.yiw = 0;
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.so = sparseIntArray;
            this.pvs = i;
            if (z) {
                this.icD++;
                this.Jd = j;
            } else {
                this.vG++;
                this.NB = j;
                sparseIntArray.put(i4, 1);
            }
            this.sUS = i2;
            this.yiw = i3;
        }

        public void pvs(boolean z, long j, int i, int i2, int i3) {
            if (!z) {
                this.so.put(i3, this.so.get(i3) + 1);
            }
            int i4 = this.icD;
            int i5 = this.vG;
            int i6 = i4 + i5;
            int i7 = (this.sUS * i6) + i;
            int i8 = i6 + 1;
            this.sUS = i7 / i8;
            this.yiw = ((this.yiw * i6) + i2) / i8;
            if (z) {
                long j2 = (this.Jd * i4) + j;
                int i9 = i4 + 1;
                this.icD = i9;
                this.Jd = j2 / i9;
                return;
            }
            long j3 = (this.NB * i5) + j;
            int i10 = i5 + 1;
            this.vG = i10;
            this.NB = j3 / i10;
        }

        public static pvs pvs(JSONObject jSONObject) {
            pvs pvsVar = new pvs();
            pvsVar.pvs = jSONObject.optInt(LinkHeader.Parameters.Type, 0);
            pvsVar.icD = jSONObject.optInt("suc_times", 0);
            pvsVar.vG = jSONObject.optInt("fail_times", 0);
            pvsVar.Jd = jSONObject.optLong("suc_duration", 0L);
            pvsVar.NB = jSONObject.optLong("fail_duration", 0L);
            pvsVar.sUS = jSONObject.optInt("req_size", 0);
            pvsVar.yiw = jSONObject.optInt("res_size", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject("codes");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    pvsVar.so.put(Integer.parseInt(next), optJSONObject.optInt(next));
                }
            }
            return pvsVar;
        }

        public JSONObject pvs() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(LinkHeader.Parameters.Type, this.pvs);
                jSONObject.put("suc_times", this.icD);
                jSONObject.put("fail_times", this.vG);
                jSONObject.put("suc_duration", this.Jd);
                jSONObject.put("fail_duration", this.NB);
                jSONObject.put("req_size", this.sUS);
                jSONObject.put("res_size", this.yiw);
                JSONObject jSONObject2 = new JSONObject();
                for (int i = 0; i < this.so.size(); i++) {
                    jSONObject2.put(String.valueOf(this.so.keyAt(i)), this.so.valueAt(i));
                }
                jSONObject.put("codes", jSONObject2);
            } catch (Exception e) {
                Ju.icD(e.getMessage());
            }
            return jSONObject;
        }
    }
}
