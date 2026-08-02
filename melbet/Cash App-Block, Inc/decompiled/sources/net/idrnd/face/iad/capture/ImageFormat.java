package net.idrnd.face.iad.capture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ImageFormat {
    public static final ImageFormat JPEG;
    public static final ImageFormat PNG;
    public static final /* synthetic */ ImageFormat[] a;

    static {
        ImageFormat imageFormat = new ImageFormat("JPEG", 0);
        JPEG = imageFormat;
        ImageFormat imageFormat2 = new ImageFormat("PNG", 1);
        PNG = imageFormat2;
        a = new ImageFormat[]{imageFormat, imageFormat2, new ImageFormat("RGB_888", 2), new ImageFormat("ARGB_8888", 3), new ImageFormat("YUV_420_888", 4)};
    }

    public static ImageFormat valueOf(String str) {
        return (ImageFormat) Enum.valueOf(ImageFormat.class, str);
    }

    public static ImageFormat[] values() {
        return (ImageFormat[]) a.clone();
    }
}
