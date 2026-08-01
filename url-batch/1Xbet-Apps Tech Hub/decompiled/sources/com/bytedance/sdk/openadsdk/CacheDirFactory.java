package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.pvs.icD;
import com.bykv.vk.openvk.component.video.pvs.pvs.pvs.pvs;
import com.bytedance.sdk.component.utils.sUS;
import com.bytedance.sdk.openadsdk.core.mnm;
import java.io.File;

/* loaded from: classes2.dex */
public class CacheDirFactory {
    public static volatile icD MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String pvs;

    public static int getCacheType() {
        return 1;
    }

    private static icD pvs() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    pvs pvsVar = new pvs();
                    MEDIA_CACHE_DIR = pvsVar;
                    pvsVar.pvs(getRootDir());
                    MEDIA_CACHE_DIR.Jd();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File pvs2 = sUS.pvs(mnm.pvs(), com.bytedance.sdk.openadsdk.multipro.icD.vG(), "tt_ad");
        if (pvs2.isFile()) {
            pvs2.delete();
        }
        if (!pvs2.exists()) {
            pvs2.mkdirs();
        }
        String absolutePath = pvs2.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    public static icD getICacheDir(int i) {
        return pvs();
    }

    public static String getImageCacheDir() {
        if (pvs == null) {
            pvs = getDiskCacheDirPath("image");
        }
        return pvs;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }
}
