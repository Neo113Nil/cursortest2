package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class Water {
    private Date date;
    private Integer goalMl;
    private Integer goalOz;
    private Integer grade;
    private Long id;
    private Integer intakeMl;
    private Integer intakeOz;
    private boolean isGoal;
    private Integer percentage;
    private Float sportTime;
    private Integer totalIntakeMl;
    private Integer totalIntakeOz;
    private int type;
    private int waterId;
    private Float weight;

    public Water() {
    }

    public Date getDate() {
        return this.date;
    }

    public Integer getGoalMl() {
        return this.goalMl;
    }

    public Integer getGoalOz() {
        return this.goalOz;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getIntakeMl() {
        return this.intakeMl;
    }

    public Integer getIntakeOz() {
        return this.intakeOz;
    }

    public boolean getIsGoal() {
        return this.isGoal;
    }

    public Integer getPercentage() {
        return this.percentage;
    }

    public Float getSportTime() {
        return this.sportTime;
    }

    public Integer getTotalIntakeMl() {
        return this.totalIntakeMl;
    }

    public Integer getTotalIntakeOz() {
        return this.totalIntakeOz;
    }

    public int getType() {
        return this.type;
    }

    public int getWaterId() {
        return this.waterId;
    }

    public Float getWeight() {
        return this.weight;
    }

    public boolean isGoal() {
        return this.isGoal;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setGoal(boolean z7) {
        this.isGoal = z7;
    }

    public void setGoalMl(Integer num) {
        this.goalMl = num;
    }

    public void setGoalOz(Integer num) {
        this.goalOz = num;
    }

    public void setGrade(Integer num) {
        this.grade = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setIntakeMl(Integer num) {
        this.intakeMl = num;
    }

    public void setIntakeOz(Integer num) {
        this.intakeOz = num;
    }

    public void setIsGoal(boolean z7) {
        this.isGoal = z7;
    }

    public void setPercentage(Integer num) {
        this.percentage = num;
    }

    public void setSportTime(Float f8) {
        this.sportTime = f8;
    }

    public void setTotalIntakeMl(Integer num) {
        this.totalIntakeMl = num;
    }

    public void setTotalIntakeOz(Integer num) {
        this.totalIntakeOz = num;
    }

    public void setType(int i8) {
        this.type = i8;
    }

    public void setWaterId(int i8) {
        this.waterId = i8;
    }

    public void setWeight(Float f8) {
        this.weight = f8;
    }

    public String toGoalString() {
        return "Water{id=" + this.id + ", date=" + this.date + ", isGoal=" + this.isGoal + ", goalMl=" + this.goalMl + ", goalOz=" + this.goalOz + ", totalIntakeMl=" + this.totalIntakeMl + ", totalIntakeOz=" + this.totalIntakeOz + ", sportTime=" + this.sportTime + ", weight=" + this.weight + ", percentage=" + this.percentage + ", grade=" + this.grade + '}';
    }

    public String toIntakeString() {
        return "Water{id=" + this.id + ", date=" + this.date + ", intakeMl=" + this.intakeMl + ", intakeOz=" + this.intakeOz + ", isGoal=" + this.isGoal + '}';
    }

    public String toString() {
        return "Water{id=" + this.id + ", date=" + this.date + ", intakeMl=" + this.intakeMl + ", intakeOz=" + this.intakeOz + ", isGoal=" + this.isGoal + ", goalMl=" + this.goalMl + ", goalOz=" + this.goalOz + ", totalIntakeMl=" + this.totalIntakeMl + ", totalIntakeOz=" + this.totalIntakeOz + ", sportTime=" + this.sportTime + ", weight=" + this.weight + ", percentage=" + this.percentage + ", grade=" + this.grade + '}';
    }

    public Water(Long l8, int i8, int i9, Date date, Integer num, Integer num2, boolean z7, Integer num3, Integer num4, Integer num5, Integer num6, Float f8, Float f9, Integer num7, Integer num8) {
        this.id = l8;
        this.waterId = i8;
        this.type = i9;
        this.date = date;
        this.intakeMl = num;
        this.intakeOz = num2;
        this.isGoal = z7;
        this.goalMl = num3;
        this.goalOz = num4;
        this.totalIntakeMl = num5;
        this.totalIntakeOz = num6;
        this.sportTime = f8;
        this.weight = f9;
        this.percentage = num7;
        this.grade = num8;
    }
}
