package okio;

import java.util.List;
import okio.internal.ResourceFileSystem;
import okio.internal._FileSystemKt;
import okio.o0;

/* loaded from: classes5.dex */
public abstract class k {
    public static final a Companion = new a(null);
    public static final k RESOURCES;
    public static final k SYSTEM;
    public static final o0 SYSTEM_TEMPORARY_DIRECTORY;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m1452write$default(k kVar, o0 file, boolean z7, f6.l writerAction, int i8, Object obj) {
        Object obj2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.s.checkNotNullParameter(writerAction, "writerAction");
        d buffer = j0.buffer(kVar.sink(file, z7));
        Throwable th = null;
        try {
            obj2 = writerAction.invoke(buffer);
        } catch (Throwable th2) {
            obj2 = null;
            th = th2;
        }
        if (buffer != null) {
            try {
                buffer.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    y5.b.addSuppressed(th, th3);
                }
            }
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.s.checkNotNull(obj2);
        return obj2;
    }

    static {
        k uVar;
        try {
            Class.forName("java.nio.file.Files");
            uVar = new i0();
        } catch (ClassNotFoundException unused) {
            uVar = new u();
        }
        SYSTEM = uVar;
        o0.a aVar = o0.Companion;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.s.checkNotNullExpressionValue(property, "getProperty(\"java.io.tmpdir\")");
        SYSTEM_TEMPORARY_DIRECTORY = o0.a.get$default(aVar, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(classLoader, "ResourceFileSystem::class.java.classLoader");
        RESOURCES = new ResourceFileSystem(classLoader, false);
    }

    public static /* synthetic */ v0 appendingSink$default(k kVar, o0 o0Var, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return kVar.appendingSink(o0Var, z7);
    }

    public static /* synthetic */ void createDirectories$default(k kVar, o0 o0Var, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        kVar.createDirectories(o0Var, z7);
    }

    public static /* synthetic */ void createDirectory$default(k kVar, o0 o0Var, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        kVar.createDirectory(o0Var, z7);
    }

    public static /* synthetic */ void delete$default(k kVar, o0 o0Var, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        kVar.delete(o0Var, z7);
    }

    public static /* synthetic */ void deleteRecursively$default(k kVar, o0 o0Var, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        kVar.deleteRecursively(o0Var, z7);
    }

    public static /* synthetic */ kotlin.sequences.m listRecursively$default(k kVar, o0 o0Var, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return kVar.listRecursively(o0Var, z7);
    }

    public static /* synthetic */ i openReadWrite$default(k kVar, o0 o0Var, boolean z7, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return kVar.openReadWrite(o0Var, z7, z8);
    }

    public static /* synthetic */ v0 sink$default(k kVar, o0 o0Var, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return kVar.sink(o0Var, z7);
    }

    /* renamed from: -read, reason: not valid java name */
    public final <T> T m1453read(o0 file, f6.l readerAction) {
        T t7;
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.s.checkNotNullParameter(readerAction, "readerAction");
        e buffer = j0.buffer(source(file));
        Throwable th = null;
        try {
            t7 = (T) readerAction.invoke(buffer);
        } catch (Throwable th2) {
            th = th2;
            t7 = null;
        }
        if (buffer != null) {
            try {
                buffer.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    y5.b.addSuppressed(th, th3);
                }
            }
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.s.checkNotNull(t7);
        return t7;
    }

    /* renamed from: -write, reason: not valid java name */
    public final <T> T m1454write(o0 file, boolean z7, f6.l writerAction) {
        T t7;
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.s.checkNotNullParameter(writerAction, "writerAction");
        d buffer = j0.buffer(sink(file, z7));
        Throwable th = null;
        try {
            t7 = (T) writerAction.invoke(buffer);
        } catch (Throwable th2) {
            t7 = null;
            th = th2;
        }
        if (buffer != null) {
            try {
                buffer.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    y5.b.addSuppressed(th, th3);
                }
            }
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.s.checkNotNull(t7);
        return t7;
    }

    public final v0 appendingSink(o0 file) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        return appendingSink(file, false);
    }

    public abstract v0 appendingSink(o0 o0Var, boolean z7);

    public abstract void atomicMove(o0 o0Var, o0 o0Var2);

    public abstract o0 canonicalize(o0 o0Var);

    public void copy(o0 source, o0 target) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(target, "target");
        _FileSystemKt.commonCopy(this, source, target);
    }

    public final void createDirectories(o0 dir, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(dir, "dir");
        _FileSystemKt.commonCreateDirectories(this, dir, z7);
    }

    public final void createDirectory(o0 dir) {
        kotlin.jvm.internal.s.checkNotNullParameter(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(o0 o0Var, boolean z7);

    public abstract void createSymlink(o0 o0Var, o0 o0Var2);

    public final void delete(o0 path) {
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        delete(path, false);
    }

    public abstract void delete(o0 o0Var, boolean z7);

    public void deleteRecursively(o0 fileOrDirectory, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        _FileSystemKt.commonDeleteRecursively(this, fileOrDirectory, z7);
    }

    public final boolean exists(o0 path) {
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        return _FileSystemKt.commonExists(this, path);
    }

    public abstract List<o0> list(o0 o0Var);

    public abstract List<o0> listOrNull(o0 o0Var);

    public kotlin.sequences.m listRecursively(o0 dir, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(dir, "dir");
        return _FileSystemKt.commonListRecursively(this, dir, z7);
    }

    public final j metadata(o0 path) {
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        return _FileSystemKt.commonMetadata(this, path);
    }

    public abstract j metadataOrNull(o0 o0Var);

    public abstract i openReadOnly(o0 o0Var);

    public final i openReadWrite(o0 file) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        return openReadWrite(file, false, false);
    }

    public abstract i openReadWrite(o0 o0Var, boolean z7, boolean z8);

    public final v0 sink(o0 file) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        return sink(file, false);
    }

    public abstract v0 sink(o0 o0Var, boolean z7);

    public abstract x0 source(o0 o0Var);

    public final void createDirectories(o0 dir) {
        kotlin.jvm.internal.s.checkNotNullParameter(dir, "dir");
        createDirectories(dir, false);
    }

    public final void deleteRecursively(o0 fileOrDirectory) {
        kotlin.jvm.internal.s.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    public final kotlin.sequences.m listRecursively(o0 dir) {
        kotlin.jvm.internal.s.checkNotNullParameter(dir, "dir");
        return listRecursively(dir, false);
    }
}
