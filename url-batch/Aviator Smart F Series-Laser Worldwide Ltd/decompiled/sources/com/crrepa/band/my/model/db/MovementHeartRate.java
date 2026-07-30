package com.crrepa.band.my.model.db;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class MovementHeartRate {
    private Integer aerobicCount;
    private String altitudeListJson;
    private Integer anaerobicCount;
    private Integer average;
    private Float calories;
    private Float distance;
    private String distanceArray;
    private Long endTime;
    private String heartRates;
    private Integer interval;
    private Integer lightCount;
    private Integer maxCount;
    private Integer maxHeartRate;
    private Integer minHeartRate;
    private Float pace;
    private Boolean repeated;
    private Float speed;
    private Long startTime;
    private Integer steps;
    private String stepsArray;
    private String trainingAdvancedInfoJson;
    private Integer trainingSeconds;
    private Integer type;
    private Integer validTimes;
    private Integer wightCount;

    public MovementHeartRate(Long l8, Long l9, Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Float f8, Float f9, Float f10, Float f11, Boolean bool, String str2, String str3, String str4, String str5) {
        this.startTime = l8;
        this.endTime = l9;
        this.trainingSeconds = num;
        this.validTimes = num2;
        this.type = num3;
        this.interval = num4;
        this.heartRates = str;
        this.minHeartRate = num5;
        this.maxHeartRate = num6;
        this.average = num7;
        this.lightCount = num8;
        this.wightCount = num9;
        this.aerobicCount = num10;
        this.anaerobicCount = num11;
        this.maxCount = num12;
        this.steps = num13;
        this.distance = f8;
        this.calories = f9;
        this.speed = f10;
        this.pace = f11;
        this.repeated = bool;
        this.altitudeListJson = str2;
        this.trainingAdvancedInfoJson = str3;
        this.stepsArray = str4;
        this.distanceArray = str5;
    }

    public Integer getAerobicCount() {
        return this.aerobicCount;
    }

    public String getAltitudeListJson() {
        return this.altitudeListJson;
    }

    public Integer getAnaerobicCount() {
        return this.anaerobicCount;
    }

    public Integer getAverage() {
        return this.average;
    }

    public Float getCalories() {
        return this.calories;
    }

    public Float getDistance() {
        return this.distance;
    }

    public String getDistanceArray() {
        return this.distanceArray;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public String getHeartRates() {
        return this.heartRates;
    }

    public Integer getInterval() {
        Integer num = this.interval;
        return Integer.valueOf(num == null ? 60 : num.intValue());
    }

    public Integer getLightCount() {
        return this.lightCount;
    }

    public Integer getMaxCount() {
        return this.maxCount;
    }

    public Integer getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public Integer getMinHeartRate() {
        return this.minHeartRate;
    }

    public Float getPace() {
        return this.pace;
    }

    public Boolean getRepeated() {
        Boolean bool = this.repeated;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    public Float getSpeed() {
        return this.speed;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public Integer getSteps() {
        return this.steps;
    }

    public String getStepsArray() {
        return this.stepsArray;
    }

    public String getTrainingAdvancedInfoJson() {
        return this.trainingAdvancedInfoJson;
    }

    public Integer getTrainingSeconds() {
        Integer num = this.trainingSeconds;
        return num == null ? Integer.valueOf(this.validTimes.intValue() * 60) : num;
    }

    public Integer getTrainingTime() {
        Integer num = this.trainingSeconds;
        return num == null ? Integer.valueOf(this.validTimes.intValue() * 60) : num;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getValidTimes() {
        return this.validTimes;
    }

    public Integer getWightCount() {
        return this.wightCount;
    }

    public void setAerobicCount(Integer num) {
        this.aerobicCount = num;
    }

    public void setAltitudeListJson(String str) {
        this.altitudeListJson = str;
    }

    public void setAnaerobicCount(Integer num) {
        this.anaerobicCount = num;
    }

    public void setAverage(Integer num) {
        this.average = num;
    }

    public void setCalories(Float f8) {
        this.calories = f8;
    }

    public void setDistance(Float f8) {
        this.distance = f8;
    }

    public void setDistanceArray(String str) {
        this.distanceArray = str;
    }

    public void setEndTime(Long l8) {
        this.endTime = l8;
    }

    public void setHeartRates(String str) {
        this.heartRates = str;
    }

    public void setInterval(Integer num) {
        this.interval = num;
    }

    public void setLightCount(Integer num) {
        this.lightCount = num;
    }

    public void setMaxCount(Integer num) {
        this.maxCount = num;
    }

    public void setMaxHeartRate(Integer num) {
        this.maxHeartRate = num;
    }

    public void setMinHeartRate(Integer num) {
        this.minHeartRate = num;
    }

    public void setPace(Float f8) {
        this.pace = f8;
    }

    public void setRepeated(Boolean bool) {
        this.repeated = bool;
    }

    public void setSpeed(Float f8) {
        this.speed = f8;
    }

    public void setStartTime(Long l8) {
        this.startTime = l8;
    }

    public void setSteps(Integer num) {
        this.steps = num;
    }

    public void setStepsArray(String str) {
        this.stepsArray = str;
    }

    public void setTrainingAdvancedInfoJson(String str) {
        this.trainingAdvancedInfoJson = str;
    }

    public void setTrainingSeconds(Integer num) {
        this.trainingSeconds = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setValidTimes(Integer num) {
        this.validTimes = num;
    }

    public void setWightCount(Integer num) {
        this.wightCount = num;
    }

    @NonNull
    public String toString() {
        return "MovementHeartRate{startTime=" + this.startTime + ", endTime=" + this.endTime + ", trainingSeconds=" + this.trainingSeconds + ", validTimes=" + this.validTimes + ", type=" + this.type + ", interval=" + this.interval + ", heartRates=" + this.heartRates + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", average=" + this.average + ", lightCount=" + this.lightCount + ", wightCount=" + this.wightCount + ", aerobicCount=" + this.aerobicCount + ", anaerobicCount=" + this.anaerobicCount + ", maxCount=" + this.maxCount + ", steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + ", speed=" + this.speed + ", pace=" + this.pace + ", repeated=" + this.repeated + ", altitudeListJson=" + this.altitudeListJson + ", trainingAdvancedInfoJson=" + this.trainingAdvancedInfoJson + ", stepsArray=" + this.stepsArray + ", distanceArray=" + this.distanceArray + '}';
    }

    public MovementHeartRate() {
    }
}
