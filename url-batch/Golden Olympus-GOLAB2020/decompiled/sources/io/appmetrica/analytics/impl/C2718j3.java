package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2718j3 implements BillingInfoStorage {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f39256a;

    /* renamed from: b, reason: collision with root package name */
    public C3054w2 f39257b;

    public C2718j3(@NonNull Context context) {
        this(Qm.a(C3054w2.class).a(context));
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    @NonNull
    public final List<BillingInfo> getBillingInfo() {
        return this.f39257b.f39998a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f39257b.f39999b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(@NonNull List<BillingInfo> list, boolean z4) {
        for (BillingInfo billingInfo : list) {
        }
        C3054w2 c3054w2 = new C3054w2(list, z4);
        this.f39257b = c3054w2;
        this.f39256a.save(c3054w2);
    }

    public C2718j3(ProtobufStateStorage protobufStateStorage) {
        this.f39256a = protobufStateStorage;
        this.f39257b = (C3054w2) protobufStateStorage.read();
    }
}
