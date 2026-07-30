package i3;

import f8.a0;
import f8.m;
import f8.w;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class c implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    public final m f4892a;

    /* renamed from: b, reason: collision with root package name */
    public final w f4893b;

    /* renamed from: c, reason: collision with root package name */
    public final a f4894c;

    public c(m mVar, w wVar) {
        r6.k.f(mVar, "fileSystem");
        r6.k.f(wVar, "path");
        this.f4892a = mVar;
        this.f4893b = wVar;
        this.f4894c = new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[Catch: FileNotFoundException -> 0x0087, TRY_ENTER, TryCatch #4 {FileNotFoundException -> 0x0087, blocks: (B:15:0x0083, B:18:0x008b, B:47:0x0041), top: B:46:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[Catch: FileNotFoundException -> 0x0087, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0087, blocks: (B:15:0x0083, B:18:0x008b, B:47:0x0041), top: B:46:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(c cVar, j6.c cVar2) {
        b bVar;
        int i7;
        Throwable th;
        c cVar3;
        FileNotFoundException e9;
        a0 a0Var;
        Throwable th2;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i8 = bVar.f4891j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f4891j = i8 - Integer.MIN_VALUE;
                Object obj = bVar.f4889h;
                i7 = bVar.f4891j;
                th = null;
                if (i7 != 0) {
                    d6.a.e(obj);
                    if (cVar.f4894c.f4886a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        a0 n8 = a8.d.n(cVar.f4892a.h(cVar.f4893b));
                        try {
                            k3.g gVar = k3.g.f5355a;
                            bVar.f4887f = cVar;
                            bVar.f4888g = n8;
                            bVar.f4891j = 1;
                            k3.b a3 = gVar.a(n8);
                            i6.a aVar = i6.a.f4956f;
                            if (a3 == aVar) {
                                return aVar;
                            }
                            cVar3 = cVar;
                            a0Var = n8;
                            obj = a3;
                        } catch (Throwable th3) {
                            cVar3 = cVar;
                            a0Var = n8;
                            th2 = th3;
                            if (a0Var != null) {
                            }
                            th = th2;
                            obj = null;
                            if (th == null) {
                            }
                        }
                    } catch (FileNotFoundException e10) {
                        cVar3 = cVar;
                        e9 = e10;
                        if (cVar3.f4892a.d(cVar3.f4893b)) {
                            return new k3.b(true);
                        }
                        throw e9;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var = bVar.f4888g;
                    cVar3 = bVar.f4887f;
                    try {
                        d6.a.e(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (a0Var != null) {
                            try {
                                a0Var.close();
                            } catch (Throwable th5) {
                                try {
                                    d6.a.a(th2, th5);
                                } catch (FileNotFoundException e11) {
                                    e9 = e11;
                                    if (cVar3.f4892a.d(cVar3.f4893b)) {
                                    }
                                }
                            }
                        }
                        th = th2;
                        obj = null;
                        if (th == null) {
                        }
                    }
                }
                if (a0Var != null) {
                    try {
                        a0Var.close();
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                if (th == null) {
                    throw th;
                }
                r6.k.c(obj);
                return obj;
            }
        }
        bVar = new b(cVar, cVar2);
        Object obj2 = bVar.f4889h;
        i7 = bVar.f4891j;
        th = null;
        if (i7 != 0) {
        }
        if (a0Var != null) {
        }
        if (th == null) {
        }
    }

    @Override // g3.a
    public final void close() {
        this.f4894c.f4886a.set(true);
    }
}
