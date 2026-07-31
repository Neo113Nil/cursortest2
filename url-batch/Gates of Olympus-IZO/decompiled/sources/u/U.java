package u;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final w f8048a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Z1.i.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f8048a = lowerCase.equals("robolectric") ? new w() : null;
    }
}
