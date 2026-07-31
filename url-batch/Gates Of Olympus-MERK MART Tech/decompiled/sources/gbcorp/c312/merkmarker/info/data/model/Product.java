package gbcorp.c312.merkmarker.info.data.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Product.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006$"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/model/Product;", "", "id", "", "title", "", "description", "category", "Lgbcorp/c312/merkmarker/info/data/model/ProductCategory;", FirebaseAnalytics.Param.PRICE, "", "imageUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lgbcorp/c312/merkmarker/info/data/model/ProductCategory;DLjava/lang/String;)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getDescription", "getCategory", "()Lgbcorp/c312/merkmarker/info/data/model/ProductCategory;", "getPrice", "()D", "getImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Product {
    public static final int $stable = 0;
    private final ProductCategory category;
    private final String description;
    private final int id;
    private final String imageUrl;
    private final double price;
    private final String title;

    public static /* synthetic */ Product copy$default(Product product, int i, String str, String str2, ProductCategory productCategory, double d, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = product.id;
        }
        if ((i2 & 2) != 0) {
            str = product.title;
        }
        if ((i2 & 4) != 0) {
            str2 = product.description;
        }
        if ((i2 & 8) != 0) {
            productCategory = product.category;
        }
        if ((i2 & 16) != 0) {
            d = product.price;
        }
        if ((i2 & 32) != 0) {
            str3 = product.imageUrl;
        }
        String str4 = str3;
        double d2 = d;
        return product.copy(i, str, str2, productCategory, d2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final ProductCategory getCategory() {
        return this.category;
    }

    /* renamed from: component5, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Product copy(int id, String title, String description, ProductCategory category, double price, String imageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new Product(id, title, description, category, price, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return this.id == product.id && Intrinsics.areEqual(this.title, product.title) && Intrinsics.areEqual(this.description, product.description) && this.category == product.category && Double.compare(this.price, product.price) == 0 && Intrinsics.areEqual(this.imageUrl, product.imageUrl);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.category.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "Product(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", category=" + this.category + ", price=" + this.price + ", imageUrl=" + this.imageUrl + ")";
    }

    public Product(int i, String title, String description, ProductCategory category, double d, String imageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.id = i;
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = d;
        this.imageUrl = imageUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ProductCategory getCategory() {
        return this.category;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }
}
