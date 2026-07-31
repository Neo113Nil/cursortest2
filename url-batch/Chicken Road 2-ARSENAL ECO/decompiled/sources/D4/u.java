package D4;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f568a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        double parseDouble;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            try {
                parseDouble = Double.parseDouble(property);
            } catch (NumberFormatException unused) {
            }
            boolean z5 = false;
            if (Boolean.parseBoolean(a4.d.b("otel.java.experimental.exporter.unsafe.enabled", (parseDouble != -1.0d || parseDouble > 22.0d) ? "false" : "true"))) {
                try {
                    Class.forName("sun.misc.Unsafe", false, u.class.getClassLoader());
                    if (t.f567a != null) {
                        z5 = true;
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
            f568a = z5;
        }
        parseDouble = -1.0d;
        boolean z52 = false;
        if (Boolean.parseBoolean(a4.d.b("otel.java.experimental.exporter.unsafe.enabled", (parseDouble != -1.0d || parseDouble > 22.0d) ? "false" : "true"))) {
        }
        f568a = z52;
    }

    public static int a() {
        return t.f567a.arrayBaseOffset(byte[].class);
    }

    public static byte b(long j4, String str) {
        return t.f567a.getByte(str, j4);
    }

    public static long c(long j4, Object obj) {
        return t.f567a.getLong(obj, j4);
    }

    public static Object d(long j4, String str) {
        return t.f567a.getObject(str, j4);
    }

    public static long e(Field field) {
        return t.f567a.objectFieldOffset(field);
    }
}
