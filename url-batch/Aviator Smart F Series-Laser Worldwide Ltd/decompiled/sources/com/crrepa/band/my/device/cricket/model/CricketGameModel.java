package com.crrepa.band.my.device.cricket.model;

import java.util.Date;

/* loaded from: classes2.dex */
public class CricketGameModel {
    private int Id;
    private Date endTime;
    private boolean reserved;
    private String score1;
    private String score2;
    private String startTime;
    private String teamName1;
    private String teamName2;
    private String title;

    public Date getEndTime() {
        return this.endTime;
    }

    public int getId() {
        return this.Id;
    }

    public String getScore1() {
        return this.score1;
    }

    public String getScore2() {
        return this.score2;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getTeamName1() {
        return this.teamName1;
    }

    public String getTeamName2() {
        return this.teamName2;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isReserved() {
        return this.reserved;
    }

    public void setEndTime(Date date) {
        this.endTime = date;
    }

    public void setId(int i8) {
        this.Id = i8;
    }

    public void setReserved(boolean z7) {
        this.reserved = z7;
    }

    public void setScore1(String str) {
        this.score1 = str;
    }

    public void setScore2(String str) {
        this.score2 = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setTeamName1(String str) {
        this.teamName1 = str;
    }

    public void setTeamName2(String str) {
        this.teamName2 = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
