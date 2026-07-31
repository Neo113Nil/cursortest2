package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.PurchaseType;

/* loaded from: classes3.dex */
public final class yf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final y7 f45269a;

    public yf(@NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f45269a = logger;
    }

    @NotNull
    public final PurchaseType a(@NotNull String dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        int hashCode = dto.hashCode();
        if (hashCode != -1672385281) {
            if (hashCode != -1480392411) {
                if (hashCode == 1748463920 && dto.equals("UNDEFINED")) {
                    return PurchaseType.UNDEFINED;
                }
            } else if (dto.equals("ONE_STEP")) {
                return PurchaseType.ONE_STEP;
            }
        } else if (dto.equals("TWO_STEP")) {
            return PurchaseType.TWO_STEP;
        }
        IllegalArgumentException throwable = new IllegalArgumentException("Invalid purchase type: ".concat(dto));
        y7 y7Var = this.f45269a;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
