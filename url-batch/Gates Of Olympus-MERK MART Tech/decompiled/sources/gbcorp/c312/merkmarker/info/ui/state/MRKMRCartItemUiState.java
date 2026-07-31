package gbcorp.c312.merkmarker.info.ui.state;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMRCartItmeUiState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/state/MRKMRCartItemUiState;", "", "productId", "", "productTitle", "", "productPrice", "", FirebaseAnalytics.Param.QUANTITY, "productImageUrl", "<init>", "(ILjava/lang/String;DILjava/lang/String;)V", "getProductId", "()I", "getProductTitle", "()Ljava/lang/String;", "getProductPrice", "()D", "getQuantity", "getProductImageUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MRKMRCartItemUiState {
    public static final int $stable = 0;
    private final int productId;
    private final String productImageUrl;
    private final double productPrice;
    private final String productTitle;
    private final int quantity;

    public static /* synthetic */ MRKMRCartItemUiState copy$default(MRKMRCartItemUiState mRKMRCartItemUiState, int i, String str, double d, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mRKMRCartItemUiState.productId;
        }
        if ((i3 & 2) != 0) {
            str = mRKMRCartItemUiState.productTitle;
        }
        if ((i3 & 4) != 0) {
            d = mRKMRCartItemUiState.productPrice;
        }
        if ((i3 & 8) != 0) {
            i2 = mRKMRCartItemUiState.quantity;
        }
        if ((i3 & 16) != 0) {
            str2 = mRKMRCartItemUiState.productImageUrl;
        }
        double d2 = d;
        return mRKMRCartItemUiState.copy(i, str, d2, i2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductTitle() {
        return this.productTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final double getProductPrice() {
        return this.productPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final String getProductImageUrl() {
        return this.productImageUrl;
    }

    public final MRKMRCartItemUiState copy(int productId, String productTitle, double productPrice, int quantity, String productImageUrl) {
        Intrinsics.checkNotNullParameter(productTitle, "productTitle");
        return new MRKMRCartItemUiState(productId, productTitle, productPrice, quantity, productImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MRKMRCartItemUiState)) {
            return false;
        }
        MRKMRCartItemUiState mRKMRCartItemUiState = (MRKMRCartItemUiState) other;
        return this.productId == mRKMRCartItemUiState.productId && Intrinsics.areEqual(this.productTitle, mRKMRCartItemUiState.productTitle) && Double.compare(this.productPrice, mRKMRCartItemUiState.productPrice) == 0 && this.quantity == mRKMRCartItemUiState.quantity && Intrinsics.areEqual(this.productImageUrl, mRKMRCartItemUiState.productImageUrl);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.productId) * 31) + this.productTitle.hashCode()) * 31) + Double.hashCode(this.productPrice)) * 31) + Integer.hashCode(this.quantity)) * 31;
        String str = this.productImageUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MRKMRCartItemUiState(productId=" + this.productId + ", productTitle=" + this.productTitle + ", productPrice=" + this.productPrice + ", quantity=" + this.quantity + ", productImageUrl=" + this.productImageUrl + ")";
    }

    public MRKMRCartItemUiState(int i, String productTitle, double d, int i2, String str) {
        Intrinsics.checkNotNullParameter(productTitle, "productTitle");
        this.productId = i;
        this.productTitle = productTitle;
        this.productPrice = d;
        this.quantity = i2;
        this.productImageUrl = str;
    }

    public /* synthetic */ MRKMRCartItemUiState(int i, String str, double d, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, d, i2, (i3 & 16) != 0 ? null : str2);
    }

    public final int getProductId() {
        return this.productId;
    }

    public final String getProductTitle() {
        return this.productTitle;
    }

    public final double getProductPrice() {
        return this.productPrice;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getProductImageUrl() {
        return this.productImageUrl;
    }
}
