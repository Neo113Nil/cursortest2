package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hom {
    private static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final hop b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [hop] */
    static {
        hor horVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                horVar = new hor();
                break;
            }
            horVar = null;
            try {
                horVar = (hop) Class.forName(a[i]).asSubclass(hop.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (horVar != null) {
                break;
            } else {
                i++;
            }
        }
        b = horVar;
    }

    public static StackTraceElement a(Class cls, int i) {
        cls.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.Y(i, "skip count cannot be negative: "));
        }
        return b.a(cls, i + 1);
    }

    public static StackTraceElement[] b(Class cls, int i, int i2) {
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("invalid maximum depth: 0");
        }
        return b.b(cls, i, i2 + 1);
    }
}
