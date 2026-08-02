package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vq {
    public static final /* synthetic */ int a = 0;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(30);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(31);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(33);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public static final Integer a(String str) {
        return ksp.b(str, "BAKLAVA") ? 0 : null;
    }
}
