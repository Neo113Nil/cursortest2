package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m1 extends j6.h implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f6695g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6696h;

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        m1 m1Var = new m1(2, dVar);
        m1Var.f6696h = obj;
        return m1Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((m1) create((l1.c0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f6695g;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
            return obj;
        }
        d6.a.e(obj);
        l1.c0 c0Var = (l1.c0) this.f6696h;
        this.f6695g = 1;
        Object d8 = p1.d(c0Var, l1.k.f5816g, this);
        i6.a aVar = i6.a.f4956f;
        return d8 == aVar ? aVar : d8;
    }
}
