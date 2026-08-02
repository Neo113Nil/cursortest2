package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

/* loaded from: classes.dex */
public enum ChargeType {
    UNKNOWN(-1),
    NONE(0),
    USB(1),
    WIRELESS(2),
    AC(3);


    /* renamed from: a, reason: collision with root package name */
    private final int f5435a;

    ChargeType(int i3) {
        this.f5435a = i3;
    }

    public static ChargeType fromId(Integer num) {
        if (num != null) {
            for (ChargeType chargeType : values()) {
                if (chargeType.getId() == num.intValue()) {
                    return chargeType;
                }
            }
        }
        return UNKNOWN;
    }

    public int getId() {
        return this.f5435a;
    }
}
