package com.crrepa.band.my.device.stock.model;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class StockSparkBean implements Serializable {
    private double chartPreviousClose;
    private List<Float> close;
    private int dataGranularity;
    private String end;
    private double previousClose;
    private String start;
    private String symbol;
    private List<Long> timestamp;

    public double getChartPreviousClose() {
        return this.chartPreviousClose;
    }

    public List<Float> getClose() {
        return this.close;
    }

    public int getDataGranularity() {
        return this.dataGranularity;
    }

    public String getEnd() {
        return this.end;
    }

    public double getPreviousClose() {
        return this.previousClose;
    }

    public String getStart() {
        return this.start;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public List<Long> getTimestamp() {
        return this.timestamp;
    }
}
