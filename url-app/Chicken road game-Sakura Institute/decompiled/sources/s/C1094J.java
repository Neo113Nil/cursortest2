package s;

import B1.C0097d;
import android.os.Trace;
import j2.C0716f;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l0.C0814l;
import p0.C0963Y;
import p0.InterfaceC0961W;

/* renamed from: s.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1094J implements y {

    /* renamed from: a, reason: collision with root package name */
    public final int f9899a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9900b;

    /* renamed from: c, reason: collision with root package name */
    public final C1095K f9901c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0961W f9902d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9903e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9904f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9905g;

    /* renamed from: h, reason: collision with root package name */
    public Q.m f9906h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9907i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0097d f9908j;

    public C1094J(C0097d c0097d, int i2, long j4, C1095K c1095k) {
        this.f9908j = c0097d;
        this.f9899a = i2;
        this.f9900b = j4;
        this.f9901c = c1095k;
    }

    @Override // s.y
    public final void a() {
        this.f9907i = true;
    }

    public final boolean b(C0716f c0716f) {
        Q.m mVar;
        if (!c()) {
            return false;
        }
        Object b4 = ((r.h) ((C1113q) this.f9908j.f987e).f9955b.invoke()).b(this.f9899a);
        boolean z4 = this.f9902d != null;
        C1095K c1095k = this.f9901c;
        if (!z4) {
            long c4 = (b4 == null || c1095k.f9909a.b(b4) < 0) ? c1095k.f9911c : c1095k.f9909a.c(b4);
            long a4 = c0716f.a();
            if ((!this.f9907i || a4 <= 0) && c4 >= a4) {
                return true;
            }
            long nanoTime = System.nanoTime();
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                d();
                Unit unit = Unit.f7487a;
                Trace.endSection();
                long nanoTime2 = System.nanoTime() - nanoTime;
                if (b4 != null) {
                    i.x xVar = c1095k.f9909a;
                    int b5 = xVar.b(b4);
                    c1095k.f9909a.e(C1095K.a(c1095k, nanoTime2, b5 >= 0 ? xVar.f6978c[b5] : 0L), b4);
                }
                c1095k.f9911c = C1095K.a(c1095k, nanoTime2, c1095k.f9911c);
            } finally {
            }
        }
        if (!this.f9907i) {
            if (!this.f9905g) {
                if (c0716f.a() <= 0) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    InterfaceC0961W interfaceC0961W = this.f9902d;
                    if (interfaceC0961W == null) {
                        throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                    }
                    M2.E e4 = new M2.E();
                    interfaceC0961W.b(new C0814l(e4, 5));
                    List list = (List) e4.f3580d;
                    if (list != null) {
                        mVar = new Q.m();
                        mVar.f3862e = this;
                        mVar.f3860c = list;
                        mVar.f3861d = new List[list.size()];
                        if (list.isEmpty()) {
                            throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                        }
                    } else {
                        mVar = null;
                    }
                    this.f9906h = mVar;
                    this.f9905g = true;
                    Unit unit2 = Unit.f7487a;
                } finally {
                }
            }
            Q.m mVar2 = this.f9906h;
            if (mVar2 != null) {
                List[] listArr = (List[]) mVar2.f3861d;
                int i2 = mVar2.f3858a;
                List list2 = (List) mVar2.f3860c;
                if (i2 < list2.size()) {
                    if (((C1094J) mVar2.f3862e).f9904f) {
                        throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (mVar2.f3858a < list2.size()) {
                        try {
                            if (listArr[mVar2.f3858a] == null) {
                                if (c0716f.a() <= 0) {
                                    return true;
                                }
                                int i4 = mVar2.f3858a;
                                z zVar = (z) list2.get(i4);
                                Q.u uVar = zVar.f9978a;
                                x xVar2 = new x(zVar);
                                uVar.invoke(xVar2);
                                listArr[i4] = xVar2.f9976a;
                            }
                            List list3 = listArr[mVar2.f3858a];
                            Intrinsics.c(list3);
                            while (mVar2.f3859b < list3.size()) {
                                if (((C1094J) list3.get(mVar2.f3859b)).b(c0716f)) {
                                    return true;
                                }
                                mVar2.f3859b++;
                            }
                            mVar2.f3859b = 0;
                            mVar2.f3858a++;
                        } finally {
                        }
                    }
                    Unit unit3 = Unit.f7487a;
                }
            }
        }
        if (!this.f9903e) {
            long j4 = this.f9900b;
            int i5 = (int) (3 & j4);
            int i6 = (((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1);
            if ((((int) (j4 >> 33)) & ((1 << (i6 + 13)) - 1)) - 1 != 0) {
                if ((((1 << (18 - i6)) - 1) & ((int) (j4 >> (i6 + 46)))) - 1 != 0) {
                    long c5 = (b4 == null || c1095k.f9910b.b(b4) < 0) ? c1095k.f9912d : c1095k.f9910b.c(b4);
                    long a5 = c0716f.a();
                    if ((!this.f9907i || a5 <= 0) && c5 >= a5) {
                        return true;
                    }
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        e(j4);
                        Unit unit4 = Unit.f7487a;
                        Trace.endSection();
                        long nanoTime4 = System.nanoTime() - nanoTime3;
                        if (b4 != null) {
                            i.x xVar3 = c1095k.f9910b;
                            int b6 = xVar3.b(b4);
                            c1095k.f9910b.e(C1095K.a(c1095k, nanoTime4, b6 >= 0 ? xVar3.f6978c[b6] : 0L), b4);
                        }
                        c1095k.f9912d = C1095K.a(c1095k, nanoTime4, c1095k.f9912d);
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (!this.f9904f) {
            int c4 = ((r.h) ((C1113q) this.f9908j.f987e).f9955b.invoke()).c();
            int i2 = this.f9899a;
            if (i2 >= 0 && i2 < c4) {
                return true;
            }
        }
        return false;
    }

    @Override // s.y
    public final void cancel() {
        if (this.f9904f) {
            return;
        }
        this.f9904f = true;
        InterfaceC0961W interfaceC0961W = this.f9902d;
        if (interfaceC0961W != null) {
            interfaceC0961W.a();
        }
        this.f9902d = null;
    }

    public final void d() {
        if (!c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if (this.f9902d != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        C0097d c0097d = this.f9908j;
        r.h hVar = (r.h) ((C1113q) c0097d.f987e).f9955b.invoke();
        int i2 = this.f9899a;
        Object d4 = hVar.d(i2);
        this.f9902d = ((C0963Y) c0097d.f988i).a().g(d4, ((C1113q) c0097d.f987e).a(d4, i2, hVar.b(i2)));
    }

    public final void e(long j4) {
        if (this.f9904f) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f9903e) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.f9903e = true;
        InterfaceC0961W interfaceC0961W = this.f9902d;
        if (interfaceC0961W == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int d4 = interfaceC0961W.d();
        for (int i2 = 0; i2 < d4; i2++) {
            interfaceC0961W.c(j4, i2);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f9899a);
        sb.append(", constraints = ");
        sb.append((Object) M0.a.l(this.f9900b));
        sb.append(", isComposed = ");
        sb.append(this.f9902d != null);
        sb.append(", isMeasured = ");
        sb.append(this.f9903e);
        sb.append(", isCanceled = ");
        sb.append(this.f9904f);
        sb.append(" }");
        return sb.toString();
    }
}
