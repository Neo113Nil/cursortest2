package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.ha;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.qm;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.internal.ze;
import ru.rustore.sdk.pay.model.AmountLabel;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.Subject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

/* loaded from: classes3.dex */
public final class ka extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final yj f44434a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44435b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateSubject<ha> f44436c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Subject<ha> f44437d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final aa f44438e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f44439f;

    public static final class a extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable throwable = (Throwable) obj;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            ka.a(ka.this, throwable);
            return Unit.f41027a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<i8, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ru.rustore.sdk.pay.internal.a f44441a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ka f44442b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ru.rustore.sdk.pay.internal.a aVar, ka kaVar) {
            super(1);
            this.f44441a = aVar;
            this.f44442b = kaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            i8 paymentWithNewCard = (i8) obj;
            Intrinsics.checkNotNullParameter(paymentWithNewCard, "paymentWithNewCard");
            ru.rustore.sdk.pay.internal.a aVar = this.f44441a;
            if (aVar instanceof a.C0255a) {
                ((zm) this.f44442b.f44434a.f45475Z1.getValue()).a(paymentWithNewCard.f44319d);
            } else if (aVar instanceof a.b) {
                ((cn) this.f44442b.f44434a.f45480a2.getValue()).a(paymentWithNewCard.f44319d);
            }
            ((qk) this.f44442b.f44434a.f45464W2.getValue()).a(ua.b.f45090a);
            ga gaVar = (ga) this.f44442b.f44434a.f45486b3.getValue();
            Url redirectUrl = paymentWithNewCard.f44316a;
            gaVar.getClass();
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            gaVar.f44167a.b(redirectUrl);
            return Unit.f41027a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ka(PurchaseId purchaseId) {
        AmountLabel amountLabel;
        ze zeVar;
        ml mlVar;
        ru.rustore.sdk.pay.internal.a aVar;
        e0 e0Var;
        yj serviceLocator = yj.I3;
        aa params = null;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        this.f44434a = serviceLocator;
        this.f44435b = purchaseId;
        MutableStateSubject<ha> mutableStateSubject = new MutableStateSubject<>(ha.b.f44229a);
        this.f44436c = mutableStateSubject;
        this.f44437d = SubjectExtensionsKt.asSubject(mutableStateSubject);
        this.f44439f = new ArrayList();
        s9 s9Var = ((f7) serviceLocator.f45427N1.getValue()).f44057a;
        s9Var = s9Var == null ? (s9) CollectionsKt.first((List) ((fa) serviceLocator.f45423M1.getValue()).f44060a) : s9Var;
        List<? extends s9> list = ((fa) serviceLocator.f45423M1.getValue()).f44060a;
        List createListBuilder = CollectionsKt.createListBuilder();
        for (s9 s9Var2 : list) {
            boolean z4 = s9Var2 instanceof s9.c;
            if (z4 && Intrinsics.areEqual(s9Var2, s9Var)) {
                createListBuilder.add(0, new qm.a(s9Var2, true));
            } else if (z4) {
                createListBuilder.add(new qm.a(s9Var2, false));
            }
        }
        if (list.contains(s9.b.f44974a)) {
            createListBuilder.add(qm.b.f44857a);
        }
        s9.e eVar = s9.e.f44981a;
        if (list.contains(eVar)) {
            createListBuilder.add(new qm.a(eVar, s9Var instanceof s9.e));
        }
        s9.d dVar = s9.d.f44980a;
        if (list.contains(dVar)) {
            createListBuilder.add(new qm.a(dVar, s9Var instanceof s9.d));
        }
        s9.a aVar2 = s9.a.f44973a;
        if (list.contains(aVar2)) {
            createListBuilder.add(new qm.a(aVar2, s9Var instanceof s9.a));
        }
        List build = CollectionsKt.build(createListBuilder);
        ru.rustore.sdk.pay.internal.a aVar3 = ((t5) this.f44434a.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar3 instanceof a.C0255a) {
            f0 f0Var = ((f6) this.f44434a.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            amountLabel = (f0Var == null || (e0Var = f0Var.f44051e) == null) ? null : e0Var.f43984c;
            if (amountLabel == null) {
                amountLabel = new AmountLabel("");
            }
        } else if (aVar3 instanceof a.b) {
            qb qbVar = ((y5) this.f44434a.f45520i2.getValue()).f45261a.f43860b.f44876a;
            amountLabel = ((aVar3 instanceof a.C0255a) || qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getAmountLabel();
            if (amountLabel == null) {
                amountLabel = new AmountLabel("");
            }
        } else {
            if (aVar3 != null) {
                throw new W1.m();
            }
            y7 y7Var = (y7) this.f44434a.f45561q3.getValue();
            RuStorePaymentException.RuStorePayInvalidActivePurchase throwable = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found on payment methods screen", null, 2, null);
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            amountLabel = new AmountLabel("");
        }
        ru.rustore.sdk.pay.internal.a aVar4 = ((t5) this.f44434a.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar4 instanceof a.C0255a) {
            f0 f0Var2 = ((f6) this.f44434a.f45439Q1.getValue()).f44056a.f44715b.f44719a;
        } else if (aVar4 instanceof a.b) {
            qb qbVar2 = ((y5) this.f44434a.f45520i2.getValue()).f45261a.f43860b.f44876a;
            if (!(aVar4 instanceof a.C0255a)) {
                ze zeVar2 = qbVar2 != null ? qbVar2.f44822g : null;
                ze.b bVar = zeVar2 instanceof ze.b ? (ze.b) zeVar2 : null;
                if (bVar != null) {
                    mlVar = (ml) CollectionsKt.first((List) ((nl) this.f44434a.f45544n1.getValue()).a(bVar.f45352h));
                    mutableStateSubject.setValue(new ha.a(build, s9Var, amountLabel, mlVar));
                    aVar = ((t5) this.f44434a.f45435P1.getValue()).f45034a.f43892a.f43838a;
                    if (!(aVar instanceof a.C0255a)) {
                        f0 f0Var3 = ((f6) this.f44434a.f45439Q1.getValue()).f44056a.f44715b.f44719a;
                        if (f0Var3 != null) {
                            params = new aa(k.APPLICATION, f0Var3.f44048b, f0Var3.f44047a);
                        }
                    } else if (aVar instanceof a.b) {
                        qb qbVar3 = ((y5) this.f44434a.f45520i2.getValue()).f45261a.f43860b.f44876a;
                        if (!(aVar instanceof a.C0255a) && qbVar3 != null) {
                            params = new aa(j.a(qbVar3.f44821f), qbVar3.f44819d, qbVar3.f44818c);
                        }
                    } else {
                        if (aVar != null) {
                            throw new W1.m();
                        }
                        y7 y7Var2 = (y7) this.f44434a.f45561q3.getValue();
                        RuStorePaymentException.RuStorePayInvalidActivePurchase throwable2 = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found on payment methods screen", null, 2, null);
                        y7Var2.getClass();
                        Intrinsics.checkNotNullParameter(throwable2, "throwable");
                        u3.e.i(y7Var2.f45263a, throwable2, null, 2, null);
                    }
                    this.f44438e = params;
                    if (params == null) {
                        z9 z9Var = (z9) this.f44434a.f45600y2.getValue();
                        z9Var.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        Map createMapBuilder = MapsKt.createMapBuilder();
                        createMapBuilder.putAll(z9Var.f45322a.a());
                        createMapBuilder.put("rustore_payment", params.f43803a.f44406a);
                        createMapBuilder.put("invoiceId", params.f43805c.getValue());
                        createMapBuilder.put("purchaseId", params.f43804b.getValue());
                        z9Var.f45323b.a("PaySheetPaymentMethodShowFull", MapsKt.build(createMapBuilder));
                        return;
                    }
                    return;
                }
            }
        } else {
            if (aVar4 != null) {
                throw new W1.m();
            }
            y7 y7Var3 = (y7) this.f44434a.f45561q3.getValue();
            RuStorePaymentException.RuStorePayInvalidActivePurchase throwable3 = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found on payment methods screen", null, 2, null);
            y7Var3.getClass();
            Intrinsics.checkNotNullParameter(throwable3, "throwable");
            u3.e.i(y7Var3.f45263a, throwable3, null, 2, null);
        }
        mlVar = null;
        mutableStateSubject.setValue(new ha.a(build, s9Var, amountLabel, mlVar));
        aVar = ((t5) this.f44434a.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (!(aVar instanceof a.C0255a)) {
        }
        this.f44438e = params;
        if (params == null) {
        }
    }

    public static final void a(ka kaVar, Throwable throwable) {
        hf purchaseResult;
        ze zeVar;
        y7 y7Var = (y7) kaVar.f44434a.f45561q3.getValue();
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        ru.rustore.sdk.pay.internal.a aVar = ((t5) kaVar.f44434a.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = ((f6) kaVar.f44434a.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            hf.a.b purchaseResult2 = new hf.a.b(f0Var != null ? f0Var.f44047a : null, f0Var != null ? f0Var.f44048b : null, f0Var != null ? f0Var.f44050d : null, throwable);
            ga gaVar = (ga) kaVar.f44434a.f45486b3.getValue();
            gaVar.getClass();
            Intrinsics.checkNotNullParameter(purchaseResult2, "purchaseResult");
            gaVar.f44167a.a((hf) purchaseResult2, false);
            return;
        }
        if (!(aVar instanceof a.b)) {
            if (aVar != null) {
                throw new W1.m();
            }
            y7 y7Var2 = (y7) kaVar.f44434a.f45561q3.getValue();
            RuStorePaymentException.RuStorePayInvalidActivePurchase throwable2 = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found on payment methods screen", null, 2, null);
            y7Var2.getClass();
            Intrinsics.checkNotNullParameter(throwable2, "throwable");
            u3.e.i(y7Var2.f45263a, throwable2, null, 2, null);
            hf.b.C0259b purchaseResult3 = new hf.b.C0259b(null, null, null, null, null, null, null, null, throwable);
            ga gaVar2 = (ga) kaVar.f44434a.f45486b3.getValue();
            gaVar2.getClass();
            Intrinsics.checkNotNullParameter(purchaseResult3, "purchaseResult");
            gaVar2.f44167a.a((hf) purchaseResult3, false);
            return;
        }
        qb qbVar = ((y5) kaVar.f44434a.f45520i2.getValue()).f45261a.f43860b.f44876a;
        if (aVar instanceof a.C0255a) {
            purchaseResult = new hf.a.b(null, null, null, throwable);
        } else {
            PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
            InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
            OrderId orderId = qbVar != null ? qbVar.f44816a : null;
            Quantity quantity = (qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getQuantity();
            purchaseResult = new hf.b.C0259b(orderId, purchaseId, qbVar != null ? qbVar.f44817b : null, invoiceId, quantity, qbVar != null ? qbVar.f44820e : null, qbVar != null ? Boolean.valueOf(qbVar.f44823h) : null, qbVar != null ? qbVar.f44821f : null, throwable);
        }
        ga gaVar3 = (ga) kaVar.f44434a.f45486b3.getValue();
        gaVar3.getClass();
        Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
        gaVar3.f44167a.a(purchaseResult, false);
    }

    public final void b() {
        InvoiceId invoiceId;
        ru.rustore.sdk.pay.internal.a aVar = ((t5) this.f44434a.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar == null) {
            return;
        }
        this.f44436c.setValue(ha.c.f44230a);
        if (aVar instanceof a.C0255a) {
            f0 f0Var = ((f6) this.f44434a.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            if (f0Var != null) {
                invoiceId = f0Var.f44048b;
            }
            invoiceId = null;
        } else {
            if (!(aVar instanceof a.b)) {
                throw new W1.m();
            }
            qb qbVar = ((y5) this.f44434a.f45520i2.getValue()).f45261a.f43860b.f44876a;
            if (qbVar != null) {
                invoiceId = qbVar.f44819d;
            }
            invoiceId = null;
        }
        this.f44439f.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(((jg) this.f44434a.f45510g2.getValue()).a(this.f44435b, invoiceId), Dispatchers.INSTANCE.getMain()), new a(), new b(aVar, this)));
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        ArrayList arrayList = this.f44439f;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Disposable) obj).dispose();
        }
        super.onCleared();
    }

    public final void a() {
        ru.rustore.sdk.pay.internal.a aVar;
        ha value = this.f44436c.getValue();
        InvoiceId invoiceId = null;
        ha.a aVar2 = value instanceof ha.a ? (ha.a) value : null;
        if (aVar2 == null) {
            return;
        }
        s9 paymentMethod = aVar2.f44226b;
        aa params = this.f44438e;
        if (params != null) {
            z9 z9Var = (z9) this.f44434a.f45600y2.getValue();
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.putAll(z9Var.f45322a.a());
            createMapBuilder.put("rustore_payment", params.f43803a.f44406a);
            createMapBuilder.put("invoiceId", params.f43805c.getValue());
            createMapBuilder.put("purchaseId", params.f43804b.getValue());
            createMapBuilder.put("method_type", j.a(paymentMethod));
            z9Var.f45323b.a("PaySheetPaymentProceed", MapsKt.build(createMapBuilder));
        }
        if (paymentMethod instanceof s9.b) {
            b();
            return;
        }
        if (paymentMethod instanceof s9.e) {
            ga gaVar = (ga) this.f44434a.f45486b3.getValue();
            PurchaseId purchaseId = this.f44435b;
            gaVar.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            gaVar.f44167a.a(purchaseId);
            return;
        }
        if (paymentMethod instanceof s9.c) {
            ga gaVar2 = (ga) this.f44434a.f45486b3.getValue();
            String cardBindingId = ((s9.c) paymentMethod).f44975a;
            gaVar2.getClass();
            Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
            gaVar2.f44167a.b(cardBindingId);
            return;
        }
        if (paymentMethod instanceof s9.d) {
            ga gaVar3 = (ga) this.f44434a.f45486b3.getValue();
            PurchaseId purchaseId2 = this.f44435b;
            gaVar3.getClass();
            Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
            gaVar3.f44167a.c(purchaseId2);
            return;
        }
        if (!(paymentMethod instanceof s9.a) || (aVar = ((t5) this.f44434a.f45435P1.getValue()).f45034a.f43892a.f43838a) == null) {
            return;
        }
        this.f44436c.setValue(ha.c.f44230a);
        if (aVar instanceof a.C0255a) {
            f0 f0Var = ((f6) this.f44434a.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            if (f0Var != null) {
                invoiceId = f0Var.f44048b;
            }
        } else if (aVar instanceof a.b) {
            qb qbVar = ((y5) this.f44434a.f45520i2.getValue()).f45261a.f43860b.f44876a;
            if (qbVar != null) {
                invoiceId = qbVar.f44819d;
            }
        } else {
            throw new W1.m();
        }
        this.f44439f.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(((cg) this.f44434a.f45601y3.getValue()).a(this.f44435b, invoiceId), Dispatchers.INSTANCE.getMain()), new ia(this), new ja(aVar, this)));
    }
}
