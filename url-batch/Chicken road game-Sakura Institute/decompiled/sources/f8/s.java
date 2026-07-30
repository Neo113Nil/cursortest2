package f8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class s extends m {
    @Override // f8.m
    public void a(w wVar, w wVar2) {
        r6.k.f(wVar2, "target");
        if (wVar.toFile().renameTo(wVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + wVar + " to " + wVar2);
    }

    @Override // f8.m
    public final void b(w wVar) {
        if (wVar.toFile().mkdir()) {
            return;
        }
        l e9 = e(wVar);
        if (e9 == null || !e9.f3619b) {
            throw new IOException("failed to create directory: " + wVar);
        }
    }

    @Override // f8.m
    public final void c(w wVar) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = wVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + wVar);
    }

    @Override // f8.m
    public l e(w wVar) {
        r6.k.f(wVar, "path");
        File file = wVar.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new l(isFile, isDirectory, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // f8.m
    public final r f(w wVar) {
        return new r(false, new RandomAccessFile(wVar.toFile(), "r"));
    }

    @Override // f8.m
    public final r g(w wVar) {
        r6.k.f(wVar, "file");
        return new r(true, new RandomAccessFile(wVar.toFile(), "rw"));
    }

    @Override // f8.m
    public final g0 h(w wVar) {
        r6.k.f(wVar, "file");
        File file = wVar.toFile();
        Logger logger = u.f3642a;
        return new d(new FileInputStream(file), 1, i0.f3604d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
