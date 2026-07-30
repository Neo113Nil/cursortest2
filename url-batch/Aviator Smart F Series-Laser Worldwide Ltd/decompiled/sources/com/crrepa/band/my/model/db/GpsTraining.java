package com.crrepa.band.my.model.db;

import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.model.GpsTrainingModel;
import java.util.Date;

/* loaded from: classes2.dex */
public class GpsTraining {
    private Integer aerobicSeconds;
    private String altitudeListJson;
    private Integer anaerobicSeconds;
    private Integer averageStepFrequency;
    private Float averageStepLength;
    private Float calorie;
    private Integer distance;
    private Float elevation;
    private Boolean encrypt;
    private Date endDate;
    private String filePath;
    private Integer heartRate;
    private String hrList;
    private Long id;
    private Integer interval;
    private Integer lightSeconds;
    private Integer maxHr;
    private Integer maxSeconds;
    private Integer minHr;
    private Integer nowTemperature;
    private Integer nowTemperatureUnit;
    private String oneKmPaceList;
    private String oneMilePaceList;
    private String realTimePaceList;
    private Date startDate;
    private Integer step;
    private String stepFrequencyList;
    private String stepLengthList;
    private String trainingAdvancedInfoJson;
    private Integer trainingSeconds;
    private Integer trainingType;
    private String twoSecondsAltitudeList;
    private Integer type;
    private Integer weatherCode;
    private Integer weightSeconds;

    public GpsTraining(Long l8, Date date, Date date2, Integer num, Float f8, Integer num2, Integer num3, String str, Boolean bool, Integer num4, Integer num5, Float f9, Integer num6, Integer num7, String str2, Float f10, String str3, String str4, String str5, String str6, String str7, String str8, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, String str9, String str10) {
        this.id = l8;
        this.startDate = date;
        this.endDate = date2;
        this.distance = num;
        this.calorie = f8;
        this.step = num2;
        this.heartRate = num3;
        this.filePath = str;
        this.encrypt = bool;
        this.type = num4;
        this.trainingType = num5;
        this.elevation = f9;
        this.trainingSeconds = num6;
        this.averageStepFrequency = num7;
        this.stepFrequencyList = str2;
        this.averageStepLength = f10;
        this.stepLengthList = str3;
        this.twoSecondsAltitudeList = str4;
        this.realTimePaceList = str5;
        this.oneKmPaceList = str6;
        this.oneMilePaceList = str7;
        this.hrList = str8;
        this.minHr = num8;
        this.maxHr = num9;
        this.lightSeconds = num10;
        this.weightSeconds = num11;
        this.aerobicSeconds = num12;
        this.anaerobicSeconds = num13;
        this.maxSeconds = num14;
        this.interval = num15;
        this.nowTemperature = num16;
        this.nowTemperatureUnit = num17;
        this.weatherCode = num18;
        this.altitudeListJson = str9;
        this.trainingAdvancedInfoJson = str10;
    }

