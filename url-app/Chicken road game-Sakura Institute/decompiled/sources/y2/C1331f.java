package y2;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1331f {
    public static void a(Throwable th, Throwable exception) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th != exception) {
            G2.b.f3169a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
