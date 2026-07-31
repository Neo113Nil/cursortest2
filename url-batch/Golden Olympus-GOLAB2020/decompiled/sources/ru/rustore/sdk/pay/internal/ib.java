package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44321a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44322b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f44323c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f44324d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f44325e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f44326f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f44327g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f44328h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f44329i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final dl f44330j;

    public ib(@NotNull String productId, @NotNull String type, @NotNull String amountLabel, @Nullable Integer num, @NotNull String currency, @NotNull String imageUrl, @Nullable String str, @NotNull String title, @Nullable String str2, @Nullable dl dlVar) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f44321a = productId;
        this.f44322b = type;
        this.f44323c = amountLabel;
        this.f44324d = num;
        this.f44325e = currency;
        this.f44326f = imageUrl;
        this.f44327g = str;
        this.f44328h = title;
        this.f44329i = str2;
        this.f44330j = dlVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        return Intrinsics.areEqual(this.f44321a, ibVar.f44321a) && Intrinsics.areEqual(this.f44322b, ibVar.f44322b) && Intrinsics.areEqual(this.f44323c, ibVar.f44323c) && Intrinsics.areEqual(this.f44324d, ibVar.f44324d) && Intrinsics.areEqual(this.f44325e, ibVar.f44325e) && Intrinsics.areEqual(this.f44326f, ibVar.f44326f) && Intrinsics.areEqual(this.f44327g, ibVar.f44327g) && Intrinsics.areEqual(this.f44328h, ibVar.f44328h) && Intrinsics.areEqual(this.f44329i, ibVar.f44329i) && Intrinsics.areEqual(this.f44330j, ibVar.f44330j);
    }

    public final int hashCode() {
        int a4 = j1.a(this.f44323c, j1.a(this.f44322b, this.f44321a.hashCode() * 31, 31), 31);
        Integer num = this.f44324d;
        int a5 = j1.a(this.f44326f, j1.a(this.f44325e, (a4 + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        String str = this.f44327g;
        int a6 = j1.a(this.f44328h, (a5 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f44329i;
        int hashCode = (a6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        dl dlVar = this.f44330j;
        return hashCode + (dlVar != null ? dlVar.f43978a.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ProductDto(productId=" + this.f44321a + ", type=" + this.f44322b + ", amountLabel=" + this.f44323c + ", price=" + this.f44324d + ", currency=" + this.f44325e + ", imageUrl=" + this.f44326f + ", promoImageUrl=" + this.f44327g + ", title=" + this.f44328h + ", description=" + this.f44329i + ", subscriptionInfo=" + this.f44330j + ')';
    }
}
