package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.Subject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

/* loaded from: classes3.dex */
public final class xn extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Url f45240a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final y5 f45241b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final tk f45242c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final tn f45243d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final y7 f45244e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final qn f45245f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final pn f45246g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final Subject<un> f45247h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final ArrayList f45248i;

    public xn(Url authUrl) {
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        this.f45240a = authUrl;
        w5 w5Var = (w5) serviceLocator.f45586v3.getValue();
        this.f45241b = (y5) serviceLocator.f45520i2.getValue();
        this.f45242c = (tk) serviceLocator.G3.getValue();
        this.f45243d = (tn) serviceLocator.f45566r3.getValue();
        this.f45244e = (y7) serviceLocator.f45561q3.getValue();
        this.f45245f = (qn) serviceLocator.f45393F.getValue();
        pn pnVar = (pn) serviceLocator.f45571s3.getValue();
        this.f45246g = pnVar;
        this.f45247h = SubjectExtensionsKt.asSubject(new MutableStateSubject(new un(w5Var.a(authUrl))));
        this.f45248i = new ArrayList();
        m mVar = pnVar.f44803b;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(pnVar.f44802a.a());
        createMapBuilder.put("rustore_payment", "3");
        mVar.a("payAuthAppears", MapsKt.build(createMapBuilder));
    }

    public final void a(Throwable throwable) {
        String errorMessage;
        ze zeVar;
        String errorType = j.a(throwable);
        boolean z4 = throwable instanceof RuStorePaymentException.RuStorePaymentNetworkException;
        RuStorePaymentException.RuStorePaymentNetworkException ruStorePaymentNetworkException = z4 ? (RuStorePaymentException.RuStorePaymentNetworkException) throwable : null;
        String code = ruStorePaymentNetworkException != null ? ruStorePaymentNetworkException.getCode() : null;
        RuStorePaymentException.RuStorePaymentNetworkException ruStorePaymentNetworkException2 = z4 ? (RuStorePaymentException.RuStorePaymentNetworkException) throwable : null;
        if ((ruStorePaymentNetworkException2 == null || (errorMessage = ruStorePaymentNetworkException2.getMessage()) == null) && (errorMessage = throwable.getMessage()) == null) {
            errorMessage = "Unknown error";
        }
        pn pnVar = this.f45246g;
        pnVar.getClass();
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Map createMapBuilder = MapsKt.createMapBuilder();
        Map createMapBuilder2 = MapsKt.createMapBuilder();
        createMapBuilder2.putAll(pnVar.f44802a.a());
        createMapBuilder2.put("rustore_payment", "3");
        createMapBuilder.putAll(MapsKt.build(createMapBuilder2));
        createMapBuilder.put("error_type", errorType);
        createMapBuilder.put("error_message", errorMessage);
        if (code != null) {
            createMapBuilder.put("error_code", code);
        }
        pnVar.f44803b.a("payAuthError", MapsKt.build(createMapBuilder));
        y7 y7Var = this.f45244e;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        qb qbVar = this.f45241b.f45261a.f43860b.f44876a;
        PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        OrderId orderId = qbVar != null ? qbVar.f44816a : null;
        Quantity quantity = (qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getQuantity();
        hf.b.C0259b purchaseResult = new hf.b.C0259b(orderId, purchaseId, qbVar != null ? qbVar.f44817b : null, invoiceId, quantity, qbVar != null ? qbVar.f44820e : null, qbVar != null ? Boolean.valueOf(qbVar.f44823h) : null, qbVar != null ? qbVar.f44821f : null, throwable);
        tn tnVar = this.f45243d;
        tnVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
        tnVar.f45050a.a((hf) purchaseResult, false);
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        ArrayList arrayList = this.f45248i;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Disposable) obj).dispose();
        }
        super.onCleared();
    }
}
