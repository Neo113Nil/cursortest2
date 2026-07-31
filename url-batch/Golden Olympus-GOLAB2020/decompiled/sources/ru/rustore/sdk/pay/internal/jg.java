package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.d;
import ru.rustore.sdk.pay.internal.ne;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;

/* loaded from: classes3.dex */
public final class jg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ta f44379a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final xl f44380b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final q5 f44381c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final rj f44382d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final e f44383e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final pe f44384f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final y7 f44385g;

    public static final class a extends kotlin.jvm.internal.s implements Function1<i8, i8> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PurchaseId f44386a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jg f44387b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PurchaseId purchaseId, jg jgVar) {
            super(1);
            this.f44386a = purchaseId;
            this.f44387b = jgVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            i8 payment = (i8) obj;
            Intrinsics.checkNotNullParameter(payment, "payment");
            if (Intrinsics.areEqual(payment.f44317b, this.f44386a)) {
                return payment;
            }
            RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Invalid purchase id for purchase with new card", null, 2, null);
            y7 y7Var = this.f44387b.f44385g;
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            throw throwable;
        }
    }

    public jg(@NotNull e activePurchaseStateRepository, @NotNull q5 failureUrlRepository, @NotNull y7 logger, @NotNull ta paymentRepository, @NotNull pe purchaseEventRepository, @NotNull rj sdkThemeRepository, @NotNull xl successUrlRepository) {
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(successUrlRepository, "successUrlRepository");
        Intrinsics.checkNotNullParameter(failureUrlRepository, "failureUrlRepository");
        Intrinsics.checkNotNullParameter(sdkThemeRepository, "sdkThemeRepository");
        Intrinsics.checkNotNullParameter(activePurchaseStateRepository, "activePurchaseStateRepository");
        Intrinsics.checkNotNullParameter(purchaseEventRepository, "purchaseEventRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f44379a = paymentRepository;
        this.f44380b = successUrlRepository;
        this.f44381c = failureUrlRepository;
        this.f44382d = sdkThemeRepository;
        this.f44383e = activePurchaseStateRepository;
        this.f44384f = purchaseEventRepository;
        this.f44385g = logger;
    }

    @NotNull
    public final Single<i8> a(@NotNull PurchaseId purchaseId, @Nullable InvoiceId invoiceId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        e eVar = this.f44383e;
        d.b state = d.b.f43944a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        eVar.f43981a = state;
        if (invoiceId != null) {
            ne.e event = new ne.e(purchaseId, invoiceId);
            pe peVar = this.f44384f;
            peVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            oe oeVar = peVar.f44782a;
            oeVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            oeVar.f44732a.emit(event);
        }
        ta taVar = this.f44379a;
        this.f44380b.f45237a.getClass();
        Url successUrl = new Url("https://api.rustore.ru/payment/redirect/success");
        this.f44381c.f44811a.getClass();
        Url failureUrl = new Url("https://api.rustore.ru/payment/redirect/fail");
        SdkTheme sdkTheme = this.f44382d.f44931a.f44852a.get();
        Intrinsics.checkNotNullExpressionValue(sdkTheme, "currentTheme.get()");
        SdkTheme sdkTheme2 = sdkTheme;
        taVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(successUrl, "successUrl");
        Intrinsics.checkNotNullParameter(failureUrl, "failureUrl");
        Intrinsics.checkNotNullParameter(sdkTheme2, "sdkTheme");
        r8 r8Var = taVar.f45038a;
        r8Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(successUrl, "successUrl");
        Intrinsics.checkNotNullParameter(failureUrl, "failureUrl");
        Intrinsics.checkNotNullParameter(sdkTheme2, "sdkTheme");
        q9 q9Var = r8Var.f44894a;
        q9Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(successUrl, "successUrl");
        Intrinsics.checkNotNullParameter(failureUrl, "failureUrl");
        Intrinsics.checkNotNullParameter(sdkTheme2, "sdkTheme");
        return SingleMapKt.map(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(q9.a(q9Var, null, successUrl, failureUrl, null, sdkTheme2, "CARD", purchaseId, 9), new m9(q9Var.f44814a)), new n8(r8Var)), new pa(taVar.f45039b)), new a(purchaseId, this));
    }
}
