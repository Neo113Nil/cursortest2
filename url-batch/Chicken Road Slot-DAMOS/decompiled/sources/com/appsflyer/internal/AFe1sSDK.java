package com.appsflyer.internal;

import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import com.appsflyer.internal.AFe1rSDK;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFe1sSDK {
    public final AFc1hSDK AFAdRevenueData;
    private final AFe1oSDK component3;
    private final AFf1eSDK component4;
    private final AFc1oSDK getCurrencyIso4217Code;
    private final AFg1nSDK getMediationNetwork;
    public final AFc1qSDK getMonetizationNetwork;
    private final ExecutorService getRevenue;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFe1uSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFe1uSDK;)V"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1sSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends wd.p implements Function1<AFe1uSDK, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        public final void getRevenue(AFe1uSDK aFe1uSDK) {
            aFe1uSDK.getClass();
            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                AFe1sSDK.this.getMonetizationNetwork.AFAdRevenueData("didSendRevenueTriggerOnLastBackground", true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFe1uSDK) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFe1uSDK;", "p0", "", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFe1uSDK;)V"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1sSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends wd.p implements Function1<AFe1uSDK, Unit> {
        public static final AnonymousClass4 getCurrencyIso4217Code = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        public final void AFAdRevenueData(AFe1uSDK aFe1uSDK) {
            aFe1uSDK.getClass();
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFe1uSDK) obj);
            return Unit.f5554a;
        }
    }

    public AFe1sSDK(AFc1qSDK aFc1qSDK, AFc1hSDK aFc1hSDK, AFc1oSDK aFc1oSDK, ExecutorService executorService, AFg1nSDK aFg1nSDK, AFf1eSDK aFf1eSDK, AFe1oSDK aFe1oSDK) {
        aFc1qSDK.getClass();
        aFc1hSDK.getClass();
        aFc1oSDK.getClass();
        executorService.getClass();
        aFg1nSDK.getClass();
        aFf1eSDK.getClass();
        aFe1oSDK.getClass();
        this.getMonetizationNetwork = aFc1qSDK;
        this.AFAdRevenueData = aFc1hSDK;
        this.getCurrencyIso4217Code = aFc1oSDK;
        this.getRevenue = executorService;
        this.getMediationNetwork = aFg1nSDK;
        this.component4 = aFf1eSDK;
        this.component3 = aFe1oSDK;
    }

    public final void AFAdRevenueData(AFe1rSDK aFe1rSDK, Function1<? super AFe1uSDK, Unit> function1) {
        aFe1rSDK.getClass();
        function1.getClass();
        AFf1wSDK aFf1wSDK = new AFf1wSDK(aFe1rSDK, this.getRevenue, this.getCurrencyIso4217Code, this.AFAdRevenueData, this.getMediationNetwork, this.component4, function1);
        AFe1oSDK aFe1oSDK = this.component3;
        aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new AnonymousClass1(aFf1wSDK));
    }

    public final void getMediationNetwork() {
        if (this.getMonetizationNetwork.getMediationNetwork("didSendRevenueTriggerOnLastBackground", true) || !AFj1kSDK.getRevenue(this.AFAdRevenueData.getMonetizationNetwork)) {
            return;
        }
        AFAdRevenueData(AFe1rSDK.AFa1uSDK.INSTANCE, new AnonymousClass1());
    }
}
