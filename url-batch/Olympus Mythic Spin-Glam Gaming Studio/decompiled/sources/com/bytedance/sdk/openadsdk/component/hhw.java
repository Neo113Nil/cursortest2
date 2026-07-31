package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn;
import com.bytedance.sdk.component.btk.cyb;
import com.bytedance.sdk.component.btk.iv;
import com.bytedance.sdk.component.btk.rc;
import com.bytedance.sdk.component.btk.zg;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.common.fs;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.doe;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.kjb;
import com.bytedance.sdk.openadsdk.core.model.so;
import com.bytedance.sdk.openadsdk.core.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.kgc;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.ww;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class hhw {
    private static volatile hhw fs = null;
    private static String zmn = "openad_image_cache";
    private final Context btk;
    private final nqi<com.bytedance.sdk.openadsdk.fb.zmn> fb;
    private final Map<String, AtomicInteger> hhw = new ConcurrentHashMap();
    private final Map<String, String> nps = new ConcurrentHashMap();
    private final com.bytedance.sdk.openadsdk.fs.fs zn;

    interface fs {
        void zmn();

        void zmn(int i, String str);
    }

    public interface zmn {
        void zmn();

        void zmn(@Nullable com.bytedance.sdk.openadsdk.iqz.zmn.fs fsVar);
    }

    public interface zn {
        void zmn(Object obj);
    }

    private hhw(Context context) {
        if (context != null) {
            this.btk = context.getApplicationContext();
        } else {
            this.btk = kgc.zmn();
        }
        this.zn = new com.bytedance.sdk.openadsdk.fs.fs(10, 8, true);
        this.fb = kgc.zn();
        zmn += "_p";
        com.bytedance.sdk.openadsdk.common.fs.zmn("tt_openad_materialMeta_new", new fs.zmn("tt_openad_materialMeta_new") { // from class: com.bytedance.sdk.openadsdk.component.hhw.1
            @Override // com.bytedance.sdk.openadsdk.common.fs.zmn
            protected String zmn(String str) {
                return "tt_openad_materialMeta_new";
            }

            @Override // com.bytedance.sdk.openadsdk.common.fs.zmn
            public String fs(String str) {
                return com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)), (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.fs.zmn
            public void zmn(AdSlot adSlot, String str, String str2) {
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad_materialMeta_new", "material".concat(String.valueOf(adSlot.getCodeId())), str);
            }
        });
    }

    public static hhw zmn(Context context) {
        if (fs == null) {
            synchronized (hhw.class) {
                try {
                    if (fs == null) {
                        fs = new hhw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fs;
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, zn znVar) {
        zmn(nqiVar, znVar, 0);
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, final zn znVar, final int i) {
        String iv = nqiVar.mrt().iv();
        if (TextUtils.isEmpty(iv)) {
            return;
        }
        iv fb = com.bytedance.sdk.openadsdk.iv.fb.zmn(iv).zmn(nqiVar.mrt().zn()).fs(nqiVar.mrt().fs()).btk(jy.btk(kgc.zmn())).fb(jy.zn(kgc.zmn()));
        if (i > 0 && Build.VERSION.SDK_INT >= 26) {
            fb.zn(2).zmn(new zg() { // from class: com.bytedance.sdk.openadsdk.component.hhw.4
                @Override // com.bytedance.sdk.component.btk.zg
                public Bitmap zmn(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.fb.zmn.zmn(kgc.zmn(), bitmap, i);
                }
            });
        } else {
            fb.zn(1);
        }
        fb.zmn(new com.bytedance.sdk.openadsdk.iv.fs(nqiVar, iv, new cyb() { // from class: com.bytedance.sdk.openadsdk.component.hhw.5
            @Override // com.bytedance.sdk.component.btk.cyb
            public void zmn(int i2, String str, @Nullable Throwable th) {
            }

            @Override // com.bytedance.sdk.component.btk.cyb
            public void zmn(rc rcVar) {
                zn znVar2;
                if (rcVar == null || rcVar.fs() == null || rcVar.zn() == null || (znVar2 = zn.this) == null) {
                    return;
                }
                znVar2.zmn(rcVar.fs());
            }
        }));
    }

    public void zmn(final AdSlot adSlot) {
        Objects.toString(adSlot);
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.hhw.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (!com.bytedance.sdk.openadsdk.common.kgc.zmn().zmn(adSlot.getCodeId(), atomicInteger.get(), atomicInteger.get() + fb(adSlot))) {
            com.bytedance.sdk.openadsdk.component.nps.zmn.zg();
            return;
        }
        atomicInteger.incrementAndGet();
        this.hhw.put(adSlot.getCodeId(), atomicInteger);
        final so soVar = new so();
        soVar.zmn(ww.fs());
        soVar.fs(com.bytedance.sdk.openadsdk.component.nps.zmn.fs());
        soVar.fs(com.bytedance.sdk.openadsdk.component.nps.zmn.zn());
        kjb kjbVar = new kjb();
        kjbVar.rc = soVar;
        kjbVar.fb = 2;
        kjbVar.bvs = 2;
        this.fb.zmn(adSlot, kjbVar, 3, new doe() { // from class: com.bytedance.sdk.openadsdk.component.hhw.6
            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
                hhw.this.zn(adSlot);
                com.bytedance.sdk.openadsdk.component.fb.fs.zmn(soVar, 100, 2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                hhw.this.zmn(zmnVar, znVar, adSlot, soVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar, AdSlot adSlot, so soVar) {
        com.bytedance.sdk.openadsdk.component.fb.fs.zmn(soVar, 100, 1);
        if (zmnVar == null || zmnVar.btk() == null || zmnVar.btk().isEmpty()) {
            znVar.zmn(-3);
            znVar.zn(2);
            com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar);
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = zmnVar.btk().get(0);
        if (nqiVar == null) {
            return;
        }
        if (nqiVar.yj()) {
            zmn(nqiVar, adSlot, soVar, zmnVar);
        } else if (com.bytedance.sdk.openadsdk.core.model.nqi.btk(nqiVar)) {
            fs(nqiVar, adSlot, soVar, zmnVar);
        } else {
            zn(nqiVar, adSlot, soVar, zmnVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.hhw.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.hhw.put(adSlot.getCodeId(), atomicInteger);
    }

    private void fs(@NonNull final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, final AdSlot adSlot, final so soVar, final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        if (com.bytedance.sdk.openadsdk.component.nps.zmn.btk()) {
            zmn(nqiVar, adSlot, soVar, zmnVar);
        }
        zmn(nqiVar, adSlot, soVar, new fs() { // from class: com.bytedance.sdk.openadsdk.component.hhw.7
            @Override // com.bytedance.sdk.openadsdk.component.hhw.fs
            public void zmn() {
                if (com.bytedance.sdk.openadsdk.component.nps.zmn.btk()) {
                    return;
                }
                hhw.this.zmn(nqiVar, adSlot, soVar, zmnVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.hhw.fs
            public void zmn(int i, String str) {
                hhw.this.zn(adSlot);
            }
        });
    }

    private void zn(@NonNull final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, final AdSlot adSlot, final so soVar, final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        if (com.bytedance.sdk.openadsdk.component.nps.zmn.btk()) {
            zmn(nqiVar, adSlot, soVar, zmnVar);
        }
        zmn(nqiVar, soVar, new zmn() { // from class: com.bytedance.sdk.openadsdk.component.hhw.8
            @Override // com.bytedance.sdk.openadsdk.component.hhw.zmn
            public void zmn(com.bytedance.sdk.openadsdk.iqz.zmn.fs fsVar) {
                if (com.bytedance.sdk.openadsdk.component.nps.zmn.btk()) {
                    return;
                }
                hhw.this.zmn(nqiVar, adSlot, soVar, zmnVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.hhw.zmn
            public void zmn() {
                hhw.this.zn(adSlot);
            }
        });
    }

    public void zmn(@NonNull com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot, so soVar, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        if (soVar != null) {
            nqiVar.zn(soVar.iv());
        }
        zmn(new com.bytedance.sdk.openadsdk.component.btk.zmn(nqiVar.qvo(), nqiVar, zmnVar));
        com.bytedance.sdk.openadsdk.component.fb.fs.zmn(nqiVar, 1, soVar);
        zn(adSlot);
    }

    public void zmn(@NonNull final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot, final so soVar, final fs fsVar) {
        final ww fs2 = ww.fs();
        final int qvo = nqiVar.qvo();
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = nqiVar.mrt();
        String rc = mrt.rc();
        String rt = mrt.rt();
        if (TextUtils.isEmpty(rt)) {
            rt = com.bytedance.sdk.component.utils.btk.zmn(rc);
        }
        final File zmn2 = com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(rt);
        if (zmn2.exists()) {
            com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(zmn2);
            zmn(qvo);
            long fb = fs2.fb();
            if (soVar != null) {
                soVar.zmn(fb);
                soVar.zmn(1);
            }
            fsVar.zmn();
            zmn(nqiVar, (zn) null);
            return;
        }
        if (kgc.fb().rp(String.valueOf(qvo)) && !com.bytedance.sdk.component.utils.kgc.fb(kgc.zmn())) {
            fsVar.zmn(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn3 = com.bytedance.sdk.openadsdk.core.model.nqi.zmn(zmn2.getParent(), nqiVar);
        zmn3.zmn("material_meta", nqiVar);
        zmn3.zmn("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn3, new zmn.InterfaceC0101zmn() { // from class: com.bytedance.sdk.openadsdk.component.hhw.9
            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
            public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i) {
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i) {
                hhw.this.zmn(qvo);
                long fb2 = fs2.fb();
                com.bytedance.sdk.openadsdk.component.fb.fs.fs(nqiVar, fb2, true);
                so soVar2 = soVar;
                if (soVar2 != null) {
                    soVar2.zmn(fb2);
                    soVar.zmn(2);
                }
                fsVar.zmn();
                hhw.zmn(nqiVar, (zn) null);
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i, String str) {
                long fb2 = fs2.fb();
                com.bytedance.sdk.openadsdk.component.fb.fs.fs(nqiVar, fb2, false);
                so soVar2 = soVar;
                if (soVar2 != null) {
                    soVar2.zmn(fb2);
                }
                fsVar.zmn(i, str);
                try {
                    if (zmn2.exists() && zmn2.isFile()) {
                        com.bytedance.sdk.component.utils.nps.zn(zmn2);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void zmn(final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, final so soVar, final zmn zmnVar) {
        final ww fs2 = ww.fs();
        final int qvo = nqiVar.qvo();
        com.bytedance.sdk.openadsdk.core.model.kgc kgcVar = nqiVar.tj().get(0);
        String nps = kgcVar.nps();
        String zmn2 = kgcVar.zmn();
        int fs3 = kgcVar.fs();
        int zn2 = kgcVar.zn();
        String zmn3 = TextUtils.isEmpty(nps) ? com.bytedance.sdk.component.utils.btk.zmn(zmn2) : nps;
        if (TextUtils.isEmpty(zmn3) || zmn3.contains("../") || zmn3.contains("/") || zmn3.contains("..")) {
            if (zmnVar != null) {
                zmnVar.zmn();
                return;
            }
            return;
        }
        File fs4 = com.bytedance.sdk.openadsdk.component.nps.zmn.fs(zmn3);
        String parent = fs4 != null ? fs4.getParent() : null;
        if (zmn(zmn2, nps)) {
            fs(qvo);
            long fb = fs2.fb();
            if (soVar != null) {
                soVar.zmn(fb);
                soVar.zmn(1);
            }
            zmnVar.zmn(null);
            return;
        }
        com.bytedance.sdk.openadsdk.utils.kgc.zmn(new com.bytedance.sdk.openadsdk.iqz.zmn(zmn2, kgcVar.nps()), fs3, zn2, new kgc.zmn() { // from class: com.bytedance.sdk.openadsdk.component.hhw.10
            @Override // com.bytedance.sdk.openadsdk.utils.kgc.zmn
            @MainThread
            public void zmn(@NonNull com.bytedance.sdk.openadsdk.iqz.zmn.fs fsVar) {
                if (fsVar.btk()) {
                    hhw.this.fs(qvo);
                    long fb2 = fs2.fb();
                    com.bytedance.sdk.openadsdk.component.fb.fs.zmn(nqiVar, fb2, true);
                    so soVar2 = soVar;
                    if (soVar2 != null) {
                        soVar2.zmn(fb2);
                        soVar.zmn(2);
                    }
                    zmnVar.zmn(fsVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.fb.fs.zmn(nqiVar, fs2.fb(), false);
                zmnVar.zmn();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.kgc.zmn
            @MainThread
            public void zmn() {
                com.bytedance.sdk.openadsdk.component.fb.fs.zmn(nqiVar, fs2.fb(), false);
                zmnVar.zmn();
            }
        }, parent);
    }

    public void zmn(int i) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad", "video_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public void fs(int i) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad", "image_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public void zmn(final com.bytedance.sdk.openadsdk.component.btk.zmn zmnVar) {
        cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.hhw.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.core.model.nqi fs2 = zmnVar.fs();
                    if (fs2 == null || com.bytedance.sdk.openadsdk.core.model.nqi.hhw(fs2) || fs2.dbc()) {
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.component.nps.zmn.btk()) {
                        com.bytedance.sdk.openadsdk.common.kgc.zmn().zmn(fs2, zmnVar.zn());
                        return;
                    }
                    if (hhw.this.fs(fs2.utx())) {
                        return;
                    }
                    hhw.this.zmn(fs2.utx(), fs2.wbj());
                    com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad", "material_expiration_time" + zmnVar.zmn(), Long.valueOf(fs2.mf()));
                    com.bytedance.sdk.openadsdk.common.fs.zmn("tt_openad_materialMeta_new").zmn(zmnVar.fs().utx(), zmnVar.zn());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public String zn(int i) {
        String fs2 = com.bytedance.sdk.openadsdk.common.fs.zmn("tt_openad_materialMeta_new").fs(String.valueOf(i));
        long zmn2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad", "material_expiration_time".concat(String.valueOf(i)), -1L);
        if (System.currentTimeMillis() / 1000 < zmn2) {
            return fs2;
        }
        if (zmn2 != -1) {
            zmn(i, (String) null);
            zmn(fs2);
        }
        return null;
    }

    public void zmn(final String str) {
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("opencache") { // from class: com.bytedance.sdk.openadsdk.component.hhw.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.zmn fs2;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                    if (jsonObjectInit.has("cypher")) {
                        jsonObjectInit = com.bytedance.sdk.openadsdk.core.kgc.zn().zmn(jsonObjectInit);
                    }
                    if (jsonObjectInit == null || !jsonObjectInit.has("creatives") || (fs2 = com.bytedance.sdk.openadsdk.core.model.zmn.fs(jsonObjectInit)) == null || !fs2.hhw()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.fb.fs.zmn(fs2.nps());
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Nullable
    public String zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (nqiVar != null && nqiVar.mrt() != null && !TextUtils.isEmpty(nqiVar.mrt().rc())) {
            String rc = nqiVar.mrt().rc();
            String rt = nqiVar.mrt().rt();
            if (TextUtils.isEmpty(rt)) {
                rt = com.bytedance.sdk.component.utils.btk.zmn(rc);
            }
            File zmn2 = com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(rt);
            if (zmn2.exists() && zmn2.isFile()) {
                return zmn2.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean zmn(String str, String str2) {
        boolean z;
        String str3;
        String str4;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.btk.zmn(str);
            }
            if (!TextUtils.isEmpty(str2) && !str2.contains("../") && !str2.contains("/") && !str2.contains("..")) {
                File fs2 = com.bytedance.sdk.openadsdk.component.nps.zmn.fs(str2);
                InputStream zmn2 = com.bytedance.sdk.openadsdk.iv.fb.zmn(str, str2);
                if (zmn2 != null) {
                    try {
                        zmn2.close();
                    } catch (IOException e) {
                        iqz.zn("TTAppOpenAdCacheManager", e.getMessage());
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (fs2 != null) {
                        str3 = fs2.getParent();
                        str4 = fs2.getPath();
                    } else {
                        str3 = null;
                        str4 = null;
                    }
                    if (com.bytedance.sdk.openadsdk.iv.fb.zmn(str, str2, str3)) {
                        return true;
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        if (new File(str4).exists()) {
                            return true;
                        }
                    }
                }
                return z;
            }
            return false;
        } catch (Exception e2) {
            iqz.zn("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }

    public void zmn(AdSlot adSlot, String str) {
        if (com.bytedance.sdk.openadsdk.component.nps.zmn.btk() || adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        String codeId = adSlot.getCodeId();
        boolean z = adSlot.getCacheScene() != 0;
        if (!com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(adSlot) || z || TextUtils.isEmpty(codeId)) {
            return;
        }
        this.nps.put(codeId, str);
    }

    public boolean fs(AdSlot adSlot) {
        if (!com.bytedance.sdk.openadsdk.component.nps.zmn.btk() && adSlot != null) {
            String codeId = adSlot.getCodeId();
            if (com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(adSlot) && !TextUtils.isEmpty(codeId)) {
                return this.nps.containsKey(codeId);
            }
        }
        return false;
    }

    public void zmn(int i, String str) {
        String valueOf = String.valueOf(i);
        if (com.bytedance.sdk.openadsdk.component.nps.zmn.btk()) {
            com.bytedance.sdk.openadsdk.common.kgc.zmn().zmn(valueOf, str);
            return;
        }
        if (this.nps.size() == 0 || TextUtils.isEmpty(str) || !this.nps.containsKey(valueOf)) {
            fs(valueOf);
        } else if (this.nps.containsValue(str)) {
            this.nps.remove(valueOf);
            fs(valueOf);
        }
    }

    private void fs(String str) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad_materialMeta", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad", "material_expiration_time".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad", "video_has_cached".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad", "image_has_cached".concat(String.valueOf(str)));
    }

    public void zmn() {
        File[] listFiles;
        try {
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad_materialMeta_new");
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.hhw.3
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 == null) {
                        return false;
                    }
                    String name = file2.getName();
                    return name.contains(hhw.zmn) || name.contains("openad_video_cache");
                }
            })) != null) {
                for (File file2 : listFiles) {
                    try {
                        com.bytedance.sdk.component.utils.nps.zn(file2);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }

    public File fs() {
        return com.bytedance.sdk.component.utils.nps.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), new File(CacheDirFactory.getRootDir()).getName() + "/" + zmn);
    }

    private int fb(AdSlot adSlot) {
        StringBuilder sb = new StringBuilder("material_expiration_time");
        sb.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad", sb.toString(), -1L) == -1 ? 0 : 1;
    }
}
