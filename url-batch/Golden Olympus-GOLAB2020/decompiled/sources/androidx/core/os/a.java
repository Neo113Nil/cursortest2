package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11816a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f11817b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11818c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11819d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11820e;

    /* renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    private static final class C0096a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0096a f11821a = new C0096a();

        private C0096a() {
        }

        public final int a(int i4) {
            return SdkExtensions.getExtensionVersion(i4);
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        f11817b = i4 >= 30 ? C0096a.f11821a.a(30) : 0;
        f11818c = i4 >= 30 ? C0096a.f11821a.a(31) : 0;
        f11819d = i4 >= 30 ? C0096a.f11821a.a(33) : 0;
        f11820e = i4 >= 30 ? C0096a.f11821a.a(1000000) : 0;
    }

    private a() {
    }

    public static final boolean a(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.areEqual("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("VanillaIceCream", CODENAME);
    }
}