    public Integer getAerobicSeconds() {
        Integer num = this.aerobicSeconds;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public String getAltitudeListJson() {
        return this.altitudeListJson;
    }

    public Integer getAnaerobicSeconds() {
        Integer num = this.anaerobicSeconds;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public Integer getAverageStepFrequency() {
        Integer num = this.averageStepFrequency;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public Float getAverageStepLength() {
        Float f8 = this.averageStepLength;
        return Float.valueOf(f8 == null ? 0.0f : f8.floatValue());
    }

    public Float getCalorie() {
        return this.calorie;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public Float getElevation() {
        return this.elevation;
    }

    public Boolean getEncrypt() {
        Boolean bool = this.encrypt;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public Integer getHeartRate() {
        return this.heartRate;
    }

    public String getHrList() {
        String str = this.hrList;
        return str == null ? "" : str;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getInterval() {
        return this.interval;
    }

    public Integer getLightSeconds() {
        Integer num = this.lightSeconds;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public Integer getMaxHr() {
        Integer num = this.maxHr;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public Integer getMaxSeconds() {
        Integer num = this.maxSeconds;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public Integer getMinHr() {
        Integer num = this.minHr;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public Integer getNowTemperature() {
        return this.nowTemperature;
    }

    public Integer getNowTemperatureUnit() {
        return this.nowTemperatureUnit;
    }

    public String getOneKmPaceList() {
        return this.oneKmPaceList;
    }

    public String getOneMilePaceList() {
        return this.oneMilePaceList;
    }

    public String getRealTimePaceList() {
        return this.realTimePaceList;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public Integer getStep() {
        return this.step;
    }

    public String getStepFrequencyList() {
        String str = this.stepFrequencyList;
        return str == null ? "" : str;
    }

    public String getStepLengthList() {
        String str = this.stepLengthList;
        return str == null ? "" : str;
    }

    public String getTrainingAdvancedInfoJson() {
        return this.trainingAdvancedInfoJson;
    }

    public Integer getTrainingSeconds() {
        Integer num = this.trainingSeconds;
        if (num != null) {
            return num;
        }
        long time = this.endDate.getTime() - this.startDate.getTime();
        return time < 10000 ? Integer.valueOf((int) time) : Integer.valueOf((int) (time / 1000));
    }

    public Integer getTrainingType() {
        Integer num = this.trainingType;
        return Integer.valueOf(num == null ? GpsTrainingModel.GpsTrainingType.RUNNING.getValue() : num.intValue());
    }

    public String getTwoSecondsAltitudeList() {
        return this.twoSecondsAltitudeList;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getWeatherCode() {
        return this.weatherCode;
    }

    public Integer getWeightSeconds() {
        Integer num = this.weightSeconds;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public boolean isBandGps() {
        return this.type.intValue() == 241;
    }

    public void setAerobicSeconds(Integer num) {
        this.aerobicSeconds = num;
    }

    public void setAltitudeListJson(String str) {
        this.altitudeListJson = str;
    }

    public void setAnaerobicSeconds(Integer num) {
        this.anaerobicSeconds = num;
    }

    public void setAverageStepFrequency(Integer num) {
        this.averageStepFrequency = num;
    }

    public void setAverageStepLength(Float f8) {
        this.averageStepLength = f8;
    }

    public void setCalorie(Float f8) {
        this.calorie = f8;
    }

    public void setDistance(Integer num) {
        this.distance = num;
    }

    public void setElevation(Float f8) {
        this.elevation = f8;
    }

    public void setEncrypt(Boolean bool) {
        this.encrypt = bool;
    }

    public void setEndDate(Date date) {
        this.endDate = date;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setHeartRate(Integer num) {
        this.heartRate = num;
    }

    public void setHrList(String str) {
        this.hrList = str;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setInterval(Integer num) {
        this.interval = num;
    }

    public void setLightSeconds(Integer num) {
        this.lightSeconds = num;
    }

    public void setMaxHr(Integer num) {
        this.maxHr = num;
    }

    public void setMaxSeconds(Integer num) {
        this.maxSeconds = num;
    }

    public void setMinHr(Integer num) {
        this.minHr = num;
    }

    public void setNowTemperature(Integer num) {
        this.nowTemperature = num;
    }

    public void setNowTemperatureUnit(Integer num) {
        this.nowTemperatureUnit = num;
    }

    public void setOneKmPaceList(String str) {
        this.oneKmPaceList = str;
    }

    public void setOneMilePaceList(String str) {
        this.oneMilePaceList = str;
    }

    public void setRealTimePaceList(String str) {
        this.realTimePaceList = str;
        Log.d("tenSecondsDistance", "realTimePaceList=" + str);
    }

    public void setStartDate(Date date) {
        this.startDate = date;
    }

    public void setStep(Integer num) {
        this.step = num;
    }

    public void setStepFrequencyList(String str) {
        this.stepFrequencyList = str;
    }

    public void setStepLengthList(String str) {
        this.stepLengthList = str;
    }

    public void setTrainingAdvancedInfoJson(String str) {
        this.trainingAdvancedInfoJson = str;
    }

    public void setTrainingSeconds(Integer num) {
        this.trainingSeconds = num;
    }

    public void setTrainingType(Integer num) {
        this.trainingType = num;
    }

    public void setTwoSecondsAltitudeList(String str) {
        this.twoSecondsAltitudeList = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setWeatherCode(Integer num) {
        this.weatherCode = num;
    }

    public void setWeightSeconds(Integer num) {
        this.weightSeconds = num;
    }

    @NonNull
    public String toString() {
        return "GpsTraining{id=" + this.id + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", distance=" + this.distance + ", calorie=" + this.calorie + ", step=" + this.step + ", heartRate=" + this.heartRate + ", filePath='" + this.filePath + "', encrypt=" + this.encrypt + ", type=" + this.type + ", trainingType=" + this.trainingType + ", elevation=" + this.elevation + ", trainingSeconds=" + this.trainingSeconds + ", averageStepFrequency=" + this.averageStepFrequency + ", stepFrequencyList='" + this.stepFrequencyList + "', averageStepLength=" + this.averageStepLength + ", stepLengthList='" + this.stepLengthList + "', twoSecondsAltitudeList='" + this.twoSecondsAltitudeList + "', realTimePaceList='" + this.realTimePaceList + "', oneKmPaceList='" + this.oneKmPaceList + "', oneMilePaceList='" + this.oneMilePaceList + "', hrList='" + this.hrList + "', minHr=" + this.minHr + ", maxHr=" + this.maxHr + ", lightSeconds=" + this.lightSeconds + ", weightSeconds=" + this.weightSeconds + ", aerobicSeconds=" + this.aerobicSeconds + ", anaerobicSeconds=" + this.anaerobicSeconds + ", maxSeconds=" + this.maxSeconds + ", interval=" + this.interval + ", nowTemperature=" + this.nowTemperature + ", nowTemperatureUnit=" + this.nowTemperatureUnit + ", weatherCode=" + this.weatherCode + ", altitudeListJson='" + this.altitudeListJson + "', trainingAdvancedInfoJson='" + this.trainingAdvancedInfoJson + "'}";
    }

    public GpsTraining() {
        this.weatherCode = -1;
    }
}
