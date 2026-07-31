package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes3.dex */
public abstract class p {
    public static final z a(File file) {
        return q.b(file);
    }

    public static final z b() {
        return r.a();
    }

    public static final f c(z zVar) {
        return r.b(zVar);
    }

    public static final g d(B b4) {
        return r.c(b4);
    }

    public static final boolean e(AssertionError assertionError) {
        return q.c(assertionError);
    }

    public static final z f(File file, boolean z4) {
        return q.d(file, z4);
    }

    public static final z g(OutputStream outputStream) {
        return q.e(outputStream);
    }

    public static final z h(Socket socket) {
        return q.f(socket);
    }

    public static final B j(File file) {
        return q.h(file);
    }

    public static final B k(InputStream inputStream) {
        return q.i(inputStream);
    }

    public static final B l(Socket socket) {
        return q.j(socket);
    }
}
