package com.crrepa.band.my.model.net;

import java.util.List;

/* loaded from: classes2.dex */
public class OpenWeatherForecastEntity {
    private int cnt;
    private String cod;
    private List<ListBean> list;
    private double message;

    public static class ListBean {
        private int dt;
        private int sunrise;
        private int sunset;
        private TempBean temp;
        private List<WeatherBean> weather;

        public static class TempBean {
            private double day;
            private double eve;
            private double max;
            private double min;
            private double morn;
            private double night;

            public double getDay() {
                return this.day;
            }

            public double getEve() {
                return this.eve;
            }

            public double getMax() {
                return this.max;
            }

            public double getMin() {
                return this.min;
            }

            public double getMorn() {
                return this.morn;
            }

            public double getNight() {
                return this.night;
            }

            public void setDay(double d8) {
                this.day = d8;
            }

            public void setEve(double d8) {
                this.eve = d8;
            }

            public void setMax(double d8) {
                this.max = d8;
            }

            public void setMin(double d8) {
                this.min = d8;
            }

            public void setMorn(double d8) {
                this.morn = d8;
            }

            public void setNight(double d8) {
                this.night = d8;
            }
        }

        public static class WeatherBean {
            private String description;
            private String icon;
            private int id;
            private String main;

            public String getDescription() {
                return this.description;
            }

            public String getIcon() {
                return this.icon;
            }

            public int getId() {
                return this.id;
            }

            public String getMain() {
                return this.main;
            }

            public void setDescription(String str) {
                this.description = str;
            }

            public void setIcon(String str) {
                this.icon = str;
            }

            public void setId(int i8) {
                this.id = i8;
            }

            public void setMain(String str) {
                this.main = str;
            }
        }

        public int getDt() {
            return this.dt;
        }

        public int getSunrise() {
            return this.sunrise;
        }

        public int getSunset() {
            return this.sunset;
        }

        public TempBean getTemp() {
            return this.temp;
        }

        public List<WeatherBean> getWeather() {
            return this.weather;
        }

        public void setDt(int i8) {
            this.dt = i8;
        }

        public void setSunrise(int i8) {
            this.sunrise = i8;
        }

        public void setSunset(int i8) {
            this.sunset = i8;
        }

        public void setTemp(TempBean tempBean) {
            this.temp = tempBean;
        }

        public void setWeather(List<WeatherBean> list) {
            this.weather = list;
        }
    }

    public int getCnt() {
        return this.cnt;
    }

    public String getCod() {
        return this.cod;
    }

    public List<ListBean> getList() {
        return this.list;
    }

    public double getMessage() {
        return this.message;
    }

    public void setCnt(int i8) {
        this.cnt = i8;
    }

    public void setCod(String str) {
        this.cod = str;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public void setMessage(double d8) {
        this.message = d8;
    }
}
