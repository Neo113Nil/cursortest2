package defpackage;

import com.appsflyer.deeplink.DeepLinkResult;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class bx {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeepLinkResult.Status.values().length];
        try {
            iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeepLinkResult.Status.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
