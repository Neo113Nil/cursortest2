package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import n0.AbstractC1142d;
import n0.C1140b;
import n0.C1147i;

/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f5356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1147i f5357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsResult f5358c;

    public e(f fVar, C1147i c1147i, QueryProductDetailsResult queryProductDetailsResult) {
        this.f5356a = fVar;
        this.f5357b = c1147i;
        this.f5358c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f5356a;
        C1147i c1147i = this.f5357b;
        List productDetailsList = this.f5358c.getProductDetailsList();
        fVar.getClass();
        if (c1147i.f10092a != 0 || productDetailsList.isEmpty()) {
            fVar.f5364g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f5361c;
            l2.a aVar = fVar.f5362d;
            List list = fVar.f5363e;
            d dVar = fVar.f;
            k kVar = new k(utilsProvider, aVar, list, productDetailsList, dVar, fVar.f5364g);
            dVar.f5355b.add(kVar);
            if (fVar.f5360b.b()) {
                AbstractC1142d abstractC1142d = fVar.f5360b;
                C1140b c1140b = new C1140b();
                c1140b.f10054a = fVar.f5359a;
                abstractC1142d.d(c1140b.a(), kVar);
            } else {
                fVar.f.a(kVar);
                fVar.f5364g.onUpdateFinished();
            }
        }
        f fVar2 = this.f5356a;
        fVar2.f.a(fVar2);
    }
}
