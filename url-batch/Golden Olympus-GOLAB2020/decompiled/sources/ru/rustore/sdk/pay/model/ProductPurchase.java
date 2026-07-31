package ru.rustore.sdk.pay.model;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ProductPurchase implements Purchase {

    @NotNull
    private final AmountLabel amountLabel;

    @NotNull
    private final Currency currency;

    @NotNull
    private final Description description;

    @Nullable
    private final DeveloperPayload developerPayload;

    @NotNull
    private final InvoiceId invoiceId;

    @Nullable
    private final OrderId orderId;

    @NotNull
    private final Price price;

    @NotNull
    private final ProductId productId;

    @NotNull
    private final ProductType productType;

    @NotNull
    private final PurchaseId purchaseId;

    @Nullable
    private final Date purchaseTime;

    @NotNull
    private final PurchaseType purchaseType;

    @NotNull
    private final Quantity quantity;
    private final boolean sandbox;

    @NotNull
    private final ProductPurchaseStatus status;

    public ProductPurchase(@NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId, @Nullable OrderId orderId, @NotNull PurchaseType purchaseType, @NotNull ProductPurchaseStatus status, @NotNull Description description, @Nullable Date date, @NotNull Price price, @NotNull AmountLabel amountLabel, @NotNull Currency currency, @Nullable DeveloperPayload developerPayload, boolean z4, @NotNull ProductId productId, @NotNull Quantity quantity, @NotNull ProductType productType) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.purchaseId = purchaseId;
        this.invoiceId = invoiceId;
        this.orderId = orderId;
        this.purchaseType = purchaseType;
        this.status = status;
        this.description = description;
        this.purchaseTime = date;
        this.price = price;
        this.amountLabel = amountLabel;
        this.currency = currency;
        this.developerPayload = developerPayload;
        this.sandbox = z4;
        this.productId = productId;
        this.quantity = quantity;
        this.productType = productType;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPurchase)) {
            return false;
        }
        ProductPurchase productPurchase = (ProductPurchase) obj;
        if (!Intrinsics.areEqual(getPurchaseId(), productPurchase.getPurchaseId()) || !Intrinsics.areEqual(this.productId, productPurchase.productId) || !Intrinsics.areEqual(getInvoiceId(), productPurchase.getInvoiceId()) || !Intrinsics.areEqual(getOrderId(), productPurchase.getOrderId()) || getPurchaseType() != productPurchase.getPurchaseType() || getStatus() != productPurchase.getStatus() || this.productType != productPurchase.productType || !Intrinsics.areEqual(getDescription(), productPurchase.getDescription())) {
            return false;
        }
        Date purchaseTime = getPurchaseTime();
        Long valueOf = purchaseTime != null ? Long.valueOf(purchaseTime.getTime()) : null;
        Date purchaseTime2 = productPurchase.getPurchaseTime();
        return Intrinsics.areEqual(valueOf, purchaseTime2 != null ? Long.valueOf(purchaseTime2.getTime()) : null) && Intrinsics.areEqual(getPrice(), productPurchase.getPrice()) && Intrinsics.areEqual(getAmountLabel(), productPurchase.getAmountLabel()) && Intrinsics.areEqual(getCurrency(), productPurchase.getCurrency()) && Intrinsics.areEqual(this.quantity, productPurchase.quantity) && Intrinsics.areEqual(getDeveloperPayload(), productPurchase.getDeveloperPayload()) && getSandbox() == productPurchase.getSandbox();
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @NotNull
    public AmountLabel getAmountLabel() {
        return this.amountLabel;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @NotNull
    public Currency getCurrency() {
        return this.currency;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @NotNull
    public Description getDescription() {
        return this.description;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @Nullable
    public DeveloperPayload getDeveloperPayload() {
        return this.developerPayload;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @NotNull
    public InvoiceId getInvoiceId() {
        return this.invoiceId;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @Nullable
    public OrderId getOrderId() {
        return this.orderId;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @NotNull
    public Price getPrice() {
        return this.price;
    }

    @NotNull
    public final ProductId getProductId() {
        return this.productId;
    }

    @NotNull
    public final ProductType getProductType() {
        return this.productType;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @NotNull
    public PurchaseId getPurchaseId() {
        return this.purchaseId;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @Nullable
    public Date getPurchaseTime() {
        return this.purchaseTime;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @NotNull
    public PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    @NotNull
    public final Quantity getQuantity() {
        return this.quantity;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    public boolean getSandbox() {
        return this.sandbox;
    }

    public int hashCode() {
        int hashCode = (getInvoiceId().hashCode() + ((this.productId.hashCode() + (getPurchaseId().hashCode() * 31)) * 31)) * 31;
        OrderId orderId = getOrderId();
        int hashCode2 = (getDescription().hashCode() + ((this.productType.hashCode() + ((getPurchaseType().hashCode() + ((hashCode + (orderId != null ? orderId.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        Date purchaseTime = getPurchaseTime();
        int hashCode3 = (getStatus().hashCode() + ((this.quantity.hashCode() + ((getCurrency().hashCode() + ((getAmountLabel().hashCode() + ((getPrice().hashCode() + ((hashCode2 + (purchaseTime != null ? purchaseTime.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        DeveloperPayload developerPayload = getDeveloperPayload();
        return Boolean.hashCode(getSandbox()) + ((hashCode3 + (developerPayload != null ? developerPayload.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Purchase(");
        sb.append("purchaseId=" + getPurchaseId() + ", ");
        sb.append("productId=" + this.productId + ", ");
        sb.append("invoiceId=" + getInvoiceId() + ", ");
        sb.append("orderId=" + getOrderId() + ", ");
        sb.append("purchaseType=" + getPurchaseType() + ", ");
        sb.append("productType=" + this.productType + ", ");
        sb.append("description=" + getDescription() + ", ");
        StringBuilder sb2 = new StringBuilder("purchaseTime=");
        Date purchaseTime = getPurchaseTime();
        sb2.append(purchaseTime != null ? Long.valueOf(purchaseTime.getTime()) : null);
        sb2.append(", ");
        sb.append(sb2.toString());
        sb.append("price=" + getPrice() + ", ");
        sb.append("amountLabel=" + getAmountLabel() + ", ");
        sb.append("currency=" + getCurrency() + ", ");
        sb.append("quantity=" + this.quantity + ", ");
        sb.append("status=" + getStatus() + ", ");
        sb.append("developerPayload='" + getDeveloperPayload() + "', ");
        StringBuilder sb3 = new StringBuilder("sandbox=");
        sb3.append(getSandbox());
        sb.append(sb3.toString());
        sb.append(")");
        String sb4 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @NotNull
    public ProductPurchaseStatus getStatus() {
        return this.status;
    }
}
