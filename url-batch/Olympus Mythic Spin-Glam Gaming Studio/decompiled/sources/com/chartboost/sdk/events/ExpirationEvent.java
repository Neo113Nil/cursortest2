package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.impl.m8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/chartboost/sdk/events/ExpirationEvent;", "", "Lcom/chartboost/sdk/ads/Ad;", "component1", "()Lcom/chartboost/sdk/ads/Ad;", "Lcom/chartboost/sdk/impl/m8;", "component2", "()Lcom/chartboost/sdk/impl/m8;", "ad", "reason", "copy", "(Lcom/chartboost/sdk/ads/Ad;Lcom/chartboost/sdk/impl/m8;)Lcom/chartboost/sdk/events/ExpirationEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/chartboost/sdk/ads/Ad;", "getAd", "Lcom/chartboost/sdk/impl/m8;", "getReason", "<init>", "(Lcom/chartboost/sdk/ads/Ad;Lcom/chartboost/sdk/impl/m8;)V", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class ExpirationEvent {

    @NotNull
    private final Ad ad;

    @NotNull
    private final m8 reason;

    public ExpirationEvent(@NotNull Ad ad, @NotNull m8 reason) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.ad = ad;
        this.reason = reason;
    }

    public static /* synthetic */ ExpirationEvent copy$default(ExpirationEvent expirationEvent, Ad ad, m8 m8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ad = expirationEvent.ad;
        }
        if ((i & 2) != 0) {
            m8Var = expirationEvent.reason;
        }
        return expirationEvent.copy(ad, m8Var);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Ad getAd() {
        return this.ad;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final m8 getReason() {
        return this.reason;
    }

    @NotNull
    public final ExpirationEvent copy(@NotNull Ad ad, @NotNull m8 reason) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new ExpirationEvent(ad, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpirationEvent)) {
            return false;
        }
        ExpirationEvent expirationEvent = (ExpirationEvent) other;
        return Intrinsics.areEqual(this.ad, expirationEvent.ad) && this.reason == expirationEvent.reason;
    }

    @NotNull
    public final Ad getAd() {
        return this.ad;
    }

    public int hashCode() {
        return (this.ad.hashCode() * 31) + this.reason.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExpirationEvent(ad=" + this.ad + ", reason=" + this.reason + ")";
    }

    @NotNull
    public final m8 getReason() {
        return this.reason;
    }
}
