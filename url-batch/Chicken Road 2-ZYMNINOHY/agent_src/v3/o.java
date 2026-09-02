package v3;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements j, d {

    /* renamed from: a, reason: collision with root package name */
    public final j f15720a;

    public o(j jVar) {
        this.f15720a = jVar;
    }

    @Override // v3.d
    public final j a(int i4) {
        return i4 >= 10 ? e.f15700a : new n(this.f15720a, i4, 10);
    }

    @Override // v3.j
    public final Iterator iterator() {
        return new C1480b(this);
    }

    @Override // v3.d
    public final j take() {
        return this;
    }
}
