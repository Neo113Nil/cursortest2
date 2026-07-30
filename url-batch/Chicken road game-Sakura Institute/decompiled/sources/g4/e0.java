package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.GroceryItem;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 implements q6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4277f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f4278g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ GroceryItem f4279h;

    public /* synthetic */ e0(j0 j0Var, GroceryItem groceryItem, int i7) {
        this.f4277f = i7;
        this.f4278g = j0Var;
        this.f4279h = groceryItem;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f4277f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                GroceryItem groceryItem = this.f4279h;
                r6.k.f(groceryItem, "item");
                j0 j0Var = this.f4278g;
                c7.a0.p(androidx.lifecycle.q0.j(j0Var), null, null, new i0(j0Var, groceryItem, null, 1), 3);
                break;
            default:
                j0 j0Var2 = this.f4278g;
                c7.a0.p(androidx.lifecycle.q0.j(j0Var2), null, null, new i0(j0Var2, this.f4279h, null, 0), 3);
                break;
        }
        return d6.z.f2639a;
    }
}
