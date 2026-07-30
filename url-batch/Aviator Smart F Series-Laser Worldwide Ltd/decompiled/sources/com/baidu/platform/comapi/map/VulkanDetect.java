package com.baidu.platform.comapi.map;

import android.view.Surface;

/* loaded from: classes2.dex */
class VulkanDetect {
    VulkanDetect() {
    }

    public static native long getNativeWindow(Surface surface);

    public static native boolean isSupportedVulkan();

    public static native void releaseNativeWindow(long j8);
}
