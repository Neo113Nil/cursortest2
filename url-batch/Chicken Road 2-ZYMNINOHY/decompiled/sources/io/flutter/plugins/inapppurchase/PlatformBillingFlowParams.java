package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformBillingFlowParams {
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String obfuscatedProfileId;
    private final String offerToken;
    private final String oldProduct;
    private final String product;
    private final String purchaseToken;
    private final PlatformReplacementMode replacementMode;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformBillingFlowParams fromList(List<? extends Object> list) {
            String str = (String) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.String");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformReplacementMode");
            return new PlatformBillingFlowParams(str, (PlatformReplacementMode) obj, (String) list.get(2), (String) list.get(3), (String) list.get(4), (String) list.get(5), (String) list.get(6));
        }

        private Companion() {
        }
    }

    public PlatformBillingFlowParams(String product, PlatformReplacementMode replacementMode, String str, String str2, String str3, String str4, String str5) {
        i.e(product, "product");
        i.e(replacementMode, "replacementMode");
        this.product = product;
        this.replacementMode = replacementMode;
        this.offerToken = str;
        this.accountId = str2;
        this.obfuscatedProfileId = str3;
        this.oldProduct = str4;
        this.purchaseToken = str5;
    }

    public static /* synthetic */ PlatformBillingFlowParams copy$default(PlatformBillingFlowParams platformBillingFlowParams, String str, PlatformReplacementMode platformReplacementMode, String str2, String str3, String str4, String str5, String str6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = platformBillingFlowParams.product;
        }
        if ((i4 & 2) != 0) {
            platformReplacementMode = platformBillingFlowParams.replacementMode;
        }
        if ((i4 & 4) != 0) {
            str2 = platformBillingFlowParams.offerToken;
        }
        if ((i4 & 8) != 0) {
            str3 = platformBillingFlowParams.accountId;
        }
        if ((i4 & 16) != 0) {
            str4 = platformBillingFlowParams.obfuscatedProfileId;
        }
        if ((i4 & 32) != 0) {
            str5 = platformBillingFlowParams.oldProduct;
        }
        if ((i4 & 64) != 0) {
            str6 = platformBillingFlowParams.purchaseToken;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return platformBillingFlowParams.copy(str, platformReplacementMode, str10, str3, str9, str7, str8);
    }

    public final String component1() {
        return this.product;
    }

    public final PlatformReplacementMode component2() {
        return this.replacementMode;
    }

    public final String component3() {
        return this.offerToken;
    }

    public final String component4() {
        return this.accountId;
    }

    public final String component5() {
        return this.obfuscatedProfileId;
    }

    public final String component6() {
        return this.oldProduct;
    }

    public final String component7() {
        return this.purchaseToken;
    }

    public final PlatformBillingFlowParams copy(String product, PlatformReplacementMode replacementMode, String str, String str2, String str3, String str4, String str5) {
        i.e(product, "product");
        i.e(replacementMode, "replacementMode");
        return new PlatformBillingFlowParams(product, replacementMode, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformBillingFlowParams.class)) {
            if (this == obj) {
                return true;
            }
            PlatformBillingFlowParams platformBillingFlowParams = (PlatformBillingFlowParams) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.product, platformBillingFlowParams.product) && messagesPigeonUtils.deepEquals(this.replacementMode, platformBillingFlowParams.replacementMode) && messagesPigeonUtils.deepEquals(this.offerToken, platformBillingFlowParams.offerToken) && messagesPigeonUtils.deepEquals(this.accountId, platformBillingFlowParams.accountId) && messagesPigeonUtils.deepEquals(this.obfuscatedProfileId, platformBillingFlowParams.obfuscatedProfileId) && messagesPigeonUtils.deepEquals(this.oldProduct, platformBillingFlowParams.oldProduct) && messagesPigeonUtils.deepEquals(this.purchaseToken, platformBillingFlowParams.purchaseToken)) {
                return true;
            }
        }
        return false;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final String getOldProduct() {
        return this.oldProduct;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PlatformReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public int hashCode() {
        int hashCode = PlatformBillingFlowParams.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((((((((((hashCode + messagesPigeonUtils.deepHash(this.product)) * 31) + messagesPigeonUtils.deepHash(this.replacementMode)) * 31) + messagesPigeonUtils.deepHash(this.offerToken)) * 31) + messagesPigeonUtils.deepHash(this.accountId)) * 31) + messagesPigeonUtils.deepHash(this.obfuscatedProfileId)) * 31) + messagesPigeonUtils.deepHash(this.oldProduct)) * 31) + messagesPigeonUtils.deepHash(this.purchaseToken);
    }

    public final List<Object> toList() {
        return j.W(this.product, this.replacementMode, this.offerToken, this.accountId, this.obfuscatedProfileId, this.oldProduct, this.purchaseToken);
    }

    public String toString() {
        String str = this.product;
        PlatformReplacementMode platformReplacementMode = this.replacementMode;
        String str2 = this.offerToken;
        String str3 = this.accountId;
        String str4 = this.obfuscatedProfileId;
        String str5 = this.oldProduct;
        String str6 = this.purchaseToken;
        StringBuilder sb = new StringBuilder("PlatformBillingFlowParams(product=");
        sb.append(str);
        sb.append(", replacementMode=");
        sb.append(platformReplacementMode);
        sb.append(", offerToken=");
        sb.append(str2);
        sb.append(", accountId=");
        sb.append(str3);
        sb.append(", obfuscatedProfileId=");
        sb.append(str4);
        sb.append(", oldProduct=");
        sb.append(str5);
        sb.append(", purchaseToken=");
        return AbstractC0005f.q(sb, str6, ")");
    }

    public /* synthetic */ PlatformBillingFlowParams(String str, PlatformReplacementMode platformReplacementMode, String str2, String str3, String str4, String str5, String str6, int i4, kotlin.jvm.internal.e eVar) {
        this(str, platformReplacementMode, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? null : str4, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? null : str6);
    }
}
