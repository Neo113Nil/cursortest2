package b5;

import ge.v1;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f1188a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f1189b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1190c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f1191d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1192e;

    /* renamed from: f, reason: collision with root package name */
    public final i[] f1193f;
    public final oe.h g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlin.collections.s f1194h;

    public u(int i3, Function0 function0) {
        this.f1188a = i3;
        this.f1189b = function0;
        this.f1193f = new i[i3];
        int i10 = oe.i.f7577a;
        this.g = new oe.h(i3);
        this.f1194h = new kotlin.collections.s(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0061, code lost:
    
        r1.e(kotlin.Unit.f5554a, r4.f7576e);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089 A[Catch: all -> 0x00bc, TryCatch #1 {all -> 0x00bc, blocks: (B:13:0x0085, B:15:0x0089, B:17:0x008f, B:20:0x0096, B:21:0x00b0, B:25:0x00be, B:26:0x00c6), top: B:12:0x0085, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be A[Catch: all -> 0x00bc, TRY_ENTER, TryCatch #1 {all -> 0x00bc, blocks: (B:13:0x0085, B:15:0x0089, B:17:0x008f, B:20:0x0096, B:21:0x00b0, B:25:0x00be, B:26:0x00c6), top: B:12:0x0085, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nd.c cVar) {
        r rVar;
        int i3;
        oe.h hVar;
        int andDecrement;
        Object r9;
        ReentrantLock reentrantLock;
        kotlin.collections.s sVar = this.f1194h;
        try {
            try {
                if (cVar instanceof r) {
                    rVar = (r) cVar;
                    int i10 = rVar.f1176i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        rVar.f1176i = i10 - Integer.MIN_VALUE;
                        Object obj = rVar.f1174d;
                        md.a aVar = md.a.f6622d;
                        i3 = rVar.f1176i;
                        hVar = this.g;
                        if (i3 != 0) {
                            cf.c.M(obj);
                            rVar.f1176i = 1;
                            hVar.getClass();
                            int i11 = hVar.f7575d;
                            do {
                                andDecrement = oe.g.f7574u.getAndDecrement(hVar);
                            } while (andDecrement > i11);
                            if (andDecrement > 0) {
                                r9 = Unit.f5554a;
                            } else {
                                ge.h n10 = ge.a0.n(md.f.b(rVar));
                                try {
                                    if (!hVar.b(n10)) {
                                        while (true) {
                                            int andDecrement2 = oe.g.f7574u.getAndDecrement(hVar);
                                            if (andDecrement2 <= i11) {
                                                if (andDecrement2 > 0) {
                                                    break;
                                                }
                                                if (hVar.b(n10)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    r9 = n10.r();
                                    if (r9 != aVar) {
                                        r9 = Unit.f5554a;
                                    }
                                    if (r9 != aVar) {
                                        r9 = Unit.f5554a;
                                    }
                                } catch (Throwable th) {
                                    n10.z();
                                    throw th;
                                }
                            }
                            if (r9 == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i3 != 1) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cf.c.M(obj);
                        }
                        reentrantLock = this.f1190c;
                        reentrantLock.lock();
                        if (!this.f1192e) {
                            g8.b.L(21, "Connection pool is closed");
                            throw null;
                        }
                        if (sVar.isEmpty() && this.f1191d < this.f1188a) {
                            i iVar = new i((i5.a) this.f1189b.invoke());
                            i[] iVarArr = this.f1193f;
                            int i12 = this.f1191d;
                            this.f1191d = i12 + 1;
                            iVarArr[i12] = iVar;
                            sVar.addLast(iVar);
                        }
                        return (i) sVar.removeLast();
                    }
                }
                if (!this.f1192e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.f1190c;
            reentrantLock.lock();
        } catch (Throwable th2) {
            hVar.c();
            throw th2;
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.f1174d;
        md.a aVar2 = md.a.f6622d;
        i3 = rVar.f1176i;
        hVar = this.g;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:9|(2:10|11)|12|13|14|(1:(1:49)(2:46|(1:48)))(1:16)|17|18|19|20|(1:22)(1:41)|(1:(2:38|39))(3:24|(1:26)|(1:36)(1:30))|31|(1:33)(13:35|12|13|14|(0)(0)|17|18|19|20|(0)(0)|(0)(0)|31|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        r14 = r14;
        r13 = r13;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:14:0x009f, B:16:0x00a3, B:46:0x00ab, B:49:0x00b2), top: B:13:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:20:0x003f, B:24:0x005a, B:28:0x006e, B:30:0x0074, B:31:0x007f, B:36:0x0076, B:38:0x008d, B:39:0x0092), top: B:19:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0086 -> B:12:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, d dVar, nd.c cVar) {
        s sVar;
        int i3;
        wd.b0 b0Var;
        s sVar2;
        Throwable th;
        t tVar;
        long j3;
        boolean z10;
        d dVar2;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i10 = sVar.f1182t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f1182t = i10 - Integer.MIN_VALUE;
                Object obj = sVar.f1180r;
                md.a aVar = md.a.f6622d;
                i3 = sVar.f1182t;
                ld.a aVar2 = null;
                if (i3 != 0) {
                    cf.c.M(obj);
                    wd.b0 b0Var2 = new wd.b0();
                    tVar = new t(b0Var2, this, aVar2, 0);
                    sVar.f1178e = dVar;
                    sVar.f1179i = b0Var2;
                    sVar.f1177d = j;
                    sVar.f1182t = 1;
                    ee.a aVar3 = ee.b.f3956e;
                    j3 = 0;
                    if (j > 0) {
                    }
                    if (z10) {
                    }
                    if (ge.a0.C(j3, tVar, sVar) == aVar) {
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = sVar.f1177d;
                    wd.b0 b0Var3 = sVar.f1179i;
                    ?? r22 = sVar.f1178e;
                    try {
                        cf.c.M(obj);
                        dVar2 = r22;
                    } catch (Throwable th2) {
                        b0Var = b0Var3;
                        dVar = r22;
                        sVar2 = sVar;
                        th = th2;
                    }
                    b0Var = b0Var3;
                    dVar = dVar2;
                    sVar2 = sVar;
                    th = null;
                    try {
                        if (th instanceof v1) {
                            dVar.invoke();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            Object obj2 = b0Var.f10141d;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        sVar = sVar2;
                        wd.b0 b0Var22 = new wd.b0();
                        tVar = new t(b0Var22, this, aVar2, 0);
                        sVar.f1178e = dVar;
                        sVar.f1179i = b0Var22;
                        sVar.f1177d = j;
                        sVar.f1182t = 1;
                        ee.a aVar32 = ee.b.f3956e;
                        j3 = 0;
                        z10 = j > 0;
                        if (z10) {
                            long e2 = ee.b.e(j, ee.i.i(999999L, ee.d.NANOSECONDS));
                            j3 = (((((int) e2) & 1) == 1 ? 1 : 0) == 0 || ee.b.d(e2)) ? ee.b.f(e2, ee.d.MILLISECONDS) : e2 >> 1;
                        } else if (z10) {
                            throw new hd.j();
                        }
                        if (ge.a0.C(j3, tVar, sVar) == aVar) {
                            return aVar;
                        }
                        dVar2 = dVar;
                        b0Var3 = b0Var22;
                        b0Var = b0Var3;
                        dVar = dVar2;
                        sVar2 = sVar;
                        th = null;
                        if (th instanceof v1) {
                        }
                        sVar = sVar2;
                        wd.b0 b0Var222 = new wd.b0();
                        tVar = new t(b0Var222, this, aVar2, 0);
                        sVar.f1178e = dVar;
                        sVar.f1179i = b0Var222;
                        sVar.f1177d = j;
                        sVar.f1182t = 1;
                        ee.a aVar322 = ee.b.f3956e;
                        j3 = 0;
                        if (j > 0) {
                        }
                        if (z10) {
                        }
                        if (ge.a0.C(j3, tVar, sVar) == aVar) {
                        }
                    } catch (Throwable th3) {
                        i iVar = (i) b0Var.f10141d;
                        if (iVar != null) {
                            e(iVar);
                        }
                        throw th3;
                    }
                }
            }
        }
        sVar = new s(this, cVar);
        Object obj3 = sVar.f1180r;
        md.a aVar4 = md.a.f6622d;
        i3 = sVar.f1182t;
        ld.a aVar22 = null;
        if (i3 != 0) {
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f1190c;
        reentrantLock.lock();
        try {
            this.f1192e = true;
            for (i iVar : this.f1193f) {
                if (iVar != null) {
                    iVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb2) {
        kotlin.collections.s sVar = this.f1194h;
        ReentrantLock reentrantLock = this.f1190c;
        reentrantLock.lock();
        try {
            id.d b10 = kotlin.collections.x.b();
            int i3 = sVar.f5583i;
            for (int i10 = 0; i10 < i3; i10++) {
                b10.add(sVar.get(i10));
            }
            id.d a9 = kotlin.collections.x.a(b10);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f1188a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            oe.h hVar = this.g;
            hVar.getClass();
            sb3.append(Math.max(oe.g.f7574u.get(hVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + a9.b() + ")[" + CollectionsKt.B(a9, null, null, null, null, 63) + ']');
            sb2.append(")");
            sb2.append('\n');
            i[] iVarArr = this.f1193f;
            int length = iVarArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                i iVar = iVarArr[i12];
                i11++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i11);
                sb4.append("] - ");
                sb4.append(iVar != null ? iVar.f1140d.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (iVar != null) {
                    iVar.h(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(i iVar) {
        iVar.getClass();
        ReentrantLock reentrantLock = this.f1190c;
        reentrantLock.lock();
        try {
            this.f1194h.addLast(iVar);
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
