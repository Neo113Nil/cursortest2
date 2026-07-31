package dev.hyo.openiap;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.sqlite.driver.bundled.BundledSQLite;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b*\b\u0087\b\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u0002:\u0002\u008c\u0001B\u0081\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010'\u001a\u00020(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010+\u001a\u00020\f\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b/\u00100J\u0016\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010c0bH\u0016J\u000b\u0010d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010:J\t\u0010l\u001a\u00020\u0004HÆ\u0003J\u0011\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010n\u001a\u00020\u0011HÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010p\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010t\u001a\u00020\u0019HÆ\u0003J\t\u0010u\u001a\u00020\u0004HÆ\u0003J\t\u0010v\u001a\u00020\u001cHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010x\u001a\u00020\u001fHÆ\u0003J\u0010\u0010y\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010PJ\u000b\u0010z\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010$HÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010~\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u007f\u001a\u00020(HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u009c\u0003\u0010\u0086\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010+\u001a\u00020\f2\b\b\u0002\u0010,\u001a\u00020\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0003\u0010\u0087\u0001J\u0015\u0010\u0088\u0001\u001a\u00020\u00112\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010cHÖ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u001fHÖ\u0001J\n\u0010\u008b\u0001\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00102R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010?R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010A\u001a\u0004\b\u0012\u0010@R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010;\u001a\u0004\bD\u0010:R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0014\u0010\u001a\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00102R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0015\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bO\u0010PR\u0013\u0010!\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00102R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00102R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0015\u0010%\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010;\u001a\u0004\bV\u0010:R\u0013\u0010&\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u00102R\u0014\u0010'\u001a\u00020(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010)\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u00102R\u0013\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00102R\u0014\u0010+\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010,\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u00102R\u0013\u0010-\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u00102R\u0013\u0010.\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u00102¨\u0006\u008d\u0001"}, d2 = {"Ldev/hyo/openiap/PurchaseIOS;", "Ldev/hyo/openiap/PurchaseCommon;", "Ldev/hyo/openiap/Purchase;", "appAccountToken", "", "appBundleIdIOS", "countryCodeIOS", "currencyCodeIOS", "currencySymbolIOS", "currentPlanId", "environmentIOS", "expirationDateIOS", "", "id", "ids", "", "isAutoRenewing", "", "isUpgradedIOS", "offerIOS", "Ldev/hyo/openiap/PurchaseOfferIOS;", "originalTransactionDateIOS", "originalTransactionIdentifierIOS", "ownershipTypeIOS", "platform", "Ldev/hyo/openiap/IapPlatform;", "productId", "purchaseState", "Ldev/hyo/openiap/PurchaseState;", "purchaseToken", "quantity", "", "quantityIOS", "reasonIOS", "reasonStringRepresentationIOS", "renewalInfoIOS", "Ldev/hyo/openiap/RenewalInfoIOS;", "revocationDateIOS", "revocationReasonIOS", "store", "Ldev/hyo/openiap/IapStore;", "storefrontCountryCodeIOS", "subscriptionGroupIdIOS", "transactionDate", "transactionId", "transactionReasonIOS", "webOrderLineItemIdIOS", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ldev/hyo/openiap/PurchaseOfferIOS;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/IapPlatform;Ljava/lang/String;Ldev/hyo/openiap/PurchaseState;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/RenewalInfoIOS;Ljava/lang/Double;Ljava/lang/String;Ldev/hyo/openiap/IapStore;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppAccountToken", "()Ljava/lang/String;", "getAppBundleIdIOS", "getCountryCodeIOS", "getCurrencyCodeIOS", "getCurrencySymbolIOS", "getCurrentPlanId", "getEnvironmentIOS", "getExpirationDateIOS", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getId", "getIds", "()Ljava/util/List;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOfferIOS", "()Ldev/hyo/openiap/PurchaseOfferIOS;", "getOriginalTransactionDateIOS", "getOriginalTransactionIdentifierIOS", "getOwnershipTypeIOS", "getPlatform", "()Ldev/hyo/openiap/IapPlatform;", "getProductId", "getPurchaseState", "()Ldev/hyo/openiap/PurchaseState;", "getPurchaseToken", "getQuantity", "()I", "getQuantityIOS", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReasonIOS", "getReasonStringRepresentationIOS", "getRenewalInfoIOS", "()Ldev/hyo/openiap/RenewalInfoIOS;", "getRevocationDateIOS", "getRevocationReasonIOS", "getStore", "()Ldev/hyo/openiap/IapStore;", "getStorefrontCountryCodeIOS", "getSubscriptionGroupIdIOS", "getTransactionDate", "()D", "getTransactionId", "getTransactionReasonIOS", "getWebOrderLineItemIdIOS", "toJson", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ldev/hyo/openiap/PurchaseOfferIOS;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/IapPlatform;Ljava/lang/String;Ldev/hyo/openiap/PurchaseState;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/RenewalInfoIOS;Ljava/lang/Double;Ljava/lang/String;Ldev/hyo/openiap/IapStore;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ldev/hyo/openiap/PurchaseIOS;", "equals", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PurchaseIOS implements PurchaseCommon, Purchase {
    private final String appAccountToken;
    private final String appBundleIdIOS;
    private final String countryCodeIOS;
    private final String currencyCodeIOS;
    private final String currencySymbolIOS;
    private final String currentPlanId;
    private final String environmentIOS;
    private final Double expirationDateIOS;
    private final String id;
    private final List<String> ids;
    private final boolean isAutoRenewing;
    private final Boolean isUpgradedIOS;
    private final PurchaseOfferIOS offerIOS;
    private final Double originalTransactionDateIOS;
    private final String originalTransactionIdentifierIOS;
    private final String ownershipTypeIOS;
    private final IapPlatform platform;
    private final String productId;
    private final PurchaseState purchaseState;
    private final String purchaseToken;
    private final int quantity;
    private final Integer quantityIOS;
    private final String reasonIOS;
    private final String reasonStringRepresentationIOS;
    private final RenewalInfoIOS renewalInfoIOS;
    private final Double revocationDateIOS;
    private final String revocationReasonIOS;
    private final IapStore store;
    private final String storefrontCountryCodeIOS;
    private final String subscriptionGroupIdIOS;
    private final double transactionDate;
    private final String transactionId;
    private final String transactionReasonIOS;
    private final String webOrderLineItemIdIOS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ PurchaseIOS copy$default(PurchaseIOS purchaseIOS, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, String str8, List list, boolean z, Boolean bool, PurchaseOfferIOS purchaseOfferIOS, Double d2, String str9, String str10, IapPlatform iapPlatform, String str11, PurchaseState purchaseState, String str12, int i, Integer num, String str13, String str14, RenewalInfoIOS renewalInfoIOS, Double d3, String str15, IapStore iapStore, String str16, String str17, double d4, String str18, String str19, String str20, int i2, int i3, Object obj) {
        String str21;
        String str22;
        String str23;
        PurchaseState purchaseState2;
        String str24;
        int i4;
        Integer num2;
        String str25;
        String str26;
        RenewalInfoIOS renewalInfoIOS2;
        Double d5;
        String str27;
        IapStore iapStore2;
        String str28;
        String str29;
        double d6;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        Double d7;
        String str37;
        List list2;
        boolean z2;
        Boolean bool2;
        PurchaseOfferIOS purchaseOfferIOS2;
        Double d8;
        String str38;
        IapPlatform iapPlatform2;
        String str39;
        String str40 = (i2 & 1) != 0 ? purchaseIOS.appAccountToken : str;
        String str41 = (i2 & 2) != 0 ? purchaseIOS.appBundleIdIOS : str2;
        String str42 = (i2 & 4) != 0 ? purchaseIOS.countryCodeIOS : str3;
        String str43 = (i2 & 8) != 0 ? purchaseIOS.currencyCodeIOS : str4;
        String str44 = (i2 & 16) != 0 ? purchaseIOS.currencySymbolIOS : str5;
        String str45 = (i2 & 32) != 0 ? purchaseIOS.currentPlanId : str6;
        String str46 = (i2 & 64) != 0 ? purchaseIOS.environmentIOS : str7;
        Double d9 = (i2 & 128) != 0 ? purchaseIOS.expirationDateIOS : d;
        String str47 = (i2 & 256) != 0 ? purchaseIOS.id : str8;
        List list3 = (i2 & 512) != 0 ? purchaseIOS.ids : list;
        boolean z3 = (i2 & 1024) != 0 ? purchaseIOS.isAutoRenewing : z;
        Boolean bool3 = (i2 & 2048) != 0 ? purchaseIOS.isUpgradedIOS : bool;
        PurchaseOfferIOS purchaseOfferIOS3 = (i2 & 4096) != 0 ? purchaseIOS.offerIOS : purchaseOfferIOS;
        Double d10 = (i2 & 8192) != 0 ? purchaseIOS.originalTransactionDateIOS : d2;
        String str48 = str40;
        String str49 = (i2 & 16384) != 0 ? purchaseIOS.originalTransactionIdentifierIOS : str9;
        String str50 = (i2 & 32768) != 0 ? purchaseIOS.ownershipTypeIOS : str10;
        IapPlatform iapPlatform3 = (i2 & 65536) != 0 ? purchaseIOS.platform : iapPlatform;
        String str51 = (i2 & 131072) != 0 ? purchaseIOS.productId : str11;
        PurchaseState purchaseState3 = (i2 & 262144) != 0 ? purchaseIOS.purchaseState : purchaseState;
        String str52 = (i2 & 524288) != 0 ? purchaseIOS.purchaseToken : str12;
        int i5 = (i2 & 1048576) != 0 ? purchaseIOS.quantity : i;
        Integer num3 = (i2 & 2097152) != 0 ? purchaseIOS.quantityIOS : num;
        String str53 = (i2 & 4194304) != 0 ? purchaseIOS.reasonIOS : str13;
        String str54 = (i2 & 8388608) != 0 ? purchaseIOS.reasonStringRepresentationIOS : str14;
        RenewalInfoIOS renewalInfoIOS3 = (i2 & 16777216) != 0 ? purchaseIOS.renewalInfoIOS : renewalInfoIOS;
        Double d11 = (i2 & BundledSQLite.SQLITE_OPEN_EXRESCODE) != 0 ? purchaseIOS.revocationDateIOS : d3;
        String str55 = (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? purchaseIOS.revocationReasonIOS : str15;
        IapStore iapStore3 = (i2 & 134217728) != 0 ? purchaseIOS.store : iapStore;
        String str56 = (i2 & 268435456) != 0 ? purchaseIOS.storefrontCountryCodeIOS : str16;
        String str57 = (i2 & 536870912) != 0 ? purchaseIOS.subscriptionGroupIdIOS : str17;
        String str58 = str49;
        double d12 = (i2 & 1073741824) != 0 ? purchaseIOS.transactionDate : d4;
        String str59 = (i2 & Integer.MIN_VALUE) != 0 ? purchaseIOS.transactionId : str18;
        String str60 = (i3 & 1) != 0 ? purchaseIOS.transactionReasonIOS : str19;
        if ((i3 & 2) != 0) {
            str22 = str59;
            str21 = purchaseIOS.webOrderLineItemIdIOS;
            purchaseState2 = purchaseState3;
            str24 = str52;
            i4 = i5;
            num2 = num3;
            str25 = str53;
            str26 = str54;
            renewalInfoIOS2 = renewalInfoIOS3;
            d5 = d11;
            str27 = str55;
            iapStore2 = iapStore3;
            str28 = str56;
            str29 = str57;
            d6 = d12;
            str30 = str58;
            str31 = str60;
            str33 = str43;
            str34 = str44;
            str35 = str45;
            str36 = str46;
            d7 = d9;
            str37 = str47;
            list2 = list3;
            z2 = z3;
            bool2 = bool3;
            purchaseOfferIOS2 = purchaseOfferIOS3;
            d8 = d10;
            str38 = str50;
            iapPlatform2 = iapPlatform3;
            str23 = str51;
            str39 = str41;
            str32 = str42;
        } else {
            str21 = str20;
            str22 = str59;
            str23 = str51;
            purchaseState2 = purchaseState3;
            str24 = str52;
            i4 = i5;
            num2 = num3;
            str25 = str53;
            str26 = str54;
            renewalInfoIOS2 = renewalInfoIOS3;
            d5 = d11;
            str27 = str55;
            iapStore2 = iapStore3;
            str28 = str56;
            str29 = str57;
            d6 = d12;
            str30 = str58;
            str31 = str60;
            str32 = str42;
            str33 = str43;
            str34 = str44;
            str35 = str45;
            str36 = str46;
            d7 = d9;
            str37 = str47;
            list2 = list3;
            z2 = z3;
            bool2 = bool3;
            purchaseOfferIOS2 = purchaseOfferIOS3;
            d8 = d10;
            str38 = str50;
            iapPlatform2 = iapPlatform3;
            str39 = str41;
        }
        return purchaseIOS.copy(str48, str39, str32, str33, str34, str35, str36, d7, str37, list2, z2, bool2, purchaseOfferIOS2, d8, str30, str38, iapPlatform2, str23, purchaseState2, str24, i4, num2, str25, str26, renewalInfoIOS2, d5, str27, iapStore2, str28, str29, d6, str22, str31, str21);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppAccountToken() {
        return this.appAccountToken;
    }

    public final List<String> component10() {
        return this.ids;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getIsUpgradedIOS() {
        return this.isUpgradedIOS;
    }

    /* renamed from: component13, reason: from getter */
    public final PurchaseOfferIOS getOfferIOS() {
        return this.offerIOS;
    }

    /* renamed from: component14, reason: from getter */
    public final Double getOriginalTransactionDateIOS() {
        return this.originalTransactionDateIOS;
    }

    /* renamed from: component15, reason: from getter */
    public final String getOriginalTransactionIdentifierIOS() {
        return this.originalTransactionIdentifierIOS;
    }

    /* renamed from: component16, reason: from getter */
    public final String getOwnershipTypeIOS() {
        return this.ownershipTypeIOS;
    }

    /* renamed from: component17, reason: from getter */
    public final IapPlatform getPlatform() {
        return this.platform;
    }

    /* renamed from: component18, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component19, reason: from getter */
    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppBundleIdIOS() {
        return this.appBundleIdIOS;
    }

    /* renamed from: component20, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component21, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getQuantityIOS() {
        return this.quantityIOS;
    }

    /* renamed from: component23, reason: from getter */
    public final String getReasonIOS() {
        return this.reasonIOS;
    }

    /* renamed from: component24, reason: from getter */
    public final String getReasonStringRepresentationIOS() {
        return this.reasonStringRepresentationIOS;
    }

    /* renamed from: component25, reason: from getter */
    public final RenewalInfoIOS getRenewalInfoIOS() {
        return this.renewalInfoIOS;
    }

    /* renamed from: component26, reason: from getter */
    public final Double getRevocationDateIOS() {
        return this.revocationDateIOS;
    }

    /* renamed from: component27, reason: from getter */
    public final String getRevocationReasonIOS() {
        return this.revocationReasonIOS;
    }

    /* renamed from: component28, reason: from getter */
    public final IapStore getStore() {
        return this.store;
    }

    /* renamed from: component29, reason: from getter */
    public final String getStorefrontCountryCodeIOS() {
        return this.storefrontCountryCodeIOS;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryCodeIOS() {
        return this.countryCodeIOS;
    }

    /* renamed from: component30, reason: from getter */
    public final String getSubscriptionGroupIdIOS() {
        return this.subscriptionGroupIdIOS;
    }

    /* renamed from: component31, reason: from getter */
    public final double getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: component32, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component33, reason: from getter */
    public final String getTransactionReasonIOS() {
        return this.transactionReasonIOS;
    }

    /* renamed from: component34, reason: from getter */
    public final String getWebOrderLineItemIdIOS() {
        return this.webOrderLineItemIdIOS;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrencyCodeIOS() {
        return this.currencyCodeIOS;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCurrencySymbolIOS() {
        return this.currencySymbolIOS;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCurrentPlanId() {
        return this.currentPlanId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEnvironmentIOS() {
        return this.environmentIOS;
    }

    /* renamed from: component8, reason: from getter */
    public final Double getExpirationDateIOS() {
        return this.expirationDateIOS;
    }

    /* renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final PurchaseIOS copy(String appAccountToken, String appBundleIdIOS, String countryCodeIOS, String currencyCodeIOS, String currencySymbolIOS, String currentPlanId, String environmentIOS, Double expirationDateIOS, String id, List<String> ids, boolean isAutoRenewing, Boolean isUpgradedIOS, PurchaseOfferIOS offerIOS, Double originalTransactionDateIOS, String originalTransactionIdentifierIOS, String ownershipTypeIOS, IapPlatform platform, String productId, PurchaseState purchaseState, String purchaseToken, int quantity, Integer quantityIOS, String reasonIOS, String reasonStringRepresentationIOS, RenewalInfoIOS renewalInfoIOS, Double revocationDateIOS, String revocationReasonIOS, IapStore store, String storefrontCountryCodeIOS, String subscriptionGroupIdIOS, double transactionDate, String transactionId, String transactionReasonIOS, String webOrderLineItemIdIOS) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return new PurchaseIOS(appAccountToken, appBundleIdIOS, countryCodeIOS, currencyCodeIOS, currencySymbolIOS, currentPlanId, environmentIOS, expirationDateIOS, id, ids, isAutoRenewing, isUpgradedIOS, offerIOS, originalTransactionDateIOS, originalTransactionIdentifierIOS, ownershipTypeIOS, platform, productId, purchaseState, purchaseToken, quantity, quantityIOS, reasonIOS, reasonStringRepresentationIOS, renewalInfoIOS, revocationDateIOS, revocationReasonIOS, store, storefrontCountryCodeIOS, subscriptionGroupIdIOS, transactionDate, transactionId, transactionReasonIOS, webOrderLineItemIdIOS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseIOS)) {
            return false;
        }
        PurchaseIOS purchaseIOS = (PurchaseIOS) other;
        return Intrinsics.areEqual(this.appAccountToken, purchaseIOS.appAccountToken) && Intrinsics.areEqual(this.appBundleIdIOS, purchaseIOS.appBundleIdIOS) && Intrinsics.areEqual(this.countryCodeIOS, purchaseIOS.countryCodeIOS) && Intrinsics.areEqual(this.currencyCodeIOS, purchaseIOS.currencyCodeIOS) && Intrinsics.areEqual(this.currencySymbolIOS, purchaseIOS.currencySymbolIOS) && Intrinsics.areEqual(this.currentPlanId, purchaseIOS.currentPlanId) && Intrinsics.areEqual(this.environmentIOS, purchaseIOS.environmentIOS) && Intrinsics.areEqual((Object) this.expirationDateIOS, (Object) purchaseIOS.expirationDateIOS) && Intrinsics.areEqual(this.id, purchaseIOS.id) && Intrinsics.areEqual(this.ids, purchaseIOS.ids) && this.isAutoRenewing == purchaseIOS.isAutoRenewing && Intrinsics.areEqual(this.isUpgradedIOS, purchaseIOS.isUpgradedIOS) && Intrinsics.areEqual(this.offerIOS, purchaseIOS.offerIOS) && Intrinsics.areEqual((Object) this.originalTransactionDateIOS, (Object) purchaseIOS.originalTransactionDateIOS) && Intrinsics.areEqual(this.originalTransactionIdentifierIOS, purchaseIOS.originalTransactionIdentifierIOS) && Intrinsics.areEqual(this.ownershipTypeIOS, purchaseIOS.ownershipTypeIOS) && this.platform == purchaseIOS.platform && Intrinsics.areEqual(this.productId, purchaseIOS.productId) && this.purchaseState == purchaseIOS.purchaseState && Intrinsics.areEqual(this.purchaseToken, purchaseIOS.purchaseToken) && this.quantity == purchaseIOS.quantity && Intrinsics.areEqual(this.quantityIOS, purchaseIOS.quantityIOS) && Intrinsics.areEqual(this.reasonIOS, purchaseIOS.reasonIOS) && Intrinsics.areEqual(this.reasonStringRepresentationIOS, purchaseIOS.reasonStringRepresentationIOS) && Intrinsics.areEqual(this.renewalInfoIOS, purchaseIOS.renewalInfoIOS) && Intrinsics.areEqual((Object) this.revocationDateIOS, (Object) purchaseIOS.revocationDateIOS) && Intrinsics.areEqual(this.revocationReasonIOS, purchaseIOS.revocationReasonIOS) && this.store == purchaseIOS.store && Intrinsics.areEqual(this.storefrontCountryCodeIOS, purchaseIOS.storefrontCountryCodeIOS) && Intrinsics.areEqual(this.subscriptionGroupIdIOS, purchaseIOS.subscriptionGroupIdIOS) && Double.compare(this.transactionDate, purchaseIOS.transactionDate) == 0 && Intrinsics.areEqual(this.transactionId, purchaseIOS.transactionId) && Intrinsics.areEqual(this.transactionReasonIOS, purchaseIOS.transactionReasonIOS) && Intrinsics.areEqual(this.webOrderLineItemIdIOS, purchaseIOS.webOrderLineItemIdIOS);
    }

    public int hashCode() {
        String str = this.appAccountToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appBundleIdIOS;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCodeIOS;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyCodeIOS;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currencySymbolIOS;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currentPlanId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.environmentIOS;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d = this.expirationDateIOS;
        int hashCode8 = (((hashCode7 + (d == null ? 0 : d.hashCode())) * 31) + this.id.hashCode()) * 31;
        List<String> list = this.ids;
        int hashCode9 = (((hashCode8 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isAutoRenewing)) * 31;
        Boolean bool = this.isUpgradedIOS;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        PurchaseOfferIOS purchaseOfferIOS = this.offerIOS;
        int hashCode11 = (hashCode10 + (purchaseOfferIOS == null ? 0 : purchaseOfferIOS.hashCode())) * 31;
        Double d2 = this.originalTransactionDateIOS;
        int hashCode12 = (hashCode11 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str8 = this.originalTransactionIdentifierIOS;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.ownershipTypeIOS;
        int hashCode14 = (((((((hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.platform.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.purchaseState.hashCode()) * 31;
        String str10 = this.purchaseToken;
        int hashCode15 = (((hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31;
        Integer num = this.quantityIOS;
        int hashCode16 = (hashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        String str11 = this.reasonIOS;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.reasonStringRepresentationIOS;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        RenewalInfoIOS renewalInfoIOS = this.renewalInfoIOS;
        int hashCode19 = (hashCode18 + (renewalInfoIOS == null ? 0 : renewalInfoIOS.hashCode())) * 31;
        Double d3 = this.revocationDateIOS;
        int hashCode20 = (hashCode19 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str13 = this.revocationReasonIOS;
        int hashCode21 = (((hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31) + this.store.hashCode()) * 31;
        String str14 = this.storefrontCountryCodeIOS;
        int hashCode22 = (hashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.subscriptionGroupIdIOS;
        int hashCode23 = (((((hashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31) + Double.hashCode(this.transactionDate)) * 31) + this.transactionId.hashCode()) * 31;
        String str16 = this.transactionReasonIOS;
        int hashCode24 = (hashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.webOrderLineItemIdIOS;
        return hashCode24 + (str17 != null ? str17.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseIOS(appAccountToken=" + this.appAccountToken + ", appBundleIdIOS=" + this.appBundleIdIOS + ", countryCodeIOS=" + this.countryCodeIOS + ", currencyCodeIOS=" + this.currencyCodeIOS + ", currencySymbolIOS=" + this.currencySymbolIOS + ", currentPlanId=" + this.currentPlanId + ", environmentIOS=" + this.environmentIOS + ", expirationDateIOS=" + this.expirationDateIOS + ", id=" + this.id + ", ids=" + this.ids + ", isAutoRenewing=" + this.isAutoRenewing + ", isUpgradedIOS=" + this.isUpgradedIOS + ", offerIOS=" + this.offerIOS + ", originalTransactionDateIOS=" + this.originalTransactionDateIOS + ", originalTransactionIdentifierIOS=" + this.originalTransactionIdentifierIOS + ", ownershipTypeIOS=" + this.ownershipTypeIOS + ", platform=" + this.platform + ", productId=" + this.productId + ", purchaseState=" + this.purchaseState + ", purchaseToken=" + this.purchaseToken + ", quantity=" + this.quantity + ", quantityIOS=" + this.quantityIOS + ", reasonIOS=" + this.reasonIOS + ", reasonStringRepresentationIOS=" + this.reasonStringRepresentationIOS + ", renewalInfoIOS=" + this.renewalInfoIOS + ", revocationDateIOS=" + this.revocationDateIOS + ", revocationReasonIOS=" + this.revocationReasonIOS + ", store=" + this.store + ", storefrontCountryCodeIOS=" + this.storefrontCountryCodeIOS + ", subscriptionGroupIdIOS=" + this.subscriptionGroupIdIOS + ", transactionDate=" + this.transactionDate + ", transactionId=" + this.transactionId + ", transactionReasonIOS=" + this.transactionReasonIOS + ", webOrderLineItemIdIOS=" + this.webOrderLineItemIdIOS + ")";
    }

    public PurchaseIOS(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, String id, List<String> list, boolean z, Boolean bool, PurchaseOfferIOS purchaseOfferIOS, Double d2, String str8, String str9, IapPlatform platform, String productId, PurchaseState purchaseState, String str10, int i, Integer num, String str11, String str12, RenewalInfoIOS renewalInfoIOS, Double d3, String str13, IapStore store, String str14, String str15, double d4, String transactionId, String str16, String str17) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.appAccountToken = str;
        this.appBundleIdIOS = str2;
        this.countryCodeIOS = str3;
        this.currencyCodeIOS = str4;
        this.currencySymbolIOS = str5;
        this.currentPlanId = str6;
        this.environmentIOS = str7;
        this.expirationDateIOS = d;
        this.id = id;
        this.ids = list;
        this.isAutoRenewing = z;
        this.isUpgradedIOS = bool;
        this.offerIOS = purchaseOfferIOS;
        this.originalTransactionDateIOS = d2;
        this.originalTransactionIdentifierIOS = str8;
        this.ownershipTypeIOS = str9;
        this.platform = platform;
        this.productId = productId;
        this.purchaseState = purchaseState;
        this.purchaseToken = str10;
        this.quantity = i;
        this.quantityIOS = num;
        this.reasonIOS = str11;
        this.reasonStringRepresentationIOS = str12;
        this.renewalInfoIOS = renewalInfoIOS;
        this.revocationDateIOS = d3;
        this.revocationReasonIOS = str13;
        this.store = store;
        this.storefrontCountryCodeIOS = str14;
        this.subscriptionGroupIdIOS = str15;
        this.transactionDate = d4;
        this.transactionId = transactionId;
        this.transactionReasonIOS = str16;
        this.webOrderLineItemIdIOS = str17;
    }

    public /* synthetic */ PurchaseIOS(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, String str8, List list, boolean z, Boolean bool, PurchaseOfferIOS purchaseOfferIOS, Double d2, String str9, String str10, IapPlatform iapPlatform, String str11, PurchaseState purchaseState, String str12, int i, Integer num, String str13, String str14, RenewalInfoIOS renewalInfoIOS, Double d3, String str15, IapStore iapStore, String str16, String str17, double d4, String str18, String str19, String str20, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : d, str8, (i2 & 512) != 0 ? null : list, z, (i2 & 2048) != 0 ? null : bool, (i2 & 4096) != 0 ? null : purchaseOfferIOS, (i2 & 8192) != 0 ? null : d2, (i2 & 16384) != 0 ? null : str9, (32768 & i2) != 0 ? null : str10, iapPlatform, str11, purchaseState, (524288 & i2) != 0 ? null : str12, i, (2097152 & i2) != 0 ? null : num, (4194304 & i2) != 0 ? null : str13, (8388608 & i2) != 0 ? null : str14, (16777216 & i2) != 0 ? null : renewalInfoIOS, (33554432 & i2) != 0 ? null : d3, (67108864 & i2) != 0 ? null : str15, iapStore, (268435456 & i2) != 0 ? null : str16, (i2 & 536870912) != 0 ? null : str17, d4, str18, (i3 & 1) != 0 ? null : str19, (i3 & 2) != 0 ? null : str20);
    }

    public final String getAppAccountToken() {
        return this.appAccountToken;
    }

    public final String getAppBundleIdIOS() {
        return this.appBundleIdIOS;
    }

    public final String getCountryCodeIOS() {
        return this.countryCodeIOS;
    }

    public final String getCurrencyCodeIOS() {
        return this.currencyCodeIOS;
    }

    public final String getCurrencySymbolIOS() {
        return this.currencySymbolIOS;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public String getCurrentPlanId() {
        return this.currentPlanId;
    }

    public final String getEnvironmentIOS() {
        return this.environmentIOS;
    }

    public final Double getExpirationDateIOS() {
        return this.expirationDateIOS;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public String getId() {
        return this.id;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public List<String> getIds() {
        return this.ids;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final Boolean isUpgradedIOS() {
        return this.isUpgradedIOS;
    }

    public final PurchaseOfferIOS getOfferIOS() {
        return this.offerIOS;
    }

    public final Double getOriginalTransactionDateIOS() {
        return this.originalTransactionDateIOS;
    }

    public final String getOriginalTransactionIdentifierIOS() {
        return this.originalTransactionIdentifierIOS;
    }

    public final String getOwnershipTypeIOS() {
        return this.ownershipTypeIOS;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public IapPlatform getPlatform() {
        return this.platform;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public String getProductId() {
        return this.productId;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public String getPurchaseToken() {
        return this.purchaseToken;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public int getQuantity() {
        return this.quantity;
    }

    public final Integer getQuantityIOS() {
        return this.quantityIOS;
    }

    public final String getReasonIOS() {
        return this.reasonIOS;
    }

    public final String getReasonStringRepresentationIOS() {
        return this.reasonStringRepresentationIOS;
    }

    public final RenewalInfoIOS getRenewalInfoIOS() {
        return this.renewalInfoIOS;
    }

    public final Double getRevocationDateIOS() {
        return this.revocationDateIOS;
    }

    public final String getRevocationReasonIOS() {
        return this.revocationReasonIOS;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public IapStore getStore() {
        return this.store;
    }

    public final String getStorefrontCountryCodeIOS() {
        return this.storefrontCountryCodeIOS;
    }

    public final String getSubscriptionGroupIdIOS() {
        return this.subscriptionGroupIdIOS;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public double getTransactionDate() {
        return this.transactionDate;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getTransactionReasonIOS() {
        return this.transactionReasonIOS;
    }

    public final String getWebOrderLineItemIdIOS() {
        return this.webOrderLineItemIdIOS;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/PurchaseIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/PurchaseIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PurchaseIOS fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            IapPlatform iapPlatform;
            PurchaseState purchaseState;
            IapStore iapStore;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("appAccountToken");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("appBundleIdIOS");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("countryCodeIOS");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = json.get("currencyCodeIOS");
            String str4 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = json.get("currencySymbolIOS");
            String str5 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = json.get("currentPlanId");
            String str6 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = json.get("environmentIOS");
            String str7 = obj7 instanceof String ? (String) obj7 : null;
            Object obj8 = json.get("expirationDateIOS");
            Number number = obj8 instanceof Number ? (Number) obj8 : null;
            Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            Object obj9 = json.get("id");
            String str8 = obj9 instanceof String ? (String) obj9 : null;
            String str9 = str8 == null ? "" : str8;
            Object obj10 = json.get("ids");
            List list = obj10 instanceof List ? (List) obj10 : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj11 : list) {
                    String str10 = obj11 instanceof String ? (String) obj11 : null;
                    if (str10 != null) {
                        arrayList2.add(str10);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Object obj12 = json.get("isAutoRenewing");
            Boolean bool = obj12 instanceof Boolean ? (Boolean) obj12 : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Object obj13 = json.get("isUpgradedIOS");
            Boolean bool2 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
            Object obj14 = json.get("offerIOS");
            Map<String, ? extends Object> map = obj14 instanceof Map ? (Map) obj14 : null;
            PurchaseOfferIOS fromJson = map != null ? PurchaseOfferIOS.INSTANCE.fromJson(map) : null;
            Object obj15 = json.get("originalTransactionDateIOS");
            Boolean bool3 = bool2;
            Number number2 = obj15 instanceof Number ? (Number) obj15 : null;
            Double valueOf2 = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
            Object obj16 = json.get("originalTransactionIdentifierIOS");
            Double d = valueOf2;
            String str11 = obj16 instanceof String ? (String) obj16 : null;
            Object obj17 = json.get("ownershipTypeIOS");
            String str12 = obj17 instanceof String ? (String) obj17 : null;
            Object obj18 = json.get("platform");
            String str13 = str12;
            String str14 = obj18 instanceof String ? (String) obj18 : null;
            if (str14 == null || (iapPlatform = IapPlatform.INSTANCE.fromJson(str14)) == null) {
                iapPlatform = IapPlatform.Ios;
            }
            Object obj19 = json.get("productId");
            IapPlatform iapPlatform2 = iapPlatform;
            String str15 = obj19 instanceof String ? (String) obj19 : null;
            if (str15 == null) {
                str15 = "";
            }
            Object obj20 = json.get("purchaseState");
            String str16 = str15;
            String str17 = obj20 instanceof String ? (String) obj20 : null;
            if (str17 == null || (purchaseState = PurchaseState.INSTANCE.fromJson(str17)) == null) {
                purchaseState = PurchaseState.Pending;
            }
            Object obj21 = json.get("purchaseToken");
            PurchaseState purchaseState2 = purchaseState;
            String str18 = obj21 instanceof String ? (String) obj21 : null;
            Object obj22 = json.get("quantity");
            String str19 = str18;
            Number number3 = obj22 instanceof Number ? (Number) obj22 : null;
            int intValue = number3 != null ? number3.intValue() : 0;
            Object obj23 = json.get("quantityIOS");
            Number number4 = obj23 instanceof Number ? (Number) obj23 : null;
            Integer valueOf3 = number4 != null ? Integer.valueOf(number4.intValue()) : null;
            Object obj24 = json.get("reasonIOS");
            String str20 = obj24 instanceof String ? (String) obj24 : null;
            Object obj25 = json.get("reasonStringRepresentationIOS");
            String str21 = obj25 instanceof String ? (String) obj25 : null;
            Object obj26 = json.get("renewalInfoIOS");
            Map<String, ? extends Object> map2 = obj26 instanceof Map ? (Map) obj26 : null;
            RenewalInfoIOS fromJson2 = map2 != null ? RenewalInfoIOS.INSTANCE.fromJson(map2) : null;
            Object obj27 = json.get("revocationDateIOS");
            Number number5 = obj27 instanceof Number ? (Number) obj27 : null;
            Double valueOf4 = number5 != null ? Double.valueOf(number5.doubleValue()) : null;
            Object obj28 = json.get("revocationReasonIOS");
            String str22 = obj28 instanceof String ? (String) obj28 : null;
            Object obj29 = json.get("store");
            String str23 = obj29 instanceof String ? (String) obj29 : null;
            if (str23 == null || (iapStore = IapStore.INSTANCE.fromJson(str23)) == null) {
                iapStore = IapStore.Unknown;
            }
            IapStore iapStore2 = iapStore;
            Object obj30 = json.get("storefrontCountryCodeIOS");
            String str24 = obj30 instanceof String ? (String) obj30 : null;
            Object obj31 = json.get("subscriptionGroupIdIOS");
            String str25 = obj31 instanceof String ? (String) obj31 : null;
            Object obj32 = json.get("transactionDate");
            Number number6 = obj32 instanceof Number ? (Number) obj32 : null;
            double doubleValue = number6 != null ? number6.doubleValue() : 0.0d;
            Object obj33 = json.get("transactionId");
            String str26 = obj33 instanceof String ? (String) obj33 : null;
            String str27 = str26 == null ? "" : str26;
            Object obj34 = json.get("transactionReasonIOS");
            String str28 = obj34 instanceof String ? (String) obj34 : null;
            Object obj35 = json.get("webOrderLineItemIdIOS");
            return new PurchaseIOS(str, str2, str3, str4, str5, str6, str7, valueOf, str9, arrayList, booleanValue, bool3, fromJson, d, str11, str13, iapPlatform2, str16, purchaseState2, str19, intValue, valueOf3, str20, str21, fromJson2, valueOf4, str22, iapStore2, str24, str25, doubleValue, str27, str28, obj35 instanceof String ? (String) obj35 : null);
        }
    }

    @Override // dev.hyo.openiap.Purchase
    public Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[35];
        pairArr[0] = TuplesKt.to("__typename", "PurchaseIOS");
        pairArr[1] = TuplesKt.to("appAccountToken", this.appAccountToken);
        pairArr[2] = TuplesKt.to("appBundleIdIOS", this.appBundleIdIOS);
        pairArr[3] = TuplesKt.to("countryCodeIOS", this.countryCodeIOS);
        pairArr[4] = TuplesKt.to("currencyCodeIOS", this.currencyCodeIOS);
        pairArr[5] = TuplesKt.to("currencySymbolIOS", this.currencySymbolIOS);
        pairArr[6] = TuplesKt.to("currentPlanId", getCurrentPlanId());
        pairArr[7] = TuplesKt.to("environmentIOS", this.environmentIOS);
        pairArr[8] = TuplesKt.to("expirationDateIOS", this.expirationDateIOS);
        pairArr[9] = TuplesKt.to("id", getId());
        pairArr[10] = TuplesKt.to("ids", getIds());
        pairArr[11] = TuplesKt.to("isAutoRenewing", Boolean.valueOf(isAutoRenewing()));
        pairArr[12] = TuplesKt.to("isUpgradedIOS", this.isUpgradedIOS);
        PurchaseOfferIOS purchaseOfferIOS = this.offerIOS;
        pairArr[13] = TuplesKt.to("offerIOS", purchaseOfferIOS != null ? purchaseOfferIOS.toJson() : null);
        pairArr[14] = TuplesKt.to("originalTransactionDateIOS", this.originalTransactionDateIOS);
        pairArr[15] = TuplesKt.to("originalTransactionIdentifierIOS", this.originalTransactionIdentifierIOS);
        pairArr[16] = TuplesKt.to("ownershipTypeIOS", this.ownershipTypeIOS);
        pairArr[17] = TuplesKt.to("platform", getPlatform().toJson());
        pairArr[18] = TuplesKt.to("productId", getProductId());
        pairArr[19] = TuplesKt.to("purchaseState", getPurchaseState().toJson());
        pairArr[20] = TuplesKt.to("purchaseToken", getPurchaseToken());
        pairArr[21] = TuplesKt.to("quantity", Integer.valueOf(getQuantity()));
        pairArr[22] = TuplesKt.to("quantityIOS", this.quantityIOS);
        pairArr[23] = TuplesKt.to("reasonIOS", this.reasonIOS);
        pairArr[24] = TuplesKt.to("reasonStringRepresentationIOS", this.reasonStringRepresentationIOS);
        RenewalInfoIOS renewalInfoIOS = this.renewalInfoIOS;
        pairArr[25] = TuplesKt.to("renewalInfoIOS", renewalInfoIOS != null ? renewalInfoIOS.toJson() : null);
        pairArr[26] = TuplesKt.to("revocationDateIOS", this.revocationDateIOS);
        pairArr[27] = TuplesKt.to("revocationReasonIOS", this.revocationReasonIOS);
        pairArr[28] = TuplesKt.to("store", getStore().toJson());
        pairArr[29] = TuplesKt.to("storefrontCountryCodeIOS", this.storefrontCountryCodeIOS);
        pairArr[30] = TuplesKt.to("subscriptionGroupIdIOS", this.subscriptionGroupIdIOS);
        pairArr[31] = TuplesKt.to("transactionDate", Double.valueOf(getTransactionDate()));
        pairArr[32] = TuplesKt.to("transactionId", this.transactionId);
        pairArr[33] = TuplesKt.to("transactionReasonIOS", this.transactionReasonIOS);
        pairArr[34] = TuplesKt.to("webOrderLineItemIdIOS", this.webOrderLineItemIdIOS);
        return MapsKt.mapOf(pairArr);
    }
}
