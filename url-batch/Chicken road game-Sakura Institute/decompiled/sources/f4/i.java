package f4;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.plate.PlatePageActivity;
import o7.n0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements q6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3333g;

    public /* synthetic */ i(int i7, Object obj) {
        this.f3332f = i7;
        this.f3333g = obj;
    }

    @Override // q6.a
    public final Object a() {
        int i7 = this.f3332f;
        Object obj = this.f3333g;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m mVar = PlatePageActivity.Companion;
                Context applicationContext = ((PlatePageActivity) obj).getApplicationContext();
                r6.k.e(applicationContext, "getApplicationContext(...)");
                return new c0(applicationContext);
            default:
                m7.f fVar = (m7.f) obj;
                return Integer.valueOf(n0.d(fVar, fVar.f6459j));
        }
    }
}
