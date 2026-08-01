package com.bytedance.sdk.component.adexpress.pvs.icD;

import com.bytedance.sdk.component.utils.Ju;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* compiled from: Version.java */
/* loaded from: classes.dex */
public class so {
    private static com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvs;

    public static void pvs() {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(NB.so(), "temp_pkg_info.json");
            Long valueOf = Long.valueOf(file.length());
            if (valueOf.longValue() > 0 && file.exists() && file.isFile()) {
                byte[] bArr = new byte[valueOf.intValue()];
                fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvs2 = com.bytedance.sdk.component.adexpress.pvs.vG.pvs.pvs(new JSONObject(new String(bArr, "utf-8")));
                    if (pvs2 != null) {
                        pvs = pvs2;
                        pvs.vG();
                    }
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Ju.pvs("Version", "version init error", th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th3;
                    }
                }
            }
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
        }
    }

    public static synchronized com.bytedance.sdk.component.adexpress.pvs.vG.pvs icD() {
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar;
        synchronized (so.class) {
            pvsVar = pvs;
        }
        return pvsVar;
    }

    public static synchronized void pvs(com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar) {
        synchronized (so.class) {
            if (pvsVar != null) {
                if (pvsVar.yiw()) {
                    pvs = pvsVar;
                }
            }
        }
    }

    public static void vG() {
        NB.pvs(NB.so(), icD(), "temp_pkg_info.json");
    }

    public static boolean pvs(String str) {
        return NB.pvs(icD(), str);
    }

    public static boolean icD(com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar) {
        return NB.vG(icD(), pvsVar);
    }

    public static void Jd() {
        NB.icD(NB.so(), icD(), "temp_pkg_info.json");
        pvs = null;
    }
}
