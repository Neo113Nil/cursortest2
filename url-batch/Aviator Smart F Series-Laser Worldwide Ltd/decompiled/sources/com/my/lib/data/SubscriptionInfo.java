package com.my.lib.data;

/* loaded from: classes4.dex */
public final class SubscriptionInfo {
    private Integer freeDays;
    private final int identityType;
    private Integer validCountToB;
    private Integer validCountToC;
    private Long validTimeToB;
    private Long validTimeToC;

    public SubscriptionInfo(int i8) {
        this.identityType = i8;
    }

    public static /* synthetic */ SubscriptionInfo copy$default(SubscriptionInfo subscriptionInfo, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = subscriptionInfo.identityType;
        }
        return subscriptionInfo.copy(i8);
    }

    public final int component1() {
        return this.identityType;
    }

    public final SubscriptionInfo copy(int i8) {
        return new SubscriptionInfo(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubscriptionInfo) && this.identityType == ((SubscriptionInfo) obj).identityType;
    }

    public final Integer getFreeDays() {
        return this.freeDays;
    }

    public final int getIdentityType() {
        return this.identityType;
    }

    public final Integer getValidCountToB() {
        return this.validCountToB;
    }

    public final Integer getValidCountToC() {
        return this.validCountToC;
    }

    public final Long getValidTimeToB() {
        return this.validTimeToB;
    }

    public final Long getValidTimeToC() {
        return this.validTimeToC;
    }

    public int hashCode() {
        return this.identityType;
    }

    public final void setFreeDays(Integer num) {
        this.freeDays = num;
    }

    public final void setValidCountToB(Integer num) {
        this.validCountToB = num;
    }

    public final void setValidCountToC(Integer num) {
        this.validCountToC = num;
    }

    public final void setValidTimeToB(Long l8) {
        this.validTimeToB = l8;
    }

    public final void setValidTimeToC(Long l8) {
        this.validTimeToC = l8;
    }

    public String toString() {
        return "SubscriptionInfo(identityType=" + this.identityType + ")";
    }
}
