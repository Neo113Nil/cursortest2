package t;

import android.os.Trace;
import j.C0549w;
import java.util.List;
import n0.C0714l;
import r0.C0901X;
import r0.InterfaceC0899V;
import s.C0939h;

/* loaded from: classes.dex */
public final class J implements z {

    /* renamed from: d, reason: collision with root package name */
    public final int f8445d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8446e;

    /* renamed from: f, reason: collision with root package name */
    public final K f8447f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0899V f8448g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8449h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8450i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8451j;

    /* renamed from: k, reason: collision with root package name */
    public S.l f8452k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8453l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G1.m f8454m;

    public J(G1.m mVar, int i3, long j3, K k3) {
        this.f8454m = mVar;
        this.f8445d = i3;
        this.f8446e = j3;
        this.f8447f = k3;
    }

    @Override // t.z
    public final void a() {
        this.f8453l = true;
    }

    public final boolean b(C0973a c0973a) {
        S.l lVar;
        if (!c()) {
            return false;
        }
        Object b3 = ((C0939h) ((r) this.f8454m.f2116b).f8503b.b()).b(this.f8445d);
        boolean z3 = this.f8448g != null;
        K k3 = this.f8447f;
        if (!z3) {
            long c2 = (b3 == null || k3.f8455a.b(b3) < 0) ? k3.f8457c : k3.f8455a.c(b3);
            long a3 = c0973a.a();
            if ((!this.f8453l || a3 <= 0) && c2 >= a3) {
                return true;
            }
            long nanoTime = System.nanoTime();
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                d();
                Trace.endSection();
                long nanoTime2 = System.nanoTime() - nanoTime;
                if (b3 != null) {
                    C0549w c0549w = k3.f8455a;
                    int b4 = c0549w.b(b3);
                    k3.f8455a.e(K.a(k3, nanoTime2, b4 >= 0 ? c0549w.f6340c[b4] : 0L), b3);
                }
                k3.f8457c = K.a(k3, nanoTime2, k3.f8457c);
            } finally {
            }
        }
        if (!this.f8453l) {
            if (!this.f8451j) {
                if (c0973a.a() <= 0) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    InterfaceC0899V interfaceC0899V = this.f8448g;
                    if (interfaceC0899V == null) {
                        throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                    }
                    f2.u uVar = new f2.u();
                    interfaceC0899V.b(new C0714l(uVar, 3));
                    List list = (List) uVar.f5832d;
                    if (list != null) {
                        lVar = new S.l();
                        lVar.f4225e = this;
                        lVar.f4223c = list;
                        lVar.f4224d = new List[list.size()];
                        if (list.isEmpty()) {
                            throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                        }
                    } else {
                        lVar = null;
                    }
                    this.f8452k = lVar;
                    this.f8451j = true;
                } finally {
                }
            }
            S.l lVar2 = this.f8452k;
            if (lVar2 != null) {
                List[] listArr = (List[]) lVar2.f4224d;
                int i3 = lVar2.f4221a;
                List list2 = (List) lVar2.f4223c;
                if (i3 < list2.size()) {
                    if (((J) lVar2.f4225e).f8450i) {
                        throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (lVar2.f4221a < list2.size()) {
                        try {
                            if (listArr[lVar2.f4221a] == null) {
                                if (c0973a.a() <= 0) {
                                    return true;
                                }
                                int i4 = lVar2.f4221a;
                                C0971A c0971a = (C0971A) list2.get(i4);
                                S.s sVar = c0971a.f8419a;
                                y yVar = new y(c0971a);
                                sVar.n(yVar);
                                listArr[i4] = yVar.f8524a;
                            }
                            List list3 = listArr[lVar2.f4221a];
                            f2.j.c(list3);
                            while (lVar2.f4222b < list3.size()) {
                                if (((J) list3.get(lVar2.f4222b)).b(c0973a)) {
                                    return true;
                                }
                                lVar2.f4222b++;
                            }
                            lVar2.f4222b = 0;
                            lVar2.f4221a++;
                        } finally {
                        }
                    }
                }
            }
        }
        if (!this.f8449h) {
            long j3 = this.f8446e;
            int i5 = (int) (3 & j3);
            int i6 = (((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1);
            if ((((int) (j3 >> 33)) & ((1 << (i6 + 13)) - 1)) - 1 != 0) {
                if ((((1 << (18 - i6)) - 1) & ((int) (j3 >> (i6 + 46)))) - 1 != 0) {
                    long c3 = (b3 == null || k3.f8456b.b(b3) < 0) ? k3.f8458d : k3.f8456b.c(b3);
                    long a4 = c0973a.a();
                    if ((!this.f8453l || a4 <= 0) && c3 >= a4) {
                        return true;
                    }
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        e(j3);
                        Trace.endSection();
                        long nanoTime4 = System.nanoTime() - nanoTime3;
                        if (b3 != null) {
                            C0549w c0549w2 = k3.f8456b;
                            int b5 = c0549w2.b(b3);
                            k3.f8456b.e(K.a(k3, nanoTime4, b5 >= 0 ? c0549w2.f6340c[b5] : 0L), b3);
                        }
                        k3.f8458d = K.a(k3, nanoTime4, k3.f8458d);
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (!this.f8450i) {
            int c2 = ((C0939h) ((r) this.f8454m.f2116b).f8503b.b()).c();
            int i3 = this.f8445d;
            if (i3 >= 0 && i3 < c2) {
                return true;
            }
        }
        return false;
    }

    @Override // t.z
    public final void cancel() {
        if (this.f8450i) {
            return;
        }
        this.f8450i = true;
        InterfaceC0899V interfaceC0899V = this.f8448g;
        if (interfaceC0899V != null) {
            interfaceC0899V.a();
        }
        this.f8448g = null;
    }

    public final void d() {
        if (!c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if (this.f8448g != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        G1.m mVar = this.f8454m;
        C0939h c0939h = (C0939h) ((r) mVar.f2116b).f8503b.b();
        int i3 = this.f8445d;
        Object d3 = c0939h.d(i3);
        this.f8448g = ((C0901X) mVar.f2117c).a().g(d3, ((r) mVar.f2116b).a(d3, i3, c0939h.b(i3)));
    }

    public final void e(long j3) {
        if (this.f8450i) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f8449h) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.f8449h = true;
        InterfaceC0899V interfaceC0899V = this.f8448g;
        if (interfaceC0899V == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int d3 = interfaceC0899V.d();
        for (int i3 = 0; i3 < d3; i3++) {
            interfaceC0899V.c(j3, i3);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f8445d);
        sb.append(", constraints = ");
        sb.append((Object) O0.a.k(this.f8446e));
        sb.append(", isComposed = ");
        sb.append(this.f8448g != null);
        sb.append(", isMeasured = ");
        sb.append(this.f8449h);
        sb.append(", isCanceled = ");
        sb.append(this.f8450i);
        sb.append(" }");
        return sb.toString();
    }
}
