package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.ProductType;

/* loaded from: classes3.dex */
public final class fc {
    @NotNull
    public static ProductType a(@NotNull String dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        int hashCode = dto.hashCode();
        if (hashCode != -1636482787) {
            if (hashCode != 318720611) {
                if (hashCode == 402682677 && dto.equals("NON_CONSUMABLE")) {
                    return ProductType.NON_CONSUMABLE_PRODUCT;
                }
            } else if (dto.equals("CONSUMABLE")) {
                return ProductType.CONSUMABLE_PRODUCT;
            }
        } else if (dto.equals("SUBSCRIPTION")) {
            return ProductType.SUBSCRIPTION;
        }
        throw new IllegalStateException("invalid product type, value:".concat(dto).toString());
    }
}
