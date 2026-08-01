package com.bykv.vk.openvk.component.video.api;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.icD.pvs.qh;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoConfig.java */
/* loaded from: classes.dex */
public class vG {
    private static boolean Jd = false;
    private static qh NB = null;
    private static Context icD = null;
    public static boolean pvs = false;
    private static int sUS = 1;
    private static String vG;

    public static Context pvs() {
        return icD;
    }

    public static String icD() {
        if (TextUtils.isEmpty(vG)) {
            try {
                File file = new File(pvs().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                vG = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return vG;
    }

    public static void pvs(Context context, String str) {
        icD = context;
        vG = str;
    }

    public static boolean vG() {
        return Jd;
    }

    public static void pvs(boolean z) {
        Jd = z;
    }

    public static qh Jd() {
        if (NB == null) {
            NB = new qh.pvs("v_config").pvs(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS).icD(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS).vG(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS).pvs();
        }
        return NB;
    }

    public static void pvs(qh qhVar) {
        NB = qhVar;
    }

    public static boolean NB() {
        return pvs;
    }

    public static void pvs(int i) {
        sUS = i;
    }

    public static int sUS() {
        return sUS;
    }
}
