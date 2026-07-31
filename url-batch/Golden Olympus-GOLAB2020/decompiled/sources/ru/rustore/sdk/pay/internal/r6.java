package ru.rustore.sdk.pay.internal;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s5 f44889a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final m f44890b;

    public r6(@NotNull s5 generalAnalyticsParametersFactory, @NotNull m analyticsSender) {
        Intrinsics.checkNotNullParameter(generalAnalyticsParametersFactory, "generalAnalyticsParametersFactory");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        this.f44889a = generalAnalyticsParametersFactory;
        this.f44890b = analyticsSender;
    }

    public final void a(@Nullable k kVar, @Nullable InvoiceId invoiceId, @Nullable PurchaseId purchaseId) {
        String value;
        String value2;
        String str;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f44889a.a());
        if (kVar != null && (str = kVar.f44406a) != null) {
        }
        if (invoiceId != null && (value2 = invoiceId.getValue()) != null) {
        }
        if (purchaseId != null && (value = purchaseId.getValue()) != null) {
            createMapBuilder.put("purchaseId", value);
        }
        this.f44890b.a("paySheetCancel", MapsKt.build(createMapBuilder));
    }
}
