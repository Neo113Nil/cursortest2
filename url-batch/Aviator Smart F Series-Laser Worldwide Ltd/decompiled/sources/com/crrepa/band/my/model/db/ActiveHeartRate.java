package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class ActiveHeartRate {
    private Integer aerobicCount;
    private Integer anaerobicCount;
    private Integer average;
    private String data;
    private Date endDate;
    private Long id;
    private Integer lightCount;
    private Integer maxCount;
    private Integer maxHeartRate;
    private Integer minHeartRate;
    private Date startDate;
    private Integer wightCount;

    public ActiveHeartRate(Long l8, Integer num, String str, Date date, Date date2, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
        this.id = l8;
        this.average = num;
        this.data = str;
        this.startDate = date;
        this.endDate = date2;
        this.minHeartRate = num2;
        this.maxHeartRate = num3;
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

    public String getData() {
        return this.data;
    }

    public Date getEndDate() {
        return this.endDate;
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

    public Date getStartDate() {
        return this.startDate;
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

    public void setData(String str) {
        this.data = str;
    }

    public void setEndDate(Date date) {
        this.endDate = date;
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

    public void setStartDate(Date date) {
        this.startDate = date;
    }

    public void setWightCount(Integer num) {
        this.wightCount = num;
    }

    public ActiveHeartRate() {
    }
}
