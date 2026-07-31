package com.margelo.nitro.iap;

import com.facebook.jni.HybridData;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.core.Promise;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridRnIapSpec.kt */
@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\u0089\u0001\u008a\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J/\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0006\u0010\u0013\u001a\u00020\u0014H'J\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H'J)\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\u00052\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bH'¢\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bH'¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\u0006\u0010 \u001a\u00020!H'J+\u0010\"\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020#0%H&J\u0010\u0010)\u001a\u00020#2\u0006\u0010$\u001a\u00020*H\u0003J+\u0010+\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020#0%H&J\u0010\u0010.\u001a\u00020#2\u0006\u0010$\u001a\u00020/H\u0003J+\u00100\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020#0%H&J\u0010\u00101\u001a\u00020#2\u0006\u0010$\u001a\u00020*H\u0003J+\u00102\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020#0%H&J\u0010\u00103\u001a\u00020#2\u0006\u0010$\u001a\u00020/H\u0003J+\u00104\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020#0%H&J\u0010\u00106\u001a\u00020#2\u0006\u0010$\u001a\u000207H\u0003J+\u00108\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020#0%H&J\u0010\u00109\u001a\u00020#2\u0006\u0010$\u001a\u000207H\u0003J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H'J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0005H'J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0005H'J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0005H'J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020#0\u0005H'J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020#0\u0005H'J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020<0\u00052\u0006\u0010D\u001a\u00020\u000eH'J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00052\u0006\u0010D\u001a\u00020\u000eH'J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00052\u0006\u0010D\u001a\u00020\u000eH'J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00052\u0006\u0010D\u001a\u00020\u000eH'J\u0014\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u0005H'J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0014\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u0005H'J\u000e\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010O\u001a\u00020\u000eH'J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H'J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H'J\u000e\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H'J\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010D\u001a\u00020\u000eH'J\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020<0\u00052\u0006\u0010D\u001a\u00020\u000eH'J\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\u00052\u0006\u0010 \u001a\u00020WH'J\u0016\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u00052\u0006\u0010 \u001a\u00020ZH'J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H'J\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020#0\u00052\u0006\u0010\u0017\u001a\u00020]H'J\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u000e\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0018\u0010`\u001a\b\u0012\u0004\u0012\u00020<0\u00052\b\u0010D\u001a\u0004\u0018\u00010<H'J+\u0010a\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(c\u0012\u0004\u0012\u00020#0%H&J\u0010\u0010d\u001a\u00020#2\u0006\u0010$\u001a\u00020eH\u0003J+\u0010f\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(c\u0012\u0004\u0012\u00020#0%H&J\u0010\u0010g\u001a\u00020#2\u0006\u0010$\u001a\u00020eH\u0003J+\u0010h\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110i¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(c\u0012\u0004\u0012\u00020#0%H&J\u0010\u0010j\u001a\u00020#2\u0006\u0010$\u001a\u00020kH\u0003J+\u0010l\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110i¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(c\u0012\u0004\u0012\u00020#0%H&J\u0010\u0010m\u001a\u00020#2\u0006\u0010$\u001a\u00020kH\u0003J\u0010\u0010n\u001a\u00020#2\u0006\u0010o\u001a\u00020pH'J\u0016\u0010q\u001a\b\u0012\u0004\u0012\u00020r0\u00052\u0006\u0010o\u001a\u00020pH'J\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020t0\u00052\u0006\u0010o\u001a\u00020pH'J\u0016\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010 \u001a\u00020vH'J\u000e\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u000e\u0010x\u001a\b\u0012\u0004\u0012\u00020y0\u0005H'J\u0016\u0010z\u001a\b\u0012\u0004\u0012\u00020{0\u00052\u0006\u0010|\u001a\u00020\u000eH'J\u000e\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0018\u0010~\u001a\b\u0012\u0004\u0012\u00020\u007f0\u00052\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H'J\u001a\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\u00052\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H'J\t\u0010\u0086\u0001\u001a\u00020\u000eH\u0016J\n\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0014¨\u0006\u008b\u0001"}, d2 = {"Lcom/margelo/nitro/iap/HybridRnIapSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "initConnection", "Lcom/margelo/nitro/core/Promise;", "", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Lcom/margelo/nitro/iap/Variant_NullType_InitConnectionConfig;", "endConnection", "fetchProducts", "", "Lcom/margelo/nitro/iap/NitroProduct;", "skus", "", WebViewManager.EVENT_TYPE_KEY, "([Ljava/lang/String;Ljava/lang/String;)Lcom/margelo/nitro/core/Promise;", "requestPurchase", "Lcom/margelo/nitro/iap/RequestPurchaseResult;", "request", "Lcom/margelo/nitro/iap/NitroPurchaseRequest;", "getAvailablePurchases", "Lcom/margelo/nitro/iap/NitroPurchase;", "options", "Lcom/margelo/nitro/iap/NitroAvailablePurchasesOptions;", "getActiveSubscriptions", "Lcom/margelo/nitro/iap/NitroActiveSubscription;", "subscriptionIds", "([Ljava/lang/String;)Lcom/margelo/nitro/core/Promise;", "hasActiveSubscriptions", "finishTransaction", "Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult;", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Lcom/margelo/nitro/iap/NitroFinishTransactionParams;", "addPurchaseUpdatedListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "purchase", "addPurchaseUpdatedListener_cxx", "Lcom/margelo/nitro/iap/Func_void_NitroPurchase;", "addPurchaseErrorListener", "Lcom/margelo/nitro/iap/NitroPurchaseResult;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "addPurchaseErrorListener_cxx", "Lcom/margelo/nitro/iap/Func_void_NitroPurchaseResult;", "removePurchaseUpdatedListener", "removePurchaseUpdatedListener_cxx", "removePurchaseErrorListener", "removePurchaseErrorListener_cxx", "addPromotedProductListenerIOS", "product", "addPromotedProductListenerIOS_cxx", "Lcom/margelo/nitro/iap/Func_void_NitroProduct;", "removePromotedProductListenerIOS", "removePromotedProductListenerIOS_cxx", "getStorefrontIOS", "getAppTransactionIOS", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "requestPromotedProductIOS", "Lcom/margelo/nitro/iap/Variant_NullType_NitroProduct;", "getPromotedProductIOS", "buyPromotedProductIOS", "presentCodeRedemptionSheetIOS", "clearTransactionIOS", "beginRefundRequestIOS", "sku", "subscriptionStatusIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Array_NitroSubscriptionStatus_;", "currentEntitlementIOS", "Lcom/margelo/nitro/iap/Variant_NullType_NitroPurchase;", "latestTransactionIOS", "getPendingTransactionsIOS", "syncIOS", "showManageSubscriptionsIOS", "deepLinkToSubscriptionsIOS", "isEligibleForIntroOfferIOS", "groupID", "getReceiptDataIOS", "getReceiptIOS", "requestReceiptRefreshIOS", "isTransactionVerifiedIOS", "getTransactionJwsIOS", "validateReceipt", "Lcom/margelo/nitro/iap/Variant_NitroReceiptValidationResultIOS_NitroReceiptValidationResultAndroid;", "Lcom/margelo/nitro/iap/NitroReceiptValidationParams;", "verifyPurchaseWithProvider", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderResult;", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderProps;", "getStorefront", "deepLinkToSubscriptionsAndroid", "Lcom/margelo/nitro/iap/NitroDeepLinkOptionsAndroid;", "checkAlternativeBillingAvailabilityAndroid", "showAlternativeBillingDialogAndroid", "createAlternativeBillingTokenAndroid", "addUserChoiceBillingListenerAndroid", "Lcom/margelo/nitro/iap/UserChoiceBillingDetails;", "details", "addUserChoiceBillingListenerAndroid_cxx", "Lcom/margelo/nitro/iap/Func_void_UserChoiceBillingDetails;", "removeUserChoiceBillingListenerAndroid", "removeUserChoiceBillingListenerAndroid_cxx", "addDeveloperProvidedBillingListenerAndroid", "Lcom/margelo/nitro/iap/DeveloperProvidedBillingDetailsAndroid;", "addDeveloperProvidedBillingListenerAndroid_cxx", "Lcom/margelo/nitro/iap/Func_void_DeveloperProvidedBillingDetailsAndroid;", "removeDeveloperProvidedBillingListenerAndroid", "removeDeveloperProvidedBillingListenerAndroid_cxx", "enableBillingProgramAndroid", "program", "Lcom/margelo/nitro/iap/BillingProgramAndroid;", "isBillingProgramAvailableAndroid", "Lcom/margelo/nitro/iap/NitroBillingProgramAvailabilityResultAndroid;", "createBillingProgramReportingDetailsAndroid", "Lcom/margelo/nitro/iap/NitroBillingProgramReportingDetailsAndroid;", "launchExternalLinkAndroid", "Lcom/margelo/nitro/iap/NitroLaunchExternalLinkParamsAndroid;", "canPresentExternalPurchaseNoticeIOS", "presentExternalPurchaseNoticeSheetIOS", "Lcom/margelo/nitro/iap/ExternalPurchaseNoticeResultIOS;", "presentExternalPurchaseLinkIOS", "Lcom/margelo/nitro/iap/ExternalPurchaseLinkResultIOS;", ImagesContract.URL, "isEligibleForExternalPurchaseCustomLinkIOS", "getExternalPurchaseCustomLinkTokenIOS", "Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkTokenResultIOS;", "tokenType", "Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkTokenTypeIOS;", "showExternalPurchaseCustomLinkNoticeIOS", "Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkNoticeResultIOS;", "noticeType", "Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkNoticeTypeIOS;", "toString", "createCxxPart", "Lcom/margelo/nitro/iap/HybridRnIapSpec$CxxPart;", "CxxPart", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class HybridRnIapSpec extends HybridObject {
    protected static final String TAG = "HybridRnIapSpec";

    public abstract void addDeveloperProvidedBillingListenerAndroid(Function1<? super DeveloperProvidedBillingDetailsAndroid, Unit> listener);

    public abstract void addPromotedProductListenerIOS(Function1<? super NitroProduct, Unit> listener);

    public abstract void addPurchaseErrorListener(Function1<? super NitroPurchaseResult, Unit> listener);

    public abstract void addPurchaseUpdatedListener(Function1<? super NitroPurchase, Unit> listener);

    public abstract void addUserChoiceBillingListenerAndroid(Function1<? super UserChoiceBillingDetails, Unit> listener);

    public abstract Promise<Variant_NullType_String> beginRefundRequestIOS(String sku);

    public abstract Promise<Unit> buyPromotedProductIOS();

    public abstract Promise<Boolean> canPresentExternalPurchaseNoticeIOS();

    public abstract Promise<Boolean> checkAlternativeBillingAvailabilityAndroid();

    public abstract Promise<Unit> clearTransactionIOS();

    public abstract Promise<Variant_NullType_String> createAlternativeBillingTokenAndroid(Variant_NullType_String sku);

    public abstract Promise<NitroBillingProgramReportingDetailsAndroid> createBillingProgramReportingDetailsAndroid(BillingProgramAndroid program);

    public abstract Promise<Variant_NullType_NitroPurchase> currentEntitlementIOS(String sku);

    public abstract Promise<Unit> deepLinkToSubscriptionsAndroid(NitroDeepLinkOptionsAndroid options);

    public abstract Promise<Boolean> deepLinkToSubscriptionsIOS();

    public abstract void enableBillingProgramAndroid(BillingProgramAndroid program);

    public abstract Promise<Boolean> endConnection();

    public abstract Promise<NitroProduct[]> fetchProducts(String[] skus, String type);

    public abstract Promise<Variant_Boolean_NitroPurchaseResult> finishTransaction(NitroFinishTransactionParams params);

    public abstract Promise<NitroActiveSubscription[]> getActiveSubscriptions(String[] subscriptionIds);

    public abstract Promise<Variant_NullType_String> getAppTransactionIOS();

    public abstract Promise<NitroPurchase[]> getAvailablePurchases(NitroAvailablePurchasesOptions options);

    public abstract Promise<ExternalPurchaseCustomLinkTokenResultIOS> getExternalPurchaseCustomLinkTokenIOS(ExternalPurchaseCustomLinkTokenTypeIOS tokenType);

    public abstract Promise<NitroPurchase[]> getPendingTransactionsIOS();

    public abstract Promise<Variant_NullType_NitroProduct> getPromotedProductIOS();

    public abstract Promise<String> getReceiptDataIOS();

    public abstract Promise<String> getReceiptIOS();

    public abstract Promise<String> getStorefront();

    public abstract Promise<String> getStorefrontIOS();

    public abstract Promise<Variant_NullType_String> getTransactionJwsIOS(String sku);

    public abstract Promise<Boolean> hasActiveSubscriptions(String[] subscriptionIds);

    public abstract Promise<Boolean> initConnection(Variant_NullType_InitConnectionConfig config);

    public abstract Promise<NitroBillingProgramAvailabilityResultAndroid> isBillingProgramAvailableAndroid(BillingProgramAndroid program);

    public abstract Promise<Boolean> isEligibleForExternalPurchaseCustomLinkIOS();

    public abstract Promise<Boolean> isEligibleForIntroOfferIOS(String groupID);

    public abstract Promise<Boolean> isTransactionVerifiedIOS(String sku);

    public abstract Promise<Variant_NullType_NitroPurchase> latestTransactionIOS(String sku);

    public abstract Promise<Boolean> launchExternalLinkAndroid(NitroLaunchExternalLinkParamsAndroid params);

    public abstract Promise<Boolean> presentCodeRedemptionSheetIOS();

    public abstract Promise<ExternalPurchaseLinkResultIOS> presentExternalPurchaseLinkIOS(String url);

    public abstract Promise<ExternalPurchaseNoticeResultIOS> presentExternalPurchaseNoticeSheetIOS();

    public abstract void removeDeveloperProvidedBillingListenerAndroid(Function1<? super DeveloperProvidedBillingDetailsAndroid, Unit> listener);

    public abstract void removePromotedProductListenerIOS(Function1<? super NitroProduct, Unit> listener);

    public abstract void removePurchaseErrorListener(Function1<? super NitroPurchaseResult, Unit> listener);

    public abstract void removePurchaseUpdatedListener(Function1<? super NitroPurchase, Unit> listener);

    public abstract void removeUserChoiceBillingListenerAndroid(Function1<? super UserChoiceBillingDetails, Unit> listener);

    public abstract Promise<Variant_NullType_NitroProduct> requestPromotedProductIOS();

    public abstract Promise<RequestPurchaseResult> requestPurchase(NitroPurchaseRequest request);

    public abstract Promise<String> requestReceiptRefreshIOS();

    public abstract Promise<Boolean> showAlternativeBillingDialogAndroid();

    public abstract Promise<ExternalPurchaseCustomLinkNoticeResultIOS> showExternalPurchaseCustomLinkNoticeIOS(ExternalPurchaseCustomLinkNoticeTypeIOS noticeType);

    public abstract Promise<NitroPurchase[]> showManageSubscriptionsIOS();

    public abstract Promise<Variant_NullType_Array_NitroSubscriptionStatus_> subscriptionStatusIOS(String sku);

    public abstract Promise<Boolean> syncIOS();

    public abstract Promise<Variant_NitroReceiptValidationResultIOS_NitroReceiptValidationResultAndroid> validateReceipt(NitroReceiptValidationParams params);

    public abstract Promise<NitroVerifyPurchaseWithProviderResult> verifyPurchaseWithProvider(NitroVerifyPurchaseWithProviderProps params);

    private final void addPurchaseUpdatedListener_cxx(Func_void_NitroPurchase listener) {
        addPurchaseUpdatedListener(listener);
        Unit unit = Unit.INSTANCE;
    }

    private final void addPurchaseErrorListener_cxx(Func_void_NitroPurchaseResult listener) {
        addPurchaseErrorListener(listener);
        Unit unit = Unit.INSTANCE;
    }

    private final void removePurchaseUpdatedListener_cxx(Func_void_NitroPurchase listener) {
        removePurchaseUpdatedListener(listener);
        Unit unit = Unit.INSTANCE;
    }

    private final void removePurchaseErrorListener_cxx(Func_void_NitroPurchaseResult listener) {
        removePurchaseErrorListener(listener);
        Unit unit = Unit.INSTANCE;
    }

    private final void addPromotedProductListenerIOS_cxx(Func_void_NitroProduct listener) {
        addPromotedProductListenerIOS(listener);
        Unit unit = Unit.INSTANCE;
    }

    private final void removePromotedProductListenerIOS_cxx(Func_void_NitroProduct listener) {
        removePromotedProductListenerIOS(listener);
        Unit unit = Unit.INSTANCE;
    }

    private final void addUserChoiceBillingListenerAndroid_cxx(Func_void_UserChoiceBillingDetails listener) {
        addUserChoiceBillingListenerAndroid(listener);
        Unit unit = Unit.INSTANCE;
    }

    private final void removeUserChoiceBillingListenerAndroid_cxx(Func_void_UserChoiceBillingDetails listener) {
        removeUserChoiceBillingListenerAndroid(listener);
        Unit unit = Unit.INSTANCE;
    }

    private final void addDeveloperProvidedBillingListenerAndroid_cxx(Func_void_DeveloperProvidedBillingDetailsAndroid listener) {
        addDeveloperProvidedBillingListenerAndroid(listener);
        Unit unit = Unit.INSTANCE;
    }

    private final void removeDeveloperProvidedBillingListenerAndroid_cxx(Func_void_DeveloperProvidedBillingDetailsAndroid listener) {
        removeDeveloperProvidedBillingListenerAndroid(listener);
        Unit unit = Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject RnIap]";
    }

    /* compiled from: HybridRnIapSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/iap/HybridRnIapSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/iap/HybridRnIapSpec;", "<init>", "(Lcom/margelo/nitro/iap/HybridRnIapSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridRnIapSpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.margelo.nitro.core.HybridObject
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
