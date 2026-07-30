package com.moyoung.classes.db;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class ClassesHistory implements Serializable {
    private static final long serialVersionUID = 1;
    private int classesId;
    private String classesJson;
    private String classesTitle;
    private int classesType;
    private Long id;
    private int spentKcal;
    private int spentTime;
    private long startTimestamp;

    public ClassesHistory(Long l8, int i8, int i9, String str, int i10, int i11, long j8, String str2) {
        this.id = l8;
        this.classesId = i8;
        this.classesType = i9;
        this.classesTitle = str;
        this.spentKcal = i10;
        this.spentTime = i11;
        this.startTimestamp = j8;
        this.classesJson = str2;
    }

    public int getClassesId() {
        return this.classesId;
    }

    public String getClassesJson() {
        return this.classesJson;
    }

    public String getClassesTitle() {
        return this.classesTitle;
    }

    public int getClassesType() {
        return this.classesType;
    }

    public Long getId() {
        return this.id;
    }

    public int getSpentKcal() {
        return this.spentKcal;
    }

    public int getSpentTime() {
        return this.spentTime;
    }

    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public void setClassesId(int i8) {
        this.classesId = i8;
    }

    public void setClassesJson(String str) {
        this.classesJson = str;
    }

    public void setClassesTitle(String str) {
        this.classesTitle = str;
    }

    public void setClassesType(int i8) {
        this.classesType = i8;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setSpentKcal(int i8) {
        this.spentKcal = i8;
    }

    public void setSpentTime(int i8) {
        this.spentTime = i8;
    }

    public void setStartTimestamp(long j8) {
        this.startTimestamp = j8;
    }

    public ClassesHistory() {
    }
}
