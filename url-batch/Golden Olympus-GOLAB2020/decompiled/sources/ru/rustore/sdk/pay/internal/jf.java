package ru.rustore.sdk.pay.internal;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.Price;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class jf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s5 f44376a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final m f44377b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final wa f44378c;

    public jf(@NotNull s5 generalAnalyticsParametersFactory, @NotNull m analyticsSender, @NotNull wa paymentTypeRepository) {
        Intrinsics.checkNotNullParameter(generalAnalyticsParametersFactory, "generalAnalyticsParametersFactory");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        Intrinsics.checkNotNullParameter(paymentTypeRepository, "paymentTypeRepository");
        this.f44376a = generalAnalyticsParametersFactory;
        this.f44377b = analyticsSender;
        this.f44378c = paymentTypeRepository;
    }

    public final void a(String str, k kVar, InvoiceId invoiceId, PurchaseId purchaseId, OrderId orderId, Price price, Price price2) {
        String str2;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f44376a.a());
        wc.a(createMapBuilder, "rustore_payment", kVar.f44406a, invoiceId, "invoiceId");
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        createMapBuilder.put("invoice_amount_current", String.valueOf(price.getValue()));
        createMapBuilder.put("invoice_order_amount", String.valueOf(price2.getValue()));
        if (str != null) {
        }
        if (orderId != null) {
        }
        ua uaVar = this.f44378c.f45161a.f45124a;
        if (uaVar instanceof ua.b) {
            str2 = "new_card";
        } else if (uaVar instanceof ua.e) {
            str2 = "sbp";
        } else if (uaVar instanceof ua.c) {
            str2 = "vk_id";
        } else if (uaVar instanceof ua.d) {
            str2 = "sberpay";
        } else if (uaVar instanceof ua.a) {
            str2 = "mobile";
        } else {
            if (uaVar != null) {
                throw new W1.m();
            }
            str2 = null;
        }
        if (str2 != null) {
            createMapBuilder.put("method_type", str2);
        }
        this.f44377b.a("paySheetPaymentSuccess", MapsKt.build(createMapBuilder));
    }

    public final void b(@Nullable k kVar, @Nullable InvoiceId invoiceId, @Nullable PurchaseId purchaseId) {
        String value;
        String value2;
        String str;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f44376a.a());
        if (kVar != null && (str = kVar.f44406a) != null) {
        }
        if (invoiceId != null && (value2 = invoiceId.getValue()) != null) {
        }
        if (purchaseId != null && (value = purchaseId.getValue()) != null) {
            createMapBuilder.put("purchaseId", value);
        }
        this.f44377b.a("PaySheetPaymentAgain", MapsKt.build(createMapBuilder));
    }

    public final void a(@Nullable k kVar, @Nullable InvoiceId invoiceId, @Nullable PurchaseId purchaseId, @Nullable String str, @NotNull String errorType) {
        String value;
        String value2;
        String str2;
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f44376a.a());
        if (str == null) {
            str = "";
        }
        createMapBuilder.put("error_message", str);
        createMapBuilder.put("error_type", errorType);
        if (kVar != null && (str2 = kVar.f44406a) != null) {
        }
        if (invoiceId != null && (value2 = invoiceId.getValue()) != null) {
        }
        if (purchaseId != null && (value = purchaseId.getValue()) != null) {
            createMapBuilder.put("purchaseId", value);
        }
        this.f44377b.a("paySheetError", MapsKt.build(createMapBuilder));
    }

    public final void a(@Nullable k kVar, @Nullable InvoiceId invoiceId, @Nullable PurchaseId purchaseId) {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f44376a.a());
        if (kVar != null) {
        }
        if (invoiceId != null) {
        }
        if (purchaseId != null) {
            createMapBuilder.put("purchaseId", purchaseId.getValue());
        }
        this.f44377b.a("paySheetAccount.click", MapsKt.build(createMapBuilder));
    }
}
