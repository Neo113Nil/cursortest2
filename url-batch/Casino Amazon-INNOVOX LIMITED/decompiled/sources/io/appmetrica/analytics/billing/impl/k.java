package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes3.dex */
public final class k implements BillingInfoStorage {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f578a;
    public C0022a b;

    public k(ProtobufStateStorage<C0022a> protobufStateStorage) {
        this.f578a = protobufStateStorage;
        this.b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.b.f572a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.b.b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<? extends BillingInfo> list, boolean z) {
        for (BillingInfo billingInfo : list) {
        }
        C0022a c0022a = new C0022a(list, z);
        this.b = c0022a;
        this.f578a.save(c0022a);
    }
}
