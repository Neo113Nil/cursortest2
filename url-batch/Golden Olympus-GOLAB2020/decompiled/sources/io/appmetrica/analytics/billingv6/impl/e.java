package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f36899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f36900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f36901c;

    public e(f fVar, BillingResult billingResult, List list) {
        this.f36899a = fVar;
        this.f36900b = billingResult;
        this.f36901c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f36899a;
        BillingResult billingResult = this.f36900b;
        List list = this.f36901c;
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || list.isEmpty()) {
            fVar.f36908g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f36904c;
            Function0 function0 = fVar.f36905d;
            List list2 = fVar.f36906e;
            d dVar = fVar.f36907f;
            k kVar = new k(utilsProvider, function0, list2, list, dVar, fVar.f36908g);
            dVar.f36898b.add(kVar);
            if (fVar.f36903b.isReady()) {
                fVar.f36903b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f36902a).build(), kVar);
            } else {
                fVar.f36907f.a(kVar);
                fVar.f36908g.onUpdateFinished();
            }
        }
        f fVar2 = this.f36899a;
        fVar2.f36907f.a(fVar2);
    }
}
