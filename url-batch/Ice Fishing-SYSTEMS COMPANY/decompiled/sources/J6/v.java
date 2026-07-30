package J6;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1459a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        double parseDouble;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            try {
                parseDouble = Double.parseDouble(property);
            } catch (NumberFormatException unused) {
            }
            boolean z8 = false;
            if (Boolean.parseBoolean(g6.d.b("otel.java.experimental.exporter.unsafe.enabled", (parseDouble != -1.0d || parseDouble > 22.0d) ? "false" : "true"))) {
                try {
                    Class.forName("sun.misc.Unsafe", false, v.class.getClassLoader());
                    if (u.f1458a != null) {
                        z8 = true;
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
            f1459a = z8;
        }
        parseDouble = -1.0d;
        boolean z82 = false;
        if (Boolean.parseBoolean(g6.d.b("otel.java.experimental.exporter.unsafe.enabled", (parseDouble != -1.0d || parseDouble > 22.0d) ? "false" : "true"))) {
        }
        f1459a = z82;
    }

    public static int a() {
        return u.f1458a.arrayBaseOffset(byte[].class);
    }

    public static byte b(String str, long j9) {
        return u.f1458a.getByte(str, j9);
    }

    public static long c(long j9, Object obj) {
        return u.f1458a.getLong(obj, j9);
    }

    public static Object d(String str, long j9) {
        return u.f1458a.getObject(str, j9);
    }

    public static long e(Field field) {
        return u.f1458a.objectFieldOffset(field);
    }
}
