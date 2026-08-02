package kotlin;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.internal.ProgressionUtilKt;

/* loaded from: classes9.dex */
public class ExceptionsKt__ExceptionsKt {
    public static void addSuppressed(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            ProgressionUtilKt.IMPLEMENTATIONS.addSuppressed(th, th2);
        }
    }

    public static String stackTraceToString(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }
}
