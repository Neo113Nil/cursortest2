package com.crrepa.band.my.device.altitude;

import com.crrepa.ble.conn.listener.CRPBarometerCalibrationListener;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class c implements CRPBarometerCalibrationListener {
    @Override // com.crrepa.ble.conn.listener.CRPBarometerCalibrationListener
    public void onUpdateBarometer() {
        f.d("onUpdateBarometer");
        b.getInstance().startGetAltitude();
    }
}
