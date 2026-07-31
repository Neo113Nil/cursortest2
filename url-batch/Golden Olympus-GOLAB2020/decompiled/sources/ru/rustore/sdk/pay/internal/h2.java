package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.c2;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
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
public final class h2 extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44195a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final t5 f44196b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final f6 f44197c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final y5 f44198d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final u5 f44199e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final ch f44200f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final zm f44201g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final cn f44202h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final b2 f44203i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final qk f44204j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public final q1 f44205k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public final y7 f44206l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateSubject<c2> f44207m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public final Subject<c2> f44208n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public final ArrayList f44209o;

    public h2(PurchaseId purchaseId) {
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        this.f44195a = purchaseId;
        v5 v5Var = (v5) serviceLocator.f45428N2.getValue();
        this.f44196b = (t5) serviceLocator.f45435P1.getValue();
        this.f44197c = (f6) serviceLocator.f45439Q1.getValue();
        this.f44198d = (y5) serviceLocator.f45520i2.getValue();
        this.f44199e = (u5) serviceLocator.f45440Q2.getValue();
        this.f44200f = (ch) serviceLocator.f45444R2.getValue();
        this.f44201g = (zm) serviceLocator.f45475Z1.getValue();
        this.f44202h = (cn) serviceLocator.f45480a2.getValue();
        this.f44203i = (b2) serviceLocator.f45432O2.getValue();
        this.f44204j = (qk) serviceLocator.f45464W2.getValue();
        this.f44205k = (q1) serviceLocator.f45481a3.getValue();
        this.f44206l = (y7) serviceLocator.f45561q3.getValue();
        MutableStateSubject<c2> mutableStateSubject = new MutableStateSubject<>(c2.c.f43897a);
        this.f44207m = mutableStateSubject;
        this.f44208n = SubjectExtensionsKt.asSubject(mutableStateSubject);
        ArrayList arrayList = new ArrayList();
        this.f44209o = arrayList;
        a2 a2Var = v5Var.f45120a;
        s1 s1Var = a2Var.f43793a;
        y1 y1Var = s1Var.f44950a;
        y1Var.getClass();
        Single from = Single.Companion.from(w1.f45148a);
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        arrayList.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(from, dispatchers.getIo()), new x1(y1Var.f45251a)), new r1(s1Var)), new z1(a2Var)), dispatchers.getMain()), new d2(this), new e2(this)));
    }

    public final InvoiceId a() {
        a aVar = this.f44196b.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = this.f44197c.f44056a.f44715b.f44719a;
            if (f0Var != null) {
                return f0Var.f44048b;
            }
            return null;
        }
        if (!(aVar instanceof a.b)) {
            if (aVar == null) {
                return null;
            }
            throw new W1.m();
        }
        qb qbVar = this.f44198d.f45261a.f43860b.f44876a;
        if (qbVar != null) {
            return qbVar.f44819d;
        }
        return null;
    }

    public final void b(Throwable th) {
        ze zeVar;
        qb qbVar = this.f44198d.f45261a.f43860b.f44876a;
        PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        OrderId orderId = qbVar != null ? qbVar.f44816a : null;
        Quantity quantity = (qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getQuantity();
        hf.b.C0259b result = new hf.b.C0259b(orderId, purchaseId, qbVar != null ? qbVar.f44817b : null, invoiceId, quantity, qbVar != null ? qbVar.f44820e : null, qbVar != null ? Boolean.valueOf(qbVar.f44823h) : null, qbVar != null ? qbVar.f44821f : null, th);
        b2 b2Var = this.f44203i;
        b2Var.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        b2Var.f43844a.a((hf) result, true);
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        ArrayList arrayList = this.f44209o;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Disposable) obj).dispose();
        }
        super.onCleared();
    }

    public static final k a(h2 h2Var) {
        ProductType productType;
        a aVar = h2Var.f44196b.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            return k.APPLICATION;
        }
        if (!(aVar instanceof a.b)) {
            if (aVar == null) {
                return null;
            }
            throw new W1.m();
        }
        qb qbVar = h2Var.f44198d.f45261a.f43860b.f44876a;
        if (qbVar == null || (productType = qbVar.f44821f) == null) {
            return null;
        }
        return j.a(productType);
    }

    public final void a(Throwable th) {
        a aVar = this.f44196b.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = this.f44197c.f44056a.f44715b.f44719a;
            hf.a.b result = new hf.a.b(f0Var != null ? f0Var.f44047a : null, f0Var != null ? f0Var.f44048b : null, f0Var != null ? f0Var.f44050d : null, th);
            b2 b2Var = this.f44203i;
            b2Var.getClass();
            Intrinsics.checkNotNullParameter(result, "result");
            b2Var.f43844a.a((hf) result, true);
            return;
        }
        if (aVar instanceof a.b) {
            b(th);
            return;
        }
        if (aVar == null) {
            RuStorePaymentException.RuStorePayInvalidActivePurchase throwable = new RuStorePaymentException.RuStorePayInvalidActivePurchase("Invalid active purchase type on the Bank Apps screen", null, 2, null);
            y7 y7Var = this.f44206l;
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            b(throwable);
        }
    }
}
