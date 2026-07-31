package com.bytedance.adsdk.fs.fb;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.fs.klz;
import io.bidmachine.util.MimeTypes;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class zg {
    private final hhw fs;
    private final nps zmn;

    public zg(nps npsVar, hhw hhwVar) {
        this.zmn = npsVar;
        this.fs = hhwVar;
    }

    public klz<com.bytedance.adsdk.fs.nps> zmn(Context context, String str, String str2) {
        com.bytedance.adsdk.fs.nps fs = fs(context, str, str2);
        if (fs != null) {
            return new klz<>(fs);
        }
        return zn(context, str, str2);
    }

    private com.bytedance.adsdk.fs.nps fs(Context context, String str, String str2) {
        nps npsVar;
        Pair<zn, InputStream> zmn;
        klz<com.bytedance.adsdk.fs.nps> fs;
        if (str2 == null || (npsVar = this.zmn) == null || (zmn = npsVar.zmn(str)) == null) {
            return null;
        }
        zn znVar = (zn) zmn.first;
        InputStream inputStream = (InputStream) zmn.second;
        if (znVar == zn.ZIP) {
            fs = com.bytedance.adsdk.fs.zg.zmn(context, new ZipInputStream(inputStream), str2);
        } else {
            fs = com.bytedance.adsdk.fs.zg.fs(inputStream, str2);
        }
        if (fs.zmn() != null) {
            return fs.zmn();
        }
        return null;
    }

    private klz<com.bytedance.adsdk.fs.nps> zn(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                fb zmn = this.fs.zmn(str);
                if (zmn.zmn()) {
                    klz<com.bytedance.adsdk.fs.nps> zmn2 = zmn(context, str, zmn.fs(), zmn.zn(), str2);
                    zmn2.zmn();
                    try {
                        zmn.close();
                    } catch (IOException unused) {
                    }
                    return zmn2;
                }
                klz<com.bytedance.adsdk.fs.nps> klzVar = new klz<>(new IllegalArgumentException(zmn.fb()));
                try {
                    zmn.close();
                } catch (IOException unused2) {
                }
                return klzVar;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            klz<com.bytedance.adsdk.fs.nps> klzVar2 = new klz<>(e);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused4) {
                }
            }
            return klzVar2;
        }
    }

    private klz<com.bytedance.adsdk.fs.nps> zmn(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        klz<com.bytedance.adsdk.fs.nps> zmn;
        zn znVar;
        nps npsVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains(MimeTypes.APPLICATION_ZIP) || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            zn znVar2 = zn.ZIP;
            zmn = zmn(context, str, inputStream, str3);
            znVar = znVar2;
        } else {
            znVar = zn.JSON;
            zmn = zmn(str, inputStream, str3);
        }
        if (str3 != null && zmn.zmn() != null && (npsVar = this.zmn) != null) {
            npsVar.zmn(str, znVar);
        }
        return zmn;
    }

    private klz<com.bytedance.adsdk.fs.nps> zmn(Context context, String str, InputStream inputStream, String str2) throws IOException {
        nps npsVar;
        if (str2 == null || (npsVar = this.zmn) == null) {
            return com.bytedance.adsdk.fs.zg.zmn(context, new ZipInputStream(inputStream), (String) null);
        }
        return com.bytedance.adsdk.fs.zg.zmn(context, new ZipInputStream(new FileInputStream(npsVar.zmn(str, inputStream, zn.ZIP))), str);
    }

    private klz<com.bytedance.adsdk.fs.nps> zmn(String str, InputStream inputStream, String str2) throws IOException {
        nps npsVar;
        if (str2 == null || (npsVar = this.zmn) == null) {
            return com.bytedance.adsdk.fs.zg.fs(inputStream, (String) null);
        }
        return com.bytedance.adsdk.fs.zg.fs(new FileInputStream(npsVar.zmn(str, inputStream, zn.JSON).getAbsolutePath()), str);
    }
}
