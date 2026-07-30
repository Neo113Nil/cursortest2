package okio;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes5.dex */
public abstract class j0 {
    public static final v0 appendingSink(File file) {
        return k0.appendingSink(file);
    }

    public static final k asResourceFileSystem(ClassLoader classLoader) {
        return k0.asResourceFileSystem(classLoader);
    }

    public static final v0 blackhole() {
        return l0.blackhole();
    }

    public static final d buffer(v0 v0Var) {
        return l0.buffer(v0Var);
    }

    public static final f cipherSink(v0 v0Var, Cipher cipher) {
        return k0.cipherSink(v0Var, cipher);
    }

    public static final g cipherSource(x0 x0Var, Cipher cipher) {
        return k0.cipherSource(x0Var, cipher);
    }

    public static final p hashingSink(v0 v0Var, MessageDigest messageDigest) {
        return k0.hashingSink(v0Var, messageDigest);
    }

    public static final q hashingSource(x0 x0Var, MessageDigest messageDigest) {
        return k0.hashingSource(x0Var, messageDigest);
    }

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        return k0.isAndroidGetsocknameError(assertionError);
    }

    public static final k openZip(k kVar, o0 o0Var) {
        return k0.openZip(kVar, o0Var);
    }

    public static final v0 sink(File file) {
        return k0.sink(file);
    }

    public static final x0 source(File file) {
        return k0.source(file);
    }

    public static final <T extends Closeable, R> R use(T t7, f6.l lVar) {
        return (R) l0.use(t7, lVar);
    }

    public static final e buffer(x0 x0Var) {
        return l0.buffer(x0Var);
    }

    public static final p hashingSink(v0 v0Var, Mac mac) {
        return k0.hashingSink(v0Var, mac);
    }

    public static final q hashingSource(x0 x0Var, Mac mac) {
        return k0.hashingSource(x0Var, mac);
    }

    public static final v0 sink(File file, boolean z7) {
        return k0.sink(file, z7);
    }

    public static final x0 source(InputStream inputStream) {
        return k0.source(inputStream);
    }

    public static final v0 sink(OutputStream outputStream) {
        return k0.sink(outputStream);
    }

    public static final x0 source(Socket socket) {
        return k0.source(socket);
    }

    public static final v0 sink(Socket socket) {
        return k0.sink(socket);
    }

    @IgnoreJRERequirement
    public static final x0 source(Path path, OpenOption... openOptionArr) {
        return k0.source(path, openOptionArr);
    }

    @IgnoreJRERequirement
    public static final v0 sink(Path path, OpenOption... openOptionArr) {
        return k0.sink(path, openOptionArr);
    }
}
