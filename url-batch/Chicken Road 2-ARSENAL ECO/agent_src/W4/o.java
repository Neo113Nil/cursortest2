package W4;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static final boolean a(int i7) {
        return i7 == 3 || i7 == 4 || i7 == 6;
    }

    public static /* synthetic */ int b(int i7) {
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return 1;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
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
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case com.onesignal.debug.internal.crash.r.MIN_SDK_VERSION /* 26 */:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
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

    public static String c(String str, int i7) {
        return str + i7;
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static String e(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ void f(String str, int i7) {
        if (i7 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = kotlin.jvm.internal.i.class.getName();
            int i8 = 0;
            while (!stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            while (stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            StackTraceElement stackTraceElement = stackTrace[i8];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            kotlin.jvm.internal.i.j(nullPointerException, kotlin.jvm.internal.i.class.getName());
            throw nullPointerException;
        }
    }

    public static /* synthetic */ String g(int i7) {
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "NOT_REQUIRED";
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String h(int i7) {
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "ENQUEUED";
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
