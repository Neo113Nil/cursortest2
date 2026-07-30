package com.crrepa.band.my.home.training.model;

/* loaded from: classes2.dex */
public class HomeWeatherEvent {
    private final int nowTemperature;
    private final int weatherCode;

    public HomeWeatherEvent(int i8, int i9) {
        this.nowTemperature = i8;
        this.weatherCode = i9;
    }

    public int getNowTemperature() {
        return this.nowTemperature;
    }

    public int getWeatherCode() {
        return this.weatherCode;
    }
}
