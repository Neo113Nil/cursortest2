package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Verify {
    private Verify() {
    }

    public static void verify(boolean z7) {
        if (!z7) {
            throw new VerifyException();
        }
    }

    @CanIgnoreReturnValue
    public static <T> T verifyNotNull(@CheckForNull T t7) {
        return (T) verifyNotNull(t7, "expected a non-null reference", new Object[0]);
    }

    public static void verify(boolean z7, String str, @CheckForNull Object... objArr) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, objArr));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T verifyNotNull(@CheckForNull T t7, String str, @CheckForNull Object... objArr) {
        if (t7 != null) {
            return t7;
        }
        throw new VerifyException(Strings.lenientFormat(str, objArr));
    }

    public static void verify(boolean z7, String str, char c8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c8)));
        }
    }

    public static void verify(boolean z7, String str, int i8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i8)));
        }
    }

    public static void verify(boolean z7, String str, long j8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j8)));
        }
    }

    public static void verify(boolean z7, String str, @CheckForNull Object obj) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, obj));
        }
    }

    public static void verify(boolean z7, String str, char c8, char c9) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c8), Character.valueOf(c9)));
        }
    }

    public static void verify(boolean z7, String str, int i8, char c8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i8), Character.valueOf(c8)));
        }
    }

    public static void verify(boolean z7, String str, long j8, char c8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c8)));
        }
    }

    public static void verify(boolean z7, String str, @CheckForNull Object obj, char c8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, obj, Character.valueOf(c8)));
        }
    }

    public static void verify(boolean z7, String str, char c8, int i8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c8), Integer.valueOf(i8)));
        }
    }

    public static void verify(boolean z7, String str, int i8, int i9) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }

    public static void verify(boolean z7, String str, long j8, int i8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i8)));
        }
    }

    public static void verify(boolean z7, String str, @CheckForNull Object obj, int i8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, obj, Integer.valueOf(i8)));
        }
    }

    public static void verify(boolean z7, String str, char c8, long j8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c8), Long.valueOf(j8)));
        }
    }

    public static void verify(boolean z7, String str, int i8, long j8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i8), Long.valueOf(j8)));
        }
    }

    public static void verify(boolean z7, String str, long j8, long j9) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j9)));
        }
    }

    public static void verify(boolean z7, String str, @CheckForNull Object obj, long j8) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, obj, Long.valueOf(j8)));
        }
    }

    public static void verify(boolean z7, String str, char c8, @CheckForNull Object obj) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c8), obj));
        }
    }

    public static void verify(boolean z7, String str, int i8, @CheckForNull Object obj) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i8), obj));
        }
    }

    public static void verify(boolean z7, String str, long j8, @CheckForNull Object obj) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j8), obj));
        }
    }

    public static void verify(boolean z7, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void verify(boolean z7, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void verify(boolean z7, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (!z7) {
            throw new VerifyException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
