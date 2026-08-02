package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class vy {
    public static long a;
    public static Method b;
    public static Method c;
    private static Method d;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                b = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                c = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a() {
        boolean isEnabled;
        if (Build.VERSION.SDK_INT >= 29) {
            isEnabled = Trace.isEnabled();
            return isEnabled;
        }
        try {
            return ((Boolean) d.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
