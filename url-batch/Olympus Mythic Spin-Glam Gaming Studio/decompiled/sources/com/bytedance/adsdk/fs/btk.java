package com.bytedance.adsdk.fs;

import android.content.Context;
import android.os.Trace;
import java.io.File;

/* loaded from: classes4.dex */
public class btk {
    private static String[] btk = null;
    private static com.bytedance.adsdk.fs.fb.hhw bvs = null;
    private static boolean fb = true;
    private static boolean fs = false;
    private static long[] hhw = null;
    private static com.bytedance.adsdk.fs.fb.btk iv = null;
    private static volatile com.bytedance.adsdk.fs.fb.nps klz = null;
    private static int nps = 0;
    private static volatile com.bytedance.adsdk.fs.fb.zg rc = null;
    private static int zg = 0;
    public static boolean zmn = false;
    private static boolean zn = true;

    public static void zmn(String str) {
        if (fs) {
            int i = nps;
            if (i == 20) {
                zg++;
                return;
            }
            btk[i] = str;
            hhw[i] = System.nanoTime();
            Trace.beginSection(str);
            nps++;
        }
    }

    public static float fs(String str) {
        int i = zg;
        if (i > 0) {
            zg = i - 1;
            return 0.0f;
        }
        if (!fs) {
            return 0.0f;
        }
        int i2 = nps - 1;
        nps = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(btk[i2])) {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + btk[nps] + ".");
        }
        Trace.endSection();
        return (System.nanoTime() - hhw[nps]) / 1000000.0f;
    }

    public static com.bytedance.adsdk.fs.fb.zg zmn(Context context) {
        com.bytedance.adsdk.fs.fb.zg zgVar;
        com.bytedance.adsdk.fs.fb.zg zgVar2 = rc;
        if (zgVar2 != null) {
            return zgVar2;
        }
        synchronized (com.bytedance.adsdk.fs.fb.zg.class) {
            try {
                zgVar = rc;
                if (zgVar == null) {
                    com.bytedance.adsdk.fs.fb.nps fs2 = fs(context);
                    com.bytedance.adsdk.fs.fb.hhw hhwVar = bvs;
                    if (hhwVar == null) {
                        hhwVar = new com.bytedance.adsdk.fs.fb.fs();
                    }
                    zgVar = new com.bytedance.adsdk.fs.fb.zg(fs2, hhwVar);
                    rc = zgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zgVar;
    }

    public static com.bytedance.adsdk.fs.fb.nps fs(Context context) {
        com.bytedance.adsdk.fs.fb.nps npsVar;
        if (!zn) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.fs.fb.nps npsVar2 = klz;
        if (npsVar2 != null) {
            return npsVar2;
        }
        synchronized (com.bytedance.adsdk.fs.fb.nps.class) {
            try {
                npsVar = klz;
                if (npsVar == null) {
                    com.bytedance.adsdk.fs.fb.btk btkVar = iv;
                    if (btkVar == null) {
                        btkVar = new com.bytedance.adsdk.fs.fb.btk() { // from class: com.bytedance.adsdk.fs.btk.1
                            @Override // com.bytedance.adsdk.fs.fb.btk
                            public File zmn() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    npsVar = new com.bytedance.adsdk.fs.fb.nps(btkVar);
                    klz = npsVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return npsVar;
    }

    public static boolean zmn() {
        return fb;
    }
}
