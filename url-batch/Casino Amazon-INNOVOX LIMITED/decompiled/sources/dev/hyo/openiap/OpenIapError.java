package dev.hyo.openiap;

import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapError.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 -2\u00060\u0001j\u0002`\u0002: \u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r0\fR\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0001\u001f./0123456789:;<=>?@ABCDEFGHIJKL¨\u0006M"}, d2 = {"Ldev/hyo/openiap/OpenIapError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "code", "", "getCode", "()Ljava/lang/String;", "message", "getMessage", "toJSON", "", "", "ProductNotFound", "PurchaseFailed", "PurchaseCancelled", "PurchaseDeferred", "PaymentNotAllowed", "BillingError", "InvalidReceipt", "InvalidPurchaseVerification", "PurchaseVerificationFailed", "NetworkError", "VerificationFailed", "RestoreFailed", "UnknownError", "NotPrepared", "InitConnection", "QueryProduct", "EmptySkuList", "SkuNotFound", "SkuOfferMismatch", "MissingCurrentActivity", "UserCancelled", "ItemAlreadyOwned", "ItemNotOwned", "ServiceUnavailable", "BillingUnavailable", "ItemUnavailable", "DeveloperError", "FeatureNotSupported", "ServiceDisconnected", "ServiceTimeout", "AlternativeBillingUnavailable", "Companion", "Ldev/hyo/openiap/OpenIapError$AlternativeBillingUnavailable;", "Ldev/hyo/openiap/OpenIapError$BillingError;", "Ldev/hyo/openiap/OpenIapError$BillingUnavailable;", "Ldev/hyo/openiap/OpenIapError$DeveloperError;", "Ldev/hyo/openiap/OpenIapError$EmptySkuList;", "Ldev/hyo/openiap/OpenIapError$FeatureNotSupported;", "Ldev/hyo/openiap/OpenIapError$InitConnection;", "Ldev/hyo/openiap/OpenIapError$InvalidPurchaseVerification;", "Ldev/hyo/openiap/OpenIapError$InvalidReceipt;", "Ldev/hyo/openiap/OpenIapError$ItemAlreadyOwned;", "Ldev/hyo/openiap/OpenIapError$ItemNotOwned;", "Ldev/hyo/openiap/OpenIapError$ItemUnavailable;", "Ldev/hyo/openiap/OpenIapError$MissingCurrentActivity;", "Ldev/hyo/openiap/OpenIapError$NetworkError;", "Ldev/hyo/openiap/OpenIapError$NotPrepared;", "Ldev/hyo/openiap/OpenIapError$PaymentNotAllowed;", "Ldev/hyo/openiap/OpenIapError$ProductNotFound;", "Ldev/hyo/openiap/OpenIapError$PurchaseCancelled;", "Ldev/hyo/openiap/OpenIapError$PurchaseDeferred;", "Ldev/hyo/openiap/OpenIapError$PurchaseFailed;", "Ldev/hyo/openiap/OpenIapError$PurchaseVerificationFailed;", "Ldev/hyo/openiap/OpenIapError$QueryProduct;", "Ldev/hyo/openiap/OpenIapError$RestoreFailed;", "Ldev/hyo/openiap/OpenIapError$ServiceDisconnected;", "Ldev/hyo/openiap/OpenIapError$ServiceTimeout;", "Ldev/hyo/openiap/OpenIapError$ServiceUnavailable;", "Ldev/hyo/openiap/OpenIapError$SkuNotFound;", "Ldev/hyo/openiap/OpenIapError$SkuOfferMismatch;", "Ldev/hyo/openiap/OpenIapError$UnknownError;", "Ldev/hyo/openiap/OpenIapError$UserCancelled;", "Ldev/hyo/openiap/OpenIapError$VerificationFailed;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OpenIapError extends Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<Map<String, String>> defaultMessages$delegate = LazyKt.lazy(new Function0() { // from class: dev.hyo.openiap.OpenIapError$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Map defaultMessages_delegate$lambda$0;
            defaultMessages_delegate$lambda$0 = OpenIapError.defaultMessages_delegate$lambda$0();
            return defaultMessages_delegate$lambda$0;
        }
    });

    public /* synthetic */ OpenIapError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getCode();

    @Override // java.lang.Throwable
    public abstract String getMessage();

    private OpenIapError() {
    }

    public final Map<String, Object> toJSON() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("code", INSTANCE.toCode(this));
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        pairArr[1] = TuplesKt.to("message", message);
        pairArr[2] = TuplesKt.to("platform", "android");
        return MapsKt.mapOf(pairArr);
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\b\n\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0010"}, d2 = {"Ldev/hyo/openiap/OpenIapError$ProductNotFound;", "Ldev/hyo/openiap/OpenIapError;", "productId", "", "<init>", "(Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "CODE", "getCODE", "CODE$1", "code", "getCode", "message", "getMessage", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductNotFound extends OpenIapError {
        public static final String MESSAGE = "Product not found";

        /* renamed from: CODE$1, reason: from kotlin metadata */
        private final String CODE;
        private final String code;
        private final String message;
        private final String productId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final String CODE = ErrorCode.SkuNotFound.getRawValue();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductNotFound(String productId) {
            super(null);
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.productId = productId;
            String rawValue = ErrorCode.SkuNotFound.getRawValue();
            this.CODE = rawValue;
            this.code = rawValue;
            this.message = MESSAGE;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final String getCODE() {
            return this.CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return this.code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        /* compiled from: OpenIapError.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/OpenIapError$ProductNotFound$Companion;", "", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String getCODE() {
                return ProductNotFound.CODE;
            }
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$PurchaseFailed;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PurchaseFailed extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final PurchaseFailed INSTANCE = new PurchaseFailed();
        public static final String MESSAGE = "Purchase failed";
        private static final String code;
        private static final String message;

        private PurchaseFailed() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.PurchaseError.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$PurchaseCancelled;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PurchaseCancelled extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final PurchaseCancelled INSTANCE = new PurchaseCancelled();
        public static final String MESSAGE = "Purchase was cancelled by the user";
        private static final String code;
        private static final String message;

        private PurchaseCancelled() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.UserCancelled.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$PurchaseDeferred;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PurchaseDeferred extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final PurchaseDeferred INSTANCE = new PurchaseDeferred();
        public static final String MESSAGE = "Purchase was deferred";
        private static final String code;
        private static final String message;

        private PurchaseDeferred() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.DeferredPayment.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$PaymentNotAllowed;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentNotAllowed extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final PaymentNotAllowed INSTANCE = new PaymentNotAllowed();
        public static final String MESSAGE = "Payment not allowed";
        private static final String code;
        private static final String message;

        private PaymentNotAllowed() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.UserError.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$BillingError;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BillingError extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final BillingError INSTANCE = new BillingError();
        public static final String MESSAGE = "Billing error";
        private static final String code;
        private static final String message;

        private BillingError() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.ServiceError.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Deprecated(message = "Use InvalidPurchaseVerification instead", replaceWith = @ReplaceWith(expression = "InvalidPurchaseVerification", imports = {}))
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$InvalidReceipt;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidReceipt extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final InvalidReceipt INSTANCE = new InvalidReceipt();
        public static final String MESSAGE = "Purchase verification failed";
        private static final String code;
        private static final String message;

        private InvalidReceipt() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.PurchaseVerificationFailed.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = "Purchase verification failed";
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$InvalidPurchaseVerification;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidPurchaseVerification extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final InvalidPurchaseVerification INSTANCE = new InvalidPurchaseVerification();
        public static final String MESSAGE = "Purchase verification failed";
        private static final String code;
        private static final String message;

        private InvalidPurchaseVerification() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.PurchaseVerificationFailed.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = "Purchase verification failed";
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$PurchaseVerificationFailed;", "Ldev/hyo/openiap/OpenIapError;", "providerError", "", "<init>", "(Ljava/lang/String;)V", "getProviderError", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PurchaseVerificationFailed extends OpenIapError {
        private final String code;
        private final String message;
        private final String providerError;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final String CODE = ErrorCode.PurchaseVerificationFailed.getRawValue();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PurchaseVerificationFailed(String providerError) {
            super(null);
            Intrinsics.checkNotNullParameter(providerError, "providerError");
            this.providerError = providerError;
            this.code = ErrorCode.PurchaseVerificationFailed.getRawValue();
            this.message = "Purchase verification failed: " + providerError;
        }

        public final String getProviderError() {
            return this.providerError;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return this.code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        /* compiled from: OpenIapError.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/OpenIapError$PurchaseVerificationFailed$Companion;", "", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String getCODE() {
                return PurchaseVerificationFailed.CODE;
            }
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$NetworkError;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "MESSAGE", "code", "getCode", "message", "getMessage", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NetworkError extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final NetworkError INSTANCE = new NetworkError();
        public static final String MESSAGE = "Network connection error";
        private static final String code;
        private static final String message;

        private NetworkError() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.NetworkError.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$VerificationFailed;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VerificationFailed extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final VerificationFailed INSTANCE = new VerificationFailed();
        public static final String MESSAGE = "Verification failed";
        private static final String code;
        private static final String message;

        private VerificationFailed() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.TransactionValidationFailed.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$RestoreFailed;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RestoreFailed extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final RestoreFailed INSTANCE = new RestoreFailed();
        public static final String MESSAGE = "Restore failed";
        private static final String code;
        private static final String message;

        private RestoreFailed() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.SyncError.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$UnknownError;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnknownError extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final UnknownError INSTANCE = new UnknownError();
        public static final String MESSAGE = "Unknown error";
        private static final String code;
        private static final String message;

        private UnknownError() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.Unknown.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Ldev/hyo/openiap/OpenIapError$NotPrepared;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "MESSAGE", "code", "getCode", "()Ljava/lang/String;", "message", "getMessage", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotPrepared extends OpenIapError {
        public static final NotPrepared INSTANCE = new NotPrepared();
        public static final String CODE = "not-prepared";
        private static final String code = CODE;
        public static final String MESSAGE = "Billing client not ready";
        private static final String message = MESSAGE;
        public static final int $stable = 8;

        private NotPrepared() {
            super(null);
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$InitConnection;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InitConnection extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final InitConnection INSTANCE = new InitConnection();
        public static final String MESSAGE = "Failed to initialize billing connection";
        private static final String code;
        private static final String message;

        private InitConnection() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.InitConnection.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$QueryProduct;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QueryProduct extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final QueryProduct INSTANCE = new QueryProduct();
        public static final String MESSAGE = "Failed to query product";
        private static final String code;
        private static final String message;

        private QueryProduct() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.QueryProduct.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Ldev/hyo/openiap/OpenIapError$EmptySkuList;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "MESSAGE", "code", "getCode", "()Ljava/lang/String;", "message", "getMessage", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EmptySkuList extends OpenIapError {
        public static final EmptySkuList INSTANCE = new EmptySkuList();
        public static final String CODE = "empty-sku-list";
        private static final String code = CODE;
        public static final String MESSAGE = "SKU list cannot be empty";
        private static final String message = MESSAGE;
        public static final int $stable = 8;

        private EmptySkuList() {
            super(null);
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\b\n\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0010"}, d2 = {"Ldev/hyo/openiap/OpenIapError$SkuNotFound;", "Ldev/hyo/openiap/OpenIapError;", "sku", "", "<init>", "(Ljava/lang/String;)V", "getSku", "()Ljava/lang/String;", "CODE", "getCODE", "CODE$1", "code", "getCode", "message", "getMessage", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SkuNotFound extends OpenIapError {
        public static final String MESSAGE = "SKU not found";

        /* renamed from: CODE$1, reason: from kotlin metadata */
        private final String CODE;
        private final String code;
        private final String message;
        private final String sku;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final String CODE = ErrorCode.SkuNotFound.getRawValue();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SkuNotFound(String sku) {
            super(null);
            Intrinsics.checkNotNullParameter(sku, "sku");
            this.sku = sku;
            String rawValue = ErrorCode.SkuNotFound.getRawValue();
            this.CODE = rawValue;
            this.code = rawValue;
            this.message = MESSAGE;
        }

        public final String getSku() {
            return this.sku;
        }

        public final String getCODE() {
            return this.CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return this.code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        /* compiled from: OpenIapError.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/OpenIapError$SkuNotFound$Companion;", "", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String getCODE() {
                return SkuNotFound.CODE;
            }
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Ldev/hyo/openiap/OpenIapError$SkuOfferMismatch;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "MESSAGE", "code", "getCode", "()Ljava/lang/String;", "message", "getMessage", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SkuOfferMismatch extends OpenIapError {
        public static final SkuOfferMismatch INSTANCE = new SkuOfferMismatch();
        public static final String CODE = "sku-offer-mismatch";
        private static final String code = CODE;
        public static final String MESSAGE = "SKU and offer token count mismatch";
        private static final String message = MESSAGE;
        public static final int $stable = 8;

        private SkuOfferMismatch() {
            super(null);
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$MissingCurrentActivity;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MissingCurrentActivity extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final MissingCurrentActivity INSTANCE = new MissingCurrentActivity();
        public static final String MESSAGE = "Current activity is not available";
        private static final String code;
        private static final String message;

        private MissingCurrentActivity() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.ActivityUnavailable.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$UserCancelled;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "MESSAGE", "code", "getCode", "message", "getMessage", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UserCancelled extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final UserCancelled INSTANCE = new UserCancelled();
        public static final String MESSAGE = "User cancelled the operation";
        private static final String code;
        private static final String message;

        private UserCancelled() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.UserCancelled.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$ItemAlreadyOwned;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ItemAlreadyOwned extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final ItemAlreadyOwned INSTANCE = new ItemAlreadyOwned();
        public static final String MESSAGE = "Item is already owned";
        private static final String code;
        private static final String message;

        private ItemAlreadyOwned() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.AlreadyOwned.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$ItemNotOwned;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "MESSAGE", "code", "getCode", "message", "getMessage", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ItemNotOwned extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final ItemNotOwned INSTANCE = new ItemNotOwned();
        public static final String MESSAGE = "Item is not owned";
        private static final String code;
        private static final String message;

        private ItemNotOwned() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.ItemNotOwned.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$ServiceUnavailable;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ServiceUnavailable extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final ServiceUnavailable INSTANCE = new ServiceUnavailable();
        public static final String MESSAGE = "Billing service is unavailable";
        private static final String code;
        private static final String message;

        private ServiceUnavailable() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.ServiceError.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$BillingUnavailable;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BillingUnavailable extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final BillingUnavailable INSTANCE = new BillingUnavailable();
        public static final String MESSAGE = "Billing API version is not supported";
        private static final String code;
        private static final String message;

        private BillingUnavailable() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.BillingUnavailable.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$ItemUnavailable;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ItemUnavailable extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final ItemUnavailable INSTANCE = new ItemUnavailable();
        public static final String MESSAGE = "Requested product is not available for purchase";
        private static final String code;
        private static final String message;

        private ItemUnavailable() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.ItemUnavailable.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$DeveloperError;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeveloperError extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final DeveloperError INSTANCE = new DeveloperError();
        public static final String MESSAGE = "Invalid arguments provided to the API";
        private static final String code;
        private static final String message;

        private DeveloperError() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.DeveloperError.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$FeatureNotSupported;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FeatureNotSupported extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final FeatureNotSupported INSTANCE = new FeatureNotSupported();
        public static final String MESSAGE = "Requested feature is not supported by Play Store";
        private static final String code;
        private static final String message;

        private FeatureNotSupported() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.FeatureNotSupported.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/OpenIapError$ServiceDisconnected;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "code", "getCode", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ServiceDisconnected extends OpenIapError {
        public static final int $stable;
        private static final String CODE;
        public static final ServiceDisconnected INSTANCE = new ServiceDisconnected();
        public static final String MESSAGE = "Play Store service is not connected";
        private static final String code;
        private static final String message;

        private ServiceDisconnected() {
            super(null);
        }

        static {
            String rawValue = ErrorCode.ServiceDisconnected.getRawValue();
            CODE = rawValue;
            code = rawValue;
            message = MESSAGE;
            $stable = 8;
        }

        public final String getCODE() {
            return CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Ldev/hyo/openiap/OpenIapError$ServiceTimeout;", "Ldev/hyo/openiap/OpenIapError;", "<init>", "()V", "CODE", "", "code", "getCode", "()Ljava/lang/String;", "message", "getMessage", "MESSAGE", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ServiceTimeout extends OpenIapError {
        public static final ServiceTimeout INSTANCE = new ServiceTimeout();
        public static final String CODE = "service-timeout";
        private static final String code = CODE;
        public static final String MESSAGE = "The request has reached the maximum timeout before billing service responds";
        private static final String message = MESSAGE;
        public static final int $stable = 8;

        private ServiceTimeout() {
            super(null);
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\b\n\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0010"}, d2 = {"Ldev/hyo/openiap/OpenIapError$AlternativeBillingUnavailable;", "Ldev/hyo/openiap/OpenIapError;", "details", "", "<init>", "(Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "CODE", "getCODE", "CODE$1", "code", "getCode", "message", "getMessage", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AlternativeBillingUnavailable extends OpenIapError {

        /* renamed from: CODE$1, reason: from kotlin metadata */
        private final String CODE;
        private final String code;
        private final String details;
        private final String message;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final String CODE = ErrorCode.BillingUnavailable.getRawValue();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlternativeBillingUnavailable(String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
            String rawValue = ErrorCode.BillingUnavailable.getRawValue();
            this.CODE = rawValue;
            this.code = rawValue;
            this.message = details;
        }

        public final String getDetails() {
            return this.details;
        }

        public final String getCODE() {
            return this.CODE;
        }

        @Override // dev.hyo.openiap.OpenIapError
        public String getCode() {
            return this.code;
        }

        @Override // dev.hyo.openiap.OpenIapError, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        /* compiled from: OpenIapError.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/OpenIapError$AlternativeBillingUnavailable$Companion;", "", "<init>", "()V", "CODE", "", "getCODE", "()Ljava/lang/String;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String getCODE() {
                return AlternativeBillingUnavailable.CODE;
            }
        }
    }

    /* compiled from: OpenIapError.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005R'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Ldev/hyo/openiap/OpenIapError$Companion;", "", "<init>", "()V", "defaultMessages", "", "", "getDefaultMessages", "()Ljava/util/Map;", "defaultMessages$delegate", "Lkotlin/Lazy;", "toCode", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Ldev/hyo/openiap/OpenIapError;", "defaultMessage", "code", "getAllErrorCodes", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final Map<String, String> getDefaultMessages() {
            return (Map) OpenIapError.defaultMessages$delegate.getValue();
        }

        public final String toCode(OpenIapError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return error.getCode();
        }

        public final String defaultMessage(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            String str = getDefaultMessages().get(code);
            return str == null ? "Unknown error occurred" : str;
        }

        public final Map<String, String> getAllErrorCodes() {
            return getDefaultMessages();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map defaultMessages_delegate$lambda$0() {
        return MapsKt.mapOf(TuplesKt.to(ProductNotFound.INSTANCE.getCODE(), ProductNotFound.MESSAGE), TuplesKt.to(PurchaseFailed.INSTANCE.getCODE(), PurchaseFailed.MESSAGE), TuplesKt.to(PurchaseCancelled.INSTANCE.getCODE(), PurchaseCancelled.MESSAGE), TuplesKt.to(PurchaseDeferred.INSTANCE.getCODE(), PurchaseDeferred.MESSAGE), TuplesKt.to(NetworkError.INSTANCE.getCODE(), NetworkError.MESSAGE), TuplesKt.to(UnknownError.INSTANCE.getCODE(), UnknownError.MESSAGE), TuplesKt.to(NotPrepared.CODE, NotPrepared.MESSAGE), TuplesKt.to(InitConnection.INSTANCE.getCODE(), InitConnection.MESSAGE), TuplesKt.to(QueryProduct.INSTANCE.getCODE(), QueryProduct.MESSAGE), TuplesKt.to(EmptySkuList.CODE, EmptySkuList.MESSAGE), TuplesKt.to(SkuNotFound.INSTANCE.getCODE(), SkuNotFound.MESSAGE), TuplesKt.to(SkuOfferMismatch.CODE, SkuOfferMismatch.MESSAGE), TuplesKt.to(UserCancelled.INSTANCE.getCODE(), UserCancelled.MESSAGE), TuplesKt.to(ItemAlreadyOwned.INSTANCE.getCODE(), ItemAlreadyOwned.MESSAGE), TuplesKt.to(ItemNotOwned.INSTANCE.getCODE(), ItemNotOwned.MESSAGE), TuplesKt.to(ServiceUnavailable.INSTANCE.getCODE(), ServiceUnavailable.MESSAGE), TuplesKt.to(BillingUnavailable.INSTANCE.getCODE(), BillingUnavailable.MESSAGE), TuplesKt.to(ItemUnavailable.INSTANCE.getCODE(), ItemUnavailable.MESSAGE), TuplesKt.to(DeveloperError.INSTANCE.getCODE(), DeveloperError.MESSAGE), TuplesKt.to(FeatureNotSupported.INSTANCE.getCODE(), FeatureNotSupported.MESSAGE), TuplesKt.to(ServiceDisconnected.INSTANCE.getCODE(), ServiceDisconnected.MESSAGE), TuplesKt.to(ServiceTimeout.CODE, ServiceTimeout.MESSAGE), TuplesKt.to(PaymentNotAllowed.INSTANCE.getCODE(), PaymentNotAllowed.MESSAGE), TuplesKt.to(BillingError.INSTANCE.getCODE(), BillingError.MESSAGE), TuplesKt.to(InvalidPurchaseVerification.INSTANCE.getCODE(), "Purchase verification failed"), TuplesKt.to(VerificationFailed.INSTANCE.getCODE(), VerificationFailed.MESSAGE), TuplesKt.to(RestoreFailed.INSTANCE.getCODE(), RestoreFailed.MESSAGE), TuplesKt.to(MissingCurrentActivity.INSTANCE.getCODE(), MissingCurrentActivity.MESSAGE));
    }
}
