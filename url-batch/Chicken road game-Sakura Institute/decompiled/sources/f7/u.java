package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f3561g;

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        u uVar = new u(2, dVar);
        uVar.f3561g = ((Number) obj).intValue();
        return uVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((u) create(Integer.valueOf(((Number) obj).intValue()), (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        d6.a.e(obj);
        return Boolean.valueOf(this.f3561g > 0);
    }
}
