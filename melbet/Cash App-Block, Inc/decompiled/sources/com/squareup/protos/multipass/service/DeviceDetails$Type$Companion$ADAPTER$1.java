package com.squareup.protos.multipass.service;

import com.squareup.protos.multipass.service.DeviceDetails;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes9.dex */
public final class DeviceDetails$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DeviceDetails.Type.Companion.getClass();
        return Plane.fromValue(i);
    }
}
