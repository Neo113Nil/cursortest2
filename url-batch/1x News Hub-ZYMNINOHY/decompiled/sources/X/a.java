package X;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(int i3, String str) {
        Trace.beginAsyncSection(str, i3);
    }

    public static void b(int i3, String str) {
        Trace.endAsyncSection(str, i3);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
