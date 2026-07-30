package y5;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b {
    public static void addSuppressed(Throwable th, Throwable exception) {
        kotlin.jvm.internal.s.checkNotNullParameter(th, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(exception, "exception");
        if (th != exception) {
            b6.b.IMPLEMENTATIONS.addSuppressed(th, exception);
        }
    }

    public static final StackTraceElement[] getStackTrace(Throwable th) {
        kotlin.jvm.internal.s.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        kotlin.jvm.internal.s.checkNotNull(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void getStackTrace$annotations(Throwable th) {
    }

    public static final List<Throwable> getSuppressedExceptions(Throwable th) {
        kotlin.jvm.internal.s.checkNotNullParameter(th, "<this>");
        return b6.b.IMPLEMENTATIONS.getSuppressed(th);
    }

    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th) {
    }

    private static final void printStackTrace(Throwable th) {
        kotlin.jvm.internal.s.checkNotNullParameter(th, "<this>");
        th.printStackTrace();
    }

    public static String stackTraceToString(Throwable th) {
        kotlin.jvm.internal.s.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    private static final void printStackTrace(Throwable th, PrintWriter writer) {
        kotlin.jvm.internal.s.checkNotNullParameter(th, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(writer, "writer");
        th.printStackTrace(writer);
    }

    private static final void printStackTrace(Throwable th, PrintStream stream) {
        kotlin.jvm.internal.s.checkNotNullParameter(th, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(stream, "stream");
        th.printStackTrace(stream);
    }
}
