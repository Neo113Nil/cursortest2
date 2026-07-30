package p5;

import D6.A;
import D6.u;
import P.o0;
import T6.p;
import k5.AbstractC0605e;

/* loaded from: classes.dex */
public final class c extends A {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0605e f7201a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7202b;

    /* renamed from: c, reason: collision with root package name */
    public final u f7203c;

    public c(AbstractC0605e abstractC0605e, int i2, u uVar) {
        this.f7201a = abstractC0605e;
        this.f7202b = i2;
        this.f7203c = uVar;
    }

    @Override // D6.A
    public final long a() {
        return this.f7202b;
    }

    @Override // D6.A
    public final u b() {
        return this.f7203c;
    }

    @Override // D6.A
    public final void c(p pVar) {
        this.f7201a.b(new o0(pVar));
    }
}
