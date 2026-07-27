package y3;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f12434a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        double parseDouble;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            try {
                parseDouble = Double.parseDouble(property);
            } catch (NumberFormatException unused) {
            }
            boolean z = false;
            if (Boolean.parseBoolean(V2.d.b("otel.java.experimental.exporter.unsafe.enabled", (parseDouble != -1.0d || parseDouble > 22.0d) ? "false" : "true"))) {
                try {
                    Class.forName("sun.misc.Unsafe", false, t.class.getClassLoader());
                    if (s.f12433a != null) {
                        z = true;
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
            f12434a = z;
        }
        parseDouble = -1.0d;
        boolean z5 = false;
        if (Boolean.parseBoolean(V2.d.b("otel.java.experimental.exporter.unsafe.enabled", (parseDouble != -1.0d || parseDouble > 22.0d) ? "false" : "true"))) {
        }
        f12434a = z5;
    }

    public static int a() {
        Unsafe unsafe;
        unsafe = s.f12433a;
        return unsafe.arrayBaseOffset(byte[].class);
    }

    public static byte b(long j2, String str) {
        Unsafe unsafe;
        unsafe = s.f12433a;
        return unsafe.getByte(str, j2);
    }

    public static long c(long j2, Object obj) {
        Unsafe unsafe;
        unsafe = s.f12433a;
        return unsafe.getLong(obj, j2);
    }

    public static Object d(long j2, String str) {
        Unsafe unsafe;
        unsafe = s.f12433a;
        return unsafe.getObject(str, j2);
    }

    public static long e(Field field) {
        Unsafe unsafe;
        unsafe = s.f12433a;
        return unsafe.objectFieldOffset(field);
    }
}
