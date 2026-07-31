package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class g {
    private static final void a(int i7, int i8) {
        if (i8 <= i7) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i7 + ", got " + i8 + ". Please update the Kotlin standard library.").toString());
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(a aVar) {
        String str;
        kotlin.jvm.internal.i.d(aVar, "<this>");
        f b7 = b(aVar);
        if (b7 == null) {
            return null;
        }
        a(1, b7.v());
        int c7 = c(aVar);
        int i7 = c7 < 0 ? -1 : b7.l()[c7];
        String b8 = i.f18293a.b(aVar);
        if (b8 == null) {
            str = b7.c();
        } else {
            str = b8 + '/' + b7.c();
        }
        return new StackTraceElement(str, b7.m(), b7.f(), i7);
    }
}
