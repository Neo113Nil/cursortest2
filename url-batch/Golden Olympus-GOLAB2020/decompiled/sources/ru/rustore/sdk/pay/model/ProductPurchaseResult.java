package ru.rustore.sdk.pay.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ProductPurchaseResult {

    @NotNull
    private final InvoiceId invoiceId;

    @Nullable
    private final OrderId orderId;

    @NotNull
    private final ProductId productId;

    @NotNull
    private final ProductType productType;

    @NotNull
    private final PurchaseId purchaseId;

    @NotNull
    private final PurchaseType purchaseType;

    @NotNull
    private final Quantity quantity;
    private final boolean sandbox;

    public ProductPurchaseResult(@Nullable OrderId orderId, @NotNull PurchaseId purchaseId, @NotNull ProductId productId, @NotNull InvoiceId invoiceId, @NotNull PurchaseType purchaseType, @NotNull ProductType productType, @NotNull Quantity quantity, boolean z4) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.orderId = orderId;
        this.purchaseId = purchaseId;
        this.productId = productId;
        this.invoiceId = invoiceId;
        this.purchaseType = purchaseType;
        this.productType = productType;
        this.quantity = quantity;
        this.sandbox = z4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPurchaseResult)) {
            return false;
        }
        ProductPurchaseResult productPurchaseResult = (ProductPurchaseResult) obj;
        return Intrinsics.areEqual(this.orderId, productPurchaseResult.orderId) && Intrinsics.areEqual(this.purchaseId, productPurchaseResult.purchaseId) && Intrinsics.areEqual(this.productId, productPurchaseResult.productId) && Intrinsics.areEqual(this.invoiceId, productPurchaseResult.invoiceId) && this.purchaseType == productPurchaseResult.purchaseType && this.productType == productPurchaseResult.productType && Intrinsics.areEqual(this.quantity, productPurchaseResult.quantity) && this.sandbox == productPurchaseResult.sandbox;
    }

    @NotNull
    public final InvoiceId getInvoiceId() {
        return this.invoiceId;
    }

    @Nullable
    public final OrderId getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final ProductId getProductId() {
        return this.productId;
    }

    @NotNull
    public final ProductType getProductType() {
        return this.productType;
    }

    @NotNull
    public final PurchaseId getPurchaseId() {
        return this.purchaseId;
    }

    @NotNull
    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    @NotNull
    public final Quantity getQuantity() {
        return this.quantity;
    }

    public final boolean getSandbox() {
        return this.sandbox;
    }

    public int hashCode() {
        int hashCode = this.purchaseId.hashCode() * 31;
        OrderId orderId = this.orderId;
        return Boolean.hashCode(this.sandbox) + ((this.quantity.hashCode() + ((this.productType.hashCode() + ((this.purchaseType.hashCode() + ((this.invoiceId.hashCode() + ((this.productId.hashCode() + ((hashCode + (orderId != null ? orderId.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Purchase(");
        sb.append("orderId=" + this.orderId + ", ");
        sb.append("purchaseId=" + this.purchaseId + ", ");
        sb.append("productId=" + this.productId + ", ");
        sb.append("invoiceId=" + this.invoiceId + ", ");
        sb.append("purchaseType=" + this.purchaseType + ", ");
        sb.append("productType=" + this.productType + ", ");
        sb.append("quantity=" + this.quantity + ", ");
        sb.append("sandbox='" + this.sandbox + '\'');
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
