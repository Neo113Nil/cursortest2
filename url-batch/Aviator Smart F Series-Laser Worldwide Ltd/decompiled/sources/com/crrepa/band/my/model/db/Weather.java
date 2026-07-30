package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class Weather {
    private String city;
    private Date date;
    private Boolean forecast;
    private Long id;
    private String weather;

    public Weather(Long l8, String str, Date date, String str2, Boolean bool) {
        this.id = l8;
        this.city = str;
        this.date = date;
        this.weather = str2;
        this.forecast = bool;
    }

    public String getCity() {
        return this.city;
    }

    public Date getDate() {
        return this.date;
    }

    public Boolean getForecast() {
        return this.forecast;
    }

    public Long getId() {
        return this.id;
    }

    public String getWeather() {
        return this.weather;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setForecast(Boolean bool) {
        this.forecast = bool;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setWeather(String str) {
        this.weather = str;
    }

    public Weather() {
    }
}
