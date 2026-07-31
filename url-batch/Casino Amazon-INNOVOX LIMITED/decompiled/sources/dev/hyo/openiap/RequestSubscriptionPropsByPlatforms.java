package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001f"}, d2 = {"Ldev/hyo/openiap/RequestSubscriptionPropsByPlatforms;", "", "android", "Ldev/hyo/openiap/RequestSubscriptionAndroidProps;", "apple", "Ldev/hyo/openiap/RequestSubscriptionIosProps;", "google", "ios", "<init>", "(Ldev/hyo/openiap/RequestSubscriptionAndroidProps;Ldev/hyo/openiap/RequestSubscriptionIosProps;Ldev/hyo/openiap/RequestSubscriptionAndroidProps;Ldev/hyo/openiap/RequestSubscriptionIosProps;)V", "getAndroid", "()Ldev/hyo/openiap/RequestSubscriptionAndroidProps;", "getApple", "()Ldev/hyo/openiap/RequestSubscriptionIosProps;", "getGoogle", "getIos", "toJson", "", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestSubscriptionPropsByPlatforms {
    private final RequestSubscriptionAndroidProps android;
    private final RequestSubscriptionIosProps apple;
    private final RequestSubscriptionAndroidProps google;
    private final RequestSubscriptionIosProps ios;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RequestSubscriptionPropsByPlatforms() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RequestSubscriptionPropsByPlatforms copy$default(RequestSubscriptionPropsByPlatforms requestSubscriptionPropsByPlatforms, RequestSubscriptionAndroidProps requestSubscriptionAndroidProps, RequestSubscriptionIosProps requestSubscriptionIosProps, RequestSubscriptionAndroidProps requestSubscriptionAndroidProps2, RequestSubscriptionIosProps requestSubscriptionIosProps2, int i, Object obj) {
        if ((i & 1) != 0) {
            requestSubscriptionAndroidProps = requestSubscriptionPropsByPlatforms.android;
        }
        if ((i & 2) != 0) {
            requestSubscriptionIosProps = requestSubscriptionPropsByPlatforms.apple;
        }
        if ((i & 4) != 0) {
            requestSubscriptionAndroidProps2 = requestSubscriptionPropsByPlatforms.google;
        }
        if ((i & 8) != 0) {
            requestSubscriptionIosProps2 = requestSubscriptionPropsByPlatforms.ios;
        }
        return requestSubscriptionPropsByPlatforms.copy(requestSubscriptionAndroidProps, requestSubscriptionIosProps, requestSubscriptionAndroidProps2, requestSubscriptionIosProps2);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestSubscriptionAndroidProps getAndroid() {
        return this.android;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestSubscriptionIosProps getApple() {
        return this.apple;
    }

    /* renamed from: component3, reason: from getter */
    public final RequestSubscriptionAndroidProps getGoogle() {
        return this.google;
    }

    /* renamed from: component4, reason: from getter */
    public final RequestSubscriptionIosProps getIos() {
        return this.ios;
    }

    public final RequestSubscriptionPropsByPlatforms copy(RequestSubscriptionAndroidProps android2, RequestSubscriptionIosProps apple, RequestSubscriptionAndroidProps google, RequestSubscriptionIosProps ios) {
        return new RequestSubscriptionPropsByPlatforms(android2, apple, google, ios);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestSubscriptionPropsByPlatforms)) {
            return false;
        }
        RequestSubscriptionPropsByPlatforms requestSubscriptionPropsByPlatforms = (RequestSubscriptionPropsByPlatforms) other;
        return Intrinsics.areEqual(this.android, requestSubscriptionPropsByPlatforms.android) && Intrinsics.areEqual(this.apple, requestSubscriptionPropsByPlatforms.apple) && Intrinsics.areEqual(this.google, requestSubscriptionPropsByPlatforms.google) && Intrinsics.areEqual(this.ios, requestSubscriptionPropsByPlatforms.ios);
    }

    public int hashCode() {
        RequestSubscriptionAndroidProps requestSubscriptionAndroidProps = this.android;
        int hashCode = (requestSubscriptionAndroidProps == null ? 0 : requestSubscriptionAndroidProps.hashCode()) * 31;
        RequestSubscriptionIosProps requestSubscriptionIosProps = this.apple;
        int hashCode2 = (hashCode + (requestSubscriptionIosProps == null ? 0 : requestSubscriptionIosProps.hashCode())) * 31;
        RequestSubscriptionAndroidProps requestSubscriptionAndroidProps2 = this.google;
        int hashCode3 = (hashCode2 + (requestSubscriptionAndroidProps2 == null ? 0 : requestSubscriptionAndroidProps2.hashCode())) * 31;
        RequestSubscriptionIosProps requestSubscriptionIosProps2 = this.ios;
        return hashCode3 + (requestSubscriptionIosProps2 != null ? requestSubscriptionIosProps2.hashCode() : 0);
    }

    public String toString() {
        return "RequestSubscriptionPropsByPlatforms(android=" + this.android + ", apple=" + this.apple + ", google=" + this.google + ", ios=" + this.ios + ")";
    }

    public RequestSubscriptionPropsByPlatforms(RequestSubscriptionAndroidProps requestSubscriptionAndroidProps, RequestSubscriptionIosProps requestSubscriptionIosProps, RequestSubscriptionAndroidProps requestSubscriptionAndroidProps2, RequestSubscriptionIosProps requestSubscriptionIosProps2) {
        this.android = requestSubscriptionAndroidProps;
        this.apple = requestSubscriptionIosProps;
        this.google = requestSubscriptionAndroidProps2;
        this.ios = requestSubscriptionIosProps2;
    }

    public /* synthetic */ RequestSubscriptionPropsByPlatforms(RequestSubscriptionAndroidProps requestSubscriptionAndroidProps, RequestSubscriptionIosProps requestSubscriptionIosProps, RequestSubscriptionAndroidProps requestSubscriptionAndroidProps2, RequestSubscriptionIosProps requestSubscriptionIosProps2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestSubscriptionAndroidProps, (i & 2) != 0 ? null : requestSubscriptionIosProps, (i & 4) != 0 ? null : requestSubscriptionAndroidProps2, (i & 8) != 0 ? null : requestSubscriptionIosProps2);
    }

    public final RequestSubscriptionAndroidProps getAndroid() {
        return this.android;
    }

    public final RequestSubscriptionIosProps getApple() {
        return this.apple;
    }

    public final RequestSubscriptionAndroidProps getGoogle() {
        return this.google;
    }

    public final RequestSubscriptionIosProps getIos() {
        return this.ios;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/RequestSubscriptionPropsByPlatforms$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/RequestSubscriptionPropsByPlatforms;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RequestSubscriptionPropsByPlatforms fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("android");
            Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
            RequestSubscriptionAndroidProps fromJson = map != null ? RequestSubscriptionAndroidProps.INSTANCE.fromJson(map) : null;
            Object obj2 = json.get("apple");
            Map<String, ? extends Object> map2 = obj2 instanceof Map ? (Map) obj2 : null;
            RequestSubscriptionIosProps fromJson2 = map2 != null ? RequestSubscriptionIosProps.INSTANCE.fromJson(map2) : null;
            Object obj3 = json.get("google");
            Map<String, ? extends Object> map3 = obj3 instanceof Map ? (Map) obj3 : null;
            RequestSubscriptionAndroidProps fromJson3 = map3 != null ? RequestSubscriptionAndroidProps.INSTANCE.fromJson(map3) : null;
            Object obj4 = json.get("ios");
            Map<String, ? extends Object> map4 = obj4 instanceof Map ? (Map) obj4 : null;
            return new RequestSubscriptionPropsByPlatforms(fromJson, fromJson2, fromJson3, map4 != null ? RequestSubscriptionIosProps.INSTANCE.fromJson(map4) : null);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[4];
        RequestSubscriptionAndroidProps requestSubscriptionAndroidProps = this.android;
        pairArr[0] = TuplesKt.to("android", requestSubscriptionAndroidProps != null ? requestSubscriptionAndroidProps.toJson() : null);
        RequestSubscriptionIosProps requestSubscriptionIosProps = this.apple;
        pairArr[1] = TuplesKt.to("apple", requestSubscriptionIosProps != null ? requestSubscriptionIosProps.toJson() : null);
        RequestSubscriptionAndroidProps requestSubscriptionAndroidProps2 = this.google;
        pairArr[2] = TuplesKt.to("google", requestSubscriptionAndroidProps2 != null ? requestSubscriptionAndroidProps2.toJson() : null);
        RequestSubscriptionIosProps requestSubscriptionIosProps2 = this.ios;
        pairArr[3] = TuplesKt.to("ios", requestSubscriptionIosProps2 != null ? requestSubscriptionIosProps2.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
