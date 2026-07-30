package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPFutureWeatherInfo {
    private List<FutureBean> future;

    public static class FutureBean {
        private int highTemperature;
        private int lowTemperature;
        private int weatherId;

        public FutureBean() {
        }

        public FutureBean(int i8, int i9, int i10) {
            this.weatherId = i8;
            this.lowTemperature = i9;
            this.highTemperature = i10;
        }

        public int getHighTemperature() {
            return this.highTemperature;
        }

        public int getLowTemperature() {
            return this.lowTemperature;
        }

        public int getWeatherId() {
            return this.weatherId;
        }

        public void setHighTemperature(int i8) {
            this.highTemperature = i8;
        }

        public void setLowTemperature(int i8) {
            this.lowTemperature = i8;
        }

        public void setWeatherId(int i8) {
            this.weatherId = i8;
        }
    }

    public CRPFutureWeatherInfo() {
    }

    public CRPFutureWeatherInfo(List<FutureBean> list) {
        this.future = list;
    }

    public List<FutureBean> getFuture() {
        return this.future;
    }

    public void setFuture(List<FutureBean> list) {
        this.future = list;
    }

    public String toString() {
        return "CRPFutureWeatherInfo{future=" + this.future + '}';
    }
}
