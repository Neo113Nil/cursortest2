package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements BillingInfoStorage {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f9462a;

    /* renamed from: b, reason: collision with root package name */
    public C0461a f9463b;

    public k(ProtobufStateStorage<C0461a> protobufStateStorage) {
        this.f9462a = protobufStateStorage;
        this.f9463b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.f9463b.f9443a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f9463b.f9444b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<? extends BillingInfo> list, boolean z) {
        for (BillingInfo billingInfo : list) {
        }
        C0461a c0461a = new C0461a(list, z);
        this.f9463b = c0461a;
        this.f9462a.save(c0461a);
    }
}
