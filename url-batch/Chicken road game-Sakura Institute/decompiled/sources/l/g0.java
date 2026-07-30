package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ float f5492g;

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        g0 g0Var = new g0(2, dVar);
        g0Var.f5492g = ((Number) obj).floatValue();
        return g0Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((g0) create(Float.valueOf(((Number) obj).floatValue()), (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        d6.a.e(obj);
        return Boolean.valueOf(this.f5492g > 0.0f);
    }
}
