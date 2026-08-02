package com.squareup.protos.cash.devicegrip.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DeviceSyncValue$DeviceType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DeviceSyncValue$DeviceType.Companion.getClass();
        switch (i) {
            case 1:
                return DeviceSyncValue$DeviceType.MAC;
            case 2:
                return DeviceSyncValue$DeviceType.WINDOWS;
            case 3:
                return DeviceSyncValue$DeviceType.ANDROID;
            case 4:
                return DeviceSyncValue$DeviceType.IPHONE;
            case 5:
                return DeviceSyncValue$DeviceType.IPAD;
            case 6:
                return DeviceSyncValue$DeviceType.IPOD_TOUCH;
            case 7:
                return DeviceSyncValue$DeviceType.OTHER;
            case 8:
                return DeviceSyncValue$DeviceType.WEB;
            default:
                return null;
        }
    }
}
