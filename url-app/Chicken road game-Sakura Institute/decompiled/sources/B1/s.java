package B1;

import W2.InterfaceC0302y;
import android.content.Intent;
import com.chicken.road.kedro.laqer.MainActivity;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class s extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1021k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VillagePageActivity f1022l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(VillagePageActivity villagePageActivity, C2.a aVar) {
        super(2, aVar);
        this.f1022l = villagePageActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((s) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new s(this.f1022l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1021k;
        VillagePageActivity villagePageActivity = this.f1022l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            I i4 = (I) villagePageActivity.f6009A.getValue();
            this.f1021k = 1;
            if (J.a(i4.f963a).d(new j1.f(new C(i4, null), null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        villagePageActivity.startActivity(new Intent(villagePageActivity, (Class<?>) MainActivity.class).addFlags(268468224));
        villagePageActivity.finish();
        return Unit.f7487a;
    }
}
