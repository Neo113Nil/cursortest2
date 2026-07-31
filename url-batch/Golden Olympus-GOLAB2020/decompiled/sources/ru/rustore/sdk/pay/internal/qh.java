package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.ln;
import ru.rustore.sdk.pay.internal.nh;
import ru.rustore.sdk.pay.model.AppUserEmail;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.Subject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

/* loaded from: classes3.dex */
public final class qh extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44841a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final y5 f44842b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final lh f44843c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final mh f44844d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final eh f44845e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateSubject<nh> f44846f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final Subject<nh> f44847g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public Disposable f44848h;

    public qh(PurchaseId purchaseId) {
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        this.f44841a = purchaseId;
        this.f44842b = (y5) serviceLocator.f45520i2.getValue();
        y yVar = (y) serviceLocator.f45511g3.getValue();
        this.f44843c = (lh) serviceLocator.f45536l3.getValue();
        this.f44844d = (mh) serviceLocator.f45516h3.getValue();
        this.f44845e = (eh) serviceLocator.f45521i3.getValue();
        MutableStateSubject<nh> mutableStateSubject = new MutableStateSubject<>(new nh.a(yVar.f45249a, null));
        this.f44846f = mutableStateSubject;
        this.f44847g = SubjectExtensionsKt.asSubject(mutableStateSubject);
    }

    public final void a(@Nullable String str) {
        String value;
        ProductType productType;
        qb qbVar = this.f44842b.f45261a.f43860b.f44876a;
        eh ehVar = this.f44845e;
        k a4 = (qbVar == null || (productType = qbVar.f44821f) == null) ? null : j.a(productType);
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        PurchaseId purchaseId = this.f44841a;
        ehVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(ehVar.f44040a.a());
        if (a4 != null) {
        }
        if (invoiceId != null && (value = invoiceId.getValue()) != null) {
        }
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        ehVar.f44041b.a("PaySheetGetReceiptSend.clicked", MapsKt.build(createMapBuilder));
        if (str == null || StringsKt.z(str)) {
            this.f44846f.setValue(new nh.a(null, ln.a.f44608a));
            return;
        }
        if (Regex.b(new Regex("^([a-zA-Z0-9_\\-\\.]+)@((([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{1,10}|[0-9]{1,3})(\\]?)$"), str, 0, 2, null) == null) {
            this.f44846f.setValue(new nh.a(new AppUserEmail(str), ln.b.f44609a));
            return;
        }
        AppUserEmail email = new AppUserEmail(str);
        this.f44846f.setValue(nh.c.f44707a);
        lh lhVar = this.f44843c;
        PurchaseId purchaseId2 = this.f44841a;
        lhVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
        Intrinsics.checkNotNullParameter(email, "email");
        gh ghVar = lhVar.f44584a;
        Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
        Intrinsics.checkNotNullParameter(email, "email");
        kh khVar = ghVar.f44180a;
        khVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
        Intrinsics.checkNotNullParameter(email, "email");
        Single from = Single.Companion.from(new ih(khVar, purchaseId2, email));
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        this.f44848h = SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(from, dispatchers.getIo()), new jh(khVar.f44482a)), fh.f44129a), dispatchers.getMain()), new oh(this, email), new ph(this, email));
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        Disposable disposable = this.f44848h;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onCleared();
    }
}
