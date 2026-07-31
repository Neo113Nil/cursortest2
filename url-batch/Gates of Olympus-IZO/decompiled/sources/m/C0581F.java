package m;

/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581F extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ float f5576e;

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0581F c0581f = new C0581F(2, dVar);
        c0581f.f5576e = ((Number) obj).floatValue();
        return c0581f;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0581F) create(Float.valueOf(((Number) obj).floatValue()), (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        return Boolean.valueOf(this.f5576e > 0.0f);
    }
}
