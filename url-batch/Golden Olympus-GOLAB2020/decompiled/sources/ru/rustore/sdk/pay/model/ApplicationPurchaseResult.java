package ru.rustore.sdk.pay.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface ApplicationPurchaseResult {

    @Metadata
    public static final class Cancelled implements ApplicationPurchaseResult {

        @Nullable
        private final PurchaseId purchaseId;

        @Nullable
        private final PurchaseType purchaseType;

        public Cancelled(@Nullable PurchaseId purchaseId, @Nullable PurchaseType purchaseType) {
            this.purchaseId = purchaseId;
            this.purchaseType = purchaseType;
        }

        @Nullable
        public final PurchaseId getPurchaseId() {
            return this.purchaseId;
        }

        @Nullable
        public final PurchaseType getPurchaseType() {
            return this.purchaseType;
        }
    }

    @Metadata
    public static final class Failure implements ApplicationPurchaseResult {

        @NotNull
        private final Throwable cause;

        @Nullable
        private final InvoiceId invoiceId;

        @Nullable
        private final PurchaseId purchaseId;

        @Nullable
        private final PurchaseType purchaseType;

        public Failure(@Nullable PurchaseId purchaseId, @Nullable InvoiceId invoiceId, @Nullable PurchaseType purchaseType, @NotNull Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.purchaseId = purchaseId;
            this.invoiceId = invoiceId;
            this.purchaseType = purchaseType;
            this.cause = cause;
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        @Nullable
        public final InvoiceId getInvoiceId() {
            return this.invoiceId;
        }

        @Nullable
        public final PurchaseId getPurchaseId() {
            return this.purchaseId;
        }

        @Nullable
        public final PurchaseType getPurchaseType() {
            return this.purchaseType;
        }
    }

    @Metadata
    public static final class Success implements ApplicationPurchaseResult {

        @NotNull
        private final InvoiceId invoiceId;

        @NotNull
        private final PurchaseId purchaseId;

        @NotNull
        private final PurchaseType purchaseType;

        public Success(@NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId, @NotNull PurchaseType purchaseType) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
            this.purchaseId = purchaseId;
            this.invoiceId = invoiceId;
            this.purchaseType = purchaseType;
        }

        @NotNull
        public final InvoiceId getInvoiceId() {
            return this.invoiceId;
        }

        @NotNull
        public final PurchaseId getPurchaseId() {
            return this.purchaseId;
        }

        @NotNull
        public final PurchaseType getPurchaseType() {
            return this.purchaseType;
        }
    }
}
