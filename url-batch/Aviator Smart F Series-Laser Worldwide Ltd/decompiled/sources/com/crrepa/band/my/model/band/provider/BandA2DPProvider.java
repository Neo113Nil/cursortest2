package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.listener.CRPA2DPConnectStateListener;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandA2DPProvider {
    private BandA2DPProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.A2DP_CONNECT);
    }

    public static CRPA2DPConnectStateListener.A2DPConnectState getA2DPConnectState() {
        return CRPA2DPConnectStateListener.A2DPConnectState.getInstance((byte) g.getInstance().getInt(BaseParamNames.A2DP_CONNECT, CRPA2DPConnectStateListener.A2DPConnectState.NOT_CONNECTED.getValue()));
    }

    public static boolean hasA2DP() {
        return g.getInstance().contains(BaseParamNames.A2DP_CONNECT);
    }

    public static void saveA2DPConnectState(CRPA2DPConnectStateListener.A2DPConnectState a2DPConnectState) {
        g.getInstance().putInt(BaseParamNames.A2DP_CONNECT, a2DPConnectState.getValue());
    }
}
