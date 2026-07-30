package com.crrepa.band.my.model;

import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.Map;

/* loaded from: classes2.dex */
public class CalendarHistoryCompletionModel {
    public static final int BO_COMPLETION_TYPE = 5;
    public static final int GOMORE_SPORT_EXERCISE_CAPACITY_TYPE = 7;
    public static final int GOMORE_SPORT_TRAINING_ANALYSIS_TYPE = 8;
    public static final int GOMORE_SPORT_TRAINING_RECOVERY_TYPE = 9;
    public static final int HEART_RATE_COMPLETION_TYPE = 3;
    public static final int SLEEP_COMPLETION_TYPE = 2;
    public static final int STEP_COMPLETION_TYPE = 1;
    public static final int STRESS_COMPLETION_TYPE = 6;
    public static final int TEMP_COMPLETION_TYPE = 4;
    private Map<Long, MonthCompletion> monthCompletions;
    private Date startDate;
    private int type;

    public static class MonthCompletion {
        private Map<Integer, Float> completions;

        public Map<Integer, Float> getCompletions() {
            return this.completions;
        }

        public void setCompletions(Map<Integer, Float> map) {
            this.completions = map;
        }
    }

    public Map<Long, MonthCompletion> getMonthCompletions() {
        return this.monthCompletions;
    }

    public Map<Integer, Float> getMonthStepCompletion(Date date) {
        if (this.monthCompletions == null) {
            return null;
        }
        MonthCompletion monthCompletion = this.monthCompletions.get(Long.valueOf(m.getMonthNumber(date)));
        if (monthCompletion == null) {
            return null;
        }
        return monthCompletion.getCompletions();
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public int getType() {
        return this.type;
    }

    public void setMonthCompletions(Map<Long, MonthCompletion> map) {
        this.monthCompletions = map;
    }

    public void setStartDate(Date date) {
        this.startDate = date;
    }

    public void setType(int i8) {
        this.type = i8;
    }
}
