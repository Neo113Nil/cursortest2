package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.ApplicationPurchaseStatus;

/* loaded from: classes3.dex */
public final class p0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static ApplicationPurchaseStatus a(@NotNull String dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        switch (dto.hashCode()) {
            case -1031784143:
                if (dto.equals("CANCELLED")) {
                    return ApplicationPurchaseStatus.CANCELLED;
                }
                break;
            case -591252731:
                if (dto.equals("EXPIRED")) {
                    return ApplicationPurchaseStatus.EXPIRED;
                }
                break;
            case 2448076:
                if (dto.equals("PAID")) {
                    return ApplicationPurchaseStatus.PAID;
                }
                break;
            case 74702359:
                if (dto.equals("REFUNDED")) {
                    return ApplicationPurchaseStatus.REFUNDED;
                }
                break;
            case 174130302:
                if (dto.equals("REJECTED")) {
                    return ApplicationPurchaseStatus.REJECTED;
                }
                break;
            case 214856680:
                if (dto.equals("CONSUMED")) {
                    return ApplicationPurchaseStatus.CONSUMED;
                }
                break;
            case 518126018:
                if (dto.equals("REVERSED")) {
                    return ApplicationPurchaseStatus.REVERSED;
                }
                break;
            case 907287315:
                if (dto.equals("PROCESSING")) {
                    return ApplicationPurchaseStatus.PROCESSING;
                }
                break;
            case 1082532758:
                if (dto.equals("INVOICE_CREATED")) {
                    return ApplicationPurchaseStatus.INVOICE_CREATED;
                }
                break;
            case 1695619794:
                if (dto.equals("EXECUTING")) {
                    return ApplicationPurchaseStatus.EXECUTING;
                }
                break;
            case 1982485311:
                if (dto.equals("CONFIRMED")) {
                    return ApplicationPurchaseStatus.CONFIRMED;
                }
                break;
        }
        throw new IllegalStateException("invalid application purchase status");
    }
}
