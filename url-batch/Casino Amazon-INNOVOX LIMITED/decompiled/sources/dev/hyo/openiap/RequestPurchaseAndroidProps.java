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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0003JZ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Ldev/hyo/openiap/RequestPurchaseAndroidProps;", "", "developerBillingOption", "Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;", "isOfferPersonalized", "", "obfuscatedAccountId", "", "obfuscatedProfileId", "offerToken", "skus", "", "<init>", "(Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDeveloperBillingOption", "()Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getObfuscatedAccountId", "()Ljava/lang/String;", "getObfuscatedProfileId", "getOfferToken", "getSkus", "()Ljava/util/List;", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ldev/hyo/openiap/RequestPurchaseAndroidProps;", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestPurchaseAndroidProps {
    private final DeveloperBillingOptionParamsAndroid developerBillingOption;
    private final Boolean isOfferPersonalized;
    private final String obfuscatedAccountId;
    private final String obfuscatedProfileId;
    private final String offerToken;
    private final List<String> skus;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ RequestPurchaseAndroidProps copy$default(RequestPurchaseAndroidProps requestPurchaseAndroidProps, DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid, Boolean bool, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            developerBillingOptionParamsAndroid = requestPurchaseAndroidProps.developerBillingOption;
        }
        if ((i & 2) != 0) {
            bool = requestPurchaseAndroidProps.isOfferPersonalized;
        }
        if ((i & 4) != 0) {
            str = requestPurchaseAndroidProps.obfuscatedAccountId;
        }
        if ((i & 8) != 0) {
            str2 = requestPurchaseAndroidProps.obfuscatedProfileId;
        }
        if ((i & 16) != 0) {
            str3 = requestPurchaseAndroidProps.offerToken;
        }
        if ((i & 32) != 0) {
            list = requestPurchaseAndroidProps.skus;
        }
        String str4 = str3;
        List list2 = list;
        return requestPurchaseAndroidProps.copy(developerBillingOptionParamsAndroid, bool, str, str2, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final DeveloperBillingOptionParamsAndroid getDeveloperBillingOption() {
        return this.developerBillingOption;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsOfferPersonalized() {
        return this.isOfferPersonalized;
    }

    /* renamed from: component3, reason: from getter */
    public final String getObfuscatedAccountId() {
        return this.obfuscatedAccountId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    public final List<String> component6() {
        return this.skus;
    }

    public final RequestPurchaseAndroidProps copy(DeveloperBillingOptionParamsAndroid developerBillingOption, Boolean isOfferPersonalized, String obfuscatedAccountId, String obfuscatedProfileId, String offerToken, List<String> skus) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        return new RequestPurchaseAndroidProps(developerBillingOption, isOfferPersonalized, obfuscatedAccountId, obfuscatedProfileId, offerToken, skus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPurchaseAndroidProps)) {
            return false;
        }
        RequestPurchaseAndroidProps requestPurchaseAndroidProps = (RequestPurchaseAndroidProps) other;
        return Intrinsics.areEqual(this.developerBillingOption, requestPurchaseAndroidProps.developerBillingOption) && Intrinsics.areEqual(this.isOfferPersonalized, requestPurchaseAndroidProps.isOfferPersonalized) && Intrinsics.areEqual(this.obfuscatedAccountId, requestPurchaseAndroidProps.obfuscatedAccountId) && Intrinsics.areEqual(this.obfuscatedProfileId, requestPurchaseAndroidProps.obfuscatedProfileId) && Intrinsics.areEqual(this.offerToken, requestPurchaseAndroidProps.offerToken) && Intrinsics.areEqual(this.skus, requestPurchaseAndroidProps.skus);
    }

    public int hashCode() {
        DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid = this.developerBillingOption;
        int hashCode = (developerBillingOptionParamsAndroid == null ? 0 : developerBillingOptionParamsAndroid.hashCode()) * 31;
        Boolean bool = this.isOfferPersonalized;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.obfuscatedAccountId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.obfuscatedProfileId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offerToken;
        return ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.skus.hashCode();
    }

    public String toString() {
        return "RequestPurchaseAndroidProps(developerBillingOption=" + this.developerBillingOption + ", isOfferPersonalized=" + this.isOfferPersonalized + ", obfuscatedAccountId=" + this.obfuscatedAccountId + ", obfuscatedProfileId=" + this.obfuscatedProfileId + ", offerToken=" + this.offerToken + ", skus=" + this.skus + ")";
    }

    public RequestPurchaseAndroidProps(DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid, Boolean bool, String str, String str2, String str3, List<String> skus) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.developerBillingOption = developerBillingOptionParamsAndroid;
        this.isOfferPersonalized = bool;
        this.obfuscatedAccountId = str;
        this.obfuscatedProfileId = str2;
        this.offerToken = str3;
        this.skus = skus;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RequestPurchaseAndroidProps(DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid, Boolean bool, String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(developerBillingOptionParamsAndroid, bool, str, str2, r7, r8);
        List list2;
        String str4;
        developerBillingOptionParamsAndroid = (i & 1) != 0 ? null : developerBillingOptionParamsAndroid;
        bool = (i & 2) != 0 ? null : bool;
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        if ((i & 16) != 0) {
            list2 = list;
            str4 = null;
        } else {
            list2 = list;
            str4 = str3;
        }
    }

    public final DeveloperBillingOptionParamsAndroid getDeveloperBillingOption() {
        return this.developerBillingOption;
    }

    public final Boolean isOfferPersonalized() {
        return this.isOfferPersonalized;
    }

    public final String getObfuscatedAccountId() {
        return this.obfuscatedAccountId;
    }

    public final String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final List<String> getSkus() {
        return this.skus;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/RequestPurchaseAndroidProps$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/RequestPurchaseAndroidProps;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RequestPurchaseAndroidProps fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("developerBillingOption");
            Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
            DeveloperBillingOptionParamsAndroid fromJson = map != null ? DeveloperBillingOptionParamsAndroid.INSTANCE.fromJson(map) : null;
            Object obj2 = json.get("isOfferPersonalized");
            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            Object obj3 = json.get("obfuscatedAccountId");
            String str = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = json.get("obfuscatedProfileId");
            String str2 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = json.get("offerToken");
            String str3 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = json.get("skus");
            List list = obj6 instanceof List ? (List) obj6 : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj7 : list) {
                    String str4 = obj7 instanceof String ? (String) obj7 : null;
                    if (str4 != null) {
                        arrayList2.add(str4);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            return new RequestPurchaseAndroidProps(fromJson, bool, str, str2, str3, arrayList);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[6];
        DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid = this.developerBillingOption;
        pairArr[0] = TuplesKt.to("developerBillingOption", developerBillingOptionParamsAndroid != null ? developerBillingOptionParamsAndroid.toJson() : null);
        pairArr[1] = TuplesKt.to("isOfferPersonalized", this.isOfferPersonalized);
        pairArr[2] = TuplesKt.to("obfuscatedAccountId", this.obfuscatedAccountId);
        pairArr[3] = TuplesKt.to("obfuscatedProfileId", this.obfuscatedProfileId);
        pairArr[4] = TuplesKt.to("offerToken", this.offerToken);
        pairArr[5] = TuplesKt.to("skus", this.skus);
        return MapsKt.mapOf(pairArr);
    }
}
