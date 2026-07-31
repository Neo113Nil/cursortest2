package T2;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class r extends m {
    @Override // T2.m
    public l b(v vVar) {
        f2.j.f(vVar, "path");
        File f3 = vVar.f();
        boolean isFile = f3.isFile();
        boolean isDirectory = f3.isDirectory();
        long lastModified = f3.lastModified();
        long length = f3.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || f3.exists()) {
            return new l(isFile, isDirectory, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // T2.m
    public final q c(v vVar) {
        return new q(false, new RandomAccessFile(vVar.f(), "r"));
    }

    public void d(v vVar, v vVar2) {
        f2.j.f(vVar2, "target");
        if (vVar.f().renameTo(vVar2.f())) {
            return;
        }
        throw new IOException("failed to move " + vVar + " to " + vVar2);
    }

    public final void e(v vVar) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File f3 = vVar.f();
        if (f3.delete() || !f3.exists()) {
            return;
        }
        throw new IOException("failed to delete " + vVar);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
