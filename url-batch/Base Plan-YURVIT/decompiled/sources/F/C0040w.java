package F;

import a.AbstractC0086a;

/* renamed from: F.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040w extends I0.g implements O0.l {

    /* renamed from: i, reason: collision with root package name */
    public int f439i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H f440j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040w(H h2, G0.d dVar) {
        super(1, dVar);
        this.f440j = h2;
    }

    @Override // O0.l
    public final Object j(Object obj) {
        return new C0040w(this.f440j, (G0.d) obj).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f439i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
            return obj;
        }
        AbstractC0086a.I(obj);
        this.f439i = 1;
        Object j2 = this.f440j.j(this);
        H0.a aVar = H0.a.f511e;
        return j2 == aVar ? aVar : j2;
    }
}
