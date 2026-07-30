package f4;

import android.content.Context;
import com.chicken.road.whale.plate.PlateVault;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3305a;

    /* renamed from: b, reason: collision with root package name */
    public final k3.d f3306b;

    /* renamed from: c, reason: collision with root package name */
    public final k3.d f3307c;

    /* renamed from: d, reason: collision with root package name */
    public final k3.d f3308d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f3309e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f3310f;

    public c0(Context context) {
        this.f3305a = context;
        PlateVault plateVault = PlateVault.INSTANCE;
        String at = plateVault.at(8);
        r6.k.f(at, "name");
        this.f3306b = new k3.d(at);
        String at2 = plateVault.at(9);
        r6.k.f(at2, "name");
        this.f3307c = new k3.d(at2);
        String at3 = plateVault.at(10);
        r6.k.f(at3, "name");
        this.f3308d = new k3.d(at3);
        this.f3309e = new a0(((g3.f) d0.a(context).f1394g).i(), this, 0);
        this.f3310f = new a0(((g3.f) d0.a(context).f1394g).i(), this, 1);
    }
}
