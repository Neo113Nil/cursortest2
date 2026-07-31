package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.k5;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.Subject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

/* loaded from: classes3.dex */
public final class n5 extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final yj f44677a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44678b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final y7 f44679c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateSubject<k5> f44680d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Subject<k5> f44681e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Disposable f44682f;

    public n5(PurchaseId purchaseId) {
        Object obj;
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        this.f44677a = serviceLocator;
        this.f44678b = purchaseId;
        this.f44679c = (y7) serviceLocator.f45561q3.getValue();
        jn jnVar = (jn) serviceLocator.f45559q1.getValue();
        a aVar = ((t5) serviceLocator.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = ((f6) serviceLocator.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            if (f0Var != null) {
                obj = new k5.a(f0Var);
            } else {
                a((RuStorePaymentException) new RuStorePaymentException.RuStorePaymentCommonException("Application purchase data not found on external payment screen", null, 2, null));
                obj = k5.b.f44417a;
            }
        } else if (aVar instanceof a.b) {
            qb qbVar = ((y5) serviceLocator.f45520i2.getValue()).f45261a.f43860b.f44876a;
            if (qbVar != null) {
                obj = new k5.c(qbVar, jnVar.a());
            } else {
                a((RuStorePaymentException) new RuStorePaymentException.RuStorePaymentCommonException("Product purchase data not found on external payment screen", null, 2, null));
                obj = k5.b.f44417a;
            }
        } else {
            if (aVar != null) {
                throw new W1.m();
            }
            a((RuStorePaymentException) new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found on external payment screen", null, 2, null));
            obj = k5.b.f44417a;
        }
        MutableStateSubject<k5> mutableStateSubject = new MutableStateSubject<>(obj);
        this.f44680d = mutableStateSubject;
        this.f44681e = SubjectExtensionsKt.asSubject(mutableStateSubject);
    }

    public final void a(RuStorePaymentException throwable) {
        y7 y7Var = this.f44679c;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        a aVar = ((t5) this.f44677a.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = ((f6) this.f44677a.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            hf.a.b purchaseResult = new hf.a.b(f0Var != null ? f0Var.f44047a : null, f0Var != null ? f0Var.f44048b : null, f0Var != null ? f0Var.f44050d : null, throwable);
            j5 j5Var = (j5) this.f44677a.f45452T2.getValue();
            j5Var.getClass();
            Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
            j5Var.f44361a.a((hf) purchaseResult, false);
            return;
        }
        if (aVar instanceof a.b) {
            a(((y5) this.f44677a.f45520i2.getValue()).f45261a.f43860b.f44876a, throwable);
        } else if (aVar == null) {
            a(null, throwable);
        }
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        Disposable disposable = this.f44682f;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onCleared();
    }

    public final void a(qb qbVar, RuStorePaymentException ruStorePaymentException) {
        ze zeVar;
        PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        OrderId orderId = qbVar != null ? qbVar.f44816a : null;
        Quantity quantity = (qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getQuantity();
        hf.b.C0259b purchaseResult = new hf.b.C0259b(orderId, purchaseId, qbVar != null ? qbVar.f44817b : null, invoiceId, quantity, qbVar != null ? qbVar.f44820e : null, qbVar != null ? Boolean.valueOf(qbVar.f44823h) : null, qbVar != null ? qbVar.f44821f : null, ruStorePaymentException);
        j5 j5Var = (j5) this.f44677a.f45452T2.getValue();
        j5Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
        j5Var.f44361a.a((hf) purchaseResult, false);
    }

    public final void a(Throwable th) {
        k5 value = this.f44680d.getValue();
        if (value instanceof k5.a) {
            f0 f0Var = ((k5.a) value).f44416a;
            hf.a.b purchaseResult = new hf.a.b(f0Var.f44047a, f0Var.f44048b, f0Var.f44050d, th);
            j5 j5Var = (j5) this.f44677a.f45452T2.getValue();
            j5Var.getClass();
            Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
            j5Var.f44361a.a((hf) purchaseResult, false);
            return;
        }
        if (value instanceof k5.c) {
            k5.c cVar = (k5.c) value;
            qb qbVar = cVar.f44418a;
            PurchaseId purchaseId = qbVar.f44818c;
            InvoiceId invoiceId = qbVar.f44819d;
            OrderId orderId = qbVar.f44816a;
            Quantity quantity = qbVar.f44822g.getQuantity();
            qb qbVar2 = cVar.f44418a;
            hf.b.C0259b purchaseResult2 = new hf.b.C0259b(orderId, purchaseId, qbVar2.f44817b, invoiceId, quantity, qbVar2.f44820e, Boolean.valueOf(qbVar2.f44823h), qbVar2.f44821f, th);
            j5 j5Var2 = (j5) this.f44677a.f45452T2.getValue();
            j5Var2.getClass();
            Intrinsics.checkNotNullParameter(purchaseResult2, "purchaseResult");
            j5Var2.f44361a.a((hf) purchaseResult2, false);
        }
    }
}
