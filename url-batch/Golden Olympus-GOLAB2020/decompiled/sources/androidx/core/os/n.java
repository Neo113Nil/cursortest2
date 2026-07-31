package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static long f11832a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f11833b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f11834c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f11835d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f11836e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f11832a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f11833b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f11834c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f11835d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f11836e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e4) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e4);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
