package z1;

import W2.InterfaceC0302y;
import android.content.Context;
import android.content.Intent;
import com.chicken.road.kedro.laqer.MainActivity;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* renamed from: z1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1396v extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f11918k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B1.z f11919l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MainActivity f11920m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1396v(Context context, B1.z zVar, MainActivity mainActivity, C2.a aVar) {
        super(2, aVar);
        this.f11918k = context;
        this.f11919l = zVar;
        this.f11920m = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1396v) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1396v(this.f11918k, this.f11919l, this.f11920m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        B1.q qVar = VillagePageActivity.Companion;
        B1.z zVar = this.f11919l;
        String url = zVar.f1034a;
        boolean z4 = zVar.f1035b;
        qVar.getClass();
        Context ctx = this.f11918k;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(url, "url");
        Intent putExtra = new Intent(ctx, (Class<?>) VillagePageActivity.class).putExtra("extra_url", url).putExtra("extra_consent", z4);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        ctx.startActivity(putExtra);
        this.f11920m.finish();
        return Unit.f7487a;
    }
}
