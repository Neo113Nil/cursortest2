package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.MealRepository;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4303g;

    /* renamed from: h, reason: collision with root package name */
    public int f4304h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j0 f4305i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(j0 j0Var, h6.d dVar, int i7) {
        super(2, dVar);
        this.f4303g = i7;
        this.f4305i = j0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f4303g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h0(this.f4305i, dVar, 0);
            default:
                return new h0(this.f4305i, dVar, 1);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f4303g) {
        }
        return ((h0) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4303g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f4304h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    MealRepository mealRepository = this.f4305i.f4322b;
                    this.f4304h = 1;
                    Object buildGroceryFromWeek = mealRepository.buildGroceryFromWeek(this);
                    i6.a aVar = i6.a.f4956f;
                    if (buildGroceryFromWeek == aVar) {
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
                int i8 = this.f4304h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    MealRepository mealRepository2 = this.f4305i.f4322b;
                    this.f4304h = 1;
                    Object clearChecked = mealRepository2.clearChecked(this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (clearChecked == aVar2) {
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
