package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt___CollectionsKt;
import okio.internal.ZipKt;
import okio.o0;

/* loaded from: classes5.dex */
public final class a1 extends k {
    private static final a Companion = new a(null);

    @Deprecated
    private static final o0 ROOT = o0.a.get$default(o0.Companion, "/", false, 1, (Object) null);
    private final String comment;
    private final Map<o0, okio.internal.c> entries;
    private final k fileSystem;
    private final o0 zipPath;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final o0 getROOT() {
            return a1.ROOT;
        }
    }

    public a1(o0 zipPath, k fileSystem, Map<o0, okio.internal.c> entries, String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(zipPath, "zipPath");
        kotlin.jvm.internal.s.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.s.checkNotNullParameter(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    private final o0 canonicalizeInternal(o0 o0Var) {
        return ROOT.resolve(o0Var, true);
    }

    @Override // okio.k
    public v0 appendingSink(o0 file, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public void atomicMove(o0 source, o0 target) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public o0 canonicalize(o0 path) {
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // okio.k
    public void createDirectory(o0 dir, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public void createSymlink(o0 source, o0 target) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public void delete(o0 path, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
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
        e eVar;
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        okio.internal.c cVar = this.entries.get(canonicalizeInternal(path));
        Throwable th = null;
        if (cVar == null) {
            return null;
        }
        j jVar = new j(!cVar.isDirectory(), cVar.isDirectory(), null, cVar.isDirectory() ? null : Long.valueOf(cVar.getSize()), null, cVar.getLastModifiedAtMillis(), null, null, 128, null);
        if (cVar.getOffset() == -1) {
            return jVar;
        }
        i openReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        try {
            eVar = j0.buffer(openReadOnly.source(cVar.getOffset()));
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
        }
        if (openReadOnly != null) {
            try {
                openReadOnly.close();
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
        kotlin.jvm.internal.s.checkNotNull(eVar);
        return ZipKt.readLocalHeader(eVar, jVar);
    }

    @Override // okio.k
    public i openReadOnly(o0 file) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.k
    public i openReadWrite(o0 file, boolean z7, boolean z8) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.k
    public v0 sink(o0 file, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public x0 source(o0 path) {
        e eVar;
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        okio.internal.c cVar = this.entries.get(canonicalizeInternal(path));
        if (cVar == null) {
            throw new FileNotFoundException(kotlin.jvm.internal.s.stringPlus("no such file: ", path));
        }
        i openReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        Throwable th = null;
        try {
            eVar = j0.buffer(openReadOnly.source(cVar.getOffset()));
        } catch (Throwable th2) {
            eVar = null;
            th = th2;
        }
        if (openReadOnly != null) {
            try {
                openReadOnly.close();
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
        kotlin.jvm.internal.s.checkNotNull(eVar);
        ZipKt.skipLocalHeader(eVar);
        return cVar.getCompressionMethod() == 0 ? new okio.internal.b(eVar, cVar.getSize(), true) : new okio.internal.b(new r(new okio.internal.b(eVar, cVar.getCompressedSize(), true), new Inflater(true)), cVar.getSize(), false);
    }

    private final List<o0> list(o0 o0Var, boolean z7) {
        okio.internal.c cVar = this.entries.get(canonicalizeInternal(o0Var));
        if (cVar != null) {
            return CollectionsKt___CollectionsKt.toList(cVar.getChildren());
        }
        if (z7) {
            throw new IOException(kotlin.jvm.internal.s.stringPlus("not a directory: ", o0Var));
        }
        return null;
    }
}
