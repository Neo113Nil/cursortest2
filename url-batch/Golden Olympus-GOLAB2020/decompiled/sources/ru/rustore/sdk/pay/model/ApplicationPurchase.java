package ru.rustore.sdk.pay.model;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ApplicationPurchase implements Purchase {

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
    private final PackageName packageName;

    @NotNull
    private final Price price;

    @NotNull
    private final PurchaseId purchaseId;

    @Nullable
    private final Date purchaseTime;

    @NotNull
    private final PurchaseType purchaseType;
    private final boolean sandbox;

    @NotNull
    private final ApplicationPurchaseStatus status;

    public ApplicationPurchase(@NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId, @Nullable OrderId orderId, @NotNull PurchaseType purchaseType, @NotNull ApplicationPurchaseStatus status, @NotNull Description description, @Nullable Date date, @NotNull Price price, @NotNull AmountLabel amountLabel, @NotNull Currency currency, @Nullable DeveloperPayload developerPayload, boolean z4, @NotNull PackageName packageName) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
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
        this.packageName = packageName;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationPurchase)) {
            return false;
        }
        ApplicationPurchase applicationPurchase = (ApplicationPurchase) obj;
        if (!Intrinsics.areEqual(getPurchaseId(), applicationPurchase.getPurchaseId()) || !Intrinsics.areEqual(this.packageName, applicationPurchase.packageName) || !Intrinsics.areEqual(getInvoiceId(), applicationPurchase.getInvoiceId()) || !Intrinsics.areEqual(getOrderId(), applicationPurchase.getOrderId()) || getPurchaseType() != applicationPurchase.getPurchaseType() || getStatus() != applicationPurchase.getStatus() || !Intrinsics.areEqual(getDescription(), applicationPurchase.getDescription())) {
            return false;
        }
        Date purchaseTime = getPurchaseTime();
        Long valueOf = purchaseTime != null ? Long.valueOf(purchaseTime.getTime()) : null;
        Date purchaseTime2 = applicationPurchase.getPurchaseTime();
        return Intrinsics.areEqual(valueOf, purchaseTime2 != null ? Long.valueOf(purchaseTime2.getTime()) : null) && Intrinsics.areEqual(getPrice(), applicationPurchase.getPrice()) && Intrinsics.areEqual(getAmountLabel(), applicationPurchase.getAmountLabel()) && Intrinsics.areEqual(getCurrency(), applicationPurchase.getCurrency()) && Intrinsics.areEqual(getDeveloperPayload(), applicationPurchase.getDeveloperPayload()) && getSandbox() == applicationPurchase.getSandbox();
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

    @NotNull
    public final PackageName getPackageName() {
        return this.packageName;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @NotNull
    public Price getPrice() {
        return this.price;
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

    @Override // ru.rustore.sdk.pay.model.Purchase
    public boolean getSandbox() {
        return this.sandbox;
    }

    public int hashCode() {
        int hashCode = (getInvoiceId().hashCode() + ((this.packageName.hashCode() + (getPurchaseId().hashCode() * 31)) * 31)) * 31;
        OrderId orderId = getOrderId();
        int hashCode2 = (getDescription().hashCode() + ((getPurchaseType().hashCode() + ((hashCode + (orderId != null ? orderId.hashCode() : 0)) * 31)) * 31)) * 31;
        Date purchaseTime = getPurchaseTime();
        int hashCode3 = (getStatus().hashCode() + ((getCurrency().hashCode() + ((getAmountLabel().hashCode() + ((getPrice().hashCode() + ((hashCode2 + (purchaseTime != null ? purchaseTime.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31;
        DeveloperPayload developerPayload = getDeveloperPayload();
        return Boolean.hashCode(getSandbox()) + ((hashCode3 + (developerPayload != null ? developerPayload.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Purchase(");
        sb.append("purchaseId=" + getPurchaseId() + ", ");
        sb.append("productId=" + this.packageName + ", ");
        sb.append("invoiceId=" + getInvoiceId() + ", ");
        sb.append("orderId=" + getOrderId() + ", ");
        sb.append("purchaseType=" + getPurchaseType() + ", ");
        sb.append("description=" + getDescription() + ", ");
        StringBuilder sb2 = new StringBuilder("purchaseTime=");
        Date purchaseTime = getPurchaseTime();
        sb2.append(purchaseTime != null ? Long.valueOf(purchaseTime.getTime()) : null);
        sb2.append(", ");
        sb.append(sb2.toString());
        sb.append("price=" + getPrice() + ", ");
        sb.append("amountLabel=" + getAmountLabel() + ", ");
        sb.append("currency=" + getCurrency() + ", ");
        sb.append("status=" + getStatus() + ", ");
        sb.append("developerPayload='" + getDeveloperPayload() + '\'');
        sb.append("sandbox='" + getSandbox() + '\'');
        sb.append(")");
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // ru.rustore.sdk.pay.model.Purchase
    @NotNull
    public ApplicationPurchaseStatus getStatus() {
        return this.status;
    }
}
