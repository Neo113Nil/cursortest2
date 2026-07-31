package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitProps;", "", "apiKey", "", "apple", "Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitAppleProps;", "google", "Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitGoogleProps;", "<init>", "(Ljava/lang/String;Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitAppleProps;Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitGoogleProps;)V", "getApiKey", "()Ljava/lang/String;", "getApple", "()Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitAppleProps;", "getGoogle", "()Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitGoogleProps;", "toJson", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestVerifyPurchaseWithIapkitProps {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String apiKey;
    private final RequestVerifyPurchaseWithIapkitAppleProps apple;
    private final RequestVerifyPurchaseWithIapkitGoogleProps google;

    public RequestVerifyPurchaseWithIapkitProps() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RequestVerifyPurchaseWithIapkitProps copy$default(RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps, String str, RequestVerifyPurchaseWithIapkitAppleProps requestVerifyPurchaseWithIapkitAppleProps, RequestVerifyPurchaseWithIapkitGoogleProps requestVerifyPurchaseWithIapkitGoogleProps, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestVerifyPurchaseWithIapkitProps.apiKey;
        }
        if ((i & 2) != 0) {
            requestVerifyPurchaseWithIapkitAppleProps = requestVerifyPurchaseWithIapkitProps.apple;
        }
        if ((i & 4) != 0) {
            requestVerifyPurchaseWithIapkitGoogleProps = requestVerifyPurchaseWithIapkitProps.google;
        }
        return requestVerifyPurchaseWithIapkitProps.copy(str, requestVerifyPurchaseWithIapkitAppleProps, requestVerifyPurchaseWithIapkitGoogleProps);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestVerifyPurchaseWithIapkitAppleProps getApple() {
        return this.apple;
    }

    /* renamed from: component3, reason: from getter */
    public final RequestVerifyPurchaseWithIapkitGoogleProps getGoogle() {
        return this.google;
    }

    public final RequestVerifyPurchaseWithIapkitProps copy(String apiKey, RequestVerifyPurchaseWithIapkitAppleProps apple, RequestVerifyPurchaseWithIapkitGoogleProps google) {
        return new RequestVerifyPurchaseWithIapkitProps(apiKey, apple, google);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestVerifyPurchaseWithIapkitProps)) {
            return false;
        }
        RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps = (RequestVerifyPurchaseWithIapkitProps) other;
        return Intrinsics.areEqual(this.apiKey, requestVerifyPurchaseWithIapkitProps.apiKey) && Intrinsics.areEqual(this.apple, requestVerifyPurchaseWithIapkitProps.apple) && Intrinsics.areEqual(this.google, requestVerifyPurchaseWithIapkitProps.google);
    }

    public int hashCode() {
        String str = this.apiKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        RequestVerifyPurchaseWithIapkitAppleProps requestVerifyPurchaseWithIapkitAppleProps = this.apple;
        int hashCode2 = (hashCode + (requestVerifyPurchaseWithIapkitAppleProps == null ? 0 : requestVerifyPurchaseWithIapkitAppleProps.hashCode())) * 31;
        RequestVerifyPurchaseWithIapkitGoogleProps requestVerifyPurchaseWithIapkitGoogleProps = this.google;
        return hashCode2 + (requestVerifyPurchaseWithIapkitGoogleProps != null ? requestVerifyPurchaseWithIapkitGoogleProps.hashCode() : 0);
    }

    public String toString() {
        return "RequestVerifyPurchaseWithIapkitProps(apiKey=" + this.apiKey + ", apple=" + this.apple + ", google=" + this.google + ")";
    }

    public RequestVerifyPurchaseWithIapkitProps(String str, RequestVerifyPurchaseWithIapkitAppleProps requestVerifyPurchaseWithIapkitAppleProps, RequestVerifyPurchaseWithIapkitGoogleProps requestVerifyPurchaseWithIapkitGoogleProps) {
        this.apiKey = str;
        this.apple = requestVerifyPurchaseWithIapkitAppleProps;
        this.google = requestVerifyPurchaseWithIapkitGoogleProps;
    }

    public /* synthetic */ RequestVerifyPurchaseWithIapkitProps(String str, RequestVerifyPurchaseWithIapkitAppleProps requestVerifyPurchaseWithIapkitAppleProps, RequestVerifyPurchaseWithIapkitGoogleProps requestVerifyPurchaseWithIapkitGoogleProps, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : requestVerifyPurchaseWithIapkitAppleProps, (i & 4) != 0 ? null : requestVerifyPurchaseWithIapkitGoogleProps);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final RequestVerifyPurchaseWithIapkitAppleProps getApple() {
        return this.apple;
    }

    public final RequestVerifyPurchaseWithIapkitGoogleProps getGoogle() {
        return this.google;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitProps$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitProps;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RequestVerifyPurchaseWithIapkitProps fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("apiKey");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("apple");
            Map<String, ? extends Object> map = obj2 instanceof Map ? (Map) obj2 : null;
            RequestVerifyPurchaseWithIapkitAppleProps fromJson = map != null ? RequestVerifyPurchaseWithIapkitAppleProps.INSTANCE.fromJson(map) : null;
            Object obj3 = json.get("google");
            Map<String, ? extends Object> map2 = obj3 instanceof Map ? (Map) obj3 : null;
            return new RequestVerifyPurchaseWithIapkitProps(str, fromJson, map2 != null ? RequestVerifyPurchaseWithIapkitGoogleProps.INSTANCE.fromJson(map2) : null);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("apiKey", this.apiKey);
        RequestVerifyPurchaseWithIapkitAppleProps requestVerifyPurchaseWithIapkitAppleProps = this.apple;
        pairArr[1] = TuplesKt.to("apple", requestVerifyPurchaseWithIapkitAppleProps != null ? requestVerifyPurchaseWithIapkitAppleProps.toJson() : null);
        RequestVerifyPurchaseWithIapkitGoogleProps requestVerifyPurchaseWithIapkitGoogleProps = this.google;
        pairArr[2] = TuplesKt.to("google", requestVerifyPurchaseWithIapkitGoogleProps != null ? requestVerifyPurchaseWithIapkitGoogleProps.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
