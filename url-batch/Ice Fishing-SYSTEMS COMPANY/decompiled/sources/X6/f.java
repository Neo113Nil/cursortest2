package X6;

import c6.C0542a;
import g6.C4531a;
import l7.C4707a;

/* loaded from: classes2.dex */
public final class f extends o {

    /* renamed from: j, reason: collision with root package name */
    public final Object f3849j;

    /* renamed from: k, reason: collision with root package name */
    public final W6.f f3850k;

    public f(C4707a c4707a, U6.a aVar, long j9, long j10, C4531a c4531a, h6.i iVar, b6.f fVar, W6.f fVar2) {
        super(c4707a, aVar, j9, j10, c4531a, iVar, fVar, null);
        this.f3849j = new Object();
        this.f3850k = fVar2;
    }

    @Override // X6.o
    public final Y6.a b() {
        C0542a i;
        a aVar;
        synchronized (this.f3849j) {
            C4707a c4707a = this.f3876a;
            U6.a aVar2 = this.f3877b;
            long j9 = this.f3878c;
            long j10 = this.f3879d;
            C4531a c4531a = this.f3880e;
            h6.i iVar = this.f3881f;
            b6.f fVar = this.f3882g;
            synchronized (this.f3849j) {
                try {
                    W6.f fVar2 = this.f3850k;
                    i = fVar2 == null ? C0542a.f5712x : fVar2.i();
                } finally {
                }
            }
            C0542a c0542a = i;
            W6.f fVar3 = this.f3850k;
            aVar = new a(c4707a, aVar2, j9, j10, c4531a, iVar, fVar3 == null ? 0 : fVar3.f3472v, c0542a, fVar);
        }
        return aVar;
    }
}
