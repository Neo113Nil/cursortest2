package com.bytedance.sdk.component.adexpress.zmn.fs;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.fb.bvs;
import com.bytedance.sdk.component.adexpress.zmn.zn.zmn;
import com.ironsource.B5;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class fs {
    static Object zmn = new Object();

    public static void zmn() {
        btk.fs();
    }

    public static void fs() {
        try {
            zg.fb();
            File zg = btk.zg();
            if (zg == null || !zg.exists()) {
                return;
            }
            if (zg.getParentFile() != null) {
                com.bytedance.sdk.component.utils.nps.zn(zg.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.nps.zn(zg);
            }
        } catch (Throwable unused) {
        }
    }

    public static String zn() {
        return hhw.zn();
    }

    public static com.bytedance.sdk.component.adexpress.zmn.zn.fs zmn(String str) {
        return nps.zmn().zmn(str);
    }

    public static void zmn(com.bytedance.sdk.component.adexpress.zmn.zn.fb fbVar) {
        nps.zmn().zmn(fbVar, fbVar.hhw);
    }

    public static Set<String> fs(String str) {
        return nps.zmn().fs(str);
    }

    public static com.bytedance.sdk.component.adexpress.zmn.zn.fs zn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.zmn.zn.fs zmn2 = nps.zmn().zmn(str);
        if (zmn2 != null) {
            zmn2.zmn(Long.valueOf(System.currentTimeMillis()));
            zmn(zmn2);
        }
        return zmn2;
    }

    private static void zmn(final com.bytedance.sdk.component.adexpress.zmn.zn.fs fsVar) {
        com.bytedance.sdk.component.adexpress.fb.fb.zmn(new com.bytedance.sdk.component.zg.fs.zn("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.zmn.fs.fs.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (fs.zmn) {
                    hhw.zmn().zmn(fsVar, true);
                }
            }
        }, 10);
    }

    public static com.bytedance.sdk.component.adexpress.zmn.zn.zmn fb() {
        return btk.fs().hhw();
    }

    private static String hhw() {
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn fb = fb();
        if (fb == null) {
            return null;
        }
        return fb.fb();
    }

    public static String fb(String str) {
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar;
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn fb = fb();
        if (fb == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> zmn2 = fb.zmn();
            if (zmn2 == null || zmn2.size() <= 0 || (zmnVar = zmn2.get(str)) == null) {
                return null;
            }
            return zmnVar.fb();
        }
        return hhw();
    }

    public static boolean btk() {
        return btk.fs().btk();
    }

    public static zmn zmn(String str, bvs.zmn zmnVar, String str2, String str3) {
        File file;
        zmn zmnVar2 = new zmn();
        if (TextUtils.isEmpty(str3)) {
            file = null;
        } else {
            file = fs(str3, str);
            if (file != null) {
                zmnVar2.zmn(1);
            }
        }
        if (file == null && (file = nps(str)) != null) {
            zmnVar2.zmn(3);
        }
        if (file == null && (file = hhw(str)) != null) {
            zmnVar2.zmn(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!zmn(str, str3)) {
                zmnVar2.zmn(4);
            }
        } else if (!btk(str)) {
            zmnVar2.zmn(6);
        }
        zmnVar2.fs();
        if (file != null) {
            try {
                zmnVar2.zmn(new WebResourceResponse(zmnVar.zmn(), B5.O, new FileInputStream(file)));
            } catch (Throwable unused) {
            }
        }
        return zmnVar2;
    }

    private static boolean zmn(String str, String str2) {
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn fb;
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar;
        if (!btk() || (fb = fb()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> zmn2 = fb.zmn();
        if (zmn2.size() == 0 || (zmnVar = zmn2.get(str2)) == null) {
            return false;
        }
        for (zmn.C0126zmn c0126zmn : zmnVar.hhw()) {
            if (c0126zmn != null && TextUtils.equals(str, c0126zmn.zmn())) {
                return true;
            }
        }
        return false;
    }

    private static boolean btk(String str) {
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn fb;
        List<zmn.C0126zmn> hhw;
        if (!btk() || (fb = fb()) == null || (hhw = fb.hhw()) == null) {
            return false;
        }
        for (zmn.C0126zmn c0126zmn : hhw) {
            if (c0126zmn != null && TextUtils.equals(str, c0126zmn.zmn())) {
                return true;
            }
        }
        return false;
    }

    private static File hhw(String str) {
        if (!btk()) {
            return null;
        }
        for (zmn.C0126zmn c0126zmn : fb().hhw()) {
            if (c0126zmn.zmn() != null && c0126zmn.zmn().equals(str)) {
                File file = new File(btk.zg(), com.bytedance.sdk.component.utils.btk.zmn(c0126zmn.zmn()));
                String zmn2 = com.bytedance.sdk.component.utils.btk.zmn(file);
                if (c0126zmn.fs() == null || !c0126zmn.fs().equals(zmn2)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    private static File nps(String str) {
        List<Pair<String, String>> fs;
        zmn.fs btk = fb().btk();
        if (btk == null || (fs = btk.fs()) == null || fs.size() <= 0) {
            return null;
        }
        for (Pair<String, String> pair : fs) {
            Object obj = pair.second;
            if (obj != null && ((String) obj).equals(str)) {
                return new File(btk.zg(), (String) pair.first);
            }
        }
        return null;
    }

    private static File fs(String str, String str2) {
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar;
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn fb = fb();
        if (fb == null || !btk()) {
            return null;
        }
        Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> zmn2 = fb.zmn();
        if (zmn2.size() == 0 || (zmnVar = zmn2.get(str)) == null) {
            return null;
        }
        for (zmn.C0126zmn c0126zmn : zmnVar.hhw()) {
            if (c0126zmn.zmn() != null && c0126zmn.zmn().equals(str2)) {
                File file = new File(btk.zg(), com.bytedance.sdk.component.utils.btk.zmn(c0126zmn.zmn()));
                String zmn3 = com.bytedance.sdk.component.utils.btk.zmn(file);
                if (c0126zmn.fs() == null || !c0126zmn.fs().equals(zmn3)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static boolean zmn(JSONObject jSONObject) {
        Object opt;
        return (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) ? false : true;
    }

    public static boolean fs(JSONObject jSONObject) {
        Object opt;
        return (jSONObject == null || (opt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(opt.toString())) ? false : true;
    }
}
