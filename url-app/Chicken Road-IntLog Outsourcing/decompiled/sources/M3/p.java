package M3;

import a4.AbstractC0197c;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0197c f1986a;

    /* renamed from: b, reason: collision with root package name */
    public final J3.a f1987b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1988c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1989d;

    /* renamed from: e, reason: collision with root package name */
    public final V2.a f1990e;

    /* renamed from: f, reason: collision with root package name */
    public final W2.i f1991f;

    /* renamed from: g, reason: collision with root package name */
    public final Q2.f f1992g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1993h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final L3.b f1994i;

    public p(AbstractC0197c abstractC0197c, J3.a aVar, long j2, long j6, V2.a aVar2, W2.i iVar, Q2.f fVar, L3.b bVar) {
        this.f1986a = abstractC0197c;
        this.f1987b = aVar;
        this.f1988c = j2;
        this.f1989d = j6;
        this.f1990e = aVar2;
        this.f1991f = iVar;
        this.f1992g = fVar;
        this.f1994i = bVar;
    }

    public final Q2.a a() {
        synchronized (this.f1993h) {
            try {
                L3.b bVar = this.f1994i;
                if (bVar != null && !bVar.isEmpty()) {
                    L3.b bVar2 = this.f1994i;
                    bVar2.getClass();
                    L3.j jVar = new L3.j(1);
                    jVar.g(bVar2);
                    return jVar.b();
                }
                return Q2.a.f2475d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public N3.a b() {
        c cVar;
        synchronized (this.f1993h) {
            AbstractC0197c abstractC0197c = this.f1986a;
            J3.a aVar = this.f1987b;
            long j2 = this.f1988c;
            long j6 = this.f1989d;
            V2.a aVar2 = this.f1990e;
            W2.i iVar = this.f1991f;
            Q2.f fVar = this.f1992g;
            Q2.a a6 = a();
            L3.b bVar = this.f1994i;
            cVar = new c(abstractC0197c, aVar, j2, j6, aVar2, iVar, a6, bVar == null ? 0 : bVar.f1488c, fVar);
        }
        return cVar;
    }
}
