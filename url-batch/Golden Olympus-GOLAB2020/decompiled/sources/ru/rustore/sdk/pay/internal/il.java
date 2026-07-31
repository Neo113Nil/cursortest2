package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.SubscriptionPurchaseStatus;

/* loaded from: classes3.dex */
public final class il {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final y7 f44349a;

    public il(@NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f44349a = logger;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final SubscriptionPurchaseStatus a(@NotNull String dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        switch (dto.hashCode()) {
            case -1941992146:
                if (dto.equals("PAUSED")) {
                    return SubscriptionPurchaseStatus.PAUSED;
                }
                break;
            case -1031784143:
                if (dto.equals("CANCELLED")) {
                    return SubscriptionPurchaseStatus.CANCELLED;
                }
                break;
            case -823723485:
                if (dto.equals("TERMINATED")) {
                    return SubscriptionPurchaseStatus.TERMINATED;
                }
                break;
            case -591252731:
                if (dto.equals("EXPIRED")) {
                    return SubscriptionPurchaseStatus.EXPIRED;
                }
                break;
            case 174130302:
                if (dto.equals("REJECTED")) {
                    return SubscriptionPurchaseStatus.REJECTED;
                }
                break;
            case 907287315:
                if (dto.equals("PROCESSING")) {
                    return SubscriptionPurchaseStatus.PROCESSING;
                }
                break;
            case 1082532758:
                if (dto.equals("INVOICE_CREATED")) {
                    return SubscriptionPurchaseStatus.INVOICE_CREATED;
                }
                break;
            case 1925346054:
                if (dto.equals("ACTIVE")) {
                    return SubscriptionPurchaseStatus.ACTIVE;
                }
                break;
            case 1990776172:
                if (dto.equals("CLOSED")) {
                    return SubscriptionPurchaseStatus.CLOSED;
                }
                break;
        }
        IllegalArgumentException throwable = new IllegalArgumentException("Invalid subscription purchase status: ".concat(dto));
        y7 y7Var = this.f44349a;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
