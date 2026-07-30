package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPStockPriceInfo {
    private long average;
    private float change;
    private float changePercent;
    private boolean enable;
    private float highestPrice;
    private byte id;
    private float lowestPrice;
    private long marketValue;
    private float openingPrice;
    private float pe;
    private float price;
    private long turnover;
    private float yearHighestPrice;
    private float yearLowestPrice;

    public long getAverage() {
        return this.average;
    }

    public float getChange() {
        return this.change;
    }

    public float getChangePercent() {
        return this.changePercent;
    }

    public float getHighestPrice() {
        return this.highestPrice;
    }

    public byte getId() {
        return this.id;
    }

    public float getLowestPrice() {
        return this.lowestPrice;
    }

    public long getMarketValue() {
        return this.marketValue;
    }

    public float getOpeningPrice() {
        return this.openingPrice;
    }

    public float getPe() {
        return this.pe;
    }

    public float getPrice() {
        return this.price;
    }

    public long getTurnover() {
        return this.turnover;
    }

    public float getYearHighestPrice() {
        return this.yearHighestPrice;
    }

    public float getYearLowestPrice() {
        return this.yearLowestPrice;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setAverage(long j8) {
        this.average = j8;
    }

    public void setChange(float f8) {
        this.change = f8;
    }

    public void setChangePercent(float f8) {
        this.changePercent = f8;
    }

    public void setEnable(boolean z7) {
        this.enable = z7;
    }

    public void setHighestPrice(float f8) {
        this.highestPrice = f8;
    }

    public void setId(byte b8) {
        this.id = b8;
    }

    public void setLowestPrice(float f8) {
        this.lowestPrice = f8;
    }

    public void setMarketValue(long j8) {
        this.marketValue = j8;
    }

    public void setOpeningPrice(float f8) {
        this.openingPrice = f8;
    }

    public void setPe(float f8) {
        this.pe = f8;
    }

    public void setPrice(float f8) {
        this.price = f8;
    }

    public void setTurnover(long j8) {
        this.turnover = j8;
    }

    public void setYearHighestPrice(float f8) {
        this.yearHighestPrice = f8;
    }

    public void setYearLowestPrice(float f8) {
        this.yearLowestPrice = f8;
    }

    public String toString() {
        return "CRPStockPriceInfo{id=" + ((int) this.id) + ", enable=" + this.enable + ", price=" + this.price + ", change=" + this.change + ", changePercent=" + this.changePercent + ", openingPrice=" + this.openingPrice + ", highestPrice=" + this.highestPrice + ", lowestPrice=" + this.lowestPrice + ", yearHighestPrice=" + this.yearHighestPrice + ", yearLowestPrice=" + this.yearLowestPrice + ", pe=" + this.pe + ", marketValue=" + this.marketValue + ", turnover=" + this.turnover + ", average=" + this.average + '}';
    }
}
