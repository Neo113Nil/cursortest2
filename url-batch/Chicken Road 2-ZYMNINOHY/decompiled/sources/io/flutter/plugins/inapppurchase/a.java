package io.flutter.plugins.inapppurchase;

import c3.C0297i;
import io.flutter.plugins.inapppurchase.MethodCallHandlerImpl;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13572a;

    public /* synthetic */ a(int i4) {
        this.f13572a = i4;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        C0297i lambda$createUserChoiceBillingListener$0;
        C0297i lambda$onBillingServiceDisconnected$0;
        C0297i lambda$onPurchasesUpdated$0;
        ResultCompat resultCompat = (ResultCompat) obj;
        switch (this.f13572a) {
            case 0:
                lambda$createUserChoiceBillingListener$0 = BillingClientFactoryImpl.lambda$createUserChoiceBillingListener$0(resultCompat);
                return lambda$createUserChoiceBillingListener$0;
            case 1:
                lambda$onBillingServiceDisconnected$0 = MethodCallHandlerImpl.AnonymousClass1.lambda$onBillingServiceDisconnected$0(resultCompat);
                return lambda$onBillingServiceDisconnected$0;
            default:
                lambda$onPurchasesUpdated$0 = PluginPurchaseListener.lambda$onPurchasesUpdated$0(resultCompat);
                return lambda$onPurchasesUpdated$0;
        }
    }
}
