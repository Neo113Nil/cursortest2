package k5;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f6106a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        double parseDouble;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            try {
                parseDouble = Double.parseDouble(property);
            } catch (NumberFormatException unused) {
            }
            boolean z7 = false;
            if (Boolean.parseBoolean(H4.d.b("otel.java.experimental.exporter.unsafe.enabled", (parseDouble != -1.0d || parseDouble > 22.0d) ? "false" : "true"))) {
                try {
                    Class.forName("sun.misc.Unsafe", false, s.class.getClassLoader());
                    if (r.f6105a != null) {
                        z7 = true;
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
            f6106a = z7;
        }
        parseDouble = -1.0d;
        boolean z72 = false;
        if (Boolean.parseBoolean(H4.d.b("otel.java.experimental.exporter.unsafe.enabled", (parseDouble != -1.0d || parseDouble > 22.0d) ? "false" : "true"))) {
        }
        f6106a = z72;
    }

    public static int a() {
        return r.f6105a.arrayBaseOffset(byte[].class);
    }

    public static byte b(String str, long j) {
        return r.f6105a.getByte(str, j);
    }

    public static long c(long j, Object obj) {
        return r.f6105a.getLong(obj, j);
    }

    public static Object d(String str, long j) {
        return r.f6105a.getObject(str, j);
    }

    public static long e(Field field) {
        return r.f6105a.objectFieldOffset(field);
    }
}
