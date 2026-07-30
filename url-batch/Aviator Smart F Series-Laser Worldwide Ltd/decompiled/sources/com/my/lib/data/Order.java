package com.my.lib.data;

import androidx.collection.a;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class Order {
    private final long endTime;
    private final String orderId;
    private final int orderNum;
    private final String orderPrice;
    private final int orderStatus;
    private final int orderType;
    private final long startTime;

    public Order(String orderId, String orderPrice, int i8, long j8, long j9, int i9, int i10) {
        s.checkNotNullParameter(orderId, "orderId");
        s.checkNotNullParameter(orderPrice, "orderPrice");
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.orderNum = i8;
        this.startTime = j8;
        this.endTime = j9;
        this.orderType = i9;
        this.orderStatus = i10;
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.orderPrice;
    }

    public final int component3() {
        return this.orderNum;
    }

    public final long component4() {
        return this.startTime;
    }

    public final long component5() {
        return this.endTime;
    }

    public final int component6() {
        return this.orderType;
    }

    public final int component7() {
        return this.orderStatus;
    }

    public final Order copy(String orderId, String orderPrice, int i8, long j8, long j9, int i9, int i10) {
        s.checkNotNullParameter(orderId, "orderId");
        s.checkNotNullParameter(orderPrice, "orderPrice");
        return new Order(orderId, orderPrice, i8, j8, j9, i9, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order order = (Order) obj;
        return s.areEqual(this.orderId, order.orderId) && s.areEqual(this.orderPrice, order.orderPrice) && this.orderNum == order.orderNum && this.startTime == order.startTime && this.endTime == order.endTime && this.orderType == order.orderType && this.orderStatus == order.orderStatus;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final int getOrderNum() {
        return this.orderNum;
    }

    public final String getOrderPrice() {
        return this.orderPrice;
    }

    public final int getOrderStatus() {
        return this.orderStatus;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return this.orderStatus + ((this.orderType + ((a.a(this.endTime) + ((a.a(this.startTime) + ((this.orderNum + ((this.orderPrice.hashCode() + (this.orderId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Order(orderId=" + this.orderId + ", orderPrice=" + this.orderPrice + ", orderNum=" + this.orderNum + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", orderType=" + this.orderType + ", orderStatus=" + this.orderStatus + ")";
    }
}
