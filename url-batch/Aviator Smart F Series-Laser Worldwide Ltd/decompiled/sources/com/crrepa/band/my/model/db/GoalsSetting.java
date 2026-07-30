package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class GoalsSetting {
    private Integer dailyCalories;
    private Integer dailyMinutes;
    private Integer dailySteps;
    private Long id;
    private Integer trainingCalories;
    private Boolean trainingDayEnable;
    private Integer trainingDays;
    private Integer trainingMinutes;
    private Integer trainingSteps;

    public GoalsSetting(Long l8, Integer num, Integer num2, Integer num3, Boolean bool, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.id = l8;
        this.dailySteps = num;
        this.dailyCalories = num2;
        this.dailyMinutes = num3;
        this.trainingDayEnable = bool;
        this.trainingSteps = num4;
        this.trainingCalories = num5;
        this.trainingMinutes = num6;
        this.trainingDays = num7;
    }

    public Integer getDailyCalories() {
        return this.dailyCalories;
    }

    public Integer getDailyMinutes() {
        return this.dailyMinutes;
    }

    public Integer getDailySteps() {
        return this.dailySteps;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getTrainingCalories() {
        return this.trainingCalories;
    }

    public Boolean getTrainingDayEnable() {
        return this.trainingDayEnable;
    }

    public Integer getTrainingDays() {
        return this.trainingDays;
    }

    public Integer getTrainingMinutes() {
        return this.trainingMinutes;
    }

    public Integer getTrainingSteps() {
        return this.trainingSteps;
    }

    public void setDailyCalories(Integer num) {
        this.dailyCalories = num;
    }

    public void setDailyMinutes(Integer num) {
        this.dailyMinutes = num;
    }

    public void setDailySteps(Integer num) {
        this.dailySteps = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setTrainingCalories(Integer num) {
        this.trainingCalories = num;
    }

    public void setTrainingDayEnable(Boolean bool) {
        this.trainingDayEnable = bool;
    }

    public void setTrainingDays(Integer num) {
        this.trainingDays = num;
    }

    public void setTrainingMinutes(Integer num) {
        this.trainingMinutes = num;
    }

    public void setTrainingSteps(Integer num) {
        this.trainingSteps = num;
    }

    public String toString() {
        return "GoalsSetting{id=" + this.id + ", dailySteps=" + this.dailySteps + ", dailyCalories=" + this.dailyCalories + ", dailyMinutes=" + this.dailyMinutes + ", trainingDayEnable=" + this.trainingDayEnable + ", trainingSteps=" + this.trainingSteps + ", trainingCalories=" + this.trainingCalories + ", trainingMinutes=" + this.trainingMinutes + ", trainingDays=" + this.trainingDays + '}';
    }

    public GoalsSetting() {
    }
}
