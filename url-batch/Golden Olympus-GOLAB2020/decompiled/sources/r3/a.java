package r3;

import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.IdentityHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    private static final Appendable a(Appendable appendable, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            appendable.append("\t");
        }
        return appendable;
    }

    public static final void b(Throwable th, Appendable out) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        d(th, out, 0, null, stackTrace, 0, new IdentityHashMap(), 22, null);
    }

    private static final void c(Throwable th, Appendable appendable, int i4, String str, StackTraceElement[] stackTraceElementArr, int i5, Map map) {
        Map map2 = map;
        if (map2.containsKey(th)) {
            Appendable append = a(appendable, 1).append("[CIRCULAR REFERENCE: ").append(th.toString()).append(b9.i.f15552e);
            Intrinsics.checkNotNullExpressionValue(append, "out.appendIndent(1)\n    …s.toString()).append(\"]\")");
            Intrinsics.checkNotNullExpressionValue(append.append('\n'), "append('\\n')");
            return;
        }
        i(map2, th);
        Appendable append2 = a(appendable, i4).append(str).append(th.toString());
        Intrinsics.checkNotNullExpressionValue(append2, "out.appendIndent(indent)…).append(this.toString())");
        Intrinsics.checkNotNullExpressionValue(append2.append('\n'), "append('\\n')");
        int h4 = h(th, stackTraceElementArr);
        int length = h4 > 0 ? h4 : stackTraceElementArr.length - i5;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            f(stackTraceElementArr[i7], appendable, i4 + 1, null, 4, null);
        }
        if (h4 > 0) {
            Appendable append3 = a(appendable, i4 + 1).append("... ").append(String.valueOf(h4)).append(" calls repeat");
            Intrinsics.checkNotNullExpressionValue(append3, "out.appendIndent(indent …).append(\" calls repeat\")");
            Intrinsics.checkNotNullExpressionValue(append3.append('\n'), "append('\\n')");
        } else if (i5 != 0) {
            Appendable append4 = a(appendable, i4 + 1).append("... ").append(String.valueOf(i5)).append(" more");
            Intrinsics.checkNotNullExpressionValue(append4, "out.appendIndent(indent …String()).append(\" more\")");
            Intrinsics.checkNotNullExpressionValue(append4.append('\n'), "append('\\n')");
        }
        Throwable[] suppressed = th.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "suppressed");
        int length2 = suppressed.length;
        while (i6 < length2) {
            Throwable supp = suppressed[i6];
            StackTraceElement[] suppTrace = supp.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(supp, "supp");
            Intrinsics.checkNotNullExpressionValue(suppTrace, "suppTrace");
            c(supp, appendable, i4 + 1, "Suppressed: ", suppTrace, g(stackTraceElementArr, suppTrace), map2);
            i6++;
            map2 = map;
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            StackTraceElement[] causeTrace = cause.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(causeTrace, "causeTrace");
            c(cause, appendable, i4, "Caused by: ", causeTrace, g(stackTraceElementArr, causeTrace), map);
        }
    }

    static /* synthetic */ void d(Throwable th, Appendable appendable, int i4, String str, StackTraceElement[] stackTraceElementArr, int i5, Map map, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            str = "";
        }
        if ((i6 & 16) != 0) {
            i5 = 0;
        }
        c(th, appendable, i4, str, stackTraceElementArr, i5, map);
    }

    public static final void e(StackTraceElement stackTraceElement, Appendable out, int i4, String prefix) {
        String fileName;
        Intrinsics.checkNotNullParameter(stackTraceElement, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        a(out, i4).append(prefix);
        if (stackTraceElement.isNativeMethod()) {
            fileName = "Native Method";
        } else {
            fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "Unknown Source";
            }
        }
        out.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(fileName);
        if (stackTraceElement.getLineNumber() >= 0) {
            out.append(StringUtils.PROCESS_POSTFIX_DELIMITER).append(String.valueOf(stackTraceElement.getLineNumber()));
        }
        Appendable append = out.append(")");
        Intrinsics.checkNotNullExpressionValue(append, "out.append(\")\")");
        Intrinsics.checkNotNullExpressionValue(append.append('\n'), "append('\\n')");
    }

    public static /* synthetic */ void f(StackTraceElement stackTraceElement, Appendable appendable, int i4, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 1;
        }
        if ((i5 & 4) != 0) {
            str = "at ";
        }
        e(stackTraceElement, appendable, i4, str);
    }

    private static final int g(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int M3 = AbstractC3219i.M(stackTraceElementArr);
        for (int M4 = AbstractC3219i.M(stackTraceElementArr2); M3 >= 0 && M4 >= 0 && Intrinsics.areEqual(stackTraceElementArr[M3], stackTraceElementArr2[M4]); M4--) {
            M3--;
        }
        return AbstractC3219i.M(stackTraceElementArr) - M3;
    }

    private static final int h(Throwable th, StackTraceElement[] stackTraceElementArr) {
        if (th instanceof StackOverflowError) {
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            int length = stackTraceElementArr.length;
            for (int i4 = 1; i4 < length; i4++) {
                if (Intrinsics.areEqual(stackTraceElement, stackTraceElementArr[i4])) {
                    return i4;
                }
            }
        }
        return 0;
    }

    private static final void i(Map map, Object obj) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.put(obj, Unit.f41027a);
    }
}
