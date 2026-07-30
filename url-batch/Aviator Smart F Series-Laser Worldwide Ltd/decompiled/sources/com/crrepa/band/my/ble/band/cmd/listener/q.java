package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.ble.conn.listener.CRPFindPhoneListener;

/* loaded from: classes2.dex */
public class q implements CRPFindPhoneListener {
    @Override // com.crrepa.ble.conn.listener.CRPFindPhoneListener
    public void onFindPhone() {
        com.orhanobut.logger.f.d("onFindPhone");
        com.crrepa.band.my.ble.band.utils.b.getInstance().start();
    }

    @Override // com.crrepa.ble.conn.listener.CRPFindPhoneListener
    public void onFindPhoneComplete() {
        com.orhanobut.logger.f.d("onFindPhoneComplete");
        com.crrepa.band.my.ble.band.utils.b.getInstance().stop();
    }
}
