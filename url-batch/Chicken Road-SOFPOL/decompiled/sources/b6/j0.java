package b6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1351e;

    public /* synthetic */ j0(int i, int i8, Object obj) {
        this.f1350d = i8;
        this.f1351e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x02ea, code lost:
    
        if (r2 == null) goto L162;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f1  */
    @Override // p6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2) {
        char c8;
        char c9;
        v0.e eVar;
        Collection b02;
        char c10 = 7;
        Object obj3 = null;
        int i = 0;
        switch (this.f1350d) {
            case 0:
                p6.a aVar = (p6.a) this.f1351e;
                m0.s sVar = (m0.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    j0.m.i(aVar, null, false, null, null, null, sVar, 805306368);
                } else {
                    sVar.Q();
                }
                return c6.m.f1757a;
            case 1:
                m0.z0 z0Var = (m0.z0) this.f1351e;
                float floatValue = ((Float) obj2).floatValue();
                q6.i.e((q1.k) obj, "change");
                z0Var.setValue(Float.valueOf(((Number) z0Var.getValue()).floatValue() + floatValue));
                return c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                e7.q qVar = (e7.q) this.f1351e;
                int intValue2 = ((Integer) obj).intValue();
                g6.f fVar = (g6.f) obj2;
                g6.g key = fVar.getKey();
                Object l3 = qVar.f2569h.l(key);
                if (key != a7.r.f297e) {
                    if (fVar != l3) {
                        intValue2 = Integer.MIN_VALUE;
                    }
                    intValue2++;
                } else {
                    Object obj4 = (a7.s0) l3;
                    Object obj5 = (a7.s0) fVar;
                    while (obj5 != null) {
                        if (obj5 != obj4 && (obj5 instanceof f7.q)) {
                            a7.k kVar = (a7.k) a7.a1.f241e.get((f7.q) obj5);
                            obj5 = kVar != null ? kVar.getParent() : null;
                        } else {
                            obj3 = obj5;
                            if (obj3 == obj4) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + obj3 + ", expected child of " + obj4 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (obj3 == obj4) {
                    }
                }
                return Integer.valueOf(intValue2);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                u0.i iVar = (u0.i) this.f1351e;
                ((Integer) obj).getClass();
                if (obj2 instanceof m0.j) {
                    m0.j jVar = (m0.j) obj2;
                    o.k0 k0Var = iVar.f7161h;
                    if (k0Var == null) {
                        o.k0 k0Var2 = o.s0.f5536a;
                        k0Var = new o.k0();
                        iVar.f7161h = k0Var;
                    }
                    k0Var.j(jVar);
                    iVar.f7159f.b(jVar);
                }
                if (obj2 instanceof m0.b2) {
                    iVar.e((m0.b2) obj2);
                }
                if (obj2 instanceof m0.t1) {
                    ((m0.t1) obj2).d();
                }
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                m0.y1 y1Var = (m0.y1) this.f1351e;
                Set set = (Set) obj;
                synchronized (y1Var.f5189b) {
                    try {
                        if (((m0.u1) y1Var.f5206t.getValue()).compareTo(m0.u1.f5130h) >= 0) {
                            o.k0 k0Var3 = y1Var.f5194g;
                            if (set instanceof o0.g) {
                                o.k0 k0Var4 = ((o0.g) set).f5581d;
                                Object[] objArr = k0Var4.f5490b;
                                long[] jArr = k0Var4.f5489a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j7 = jArr[i8];
                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                                            for (int i10 = i; i10 < i9; i10++) {
                                                if ((j7 & 255) < 128) {
                                                    Object obj6 = objArr[(i8 << 3) + i10];
                                                    if (!(obj6 instanceof w0.v) || ((w0.v) obj6).e(1)) {
                                                        k0Var3.a(obj6);
                                                    }
                                                }
                                                j7 >>= 8;
                                            }
                                            if (i9 != 8) {
                                            }
                                        }
                                        if (i8 != length) {
                                            i8++;
                                            i = 0;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj7 : set) {
                                    if (!(obj7 instanceof w0.v) || ((w0.v) obj7).e(1)) {
                                        k0Var3.a(obj7);
                                    }
                                }
                            }
                            obj3 = y1Var.w();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (obj3 != null) {
                    ((a7.h) obj3).k(c6.m.f1757a);
                }
                return c6.m.f1757a;
            case 5:
                c7.c cVar = (c7.c) this.f1351e;
                Set set2 = (Set) obj;
                if (!(set2 instanceof o0.g)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj8 : set3) {
                            if ((obj8 instanceof w0.v) && !((w0.v) obj8).e(4)) {
                            }
                            cVar.t(set2);
                        }
                    }
                    return c6.m.f1757a;
                }
                o.k0 k0Var5 = ((o0.g) set2).f5581d;
                Object[] objArr2 = k0Var5.f5490b;
                long[] jArr2 = k0Var5.f5489a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j8 = jArr2[i11];
                        if ((((~j8) << c10) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j8 & 255) < 128) {
                                    Object obj9 = objArr2[(i11 << 3) + i13];
                                    c9 = c10;
                                    if ((obj9 instanceof w0.v) && !((w0.v) obj9).e(4)) {
                                    }
                                } else {
                                    c9 = c10;
                                }
                                j8 >>= 8;
                                i13++;
                                c10 = c9;
                            }
                            c8 = c10;
                            if (i12 != 8) {
                            }
                        } else {
                            c8 = c10;
                        }
                        if (i11 != length2) {
                            i11++;
                            c10 = c8;
                        }
                    }
                    cVar.t(set2);
                }
                return c6.m.f1757a;
            case 6:
                ((Integer) obj2).getClass();
                m.a.a((p4.p) this.f1351e, (m0.s) obj, m0.b.w(1));
                return c6.m.f1757a;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                ((r.c0) this.f1351e).a((m0.s) obj, m0.b.w(1));
                return c6.m.f1757a;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                q6.p pVar = (q6.p) this.f1351e;
                float floatValue2 = ((Float) obj2).floatValue();
                ((q1.k) obj).a();
                pVar.f6202d = floatValue2;
                return c6.m.f1757a;
            case x.v0.f8304b /* 9 */:
                u.x0 x0Var = (u.x0) this.f1351e;
                a7.x.n(x0Var.f0(), null, new u.w0(x0Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case x.v0.f8306d /* 10 */:
                v0.b bVar = (v0.b) obj;
                List list = (List) ((g2.v) this.f1351e).g(bVar, obj2);
                int size = list.size();
                while (i < size) {
                    Object obj10 = list.get(i);
                    if (obj10 != null && (eVar = bVar.f7429e) != null && !eVar.c(obj10)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj10).toString());
                    }
                    i++;
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            default:
                w0.s sVar2 = (w0.s) this.f1351e;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = sVar2.f7560b;
                while (true) {
                    Object obj11 = atomicReference.get();
                    if (obj11 == null) {
                        b02 = collection;
                    } else if (obj11 instanceof Set) {
                        b02 = s6.a.y(obj11, collection);
                    } else {
                        if (!(obj11 instanceof List)) {
                            m0.t.d("Unexpected notification");
                            throw new a5.c();
                        }
                        b02 = d6.m.b0((Collection) obj11, s6.a.x(collection));
                    }
                    while (!atomicReference.compareAndSet(obj11, b02)) {
                        if (atomicReference.get() != obj11) {
                            break;
                        }
                    }
                    if (sVar2.a()) {
                        sVar2.f7559a.i(new androidx.lifecycle.m0(17, sVar2));
                    }
                    return c6.m.f1757a;
                    break;
                }
        }
    }

    public /* synthetic */ j0(int i, Object obj) {
        this.f1350d = i;
        this.f1351e = obj;
    }
}
