package g4;

import com.chicken.road.whale.store.MealRepository;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d1 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f4271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1 f4272h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4273i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4274j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, int i7, String str, h6.d dVar) {
        super(2, dVar);
        this.f4272h = f1Var;
        this.f4273i = i7;
        this.f4274j = str;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        return new d1(this.f4272h, this.f4273i, this.f4274j, dVar);
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((d1) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f4271g;
        if (i7 == 0) {
            d6.a.e(obj);
            MealRepository mealRepository = this.f4272h.f4289b;
            this.f4271g = 1;
            Object clearSlot = mealRepository.clearSlot(this.f4273i, this.f4274j, this);
            i6.a aVar = i6.a.f4956f;
            if (clearSlot == aVar) {
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
