package com.squareup.protos.access.sync_values;

import com.squareup.protos.access.sync_values.DeviceInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DeviceInfo$DeviceType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DeviceInfo.DeviceType.Companion.getClass();
        switch (i) {
            case 1:
                return DeviceInfo.DeviceType.MAC;
            case 2:
                return DeviceInfo.DeviceType.WINDOWS;
            case 3:
                return DeviceInfo.DeviceType.ANDROID;
            case 4:
                return DeviceInfo.DeviceType.IPHONE;
            case 5:
                return DeviceInfo.DeviceType.IPAD;
            case 6:
                return DeviceInfo.DeviceType.IPOD_TOUCH;
            case 7:
                return DeviceInfo.DeviceType.OTHER;
            case 8:
                return DeviceInfo.DeviceType.WEB;
            default:
                return null;
        }
    }
}
