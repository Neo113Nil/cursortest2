package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.NB.pvs;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.component.NB.so;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.ny;
import com.bytedance.sdk.openadsdk.core.model.uc;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.utils.Ju;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.gA;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAppOpenAdCacheManager.java */
/* loaded from: classes2.dex */
public class sUS {
    private static volatile sUS pvs;
    private final Context Jd;
    private final Map<String, AtomicInteger> NB = new ConcurrentHashMap();
    private final com.bytedance.sdk.openadsdk.pvs.icD icD;
    private final vA<com.bytedance.sdk.openadsdk.icD.pvs> vG;

    /* compiled from: TTAppOpenAdCacheManager.java */
    public interface Jd {
        void pvs(Bitmap bitmap);
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    public interface icD {
        void pvs();

        void pvs(com.bytedance.sdk.openadsdk.qh.pvs.icD icd);
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    interface vG {
        void pvs();

        void pvs(int i, String str);
    }

    private sUS(Context context) {
        if (context != null) {
            this.Jd = context.getApplicationContext();
        } else {
            this.Jd = mnm.pvs();
        }
        this.icD = new com.bytedance.sdk.openadsdk.pvs.icD(10, 8, true);
        this.vG = mnm.vG();
    }

    public static sUS pvs(Context context) {
        if (pvs == null) {
            synchronized (sUS.class) {
                if (pvs == null) {
                    pvs = new sUS(context);
                }
            }
        }
        return pvs;
    }

    public static void pvs(cR cRVar, Jd jd) {
        pvs(cRVar, jd, 0);
    }

    public static void pvs(cR cRVar, final Jd jd, final int i) {
        String Wyp = cRVar.od().Wyp();
        if (TextUtils.isEmpty(Wyp)) {
            return;
        }
        com.bytedance.sdk.openadsdk.sUS.Jd.pvs(Wyp).pvs(cRVar.od().vG()).icD(cRVar.od().icD()).NB(Pj.Jd(mnm.pvs())).Jd(Pj.vG(mnm.pvs())).vG(2).pvs(new so() { // from class: com.bytedance.sdk.openadsdk.component.sUS.2
            @Override // com.bytedance.sdk.component.NB.so
            public Bitmap pvs(Bitmap bitmap) {
                return i <= 0 ? bitmap : com.bytedance.sdk.component.adexpress.Jd.pvs.pvs(mnm.pvs(), bitmap, i);
            }
        }).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(cRVar, Wyp, new com.bytedance.sdk.component.NB.mnm<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.sUS.1
            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(int i2, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(qh<Bitmap> qhVar) {
                Jd jd2;
                if (qhVar == null || qhVar.icD() == null || qhVar.vG() == null || (jd2 = Jd.this) == null) {
                    return;
                }
                jd2.pvs(qhVar.icD());
            }
        }));
    }

