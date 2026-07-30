package J6;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1460a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1461b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1462c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1463d;

    static {
        long a9 = a(byte[].class, "value");
        f1460a = a9;
        long a10 = a(Byte.TYPE, "coder");
        f1461b = a10;
        f1462c = v.f1459a ? v.a() : -1;
        f1463d = (a9 == -1 || a10 == -1) ? false : true;
    }

    public static long a(Class cls, String str) {
        if (!v.f1459a) {
            return -1L;
        }
        try {
            Field declaredField = String.class.getDeclaredField(str);
            if (declaredField.getType() != cls) {
                return -1L;
            }
            return v.e(declaredField);
        } catch (Exception unused) {
            return -1L;
        }
    }
}
