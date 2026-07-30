package k5;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6107a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f6108b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6109c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f6110d;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    static {
        Field declaredField;
        long e7;
        Field declaredField2;
        long e8;
        if (s.f6106a) {
            try {
                declaredField = String.class.getDeclaredField("value");
            } catch (Exception unused) {
            }
            if (declaredField.getType() == byte[].class) {
                e7 = s.e(declaredField);
                f6107a = e7;
                if (s.f6106a) {
                    try {
                        declaredField2 = String.class.getDeclaredField("coder");
                    } catch (Exception unused2) {
                    }
                    if (declaredField2.getType() == Byte.TYPE) {
                        e8 = s.e(declaredField2);
                        f6108b = e8;
                        f6109c = s.f6106a ? s.a() : -1;
                        f6110d = e7 == -1 && e8 != -1;
                    }
                }
                e8 = -1;
                f6108b = e8;
                f6109c = s.f6106a ? s.a() : -1;
                f6110d = e7 == -1 && e8 != -1;
            }
        }
        e7 = -1;
        f6107a = e7;
        if (s.f6106a) {
        }
        e8 = -1;
        f6108b = e8;
        f6109c = s.f6106a ? s.a() : -1;
        f6110d = e7 == -1 && e8 != -1;
    }
}
