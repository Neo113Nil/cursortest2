package ru.rustore.sdk.pay.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ProductPurchaseParams {

    @Nullable
    private final AppUserEmail appUserEmail;

    @Nullable
    private final AppUserId appUserId;

    @Nullable
    private final DeveloperPayload developerPayload;

    @Nullable
    private final OrderId orderId;

    @NotNull
    private final ProductId productId;

    @Nullable
    private final Quantity quantity;

    public ProductPurchaseParams(@NotNull ProductId productId, @Nullable Quantity quantity, @Nullable OrderId orderId, @Nullable DeveloperPayload developerPayload, @Nullable AppUserId appUserId, @Nullable AppUserEmail appUserEmail) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.productId = productId;
        this.quantity = quantity;
        this.orderId = orderId;
        this.developerPayload = developerPayload;
        this.appUserId = appUserId;
        this.appUserEmail = appUserEmail;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPurchaseParams)) {
            return false;
        }
        ProductPurchaseParams productPurchaseParams = (ProductPurchaseParams) obj;
        return Intrinsics.areEqual(this.productId, productPurchaseParams.productId) && Intrinsics.areEqual(this.quantity, productPurchaseParams.quantity) && Intrinsics.areEqual(this.orderId, productPurchaseParams.orderId) && Intrinsics.areEqual(this.developerPayload, productPurchaseParams.developerPayload) && Intrinsics.areEqual(this.appUserId, productPurchaseParams.appUserId);
    }

    @Nullable
    public final AppUserEmail getAppUserEmail() {
        return this.appUserEmail;
    }

    @Nullable
    public final AppUserId getAppUserId() {
        return this.appUserId;
    }

    @Nullable
    public final DeveloperPayload getDeveloperPayload() {
        return this.developerPayload;
    }

    @Nullable
    public final OrderId getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final ProductId getProductId() {
        return this.productId;
    }

    @Nullable
    public final Quantity getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int hashCode = this.productId.hashCode() * 31;
        Quantity quantity = this.quantity;
        int hashCode2 = (hashCode + (quantity != null ? quantity.hashCode() : 0)) * 31;
        OrderId orderId = this.orderId;
        int hashCode3 = (hashCode2 + (orderId != null ? orderId.hashCode() : 0)) * 31;
        DeveloperPayload developerPayload = this.developerPayload;
        int hashCode4 = (hashCode3 + (developerPayload != null ? developerPayload.hashCode() : 0)) * 31;
        AppUserId appUserId = this.appUserId;
        return hashCode4 + (appUserId != null ? appUserId.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ProductPurchaseParams(");
        sb.append("productId=" + this.productId + ", ");
        sb.append("quantity=" + this.quantity + ", ");
        sb.append("orderId=" + this.orderId + ", ");
        sb.append("developerPayload=" + this.developerPayload + ", ");
        sb.append("appUserId=" + this.appUserId + ", ");
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ ProductPurchaseParams(ProductId productId, Quantity quantity, OrderId orderId, DeveloperPayload developerPayload, AppUserId appUserId, AppUserEmail appUserEmail, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(productId, (i4 & 2) != 0 ? null : quantity, (i4 & 4) != 0 ? null : orderId, (i4 & 8) != 0 ? null : developerPayload, (i4 & 16) != 0 ? null : appUserId, (i4 & 32) != 0 ? null : appUserEmail);
    }
}
