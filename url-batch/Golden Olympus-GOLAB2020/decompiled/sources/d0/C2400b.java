package d0;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2400b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2400b f36154a = new C2400b();

    /* renamed from: d0.b$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36155a = new a();

        private a() {
        }

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(31);
            return extensionVersion;
        }
    }

    /* renamed from: d0.b$b, reason: collision with other inner class name */
    private static final class C0211b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0211b f36156a = new C0211b();

        private C0211b() {
        }

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    private C2400b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C0211b.f36156a.a();
        }
        return 0;
    }

    public final int b() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 31 || i4 == 32) {
            return a.f36155a.a();
        }
        return 0;
    }
}
