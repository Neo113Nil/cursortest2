package U1;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import n0.C1147i;
import n0.InterfaceC1144f;

/* loaded from: classes.dex */
public final class H implements InterfaceC1144f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1487a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0084e f1488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f1489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f1490d;

    public H(I i3, C0084e c0084e, Long l3) {
        this.f1490d = i3;
        this.f1488b = c0084e;
        this.f1489c = l3;
    }

    @Override // n0.InterfaceC1144f
    public final void onBillingServiceDisconnected() {
        C0.e eVar = this.f1490d.f1495e;
        C0080a c0080a = new C0080a(2);
        eVar.getClass();
        new B0.p((P1.f) eVar.f201b, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected", (P1.k) C0085f.f1505a, (K0.j) null).h(new ArrayList(Collections.singletonList(this.f1489c)), new B0.k(c0080a, 4, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected"));
    }

    @Override // n0.InterfaceC1144f
    public final void onBillingSetupFinished(C1147i c1147i) {
        if (this.f1487a) {
            Log.d("InAppPurchasePlugin", "Tried to call onBillingSetupFinished multiple times.");
            return;
        }
        this.f1487a = true;
        this.f1488b.a(S0.a.j(c1147i));
    }
}
