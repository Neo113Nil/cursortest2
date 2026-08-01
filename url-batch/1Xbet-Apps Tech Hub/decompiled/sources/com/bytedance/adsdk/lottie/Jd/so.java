package com.bytedance.adsdk.lottie.Jd;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.lottie.qh;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* compiled from: NetworkFetcher.java */
/* loaded from: classes.dex */
public class so {
    private final sUS icD;
    private final yiw pvs;

    public so(yiw yiwVar, sUS sus) {
        this.pvs = yiwVar;
        this.icD = sus;
    }

    public qh<com.bytedance.adsdk.lottie.sUS> pvs(Context context, String str, String str2) {
        com.bytedance.adsdk.lottie.sUS icD = icD(context, str, str2);
        if (icD != null) {
            return new qh<>(icD);
        }
        return vG(context, str, str2);
    }

    private com.bytedance.adsdk.lottie.sUS icD(Context context, String str, String str2) {
        yiw yiwVar;
        Pair<vG, InputStream> pvs;
        qh<com.bytedance.adsdk.lottie.sUS> icD;
        if (str2 == null || (yiwVar = this.pvs) == null || (pvs = yiwVar.pvs(str)) == null) {
            return null;
        }
        vG vGVar = (vG) pvs.first;
        InputStream inputStream = (InputStream) pvs.second;
        if (vGVar == vG.ZIP) {
            icD = com.bytedance.adsdk.lottie.yiw.pvs(context, new ZipInputStream(inputStream), str2);
        } else {
            icD = com.bytedance.adsdk.lottie.yiw.icD(inputStream, str2);
        }
        if (icD.pvs() != null) {
            return icD.pvs();
        }
        return null;
    }

    private qh<com.bytedance.adsdk.lottie.sUS> vG(Context context, String str, String str2) {
        Jd jd = null;
        try {
            try {
                Jd pvs = this.icD.pvs(str);
                if (pvs.pvs()) {
                    qh<com.bytedance.adsdk.lottie.sUS> pvs2 = pvs(context, str, pvs.icD(), pvs.vG(), str2);
                    pvs2.pvs();
                    if (pvs != null) {
                        try {
                            pvs.close();
                        } catch (IOException unused) {
                        }
                    }
                    return pvs2;
                }
                qh<com.bytedance.adsdk.lottie.sUS> qhVar = new qh<>(new IllegalArgumentException(pvs.Jd()));
                if (pvs != null) {
                    try {
                        pvs.close();
                    } catch (IOException unused2) {
                    }
                }
                return qhVar;
            } catch (Exception e) {
                qh<com.bytedance.adsdk.lottie.sUS> qhVar2 = new qh<>(e);
                if (0 != 0) {
                    try {
                        jd.close();
                    } catch (IOException unused3) {
                    }
                }
                return qhVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    jd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private qh<com.bytedance.adsdk.lottie.sUS> pvs(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        qh<com.bytedance.adsdk.lottie.sUS> pvs;
        vG vGVar;
        yiw yiwVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            vG vGVar2 = vG.ZIP;
            pvs = pvs(context, str, inputStream, str3);
            vGVar = vGVar2;
        } else {
            vGVar = vG.JSON;
            pvs = pvs(str, inputStream, str3);
        }
        if (str3 != null && pvs.pvs() != null && (yiwVar = this.pvs) != null) {
            yiwVar.pvs(str, vGVar);
        }
        return pvs;
    }

    private qh<com.bytedance.adsdk.lottie.sUS> pvs(Context context, String str, InputStream inputStream, String str2) throws IOException {
        yiw yiwVar;
        if (str2 == null || (yiwVar = this.pvs) == null) {
            return com.bytedance.adsdk.lottie.yiw.pvs(context, new ZipInputStream(inputStream), (String) null);
        }
        return com.bytedance.adsdk.lottie.yiw.pvs(context, new ZipInputStream(new FileInputStream(yiwVar.pvs(str, inputStream, vG.ZIP))), str);
    }

    private qh<com.bytedance.adsdk.lottie.sUS> pvs(String str, InputStream inputStream, String str2) throws IOException {
        yiw yiwVar;
        if (str2 == null || (yiwVar = this.pvs) == null) {
            return com.bytedance.adsdk.lottie.yiw.icD(inputStream, (String) null);
        }
        return com.bytedance.adsdk.lottie.yiw.icD(new FileInputStream(yiwVar.pvs(str, inputStream, vG.JSON).getAbsolutePath()), str);
    }
}
