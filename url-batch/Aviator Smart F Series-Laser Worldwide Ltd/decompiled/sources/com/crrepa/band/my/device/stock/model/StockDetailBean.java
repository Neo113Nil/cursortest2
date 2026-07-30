package com.crrepa.band.my.device.stock.model;

import com.github.mikephil.charting.utils.i;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Locale;

/* loaded from: classes2.dex */
public class StockDetailBean implements Serializable {
    private long averageDailyVolume3Month;
    private String beta;
    private String currency;
    private String dividendYield;
    private double epsTrailingTwelveMonths;
    private String exchange;
    private double fiftyTwoWeekHigh;
    private double fiftyTwoWeekLow;
    private String fullExchangeName;
    private boolean isRise;
    private String longName;
    private String marketCap;
    private String marketState;
    private BigDecimal markup;
    private String peRatio;
    private double postMarketPrice;
    private double regularMarketDayHigh;
    private double regularMarketDayLow;
    private double regularMarketOpen;
    private double regularMarketPreviousClose;
    private double regularMarketPrice;
    private long regularMarketVolume;
    private String shortName;
    private String symbol;

    public long getAverageDailyVolume3Month() {
        return this.averageDailyVolume3Month;
    }

    public String getBeta() {
        return this.beta;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDividendYield() {
        return this.dividendYield;
    }

    public double getEpsTrailingTwelveMonths() {
        return this.epsTrailingTwelveMonths;
    }

    public String getExchange() {
        return this.exchange;
    }

    public double getFiftyTwoWeekHigh() {
        return this.fiftyTwoWeekHigh;
    }

    public double getFiftyTwoWeekLow() {
        return this.fiftyTwoWeekLow;
    }

    public String getFullExchangeName() {
        return this.fullExchangeName;
    }

    public String getLongName() {
        return this.longName;
    }

    public long getMarketCap() {
        try {
            return Long.parseLong(this.marketCap);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public BigDecimal getMarkup() {
        return this.markup;
    }

    public String getMarkupStr() {
        String format = String.format(Locale.getDefault(), "%.2f", this.markup);
        if (this.markup.doubleValue() < i.DOUBLE_EPSILON) {
            return format;
        }
        return "+" + format;
    }

    public float getPeRatio() {
        try {
            return Float.parseFloat(this.peRatio);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public double getPostMarketPrice() {
        return this.postMarketPrice;
    }

    public double getRegularMarketDayHigh() {
        return this.regularMarketDayHigh;
    }

    public double getRegularMarketDayLow() {
        return this.regularMarketDayLow;
    }

    public double getRegularMarketOpen() {
        return this.regularMarketOpen;
    }

    public double getRegularMarketPreviousClose() {
        return this.regularMarketPreviousClose;
    }

    public double getRegularMarketPrice() {
        return this.regularMarketPrice;
    }

    public long getRegularMarketVolume() {
        return this.regularMarketVolume;
    }

    public String getShortName() {
        return this.shortName;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public boolean isRise() {
        return this.isRise;
    }

    public boolean isStockClosed() {
        return !isStockOpening();
    }

    public boolean isStockOpening() {
        return "REGULAR".equals(this.marketState);
    }

    public void setMarkup(BigDecimal bigDecimal) {
        this.markup = bigDecimal;
        setRise(bigDecimal.doubleValue() >= i.DOUBLE_EPSILON);
    }

    public void setRise(boolean z7) {
        this.isRise = z7;
    }
}
