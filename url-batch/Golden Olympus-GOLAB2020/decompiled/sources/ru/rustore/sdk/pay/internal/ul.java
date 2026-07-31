package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleDelayKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.Subject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

/* loaded from: classes3.dex */
public final class ul extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ql f45108a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Subject<rl> f45109b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final Disposable f45110c;

    public ul(String email) {
        String value;
        String value2;
        ProductType productType;
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        Intrinsics.checkNotNullParameter(email, "email");
        y5 y5Var = (y5) serviceLocator.f45520i2.getValue();
        this.f45108a = (ql) serviceLocator.f45526j3.getValue();
        ol olVar = (ol) serviceLocator.f45531k3.getValue();
        this.f45109b = SubjectExtensionsKt.asSubject(new MutableStateSubject(new rl(email)));
        qb qbVar = y5Var.f45261a.f43860b.f44876a;
        k a4 = (qbVar == null || (productType = qbVar.f44821f) == null) ? null : j.a(productType);
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
        olVar.getClass();
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(olVar.f44762a.a());
        if (a4 != null) {
        }
        if (invoiceId != null && (value2 = invoiceId.getValue()) != null) {
        }
        if (purchaseId != null && (value = purchaseId.getValue()) != null) {
            createMapBuilder.put("purchaseId", value);
        }
        olVar.f44763b.a("PaySheetGetReceiptSended", MapsKt.build(createMapBuilder));
        Single delay$default = SingleDelayKt.delay$default(Single.Companion.from(sl.f45022a), 3000L, null, 2, null);
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        this.f45110c = SingleSubscribeKt.subscribe$default(SingleObserveOnKt.observeOn(SingleSubscribeOnKt.subscribeOn(delay$default, dispatchers.getIo()), dispatchers.getMain()), null, new tl(this), 1, null);
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        Disposable disposable = this.f45110c;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onCleared();
    }
}
