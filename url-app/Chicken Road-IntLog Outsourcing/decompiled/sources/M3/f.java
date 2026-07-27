package M3;

import a4.AbstractC0197c;

/* loaded from: classes.dex */
public final class f extends p {

    /* renamed from: j, reason: collision with root package name */
    public final Object f1958j;

    /* renamed from: k, reason: collision with root package name */
    public final L3.g f1959k;

    public f(AbstractC0197c abstractC0197c, J3.a aVar, long j2, long j6, V2.a aVar2, W2.i iVar, Q2.f fVar, L3.g gVar) {
        super(abstractC0197c, aVar, j2, j6, aVar2, iVar, fVar, null);
        this.f1958j = new Object();
        this.f1959k = gVar;
    }

    @Override // M3.p
    public final N3.a b() {
        R2.a a6;
        a aVar;
        synchronized (this.f1958j) {
            AbstractC0197c abstractC0197c = this.f1986a;
            J3.a aVar2 = this.f1987b;
            long j2 = this.f1988c;
            long j6 = this.f1989d;
            V2.a aVar3 = this.f1990e;
            W2.i iVar = this.f1991f;
            Q2.f fVar = this.f1992g;
            synchronized (this.f1958j) {
                try {
                    L3.g gVar = this.f1959k;
                    a6 = gVar == null ? R2.a.f2620e : gVar.a();
                } finally {
                }
            }
            R2.a aVar4 = a6;
            L3.g gVar2 = this.f1959k;
            aVar = new a(abstractC0197c, aVar2, j2, j6, aVar3, iVar, gVar2 == null ? 0 : gVar2.f1498c, aVar4, fVar);
        }
        return aVar;
    }
}
