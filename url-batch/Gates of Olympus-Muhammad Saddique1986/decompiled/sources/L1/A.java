package L1;

import android.content.Context;
import com.gatesof.olympus.martu.marku.salon.SalonDepot;
import h1.InterfaceC0490h;
import l1.C0595d;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3343a;

    /* renamed from: b, reason: collision with root package name */
    public final C0595d f3344b;

    /* renamed from: c, reason: collision with root package name */
    public final C0595d f3345c;

    /* renamed from: d, reason: collision with root package name */
    public final C0595d f3346d;

    /* renamed from: e, reason: collision with root package name */
    public final y f3347e;

    /* renamed from: f, reason: collision with root package name */
    public final y f3348f;

    public A(Context context) {
        this.f3343a = context;
        SalonDepot salonDepot = SalonDepot.INSTANCE;
        String at = salonDepot.at(3);
        f2.j.f(at, "name");
        this.f3344b = new C0595d(at);
        String at2 = salonDepot.at(4);
        f2.j.f(at2, "name");
        this.f3345c = new C0595d(at2);
        String at3 = salonDepot.at(5);
        f2.j.f(at3, "name");
        this.f3346d = new C0595d(at3);
        this.f3347e = new y(((InterfaceC0490h) B.a(context).f334d).b(), this, 0);
        this.f3348f = new y(((InterfaceC0490h) B.a(context).f334d).b(), this, 1);
    }
}
