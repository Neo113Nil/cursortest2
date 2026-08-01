package ie;

import ge.a0;
import ge.b2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.i0;
import le.s;
import le.t;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements b2 {

    /* renamed from: d, reason: collision with root package name */
    public Object f4716d = e.f4743p;

    /* renamed from: e, reason: collision with root package name */
    public ge.h f4717e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f4718i;

    public b(c cVar) {
        this.f4718i = cVar;
    }

    @Override // ge.b2
    public final void a(s sVar, int i3) {
        ge.h hVar = this.f4717e;
        if (hVar != null) {
            hVar.a(sVar, i3);
        }
    }

    public final Object b(nd.c cVar) {
        k kVar;
        Object obj = this.f4716d;
        boolean z10 = true;
        if (obj == e.f4743p || obj == e.f4739l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f4724u;
            c cVar2 = this.f4718i;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar2);
            while (true) {
                cVar2.getClass();
                if (cVar2.s(true, c.f4719e.get(cVar2))) {
                    this.f4716d = e.f4739l;
                    Throwable n10 = cVar2.n();
                    if (n10 != null) {
                        int i3 = t.f6000a;
                        throw n10;
                    }
                    z10 = false;
                } else {
                    long andIncrement = c.f4720i.getAndIncrement(cVar2);
                    long j = e.f4731b;
                    long j3 = andIncrement / j;
                    int i10 = (int) (andIncrement % j);
                    if (kVar2.f5999c != j3) {
                        kVar = cVar2.m(j3, kVar2);
                        if (kVar == null) {
                            continue;
                        }
                    } else {
                        kVar = kVar2;
                    }
                    Object B = cVar2.B(kVar, i10, andIncrement, null);
                    a8.f fVar = e.f4740m;
                    if (B == fVar) {
                        i0.l("unreachable");
                        return null;
                    }
                    a8.f fVar2 = e.f4742o;
                    if (B == fVar2) {
                        if (andIncrement < cVar2.q()) {
                            kVar.a();
                        }
                        kVar2 = kVar;
                    } else {
                        if (B == e.f4741n) {
                            c cVar3 = this.f4718i;
                            ge.h n11 = a0.n(md.f.b(cVar));
                            try {
                                this.f4717e = n11;
                                Object B2 = cVar3.B(kVar, i10, andIncrement, this);
                                if (B2 == fVar) {
                                    a(kVar, i10);
                                } else {
                                    if (B2 == fVar2) {
                                        if (andIncrement < cVar3.q()) {
                                            kVar.a();
                                        }
                                        k kVar3 = (k) c.f4724u.get(cVar3);
                                        while (true) {
                                            if (cVar3.s(true, c.f4719e.get(cVar3))) {
                                                ge.h hVar = this.f4717e;
                                                hVar.getClass();
                                                this.f4717e = null;
                                                this.f4716d = e.f4739l;
                                                Throwable n12 = cVar2.n();
                                                if (n12 == null) {
                                                    hd.l lVar = hd.n.f4511e;
                                                    hVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    hd.l lVar2 = hd.n.f4511e;
                                                    hVar.resumeWith(new hd.m(n12));
                                                }
                                            } else {
                                                long andIncrement2 = c.f4720i.getAndIncrement(cVar3);
                                                long j10 = e.f4731b;
                                                long j11 = andIncrement2 / j10;
                                                int i11 = (int) (andIncrement2 % j10);
                                                if (kVar3.f5999c != j11) {
                                                    k m10 = cVar3.m(j11, kVar3);
                                                    if (m10 != null) {
                                                        kVar3 = m10;
                                                    }
                                                }
                                                Object B3 = cVar3.B(kVar3, i11, andIncrement2, this);
                                                if (B3 == e.f4740m) {
                                                    a(kVar3, i11);
                                                    break;
                                                }
                                                if (B3 == e.f4742o) {
                                                    if (andIncrement2 < cVar3.q()) {
                                                        kVar3.a();
                                                    }
                                                } else {
                                                    if (B3 == e.f4741n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kVar3.a();
                                                    this.f4716d = B3;
                                                    this.f4717e = null;
                                                }
                                            }
                                        }
                                    } else {
                                        kVar.a();
                                        this.f4716d = B2;
                                        this.f4717e = null;
                                    }
                                    n11.e(Boolean.TRUE, null);
                                }
                                Object r9 = n11.r();
                                md.a aVar = md.a.f6622d;
                                return r9;
                            } catch (Throwable th) {
                                n11.z();
                                throw th;
                            }
                        }
                        kVar.a();
                        this.f4716d = B;
                    }
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    public final Object c() {
        Object obj = this.f4716d;
        a8.f fVar = e.f4743p;
        if (obj == fVar) {
            i0.l("`hasNext()` has not been invoked");
            return null;
        }
        this.f4716d = fVar;
        if (obj != e.f4739l) {
            return obj;
        }
        Throwable o6 = this.f4718i.o();
        int i3 = t.f6000a;
        throw o6;
    }
}
