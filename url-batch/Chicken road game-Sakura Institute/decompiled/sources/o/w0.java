package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f6784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f6785h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f6786i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f6787j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, float f9, float f10, h6.d dVar) {
        super(2, dVar);
        this.f6785h = x0Var;
        this.f6786i = f9;
        this.f6787j = f10;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        return new w0(this.f6785h, this.f6786i, this.f6787j, dVar);
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((w0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f6784g;
        if (i7 == 0) {
            d6.a.e(obj);
            f1 f1Var = this.f6785h.H;
            long a3 = u3.r.a(this.f6786i, this.f6787j);
            this.f6784g = 1;
            Object a9 = androidx.compose.foundation.gestures.a.a(f1Var, a3, this);
            i6.a aVar = i6.a.f4956f;
            if (a9 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
        }
        return d6.z.f2639a;
    }
}
