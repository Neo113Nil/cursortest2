package m0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r2 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5065h = 1;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Object f5066j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5067k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5068l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5069m;

    /* renamed from: n, reason: collision with root package name */
    public Object f5070n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f5071o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5072p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(ContentResolver contentResolver, Uri uri, x1.e2 e2Var, c7.c cVar, Context context, g6.c cVar2) {
        super(2, cVar2);
        this.f5068l = contentResolver;
        this.f5069m = uri;
        this.f5070n = e2Var;
        this.f5071o = cVar;
        this.f5072p = context;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        d7.g gVar = (d7.g) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f5065h) {
            case 0:
                ((r2) l(cVar, gVar)).p(c6.m.f1757a);
                return h6.a.f3204d;
            default:
                return ((r2) l(cVar, gVar)).p(c6.m.f1757a);
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f5065h) {
            case 0:
                r2 r2Var = new r2((p6.a) this.f5072p, cVar);
                r2Var.f5071o = obj;
                return r2Var;
            default:
                r2 r2Var2 = new r2((ContentResolver) this.f5068l, (Uri) this.f5069m, (x1.e2) this.f5070n, (c7.c) this.f5071o, (Context) this.f5072p, cVar);
                r2Var2.f5066j = obj;
                return r2Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0259, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #6 {all -> 0x002b, blocks: (B:9:0x0025, B:11:0x005d, B:17:0x006f, B:19:0x0077, B:29:0x003e, B:32:0x0054), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0275 A[LOOP:0: B:52:0x019d->B:60:0x0275, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009c -> B:11:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0258 -> B:43:0x0259). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        b.q qVar;
        d7.g gVar;
        o.k0 k0Var;
        p6.c tVar;
        c7.g a8;
        w0.f u7;
        w0.f j7;
        Object obj2;
        Object obj3;
        Set set;
        boolean z3;
        b.q qVar2;
        int i;
        int i8;
        Object s5;
        d7.g gVar2;
        c7.b bVar;
        d7.g gVar3;
        Object obj4;
        c7.b bVar2;
        switch (this.f5065h) {
            case 0:
                h6.a aVar = h6.a.f3204d;
                int i9 = this.i;
                int i10 = 2;
                try {
                    if (i9 == 0) {
                        s6.a.K(obj);
                        gVar = (d7.g) this.f5071o;
                        k0Var = new o.k0();
                        tVar = new a0.t(15, k0Var);
                        a8 = c7.j.a(Integer.MAX_VALUE, null, 6);
                        b6.j0 j0Var = new b6.j0(5, a8);
                        w0.m.f(w0.m.f7535a);
                        synchronized (w0.m.f7537c) {
                            w0.m.f7542h = d6.m.a0(w0.m.f7542h, j0Var);
                        }
                        qVar = new b.q(j0Var);
                        u7 = w0.m.k().u(tVar);
                        p6.a aVar2 = (p6.a) this.f5072p;
                        try {
                            j7 = u7.j();
                            try {
                                Object b8 = aVar2.b();
                                u7.c();
                                this.f5071o = gVar;
                                this.f5067k = k0Var;
                                this.f5068l = tVar;
                                this.f5069m = a8;
                                this.f5070n = qVar;
                                this.f5066j = b8;
                                this.i = 1;
                                if (gVar.a(b8, this) == aVar) {
                                    return aVar;
                                }
                                obj2 = b8;
                            } finally {
                                w0.f.q(j7);
                            }
                        } finally {
                            u7.c();
                        }
                    } else if (i9 == 1) {
                        obj2 = this.f5066j;
                        qVar = (b.q) this.f5070n;
                        a8 = (c7.g) this.f5069m;
                        tVar = (p6.c) this.f5068l;
                        k0Var = (o.k0) this.f5067k;
                        gVar = (d7.g) this.f5071o;
                        s6.a.K(obj);
                    } else if (i9 == 2) {
                        obj2 = this.f5066j;
                        qVar = (b.q) this.f5070n;
                        a8 = (c7.g) this.f5069m;
                        tVar = (p6.c) this.f5068l;
                        k0Var = (o.k0) this.f5067k;
                        gVar = (d7.g) this.f5071o;
                        s6.a.K(obj);
                        obj3 = obj;
                        set = (Set) obj3;
                        z3 = false;
                        while (true) {
                            if (z3) {
                                try {
                                    Object[] objArr = k0Var.f5490b;
                                    long[] jArr = k0Var.f5489a;
                                    i = i10;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i11 = 0;
                                        while (true) {
                                            long j8 = jArr[i11];
                                            qVar2 = qVar;
                                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i12 = 8;
                                                int i13 = 8 - ((~(i11 - length)) >>> 31);
                                                int i14 = 0;
                                                while (i14 < i13) {
                                                    if ((j8 & 255) < 128) {
                                                        i8 = i12;
                                                        try {
                                                            if (set.contains(objArr[(i11 << 3) + i14])) {
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            qVar = qVar2;
                                                            qVar.a();
                                                            throw th;
                                                        }
                                                    } else {
                                                        i8 = i12;
                                                    }
                                                    j8 >>= i8;
                                                    i14++;
                                                    i12 = i8;
                                                }
                                                if (i13 != i12) {
                                                }
                                            }
                                            if (i11 != length) {
                                                i11++;
                                                qVar = qVar2;
                                            }
                                        }
                                    } else {
                                        qVar2 = qVar;
                                    }
                                    z3 = false;
                                    s5 = a8.s();
                                    if (s5 instanceof c7.i) {
                                        s5 = null;
                                    }
                                    set = (Set) s5;
                                    if (set != null) {
                                        i10 = i;
                                        qVar = qVar2;
                                    } else {
                                        if (z3) {
                                            try {
                                                k0Var.b();
                                                u7 = w0.m.k().u(tVar);
                                                p6.a aVar3 = (p6.a) this.f5072p;
                                                try {
                                                    Object b9 = aVar3.b();
                                                    u7.c();
                                                    if (!q6.i.a(b9, obj2)) {
                                                        this.f5071o = gVar;
                                                        this.f5067k = k0Var;
                                                        this.f5068l = tVar;
                                                        this.f5069m = a8;
                                                        qVar = qVar2;
                                                        this.f5070n = qVar;
                                                        this.f5066j = b9;
                                                        this.i = 3;
                                                        if (gVar.a(b9, this) != aVar) {
                                                            obj2 = b9;
                                                        }
                                                        return aVar;
                                                    }
                                                    i10 = i;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            } catch (Throwable th3) {
                                                try {
                                                    throw th3;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    throw th;
                                                }
                                            }
                                            j7 = u7.j();
                                        }
                                        qVar = qVar2;
                                        i10 = i;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    qVar2 = qVar;
                                }
                            } else {
                                i = i10;
                                qVar2 = qVar;
                            }
                            z3 = true;
                            s5 = a8.s();
                            if (s5 instanceof c7.i) {
                            }
                            set = (Set) s5;
                            if (set != null) {
                            }
                        }
                    } else {
                        if (i9 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f5066j;
                        qVar = (b.q) this.f5070n;
                        a8 = (c7.g) this.f5069m;
                        tVar = (p6.c) this.f5068l;
                        k0Var = (o.k0) this.f5067k;
                        gVar = (d7.g) this.f5071o;
                        s6.a.K(obj);
                        i = 2;
                        i10 = i;
                    }
                    this.f5071o = gVar;
                    this.f5067k = k0Var;
                    this.f5068l = tVar;
                    this.f5069m = a8;
                    this.f5070n = qVar;
                    this.f5066j = obj2;
                    this.i = i10;
                    obj3 = a8.x(this);
                    if (obj3 == aVar) {
                        return aVar;
                    }
                    set = (Set) obj3;
                    z3 = false;
                    while (true) {
                        if (z3) {
                        }
                        z3 = true;
                        s5 = a8.s();
                        if (s5 instanceof c7.i) {
                        }
                        set = (Set) s5;
                        if (set != null) {
                        }
                        i10 = i;
                        qVar = qVar2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    qVar.a();
                    throw th;
                }
                break;
            default:
                x1.e2 e2Var = (x1.e2) this.f5070n;
                ContentResolver contentResolver = (ContentResolver) this.f5068l;
                h6.a aVar4 = h6.a.f3204d;
                int i15 = this.i;
                try {
                    if (i15 == 0) {
                        s6.a.K(obj);
                        gVar2 = (d7.g) this.f5066j;
                        contentResolver.registerContentObserver((Uri) this.f5069m, false, e2Var);
                        bVar = new c7.b((c7.c) this.f5071o);
                    } else if (i15 == 1) {
                        bVar2 = (c7.b) this.f5067k;
                        d7.g gVar4 = (d7.g) this.f5066j;
                        s6.a.K(obj);
                        gVar3 = gVar4;
                        obj4 = obj;
                        if (((Boolean) obj4).booleanValue()) {
                            contentResolver.unregisterContentObserver(e2Var);
                            return c6.m.f1757a;
                        }
                        bVar2.c();
                        Float f6 = new Float(Settings.Global.getFloat(((Context) this.f5072p).getContentResolver(), "animator_duration_scale", 1.0f));
                        this.f5066j = gVar3;
                        this.f5067k = bVar2;
                        this.i = 2;
                        if (gVar3.a(f6, this) == aVar4) {
                            return aVar4;
                        }
                        d7.g gVar5 = gVar3;
                        bVar = bVar2;
                        gVar2 = gVar5;
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c7.b bVar3 = (c7.b) this.f5067k;
                        d7.g gVar6 = (d7.g) this.f5066j;
                        s6.a.K(obj);
                        bVar = bVar3;
                        gVar2 = gVar6;
                    }
                    this.f5066j = gVar2;
                    this.f5067k = bVar;
                    this.i = 1;
                    obj4 = bVar.b(this);
                    if (obj4 == aVar4) {
                        return aVar4;
                    }
                    c7.b bVar4 = bVar;
                    gVar3 = gVar2;
                    bVar2 = bVar4;
                    if (((Boolean) obj4).booleanValue()) {
                    }
                } catch (Throwable th7) {
                    contentResolver.unregisterContentObserver(e2Var);
                    throw th7;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(p6.a aVar, g6.c cVar) {
        super(2, cVar);
        this.f5072p = aVar;
    }
}
