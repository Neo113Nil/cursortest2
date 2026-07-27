package io.appmetrica.analytics.billingv8.impl;

import G0.AbstractC0053c;
import G0.C0051a;
import G0.C0060j;
import G0.C0061k;
import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f6116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0060j f6117b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsResult f6118c;

    public e(f fVar, C0060j c0060j, QueryProductDetailsResult queryProductDetailsResult) {
        this.f6116a = fVar;
        this.f6117b = c0060j;
        this.f6118c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f6116a;
        C0060j c0060j = this.f6117b;
        List productDetailsList = this.f6118c.getProductDetailsList();
        fVar.getClass();
        if (c0060j.a() != 0 || productDetailsList.isEmpty()) {
            fVar.f6125g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f6121c;
            InterfaceC1430a interfaceC1430a = fVar.f6122d;
            List list = fVar.f6123e;
            d dVar = fVar.f6124f;
            k kVar = new k(utilsProvider, interfaceC1430a, list, productDetailsList, dVar, fVar.f6125g);
            dVar.f6115b.add(kVar);
            if (fVar.f6120b.b()) {
                AbstractC0053c abstractC0053c = fVar.f6120b;
                C0051a a6 = C0061k.a();
                a6.d(fVar.f6119a);
                abstractC0053c.d(a6.c(), kVar);
            } else {
                fVar.f6124f.a(kVar);
                fVar.f6125g.onUpdateFinished();
            }
        }
        f fVar2 = this.f6116a;
        fVar2.f6124f.a(fVar2);
    }
}
