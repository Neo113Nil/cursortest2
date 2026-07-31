package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44898a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44899b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f44900c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f44901d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44902e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f44903f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f44904g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f44905h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f44906i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f44907j;

    /* renamed from: k, reason: collision with root package name */
    public final int f44908k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public final ob f44909l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final h7 f44910m;

    public rb(@NotNull String purchaseId, @NotNull String invoiceId, @Nullable String str, @NotNull String amountLabel, int i4, @NotNull String purchaseStatus, @NotNull String purchaseTime, @NotNull String productType, @NotNull String purchaseType, @Nullable String str2, int i5, @NotNull ob productInfo, @NotNull h7 metaInfoDto) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
        Intrinsics.checkNotNullParameter(purchaseStatus, "purchaseStatus");
        Intrinsics.checkNotNullParameter(purchaseTime, "purchaseTime");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(productInfo, "productInfo");
        Intrinsics.checkNotNullParameter(metaInfoDto, "metaInfoDto");
        this.f44898a = purchaseId;
        this.f44899b = invoiceId;
        this.f44900c = str;
        this.f44901d = amountLabel;
        this.f44902e = i4;
        this.f44903f = purchaseStatus;
        this.f44904g = purchaseTime;
        this.f44905h = productType;
        this.f44906i = purchaseType;
        this.f44907j = str2;
        this.f44908k = i5;
        this.f44909l = productInfo;
        this.f44910m = metaInfoDto;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb)) {
            return false;
        }
        rb rbVar = (rb) obj;
        return Intrinsics.areEqual(this.f44898a, rbVar.f44898a) && Intrinsics.areEqual(this.f44899b, rbVar.f44899b) && Intrinsics.areEqual(this.f44900c, rbVar.f44900c) && Intrinsics.areEqual(this.f44901d, rbVar.f44901d) && this.f44902e == rbVar.f44902e && Intrinsics.areEqual(this.f44903f, rbVar.f44903f) && Intrinsics.areEqual(this.f44904g, rbVar.f44904g) && Intrinsics.areEqual(this.f44905h, rbVar.f44905h) && Intrinsics.areEqual(this.f44906i, rbVar.f44906i) && Intrinsics.areEqual(this.f44907j, rbVar.f44907j) && this.f44908k == rbVar.f44908k && Intrinsics.areEqual(this.f44909l, rbVar.f44909l) && Intrinsics.areEqual(this.f44910m, rbVar.f44910m);
    }

    public final int hashCode() {
        int a4 = j1.a(this.f44899b, this.f44898a.hashCode() * 31, 31);
        String str = this.f44900c;
        int a5 = j1.a(this.f44906i, j1.a(this.f44905h, j1.a(this.f44904g, j1.a(this.f44903f, (Integer.hashCode(this.f44902e) + j1.a(this.f44901d, (a4 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31), 31), 31), 31);
        String str2 = this.f44907j;
        return Boolean.hashCode(this.f44910m.f44220a) + ((this.f44909l.hashCode() + ((Integer.hashCode(this.f44908k) + ((a5 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ProductPurchaseDto(purchaseId=" + this.f44898a + ", invoiceId=" + this.f44899b + ", orderId=" + this.f44900c + ", amountLabel=" + this.f44901d + ", amount=" + this.f44902e + ", purchaseStatus=" + this.f44903f + ", purchaseTime=" + this.f44904g + ", productType=" + this.f44905h + ", purchaseType=" + this.f44906i + ", developerPayload=" + this.f44907j + ", quantity=" + this.f44908k + ", productInfo=" + this.f44909l + ", metaInfoDto=" + this.f44910m + ')';
    }
}
