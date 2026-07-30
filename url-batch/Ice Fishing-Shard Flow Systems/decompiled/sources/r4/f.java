package r4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ String a(int i2) {
        if (i2 == 1) {
            return "otel.sdk.exporter.span";
        }
        if (i2 == 2) {
            return "otel.sdk.exporter.metric_data_point";
        }
        if (i2 == 3) {
            return "otel.sdk.exporter.log";
        }
        if (i2 == 4) {
            return "TBD";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i2) {
        if (i2 == 1) {
            return "span";
        }
        if (i2 == 2) {
            return "data_point";
        }
        if (i2 == 3) {
            return "log_record";
        }
        if (i2 == 4) {
            return "TBD";
        }
        throw null;
    }

    public static String c(String str, String str2) {
        return str + str2;
    }

    public static String d(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String e(String str, Throwable th, String str2, String str3) {
        return str + th + str2 + str3;
    }

    public static String f(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String g(Throwable th, String str) {
        Intrinsics.checkNotNullParameter(th, str);
        return th.getClass().getSimpleName();
    }

    public static void h(t2.c cVar, Class cls, Class cls2, Class cls3, Class cls4) {
        cVar.register(cls).provides(cls2);
        cVar.register(cls3).provides(cls4);
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String j(int i2) {
        return i2 != 1 ? i2 != 2 ? "null" : "LATEST" : "LEGACY";
    }
}
