package i3;

import f8.m;
import f8.w;
import g3.h0;
import g3.j0;
import g3.z;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    public final m f4917a;

    /* renamed from: b, reason: collision with root package name */
    public final w f4918b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f4919c;

    /* renamed from: d, reason: collision with root package name */
    public final e f4920d;

    /* renamed from: e, reason: collision with root package name */
    public final a f4921e;

    /* renamed from: f, reason: collision with root package name */
    public final k7.c f4922f;

    public i(m mVar, w wVar, h0 h0Var, e eVar) {
        r6.k.f(mVar, "fileSystem");
        r6.k.f(wVar, "path");
        r6.k.f(h0Var, "coordinator");
        this.f4917a = mVar;
        this.f4918b = wVar;
        this.f4919c = h0Var;
        this.f4920d = eVar;
        this.f4921e = new a();
        this.f4922f = new k7.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(7:36|37|38|40|41|42|(1:44)(1:45))(2:54|55))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:21:0x007b, B:28:0x008b, B:31:0x0088, B:27:0x0083), top: B:7:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [i3.i] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [i3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [i3.i] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [g3.j0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j0 j0Var, j6.c cVar) {
        ?? r02;
        int i7;
        c cVar2;
        Throwable th;
        boolean z8;
        i iVar;
        try {
            if (cVar instanceof g) {
                g gVar = (g) cVar;
                int i8 = gVar.f4909k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    gVar.f4909k = i8 - Integer.MIN_VALUE;
                    r02 = gVar;
                    Object obj = r02.f4907i;
                    i7 = r02.f4909k;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        if (this.f4921e.f4886a.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d8 = this.f4922f.d();
                        try {
                            cVar2 = new c(this.f4917a, this.f4918b);
                            try {
                                Boolean valueOf = Boolean.valueOf(d8);
                                r02.f4904f = this;
                                r02.f4905g = cVar2;
                                r02.f4906h = d8;
                                r02.f4909k = 1;
                                Object c4 = j0Var.c(cVar2, valueOf, r02);
                                i6.a aVar = i6.a.f4956f;
                                if (c4 == aVar) {
                                    return aVar;
                                }
                                obj = c4;
                                z8 = d8;
                                iVar = this;
                            } catch (Throwable th2) {
                                th = th2;
                                j0Var = d8;
                                r02 = this;
                                cVar2.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j0Var = d8;
                            r02 = this;
                            if (j0Var != 0) {
                                r02.f4922f.e(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j0Var = r02.f4906h;
                        cVar2 = r02.f4905g;
                        r02 = r02.f4904f;
                        try {
                            d6.a.e(obj);
                            iVar = r02;
                            z8 = j0Var;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                cVar2.close();
                            } catch (Throwable th5) {
                                d6.a.a(th, th5);
                            }
                            throw th;
                        }
                    }
                    cVar2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z8) {
                        iVar.f4922f.e(null);
                    }
                    return obj;
                }
            }
            if (i7 != 0) {
            }
            cVar2.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (j0Var != 0) {
            }
            throw th;
        }
        r02 = new g(this, cVar);
        Object obj2 = r02.f4907i;
        i7 = r02.f4909k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3 A[Catch: all -> 0x0103, IOException -> 0x0106, TRY_ENTER, TryCatch #9 {IOException -> 0x0106, all -> 0x0103, blocks: (B:18:0x00f3, B:20:0x00fb, B:24:0x0112, B:31:0x0120, B:34:0x011d, B:30:0x0118), top: B:7:0x0021, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0112 A[Catch: all -> 0x0103, IOException -> 0x0106, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x0106, all -> 0x0103, blocks: (B:18:0x00f3, B:20:0x00fb, B:24:0x0112, B:31:0x0120, B:34:0x011d, B:30:0x0118), top: B:7:0x0021, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [i3.i] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [i3.h, j6.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [f8.m] */
    /* JADX WARN: Type inference failed for: r0v6, types: [f8.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v8, types: [q6.e] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, k7.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [f8.w] */
    /* JADX WARN: Type inference failed for: r1v5, types: [f8.w] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [f8.w] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r8v2, types: [f8.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(z zVar, j6.c cVar) {
        ?? r02;
        Object obj;
        ?? r12;
        ?? r22;
        i6.a aVar;
        i iVar;
        w g9;
        k7.a aVar2;
        ?? r10;
        k kVar;
        Throwable th;
        g3.a aVar3;
        k7.a aVar4;
        i iVar2;
        w wVar;
        try {
            try {
                try {
                    try {
                        if (cVar instanceof h) {
                            h hVar = (h) cVar;
                            int i7 = hVar.f4916l;
                            if ((i7 & Integer.MIN_VALUE) != 0) {
                                hVar.f4916l = i7 - Integer.MIN_VALUE;
                                r02 = hVar;
                                obj = r02.f4914j;
                                r12 = r02.f4916l;
                                r22 = 2;
                                r22 = 2;
                                aVar = i6.a.f4956f;
                                if (r12 != 0) {
                                    d6.a.e(obj);
                                    if (this.f4921e.f4886a.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    g9 = this.f4918b.g();
                                    if (g9 == null) {
                                        throw new IllegalStateException("must have a parent path");
                                    }
                                    m mVar = this.f4917a;
                                    mVar.getClass();
                                    e6.j jVar = new e6.j();
                                    for (w wVar2 = g9; wVar2 != null && !mVar.d(wVar2); wVar2 = wVar2.g()) {
                                        jVar.addFirst(wVar2);
                                    }
                                    Iterator it = jVar.iterator();
                                    while (it.hasNext()) {
                                        w wVar3 = (w) it.next();
                                        r6.k.f(wVar3, "dir");
                                        mVar.b(wVar3);
                                    }
                                    r02.f4910f = this;
                                    r02.f4911g = zVar;
                                    r02.f4912h = g9;
                                    ?? r11 = this.f4922f;
                                    r02.f4913i = r11;
                                    r02.f4916l = 1;
                                    if (r11.c(r02) != aVar) {
                                        iVar = this;
                                        r10 = zVar;
                                        aVar2 = r11;
                                    }
                                    return aVar;
                                }
                                if (r12 != 1) {
                                    if (r12 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    aVar3 = (g3.a) r02.f4913i;
                                    r12 = r02.f4912h;
                                    r22 = (k7.a) r02.f4911g;
                                    r02 = r02.f4910f;
                                    try {
                                        d6.a.e(obj);
                                        iVar2 = r02;
                                        wVar = r12;
                                        aVar4 = r22;
                                        try {
                                            aVar3.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (iVar2.f4917a.d(wVar)) {
                                            iVar2.f4917a.a(wVar, iVar2.f4918b);
                                        }
                                        ((k7.c) aVar4).e(null);
                                        return d6.z.f2639a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            aVar3.close();
                                        } catch (Throwable th4) {
                                            d6.a.a(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                k7.a aVar5 = (k7.a) r02.f4913i;
                                g9 = r02.f4912h;
                                q6.e eVar = (q6.e) r02.f4911g;
                                iVar = r02.f4910f;
                                d6.a.e(obj);
                                aVar2 = aVar5;
                                r10 = eVar;
                                StringBuilder sb = new StringBuilder();
                                w wVar4 = iVar.f4918b;
                                ?? r8 = iVar.f4917a;
                                sb.append(wVar4.e());
                                sb.append(".tmp");
                                r12 = g9.l(sb.toString());
                                r8.c(r12);
                                kVar = new k(r8, r12);
                                r02.f4910f = iVar;
                                r02.f4911g = aVar2;
                                r02.f4912h = r12;
                                r02.f4913i = kVar;
                                r02.f4916l = 2;
                                if (r10.d(kVar, r02) != aVar) {
                                    aVar4 = aVar2;
                                    aVar3 = kVar;
                                    iVar2 = iVar;
                                    wVar = r12;
                                    aVar3.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return aVar;
                            }
                        }
                        r02.f4910f = iVar;
                        r02.f4911g = aVar2;
                        r02.f4912h = r12;
                        r02.f4913i = kVar;
                        r02.f4916l = 2;
                        if (r10.d(kVar, r02) != aVar) {
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        r22 = aVar2;
                        r02 = iVar;
                        th = th5;
                        aVar3 = kVar;
                        aVar3.close();
                        throw th;
                    }
                    r8.c(r12);
                    kVar = new k(r8, r12);
                } catch (IOException e9) {
                    e = e9;
                    if (iVar.f4917a.d(r12)) {
                        try {
                            ?? r03 = iVar.f4917a;
                            r03.getClass();
                            r03.c(r12);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                if (r12 != 0) {
                }
                StringBuilder sb2 = new StringBuilder();
                w wVar42 = iVar.f4918b;
                ?? r82 = iVar.f4917a;
                sb2.append(wVar42.e());
                sb2.append(".tmp");
                r12 = g9.l(sb2.toString());
            } catch (Throwable th6) {
                th = th6;
                ((k7.c) obj).e(null);
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            iVar = r02;
            if (iVar.f4917a.d(r12)) {
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            obj = r22;
            ((k7.c) obj).e(null);
            throw th;
        }
        r02 = new h(this, cVar);
        obj = r02.f4914j;
        r12 = r02.f4916l;
        r22 = 2;
        r22 = 2;
        aVar = i6.a.f4956f;
    }

    @Override // g3.a
    public final void close() {
        this.f4921e.f4886a.set(true);
        this.f4920d.a();
    }
}
