package okio.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.s;
import kotlin.sequences.m;
import kotlin.sequences.o;
import kotlin.sequences.q;
import okio.j;
import okio.j0;
import okio.k;
import okio.o0;
import okio.x0;
import y5.w;

/* loaded from: classes5.dex */
public abstract class _FileSystemKt {
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        if (r7 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d9, code lost:
    
        r6.addLast(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        r7 = r6;
        r10 = r11;
        r11 = r12;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011f, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object collectRecursively(o oVar, k kVar, kotlin.collections.g gVar, o0 o0Var, boolean z7, boolean z8, kotlin.coroutines.c cVar) {
        _FileSystemKt$collectRecursively$1 _filesystemkt_collectrecursively_1;
        Object coroutine_suspended;
        int i8;
        k kVar2;
        kotlin.collections.g gVar2;
        boolean z9;
        o oVar2;
        boolean z10;
        k kVar3;
        List<o0> listOrNull;
        o0 o0Var2 = o0Var;
        boolean z11 = z8;
        if (cVar instanceof _FileSystemKt$collectRecursively$1) {
            _filesystemkt_collectrecursively_1 = (_FileSystemKt$collectRecursively$1) cVar;
            int i9 = _filesystemkt_collectrecursively_1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                _filesystemkt_collectrecursively_1.label = i9 - Integer.MIN_VALUE;
                Object obj = _filesystemkt_collectrecursively_1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = _filesystemkt_collectrecursively_1.label;
                int i10 = 0;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    if (z11) {
                        kVar2 = kVar;
                        gVar2 = gVar;
                        z9 = z7;
                    } else {
                        _filesystemkt_collectrecursively_1.L$0 = oVar;
                        kVar2 = kVar;
                        _filesystemkt_collectrecursively_1.L$1 = kVar2;
                        gVar2 = gVar;
                        _filesystemkt_collectrecursively_1.L$2 = gVar2;
                        _filesystemkt_collectrecursively_1.L$3 = o0Var2;
                        z9 = z7;
                        _filesystemkt_collectrecursively_1.Z$0 = z9;
                        _filesystemkt_collectrecursively_1.Z$1 = z11;
                        _filesystemkt_collectrecursively_1.label = 1;
                        if (oVar.yield(o0Var2, _filesystemkt_collectrecursively_1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    oVar2 = oVar;
                    z10 = z9;
                    kVar3 = kVar2;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y5.g.throwOnFailure(obj);
                            return w.INSTANCE;
                        }
                        boolean z12 = _filesystemkt_collectrecursively_1.Z$1;
                        boolean z13 = _filesystemkt_collectrecursively_1.Z$0;
                        Iterator<o0> it = (Iterator) _filesystemkt_collectrecursively_1.L$4;
                        o0 o0Var3 = (o0) _filesystemkt_collectrecursively_1.L$3;
                        kotlin.collections.g gVar3 = (kotlin.collections.g) _filesystemkt_collectrecursively_1.L$2;
                        k kVar4 = (k) _filesystemkt_collectrecursively_1.L$1;
                        o oVar3 = (o) _filesystemkt_collectrecursively_1.L$0;
                        try {
                            y5.g.throwOnFailure(obj);
                            while (it.hasNext()) {
                                o0 next = it.next();
                                _filesystemkt_collectrecursively_1.L$0 = oVar3;
                                _filesystemkt_collectrecursively_1.L$1 = kVar4;
                                _filesystemkt_collectrecursively_1.L$2 = gVar3;
                                _filesystemkt_collectrecursively_1.L$3 = o0Var3;
                                _filesystemkt_collectrecursively_1.L$4 = it;
                                _filesystemkt_collectrecursively_1.Z$0 = z13;
                                _filesystemkt_collectrecursively_1.Z$1 = z12;
                                _filesystemkt_collectrecursively_1.label = 2;
                                if (collectRecursively(oVar3, kVar4, gVar3, next, z13, z12, _filesystemkt_collectrecursively_1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            gVar3.removeLast();
                            z11 = z12;
                            o0Var2 = o0Var3;
                            oVar2 = oVar3;
                            if (!z11) {
                                return w.INSTANCE;
                            }
                            _filesystemkt_collectrecursively_1.L$0 = null;
                            _filesystemkt_collectrecursively_1.L$1 = null;
                            _filesystemkt_collectrecursively_1.L$2 = null;
                            _filesystemkt_collectrecursively_1.L$3 = null;
                            _filesystemkt_collectrecursively_1.L$4 = null;
                            _filesystemkt_collectrecursively_1.label = 3;
                            if (oVar2.yield(o0Var2, _filesystemkt_collectrecursively_1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return w.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            gVar3.removeLast();
                            throw th;
                        }
                    }
                    boolean z14 = _filesystemkt_collectrecursively_1.Z$1;
                    boolean z15 = _filesystemkt_collectrecursively_1.Z$0;
                    o0 o0Var4 = (o0) _filesystemkt_collectrecursively_1.L$3;
                    gVar2 = (kotlin.collections.g) _filesystemkt_collectrecursively_1.L$2;
                    kVar3 = (k) _filesystemkt_collectrecursively_1.L$1;
                    oVar2 = (o) _filesystemkt_collectrecursively_1.L$0;
                    y5.g.throwOnFailure(obj);
                    z11 = z14;
                    z10 = z15;
                    o0Var2 = o0Var4;
                }
                listOrNull = kVar3.listOrNull(o0Var2);
                if (listOrNull == null) {
                    listOrNull = CollectionsKt__CollectionsKt.emptyList();
                }
                if (true ^ listOrNull.isEmpty()) {
                    o0 o0Var5 = o0Var2;
                    while (true) {
                        if (z10 && gVar2.contains(o0Var5)) {
                            throw new IOException(s.stringPlus("symlink cycle at ", o0Var2));
                        }
                        o0 symlinkTarget = symlinkTarget(kVar3, o0Var5);
                        if (symlinkTarget == null) {
                            break;
                        }
                        i10++;
                        o0Var5 = symlinkTarget;
                    }
                }
                if (!z11) {
                }
            }
        }
        _filesystemkt_collectrecursively_1 = new _FileSystemKt$collectRecursively$1(cVar);
        Object obj2 = _filesystemkt_collectrecursively_1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = _filesystemkt_collectrecursively_1.label;
        int i102 = 0;
        if (i8 != 0) {
        }
        listOrNull = kVar3.listOrNull(o0Var2);
        if (listOrNull == null) {
        }
        if (true ^ listOrNull.isEmpty()) {
        }
        if (!z11) {
        }
    }

    public static final void commonCopy(k kVar, o0 source, o0 target) {
        Long l8;
        Long l9;
        s.checkNotNullParameter(kVar, "<this>");
        s.checkNotNullParameter(source, "source");
        s.checkNotNullParameter(target, "target");
        x0 source2 = kVar.source(source);
        Throwable th = null;
        try {
            okio.d buffer = j0.buffer(kVar.sink(target));
            try {
                l9 = Long.valueOf(buffer.writeAll(source2));
                th = null;
            } catch (Throwable th2) {
                th = th2;
                l9 = null;
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
        } catch (Throwable th4) {
            th = th4;
            l8 = null;
        }
        if (th != null) {
            throw th;
        }
        s.checkNotNull(l9);
        l8 = Long.valueOf(l9.longValue());
        if (source2 != null) {
            try {
                source2.close();
            } catch (Throwable th5) {
                if (th == null) {
                    th = th5;
                } else {
                    y5.b.addSuppressed(th, th5);
                }
            }
        }
        if (th != null) {
            throw th;
        }
        s.checkNotNull(l8);
    }

    public static final void commonCreateDirectories(k kVar, o0 dir, boolean z7) {
        s.checkNotNullParameter(kVar, "<this>");
        s.checkNotNullParameter(dir, "dir");
        kotlin.collections.g gVar = new kotlin.collections.g();
        for (o0 o0Var = dir; o0Var != null && !kVar.exists(o0Var); o0Var = o0Var.parent()) {
            gVar.addFirst(o0Var);
        }
        if (z7 && gVar.isEmpty()) {
            throw new IOException(dir + " already exist.");
        }
        Iterator<E> it = gVar.iterator();
        while (it.hasNext()) {
            kVar.createDirectory((o0) it.next());
        }
    }

    public static final void commonDeleteRecursively(k kVar, o0 fileOrDirectory, boolean z7) {
        s.checkNotNullParameter(kVar, "<this>");
        s.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator<Object> it = q.sequence(new _FileSystemKt$commonDeleteRecursively$sequence$1(kVar, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            kVar.delete((o0) it.next(), z7 && !it.hasNext());
        }
    }

    public static final boolean commonExists(k kVar, o0 path) {
        s.checkNotNullParameter(kVar, "<this>");
        s.checkNotNullParameter(path, "path");
        return kVar.metadataOrNull(path) != null;
    }

    public static final m commonListRecursively(k kVar, o0 dir, boolean z7) {
        s.checkNotNullParameter(kVar, "<this>");
        s.checkNotNullParameter(dir, "dir");
        return q.sequence(new _FileSystemKt$commonListRecursively$1(dir, kVar, z7, null));
    }

    public static final j commonMetadata(k kVar, o0 path) {
        s.checkNotNullParameter(kVar, "<this>");
        s.checkNotNullParameter(path, "path");
        j metadataOrNull = kVar.metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException(s.stringPlus("no such file: ", path));
    }

    public static final o0 symlinkTarget(k kVar, o0 path) {
        s.checkNotNullParameter(kVar, "<this>");
        s.checkNotNullParameter(path, "path");
        o0 symlinkTarget = kVar.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        o0 parent = path.parent();
        s.checkNotNull(parent);
        return parent.resolve(symlinkTarget);
    }
}
