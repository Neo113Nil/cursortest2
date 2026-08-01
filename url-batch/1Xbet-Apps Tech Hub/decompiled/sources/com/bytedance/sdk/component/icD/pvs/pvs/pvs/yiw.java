package com.bytedance.sdk.component.icD.pvs.pvs.pvs;

import android.text.TextUtils;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.Wyp;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.kj;
import com.bytedance.sdk.component.icD.pvs.mnm;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: NetResponse.java */
/* loaded from: classes.dex */
public class yiw extends bNS {
    public static int pvs = -1;
    int Jd;
    String NB;
    HttpURLConnection icD;
    Ju vG;

    @Override // com.bytedance.sdk.component.icD.pvs.bNS
    public long icD() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.bNS
    public long pvs() {
        return 0L;
    }

    public String toString() {
        return "";
    }

    public yiw(HttpURLConnection httpURLConnection, Ju ju) {
        this.Jd = pvs;
        this.icD = httpURLConnection;
        this.vG = ju;
    }

    public yiw(int i, String str, Ju ju) {
        this.NB = str;
        this.vG = ju;
        this.Jd = i;
    }

    public Ju Wyp() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.bNS
    public int vG() {
        try {
            return this.icD.getResponseCode();
        } catch (Exception unused) {
            return this.Jd;
        }
    }

    @Override // com.bytedance.sdk.component.icD.pvs.bNS
    public boolean Jd() {
        return vG() >= 200 && vG() < 300;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.bNS
    public String NB() throws IOException {
        if (!TextUtils.isEmpty(this.NB)) {
            return this.NB;
        }
        return this.icD.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.icD.pvs.bNS
    public mnm sUS() {
        so soVar;
        Ju ju = this.vG;
        if (ju != null && ju.icD != null) {
            this.vG.icD.qh();
        }
        try {
            try {
                soVar = new so(this.icD);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
                soVar = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.icD;
            soVar = new so(httpURLConnection, httpURLConnection.getErrorStream());
        }
        Ju ju2 = this.vG;
        if (ju2 != null && ju2.icD != null) {
            this.vG.icD.Ju();
        }
        return soVar;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.bNS
    public com.bytedance.sdk.component.icD.pvs.sUS yiw() {
        if (this.icD == null) {
            return new com.bytedance.sdk.component.icD.pvs.sUS(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.icD.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(entry.getKey()) || vG() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.icD.pvs.sUS((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public String pvs(String str) {
        HttpURLConnection httpURLConnection = this.icD;
        return httpURLConnection == null ? "" : httpURLConnection.getHeaderField(str);
    }

    @Override // com.bytedance.sdk.component.icD.pvs.bNS
    public String pvs(String str, String str2) {
        return !TextUtils.isEmpty(pvs(str)) ? pvs(str) : str2;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.bNS, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            sUS().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.icD.pvs.bNS
    public kj so() {
        return kj.HTTP_1_1;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.bNS
    public Wyp Mxy() {
        if (Wyp() == null || Wyp().icD == null) {
            return null;
        }
        return new Wyp(Wyp().icD);
    }
}
