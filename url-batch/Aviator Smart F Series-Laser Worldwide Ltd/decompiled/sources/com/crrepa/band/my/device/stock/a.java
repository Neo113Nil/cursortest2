package com.crrepa.band.my.device.stock;

import com.crrepa.band.my.device.stock.model.StockModel;
import com.crrepa.band.my.home.device.model.SupportStockCountEvent;
import com.crrepa.ble.conn.listener.CRPStockChangeListener;

/* loaded from: classes2.dex */
public class a implements CRPStockChangeListener {
    private StockModel stockModel;

    @Override // com.crrepa.ble.conn.listener.CRPStockChangeListener
    public void onSupportStockCount(int i8) {
        c.save(i8);
        org.greenrobot.eventbus.c.getDefault().post(new SupportStockCountEvent(i8));
    }

    @Override // com.crrepa.ble.conn.listener.CRPStockChangeListener
    public void onUpdateStockChange() {
        if (this.stockModel == null) {
            this.stockModel = new StockModel();
        }
        this.stockModel.requestStockDetailForWatch();
    }
}
