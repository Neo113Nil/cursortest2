package okio;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import okio.Path;
import okio.internal.FileSystem$commonListRecursively$1;
import okio.internal.ResourceFileSystem;

/* loaded from: classes3.dex */
public abstract class FileSystem implements Closeable {
    public static final JvmSystemFileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    static {
        JvmSystemFileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        String str = Path.DIRECTORY_SEPARATOR;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get(property, false);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        classLoader.getClass();
        new ResourceFileSystem(classLoader);
    }

    public abstract Sink appendingSink(Path path);

    public abstract void atomicMove(Path path, Path path2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void createDirectories(Path path) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (path != null && !exists(path)) {
            arrayDeque.addFirst(path);
            path = path.parent();
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            createDirectory((Path) it.next());
        }
    }

    public abstract void createDirectory(Path path);

    public final void delete(Path path) {
        path.getClass();
        delete(path, false);
    }

    public abstract void delete(Path path, boolean z);

    public final boolean exists(Path path) {
        path.getClass();
        return metadataOrNull(path) != null;
    }

    public abstract List list(Path path);

    public abstract List listOrNull(Path path);

    public Sequence listRecursively(Path path) {
        path.getClass();
        return new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(new FileSystem$commonListRecursively$1(path, this, null), 2);
    }

    public final FileMetadata metadata(Path path) {
        path.getClass();
        FileMetadata metadataOrNull = metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        Path$$ExternalSyntheticBUOutline0.m$2(path, "no such file: ");
        return null;
    }

    public abstract FileMetadata metadataOrNull(Path path);

    public abstract FileHandle openReadOnly(Path path);

    public abstract Sink sink(Path path, boolean z);

    public abstract Source source(Path path);
}
