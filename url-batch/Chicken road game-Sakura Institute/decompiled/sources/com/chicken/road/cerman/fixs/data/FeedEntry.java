package com.chicken.road.cerman.fixs.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016¨\u0006("}, d2 = {"Lcom/chicken/road/cerman/fixs/data/FeedEntry;", "", "id", "", "chickenId", "date", "feedType", "", "quantityKg", "", "pricePerKg", "<init>", "(JLjava/lang/Long;JLjava/lang/String;DD)V", "getId", "()J", "getChickenId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDate", "getFeedType", "()Ljava/lang/String;", "getQuantityKg", "()D", "getPricePerKg", "cost", "getCost", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/Long;JLjava/lang/String;DD)Lcom/chicken/road/cerman/fixs/data/FeedEntry;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FeedEntry {
    public static final int $stable = 0;
    private final Long chickenId;
    private final long date;
    private final String feedType;
    private final long id;
    private final double pricePerKg;
    private final double quantityKg;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getChickenId() {
        return this.chickenId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFeedType() {
        return this.feedType;
    }

    /* renamed from: component5, reason: from getter */
    public final double getQuantityKg() {
        return this.quantityKg;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPricePerKg() {
        return this.pricePerKg;
    }

    public final FeedEntry copy(long id, Long chickenId, long date, String feedType, double quantityKg, double pricePerKg) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        return new FeedEntry(id, chickenId, date, feedType, quantityKg, pricePerKg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedEntry)) {
            return false;
        }
        FeedEntry feedEntry = (FeedEntry) other;
        return this.id == feedEntry.id && Intrinsics.areEqual(this.chickenId, feedEntry.chickenId) && this.date == feedEntry.date && Intrinsics.areEqual(this.feedType, feedEntry.feedType) && Double.compare(this.quantityKg, feedEntry.quantityKg) == 0 && Double.compare(this.pricePerKg, feedEntry.pricePerKg) == 0;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Long l = this.chickenId;
        return ((((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Long.hashCode(this.date)) * 31) + this.feedType.hashCode()) * 31) + Double.hashCode(this.quantityKg)) * 31) + Double.hashCode(this.pricePerKg);
    }

    public String toString() {
        return "FeedEntry(id=" + this.id + ", chickenId=" + this.chickenId + ", date=" + this.date + ", feedType=" + this.feedType + ", quantityKg=" + this.quantityKg + ", pricePerKg=" + this.pricePerKg + ")";
    }

    public FeedEntry(long j, Long l, long j2, String feedType, double d, double d2) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.id = j;
        this.chickenId = l;
        this.date = j2;
        this.feedType = feedType;
        this.quantityKg = d;
        this.pricePerKg = d2;
    }

    public final long getId() {
        return this.id;
    }

    public final Long getChickenId() {
        return this.chickenId;
    }

    public /* synthetic */ FeedEntry(long j, Long l, long j2, String str, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, l, (i & 4) != 0 ? System.currentTimeMillis() : j2, str, d, d2);
    }

    public final long getDate() {
        return this.date;
    }

    public final String getFeedType() {
        return this.feedType;
    }

    public final double getQuantityKg() {
        return this.quantityKg;
    }

    public final double getPricePerKg() {
        return this.pricePerKg;
    }

    public final double getCost() {
        return this.quantityKg * this.pricePerKg;
    }
}
