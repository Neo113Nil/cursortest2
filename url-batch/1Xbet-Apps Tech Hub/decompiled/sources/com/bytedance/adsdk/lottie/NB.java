package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.os.Trace;
import java.io.File;

/* compiled from: L.java */
/* loaded from: classes.dex */
public class NB {
    private static boolean Jd = true;
    private static com.bytedance.adsdk.lottie.Jd.sUS Mxy = null;
    private static String[] NB = null;
    private static com.bytedance.adsdk.lottie.Jd.NB Wyp = null;
    private static boolean icD = false;
    private static volatile com.bytedance.adsdk.lottie.Jd.yiw kj = null;
    public static boolean pvs = false;
    private static volatile com.bytedance.adsdk.lottie.Jd.so qh = null;
    private static long[] sUS = null;
    private static int so = 0;
    private static boolean vG = true;
    private static int yiw;

    public static void pvs(String str) {
        if (icD) {
            int i = yiw;
            if (i == 20) {
                so++;
                return;
            }
            NB[i] = str;
            sUS[i] = System.nanoTime();
            Trace.beginSection(str);
            yiw++;
        }
    }

    public static float icD(String str) {
        int i = so;
        if (i > 0) {
            so = i - 1;
            return 0.0f;
        }
        if (!icD) {
            return 0.0f;
        }
        int i2 = yiw - 1;
        yiw = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(NB[i2])) {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + NB[yiw] + ".");
        }
        Trace.endSection();
        return (System.nanoTime() - sUS[yiw]) / 1000000.0f;
    }

    public static com.bytedance.adsdk.lottie.Jd.so pvs(Context context) {
        com.bytedance.adsdk.lottie.Jd.so soVar;
        com.bytedance.adsdk.lottie.Jd.so soVar2 = qh;
        if (soVar2 != null) {
            return soVar2;
        }
        synchronized (com.bytedance.adsdk.lottie.Jd.so.class) {
            soVar = qh;
            if (soVar == null) {
                com.bytedance.adsdk.lottie.Jd.yiw icD2 = icD(context);
                com.bytedance.adsdk.lottie.Jd.sUS sus = Mxy;
                if (sus == null) {
                    sus = new com.bytedance.adsdk.lottie.Jd.icD();
                }
                soVar = new com.bytedance.adsdk.lottie.Jd.so(icD2, sus);
                qh = soVar;
            }
        }
        return soVar;
    }

    public static com.bytedance.adsdk.lottie.Jd.yiw icD(Context context) {
        com.bytedance.adsdk.lottie.Jd.yiw yiwVar;
        if (!vG) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.lottie.Jd.yiw yiwVar2 = kj;
        if (yiwVar2 != null) {
            return yiwVar2;
        }
        synchronized (com.bytedance.adsdk.lottie.Jd.yiw.class) {
            yiwVar = kj;
            if (yiwVar == null) {
                com.bytedance.adsdk.lottie.Jd.NB nb = Wyp;
                if (nb == null) {
                    nb = new com.bytedance.adsdk.lottie.Jd.NB() { // from class: com.bytedance.adsdk.lottie.NB.1
                        @Override // com.bytedance.adsdk.lottie.Jd.NB
                        public File pvs() {
                            return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                        }
                    };
                }
                yiwVar = new com.bytedance.adsdk.lottie.Jd.yiw(nb);
                kj = yiwVar;
            }
        }
        return yiwVar;
    }

    public static boolean pvs() {
        return Jd;
    }
}
