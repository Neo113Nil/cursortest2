package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.model.band.provider.BandMessageLengthProvider;
import com.crrepa.ble.conn.callback.CRPMessageLengthCallback;

/* loaded from: classes2.dex */
public class j implements CRPMessageLengthCallback {
    @Override // com.crrepa.ble.conn.callback.CRPMessageLengthCallback
    public void onMessageLength(int i8) {
        com.orhanobut.logger.f.d("onMessageLength: " + i8);
        BandMessageLengthProvider.saveMessageLength(i8);
    }
}
