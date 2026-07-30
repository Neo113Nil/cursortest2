package O6;

import X.m;
import e8.q;
import e8.u;
import u8.p;

/* loaded from: classes2.dex */
public final class d extends u {

    /* renamed from: a, reason: collision with root package name */
    public final J6.f f2532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2533b;

    /* renamed from: c, reason: collision with root package name */
    public final q f2534c;

    public d(J6.f fVar, int i, q qVar) {
        this.f2532a = fVar;
        this.f2533b = i;
        this.f2534c = qVar;
    }

    @Override // e8.u
    public final long a() {
        return this.f2533b;
    }

    @Override // e8.u
    public final q b() {
        return this.f2534c;
    }

    @Override // e8.u
    public final void c(p pVar) {
        this.f2532a.b(new m(pVar));
    }
}
