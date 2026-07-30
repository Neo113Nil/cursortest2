package E;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f646a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final int f647b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f648c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f649d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f650e;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f647b = i2 >= 30 ? b.f645a.a(30) : 0;
        f648c = i2 >= 30 ? b.f645a.a(31) : 0;
        f649d = i2 >= 30 ? b.f645a.a(33) : 0;
        f650e = i2 >= 30 ? b.f645a.a(1000000) : 0;
    }

    private c() {
    }

    public static final boolean a(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (!"REL".equals(buildCodename)) {
            Locale locale = Locale.ROOT;
            String upperCase = buildCodename.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Integer num = Intrinsics.a(upperCase, "BAKLAVA") ? r1 : null;
            String upperCase2 = codename.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            r1 = Intrinsics.a(upperCase2, "BAKLAVA") ? 0 : null;
            if (num == null || r1 == null) {
                if (num == null && r1 == null) {
                    String upperCase3 = buildCodename.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                    String upperCase4 = codename.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num != null) {
                    return true;
                }
            } else if (num.intValue() >= r1.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return true;
        }
        if (i2 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("Tiramisu", CODENAME);
    }
}
