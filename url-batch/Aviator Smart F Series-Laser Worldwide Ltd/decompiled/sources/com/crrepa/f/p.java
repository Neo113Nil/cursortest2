package com.crrepa.f;

import com.crrepa.ble.conn.listener.CRPA2DPConnectStateListener;

/* loaded from: classes3.dex */
public class p {
    private p() {
    }

    public static byte[] a() {
        return g.a(-12, null);
    }

    public static byte[] a(CRPA2DPConnectStateListener.A2DPConnectState a2DPConnectState) {
        return g.a(-11, new byte[]{a2DPConnectState.getValue()});
    }
}
