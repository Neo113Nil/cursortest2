package dev.hyo.openiap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0013HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseWithProviderResult;", "", "errors", "", "Ldev/hyo/openiap/VerifyPurchaseWithProviderError;", "iapkit", "Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitResult;", "provider", "Ldev/hyo/openiap/PurchaseVerificationProvider;", "<init>", "(Ljava/util/List;Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitResult;Ldev/hyo/openiap/PurchaseVerificationProvider;)V", "getErrors", "()Ljava/util/List;", "getIapkit", "()Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitResult;", "getProvider", "()Ldev/hyo/openiap/PurchaseVerificationProvider;", "toJson", "", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerifyPurchaseWithProviderResult {
    private final List<VerifyPurchaseWithProviderError> errors;
    private final RequestVerifyPurchaseWithIapkitResult iapkit;
    private final PurchaseVerificationProvider provider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerifyPurchaseWithProviderResult copy$default(VerifyPurchaseWithProviderResult verifyPurchaseWithProviderResult, List list, RequestVerifyPurchaseWithIapkitResult requestVerifyPurchaseWithIapkitResult, PurchaseVerificationProvider purchaseVerificationProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            list = verifyPurchaseWithProviderResult.errors;
        }
        if ((i & 2) != 0) {
            requestVerifyPurchaseWithIapkitResult = verifyPurchaseWithProviderResult.iapkit;
        }
        if ((i & 4) != 0) {
            purchaseVerificationProvider = verifyPurchaseWithProviderResult.provider;
        }
        return verifyPurchaseWithProviderResult.copy(list, requestVerifyPurchaseWithIapkitResult, purchaseVerificationProvider);
    }

    public final List<VerifyPurchaseWithProviderError> component1() {
        return this.errors;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestVerifyPurchaseWithIapkitResult getIapkit() {
        return this.iapkit;
    }

    /* renamed from: component3, reason: from getter */
    public final PurchaseVerificationProvider getProvider() {
        return this.provider;
    }

    public final VerifyPurchaseWithProviderResult copy(List<VerifyPurchaseWithProviderError> errors, RequestVerifyPurchaseWithIapkitResult iapkit, PurchaseVerificationProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new VerifyPurchaseWithProviderResult(errors, iapkit, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPurchaseWithProviderResult)) {
            return false;
        }
        VerifyPurchaseWithProviderResult verifyPurchaseWithProviderResult = (VerifyPurchaseWithProviderResult) other;
        return Intrinsics.areEqual(this.errors, verifyPurchaseWithProviderResult.errors) && Intrinsics.areEqual(this.iapkit, verifyPurchaseWithProviderResult.iapkit) && this.provider == verifyPurchaseWithProviderResult.provider;
    }

    public int hashCode() {
        List<VerifyPurchaseWithProviderError> list = this.errors;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        RequestVerifyPurchaseWithIapkitResult requestVerifyPurchaseWithIapkitResult = this.iapkit;
        return ((hashCode + (requestVerifyPurchaseWithIapkitResult != null ? requestVerifyPurchaseWithIapkitResult.hashCode() : 0)) * 31) + this.provider.hashCode();
    }

    public String toString() {
        return "VerifyPurchaseWithProviderResult(errors=" + this.errors + ", iapkit=" + this.iapkit + ", provider=" + this.provider + ")";
    }

    public VerifyPurchaseWithProviderResult(List<VerifyPurchaseWithProviderError> list, RequestVerifyPurchaseWithIapkitResult requestVerifyPurchaseWithIapkitResult, PurchaseVerificationProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.errors = list;
        this.iapkit = requestVerifyPurchaseWithIapkitResult;
        this.provider = provider;
    }

    public /* synthetic */ VerifyPurchaseWithProviderResult(List list, RequestVerifyPurchaseWithIapkitResult requestVerifyPurchaseWithIapkitResult, PurchaseVerificationProvider purchaseVerificationProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : requestVerifyPurchaseWithIapkitResult, purchaseVerificationProvider);
    }

    public final List<VerifyPurchaseWithProviderError> getErrors() {
        return this.errors;
    }

    public final RequestVerifyPurchaseWithIapkitResult getIapkit() {
        return this.iapkit;
    }

    public final PurchaseVerificationProvider getProvider() {
        return this.provider;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseWithProviderResult$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/VerifyPurchaseWithProviderResult;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VerifyPurchaseWithProviderResult fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            PurchaseVerificationProvider purchaseVerificationProvider;
            VerifyPurchaseWithProviderError fromJson;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("errors");
            List list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    Map<String, ? extends Object> map = obj2 instanceof Map ? (Map) obj2 : null;
                    if (map == null || (fromJson = VerifyPurchaseWithProviderError.INSTANCE.fromJson(map)) == null) {
                        throw new IllegalArgumentException("Missing required object for VerifyPurchaseWithProviderError");
                    }
                    if (fromJson != null) {
                        arrayList2.add(fromJson);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Object obj3 = json.get("iapkit");
            Map<String, ? extends Object> map2 = obj3 instanceof Map ? (Map) obj3 : null;
            RequestVerifyPurchaseWithIapkitResult fromJson2 = map2 != null ? RequestVerifyPurchaseWithIapkitResult.INSTANCE.fromJson(map2) : null;
            Object obj4 = json.get("provider");
            String str = obj4 instanceof String ? (String) obj4 : null;
            if (str == null || (purchaseVerificationProvider = PurchaseVerificationProvider.INSTANCE.fromJson(str)) == null) {
                purchaseVerificationProvider = PurchaseVerificationProvider.Iapkit;
            }
            return new VerifyPurchaseWithProviderResult(arrayList, fromJson2, purchaseVerificationProvider);
        }
    }

    public final Map<String, Object> toJson() {
        ArrayList arrayList;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("__typename", "VerifyPurchaseWithProviderResult");
        List<VerifyPurchaseWithProviderError> list = this.errors;
        if (list != null) {
            List<VerifyPurchaseWithProviderError> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((VerifyPurchaseWithProviderError) it.next()).toJson());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        pairArr[1] = TuplesKt.to("errors", arrayList);
        RequestVerifyPurchaseWithIapkitResult requestVerifyPurchaseWithIapkitResult = this.iapkit;
        pairArr[2] = TuplesKt.to("iapkit", requestVerifyPurchaseWithIapkitResult != null ? requestVerifyPurchaseWithIapkitResult.toJson() : null);
        pairArr[3] = TuplesKt.to("provider", this.provider.toJson());
        return MapsKt.mapOf(pairArr);
    }
}
