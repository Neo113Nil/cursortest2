package g4;

import com.chicken.road.whale.store.MealRepository;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c1 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f4261g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1 f4262h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4263i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4264j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f4265k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(f1 f1Var, int i7, String str, long j8, h6.d dVar) {
        super(2, dVar);
        this.f4262h = f1Var;
        this.f4263i = i7;
        this.f4264j = str;
        this.f4265k = j8;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        return new c1(this.f4262h, this.f4263i, this.f4264j, this.f4265k, dVar);
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((c1) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f4261g;
        if (i7 == 0) {
            d6.a.e(obj);
            MealRepository mealRepository = this.f4262h.f4289b;
            this.f4261g = 1;
            Object assign = mealRepository.assign(this.f4263i, this.f4264j, this.f4265k, this);
            i6.a aVar = i6.a.f4956f;
            if (assign == aVar) {
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
