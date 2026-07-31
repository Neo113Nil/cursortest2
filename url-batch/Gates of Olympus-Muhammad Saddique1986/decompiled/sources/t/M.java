package t;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final C0979g f8459a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        f2.j.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f8459a = lowerCase.equals("robolectric") ? new C0979g() : null;
    }
}
