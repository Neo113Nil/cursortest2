package g1;

import I2.l;
import M1.B;
import N2.C0148d;
import N2.H;
import N2.r;
import N2.t;
import N2.v;
import N2.z;
import a.AbstractC0157a;
import e1.InterfaceC0352a;
import i1.C0465b;
import i1.C0471h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Logger;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0396c implements InterfaceC0352a {

    /* renamed from: a, reason: collision with root package name */
    public final r f4802a;

    /* renamed from: b, reason: collision with root package name */
    public final v f4803b;

    /* renamed from: c, reason: collision with root package name */
    public final C0394a f4804c;

    public C0396c(r rVar, v vVar) {
        Z1.i.f(rVar, "fileSystem");
        Z1.i.f(vVar, "path");
        this.f4802a = rVar;
        this.f4803b = vVar;
        this.f4804c = new C0394a();
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
    public static Object a(C0396c c0396c, R1.c cVar) {
        C0395b c0395b;
        int i3;
        Throwable th;
        C0396c c0396c2;
        FileNotFoundException e3;
        z zVar;
        Throwable th2;
        boolean z3 = true;
        if (cVar instanceof C0395b) {
            c0395b = (C0395b) cVar;
            int i4 = c0395b.f4801h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0395b.f4801h = i4 - Integer.MIN_VALUE;
                Object obj = c0395b.f4799f;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0395b.f4801h;
                th = null;
                if (i3 != 0) {
                    l.Q(obj);
                    if (c0396c.f4804c.f4796a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        r rVar = c0396c.f4802a;
                        v vVar = c0396c.f4803b;
                        rVar.getClass();
                        Z1.i.f(vVar, "file");
                        File f3 = vVar.f();
                        Logger logger = t.f2963a;
                        z j3 = AbstractC0157a.j(new C0148d(new FileInputStream(f3), 1, H.f2905d));
                        try {
                            C0471h c0471h = C0471h.f5115a;
                            c0395b.f4797d = c0396c;
                            c0395b.f4798e = j3;
                            c0395b.f4801h = 1;
                            C0465b a3 = c0471h.a(j3);
                            if (a3 == aVar) {
                                return aVar;
                            }
                            c0396c2 = c0396c;
                            zVar = j3;
                            obj = a3;
                        } catch (Throwable th3) {
                            c0396c2 = c0396c;
                            zVar = j3;
                            th2 = th3;
                            if (zVar != null) {
                                try {
                                    zVar.close();
                                } catch (Throwable th4) {
                                    try {
                                        B.o(th2, th4);
                                    } catch (FileNotFoundException e4) {
                                        e3 = e4;
                                        if (c0396c2.f4802a.a(c0396c2.f4803b)) {
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
                        c0396c2 = c0396c;
                        e3 = e5;
                        if (c0396c2.f4802a.a(c0396c2.f4803b)) {
                            return new C0465b(z3);
                        }
                        throw e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = c0395b.f4798e;
                    c0396c2 = c0395b.f4797d;
                    try {
                        l.Q(obj);
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
                Z1.i.c(obj);
                return obj;
            }
        }
        c0395b = new C0395b(c0396c, cVar);
        Object obj2 = c0395b.f4799f;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0395b.f4801h;
        th = null;
        if (i3 != 0) {
        }
        if (zVar != null) {
        }
        if (th == null) {
        }
    }

    @Override // e1.InterfaceC0352a
    public final void close() {
        this.f4804c.f4796a.set(true);
    }
}
