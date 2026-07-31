package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f43290a = Logger.getLogger("okio.Okio");

    public static final z b(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return p.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.P(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final z d(File file, boolean z4) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return p.g(new FileOutputStream(file, z4));
    }

    public static final z e(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new t(outputStream, new C());
    }

    public static final z f(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        A a4 = new A(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return a4.sink(new t(outputStream, a4));
    }

    public static /* synthetic */ z g(File file, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return p.f(file, z4);
    }

    public static final B h(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new o(new FileInputStream(file), C.NONE);
    }

    public static final B i(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new o(inputStream, new C());
    }

    public static final B j(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        A a4 = new A(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return a4.source(new o(inputStream, a4));
    }
}
