package j1;

import T2.C0229d;
import T2.H;
import T2.r;
import T2.t;
import T2.v;
import T2.z;
import h1.InterfaceC0483a;
import h2.AbstractC0508a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Logger;
import l1.C0593b;
import l1.C0599h;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0557c implements InterfaceC0483a {

    /* renamed from: a, reason: collision with root package name */
    public final r f6371a;

    /* renamed from: b, reason: collision with root package name */
    public final v f6372b;

    /* renamed from: c, reason: collision with root package name */
    public final C0555a f6373c;

    public C0557c(r rVar, v vVar) {
        f2.j.f(rVar, "fileSystem");
        f2.j.f(vVar, "path");
        this.f6371a = rVar;
        this.f6372b = vVar;
        this.f6373c = new C0555a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009b A[Catch: FileNotFoundException -> 0x009f, TRY_ENTER, TryCatch #0 {FileNotFoundException -> 0x009f, blocks: (B:15:0x009b, B:18:0x00a3, B:47:0x0043), top: B:46:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3 A[Catch: FileNotFoundException -> 0x009f, TRY_LEAVE, TryCatch #0 {FileNotFoundException -> 0x009f, blocks: (B:15:0x009b, B:18:0x00a3, B:47:0x0043), top: B:46:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(C0557c c0557c, X1.c cVar) {
        C0556b c0556b;
        int i3;
        Throwable th;
        C0557c c0557c2;
        FileNotFoundException e3;
        z zVar;
        Throwable th2;
        if (cVar instanceof C0556b) {
            c0556b = (C0556b) cVar;
            int i4 = c0556b.f6370k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0556b.f6370k = i4 - Integer.MIN_VALUE;
                Object obj = c0556b.f6368i;
                W1.a aVar = W1.a.f4608d;
                i3 = c0556b.f6370k;
                th = null;
                if (i3 != 0) {
                    R1.a.e(obj);
                    if (c0557c.f6373c.f6365a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        r rVar = c0557c.f6371a;
                        v vVar = c0557c.f6372b;
                        rVar.getClass();
                        f2.j.f(vVar, "file");
                        File f3 = vVar.f();
                        Logger logger = t.f4443a;
                        z p3 = AbstractC0508a.p(new C0229d(new FileInputStream(f3), 1, H.f4385d));
                        try {
                            C0599h c0599h = C0599h.f6594a;
                            c0556b.f6366g = c0557c;
                            c0556b.f6367h = p3;
                            c0556b.f6370k = 1;
                            C0593b a3 = c0599h.a(p3);
                            if (a3 == aVar) {
                                return aVar;
                            }
                            c0557c2 = c0557c;
                            zVar = p3;
                            obj = a3;
                        } catch (Throwable th3) {
                            c0557c2 = c0557c;
                            zVar = p3;
                            th2 = th3;
                            if (zVar != null) {
                                try {
                                    zVar.close();
                                } catch (Throwable th4) {
                                    try {
                                        R1.a.a(th2, th4);
                                    } catch (FileNotFoundException e4) {
                                        e3 = e4;
                                        if (c0557c2.f6371a.a(c0557c2.f6372b)) {
                                        }
                                    }
                                }
                            }
                            th = th2;
                            obj = null;
                            if (th == null) {
                            }
                        }
                    } catch (FileNotFoundException e5) {
                        c0557c2 = c0557c;
                        e3 = e5;
                        if (c0557c2.f6371a.a(c0557c2.f6372b)) {
                            return new C0593b(true);
                        }
                        throw e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = c0556b.f6367h;
                    c0557c2 = c0556b.f6366g;
                    try {
                        R1.a.e(obj);
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
                f2.j.c(obj);
                return obj;
            }
        }
        c0556b = new C0556b(c0557c, cVar);
        Object obj2 = c0556b.f6368i;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0556b.f6370k;
        th = null;
        if (i3 != 0) {
        }
        if (zVar != null) {
        }
        if (th == null) {
        }
    }

    @Override // h1.InterfaceC0483a
    public final void close() {
        this.f6373c.f6365a.set(true);
    }
}
