package io.flutter.plugins.inapppurchase;

import E1.A;
import E1.C0037m;
import E1.InterfaceC0044u;
import io.flutter.plugin.common.BasicMessageChannel;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements BasicMessageChannel.Reply, InterfaceC0044u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1339l f13579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13580c;

    public /* synthetic */ e(MethodCallHandlerImpl methodCallHandlerImpl, InterfaceC1339l interfaceC1339l) {
        this.f13578a = 3;
        this.f13580c = methodCallHandlerImpl;
        this.f13579b = interfaceC1339l;
    }

    @Override // E1.InterfaceC0044u
    public void onProductDetailsResponse(C0037m c0037m, A a3) {
        ((MethodCallHandlerImpl) this.f13580c).lambda$queryProductDetailsAsync$4(this.f13579b, c0037m, a3);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        switch (this.f13578a) {
            case 0:
                InAppPurchaseCallbackApi.onPurchasesUpdated$lambda$0(this.f13579b, (String) this.f13580c, obj);
                break;
            case 1:
                InAppPurchaseCallbackApi.onBillingServiceDisconnected$lambda$0(this.f13579b, (String) this.f13580c, obj);
                break;
            default:
                InAppPurchaseCallbackApi.userSelectedalternativeBilling$lambda$0(this.f13579b, (String) this.f13580c, obj);
                break;
        }
    }

    public /* synthetic */ e(InterfaceC1339l interfaceC1339l, String str, int i4) {
        this.f13578a = i4;
        this.f13579b = interfaceC1339l;
        this.f13580c = str;
    }
}
