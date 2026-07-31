package ru.rustore.sdk.pay.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class Product {

    @NotNull
    private final AmountLabel amountLabel;

    @NotNull
    private final Currency currency;

    @Nullable
    private final Description description;

    @NotNull
    private final Url imageUrl;

    @Nullable
    private final Price price;

    @NotNull
    private final ProductId productId;

    @Nullable
    private final Url promoImageUrl;

    @Nullable
    private final SubscriptionInfo subscriptionInfo;

    @NotNull
    private final Title title;

    @NotNull
    private final ProductType type;

    public Product(@NotNull ProductId productId, @NotNull ProductType type, @NotNull AmountLabel amountLabel, @Nullable Price price, @NotNull Currency currency, @NotNull Url imageUrl, @Nullable Url url, @NotNull Title title, @Nullable Description description, @Nullable SubscriptionInfo subscriptionInfo) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.productId = productId;
        this.type = type;
        this.amountLabel = amountLabel;
        this.price = price;
        this.currency = currency;
        this.imageUrl = imageUrl;
        this.promoImageUrl = url;
        this.title = title;
        this.description = description;
        this.subscriptionInfo = subscriptionInfo;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return Intrinsics.areEqual(this.productId, product.productId) && this.type == product.type && Intrinsics.areEqual(this.amountLabel, product.amountLabel) && Intrinsics.areEqual(this.price, product.price) && Intrinsics.areEqual(this.currency, product.currency) && Intrinsics.areEqual(this.imageUrl, product.imageUrl) && Intrinsics.areEqual(this.promoImageUrl, product.promoImageUrl) && Intrinsics.areEqual(this.title, product.title) && Intrinsics.areEqual(this.description, product.description) && Intrinsics.areEqual(this.subscriptionInfo, product.subscriptionInfo);
    }

    @NotNull
    public final AmountLabel getAmountLabel() {
        return this.amountLabel;
    }

    @NotNull
    public final Currency getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Description getDescription() {
        return this.description;
    }

    @NotNull
    public final Url getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    public final ProductId getProductId() {
        return this.productId;
    }

    @Nullable
    public final Url getPromoImageUrl() {
        return this.promoImageUrl;
    }

    @Nullable
    public final SubscriptionInfo getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    @NotNull
    public final Title getTitle() {
        return this.title;
    }

    @NotNull
    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.amountLabel.hashCode() + ((this.type.hashCode() + (this.productId.hashCode() * 31)) * 31)) * 31;
        Price price = this.price;
        int hashCode2 = (this.imageUrl.hashCode() + ((this.currency.hashCode() + ((hashCode + (price != null ? price.hashCode() : 0)) * 31)) * 31)) * 31;
        Url url = this.promoImageUrl;
        int hashCode3 = (this.title.hashCode() + ((hashCode2 + (url != null ? url.hashCode() : 0)) * 31)) * 31;
        Description description = this.description;
        int hashCode4 = (hashCode3 + (description != null ? description.hashCode() : 0)) * 31;
        SubscriptionInfo subscriptionInfo = this.subscriptionInfo;
        return hashCode4 + (subscriptionInfo != null ? subscriptionInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Product(");
        sb.append("productId=" + this.productId + ", ");
        sb.append("type=" + this.type + ", ");
        sb.append("amountLabel=" + this.amountLabel + ", ");
        sb.append("price=" + this.price + ", ");
        sb.append("currency=" + this.currency + ", ");
        sb.append("imageUrl=" + this.imageUrl + ", ");
        sb.append("promoImageUrl=" + this.promoImageUrl + ", ");
        sb.append("title=" + this.title + ", ");
        sb.append("description='" + this.description + "', ");
        StringBuilder sb2 = new StringBuilder("subscriptionInfo=");
        sb2.append(this.subscriptionInfo);
        sb.append(sb2.toString());
        sb.append(")");
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
