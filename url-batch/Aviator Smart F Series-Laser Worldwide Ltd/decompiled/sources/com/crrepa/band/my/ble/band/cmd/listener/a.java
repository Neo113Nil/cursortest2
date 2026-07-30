package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.band.provider.BandA2DPProvider;
import com.crrepa.ble.conn.listener.CRPA2DPConnectStateListener;

/* loaded from: classes2.dex */
public class a implements CRPA2DPConnectStateListener {
    @Override // com.crrepa.ble.conn.listener.CRPA2DPConnectStateListener
    public void onConnectState(CRPA2DPConnectStateListener.A2DPConnectState a2DPConnectState) {
        com.orhanobut.logger.f.d("onConnectState: " + a2DPConnectState);
        if (a2DPConnectState != null) {
            CRPA2DPConnectStateListener.A2DPConnectState a2DPConnectState2 = BandA2DPProvider.getA2DPConnectState();
            CRPA2DPConnectStateListener.A2DPConnectState a2DPConnectState3 = CRPA2DPConnectStateListener.A2DPConnectState.DISCONNECTED;
            if (a2DPConnectState2 == a2DPConnectState3) {
                i4.getInstance().sendA2DPConnectState(a2DPConnectState3);
            } else {
                BandA2DPProvider.saveA2DPConnectState(a2DPConnectState);
            }
            org.greenrobot.eventbus.c.getDefault().post(new l0.a(a2DPConnectState));
        }
    }
}
