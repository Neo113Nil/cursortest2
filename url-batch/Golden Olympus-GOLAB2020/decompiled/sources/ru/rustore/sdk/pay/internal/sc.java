package ru.rustore.sdk.pay.internal;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.pay.callback.PurchaseEventListener;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.presentation.ui.PayActivity;
import ru.rustore.sdk.pay.model.AppUserEmail;
import ru.rustore.sdk.pay.model.PreferredPurchaseType;
import ru.rustore.sdk.pay.model.ProductPurchaseParams;
import ru.rustore.sdk.pay.model.ProductPurchaseResult;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.Observable;
import ru.rustore.sdk.reactive.observable.ObservableMapKt;
import ru.rustore.sdk.reactive.observable.ObservableObserveOnKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeOnKt;
import ru.rustore.sdk.reactive.observable.ObservableTakeFirstKt;
import ru.rustore.sdk.reactive.subject.Subject;

/* loaded from: classes3.dex */
public final class sc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final g6 f44983a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final h6 f44984b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final c7 f44985c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final z2 f44986d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final u2 f44987e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final pk f44988f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final d8 f44989g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final w2 f44990h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final y f44991i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final rj f44992j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public final g8 f44993k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public final vc f44994l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final pe f44995m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public final y7 f44996n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public final g1 f44997o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    public final kn f44998p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public Disposable f44999q;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45000a;

        static {
            int[] iArr = new int[PreferredPurchaseType.values().length];
            try {
                iArr[PreferredPurchaseType.ONE_STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferredPurchaseType.TWO_STEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45000a = iArr;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<hf, ProductPurchaseResult> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            hf purchaseResult = (hf) obj;
            Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
            if (purchaseResult instanceof hf.b.c) {
                hf.b.c cVar = (hf.b.c) purchaseResult;
                qb qbVar = cVar.f44256a;
                return new ProductPurchaseResult(qbVar.f44816a, qbVar.f44818c, qbVar.f44817b, qbVar.f44819d, qbVar.f44820e, qbVar.f44821f, qbVar.f44822g.getQuantity(), cVar.f44256a.f44823h);
            }
            if (purchaseResult instanceof hf.b.a) {
                hf.b.a aVar = (hf.b.a) purchaseResult;
                throw new RuStorePaymentException.ProductPurchaseCancelled(aVar.f44244a, aVar.f44245b, aVar.f44246c);
            }
            if (!(purchaseResult instanceof hf.b.C0259b)) {
                String concat = "Incorrect type of purchase result: ".concat(purchaseResult.getClass().getSimpleName());
                Intrinsics.checkNotNullExpressionValue(concat, "StringBuilder().apply(builderAction).toString()");
                RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException(concat, null, 2, null);
                y7 y7Var = sc.this.f44996n;
                y7Var.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                u3.e.i(y7Var.f45263a, throwable, null, 2, null);
                throw throwable;
            }
            hf.b.C0259b c0259b = (hf.b.C0259b) purchaseResult;
            throw new RuStorePaymentException.ProductPurchaseException(c0259b.f44249c, c0259b.f44247a, c0259b.f44251e, c0259b.f44248b, c0259b.f44250d, c0259b.f44252f, c0259b.f44254h, c0259b.f44253g, c0259b.f44255i);
        }
    }

    public sc(@NotNull g6 getPurchaseUseCase, @NotNull h6 getPurchasesListUseCase, @NotNull c7 isPurchasesAvailableUseCase, @NotNull z2 confirmTwoStepProductPurchaseUseCase, @NotNull u2 cancelTwoStepProductPurchaseUseCase, @NotNull pk setActivePurchaseUseCase, @NotNull d8 observePurchaseResultUseCase, @NotNull w2 clearPaymentOperationIdUseCase, @NotNull y appUserEmailRepository, @NotNull rj sdkThemeRepository, @NotNull g8 payActivityNavigator, @NotNull vc analytics, @NotNull pe purchaseEventRepository, @NotNull y7 logger, @NotNull g1 backUrlRepository, @NotNull kn validateDeeplinkSchemeUseCase) {
        Intrinsics.checkNotNullParameter(getPurchaseUseCase, "getPurchaseUseCase");
        Intrinsics.checkNotNullParameter(getPurchasesListUseCase, "getPurchasesListUseCase");
        Intrinsics.checkNotNullParameter(isPurchasesAvailableUseCase, "isPurchasesAvailableUseCase");
        Intrinsics.checkNotNullParameter(confirmTwoStepProductPurchaseUseCase, "confirmTwoStepProductPurchaseUseCase");
        Intrinsics.checkNotNullParameter(cancelTwoStepProductPurchaseUseCase, "cancelTwoStepProductPurchaseUseCase");
        Intrinsics.checkNotNullParameter(setActivePurchaseUseCase, "setActivePurchaseUseCase");
        Intrinsics.checkNotNullParameter(observePurchaseResultUseCase, "observePurchaseResultUseCase");
        Intrinsics.checkNotNullParameter(clearPaymentOperationIdUseCase, "clearPaymentOperationIdUseCase");
        Intrinsics.checkNotNullParameter(appUserEmailRepository, "appUserEmailRepository");
        Intrinsics.checkNotNullParameter(sdkThemeRepository, "sdkThemeRepository");
        Intrinsics.checkNotNullParameter(payActivityNavigator, "payActivityNavigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(purchaseEventRepository, "purchaseEventRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(backUrlRepository, "backUrlRepository");
        Intrinsics.checkNotNullParameter(validateDeeplinkSchemeUseCase, "validateDeeplinkSchemeUseCase");
        this.f44983a = getPurchaseUseCase;
        this.f44984b = getPurchasesListUseCase;
        this.f44985c = isPurchasesAvailableUseCase;
        this.f44986d = confirmTwoStepProductPurchaseUseCase;
        this.f44987e = cancelTwoStepProductPurchaseUseCase;
        this.f44988f = setActivePurchaseUseCase;
        this.f44989g = observePurchaseResultUseCase;
        this.f44990h = clearPaymentOperationIdUseCase;
        this.f44991i = appUserEmailRepository;
        this.f44992j = sdkThemeRepository;
        this.f44993k = payActivityNavigator;
        this.f44994l = analytics;
        this.f44995m = purchaseEventRepository;
        this.f44996n = logger;
        this.f44997o = backUrlRepository;
        this.f44998p = validateDeeplinkSchemeUseCase;
    }

    public final Task<ProductPurchaseResult> a(ProductPurchaseParams productPurchaseParams, g gVar, SdkTheme sdkTheme, PurchaseEventListener purchaseEventListener) {
        ma maVar = this.f44990h.f45149a.f44684a;
        synchronized (maVar) {
            maVar.f44639a = null;
        }
        Disposable disposable = this.f44999q;
        if (disposable != null) {
            disposable.dispose();
        }
        if (purchaseEventListener != null) {
            Observable observe$default = Subject.DefaultImpls.observe$default(this.f44995m.f44782a.f44732a, null, 1, null);
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            this.f44999q = ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(ObservableSubscribeOnKt.subscribeOn(observe$default, dispatchers.getIo()), dispatchers.getTrampoline(), null, 2, null), null, null, new uc(purchaseEventListener), 3, null);
        } else {
            this.f44999q = null;
        }
        pk pkVar = this.f44988f;
        a.b purchase = new a.b(productPurchaseParams, gVar);
        pkVar.getClass();
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        c cVar = pkVar.f44789a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        ru.rustore.sdk.pay.internal.b bVar = cVar.f43892a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        bVar.f43838a = purchase;
        AppUserEmail email = productPurchaseParams.getAppUserEmail();
        if (email != null) {
            y yVar = this.f44991i;
            yVar.getClass();
            Intrinsics.checkNotNullParameter(email, "email");
            yVar.f45249a = email;
        }
        rj rjVar = this.f44992j;
        rjVar.getClass();
        Intrinsics.checkNotNullParameter(sdkTheme, "theme");
        qj qjVar = rjVar.f44931a;
        qjVar.getClass();
        Intrinsics.checkNotNullParameter(sdkTheme, "theme");
        qjVar.f44852a.set(sdkTheme);
        g8 g8Var = this.f44993k;
        g8Var.getClass();
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        Context context = g8Var.f44163a;
        int i4 = PayActivity.f44804a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        Intent intent = new Intent(context, (Class<?>) PayActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("SDK_THEME_TAG", sdkTheme);
        context.startActivity(intent);
        return dh.a(ObservableMapKt.map(ObservableTakeFirstKt.takeFirst$default(ObservableSubscribeOnKt.subscribeOn(Subject.DefaultImpls.observe$default(this.f44989g.f43959a.f44644a.f44479a, null, 1, null), Dispatchers.INSTANCE.getIo()), 0, 1, null), new b()));
    }
}
