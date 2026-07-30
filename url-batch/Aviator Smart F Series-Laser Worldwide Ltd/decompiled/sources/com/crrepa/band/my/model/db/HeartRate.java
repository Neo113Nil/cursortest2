package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class HeartRate {
    private Integer aerobicCount;
    private Integer anaerobicCount;
    private Integer average;
    private Date date;
    private String heartRate;
    private Long id;
    private Integer lightCount;
    private Integer maxCount;
    private Integer maxHeartRate;
    private Integer minHeartRate;
    private Integer wightCount;

    public HeartRate(Long l8, Date date, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
        this.id = l8;
        this.date = date;
        this.heartRate = str;
        this.minHeartRate = num;
        this.maxHeartRate = num2;
        this.average = num3;
        this.lightCount = num4;
        this.wightCount = num5;
        this.aerobicCount = num6;
        this.anaerobicCount = num7;
        this.maxCount = num8;
    }

    public Integer getAerobicCount() {
        return this.aerobicCount;
    }

    public Integer getAnaerobicCount() {
        return this.anaerobicCount;
    }

    public Integer getAverage() {
        return this.average;
    }

    public Date getDate() {
        return this.date;
    }

    public String getHeartRate() {
        return this.heartRate;
    }

    public Long getId() {
        return this.id;
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

    public Integer getWightCount() {
        return this.wightCount;
    }

    public void setAerobicCount(Integer num) {
        this.aerobicCount = num;
    }

    public void setAnaerobicCount(Integer num) {
        this.anaerobicCount = num;
    }

    public void setAverage(Integer num) {
        this.average = num;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHeartRate(String str) {
        this.heartRate = str;
    }

    public void setId(Long l8) {
        this.id = l8;
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

    public void setWightCount(Integer num) {
        this.wightCount = num;
    }

    public HeartRate() {
    }
}
