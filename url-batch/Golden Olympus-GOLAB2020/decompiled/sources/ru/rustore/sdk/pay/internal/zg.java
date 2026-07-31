package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.d;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.ne;
import ru.rustore.sdk.pay.internal.ug;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.Subject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

/* loaded from: classes3.dex */
public final class zg extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final t5 f45355a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final f6 f45356b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final y5 f45357c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final qk f45358d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final zm f45359e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final cn f45360f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final tg f45361g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final y7 f45362h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final Subject<ug> f45363i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final Disposable f45364j;

    public zg(PurchaseId purchaseId) {
        yj serviceLocator = yj.I3;
        InvoiceId invoiceId = null;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        t5 t5Var = (t5) serviceLocator.f45435P1.getValue();
        this.f45355a = t5Var;
        f6 f6Var = (f6) serviceLocator.f45439Q1.getValue();
        this.f45356b = f6Var;
        y5 y5Var = (y5) serviceLocator.f45520i2.getValue();
        this.f45357c = y5Var;
        wg wgVar = (wg) serviceLocator.f45551o3.getValue();
        this.f45358d = (qk) serviceLocator.f45464W2.getValue();
        this.f45359e = (zm) serviceLocator.f45475Z1.getValue();
        this.f45360f = (cn) serviceLocator.f45480a2.getValue();
        this.f45361g = (tg) serviceLocator.f45546n3.getValue();
        y7 y7Var = (y7) serviceLocator.f45561q3.getValue();
        this.f45362h = y7Var;
        jn jnVar = (jn) serviceLocator.f45559q1.getValue();
        MutableStateSubject mutableStateSubject = new MutableStateSubject(ug.b.f45100a);
        this.f45363i = SubjectExtensionsKt.asSubject(mutableStateSubject);
        a aVar = t5Var.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = f6Var.f44056a.f44715b.f44719a;
            if (f0Var == null) {
                RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Missing application purchase data on SberPay screen", null, 2, null);
                y7Var.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                u3.e.i(y7Var.f45263a, throwable, null, 2, null);
                a((Throwable) throwable);
            } else {
                mutableStateSubject.setValue(new ug.a(f0Var));
            }
        } else if (aVar instanceof a.b) {
            qb qbVar = y5Var.f45261a.f43860b.f44876a;
            if (aVar instanceof a.C0255a) {
                RuStorePaymentException.RuStorePaymentCommonException throwable2 = new RuStorePaymentException.RuStorePaymentCommonException("Missing application purchase data on SberPay screen", null, 2, null);
                y7Var.getClass();
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                u3.e.i(y7Var.f45263a, throwable2, null, 2, null);
                a((Throwable) throwable2);
            } else if (qbVar == null) {
                RuStorePaymentException.RuStorePaymentCommonException throwable3 = new RuStorePaymentException.RuStorePaymentCommonException("Missing product purchase data on SberPay screen", null, 2, null);
                y7Var.getClass();
                Intrinsics.checkNotNullParameter(throwable3, "throwable");
                u3.e.i(y7Var.f45263a, throwable3, null, 2, null);
                a((Throwable) throwable3);
            } else {
                mutableStateSubject.setValue(new ug.c(qbVar, jnVar.a()));
            }
        } else {
            if (aVar != null) {
                throw new W1.m();
            }
            RuStorePaymentException.RuStorePayInvalidActivePurchase throwable4 = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found on SberPay screen", null, 2, null);
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable4, "throwable");
            u3.e.i(y7Var.f45263a, throwable4, null, 2, null);
            a((Throwable) throwable4);
        }
        a aVar2 = t5Var.f45034a.f43892a.f43838a;
        if (aVar2 instanceof a.C0255a) {
            f0 f0Var2 = f6Var.f44056a.f44715b.f44719a;
            if (f0Var2 != null) {
                invoiceId = f0Var2.f44048b;
            }
        } else if (aVar2 instanceof a.b) {
            qb qbVar2 = y5Var.f45261a.f43860b.f44876a;
            if (!(aVar2 instanceof a.C0255a) && qbVar2 != null) {
                invoiceId = qbVar2.f44819d;
            }
        } else if (aVar2 != null) {
            throw new W1.m();
        }
        wgVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        e eVar = wgVar.f45173c;
        d.b state = d.b.f43944a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        eVar.f43981a = state;
        if (invoiceId != null) {
            ne.e event = new ne.e(purchaseId, invoiceId);
            pe peVar = wgVar.f45174d;
            peVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            oe oeVar = peVar.f44782a;
            oeVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            oeVar.f44732a.emit(event);
        }
        ta taVar = wgVar.f45171a;
        Url backUrl = wgVar.f45172b.a();
        taVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(backUrl, "backUrl");
        r8 r8Var = taVar.f45038a;
        r8Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(backUrl, "backUrl");
        q9 q9Var = r8Var.f44894a;
        q9Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(backUrl, "backUrl");
        this.f45364j = SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleMapKt.map(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(q9.a(q9Var, backUrl, null, null, null, null, "SBER_PAY", purchaseId, 30), new o9(q9Var.f44814a)), new p8(r8Var)), new ra(taVar.f45039b)), new vg(purchaseId, wgVar)), Dispatchers.INSTANCE.getMain()), new xg(this), new yg(this));
    }

    public final void a(Throwable th) {
        ze zeVar;
        a aVar = this.f45355a.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = this.f45356b.f44056a.f44715b.f44719a;
            hf.a.b result = new hf.a.b(f0Var != null ? f0Var.f44047a : null, f0Var != null ? f0Var.f44048b : null, f0Var != null ? f0Var.f44050d : null, th);
            tg tgVar = this.f45361g;
            tgVar.getClass();
            Intrinsics.checkNotNullParameter(result, "result");
            tgVar.f45042a.a((hf) result, false);
            return;
        }
        if (!(aVar instanceof a.b)) {
            if (aVar != null) {
                throw new W1.m();
            }
            hf.b.C0259b result2 = new hf.b.C0259b(null, null, null, null, null, null, null, null, th);
            tg tgVar2 = this.f45361g;
            tgVar2.getClass();
            Intrinsics.checkNotNullParameter(result2, "result");
            tgVar2.f45042a.a((hf) result2, false);
            return;
        }
        qb qbVar = this.f45357c.f45261a.f43860b.f44876a;
        if (aVar instanceof a.C0255a) {
            hf.a.b result3 = new hf.a.b(null, null, null, th);
            tg tgVar3 = this.f45361g;
            tgVar3.getClass();
            Intrinsics.checkNotNullParameter(result3, "result");
            tgVar3.f45042a.a((hf) result3, false);
            return;
        }
        PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        OrderId orderId = qbVar != null ? qbVar.f44816a : null;
        Quantity quantity = (qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getQuantity();
        hf.b.C0259b result4 = new hf.b.C0259b(orderId, purchaseId, qbVar != null ? qbVar.f44817b : null, invoiceId, quantity, qbVar != null ? qbVar.f44820e : null, qbVar != null ? Boolean.valueOf(qbVar.f44823h) : null, qbVar != null ? qbVar.f44821f : null, th);
        tg tgVar4 = this.f45361g;
        tgVar4.getClass();
        Intrinsics.checkNotNullParameter(result4, "result");
        tgVar4.f45042a.a((hf) result4, false);
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        Disposable disposable = this.f45364j;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onCleared();
    }
}
