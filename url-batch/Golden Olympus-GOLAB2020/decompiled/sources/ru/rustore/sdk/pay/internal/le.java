package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class le {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44528a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44529b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f44530c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f44531d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f44532e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f44533f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f44534g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f44535h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44536i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f44537j;

    /* renamed from: k, reason: collision with root package name */
    public final int f44538k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f44539l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f44540m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public final String f44541n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public final h7 f44542o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public final hl f44543p;

    public le(@NotNull String purchaseId, @NotNull String productId, @NotNull String invoiceId, @Nullable String str, @NotNull String purchaseType, @NotNull String productType, @NotNull String description, @NotNull String amountLabel, int i4, @NotNull String currency, int i5, @NotNull String purchaseStatus, @NotNull String purchaseTime, @Nullable String str2, @NotNull h7 metaInfoDto, @Nullable hl hlVar) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(purchaseStatus, "purchaseStatus");
        Intrinsics.checkNotNullParameter(purchaseTime, "purchaseTime");
        Intrinsics.checkNotNullParameter(metaInfoDto, "metaInfoDto");
        this.f44528a = purchaseId;
        this.f44529b = productId;
        this.f44530c = invoiceId;
        this.f44531d = str;
        this.f44532e = purchaseType;
        this.f44533f = productType;
        this.f44534g = description;
        this.f44535h = amountLabel;
        this.f44536i = i4;
        this.f44537j = currency;
        this.f44538k = i5;
        this.f44539l = purchaseStatus;
        this.f44540m = purchaseTime;
        this.f44541n = str2;
        this.f44542o = metaInfoDto;
        this.f44543p = hlVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le)) {
            return false;
        }
        le leVar = (le) obj;
        return Intrinsics.areEqual(this.f44528a, leVar.f44528a) && Intrinsics.areEqual(this.f44529b, leVar.f44529b) && Intrinsics.areEqual(this.f44530c, leVar.f44530c) && Intrinsics.areEqual(this.f44531d, leVar.f44531d) && Intrinsics.areEqual(this.f44532e, leVar.f44532e) && Intrinsics.areEqual(this.f44533f, leVar.f44533f) && Intrinsics.areEqual(this.f44534g, leVar.f44534g) && Intrinsics.areEqual(this.f44535h, leVar.f44535h) && this.f44536i == leVar.f44536i && Intrinsics.areEqual(this.f44537j, leVar.f44537j) && this.f44538k == leVar.f44538k && Intrinsics.areEqual(this.f44539l, leVar.f44539l) && Intrinsics.areEqual(this.f44540m, leVar.f44540m) && Intrinsics.areEqual(this.f44541n, leVar.f44541n) && Intrinsics.areEqual(this.f44542o, leVar.f44542o) && Intrinsics.areEqual(this.f44543p, leVar.f44543p);
    }

    public final int hashCode() {
        int a4 = j1.a(this.f44530c, j1.a(this.f44529b, this.f44528a.hashCode() * 31, 31), 31);
        String str = this.f44531d;
        int a5 = j1.a(this.f44540m, j1.a(this.f44539l, (Integer.hashCode(this.f44538k) + j1.a(this.f44537j, (Integer.hashCode(this.f44536i) + j1.a(this.f44535h, j1.a(this.f44534g, j1.a(this.f44533f, j1.a(this.f44532e, (a4 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31)) * 31, 31)) * 31, 31), 31);
        String str2 = this.f44541n;
        int hashCode = (Boolean.hashCode(this.f44542o.f44220a) + ((a5 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        hl hlVar = this.f44543p;
        return hashCode + (hlVar != null ? hlVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PurchaseDto(purchaseId=" + this.f44528a + ", productId=" + this.f44529b + ", invoiceId=" + this.f44530c + ", orderId=" + this.f44531d + ", purchaseType=" + this.f44532e + ", productType=" + this.f44533f + ", description=" + this.f44534g + ", amountLabel=" + this.f44535h + ", amount=" + this.f44536i + ", currency=" + this.f44537j + ", quantity=" + this.f44538k + ", purchaseStatus=" + this.f44539l + ", purchaseTime=" + this.f44540m + ", developerPayload=" + this.f44541n + ", metaInfoDto=" + this.f44542o + ", subscriptionInfo=" + this.f44543p + ')';
    }
}
