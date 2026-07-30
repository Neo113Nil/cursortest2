package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPTodayWeatherInfo {
    private String city;
    private String festival;
    private String lunar;
    private int pm25;
    private int sunriseHour;
    private int sunriseMinute;
    private int sunsetHour;
    private int sunsetMinute;
    private int temp;
    private int weatherId;

    public CRPTodayWeatherInfo() {
    }

    public CRPTodayWeatherInfo(String str, String str2, String str3, int i8, int i9, int i10) {
        this.city = str;
        this.lunar = str2;
        this.festival = str3;
        this.pm25 = i8;
        this.temp = i9;
        this.weatherId = i10;
    }

    public String getCity() {
        return this.city;
    }

    public String getFestival() {
        return this.festival;
    }

    public String getLunar() {
        return this.lunar;
    }

    public int getPm25() {
        return this.pm25;
    }

    public int getSunriseHour() {
        return this.sunriseHour;
    }

    public int getSunriseMinute() {
        return this.sunriseMinute;
    }

    public int getSunsetHour() {
        return this.sunsetHour;
    }

    public int getSunsetMinute() {
        return this.sunsetMinute;
    }

    public int getTemp() {
        return this.temp;
    }

    public int getWeatherId() {
        return this.weatherId;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setFestival(String str) {
        this.festival = str;
    }

    public void setLunar(String str) {
        this.lunar = str;
    }

    public void setPm25(int i8) {
        this.pm25 = i8;
    }

    public void setSunriseHour(int i8) {
        this.sunriseHour = i8;
    }

    public void setSunriseMinute(int i8) {
        this.sunriseMinute = i8;
    }

    public void setSunsetHour(int i8) {
        this.sunsetHour = i8;
    }

    public void setSunsetMinute(int i8) {
        this.sunsetMinute = i8;
    }

    public void setTemp(int i8) {
        this.temp = i8;
    }

    public void setWeatherId(int i8) {
        this.weatherId = i8;
    }

    public String toString() {
        return "CRPTodayWeatherInfo{city='" + this.city + "', lunar='" + this.lunar + "', festival='" + this.festival + "', pm25=" + this.pm25 + ", temp=" + this.temp + ", weatherId=" + this.weatherId + ", sunriseHour=" + this.sunriseHour + ", sunriseMinute=" + this.sunriseMinute + ", sunsetHour=" + this.sunsetHour + ", sunsetMinute=" + this.sunsetMinute + '}';
    }
}
