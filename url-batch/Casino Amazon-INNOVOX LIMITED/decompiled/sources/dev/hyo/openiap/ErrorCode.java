package dev.hyo.openiap;

import dev.hyo.openiap.OpenIapError;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0086\u0081\u0002\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010-\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006/"}, d2 = {"Ldev/hyo/openiap/ErrorCode;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Unknown", "UserCancelled", "UserError", "ItemUnavailable", "RemoteError", "NetworkError", "ServiceError", "ReceiptFailed", "ReceiptFinished", "ReceiptFinishedFailed", "PurchaseVerificationFailed", "PurchaseVerificationFinished", "PurchaseVerificationFinishFailed", "NotPrepared", "NotEnded", "AlreadyOwned", "DeveloperError", "BillingResponseJsonParseError", "DeferredPayment", "Interrupted", "IapNotAvailable", "PurchaseError", "SyncError", "TransactionValidationFailed", "ActivityUnavailable", "AlreadyPrepared", "Pending", "ConnectionClosed", "InitConnection", "ServiceDisconnected", "QueryProduct", "SkuNotFound", "SkuOfferMismatch", "ItemNotOwned", "BillingUnavailable", "FeatureNotSupported", "EmptySkuList", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorCode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ErrorCode Unknown = new ErrorCode("Unknown", 0, "unknown");
    public static final ErrorCode UserCancelled = new ErrorCode("UserCancelled", 1, "user-cancelled");
    public static final ErrorCode UserError = new ErrorCode("UserError", 2, "user-error");
    public static final ErrorCode ItemUnavailable = new ErrorCode("ItemUnavailable", 3, "item-unavailable");
    public static final ErrorCode RemoteError = new ErrorCode("RemoteError", 4, "remote-error");
    public static final ErrorCode NetworkError = new ErrorCode("NetworkError", 5, "network-error");
    public static final ErrorCode ServiceError = new ErrorCode("ServiceError", 6, "service-error");
    public static final ErrorCode ReceiptFailed = new ErrorCode("ReceiptFailed", 7, "receipt-failed");
    public static final ErrorCode ReceiptFinished = new ErrorCode("ReceiptFinished", 8, "receipt-finished");
    public static final ErrorCode ReceiptFinishedFailed = new ErrorCode("ReceiptFinishedFailed", 9, "receipt-finished-failed");
    public static final ErrorCode PurchaseVerificationFailed = new ErrorCode("PurchaseVerificationFailed", 10, "purchase-verification-failed");
    public static final ErrorCode PurchaseVerificationFinished = new ErrorCode("PurchaseVerificationFinished", 11, "purchase-verification-finished");
    public static final ErrorCode PurchaseVerificationFinishFailed = new ErrorCode("PurchaseVerificationFinishFailed", 12, "purchase-verification-finish-failed");
    public static final ErrorCode NotPrepared = new ErrorCode("NotPrepared", 13, OpenIapError.NotPrepared.CODE);
    public static final ErrorCode NotEnded = new ErrorCode("NotEnded", 14, "not-ended");
    public static final ErrorCode AlreadyOwned = new ErrorCode("AlreadyOwned", 15, "already-owned");
    public static final ErrorCode DeveloperError = new ErrorCode("DeveloperError", 16, "developer-error");
    public static final ErrorCode BillingResponseJsonParseError = new ErrorCode("BillingResponseJsonParseError", 17, "billing-response-json-parse-error");
    public static final ErrorCode DeferredPayment = new ErrorCode("DeferredPayment", 18, "deferred-payment");
    public static final ErrorCode Interrupted = new ErrorCode("Interrupted", 19, "interrupted");
    public static final ErrorCode IapNotAvailable = new ErrorCode("IapNotAvailable", 20, "iap-not-available");
    public static final ErrorCode PurchaseError = new ErrorCode("PurchaseError", 21, "purchase-error");
    public static final ErrorCode SyncError = new ErrorCode("SyncError", 22, "sync-error");
    public static final ErrorCode TransactionValidationFailed = new ErrorCode("TransactionValidationFailed", 23, "transaction-validation-failed");
    public static final ErrorCode ActivityUnavailable = new ErrorCode("ActivityUnavailable", 24, "activity-unavailable");
    public static final ErrorCode AlreadyPrepared = new ErrorCode("AlreadyPrepared", 25, "already-prepared");
    public static final ErrorCode Pending = new ErrorCode("Pending", 26, "pending");
    public static final ErrorCode ConnectionClosed = new ErrorCode("ConnectionClosed", 27, "connection-closed");
    public static final ErrorCode InitConnection = new ErrorCode("InitConnection", 28, "init-connection");
    public static final ErrorCode ServiceDisconnected = new ErrorCode("ServiceDisconnected", 29, "service-disconnected");
    public static final ErrorCode QueryProduct = new ErrorCode("QueryProduct", 30, "query-product");
    public static final ErrorCode SkuNotFound = new ErrorCode("SkuNotFound", 31, "sku-not-found");
    public static final ErrorCode SkuOfferMismatch = new ErrorCode("SkuOfferMismatch", 32, OpenIapError.SkuOfferMismatch.CODE);
    public static final ErrorCode ItemNotOwned = new ErrorCode("ItemNotOwned", 33, "item-not-owned");
    public static final ErrorCode BillingUnavailable = new ErrorCode("BillingUnavailable", 34, "billing-unavailable");
    public static final ErrorCode FeatureNotSupported = new ErrorCode("FeatureNotSupported", 35, "feature-not-supported");
    public static final ErrorCode EmptySkuList = new ErrorCode("EmptySkuList", 36, OpenIapError.EmptySkuList.CODE);

    private static final /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{Unknown, UserCancelled, UserError, ItemUnavailable, RemoteError, NetworkError, ServiceError, ReceiptFailed, ReceiptFinished, ReceiptFinishedFailed, PurchaseVerificationFailed, PurchaseVerificationFinished, PurchaseVerificationFinishFailed, NotPrepared, NotEnded, AlreadyOwned, DeveloperError, BillingResponseJsonParseError, DeferredPayment, Interrupted, IapNotAvailable, PurchaseError, SyncError, TransactionValidationFailed, ActivityUnavailable, AlreadyPrepared, Pending, ConnectionClosed, InitConnection, ServiceDisconnected, QueryProduct, SkuNotFound, SkuOfferMismatch, ItemNotOwned, BillingUnavailable, FeatureNotSupported, EmptySkuList};
    }

    public static EnumEntries<ErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }

    private ErrorCode(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        ErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/ErrorCode$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ErrorCode;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ErrorCode fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -2125705996:
                    if (value.equals("TransactionValidationFailed")) {
                        return ErrorCode.TransactionValidationFailed;
                    }
                    break;
                case -2070993780:
                    if (value.equals("SkuNotFound")) {
                        return ErrorCode.SkuNotFound;
                    }
                    break;
                case -2069606034:
                    if (value.equals("EmptySkuList")) {
                        return ErrorCode.EmptySkuList;
                    }
                    break;
                case -2048694871:
                    if (value.equals("network-error")) {
                        return ErrorCode.NetworkError;
                    }
                    break;
                case -2004214414:
                    if (value.equals("receipt-failed")) {
                        return ErrorCode.ReceiptFailed;
                    }
                    break;
                case -1975534371:
                    if (value.equals("UserError")) {
                        return ErrorCode.UserError;
                    }
                    break;
                case -1947652542:
                    if (value.equals("interrupted")) {
                        return ErrorCode.Interrupted;
                    }
                    break;
                case -1940352027:
                    if (value.equals("ItemNotOwned")) {
                        return ErrorCode.ItemNotOwned;
                    }
                    break;
                case -1875591534:
                    if (value.equals("activity-unavailable")) {
                        return ErrorCode.ActivityUnavailable;
                    }
                    break;
                case -1820504051:
                    if (value.equals("SyncError")) {
                        return ErrorCode.SyncError;
                    }
                    break;
                case -1809505507:
                    if (value.equals("ItemUnavailable")) {
                        return ErrorCode.ItemUnavailable;
                    }
                    break;
                case -1760074802:
                    if (value.equals(OpenIapError.EmptySkuList.CODE)) {
                        return ErrorCode.EmptySkuList;
                    }
                    break;
                case -1754234646:
                    if (value.equals("query-product")) {
                        return ErrorCode.QueryProduct;
                    }
                    break;
                case -1725642728:
                    if (value.equals("purchase-verification-finished")) {
                        return ErrorCode.PurchaseVerificationFinished;
                    }
                    break;
                case -1646973954:
                    if (value.equals("billing-unavailable")) {
                        return ErrorCode.BillingUnavailable;
                    }
                    break;
                case -1593116262:
                    if (value.equals("iap-not-available")) {
                        return ErrorCode.IapNotAvailable;
                    }
                    break;
                case -1495183803:
                    if (value.equals("developer-error")) {
                        return ErrorCode.DeveloperError;
                    }
                    break;
                case -1491273661:
                    if (value.equals("billing-response-json-parse-error")) {
                        return ErrorCode.BillingResponseJsonParseError;
                    }
                    break;
                case -1436117703:
                    if (value.equals("PurchaseVerificationFailed")) {
                        return ErrorCode.PurchaseVerificationFailed;
                    }
                    break;
                case -1145826879:
                    if (value.equals("remote-error")) {
                        return ErrorCode.RemoteError;
                    }
                    break;
                case -1055415898:
                    if (value.equals("UserCancelled")) {
                        return ErrorCode.UserCancelled;
                    }
                    break;
                case -1024143848:
                    if (value.equals("deferred-payment")) {
                        return ErrorCode.DeferredPayment;
                    }
                    break;
                case -1015548465:
                    if (value.equals("user-cancelled")) {
                        return ErrorCode.UserCancelled;
                    }
                    break;
                case -861964242:
                    if (value.equals("InitConnection")) {
                        return ErrorCode.InitConnection;
                    }
                    break;
                case -750578562:
                    if (value.equals("DeveloperError")) {
                        return ErrorCode.DeveloperError;
                    }
                    break;
                case -682587753:
                    if (value.equals("pending")) {
                        return ErrorCode.Pending;
                    }
                    break;
                case -548928153:
                    if (value.equals("PurchaseError")) {
                        return ErrorCode.PurchaseError;
                    }
                    break;
                case -451978669:
                    if (value.equals("service-disconnected")) {
                        return ErrorCode.ServiceDisconnected;
                    }
                    break;
                case -443081395:
                    if (value.equals("AlreadyOwned")) {
                        return ErrorCode.AlreadyOwned;
                    }
                    break;
                case -439062006:
                    if (value.equals("ConnectionClosed")) {
                        return ErrorCode.ConnectionClosed;
                    }
                    break;
                case -424751806:
                    if (value.equals("RemoteError")) {
                        return ErrorCode.RemoteError;
                    }
                    break;
                case -284840886:
                    if (value.equals("unknown")) {
                        return ErrorCode.Unknown;
                    }
                    break;
                case -279783902:
                    if (value.equals("Interrupted")) {
                        return ErrorCode.Interrupted;
                    }
                    break;
                case -50558827:
                    if (value.equals("AlreadyPrepared")) {
                        return ErrorCode.AlreadyPrepared;
                    }
                    break;
                case 120785050:
                    if (value.equals("NetworkError")) {
                        return ErrorCode.NetworkError;
                    }
                    break;
                case 183099200:
                    if (value.equals("not-ended")) {
                        return ErrorCode.NotEnded;
                    }
                    break;
                case 213557837:
                    if (value.equals("SkuOfferMismatch")) {
                        return ErrorCode.SkuOfferMismatch;
                    }
                    break;
                case 289730439:
                    if (value.equals("ReceiptFinishedFailed")) {
                        return ErrorCode.ReceiptFinishedFailed;
                    }
                    break;
                case 325864803:
                    if (value.equals("purchase-verification-failed")) {
                        return ErrorCode.PurchaseVerificationFailed;
                    }
                    break;
                case 421159062:
                    if (value.equals("item-unavailable")) {
                        return ErrorCode.ItemUnavailable;
                    }
                    break;
                case 424197021:
                    if (value.equals("feature-not-supported")) {
                        return ErrorCode.FeatureNotSupported;
                    }
                    break;
                case 465987132:
                    if (value.equals("purchase-error")) {
                        return ErrorCode.PurchaseError;
                    }
                    break;
                case 475830389:
                    if (value.equals("ReceiptFailed")) {
                        return ErrorCode.ReceiptFailed;
                    }
                    break;
                case 490376582:
                    if (value.equals("user-error")) {
                        return ErrorCode.UserError;
                    }
                    break;
                case 500324467:
                    if (value.equals("ServiceError")) {
                        return ErrorCode.ServiceError;
                    }
                    break;
                case 573630705:
                    if (value.equals("item-not-owned")) {
                        return ErrorCode.ItemNotOwned;
                    }
                    break;
                case 630663536:
                    if (value.equals("ServiceDisconnected")) {
                        return ErrorCode.ServiceDisconnected;
                    }
                    break;
                case 657364650:
                    if (value.equals("ReceiptFinished")) {
                        return ErrorCode.ReceiptFinished;
                    }
                    break;
                case 807323664:
                    if (value.equals("NotPrepared")) {
                        return ErrorCode.NotPrepared;
                    }
                    break;
                case 911162467:
                    if (value.equals("receipt-finished-failed")) {
                        return ErrorCode.ReceiptFinishedFailed;
                    }
                    break;
                case 914340795:
                    if (value.equals("init-connection")) {
                        return ErrorCode.InitConnection;
                    }
                    break;
                case 982065527:
                    if (value.equals("Pending")) {
                        return ErrorCode.Pending;
                    }
                    break;
                case 1001349206:
                    if (value.equals("sync-error")) {
                        return ErrorCode.SyncError;
                    }
                    break;
                case 1012033196:
                    if (value.equals("PurchaseVerificationFinishFailed")) {
                        return ErrorCode.PurchaseVerificationFinishFailed;
                    }
                    break;
                case 1041158247:
                    if (value.equals("receipt-finished")) {
                        return ErrorCode.ReceiptFinished;
                    }
                    break;
                case 1050367183:
                    if (value.equals(OpenIapError.SkuOfferMismatch.CODE)) {
                        return ErrorCode.SkuOfferMismatch;
                    }
                    break;
                case 1127092464:
                    if (value.equals("service-error")) {
                        return ErrorCode.ServiceError;
                    }
                    break;
                case 1239437045:
                    if (value.equals("BillingUnavailable")) {
                        return ErrorCode.BillingUnavailable;
                    }
                    break;
                case 1298312999:
                    if (value.equals("QueryProduct")) {
                        return ErrorCode.QueryProduct;
                    }
                    break;
                case 1319434043:
                    if (value.equals("connection-closed")) {
                        return ErrorCode.ConnectionClosed;
                    }
                    break;
                case 1336550817:
                    if (value.equals("ActivityUnavailable")) {
                        return ErrorCode.ActivityUnavailable;
                    }
                    break;
                case 1379812394:
                    if (value.equals("Unknown")) {
                        return ErrorCode.Unknown;
                    }
                    break;
                case 1384704503:
                    if (value.equals(OpenIapError.NotPrepared.CODE)) {
                        return ErrorCode.NotPrepared;
                    }
                    break;
                case 1521250926:
                    if (value.equals("PurchaseVerificationFinished")) {
                        return ErrorCode.PurchaseVerificationFinished;
                    }
                    break;
                case 1567246866:
                    if (value.equals("already-prepared")) {
                        return ErrorCode.AlreadyPrepared;
                    }
                    break;
                case 1596759313:
                    if (value.equals("FeatureNotSupported")) {
                        return ErrorCode.FeatureNotSupported;
                    }
                    break;
                case 1616994247:
                    if (value.equals("NotEnded")) {
                        return ErrorCode.NotEnded;
                    }
                    break;
                case 1644872418:
                    if (value.equals("transaction-validation-failed")) {
                        return ErrorCode.TransactionValidationFailed;
                    }
                    break;
                case 1664881904:
                    if (value.equals("already-owned")) {
                        return ErrorCode.AlreadyOwned;
                    }
                    break;
                case 1686326104:
                    if (value.equals("sku-not-found")) {
                        return ErrorCode.SkuNotFound;
                    }
                    break;
                case 1713473233:
                    if (value.equals("purchase-verification-finish-failed")) {
                        return ErrorCode.PurchaseVerificationFinishFailed;
                    }
                    break;
                case 1776922887:
                    if (value.equals("DeferredPayment")) {
                        return ErrorCode.DeferredPayment;
                    }
                    break;
                case 1915902862:
                    if (value.equals("IapNotAvailable")) {
                        return ErrorCode.IapNotAvailable;
                    }
                    break;
                case 2057076985:
                    if (value.equals("BillingResponseJsonParseError")) {
                        return ErrorCode.BillingResponseJsonParseError;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown ErrorCode value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
