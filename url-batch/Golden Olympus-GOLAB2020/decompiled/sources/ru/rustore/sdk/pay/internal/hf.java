package ru.rustore.sdk.pay.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.ProductId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public interface hf extends Serializable {

    public interface a extends hf {

        /* renamed from: ru.rustore.sdk.pay.internal.hf$a$a, reason: collision with other inner class name */
        public static final class C0258a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Nullable
            public final PurchaseId f44237a;

            /* renamed from: b, reason: collision with root package name */
            @Nullable
            public final PurchaseType f44238b;

            public C0258a(@Nullable PurchaseId purchaseId, @Nullable PurchaseType purchaseType) {
                this.f44237a = purchaseId;
                this.f44238b = purchaseType;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0258a)) {
                    return false;
                }
                C0258a c0258a = (C0258a) obj;
                return Intrinsics.areEqual(this.f44237a, c0258a.f44237a) && this.f44238b == c0258a.f44238b;
            }

            public final int hashCode() {
                PurchaseId purchaseId = this.f44237a;
                int hashCode = (purchaseId == null ? 0 : purchaseId.hashCode()) * 31;
                PurchaseType purchaseType = this.f44238b;
                return hashCode + (purchaseType != null ? purchaseType.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                return "Cancelled(purchaseId=" + this.f44237a + ", purchaseType=" + this.f44238b + ')';
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Nullable
            public final PurchaseType f44239a;

            /* renamed from: b, reason: collision with root package name */
            @Nullable
            public final PurchaseId f44240b;

            /* renamed from: c, reason: collision with root package name */
            @Nullable
            public final InvoiceId f44241c;

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            public final Throwable f44242d;

            public b(@Nullable PurchaseId purchaseId, @Nullable InvoiceId invoiceId, @Nullable PurchaseType purchaseType, @NotNull Throwable cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f44239a = purchaseType;
                this.f44240b = purchaseId;
                this.f44241c = invoiceId;
                this.f44242d = cause;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f44239a == bVar.f44239a && Intrinsics.areEqual(this.f44240b, bVar.f44240b) && Intrinsics.areEqual(this.f44241c, bVar.f44241c) && Intrinsics.areEqual(this.f44242d, bVar.f44242d);
            }

            public final int hashCode() {
                PurchaseType purchaseType = this.f44239a;
                int hashCode = (purchaseType == null ? 0 : purchaseType.hashCode()) * 31;
                PurchaseId purchaseId = this.f44240b;
                int hashCode2 = (hashCode + (purchaseId == null ? 0 : purchaseId.hashCode())) * 31;
                InvoiceId invoiceId = this.f44241c;
                return this.f44242d.hashCode() + ((hashCode2 + (invoiceId != null ? invoiceId.hashCode() : 0)) * 31);
            }

            @NotNull
            public final String toString() {
                return "Failure(purchaseType=" + this.f44239a + ", purchaseId=" + this.f44240b + ", invoiceId=" + this.f44241c + ", cause=" + this.f44242d + ')';
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public final f0 f44243a;

            public c(@NotNull f0 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f44243a = value;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f44243a, ((c) obj).f44243a);
            }

            public final int hashCode() {
                return this.f44243a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Success(value=" + this.f44243a + ')';
            }
        }
    }

    public interface b extends hf {

        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Nullable
            public final PurchaseId f44244a;

            /* renamed from: b, reason: collision with root package name */
            @Nullable
            public final PurchaseType f44245b;

            /* renamed from: c, reason: collision with root package name */
            @Nullable
            public final ProductType f44246c;

            public a(@Nullable PurchaseId purchaseId, @Nullable PurchaseType purchaseType, @Nullable ProductType productType) {
                this.f44244a = purchaseId;
                this.f44245b = purchaseType;
                this.f44246c = productType;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f44244a, aVar.f44244a) && this.f44245b == aVar.f44245b && this.f44246c == aVar.f44246c;
            }

            public final int hashCode() {
                PurchaseId purchaseId = this.f44244a;
                int hashCode = (purchaseId == null ? 0 : purchaseId.hashCode()) * 31;
                PurchaseType purchaseType = this.f44245b;
                int hashCode2 = (hashCode + (purchaseType == null ? 0 : purchaseType.hashCode())) * 31;
                ProductType productType = this.f44246c;
                return hashCode2 + (productType != null ? productType.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                return "Cancelled(purchaseId=" + this.f44244a + ", purchaseType=" + this.f44245b + ", productType=" + this.f44246c + ')';
            }
        }

        /* renamed from: ru.rustore.sdk.pay.internal.hf$b$b, reason: collision with other inner class name */
        public static final class C0259b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Nullable
            public final PurchaseId f44247a;

            /* renamed from: b, reason: collision with root package name */
            @Nullable
            public final InvoiceId f44248b;

            /* renamed from: c, reason: collision with root package name */
            @Nullable
            public final OrderId f44249c;

            /* renamed from: d, reason: collision with root package name */
            @Nullable
            public final Quantity f44250d;

            /* renamed from: e, reason: collision with root package name */
            @Nullable
            public final ProductId f44251e;

            /* renamed from: f, reason: collision with root package name */
            @Nullable
            public final PurchaseType f44252f;

            /* renamed from: g, reason: collision with root package name */
            @Nullable
            public final ProductType f44253g;

            /* renamed from: h, reason: collision with root package name */
            @Nullable
            public final Boolean f44254h;

            /* renamed from: i, reason: collision with root package name */
            @NotNull
            public final Throwable f44255i;

            public C0259b(@Nullable OrderId orderId, @Nullable PurchaseId purchaseId, @Nullable ProductId productId, @Nullable InvoiceId invoiceId, @Nullable Quantity quantity, @Nullable PurchaseType purchaseType, @Nullable Boolean bool, @Nullable ProductType productType, @NotNull Throwable cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f44247a = purchaseId;
                this.f44248b = invoiceId;
                this.f44249c = orderId;
                this.f44250d = quantity;
                this.f44251e = productId;
                this.f44252f = purchaseType;
                this.f44253g = productType;
                this.f44254h = bool;
                this.f44255i = cause;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Throwable] */
            public static C0259b a(C0259b c0259b, PurchaseType purchaseType, RuStorePaymentException.RuStorePaymentCommonException ruStorePaymentCommonException, int i4) {
                PurchaseId purchaseId = c0259b.f44247a;
                InvoiceId invoiceId = c0259b.f44248b;
                OrderId orderId = c0259b.f44249c;
                Quantity quantity = c0259b.f44250d;
                ProductId productId = c0259b.f44251e;
                if ((i4 & 32) != 0) {
                    purchaseType = c0259b.f44252f;
                }
                PurchaseType purchaseType2 = purchaseType;
                ProductType productType = c0259b.f44253g;
                Boolean bool = c0259b.f44254h;
                RuStorePaymentException.RuStorePaymentCommonException ruStorePaymentCommonException2 = ruStorePaymentCommonException;
                if ((i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    ruStorePaymentCommonException2 = c0259b.f44255i;
                }
                RuStorePaymentException.RuStorePaymentCommonException cause = ruStorePaymentCommonException2;
                Intrinsics.checkNotNullParameter(cause, "cause");
                return new C0259b(orderId, purchaseId, productId, invoiceId, quantity, purchaseType2, bool, productType, cause);
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0259b)) {
                    return false;
                }
                C0259b c0259b = (C0259b) obj;
                return Intrinsics.areEqual(this.f44247a, c0259b.f44247a) && Intrinsics.areEqual(this.f44248b, c0259b.f44248b) && Intrinsics.areEqual(this.f44249c, c0259b.f44249c) && Intrinsics.areEqual(this.f44250d, c0259b.f44250d) && Intrinsics.areEqual(this.f44251e, c0259b.f44251e) && this.f44252f == c0259b.f44252f && this.f44253g == c0259b.f44253g && Intrinsics.areEqual(this.f44254h, c0259b.f44254h) && Intrinsics.areEqual(this.f44255i, c0259b.f44255i);
            }

            public final int hashCode() {
                PurchaseId purchaseId = this.f44247a;
                int hashCode = (purchaseId == null ? 0 : purchaseId.hashCode()) * 31;
                InvoiceId invoiceId = this.f44248b;
                int hashCode2 = (hashCode + (invoiceId == null ? 0 : invoiceId.hashCode())) * 31;
                OrderId orderId = this.f44249c;
                int hashCode3 = (hashCode2 + (orderId == null ? 0 : orderId.hashCode())) * 31;
                Quantity quantity = this.f44250d;
                int hashCode4 = (hashCode3 + (quantity == null ? 0 : quantity.hashCode())) * 31;
                ProductId productId = this.f44251e;
                int hashCode5 = (hashCode4 + (productId == null ? 0 : productId.hashCode())) * 31;
                PurchaseType purchaseType = this.f44252f;
                int hashCode6 = (hashCode5 + (purchaseType == null ? 0 : purchaseType.hashCode())) * 31;
                ProductType productType = this.f44253g;
                int hashCode7 = (hashCode6 + (productType == null ? 0 : productType.hashCode())) * 31;
                Boolean bool = this.f44254h;
                return this.f44255i.hashCode() + ((hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31);
            }

            @NotNull
            public final String toString() {
                return "Failure(purchaseId=" + this.f44247a + ", invoiceId=" + this.f44248b + ", orderId=" + this.f44249c + ", quantity=" + this.f44250d + ", productId=" + this.f44251e + ", purchaseType=" + this.f44252f + ", productType=" + this.f44253g + ", sandbox=" + this.f44254h + ", cause=" + this.f44255i + ')';
            }
        }

        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public final qb f44256a;

            public c(@NotNull qb value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f44256a = value;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f44256a, ((c) obj).f44256a);
            }

            public final int hashCode() {
                return this.f44256a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Success(value=" + this.f44256a + ')';
            }
        }
    }
}
