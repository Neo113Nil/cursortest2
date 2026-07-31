package ru.rustore.sdk.pay.internal;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.AmountLabel;
import ru.rustore.sdk.pay.model.Price;
import ru.rustore.sdk.pay.model.ProductPurchaseStatus;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.SubscriptionPurchaseStatus;
import ru.rustore.sdk.pay.model.Title;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public interface ze extends Serializable {

    public static final class a implements ze {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Url f45338a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final Title f45339b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final AmountLabel f45340c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final ProductPurchaseStatus f45341d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final Quantity f45342e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        public final Price f45343f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        public final Price f45344g;

        public a(@NotNull Url icon, @NotNull Title title, @NotNull AmountLabel amountLabel, @NotNull ProductPurchaseStatus status, @NotNull Quantity quantity, @NotNull Price originalPrice, @NotNull Price totalPrice) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            this.f45338a = icon;
            this.f45339b = title;
            this.f45340c = amountLabel;
            this.f45341d = status;
            this.f45342e = quantity;
            this.f45343f = originalPrice;
            this.f45344g = totalPrice;
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final Price a() {
            return this.f45344g;
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final Price b() {
            return this.f45343f;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f45338a, aVar.f45338a) && Intrinsics.areEqual(this.f45339b, aVar.f45339b) && Intrinsics.areEqual(this.f45340c, aVar.f45340c) && this.f45341d == aVar.f45341d && Intrinsics.areEqual(this.f45342e, aVar.f45342e) && Intrinsics.areEqual(this.f45343f, aVar.f45343f) && Intrinsics.areEqual(this.f45344g, aVar.f45344g);
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final AmountLabel getAmountLabel() {
            return this.f45340c;
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final Url getIcon() {
            return this.f45338a;
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final Quantity getQuantity() {
            return this.f45342e;
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final Title getTitle() {
            return this.f45339b;
        }

        public final int hashCode() {
            return this.f45344g.hashCode() + ((this.f45343f.hashCode() + ((this.f45342e.hashCode() + ((this.f45341d.hashCode() + ((this.f45340c.hashCode() + ((this.f45339b.hashCode() + (this.f45338a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "ProductInfo(icon=" + this.f45338a + ", title=" + this.f45339b + ", amountLabel=" + this.f45340c + ", status=" + this.f45341d + ", quantity=" + this.f45342e + ", originalPrice=" + this.f45343f + ", totalPrice=" + this.f45344g + ')';
        }
    }

    public static final class b implements ze {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Url f45345a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final Title f45346b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final AmountLabel f45347c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final SubscriptionPurchaseStatus f45348d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final Quantity f45349e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        public final Price f45350f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        public final Price f45351g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        public final ArrayList f45352h;

        public b(@NotNull Url icon, @NotNull Title title, @NotNull AmountLabel amountLabel, @NotNull SubscriptionPurchaseStatus status, @NotNull Quantity quantity, @NotNull Price originalPrice, @NotNull Price totalPrice, @NotNull ArrayList subscriptionTariffs) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            Intrinsics.checkNotNullParameter(subscriptionTariffs, "subscriptionTariffs");
            this.f45345a = icon;
            this.f45346b = title;
            this.f45347c = amountLabel;
            this.f45348d = status;
            this.f45349e = quantity;
            this.f45350f = originalPrice;
            this.f45351g = totalPrice;
            this.f45352h = subscriptionTariffs;
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final Price a() {
            return this.f45351g;
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final Price b() {
            return this.f45350f;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f45345a, bVar.f45345a) && Intrinsics.areEqual(this.f45346b, bVar.f45346b) && Intrinsics.areEqual(this.f45347c, bVar.f45347c) && this.f45348d == bVar.f45348d && Intrinsics.areEqual(this.f45349e, bVar.f45349e) && Intrinsics.areEqual(this.f45350f, bVar.f45350f) && Intrinsics.areEqual(this.f45351g, bVar.f45351g) && Intrinsics.areEqual(this.f45352h, bVar.f45352h);
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final AmountLabel getAmountLabel() {
            return this.f45347c;
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final Url getIcon() {
            return this.f45345a;
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final Quantity getQuantity() {
            return this.f45349e;
        }

        @Override // ru.rustore.sdk.pay.internal.ze
        @NotNull
        public final Title getTitle() {
            return this.f45346b;
        }

        public final int hashCode() {
            return this.f45352h.hashCode() + ((this.f45351g.hashCode() + ((this.f45350f.hashCode() + ((this.f45349e.hashCode() + ((this.f45348d.hashCode() + ((this.f45347c.hashCode() + ((this.f45346b.hashCode() + (this.f45345a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "SubscriptionInfo(icon=" + this.f45345a + ", title=" + this.f45346b + ", amountLabel=" + this.f45347c + ", status=" + this.f45348d + ", quantity=" + this.f45349e + ", originalPrice=" + this.f45350f + ", totalPrice=" + this.f45351g + ", subscriptionTariffs=" + this.f45352h + ')';
        }
    }

    @NotNull
    Price a();

    @NotNull
    Price b();

    @NotNull
    AmountLabel getAmountLabel();

    @NotNull
    Url getIcon();

    @NotNull
    Quantity getQuantity();

    @NotNull
    Title getTitle();
}
