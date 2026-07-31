package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseAndroid.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0001]BÓ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\"\u0010#J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u000eHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010N\u001a\u00020\u0016HÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\u0019HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u001cHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u001fHÆ\u0003J\t\u0010U\u001a\u00020\u001cHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0081\u0002\u0010W\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001c2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010X\u001a\u00020\u000e2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020[HÖ\u0001J\t\u0010\\\u001a\u00020\tHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010%R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010.R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010;R\u0018\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010'¨\u0006^"}, d2 = {"Lcom/margelo/nitro/iap/PurchaseAndroid;", "", "autoRenewingAndroid", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "currentPlanId", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "dataAndroid", "developerPayloadAndroid", "id", "", "ids", "Lcom/margelo/nitro/iap/Variant_NullType_Array_String_;", "isAcknowledgedAndroid", "isAutoRenewing", "", "isSuspendedAndroid", "obfuscatedAccountIdAndroid", "obfuscatedProfileIdAndroid", "packageNameAndroid", "pendingPurchaseUpdateAndroid", "Lcom/margelo/nitro/iap/Variant_NullType_PendingPurchaseUpdateAndroid;", "platform", "Lcom/margelo/nitro/iap/IapPlatform;", "productId", "purchaseState", "Lcom/margelo/nitro/iap/PurchaseState;", "purchaseToken", "quantity", "", "signatureAndroid", "store", "Lcom/margelo/nitro/iap/IapStore;", "transactionDate", "transactionId", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_Array_String_;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;ZLcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_PendingPurchaseUpdateAndroid;Lcom/margelo/nitro/iap/IapPlatform;Ljava/lang/String;Lcom/margelo/nitro/iap/PurchaseState;Lcom/margelo/nitro/iap/Variant_NullType_String;DLcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/IapStore;DLcom/margelo/nitro/iap/Variant_NullType_String;)V", "getAutoRenewingAndroid", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getCurrentPlanId", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getDataAndroid", "getDeveloperPayloadAndroid", "getId", "()Ljava/lang/String;", "getIds", "()Lcom/margelo/nitro/iap/Variant_NullType_Array_String_;", "()Z", "getObfuscatedAccountIdAndroid", "getObfuscatedProfileIdAndroid", "getPackageNameAndroid", "getPendingPurchaseUpdateAndroid", "()Lcom/margelo/nitro/iap/Variant_NullType_PendingPurchaseUpdateAndroid;", "getPlatform", "()Lcom/margelo/nitro/iap/IapPlatform;", "getProductId", "getPurchaseState", "()Lcom/margelo/nitro/iap/PurchaseState;", "getPurchaseToken", "getQuantity", "()D", "getSignatureAndroid", "getStore", "()Lcom/margelo/nitro/iap/IapStore;", "getTransactionDate", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PurchaseAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_Boolean autoRenewingAndroid;
    private final Variant_NullType_String currentPlanId;
    private final Variant_NullType_String dataAndroid;
    private final Variant_NullType_String developerPayloadAndroid;
    private final String id;
    private final Variant_NullType_Array_String_ ids;
    private final Variant_NullType_Boolean isAcknowledgedAndroid;
    private final boolean isAutoRenewing;
    private final Variant_NullType_Boolean isSuspendedAndroid;
    private final Variant_NullType_String obfuscatedAccountIdAndroid;
    private final Variant_NullType_String obfuscatedProfileIdAndroid;
    private final Variant_NullType_String packageNameAndroid;
    private final Variant_NullType_PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid;
    private final IapPlatform platform;
    private final String productId;
    private final PurchaseState purchaseState;
    private final Variant_NullType_String purchaseToken;
    private final double quantity;
    private final Variant_NullType_String signatureAndroid;
    private final IapStore store;
    private final double transactionDate;
    private final Variant_NullType_String transactionId;

    public static /* synthetic */ PurchaseAndroid copy$default(PurchaseAndroid purchaseAndroid, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_String variant_NullType_String3, String str, Variant_NullType_Array_String_ variant_NullType_Array_String_, Variant_NullType_Boolean variant_NullType_Boolean2, boolean z, Variant_NullType_Boolean variant_NullType_Boolean3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_PendingPurchaseUpdateAndroid variant_NullType_PendingPurchaseUpdateAndroid, IapPlatform iapPlatform, String str2, PurchaseState purchaseState, Variant_NullType_String variant_NullType_String7, double d, Variant_NullType_String variant_NullType_String8, IapStore iapStore, double d2, Variant_NullType_String variant_NullType_String9, int i, Object obj) {
        Variant_NullType_String variant_NullType_String10;
        double d3;
        Variant_NullType_Boolean variant_NullType_Boolean4 = (i & 1) != 0 ? purchaseAndroid.autoRenewingAndroid : variant_NullType_Boolean;
        Variant_NullType_String variant_NullType_String11 = (i & 2) != 0 ? purchaseAndroid.currentPlanId : variant_NullType_String;
        Variant_NullType_String variant_NullType_String12 = (i & 4) != 0 ? purchaseAndroid.dataAndroid : variant_NullType_String2;
        Variant_NullType_String variant_NullType_String13 = (i & 8) != 0 ? purchaseAndroid.developerPayloadAndroid : variant_NullType_String3;
        String str3 = (i & 16) != 0 ? purchaseAndroid.id : str;
        Variant_NullType_Array_String_ variant_NullType_Array_String_2 = (i & 32) != 0 ? purchaseAndroid.ids : variant_NullType_Array_String_;
        Variant_NullType_Boolean variant_NullType_Boolean5 = (i & 64) != 0 ? purchaseAndroid.isAcknowledgedAndroid : variant_NullType_Boolean2;
        boolean z2 = (i & 128) != 0 ? purchaseAndroid.isAutoRenewing : z;
        Variant_NullType_Boolean variant_NullType_Boolean6 = (i & 256) != 0 ? purchaseAndroid.isSuspendedAndroid : variant_NullType_Boolean3;
        Variant_NullType_String variant_NullType_String14 = (i & 512) != 0 ? purchaseAndroid.obfuscatedAccountIdAndroid : variant_NullType_String4;
        Variant_NullType_String variant_NullType_String15 = (i & 1024) != 0 ? purchaseAndroid.obfuscatedProfileIdAndroid : variant_NullType_String5;
        Variant_NullType_String variant_NullType_String16 = (i & 2048) != 0 ? purchaseAndroid.packageNameAndroid : variant_NullType_String6;
        Variant_NullType_PendingPurchaseUpdateAndroid variant_NullType_PendingPurchaseUpdateAndroid2 = (i & 4096) != 0 ? purchaseAndroid.pendingPurchaseUpdateAndroid : variant_NullType_PendingPurchaseUpdateAndroid;
        IapPlatform iapPlatform2 = (i & 8192) != 0 ? purchaseAndroid.platform : iapPlatform;
        Variant_NullType_Boolean variant_NullType_Boolean7 = variant_NullType_Boolean4;
        String str4 = (i & 16384) != 0 ? purchaseAndroid.productId : str2;
        PurchaseState purchaseState2 = (i & 32768) != 0 ? purchaseAndroid.purchaseState : purchaseState;
        Variant_NullType_String variant_NullType_String17 = (i & 65536) != 0 ? purchaseAndroid.purchaseToken : variant_NullType_String7;
        String str5 = str4;
        double d4 = (i & 131072) != 0 ? purchaseAndroid.quantity : d;
        Variant_NullType_String variant_NullType_String18 = (i & 262144) != 0 ? purchaseAndroid.signatureAndroid : variant_NullType_String8;
        IapStore iapStore2 = (i & 524288) != 0 ? purchaseAndroid.store : iapStore;
        double d5 = (i & 1048576) != 0 ? purchaseAndroid.transactionDate : d2;
        if ((i & 2097152) != 0) {
            d3 = d5;
            variant_NullType_String10 = purchaseAndroid.transactionId;
        } else {
            variant_NullType_String10 = variant_NullType_String9;
            d3 = d5;
        }
        return purchaseAndroid.copy(variant_NullType_Boolean7, variant_NullType_String11, variant_NullType_String12, variant_NullType_String13, str3, variant_NullType_Array_String_2, variant_NullType_Boolean5, z2, variant_NullType_Boolean6, variant_NullType_String14, variant_NullType_String15, variant_NullType_String16, variant_NullType_PendingPurchaseUpdateAndroid2, iapPlatform2, str5, purchaseState2, variant_NullType_String17, d4, variant_NullType_String18, iapStore2, d3, variant_NullType_String10);
    }

    @JvmStatic
    private static final PurchaseAndroid fromCpp(Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_String variant_NullType_String3, String str, Variant_NullType_Array_String_ variant_NullType_Array_String_, Variant_NullType_Boolean variant_NullType_Boolean2, boolean z, Variant_NullType_Boolean variant_NullType_Boolean3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_PendingPurchaseUpdateAndroid variant_NullType_PendingPurchaseUpdateAndroid, IapPlatform iapPlatform, String str2, PurchaseState purchaseState, Variant_NullType_String variant_NullType_String7, double d, Variant_NullType_String variant_NullType_String8, IapStore iapStore, double d2, Variant_NullType_String variant_NullType_String9) {
        return INSTANCE.fromCpp(variant_NullType_Boolean, variant_NullType_String, variant_NullType_String2, variant_NullType_String3, str, variant_NullType_Array_String_, variant_NullType_Boolean2, z, variant_NullType_Boolean3, variant_NullType_String4, variant_NullType_String5, variant_NullType_String6, variant_NullType_PendingPurchaseUpdateAndroid, iapPlatform, str2, purchaseState, variant_NullType_String7, d, variant_NullType_String8, iapStore, d2, variant_NullType_String9);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_Boolean getAutoRenewingAndroid() {
        return this.autoRenewingAndroid;
    }

    /* renamed from: component10, reason: from getter */
    public final Variant_NullType_String getObfuscatedAccountIdAndroid() {
        return this.obfuscatedAccountIdAndroid;
    }

    /* renamed from: component11, reason: from getter */
    public final Variant_NullType_String getObfuscatedProfileIdAndroid() {
        return this.obfuscatedProfileIdAndroid;
    }

    /* renamed from: component12, reason: from getter */
    public final Variant_NullType_String getPackageNameAndroid() {
        return this.packageNameAndroid;
    }

    /* renamed from: component13, reason: from getter */
    public final Variant_NullType_PendingPurchaseUpdateAndroid getPendingPurchaseUpdateAndroid() {
        return this.pendingPurchaseUpdateAndroid;
    }

    /* renamed from: component14, reason: from getter */
    public final IapPlatform getPlatform() {
        return this.platform;
    }

    /* renamed from: component15, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component16, reason: from getter */
    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    /* renamed from: component17, reason: from getter */
    public final Variant_NullType_String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component18, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* renamed from: component19, reason: from getter */
    public final Variant_NullType_String getSignatureAndroid() {
        return this.signatureAndroid;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_String getCurrentPlanId() {
        return this.currentPlanId;
    }

    /* renamed from: component20, reason: from getter */
    public final IapStore getStore() {
        return this.store;
    }

    /* renamed from: component21, reason: from getter */
    public final double getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: component22, reason: from getter */
    public final Variant_NullType_String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_String getDataAndroid() {
        return this.dataAndroid;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_String getDeveloperPayloadAndroid() {
        return this.developerPayloadAndroid;
    }

    /* renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component6, reason: from getter */
    public final Variant_NullType_Array_String_ getIds() {
        return this.ids;
    }

    /* renamed from: component7, reason: from getter */
    public final Variant_NullType_Boolean getIsAcknowledgedAndroid() {
        return this.isAcknowledgedAndroid;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    /* renamed from: component9, reason: from getter */
    public final Variant_NullType_Boolean getIsSuspendedAndroid() {
        return this.isSuspendedAndroid;
    }

    public final PurchaseAndroid copy(Variant_NullType_Boolean autoRenewingAndroid, Variant_NullType_String currentPlanId, Variant_NullType_String dataAndroid, Variant_NullType_String developerPayloadAndroid, String id, Variant_NullType_Array_String_ ids, Variant_NullType_Boolean isAcknowledgedAndroid, boolean isAutoRenewing, Variant_NullType_Boolean isSuspendedAndroid, Variant_NullType_String obfuscatedAccountIdAndroid, Variant_NullType_String obfuscatedProfileIdAndroid, Variant_NullType_String packageNameAndroid, Variant_NullType_PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid, IapPlatform platform, String productId, PurchaseState purchaseState, Variant_NullType_String purchaseToken, double quantity, Variant_NullType_String signatureAndroid, IapStore store, double transactionDate, Variant_NullType_String transactionId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        Intrinsics.checkNotNullParameter(store, "store");
        return new PurchaseAndroid(autoRenewingAndroid, currentPlanId, dataAndroid, developerPayloadAndroid, id, ids, isAcknowledgedAndroid, isAutoRenewing, isSuspendedAndroid, obfuscatedAccountIdAndroid, obfuscatedProfileIdAndroid, packageNameAndroid, pendingPurchaseUpdateAndroid, platform, productId, purchaseState, purchaseToken, quantity, signatureAndroid, store, transactionDate, transactionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseAndroid)) {
            return false;
        }
        PurchaseAndroid purchaseAndroid = (PurchaseAndroid) other;
        return Intrinsics.areEqual(this.autoRenewingAndroid, purchaseAndroid.autoRenewingAndroid) && Intrinsics.areEqual(this.currentPlanId, purchaseAndroid.currentPlanId) && Intrinsics.areEqual(this.dataAndroid, purchaseAndroid.dataAndroid) && Intrinsics.areEqual(this.developerPayloadAndroid, purchaseAndroid.developerPayloadAndroid) && Intrinsics.areEqual(this.id, purchaseAndroid.id) && Intrinsics.areEqual(this.ids, purchaseAndroid.ids) && Intrinsics.areEqual(this.isAcknowledgedAndroid, purchaseAndroid.isAcknowledgedAndroid) && this.isAutoRenewing == purchaseAndroid.isAutoRenewing && Intrinsics.areEqual(this.isSuspendedAndroid, purchaseAndroid.isSuspendedAndroid) && Intrinsics.areEqual(this.obfuscatedAccountIdAndroid, purchaseAndroid.obfuscatedAccountIdAndroid) && Intrinsics.areEqual(this.obfuscatedProfileIdAndroid, purchaseAndroid.obfuscatedProfileIdAndroid) && Intrinsics.areEqual(this.packageNameAndroid, purchaseAndroid.packageNameAndroid) && Intrinsics.areEqual(this.pendingPurchaseUpdateAndroid, purchaseAndroid.pendingPurchaseUpdateAndroid) && this.platform == purchaseAndroid.platform && Intrinsics.areEqual(this.productId, purchaseAndroid.productId) && this.purchaseState == purchaseAndroid.purchaseState && Intrinsics.areEqual(this.purchaseToken, purchaseAndroid.purchaseToken) && Double.compare(this.quantity, purchaseAndroid.quantity) == 0 && Intrinsics.areEqual(this.signatureAndroid, purchaseAndroid.signatureAndroid) && this.store == purchaseAndroid.store && Double.compare(this.transactionDate, purchaseAndroid.transactionDate) == 0 && Intrinsics.areEqual(this.transactionId, purchaseAndroid.transactionId);
    }

    public int hashCode() {
        Variant_NullType_Boolean variant_NullType_Boolean = this.autoRenewingAndroid;
        int hashCode = (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String = this.currentPlanId;
        int hashCode2 = (hashCode + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String2 = this.dataAndroid;
        int hashCode3 = (hashCode2 + (variant_NullType_String2 == null ? 0 : variant_NullType_String2.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String3 = this.developerPayloadAndroid;
        int hashCode4 = (((hashCode3 + (variant_NullType_String3 == null ? 0 : variant_NullType_String3.hashCode())) * 31) + this.id.hashCode()) * 31;
        Variant_NullType_Array_String_ variant_NullType_Array_String_ = this.ids;
        int hashCode5 = (hashCode4 + (variant_NullType_Array_String_ == null ? 0 : variant_NullType_Array_String_.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean2 = this.isAcknowledgedAndroid;
        int hashCode6 = (((hashCode5 + (variant_NullType_Boolean2 == null ? 0 : variant_NullType_Boolean2.hashCode())) * 31) + Boolean.hashCode(this.isAutoRenewing)) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean3 = this.isSuspendedAndroid;
        int hashCode7 = (hashCode6 + (variant_NullType_Boolean3 == null ? 0 : variant_NullType_Boolean3.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String4 = this.obfuscatedAccountIdAndroid;
        int hashCode8 = (hashCode7 + (variant_NullType_String4 == null ? 0 : variant_NullType_String4.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String5 = this.obfuscatedProfileIdAndroid;
        int hashCode9 = (hashCode8 + (variant_NullType_String5 == null ? 0 : variant_NullType_String5.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String6 = this.packageNameAndroid;
        int hashCode10 = (hashCode9 + (variant_NullType_String6 == null ? 0 : variant_NullType_String6.hashCode())) * 31;
        Variant_NullType_PendingPurchaseUpdateAndroid variant_NullType_PendingPurchaseUpdateAndroid = this.pendingPurchaseUpdateAndroid;
        int hashCode11 = (((((((hashCode10 + (variant_NullType_PendingPurchaseUpdateAndroid == null ? 0 : variant_NullType_PendingPurchaseUpdateAndroid.hashCode())) * 31) + this.platform.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.purchaseState.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String7 = this.purchaseToken;
        int hashCode12 = (((hashCode11 + (variant_NullType_String7 == null ? 0 : variant_NullType_String7.hashCode())) * 31) + Double.hashCode(this.quantity)) * 31;
        Variant_NullType_String variant_NullType_String8 = this.signatureAndroid;
        int hashCode13 = (((((hashCode12 + (variant_NullType_String8 == null ? 0 : variant_NullType_String8.hashCode())) * 31) + this.store.hashCode()) * 31) + Double.hashCode(this.transactionDate)) * 31;
        Variant_NullType_String variant_NullType_String9 = this.transactionId;
        return hashCode13 + (variant_NullType_String9 != null ? variant_NullType_String9.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseAndroid(autoRenewingAndroid=" + this.autoRenewingAndroid + ", currentPlanId=" + this.currentPlanId + ", dataAndroid=" + this.dataAndroid + ", developerPayloadAndroid=" + this.developerPayloadAndroid + ", id=" + this.id + ", ids=" + this.ids + ", isAcknowledgedAndroid=" + this.isAcknowledgedAndroid + ", isAutoRenewing=" + this.isAutoRenewing + ", isSuspendedAndroid=" + this.isSuspendedAndroid + ", obfuscatedAccountIdAndroid=" + this.obfuscatedAccountIdAndroid + ", obfuscatedProfileIdAndroid=" + this.obfuscatedProfileIdAndroid + ", packageNameAndroid=" + this.packageNameAndroid + ", pendingPurchaseUpdateAndroid=" + this.pendingPurchaseUpdateAndroid + ", platform=" + this.platform + ", productId=" + this.productId + ", purchaseState=" + this.purchaseState + ", purchaseToken=" + this.purchaseToken + ", quantity=" + this.quantity + ", signatureAndroid=" + this.signatureAndroid + ", store=" + this.store + ", transactionDate=" + this.transactionDate + ", transactionId=" + this.transactionId + ")";
    }

    public PurchaseAndroid(Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_String variant_NullType_String3, String id, Variant_NullType_Array_String_ variant_NullType_Array_String_, Variant_NullType_Boolean variant_NullType_Boolean2, boolean z, Variant_NullType_Boolean variant_NullType_Boolean3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_PendingPurchaseUpdateAndroid variant_NullType_PendingPurchaseUpdateAndroid, IapPlatform platform, String productId, PurchaseState purchaseState, Variant_NullType_String variant_NullType_String7, double d, Variant_NullType_String variant_NullType_String8, IapStore store, double d2, Variant_NullType_String variant_NullType_String9) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        Intrinsics.checkNotNullParameter(store, "store");
        this.autoRenewingAndroid = variant_NullType_Boolean;
        this.currentPlanId = variant_NullType_String;
        this.dataAndroid = variant_NullType_String2;
        this.developerPayloadAndroid = variant_NullType_String3;
        this.id = id;
        this.ids = variant_NullType_Array_String_;
        this.isAcknowledgedAndroid = variant_NullType_Boolean2;
        this.isAutoRenewing = z;
        this.isSuspendedAndroid = variant_NullType_Boolean3;
        this.obfuscatedAccountIdAndroid = variant_NullType_String4;
        this.obfuscatedProfileIdAndroid = variant_NullType_String5;
        this.packageNameAndroid = variant_NullType_String6;
        this.pendingPurchaseUpdateAndroid = variant_NullType_PendingPurchaseUpdateAndroid;
        this.platform = platform;
        this.productId = productId;
        this.purchaseState = purchaseState;
        this.purchaseToken = variant_NullType_String7;
        this.quantity = d;
        this.signatureAndroid = variant_NullType_String8;
        this.store = store;
        this.transactionDate = d2;
        this.transactionId = variant_NullType_String9;
    }

    public final Variant_NullType_Boolean getAutoRenewingAndroid() {
        return this.autoRenewingAndroid;
    }

    public final Variant_NullType_String getCurrentPlanId() {
        return this.currentPlanId;
    }

    public final Variant_NullType_String getDataAndroid() {
        return this.dataAndroid;
    }

    public final Variant_NullType_String getDeveloperPayloadAndroid() {
        return this.developerPayloadAndroid;
    }

    public final String getId() {
        return this.id;
    }

    public final Variant_NullType_Array_String_ getIds() {
        return this.ids;
    }

    public final Variant_NullType_Boolean isAcknowledgedAndroid() {
        return this.isAcknowledgedAndroid;
    }

    public final boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final Variant_NullType_Boolean isSuspendedAndroid() {
        return this.isSuspendedAndroid;
    }

    public final Variant_NullType_String getObfuscatedAccountIdAndroid() {
        return this.obfuscatedAccountIdAndroid;
    }

    public final Variant_NullType_String getObfuscatedProfileIdAndroid() {
        return this.obfuscatedProfileIdAndroid;
    }

    public final Variant_NullType_String getPackageNameAndroid() {
        return this.packageNameAndroid;
    }

    public final Variant_NullType_PendingPurchaseUpdateAndroid getPendingPurchaseUpdateAndroid() {
        return this.pendingPurchaseUpdateAndroid;
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

    public final Variant_NullType_String getSignatureAndroid() {
        return this.signatureAndroid;
    }

    public final IapStore getStore() {
        return this.store;
    }

    public final double getTransactionDate() {
        return this.transactionDate;
    }

    public final Variant_NullType_String getTransactionId() {
        return this.transactionId;
    }

    /* compiled from: PurchaseAndroid.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÔ\u0001\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\tH\u0003¨\u0006&"}, d2 = {"Lcom/margelo/nitro/iap/PurchaseAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/PurchaseAndroid;", "autoRenewingAndroid", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "currentPlanId", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "dataAndroid", "developerPayloadAndroid", "id", "", "ids", "Lcom/margelo/nitro/iap/Variant_NullType_Array_String_;", "isAcknowledgedAndroid", "isAutoRenewing", "", "isSuspendedAndroid", "obfuscatedAccountIdAndroid", "obfuscatedProfileIdAndroid", "packageNameAndroid", "pendingPurchaseUpdateAndroid", "Lcom/margelo/nitro/iap/Variant_NullType_PendingPurchaseUpdateAndroid;", "platform", "Lcom/margelo/nitro/iap/IapPlatform;", "productId", "purchaseState", "Lcom/margelo/nitro/iap/PurchaseState;", "purchaseToken", "quantity", "", "signatureAndroid", "store", "Lcom/margelo/nitro/iap/IapStore;", "transactionDate", "transactionId", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final PurchaseAndroid fromCpp(Variant_NullType_Boolean autoRenewingAndroid, Variant_NullType_String currentPlanId, Variant_NullType_String dataAndroid, Variant_NullType_String developerPayloadAndroid, String id, Variant_NullType_Array_String_ ids, Variant_NullType_Boolean isAcknowledgedAndroid, boolean isAutoRenewing, Variant_NullType_Boolean isSuspendedAndroid, Variant_NullType_String obfuscatedAccountIdAndroid, Variant_NullType_String obfuscatedProfileIdAndroid, Variant_NullType_String packageNameAndroid, Variant_NullType_PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid, IapPlatform platform, String productId, PurchaseState purchaseState, Variant_NullType_String purchaseToken, double quantity, Variant_NullType_String signatureAndroid, IapStore store, double transactionDate, Variant_NullType_String transactionId) {
            return new PurchaseAndroid(autoRenewingAndroid, currentPlanId, dataAndroid, developerPayloadAndroid, id, ids, isAcknowledgedAndroid, isAutoRenewing, isSuspendedAndroid, obfuscatedAccountIdAndroid, obfuscatedProfileIdAndroid, packageNameAndroid, pendingPurchaseUpdateAndroid, platform, productId, purchaseState, purchaseToken, quantity, signatureAndroid, store, transactionDate, transactionId);
        }
    }
}
