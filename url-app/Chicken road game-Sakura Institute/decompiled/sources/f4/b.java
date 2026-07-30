package f4;

import androidx.lifecycle.q0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.GroceryItem;
import g4.i0;
import g4.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements q6.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3298h;

    public /* synthetic */ b(Object obj, int i7, Object obj2) {
        this.f3296f = i7;
        this.f3297g = obj;
        this.f3298h = obj2;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f3296f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((g5.c) this.f3297g).a((b6.c) this.f3298h);
                break;
            default:
                ((Boolean) obj).getClass();
                j0 j0Var = (j0) this.f3297g;
                c7.a0.p(q0.j(j0Var), null, null, new i0(j0Var, (GroceryItem) this.f3298h, null, 1), 3);
                break;
        }
        return d6.z.f2639a;
    }
}
