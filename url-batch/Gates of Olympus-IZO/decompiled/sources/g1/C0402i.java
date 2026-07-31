package g1;

import I2.l;
import L1.z;
import M1.B;
import N2.r;
import N2.v;
import e1.C0350M;
import e1.InterfaceC0352a;
import e1.X;
import e1.Z;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: g1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402i implements InterfaceC0352a {

    /* renamed from: a, reason: collision with root package name */
    public final r f4827a;

    /* renamed from: b, reason: collision with root package name */
    public final v f4828b;

    /* renamed from: c, reason: collision with root package name */
    public final X f4829c;

    /* renamed from: d, reason: collision with root package name */
    public final C0398e f4830d;

    /* renamed from: e, reason: collision with root package name */
    public final C0394a f4831e;

    /* renamed from: f, reason: collision with root package name */
    public final s2.c f4832f;

    public C0402i(r rVar, v vVar, X x3, C0398e c0398e) {
        Z1.i.f(rVar, "fileSystem");
        Z1.i.f(vVar, "path");
        Z1.i.f(x3, "coordinator");
        this.f4827a = rVar;
        this.f4828b = vVar;
        this.f4829c = x3;
        this.f4830d = c0398e;
        this.f4831e = new C0394a();
        this.f4832f = s2.d.a();
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
    /* JADX WARN: Type inference failed for: r0v10, types: [g1.i] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [g1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [g1.i] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [e1.Z] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Z z3, R1.c cVar) {
        ?? r02;
        int i3;
        C0396c c0396c;
        Throwable th;
        C0402i c0402i;
        boolean z4;
        try {
            if (cVar instanceof C0400g) {
                C0400g c0400g = (C0400g) cVar;
                int i4 = c0400g.f4819i;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0400g.f4819i = i4 - Integer.MIN_VALUE;
                    r02 = c0400g;
                    Object obj = r02.f4817g;
                    Q1.a aVar = Q1.a.f3113d;
                    i3 = r02.f4819i;
                    if (i3 != 0) {
                        l.Q(obj);
                        if (this.f4831e.f4796a.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d3 = this.f4832f.d(null);
                        try {
                            C0396c c0396c2 = new C0396c(this.f4827a, this.f4828b);
                            try {
                                Boolean valueOf = Boolean.valueOf(d3);
                                r02.f4814d = this;
                                r02.f4815e = c0396c2;
                                r02.f4816f = d3;
                                r02.f4819i = 1;
                                Object f3 = z3.f(c0396c2, valueOf, r02);
                                if (f3 == aVar) {
                                    return aVar;
                                }
                                c0402i = this;
                                c0396c = c0396c2;
                                obj = f3;
                                z4 = d3;
                            } catch (Throwable th2) {
                                r02 = this;
                                c0396c = c0396c2;
                                th = th2;
                                z3 = d3;
                                c0396c.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            r02 = this;
                            th = th3;
                            z3 = d3;
                            if (z3 != 0) {
                                r02.f4832f.e(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = r02.f4816f;
                        c0396c = r02.f4815e;
                        r02 = r02.f4814d;
                        try {
                            l.Q(obj);
                            c0402i = r02;
                            z4 = z3;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                c0396c.close();
                            } catch (Throwable th5) {
                                B.o(th, th5);
                            }
                            throw th;
                        }
                    }
                    c0396c.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z4) {
                        c0402i.f4832f.e(null);
                    }
                    return obj;
                }
            }
            if (i3 != 0) {
            }
            c0396c.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (z3 != 0) {
            }
            throw th;
        }
        r02 = new C0400g(this, cVar);
        Object obj2 = r02.f4817g;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = r02.f4819i;
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
    /* JADX WARN: Type inference failed for: r0v12, types: [g1.i] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [R1.c, g1.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v9, types: [Y1.e] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, s2.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [Q1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [N2.v] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15, types: [s2.a] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C0350M c0350m, R1.c cVar) {
        ?? r02;
        Object obj;
        ?? r12;
        ?? r22;
        C0402i c0402i;
        v vVar;
        v c3;
        N2.l b2;
        s2.a aVar;
        ?? r10;
        C0404k c0404k;
        Throwable th;
        InterfaceC0352a interfaceC0352a;
        v vVar2;
        C0402i c0402i2;
        s2.a aVar2;
        try {
            try {
                try {
                    try {
                        if (cVar instanceof C0401h) {
                            C0401h c0401h = (C0401h) cVar;
                            int i3 = c0401h.f4826j;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                c0401h.f4826j = i3 - Integer.MIN_VALUE;
                                r02 = c0401h;
                                obj = r02.f4824h;
                                r12 = Q1.a.f3113d;
                                r22 = r02.f4826j;
                                if (r22 != 0) {
                                    l.Q(obj);
                                    if (this.f4831e.f4796a.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    c3 = this.f4828b.c();
                                    if (c3 == null) {
                                        throw new IllegalStateException("must have a parent path");
                                    }
                                    r rVar = this.f4827a;
                                    rVar.getClass();
                                    M1.j jVar = new M1.j();
                                    for (v vVar3 = c3; vVar3 != null && !rVar.a(vVar3); vVar3 = vVar3.c()) {
                                        jVar.addFirst(vVar3);
                                    }
                                    Iterator it = jVar.iterator();
                                    while (it.hasNext()) {
                                        v vVar4 = (v) it.next();
                                        Z1.i.f(vVar4, "dir");
                                        if (!vVar4.f().mkdir() && ((b2 = rVar.b(vVar4)) == null || !b2.f2941b)) {
                                            throw new IOException("failed to create directory: " + vVar4);
                                        }
                                    }
                                    r02.f4820d = this;
                                    r02.f4821e = c0350m;
                                    r02.f4822f = c3;
                                    ?? r11 = this.f4832f;
                                    r02.f4823g = r11;
                                    r02.f4826j = 1;
                                    if (r11.c(null, r02) == r12) {
                                        return r12;
                                    }
                                    c0402i = this;
                                    r10 = c0350m;
                                    aVar = r11;
                                } else {
                                    if (r22 != 1) {
                                        if (r22 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        interfaceC0352a = (InterfaceC0352a) r02.f4823g;
                                        r12 = r02.f4822f;
                                        r22 = (s2.a) r02.f4821e;
                                        r02 = r02.f4820d;
                                        try {
                                            l.Q(obj);
                                            c0402i2 = r02;
                                            vVar2 = r12;
                                            aVar2 = r22;
                                            try {
                                                interfaceC0352a.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (c0402i2.f4827a.a(vVar2)) {
                                                c0402i2.f4827a.d(vVar2, c0402i2.f4828b);
                                            }
                                            ((s2.c) aVar2).e(null);
                                            return z.f2729a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                interfaceC0352a.close();
                                            } catch (Throwable th4) {
                                                B.o(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    s2.a aVar3 = (s2.a) r02.f4823g;
                                    c3 = r02.f4822f;
                                    Y1.e eVar = (Y1.e) r02.f4821e;
                                    c0402i = r02.f4820d;
                                    l.Q(obj);
                                    aVar = aVar3;
                                    r10 = eVar;
                                }
                                StringBuilder sb = new StringBuilder();
                                v vVar5 = c0402i.f4828b;
                                r rVar2 = c0402i.f4827a;
                                sb.append(vVar5.b());
                                sb.append(".tmp");
                                vVar = c3.e(sb.toString());
                                rVar2.e(vVar);
                                c0404k = new C0404k(rVar2, vVar);
                                r02.f4820d = c0402i;
                                r02.f4821e = aVar;
                                r02.f4822f = vVar;
                                r02.f4823g = c0404k;
                                r02.f4826j = 2;
                                if (r10.g(c0404k, r02) != r12) {
                                    return r12;
                                }
                                vVar2 = vVar;
                                interfaceC0352a = c0404k;
                                c0402i2 = c0402i;
                                aVar2 = aVar;
                                interfaceC0352a.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                        }
                        r02.f4820d = c0402i;
                        r02.f4821e = aVar;
                        r02.f4822f = vVar;
                        r02.f4823g = c0404k;
                        r02.f4826j = 2;
                        if (r10.g(c0404k, r02) != r12) {
                        }
                    } catch (Throwable th5) {
                        r12 = vVar;
                        r02 = c0402i;
                        r22 = aVar;
                        th = th5;
                        interfaceC0352a = c0404k;
                        interfaceC0352a.close();
                        throw th;
                    }
                    rVar2.e(vVar);
                    c0404k = new C0404k(rVar2, vVar);
                } catch (IOException e3) {
                    e = e3;
                    if (c0402i.f4827a.a(vVar)) {
                        try {
                            r rVar3 = c0402i.f4827a;
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
                v vVar52 = c0402i.f4828b;
                r rVar22 = c0402i.f4827a;
                sb2.append(vVar52.b());
                sb2.append(".tmp");
                vVar = c3.e(sb2.toString());
            } catch (Throwable th6) {
                th = th6;
                ((s2.c) obj).e(null);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            c0402i = r02;
            vVar = r12;
            if (c0402i.f4827a.a(vVar)) {
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            obj = r22;
            ((s2.c) obj).e(null);
            throw th;
        }
        r02 = new C0401h(this, cVar);
        obj = r02.f4824h;
        r12 = Q1.a.f3113d;
        r22 = r02.f4826j;
    }

    @Override // e1.InterfaceC0352a
    public final void close() {
        this.f4831e.f4796a.set(true);
        this.f4830d.b();
    }
}
