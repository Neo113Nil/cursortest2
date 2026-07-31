package com.bytedance.sdk.openadsdk.doe.zmn;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.cyb;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.yj;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.settings.nps;
import com.bytedance.sdk.openadsdk.doe.fs.zmn;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.bytedance.sdk.openadsdk.utils.nu;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class zn {
    private static volatile zn zmn;
    private final Set<String> btk = Collections.synchronizedSet(new HashSet());
    private String fb;
    private String fs;
    private String zn;

    public static zn zmn() {
        if (zmn == null) {
            synchronized (zn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public void zmn(Map<String, String> map) {
        File[] listFiles;
        if (nps.zmn()) {
            String hhw = hhw();
            if (!TextUtils.isEmpty(hhw)) {
                File file = new File(hhw);
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2 != null) {
                            try {
                                File zmn2 = com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn(file2);
                                if (zmn2 != null && zmn2.exists()) {
                                    map.put(file2.getName(), zmn2.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int zmn3 = btk.zmn("plb_res_delay_fetch_time", 0);
            if (zmn3 <= 0) {
                zn();
            } else {
                cn.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zn.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zn.this.zn();
                    }
                }, zmn3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn() {
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zn.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.doe.fs.zmn fs = com.bytedance.sdk.openadsdk.doe.fs.zmn.fs(com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("pag_plb_config", "model", ""));
                if (fs != null) {
                    zn.this.zmn(fs, null, 0);
                }
            }
        });
    }

    public void fs() {
        if (!nps.zmn() || com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("pag_plb_config", "last_update_time", 0L);
        final String zmn2 = btk.zmn("plb_res", "");
        long zmn3 = btk.zmn("plb_res_fetch_interval", 3600000);
        if (zmn3 <= 0 || zmn3 > 259200000) {
            zmn3 = 3600000;
        }
        if (currentTimeMillis < zmn3 || TextUtils.isEmpty(zmn2)) {
            return;
        }
        int zmn4 = btk.zmn("plb_res_delay_fetch_time", 0);
        if (zmn4 <= 0) {
            fs(zmn2);
        } else {
            cn.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zn.3
                @Override // java.lang.Runnable
                public void run() {
                    zn.this.fs(zmn2);
                }
            }, zmn4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(final String str) {
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zn.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.nps.fs.fs zn = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zn();
                try {
                    zn.zn(com.bytedance.sdk.openadsdk.bvs.fb.zmn(zn, str));
                    com.bytedance.sdk.component.nps.fs btk = zn.btk();
                    if (btk == null || !btk.hhw()) {
                        return;
                    }
                    String fb = btk.fb();
                    com.bytedance.sdk.openadsdk.doe.fs.zmn fs = com.bytedance.sdk.openadsdk.doe.fs.zmn.fs(fb);
                    com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (fs != null) {
                        com.bytedance.sdk.openadsdk.doe.fs.zmn fs2 = com.bytedance.sdk.openadsdk.doe.fs.zmn.fs(com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("pag_plb_config", "model", ""));
                        if (fs2 != null && fs.zmn().equals(fs2.zmn())) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("pag_plb_config", "model", fb);
                        zn.this.zmn(fs, fs2, 1);
                    }
                } catch (Exception e) {
                    iqz.zn("PlayableResManager", e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zmn(com.bytedance.sdk.openadsdk.doe.fs.zmn zmnVar, @Nullable com.bytedance.sdk.openadsdk.doe.fs.zmn zmnVar2, int i) {
        List<zmn.C0187zmn> list = null;
        zmn(zmnVar.fs(), zmnVar2 == null ? null : zmnVar2.fs(), 1, i);
        List<zmn.C0187zmn> zn = zmnVar.zn();
        if (zmnVar2 != null) {
            list = zmnVar2.zn();
        }
        zmn(zn, list, 2, i);
    }

    private void zmn(@Nullable List<zmn.C0187zmn> list, @Nullable List<zmn.C0187zmn> list2, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String btk = i == 1 ? btk() : hhw();
        for (zmn.C0187zmn c0187zmn : list) {
            String zmn2 = c0187zmn.zmn();
            String zmn3 = cyb.zmn(zmn2);
            if (!TextUtils.isEmpty(zmn3)) {
                if (i == 1) {
                    zmn3 = zmn3 + zn(zmn2);
                }
                String str = zmn3;
                File file = new File(btk, str);
                boolean exists = file.exists();
                if (i2 == 1) {
                    if (exists && list2 != null && list2.contains(c0187zmn)) {
                        com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zn(file);
                    }
                    zmn(zmn2, btk, str, i, file, exists);
                } else if (!exists) {
                    zmn(zmn2, btk, str, i, file, exists);
                }
            }
        }
    }

    private void zmn(final String str, final String str2, final String str3, final int i, final File file, final boolean z) {
        String concat;
        if (this.btk.contains(str)) {
            return;
        }
        if (i == 2) {
            concat = str3 + ".zip";
        } else {
            concat = z ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.btk.add(str);
        com.bytedance.sdk.component.nps.fs.zmn fb = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fb();
        fb.zn(str);
        fb.zmn(str2, concat);
        final com.bytedance.sdk.component.nps.fs btk = fb.btk();
        this.btk.remove(str);
        if (btk != null && btk.hhw() && btk.btk() != null && btk.btk().exists()) {
            if (i == 2) {
                nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("downloadZip") { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zn.5
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (z) {
                                file.delete();
                            }
                            String str4 = str2 + File.separator + str3;
                            yj.zmn(btk.btk().getAbsolutePath(), str4);
                            File file2 = new File(str4);
                            File zmn2 = com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn(file2);
                            if (zmn2 != null && zmn2.exists()) {
                                com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zn().put(file2.getName(), zmn2.getAbsolutePath());
                            }
                            com.bytedance.sdk.openadsdk.core.cn.zn.zmn.fs(file2);
                        } catch (Throwable th) {
                            iqz.zn("PlayableResManager", "unzip error: ", th, "tp=", Integer.valueOf(i), ", url=", str);
                        }
                        try {
                            btk.btk().delete();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            } else {
                if (z) {
                    file.delete();
                    btk.btk().renameTo(file);
                    return;
                }
                return;
            }
        }
        File file2 = new File(str2 + File.separator + str3 + ".tmp");
        if (file2.exists()) {
            try {
                file2.delete();
            } catch (Throwable unused) {
            }
        }
    }

    private static String zn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?");
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return "";
        }
        return "." + str.substring(lastIndexOf + 1);
    }

    private String fb() {
        if (TextUtils.isEmpty(this.fs)) {
            try {
                File zmn2 = com.bytedance.sdk.component.utils.nps.zmn(kgc.zmn(), kgc.zmn().getCacheDir(), "playable");
                if (!zmn2.exists()) {
                    zmn2.mkdirs();
                }
                this.fs = zmn2.getAbsolutePath();
            } catch (Throwable th) {
                iqz.zn("PlayableResManager", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.fs;
    }

    private String btk() {
        if (TextUtils.isEmpty(this.zn)) {
            String str = fb() + File.separator + "common";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.zn = str;
        }
        return this.zn;
    }

    private String hhw() {
        if (TextUtils.isEmpty(this.fb)) {
            String str = fb() + File.separator + "pregames";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.fb = str;
        }
        return this.fb;
    }

    public WebResourceResponse zmn(String str) {
        if (!nps.zmn()) {
            return null;
        }
        String zmn2 = cyb.zmn(str);
        if (TextUtils.isEmpty(zmn2)) {
            return null;
        }
        File file = new File(btk(), zmn2 + zn(str));
        if (file.exists()) {
            try {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                return new WebResourceResponse(mimeTypeFromExtension, "UTF-8", new FileInputStream(file));
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
