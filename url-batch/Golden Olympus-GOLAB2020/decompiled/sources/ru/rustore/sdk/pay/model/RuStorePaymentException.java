package ru.rustore.sdk.pay.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public abstract class RuStorePaymentException extends Throwable {

    @Nullable
    private final Throwable cause;

    @NotNull
    private final String message;

    @Metadata
    public static final class ApplicationSchemeWasNotProvided extends RuStorePaymentException {
        /* JADX WARN: Multi-variable type inference failed */
        public ApplicationSchemeWasNotProvided() {
            super("Application scheme was not provided. Set app_scheme_value into AndroidManifest.", null, 0 == true ? 1 : 0);
        }
    }

    @Metadata
    public static final class EmptyPaymentTokenException extends RuStorePaymentException {
        /* JADX WARN: Multi-variable type inference failed */
        public EmptyPaymentTokenException() {
            super("Empty token returned by RuStore app", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof EmptyPaymentTokenException;
        }

        public int hashCode() {
            return EmptyPaymentTokenException.class.hashCode();
        }
    }

    @Metadata
    public static final class InvalidCardBindingIdException extends RuStorePaymentException {
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidCardBindingIdException() {
            super("Invalid card binding id", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof InvalidCardBindingIdException;
        }

        public int hashCode() {
            return InvalidCardBindingIdException.class.hashCode();
        }
    }

    @Metadata
    public static final class ProductPurchaseCancelled extends RuStorePaymentException {

        @Nullable
        private final ProductType productType;

        @Nullable
        private final PurchaseId purchaseId;

        @Nullable
        private final PurchaseType purchaseType;

        /* JADX WARN: Multi-variable type inference failed */
        public ProductPurchaseCancelled(@Nullable PurchaseId purchaseId, @Nullable PurchaseType purchaseType, @Nullable ProductType productType) {
            super("Purchase product is cancelled", null, 2, 0 == true ? 1 : 0);
            this.purchaseId = purchaseId;
            this.purchaseType = purchaseType;
            this.productType = productType;
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof ProductPurchaseCancelled;
        }

        @Nullable
        public final ProductType getProductType() {
            return this.productType;
        }

        @Nullable
        public final PurchaseId getPurchaseId() {
            return this.purchaseId;
        }

        @Nullable
        public final PurchaseType getPurchaseType() {
            return this.purchaseType;
        }

        public int hashCode() {
            return ProductPurchaseCancelled.class.hashCode();
        }
    }

    @Metadata
    public static final class ProductPurchaseException extends RuStorePaymentException {

        @NotNull
        private final Throwable cause;

        @Nullable
        private final InvoiceId invoiceId;

        @Nullable
        private final OrderId orderId;

        @Nullable
        private final ProductId productId;

        @Nullable
        private final ProductType productType;

        @Nullable
        private final PurchaseId purchaseId;

        @Nullable
        private final PurchaseType purchaseType;

        @Nullable
        private final Quantity quantity;

        @Nullable
        private final Boolean sandbox;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductPurchaseException(@Nullable OrderId orderId, @Nullable PurchaseId purchaseId, @Nullable ProductId productId, @Nullable InvoiceId invoiceId, @Nullable Quantity quantity, @Nullable PurchaseType purchaseType, @Nullable Boolean bool, @Nullable ProductType productType, @NotNull Throwable cause) {
            super("Error purchase product", cause, null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.orderId = orderId;
            this.purchaseId = purchaseId;
            this.productId = productId;
            this.invoiceId = invoiceId;
            this.quantity = quantity;
            this.purchaseType = purchaseType;
            this.sandbox = bool;
            this.productType = productType;
            this.cause = cause;
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof ProductPurchaseException;
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return this.cause;
        }

        @Nullable
        public final InvoiceId getInvoiceId() {
            return this.invoiceId;
        }

        @Nullable
        public final OrderId getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final ProductId getProductId() {
            return this.productId;
        }

        @Nullable
        public final ProductType getProductType() {
            return this.productType;
        }

        @Nullable
        public final PurchaseId getPurchaseId() {
            return this.purchaseId;
        }

        @Nullable
        public final PurchaseType getPurchaseType() {
            return this.purchaseType;
        }

        @Nullable
        public final Quantity getQuantity() {
            return this.quantity;
        }

        @Nullable
        public final Boolean getSandbox() {
            return this.sandbox;
        }

        public int hashCode() {
            return ProductPurchaseException.class.hashCode();
        }
    }

    @Metadata
    public static final class RuStorePayClientAlreadyExist extends RuStorePaymentException {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        public /* synthetic */ RuStorePayClientAlreadyExist(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? null : th);
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuStorePayClientAlreadyExist(@NotNull String message, @Nullable Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }
    }

    @Metadata
    public static final class RuStorePayClientNotCreated extends RuStorePaymentException {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        public /* synthetic */ RuStorePayClientNotCreated(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? null : th);
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuStorePayClientNotCreated(@NotNull String message, @Nullable Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }
    }

    @Metadata
    public static final class RuStorePayInvalidActivePurchase extends RuStorePaymentException {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public RuStorePayInvalidActivePurchase() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public /* synthetic */ RuStorePayInvalidActivePurchase(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "invalid active purchase type" : str, (i4 & 2) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuStorePayInvalidActivePurchase(@NotNull String message, @Nullable Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }
    }

    @Metadata
    public static final class RuStorePayInvalidConsoleAppId extends RuStorePaymentException {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public RuStorePayInvalidConsoleAppId() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public /* synthetic */ RuStorePayInvalidConsoleAppId(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "Console application id is not provided. Set \"console_app_id_value\" into resources" : str, (i4 & 2) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuStorePayInvalidConsoleAppId(@NotNull String message, @Nullable Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }
    }

    @Metadata
    public static final class RuStorePaySignatureException extends RuStorePaymentException {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public RuStorePaySignatureException() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public /* synthetic */ RuStorePaySignatureException(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "Invalid response signature" : str, (i4 & 2) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuStorePaySignatureException(@NotNull String message, @Nullable Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }
    }

    @Metadata
    public static final class RuStorePaymentCommonException extends RuStorePaymentException {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        public /* synthetic */ RuStorePaymentCommonException(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? null : th);
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuStorePaymentCommonException(@NotNull String message, @Nullable Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }
    }

    @Metadata
    public static final class RuStorePaymentNetworkException extends RuStorePaymentException {

        @Nullable
        private final Throwable cause;

        @Nullable
        private final String code;

        @NotNull
        private final String id;

        @NotNull
        private final String message;

        public /* synthetic */ RuStorePaymentNetworkException(String str, String str2, String str3, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i4 & 8) != 0 ? null : th);
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @Override // ru.rustore.sdk.pay.model.RuStorePaymentException, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuStorePaymentNetworkException(@Nullable String str, @NotNull String id, @NotNull String message, @Nullable Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = str;
            this.id = id;
            this.message = message;
            this.cause = th;
        }
    }

    public /* synthetic */ RuStorePaymentException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ RuStorePaymentException(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : th, null);
    }

    private RuStorePaymentException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }
}
