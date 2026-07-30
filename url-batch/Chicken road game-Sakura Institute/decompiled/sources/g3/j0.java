package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 extends j6.i implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public int f4157g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ i3.c f4158h;

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        j0 j0Var = new j0(3, (h6.d) obj3);
        j0Var.f4158h = (i3.c) obj;
        return j0Var.invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f4157g;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
            return obj;
        }
        d6.a.e(obj);
        i3.c cVar = this.f4158h;
        this.f4157g = 1;
        cVar.getClass();
        Object a3 = i3.c.a(cVar, this);
        i6.a aVar = i6.a.f4956f;
        return a3 == aVar ? aVar : a3;
    }
}