    public void pvs(final AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.NB.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        Object[] objArr = new Object[2];
        int vG2 = atomicInteger.get() + vG(adSlot);
        if (vG2 > 0) {
            Object[] objArr2 = new Object[3];
            Integer.valueOf(vG2);
            Integer.valueOf(1);
            return;
        }
        atomicInteger.incrementAndGet();
        this.NB.put(adSlot.getCodeId(), atomicInteger);
        final ny nyVar = new ny();
        nyVar.pvs(gA.pvs());
        uc ucVar = new uc();
        ucVar.Wyp = nyVar;
        ucVar.Jd = 2;
        ucVar.so = 2;
        this.vG.pvs(adSlot, ucVar, 3, new vA.pvs() { // from class: com.bytedance.sdk.openadsdk.component.sUS.3
            @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
            public void pvs(int i, String str) {
                sUS.this.icD(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
            public void pvs(com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, com.bytedance.sdk.openadsdk.core.model.icD icd) {
                if (pvsVar == null || pvsVar.vG() == null || pvsVar.vG().size() == 0) {
                    icd.pvs(-3);
                    com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
                    return;
                }
                cR cRVar = pvsVar.vG().get(0);
                if (cRVar != null && cRVar.OUT()) {
                    com.bytedance.sdk.openadsdk.component.NB.pvs pvsVar2 = new com.bytedance.sdk.openadsdk.component.NB.pvs(cRVar.yTz(), cRVar);
                    sUS.this.pvs(pvsVar2);
                    com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(pvsVar2.icD(), 1, nyVar);
                    sUS.this.icD(adSlot);
                    return;
                }
                if (cR.NB(cRVar)) {
                    sUS.this.pvs(cRVar, adSlot, nyVar);
                } else {
                    sUS.this.icD(cRVar, adSlot, nyVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.NB.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.NB.put(adSlot.getCodeId(), atomicInteger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final cR cRVar, final AdSlot adSlot, final ny nyVar) {
        final int yTz = cRVar.yTz();
        pvs(cRVar, adSlot, nyVar, new vG() { // from class: com.bytedance.sdk.openadsdk.component.sUS.4
            @Override // com.bytedance.sdk.openadsdk.component.sUS.vG
            public void pvs() {
                com.bytedance.sdk.openadsdk.component.NB.pvs pvsVar = new com.bytedance.sdk.openadsdk.component.NB.pvs(yTz, cRVar);
                sUS.this.pvs(pvsVar);
                com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(pvsVar.icD(), 1, nyVar);
                sUS.this.icD(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.sUS.vG
            public void pvs(int i, String str) {
                sUS.this.icD(adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(final cR cRVar, final AdSlot adSlot, final ny nyVar) {
        final int yTz = cRVar.yTz();
        pvs(cRVar, nyVar, new icD() { // from class: com.bytedance.sdk.openadsdk.component.sUS.5
            @Override // com.bytedance.sdk.openadsdk.component.sUS.icD
            public void pvs(com.bytedance.sdk.openadsdk.qh.pvs.icD icd) {
                com.bytedance.sdk.openadsdk.component.NB.pvs pvsVar = new com.bytedance.sdk.openadsdk.component.NB.pvs(yTz, cRVar);
                sUS.this.pvs(pvsVar);
                com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(pvsVar.icD(), 1, nyVar);
                sUS.this.icD(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.sUS.icD
            public void pvs() {
                sUS.this.icD(adSlot);
            }
        });
    }

    public void pvs(final cR cRVar, AdSlot adSlot, final ny nyVar, final vG vGVar) {
        final gA pvs2 = gA.pvs();
        final int yTz = cRVar.yTz();
        com.bykv.vk.openvk.component.video.api.vG.icD od = cRVar.od();
        String qh = od.qh();
        String IP = od.IP();
        if (TextUtils.isEmpty(IP)) {
            IP = com.bytedance.sdk.component.utils.NB.pvs(qh);
        }
        final File pvs3 = com.bytedance.sdk.openadsdk.component.yiw.pvs.pvs(IP);
        if (pvs3.exists()) {
            com.bytedance.sdk.openadsdk.component.yiw.pvs.pvs(pvs3);
            pvs(yTz);
            long vG2 = pvs2.vG();
            if (nyVar != null) {
                nyVar.pvs(vG2);
                nyVar.pvs(1);
            }
            vGVar.pvs();
            pvs(cRVar, (Jd) null);
            return;
        }
        if (mnm.Jd().CvL(String.valueOf(yTz)) && !com.bytedance.sdk.component.utils.mnm.Jd(mnm.pvs())) {
            vGVar.pvs(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs4 = cR.pvs(pvs3.getParent(), cRVar);
        pvs4.pvs("material_meta", cRVar);
        pvs4.pvs("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.video.Jd.pvs.pvs(pvs4, new pvs.InterfaceC0017pvs() { // from class: com.bytedance.sdk.openadsdk.component.sUS.6
            @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
            public void icD(com.bykv.vk.openvk.component.video.api.vG.vG vGVar2, int i) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar2, int i) {
                sUS.this.pvs(yTz);
                long vG3 = pvs2.vG();
                com.bytedance.sdk.openadsdk.component.Jd.pvs.icD(cRVar, vG3, true);
                ny nyVar2 = nyVar;
                if (nyVar2 != null) {
                    nyVar2.pvs(vG3);
                    nyVar.pvs(2);
                }
                vGVar.pvs();
                sUS.pvs(cRVar, (Jd) null);
            }

            @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar2, int i, String str) {
                long vG3 = pvs2.vG();
                com.bytedance.sdk.openadsdk.component.Jd.pvs.icD(cRVar, vG3, false);
                ny nyVar2 = nyVar;
                if (nyVar2 != null) {
                    nyVar2.pvs(vG3);
                }
                vGVar.pvs(i, str);
                try {
                    if (pvs3.exists() && pvs3.isFile()) {
                        com.bytedance.sdk.component.utils.sUS.vG(pvs3);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void pvs(final cR cRVar, final ny nyVar, final icD icd) {
        final gA pvs2 = gA.pvs();
        final int yTz = cRVar.yTz();
        bNS bns = cRVar.BSi().get(0);
        String yiw = bns.yiw();
        String pvs3 = bns.pvs();
        int icD2 = bns.icD();
        int vG2 = bns.vG();
        String pvs4 = TextUtils.isEmpty(yiw) ? com.bytedance.sdk.component.utils.NB.pvs(pvs3) : yiw;
        if (TextUtils.isEmpty(pvs4)) {
            if (icd != null) {
                icd.pvs();
                return;
            }
            return;
        }
        File icD3 = com.bytedance.sdk.openadsdk.component.yiw.pvs.icD(pvs4);
        if (pvs(pvs3, yiw)) {
            vG(yTz);
            long vG3 = pvs2.vG();
            if (nyVar != null) {
                nyVar.pvs(vG3);
                nyVar.pvs(1);
            }
            icd.pvs(null);
            return;
        }
        Ju.pvs(new com.bytedance.sdk.openadsdk.qh.pvs(pvs3, bns.yiw()), icD2, vG2, new Ju.pvs() { // from class: com.bytedance.sdk.openadsdk.component.sUS.7
            @Override // com.bytedance.sdk.openadsdk.utils.Ju.pvs
            public void pvs(com.bytedance.sdk.openadsdk.qh.pvs.icD icd2) {
                if (icd2.Jd()) {
                    sUS.this.vG(yTz);
                    long vG4 = pvs2.vG();
                    com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(cRVar, vG4, true);
                    ny nyVar2 = nyVar;
                    if (nyVar2 != null) {
                        nyVar2.pvs(vG4);
                        nyVar.pvs(2);
                    }
                    icd.pvs(icd2);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(cRVar, pvs2.vG(), false);
                icd.pvs();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.Ju.pvs
            public void pvs() {
                com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(cRVar, pvs2.vG(), false);
                icd.pvs();
            }
        }, icD3.getParent());
    }

    public void pvs(int i) {
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad", "video_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public boolean icD(int i) {
        return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad", "video_has_cached".concat(String.valueOf(i)), false);
    }

    public void vG(int i) {
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad", "image_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public boolean Jd(int i) {
        return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad", "image_has_cached".concat(String.valueOf(i)), false);
    }

    public void pvs(com.bytedance.sdk.openadsdk.component.NB.pvs pvsVar) {
        if (pvsVar.icD() != null) {
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad", "material_expiration_time" + pvsVar.pvs(), Long.valueOf(pvsVar.icD().elv()));
            icD(pvsVar);
        }
    }

    public cR NB(int i) {
        long pvs2 = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad", "material_expiration_time".concat(String.valueOf(i)), -1L);
        cR sUS = sUS(i);
        if (System.currentTimeMillis() / 1000 < pvs2 && sUS != null) {
            return sUS;
        }
        if (sUS == null && pvs2 == -1) {
            return null;
        }
        yiw(i);
        if (sUS == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(sUS);
        return null;
    }

    public cR sUS(int i) {
        String str;
        String icD2 = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("tt_openad_materialMeta", "material".concat(String.valueOf(i)), null);
        if (!TextUtils.isEmpty(icD2)) {
            try {
                str = com.bytedance.sdk.component.utils.pvs.vG(new JSONObject(icD2).optString(PglCryptUtils.KEY_MESSAGE));
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdCacheManager", e.getMessage());
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    cR pvs2 = com.bytedance.sdk.openadsdk.core.icD.pvs(new JSONObject(str));
                    if (pvs2 != null) {
                        return pvs2;
                    }
                } catch (JSONException e2) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdCacheManager", e2.getMessage());
                }
            }
        }
        return null;
    }

    private void icD(com.bytedance.sdk.openadsdk.component.NB.pvs pvsVar) {
        ae.pvs(new pvs(pvsVar), 5);
    }

    public String pvs(cR cRVar) {
        if (cRVar != null && cRVar.od() != null && !TextUtils.isEmpty(cRVar.od().qh())) {
            String qh = cRVar.od().qh();
            String IP = cRVar.od().IP();
            if (TextUtils.isEmpty(IP)) {
                IP = com.bytedance.sdk.component.utils.NB.pvs(qh);
            }
            File pvs2 = com.bytedance.sdk.openadsdk.component.yiw.pvs.pvs(IP);
            if (pvs2.exists() && pvs2.isFile()) {
                return pvs2.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean icD(cR cRVar) {
        if (cRVar == null || cRVar.BSi() == null || cRVar.BSi().size() == 0 || TextUtils.isEmpty(cRVar.BSi().get(0).pvs())) {
            return false;
        }
        bNS bns = cRVar.BSi().get(0);
        return pvs(bns.pvs(), bns.yiw());
    }

    public boolean pvs(String str, String str2) {
        boolean z;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.NB.pvs(str);
            }
            File icD2 = com.bytedance.sdk.openadsdk.component.yiw.pvs.icD(str2);
            InputStream pvs2 = com.bytedance.sdk.openadsdk.sUS.Jd.pvs(str, str2);
            if (pvs2 != null) {
                try {
                    pvs2.close();
                } catch (IOException e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdCacheManager", e.getMessage());
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (com.bytedance.sdk.openadsdk.sUS.Jd.pvs(str, str2, icD2.getParent())) {
                    return true;
                }
                if (new File(icD2.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }

    public void pvs(File file) {
        try {
            this.icD.pvs(file);
        } catch (IOException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdCacheManager", "trimFileCache fail", e);
        }
    }

    public void yiw(int i) {
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad_materialMeta", "material".concat(String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad", "material_expiration_time".concat(String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad", "video_has_cached".concat(String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad", "image_has_cached".concat(String.valueOf(i)));
    }

    public void pvs() {
        File[] listFiles;
        try {
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File cacheDir = this.Jd.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.sUS.8
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    if (file == null) {
                        return false;
                    }
                    String name = file.getName();
                    return name.contains("openad_image_cache") || name.contains("openad_video_cache");
                }
            })) == null) {
                return;
            }
            for (File file : listFiles) {
                try {
                    com.bytedance.sdk.component.utils.sUS.vG(file);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }

    public String icD() {
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return name + "/openad_image_cache/";
        }
        return name + "//openad_image_cache/";
    }

    private int vG(AdSlot adSlot) {
        long pvs2 = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad", "material_expiration_time" + adSlot.getCodeId(), -1L);
        Object[] objArr = new Object[2];
        Integer.valueOf(pvs2 == -1 ? 0 : 1);
        return pvs2 == -1 ? 0 : 1;
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    private class pvs extends com.bytedance.sdk.component.so.so {
        private final com.bytedance.sdk.openadsdk.component.NB.pvs icD;

        public pvs(com.bytedance.sdk.openadsdk.component.NB.pvs pvsVar) {
            super("App Open Ad Write Cache");
            this.icD = pvsVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_openad_materialMeta", "material" + this.icD.pvs(), com.bytedance.sdk.component.utils.pvs.pvs(this.icD.icD().wjr()).toString());
            } catch (Throwable unused) {
            }
        }
    }
}
