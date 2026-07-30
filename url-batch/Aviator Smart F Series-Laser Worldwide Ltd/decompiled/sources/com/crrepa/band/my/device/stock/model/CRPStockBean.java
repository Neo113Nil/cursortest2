package com.crrepa.band.my.device.stock.model;

import com.crrepa.ble.conn.bean.CRPStockInfo;
import com.crrepa.ble.conn.bean.CRPStockPriceInfo;

/* loaded from: classes2.dex */
public class CRPStockBean {
    private final CRPStockInfo stockInfo;
    private final CRPStockPriceInfo stockPriceInfo;

    public CRPStockBean(CRPStockInfo cRPStockInfo, CRPStockPriceInfo cRPStockPriceInfo) {
        this.stockInfo = cRPStockInfo;
        this.stockPriceInfo = cRPStockPriceInfo;
    }

    public CRPStockInfo getStockInfo() {
        return this.stockInfo;
    }

    public CRPStockPriceInfo getStockPriceInfo() {
        return this.stockPriceInfo;
    }
}
