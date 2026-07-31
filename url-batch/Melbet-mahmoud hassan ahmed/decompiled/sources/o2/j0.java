package o2;

import android.os.Trace;

/* loaded from: classes.dex */
public final class j0 {
    public static void a(String str) {
        if (m0.f19752a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (m0.f19752a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}
