package ru.rustore.sdk.pay.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* loaded from: classes3.dex */
public final class x5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final j9 f45202a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final d5 f45203b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final fa f45204c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final f7 f45205d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final u f45206e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final rj f45207f;

    public static final class a extends kotlin.jvm.internal.s implements Function1<u8, u8> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            u8 paymentExtras = (u8) obj;
            Intrinsics.checkNotNullParameter(paymentExtras, "paymentExtras");
            z4 discount = paymentExtras.f45088c;
            if (discount != null) {
                d5 d5Var = x5.this.f45203b;
                d5Var.getClass();
                Intrinsics.checkNotNullParameter(discount, "discount");
                p2 p2Var = d5Var.f43956a;
                p2Var.getClass();
                Intrinsics.checkNotNullParameter(discount, "discount");
                p2Var.f44767a.emit(discount);
            }
            x5 x5Var = x5.this;
            List<s9> paymentMethods = paymentExtras.f45086a;
            u uVar = x5Var.f45206e;
            PackageName packageName = new PackageName("ru.sberbankmobile");
            uVar.getClass();
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            boolean z4 = uVar.f45051a.a(packageName).f44947a;
            s9.d dVar = s9.d.f44980a;
            if (paymentMethods.contains(dVar) && !z4) {
                paymentMethods = CollectionsKt.minus(paymentMethods, dVar);
            }
            fa faVar = x5.this.f45204c;
            faVar.getClass();
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            faVar.f44060a = paymentMethods;
            x5 x5Var2 = x5.this;
            s9 s9Var = paymentExtras.f45087b;
            x5Var2.getClass();
            if (!CollectionsKt.contains(paymentMethods, s9Var)) {
                s9Var = null;
            }
            f7 f7Var = x5.this.f45205d;
            f7Var.f44057a = s9Var;
            f7Var.f44058b.emit(s9Var);
            z4 z4Var = paymentExtras.f45088c;
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            return new u8(paymentMethods, s9Var, z4Var);
        }
    }

    public x5(@NotNull j9 paymentExtrasRepository, @NotNull d5 discountRepository, @NotNull fa paymentMethodsRepository, @NotNull f7 lastUsedPaymentMethodRepository, @NotNull u appInstallationStatusRepository, @NotNull rj sdkThemeRepository) {
        Intrinsics.checkNotNullParameter(paymentExtrasRepository, "paymentExtrasRepository");
        Intrinsics.checkNotNullParameter(discountRepository, "discountRepository");
        Intrinsics.checkNotNullParameter(paymentMethodsRepository, "paymentMethodsRepository");
        Intrinsics.checkNotNullParameter(lastUsedPaymentMethodRepository, "lastUsedPaymentMethodRepository");
        Intrinsics.checkNotNullParameter(appInstallationStatusRepository, "appInstallationStatusRepository");
        Intrinsics.checkNotNullParameter(sdkThemeRepository, "sdkThemeRepository");
        this.f45202a = paymentExtrasRepository;
        this.f45203b = discountRepository;
        this.f45204c = paymentMethodsRepository;
        this.f45205d = lastUsedPaymentMethodRepository;
        this.f45206e = appInstallationStatusRepository;
        this.f45207f = sdkThemeRepository;
    }

    @NotNull
    public final Single<u8> a(@NotNull PurchaseId purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        j9 j9Var = this.f45202a;
        SdkTheme sdkTheme = this.f45207f.f44931a.f44852a.get();
        Intrinsics.checkNotNullExpressionValue(sdkTheme, "currentTheme.get()");
        SdkTheme sdkTheme2 = sdkTheme;
        j9Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(sdkTheme2, "sdkTheme");
        x8 x8Var = j9Var.f44369a;
        x8Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(sdkTheme2, "sdkTheme");
        e9 e9Var = x8Var.f45210a;
        e9Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(sdkTheme2, "sdkTheme");
        return SingleMapKt.map(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new c9(sdkTheme2, purchaseId)), Dispatchers.INSTANCE.getIo()), new d9(e9Var.f44013a)), new w8(x8Var)), new i9(j9Var.f44370b)), new a());
    }
}
