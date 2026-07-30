package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.Meal;
import com.chicken.road.whale.store.MealRepository;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4357g;

    /* renamed from: h, reason: collision with root package name */
    public int f4358h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q0 f4359i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Meal f4360j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(q0 q0Var, Meal meal, h6.d dVar, int i7) {
        super(2, dVar);
        this.f4357g = i7;
        this.f4359i = q0Var;
        this.f4360j = meal;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f4357g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new p0(this.f4359i, this.f4360j, dVar, 0);
            default:
                return new p0(this.f4359i, this.f4360j, dVar, 1);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f4357g) {
        }
        return ((p0) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4357g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f4358h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    MealRepository mealRepository = this.f4359i.f4364b;
                    this.f4358h = 1;
                    Object deleteMeal = mealRepository.deleteMeal(this.f4360j, this);
                    i6.a aVar = i6.a.f4956f;
                    if (deleteMeal == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            default:
                int i8 = this.f4358h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    MealRepository mealRepository2 = this.f4359i.f4364b;
                    this.f4358h = 1;
                    Object updateMeal = mealRepository2.updateMeal(this.f4360j, this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (updateMeal == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
        }
    }
}
