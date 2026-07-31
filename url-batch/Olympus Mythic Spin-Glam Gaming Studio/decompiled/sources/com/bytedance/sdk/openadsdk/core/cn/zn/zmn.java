package com.bytedance.sdk.openadsdk.core.cn.zn;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.btk;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.nps;
import com.bytedance.sdk.component.utils.yj;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.doe.zmn.fb;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.ironsource.B5;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.NetError;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class zmn {
    private static volatile zmn zmn;
    private String fs;
    private final Map<nqi, fs> zn = new ConcurrentHashMap();
    private final Map<String, JSONObject> fb = new ConcurrentHashMap();
    private final AtomicBoolean btk = new AtomicBoolean(false);
    private final Set<String> hhw = Collections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.nps.fs.zmn> nps = new ConcurrentHashMap<>();
    private final Map<String, String> zg = new ConcurrentHashMap();

    /* renamed from: com.bytedance.sdk.openadsdk.core.cn.zn.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0157zmn {
        void zmn(boolean z);
    }

    public static zmn zmn() {
        if (zmn == null) {
            synchronized (zmn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zmn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private zmn() {
    }

    public boolean zmn(nqi nqiVar) {
        if (this.btk.get() && nqiVar != null && nqiVar.mrt() != null && nqiVar.mrt().mw() != null) {
            try {
                if (!TextUtils.isEmpty(this.zg.get(btk.zmn(nqiVar.mrt().mw())))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void fs() {
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk() || this.btk.get()) {
            return;
        }
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.cn.zn.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                try {
                    String fb = zmn.this.fb();
                    if (!TextUtils.isEmpty(fb)) {
                        File file = new File(fb);
                        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                            for (File file2 : listFiles) {
                                if (file2 != null) {
                                    try {
                                        File zmn2 = zmn.zmn(file2);
                                        if (zmn2 != null && zmn2.exists()) {
                                            zmn.this.zg.put(file2.getName(), zmn2.getAbsolutePath());
                                        }
                                        zmn.this.zmn(zmn.this.fb(zmn2), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.doe.zmn.zn.zmn().zmn(zmn.this.zg);
                zmn.this.btk.set(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject zmn(File file, boolean z) {
        byte[] fb;
        String fs2;
        try {
            if (!btk(file) || (fb = nps.fb(file)) == null || fb.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                fs2 = com.bytedance.sdk.component.utils.zmn.zn(new String(fb));
            } else {
                fs2 = com.bytedance.sdk.component.fb.zmn.fs(new String(fb), com.bytedance.sdk.openadsdk.core.zmn.fs());
            }
            if (TextUtils.isEmpty(fs2)) {
                return null;
            }
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(fs2);
            if (z && jsonObjectInit.length() > 0) {
                this.fb.put(file.getParentFile().getName(), jsonObjectInit);
            }
            return jsonObjectInit;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File fb(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return btk(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    private boolean btk(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public WebResourceResponse zmn(String str, String str2, String str3) {
        WebResourceResponse zmn2;
        String str4;
        File zmn3;
        try {
            zmn2 = com.bytedance.sdk.openadsdk.doe.zmn.zn.zmn().zmn(str3);
        } catch (Throwable th) {
            iqz.zmn("PlayableCache", "playable intercept error: ", th);
        }
        if (zmn2 != null) {
            return zmn2;
        }
        if (this.btk.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if ((str3.startsWith(d.v) || str3.startsWith(d.u)) && str3.contains("?")) {
                    str3 = str3.split("\\?")[0];
                    if (str3.endsWith("/")) {
                        str3 = str3.substring(0, str3.length() - 1);
                    }
                }
                str4 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3));
            } catch (Throwable unused) {
                str4 = null;
            }
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String zmn4 = btk.zmn(str);
            if (TextUtils.isEmpty(zmn4)) {
                return null;
            }
            String str5 = this.zg.get(zmn4);
            if (!TextUtils.isEmpty(str5)) {
                zmn3 = new File(str5);
            } else {
                zmn3 = zmn(new File(fb(), zmn4));
                if (zmn3 != null && zmn3.exists()) {
                    this.zg.put(zmn4, zmn3.getAbsolutePath());
                }
            }
            if (zmn3 != null && zmn3.exists()) {
                String zmn5 = zmn(str2);
                if (TextUtils.isEmpty(zmn5)) {
                    return null;
                }
                String replace = str3.replace(zmn5, "");
                if (!TextUtils.isEmpty(replace) && !replace.startsWith(d.u) && !replace.startsWith(d.v)) {
                    File file = new File(zmn3, replace);
                    if (file.exists() && zmn(zmn4, replace, file) && file.getCanonicalPath().startsWith(zmn3.getCanonicalPath())) {
                        return new WebResourceResponse(str4, B5.O, new FileInputStream(file));
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static File zmn(File file) {
        File[] listFiles;
        if (file != null && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : listFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return zmn(file3);
                }
            }
        }
        return null;
    }

    private String zmn(String str) {
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

    private boolean zmn(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.fb.get(str);
            if (jSONObject == null) {
                return true;
            }
            String optString = jSONObject.optString(str2);
            if (optString != null && optString.equalsIgnoreCase(btk.zmn(file))) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"[ByDesign4.2]BadDomainNameVerifier"})
    public void zmn(final nqi nqiVar, final InterfaceC0157zmn interfaceC0157zmn) {
        File file;
        if (fb.zmn().fs() && nqiVar != null && am.hhw(nqiVar) && nqiVar.utx() != null && !TextUtils.isEmpty(nqiVar.utx().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.cn.zn.fs.zmn(nqiVar, NetError.ERR_IMPORT_CA_CERT_FAILED, "server bidding pre render");
            zmn(interfaceC0157zmn, false);
            return;
        }
        if (nqiVar == null || nqiVar.mrt() == null || TextUtils.isEmpty(nqiVar.mrt().mw())) {
            com.bytedance.sdk.openadsdk.core.cn.zn.fs.zmn(nqiVar, NetError.ERR_PKCS12_IMPORT_BAD_PASSWORD, (String) null);
            zmn(interfaceC0157zmn, false);
            return;
        }
        final String mw = nqiVar.mrt().mw();
        if (this.hhw.contains(mw)) {
            return;
        }
        this.zn.put(nqiVar, new fs().zmn(System.currentTimeMillis()));
        com.bytedance.sdk.openadsdk.core.cn.zn.fs.zmn(nqiVar);
        String zmn2 = btk.zmn(mw);
        final File file2 = new File(fb(), zmn2);
        String str = this.zg.get(zmn2);
        if (TextUtils.isEmpty(str)) {
            file = zmn(file2);
            if (file != null && file.exists()) {
                this.zg.put(zmn2, file.getAbsolutePath());
            }
        } else {
            file = new File(str);
        }
        if (file != null && file.exists()) {
            com.bytedance.sdk.openadsdk.core.cn.zn.fs.zmn(nqiVar, NetError.ERR_PKCS12_IMPORT_FAILED, (String) null);
            zn(file2);
            this.zn.remove(nqiVar);
            zmn(interfaceC0157zmn, true);
            return;
        }
        try {
            nps.zn(file2);
        } catch (Throwable unused) {
        }
        this.hhw.add(mw);
        File file3 = new File(btk(), zmn2 + ".zip");
        com.bytedance.sdk.component.nps.fs.zmn fb = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fb();
        this.nps.put(mw, fb);
        fb.zn(mw);
        fb.zmn(file3.getParent(), file3.getName());
        fb.zmn(7);
        fb.fs("playable_download");
        fb.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.cn.zn.zmn.2
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, final com.bytedance.sdk.component.nps.fs fsVar) {
                zmn.this.hhw.remove(mw);
                zmn.this.nps.remove(mw);
                final fs fsVar2 = (fs) zmn.this.zn.remove(nqiVar);
                if (fsVar2 != null) {
                    fsVar2.fs(System.currentTimeMillis());
                }
                if (fsVar.hhw() && fsVar.btk() != null && fsVar.btk().exists()) {
                    nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.cn.zn.zmn.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean z;
                            long j;
                            long j2;
                            try {
                                fs fsVar3 = fsVar2;
                                if (fsVar3 != null) {
                                    fsVar3.zn(System.currentTimeMillis());
                                }
                                yj.zmn(fsVar.btk().getAbsolutePath(), file2.getAbsolutePath());
                                fs fsVar4 = fsVar2;
                                if (fsVar4 != null) {
                                    fsVar4.fb(System.currentTimeMillis());
                                }
                                fs fsVar5 = fsVar2;
                                if (fsVar5 != null) {
                                    j = fsVar5.zmn();
                                    j2 = fsVar2.fs();
                                } else {
                                    j = 0;
                                    j2 = 0;
                                }
                                com.bytedance.sdk.openadsdk.core.cn.zn.fs.zmn(nqiVar, j, j2);
                                zmn.fs(file2);
                                z = true;
                                try {
                                    File zmn3 = zmn.zmn(file2);
                                    if (zmn3 != null && zmn3.exists()) {
                                        zmn.this.zg.put(file2.getName(), zmn3.getAbsolutePath());
                                    }
                                    zmn.this.zmn(zmn.this.fb(zmn3), true);
                                } catch (Throwable unused2) {
                                }
                            } catch (Throwable th) {
                                iqz.zmn("PlayableCache", "unzip error: ", th);
                                com.bytedance.sdk.openadsdk.core.cn.zn.fs.zmn(nqiVar, NetError.ERR_IMPORT_CERT_ALREADY_EXISTS, th.getMessage());
                                z = false;
                            }
                            try {
                                fsVar.btk().delete();
                            } catch (Throwable unused3) {
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            zmn.this.zmn(interfaceC0157zmn, z);
                        }
                    });
                } else {
                    com.bytedance.sdk.openadsdk.core.cn.zn.fs.zmn(nqiVar, fsVar.zmn() != 0 ? fsVar.zmn() : -700, (String) null);
                    zmn.this.zmn(interfaceC0157zmn, false);
                }
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                zmn.this.hhw.remove(mw);
                zmn.this.nps.remove(mw);
                zmn.this.zn.remove(nqiVar);
                com.bytedance.sdk.openadsdk.core.cn.zn.fs.zmn(nqiVar, -700, iOException.getMessage());
                zmn.this.zmn(interfaceC0157zmn, false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final InterfaceC0157zmn interfaceC0157zmn, final boolean z) {
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.zn.zmn.3
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0157zmn interfaceC0157zmn2 = interfaceC0157zmn;
                if (interfaceC0157zmn2 != null) {
                    interfaceC0157zmn2.zmn(z);
                }
            }
        });
    }

    public static void fs(File file) {
        zn(file);
        try {
            iv.fs().mw().zmn(file);
        } catch (Throwable unused) {
        }
    }

    public static void zn(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String fb() {
        File file = new File(btk(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private String btk() {
        if (TextUtils.isEmpty(this.fs)) {
            try {
                File zmn2 = nps.zmn(kgc.zmn(), kgc.zmn().getCacheDir(), "playable");
                if (!zmn2.exists()) {
                    zmn2.mkdirs();
                }
                this.fs = zmn2.getAbsolutePath();
            } catch (Throwable th) {
                iqz.zn("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.fs;
    }

    private static class fs {
        long fb;
        long fs;
        long zmn;
        long zn;

        private fs() {
        }

        public long zmn() {
            return this.fs - this.zmn;
        }

        public long fs() {
            return this.fb - this.zn;
        }

        public fs zmn(long j) {
            this.zmn = j;
            return this;
        }

        public fs fs(long j) {
            this.fs = j;
            return this;
        }

        public fs zn(long j) {
            this.zn = j;
            return this;
        }

        public fs fb(long j) {
            this.fb = j;
            return this;
        }
    }

    public void fs(nqi nqiVar) {
        if (nqiVar == null || nqiVar.mrt() == null || TextUtils.isEmpty(nqiVar.mrt().mw()) || !com.bytedance.sdk.openadsdk.uqh.btk.zmn("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.nps.fs.zmn zmnVar = this.nps.get(nqiVar.mrt().mw());
        if (zmnVar != null) {
            zmnVar.fs();
        }
    }

    public Map<String, String> zn() {
        return this.zg;
    }
}
