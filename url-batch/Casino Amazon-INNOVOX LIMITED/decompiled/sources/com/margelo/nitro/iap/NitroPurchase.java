package com.margelo.nitro.iap;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.sqlite.driver.bundled.BundledSQLite;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroPurchase.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bk\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0098\u00012\u00020\u0001:\u0002\u0098\u0001B\u009b\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010\b\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010\b\u0012\b\u0010,\u001a\u0004\u0018\u00010\b\u0012\b\u0010-\u001a\u0004\u0018\u00010\b\u0012\b\u0010.\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0013\u0012\b\u00100\u001a\u0004\u0018\u00010\u001e\u0012\b\u00101\u001a\u0004\u0018\u00010\b\u0012\b\u00102\u001a\u0004\u0018\u00010\b\u0012\b\u00103\u001a\u0004\u0018\u00010\b\u0012\b\u00104\u001a\u0004\u0018\u00010\b\u0012\b\u00105\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b6\u00107J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010l\u001a\u00020\nHÆ\u0003J\t\u0010m\u001a\u00020\fHÆ\u0003J\t\u0010n\u001a\u00020\u0006HÆ\u0003J\t\u0010o\u001a\u00020\u000fHÆ\u0003J\t\u0010p\u001a\u00020\u0011HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003Jò\u0003\u0010\u0092\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001eHÆ\u0001J\u0015\u0010\u0093\u0001\u001a\u00020\u00112\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0095\u0001\u001a\u00030\u0096\u0001HÖ\u0001J\n\u0010\u0097\u0001\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010<R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010FR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010>R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010>R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010>R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010>R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010>R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010>R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010>R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010HR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010RR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010>R\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010>R\u0018\u0010!\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010>R\u0018\u0010\"\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010>R\u0018\u0010#\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010HR\u0018\u0010$\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010>R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010>R\u0018\u0010&\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010>R\u0018\u0010'\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010>R\u0018\u0010(\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010>R\u0018\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0018\u0010+\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010>R\u0018\u0010,\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010>R\u0018\u0010-\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010>R\u0018\u0010.\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010RR\u0018\u0010/\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010HR\u0018\u00100\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010RR\u0018\u00101\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010>R\u0018\u00102\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010>R\u0018\u00103\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010>R\u0018\u00104\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010>R\u0018\u00105\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010R¨\u0006\u0099\u0001"}, d2 = {"Lcom/margelo/nitro/iap/NitroPurchase;", "", "id", "", "productId", "transactionDate", "", "purchaseToken", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "platform", "Lcom/margelo/nitro/iap/IapPlatform;", "store", "Lcom/margelo/nitro/iap/IapStore;", "quantity", "purchaseState", "Lcom/margelo/nitro/iap/PurchaseState;", "isAutoRenewing", "", "quantityIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "originalTransactionDateIOS", "originalTransactionIdentifierIOS", "appAccountToken", "appBundleIdIOS", "countryCodeIOS", "currencyCodeIOS", "currencySymbolIOS", "environmentIOS", "expirationDateIOS", "isUpgradedIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "offerIOS", "ownershipTypeIOS", "reasonIOS", "reasonStringRepresentationIOS", "revocationDateIOS", "revocationReasonIOS", "storefrontCountryCodeIOS", "subscriptionGroupIdIOS", "transactionReasonIOS", "webOrderLineItemIdIOS", "renewalInfoIOS", "Lcom/margelo/nitro/iap/Variant_NullType_NitroRenewalInfoIOS;", "purchaseTokenAndroid", "dataAndroid", "signatureAndroid", "autoRenewingAndroid", "purchaseStateAndroid", "isAcknowledgedAndroid", "packageNameAndroid", "obfuscatedAccountIdAndroid", "obfuscatedProfileIdAndroid", "developerPayloadAndroid", "isSuspendedAndroid", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/IapPlatform;Lcom/margelo/nitro/iap/IapStore;DLcom/margelo/nitro/iap/PurchaseState;ZLcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_NitroRenewalInfoIOS;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;)V", "getId", "()Ljava/lang/String;", "getProductId", "getTransactionDate", "()D", "getPurchaseToken", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getPlatform", "()Lcom/margelo/nitro/iap/IapPlatform;", "getStore", "()Lcom/margelo/nitro/iap/IapStore;", "getQuantity", "getPurchaseState", "()Lcom/margelo/nitro/iap/PurchaseState;", "()Z", "getQuantityIOS", "()Lcom/margelo/nitro/iap/Variant_NullType_Double;", "getOriginalTransactionDateIOS", "getOriginalTransactionIdentifierIOS", "getAppAccountToken", "getAppBundleIdIOS", "getCountryCodeIOS", "getCurrencyCodeIOS", "getCurrencySymbolIOS", "getEnvironmentIOS", "getExpirationDateIOS", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getOfferIOS", "getOwnershipTypeIOS", "getReasonIOS", "getReasonStringRepresentationIOS", "getRevocationDateIOS", "getRevocationReasonIOS", "getStorefrontCountryCodeIOS", "getSubscriptionGroupIdIOS", "getTransactionReasonIOS", "getWebOrderLineItemIdIOS", "getRenewalInfoIOS", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroRenewalInfoIOS;", "getPurchaseTokenAndroid", "getDataAndroid", "getSignatureAndroid", "getAutoRenewingAndroid", "getPurchaseStateAndroid", "getPackageNameAndroid", "getObfuscatedAccountIdAndroid", "getObfuscatedProfileIdAndroid", "getDeveloperPayloadAndroid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroPurchase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String appAccountToken;
    private final Variant_NullType_String appBundleIdIOS;
    private final Variant_NullType_Boolean autoRenewingAndroid;
    private final Variant_NullType_String countryCodeIOS;
    private final Variant_NullType_String currencyCodeIOS;
    private final Variant_NullType_String currencySymbolIOS;
    private final Variant_NullType_String dataAndroid;
    private final Variant_NullType_String developerPayloadAndroid;
    private final Variant_NullType_String environmentIOS;
    private final Variant_NullType_Double expirationDateIOS;
    private final String id;
    private final Variant_NullType_Boolean isAcknowledgedAndroid;
    private final boolean isAutoRenewing;
    private final Variant_NullType_Boolean isSuspendedAndroid;
    private final Variant_NullType_Boolean isUpgradedIOS;
    private final Variant_NullType_String obfuscatedAccountIdAndroid;
    private final Variant_NullType_String obfuscatedProfileIdAndroid;
    private final Variant_NullType_String offerIOS;
    private final Variant_NullType_Double originalTransactionDateIOS;
    private final Variant_NullType_String originalTransactionIdentifierIOS;
    private final Variant_NullType_String ownershipTypeIOS;
    private final Variant_NullType_String packageNameAndroid;
    private final IapPlatform platform;
    private final String productId;
    private final PurchaseState purchaseState;
    private final Variant_NullType_Double purchaseStateAndroid;
    private final Variant_NullType_String purchaseToken;
    private final Variant_NullType_String purchaseTokenAndroid;
    private final double quantity;
    private final Variant_NullType_Double quantityIOS;
    private final Variant_NullType_String reasonIOS;
    private final Variant_NullType_String reasonStringRepresentationIOS;
    private final Variant_NullType_NitroRenewalInfoIOS renewalInfoIOS;
    private final Variant_NullType_Double revocationDateIOS;
    private final Variant_NullType_String revocationReasonIOS;
    private final Variant_NullType_String signatureAndroid;
    private final IapStore store;
    private final Variant_NullType_String storefrontCountryCodeIOS;
    private final Variant_NullType_String subscriptionGroupIdIOS;
    private final double transactionDate;
    private final Variant_NullType_String transactionReasonIOS;
    private final Variant_NullType_String webOrderLineItemIdIOS;

    public static /* synthetic */ NitroPurchase copy$default(NitroPurchase nitroPurchase, String str, String str2, double d, Variant_NullType_String variant_NullType_String, IapPlatform iapPlatform, IapStore iapStore, double d2, PurchaseState purchaseState, boolean z, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String2, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7, Variant_NullType_String variant_NullType_String8, Variant_NullType_Double variant_NullType_Double3, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String9, Variant_NullType_String variant_NullType_String10, Variant_NullType_String variant_NullType_String11, Variant_NullType_String variant_NullType_String12, Variant_NullType_Double variant_NullType_Double4, Variant_NullType_String variant_NullType_String13, Variant_NullType_String variant_NullType_String14, Variant_NullType_String variant_NullType_String15, Variant_NullType_String variant_NullType_String16, Variant_NullType_String variant_NullType_String17, Variant_NullType_NitroRenewalInfoIOS variant_NullType_NitroRenewalInfoIOS, Variant_NullType_String variant_NullType_String18, Variant_NullType_String variant_NullType_String19, Variant_NullType_String variant_NullType_String20, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_Double variant_NullType_Double5, Variant_NullType_Boolean variant_NullType_Boolean3, Variant_NullType_String variant_NullType_String21, Variant_NullType_String variant_NullType_String22, Variant_NullType_String variant_NullType_String23, Variant_NullType_String variant_NullType_String24, Variant_NullType_Boolean variant_NullType_Boolean4, int i, int i2, Object obj) {
        String str3 = (i & 1) != 0 ? nitroPurchase.id : str;
        return nitroPurchase.copy(str3, (i & 2) != 0 ? nitroPurchase.productId : str2, (i & 4) != 0 ? nitroPurchase.transactionDate : d, (i & 8) != 0 ? nitroPurchase.purchaseToken : variant_NullType_String, (i & 16) != 0 ? nitroPurchase.platform : iapPlatform, (i & 32) != 0 ? nitroPurchase.store : iapStore, (i & 64) != 0 ? nitroPurchase.quantity : d2, (i & 128) != 0 ? nitroPurchase.purchaseState : purchaseState, (i & 256) != 0 ? nitroPurchase.isAutoRenewing : z, (i & 512) != 0 ? nitroPurchase.quantityIOS : variant_NullType_Double, (i & 1024) != 0 ? nitroPurchase.originalTransactionDateIOS : variant_NullType_Double2, (i & 2048) != 0 ? nitroPurchase.originalTransactionIdentifierIOS : variant_NullType_String2, (i & 4096) != 0 ? nitroPurchase.appAccountToken : variant_NullType_String3, (i & 8192) != 0 ? nitroPurchase.appBundleIdIOS : variant_NullType_String4, (i & 16384) != 0 ? nitroPurchase.countryCodeIOS : variant_NullType_String5, (i & 32768) != 0 ? nitroPurchase.currencyCodeIOS : variant_NullType_String6, (i & 65536) != 0 ? nitroPurchase.currencySymbolIOS : variant_NullType_String7, (i & 131072) != 0 ? nitroPurchase.environmentIOS : variant_NullType_String8, (i & 262144) != 0 ? nitroPurchase.expirationDateIOS : variant_NullType_Double3, (i & 524288) != 0 ? nitroPurchase.isUpgradedIOS : variant_NullType_Boolean, (i & 1048576) != 0 ? nitroPurchase.offerIOS : variant_NullType_String9, (i & 2097152) != 0 ? nitroPurchase.ownershipTypeIOS : variant_NullType_String10, (i & 4194304) != 0 ? nitroPurchase.reasonIOS : variant_NullType_String11, (i & 8388608) != 0 ? nitroPurchase.reasonStringRepresentationIOS : variant_NullType_String12, (i & 16777216) != 0 ? nitroPurchase.revocationDateIOS : variant_NullType_Double4, (i & BundledSQLite.SQLITE_OPEN_EXRESCODE) != 0 ? nitroPurchase.revocationReasonIOS : variant_NullType_String13, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? nitroPurchase.storefrontCountryCodeIOS : variant_NullType_String14, (i & 134217728) != 0 ? nitroPurchase.subscriptionGroupIdIOS : variant_NullType_String15, (i & 268435456) != 0 ? nitroPurchase.transactionReasonIOS : variant_NullType_String16, (i & 536870912) != 0 ? nitroPurchase.webOrderLineItemIdIOS : variant_NullType_String17, (i & 1073741824) != 0 ? nitroPurchase.renewalInfoIOS : variant_NullType_NitroRenewalInfoIOS, (i & Integer.MIN_VALUE) != 0 ? nitroPurchase.purchaseTokenAndroid : variant_NullType_String18, (i2 & 1) != 0 ? nitroPurchase.dataAndroid : variant_NullType_String19, (i2 & 2) != 0 ? nitroPurchase.signatureAndroid : variant_NullType_String20, (i2 & 4) != 0 ? nitroPurchase.autoRenewingAndroid : variant_NullType_Boolean2, (i2 & 8) != 0 ? nitroPurchase.purchaseStateAndroid : variant_NullType_Double5, (i2 & 16) != 0 ? nitroPurchase.isAcknowledgedAndroid : variant_NullType_Boolean3, (i2 & 32) != 0 ? nitroPurchase.packageNameAndroid : variant_NullType_String21, (i2 & 64) != 0 ? nitroPurchase.obfuscatedAccountIdAndroid : variant_NullType_String22, (i2 & 128) != 0 ? nitroPurchase.obfuscatedProfileIdAndroid : variant_NullType_String23, (i2 & 256) != 0 ? nitroPurchase.developerPayloadAndroid : variant_NullType_String24, (i2 & 512) != 0 ? nitroPurchase.isSuspendedAndroid : variant_NullType_Boolean4);
    }

    @JvmStatic
    private static final NitroPurchase fromCpp(String str, String str2, double d, Variant_NullType_String variant_NullType_String, IapPlatform iapPlatform, IapStore iapStore, double d2, PurchaseState purchaseState, boolean z, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String2, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7, Variant_NullType_String variant_NullType_String8, Variant_NullType_Double variant_NullType_Double3, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String9, Variant_NullType_String variant_NullType_String10, Variant_NullType_String variant_NullType_String11, Variant_NullType_String variant_NullType_String12, Variant_NullType_Double variant_NullType_Double4, Variant_NullType_String variant_NullType_String13, Variant_NullType_String variant_NullType_String14, Variant_NullType_String variant_NullType_String15, Variant_NullType_String variant_NullType_String16, Variant_NullType_String variant_NullType_String17, Variant_NullType_NitroRenewalInfoIOS variant_NullType_NitroRenewalInfoIOS, Variant_NullType_String variant_NullType_String18, Variant_NullType_String variant_NullType_String19, Variant_NullType_String variant_NullType_String20, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_Double variant_NullType_Double5, Variant_NullType_Boolean variant_NullType_Boolean3, Variant_NullType_String variant_NullType_String21, Variant_NullType_String variant_NullType_String22, Variant_NullType_String variant_NullType_String23, Variant_NullType_String variant_NullType_String24, Variant_NullType_Boolean variant_NullType_Boolean4) {
        return INSTANCE.fromCpp(str, str2, d, variant_NullType_String, iapPlatform, iapStore, d2, purchaseState, z, variant_NullType_Double, variant_NullType_Double2, variant_NullType_String2, variant_NullType_String3, variant_NullType_String4, variant_NullType_String5, variant_NullType_String6, variant_NullType_String7, variant_NullType_String8, variant_NullType_Double3, variant_NullType_Boolean, variant_NullType_String9, variant_NullType_String10, variant_NullType_String11, variant_NullType_String12, variant_NullType_Double4, variant_NullType_String13, variant_NullType_String14, variant_NullType_String15, variant_NullType_String16, variant_NullType_String17, variant_NullType_NitroRenewalInfoIOS, variant_NullType_String18, variant_NullType_String19, variant_NullType_String20, variant_NullType_Boolean2, variant_NullType_Double5, variant_NullType_Boolean3, variant_NullType_String21, variant_NullType_String22, variant_NullType_String23, variant_NullType_String24, variant_NullType_Boolean4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Variant_NullType_Double getQuantityIOS() {
        return this.quantityIOS;
    }

    /* renamed from: component11, reason: from getter */
    public final Variant_NullType_Double getOriginalTransactionDateIOS() {
        return this.originalTransactionDateIOS;
    }

    /* renamed from: component12, reason: from getter */
    public final Variant_NullType_String getOriginalTransactionIdentifierIOS() {
        return this.originalTransactionIdentifierIOS;
    }

    /* renamed from: component13, reason: from getter */
    public final Variant_NullType_String getAppAccountToken() {
        return this.appAccountToken;
    }

    /* renamed from: component14, reason: from getter */
    public final Variant_NullType_String getAppBundleIdIOS() {
        return this.appBundleIdIOS;
    }

    /* renamed from: component15, reason: from getter */
    public final Variant_NullType_String getCountryCodeIOS() {
        return this.countryCodeIOS;
    }

    /* renamed from: component16, reason: from getter */
    public final Variant_NullType_String getCurrencyCodeIOS() {
        return this.currencyCodeIOS;
    }

    /* renamed from: component17, reason: from getter */
    public final Variant_NullType_String getCurrencySymbolIOS() {
        return this.currencySymbolIOS;
    }

    /* renamed from: component18, reason: from getter */
    public final Variant_NullType_String getEnvironmentIOS() {
        return this.environmentIOS;
    }

    /* renamed from: component19, reason: from getter */
    public final Variant_NullType_Double getExpirationDateIOS() {
        return this.expirationDateIOS;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component20, reason: from getter */
    public final Variant_NullType_Boolean getIsUpgradedIOS() {
        return this.isUpgradedIOS;
    }

    /* renamed from: component21, reason: from getter */
    public final Variant_NullType_String getOfferIOS() {
        return this.offerIOS;
    }

    /* renamed from: component22, reason: from getter */
    public final Variant_NullType_String getOwnershipTypeIOS() {
        return this.ownershipTypeIOS;
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
    public final Variant_NullType_Double getRevocationDateIOS() {
        return this.revocationDateIOS;
    }

    /* renamed from: component26, reason: from getter */
    public final Variant_NullType_String getRevocationReasonIOS() {
        return this.revocationReasonIOS;
    }

    /* renamed from: component27, reason: from getter */
    public final Variant_NullType_String getStorefrontCountryCodeIOS() {
        return this.storefrontCountryCodeIOS;
    }

    /* renamed from: component28, reason: from getter */
    public final Variant_NullType_String getSubscriptionGroupIdIOS() {
        return this.subscriptionGroupIdIOS;
    }

    /* renamed from: component29, reason: from getter */
    public final Variant_NullType_String getTransactionReasonIOS() {
        return this.transactionReasonIOS;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: component30, reason: from getter */
    public final Variant_NullType_String getWebOrderLineItemIdIOS() {
        return this.webOrderLineItemIdIOS;
    }

    /* renamed from: component31, reason: from getter */
    public final Variant_NullType_NitroRenewalInfoIOS getRenewalInfoIOS() {
        return this.renewalInfoIOS;
    }

    /* renamed from: component32, reason: from getter */
    public final Variant_NullType_String getPurchaseTokenAndroid() {
        return this.purchaseTokenAndroid;
    }

    /* renamed from: component33, reason: from getter */
    public final Variant_NullType_String getDataAndroid() {
        return this.dataAndroid;
    }

    /* renamed from: component34, reason: from getter */
    public final Variant_NullType_String getSignatureAndroid() {
        return this.signatureAndroid;
    }

    /* renamed from: component35, reason: from getter */
    public final Variant_NullType_Boolean getAutoRenewingAndroid() {
        return this.autoRenewingAndroid;
    }

    /* renamed from: component36, reason: from getter */
    public final Variant_NullType_Double getPurchaseStateAndroid() {
        return this.purchaseStateAndroid;
    }

    /* renamed from: component37, reason: from getter */
    public final Variant_NullType_Boolean getIsAcknowledgedAndroid() {
        return this.isAcknowledgedAndroid;
    }

    /* renamed from: component38, reason: from getter */
    public final Variant_NullType_String getPackageNameAndroid() {
        return this.packageNameAndroid;
    }

    /* renamed from: component39, reason: from getter */
    public final Variant_NullType_String getObfuscatedAccountIdAndroid() {
        return this.obfuscatedAccountIdAndroid;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component40, reason: from getter */
    public final Variant_NullType_String getObfuscatedProfileIdAndroid() {
        return this.obfuscatedProfileIdAndroid;
    }

    /* renamed from: component41, reason: from getter */
    public final Variant_NullType_String getDeveloperPayloadAndroid() {
        return this.developerPayloadAndroid;
    }

    /* renamed from: component42, reason: from getter */
    public final Variant_NullType_Boolean getIsSuspendedAndroid() {
        return this.isSuspendedAndroid;
    }

    /* renamed from: component5, reason: from getter */
    public final IapPlatform getPlatform() {
        return this.platform;
    }

    /* renamed from: component6, reason: from getter */
    public final IapStore getStore() {
        return this.store;
    }

    /* renamed from: component7, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* renamed from: component8, reason: from getter */
    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final NitroPurchase copy(String id, String productId, double transactionDate, Variant_NullType_String purchaseToken, IapPlatform platform, IapStore store, double quantity, PurchaseState purchaseState, boolean isAutoRenewing, Variant_NullType_Double quantityIOS, Variant_NullType_Double originalTransactionDateIOS, Variant_NullType_String originalTransactionIdentifierIOS, Variant_NullType_String appAccountToken, Variant_NullType_String appBundleIdIOS, Variant_NullType_String countryCodeIOS, Variant_NullType_String currencyCodeIOS, Variant_NullType_String currencySymbolIOS, Variant_NullType_String environmentIOS, Variant_NullType_Double expirationDateIOS, Variant_NullType_Boolean isUpgradedIOS, Variant_NullType_String offerIOS, Variant_NullType_String ownershipTypeIOS, Variant_NullType_String reasonIOS, Variant_NullType_String reasonStringRepresentationIOS, Variant_NullType_Double revocationDateIOS, Variant_NullType_String revocationReasonIOS, Variant_NullType_String storefrontCountryCodeIOS, Variant_NullType_String subscriptionGroupIdIOS, Variant_NullType_String transactionReasonIOS, Variant_NullType_String webOrderLineItemIdIOS, Variant_NullType_NitroRenewalInfoIOS renewalInfoIOS, Variant_NullType_String purchaseTokenAndroid, Variant_NullType_String dataAndroid, Variant_NullType_String signatureAndroid, Variant_NullType_Boolean autoRenewingAndroid, Variant_NullType_Double purchaseStateAndroid, Variant_NullType_Boolean isAcknowledgedAndroid, Variant_NullType_String packageNameAndroid, Variant_NullType_String obfuscatedAccountIdAndroid, Variant_NullType_String obfuscatedProfileIdAndroid, Variant_NullType_String developerPayloadAndroid, Variant_NullType_Boolean isSuspendedAndroid) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        return new NitroPurchase(id, productId, transactionDate, purchaseToken, platform, store, quantity, purchaseState, isAutoRenewing, quantityIOS, originalTransactionDateIOS, originalTransactionIdentifierIOS, appAccountToken, appBundleIdIOS, countryCodeIOS, currencyCodeIOS, currencySymbolIOS, environmentIOS, expirationDateIOS, isUpgradedIOS, offerIOS, ownershipTypeIOS, reasonIOS, reasonStringRepresentationIOS, revocationDateIOS, revocationReasonIOS, storefrontCountryCodeIOS, subscriptionGroupIdIOS, transactionReasonIOS, webOrderLineItemIdIOS, renewalInfoIOS, purchaseTokenAndroid, dataAndroid, signatureAndroid, autoRenewingAndroid, purchaseStateAndroid, isAcknowledgedAndroid, packageNameAndroid, obfuscatedAccountIdAndroid, obfuscatedProfileIdAndroid, developerPayloadAndroid, isSuspendedAndroid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroPurchase)) {
            return false;
        }
        NitroPurchase nitroPurchase = (NitroPurchase) other;
        return Intrinsics.areEqual(this.id, nitroPurchase.id) && Intrinsics.areEqual(this.productId, nitroPurchase.productId) && Double.compare(this.transactionDate, nitroPurchase.transactionDate) == 0 && Intrinsics.areEqual(this.purchaseToken, nitroPurchase.purchaseToken) && this.platform == nitroPurchase.platform && this.store == nitroPurchase.store && Double.compare(this.quantity, nitroPurchase.quantity) == 0 && this.purchaseState == nitroPurchase.purchaseState && this.isAutoRenewing == nitroPurchase.isAutoRenewing && Intrinsics.areEqual(this.quantityIOS, nitroPurchase.quantityIOS) && Intrinsics.areEqual(this.originalTransactionDateIOS, nitroPurchase.originalTransactionDateIOS) && Intrinsics.areEqual(this.originalTransactionIdentifierIOS, nitroPurchase.originalTransactionIdentifierIOS) && Intrinsics.areEqual(this.appAccountToken, nitroPurchase.appAccountToken) && Intrinsics.areEqual(this.appBundleIdIOS, nitroPurchase.appBundleIdIOS) && Intrinsics.areEqual(this.countryCodeIOS, nitroPurchase.countryCodeIOS) && Intrinsics.areEqual(this.currencyCodeIOS, nitroPurchase.currencyCodeIOS) && Intrinsics.areEqual(this.currencySymbolIOS, nitroPurchase.currencySymbolIOS) && Intrinsics.areEqual(this.environmentIOS, nitroPurchase.environmentIOS) && Intrinsics.areEqual(this.expirationDateIOS, nitroPurchase.expirationDateIOS) && Intrinsics.areEqual(this.isUpgradedIOS, nitroPurchase.isUpgradedIOS) && Intrinsics.areEqual(this.offerIOS, nitroPurchase.offerIOS) && Intrinsics.areEqual(this.ownershipTypeIOS, nitroPurchase.ownershipTypeIOS) && Intrinsics.areEqual(this.reasonIOS, nitroPurchase.reasonIOS) && Intrinsics.areEqual(this.reasonStringRepresentationIOS, nitroPurchase.reasonStringRepresentationIOS) && Intrinsics.areEqual(this.revocationDateIOS, nitroPurchase.revocationDateIOS) && Intrinsics.areEqual(this.revocationReasonIOS, nitroPurchase.revocationReasonIOS) && Intrinsics.areEqual(this.storefrontCountryCodeIOS, nitroPurchase.storefrontCountryCodeIOS) && Intrinsics.areEqual(this.subscriptionGroupIdIOS, nitroPurchase.subscriptionGroupIdIOS) && Intrinsics.areEqual(this.transactionReasonIOS, nitroPurchase.transactionReasonIOS) && Intrinsics.areEqual(this.webOrderLineItemIdIOS, nitroPurchase.webOrderLineItemIdIOS) && Intrinsics.areEqual(this.renewalInfoIOS, nitroPurchase.renewalInfoIOS) && Intrinsics.areEqual(this.purchaseTokenAndroid, nitroPurchase.purchaseTokenAndroid) && Intrinsics.areEqual(this.dataAndroid, nitroPurchase.dataAndroid) && Intrinsics.areEqual(this.signatureAndroid, nitroPurchase.signatureAndroid) && Intrinsics.areEqual(this.autoRenewingAndroid, nitroPurchase.autoRenewingAndroid) && Intrinsics.areEqual(this.purchaseStateAndroid, nitroPurchase.purchaseStateAndroid) && Intrinsics.areEqual(this.isAcknowledgedAndroid, nitroPurchase.isAcknowledgedAndroid) && Intrinsics.areEqual(this.packageNameAndroid, nitroPurchase.packageNameAndroid) && Intrinsics.areEqual(this.obfuscatedAccountIdAndroid, nitroPurchase.obfuscatedAccountIdAndroid) && Intrinsics.areEqual(this.obfuscatedProfileIdAndroid, nitroPurchase.obfuscatedProfileIdAndroid) && Intrinsics.areEqual(this.developerPayloadAndroid, nitroPurchase.developerPayloadAndroid) && Intrinsics.areEqual(this.isSuspendedAndroid, nitroPurchase.isSuspendedAndroid);
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.productId.hashCode()) * 31) + Double.hashCode(this.transactionDate)) * 31;
        Variant_NullType_String variant_NullType_String = this.purchaseToken;
        int hashCode2 = (((((((((((hashCode + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode())) * 31) + this.platform.hashCode()) * 31) + this.store.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + this.purchaseState.hashCode()) * 31) + Boolean.hashCode(this.isAutoRenewing)) * 31;
        Variant_NullType_Double variant_NullType_Double = this.quantityIOS;
        int hashCode3 = (hashCode2 + (variant_NullType_Double == null ? 0 : variant_NullType_Double.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double2 = this.originalTransactionDateIOS;
        int hashCode4 = (hashCode3 + (variant_NullType_Double2 == null ? 0 : variant_NullType_Double2.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String2 = this.originalTransactionIdentifierIOS;
        int hashCode5 = (hashCode4 + (variant_NullType_String2 == null ? 0 : variant_NullType_String2.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String3 = this.appAccountToken;
        int hashCode6 = (hashCode5 + (variant_NullType_String3 == null ? 0 : variant_NullType_String3.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String4 = this.appBundleIdIOS;
        int hashCode7 = (hashCode6 + (variant_NullType_String4 == null ? 0 : variant_NullType_String4.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String5 = this.countryCodeIOS;
        int hashCode8 = (hashCode7 + (variant_NullType_String5 == null ? 0 : variant_NullType_String5.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String6 = this.currencyCodeIOS;
        int hashCode9 = (hashCode8 + (variant_NullType_String6 == null ? 0 : variant_NullType_String6.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String7 = this.currencySymbolIOS;
        int hashCode10 = (hashCode9 + (variant_NullType_String7 == null ? 0 : variant_NullType_String7.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String8 = this.environmentIOS;
        int hashCode11 = (hashCode10 + (variant_NullType_String8 == null ? 0 : variant_NullType_String8.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double3 = this.expirationDateIOS;
        int hashCode12 = (hashCode11 + (variant_NullType_Double3 == null ? 0 : variant_NullType_Double3.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.isUpgradedIOS;
        int hashCode13 = (hashCode12 + (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String9 = this.offerIOS;
        int hashCode14 = (hashCode13 + (variant_NullType_String9 == null ? 0 : variant_NullType_String9.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String10 = this.ownershipTypeIOS;
        int hashCode15 = (hashCode14 + (variant_NullType_String10 == null ? 0 : variant_NullType_String10.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String11 = this.reasonIOS;
        int hashCode16 = (hashCode15 + (variant_NullType_String11 == null ? 0 : variant_NullType_String11.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String12 = this.reasonStringRepresentationIOS;
        int hashCode17 = (hashCode16 + (variant_NullType_String12 == null ? 0 : variant_NullType_String12.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double4 = this.revocationDateIOS;
        int hashCode18 = (hashCode17 + (variant_NullType_Double4 == null ? 0 : variant_NullType_Double4.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String13 = this.revocationReasonIOS;
        int hashCode19 = (hashCode18 + (variant_NullType_String13 == null ? 0 : variant_NullType_String13.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String14 = this.storefrontCountryCodeIOS;
        int hashCode20 = (hashCode19 + (variant_NullType_String14 == null ? 0 : variant_NullType_String14.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String15 = this.subscriptionGroupIdIOS;
        int hashCode21 = (hashCode20 + (variant_NullType_String15 == null ? 0 : variant_NullType_String15.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String16 = this.transactionReasonIOS;
        int hashCode22 = (hashCode21 + (variant_NullType_String16 == null ? 0 : variant_NullType_String16.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String17 = this.webOrderLineItemIdIOS;
        int hashCode23 = (hashCode22 + (variant_NullType_String17 == null ? 0 : variant_NullType_String17.hashCode())) * 31;
        Variant_NullType_NitroRenewalInfoIOS variant_NullType_NitroRenewalInfoIOS = this.renewalInfoIOS;
        int hashCode24 = (hashCode23 + (variant_NullType_NitroRenewalInfoIOS == null ? 0 : variant_NullType_NitroRenewalInfoIOS.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String18 = this.purchaseTokenAndroid;
        int hashCode25 = (hashCode24 + (variant_NullType_String18 == null ? 0 : variant_NullType_String18.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String19 = this.dataAndroid;
        int hashCode26 = (hashCode25 + (variant_NullType_String19 == null ? 0 : variant_NullType_String19.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String20 = this.signatureAndroid;
        int hashCode27 = (hashCode26 + (variant_NullType_String20 == null ? 0 : variant_NullType_String20.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean2 = this.autoRenewingAndroid;
        int hashCode28 = (hashCode27 + (variant_NullType_Boolean2 == null ? 0 : variant_NullType_Boolean2.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double5 = this.purchaseStateAndroid;
        int hashCode29 = (hashCode28 + (variant_NullType_Double5 == null ? 0 : variant_NullType_Double5.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean3 = this.isAcknowledgedAndroid;
        int hashCode30 = (hashCode29 + (variant_NullType_Boolean3 == null ? 0 : variant_NullType_Boolean3.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String21 = this.packageNameAndroid;
        int hashCode31 = (hashCode30 + (variant_NullType_String21 == null ? 0 : variant_NullType_String21.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String22 = this.obfuscatedAccountIdAndroid;
        int hashCode32 = (hashCode31 + (variant_NullType_String22 == null ? 0 : variant_NullType_String22.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String23 = this.obfuscatedProfileIdAndroid;
        int hashCode33 = (hashCode32 + (variant_NullType_String23 == null ? 0 : variant_NullType_String23.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String24 = this.developerPayloadAndroid;
        int hashCode34 = (hashCode33 + (variant_NullType_String24 == null ? 0 : variant_NullType_String24.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean4 = this.isSuspendedAndroid;
        return hashCode34 + (variant_NullType_Boolean4 != null ? variant_NullType_Boolean4.hashCode() : 0);
    }

    public String toString() {
        return "NitroPurchase(id=" + this.id + ", productId=" + this.productId + ", transactionDate=" + this.transactionDate + ", purchaseToken=" + this.purchaseToken + ", platform=" + this.platform + ", store=" + this.store + ", quantity=" + this.quantity + ", purchaseState=" + this.purchaseState + ", isAutoRenewing=" + this.isAutoRenewing + ", quantityIOS=" + this.quantityIOS + ", originalTransactionDateIOS=" + this.originalTransactionDateIOS + ", originalTransactionIdentifierIOS=" + this.originalTransactionIdentifierIOS + ", appAccountToken=" + this.appAccountToken + ", appBundleIdIOS=" + this.appBundleIdIOS + ", countryCodeIOS=" + this.countryCodeIOS + ", currencyCodeIOS=" + this.currencyCodeIOS + ", currencySymbolIOS=" + this.currencySymbolIOS + ", environmentIOS=" + this.environmentIOS + ", expirationDateIOS=" + this.expirationDateIOS + ", isUpgradedIOS=" + this.isUpgradedIOS + ", offerIOS=" + this.offerIOS + ", ownershipTypeIOS=" + this.ownershipTypeIOS + ", reasonIOS=" + this.reasonIOS + ", reasonStringRepresentationIOS=" + this.reasonStringRepresentationIOS + ", revocationDateIOS=" + this.revocationDateIOS + ", revocationReasonIOS=" + this.revocationReasonIOS + ", storefrontCountryCodeIOS=" + this.storefrontCountryCodeIOS + ", subscriptionGroupIdIOS=" + this.subscriptionGroupIdIOS + ", transactionReasonIOS=" + this.transactionReasonIOS + ", webOrderLineItemIdIOS=" + this.webOrderLineItemIdIOS + ", renewalInfoIOS=" + this.renewalInfoIOS + ", purchaseTokenAndroid=" + this.purchaseTokenAndroid + ", dataAndroid=" + this.dataAndroid + ", signatureAndroid=" + this.signatureAndroid + ", autoRenewingAndroid=" + this.autoRenewingAndroid + ", purchaseStateAndroid=" + this.purchaseStateAndroid + ", isAcknowledgedAndroid=" + this.isAcknowledgedAndroid + ", packageNameAndroid=" + this.packageNameAndroid + ", obfuscatedAccountIdAndroid=" + this.obfuscatedAccountIdAndroid + ", obfuscatedProfileIdAndroid=" + this.obfuscatedProfileIdAndroid + ", developerPayloadAndroid=" + this.developerPayloadAndroid + ", isSuspendedAndroid=" + this.isSuspendedAndroid + ")";
    }

    public NitroPurchase(String id, String productId, double d, Variant_NullType_String variant_NullType_String, IapPlatform platform, IapStore store, double d2, PurchaseState purchaseState, boolean z, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String2, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7, Variant_NullType_String variant_NullType_String8, Variant_NullType_Double variant_NullType_Double3, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String9, Variant_NullType_String variant_NullType_String10, Variant_NullType_String variant_NullType_String11, Variant_NullType_String variant_NullType_String12, Variant_NullType_Double variant_NullType_Double4, Variant_NullType_String variant_NullType_String13, Variant_NullType_String variant_NullType_String14, Variant_NullType_String variant_NullType_String15, Variant_NullType_String variant_NullType_String16, Variant_NullType_String variant_NullType_String17, Variant_NullType_NitroRenewalInfoIOS variant_NullType_NitroRenewalInfoIOS, Variant_NullType_String variant_NullType_String18, Variant_NullType_String variant_NullType_String19, Variant_NullType_String variant_NullType_String20, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_Double variant_NullType_Double5, Variant_NullType_Boolean variant_NullType_Boolean3, Variant_NullType_String variant_NullType_String21, Variant_NullType_String variant_NullType_String22, Variant_NullType_String variant_NullType_String23, Variant_NullType_String variant_NullType_String24, Variant_NullType_Boolean variant_NullType_Boolean4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        this.id = id;
        this.productId = productId;
        this.transactionDate = d;
        this.purchaseToken = variant_NullType_String;
        this.platform = platform;
        this.store = store;
        this.quantity = d2;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = z;
        this.quantityIOS = variant_NullType_Double;
        this.originalTransactionDateIOS = variant_NullType_Double2;
        this.originalTransactionIdentifierIOS = variant_NullType_String2;
        this.appAccountToken = variant_NullType_String3;
        this.appBundleIdIOS = variant_NullType_String4;
        this.countryCodeIOS = variant_NullType_String5;
        this.currencyCodeIOS = variant_NullType_String6;
        this.currencySymbolIOS = variant_NullType_String7;
        this.environmentIOS = variant_NullType_String8;
        this.expirationDateIOS = variant_NullType_Double3;
        this.isUpgradedIOS = variant_NullType_Boolean;
        this.offerIOS = variant_NullType_String9;
        this.ownershipTypeIOS = variant_NullType_String10;
        this.reasonIOS = variant_NullType_String11;
        this.reasonStringRepresentationIOS = variant_NullType_String12;
        this.revocationDateIOS = variant_NullType_Double4;
        this.revocationReasonIOS = variant_NullType_String13;
        this.storefrontCountryCodeIOS = variant_NullType_String14;
        this.subscriptionGroupIdIOS = variant_NullType_String15;
        this.transactionReasonIOS = variant_NullType_String16;
        this.webOrderLineItemIdIOS = variant_NullType_String17;
        this.renewalInfoIOS = variant_NullType_NitroRenewalInfoIOS;
        this.purchaseTokenAndroid = variant_NullType_String18;
        this.dataAndroid = variant_NullType_String19;
        this.signatureAndroid = variant_NullType_String20;
        this.autoRenewingAndroid = variant_NullType_Boolean2;
        this.purchaseStateAndroid = variant_NullType_Double5;
        this.isAcknowledgedAndroid = variant_NullType_Boolean3;
        this.packageNameAndroid = variant_NullType_String21;
        this.obfuscatedAccountIdAndroid = variant_NullType_String22;
        this.obfuscatedProfileIdAndroid = variant_NullType_String23;
        this.developerPayloadAndroid = variant_NullType_String24;
        this.isSuspendedAndroid = variant_NullType_Boolean4;
    }

    public final String getId() {
        return this.id;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final double getTransactionDate() {
        return this.transactionDate;
    }

    public final Variant_NullType_String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final IapPlatform getPlatform() {
        return this.platform;
    }

    public final IapStore getStore() {
        return this.store;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final Variant_NullType_Double getQuantityIOS() {
        return this.quantityIOS;
    }

    public final Variant_NullType_Double getOriginalTransactionDateIOS() {
        return this.originalTransactionDateIOS;
    }

    public final Variant_NullType_String getOriginalTransactionIdentifierIOS() {
        return this.originalTransactionIdentifierIOS;
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

    public final Variant_NullType_String getEnvironmentIOS() {
        return this.environmentIOS;
    }

    public final Variant_NullType_Double getExpirationDateIOS() {
        return this.expirationDateIOS;
    }

    public final Variant_NullType_Boolean isUpgradedIOS() {
        return this.isUpgradedIOS;
    }

    public final Variant_NullType_String getOfferIOS() {
        return this.offerIOS;
    }

    public final Variant_NullType_String getOwnershipTypeIOS() {
        return this.ownershipTypeIOS;
    }

    public final Variant_NullType_String getReasonIOS() {
        return this.reasonIOS;
    }

    public final Variant_NullType_String getReasonStringRepresentationIOS() {
        return this.reasonStringRepresentationIOS;
    }

    public final Variant_NullType_Double getRevocationDateIOS() {
        return this.revocationDateIOS;
    }

    public final Variant_NullType_String getRevocationReasonIOS() {
        return this.revocationReasonIOS;
    }

    public final Variant_NullType_String getStorefrontCountryCodeIOS() {
        return this.storefrontCountryCodeIOS;
    }

    public final Variant_NullType_String getSubscriptionGroupIdIOS() {
        return this.subscriptionGroupIdIOS;
    }

    public final Variant_NullType_String getTransactionReasonIOS() {
        return this.transactionReasonIOS;
    }

    public final Variant_NullType_String getWebOrderLineItemIdIOS() {
        return this.webOrderLineItemIdIOS;
    }

    public final Variant_NullType_NitroRenewalInfoIOS getRenewalInfoIOS() {
        return this.renewalInfoIOS;
    }

    public final Variant_NullType_String getPurchaseTokenAndroid() {
        return this.purchaseTokenAndroid;
    }

    public final Variant_NullType_String getDataAndroid() {
        return this.dataAndroid;
    }

    public final Variant_NullType_String getSignatureAndroid() {
        return this.signatureAndroid;
    }

    public final Variant_NullType_Boolean getAutoRenewingAndroid() {
        return this.autoRenewingAndroid;
    }

    public final Variant_NullType_Double getPurchaseStateAndroid() {
        return this.purchaseStateAndroid;
    }

    public final Variant_NullType_Boolean isAcknowledgedAndroid() {
        return this.isAcknowledgedAndroid;
    }

    public final Variant_NullType_String getPackageNameAndroid() {
        return this.packageNameAndroid;
    }

    public final Variant_NullType_String getObfuscatedAccountIdAndroid() {
        return this.obfuscatedAccountIdAndroid;
    }

    public final Variant_NullType_String getObfuscatedProfileIdAndroid() {
        return this.obfuscatedProfileIdAndroid;
    }

    public final Variant_NullType_String getDeveloperPayloadAndroid() {
        return this.developerPayloadAndroid;
    }

    public final Variant_NullType_Boolean isSuspendedAndroid() {
        return this.isSuspendedAndroid;
    }

    /* compiled from: NitroPurchase.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009c\u0003\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f2\b\u0010%\u001a\u0004\u0018\u00010\f2\b\u0010&\u001a\u0004\u0018\u00010\f2\b\u0010'\u001a\u0004\u0018\u00010\u00172\b\u0010(\u001a\u0004\u0018\u00010\f2\b\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010*\u001a\u0004\u0018\u00010\f2\b\u0010+\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\f2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010\f2\b\u00100\u001a\u0004\u0018\u00010\f2\b\u00101\u001a\u0004\u0018\u00010\f2\b\u00102\u001a\u0004\u0018\u00010\"2\b\u00103\u001a\u0004\u0018\u00010\u00172\b\u00104\u001a\u0004\u0018\u00010\"2\b\u00105\u001a\u0004\u0018\u00010\f2\b\u00106\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f2\b\u00108\u001a\u0004\u0018\u00010\f2\b\u00109\u001a\u0004\u0018\u00010\"H\u0003¨\u0006:"}, d2 = {"Lcom/margelo/nitro/iap/NitroPurchase$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroPurchase;", "id", "", "productId", "transactionDate", "", "purchaseToken", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "platform", "Lcom/margelo/nitro/iap/IapPlatform;", "store", "Lcom/margelo/nitro/iap/IapStore;", "quantity", "purchaseState", "Lcom/margelo/nitro/iap/PurchaseState;", "isAutoRenewing", "", "quantityIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "originalTransactionDateIOS", "originalTransactionIdentifierIOS", "appAccountToken", "appBundleIdIOS", "countryCodeIOS", "currencyCodeIOS", "currencySymbolIOS", "environmentIOS", "expirationDateIOS", "isUpgradedIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "offerIOS", "ownershipTypeIOS", "reasonIOS", "reasonStringRepresentationIOS", "revocationDateIOS", "revocationReasonIOS", "storefrontCountryCodeIOS", "subscriptionGroupIdIOS", "transactionReasonIOS", "webOrderLineItemIdIOS", "renewalInfoIOS", "Lcom/margelo/nitro/iap/Variant_NullType_NitroRenewalInfoIOS;", "purchaseTokenAndroid", "dataAndroid", "signatureAndroid", "autoRenewingAndroid", "purchaseStateAndroid", "isAcknowledgedAndroid", "packageNameAndroid", "obfuscatedAccountIdAndroid", "obfuscatedProfileIdAndroid", "developerPayloadAndroid", "isSuspendedAndroid", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroPurchase fromCpp(String id, String productId, double transactionDate, Variant_NullType_String purchaseToken, IapPlatform platform, IapStore store, double quantity, PurchaseState purchaseState, boolean isAutoRenewing, Variant_NullType_Double quantityIOS, Variant_NullType_Double originalTransactionDateIOS, Variant_NullType_String originalTransactionIdentifierIOS, Variant_NullType_String appAccountToken, Variant_NullType_String appBundleIdIOS, Variant_NullType_String countryCodeIOS, Variant_NullType_String currencyCodeIOS, Variant_NullType_String currencySymbolIOS, Variant_NullType_String environmentIOS, Variant_NullType_Double expirationDateIOS, Variant_NullType_Boolean isUpgradedIOS, Variant_NullType_String offerIOS, Variant_NullType_String ownershipTypeIOS, Variant_NullType_String reasonIOS, Variant_NullType_String reasonStringRepresentationIOS, Variant_NullType_Double revocationDateIOS, Variant_NullType_String revocationReasonIOS, Variant_NullType_String storefrontCountryCodeIOS, Variant_NullType_String subscriptionGroupIdIOS, Variant_NullType_String transactionReasonIOS, Variant_NullType_String webOrderLineItemIdIOS, Variant_NullType_NitroRenewalInfoIOS renewalInfoIOS, Variant_NullType_String purchaseTokenAndroid, Variant_NullType_String dataAndroid, Variant_NullType_String signatureAndroid, Variant_NullType_Boolean autoRenewingAndroid, Variant_NullType_Double purchaseStateAndroid, Variant_NullType_Boolean isAcknowledgedAndroid, Variant_NullType_String packageNameAndroid, Variant_NullType_String obfuscatedAccountIdAndroid, Variant_NullType_String obfuscatedProfileIdAndroid, Variant_NullType_String developerPayloadAndroid, Variant_NullType_Boolean isSuspendedAndroid) {
            return new NitroPurchase(id, productId, transactionDate, purchaseToken, platform, store, quantity, purchaseState, isAutoRenewing, quantityIOS, originalTransactionDateIOS, originalTransactionIdentifierIOS, appAccountToken, appBundleIdIOS, countryCodeIOS, currencyCodeIOS, currencySymbolIOS, environmentIOS, expirationDateIOS, isUpgradedIOS, offerIOS, ownershipTypeIOS, reasonIOS, reasonStringRepresentationIOS, revocationDateIOS, revocationReasonIOS, storefrontCountryCodeIOS, subscriptionGroupIdIOS, transactionReasonIOS, webOrderLineItemIdIOS, renewalInfoIOS, purchaseTokenAndroid, dataAndroid, signatureAndroid, autoRenewingAndroid, purchaseStateAndroid, isAcknowledgedAndroid, packageNameAndroid, obfuscatedAccountIdAndroid, obfuscatedProfileIdAndroid, developerPayloadAndroid, isSuspendedAndroid);
        }
    }
}
