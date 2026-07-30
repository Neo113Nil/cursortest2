package s0;

import android.os.Trace;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class a implements AutoCloseable {
    public static String a(String str) {
        return str.length() < 124 ? str : str.substring(0, 124).concat("...");
    }

    public static void b(String str) {
        Trace.beginSection(a.a.D(a(str)));
    }
}
