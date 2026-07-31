package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.ProductPurchaseStatus;

/* loaded from: classes3.dex */
public final class cc {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static ProductPurchaseStatus a(@NotNull String dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        switch (dto.hashCode()) {
            case -1979189942:
                if (dto.equals("REFUNDING")) {
                    return ProductPurchaseStatus.REFUNDING;
                }
                break;
            case -1031784143:
                if (dto.equals("CANCELLED")) {
                    return ProductPurchaseStatus.CANCELLED;
                }
                break;
            case -591252731:
                if (dto.equals("EXPIRED")) {
                    return ProductPurchaseStatus.EXPIRED;
                }
                break;
            case 2448076:
                if (dto.equals("PAID")) {
                    return ProductPurchaseStatus.PAID;
                }
                break;
            case 74702359:
                if (dto.equals("REFUNDED")) {
                    return ProductPurchaseStatus.REFUNDED;
                }
                break;
            case 174130302:
                if (dto.equals("REJECTED")) {
                    return ProductPurchaseStatus.REJECTED;
                }
                break;
            case 518126018:
                if (dto.equals("REVERSED")) {
                    return ProductPurchaseStatus.REVERSED;
                }
                break;
            case 907287315:
                if (dto.equals("PROCESSING")) {
                    return ProductPurchaseStatus.PROCESSING;
                }
                break;
            case 1082532758:
                if (dto.equals("INVOICE_CREATED")) {
                    return ProductPurchaseStatus.INVOICE_CREATED;
                }
                break;
            case 1695619794:
                if (dto.equals("EXECUTING")) {
                    return ProductPurchaseStatus.EXECUTING;
                }
                break;
            case 1982485311:
                if (dto.equals("CONFIRMED")) {
                    return ProductPurchaseStatus.CONFIRMED;
                }
                break;
        }
        throw new IllegalStateException("invalid product purchase status");
    }
}
