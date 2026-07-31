package I4;

import X5.q;
import X5.u;
import n6.o;
import n6.p;

/* loaded from: classes.dex */
public final class d extends u {

    /* renamed from: a, reason: collision with root package name */
    public final D4.f f1206a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1207b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1208c;

    public d(D4.f fVar, int i7, q qVar) {
        this.f1206a = fVar;
        this.f1207b = i7;
        this.f1208c = qVar;
    }

    @Override // X5.u
    public final long a() {
        return this.f1207b;
    }

    @Override // X5.u
    public final q b() {
        return this.f1208c;
    }

    @Override // X5.u
    public final void c(p pVar) {
        this.f1206a.b(new o(pVar));
    }
}
