package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends j6.i implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public int f4178g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f4179h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x xVar, h6.d dVar) {
        super(1, dVar);
        this.f4179h = xVar;
    }

    @Override // j6.a
    public final h6.d create(h6.d dVar) {
        return new p(this.f4179h, dVar);
    }

    @Override // q6.c
    public final Object f(Object obj) {
        return ((p) create((h6.d) obj)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f4178g;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
            return obj;
        }
        d6.a.e(obj);
        this.f4178g = 1;
        Object f9 = this.f4179h.f(this);
        i6.a aVar = i6.a.f4956f;
        return f9 == aVar ? aVar : f9;
    }
}
