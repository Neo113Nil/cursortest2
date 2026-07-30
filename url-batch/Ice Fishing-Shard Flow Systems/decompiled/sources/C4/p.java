package C4;

import a2.C0172a;
import android.util.Log;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static int a(String str) {
        String str2;
        for (int i2 : S.i.c(2)) {
            if (i2 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i2;
            }
        }
        throw new NoSuchFieldException(r4.f.i("No such Brightness: ", str));
    }

    public static int b(String str) {
        for (int i2 : S.i.c(8)) {
            String str2 = null;
            switch (i2) {
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
                case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "HapticFeedbackType.warningNotification";
                    break;
                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "HapticFeedbackType.errorNotification";
                    break;
                default:
                    throw null;
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i2;
            }
        }
        throw new NoSuchFieldException(r4.f.i("No such HapticFeedbackType: ", str));
    }

    public static int c(String str) {
        String str2;
        for (int i2 : S.i.c(3)) {
            if (i2 == 1) {
                str2 = "SystemSoundType.click";
            } else if (i2 == 2) {
                str2 = "SystemSoundType.tick";
            } else {
                if (i2 != 3) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i2;
            }
        }
        throw new NoSuchFieldException(r4.f.i("No such SoundType: ", str));
    }

    public static /* synthetic */ int d(int i2) {
        switch (i2) {
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
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return 64;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case RequestError.STOP_TRACKING /* 11 */:
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
            case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
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

    public static int e(String str, int i2, int i5) {
        return (str.hashCode() + i2) * i5;
    }

    public static ClassCastException f(ArrayList arrayList, int i2) {
        arrayList.get(i2).getClass();
        return new ClassCastException();
    }

    public static String g(int i2, String str) {
        return str + i2;
    }

    public static String h(int i2, String str, String str2) {
        return str + i2 + str2;
    }

    public static String i(String str, String str2, char c7) {
        return str + str2 + c7;
    }

    public static String j(String str, String str2, int i2, int i5) {
        return str + i2 + str2 + i5;
    }

    public static StringBuilder k(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder l(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static HashMap m(Class cls, C0172a c0172a) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c0172a);
        return hashMap;
    }

    public static Map n(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ void o(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        Log.e(str2, sb.toString());
    }
}
