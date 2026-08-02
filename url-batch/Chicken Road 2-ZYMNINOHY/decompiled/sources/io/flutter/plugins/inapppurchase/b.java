package io.flutter.plugins.inapppurchase;

import c3.C0294f;
import c3.C0297i;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.inapppurchase.InAppPurchaseApi;
import io.flutter.plugins.inapppurchase.ResultCompat;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13574b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f13573a = i4;
        this.f13574b = obj;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        C0297i up$lambda$10$0$0;
        C0297i up$lambda$12$0$0;
        C0297i up$lambda$8$0$0;
        C0297i up$lambda$5$0$0;
        C0297i up$lambda$6$0$0;
        C0297i up$lambda$1$0$0;
        C0297i up$lambda$7$0$0;
        C0297i up$lambda$11$0$0;
        C0297i up$lambda$3$0$0;
        C0297i asCompatCallback$lambda$0;
        switch (this.f13573a) {
            case 0:
                up$lambda$10$0$0 = InAppPurchaseApi.Companion.setUp$lambda$10$0$0((BasicMessageChannel.Reply) this.f13574b, (C0294f) obj);
                return up$lambda$10$0$0;
            case 1:
                up$lambda$12$0$0 = InAppPurchaseApi.Companion.setUp$lambda$12$0$0((BasicMessageChannel.Reply) this.f13574b, (C0294f) obj);
                return up$lambda$12$0$0;
            case 2:
                up$lambda$8$0$0 = InAppPurchaseApi.Companion.setUp$lambda$8$0$0((BasicMessageChannel.Reply) this.f13574b, (C0294f) obj);
                return up$lambda$8$0$0;
            case 3:
                up$lambda$5$0$0 = InAppPurchaseApi.Companion.setUp$lambda$5$0$0((BasicMessageChannel.Reply) this.f13574b, (C0294f) obj);
                return up$lambda$5$0$0;
            case 4:
                up$lambda$6$0$0 = InAppPurchaseApi.Companion.setUp$lambda$6$0$0((BasicMessageChannel.Reply) this.f13574b, (C0294f) obj);
                return up$lambda$6$0$0;
            case 5:
                up$lambda$1$0$0 = InAppPurchaseApi.Companion.setUp$lambda$1$0$0((BasicMessageChannel.Reply) this.f13574b, (C0294f) obj);
                return up$lambda$1$0$0;
            case 6:
                up$lambda$7$0$0 = InAppPurchaseApi.Companion.setUp$lambda$7$0$0((BasicMessageChannel.Reply) this.f13574b, (C0294f) obj);
                return up$lambda$7$0$0;
            case 7:
                up$lambda$11$0$0 = InAppPurchaseApi.Companion.setUp$lambda$11$0$0((BasicMessageChannel.Reply) this.f13574b, (C0294f) obj);
                return up$lambda$11$0$0;
            case 8:
                up$lambda$3$0$0 = InAppPurchaseApi.Companion.setUp$lambda$3$0$0((BasicMessageChannel.Reply) this.f13574b, (C0294f) obj);
                return up$lambda$3$0$0;
            default:
                asCompatCallback$lambda$0 = ResultCompat.Companion.asCompatCallback$lambda$0((InterfaceC1339l) this.f13574b, (C0294f) obj);
                return asCompatCallback$lambda$0;
        }
    }
}
