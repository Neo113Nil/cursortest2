package com.bytedance.sdk.component.sUS.pvs.Jd.pvs;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import io.ktor.http.LinkHeader;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdLogEvent.java */
/* loaded from: classes.dex */
public class pvs implements com.bytedance.sdk.component.sUS.pvs.Jd.pvs {
    private byte Jd;
    private String Mxy;
    private long NB;
    private byte Wyp;
    private icD icD;
    private int kj;
    protected JSONObject pvs;
    private String qh;
    private long sUS;
    private String so;
    private byte vG;
    private long yiw;

    public pvs(String str, JSONObject jSONObject) {
        this.Mxy = str;
        this.pvs = jSONObject;
    }

    public pvs(String str, icD icd) {
        this.Mxy = str;
        this.icD = icd;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public icD pvs() {
        return this.icD;
    }

    private pvs() {
    }

    public String qh() {
        return this.qh;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public synchronized JSONObject yiw() {
        icD icd;
        if (this.pvs == null && (icd = this.icD) != null) {
            this.pvs = icd.pvs(qh());
        }
        return this.pvs;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public void pvs(JSONObject jSONObject) {
        this.pvs = jSONObject;
    }

    public static com.bytedance.sdk.component.sUS.pvs.Jd.pvs vG(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt(LinkHeader.Parameters.Type);
            int optInt2 = jSONObject.optInt("priority");
            pvs pvsVar = new pvs();
            pvsVar.pvs((byte) optInt);
            pvsVar.icD((byte) optInt2);
            pvsVar.pvs(jSONObject.optJSONObject(NotificationCompat.CATEGORY_EVENT));
            pvsVar.pvs(jSONObject.optString("localId"));
            pvsVar.icD(jSONObject.optString("genTime"));
            pvsVar.pvs(jSONObject.optInt("channel"));
            return pvsVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void vG(byte b) {
        this.Wyp = b;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public byte icD() {
        return this.Wyp;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public String vG() {
        return this.Mxy;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public byte Jd() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public void pvs(byte b) {
        this.vG = b;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public void pvs(String str) {
        this.Mxy = str;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public void icD(String str) {
        this.so = str;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public void pvs(long j) {
        this.NB = j;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public long so() {
        return this.NB;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public void icD(long j) {
        this.sUS = j;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public long Mxy() {
        return this.sUS;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public void vG(long j) {
        this.yiw = j;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public int Wyp() {
        return this.kj;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public void pvs(int i) {
        this.kj = i;
    }

    public String kj() {
        return this.so;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public void icD(byte b) {
        this.Jd = b;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public byte NB() {
        return this.Jd;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs
    public String sUS() {
        if (TextUtils.isEmpty(this.Mxy)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.Mxy);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, yiw());
            jSONObject.put("genTime", kj());
            jSONObject.put("priority", (int) this.Jd);
            jSONObject.put(LinkHeader.Parameters.Type, (int) this.vG);
            jSONObject.put("channel", this.kj);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
