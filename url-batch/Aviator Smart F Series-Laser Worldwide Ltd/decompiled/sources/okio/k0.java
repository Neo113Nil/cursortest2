package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.text.StringsKt__StringsKt;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes5.dex */
abstract /* synthetic */ class k0 {
    private static final Logger logger = Logger.getLogger("okio.Okio");

    public static final v0 appendingSink(File file) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "<this>");
        return j0.sink(new FileOutputStream(file, true));
    }

    public static final k asResourceFileSystem(ClassLoader classLoader) {
        kotlin.jvm.internal.s.checkNotNullParameter(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true);
    }

    public static final f cipherSink(v0 v0Var, Cipher cipher) {
        kotlin.jvm.internal.s.checkNotNullParameter(v0Var, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(cipher, "cipher");
        return new f(j0.buffer(v0Var), cipher);
    }

    public static final g cipherSource(x0 x0Var, Cipher cipher) {
        kotlin.jvm.internal.s.checkNotNullParameter(x0Var, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(cipher, "cipher");
        return new g(j0.buffer(x0Var), cipher);
    }

    public static final p hashingSink(v0 v0Var, Mac mac) {
        kotlin.jvm.internal.s.checkNotNullParameter(v0Var, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(mac, "mac");
        return new p(v0Var, mac);
    }

    public static final q hashingSource(x0 x0Var, Mac mac) {
        kotlin.jvm.internal.s.checkNotNullParameter(x0Var, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(mac, "mac");
        return new q(x0Var, mac);
    }

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        String message;
        boolean contains$default;
        kotlin.jvm.internal.s.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null || (message = assertionError.getMessage()) == null) {
            return false;
        }
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null);
        return contains$default;
    }

    public static final k openZip(k kVar, o0 zipPath) {
        kotlin.jvm.internal.s.checkNotNullParameter(kVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(zipPath, "zipPath");
        return ZipKt.openZip$default(zipPath, kVar, null, 4, null);
    }

    public static final v0 sink(File file) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static /* synthetic */ v0 sink$default(File file, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return j0.sink(file, z7);
    }

    public static final x0 source(InputStream inputStream) {
        kotlin.jvm.internal.s.checkNotNullParameter(inputStream, "<this>");
        return new s(inputStream, new y0());
    }

    public static final p hashingSink(v0 v0Var, MessageDigest digest) {
        kotlin.jvm.internal.s.checkNotNullParameter(v0Var, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(digest, "digest");
        return new p(v0Var, digest);
    }

    public static final q hashingSource(x0 x0Var, MessageDigest digest) {
        kotlin.jvm.internal.s.checkNotNullParameter(x0Var, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(digest, "digest");
        return new q(x0Var, digest);
    }

    public static final v0 sink(OutputStream outputStream) {
        kotlin.jvm.internal.s.checkNotNullParameter(outputStream, "<this>");
        return new n0(outputStream, new y0());
    }

    public static final x0 source(Socket socket) {
        kotlin.jvm.internal.s.checkNotNullParameter(socket, "<this>");
        w0 w0Var = new w0(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(inputStream, "getInputStream()");
        return w0Var.source(new s(inputStream, w0Var));
    }

    public static final v0 sink(Socket socket) {
        kotlin.jvm.internal.s.checkNotNullParameter(socket, "<this>");
        w0 w0Var = new w0(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        return w0Var.sink(new n0(outputStream, w0Var));
    }

    public static final x0 source(File file) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "<this>");
        return new s(new FileInputStream(file), y0.NONE);
    }

    public static final v0 sink(File file, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "<this>");
        return j0.sink(new FileOutputStream(file, z7));
    }

    @IgnoreJRERequirement
    public static final x0 source(Path path, OpenOption... options) {
        InputStream newInputStream;
        kotlin.jvm.internal.s.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.s.checkNotNullExpressionValue(newInputStream, "newInputStream(this, *options)");
        return j0.source(newInputStream);
    }

    @IgnoreJRERequirement
    public static final v0 sink(Path path, OpenOption... options) {
        OutputStream newOutputStream;
        kotlin.jvm.internal.s.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.s.checkNotNullExpressionValue(newOutputStream, "newOutputStream(this, *options)");
        return j0.sink(newOutputStream);
    }
}
