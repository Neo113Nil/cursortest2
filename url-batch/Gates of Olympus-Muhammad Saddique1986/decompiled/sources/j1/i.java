package j1;

import R1.y;
import T2.l;
import T2.r;
import T2.v;
import e2.InterfaceC0426e;
import h1.InterfaceC0483a;
import h1.L;
import h1.W;
import h1.Y;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements InterfaceC0483a {

    /* renamed from: a, reason: collision with root package name */
    public final r f6396a;

    /* renamed from: b, reason: collision with root package name */
    public final v f6397b;

    /* renamed from: c, reason: collision with root package name */
    public final W f6398c;

    /* renamed from: d, reason: collision with root package name */
    public final C0559e f6399d;

    /* renamed from: e, reason: collision with root package name */
    public final C0555a f6400e;

    /* renamed from: f, reason: collision with root package name */
    public final y2.c f6401f;

    public i(r rVar, v vVar, W w2, C0559e c0559e) {
        f2.j.f(rVar, "fileSystem");
        f2.j.f(vVar, "path");
        f2.j.f(w2, "coordinator");
        this.f6396a = rVar;
        this.f6397b = vVar;
        this.f6398c = w2;
        this.f6399d = c0559e;
        this.f6400e = new C0555a();
        this.f6401f = y2.d.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007d, blocks: (B:21:0x007c, B:28:0x008d, B:31:0x008a, B:27:0x0085), top: B:7:0x0020, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v10, types: [j1.i] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [j1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [j1.i] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [h1.Y] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Y y3, X1.c cVar) {
        ?? r02;
        int i3;
        C0557c c0557c;
        Throwable th;
        i iVar;
        boolean z3;
        try {
            if (cVar instanceof g) {
                g gVar = (g) cVar;
                int i4 = gVar.f6388l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    gVar.f6388l = i4 - Integer.MIN_VALUE;
                    r02 = gVar;
                    Object obj = r02.f6386j;
                    W1.a aVar = W1.a.f4608d;
                    i3 = r02.f6388l;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        if (this.f6400e.f6365a.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d3 = this.f6401f.d(null);
                        try {
                            C0557c c0557c2 = new C0557c(this.f6396a, this.f6397b);
                            try {
                                Boolean valueOf = Boolean.valueOf(d3);
                                r02.f6383g = this;
                                r02.f6384h = c0557c2;
                                r02.f6385i = d3;
                                r02.f6388l = 1;
                                Object g3 = y3.g(c0557c2, valueOf, r02);
                                if (g3 == aVar) {
                                    return aVar;
                                }
                                iVar = this;
                                c0557c = c0557c2;
                                obj = g3;
                                z3 = d3;
                            } catch (Throwable th2) {
                                r02 = this;
                                c0557c = c0557c2;
                                th = th2;
                                y3 = d3;
                                c0557c.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            r02 = this;
                            th = th3;
                            y3 = d3;
                            if (y3 != 0) {
                                r02.f6401f.e(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y3 = r02.f6385i;
                        c0557c = r02.f6384h;
                        r02 = r02.f6383g;
                        try {
                            R1.a.e(obj);
                            iVar = r02;
                            z3 = y3;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                c0557c.close();
                            } catch (Throwable th5) {
                                R1.a.a(th, th5);
                            }
                            throw th;
                        }
                    }
                    c0557c.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z3) {
                        iVar.f6401f.e(null);
                    }
                    return obj;
                }
            }
            if (i3 != 0) {
            }
            c0557c.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (y3 != 0) {
            }
            throw th;
        }
        r02 = new g(this, cVar);
        Object obj2 = r02.f6386j;
        W1.a aVar2 = W1.a.f4608d;
        i3 = r02.f6388l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011a A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_ENTER, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:18:0x011a, B:20:0x0122, B:24:0x013a, B:31:0x0149, B:34:0x0146, B:30:0x0141), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:18:0x011a, B:20:0x0122, B:24:0x013a, B:31:0x0149, B:34:0x0146, B:30:0x0141), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [j1.i] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [X1.c, j1.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v9, types: [e2.e] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, y2.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [W1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [T2.v] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15, types: [y2.a] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(L l3, X1.c cVar) {
        ?? r02;
        Object obj;
        ?? r12;
        ?? r22;
        i iVar;
        v vVar;
        v c2;
        l b3;
        y2.a aVar;
        ?? r10;
        k kVar;
        Throwable th;
        InterfaceC0483a interfaceC0483a;
        v vVar2;
        i iVar2;
        y2.a aVar2;
        try {
            try {
                try {
                    try {
                        if (cVar instanceof h) {
                            h hVar = (h) cVar;
                            int i3 = hVar.f6395m;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                hVar.f6395m = i3 - Integer.MIN_VALUE;
                                r02 = hVar;
                                obj = r02.f6393k;
                                r12 = W1.a.f4608d;
                                r22 = r02.f6395m;
                                if (r22 != 0) {
                                    R1.a.e(obj);
                                    if (this.f6400e.f6365a.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    c2 = this.f6397b.c();
                                    if (c2 == null) {
                                        throw new IllegalStateException("must have a parent path");
                                    }
                                    r rVar = this.f6396a;
                                    rVar.getClass();
                                    S1.j jVar = new S1.j();
                                    for (v vVar3 = c2; vVar3 != null && !rVar.a(vVar3); vVar3 = vVar3.c()) {
                                        jVar.addFirst(vVar3);
                                    }
                                    Iterator it = jVar.iterator();
                                    while (it.hasNext()) {
                                        v vVar4 = (v) it.next();
                                        f2.j.f(vVar4, "dir");
                                        if (!vVar4.f().mkdir() && ((b3 = rVar.b(vVar4)) == null || !b3.f4421b)) {
                                            throw new IOException("failed to create directory: " + vVar4);
                                        }
                                    }
                                    r02.f6389g = this;
                                    r02.f6390h = l3;
                                    r02.f6391i = c2;
                                    ?? r11 = this.f6401f;
                                    r02.f6392j = r11;
                                    r02.f6395m = 1;
                                    if (r11.c(null, r02) == r12) {
                                        return r12;
                                    }
                                    iVar = this;
                                    r10 = l3;
                                    aVar = r11;
                                } else {
                                    if (r22 != 1) {
                                        if (r22 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        interfaceC0483a = (InterfaceC0483a) r02.f6392j;
                                        r12 = r02.f6391i;
                                        r22 = (y2.a) r02.f6390h;
                                        r02 = r02.f6389g;
                                        try {
                                            R1.a.e(obj);
                                            iVar2 = r02;
                                            vVar2 = r12;
                                            aVar2 = r22;
                                            try {
                                                interfaceC0483a.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (iVar2.f6396a.a(vVar2)) {
                                                iVar2.f6396a.d(vVar2, iVar2.f6397b);
                                            }
                                            ((y2.c) aVar2).e(null);
                                            return y.f4171a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                interfaceC0483a.close();
                                            } catch (Throwable th4) {
                                                R1.a.a(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    y2.a aVar3 = (y2.a) r02.f6392j;
                                    c2 = r02.f6391i;
                                    InterfaceC0426e interfaceC0426e = (InterfaceC0426e) r02.f6390h;
                                    iVar = r02.f6389g;
                                    R1.a.e(obj);
                                    aVar = aVar3;
                                    r10 = interfaceC0426e;
                                }
                                StringBuilder sb = new StringBuilder();
                                v vVar5 = iVar.f6397b;
                                r rVar2 = iVar.f6396a;
                                sb.append(vVar5.b());
                                sb.append(".tmp");
                                vVar = c2.e(sb.toString());
                                rVar2.e(vVar);
                                kVar = new k(rVar2, vVar);
                                r02.f6389g = iVar;
                                r02.f6390h = aVar;
                                r02.f6391i = vVar;
                                r02.f6392j = kVar;
                                r02.f6395m = 2;
                                if (r10.h(kVar, r02) != r12) {
                                    return r12;
                                }
                                vVar2 = vVar;
                                interfaceC0483a = kVar;
                                iVar2 = iVar;
                                aVar2 = aVar;
                                interfaceC0483a.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                        }
                        r02.f6389g = iVar;
                        r02.f6390h = aVar;
                        r02.f6391i = vVar;
                        r02.f6392j = kVar;
                        r02.f6395m = 2;
                        if (r10.h(kVar, r02) != r12) {
                        }
                    } catch (Throwable th5) {
                        r12 = vVar;
                        r02 = iVar;
                        r22 = aVar;
                        th = th5;
                        interfaceC0483a = kVar;
                        interfaceC0483a.close();
                        throw th;
                    }
                    rVar2.e(vVar);
                    kVar = new k(rVar2, vVar);
                } catch (IOException e3) {
                    e = e3;
                    if (iVar.f6396a.a(vVar)) {
                        try {
                            r rVar3 = iVar.f6396a;
                            rVar3.getClass();
                            rVar3.e(vVar);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                if (r22 != 0) {
                }
                StringBuilder sb2 = new StringBuilder();
                v vVar52 = iVar.f6397b;
                r rVar22 = iVar.f6396a;
                sb2.append(vVar52.b());
                sb2.append(".tmp");
                vVar = c2.e(sb2.toString());
            } catch (Throwable th6) {
                th = th6;
                ((y2.c) obj).e(null);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            iVar = r02;
            vVar = r12;
            if (iVar.f6396a.a(vVar)) {
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            obj = r22;
            ((y2.c) obj).e(null);
            throw th;
        }
        r02 = new h(this, cVar);
        obj = r02.f6393k;
        r12 = W1.a.f4608d;
        r22 = r02.f6395m;
    }

    @Override // h1.InterfaceC0483a
    public final void close() {
        this.f6400e.f6365a.set(true);
        this.f6399d.b();
    }
}
