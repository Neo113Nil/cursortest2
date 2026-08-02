package io.flutter.plugins.inapppurchase;

import E1.C;
import E1.C0026b;
import E1.C0031g;
import E1.C0037m;
import E1.E;
import E1.InterfaceC0046w;
import java.util.List;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0046w, C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13581a;

    public /* synthetic */ f(Object obj) {
        this.f13581a = obj;
    }

    public void a(C0037m c0037m) {
        MethodCallHandlerImpl.lambda$acknowledgePurchase$7((InterfaceC1339l) this.f13581a, c0037m);
    }

    public void b(C0037m c0037m) {
        MethodCallHandlerImpl.lambda$isAlternativeBillingOnlyAvailableAsync$2((InterfaceC1339l) this.f13581a, c0037m);
    }

    public void c(C0037m c0037m) {
        MethodCallHandlerImpl.lambda$showAlternativeBillingOnlyInformationDialog$0((InterfaceC1339l) this.f13581a, c0037m);
    }

    public void d(C0037m c0037m, C0026b c0026b) {
        MethodCallHandlerImpl.lambda$createAlternativeBillingOnlyReportingDetailsAsync$1((InterfaceC1339l) this.f13581a, c0037m, c0026b);
    }

    public void e(C0037m c0037m, C0031g c0031g) {
        MethodCallHandlerImpl.lambda$getBillingConfigAsync$3((InterfaceC1339l) this.f13581a, c0037m, c0031g);
    }

    public void f(C0037m c0037m, String str) {
        MethodCallHandlerImpl.lambda$consumeAsync$5((InterfaceC1339l) this.f13581a, c0037m, str);
    }

    public void g(E e4) {
        BillingClientFactoryImpl.lambda$createUserChoiceBillingListener$1((InAppPurchaseCallbackApi) this.f13581a, e4);
    }

    @Override // E1.InterfaceC0046w
    public void onQueryPurchasesResponse(C0037m c0037m, List list) {
        MethodCallHandlerImpl.lambda$queryPurchasesAsync$6((InterfaceC1339l) this.f13581a, c0037m, list);
    }
}
