package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
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
import ru.rustore.sdk.pay.internal.g;
import ru.rustore.sdk.pay.internal.h4;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.kd;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.pay.model.ProductPurchaseParams;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.Observable;
import ru.rustore.sdk.reactive.observable.ObservableObserveOnKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeOnKt;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleDoOnSuccessKt;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapErrorKt;
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
public final class ld extends V {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f44513g = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final yj f44514a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList f44515b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateSubject<kd> f44516c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateSubject f44517d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSubject<h3> f44518e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final Subject<h3> f44519f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final u8 f44520a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final qb f44521b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f44522c;

        public a(@NotNull u8 extras, @NotNull qb productPurchase, boolean z4) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
            this.f44520a = extras;
            this.f44521b = productPurchase;
            this.f44522c = z4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44520a, aVar.f44520a) && Intrinsics.areEqual(this.f44521b, aVar.f44521b) && this.f44522c == aVar.f44522c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f44522c) + ((this.f44521b.hashCode() + (this.f44520a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "ContentStateProductData(extras=" + this.f44520a + ", productPurchase=" + this.f44521b + ", userAuthorized=" + this.f44522c + ')';
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.s f44523a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Throwable, Unit> function1) {
            super(1);
            this.f44523a = (kotlin.jvm.internal.s) function1;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.s] */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable it = (Throwable) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f44523a.invoke(it);
            return Unit.f41027a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f44525b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f44526c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InvoiceId f44527d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, k kVar, InvoiceId invoiceId) {
            super(1);
            this.f44525b = str;
            this.f44526c = kVar;
            this.f44527d = invoiceId;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit it = (Unit) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            xc xcVar = (xc) ld.this.f44514a.f45375A2.getValue();
            String couponId = this.f44525b;
            k analyticsProductType = this.f44526c;
            InvoiceId invoiceId = this.f44527d;
            xcVar.getClass();
            Intrinsics.checkNotNullParameter(couponId, "couponId");
            Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.putAll(xcVar.f45222a.a());
            createMapBuilder.put("id_coupon", couponId);
            wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
            xcVar.f45223b.a("paySheetCouponSheet.deselect", MapsKt.build(createMapBuilder));
            return Unit.f41027a;
        }
    }

    public ld() {
        Single mapError;
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        this.f44514a = serviceLocator;
        ArrayList arrayList = new ArrayList();
        this.f44515b = arrayList;
        MutableStateSubject<kd> mutableStateSubject = new MutableStateSubject<>(kd.c.f44465a);
        this.f44516c = mutableStateSubject;
        this.f44517d = SubjectExtensionsKt.asStateSubject(mutableStateSubject);
        MutableSubject<h3> mutableSubject = new MutableSubject<>(0, 0, 3, null);
        this.f44518e = mutableSubject;
        this.f44519f = SubjectExtensionsKt.asSubject(mutableSubject);
        ru.rustore.sdk.pay.internal.a aVar = ((t5) serviceLocator.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            s4 s4Var = (s4) serviceLocator.f45431O1.getValue();
            PackageName packageName = ((a.C0255a) aVar).f43787a;
            s4Var.getClass();
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            o0 o0Var = s4Var.f44956a;
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            m7 m7Var = o0Var.f44714a;
            m7Var.getClass();
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            k0 k0Var = m7Var.f44637a;
            k0Var.getClass();
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Single from = Single.Companion.from(new j0(packageName));
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            arrayList.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleFlatMapKt.flatMap(SingleDoOnSuccessKt.doOnSuccess(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(from, dispatchers.getIo()), new i0(k0Var.f44407a)), new l7(m7Var)), new m0(o0Var)), new n0(o0Var)), new nd(this)), dispatchers.getMain()), new pd(this), new od(this)));
        } else if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            g gVar = bVar.f43789b;
            if (gVar instanceof g.a) {
                bc bcVar = (bc) serviceLocator.f45391E1.getValue();
                ProductPurchaseParams params = bVar.f43788a;
                g.a purchaseType = (g.a) gVar;
                bcVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
                t7 t7Var = bcVar.f43859a;
                t7Var.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
                wb wbVar = t7Var.f45036a;
                wbVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
                mapError = SingleMapErrorKt.mapError(SingleDoOnSuccessKt.doOnSuccess(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new vb(wbVar, params, purchaseType)), Dispatchers.INSTANCE.getIo()), new ub(wbVar.f45162a)), new s7(t7Var)), new yb(bcVar)), new zb(bcVar)), new ac(bcVar));
            } else {
                if (!(gVar instanceof f)) {
                    throw new W1.m();
                }
                pm pmVar = (pm) serviceLocator.f45395F1.getValue();
                ProductPurchaseParams params2 = bVar.f43788a;
                pmVar.getClass();
                Intrinsics.checkNotNullParameter(params2, "params");
                cm cmVar = pmVar.f44798a;
                cmVar.getClass();
                Intrinsics.checkNotNullParameter(params2, "params");
                jm jmVar = cmVar.f43937a;
                jmVar.getClass();
                Intrinsics.checkNotNullParameter(params2, "params");
                mapError = SingleMapErrorKt.mapError(SingleDoOnSuccessKt.doOnSuccess(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new im(jmVar, params2)), Dispatchers.INSTANCE.getIo()), new fm(jmVar.f44398a)), new bm(cmVar)), new mm(pmVar)), new nm(pmVar)), new om(pmVar));
            }
            arrayList.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleFlatMapKt.flatMap(mapError, new rd(this, bVar)), Dispatchers.INSTANCE.getMain()), new td(this), new sd(this)));
        } else {
            RuStorePaymentException.RuStorePayInvalidActivePurchase throwable = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found on purchase creation screen", null, 2, null);
            y7 y7Var = (y7) serviceLocator.f45561q3.getValue();
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            b(throwable);
        }
        Observable observe$default = Subject.DefaultImpls.observe$default(((d5) serviceLocator.f45415K1.getValue()).f43956a.f44767a, null, 1, null);
        Dispatchers dispatchers2 = Dispatchers.INSTANCE;
        arrayList.add(ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(ObservableSubscribeOnKt.subscribeOn(observe$default, dispatchers2.getIo()), dispatchers2.getMain(), null, 2, null), new ud(this), null, new vd(this), 2, null));
        arrayList.add(ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(ObservableSubscribeOnKt.subscribeOn(Subject.DefaultImpls.observe$default(((f7) serviceLocator.f45427N1.getValue()).f44058b, null, 1, null), dispatchers2.getIo()), dispatchers2.getMain(), null, 2, null), null, null, new wd(this), 3, null));
    }

    public final void a(String couponId, PurchaseId purchaseId, k kVar, InvoiceId invoiceId, Function1<? super Throwable, Unit> function1) {
        xm xmVar = (xm) this.f44514a.f45585v2.getValue();
        xmVar.getClass();
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        f4 f4Var = xmVar.f45238a;
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
        Single from = Single.Companion.from(new y3(couponId, b4Var, purchaseId));
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        this.f44515b.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleMapKt.map(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(from, dispatchers.getIo()), new a4(b4Var.f43852a)), new o7(p7Var)), new e4(f4Var)), new wm(xmVar)), dispatchers.getMain()), new b(function1), new c(couponId, kVar, invoiceId)));
    }

    public final void b() {
        kd.d dVar;
        s9 s9Var;
        s9 s9Var2;
        kd value = this.f44516c.getValue();
        if (value instanceof kd.a) {
            kd.a aVar = (kd.a) value;
            if (!(aVar.f44447b instanceof h4.c)) {
                s9 s9Var3 = aVar.f44451f;
                if (s9Var3 == null) {
                    return;
                }
                xc xcVar = (xc) this.f44514a.f45375A2.getValue();
                k kVar = k.APPLICATION;
                f0 f0Var = aVar.f44450e;
                xcVar.b(kVar, f0Var.f44048b, f0Var.f44047a, s9Var3);
                if (s9Var3 instanceof s9.b) {
                    this.f44516c.emit(kd.c.f44465a);
                    jg jgVar = (jg) this.f44514a.f45510g2.getValue();
                    f0 f0Var2 = aVar.f44450e;
                    this.f44515b.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(jgVar.a(f0Var2.f44047a, f0Var2.f44048b), Dispatchers.INSTANCE.getMain()), new zd(this), new ae(this)));
                    return;
                }
                if (s9Var3 instanceof s9.c) {
                    jd jdVar = (jd) this.f44514a.f45547o.getValue();
                    String cardBindingId = ((s9.c) s9Var3).f44975a;
                    jdVar.getClass();
                    Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
                    jdVar.f44374a.b(cardBindingId);
                    return;
                }
                if (s9Var3 instanceof s9.e) {
                    jd jdVar2 = (jd) this.f44514a.f45547o.getValue();
                    PurchaseId purchaseId = aVar.f44450e.f44047a;
                    jdVar2.getClass();
                    Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                    jdVar2.f44374a.a(purchaseId);
                    return;
                }
                if (s9Var3 instanceof s9.d) {
                    jd jdVar3 = (jd) this.f44514a.f45547o.getValue();
                    PurchaseId purchaseId2 = aVar.f44450e.f44047a;
                    jdVar3.getClass();
                    Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
                    jdVar3.f44374a.c(purchaseId2);
                    return;
                }
                if (s9Var3 instanceof s9.a) {
                    this.f44516c.emit(kd.c.f44465a);
                    cg cgVar = (cg) this.f44514a.f45601y3.getValue();
                    f0 f0Var3 = aVar.f44450e;
                    this.f44515b.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(cgVar.a(f0Var3.f44047a, f0Var3.f44048b), Dispatchers.INSTANCE.getMain()), new xd(this), new yd(this)));
                    return;
                }
                if (s9Var3 instanceof s9.f) {
                    RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Unsupported payment method: " + s9Var3, null, 2, null);
                    y7 y7Var = (y7) this.f44514a.f45561q3.getValue();
                    y7Var.getClass();
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    u3.e.i(y7Var.f45263a, throwable, null, 2, null);
                    a((Throwable) throwable);
                    return;
                }
                return;
            }
        }
        if (value instanceof kd.b) {
            kd.b bVar = (kd.b) value;
            if (!(bVar.f44455b instanceof h4.c) && (s9Var2 = bVar.f44459f) != null) {
                qb qbVar = bVar.f44458e;
                a(qbVar.f44818c, qbVar.f44819d, qbVar.f44821f, s9Var2);
                return;
            }
        }
        if (!(value instanceof kd.d) || (s9Var = (dVar = (kd.d) value).f44468c) == null) {
            return;
        }
        qb qbVar2 = dVar.f44467b;
        a(qbVar2.f44818c, qbVar2.f44819d, qbVar2.f44821f, s9Var);
    }

    public final void c() {
        kd value = this.f44516c.getValue();
        if (value instanceof kd.a) {
            xc xcVar = (xc) this.f44514a.f45375A2.getValue();
            kd.a aVar = (kd.a) value;
            h4 h4Var = aVar.f44447b;
            h4.d dVar = h4Var instanceof h4.d ? (h4.d) h4Var : null;
            String str = dVar != null ? dVar.f44216a.f43845a : null;
            k kVar = k.APPLICATION;
            f0 f0Var = aVar.f44450e;
            InvoiceId invoiceId = f0Var.f44048b;
            PurchaseId purchaseId = f0Var.f44047a;
            List<tm> list = aVar.f44446a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((tm) it.next()).f45048a);
            }
            xcVar.a(str, kVar, invoiceId, purchaseId, arrayList);
            return;
        }
        if (!(value instanceof kd.b)) {
            if (value instanceof kd.d) {
                xc xcVar2 = (xc) this.f44514a.f45375A2.getValue();
                kd.d dVar2 = (kd.d) value;
                k a4 = j.a(dVar2.f44467b.f44821f);
                qb qbVar = dVar2.f44467b;
                InvoiceId invoiceId2 = qbVar.f44819d;
                PurchaseId purchaseId2 = qbVar.f44818c;
                List<tm> list2 = dVar2.f44466a;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((tm) it2.next()).f45048a);
                }
                xcVar2.a(null, a4, invoiceId2, purchaseId2, arrayList2);
                return;
            }
            return;
        }
        xc xcVar3 = (xc) this.f44514a.f45375A2.getValue();
        kd.b bVar = (kd.b) value;
        h4 h4Var2 = bVar.f44455b;
        h4.d dVar3 = h4Var2 instanceof h4.d ? (h4.d) h4Var2 : null;
        String str2 = dVar3 != null ? dVar3.f44216a.f43845a : null;
        k a5 = j.a(bVar.f44458e.f44821f);
        qb qbVar2 = bVar.f44458e;
        InvoiceId invoiceId3 = qbVar2.f44819d;
        PurchaseId purchaseId3 = qbVar2.f44818c;
        List<tm> list3 = bVar.f44454a;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((tm) it3.next()).f45048a);
        }
        xcVar3.a(str2, a5, invoiceId3, purchaseId3, arrayList3);
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        ArrayList arrayList = this.f44515b;
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
        Url url = ((g7) this.f44514a.f45472Y2.getValue()).a();
        if (url != null) {
            jd jdVar = (jd) this.f44514a.f45547o.getValue();
            jdVar.getClass();
            Intrinsics.checkNotNullParameter(url, "url");
            jdVar.f44374a.c(url);
            return;
        }
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Auth url is null on purchase creation screen", null, 2, null);
        y7 y7Var = (y7) this.f44514a.f45561q3.getValue();
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        b(throwable);
    }

    public final void a(PurchaseId purchaseId, InvoiceId invoiceId, ProductType productType, s9 s9Var) {
        ((xc) this.f44514a.f45375A2.getValue()).b(j.a(productType), invoiceId, purchaseId, s9Var);
        if (s9Var instanceof s9.b) {
            this.f44516c.emit(kd.c.f44465a);
            this.f44515b.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(((jg) this.f44514a.f45510g2.getValue()).a(purchaseId, invoiceId), Dispatchers.INSTANCE.getMain()), new de(this), new ee(this, productType, invoiceId, purchaseId)));
            return;
        }
        if (s9Var instanceof s9.c) {
            jd jdVar = (jd) this.f44514a.f45547o.getValue();
            String cardBindingId = ((s9.c) s9Var).f44975a;
            jdVar.getClass();
            Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
            jdVar.f44374a.b(cardBindingId);
            return;
        }
        if (s9Var instanceof s9.e) {
            jd jdVar2 = (jd) this.f44514a.f45547o.getValue();
            jdVar2.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            jdVar2.f44374a.a(purchaseId);
            return;
        }
        if (s9Var instanceof s9.d) {
            jd jdVar3 = (jd) this.f44514a.f45547o.getValue();
            jdVar3.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            jdVar3.f44374a.c(purchaseId);
            return;
        }
        if (s9Var instanceof s9.a) {
            this.f44516c.emit(kd.c.f44465a);
            this.f44515b.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(((cg) this.f44514a.f45601y3.getValue()).a(purchaseId, invoiceId), Dispatchers.INSTANCE.getMain()), new be(this), new ce(this, productType, invoiceId, purchaseId)));
        } else if (s9Var instanceof s9.f) {
            RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Unsupported payment method: " + s9Var, null, 2, null);
            y7 y7Var = (y7) this.f44514a.f45561q3.getValue();
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            b(throwable);
        }
    }

    public final void b(Throwable th) {
        ze zeVar;
        if (th instanceof vm) {
            jd jdVar = (jd) this.f44514a.f45547o.getValue();
            Url url = ((vm) th).f45145a;
            jdVar.getClass();
            Intrinsics.checkNotNullParameter(url, "url");
            jdVar.f44374a.c(url);
            return;
        }
        kd value = this.f44516c.getValue();
        kd.b bVar = value instanceof kd.b ? (kd.b) value : null;
        qb qbVar = bVar != null ? bVar.f44458e : null;
        PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        OrderId orderId = qbVar != null ? qbVar.f44816a : null;
        Quantity quantity = (qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getQuantity();
        hf.b.C0259b purchaseResult = new hf.b.C0259b(orderId, purchaseId, qbVar != null ? qbVar.f44817b : null, invoiceId, quantity, qbVar != null ? qbVar.f44820e : null, qbVar != null ? Boolean.valueOf(qbVar.f44823h) : null, qbVar != null ? qbVar.f44821f : null, th);
        jd jdVar2 = (jd) this.f44514a.f45547o.getValue();
        jdVar2.getClass();
        Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
        jdVar2.f44374a.a((hf) purchaseResult, false);
    }

    public final void a(@NotNull s9 method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.areEqual(((f7) this.f44514a.f45427N1.getValue()).f44057a, method)) {
            f7 f7Var = (f7) this.f44514a.f45427N1.getValue();
            f7Var.f44057a = method;
            f7Var.f44058b.emit(method);
        }
        kd value = this.f44516c.getValue();
        if (value instanceof kd.a) {
            kd.a aVar = (kd.a) value;
            this.f44516c.setValue(kd.a.a(aVar, a(aVar.f44446a, method), null, null, method, !Intrinsics.areEqual(method, s9.a.f44973a), 94));
            xc xcVar = (xc) this.f44514a.f45375A2.getValue();
            k kVar = k.APPLICATION;
            f0 f0Var = aVar.f44450e;
            xcVar.a(kVar, f0Var.f44048b, f0Var.f44047a, method);
            return;
        }
        if (value instanceof kd.b) {
            kd.b bVar = (kd.b) value;
            boolean z4 = method instanceof s9.a;
            this.f44516c.setValue(kd.b.a(bVar, a(bVar.f44454a, method), null, null, method, (z4 || bVar.f44462i) ? false : true, z4 && bVar.f44462i, 1374));
            xc xcVar2 = (xc) this.f44514a.f45375A2.getValue();
            k a4 = j.a(bVar.f44458e.f44821f);
            qb qbVar = bVar.f44458e;
            xcVar2.a(a4, qbVar.f44819d, qbVar.f44818c, method);
            return;
        }
        if (value instanceof kd.d) {
            kd.d dVar = (kd.d) value;
            boolean z5 = method instanceof s9.a;
            this.f44516c.setValue(kd.d.a(dVar, a(dVar.f44466a, method), method, (z5 || dVar.f44471f) ? false : true, z5 && dVar.f44471f, false, 938));
            xc xcVar3 = (xc) this.f44514a.f45375A2.getValue();
            k a5 = j.a(dVar.f44467b.f44821f);
            qb qbVar2 = dVar.f44467b;
            xcVar3.a(a5, qbVar2.f44819d, qbVar2.f44818c, method);
            return;
        }
        Intrinsics.areEqual(value, kd.c.f44465a);
    }

    public final void a(Throwable th) {
        kd value = this.f44516c.getValue();
        kd.a aVar = value instanceof kd.a ? (kd.a) value : null;
        f0 f0Var = aVar != null ? aVar.f44450e : null;
        hf.a.b purchaseResult = new hf.a.b(f0Var != null ? f0Var.f44047a : null, f0Var != null ? f0Var.f44048b : null, f0Var != null ? f0Var.f44050d : null, th);
        jd jdVar = (jd) this.f44514a.f45547o.getValue();
        jdVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
        jdVar.f44374a.a((hf) purchaseResult, false);
    }

    public static ArrayList a(List list, s9 s9Var) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tm tmVar = (tm) it.next();
            boolean areEqual = Intrinsics.areEqual(tmVar.f45048a, s9Var);
            s9 paymentMethod = tmVar.f45048a;
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            arrayList.add(new tm(paymentMethod, areEqual));
        }
        return arrayList;
    }
}
