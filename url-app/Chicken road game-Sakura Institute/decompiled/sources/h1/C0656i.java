package h1;

import f1.InterfaceC0608b;
import f1.M;
import f1.X;
import f1.Z;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;
import y2.C1331f;
import z2.C1433q;
import z3.l;
import z3.r;
import z3.v;

/* renamed from: h1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656i implements InterfaceC0608b {

    /* renamed from: a, reason: collision with root package name */
    public final r f6858a;

    /* renamed from: b, reason: collision with root package name */
    public final v f6859b;

    /* renamed from: c, reason: collision with root package name */
    public final X f6860c;

    /* renamed from: d, reason: collision with root package name */
    public final C0652e f6861d;

    /* renamed from: e, reason: collision with root package name */
    public final C0648a f6862e;

    /* renamed from: f, reason: collision with root package name */
    public final e3.c f6863f;

    public C0656i(r fileSystem, v path, X coordinator, C0652e onClose) {
        j1.h serializer = j1.h.f7154a;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f6858a = fileSystem;
        this.f6859b = path;
        this.f6860c = coordinator;
        this.f6861d = onClose;
        this.f6862e = new C0648a();
        this.f6863f = e3.d.a();
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
    /* JADX WARN: Type inference failed for: r0v10, types: [h1.i] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [h1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [h1.i] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [f1.Z] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Z z4, E2.c cVar) {
        ?? r02;
        int i2;
        C0650c c0650c;
        Throwable th;
        C0656i c0656i;
        boolean z5;
        try {
            if (cVar instanceof C0654g) {
                C0654g c0654g = (C0654g) cVar;
                int i4 = c0654g.f6850o;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0654g.f6850o = i4 - Integer.MIN_VALUE;
                    r02 = c0654g;
                    Object obj = r02.f6848m;
                    D2.a aVar = D2.a.f2163d;
                    i2 = r02.f6850o;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        if (this.f6862e.f6827a.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d4 = this.f6863f.d(null);
                        try {
                            C0650c c0650c2 = new C0650c(this.f6858a, this.f6859b);
                            try {
                                Boolean valueOf = Boolean.valueOf(d4);
                                r02.f6845j = this;
                                r02.f6846k = c0650c2;
                                r02.f6847l = d4;
                                r02.f6850o = 1;
                                Object g4 = z4.g(c0650c2, valueOf, r02);
                                if (g4 == aVar) {
                                    return aVar;
                                }
                                c0656i = this;
                                c0650c = c0650c2;
                                obj = g4;
                                z5 = d4;
                            } catch (Throwable th2) {
                                r02 = this;
                                c0650c = c0650c2;
                                th = th2;
                                z4 = d4;
                                c0650c.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            r02 = this;
                            th = th3;
                            z4 = d4;
                            if (z4 != 0) {
                                r02.f6863f.e(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z4 = r02.f6847l;
                        c0650c = r02.f6846k;
                        r02 = r02.f6845j;
                        try {
                            AbstractC1343r.b(obj);
                            c0656i = r02;
                            z5 = z4;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                c0650c.close();
                            } catch (Throwable th5) {
                                C1331f.a(th, th5);
                            }
                            throw th;
                        }
                    }
                    c0650c.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z5) {
                        c0656i.f6863f.e(null);
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            c0650c.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (z4 != 0) {
            }
            throw th;
        }
        r02 = new C0654g(this, cVar);
        Object obj2 = r02.f6848m;
        D2.a aVar2 = D2.a.f2163d;
        i2 = r02.f6850o;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(7:(4:(2:3|(13:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(1:21)|22|23|24)(1:26))(2:37|38))(1:39))(2:67|(2:69|(7:71|(1:75)|77|(3:80|(1:91)(2:88|89)|78)|94|95|(1:97)(1:98))(2:100|101))(2:102|103))|40|41|42|43|44|45|47|48|(1:50)(6:51|14|15|16|17|(0)(0))))|47|48|(0)(0))|40|41|42|43|44|45)|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x014b, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x014c, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013b A[Catch: all -> 0x014b, IOException -> 0x014e, TRY_ENTER, TryCatch #5 {all -> 0x014b, blocks: (B:19:0x013b, B:21:0x0143, B:22:0x0153, B:26:0x015d, B:33:0x016c, B:36:0x0169), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015d A[Catch: all -> 0x014b, IOException -> 0x014e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x014b, blocks: (B:19:0x013b, B:21:0x0143, B:22:0x0153, B:26:0x015d, B:33:0x016c, B:36:0x0169), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(M m4, E2.c cVar) {
        C0655h c0655h;
        D2.a aVar;
        ?? r2;
        C0656i c0656i;
        e3.a aVar2;
        v path;
        v dir;
        l b4;
        Function2 function2;
        C0658k c0658k;
        Throwable th;
        InterfaceC0608b interfaceC0608b;
        v vVar;
        C0656i c0656i2;
        e3.a aVar3;
        try {
            try {
                try {
                    try {
                        if (cVar instanceof C0655h) {
                            C0655h c0655h2 = (C0655h) cVar;
                            int i2 = c0655h2.f6857p;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c0655h2.f6857p = i2 - Integer.MIN_VALUE;
                                c0655h = c0655h2;
                                Object obj = c0655h.f6855n;
                                aVar = D2.a.f2163d;
                                r2 = c0655h.f6857p;
                                if (r2 != 0) {
                                    AbstractC1343r.b(obj);
                                    if (this.f6862e.f6827a.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    dir = this.f6859b.e();
                                    if (dir == null) {
                                        throw new IllegalStateException("must have a parent path");
                                    }
                                    r rVar = this.f6858a;
                                    rVar.getClass();
                                    Intrinsics.checkNotNullParameter(dir, "dir");
                                    Intrinsics.checkNotNullParameter(rVar, "<this>");
                                    Intrinsics.checkNotNullParameter(dir, "dir");
                                    C1433q c1433q = new C1433q();
                                    for (v vVar2 = dir; vVar2 != null && !rVar.a(vVar2); vVar2 = vVar2.e()) {
                                        c1433q.addFirst(vVar2);
                                    }
                                    Iterator<E> it = c1433q.iterator();
                                    while (it.hasNext()) {
                                        v dir2 = (v) it.next();
                                        Intrinsics.checkNotNullParameter(dir2, "dir");
                                        Intrinsics.checkNotNullParameter(dir2, "dir");
                                        if (!dir2.l().mkdir() && ((b4 = rVar.b(dir2)) == null || !b4.f12011b)) {
                                            throw new IOException("failed to create directory: " + dir2);
                                        }
                                    }
                                    c0655h.f6851j = this;
                                    c0655h.f6852k = m4;
                                    c0655h.f6853l = dir;
                                    e3.c cVar2 = this.f6863f;
                                    c0655h.f6854m = cVar2;
                                    c0655h.f6857p = 1;
                                    if (cVar2.c(null, c0655h) == aVar) {
                                        return aVar;
                                    }
                                    c0656i = this;
                                    function2 = m4;
                                    aVar2 = cVar2;
                                } else {
                                    if (r2 != 1) {
                                        if (r2 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        interfaceC0608b = (InterfaceC0608b) c0655h.f6854m;
                                        vVar = c0655h.f6853l;
                                        aVar3 = (e3.a) c0655h.f6852k;
                                        c0656i2 = c0655h.f6851j;
                                        try {
                                            AbstractC1343r.b(obj);
                                            Unit unit = Unit.f7487a;
                                            try {
                                                interfaceC0608b.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (c0656i2.f6858a.a(vVar)) {
                                                c0656i2.f6858a.d(vVar, c0656i2.f6859b);
                                            }
                                            Unit unit2 = Unit.f7487a;
                                            ((e3.c) aVar3).e(null);
                                            return Unit.f7487a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                interfaceC0608b.close();
                                            } catch (Throwable th4) {
                                                C1331f.a(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    e3.a aVar4 = (e3.a) c0655h.f6854m;
                                    dir = c0655h.f6853l;
                                    Function2 function22 = (Function2) c0655h.f6852k;
                                    c0656i = c0655h.f6851j;
                                    AbstractC1343r.b(obj);
                                    aVar2 = aVar4;
                                    function2 = function22;
                                }
                                StringBuilder sb = new StringBuilder();
                                v vVar3 = c0656i.f6859b;
                                r fileSystem = c0656i.f6858a;
                                sb.append(vVar3.c());
                                sb.append(".tmp");
                                path = dir.j(sb.toString());
                                fileSystem.e(path);
                                j1.h serializer = j1.h.f7154a;
                                Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
                                Intrinsics.checkNotNullParameter(path, "path");
                                Intrinsics.checkNotNullParameter(serializer, "serializer");
                                c0658k = new C0658k(fileSystem, path);
                                c0655h.f6851j = c0656i;
                                c0655h.f6852k = aVar2;
                                c0655h.f6853l = path;
                                c0655h.f6854m = c0658k;
                                c0655h.f6857p = 2;
                                if (function2.h(c0658k, c0655h) != aVar) {
                                    return aVar;
                                }
                                vVar = path;
                                interfaceC0608b = c0658k;
                                c0656i2 = c0656i;
                                aVar3 = aVar2;
                                Unit unit3 = Unit.f7487a;
                                interfaceC0608b.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                        }
                        c0655h.f6851j = c0656i;
                        c0655h.f6852k = aVar2;
                        c0655h.f6853l = path;
                        c0655h.f6854m = c0658k;
                        c0655h.f6857p = 2;
                        if (function2.h(c0658k, c0655h) != aVar) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        interfaceC0608b = c0658k;
                        interfaceC0608b.close();
                        throw th;
                    }
                    fileSystem.e(path);
                    j1.h serializer2 = j1.h.f7154a;
                    Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
                    Intrinsics.checkNotNullParameter(path, "path");
                    Intrinsics.checkNotNullParameter(serializer2, "serializer");
                    c0658k = new C0658k(fileSystem, path);
                } catch (IOException e4) {
                    e = e4;
                    if (c0656i.f6858a.a(path)) {
                        try {
                            r rVar2 = c0656i.f6858a;
                            rVar2.getClass();
                            Intrinsics.checkNotNullParameter(path, "path");
                            rVar2.e(path);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                StringBuilder sb2 = new StringBuilder();
                v vVar32 = c0656i.f6859b;
                r fileSystem2 = c0656i.f6858a;
                sb2.append(vVar32.c());
                sb2.append(".tmp");
                path = dir.j(sb2.toString());
            } catch (Throwable th6) {
                th = th6;
                ((e3.c) aVar2).e(null);
                throw th;
            }
            if (r2 != 0) {
            }
        } catch (IOException e5) {
            e = e5;
            c0656i = c0655h;
            aVar2 = r2;
            path = aVar;
        }
        c0655h = new C0655h(this, cVar);
        Object obj2 = c0655h.f6855n;
        aVar = D2.a.f2163d;
        r2 = c0655h.f6857p;
    }

    @Override // f1.InterfaceC0608b
    public final void close() {
        this.f6862e.f6827a.set(true);
        this.f6861d.invoke();
    }
}
