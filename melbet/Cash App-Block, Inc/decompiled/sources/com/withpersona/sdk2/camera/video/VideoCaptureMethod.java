package com.withpersona.sdk2.camera.video;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class VideoCaptureMethod {
    public static final /* synthetic */ VideoCaptureMethod[] $VALUES;
    public static final VideoCaptureMethod None;
    public static final VideoCaptureMethod Stream;
    public static final VideoCaptureMethod Upload;

    static {
        VideoCaptureMethod videoCaptureMethod = new VideoCaptureMethod("Stream", 0);
        Stream = videoCaptureMethod;
        VideoCaptureMethod videoCaptureMethod2 = new VideoCaptureMethod("Upload", 1);
        Upload = videoCaptureMethod2;
        VideoCaptureMethod videoCaptureMethod3 = new VideoCaptureMethod("None", 2);
        None = videoCaptureMethod3;
        $VALUES = new VideoCaptureMethod[]{videoCaptureMethod, videoCaptureMethod2, videoCaptureMethod3};
    }

    public static VideoCaptureMethod valueOf(String str) {
        return (VideoCaptureMethod) Enum.valueOf(VideoCaptureMethod.class, str);
    }

    public static VideoCaptureMethod[] values() {
        return (VideoCaptureMethod[]) $VALUES.clone();
    }
}
