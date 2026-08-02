package io.flutter.plugin.platform;

import android.media.MediaCodecInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(PlatformPlugin.DEFAULT_SYSTEM_UI, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(int i4, int i5, int i6) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i4, i5, i6);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void j() {
    }
}
