package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.ai;
import ru.rustore.sdk.pay.internal.d;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.ne;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.internal.zi;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.Observable;
import ru.rustore.sdk.reactive.observable.ObservableFilterKt;
import ru.rustore.sdk.reactive.observable.ObservableMapKt;
import ru.rustore.sdk.reactive.observable.ObservableObserveOnKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeOnKt;
import ru.rustore.sdk.reactive.observable.ObservableTakeFirstKt;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.Subject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

@Metadata
/* loaded from: classes3.dex */
public final class rg extends V {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f44919e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final yj f44920a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList f44921b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateSubject<zi> f44922c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Subject<zi> f44923d;

    public static final class a extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable error = (Throwable) obj;
            Intrinsics.checkNotNullParameter(error, "error");
            rg rgVar = rg.this;
            String localizedMessage = error.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "Error occurred during payment by saved card";
            }
            rgVar.a((RuStorePaymentException) new RuStorePaymentException.RuStorePaymentCommonException(localizedMessage, null, 2, null));
            return Unit.f41027a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<j8, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PurchaseId f44926b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hf f44927c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PurchaseId purchaseId, hf hfVar) {
            super(1);
            this.f44926b = purchaseId;
            this.f44927c = hfVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            j8 paymentWithSavedCard = (j8) obj;
            Intrinsics.checkNotNullParameter(paymentWithSavedCard, "paymentWithSavedCard");
            ((qk) rg.this.f44920a.f45464W2.getValue()).a(new ua.c(this.f44926b));
            ((cn) rg.this.f44920a.f45480a2.getValue()).a(paymentWithSavedCard.f44368d);
            Url url = paymentWithSavedCard.f44365a;
            if (url != null) {
                MutableStateSubject<zi> mutableStateSubject = rg.this.f44922c;
                zi value = mutableStateSubject.getValue();
                if (value instanceof zi.a) {
                    f0 purchase = ((zi.a) value).f45367b;
                    Intrinsics.checkNotNullParameter(purchase, "purchase");
                    value = new zi.a(url, purchase);
                } else if (value instanceof zi.c) {
                    zi.c cVar = (zi.c) value;
                    qb purchase2 = cVar.f45370b;
                    dn dnVar = cVar.f45371c;
                    Intrinsics.checkNotNullParameter(purchase2, "purchase");
                    value = new zi.c(url, purchase2, dnVar);
                } else if (!(value instanceof zi.b)) {
                    throw new W1.m();
                }
                mutableStateSubject.setValue(value);
            } else {
                rg rgVar = rg.this;
                PurchaseId purchaseId = this.f44926b;
                hf hfVar = this.f44927c;
                c8 c8Var = (c8) rgVar.f44920a.f45459V1.getValue();
                c8Var.getClass();
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Observable create$default = Observable.Companion.create$default(Observable.Companion, null, new z7(c8Var, purchaseId), 1, null);
                Dispatchers dispatchers = Dispatchers.INSTANCE;
                rgVar.f44921b.add(ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(ObservableTakeFirstKt.takeFirst$default(ObservableMapKt.map(ObservableFilterKt.filter(ObservableSubscribeOnKt.subscribeOn(create$default, dispatchers.getIo()), new a8(c8Var)), new b8(c8Var)), 0, 1, null), dispatchers.getMain(), null, 2, null), new pg(rgVar), null, new qg(rgVar, hfVar), 2, null));
            }
            return Unit.f41027a;
        }
    }

    public rg() {
        zi ziVar;
        zi cVar;
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        this.f44920a = serviceLocator;
        y7 y7Var = (y7) serviceLocator.f45561q3.getValue();
        jn jnVar = (jn) serviceLocator.f45559q1.getValue();
        this.f44921b = new ArrayList();
        ru.rustore.sdk.pay.internal.a aVar = ((t5) serviceLocator.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = ((f6) serviceLocator.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            if (f0Var == null) {
                RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Could not retrieve application purchase details", null, 2, null);
                y7Var.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                u3.e.i(y7Var.f45263a, throwable, null, 2, null);
                a((RuStorePaymentException) throwable);
                ziVar = zi.b.f45368a;
            } else {
                cVar = new zi.a(null, f0Var);
                ziVar = cVar;
            }
        } else if (aVar instanceof a.b) {
            qb qbVar = ((y5) serviceLocator.f45520i2.getValue()).f45261a.f43860b.f44876a;
            if (qbVar == null) {
                RuStorePaymentException.RuStorePaymentCommonException throwable2 = new RuStorePaymentException.RuStorePaymentCommonException("Could not retrieve product purchase details", null, 2, null);
                y7Var.getClass();
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                u3.e.i(y7Var.f45263a, throwable2, null, 2, null);
                a((RuStorePaymentException) throwable2);
                ziVar = zi.b.f45368a;
            } else {
                cVar = new zi.c(null, qbVar, jnVar.a());
                ziVar = cVar;
            }
        } else {
            if (aVar != null) {
                throw new W1.m();
            }
            RuStorePaymentException.RuStorePayInvalidActivePurchase throwable3 = new RuStorePaymentException.RuStorePayInvalidActivePurchase("Invalid active purchase type on saved card screen", null, 2, null);
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable3, "throwable");
            u3.e.i(y7Var.f45263a, throwable3, null, 2, null);
            a((RuStorePaymentException) throwable3);
            ziVar = zi.b.f45368a;
        }
        MutableStateSubject<zi> mutableStateSubject = new MutableStateSubject<>(ziVar);
        this.f44922c = mutableStateSubject;
        this.f44923d = SubjectExtensionsKt.asSubject(mutableStateSubject);
    }

    public final void a(PurchaseId purchaseId, String cardBindingId, hf hfVar, InvoiceId invoiceId) {
        og ogVar = (og) this.f44920a.f45515h2.getValue();
        ogVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
        e eVar = ogVar.f44754d;
        d.b state = d.b.f43944a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        eVar.f43981a = state;
        ne.e event = new ne.e(purchaseId, invoiceId);
        pe peVar = ogVar.f44756f;
        peVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        oe oeVar = peVar.f44782a;
        oeVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        oeVar.f44732a.emit(event);
        ta taVar = ogVar.f44751a;
        ogVar.f44752b.f45237a.getClass();
        Url successUrl = new Url("https://api.rustore.ru/payment/redirect/success");
        ogVar.f44753c.f44811a.getClass();
        Url failureUrl = new Url("https://api.rustore.ru/payment/redirect/fail");
        SdkTheme sdkTheme = ogVar.f44755e.f44931a.f44852a.get();
        Intrinsics.checkNotNullExpressionValue(sdkTheme, "currentTheme.get()");
        SdkTheme sdkTheme2 = sdkTheme;
        taVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
        Intrinsics.checkNotNullParameter(successUrl, "successUrl");
        Intrinsics.checkNotNullParameter(failureUrl, "failureUrl");
        Intrinsics.checkNotNullParameter(sdkTheme2, "sdkTheme");
        r8 r8Var = taVar.f45038a;
        r8Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
        Intrinsics.checkNotNullParameter(successUrl, "successUrl");
        Intrinsics.checkNotNullParameter(failureUrl, "failureUrl");
        Intrinsics.checkNotNullParameter(sdkTheme2, "sdkTheme");
        q9 q9Var = r8Var.f44894a;
        q9Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
        Intrinsics.checkNotNullParameter(successUrl, "successUrl");
        Intrinsics.checkNotNullParameter(failureUrl, "failureUrl");
        Intrinsics.checkNotNullParameter(sdkTheme2, "sdkTheme");
        this.f44921b.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleMapKt.map(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(q9.a(q9Var, null, successUrl, failureUrl, cardBindingId, sdkTheme2, "CARD_BINDING", purchaseId, 1), new n9(q9Var.f44814a)), new o8(r8Var)), new qa(taVar.f45039b)), new ng(purchaseId, ogVar)), Dispatchers.INSTANCE.getMain()), new a(), new b(purchaseId, hfVar)));
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        ArrayList arrayList = this.f44921b;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((Disposable) obj).dispose();
        }
        yh yhVar = (yh) this.f44920a.f45506f3.getValue();
        xl successUrlRepository = yhVar.f45271a;
        q5 failureUrlRepository = yhVar.f45272b;
        e activePurchaseStateRepository = yhVar.f45273c;
        t5 getActivePurchaseUseCase = yhVar.f45274d;
        f6 getPurchaseApplicationUseCase = yhVar.f45275e;
        y5 getProductPurchaseUseCase = yhVar.f45276f;
        bi rejectPurchaseUseCase = yhVar.f45277g;
        zh router = yhVar.f45278h;
        xh analytics = yhVar.f45279i;
        bb postMessageFactory = yhVar.f45280j;
        y7 logger = yhVar.f45281k;
        Intrinsics.checkNotNullParameter(successUrlRepository, "successUrlRepository");
        Intrinsics.checkNotNullParameter(failureUrlRepository, "failureUrlRepository");
        Intrinsics.checkNotNullParameter(activePurchaseStateRepository, "activePurchaseStateRepository");
        Intrinsics.checkNotNullParameter(getActivePurchaseUseCase, "getActivePurchaseUseCase");
        Intrinsics.checkNotNullParameter(getPurchaseApplicationUseCase, "getPurchaseApplicationUseCase");
        Intrinsics.checkNotNullParameter(getProductPurchaseUseCase, "getProductPurchaseUseCase");
        Intrinsics.checkNotNullParameter(rejectPurchaseUseCase, "rejectPurchaseUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(postMessageFactory, "postMessageFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        ArrayList arrayList2 = new ArrayList();
        SubjectExtensionsKt.asSubject(new MutableStateSubject(ai.a.f43821a));
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            ((Disposable) obj2).dispose();
        }
        super.onCleared();
    }

    public final void a(RuStorePaymentException ruStorePaymentException) {
        ru.rustore.sdk.pay.internal.a aVar = ((t5) this.f44920a.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = ((f6) this.f44920a.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            hf.a.b result = new hf.a.b(f0Var != null ? f0Var.f44047a : null, f0Var != null ? f0Var.f44048b : null, f0Var != null ? f0Var.f44050d : null, ruStorePaymentException);
            mg mgVar = (mg) this.f44920a.f45471Y1.getValue();
            mgVar.getClass();
            Intrinsics.checkNotNullParameter(result, "result");
            mgVar.f44645a.a((hf) result, false);
            return;
        }
        if (aVar instanceof a.b) {
            a(((y5) this.f44920a.f45520i2.getValue()).f45261a.f43860b.f44876a, ruStorePaymentException);
        } else if (aVar == null) {
            a(null, ruStorePaymentException);
        }
    }

    public final void a(qb qbVar, RuStorePaymentException ruStorePaymentException) {
        ze zeVar;
        PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        OrderId orderId = qbVar != null ? qbVar.f44816a : null;
        Quantity quantity = (qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getQuantity();
        hf.b.C0259b result = new hf.b.C0259b(orderId, purchaseId, qbVar != null ? qbVar.f44817b : null, invoiceId, quantity, qbVar != null ? qbVar.f44820e : null, qbVar != null ? Boolean.valueOf(qbVar.f44823h) : null, qbVar != null ? qbVar.f44821f : null, ruStorePaymentException);
        mg mgVar = (mg) this.f44920a.f45471Y1.getValue();
        mgVar.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        mgVar.f44645a.a((hf) result, false);
    }
}
