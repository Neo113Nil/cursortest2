package dev.hyo.openiap;

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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\"\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0001aBõ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\u0016\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010D0CH\u0016J\u0010\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\t\u0010L\u001a\u00020\u0004HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010R\u001a\u00020\u0015HÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\t\u0010T\u001a\u00020\u0018HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010V\u001a\u00020\u001bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010X\u001a\u00020\u001eHÆ\u0003J\t\u0010Y\u001a\u00020 HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u008c\u0002\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\\J\u0013\u0010]\u001a\u00020\u00042\b\u0010^\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010_\u001a\u00020\u001bHÖ\u0001J\t\u0010`\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\f\u0010%R\u0014\u0010\r\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010.R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u000e\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u0010\u0016\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010(¨\u0006b"}, d2 = {"Ldev/hyo/openiap/PurchaseAndroid;", "Ldev/hyo/openiap/PurchaseCommon;", "Ldev/hyo/openiap/Purchase;", "autoRenewingAndroid", "", "currentPlanId", "", "dataAndroid", "developerPayloadAndroid", "id", "ids", "", "isAcknowledgedAndroid", "isAutoRenewing", "isSuspendedAndroid", "obfuscatedAccountIdAndroid", "obfuscatedProfileIdAndroid", "packageNameAndroid", "pendingPurchaseUpdateAndroid", "Ldev/hyo/openiap/PendingPurchaseUpdateAndroid;", "platform", "Ldev/hyo/openiap/IapPlatform;", "productId", "purchaseState", "Ldev/hyo/openiap/PurchaseState;", "purchaseToken", "quantity", "", "signatureAndroid", "store", "Ldev/hyo/openiap/IapStore;", "transactionDate", "", "transactionId", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/PendingPurchaseUpdateAndroid;Ldev/hyo/openiap/IapPlatform;Ljava/lang/String;Ldev/hyo/openiap/PurchaseState;Ljava/lang/String;ILjava/lang/String;Ldev/hyo/openiap/IapStore;DLjava/lang/String;)V", "getAutoRenewingAndroid", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrentPlanId", "()Ljava/lang/String;", "getDataAndroid", "getDeveloperPayloadAndroid", "getId", "getIds", "()Ljava/util/List;", "()Z", "getObfuscatedAccountIdAndroid", "getObfuscatedProfileIdAndroid", "getPackageNameAndroid", "getPendingPurchaseUpdateAndroid", "()Ldev/hyo/openiap/PendingPurchaseUpdateAndroid;", "getPlatform", "()Ldev/hyo/openiap/IapPlatform;", "getProductId", "getPurchaseState", "()Ldev/hyo/openiap/PurchaseState;", "getPurchaseToken", "getQuantity", "()I", "getSignatureAndroid", "getStore", "()Ldev/hyo/openiap/IapStore;", "getTransactionDate", "()D", "getTransactionId", "toJson", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/PendingPurchaseUpdateAndroid;Ldev/hyo/openiap/IapPlatform;Ljava/lang/String;Ldev/hyo/openiap/PurchaseState;Ljava/lang/String;ILjava/lang/String;Ldev/hyo/openiap/IapStore;DLjava/lang/String;)Ldev/hyo/openiap/PurchaseAndroid;", "equals", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PurchaseAndroid implements PurchaseCommon, Purchase {
    private final Boolean autoRenewingAndroid;
    private final String currentPlanId;
    private final String dataAndroid;
    private final String developerPayloadAndroid;
    private final String id;
    private final List<String> ids;
    private final Boolean isAcknowledgedAndroid;
    private final boolean isAutoRenewing;
    private final Boolean isSuspendedAndroid;
    private final String obfuscatedAccountIdAndroid;
    private final String obfuscatedProfileIdAndroid;
    private final String packageNameAndroid;
    private final PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid;
    private final IapPlatform platform;
    private final String productId;
    private final PurchaseState purchaseState;
    private final String purchaseToken;
    private final int quantity;
    private final String signatureAndroid;
    private final IapStore store;
    private final double transactionDate;
    private final String transactionId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ PurchaseAndroid copy$default(PurchaseAndroid purchaseAndroid, Boolean bool, String str, String str2, String str3, String str4, List list, Boolean bool2, boolean z, Boolean bool3, String str5, String str6, String str7, PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid, IapPlatform iapPlatform, String str8, PurchaseState purchaseState, String str9, int i, String str10, IapStore iapStore, double d, String str11, int i2, Object obj) {
        String str12;
        double d2;
        Boolean bool4 = (i2 & 1) != 0 ? purchaseAndroid.autoRenewingAndroid : bool;
        String str13 = (i2 & 2) != 0 ? purchaseAndroid.currentPlanId : str;
        String str14 = (i2 & 4) != 0 ? purchaseAndroid.dataAndroid : str2;
        String str15 = (i2 & 8) != 0 ? purchaseAndroid.developerPayloadAndroid : str3;
        String str16 = (i2 & 16) != 0 ? purchaseAndroid.id : str4;
        List list2 = (i2 & 32) != 0 ? purchaseAndroid.ids : list;
        Boolean bool5 = (i2 & 64) != 0 ? purchaseAndroid.isAcknowledgedAndroid : bool2;
        boolean z2 = (i2 & 128) != 0 ? purchaseAndroid.isAutoRenewing : z;
        Boolean bool6 = (i2 & 256) != 0 ? purchaseAndroid.isSuspendedAndroid : bool3;
        String str17 = (i2 & 512) != 0 ? purchaseAndroid.obfuscatedAccountIdAndroid : str5;
        String str18 = (i2 & 1024) != 0 ? purchaseAndroid.obfuscatedProfileIdAndroid : str6;
        String str19 = (i2 & 2048) != 0 ? purchaseAndroid.packageNameAndroid : str7;
        PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid2 = (i2 & 4096) != 0 ? purchaseAndroid.pendingPurchaseUpdateAndroid : pendingPurchaseUpdateAndroid;
        IapPlatform iapPlatform2 = (i2 & 8192) != 0 ? purchaseAndroid.platform : iapPlatform;
        Boolean bool7 = bool4;
        String str20 = (i2 & 16384) != 0 ? purchaseAndroid.productId : str8;
        PurchaseState purchaseState2 = (i2 & 32768) != 0 ? purchaseAndroid.purchaseState : purchaseState;
        String str21 = (i2 & 65536) != 0 ? purchaseAndroid.purchaseToken : str9;
        int i3 = (i2 & 131072) != 0 ? purchaseAndroid.quantity : i;
        String str22 = (i2 & 262144) != 0 ? purchaseAndroid.signatureAndroid : str10;
        IapStore iapStore2 = (i2 & 524288) != 0 ? purchaseAndroid.store : iapStore;
        String str23 = str20;
        double d3 = (i2 & 1048576) != 0 ? purchaseAndroid.transactionDate : d;
        if ((i2 & 2097152) != 0) {
            d2 = d3;
            str12 = purchaseAndroid.transactionId;
        } else {
            str12 = str11;
            d2 = d3;
        }
        return purchaseAndroid.copy(bool7, str13, str14, str15, str16, list2, bool5, z2, bool6, str17, str18, str19, pendingPurchaseUpdateAndroid2, iapPlatform2, str23, purchaseState2, str21, i3, str22, iapStore2, d2, str12);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getAutoRenewingAndroid() {
        return this.autoRenewingAndroid;
    }

    /* renamed from: component10, reason: from getter */
    public final String getObfuscatedAccountIdAndroid() {
        return this.obfuscatedAccountIdAndroid;
    }

    /* renamed from: component11, reason: from getter */
    public final String getObfuscatedProfileIdAndroid() {
        return this.obfuscatedProfileIdAndroid;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPackageNameAndroid() {
        return this.packageNameAndroid;
    }

    /* renamed from: component13, reason: from getter */
    public final PendingPurchaseUpdateAndroid getPendingPurchaseUpdateAndroid() {
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
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component18, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component19, reason: from getter */
    public final String getSignatureAndroid() {
        return this.signatureAndroid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentPlanId() {
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
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDataAndroid() {
        return this.dataAndroid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeveloperPayloadAndroid() {
        return this.developerPayloadAndroid;
    }

    /* renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component6() {
        return this.ids;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsAcknowledgedAndroid() {
        return this.isAcknowledgedAndroid;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsSuspendedAndroid() {
        return this.isSuspendedAndroid;
    }

    public final PurchaseAndroid copy(Boolean autoRenewingAndroid, String currentPlanId, String dataAndroid, String developerPayloadAndroid, String id, List<String> ids, Boolean isAcknowledgedAndroid, boolean isAutoRenewing, Boolean isSuspendedAndroid, String obfuscatedAccountIdAndroid, String obfuscatedProfileIdAndroid, String packageNameAndroid, PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid, IapPlatform platform, String productId, PurchaseState purchaseState, String purchaseToken, int quantity, String signatureAndroid, IapStore store, double transactionDate, String transactionId) {
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
        return Intrinsics.areEqual(this.autoRenewingAndroid, purchaseAndroid.autoRenewingAndroid) && Intrinsics.areEqual(this.currentPlanId, purchaseAndroid.currentPlanId) && Intrinsics.areEqual(this.dataAndroid, purchaseAndroid.dataAndroid) && Intrinsics.areEqual(this.developerPayloadAndroid, purchaseAndroid.developerPayloadAndroid) && Intrinsics.areEqual(this.id, purchaseAndroid.id) && Intrinsics.areEqual(this.ids, purchaseAndroid.ids) && Intrinsics.areEqual(this.isAcknowledgedAndroid, purchaseAndroid.isAcknowledgedAndroid) && this.isAutoRenewing == purchaseAndroid.isAutoRenewing && Intrinsics.areEqual(this.isSuspendedAndroid, purchaseAndroid.isSuspendedAndroid) && Intrinsics.areEqual(this.obfuscatedAccountIdAndroid, purchaseAndroid.obfuscatedAccountIdAndroid) && Intrinsics.areEqual(this.obfuscatedProfileIdAndroid, purchaseAndroid.obfuscatedProfileIdAndroid) && Intrinsics.areEqual(this.packageNameAndroid, purchaseAndroid.packageNameAndroid) && Intrinsics.areEqual(this.pendingPurchaseUpdateAndroid, purchaseAndroid.pendingPurchaseUpdateAndroid) && this.platform == purchaseAndroid.platform && Intrinsics.areEqual(this.productId, purchaseAndroid.productId) && this.purchaseState == purchaseAndroid.purchaseState && Intrinsics.areEqual(this.purchaseToken, purchaseAndroid.purchaseToken) && this.quantity == purchaseAndroid.quantity && Intrinsics.areEqual(this.signatureAndroid, purchaseAndroid.signatureAndroid) && this.store == purchaseAndroid.store && Double.compare(this.transactionDate, purchaseAndroid.transactionDate) == 0 && Intrinsics.areEqual(this.transactionId, purchaseAndroid.transactionId);
    }

    public int hashCode() {
        Boolean bool = this.autoRenewingAndroid;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.currentPlanId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dataAndroid;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.developerPayloadAndroid;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.id.hashCode()) * 31;
        List<String> list = this.ids;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.isAcknowledgedAndroid;
        int hashCode6 = (((hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Boolean.hashCode(this.isAutoRenewing)) * 31;
        Boolean bool3 = this.isSuspendedAndroid;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.obfuscatedAccountIdAndroid;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.obfuscatedProfileIdAndroid;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.packageNameAndroid;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid = this.pendingPurchaseUpdateAndroid;
        int hashCode11 = (((((((hashCode10 + (pendingPurchaseUpdateAndroid == null ? 0 : pendingPurchaseUpdateAndroid.hashCode())) * 31) + this.platform.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.purchaseState.hashCode()) * 31;
        String str7 = this.purchaseToken;
        int hashCode12 = (((hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31;
        String str8 = this.signatureAndroid;
        int hashCode13 = (((((hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.store.hashCode()) * 31) + Double.hashCode(this.transactionDate)) * 31;
        String str9 = this.transactionId;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseAndroid(autoRenewingAndroid=" + this.autoRenewingAndroid + ", currentPlanId=" + this.currentPlanId + ", dataAndroid=" + this.dataAndroid + ", developerPayloadAndroid=" + this.developerPayloadAndroid + ", id=" + this.id + ", ids=" + this.ids + ", isAcknowledgedAndroid=" + this.isAcknowledgedAndroid + ", isAutoRenewing=" + this.isAutoRenewing + ", isSuspendedAndroid=" + this.isSuspendedAndroid + ", obfuscatedAccountIdAndroid=" + this.obfuscatedAccountIdAndroid + ", obfuscatedProfileIdAndroid=" + this.obfuscatedProfileIdAndroid + ", packageNameAndroid=" + this.packageNameAndroid + ", pendingPurchaseUpdateAndroid=" + this.pendingPurchaseUpdateAndroid + ", platform=" + this.platform + ", productId=" + this.productId + ", purchaseState=" + this.purchaseState + ", purchaseToken=" + this.purchaseToken + ", quantity=" + this.quantity + ", signatureAndroid=" + this.signatureAndroid + ", store=" + this.store + ", transactionDate=" + this.transactionDate + ", transactionId=" + this.transactionId + ")";
    }

    public PurchaseAndroid(Boolean bool, String str, String str2, String str3, String id, List<String> list, Boolean bool2, boolean z, Boolean bool3, String str4, String str5, String str6, PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid, IapPlatform platform, String productId, PurchaseState purchaseState, String str7, int i, String str8, IapStore store, double d, String str9) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        Intrinsics.checkNotNullParameter(store, "store");
        this.autoRenewingAndroid = bool;
        this.currentPlanId = str;
        this.dataAndroid = str2;
        this.developerPayloadAndroid = str3;
        this.id = id;
        this.ids = list;
        this.isAcknowledgedAndroid = bool2;
        this.isAutoRenewing = z;
        this.isSuspendedAndroid = bool3;
        this.obfuscatedAccountIdAndroid = str4;
        this.obfuscatedProfileIdAndroid = str5;
        this.packageNameAndroid = str6;
        this.pendingPurchaseUpdateAndroid = pendingPurchaseUpdateAndroid;
        this.platform = platform;
        this.productId = productId;
        this.purchaseState = purchaseState;
        this.purchaseToken = str7;
        this.quantity = i;
        this.signatureAndroid = str8;
        this.store = store;
        this.transactionDate = d;
        this.transactionId = str9;
    }

    public /* synthetic */ PurchaseAndroid(Boolean bool, String str, String str2, String str3, String str4, List list, Boolean bool2, boolean z, Boolean bool3, String str5, String str6, String str7, PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid, IapPlatform iapPlatform, String str8, PurchaseState purchaseState, String str9, int i, String str10, IapStore iapStore, double d, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, str4, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : bool2, z, (i2 & 256) != 0 ? null : bool3, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : str7, (i2 & 4096) != 0 ? null : pendingPurchaseUpdateAndroid, iapPlatform, str8, purchaseState, (65536 & i2) != 0 ? null : str9, i, (262144 & i2) != 0 ? null : str10, iapStore, d, (i2 & 2097152) != 0 ? null : str11);
    }

    public final Boolean getAutoRenewingAndroid() {
        return this.autoRenewingAndroid;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public String getCurrentPlanId() {
        return this.currentPlanId;
    }

    public final String getDataAndroid() {
        return this.dataAndroid;
    }

    public final String getDeveloperPayloadAndroid() {
        return this.developerPayloadAndroid;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public String getId() {
        return this.id;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public List<String> getIds() {
        return this.ids;
    }

    public final Boolean isAcknowledgedAndroid() {
        return this.isAcknowledgedAndroid;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final Boolean isSuspendedAndroid() {
        return this.isSuspendedAndroid;
    }

    public final String getObfuscatedAccountIdAndroid() {
        return this.obfuscatedAccountIdAndroid;
    }

    public final String getObfuscatedProfileIdAndroid() {
        return this.obfuscatedProfileIdAndroid;
    }

    public final String getPackageNameAndroid() {
        return this.packageNameAndroid;
    }

    public final PendingPurchaseUpdateAndroid getPendingPurchaseUpdateAndroid() {
        return this.pendingPurchaseUpdateAndroid;
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

    public final String getSignatureAndroid() {
        return this.signatureAndroid;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public IapStore getStore() {
        return this.store;
    }

    @Override // dev.hyo.openiap.PurchaseCommon
    public double getTransactionDate() {
        return this.transactionDate;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/PurchaseAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/PurchaseAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PurchaseAndroid fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            IapPlatform iapPlatform;
            PurchaseState purchaseState;
            IapStore iapStore;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("autoRenewingAndroid");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            Object obj2 = json.get("currentPlanId");
            String str = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("dataAndroid");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = json.get("developerPayloadAndroid");
            String str3 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = json.get("id");
            String str4 = obj5 instanceof String ? (String) obj5 : null;
            String str5 = str4 == null ? "" : str4;
            Object obj6 = json.get("ids");
            List list = obj6 instanceof List ? (List) obj6 : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj7 : list) {
                    String str6 = obj7 instanceof String ? (String) obj7 : null;
                    if (str6 != null) {
                        arrayList2.add(str6);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Object obj8 = json.get("isAcknowledgedAndroid");
            Boolean bool2 = obj8 instanceof Boolean ? (Boolean) obj8 : null;
            Object obj9 = json.get("isAutoRenewing");
            Boolean bool3 = obj9 instanceof Boolean ? (Boolean) obj9 : null;
            boolean booleanValue = bool3 != null ? bool3.booleanValue() : false;
            Object obj10 = json.get("isSuspendedAndroid");
            Boolean bool4 = obj10 instanceof Boolean ? (Boolean) obj10 : null;
            Object obj11 = json.get("obfuscatedAccountIdAndroid");
            String str7 = obj11 instanceof String ? (String) obj11 : null;
            Object obj12 = json.get("obfuscatedProfileIdAndroid");
            String str8 = obj12 instanceof String ? (String) obj12 : null;
            Object obj13 = json.get("packageNameAndroid");
            String str9 = obj13 instanceof String ? (String) obj13 : null;
            Object obj14 = json.get("pendingPurchaseUpdateAndroid");
            Map<String, ? extends Object> map = obj14 instanceof Map ? (Map) obj14 : null;
            PendingPurchaseUpdateAndroid fromJson = map != null ? PendingPurchaseUpdateAndroid.INSTANCE.fromJson(map) : null;
            Object obj15 = json.get("platform");
            String str10 = str9;
            String str11 = obj15 instanceof String ? (String) obj15 : null;
            if (str11 == null || (iapPlatform = IapPlatform.INSTANCE.fromJson(str11)) == null) {
                iapPlatform = IapPlatform.Ios;
            }
            Object obj16 = json.get("productId");
            IapPlatform iapPlatform2 = iapPlatform;
            String str12 = obj16 instanceof String ? (String) obj16 : null;
            String str13 = str12 != null ? str12 : "";
            Object obj17 = json.get("purchaseState");
            String str14 = obj17 instanceof String ? (String) obj17 : null;
            if (str14 == null || (purchaseState = PurchaseState.INSTANCE.fromJson(str14)) == null) {
                purchaseState = PurchaseState.Pending;
            }
            PurchaseState purchaseState2 = purchaseState;
            Object obj18 = json.get("purchaseToken");
            String str15 = obj18 instanceof String ? (String) obj18 : null;
            Object obj19 = json.get("quantity");
            Number number = obj19 instanceof Number ? (Number) obj19 : null;
            int intValue = number != null ? number.intValue() : 0;
            Object obj20 = json.get("signatureAndroid");
            String str16 = obj20 instanceof String ? (String) obj20 : null;
            Object obj21 = json.get("store");
            String str17 = obj21 instanceof String ? (String) obj21 : null;
            if (str17 == null || (iapStore = IapStore.INSTANCE.fromJson(str17)) == null) {
                iapStore = IapStore.Unknown;
            }
            IapStore iapStore2 = iapStore;
            Object obj22 = json.get("transactionDate");
            Number number2 = obj22 instanceof Number ? (Number) obj22 : null;
            double doubleValue = number2 != null ? number2.doubleValue() : 0.0d;
            Object obj23 = json.get("transactionId");
            return new PurchaseAndroid(bool, str, str2, str3, str5, arrayList, bool2, booleanValue, bool4, str7, str8, str10, fromJson, iapPlatform2, str13, purchaseState2, str15, intValue, str16, iapStore2, doubleValue, obj23 instanceof String ? (String) obj23 : null);
        }
    }

    @Override // dev.hyo.openiap.Purchase
    public Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[23];
        pairArr[0] = TuplesKt.to("__typename", "PurchaseAndroid");
        pairArr[1] = TuplesKt.to("autoRenewingAndroid", this.autoRenewingAndroid);
        pairArr[2] = TuplesKt.to("currentPlanId", getCurrentPlanId());
        pairArr[3] = TuplesKt.to("dataAndroid", this.dataAndroid);
        pairArr[4] = TuplesKt.to("developerPayloadAndroid", this.developerPayloadAndroid);
        pairArr[5] = TuplesKt.to("id", getId());
        pairArr[6] = TuplesKt.to("ids", getIds());
        pairArr[7] = TuplesKt.to("isAcknowledgedAndroid", this.isAcknowledgedAndroid);
        pairArr[8] = TuplesKt.to("isAutoRenewing", Boolean.valueOf(isAutoRenewing()));
        pairArr[9] = TuplesKt.to("isSuspendedAndroid", this.isSuspendedAndroid);
        pairArr[10] = TuplesKt.to("obfuscatedAccountIdAndroid", this.obfuscatedAccountIdAndroid);
        pairArr[11] = TuplesKt.to("obfuscatedProfileIdAndroid", this.obfuscatedProfileIdAndroid);
        pairArr[12] = TuplesKt.to("packageNameAndroid", this.packageNameAndroid);
        PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid = this.pendingPurchaseUpdateAndroid;
        pairArr[13] = TuplesKt.to("pendingPurchaseUpdateAndroid", pendingPurchaseUpdateAndroid != null ? pendingPurchaseUpdateAndroid.toJson() : null);
        pairArr[14] = TuplesKt.to("platform", getPlatform().toJson());
        pairArr[15] = TuplesKt.to("productId", getProductId());
        pairArr[16] = TuplesKt.to("purchaseState", getPurchaseState().toJson());
        pairArr[17] = TuplesKt.to("purchaseToken", getPurchaseToken());
        pairArr[18] = TuplesKt.to("quantity", Integer.valueOf(getQuantity()));
        pairArr[19] = TuplesKt.to("signatureAndroid", this.signatureAndroid);
        pairArr[20] = TuplesKt.to("store", getStore().toJson());
        pairArr[21] = TuplesKt.to("transactionDate", Double.valueOf(getTransactionDate()));
        pairArr[22] = TuplesKt.to("transactionId", this.transactionId);
        return MapsKt.mapOf(pairArr);
    }
}
