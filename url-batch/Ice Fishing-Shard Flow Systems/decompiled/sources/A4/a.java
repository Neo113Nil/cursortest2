package A4;

import a.AbstractC0169a;
import android.os.Trace;

/* loaded from: classes.dex */
public abstract class a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void d(String str) {
        Trace.beginSection(AbstractC0169a.G(a(str)));
    }
}
