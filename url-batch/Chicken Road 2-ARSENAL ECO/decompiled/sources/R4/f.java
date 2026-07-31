package R4;

import d4.InterfaceC0326h;
import f5.C0387a;

/* loaded from: classes.dex */
public final class f extends o {

    /* renamed from: j, reason: collision with root package name */
    public final Object f2105j;

    /* renamed from: k, reason: collision with root package name */
    public final Q4.g f2106k;

    public f(C0387a c0387a, O4.a aVar, long j4, long j7, InterfaceC0326h interfaceC0326h, b4.i iVar, V3.f fVar, Q4.g gVar) {
        super(c0387a, aVar, j4, j7, interfaceC0326h, iVar, fVar, null);
        this.f2105j = new Object();
        this.f2106k = gVar;
    }

    @Override // R4.o
    public final S4.a b() {
        W3.a a7;
        a aVar;
        synchronized (this.f2105j) {
            C0387a c0387a = this.f2132a;
            O4.a aVar2 = this.f2133b;
            long j4 = this.f2134c;
            long j7 = this.f2135d;
            InterfaceC0326h interfaceC0326h = this.f2136e;
            b4.i iVar = this.f2137f;
            V3.g gVar = this.f2138g;
            synchronized (this.f2105j) {
                try {
                    Q4.g gVar2 = this.f2106k;
                    a7 = gVar2 == null ? W3.a.f2800j : gVar2.a();
                } finally {
                }
            }
            W3.a aVar3 = a7;
            Q4.g gVar3 = this.f2106k;
            aVar = new a(c0387a, aVar2, j4, j7, interfaceC0326h, iVar, gVar3 == null ? 0 : gVar3.f2022h, aVar3, gVar);
        }
        return aVar;
    }
}
