package com.crrepa.ble.spp.hisilicon;

/* loaded from: classes3.dex */
public interface CRPSPPConnectChangeListener {
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 0;

    void onConnectionStateChanged(int i8);
}
