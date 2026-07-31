package com.margelo.nitro.iap;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.sqlite.driver.bundled.BundledSQLite;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseIOS.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bZ\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002\u0086\u0001BÉ\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010(\u001a\u00020)\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010,\u001a\u00020 \u0012\u0006\u0010-\u001a\u00020\r\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b0\u00101J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010f\u001a\u00020\rHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010h\u001a\u00020\u0011HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u001aHÆ\u0003J\t\u0010o\u001a\u00020\rHÆ\u0003J\t\u0010p\u001a\u00020\u001dHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010r\u001a\u00020 HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010y\u001a\u00020)HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010|\u001a\u00020 HÆ\u0003J\t\u0010}\u001a\u00020\rHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0090\u0003\u0010\u0080\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010,\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020\r2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0015\u0010\u0081\u0001\u001a\u00020\u00112\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0083\u0001\u001a\u00030\u0084\u0001HÖ\u0001J\n\u0010\u0085\u0001\u001a\u00020\rHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010@R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010AR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010;R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00103R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00103R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0016\u0010\u001b\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010=R\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00103R\u0016\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010;R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00103R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00103R\u0018\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0018\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010;R\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u00103R\u0016\u0010(\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00103R\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00103R\u0016\u0010,\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010NR\u0016\u0010-\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010=R\u0018\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u00103R\u0018\u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u00103¨\u0006\u0087\u0001"}, d2 = {"Lcom/margelo/nitro/iap/PurchaseIOS;", "", "appAccountToken", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "appBundleIdIOS", "countryCodeIOS", "currencyCodeIOS", "currencySymbolIOS", "currentPlanId", "environmentIOS", "expirationDateIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "id", "", "ids", "Lcom/margelo/nitro/iap/Variant_NullType_Array_String_;", "isAutoRenewing", "", "isUpgradedIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "offerIOS", "Lcom/margelo/nitro/iap/Variant_NullType_PurchaseOfferIOS;", "originalTransactionDateIOS", "originalTransactionIdentifierIOS", "ownershipTypeIOS", "platform", "Lcom/margelo/nitro/iap/IapPlatform;", "productId", "purchaseState", "Lcom/margelo/nitro/iap/PurchaseState;", "purchaseToken", "quantity", "", "quantityIOS", "reasonIOS", "reasonStringRepresentationIOS", "renewalInfoIOS", "Lcom/margelo/nitro/iap/Variant_NullType_RenewalInfoIOS;", "revocationDateIOS", "revocationReasonIOS", "store", "Lcom/margelo/nitro/iap/IapStore;", "storefrontCountryCodeIOS", "subscriptionGroupIdIOS", "transactionDate", "transactionId", "transactionReasonIOS", "webOrderLineItemIdIOS", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_Array_String_;ZLcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_PurchaseOfferIOS;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/IapPlatform;Ljava/lang/String;Lcom/margelo/nitro/iap/PurchaseState;Lcom/margelo/nitro/iap/Variant_NullType_String;DLcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_RenewalInfoIOS;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/IapStore;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;DLjava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;)V", "getAppAccountToken", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getAppBundleIdIOS", "getCountryCodeIOS", "getCurrencyCodeIOS", "getCurrencySymbolIOS", "getCurrentPlanId", "getEnvironmentIOS", "getExpirationDateIOS", "()Lcom/margelo/nitro/iap/Variant_NullType_Double;", "getId", "()Ljava/lang/String;", "getIds", "()Lcom/margelo/nitro/iap/Variant_NullType_Array_String_;", "()Z", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getOfferIOS", "()Lcom/margelo/nitro/iap/Variant_NullType_PurchaseOfferIOS;", "getOriginalTransactionDateIOS", "getOriginalTransactionIdentifierIOS", "getOwnershipTypeIOS", "getPlatform", "()Lcom/margelo/nitro/iap/IapPlatform;", "getProductId", "getPurchaseState", "()Lcom/margelo/nitro/iap/PurchaseState;", "getPurchaseToken", "getQuantity", "()D", "getQuantityIOS", "getReasonIOS", "getReasonStringRepresentationIOS", "getRenewalInfoIOS", "()Lcom/margelo/nitro/iap/Variant_NullType_RenewalInfoIOS;", "getRevocationDateIOS", "getRevocationReasonIOS", "getStore", "()Lcom/margelo/nitro/iap/IapStore;", "getStorefrontCountryCodeIOS", "getSubscriptionGroupIdIOS", "getTransactionDate", "getTransactionId", "getTransactionReasonIOS", "getWebOrderLineItemIdIOS", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PurchaseIOS {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String appAccountToken;
    private final Variant_NullType_String appBundleIdIOS;
    private final Variant_NullType_String countryCodeIOS;
    private final Variant_NullType_String currencyCodeIOS;
    private final Variant_NullType_String currencySymbolIOS;
    private final Variant_NullType_String currentPlanId;
    private final Variant_NullType_String environmentIOS;
    private final Variant_NullType_Double expirationDateIOS;
    private final String id;
    private final Variant_NullType_Array_String_ ids;
    private final boolean isAutoRenewing;
    private final Variant_NullType_Boolean isUpgradedIOS;
    private final Variant_NullType_PurchaseOfferIOS offerIOS;
    private final Variant_NullType_Double originalTransactionDateIOS;
    private final Variant_NullType_String originalTransactionIdentifierIOS;
    private final Variant_NullType_String ownershipTypeIOS;
    private final IapPlatform platform;
    private final String productId;
    private final PurchaseState purchaseState;
    private final Variant_NullType_String purchaseToken;
    private final double quantity;
    private final Variant_NullType_Double quantityIOS;
    private final Variant_NullType_String reasonIOS;
    private final Variant_NullType_String reasonStringRepresentationIOS;
    private final Variant_NullType_RenewalInfoIOS renewalInfoIOS;
    private final Variant_NullType_Double revocationDateIOS;
    private final Variant_NullType_String revocationReasonIOS;
    private final IapStore store;
    private final Variant_NullType_String storefrontCountryCodeIOS;
    private final Variant_NullType_String subscriptionGroupIdIOS;
    private final double transactionDate;
    private final String transactionId;
    private final Variant_NullType_String transactionReasonIOS;
    private final Variant_NullType_String webOrderLineItemIdIOS;

    public static /* synthetic */ PurchaseIOS copy$default(PurchaseIOS purchaseIOS, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7, Variant_NullType_Double variant_NullType_Double, String str, Variant_NullType_Array_String_ variant_NullType_Array_String_, boolean z, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_PurchaseOfferIOS variant_NullType_PurchaseOfferIOS, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String8, Variant_NullType_String variant_NullType_String9, IapPlatform iapPlatform, String str2, PurchaseState purchaseState, Variant_NullType_String variant_NullType_String10, double d, Variant_NullType_Double variant_NullType_Double3, Variant_NullType_String variant_NullType_String11, Variant_NullType_String variant_NullType_String12, Variant_NullType_RenewalInfoIOS variant_NullType_RenewalInfoIOS, Variant_NullType_Double variant_NullType_Double4, Variant_NullType_String variant_NullType_String13, IapStore iapStore, Variant_NullType_String variant_NullType_String14, Variant_NullType_String variant_NullType_String15, double d2, String str3, Variant_NullType_String variant_NullType_String16, Variant_NullType_String variant_NullType_String17, int i, int i2, Object obj) {
        Variant_NullType_String variant_NullType_String18;
        String str4;
        Variant_NullType_String variant_NullType_String19;
        double d3;
        Variant_NullType_Double variant_NullType_Double5;
        Variant_NullType_String variant_NullType_String20;
        Variant_NullType_RenewalInfoIOS variant_NullType_RenewalInfoIOS2;
        Variant_NullType_Double variant_NullType_Double6;
        Variant_NullType_String variant_NullType_String21;
        IapStore iapStore2;
        Variant_NullType_String variant_NullType_String22;
        Variant_NullType_String variant_NullType_String23;
        Variant_NullType_String variant_NullType_String24;
        double d4;
        Variant_NullType_String variant_NullType_String25;
        Variant_NullType_String variant_NullType_String26;
        Variant_NullType_String variant_NullType_String27;
        Variant_NullType_Double variant_NullType_Double7;
        String str5;
        Variant_NullType_Array_String_ variant_NullType_Array_String_2;
        boolean z2;
        Variant_NullType_Boolean variant_NullType_Boolean2;
        Variant_NullType_PurchaseOfferIOS variant_NullType_PurchaseOfferIOS2;
        Variant_NullType_Double variant_NullType_Double8;
        Variant_NullType_String variant_NullType_String28;
        IapPlatform iapPlatform2;
        String str6;
        PurchaseState purchaseState2;
        Variant_NullType_String variant_NullType_String29;
        Variant_NullType_String variant_NullType_String30;
        Variant_NullType_String variant_NullType_String31;
        Variant_NullType_String variant_NullType_String32;
        Variant_NullType_String variant_NullType_String33;
        Variant_NullType_String variant_NullType_String34 = (i & 1) != 0 ? purchaseIOS.appAccountToken : variant_NullType_String;
        Variant_NullType_String variant_NullType_String35 = (i & 2) != 0 ? purchaseIOS.appBundleIdIOS : variant_NullType_String2;
        Variant_NullType_String variant_NullType_String36 = (i & 4) != 0 ? purchaseIOS.countryCodeIOS : variant_NullType_String3;
        Variant_NullType_String variant_NullType_String37 = (i & 8) != 0 ? purchaseIOS.currencyCodeIOS : variant_NullType_String4;
        Variant_NullType_String variant_NullType_String38 = (i & 16) != 0 ? purchaseIOS.currencySymbolIOS : variant_NullType_String5;
        Variant_NullType_String variant_NullType_String39 = (i & 32) != 0 ? purchaseIOS.currentPlanId : variant_NullType_String6;
        Variant_NullType_String variant_NullType_String40 = (i & 64) != 0 ? purchaseIOS.environmentIOS : variant_NullType_String7;
        Variant_NullType_Double variant_NullType_Double9 = (i & 128) != 0 ? purchaseIOS.expirationDateIOS : variant_NullType_Double;
        String str7 = (i & 256) != 0 ? purchaseIOS.id : str;
        Variant_NullType_Array_String_ variant_NullType_Array_String_3 = (i & 512) != 0 ? purchaseIOS.ids : variant_NullType_Array_String_;
        boolean z3 = (i & 1024) != 0 ? purchaseIOS.isAutoRenewing : z;
        Variant_NullType_Boolean variant_NullType_Boolean3 = (i & 2048) != 0 ? purchaseIOS.isUpgradedIOS : variant_NullType_Boolean;
        Variant_NullType_PurchaseOfferIOS variant_NullType_PurchaseOfferIOS3 = (i & 4096) != 0 ? purchaseIOS.offerIOS : variant_NullType_PurchaseOfferIOS;
        Variant_NullType_Double variant_NullType_Double10 = (i & 8192) != 0 ? purchaseIOS.originalTransactionDateIOS : variant_NullType_Double2;
        Variant_NullType_String variant_NullType_String41 = variant_NullType_String34;
        Variant_NullType_String variant_NullType_String42 = (i & 16384) != 0 ? purchaseIOS.originalTransactionIdentifierIOS : variant_NullType_String8;
        Variant_NullType_String variant_NullType_String43 = (i & 32768) != 0 ? purchaseIOS.ownershipTypeIOS : variant_NullType_String9;
        IapPlatform iapPlatform3 = (i & 65536) != 0 ? purchaseIOS.platform : iapPlatform;
        String str8 = (i & 131072) != 0 ? purchaseIOS.productId : str2;
        PurchaseState purchaseState3 = (i & 262144) != 0 ? purchaseIOS.purchaseState : purchaseState;
        Variant_NullType_String variant_NullType_String44 = (i & 524288) != 0 ? purchaseIOS.purchaseToken : variant_NullType_String10;
        Variant_NullType_String variant_NullType_String45 = variant_NullType_String42;
        double d5 = (i & 1048576) != 0 ? purchaseIOS.quantity : d;
        Variant_NullType_Double variant_NullType_Double11 = (i & 2097152) != 0 ? purchaseIOS.quantityIOS : variant_NullType_Double3;
        Variant_NullType_String variant_NullType_String46 = (i & 4194304) != 0 ? purchaseIOS.reasonIOS : variant_NullType_String11;
        Variant_NullType_Double variant_NullType_Double12 = variant_NullType_Double11;
        Variant_NullType_String variant_NullType_String47 = (i & 8388608) != 0 ? purchaseIOS.reasonStringRepresentationIOS : variant_NullType_String12;
        Variant_NullType_RenewalInfoIOS variant_NullType_RenewalInfoIOS3 = (i & 16777216) != 0 ? purchaseIOS.renewalInfoIOS : variant_NullType_RenewalInfoIOS;
        Variant_NullType_Double variant_NullType_Double13 = (i & BundledSQLite.SQLITE_OPEN_EXRESCODE) != 0 ? purchaseIOS.revocationDateIOS : variant_NullType_Double4;
        Variant_NullType_String variant_NullType_String48 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? purchaseIOS.revocationReasonIOS : variant_NullType_String13;
        IapStore iapStore3 = (i & 134217728) != 0 ? purchaseIOS.store : iapStore;
        Variant_NullType_String variant_NullType_String49 = (i & 268435456) != 0 ? purchaseIOS.storefrontCountryCodeIOS : variant_NullType_String14;
        Variant_NullType_String variant_NullType_String50 = (i & 536870912) != 0 ? purchaseIOS.subscriptionGroupIdIOS : variant_NullType_String15;
        Variant_NullType_String variant_NullType_String51 = variant_NullType_String46;
        double d6 = (i & 1073741824) != 0 ? purchaseIOS.transactionDate : d2;
        String str9 = (i & Integer.MIN_VALUE) != 0 ? purchaseIOS.transactionId : str3;
        Variant_NullType_String variant_NullType_String52 = (i2 & 1) != 0 ? purchaseIOS.transactionReasonIOS : variant_NullType_String16;
        if ((i2 & 2) != 0) {
            str4 = str9;
            variant_NullType_String18 = purchaseIOS.webOrderLineItemIdIOS;
            d3 = d5;
            variant_NullType_Double5 = variant_NullType_Double12;
            variant_NullType_String20 = variant_NullType_String47;
            variant_NullType_RenewalInfoIOS2 = variant_NullType_RenewalInfoIOS3;
            variant_NullType_Double6 = variant_NullType_Double13;
            variant_NullType_String21 = variant_NullType_String48;
            iapStore2 = iapStore3;
            variant_NullType_String22 = variant_NullType_String49;
            variant_NullType_String23 = variant_NullType_String51;
            variant_NullType_String24 = variant_NullType_String50;
            d4 = d6;
            variant_NullType_String25 = variant_NullType_String52;
            variant_NullType_String27 = variant_NullType_String40;
            variant_NullType_Double7 = variant_NullType_Double9;
            str5 = str7;
            variant_NullType_Array_String_2 = variant_NullType_Array_String_3;
            z2 = z3;
            variant_NullType_Boolean2 = variant_NullType_Boolean3;
            variant_NullType_PurchaseOfferIOS2 = variant_NullType_PurchaseOfferIOS3;
            variant_NullType_Double8 = variant_NullType_Double10;
            variant_NullType_String28 = variant_NullType_String43;
            iapPlatform2 = iapPlatform3;
            str6 = str8;
            purchaseState2 = purchaseState3;
            variant_NullType_String29 = variant_NullType_String45;
            variant_NullType_String19 = variant_NullType_String44;
            variant_NullType_String30 = variant_NullType_String35;
            variant_NullType_String31 = variant_NullType_String36;
            variant_NullType_String32 = variant_NullType_String37;
            variant_NullType_String33 = variant_NullType_String38;
            variant_NullType_String26 = variant_NullType_String39;
        } else {
            variant_NullType_String18 = variant_NullType_String17;
            str4 = str9;
            variant_NullType_String19 = variant_NullType_String44;
            d3 = d5;
            variant_NullType_Double5 = variant_NullType_Double12;
            variant_NullType_String20 = variant_NullType_String47;
            variant_NullType_RenewalInfoIOS2 = variant_NullType_RenewalInfoIOS3;
            variant_NullType_Double6 = variant_NullType_Double13;
            variant_NullType_String21 = variant_NullType_String48;
            iapStore2 = iapStore3;
            variant_NullType_String22 = variant_NullType_String49;
            variant_NullType_String23 = variant_NullType_String51;
            variant_NullType_String24 = variant_NullType_String50;
            d4 = d6;
            variant_NullType_String25 = variant_NullType_String52;
            variant_NullType_String26 = variant_NullType_String39;
            variant_NullType_String27 = variant_NullType_String40;
            variant_NullType_Double7 = variant_NullType_Double9;
            str5 = str7;
            variant_NullType_Array_String_2 = variant_NullType_Array_String_3;
            z2 = z3;
            variant_NullType_Boolean2 = variant_NullType_Boolean3;
            variant_NullType_PurchaseOfferIOS2 = variant_NullType_PurchaseOfferIOS3;
            variant_NullType_Double8 = variant_NullType_Double10;
            variant_NullType_String28 = variant_NullType_String43;
            iapPlatform2 = iapPlatform3;
            str6 = str8;
            purchaseState2 = purchaseState3;
            variant_NullType_String29 = variant_NullType_String45;
            variant_NullType_String30 = variant_NullType_String35;
            variant_NullType_String31 = variant_NullType_String36;
            variant_NullType_String32 = variant_NullType_String37;
            variant_NullType_String33 = variant_NullType_String38;
        }
        return purchaseIOS.copy(variant_NullType_String41, variant_NullType_String30, variant_NullType_String31, variant_NullType_String32, variant_NullType_String33, variant_NullType_String26, variant_NullType_String27, variant_NullType_Double7, str5, variant_NullType_Array_String_2, z2, variant_NullType_Boolean2, variant_NullType_PurchaseOfferIOS2, variant_NullType_Double8, variant_NullType_String29, variant_NullType_String28, iapPlatform2, str6, purchaseState2, variant_NullType_String19, d3, variant_NullType_Double5, variant_NullType_String23, variant_NullType_String20, variant_NullType_RenewalInfoIOS2, variant_NullType_Double6, variant_NullType_String21, iapStore2, variant_NullType_String22, variant_NullType_String24, d4, str4, variant_NullType_String25, variant_NullType_String18);
    }

    @JvmStatic
    private static final PurchaseIOS fromCpp(Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7, Variant_NullType_Double variant_NullType_Double, String str, Variant_NullType_Array_String_ variant_NullType_Array_String_, boolean z, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_PurchaseOfferIOS variant_NullType_PurchaseOfferIOS, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String8, Variant_NullType_String variant_NullType_String9, IapPlatform iapPlatform, String str2, PurchaseState purchaseState, Variant_NullType_String variant_NullType_String10, double d, Variant_NullType_Double variant_NullType_Double3, Variant_NullType_String variant_NullType_String11, Variant_NullType_String variant_NullType_String12, Variant_NullType_RenewalInfoIOS variant_NullType_RenewalInfoIOS, Variant_NullType_Double variant_NullType_Double4, Variant_NullType_String variant_NullType_String13, IapStore iapStore, Variant_NullType_String variant_NullType_String14, Variant_NullType_String variant_NullType_String15, double d2, String str3, Variant_NullType_String variant_NullType_String16, Variant_NullType_String variant_NullType_String17) {
        return INSTANCE.fromCpp(variant_NullType_String, variant_NullType_String2, variant_NullType_String3, variant_NullType_String4, variant_NullType_String5, variant_NullType_String6, variant_NullType_String7, variant_NullType_Double, str, variant_NullType_Array_String_, z, variant_NullType_Boolean, variant_NullType_PurchaseOfferIOS, variant_NullType_Double2, variant_NullType_String8, variant_NullType_String9, iapPlatform, str2, purchaseState, variant_NullType_String10, d, variant_NullType_Double3, variant_NullType_String11, variant_NullType_String12, variant_NullType_RenewalInfoIOS, variant_NullType_Double4, variant_NullType_String13, iapStore, variant_NullType_String14, variant_NullType_String15, d2, str3, variant_NullType_String16, variant_NullType_String17);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_String getAppAccountToken() {
        return this.appAccountToken;
    }

    /* renamed from: component10, reason: from getter */
    public final Variant_NullType_Array_String_ getIds() {
        return this.ids;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    /* renamed from: component12, reason: from getter */
    public final Variant_NullType_Boolean getIsUpgradedIOS() {
        return this.isUpgradedIOS;
    }

    /* renamed from: component13, reason: from getter */
    public final Variant_NullType_PurchaseOfferIOS getOfferIOS() {
        return this.offerIOS;
    }

    /* renamed from: component14, reason: from getter */
    public final Variant_NullType_Double getOriginalTransactionDateIOS() {
        return this.originalTransactionDateIOS;
    }

    /* renamed from: component15, reason: from getter */
    public final Variant_NullType_String getOriginalTransactionIdentifierIOS() {
        return this.originalTransactionIdentifierIOS;
    }

    /* renamed from: component16, reason: from getter */
    public final Variant_NullType_String getOwnershipTypeIOS() {
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
    public final Variant_NullType_String getAppBundleIdIOS() {
        return this.appBundleIdIOS;
    }

    /* renamed from: component20, reason: from getter */
    public final Variant_NullType_String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component21, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* renamed from: component22, reason: from getter */
    public final Variant_NullType_Double getQuantityIOS() {
        return this.quantityIOS;
    }

    /* renamed from: component23, reason: from getter */
    public final Variant_NullType_String getReasonIOS() {
        return this.reasonIOS;
    }

    /* renamed from: component24, reason: from getter */
    public final Variant_NullType_String getReasonStringRepresentationIOS() {
        return this.reasonStringRepresentationIOS;
    }

    /* renamed from: component25, reason: from getter */
    public final Variant_NullType_RenewalInfoIOS getRenewalInfoIOS() {
        return this.renewalInfoIOS;
    }

    /* renamed from: component26, reason: from getter */
    public final Variant_NullType_Double getRevocationDateIOS() {
        return this.revocationDateIOS;
    }

    /* renamed from: component27, reason: from getter */
    public final Variant_NullType_String getRevocationReasonIOS() {
        return this.revocationReasonIOS;
    }

    /* renamed from: component28, reason: from getter */
    public final IapStore getStore() {
        return this.store;
    }

    /* renamed from: component29, reason: from getter */
    public final Variant_NullType_String getStorefrontCountryCodeIOS() {
        return this.storefrontCountryCodeIOS;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_String getCountryCodeIOS() {
        return this.countryCodeIOS;
    }

    /* renamed from: component30, reason: from getter */
    public final Variant_NullType_String getSubscriptionGroupIdIOS() {
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
    public final Variant_NullType_String getTransactionReasonIOS() {
        return this.transactionReasonIOS;
    }

    /* renamed from: component34, reason: from getter */
    public final Variant_NullType_String getWebOrderLineItemIdIOS() {
        return this.webOrderLineItemIdIOS;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_String getCurrencyCodeIOS() {
        return this.currencyCodeIOS;
    }

    /* renamed from: component5, reason: from getter */
    public final Variant_NullType_String getCurrencySymbolIOS() {
        return this.currencySymbolIOS;
    }

    /* renamed from: component6, reason: from getter */
    public final Variant_NullType_String getCurrentPlanId() {
        return this.currentPlanId;
    }

    /* renamed from: component7, reason: from getter */
    public final Variant_NullType_String getEnvironmentIOS() {
        return this.environmentIOS;
    }

    /* renamed from: component8, reason: from getter */
    public final Variant_NullType_Double getExpirationDateIOS() {
        return this.expirationDateIOS;
    }

    /* renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final PurchaseIOS copy(Variant_NullType_String appAccountToken, Variant_NullType_String appBundleIdIOS, Variant_NullType_String countryCodeIOS, Variant_NullType_String currencyCodeIOS, Variant_NullType_String currencySymbolIOS, Variant_NullType_String currentPlanId, Variant_NullType_String environmentIOS, Variant_NullType_Double expirationDateIOS, String id, Variant_NullType_Array_String_ ids, boolean isAutoRenewing, Variant_NullType_Boolean isUpgradedIOS, Variant_NullType_PurchaseOfferIOS offerIOS, Variant_NullType_Double originalTransactionDateIOS, Variant_NullType_String originalTransactionIdentifierIOS, Variant_NullType_String ownershipTypeIOS, IapPlatform platform, String productId, PurchaseState purchaseState, Variant_NullType_String purchaseToken, double quantity, Variant_NullType_Double quantityIOS, Variant_NullType_String reasonIOS, Variant_NullType_String reasonStringRepresentationIOS, Variant_NullType_RenewalInfoIOS renewalInfoIOS, Variant_NullType_Double revocationDateIOS, Variant_NullType_String revocationReasonIOS, IapStore store, Variant_NullType_String storefrontCountryCodeIOS, Variant_NullType_String subscriptionGroupIdIOS, double transactionDate, String transactionId, Variant_NullType_String transactionReasonIOS, Variant_NullType_String webOrderLineItemIdIOS) {
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
        return Intrinsics.areEqual(this.appAccountToken, purchaseIOS.appAccountToken) && Intrinsics.areEqual(this.appBundleIdIOS, purchaseIOS.appBundleIdIOS) && Intrinsics.areEqual(this.countryCodeIOS, purchaseIOS.countryCodeIOS) && Intrinsics.areEqual(this.currencyCodeIOS, purchaseIOS.currencyCodeIOS) && Intrinsics.areEqual(this.currencySymbolIOS, purchaseIOS.currencySymbolIOS) && Intrinsics.areEqual(this.currentPlanId, purchaseIOS.currentPlanId) && Intrinsics.areEqual(this.environmentIOS, purchaseIOS.environmentIOS) && Intrinsics.areEqual(this.expirationDateIOS, purchaseIOS.expirationDateIOS) && Intrinsics.areEqual(this.id, purchaseIOS.id) && Intrinsics.areEqual(this.ids, purchaseIOS.ids) && this.isAutoRenewing == purchaseIOS.isAutoRenewing && Intrinsics.areEqual(this.isUpgradedIOS, purchaseIOS.isUpgradedIOS) && Intrinsics.areEqual(this.offerIOS, purchaseIOS.offerIOS) && Intrinsics.areEqual(this.originalTransactionDateIOS, purchaseIOS.originalTransactionDateIOS) && Intrinsics.areEqual(this.originalTransactionIdentifierIOS, purchaseIOS.originalTransactionIdentifierIOS) && Intrinsics.areEqual(this.ownershipTypeIOS, purchaseIOS.ownershipTypeIOS) && this.platform == purchaseIOS.platform && Intrinsics.areEqual(this.productId, purchaseIOS.productId) && this.purchaseState == purchaseIOS.purchaseState && Intrinsics.areEqual(this.purchaseToken, purchaseIOS.purchaseToken) && Double.compare(this.quantity, purchaseIOS.quantity) == 0 && Intrinsics.areEqual(this.quantityIOS, purchaseIOS.quantityIOS) && Intrinsics.areEqual(this.reasonIOS, purchaseIOS.reasonIOS) && Intrinsics.areEqual(this.reasonStringRepresentationIOS, purchaseIOS.reasonStringRepresentationIOS) && Intrinsics.areEqual(this.renewalInfoIOS, purchaseIOS.renewalInfoIOS) && Intrinsics.areEqual(this.revocationDateIOS, purchaseIOS.revocationDateIOS) && Intrinsics.areEqual(this.revocationReasonIOS, purchaseIOS.revocationReasonIOS) && this.store == purchaseIOS.store && Intrinsics.areEqual(this.storefrontCountryCodeIOS, purchaseIOS.storefrontCountryCodeIOS) && Intrinsics.areEqual(this.subscriptionGroupIdIOS, purchaseIOS.subscriptionGroupIdIOS) && Double.compare(this.transactionDate, purchaseIOS.transactionDate) == 0 && Intrinsics.areEqual(this.transactionId, purchaseIOS.transactionId) && Intrinsics.areEqual(this.transactionReasonIOS, purchaseIOS.transactionReasonIOS) && Intrinsics.areEqual(this.webOrderLineItemIdIOS, purchaseIOS.webOrderLineItemIdIOS);
    }

    public int hashCode() {
        Variant_NullType_String variant_NullType_String = this.appAccountToken;
        int hashCode = (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String2 = this.appBundleIdIOS;
        int hashCode2 = (hashCode + (variant_NullType_String2 == null ? 0 : variant_NullType_String2.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String3 = this.countryCodeIOS;
        int hashCode3 = (hashCode2 + (variant_NullType_String3 == null ? 0 : variant_NullType_String3.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String4 = this.currencyCodeIOS;
        int hashCode4 = (hashCode3 + (variant_NullType_String4 == null ? 0 : variant_NullType_String4.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String5 = this.currencySymbolIOS;
        int hashCode5 = (hashCode4 + (variant_NullType_String5 == null ? 0 : variant_NullType_String5.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String6 = this.currentPlanId;
        int hashCode6 = (hashCode5 + (variant_NullType_String6 == null ? 0 : variant_NullType_String6.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String7 = this.environmentIOS;
        int hashCode7 = (hashCode6 + (variant_NullType_String7 == null ? 0 : variant_NullType_String7.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double = this.expirationDateIOS;
        int hashCode8 = (((hashCode7 + (variant_NullType_Double == null ? 0 : variant_NullType_Double.hashCode())) * 31) + this.id.hashCode()) * 31;
        Variant_NullType_Array_String_ variant_NullType_Array_String_ = this.ids;
        int hashCode9 = (((hashCode8 + (variant_NullType_Array_String_ == null ? 0 : variant_NullType_Array_String_.hashCode())) * 31) + Boolean.hashCode(this.isAutoRenewing)) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.isUpgradedIOS;
        int hashCode10 = (hashCode9 + (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode())) * 31;
        Variant_NullType_PurchaseOfferIOS variant_NullType_PurchaseOfferIOS = this.offerIOS;
        int hashCode11 = (hashCode10 + (variant_NullType_PurchaseOfferIOS == null ? 0 : variant_NullType_PurchaseOfferIOS.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double2 = this.originalTransactionDateIOS;
        int hashCode12 = (hashCode11 + (variant_NullType_Double2 == null ? 0 : variant_NullType_Double2.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String8 = this.originalTransactionIdentifierIOS;
        int hashCode13 = (hashCode12 + (variant_NullType_String8 == null ? 0 : variant_NullType_String8.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String9 = this.ownershipTypeIOS;
        int hashCode14 = (((((((hashCode13 + (variant_NullType_String9 == null ? 0 : variant_NullType_String9.hashCode())) * 31) + this.platform.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.purchaseState.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String10 = this.purchaseToken;
        int hashCode15 = (((hashCode14 + (variant_NullType_String10 == null ? 0 : variant_NullType_String10.hashCode())) * 31) + Double.hashCode(this.quantity)) * 31;
        Variant_NullType_Double variant_NullType_Double3 = this.quantityIOS;
        int hashCode16 = (hashCode15 + (variant_NullType_Double3 == null ? 0 : variant_NullType_Double3.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String11 = this.reasonIOS;
        int hashCode17 = (hashCode16 + (variant_NullType_String11 == null ? 0 : variant_NullType_String11.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String12 = this.reasonStringRepresentationIOS;
        int hashCode18 = (hashCode17 + (variant_NullType_String12 == null ? 0 : variant_NullType_String12.hashCode())) * 31;
        Variant_NullType_RenewalInfoIOS variant_NullType_RenewalInfoIOS = this.renewalInfoIOS;
        int hashCode19 = (hashCode18 + (variant_NullType_RenewalInfoIOS == null ? 0 : variant_NullType_RenewalInfoIOS.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double4 = this.revocationDateIOS;
        int hashCode20 = (hashCode19 + (variant_NullType_Double4 == null ? 0 : variant_NullType_Double4.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String13 = this.revocationReasonIOS;
        int hashCode21 = (((hashCode20 + (variant_NullType_String13 == null ? 0 : variant_NullType_String13.hashCode())) * 31) + this.store.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String14 = this.storefrontCountryCodeIOS;
        int hashCode22 = (hashCode21 + (variant_NullType_String14 == null ? 0 : variant_NullType_String14.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String15 = this.subscriptionGroupIdIOS;
        int hashCode23 = (((((hashCode22 + (variant_NullType_String15 == null ? 0 : variant_NullType_String15.hashCode())) * 31) + Double.hashCode(this.transactionDate)) * 31) + this.transactionId.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String16 = this.transactionReasonIOS;
        int hashCode24 = (hashCode23 + (variant_NullType_String16 == null ? 0 : variant_NullType_String16.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String17 = this.webOrderLineItemIdIOS;
        return hashCode24 + (variant_NullType_String17 != null ? variant_NullType_String17.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseIOS(appAccountToken=" + this.appAccountToken + ", appBundleIdIOS=" + this.appBundleIdIOS + ", countryCodeIOS=" + this.countryCodeIOS + ", currencyCodeIOS=" + this.currencyCodeIOS + ", currencySymbolIOS=" + this.currencySymbolIOS + ", currentPlanId=" + this.currentPlanId + ", environmentIOS=" + this.environmentIOS + ", expirationDateIOS=" + this.expirationDateIOS + ", id=" + this.id + ", ids=" + this.ids + ", isAutoRenewing=" + this.isAutoRenewing + ", isUpgradedIOS=" + this.isUpgradedIOS + ", offerIOS=" + this.offerIOS + ", originalTransactionDateIOS=" + this.originalTransactionDateIOS + ", originalTransactionIdentifierIOS=" + this.originalTransactionIdentifierIOS + ", ownershipTypeIOS=" + this.ownershipTypeIOS + ", platform=" + this.platform + ", productId=" + this.productId + ", purchaseState=" + this.purchaseState + ", purchaseToken=" + this.purchaseToken + ", quantity=" + this.quantity + ", quantityIOS=" + this.quantityIOS + ", reasonIOS=" + this.reasonIOS + ", reasonStringRepresentationIOS=" + this.reasonStringRepresentationIOS + ", renewalInfoIOS=" + this.renewalInfoIOS + ", revocationDateIOS=" + this.revocationDateIOS + ", revocationReasonIOS=" + this.revocationReasonIOS + ", store=" + this.store + ", storefrontCountryCodeIOS=" + this.storefrontCountryCodeIOS + ", subscriptionGroupIdIOS=" + this.subscriptionGroupIdIOS + ", transactionDate=" + this.transactionDate + ", transactionId=" + this.transactionId + ", transactionReasonIOS=" + this.transactionReasonIOS + ", webOrderLineItemIdIOS=" + this.webOrderLineItemIdIOS + ")";
    }

    public PurchaseIOS(Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7, Variant_NullType_Double variant_NullType_Double, String id, Variant_NullType_Array_String_ variant_NullType_Array_String_, boolean z, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_PurchaseOfferIOS variant_NullType_PurchaseOfferIOS, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String8, Variant_NullType_String variant_NullType_String9, IapPlatform platform, String productId, PurchaseState purchaseState, Variant_NullType_String variant_NullType_String10, double d, Variant_NullType_Double variant_NullType_Double3, Variant_NullType_String variant_NullType_String11, Variant_NullType_String variant_NullType_String12, Variant_NullType_RenewalInfoIOS variant_NullType_RenewalInfoIOS, Variant_NullType_Double variant_NullType_Double4, Variant_NullType_String variant_NullType_String13, IapStore store, Variant_NullType_String variant_NullType_String14, Variant_NullType_String variant_NullType_String15, double d2, String transactionId, Variant_NullType_String variant_NullType_String16, Variant_NullType_String variant_NullType_String17) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.appAccountToken = variant_NullType_String;
        this.appBundleIdIOS = variant_NullType_String2;
        this.countryCodeIOS = variant_NullType_String3;
        this.currencyCodeIOS = variant_NullType_String4;
        this.currencySymbolIOS = variant_NullType_String5;
        this.currentPlanId = variant_NullType_String6;
        this.environmentIOS = variant_NullType_String7;
        this.expirationDateIOS = variant_NullType_Double;
        this.id = id;
        this.ids = variant_NullType_Array_String_;
        this.isAutoRenewing = z;
        this.isUpgradedIOS = variant_NullType_Boolean;
        this.offerIOS = variant_NullType_PurchaseOfferIOS;
        this.originalTransactionDateIOS = variant_NullType_Double2;
        this.originalTransactionIdentifierIOS = variant_NullType_String8;
        this.ownershipTypeIOS = variant_NullType_String9;
        this.platform = platform;
        this.productId = productId;
        this.purchaseState = purchaseState;
        this.purchaseToken = variant_NullType_String10;
        this.quantity = d;
        this.quantityIOS = variant_NullType_Double3;
        this.reasonIOS = variant_NullType_String11;
        this.reasonStringRepresentationIOS = variant_NullType_String12;
        this.renewalInfoIOS = variant_NullType_RenewalInfoIOS;
        this.revocationDateIOS = variant_NullType_Double4;
        this.revocationReasonIOS = variant_NullType_String13;
        this.store = store;
        this.storefrontCountryCodeIOS = variant_NullType_String14;
        this.subscriptionGroupIdIOS = variant_NullType_String15;
        this.transactionDate = d2;
        this.transactionId = transactionId;
        this.transactionReasonIOS = variant_NullType_String16;
        this.webOrderLineItemIdIOS = variant_NullType_String17;
    }

    public final Variant_NullType_String getAppAccountToken() {
        return this.appAccountToken;
    }

    public final Variant_NullType_String getAppBundleIdIOS() {
        return this.appBundleIdIOS;
    }

    public final Variant_NullType_String getCountryCodeIOS() {
        return this.countryCodeIOS;
    }

    public final Variant_NullType_String getCurrencyCodeIOS() {
        return this.currencyCodeIOS;
    }

    public final Variant_NullType_String getCurrencySymbolIOS() {
        return this.currencySymbolIOS;
    }

    public final Variant_NullType_String getCurrentPlanId() {
        return this.currentPlanId;
    }

    public final Variant_NullType_String getEnvironmentIOS() {
        return this.environmentIOS;
    }

    public final Variant_NullType_Double getExpirationDateIOS() {
        return this.expirationDateIOS;
    }

    public final String getId() {
        return this.id;
    }

    public final Variant_NullType_Array_String_ getIds() {
        return this.ids;
    }

    public final boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final Variant_NullType_Boolean isUpgradedIOS() {
        return this.isUpgradedIOS;
    }

    public final Variant_NullType_PurchaseOfferIOS getOfferIOS() {
        return this.offerIOS;
    }

    public final Variant_NullType_Double getOriginalTransactionDateIOS() {
        return this.originalTransactionDateIOS;
    }

    public final Variant_NullType_String getOriginalTransactionIdentifierIOS() {
        return this.originalTransactionIdentifierIOS;
    }

    public final Variant_NullType_String getOwnershipTypeIOS() {
        return this.ownershipTypeIOS;
    }

    public final IapPlatform getPlatform() {
        return this.platform;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final Variant_NullType_String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public final Variant_NullType_Double getQuantityIOS() {
        return this.quantityIOS;
    }

    public final Variant_NullType_String getReasonIOS() {
        return this.reasonIOS;
    }

    public final Variant_NullType_String getReasonStringRepresentationIOS() {
        return this.reasonStringRepresentationIOS;
    }

    public final Variant_NullType_RenewalInfoIOS getRenewalInfoIOS() {
        return this.renewalInfoIOS;
    }

    public final Variant_NullType_Double getRevocationDateIOS() {
        return this.revocationDateIOS;
    }

    public final Variant_NullType_String getRevocationReasonIOS() {
        return this.revocationReasonIOS;
    }

    public final IapStore getStore() {
        return this.store;
    }

    public final Variant_NullType_String getStorefrontCountryCodeIOS() {
        return this.storefrontCountryCodeIOS;
    }

    public final Variant_NullType_String getSubscriptionGroupIdIOS() {
        return this.subscriptionGroupIdIOS;
    }

    public final double getTransactionDate() {
        return this.transactionDate;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final Variant_NullType_String getTransactionReasonIOS() {
        return this.transactionReasonIOS;
    }

    public final Variant_NullType_String getWebOrderLineItemIdIOS() {
        return this.webOrderLineItemIdIOS;
    }

    /* compiled from: PurchaseIOS.kt */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÊ\u0002\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u00072\b\u0010'\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u00072\b\u0010/\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u00010\u00072\b\u00103\u001a\u0004\u0018\u00010\u0007H\u0003¨\u00064"}, d2 = {"Lcom/margelo/nitro/iap/PurchaseIOS$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/PurchaseIOS;", "appAccountToken", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "appBundleIdIOS", "countryCodeIOS", "currencyCodeIOS", "currencySymbolIOS", "currentPlanId", "environmentIOS", "expirationDateIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "id", "", "ids", "Lcom/margelo/nitro/iap/Variant_NullType_Array_String_;", "isAutoRenewing", "", "isUpgradedIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "offerIOS", "Lcom/margelo/nitro/iap/Variant_NullType_PurchaseOfferIOS;", "originalTransactionDateIOS", "originalTransactionIdentifierIOS", "ownershipTypeIOS", "platform", "Lcom/margelo/nitro/iap/IapPlatform;", "productId", "purchaseState", "Lcom/margelo/nitro/iap/PurchaseState;", "purchaseToken", "quantity", "", "quantityIOS", "reasonIOS", "reasonStringRepresentationIOS", "renewalInfoIOS", "Lcom/margelo/nitro/iap/Variant_NullType_RenewalInfoIOS;", "revocationDateIOS", "revocationReasonIOS", "store", "Lcom/margelo/nitro/iap/IapStore;", "storefrontCountryCodeIOS", "subscriptionGroupIdIOS", "transactionDate", "transactionId", "transactionReasonIOS", "webOrderLineItemIdIOS", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final PurchaseIOS fromCpp(Variant_NullType_String appAccountToken, Variant_NullType_String appBundleIdIOS, Variant_NullType_String countryCodeIOS, Variant_NullType_String currencyCodeIOS, Variant_NullType_String currencySymbolIOS, Variant_NullType_String currentPlanId, Variant_NullType_String environmentIOS, Variant_NullType_Double expirationDateIOS, String id, Variant_NullType_Array_String_ ids, boolean isAutoRenewing, Variant_NullType_Boolean isUpgradedIOS, Variant_NullType_PurchaseOfferIOS offerIOS, Variant_NullType_Double originalTransactionDateIOS, Variant_NullType_String originalTransactionIdentifierIOS, Variant_NullType_String ownershipTypeIOS, IapPlatform platform, String productId, PurchaseState purchaseState, Variant_NullType_String purchaseToken, double quantity, Variant_NullType_Double quantityIOS, Variant_NullType_String reasonIOS, Variant_NullType_String reasonStringRepresentationIOS, Variant_NullType_RenewalInfoIOS renewalInfoIOS, Variant_NullType_Double revocationDateIOS, Variant_NullType_String revocationReasonIOS, IapStore store, Variant_NullType_String storefrontCountryCodeIOS, Variant_NullType_String subscriptionGroupIdIOS, double transactionDate, String transactionId, Variant_NullType_String transactionReasonIOS, Variant_NullType_String webOrderLineItemIdIOS) {
            return new PurchaseIOS(appAccountToken, appBundleIdIOS, countryCodeIOS, currencyCodeIOS, currencySymbolIOS, currentPlanId, environmentIOS, expirationDateIOS, id, ids, isAutoRenewing, isUpgradedIOS, offerIOS, originalTransactionDateIOS, originalTransactionIdentifierIOS, ownershipTypeIOS, platform, productId, purchaseState, purchaseToken, quantity, quantityIOS, reasonIOS, reasonStringRepresentationIOS, renewalInfoIOS, revocationDateIOS, revocationReasonIOS, store, storefrontCountryCodeIOS, subscriptionGroupIdIOS, transactionDate, transactionId, transactionReasonIOS, webOrderLineItemIdIOS);
        }
    }
}
