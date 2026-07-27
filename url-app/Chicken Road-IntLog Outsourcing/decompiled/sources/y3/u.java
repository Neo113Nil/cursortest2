package y3;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final long f12435a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f12436b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12437c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f12438d;

    static {
        long a6 = a("value", byte[].class);
        f12435a = a6;
        long a7 = a("coder", Byte.TYPE);
        f12436b = a7;
        f12437c = t.f12434a ? t.a() : -1;
        f12438d = (a6 == -1 || a7 == -1) ? false : true;
    }

    public static long a(String str, Class cls) {
        if (!t.f12434a) {
            return -1L;
        }
        try {
            Field declaredField = String.class.getDeclaredField(str);
            if (declaredField.getType() != cls) {
                return -1L;
            }
            return t.e(declaredField);
        } catch (Exception unused) {
            return -1L;
        }
    }
}
