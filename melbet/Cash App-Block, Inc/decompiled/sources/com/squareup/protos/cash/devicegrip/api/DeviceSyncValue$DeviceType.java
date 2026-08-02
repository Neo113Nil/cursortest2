package com.squareup.protos.cash.devicegrip.api;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum DeviceSyncValue$DeviceType implements WireEnum {
    MAC(1),
    WINDOWS(2),
    ANDROID(3),
    IPHONE(4),
    IPAD(5),
    IPOD_TOUCH(6),
    OTHER(7),
    WEB(8);

    public final int value;
    public static final Alignment.Companion Companion = new Alignment.Companion();
    public static final DeviceSyncValue$DeviceType$Companion$ADAPTER$1 ADAPTER = new DeviceSyncValue$DeviceType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DeviceSyncValue$DeviceType.class), Syntax.PROTO_2, null);

    DeviceSyncValue$DeviceType(int i) {
        this.value = i;
    }

    public static final DeviceSyncValue$DeviceType fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 1:
                return MAC;
            case 2:
                return WINDOWS;
            case 3:
                return ANDROID;
            case 4:
                return IPHONE;
            case 5:
                return IPAD;
            case 6:
                return IPOD_TOUCH;
            case 7:
                return OTHER;
            case 8:
                return WEB;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
