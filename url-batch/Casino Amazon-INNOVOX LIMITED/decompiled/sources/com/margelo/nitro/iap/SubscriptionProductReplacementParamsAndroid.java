package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubscriptionProductReplacementParamsAndroid.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/iap/SubscriptionProductReplacementParamsAndroid;", "", "oldProductId", "", "replacementMode", "Lcom/margelo/nitro/iap/SubscriptionReplacementModeAndroid;", "<init>", "(Ljava/lang/String;Lcom/margelo/nitro/iap/SubscriptionReplacementModeAndroid;)V", "getOldProductId", "()Ljava/lang/String;", "getReplacementMode", "()Lcom/margelo/nitro/iap/SubscriptionReplacementModeAndroid;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SubscriptionProductReplacementParamsAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String oldProductId;
    private final SubscriptionReplacementModeAndroid replacementMode;

    public static /* synthetic */ SubscriptionProductReplacementParamsAndroid copy$default(SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid, String str, SubscriptionReplacementModeAndroid subscriptionReplacementModeAndroid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionProductReplacementParamsAndroid.oldProductId;
        }
        if ((i & 2) != 0) {
            subscriptionReplacementModeAndroid = subscriptionProductReplacementParamsAndroid.replacementMode;
        }
        return subscriptionProductReplacementParamsAndroid.copy(str, subscriptionReplacementModeAndroid);
    }

    @JvmStatic
    private static final SubscriptionProductReplacementParamsAndroid fromCpp(String str, SubscriptionReplacementModeAndroid subscriptionReplacementModeAndroid) {
        return INSTANCE.fromCpp(str, subscriptionReplacementModeAndroid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOldProductId() {
        return this.oldProductId;
    }

    /* renamed from: component2, reason: from getter */
    public final SubscriptionReplacementModeAndroid getReplacementMode() {
        return this.replacementMode;
    }

    public final SubscriptionProductReplacementParamsAndroid copy(String oldProductId, SubscriptionReplacementModeAndroid replacementMode) {
        Intrinsics.checkNotNullParameter(oldProductId, "oldProductId");
        Intrinsics.checkNotNullParameter(replacementMode, "replacementMode");
        return new SubscriptionProductReplacementParamsAndroid(oldProductId, replacementMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionProductReplacementParamsAndroid)) {
            return false;
        }
        SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid = (SubscriptionProductReplacementParamsAndroid) other;
        return Intrinsics.areEqual(this.oldProductId, subscriptionProductReplacementParamsAndroid.oldProductId) && this.replacementMode == subscriptionProductReplacementParamsAndroid.replacementMode;
    }

    public int hashCode() {
        return (this.oldProductId.hashCode() * 31) + this.replacementMode.hashCode();
    }

    public String toString() {
        return "SubscriptionProductReplacementParamsAndroid(oldProductId=" + this.oldProductId + ", replacementMode=" + this.replacementMode + ")";
    }

    public SubscriptionProductReplacementParamsAndroid(String oldProductId, SubscriptionReplacementModeAndroid replacementMode) {
        Intrinsics.checkNotNullParameter(oldProductId, "oldProductId");
        Intrinsics.checkNotNullParameter(replacementMode, "replacementMode");
        this.oldProductId = oldProductId;
        this.replacementMode = replacementMode;
    }

    public final String getOldProductId() {
        return this.oldProductId;
    }

    public final SubscriptionReplacementModeAndroid getReplacementMode() {
        return this.replacementMode;
    }

    /* compiled from: SubscriptionProductReplacementParamsAndroid.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/SubscriptionProductReplacementParamsAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/SubscriptionProductReplacementParamsAndroid;", "oldProductId", "", "replacementMode", "Lcom/margelo/nitro/iap/SubscriptionReplacementModeAndroid;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final SubscriptionProductReplacementParamsAndroid fromCpp(String oldProductId, SubscriptionReplacementModeAndroid replacementMode) {
            return new SubscriptionProductReplacementParamsAndroid(oldProductId, replacementMode);
        }
    }
}
