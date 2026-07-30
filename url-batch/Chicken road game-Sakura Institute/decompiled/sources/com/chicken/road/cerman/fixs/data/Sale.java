package com.chicken.road.cerman.fixs.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003JV\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u001c\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006,"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/Sale;", "", "id", "", "chickenId", "date", "saleType", "", "quantity", "", "unitPrice", "", "buyer", "<init>", "(JLjava/lang/Long;JLjava/lang/String;IDLjava/lang/String;)V", "getId", "()J", "getChickenId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDate", "getSaleType", "()Ljava/lang/String;", "getQuantity", "()I", "getUnitPrice", "()D", "getBuyer", "total", "getTotal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JLjava/lang/Long;JLjava/lang/String;IDLjava/lang/String;)Lcom/chicken/road/cerman/fixs/data/Sale;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Sale {
    public static final int $stable = 0;
    private final String buyer;
    private final Long chickenId;
    private final long date;
    private final long id;
    private final int quantity;
    private final String saleType;
    private final double unitPrice;

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
    public final String getSaleType() {
        return this.saleType;
    }

    /* renamed from: component5, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component6, reason: from getter */
    public final double getUnitPrice() {
        return this.unitPrice;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBuyer() {
        return this.buyer;
    }

    public final Sale copy(long id, Long chickenId, long date, String saleType, int quantity, double unitPrice, String buyer) {
        Intrinsics.checkNotNullParameter(saleType, "saleType");
        Intrinsics.checkNotNullParameter(buyer, "buyer");
        return new Sale(id, chickenId, date, saleType, quantity, unitPrice, buyer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sale)) {
            return false;
        }
        Sale sale = (Sale) other;
        return this.id == sale.id && Intrinsics.areEqual(this.chickenId, sale.chickenId) && this.date == sale.date && Intrinsics.areEqual(this.saleType, sale.saleType) && this.quantity == sale.quantity && Double.compare(this.unitPrice, sale.unitPrice) == 0 && Intrinsics.areEqual(this.buyer, sale.buyer);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Long l = this.chickenId;
        return ((((((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Long.hashCode(this.date)) * 31) + this.saleType.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + Double.hashCode(this.unitPrice)) * 31) + this.buyer.hashCode();
    }

    public String toString() {
        return "Sale(id=" + this.id + ", chickenId=" + this.chickenId + ", date=" + this.date + ", saleType=" + this.saleType + ", quantity=" + this.quantity + ", unitPrice=" + this.unitPrice + ", buyer=" + this.buyer + ")";
    }

    public Sale(long j, Long l, long j2, String saleType, int i, double d, String buyer) {
        Intrinsics.checkNotNullParameter(saleType, "saleType");
        Intrinsics.checkNotNullParameter(buyer, "buyer");
        this.id = j;
        this.chickenId = l;
        this.date = j2;
        this.saleType = saleType;
        this.quantity = i;
        this.unitPrice = d;
        this.buyer = buyer;
    }

    public final long getId() {
        return this.id;
    }

    public final Long getChickenId() {
        return this.chickenId;
    }

    public /* synthetic */ Sale(long j, Long l, long j2, String str, int i, double d, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, l, (i2 & 4) != 0 ? System.currentTimeMillis() : j2, str, i, d, (i2 & 64) != 0 ? "" : str2);
    }

    public final long getDate() {
        return this.date;
    }

    public final String getSaleType() {
        return this.saleType;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final double getUnitPrice() {
        return this.unitPrice;
    }

    public final String getBuyer() {
        return this.buyer;
    }

    public final double getTotal() {
        return this.quantity * this.unitPrice;
    }
}
