package com.crrepa.band.my.model.net;

import java.util.List;

/* loaded from: classes2.dex */
public class OpenWeatherEntity {
    private String base;
    private int cod;
    private int dt;
    private int id;
    private MainBean main;
    private String name;
    private SysBean sys;
    private int timezone;
    private int visibility;
    private List<WeatherBean> weather;

    public static class MainBean {
        private double feels_like;
        private double temp;
        private double temp_max;
        private double temp_min;

        public double getFeels_like() {
            return this.feels_like;
        }

        public double getTemp() {
            return this.temp;
        }

        public double getTemp_max() {
            return this.temp_max;
        }

        public double getTemp_min() {
            return this.temp_min;
        }

        public void setFeels_like(double d8) {
            this.feels_like = d8;
        }

        public void setTemp(double d8) {
            this.temp = d8;
        }

        public void setTemp_max(double d8) {
            this.temp_max = d8;
        }

        public void setTemp_min(double d8) {
            this.temp_min = d8;
        }

        public String toString() {
            return "MainBean{temp=" + this.temp + ", feels_like=" + this.feels_like + ", temp_min=" + this.temp_min + ", temp_max=" + this.temp_max + '}';
        }
    }

    public static class SysBean {
        private String country;
        private int id;
        private int sunrise;
        private int sunset;
        private int type;

        public String getCountry() {
            return this.country;
        }

        public int getId() {
            return this.id;
        }

        public int getSunrise() {
            return this.sunrise;
        }

        public int getSunset() {
            return this.sunset;
        }

        public int getType() {
            return this.type;
        }

        public void setCountry(String str) {
            this.country = str;
        }

        public void setId(int i8) {
            this.id = i8;
        }

        public void setSunrise(int i8) {
            this.sunrise = i8;
        }

        public void setSunset(int i8) {
            this.sunset = i8;
        }

        public void setType(int i8) {
            this.type = i8;
        }

        public String toString() {
            return "SysBean{type=" + this.type + ", id=" + this.id + ", country='" + this.country + "', sunrise=" + this.sunrise + ", sunset=" + this.sunset + '}';
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

        public String toString() {
            return "WeatherBean{id=" + this.id + ", main='" + this.main + "', description='" + this.description + "', icon='" + this.icon + "'}";
        }
    }

    public String getBase() {
        return this.base;
    }

    public int getCod() {
        return this.cod;
    }

    public int getDt() {
        return this.dt;
    }

    public int getId() {
        return this.id;
    }

    public MainBean getMain() {
        return this.main;
    }

    public String getName() {
        return this.name;
    }

    public SysBean getSys() {
        return this.sys;
    }

    public int getTimezone() {
        return this.timezone;
    }

    public int getVisibility() {
        return this.visibility;
    }

    public List<WeatherBean> getWeather() {
        return this.weather;
    }

    public void setBase(String str) {
        this.base = str;
    }

    public void setCod(int i8) {
        this.cod = i8;
    }

    public void setDt(int i8) {
        this.dt = i8;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setMain(MainBean mainBean) {
        this.main = mainBean;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSys(SysBean sysBean) {
        this.sys = sysBean;
    }

    public void setTimezone(int i8) {
        this.timezone = i8;
    }

    public void setVisibility(int i8) {
        this.visibility = i8;
    }

    public void setWeather(List<WeatherBean> list) {
        this.weather = list;
    }

    public String toString() {
        return "OpenWeatherEntity{weather=" + this.weather + ", base='" + this.base + "', main=" + this.main + ", visibility=" + this.visibility + ", dt=" + this.dt + ", sys=" + this.sys + ", timezone=" + this.timezone + ", id=" + this.id + ", name='" + this.name + "', cod=" + this.cod + '}';
    }
}
