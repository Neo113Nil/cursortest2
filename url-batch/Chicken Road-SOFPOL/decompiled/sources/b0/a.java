package b0;

import a0.b1;
import a0.g0;
import a0.h;
import a0.h0;
import a0.j;
import a0.l;
import a0.q;
import a4.i;
import c6.m;
import d6.u;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import m0.e0;
import m0.e2;
import m0.i2;
import m0.s;
import m0.y0;
import m0.z0;
import n0.k0;
import o.d0;
import o.o0;
import o.x;
import r2.k;
import r2.r;
import u.g;
import u.l1;
import w1.d1;
import z.p;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1029g;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.f1026d = i;
        this.f1027e = obj;
        this.f1028f = obj2;
        this.f1029g = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x015e, code lost:
    
        if (r0.f6992w == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0160, code lost:
    
        r4 = r0.s0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0165, code lost:
    
        if (r4 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016d, code lost:
    
        if (r0.t0(r4, r0.f6994y) != true) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0171, code lost:
    
        if (r8 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0173, code lost:
    
        r0.f6992w = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0170, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0175, code lost:
    
        r2.f7045e = u.g.r0(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017b, code lost:
    
        return r7;
     */
    @Override // p6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        List list;
        int i;
        switch (this.f1026d) {
            case 0:
                f fVar = (f) this.f1027e;
                e1.c r02 = f.r0(fVar, (d1) this.f1028f, (a2.b) this.f1029g);
                if (r02 == null) {
                    return null;
                }
                g gVar = fVar.f1044r;
                if (k.a(gVar.f6994y, 0L)) {
                    w.a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return r02.e(gVar.v0(r02, gVar.f6994y) ^ (-9223372034707292160L));
            case 1:
                z0 z0Var = (z0) this.f1027e;
                z0 z0Var2 = (z0) this.f1028f;
                z0 z0Var3 = (z0) this.f1029g;
                Boolean bool = Boolean.FALSE;
                z0Var.setValue(bool);
                z0Var2.setValue(bool);
                z0Var3.setValue(null);
                return m.f1757a;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                s sVar = (s) this.f1027e;
                n0.a aVar = (n0.a) this.f1028f;
                e2 e2Var = (e2) this.f1029g;
                n0.b bVar = sVar.M;
                n0.a aVar2 = bVar.f5248b;
                try {
                    bVar.f5248b = aVar;
                    e2 e2Var2 = sVar.G;
                    int[] iArr = sVar.f5086o;
                    x xVar = sVar.f5093v;
                    sVar.f5086o = null;
                    sVar.f5093v = null;
                    try {
                        sVar.G = e2Var;
                        boolean z3 = bVar.f5251e;
                        try {
                            bVar.f5251e = false;
                            throw null;
                        } catch (Throwable th) {
                            bVar.f5251e = z3;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        sVar.G = e2Var2;
                        sVar.f5086o = iArr;
                        sVar.f5093v = xVar;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bVar.f5248b = aVar2;
                    throw th3;
                }
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                m0.a aVar3 = (m0.a) this.f1027e;
                i2 i2Var = (i2) this.f1028f;
                k0 k0Var = (k0) this.f1029g;
                if (aVar3 != null) {
                    i2Var.a(i2Var.c(aVar3) - i2Var.f4970t);
                }
                List j7 = r.j(i2Var, null, i2Var.f4970t, null);
                x0.a aVar4 = (x0.a) d6.m.Y(j7);
                Integer num = aVar4 != null ? aVar4.f8315a : null;
                List e8 = k0Var.e(num);
                if (num != null && !e8.isEmpty()) {
                    x0.a aVar5 = (x0.a) d6.m.R(e8);
                    int size = e8.size() - 1;
                    if (size <= 0) {
                        list = u.f2326d;
                    } else if (size == 1) {
                        list = s6.a.x(d6.m.X(e8));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (e8 instanceof RandomAccess) {
                            int size2 = e8.size();
                            for (int i8 = 1; i8 < size2; i8++) {
                                arrayList.add(e8.get(i8));
                            }
                        } else {
                            ListIterator listIterator = e8.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        list = arrayList;
                    }
                    aVar5.getClass();
                    e8 = d6.m.b0(s6.a.x(new x0.a(null, num)), list);
                }
                return d6.m.b0(j7, e8);
            case i.LONG_FIELD_NUMBER /* 4 */:
                g gVar2 = (g) this.f1027e;
                l1 l1Var = (l1) this.f1028f;
                u.c cVar = (u.c) this.f1029g;
                l lVar = gVar2.f6990u;
                while (true) {
                    o0.e eVar = lVar.f112a;
                    int i9 = eVar.f5580f;
                    m mVar = m.f1757a;
                    boolean z7 = true;
                    if (i9 == 0) {
                        break;
                    } else {
                        if (i9 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        e1.c cVar2 = (e1.c) ((u.f) eVar.f5578d[i9 - 1]).f6974a.b();
                        if (!(cVar2 == null ? true : gVar2.t0(cVar2, gVar2.f6994y))) {
                            break;
                        } else {
                            o0.e eVar2 = lVar.f112a;
                            ((u.f) eVar2.k(eVar2.f5580f - 1)).f6975b.k(mVar);
                        }
                    }
                }
            default:
                e0 e0Var = (e0) this.f1027e;
                p pVar = (p) this.f1028f;
                z.c cVar3 = (z.c) this.f1029g;
                z.f fVar2 = (z.f) e0Var.getValue();
                v6.d dVar = (v6.d) ((h0) pVar.f9081e.f3286e).getValue();
                b1 b1Var = new b1();
                b1 b1Var2 = fVar2.f9015a;
                int i10 = dVar.f7492d;
                if (i10 < 0) {
                    w.a.c("negative nearestRange.first");
                }
                int min = Math.min(dVar.f7493e, b1Var2.f22a - 1);
                if (min < i10) {
                    d0 d0Var = o0.f5516a;
                    q6.i.c(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                    b1Var.f23b = d0Var;
                    b1Var.f24c = new Object[0];
                    b1Var.f22a = 0;
                } else {
                    int i11 = (min - i10) + 1;
                    b1Var.f24c = new Object[i11];
                    b1Var.f22a = i10;
                    d0 d0Var2 = new d0(i11);
                    o0.e eVar3 = (o0.e) b1Var2.f23b;
                    if (i10 < 0 || i10 >= b1Var2.f22a) {
                        StringBuilder l3 = q.l("Index ", i10, ", size ");
                        l3.append(b1Var2.f22a);
                        w.a.d(l3.toString());
                    }
                    if (min < 0 || min >= b1Var2.f22a) {
                        StringBuilder l7 = q.l("Index ", min, ", size ");
                        l7.append(b1Var2.f22a);
                        w.a.d(l7.toString());
                    }
                    if (min < i10) {
                        w.a.a("toIndex (" + min + ") should be not smaller than fromIndex (" + i10 + ')');
                    }
                    int e9 = g0.e(i10, eVar3);
                    int i12 = ((j) eVar3.f5578d[e9]).f98a;
                    while (i12 <= min) {
                        j jVar = (j) eVar3.f5578d[e9];
                        x4.e eVar4 = jVar.f100c;
                        int max = Math.max(i10, jVar.f98a);
                        int min2 = Math.min(min, (r12 + jVar.f99b) - 1);
                        if (max <= min2) {
                            while (true) {
                                h hVar = new h(max);
                                d0Var2.h(max, hVar);
                                i = min;
                                ((Object[]) b1Var.f24c)[max - b1Var.f22a] = hVar;
                                if (max != min2) {
                                    max++;
                                    min = i;
                                }
                            }
                        } else {
                            i = min;
                        }
                        i12 += jVar.f99b;
                        e9++;
                        min = i;
                    }
                    b1Var.f23b = d0Var2;
                }
                return new z.h(pVar, fVar2, cVar3, b1Var);
        }
    }

    public /* synthetic */ a(s sVar, n0.a aVar, e2 e2Var, y0 y0Var) {
        this.f1026d = 2;
        this.f1027e = sVar;
        this.f1028f = aVar;
        this.f1029g = e2Var;
    }
}
