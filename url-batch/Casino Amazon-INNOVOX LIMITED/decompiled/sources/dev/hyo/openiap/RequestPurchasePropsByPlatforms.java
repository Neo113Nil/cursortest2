package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001f"}, d2 = {"Ldev/hyo/openiap/RequestPurchasePropsByPlatforms;", "", "android", "Ldev/hyo/openiap/RequestPurchaseAndroidProps;", "apple", "Ldev/hyo/openiap/RequestPurchaseIosProps;", "google", "ios", "<init>", "(Ldev/hyo/openiap/RequestPurchaseAndroidProps;Ldev/hyo/openiap/RequestPurchaseIosProps;Ldev/hyo/openiap/RequestPurchaseAndroidProps;Ldev/hyo/openiap/RequestPurchaseIosProps;)V", "getAndroid", "()Ldev/hyo/openiap/RequestPurchaseAndroidProps;", "getApple", "()Ldev/hyo/openiap/RequestPurchaseIosProps;", "getGoogle", "getIos", "toJson", "", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestPurchasePropsByPlatforms {
    private final RequestPurchaseAndroidProps android;
    private final RequestPurchaseIosProps apple;
    private final RequestPurchaseAndroidProps google;
    private final RequestPurchaseIosProps ios;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RequestPurchasePropsByPlatforms() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RequestPurchasePropsByPlatforms copy$default(RequestPurchasePropsByPlatforms requestPurchasePropsByPlatforms, RequestPurchaseAndroidProps requestPurchaseAndroidProps, RequestPurchaseIosProps requestPurchaseIosProps, RequestPurchaseAndroidProps requestPurchaseAndroidProps2, RequestPurchaseIosProps requestPurchaseIosProps2, int i, Object obj) {
        if ((i & 1) != 0) {
            requestPurchaseAndroidProps = requestPurchasePropsByPlatforms.android;
        }
        if ((i & 2) != 0) {
            requestPurchaseIosProps = requestPurchasePropsByPlatforms.apple;
        }
        if ((i & 4) != 0) {
            requestPurchaseAndroidProps2 = requestPurchasePropsByPlatforms.google;
        }
        if ((i & 8) != 0) {
            requestPurchaseIosProps2 = requestPurchasePropsByPlatforms.ios;
        }
        return requestPurchasePropsByPlatforms.copy(requestPurchaseAndroidProps, requestPurchaseIosProps, requestPurchaseAndroidProps2, requestPurchaseIosProps2);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestPurchaseAndroidProps getAndroid() {
        return this.android;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestPurchaseIosProps getApple() {
        return this.apple;
    }

    /* renamed from: component3, reason: from getter */
    public final RequestPurchaseAndroidProps getGoogle() {
        return this.google;
    }

    /* renamed from: component4, reason: from getter */
    public final RequestPurchaseIosProps getIos() {
        return this.ios;
    }

    public final RequestPurchasePropsByPlatforms copy(RequestPurchaseAndroidProps android2, RequestPurchaseIosProps apple, RequestPurchaseAndroidProps google, RequestPurchaseIosProps ios) {
        return new RequestPurchasePropsByPlatforms(android2, apple, google, ios);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPurchasePropsByPlatforms)) {
            return false;
        }
        RequestPurchasePropsByPlatforms requestPurchasePropsByPlatforms = (RequestPurchasePropsByPlatforms) other;
        return Intrinsics.areEqual(this.android, requestPurchasePropsByPlatforms.android) && Intrinsics.areEqual(this.apple, requestPurchasePropsByPlatforms.apple) && Intrinsics.areEqual(this.google, requestPurchasePropsByPlatforms.google) && Intrinsics.areEqual(this.ios, requestPurchasePropsByPlatforms.ios);
    }

    public int hashCode() {
        RequestPurchaseAndroidProps requestPurchaseAndroidProps = this.android;
        int hashCode = (requestPurchaseAndroidProps == null ? 0 : requestPurchaseAndroidProps.hashCode()) * 31;
        RequestPurchaseIosProps requestPurchaseIosProps = this.apple;
        int hashCode2 = (hashCode + (requestPurchaseIosProps == null ? 0 : requestPurchaseIosProps.hashCode())) * 31;
        RequestPurchaseAndroidProps requestPurchaseAndroidProps2 = this.google;
        int hashCode3 = (hashCode2 + (requestPurchaseAndroidProps2 == null ? 0 : requestPurchaseAndroidProps2.hashCode())) * 31;
        RequestPurchaseIosProps requestPurchaseIosProps2 = this.ios;
        return hashCode3 + (requestPurchaseIosProps2 != null ? requestPurchaseIosProps2.hashCode() : 0);
    }

    public String toString() {
        return "RequestPurchasePropsByPlatforms(android=" + this.android + ", apple=" + this.apple + ", google=" + this.google + ", ios=" + this.ios + ")";
    }

    public RequestPurchasePropsByPlatforms(RequestPurchaseAndroidProps requestPurchaseAndroidProps, RequestPurchaseIosProps requestPurchaseIosProps, RequestPurchaseAndroidProps requestPurchaseAndroidProps2, RequestPurchaseIosProps requestPurchaseIosProps2) {
        this.android = requestPurchaseAndroidProps;
        this.apple = requestPurchaseIosProps;
        this.google = requestPurchaseAndroidProps2;
        this.ios = requestPurchaseIosProps2;
    }

    public /* synthetic */ RequestPurchasePropsByPlatforms(RequestPurchaseAndroidProps requestPurchaseAndroidProps, RequestPurchaseIosProps requestPurchaseIosProps, RequestPurchaseAndroidProps requestPurchaseAndroidProps2, RequestPurchaseIosProps requestPurchaseIosProps2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestPurchaseAndroidProps, (i & 2) != 0 ? null : requestPurchaseIosProps, (i & 4) != 0 ? null : requestPurchaseAndroidProps2, (i & 8) != 0 ? null : requestPurchaseIosProps2);
    }

    public final RequestPurchaseAndroidProps getAndroid() {
        return this.android;
    }

    public final RequestPurchaseIosProps getApple() {
        return this.apple;
    }

    public final RequestPurchaseAndroidProps getGoogle() {
        return this.google;
    }

    public final RequestPurchaseIosProps getIos() {
        return this.ios;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/RequestPurchasePropsByPlatforms$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/RequestPurchasePropsByPlatforms;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RequestPurchasePropsByPlatforms fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("android");
            Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
            RequestPurchaseAndroidProps fromJson = map != null ? RequestPurchaseAndroidProps.INSTANCE.fromJson(map) : null;
            Object obj2 = json.get("apple");
            Map<String, ? extends Object> map2 = obj2 instanceof Map ? (Map) obj2 : null;
            RequestPurchaseIosProps fromJson2 = map2 != null ? RequestPurchaseIosProps.INSTANCE.fromJson(map2) : null;
            Object obj3 = json.get("google");
            Map<String, ? extends Object> map3 = obj3 instanceof Map ? (Map) obj3 : null;
            RequestPurchaseAndroidProps fromJson3 = map3 != null ? RequestPurchaseAndroidProps.INSTANCE.fromJson(map3) : null;
            Object obj4 = json.get("ios");
            Map<String, ? extends Object> map4 = obj4 instanceof Map ? (Map) obj4 : null;
            return new RequestPurchasePropsByPlatforms(fromJson, fromJson2, fromJson3, map4 != null ? RequestPurchaseIosProps.INSTANCE.fromJson(map4) : null);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[4];
        RequestPurchaseAndroidProps requestPurchaseAndroidProps = this.android;
        pairArr[0] = TuplesKt.to("android", requestPurchaseAndroidProps != null ? requestPurchaseAndroidProps.toJson() : null);
        RequestPurchaseIosProps requestPurchaseIosProps = this.apple;
        pairArr[1] = TuplesKt.to("apple", requestPurchaseIosProps != null ? requestPurchaseIosProps.toJson() : null);
        RequestPurchaseAndroidProps requestPurchaseAndroidProps2 = this.google;
        pairArr[2] = TuplesKt.to("google", requestPurchaseAndroidProps2 != null ? requestPurchaseAndroidProps2.toJson() : null);
        RequestPurchaseIosProps requestPurchaseIosProps2 = this.ios;
        pairArr[3] = TuplesKt.to("ios", requestPurchaseIosProps2 != null ? requestPurchaseIosProps2.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
