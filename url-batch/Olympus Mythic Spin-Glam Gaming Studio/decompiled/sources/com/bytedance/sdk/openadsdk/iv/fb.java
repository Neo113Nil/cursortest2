package com.bytedance.sdk.openadsdk.iv;

import android.content.Context;
import com.bytedance.sdk.component.btk.cn;
import com.bytedance.sdk.component.btk.fs.zn.btk;
import com.bytedance.sdk.component.btk.iqz;
import com.bytedance.sdk.component.btk.iv;
import com.bytedance.sdk.component.btk.phc;
import com.bytedance.sdk.component.fs.zmn.hhw;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.rc;
import com.bytedance.sdk.component.fs.zmn.rt;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.kgc;
import com.bytedance.sdk.openadsdk.utils.hgd;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class fb {
    public static iv zmn(String str) {
        return zmn.fs(str);
    }

    public static iv zmn(kgc kgcVar) {
        return zmn.fs(kgcVar);
    }

    public static InputStream zmn(String str, String str2) {
        return zmn.fs(str, str2);
    }

    public static boolean zmn(String str, String str2, String str3) {
        return zmn.fs(str, str2, str3);
    }

    public static cn zmn() {
        return zmn.fs;
    }

    public static boolean fs() {
        return zmn.zmn;
    }

    private static final class zmn {
        private static final cn fs = zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
        private static int zn = 10;
        private static int fb = 15;
        private static int btk = 30;
        public static boolean zmn = false;

        public static void zmn() {
            zn = com.bytedance.sdk.openadsdk.uqh.btk.zmn("image_config", "bitmap_cache_count", 10);
            fb = com.bytedance.sdk.openadsdk.uqh.btk.zmn("image_config", "data_cache_count", 15);
            btk = com.bytedance.sdk.openadsdk.uqh.btk.zmn("image_config", "disk_cache_count", 30);
            zmn = com.bytedance.sdk.openadsdk.uqh.btk.zmn("img_need_scale", 0) == 1;
        }

        private static cn zmn(Context context) {
            zmn();
            return com.bytedance.sdk.component.btk.fs.zn.fs.zmn(context, new btk.zmn().zmn(new com.bytedance.sdk.component.btk.fs.zn.zmn.fs(0, zn, fb, btk, new File(CacheDirFactory.getImageCacheDir("image_p")))).zmn(zmn).zmn(new iqz() { // from class: com.bytedance.sdk.openadsdk.iv.fb.zmn.2
                @Override // com.bytedance.sdk.component.btk.iqz
                public ExecutorService zmn() {
                    return nu.fs();
                }

                @Override // com.bytedance.sdk.component.btk.iqz
                public ExecutorService fs() {
                    return nu.zn();
                }
            }).zmn(new phc() { // from class: com.bytedance.sdk.openadsdk.iv.fb.zmn.1
                @Override // com.bytedance.sdk.component.btk.phc
                public void zmn(int i, String str) {
                    com.bytedance.sdk.openadsdk.cyb.fb.zmn(str, true);
                }
            }).zmn(new C0198zmn()).zmn());
        }

        /* renamed from: com.bytedance.sdk.openadsdk.iv.fb$zmn$zmn, reason: collision with other inner class name */
        private static class C0198zmn implements com.bytedance.sdk.component.btk.fb {
            private C0198zmn() {
            }

            @Override // com.bytedance.sdk.component.btk.fb
            /* renamed from: fs, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.component.btk.zmn.zn zmn(com.bytedance.sdk.component.btk.btk btkVar) {
                rc zg = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zg();
                klz fs = new klz.zmn().fs(btkVar.zmn()).zmn().fs();
                rt rtVar = null;
                com.bytedance.sdk.component.btk.zmn.fb fbVar = btkVar.zn() ? new com.bytedance.sdk.component.btk.zmn.fb() : null;
                if (fbVar != null) {
                    fbVar.zmn(System.currentTimeMillis());
                }
                try {
                    rtVar = zg.zmn(fs).fs();
                    if (fbVar != null) {
                        fbVar.fs(System.currentTimeMillis());
                    }
                    return new com.bytedance.sdk.component.btk.zmn.zn(rtVar.zn(), rtVar.hhw().fb(), "", zmn(btkVar, rtVar));
                } catch (Throwable th) {
                    try {
                        return zmn(fbVar, th);
                    } finally {
                        com.bytedance.sdk.component.utils.iv.zmn(rtVar);
                    }
                }
            }

            private Map<String, String> zmn(com.bytedance.sdk.component.btk.btk btkVar, rt rtVar) {
                if (!btkVar.fs()) {
                    return null;
                }
                hhw nps = rtVar.nps();
                HashMap hashMap = new HashMap();
                int zmn = nps.zmn();
                for (int i = 0; i < zmn; i++) {
                    String zmn2 = nps.zmn(i);
                    String fs = nps.fs(i);
                    if (zmn2 != null) {
                        hashMap.put(zmn2, fs);
                    }
                }
                return hashMap;
            }

            private com.bytedance.sdk.component.btk.zmn.zn zmn(com.bytedance.sdk.component.btk.zmn.fb fbVar, Throwable th) {
                th.getMessage();
                if (fbVar != null) {
                    fbVar.zn(System.currentTimeMillis());
                }
                com.bytedance.sdk.component.btk.zmn.zn znVar = new com.bytedance.sdk.component.btk.zmn.zn(98765, th, "net failed");
                znVar.zmn(fbVar);
                return znVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static iv fs(String str) {
            return zmn(fs.zmn(str).btk(jy.btk(com.bytedance.sdk.openadsdk.core.kgc.zmn())).fb(jy.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static iv fs(kgc kgcVar) {
            return zmn(fs.zmn(kgcVar.zmn()).zmn(kgcVar.fs()).fs(kgcVar.zn()).btk(jy.btk(com.bytedance.sdk.openadsdk.core.kgc.zmn())).fb(jy.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn())).zmn(kgcVar.nps()));
        }

        private static iv zmn(iv ivVar) {
            return hgd.zmn() ? ivVar.zmn(new btk()) : ivVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream fs(String str, String str2) {
            return fs.zmn(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean fs(String str, String str2, String str3) {
            return fs.zmn(str, str2, str3);
        }
    }
}
