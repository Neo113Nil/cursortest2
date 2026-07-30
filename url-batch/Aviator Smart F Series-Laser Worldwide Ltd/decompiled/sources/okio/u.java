package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import okio.o0;

/* loaded from: classes5.dex */
public class u extends k {
    private final void requireCreate(o0 o0Var) {
        if (exists(o0Var)) {
            throw new IOException(o0Var + " already exists.");
        }
    }

    private final void requireExist(o0 o0Var) {
        if (exists(o0Var)) {
            return;
        }
        throw new IOException(o0Var + " doesn't exist.");
    }

    @Override // okio.k
    public v0 appendingSink(o0 file, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        if (z7) {
            requireExist(file);
        }
        return j0.sink(file.toFile(), true);
    }

    @Override // okio.k
    public void atomicMove(o0 source, o0 target) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // okio.k
    public o0 canonicalize(o0 path) {
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        o0.a aVar = o0.Companion;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(canonicalFile, "canonicalFile");
        return o0.a.get$default(aVar, canonicalFile, false, 1, (Object) null);
    }

    @Override // okio.k
    public void createDirectory(o0 dir, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        j metadataOrNull = metadataOrNull(dir);
        if (metadataOrNull == null || !metadataOrNull.isDirectory()) {
            throw new IOException(kotlin.jvm.internal.s.stringPlus("failed to create directory: ", dir));
        }
        if (z7) {
            throw new IOException(dir + " already exist.");
        }
    }

    @Override // okio.k
    public void createSymlink(o0 source, o0 target) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(target, "target");
        throw new IOException("unsupported");
    }

    @Override // okio.k
    public void delete(o0 path, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException(kotlin.jvm.internal.s.stringPlus("failed to delete ", path));
        }
        if (z7) {
            throw new FileNotFoundException(kotlin.jvm.internal.s.stringPlus("no such file: ", path));
        }
    }

    @Override // okio.k
    public List<o0> list(o0 dir) {
        kotlin.jvm.internal.s.checkNotNullParameter(dir, "dir");
        List<o0> list = list(dir, true);
        kotlin.jvm.internal.s.checkNotNull(list);
        return list;
    }

    @Override // okio.k
    public List<o0> listOrNull(o0 dir) {
        kotlin.jvm.internal.s.checkNotNullParameter(dir, "dir");
        return list(dir, false);
    }

    @Override // okio.k
    public j metadataOrNull(o0 path) {
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new j(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // okio.k
    public i openReadOnly(o0 file) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        return new t(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // okio.k
    public i openReadWrite(o0 file, boolean z7, boolean z8) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        if (!((z7 && z8) ? false : true)) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (z7) {
            requireCreate(file);
        }
        if (z8) {
            requireExist(file);
        }
        return new t(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // okio.k
    public v0 sink(o0 file, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        if (z7) {
            requireCreate(file);
        }
        return k0.sink$default(file.toFile(), false, 1, null);
    }

    @Override // okio.k
    public x0 source(o0 file) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        return j0.source(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    private final List<o0> list(o0 o0Var, boolean z7) {
        File file = o0Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z7) {
                return null;
            }
            if (file.exists()) {
                throw new IOException(kotlin.jvm.internal.s.stringPlus("failed to list ", o0Var));
            }
            throw new FileNotFoundException(kotlin.jvm.internal.s.stringPlus("no such file: ", o0Var));
        }
        ArrayList arrayList = new ArrayList();
        for (String it : list) {
            kotlin.jvm.internal.s.checkNotNullExpressionValue(it, "it");
            arrayList.add(o0Var.resolve(it));
        }
        kotlin.collections.u.sort(arrayList);
        return arrayList;
    }
}
