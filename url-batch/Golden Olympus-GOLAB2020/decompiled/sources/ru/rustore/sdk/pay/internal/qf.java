package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.pay.internal.d;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.j4;
import ru.rustore.sdk.pay.internal.o4;
import ru.rustore.sdk.pay.internal.of;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;
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
public final class qf extends V {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f44828f = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final yj f44829a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final hf f44830b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateSubject<of> f44831c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Subject<of> f44832d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public Disposable f44833e;

    public static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44834a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.f41027a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f44836b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InvoiceId f44837c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PurchaseId f44838d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, InvoiceId invoiceId, PurchaseId purchaseId) {
            super(1);
            this.f44836b = kVar;
            this.f44837c = invoiceId;
            this.f44838d = purchaseId;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit it = (Unit) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            jf jfVar = (jf) qf.this.f44829a.f45384C2.getValue();
            k analyticsProductType = this.f44836b;
            InvoiceId invoiceId = this.f44837c;
            PurchaseId purchaseId = this.f44838d;
            jfVar.getClass();
            Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.putAll(jfVar.f44376a.a());
            wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
            createMapBuilder.put("purchaseId", purchaseId.getValue());
            jfVar.f44377b.a("PAYMENTS_EXIT_TIMEOUT", MapsKt.build(createMapBuilder));
            s6 s6Var = ((nf) qf.this.f44829a.f45495d2.getValue()).f44701a.f44586b;
            if (s6Var != null) {
                s6Var.dismissAllowingStateLoss();
            }
            return Unit.f41027a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qf(hf hfVar) {
        Object eVar;
        Object bVar;
        Object eVar2;
        PurchaseType purchaseType;
        hf hfVar2;
        of value;
        ProductType productType;
        of value2;
        hf result = hfVar;
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f44829a = serviceLocator;
        this.f44830b = result;
        boolean z4 = ((((jn) serviceLocator.f45559q1.getValue()).f44400a.f43878d.f44190a.get() instanceof ak.b) || (((jn) serviceLocator.f45559q1.getValue()).f44400a.f43878d.f44190a.get() instanceof ak.c)) ? false : true;
        boolean z5 = ((i6) serviceLocator.f45416K2.getValue()).a().f45190a;
        boolean z6 = result instanceof hf.a.c;
        if (z6) {
            bVar = new of.c(((hf.a.c) result).f44243a, z5);
        } else if (result instanceof hf.b.c) {
            bVar = new of.f(((hf.b.c) result).f44256a, z4, z5, ((jn) serviceLocator.f45559q1.getValue()).a());
        } else if (result instanceof hf.a.b) {
            hf.a.b bVar2 = (hf.a.b) result;
            Throwable th = bVar2.f44242d;
            if (th instanceof m1) {
                bVar = new of.a(z5, ((m1) th).f44617a);
            } else {
                eVar = new of.b(bVar2, z5);
                bVar = eVar;
            }
        } else if (result instanceof hf.b.C0259b) {
            hf.b.C0259b c0259b = (hf.b.C0259b) result;
            Throwable th2 = c0259b.f44255i;
            if (th2 instanceof m1) {
                eVar2 = new of.d(z5, c0259b, ((m1) th2).f44617a, ((jn) serviceLocator.f45559q1.getValue()).a());
            } else {
                eVar2 = new of.e(c0259b, ((th2 instanceof RuStorePaymentException.RuStorePaymentNetworkException) && Intrinsics.areEqual(((RuStorePaymentException.RuStorePaymentNetworkException) th2).getCode(), "4010004")) ? false : true, z5, ((jn) serviceLocator.f45559q1.getValue()).a());
            }
            bVar = eVar2;
        } else if (result instanceof hf.a.C0258a) {
            IllegalStateException throwable = new IllegalStateException("Incorrect or unhandled type of purchase result: " + result);
            y7 y7Var = (y7) serviceLocator.f45561q3.getValue();
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            hf.a.C0258a c0258a = (hf.a.C0258a) result;
            bVar = new of.b(new hf.a.b(c0258a.f44237a, null, c0258a.f44238b, throwable), z5);
        } else {
            if (!(result instanceof hf.b.a)) {
                throw new W1.m();
            }
            IllegalStateException throwable2 = new IllegalStateException("Incorrect or unhandled type of purchase result: " + result);
            y7 y7Var2 = (y7) serviceLocator.f45561q3.getValue();
            y7Var2.getClass();
            Intrinsics.checkNotNullParameter(throwable2, "throwable");
            u3.e.i(y7Var2.f45263a, throwable2, null, 2, null);
            hf.b.a aVar = (hf.b.a) result;
            eVar = new of.e(new hf.b.C0259b(null, aVar.f44244a, null, null, null, aVar.f44245b, Boolean.valueOf(z5), aVar.f44246c, throwable2), true, z5, ((jn) serviceLocator.f45559q1.getValue()).a());
            bVar = eVar;
        }
        MutableStateSubject<of> mutableStateSubject = new MutableStateSubject<>(bVar);
        this.f44831c = mutableStateSubject;
        this.f44832d = SubjectExtensionsKt.asSubject(mutableStateSubject);
        if (result instanceof hf.b) {
            qb qbVar = ((y5) serviceLocator.f45520i2.getValue()).f45261a.f43860b.f44876a;
            if (qbVar != null) {
                purchaseType = qbVar.f44820e;
            }
            purchaseType = null;
        } else {
            if (!(result instanceof hf.a)) {
                throw new W1.m();
            }
            f0 f0Var = ((f6) serviceLocator.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            if (f0Var != null) {
                purchaseType = f0Var.f44050d;
            }
            purchaseType = null;
        }
        if (purchaseType != null) {
            if (result instanceof hf.b.c) {
                hfVar2 = new hf.b.c(qb.a(((hf.b.c) result).f44256a, purchaseType, null, 239));
            } else if (result instanceof hf.b.C0259b) {
                result = hf.b.C0259b.a((hf.b.C0259b) result, purchaseType, null, 479);
            } else if (result instanceof hf.b.a) {
                hf.b.a aVar2 = (hf.b.a) result;
                hfVar2 = new hf.b.a(aVar2.f44244a, purchaseType, aVar2.f44246c);
            } else if (z6) {
                hfVar2 = new hf.a.c(f0.a(((hf.a.c) result).f44243a, purchaseType, null, 23));
            } else if (result instanceof hf.a.b) {
                hf.a.b bVar3 = (hf.a.b) result;
                PurchaseId purchaseId = bVar3.f44240b;
                InvoiceId invoiceId = bVar3.f44241c;
                Throwable cause = bVar3.f44242d;
                Intrinsics.checkNotNullParameter(cause, "cause");
                hfVar2 = new hf.a.b(purchaseId, invoiceId, purchaseType, cause);
            } else if (result instanceof hf.a.C0258a) {
                hfVar2 = new hf.a.C0258a(((hf.a.C0258a) result).f44237a, purchaseType);
            }
            e eVar3 = (e) serviceLocator.f45460V2.getValue();
            d.a state = new d.a(hfVar2);
            eVar3.getClass();
            Intrinsics.checkNotNullParameter(state, "state");
            eVar3.f43981a = state;
            value = mutableStateSubject.getValue();
            if (!(value instanceof of.c)) {
                f0 applicationPurchase = ((of.c) value).f44737a;
                String a4 = a();
                jf jfVar = (jf) serviceLocator.f45384C2.getValue();
                jfVar.getClass();
                Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
                k kVar = k.APPLICATION;
                InvoiceId invoiceId2 = applicationPurchase.f44048b;
                PurchaseId purchaseId2 = applicationPurchase.f44047a;
                e0 e0Var = applicationPurchase.f44051e;
                jfVar.a(a4, kVar, invoiceId2, purchaseId2, null, e0Var.f43986e, e0Var.f43985d);
                a(kVar, applicationPurchase.f44048b, applicationPurchase.f44047a);
            } else if (value instanceof of.f) {
                qb productPurchase = ((of.f) value).f44747a;
                k analyticsProductType = j.a(productPurchase.f44821f);
                String a5 = a();
                jf jfVar2 = (jf) serviceLocator.f45384C2.getValue();
                jfVar2.getClass();
                Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
                Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                jfVar2.a(a5, analyticsProductType, productPurchase.f44819d, productPurchase.f44818c, productPurchase.f44816a, productPurchase.f44822g.a(), productPurchase.f44822g.b());
            } else if (value instanceof of.b) {
                jf jfVar3 = (jf) serviceLocator.f45384C2.getValue();
                k kVar2 = k.APPLICATION;
                of.b bVar4 = (of.b) value;
                hf.a.b bVar5 = bVar4.f44735a;
                jfVar3.a(kVar2, bVar5.f44241c, bVar5.f44240b, bVar5.f44242d.getMessage(), j.a(bVar4.f44735a.f44242d));
            } else if (value instanceof of.e) {
                qb qbVar2 = ((y5) serviceLocator.f45520i2.getValue()).f45261a.f43860b.f44876a;
                jf jfVar4 = (jf) serviceLocator.f45384C2.getValue();
                k a6 = (qbVar2 == null || (productType = qbVar2.f44821f) == null) ? null : j.a(productType);
                of.e eVar4 = (of.e) value;
                hf.b.C0259b c0259b2 = eVar4.f44743a;
                jfVar4.a(a6, c0259b2.f44248b, c0259b2.f44247a, c0259b2.f44255i.getMessage(), j.a(eVar4.f44743a.f44255i));
            }
            ((x2) serviceLocator.f45468X2.getValue()).f45198a.f45161a.f45124a = null;
            value2 = mutableStateSubject.getValue();
            if (!(value2 instanceof of.c)) {
                k kVar3 = k.APPLICATION;
                f0 f0Var2 = ((of.c) value2).f44737a;
                a(kVar3, f0Var2.f44048b, f0Var2.f44047a);
                return;
            } else {
                if (value2 instanceof of.f) {
                    of.f fVar = (of.f) value2;
                    if (fVar.f44748b) {
                        return;
                    }
                    k a7 = j.a(fVar.f44747a.f44821f);
                    qb qbVar3 = fVar.f44747a;
                    a(a7, qbVar3.f44819d, qbVar3.f44818c);
                    return;
                }
                return;
            }
        }
        hfVar2 = result;
        e eVar32 = (e) serviceLocator.f45460V2.getValue();
        d.a state2 = new d.a(hfVar2);
        eVar32.getClass();
        Intrinsics.checkNotNullParameter(state2, "state");
        eVar32.f43981a = state2;
        value = mutableStateSubject.getValue();
        if (!(value instanceof of.c)) {
        }
        ((x2) serviceLocator.f45468X2.getValue()).f45198a.f45161a.f45124a = null;
        value2 = mutableStateSubject.getValue();
        if (!(value2 instanceof of.c)) {
        }
    }

    public final String a() {
        Object obj;
        z4 value = ((d5) this.f44829a.f45415K1.getValue()).f43956a.f44767a.getValue();
        if (value == null) {
            return null;
        }
        o4 o4Var = value.f45311a;
        if (!(o4Var instanceof o4.a)) {
            if (o4Var instanceof o4.b) {
                if (((wj) CollectionsKt.firstOrNull((List) null)) == null) {
                    return null;
                }
                throw null;
            }
            if (o4Var instanceof o4.c ? true : o4Var instanceof o4.d) {
                return null;
            }
            throw new W1.m();
        }
        ArrayList arrayList = ((o4.a) o4Var).f44721a;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((b3) obj).f43849e instanceof j4.c) {
                break;
            }
        }
        b3 b3Var = (b3) obj;
        if (b3Var != null) {
            return b3Var.f43845a;
        }
        return null;
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        Disposable disposable = this.f44833e;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onCleared();
    }

    public final void a(k kVar, InvoiceId invoiceId, PurchaseId purchaseId) {
        Single delay$default = SingleDelayKt.delay$default(Single.Companion.from(a.f44834a), 3000L, null, 2, null);
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        this.f44833e = SingleSubscribeKt.subscribe$default(SingleObserveOnKt.observeOn(SingleSubscribeOnKt.subscribeOn(delay$default, dispatchers.getIo()), dispatchers.getMain()), null, new b(kVar, invoiceId, purchaseId), 1, null);
    }
}
