package com.bytedance.sdk.component.fs.zmn.zmn.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.component.fs.zmn.cn;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.rt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class zg extends rt {
    public static int fs = -2;
    public static int zmn = -1;
    final int btk;
    klz fb;
    String hhw;
    String nps;
    HttpURLConnection zn;

    @Override // com.bytedance.sdk.component.fs.zmn.rt
    public long fs() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rt
    public long zmn() {
        return 0L;
    }

    public void zmn(String str) {
        this.nps = str;
    }

    public zg(HttpURLConnection httpURLConnection, klz klzVar, int i) {
        this.zn = httpURLConnection;
        this.fb = klzVar;
        this.btk = i;
    }

    public zg(int i, String str, klz klzVar) {
        this.hhw = str;
        this.fb = klzVar;
        this.btk = i;
    }

    public zg(int i, String str, klz klzVar, String str2) {
        this.hhw = str;
        this.fb = klzVar;
        this.btk = i;
        this.nps = str2;
    }

    public klz rc() {
        return this.fb;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rt
    public int zn() {
        return this.btk;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rt
    public boolean fb() {
        int i = this.btk;
        return i >= 200 && i < 300;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rt
    public String btk() throws IOException {
        if (!TextUtils.isEmpty(this.hhw)) {
            return this.hhw;
        }
        return this.zn.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rt
    public cn hhw() {
        bvs bvsVar;
        com.bytedance.sdk.component.zn.zmn.zmn zmnVar;
        com.bytedance.sdk.component.zn.zmn.zmn zmnVar2;
        klz klzVar = this.fb;
        if (klzVar != null && (zmnVar2 = klzVar.fs) != null) {
            zmnVar2.rc();
        }
        try {
            try {
                bvsVar = new bvs(this.zn);
            } catch (Exception unused) {
                HttpURLConnection httpURLConnection = this.zn;
                bvsVar = new bvs(httpURLConnection, httpURLConnection.getErrorStream());
            }
        } catch (Throwable th) {
            th.getMessage();
            bvsVar = null;
        }
        klz klzVar2 = this.fb;
        if (klzVar2 != null && (zmnVar = klzVar2.fs) != null) {
            zmnVar.mw();
        }
        return bvsVar;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rt
    public com.bytedance.sdk.component.fs.zmn.hhw nps() {
        if (this.zn == null) {
            return new com.bytedance.sdk.component.fs.zmn.hhw(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.zn.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || zn() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.fs.zmn.hhw((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rt, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            hhw().close();
        } catch (Exception unused) {
        }
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rt
    public com.bytedance.sdk.component.fs.zmn.iv zg() {
        if (rc() == null || rc().fs == null) {
            return null;
        }
        return new com.bytedance.sdk.component.fs.zmn.iv(rc().fs);
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rt
    public String bvs() {
        return this.nps;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rt
    public Map<String, List<String>> iv() {
        HttpURLConnection httpURLConnection = this.zn;
        if (httpURLConnection == null) {
            return new HashMap();
        }
        return httpURLConnection.getHeaderFields();
    }
}
