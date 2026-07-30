package q0;

import android.os.Trace;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0831a {
    public static void a(int i2, String str) {
        Trace.beginAsyncSection(str, i2);
    }

    public static void b(int i2, String str) {
        Trace.endAsyncSection(str, i2);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
