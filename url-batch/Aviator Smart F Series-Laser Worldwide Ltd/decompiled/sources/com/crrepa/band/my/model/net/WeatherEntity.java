package com.crrepa.band.my.model.net;

import java.util.List;

/* loaded from: classes2.dex */
public class WeatherEntity {
    private int code;
    private WeatherBean weather;

    public static class WeatherBean {
        private List<FutureBean> future;
        private SkBean sk;
        private TodayBean today;

        public static class FutureBean {
            private String date;
            private InfoBean info;
            private String temperature;
            private WeatherIdBean weather_id;

            public static class InfoBean {
                private List<String> dawn;
                private List<?> day;
                private List<String> night;

                public List<String> getDawn() {
                    return this.dawn;
                }

                public List<?> getDay() {
                    return this.day;
                }

                public List<String> getNight() {
                    return this.night;
                }

                public void setDawn(List<String> list) {
                    this.dawn = list;
                }

                public void setDay(List<?> list) {
                    this.day = list;
                }

                public void setNight(List<String> list) {
                    this.night = list;
                }
            }

            public static class WeatherIdBean {
                private String fa;
                private String fb;

                public String getFa() {
                    return this.fa;
                }

                public String getFb() {
                    return this.fb;
                }

                public void setFa(String str) {
                    this.fa = str;
                }

                public void setFb(String str) {
                    this.fb = str;
                }
            }

            public String getDate() {
                return this.date;
            }

            public InfoBean getInfo() {
                return this.info;
            }

            public String getTemperature() {
                return this.temperature;
            }

            public WeatherIdBean getWeather_id() {
                return this.weather_id;
            }

            public void setDate(String str) {
                this.date = str;
            }

            public void setInfo(InfoBean infoBean) {
                this.info = infoBean;
            }

            public void setTemperature(String str) {
                this.temperature = str;
            }

            public void setWeather_id(WeatherIdBean weatherIdBean) {
                this.weather_id = weatherIdBean;
            }
        }

        public static class SkBean {
            private String festival;
            private String lunar;
            private int pm25;
            private String temp;
            private String time;
            private String weather;
            private String weather_id;

            public String getFestival() {
                return this.festival;
            }

            public String getLunar() {
                return this.lunar;
            }

            public int getPm25() {
                return this.pm25;
            }

            public String getTemp() {
                return this.temp;
            }

            public String getTime() {
                return this.time;
            }

            public String getWeather() {
                return this.weather;
            }

            public String getWeather_id() {
                return this.weather_id;
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

            public void setTemp(String str) {
                this.temp = str;
            }

            public void setTime(String str) {
                this.time = str;
            }

            public void setWeather(String str) {
                this.weather = str;
            }

            public void setWeather_id(String str) {
                this.weather_id = str;
            }
        }

        public static class TodayBean {
            private String city;
            private InfoBean info;

            public static class InfoBean {
                private List<String> dawn;
                private List<?> day;
                private List<String> night;

                public List<String> getDawn() {
                    return this.dawn;
                }

                public List<?> getDay() {
                    return this.day;
                }

                public List<String> getNight() {
                    return this.night;
                }

                public void setDawn(List<String> list) {
                    this.dawn = list;
                }

                public void setDay(List<?> list) {
                    this.day = list;
                }

                public void setNight(List<String> list) {
                    this.night = list;
                }
            }

            public String getCity() {
                return this.city;
            }

            public InfoBean getInfo() {
                return this.info;
            }

            public void setCity(String str) {
                this.city = str;
            }

            public void setInfo(InfoBean infoBean) {
                this.info = infoBean;
            }
        }

        public List<FutureBean> getFuture() {
            return this.future;
        }

        public SkBean getSk() {
            return this.sk;
        }

        public TodayBean getToday() {
            return this.today;
        }

        public void setFuture(List<FutureBean> list) {
            this.future = list;
        }

        public void setSk(SkBean skBean) {
            this.sk = skBean;
        }

        public void setToday(TodayBean todayBean) {
            this.today = todayBean;
        }
    }

    public int getCode() {
        return this.code;
    }

    public WeatherBean getWeather() {
        return this.weather;
    }

    public void setCode(int i8) {
        this.code = i8;
    }

    public void setWeather(WeatherBean weatherBean) {
        this.weather = weatherBean;
    }
}
