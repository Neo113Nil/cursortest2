package z3;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class r extends m {
    @Override // z3.m
    public l b(v path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File l4 = path.l();
        boolean isFile = l4.isFile();
        boolean isDirectory = l4.isDirectory();
        long lastModified = l4.lastModified();
        long length = l4.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || l4.exists()) {
            return new l(isFile, isDirectory, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // z3.m
    public final q c(v file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new q(false, new RandomAccessFile(file.l(), "r"));
    }

    public void d(v source, v target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.l().renameTo(target.l())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    public final void e(v path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File l4 = path.l();
        if (l4.delete() || !l4.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
