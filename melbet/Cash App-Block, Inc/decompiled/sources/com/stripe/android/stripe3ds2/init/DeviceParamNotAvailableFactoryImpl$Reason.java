package com.stripe.android.stripe3ds2.init;

/* loaded from: classes4.dex */
public enum DeviceParamNotAvailableFactoryImpl$Reason {
    /* JADX INFO: Fake field, exist only in values array */
    MARKET_OR_REGION_RESTRICTION("RE01"),
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM_VERSION("RE02"),
    /* JADX INFO: Fake field, exist only in values array */
    PERMISSION("RE03"),
    /* JADX INFO: Fake field, exist only in values array */
    UNAVAILABLE("RE04");

    public final String code;

    DeviceParamNotAvailableFactoryImpl$Reason(String str) {
        this.code = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.code;
    }
}
