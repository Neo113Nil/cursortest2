package com.crrepa.band.my.device.cricket.model;

/* loaded from: classes2.dex */
public class CricketTeamEntity {
    private String icon;
    private String id;
    private String name;
    private String over_score;
    private String score;

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getOver_score() {
        return this.over_score;
    }

    public String getScore() {
        return this.score;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOver_score(String str) {
        this.over_score = str;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public String toString() {
        return "CricketTeamModel{icon='" + this.icon + "', name='" + this.name + "', score='" + this.score + "', over_score='" + this.over_score + "', id='" + this.id + "'}";
    }
}
