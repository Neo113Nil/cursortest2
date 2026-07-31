package c5;

import a7.a1;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.lifecycle.l0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import d7.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import o.t0;
import q.p0;
import r.v1;
import y3.o0;
import y3.r0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x implements v1, z0.e {

    /* renamed from: d, reason: collision with root package name */
    public Object f1737d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1738e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1739f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1740g;

    public /* synthetic */ x(Object obj) {
        this.f1737d = obj;
    }

    public static void b(x xVar, b.o oVar) {
        xVar.getClass();
        q6.i.e(oVar, "handler");
        if (((LinkedHashSet) xVar.f1739f).add(oVar)) {
            s4.f fVar = (s4.f) xVar.f1738e;
            fVar.getClass();
            if (oVar.f1010c == null) {
                fVar.f6713e.addFirst(oVar);
                oVar.f1010c = xVar;
                fVar.b();
            } else {
                throw new IllegalArgumentException(("Handler '" + oVar + "' is already registered with a dispatcher").toString());
            }
        }
    }

    public void c(s4.e eVar) {
        if (((LinkedHashSet) this.f1740g).add(eVar)) {
            ((s4.f) this.f1738e).a(this, eVar, -1);
        }
    }

    public void d(s4.j jVar, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(a0.q.h("Unsupported priority value: ", i).toString());
        }
        if (((LinkedHashSet) this.f1740g).add(jVar)) {
            ((s4.f) this.f1738e).a(this, jVar, i);
        }
    }

    public void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((t0) this.f1738e).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void f(s4.e eVar, s4.b bVar) {
        s4.f fVar = (s4.f) this.f1738e;
        fVar.getClass();
        if (fVar.f6715g != 0) {
            return;
        }
        b.o c8 = fVar.c(-1);
        fVar.f6714f = c8;
        fVar.f6715g = -1;
        fVar.f6716h = eVar;
        if (bVar != null) {
            if (c8 != null) {
                switch (c8.f1011d) {
                    case 0:
                        q6.i.e(bVar, "event");
                        b.u uVar = (b.u) c8.f1012e;
                        new b.a(bVar);
                        switch (uVar.f1024d) {
                            case 1:
                                ((c.d) uVar.f1025e).d();
                                break;
                        }
                    default:
                        c.d dVar = (c.d) c8.f1012e;
                        q6.i.e(bVar, "navigationEvent");
                        dVar.d();
                        break;
                }
            }
            n0 n0Var = fVar.f6709a;
            s4.h hVar = new s4.h(bVar);
            n0Var.getClass();
            n0Var.j(null, hVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(long j7, long j8, i6.c cVar) {
        p1.a aVar;
        int i;
        long j9;
        if (cVar instanceof p1.a) {
            aVar = (p1.a) cVar;
            int i8 = aVar.i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.i = i8 - Integer.MIN_VALUE;
                p1.a aVar2 = aVar;
                Object obj = aVar2.f5714g;
                i = aVar2.i;
                if (i != 0) {
                    s6.a.K(obj);
                    p1.e eVar = (p1.e) this.f1737d;
                    p1.e eVar2 = null;
                    p1.e eVar3 = (eVar == null || !eVar.f8718q) ? null : (p1.e) w1.f.j(eVar);
                    j9 = 0;
                    h6.a aVar3 = h6.a.f3204d;
                    if (eVar3 == null) {
                        p1.e eVar4 = (p1.e) this.f1738e;
                        if (eVar4 != null) {
                            aVar2.i = 1;
                            obj = eVar4.s0(j7, j8, aVar2);
                        }
                    } else {
                        p1.e eVar5 = (p1.e) this.f1737d;
                        if (eVar5 != null && eVar5.f8718q) {
                            eVar2 = (p1.e) w1.f.j(eVar5);
                        }
                        if (eVar2 != null) {
                            aVar2.i = 2;
                            obj = eVar2.s0(j7, j8, aVar2);
                        } else {
                            j9 = 0;
                        }
                    }
                } else if (i == 1) {
                    s6.a.K(obj);
                    j9 = ((r2.q) obj).f6537a;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    j9 = ((r2.q) obj).f6537a;
                }
                return new r2.q(j9);
            }
        }
        aVar = new p1.a(this, cVar);
        p1.a aVar22 = aVar;
        Object obj2 = aVar22.f5714g;
        i = aVar22.i;
        if (i != 0) {
        }
        return new r2.q(j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(long j7, i6.c cVar) {
        p1.b bVar;
        int i;
        long j8;
        if (cVar instanceof p1.b) {
            bVar = (p1.b) cVar;
            int i8 = bVar.i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.i = i8 - Integer.MIN_VALUE;
                Object obj = bVar.f5716g;
                i = bVar.i;
                if (i != 0) {
                    s6.a.K(obj);
                    p1.e eVar = (p1.e) this.f1737d;
                    p1.e eVar2 = null;
                    if (eVar != null && eVar.f8718q) {
                        eVar2 = (p1.e) w1.f.j(eVar);
                    }
                    if (eVar2 == null) {
                        j8 = 0;
                        return new r2.q(j8);
                    }
                    bVar.i = 1;
                    obj = eVar2.u0(j7, bVar);
                    h6.a aVar = h6.a.f3204d;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                j8 = ((r2.q) obj).f6537a;
                return new r2.q(j8);
            }
        }
        bVar = new p1.b(this, cVar);
        Object obj2 = bVar.f5716g;
        i = bVar.i;
        if (i != 0) {
        }
        j8 = ((r2.q) obj2).f6537a;
        return new r2.q(j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(i6.c cVar) {
        y3.h hVar;
        int i;
        y3.c cVar2;
        y3.b0 b0Var = (y3.b0) this.f1740g;
        if (cVar instanceof y3.h) {
            hVar = (y3.h) cVar;
            int i8 = hVar.i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                hVar.i = i8 - Integer.MIN_VALUE;
                Object obj = hVar.f8874g;
                i = hVar.i;
                if (i != 0) {
                    s6.a.K(obj);
                    List list = (List) this.f1739f;
                    h6.a aVar = h6.a.f3204d;
                    if (list == null || list.isEmpty()) {
                        hVar.i = 1;
                        obj = y3.b0.f(b0Var, false, hVar);
                    } else {
                        r0 g3 = b0Var.g();
                        y3.k kVar = new y3.k(b0Var, this, null);
                        hVar.i = 2;
                        obj = g3.b(kVar, hVar);
                    }
                    return aVar;
                }
                if (i == 1) {
                    s6.a.K(obj);
                    cVar2 = (y3.c) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    cVar2 = (y3.c) obj;
                }
                b0Var.f8845j.s(cVar2);
                return c6.m.f1757a;
            }
        }
        hVar = new y3.h(this, cVar);
        Object obj2 = hVar.f8874g;
        i = hVar.i;
        if (i != 0) {
        }
        b0Var.f8845j.s(cVar2);
        return c6.m.f1757a;
    }

    public r.p j(long j7, r.p pVar, r.p pVar2) {
        if (((r.p) this.f1739f) == null) {
            this.f1739f = pVar.c();
        }
        r.p pVar3 = (r.p) this.f1739f;
        if (pVar3 == null) {
            q6.i.j("velocityVector");
            throw null;
        }
        int b8 = pVar3.b();
        for (int i = 0; i < b8; i++) {
            r.p pVar4 = (r.p) this.f1739f;
            if (pVar4 == null) {
                q6.i.j("velocityVector");
                throw null;
            }
            b1.b bVar = (b1.b) this.f1737d;
            pVar.getClass();
            long j8 = j7 / 1000000;
            p0 a8 = ((c4.e) bVar.f1050e).a(pVar2.a(i));
            long j9 = a8.f5892c;
            pVar4.e(i, (((Math.signum(a8.f5890a) * q.b.a(j9 > 0 ? j8 / j9 : 1.0f).f5796b) * a8.f5891b) / j9) * 1000.0f);
        }
        r.p pVar5 = (r.p) this.f1739f;
        if (pVar5 != null) {
            return pVar5;
        }
        q6.i.j("velocityVector");
        throw null;
    }

    @Override // r.t1
    public r.p k(long j7, r.p pVar, r.p pVar2, r.p pVar3) {
        if (((r.p) this.f1738e) == null) {
            this.f1738e = pVar.c();
        }
        r.p pVar4 = (r.p) this.f1738e;
        if (pVar4 == null) {
            q6.i.j("valueVector");
            throw null;
        }
        int b8 = pVar4.b();
        for (int i = 0; i < b8; i++) {
            r.p pVar5 = (r.p) this.f1738e;
            if (pVar5 == null) {
                q6.i.j("valueVector");
                throw null;
            }
            pVar5.e(i, ((q3.k) this.f1737d).h(i).b(j7, pVar.a(i), pVar2.a(i), pVar3.a(i)));
        }
        r.p pVar6 = (r.p) this.f1738e;
        if (pVar6 != null) {
            return pVar6;
        }
        q6.i.j("valueVector");
        throw null;
    }

    @Override // r.t1
    public r.p l(long j7, r.p pVar, r.p pVar2, r.p pVar3) {
        if (((r.p) this.f1739f) == null) {
            this.f1739f = pVar3.c();
        }
        r.p pVar4 = (r.p) this.f1739f;
        if (pVar4 == null) {
            q6.i.j("velocityVector");
            throw null;
        }
        int b8 = pVar4.b();
        for (int i = 0; i < b8; i++) {
            r.p pVar5 = (r.p) this.f1739f;
            if (pVar5 == null) {
                q6.i.j("velocityVector");
                throw null;
            }
            pVar5.e(i, ((q3.k) this.f1737d).h(i).c(j7, pVar.a(i), pVar2.a(i), pVar3.a(i)));
        }
        r.p pVar6 = (r.p) this.f1739f;
        if (pVar6 != null) {
            return pVar6;
        }
        q6.i.j("velocityVector");
        throw null;
    }

    @Override // r.t1
    public long m(r.p pVar, r.p pVar2, r.p pVar3) {
        int b8 = pVar.b();
        long j7 = 0;
        for (int i = 0; i < b8; i++) {
            j7 = Math.max(j7, ((q3.k) this.f1737d).h(i).d(pVar.a(i), pVar2.a(i), pVar3.a(i)));
        }
        return j7;
    }

    public androidx.lifecycle.r0 n(q6.e eVar, String str) {
        androidx.lifecycle.r0 r0Var;
        boolean isInstance;
        androidx.lifecycle.r0 a8;
        q6.i.e(str, "key");
        synchronized (((n4.b) this.f1740g)) {
            try {
                w0 w0Var = (w0) this.f1737d;
                w0Var.getClass();
                r0Var = (androidx.lifecycle.r0) w0Var.f877a.get(str);
                Class cls = eVar.f6194a;
                q6.i.e(cls, "jClass");
                Map map = q6.e.f6193b;
                q6.i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
                Integer num = (Integer) map.get(cls);
                if (num != null) {
                    isInstance = q6.v.e(num.intValue(), r0Var);
                } else {
                    if (cls.isPrimitive()) {
                        cls = m.a.B(q6.t.a(cls));
                    }
                    isInstance = cls.isInstance(r0Var);
                }
                if (isInstance) {
                    androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f1738e;
                    if (t0Var instanceof androidx.lifecycle.p0) {
                        androidx.lifecycle.p0 p0Var = (androidx.lifecycle.p0) t0Var;
                        q6.i.b(r0Var);
                        p0Var.getClass();
                        androidx.lifecycle.w wVar = p0Var.f855d;
                        if (wVar != null) {
                            x4.e eVar2 = p0Var.f856e;
                            q6.i.b(eVar2);
                            l0.a(r0Var, eVar2, wVar);
                        }
                    }
                    q6.i.c(r0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    l4.e eVar3 = new l4.e((l4.b) this.f1739f);
                    eVar3.f4829a.put(v0.f867b, str);
                    androidx.lifecycle.t0 t0Var2 = (androidx.lifecycle.t0) this.f1738e;
                    q6.i.e(t0Var2, "factory");
                    try {
                        try {
                            a8 = t0Var2.b(eVar, eVar3);
                        } catch (AbstractMethodError unused) {
                            a8 = t0Var2.a(m.a.A(eVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        a8 = t0Var2.c(m.a.A(eVar), eVar3);
                    }
                    r0Var = a8;
                    w0 w0Var2 = (w0) this.f1737d;
                    w0Var2.getClass();
                    q6.i.e(r0Var, "viewModel");
                    androidx.lifecycle.r0 r0Var2 = (androidx.lifecycle.r0) w0Var2.f877a.put(str, r0Var);
                    if (r0Var2 != null) {
                        r0Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r0Var;
    }

    @Override // r.t1
    public r.p o(r.p pVar, r.p pVar2, r.p pVar3) {
        if (((r.p) this.f1740g) == null) {
            this.f1740g = pVar3.c();
        }
        r.p pVar4 = (r.p) this.f1740g;
        if (pVar4 == null) {
            q6.i.j("endVelocityVector");
            throw null;
        }
        int b8 = pVar4.b();
        for (int i = 0; i < b8; i++) {
            r.p pVar5 = (r.p) this.f1740g;
            if (pVar5 == null) {
                q6.i.j("endVelocityVector");
                throw null;
            }
            pVar5.e(i, ((q3.k) this.f1737d).h(i).e(pVar.a(i), pVar2.a(i), pVar3.a(i)));
        }
        r.p pVar6 = (r.p) this.f1740g;
        if (pVar6 != null) {
            return pVar6;
        }
        q6.i.j("endVelocityVector");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
    
        if (r9.d(r1) == r7) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: all -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x008c, blocks: (B:25:0x0064, B:29:0x0077), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r2v5, types: [i7.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [c5.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(i6.c cVar) {
        o0 o0Var;
        int i;
        i7.c cVar2;
        i7.a aVar;
        Throwable th;
        a7.m mVar = (a7.m) this.f1738e;
        try {
            if (cVar instanceof o0) {
                o0Var = (o0) cVar;
                int i8 = o0Var.f8917j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    o0Var.f8917j = i8 - Integer.MIN_VALUE;
                    Object obj = o0Var.f8916h;
                    i = o0Var.f8917j;
                    c6.m mVar2 = c6.m.f1757a;
                    h6.a aVar2 = h6.a.f3204d;
                    if (i != 0) {
                        s6.a.K(obj);
                        mVar.getClass();
                        if (!(a1.f240d.get(mVar) instanceof a7.p0)) {
                            return mVar2;
                        }
                        cVar2 = (i7.c) this.f1737d;
                        o0Var.f8915g = cVar2;
                        o0Var.f8917j = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = o0Var.f8915g;
                            try {
                                s6.a.K(obj);
                                mVar.S(mVar2);
                                ((i7.c) aVar).f(null);
                                return mVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                ((i7.c) aVar).f(null);
                                throw th;
                            }
                        }
                        ?? r22 = o0Var.f8915g;
                        s6.a.K(obj);
                        cVar2 = r22;
                    }
                    mVar.getClass();
                    if (a1.f240d.get(mVar) instanceof a7.p0) {
                        cVar2.f(null);
                        return mVar2;
                    }
                    o0Var.f8915g = cVar2;
                    o0Var.f8917j = 2;
                    if (i(o0Var) != aVar2) {
                        aVar = cVar2;
                        mVar.S(mVar2);
                        ((i7.c) aVar).f(null);
                        return mVar2;
                    }
                    return aVar2;
                }
            }
            mVar.getClass();
            if (a1.f240d.get(mVar) instanceof a7.p0) {
            }
        } catch (Throwable th3) {
            aVar = cVar2;
            th = th3;
            ((i7.c) aVar).f(null);
            throw th;
        }
        o0Var = new o0(this, cVar);
        Object obj2 = o0Var.f8916h;
        i = o0Var.f8917j;
        c6.m mVar22 = c6.m.f1757a;
        h6.a aVar22 = h6.a.f3204d;
        if (i != 0) {
        }
    }

    public x(int i) {
        switch (i) {
            case 1:
                this.f1737d = new p3.b(10);
                this.f1738e = new t0(0);
                this.f1739f = new ArrayList();
                this.f1740g = new HashSet();
                break;
            case 5:
                this.f1739f = new d1.o(5, this);
                break;
            default:
                this.f1737d = new o.e(0);
                this.f1739f = new SparseArray();
                this.f1740g = new o.q((Object) null);
                this.f1738e = new o.e(0);
                break;
        }
    }

    public x(w0 w0Var, androidx.lifecycle.t0 t0Var, l4.b bVar) {
        q6.i.e(w0Var, "store");
        q6.i.e(t0Var, "factory");
        q6.i.e(bVar, "defaultExtras");
        this.f1737d = w0Var;
        this.f1738e = t0Var;
        this.f1739f = bVar;
        this.f1740g = new n4.b();
    }

    public x(Typeface typeface, e4.b bVar) {
        int i;
        int i8;
        int i9;
        int i10;
        this.f1740g = typeface;
        this.f1737d = bVar;
        this.f1739f = new d4.x(1024);
        int a8 = bVar.a(6);
        if (a8 != 0) {
            int i11 = a8 + bVar.f2488d;
            i = ((ByteBuffer) bVar.f2491g).getInt(((ByteBuffer) bVar.f2491g).getInt(i11) + i11);
        } else {
            i = 0;
        }
        this.f1738e = new char[i * 2];
        int a9 = bVar.a(6);
        if (a9 != 0) {
            int i12 = a9 + bVar.f2488d;
            i8 = ((ByteBuffer) bVar.f2491g).getInt(((ByteBuffer) bVar.f2491g).getInt(i12) + i12);
        } else {
            i8 = 0;
        }
        for (int i13 = 0; i13 < i8; i13++) {
            d4.a0 a0Var = new d4.a0(this, i13);
            e4.a b8 = a0Var.b();
            int a10 = b8.a(4);
            Character.toChars(a10 != 0 ? ((ByteBuffer) b8.f2491g).getInt(a10 + b8.f2488d) : 0, (char[]) this.f1738e, i13 * 2);
            e4.a b9 = a0Var.b();
            int a11 = b9.a(16);
            if (a11 != 0) {
                int i14 = a11 + b9.f2488d;
                i9 = ((ByteBuffer) b9.f2491g).getInt(((ByteBuffer) b9.f2491g).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            h0.a.m("invalid metadata codepoint length", i9 > 0);
            d4.x xVar = (d4.x) this.f1739f;
            e4.a b10 = a0Var.b();
            int a12 = b10.a(16);
            if (a12 != 0) {
                int i15 = a12 + b10.f2488d;
                i10 = ((ByteBuffer) b10.f2491g).getInt(((ByteBuffer) b10.f2491g).getInt(i15) + i15);
            } else {
                i10 = 0;
            }
            xVar.a(a0Var, 0, i10 - 1);
        }
    }

    public x(r.w wVar) {
        this(new q3.k(4, wVar));
    }
}
