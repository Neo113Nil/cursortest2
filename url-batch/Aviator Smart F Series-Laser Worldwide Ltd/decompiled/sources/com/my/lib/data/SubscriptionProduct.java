package com.my.lib.data;

import androidx.collection.a;

/* loaded from: classes4.dex */
public final class SubscriptionProduct {
    private final long expireAt;
    private final int productGrade;
    private final int productSource;
    private final int productType;
    private final int remainingNum;

    public SubscriptionProduct(int i8, int i9, int i10, int i11, long j8) {
        this.productSource = i8;
        this.productType = i9;
        this.productGrade = i10;
        this.remainingNum = i11;
        this.expireAt = j8;
    }

    public static /* synthetic */ SubscriptionProduct copy$default(SubscriptionProduct subscriptionProduct, int i8, int i9, int i10, int i11, long j8, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = subscriptionProduct.productSource;
        }
        if ((i12 & 2) != 0) {
            i9 = subscriptionProduct.productType;
        }
        int i13 = i9;
        if ((i12 & 4) != 0) {
            i10 = subscriptionProduct.productGrade;
        }
        int i14 = i10;
        if ((i12 & 8) != 0) {
            i11 = subscriptionProduct.remainingNum;
        }
        int i15 = i11;
        if ((i12 & 16) != 0) {
            j8 = subscriptionProduct.expireAt;
        }
        return subscriptionProduct.copy(i8, i13, i14, i15, j8);
    }

    public final int component1() {
        return this.productSource;
    }

    public final int component2() {
        return this.productType;
    }

    public final int component3() {
        return this.productGrade;
    }

    public final int component4() {
        return this.remainingNum;
    }

    public final long component5() {
        return this.expireAt;
    }

    public final SubscriptionProduct copy(int i8, int i9, int i10, int i11, long j8) {
        return new SubscriptionProduct(i8, i9, i10, i11, j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionProduct)) {
            return false;
        }
        SubscriptionProduct subscriptionProduct = (SubscriptionProduct) obj;
        return this.productSource == subscriptionProduct.productSource && this.productType == subscriptionProduct.productType && this.productGrade == subscriptionProduct.productGrade && this.remainingNum == subscriptionProduct.remainingNum && this.expireAt == subscriptionProduct.expireAt;
    }

    public final long getExpireAt() {
        return this.expireAt;
    }

    public final int getProductGrade() {
        return this.productGrade;
    }

    public final int getProductSource() {
        return this.productSource;
    }

    public final int getProductType() {
        return this.productType;
    }

    public final int getRemainingNum() {
        return this.remainingNum;
    }

    public int hashCode() {
        return a.a(this.expireAt) + ((this.remainingNum + ((this.productGrade + ((this.productType + (this.productSource * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SubscriptionProduct(productSource=" + this.productSource + ", productType=" + this.productType + ", productGrade=" + this.productGrade + ", remainingNum=" + this.remainingNum + ", expireAt=" + this.expireAt + ")";
    }
}
