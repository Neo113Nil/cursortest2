package com.crrepa.band.my.model.net;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class YahooWeatherEntity {
    private MetaBean meta;
    private List<WeathersBean> weathers;

    public static class MetaBean {
        private ConditionMapBean conditionMap;
        private SkycodeBean skycode;

        public static class ConditionMapBean {

            @SerializedName("27")
            private String _$27;

            @SerializedName("28")
            private String _$28;

            @SerializedName("29")
            private String _$29;

            @SerializedName("30")
            private String _$30;

            public String get_$27() {
                return this._$27;
            }

            public String get_$28() {
                return this._$28;
            }

            public String get_$29() {
                return this._$29;
            }

            public String get_$30() {
                return this._$30;
            }

            public void set_$27(String str) {
                this._$27 = str;
            }

            public void set_$28(String str) {
                this._$28 = str;
            }

            public void set_$29(String str) {
                this._$29 = str;
            }

            public void set_$30(String str) {
                this._$30 = str;
            }
        }

        public static class SkycodeBean {

            @SerializedName("27")
            private String _$27;

            @SerializedName("28")
            private String _$28;

            @SerializedName("29")
            private String _$29;

            @SerializedName("30")
            private String _$30;

            public String get_$27() {
                return this._$27;
            }

            public String get_$28() {
                return this._$28;
            }

            public String get_$29() {
                return this._$29;
            }

            public String get_$30() {
                return this._$30;
            }

            public void set_$27(String str) {
                this._$27 = str;
            }

            public void set_$28(String str) {
                this._$28 = str;
            }

            public void set_$29(String str) {
                this._$29 = str;
            }

            public void set_$30(String str) {
                this._$30 = str;
            }
        }

        public ConditionMapBean getConditionMap() {
            return this.conditionMap;
        }

        public SkycodeBean getSkycode() {
            return this.skycode;
        }

        public void setConditionMap(ConditionMapBean conditionMapBean) {
            this.conditionMap = conditionMapBean;
        }

        public void setSkycode(SkycodeBean skycodeBean) {
            this.skycode = skycodeBean;
        }
    }

    public static class WeathersBean {
        private ForecastsBean forecasts;
        private LocationBean location;
        private ObservationBean observation;
        private List<PhotosBean> photos;
        private List<PrecipitationsBean> precipitations;
        private ProviderBean provider;
        private SunAndMoonBean sunAndMoon;
        private String unit;
        private int woeid;

        public static class ForecastsBean {
            private List<DailyBean> daily;
            private List<HourlyBean> hourly;

            public static class DailyBean {
                private int conditionCode;
                private String conditionDescription;
                private List<DayPartTextsBeanX> dayPartTexts;
                private int humidity;
                private LocalTimeBeanXX localTime;
                private ObservationTimeBeanXX observationTime;
                private int precipitationProbability;
                private TemperatureBeanXX temperature;

                public static class DayPartTextsBeanX {
                    private String dayPart;
                    private String text;

                    public String getDayPart() {
                        return this.dayPart;
                    }

                    public String getText() {
                        return this.text;
                    }

                    public void setDayPart(String str) {
                        this.dayPart = str;
                    }

                    public void setText(String str) {
                        this.text = str;
                    }
                }

                public static class LocalTimeBeanXX {
                    private int day;
                    private int hour;
                    private String timestamp;
                    private int weekday;

                    public int getDay() {
                        return this.day;
                    }

                    public int getHour() {
                        return this.hour;
                    }

                    public String getTimestamp() {
                        return this.timestamp;
                    }

                    public int getWeekday() {
                        return this.weekday;
                    }

                    public void setDay(int i8) {
                        this.day = i8;
                    }

                    public void setHour(int i8) {
                        this.hour = i8;
                    }

                    public void setTimestamp(String str) {
                        this.timestamp = str;
                    }

                    public void setWeekday(int i8) {
                        this.weekday = i8;
                    }
                }

                public static class ObservationTimeBeanXX {
                    private int day;
                    private int hour;
                    private String timestamp;
                    private int weekday;

                    public int getDay() {
                        return this.day;
                    }

                    public int getHour() {
                        return this.hour;
                    }

                    public String getTimestamp() {
                        return this.timestamp;
                    }

                    public int getWeekday() {
                        return this.weekday;
                    }

                    public void setDay(int i8) {
                        this.day = i8;
                    }

                    public void setHour(int i8) {
                        this.hour = i8;
                    }

                    public void setTimestamp(String str) {
                        this.timestamp = str;
                    }

                    public void setWeekday(int i8) {
                        this.weekday = i8;
                    }
                }

                public static class TemperatureBeanXX {
                    private int high;
                    private int low;

                    public int getHigh() {
                        return this.high;
                    }

                    public int getLow() {
                        return this.low;
                    }

                    public void setHigh(int i8) {
                        this.high = i8;
                    }

                    public void setLow(int i8) {
                        this.low = i8;
                    }
                }

                public int getConditionCode() {
                    return this.conditionCode;
                }

                public String getConditionDescription() {
                    return this.conditionDescription;
                }

                public List<DayPartTextsBeanX> getDayPartTexts() {
                    return this.dayPartTexts;
                }

                public int getHumidity() {
                    return this.humidity;
                }

                public LocalTimeBeanXX getLocalTime() {
                    return this.localTime;
                }

                public ObservationTimeBeanXX getObservationTime() {
                    return this.observationTime;
                }

                public int getPrecipitationProbability() {
                    return this.precipitationProbability;
                }

                public TemperatureBeanXX getTemperature() {
                    return this.temperature;
                }

                public void setConditionCode(int i8) {
                    this.conditionCode = i8;
                }

                public void setConditionDescription(String str) {
                    this.conditionDescription = str;
                }

                public void setDayPartTexts(List<DayPartTextsBeanX> list) {
                    this.dayPartTexts = list;
                }

                public void setHumidity(int i8) {
                    this.humidity = i8;
                }

                public void setLocalTime(LocalTimeBeanXX localTimeBeanXX) {
                    this.localTime = localTimeBeanXX;
                }

                public void setObservationTime(ObservationTimeBeanXX observationTimeBeanXX) {
                    this.observationTime = observationTimeBeanXX;
                }

                public void setPrecipitationProbability(int i8) {
                    this.precipitationProbability = i8;
                }

                public void setTemperature(TemperatureBeanXX temperatureBeanXX) {
                    this.temperature = temperatureBeanXX;
                }
            }

            public static class HourlyBean {
                private int conditionCode;
                private String conditionDescription;
                private List<?> dayPartTexts;
                private int humidity;
                private LocalTimeBeanX localTime;
                private ObservationTimeBeanX observationTime;
                private int precipitationProbability;
                private TemperatureBeanX temperature;
                private int windDirection;
                private String windDirectionCode;
                private int windSpeed;

                public static class LocalTimeBeanX {
                    private int day;
                    private int hour;
                    private String timestamp;
                    private int weekday;

                    public int getDay() {
                        return this.day;
                    }

                    public int getHour() {
                        return this.hour;
                    }

                    public String getTimestamp() {
                        return this.timestamp;
                    }

                    public int getWeekday() {
                        return this.weekday;
                    }

                    public void setDay(int i8) {
                        this.day = i8;
                    }

                    public void setHour(int i8) {
                        this.hour = i8;
                    }

                    public void setTimestamp(String str) {
                        this.timestamp = str;
                    }

                    public void setWeekday(int i8) {
                        this.weekday = i8;
                    }
                }

                public static class ObservationTimeBeanX {
                    private int day;
                    private int hour;
                    private String timestamp;
                    private int weekday;

                    public int getDay() {
                        return this.day;
                    }

                    public int getHour() {
                        return this.hour;
                    }

                    public String getTimestamp() {
                        return this.timestamp;
                    }

                    public int getWeekday() {
                        return this.weekday;
                    }

                    public void setDay(int i8) {
                        this.day = i8;
                    }

                    public void setHour(int i8) {
                        this.hour = i8;
                    }

                    public void setTimestamp(String str) {
                        this.timestamp = str;
                    }

                    public void setWeekday(int i8) {
                        this.weekday = i8;
                    }
                }

                public static class TemperatureBeanX {
                    private int feelsLike;
                    private int now;

                    public int getFeelsLike() {
                        return this.feelsLike;
                    }

                    public int getNow() {
                        return this.now;
                    }

                    public void setFeelsLike(int i8) {
                        this.feelsLike = i8;
                    }

                    public void setNow(int i8) {
                        this.now = i8;
                    }
                }

                public int getConditionCode() {
                    return this.conditionCode;
                }

                public String getConditionDescription() {
                    return this.conditionDescription;
                }

                public List<?> getDayPartTexts() {
                    return this.dayPartTexts;
                }

                public int getHumidity() {
                    return this.humidity;
                }

                public LocalTimeBeanX getLocalTime() {
                    return this.localTime;
                }

                public ObservationTimeBeanX getObservationTime() {
                    return this.observationTime;
                }

                public int getPrecipitationProbability() {
                    return this.precipitationProbability;
                }

                public TemperatureBeanX getTemperature() {
                    return this.temperature;
                }

                public int getWindDirection() {
                    return this.windDirection;
                }

                public String getWindDirectionCode() {
                    return this.windDirectionCode;
                }

                public int getWindSpeed() {
                    return this.windSpeed;
                }

                public void setConditionCode(int i8) {
                    this.conditionCode = i8;
                }

                public void setConditionDescription(String str) {
                    this.conditionDescription = str;
                }

                public void setDayPartTexts(List<?> list) {
                    this.dayPartTexts = list;
                }

                public void setHumidity(int i8) {
                    this.humidity = i8;
                }

                public void setLocalTime(LocalTimeBeanX localTimeBeanX) {
                    this.localTime = localTimeBeanX;
                }

                public void setObservationTime(ObservationTimeBeanX observationTimeBeanX) {
                    this.observationTime = observationTimeBeanX;
                }

                public void setPrecipitationProbability(int i8) {
                    this.precipitationProbability = i8;
                }

                public void setTemperature(TemperatureBeanX temperatureBeanX) {
                    this.temperature = temperatureBeanX;
                }

                public void setWindDirection(int i8) {
                    this.windDirection = i8;
                }

                public void setWindDirectionCode(String str) {
                    this.windDirectionCode = str;
                }

                public void setWindSpeed(int i8) {
                    this.windSpeed = i8;
                }
            }

            public List<DailyBean> getDaily() {
                return this.daily;
            }

            public List<HourlyBean> getHourly() {
                return this.hourly;
            }

            public void setDaily(List<DailyBean> list) {
                this.daily = list;
            }

            public void setHourly(List<HourlyBean> list) {
                this.hourly = list;
            }
        }

        public static class LocationBean {
            private String countryName;
            private String displayName;
            private double latitude;
            private double longitude;
            private int offsetSecs;
            private int photoWoeid;
            private int woeid;

            public String getCountryName() {
                return this.countryName;
            }

            public String getDisplayName() {
                return this.displayName;
            }

            public double getLatitude() {
                return this.latitude;
            }

            public double getLongitude() {
                return this.longitude;
            }

            public int getOffsetSecs() {
                return this.offsetSecs;
            }

            public int getPhotoWoeid() {
                return this.photoWoeid;
            }

            public int getWoeid() {
                return this.woeid;
            }

            public void setCountryName(String str) {
                this.countryName = str;
            }

            public void setDisplayName(String str) {
                this.displayName = str;
            }

            public void setLatitude(double d8) {
                this.latitude = d8;
            }

            public void setLongitude(double d8) {
                this.longitude = d8;
            }

            public void setOffsetSecs(int i8) {
                this.offsetSecs = i8;
            }

            public void setPhotoWoeid(int i8) {
                this.photoWoeid = i8;
            }

            public void setWoeid(int i8) {
                this.woeid = i8;
            }
        }

        public static class ObservationBean {
            private double barometricPressure;
            private int conditionCode;
            private String conditionDescription;
            private List<DayPartTextsBean> dayPartTexts;
            private int humidity;
            private LocalTimeBean localTime;
            private ObservationTimeBean observationTime;
            private int precipitationProbability;
            private TemperatureBean temperature;
            private String uvDescription;
            private int uvIndex;
            private double visibility;
            private int windDirection;
            private String windDirectionCode;
            private int windSpeed;

            public static class DayPartTextsBean {
                private String dayPart;
                private String text;

                public String getDayPart() {
                    return this.dayPart;
                }

                public String getText() {
                    return this.text;
                }

                public void setDayPart(String str) {
                    this.dayPart = str;
                }

                public void setText(String str) {
                    this.text = str;
                }
            }

            public static class LocalTimeBean {
                private int day;
                private int hour;
                private String timestamp;
                private int weekday;

                public int getDay() {
                    return this.day;
                }

                public int getHour() {
                    return this.hour;
                }

                public String getTimestamp() {
                    return this.timestamp;
                }

                public int getWeekday() {
                    return this.weekday;
                }

                public void setDay(int i8) {
                    this.day = i8;
                }

                public void setHour(int i8) {
                    this.hour = i8;
                }

                public void setTimestamp(String str) {
                    this.timestamp = str;
                }

                public void setWeekday(int i8) {
                    this.weekday = i8;
                }
            }

            public static class ObservationTimeBean {
                private int day;
                private int hour;
                private String timestamp;
                private int weekday;

                public int getDay() {
                    return this.day;
                }

                public int getHour() {
                    return this.hour;
                }

                public String getTimestamp() {
                    return this.timestamp;
                }

                public int getWeekday() {
                    return this.weekday;
                }

                public void setDay(int i8) {
                    this.day = i8;
                }

                public void setHour(int i8) {
                    this.hour = i8;
                }

                public void setTimestamp(String str) {
                    this.timestamp = str;
                }

                public void setWeekday(int i8) {
                    this.weekday = i8;
                }
            }

            public static class TemperatureBean {
                private int feelsLike;
                private int high;
                private int low;
                private int now;

                public int getFeelsLike() {
                    return this.feelsLike;
                }

                public int getHigh() {
                    return this.high;
                }

                public int getLow() {
                    return this.low;
                }

                public int getNow() {
                    return this.now;
                }

                public void setFeelsLike(int i8) {
                    this.feelsLike = i8;
                }

                public void setHigh(int i8) {
                    this.high = i8;
                }

                public void setLow(int i8) {
                    this.low = i8;
                }

                public void setNow(int i8) {
                    this.now = i8;
                }
            }

            public double getBarometricPressure() {
                return this.barometricPressure;
            }

            public int getConditionCode() {
                return this.conditionCode;
            }

            public String getConditionDescription() {
                return this.conditionDescription;
            }

            public List<DayPartTextsBean> getDayPartTexts() {
                return this.dayPartTexts;
            }

            public int getHumidity() {
                return this.humidity;
            }

            public LocalTimeBean getLocalTime() {
                return this.localTime;
            }

            public ObservationTimeBean getObservationTime() {
                return this.observationTime;
            }

            public int getPrecipitationProbability() {
                return this.precipitationProbability;
            }

            public TemperatureBean getTemperature() {
                return this.temperature;
            }

            public String getUvDescription() {
                return this.uvDescription;
            }

            public int getUvIndex() {
                return this.uvIndex;
            }

            public double getVisibility() {
                return this.visibility;
            }

            public int getWindDirection() {
                return this.windDirection;
            }

            public String getWindDirectionCode() {
                return this.windDirectionCode;
            }

            public int getWindSpeed() {
                return this.windSpeed;
            }

            public void setBarometricPressure(double d8) {
                this.barometricPressure = d8;
            }

            public void setConditionCode(int i8) {
                this.conditionCode = i8;
            }

            public void setConditionDescription(String str) {
                this.conditionDescription = str;
            }

            public void setDayPartTexts(List<DayPartTextsBean> list) {
                this.dayPartTexts = list;
            }

            public void setHumidity(int i8) {
                this.humidity = i8;
            }

            public void setLocalTime(LocalTimeBean localTimeBean) {
                this.localTime = localTimeBean;
            }

            public void setObservationTime(ObservationTimeBean observationTimeBean) {
                this.observationTime = observationTimeBean;
            }

            public void setPrecipitationProbability(int i8) {
                this.precipitationProbability = i8;
            }

            public void setTemperature(TemperatureBean temperatureBean) {
                this.temperature = temperatureBean;
            }

            public void setUvDescription(String str) {
                this.uvDescription = str;
            }

            public void setUvIndex(int i8) {
                this.uvIndex = i8;
            }

            public void setVisibility(double d8) {
                this.visibility = d8;
            }

            public void setWindDirection(int i8) {
                this.windDirection = i8;
            }

            public void setWindDirectionCode(String str) {
                this.windDirectionCode = str;
            }

            public void setWindSpeed(int i8) {
                this.windSpeed = i8;
            }
        }

        public static class PhotosBean {
            private String dayOrNight;
            private String id;
            private String owner;
            private String ownerName;
            private List<ResolutionsBean> resolutions;

            public static class ResolutionsBean {
                private int height;
                private String url;
                private int width;

                public int getHeight() {
                    return this.height;
                }

                public String getUrl() {
                    return this.url;
                }

                public int getWidth() {
                    return this.width;
                }

                public void setHeight(int i8) {
                    this.height = i8;
                }

                public void setUrl(String str) {
                    this.url = str;
                }

                public void setWidth(int i8) {
                    this.width = i8;
                }
            }

            public String getDayOrNight() {
                return this.dayOrNight;
            }

            public String getId() {
                return this.id;
            }

            public String getOwner() {
                return this.owner;
            }

            public String getOwnerName() {
                return this.ownerName;
            }

            public List<ResolutionsBean> getResolutions() {
                return this.resolutions;
            }

            public void setDayOrNight(String str) {
                this.dayOrNight = str;
            }

            public void setId(String str) {
                this.id = str;
            }

            public void setOwner(String str) {
                this.owner = str;
            }

            public void setOwnerName(String str) {
                this.ownerName = str;
            }

            public void setResolutions(List<ResolutionsBean> list) {
                this.resolutions = list;
            }
        }

        public static class PrecipitationsBean {
            private int probability;
            private String timeSlot;

            public int getProbability() {
                return this.probability;
            }

            public String getTimeSlot() {
                return this.timeSlot;
            }

            public void setProbability(int i8) {
                this.probability = i8;
            }

            public void setTimeSlot(String str) {
                this.timeSlot = str;
            }
        }

        public static class ProviderBean {
            private String name;

            public String getName() {
                return this.name;
            }

            public void setName(String str) {
                this.name = str;
            }
        }

        public static class SunAndMoonBean {
            private int moonPhase;
            private int sunrise;
            private int sunset;

            public int getMoonPhase() {
                return this.moonPhase;
            }

            public int getSunrise() {
                return this.sunrise;
            }

            public int getSunset() {
                return this.sunset;
            }

            public void setMoonPhase(int i8) {
                this.moonPhase = i8;
            }

            public void setSunrise(int i8) {
                this.sunrise = i8;
            }

            public void setSunset(int i8) {
                this.sunset = i8;
            }
        }

        public ForecastsBean getForecasts() {
            return this.forecasts;
        }

        public LocationBean getLocation() {
            return this.location;
        }

        public ObservationBean getObservation() {
            return this.observation;
        }

        public List<PhotosBean> getPhotos() {
            return this.photos;
        }

        public List<PrecipitationsBean> getPrecipitations() {
            return this.precipitations;
        }

        public ProviderBean getProvider() {
            return this.provider;
        }

        public SunAndMoonBean getSunAndMoon() {
            return this.sunAndMoon;
        }

        public String getUnit() {
            return this.unit;
        }

        public int getWoeid() {
            return this.woeid;
        }

        public void setForecasts(ForecastsBean forecastsBean) {
            this.forecasts = forecastsBean;
        }

        public void setLocation(LocationBean locationBean) {
            this.location = locationBean;
        }

        public void setObservation(ObservationBean observationBean) {
            this.observation = observationBean;
        }

        public void setPhotos(List<PhotosBean> list) {
            this.photos = list;
        }

        public void setPrecipitations(List<PrecipitationsBean> list) {
            this.precipitations = list;
        }

        public void setProvider(ProviderBean providerBean) {
            this.provider = providerBean;
        }

        public void setSunAndMoon(SunAndMoonBean sunAndMoonBean) {
            this.sunAndMoon = sunAndMoonBean;
        }

        public void setUnit(String str) {
            this.unit = str;
        }

        public void setWoeid(int i8) {
            this.woeid = i8;
        }
    }

    public MetaBean getMeta() {
        return this.meta;
    }

    public List<WeathersBean> getWeathers() {
        return this.weathers;
    }

    public void setMeta(MetaBean metaBean) {
        this.meta = metaBean;
    }

    public void setWeathers(List<WeathersBean> list) {
        this.weathers = list;
    }
}
