package ru.rustore.sdk.pay.internal;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.V;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.g3;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.o4;
import ru.rustore.sdk.pay.internal.p3;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.Observable;
import ru.rustore.sdk.reactive.observable.ObservableObserveOnKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeOnKt;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.MutableSubject;
import ru.rustore.sdk.reactive.subject.StateSubject;
import ru.rustore.sdk.reactive.subject.Subject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

@Metadata
/* loaded from: classes3.dex */
public final class r3 extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final yj f44877a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateSubject<p3> f44878b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateSubject f44879c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSubject<g3> f44880d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Subject<g3> f44881e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f44882f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public l3 f44883g;

    public static final class a extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f44885b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PurchaseId f44886c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<m4> f44887d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, PurchaseId purchaseId, List<m4> list) {
            super(1);
            this.f44885b = str;
            this.f44886c = purchaseId;
            this.f44887d = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable error = (Throwable) obj;
            Intrinsics.checkNotNullParameter(error, "error");
            r3 r3Var = r3.this;
            l3 params = r3Var.f44883g;
            if (params != null) {
                k3 k3Var = (k3) r3Var.f44877a.f45380B2.getValue();
                String message = error.getMessage();
                k3Var.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                Map createMapBuilder = MapsKt.createMapBuilder();
                createMapBuilder.putAll(k3Var.f44413a.a());
                createMapBuilder.put("rustore_payment", params.f44501a.f44406a);
                createMapBuilder.put("invoiceId", params.f44502b.getValue());
                if (message == null) {
                    message = "";
                }
                createMapBuilder.put("error_message", message);
                k3Var.f44414b.a("paySheetCouponSheet.error", MapsKt.build(createMapBuilder));
            }
            r3 r3Var2 = r3.this;
            if ((error instanceof UnknownHostException) || (error instanceof ConnectException) || (error instanceof SocketTimeoutException)) {
                r3Var2.f44878b.setValue(new p3.a(this.f44885b, this.f44886c, this.f44887d));
                r3.this.f44880d.emit(g3.b.f44154a);
            } else {
                r3Var2.f44878b.setValue(new p3.b(this.f44887d, this.f44886c));
                r3.this.f44880d.emit(g3.a.f44153a);
            }
            return Unit.f41027a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit it = (Unit) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            FragmentManager a4 = ((o3) r3.this.f44877a.f45500e2.getValue()).f44720a.a();
            if (a4 != null) {
                a4.V0();
            }
            return Unit.f41027a;
        }
    }

    public r3() {
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        this.f44877a = serviceLocator;
        MutableStateSubject<p3> mutableStateSubject = new MutableStateSubject<>(p3.c.f44773a);
        this.f44878b = mutableStateSubject;
        this.f44879c = SubjectExtensionsKt.asStateSubject(mutableStateSubject);
        MutableSubject<g3> mutableSubject = new MutableSubject<>(0, 0, 3, null);
        this.f44880d = mutableSubject;
        this.f44881e = SubjectExtensionsKt.asSubject(mutableSubject);
        this.f44882f = new ArrayList();
        ru.rustore.sdk.pay.internal.a aVar = ((t5) serviceLocator.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = ((f6) serviceLocator.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            if (f0Var == null) {
                a((RuStorePaymentException) new RuStorePaymentException.RuStorePaymentCommonException("Application purchase data not found on coupon screen initialization", null, 2, null));
            } else {
                l3 l3Var = new l3(k.APPLICATION, f0Var.f44048b);
                z4 value = ((d5) serviceLocator.f45415K1.getValue()).f43956a.f44767a.getValue();
                o4 o4Var = value != null ? value.f45311a : null;
                Iterable emptyList = o4Var instanceof o4.c ? ((o4.c) o4Var).f44723a : o4Var instanceof o4.a ? ((o4.a) o4Var).f44721a : ((o4Var instanceof o4.d) || (o4Var instanceof o4.b)) ? null : CollectionsKt.emptyList();
                l4 l4Var = (l4) serviceLocator.f45549o1.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList, 10));
                Iterator it = emptyList.iterator();
                while (it.hasNext()) {
                    arrayList.add(l4Var.a((b3) it.next()));
                }
                a(arrayList, f0Var.f44047a, l3Var);
            }
        } else if (aVar instanceof a.b) {
            qb qbVar = ((y5) serviceLocator.f45520i2.getValue()).f45261a.f43860b.f44876a;
            if (qbVar == null) {
                a((RuStorePaymentException) new RuStorePaymentException.RuStorePaymentCommonException("Product purchase data not found on coupon screen initialization", null, 2, null));
            } else {
                l3 l3Var2 = new l3(j.a(qbVar.f44821f), qbVar.f44819d);
                z4 value2 = ((d5) serviceLocator.f45415K1.getValue()).f43956a.f44767a.getValue();
                o4 o4Var2 = value2 != null ? value2.f45311a : null;
                Iterable emptyList2 = o4Var2 instanceof o4.c ? ((o4.c) o4Var2).f44723a : o4Var2 instanceof o4.a ? ((o4.a) o4Var2).f44721a : ((o4Var2 instanceof o4.d) || (o4Var2 instanceof o4.b)) ? null : CollectionsKt.emptyList();
                l4 l4Var2 = (l4) serviceLocator.f45549o1.getValue();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList2, 10));
                Iterator it2 = emptyList2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(l4Var2.a((b3) it2.next()));
                }
                a(arrayList2, qbVar.f44818c, l3Var2);
            }
        } else if (aVar == null) {
            a((RuStorePaymentException) new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found on coupon screen initialization", null, 2, null));
        }
        Observable observe$default = Subject.DefaultImpls.observe$default(((d5) this.f44877a.f45415K1.getValue()).f43956a.f44767a, null, 1, null);
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        this.f44882f.add(ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(ObservableSubscribeOnKt.subscribeOn(observe$default, dispatchers.getIo()), dispatchers.getMain(), null, 2, null), null, null, new q3(this), 3, null));
    }

    public final void a(String couponId, PurchaseId purchaseId, List<m4> list) {
        vj vjVar = (vj) this.f44877a.f45580u2.getValue();
        vjVar.getClass();
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        f4 f4Var = vjVar.f45139a;
        f4Var.getClass();
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        p7 p7Var = f4Var.f44054a;
        p7Var.getClass();
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        b4 b4Var = p7Var.f44777a;
        b4Var.getClass();
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Single from = Single.Companion.from(new x3(couponId, b4Var, purchaseId));
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        this.f44882f.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleMapKt.map(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(from, dispatchers.getIo()), new z3(b4Var.f43852a)), new n7(p7Var)), new d4(f4Var)), new uj(vjVar)), dispatchers.getMain()), new a(couponId, purchaseId, list), new b()));
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        ArrayList arrayList = this.f44882f;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Disposable) obj).dispose();
        }
        super.onCleared();
    }

    public final void a(RuStorePaymentException throwable) {
        y7 y7Var = (y7) this.f44877a.f45561q3.getValue();
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        ru.rustore.sdk.pay.internal.a aVar = ((t5) this.f44877a.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = ((f6) this.f44877a.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            hf.a.b result = new hf.a.b(f0Var != null ? f0Var.f44047a : null, f0Var != null ? f0Var.f44048b : null, f0Var != null ? f0Var.f44050d : null, throwable);
            o3 o3Var = (o3) this.f44877a.f45500e2.getValue();
            o3Var.getClass();
            Intrinsics.checkNotNullParameter(result, "result");
            o3Var.f44720a.a((hf) result, false);
            return;
        }
        if (aVar instanceof a.b) {
            a(((y5) this.f44877a.f45520i2.getValue()).f45261a.f43860b.f44876a, throwable);
        } else if (aVar == null) {
            a(null, throwable);
        }
    }

    public final void a(ArrayList arrayList, PurchaseId purchaseId, l3 params) {
        this.f44883g = params;
        this.f44878b.setValue(new p3.b(arrayList, purchaseId));
        k3 k3Var = (k3) this.f44877a.f45380B2.getValue();
        k3Var.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(k3Var.f44413a.a());
        createMapBuilder.put("rustore_payment", params.f44501a.f44406a);
        createMapBuilder.put("invoiceId", params.f44502b.getValue());
        k3Var.f44414b.a("paySheetCouponSheet.open", MapsKt.build(createMapBuilder));
    }

    public final void a(qb qbVar, RuStorePaymentException ruStorePaymentException) {
        ze zeVar;
        PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        OrderId orderId = qbVar != null ? qbVar.f44816a : null;
        Quantity quantity = (qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getQuantity();
        hf.b.C0259b result = new hf.b.C0259b(orderId, purchaseId, qbVar != null ? qbVar.f44817b : null, invoiceId, quantity, qbVar != null ? qbVar.f44820e : null, qbVar != null ? Boolean.valueOf(qbVar.f44823h) : null, qbVar != null ? qbVar.f44821f : null, ruStorePaymentException);
        o3 o3Var = (o3) this.f44877a.f45500e2.getValue();
        o3Var.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        o3Var.f44720a.a((hf) result, false);
    }
}
