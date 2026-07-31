package D4;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final long f569a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f570b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f571c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f572d;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    static {
        Field declaredField;
        long e4;
        Field declaredField2;
        long e7;
        if (u.f568a) {
            try {
                declaredField = String.class.getDeclaredField("value");
            } catch (Exception unused) {
            }
            if (declaredField.getType() == byte[].class) {
                e4 = u.e(declaredField);
                f569a = e4;
                if (u.f568a) {
                    try {
                        declaredField2 = String.class.getDeclaredField("coder");
                    } catch (Exception unused2) {
                    }
                    if (declaredField2.getType() == Byte.TYPE) {
                        e7 = u.e(declaredField2);
                        f570b = e7;
                        f571c = u.f568a ? u.a() : -1;
                        f572d = e4 == -1 && e7 != -1;
                    }
                }
                e7 = -1;
                f570b = e7;
                f571c = u.f568a ? u.a() : -1;
                f572d = e4 == -1 && e7 != -1;
            }
        }
        e4 = -1;
        f569a = e4;
        if (u.f568a) {
        }
        e7 = -1;
        f570b = e7;
        f571c = u.f568a ? u.a() : -1;
        f572d = e4 == -1 && e7 != -1;
    }
}
