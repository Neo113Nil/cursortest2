package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.zmn;
import com.bykv.vk.openvk.zmn.zmn.zmn.zmn.fs;
import com.bytedance.sdk.component.utils.nps;
import com.bytedance.sdk.openadsdk.core.kgc;
import java.io.File;

/* loaded from: classes9.dex */
public class CacheDirFactory {
    public static volatile fs MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String zmn;

    public static int getCacheType() {
        return 1;
    }

    private static fs zmn() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        zmn zmnVar = new zmn();
                        MEDIA_CACHE_DIR = zmnVar;
                        zmnVar.zmn(getRootDir());
                        MEDIA_CACHE_DIR.fb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File zmn2 = nps.zmn(kgc.zmn(), "tt_ad");
        if (zmn2.isFile()) {
            zmn2.delete();
        }
        if (!zmn2.exists()) {
            zmn2.mkdirs();
        }
        String absolutePath = zmn2.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    public static fs getICacheDir(int i) {
        return zmn();
    }

    public static String getImageCacheDir(String str) {
        if (zmn == null) {
            zmn = getDiskCacheDirPath(str);
        }
        return zmn;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }
}
