package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements BillingInfoStorage {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f5220a;

    /* renamed from: b, reason: collision with root package name */
    public C0344a f5221b;

    public k(ProtobufStateStorage<C0344a> protobufStateStorage) {
        this.f5220a = protobufStateStorage;
        this.f5221b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.f5221b.f5203a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f5221b.f5204b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<? extends BillingInfo> list, boolean z) {
        for (BillingInfo billingInfo : list) {
        }
        C0344a c0344a = new C0344a(list, z);
        this.f5221b = c0344a;
        this.f5220a.save(c0344a);
    }
}
