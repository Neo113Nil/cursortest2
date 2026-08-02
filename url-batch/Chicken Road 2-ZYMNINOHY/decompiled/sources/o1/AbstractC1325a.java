package o1;

import android.os.Trace;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1325a {
    public static void a(String str, int i4) {
        Trace.beginAsyncSection(str, i4);
    }

    public static void b(String str, int i4) {
        Trace.endAsyncSection(str, i4);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
