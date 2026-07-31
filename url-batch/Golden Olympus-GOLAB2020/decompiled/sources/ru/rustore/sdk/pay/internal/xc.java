package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;

/* loaded from: classes3.dex */
public final class xc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s5 f45222a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final m f45223b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45224a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            try {
                iArr[PurchaseType.ONE_STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseType.TWO_STEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseType.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45224a = iArr;
        }
    }

    public xc(@NotNull s5 generalAnalyticsParametersFactory, @NotNull m analyticsSender) {
        Intrinsics.checkNotNullParameter(generalAnalyticsParametersFactory, "generalAnalyticsParametersFactory");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        this.f45222a = generalAnalyticsParametersFactory;
        this.f45223b = analyticsSender;
    }

    public final void a(@Nullable String str, @NotNull k analyticsProductType, @NotNull InvoiceId invoiceId, @NotNull PurchaseId purchaseId, @NotNull ArrayList paymentMethods) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.toSet(paymentMethods), null, null, null, 0, null, yc.f45267a, 31, null);
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f45222a.a());
        if (str != null) {
        }
        wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        createMapBuilder.put("paymentMethods", joinToString$default);
        this.f45223b.a("PaySheetPaymentAvailableMethods", MapsKt.build(createMapBuilder));
    }

    public final void b(@NotNull k analyticsProductType, @NotNull InvoiceId invoiceId, @NotNull PurchaseId purchaseId, @NotNull s9 paymentMethod) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f45222a.a());
        wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        createMapBuilder.put("method_type", j.a(paymentMethod));
        this.f45223b.a("PaySheetPaymentProceed", MapsKt.build(createMapBuilder));
    }

    public final void a(@NotNull k analyticsProductType, @NotNull InvoiceId invoiceId, @NotNull PurchaseId purchaseId, @NotNull s9 paymentMethod) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f45222a.a());
        wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        createMapBuilder.put("method_type", j.a(paymentMethod));
        this.f45223b.a("PaySheetPaymentMethodSelect", MapsKt.build(createMapBuilder));
    }

    public final void a(@NotNull PurchaseType purchaseType, @NotNull k analyticsProductType, @NotNull InvoiceId invoiceId, @NotNull PurchaseId purchaseId) {
        String str;
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f45222a.a());
        wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        int i4 = a.f45224a[purchaseType.ordinal()];
        if (i4 == 1) {
            str = "1";
        } else if (i4 == 2) {
            str = "2";
        } else {
            if (i4 != 3) {
                throw new W1.m();
            }
            str = "0";
        }
        createMapBuilder.put("purchase_type_result", str);
        this.f45223b.a("paySheet.purchaseProduct.result", MapsKt.build(createMapBuilder));
    }

    public final void a(@NotNull k analyticsProductType, @NotNull InvoiceId invoiceId, @NotNull PurchaseId purchaseId) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f45222a.a());
        wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        this.f45223b.a("paySheetPaymentDetails.open", MapsKt.build(createMapBuilder));
    }
}
