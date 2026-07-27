package h1;

import f1.InterfaceC0608b;
import j1.C0708b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;
import y2.C1331f;
import z3.C1446d;
import z3.H;
import z3.r;
import z3.t;
import z3.v;
import z3.z;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0650c implements InterfaceC0608b {

    /* renamed from: a, reason: collision with root package name */
    public final r f6833a;

    /* renamed from: b, reason: collision with root package name */
    public final v f6834b;

    /* renamed from: c, reason: collision with root package name */
    public final C0648a f6835c;

    public C0650c(r fileSystem, v path) {
        j1.h serializer = j1.h.f7154a;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f6833a = fileSystem;
        this.f6834b = path;
        this.f6835c = new C0648a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0 A[Catch: FileNotFoundException -> 0x00a4, TRY_ENTER, TryCatch #2 {FileNotFoundException -> 0x00a4, blocks: (B:15:0x00a0, B:18:0x00a8, B:47:0x0043), top: B:46:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8 A[Catch: FileNotFoundException -> 0x00a4, TRY_LEAVE, TryCatch #2 {FileNotFoundException -> 0x00a4, blocks: (B:15:0x00a0, B:18:0x00a8, B:47:0x0043), top: B:46:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(C0650c c0650c, E2.c cVar) {
        C0649b c0649b;
        int i2;
        Throwable th;
        C0650c c0650c2;
        FileNotFoundException e4;
        z zVar;
        Throwable th2;
        if (cVar instanceof C0649b) {
            c0649b = (C0649b) cVar;
            int i4 = c0649b.f6832n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0649b.f6832n = i4 - Integer.MIN_VALUE;
                Object obj = c0649b.f6830l;
                D2.a aVar = D2.a.f2163d;
                i2 = c0649b.f6832n;
                th = null;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    if (c0650c.f6835c.f6827a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        r rVar = c0650c.f6833a;
                        v file = c0650c.f6834b;
                        rVar.getClass();
                        Intrinsics.checkNotNullParameter(file, "file");
                        File l4 = file.l();
                        Logger logger = t.f12033a;
                        Intrinsics.checkNotNullParameter(l4, "<this>");
                        z h4 = m3.z.h(new C1446d(new FileInputStream(l4), H.f11975d));
                        try {
                            j1.h hVar = j1.h.f7154a;
                            c0649b.f6828j = c0650c;
                            c0649b.f6829k = h4;
                            c0649b.f6832n = 1;
                            C0708b a4 = hVar.a(h4);
                            if (a4 == aVar) {
                                return aVar;
                            }
                            c0650c2 = c0650c;
                            zVar = h4;
                            obj = a4;
                        } catch (Throwable th3) {
                            c0650c2 = c0650c;
                            zVar = h4;
                            th2 = th3;
                            if (zVar != null) {
                                try {
                                    zVar.close();
                                } catch (Throwable th4) {
                                    try {
                                        C1331f.a(th2, th4);
                                    } catch (FileNotFoundException e5) {
                                        e4 = e5;
                                        if (c0650c2.f6833a.a(c0650c2.f6834b)) {
                                        }
                                    }
                                }
                            }
                            th = th2;
                            obj = null;
                            if (th == null) {
                            }
                        }
                    } catch (FileNotFoundException e6) {
                        c0650c2 = c0650c;
                        e4 = e6;
                        if (c0650c2.f6833a.a(c0650c2.f6834b)) {
                            return new C0708b(true);
                        }
                        throw e4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = c0649b.f6829k;
                    c0650c2 = c0649b.f6828j;
                    try {
                        AbstractC1343r.b(obj);
                    } catch (Throwable th5) {
                        th2 = th5;
                        if (zVar != null) {
                        }
                        th = th2;
                        obj = null;
                        if (th == null) {
                        }
                    }
                }
                if (zVar != null) {
                    try {
                        zVar.close();
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                if (th == null) {
                    throw th;
                }
                Intrinsics.c(obj);
                return obj;
            }
        }
        c0649b = new C0649b(c0650c, cVar);
        Object obj2 = c0649b.f6830l;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c0649b.f6832n;
        th = null;
        if (i2 != 0) {
        }
        if (zVar != null) {
        }
        if (th == null) {
        }
    }

    @Override // f1.InterfaceC0608b
    public final void close() {
        this.f6835c.f6827a.set(true);
    }
}
