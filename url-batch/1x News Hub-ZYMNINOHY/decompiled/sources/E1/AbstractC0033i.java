package E1;

import Y1.C0104a;
import Y1.C0111h;
import b2.C0192f;
import com.google.android.gms.internal.play_billing.Z0;
import io.appmetrica.analytics.impl.C0642l9;

/* renamed from: E1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0033i {
    public static int a(String str) {
        String str2;
        for (int i3 : M.j.c(2)) {
            if (i3 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i3 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i3;
            }
        }
        throw new NoSuchFieldException(j("No such Brightness: ", str));
    }

    public static int b(String str) {
        for (int i3 : M.j.c(8)) {
            String str2 = null;
            switch (i3) {
                case 1:
                    break;
                case 2:
                    str2 = "HapticFeedbackType.lightImpact";
                    break;
                case 3:
                    str2 = "HapticFeedbackType.mediumImpact";
                    break;
                case 4:
                    str2 = "HapticFeedbackType.heavyImpact";
                    break;
                case 5:
                    str2 = "HapticFeedbackType.selectionClick";
                    break;
                case 6:
                    str2 = "HapticFeedbackType.successNotification";
                    break;
                case 7:
                    str2 = "HapticFeedbackType.warningNotification";
                    break;
                case 8:
                    str2 = "HapticFeedbackType.errorNotification";
                    break;
                default:
                    throw null;
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i3;
            }
        }
        throw new NoSuchFieldException(j("No such HapticFeedbackType: ", str));
    }

    public static int c(String str) {
        String str2;
        for (int i3 : M.j.c(3)) {
            if (i3 == 1) {
                str2 = "SystemSoundType.click";
            } else if (i3 == 2) {
                str2 = "SystemSoundType.tick";
            } else {
                if (i3 != 3) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i3;
            }
        }
        throw new NoSuchFieldException(j("No such SoundType: ", str));
    }

    public static /* synthetic */ int d(int i3) {
        switch (i3) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case C0642l9.f7777C /* 19 */:
                return 262144;
            case C0642l9.f7778D /* 20 */:
                return 524288;
            case C0642l9.f7779E /* 21 */:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case C0642l9.f7780F /* 25 */:
                return 16777216;
            case C0642l9.f7781G /* 26 */:
                return 33554432;
            case C0642l9.f7782H /* 27 */:
                return 67108864;
            case 28:
                return 134217728;
            case C0642l9.f7783I /* 29 */:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            case 32:
                return Integer.MIN_VALUE;
            default:
                throw null;
        }
    }

    public static int e(int i3, int i4, int i5) {
        return Z0.d0(i3) + i4 + i5;
    }

    public static int f(int i3, int i4, int i5, int i6) {
        return Z0.d0(i3) + i4 + i5 + i6;
    }

    public static String g(int i3, int i4, String str, String str2) {
        return str + i3 + str2 + i4;
    }

    public static String h(int i3, String str) {
        return str + i3;
    }

    public static String i(int i3, String str, String str2) {
        return str + i3 + str2;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(String str, Throwable th, String str2, String str3) {
        return str + th + str2 + str3;
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ void n(int i3, String str) {
        if (i3 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = kotlin.jvm.internal.j.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            kotlin.jvm.internal.j.f(nullPointerException, kotlin.jvm.internal.j.class.getName());
            throw nullPointerException;
        }
    }

    public static void o(C0104a c0104a, String str, Object obj) {
        C0111h.a(str, obj, C0192f.a(android.support.v4.media.session.a.k(c0104a)));
    }

    public static /* synthetic */ void p(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void q(String str, String str2, String str3) {
        android.support.v4.media.session.a.k(new C0104a(str, str2, str3));
    }

    public static void r(String str, String str2, String str3, String str4, Object obj) {
        C0111h.a(str4, obj, C0192f.a(android.support.v4.media.session.a.k(new C0104a(str, str2, str3))));
    }

    public static String s(String str, String str2) {
        return str + str2;
    }
}
