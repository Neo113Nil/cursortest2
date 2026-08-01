package com.bytedance.sdk.openadsdk.core.video.icD;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.CvL;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.NB;
import com.bytedance.sdk.component.utils.bNS;
import com.bytedance.sdk.component.utils.sUS;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: PlayableCache.java */
/* loaded from: classes2.dex */
public class pvs {
    private static volatile pvs pvs;
    private String icD;
    private final Map<cR, icD> vG = Collections.synchronizedMap(new HashMap());
    private final Map<String, JSONObject> Jd = Collections.synchronizedMap(new HashMap());
    private final AtomicBoolean NB = new AtomicBoolean(false);
    private final Set<String> sUS = Collections.synchronizedSet(new HashSet());
    private final Map<String, String> yiw = Collections.synchronizedMap(new HashMap());

    /* compiled from: PlayableCache.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.video.icD.pvs$pvs, reason: collision with other inner class name */
    public interface InterfaceC0082pvs {
    }

    public static pvs pvs() {
        if (pvs == null) {
            synchronized (pvs.class) {
                if (pvs == null) {
                    pvs = new pvs();
                }
            }
        }
        return pvs;
    }

    private pvs() {
    }

    public boolean pvs(cR cRVar) {
        if (this.NB.get() && cRVar != null && cRVar.od() != null && cRVar.od().Ju() != null) {
            try {
                String pvs2 = NB.pvs(cRVar.od().Ju());
                if (this.Jd.get(pvs2) == null) {
                    return false;
                }
                return sUS(new File(vG(), pvs2));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void icD() {
        if (this.NB.get()) {
            return;
        }
        ae.pvs(new so("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.video.icD.pvs.1
            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                try {
                    String vG = pvs.this.vG();
                    if (!TextUtils.isEmpty(vG)) {
                        File file = new File(vG);
                        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                            for (File file2 : listFiles) {
                                if (file2 != null) {
                                    try {
                                        File vG2 = pvs.this.vG(file2);
                                        if (vG2 != null && vG2.exists()) {
                                            pvs.this.yiw.put(file2.getName(), vG2.getAbsolutePath());
                                        }
                                        pvs.this.pvs(pvs.this.pvs(vG2), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                pvs.this.NB.set(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject pvs(File file, boolean z) {
        byte[] Jd;
        String icD2;
        try {
            if (!icD(file) || (Jd = sUS.Jd(file)) == null || Jd.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                icD2 = com.bytedance.sdk.component.utils.pvs.vG(new String(Jd));
            } else {
                icD2 = com.bytedance.sdk.component.Jd.pvs.icD(new String(Jd), com.bytedance.sdk.openadsdk.core.pvs.icD());
            }
            if (TextUtils.isEmpty(icD2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(icD2);
            if (z && jSONObject.length() > 0) {
                this.Jd.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File pvs(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return icD(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    private boolean icD(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public WebResourceResponse pvs(String str, String str2, String str3) {
        File vG;
        try {
        } catch (Throwable th) {
            Ju.pvs("PlayableCache", "playable intercept error: ", th);
        }
        if (this.NB.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                    str3 = str3.split("\\?")[0];
                    if (str3.endsWith("/")) {
                        str3 = str3.substring(0, str3.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
            String pvs2 = bNS.pvs(mnm.pvs(), str3);
            if (TextUtils.isEmpty(pvs2)) {
                return null;
            }
            String pvs3 = NB.pvs(str);
            if (TextUtils.isEmpty(pvs3)) {
                return null;
            }
            String str4 = this.yiw.get(pvs3);
            if (!TextUtils.isEmpty(str4)) {
                vG = new File(str4);
            } else {
                vG = vG(new File(vG(), pvs3));
                if (vG != null && vG.exists()) {
                    this.yiw.put(pvs3, vG.getAbsolutePath());
                }
            }
            if (vG != null && vG.exists()) {
                String pvs4 = pvs(str2);
                if (TextUtils.isEmpty(pvs4)) {
                    return null;
                }
                String replace = str3.replace(pvs4, "");
                if (!TextUtils.isEmpty(replace) && !replace.startsWith("https://") && !replace.startsWith("http://")) {
                    File file = new File(vG, replace);
                    if (file.exists() && pvs(pvs3, replace, file) && file.getCanonicalPath().startsWith(vG.getCanonicalPath())) {
                        return new WebResourceResponse(pvs2, "utf-8", new FileInputStream(file));
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File vG(File file) {
        File[] listFiles;
        if (file != null && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : listFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return vG(file3);
                }
            }
        }
        return null;
    }

    private String pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\?");
        if (split != null && split.length == 2) {
            String str2 = split[0];
            if (str2 != null && str2.endsWith("/")) {
                str = str.substring(0, split.length - 1);
            }
            String str3 = split[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = split[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean pvs(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.Jd.get(str);
            if (jSONObject == null) {
                return true;
            }
            String optString = jSONObject.optString(str2);
            if (optString != null && optString.equalsIgnoreCase(NB.pvs(file))) {
                return true;
            }
        }
        return false;
    }

    public void pvs(final cR cRVar, final InterfaceC0082pvs interfaceC0082pvs) {
        File file;
        if (cRVar == null || cRVar.od() == null || TextUtils.isEmpty(cRVar.od().Ju())) {
            com.bytedance.sdk.openadsdk.core.video.icD.icD.pvs(cRVar, -701, (String) null);
            pvs(interfaceC0082pvs, false);
            return;
        }
        final String Ju = cRVar.od().Ju();
        if (this.sUS.contains(Ju)) {
            return;
        }
        this.vG.put(cRVar, new icD().pvs(System.currentTimeMillis()));
        com.bytedance.sdk.openadsdk.core.video.icD.icD.pvs(cRVar);
        String pvs2 = NB.pvs(Ju);
        final File file2 = new File(vG(), pvs2);
        String str = this.yiw.get(pvs2);
        if (TextUtils.isEmpty(str)) {
            file = vG(file2);
            if (file != null && file.exists()) {
                this.yiw.put(pvs2, file.getAbsolutePath());
            }
        } else {
            file = new File(str);
        }
        if (file != null && file.exists()) {
            com.bytedance.sdk.openadsdk.core.video.icD.icD.pvs(cRVar, -702, (String) null);
            NB(file2);
            this.vG.remove(cRVar);
            pvs(interfaceC0082pvs, true);
            return;
        }
        try {
            sUS.vG(file2);
        } catch (Throwable unused) {
        }
        this.sUS.add(Ju);
        File file3 = new File(Jd(), pvs2 + ".zip");
        com.bytedance.sdk.component.yiw.icD.pvs Jd = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().Jd();
        Jd.icD(Ju);
        Jd.pvs(file3.getParent(), file3.getName());
        Jd.pvs(7);
        Jd.pvs("playable_download");
        Jd.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.video.icD.pvs.2
            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, final com.bytedance.sdk.component.yiw.icD icd) {
                pvs.this.sUS.remove(Ju);
                final icD icd2 = (icD) pvs.this.vG.remove(cRVar);
                if (icd2 != null) {
                    icd2.icD(System.currentTimeMillis());
                }
                if (icd.sUS() && icd.NB() != null && icd.NB().exists()) {
                    ae.icD(new so("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.video.icD.pvs.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean z;
                            long j;
                            long j2;
                            try {
                                icD icd3 = icd2;
                                if (icd3 != null) {
                                    icd3.vG(System.currentTimeMillis());
                                }
                                CvL.pvs(icd.NB().getAbsolutePath(), file2.getAbsolutePath());
                                icD icd4 = icd2;
                                if (icd4 != null) {
                                    icd4.Jd(System.currentTimeMillis());
                                }
                                icD icd5 = icd2;
                                if (icd5 != null) {
                                    j = icd5.pvs();
                                    j2 = icd2.icD();
                                } else {
                                    j = 0;
                                    j2 = 0;
                                }
                                com.bytedance.sdk.openadsdk.core.video.icD.icD.pvs(cRVar, j, j2);
                                pvs.this.Jd(file2);
                                z = true;
                                try {
                                    File vG = pvs.this.vG(file2);
                                    if (vG != null && vG.exists()) {
                                        pvs.this.yiw.put(file2.getName(), vG.getAbsolutePath());
                                    }
                                    pvs.this.pvs(pvs.this.pvs(vG), true);
                                } catch (Throwable unused2) {
                                }
                            } catch (Throwable th) {
                                Ju.pvs("PlayableCache", "unzip error: ", th);
                                com.bytedance.sdk.openadsdk.core.video.icD.icD.pvs(cRVar, -704, th.getMessage());
                                z = false;
                            }
                            try {
                                icd.NB().delete();
                            } catch (Throwable unused3) {
                            }
                            pvs.this.pvs(interfaceC0082pvs, z);
                        }
                    });
                } else {
                    com.bytedance.sdk.openadsdk.core.video.icD.icD.pvs(cRVar, icd.pvs() != 0 ? icd.pvs() : -700, (String) null);
                    pvs.this.pvs(interfaceC0082pvs, false);
                }
            }

            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                pvs.this.sUS.remove(Ju);
                pvs.this.vG.remove(cRVar);
                com.bytedance.sdk.openadsdk.core.video.icD.icD.pvs(cRVar, -700, iOException.getMessage());
                pvs.this.pvs(interfaceC0082pvs, false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final InterfaceC0082pvs interfaceC0082pvs, final boolean z) {
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.icD.pvs.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jd(File file) {
        NB(file);
        try {
            com.bytedance.sdk.openadsdk.core.so.icD().IP().pvs(file);
        } catch (Throwable unused) {
        }
    }

    private void NB(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    private boolean sUS(File file) {
        String[] list;
        if (file == null || !file.isDirectory() || (list = file.list()) == null || list.length <= 0) {
            return false;
        }
        return Arrays.asList(list).contains("index.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String vG() {
        File file = new File(Jd(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private String Jd() {
        if (TextUtils.isEmpty(this.icD)) {
            try {
                File file = new File(mnm.pvs().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.icD = file.getAbsolutePath();
            } catch (Throwable th) {
                Ju.pvs("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.icD;
    }

    /* compiled from: PlayableCache.java */
    private static class icD {
        long Jd;
        long icD;
        long pvs;
        long vG;

        private icD() {
        }

        public long pvs() {
            return this.icD - this.pvs;
        }

        public long icD() {
            return this.Jd - this.vG;
        }

        public icD pvs(long j) {
            this.pvs = j;
            return this;
        }

        public icD icD(long j) {
            this.icD = j;
            return this;
        }

        public icD vG(long j) {
            this.vG = j;
            return this;
        }

        public icD Jd(long j) {
            this.Jd = j;
            return this;
        }
    }
}
