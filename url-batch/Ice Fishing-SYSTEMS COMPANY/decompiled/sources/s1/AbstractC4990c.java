package s1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4990c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f40419a;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        f40419a = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f40419a[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f40419a[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
