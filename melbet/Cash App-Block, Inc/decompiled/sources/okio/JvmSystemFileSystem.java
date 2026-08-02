package okio;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;

/* loaded from: classes3.dex */
public class JvmSystemFileSystem extends FileSystem {
    public static ArrayList list(Path path, boolean z) {
        File file = path.toFile();
        String[] list = file.list();
        if (list == null) {
            if (z) {
                if (!file.exists()) {
                    Path$$ExternalSyntheticBUOutline0.m$2(path, "no such file: ");
                    return null;
                }
                a$$ExternalSyntheticBUOutline0.m$3(path, "failed to list ");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(path.resolve(str));
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public final Sink appendingSink(Path path) {
        path.getClass();
        return new Pipe$sink$1(new FileOutputStream(path.toFile(), true), new Timeout());
    }

    @Override // okio.FileSystem
    public void atomicMove(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        if (path.toFile().renameTo(path2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + path + " to " + path2);
    }

    @Override // okio.FileSystem
    public final void createDirectory(Path path) {
        path.getClass();
        if (path.toFile().mkdir()) {
            return;
        }
        FileMetadata metadataOrNull = metadataOrNull(path);
        if (metadataOrNull == null || !metadataOrNull.isDirectory) {
            a$$ExternalSyntheticBUOutline0.m$3(path, "failed to create directory: ");
        }
    }

    @Override // okio.FileSystem
    public final void delete(Path path, boolean z) {
        path.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            a$$ExternalSyntheticBUOutline0.m$3(path, "failed to delete ");
        } else if (z) {
            Path$$ExternalSyntheticBUOutline0.m$2(path, "no such file: ");
        }
    }

    @Override // okio.FileSystem
    public final List listOrNull(Path path) {
        path.getClass();
        return list(path, false);
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        path.getClass();
        File file = path.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new FileMetadata(isFile, isDirectory, (Path) null, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null, 128);
        }
        return null;
    }

    @Override // okio.FileSystem
    public final FileHandle openReadOnly(Path path) {
        path.getClass();
        return new JvmFileHandle(new RandomAccessFile(path.toFile(), "r"));
    }

    @Override // okio.FileSystem
    public final Sink sink(Path path, boolean z) {
        path.getClass();
        if (!z || !exists(path)) {
            return Okio.sink$default(path.toFile());
        }
        throw new IOException(path + " already exists.");
    }

    @Override // okio.FileSystem
    public final Source source(Path path) {
        path.getClass();
        return new InputStreamSource(new FileInputStream(path.toFile()), Timeout.NONE);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.FileSystem
    public final List list(Path path) {
        path.getClass();
        ArrayList list = list(path, true);
        list.getClass();
        return list;
    }
}
