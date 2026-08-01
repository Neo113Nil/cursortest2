package com.bytedance.sdk.openadsdk.sUS;

import android.content.Context;
import com.bytedance.sdk.component.NB.Wyp;
import com.bytedance.sdk.component.NB.rCZ;
import com.bytedance.sdk.component.NB.vG.NB;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.qh;
import com.bytedance.sdk.component.icD.pvs.sUS;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.utils.Gp;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: ImageLoaderWrapper.java */
/* loaded from: classes2.dex */
public class Jd {
    public static Wyp pvs(String str) {
        return pvs.icD(str);
    }

    public static Wyp pvs(bNS bns) {
        return pvs.icD(bns);
    }

    public static InputStream pvs(String str, String str2) {
        return pvs.icD(str, str2);
    }

    public static boolean pvs(String str, String str2, String str3) {
        return pvs.icD(str, str2, str3);
    }

    public static com.bytedance.sdk.component.NB.bNS pvs() {
        return pvs.pvs;
    }

    /* compiled from: ImageLoaderWrapper.java */
    private static final class pvs {
        private static final com.bytedance.sdk.component.NB.bNS pvs = pvs(mnm.pvs());

        private static com.bytedance.sdk.component.NB.bNS pvs(Context context) {
            return com.bytedance.sdk.component.NB.vG.icD.pvs(context, new NB.pvs().pvs(new com.bytedance.sdk.component.NB.vG.pvs.pvs(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir()))).pvs(new rCZ() { // from class: com.bytedance.sdk.openadsdk.sUS.Jd.pvs.2
                @Override // com.bytedance.sdk.component.NB.rCZ
                public ExecutorService pvs() {
                    return ae.icD();
                }
            }).pvs(new com.bytedance.sdk.component.NB.Jd() { // from class: com.bytedance.sdk.openadsdk.sUS.Jd.pvs.1
                @Override // com.bytedance.sdk.component.NB.Jd
                /* renamed from: icD, reason: merged with bridge method [inline-methods] */
                public com.bytedance.sdk.component.NB.icD.Jd pvs(com.bytedance.sdk.component.NB.NB nb) {
                    qh NB = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().NB();
                    Ju icD = new Ju.pvs().icD(nb.pvs()).pvs().icD();
                    com.bytedance.sdk.component.icD.pvs.bNS bns = null;
                    com.bytedance.sdk.component.NB.icD.NB nb2 = nb.vG() ? new com.bytedance.sdk.component.NB.icD.NB() : null;
                    if (nb2 != null) {
                        nb2.pvs(System.currentTimeMillis());
                    }
                    try {
                        bns = NB.pvs(icD).pvs();
                        if (nb2 != null) {
                            nb2.icD(System.currentTimeMillis());
                        }
                        Map<String, String> pvs2 = pvs(nb, bns);
                        byte[] Jd = bns.sUS().Jd();
                        if (nb2 != null) {
                            nb2.vG(System.currentTimeMillis());
                        }
                        com.bytedance.sdk.component.NB.icD.Jd jd = new com.bytedance.sdk.component.NB.icD.Jd(bns.vG(), Jd, "", pvs2);
                        jd.pvs(nb2);
                        return jd;
                    } catch (Throwable th) {
                        try {
                            return pvs(nb2, th);
                        } finally {
                            com.bytedance.sdk.component.NB.vG.vG.icD.pvs(bns);
                        }
                    }
                }

                private Map<String, String> pvs(com.bytedance.sdk.component.NB.NB nb, com.bytedance.sdk.component.icD.pvs.bNS bns) {
                    if (!nb.icD()) {
                        return null;
                    }
                    sUS yiw = bns.yiw();
                    HashMap hashMap = new HashMap();
                    int pvs2 = yiw.pvs();
                    for (int i = 0; i < pvs2; i++) {
                        String pvs3 = yiw.pvs(i);
                        String icD = yiw.icD(i);
                        if (pvs3 != null) {
                            hashMap.put(pvs3, icD);
                        }
                    }
                    return hashMap;
                }

                private com.bytedance.sdk.component.NB.icD.Jd pvs(com.bytedance.sdk.component.NB.icD.NB nb, Throwable th) {
                    th.getMessage();
                    if (nb != null) {
                        nb.vG(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.NB.icD.Jd jd = new com.bytedance.sdk.component.NB.icD.Jd(98765, th, "net failed");
                    jd.pvs(nb);
                    return jd;
                }
            }).pvs());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Wyp icD(String str) {
            return pvs(pvs.pvs(str).NB(Pj.Jd(mnm.pvs())).Jd(Pj.vG(mnm.pvs())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Wyp icD(bNS bns) {
            return pvs(pvs.pvs(bns.pvs()).pvs(bns.icD()).icD(bns.vG()).NB(Pj.Jd(mnm.pvs())).Jd(Pj.vG(mnm.pvs())).pvs(bns.yiw()));
        }

        private static Wyp pvs(Wyp wyp) {
            return Gp.pvs() ? wyp.pvs(new NB()) : wyp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream icD(String str, String str2) {
            return pvs.pvs(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean icD(String str, String str2, String str3) {
            return pvs.pvs(str, str2, str3);
        }
    }
}
