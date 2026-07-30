package com.crrepa.band.my.device.stock.model;

/* loaded from: classes2.dex */
public class SaveStockEvent {
    private final String symbol;

    public SaveStockEvent(String str) {
        this.symbol = str;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
