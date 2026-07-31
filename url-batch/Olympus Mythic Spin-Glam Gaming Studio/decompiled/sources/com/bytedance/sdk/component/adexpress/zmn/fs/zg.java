package com.bytedance.sdk.component.adexpress.zmn.fs;

import com.ironsource.B5;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes10.dex */
public class zg {
    private static com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmn;

    public static void zmn() {
        FileInputStream fileInputStream = null;
        try {
            File file = new File(btk.zg(), "temp_pkg_info.json");
            long length = file.length();
            Long valueOf = Long.valueOf(length);
            if (length > 0 && file.exists() && file.isFile()) {
                byte[] bArr = new byte[valueOf.intValue()];
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    fileInputStream2.read(bArr);
                    com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmn2 = com.bytedance.sdk.component.adexpress.zmn.zn.zmn.zmn(PangleNetworkBridge.jsonObjectInit(new String(bArr, B5.O)));
                    if (zmn2 != null) {
                        zmn = zmn2;
                        zmn.zn();
                    }
                    fileInputStream = fileInputStream2;
                } catch (Throwable unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                            return;
                        } catch (IOException unused2) {
                            return;
                        }
                    }
                    return;
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public static synchronized com.bytedance.sdk.component.adexpress.zmn.zn.zmn fs() {
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar;
        synchronized (zg.class) {
            zmnVar = zmn;
        }
        return zmnVar;
    }

    public static synchronized void zmn(com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar) {
        synchronized (zg.class) {
            if (zmnVar != null) {
                if (zmnVar.zg()) {
                    zmn = zmnVar;
                }
            }
        }
    }

    public static void zn() {
        zn.zmn(btk.zg(), fs(), "temp_pkg_info.json");
    }

    public static boolean zmn(String str) {
        return zn.zmn(fs(), str);
    }

    public static boolean fs(com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar) {
        return zn.zn(fs(), zmnVar);
    }

    public static void fb() {
        zn.fs(btk.zg(), fs(), "temp_pkg_info.json");
        zmn = null;
    }
}
