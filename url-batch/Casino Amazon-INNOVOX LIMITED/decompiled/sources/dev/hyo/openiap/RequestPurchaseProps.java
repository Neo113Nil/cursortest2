package dev.hyo.openiap;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Ldev/hyo/openiap/RequestPurchaseProps;", "", "request", "Ldev/hyo/openiap/RequestPurchaseProps$Request;", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/ProductQueryType;", "useAlternativeBilling", "", "<init>", "(Ldev/hyo/openiap/RequestPurchaseProps$Request;Ldev/hyo/openiap/ProductQueryType;Ljava/lang/Boolean;)V", "getRequest", "()Ldev/hyo/openiap/RequestPurchaseProps$Request;", "getType", "()Ldev/hyo/openiap/ProductQueryType;", "getUseAlternativeBilling", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "toJson", "", "", "component1", "component2", "component3", "copy", "(Ldev/hyo/openiap/RequestPurchaseProps$Request;Ldev/hyo/openiap/ProductQueryType;Ljava/lang/Boolean;)Ldev/hyo/openiap/RequestPurchaseProps;", "equals", "other", "hashCode", "", "toString", "Companion", "Request", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestPurchaseProps {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Request request;
    private final ProductQueryType type;
    private final Boolean useAlternativeBilling;

    public static /* synthetic */ RequestPurchaseProps copy$default(RequestPurchaseProps requestPurchaseProps, Request request, ProductQueryType productQueryType, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            request = requestPurchaseProps.request;
        }
        if ((i & 2) != 0) {
            productQueryType = requestPurchaseProps.type;
        }
        if ((i & 4) != 0) {
            bool = requestPurchaseProps.useAlternativeBilling;
        }
        return requestPurchaseProps.copy(request, productQueryType, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductQueryType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getUseAlternativeBilling() {
        return this.useAlternativeBilling;
    }

    public final RequestPurchaseProps copy(Request request, ProductQueryType type, Boolean useAlternativeBilling) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(type, "type");
        return new RequestPurchaseProps(request, type, useAlternativeBilling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPurchaseProps)) {
            return false;
        }
        RequestPurchaseProps requestPurchaseProps = (RequestPurchaseProps) other;
        return Intrinsics.areEqual(this.request, requestPurchaseProps.request) && this.type == requestPurchaseProps.type && Intrinsics.areEqual(this.useAlternativeBilling, requestPurchaseProps.useAlternativeBilling);
    }

    public int hashCode() {
        int hashCode = ((this.request.hashCode() * 31) + this.type.hashCode()) * 31;
        Boolean bool = this.useAlternativeBilling;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "RequestPurchaseProps(request=" + this.request + ", type=" + this.type + ", useAlternativeBilling=" + this.useAlternativeBilling + ")";
    }

    public RequestPurchaseProps(Request request, ProductQueryType type, Boolean bool) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(type, "type");
        this.request = request;
        this.type = type;
        this.useAlternativeBilling = bool;
        if (request instanceof Request.Purchase) {
            if (type != ProductQueryType.InApp) {
                throw new IllegalArgumentException("type must be IN_APP when request is purchase".toString());
            }
        } else {
            if (!(request instanceof Request.Subscription)) {
                throw new NoWhenBranchMatchedException();
            }
            if (type != ProductQueryType.Subs) {
                throw new IllegalArgumentException("type must be SUBS when request is subscription".toString());
            }
        }
    }

    public /* synthetic */ RequestPurchaseProps(Request request, ProductQueryType productQueryType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, productQueryType, (i & 4) != 0 ? null : bool);
    }

    public final Request getRequest() {
        return this.request;
    }

    public final ProductQueryType getType() {
        return this.type;
    }

    public final Boolean getUseAlternativeBilling() {
        return this.useAlternativeBilling;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/RequestPurchaseProps$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/RequestPurchaseProps;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RequestPurchaseProps fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String str = (String) json.get(WebViewManager.EVENT_TYPE_KEY);
            ProductQueryType fromJson = str != null ? ProductQueryType.INSTANCE.fromJson(str) : null;
            Boolean bool = (Boolean) json.get("useAlternativeBilling");
            Map<String, ? extends Object> map = (Map) json.get("requestPurchase");
            if (map != null) {
                Request.Purchase purchase = new Request.Purchase(RequestPurchasePropsByPlatforms.INSTANCE.fromJson(map));
                if (fromJson == null) {
                    fromJson = ProductQueryType.InApp;
                }
                if (fromJson != ProductQueryType.InApp) {
                    throw new IllegalArgumentException("type must be IN_APP when requestPurchase is provided".toString());
                }
                return new RequestPurchaseProps(purchase, fromJson, bool);
            }
            Map<String, ? extends Object> map2 = (Map) json.get("requestSubscription");
            if (map2 != null) {
                Request.Subscription subscription = new Request.Subscription(RequestSubscriptionPropsByPlatforms.INSTANCE.fromJson(map2));
                if (fromJson == null) {
                    fromJson = ProductQueryType.Subs;
                }
                if (fromJson != ProductQueryType.Subs) {
                    throw new IllegalArgumentException("type must be SUBS when requestSubscription is provided".toString());
                }
                return new RequestPurchaseProps(subscription, fromJson, bool);
            }
            throw new IllegalArgumentException("RequestPurchaseProps requires requestPurchase or requestSubscription");
        }
    }

    public final Map<String, Object> toJson() {
        Request request = this.request;
        if (request instanceof Request.Purchase) {
            return MapsKt.mapOf(TuplesKt.to("requestPurchase", ((Request.Purchase) request).getValue().toJson()), TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, this.type.toJson()), TuplesKt.to("useAlternativeBilling", this.useAlternativeBilling));
        }
        if (!(request instanceof Request.Subscription)) {
            throw new NoWhenBranchMatchedException();
        }
        return MapsKt.mapOf(TuplesKt.to("requestSubscription", ((Request.Subscription) request).getValue().toJson()), TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, this.type.toJson()), TuplesKt.to("useAlternativeBilling", this.useAlternativeBilling));
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/RequestPurchaseProps$Request;", "", "<init>", "()V", "Purchase", "Subscription", "Ldev/hyo/openiap/RequestPurchaseProps$Request$Purchase;", "Ldev/hyo/openiap/RequestPurchaseProps$Request$Subscription;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Request {
        public static final int $stable = 0;

        public /* synthetic */ Request(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: Types.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Ldev/hyo/openiap/RequestPurchaseProps$Request$Purchase;", "Ldev/hyo/openiap/RequestPurchaseProps$Request;", "value", "Ldev/hyo/openiap/RequestPurchasePropsByPlatforms;", "<init>", "(Ldev/hyo/openiap/RequestPurchasePropsByPlatforms;)V", "getValue", "()Ldev/hyo/openiap/RequestPurchasePropsByPlatforms;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Purchase extends Request {
            public static final int $stable = 8;
            private final RequestPurchasePropsByPlatforms value;

            public static /* synthetic */ Purchase copy$default(Purchase purchase, RequestPurchasePropsByPlatforms requestPurchasePropsByPlatforms, int i, Object obj) {
                if ((i & 1) != 0) {
                    requestPurchasePropsByPlatforms = purchase.value;
                }
                return purchase.copy(requestPurchasePropsByPlatforms);
            }

            /* renamed from: component1, reason: from getter */
            public final RequestPurchasePropsByPlatforms getValue() {
                return this.value;
            }

            public final Purchase copy(RequestPurchasePropsByPlatforms value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Purchase(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Purchase) && Intrinsics.areEqual(this.value, ((Purchase) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Purchase(value=" + this.value + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Purchase(RequestPurchasePropsByPlatforms value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            public final RequestPurchasePropsByPlatforms getValue() {
                return this.value;
            }
        }

        private Request() {
        }

        /* compiled from: Types.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Ldev/hyo/openiap/RequestPurchaseProps$Request$Subscription;", "Ldev/hyo/openiap/RequestPurchaseProps$Request;", "value", "Ldev/hyo/openiap/RequestSubscriptionPropsByPlatforms;", "<init>", "(Ldev/hyo/openiap/RequestSubscriptionPropsByPlatforms;)V", "getValue", "()Ldev/hyo/openiap/RequestSubscriptionPropsByPlatforms;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Subscription extends Request {
            public static final int $stable = 8;
            private final RequestSubscriptionPropsByPlatforms value;

            public static /* synthetic */ Subscription copy$default(Subscription subscription, RequestSubscriptionPropsByPlatforms requestSubscriptionPropsByPlatforms, int i, Object obj) {
                if ((i & 1) != 0) {
                    requestSubscriptionPropsByPlatforms = subscription.value;
                }
                return subscription.copy(requestSubscriptionPropsByPlatforms);
            }

            /* renamed from: component1, reason: from getter */
            public final RequestSubscriptionPropsByPlatforms getValue() {
                return this.value;
            }

            public final Subscription copy(RequestSubscriptionPropsByPlatforms value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Subscription(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Subscription) && Intrinsics.areEqual(this.value, ((Subscription) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Subscription(value=" + this.value + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Subscription(RequestSubscriptionPropsByPlatforms value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            public final RequestSubscriptionPropsByPlatforms getValue() {
                return this.value;
            }
        }
    }
}
