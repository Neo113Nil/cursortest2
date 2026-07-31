package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2693i3 implements BillingInfoSender {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2752kb f39169a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f39170b;

    public C2693i3(@NonNull InterfaceC2752kb interfaceC2752kb) {
        this(interfaceC2752kb, Ia.j().w().e());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(@NonNull List<ProductInfo> list) {
        Iterator<ProductInfo> it = list.iterator();
        while (it.hasNext()) {
            this.f39170b.execute(new C2667h3(this, it.next()));
        }
    }

    public C2693i3(@NonNull InterfaceC2752kb interfaceC2752kb, @NonNull ICommonExecutor iCommonExecutor) {
        this.f39169a = interfaceC2752kb;
        this.f39170b = iCommonExecutor;
    }
}
