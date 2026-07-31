package C1;

import N.p;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w1.C0713a;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static int a(String str) {
        String str2;
        for (int i7 : p.d(2)) {
            if (i7 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i7 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i7;
            }
        }
        throw new NoSuchFieldException(h("No such Brightness: ", str));
    }

    public static int b(String str) {
        for (int i7 : p.d(8)) {
            String str2 = null;
            switch (i7) {
                case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                    break;
                case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
                return i7;
            }
        }
        throw new NoSuchFieldException(h("No such HapticFeedbackType: ", str));
    }

    public static int c(String str) {
        String str2;
        for (int i7 : p.d(3)) {
            if (i7 == 1) {
                str2 = "SystemSoundType.click";
            } else if (i7 == 2) {
                str2 = "SystemSoundType.tick";
            } else {
                if (i7 != 3) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i7;
            }
        }
        throw new NoSuchFieldException(h("No such SoundType: ", str));
    }

    public static /* synthetic */ String d(int i7) {
        if (i7 == 1) {
            return "otel.sdk.exporter.span";
        }
        if (i7 == 2) {
            return "otel.sdk.exporter.metric_data_point";
        }
        if (i7 == 3) {
            return "otel.sdk.exporter.log";
        }
        if (i7 == 4) {
            return "TBD";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i7) {
        if (i7 == 1) {
            return "span";
        }
        if (i7 == 2) {
            return "data_point";
        }
        if (i7 == 3) {
            return "log_record";
        }
        if (i7 == 4) {
            return "TBD";
        }
        throw null;
    }

    public static String f(int i7, int i8, String str, String str2) {
        return str + i7 + str2 + i8;
    }

    public static String g(String str, int i7, String str2) {
        return str + i7 + str2;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static HashMap i(Class cls, C0713a c0713a) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c0713a);
        return hashMap;
    }

    public static Map j(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void k(R1.c cVar, Class cls, Class cls2, Class cls3, Class cls4) {
        cVar.register(cls).provides(cls2);
        cVar.register(cls3).provides(cls4);
    }

    public static /* synthetic */ void l(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String m(int i7) {
        return i7 != 1 ? i7 != 2 ? "null" : "LATEST" : "LEGACY";
    }
}
