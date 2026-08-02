package okio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes3.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    public final FileSystem delegate;

    public ForwardingFileSystem(FileSystem fileSystem) {
        fileSystem.getClass();
        this.delegate = fileSystem;
    }

    @Override // okio.FileSystem
    public final Sink appendingSink(Path path) {
        path.getClass();
        return this.delegate.appendingSink(onPathParameter(path, "appendingSink", "file"));
    }

    @Override // okio.FileSystem
    public final void atomicMove(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        this.delegate.atomicMove(onPathParameter(path, "atomicMove", "source"), onPathParameter(path2, "atomicMove", "target"));
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
    }

    @Override // okio.FileSystem
    public final void createDirectory(Path path) {
        path.getClass();
        this.delegate.createDirectory(onPathParameter(path, "createDirectory", "dir"));
    }

    @Override // okio.FileSystem
    public final void delete(Path path, boolean z) {
        path.getClass();
        this.delegate.delete(onPathParameter(path, "delete", "path"), z);
    }

    @Override // okio.FileSystem
    public final List list(Path path) {
        path.getClass();
        List list = this.delegate.list(onPathParameter(path, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public final List listOrNull(Path path) {
        path.getClass();
        List listOrNull = this.delegate.listOrNull(onPathParameter(path, "listOrNull", "dir"));
        if (listOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public final Sequence listRecursively(Path path) {
        path.getClass();
        return SequencesKt___SequencesKt.map(this.delegate.listRecursively(onPathParameter(path, "listRecursively", "dir")), new ForwardingFileSystem$$ExternalSyntheticLambda0(this, 0));
    }

    @Override // okio.FileSystem
    public final FileMetadata metadataOrNull(Path path) {
        path.getClass();
        FileMetadata metadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (metadataOrNull == null) {
            return null;
        }
        Path path2 = (Path) metadataOrNull.symlinkTarget;
        if (path2 == null) {
            return metadataOrNull;
        }
        Path onPathResult = onPathResult(path2, "metadataOrNull");
        boolean z = metadataOrNull.isRegularFile;
        boolean z2 = metadataOrNull.isDirectory;
        Long l = (Long) metadataOrNull.size;
        Long l2 = (Long) metadataOrNull.createdAtMillis;
        Long l3 = (Long) metadataOrNull.lastModifiedAtMillis;
        Long l4 = (Long) metadataOrNull.lastAccessedAtMillis;
        Map map = (Map) metadataOrNull.extras;
        map.getClass();
        return new FileMetadata(z, z2, onPathResult, l, l2, l3, l4, map);
    }

    public Path onPathParameter(Path path, String str, String str2) {
        path.getClass();
        return path;
    }

    public Path onPathResult(Path path, String str) {
        path.getClass();
        return path;
    }

    @Override // okio.FileSystem
    public final FileHandle openReadOnly(Path path) {
        path.getClass();
        return this.delegate.openReadOnly(onPathParameter(path, "openReadOnly", "file"));
    }

    @Override // okio.FileSystem
    public Sink sink(Path path, boolean z) {
        path.getClass();
        return this.delegate.sink(onPathParameter(path, "sink", "file"), z);
    }

    @Override // okio.FileSystem
    public final Source source(Path path) {
        path.getClass();
        return this.delegate.source(onPathParameter(path, "source", "file"));
    }

    public final String toString() {
        return Reflection.factory.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.delegate + ')';
    }
}
