package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPBreathingTrainingInfo {
    private List<BreathingBean> breathingList;
    private int times;
    private BreathingTrainingType type;

    public static class BreathingBean {
        private int seconds;
        private BreathingType type;

        public BreathingBean(BreathingType breathingType, int i8) {
            this.type = breathingType;
            this.seconds = i8;
        }

        public int getSeconds() {
            return this.seconds;
        }

        public BreathingType getType() {
            return this.type;
        }

        public void setSeconds(int i8) {
            this.seconds = i8;
        }

        public void setType(BreathingType breathingType) {
            this.type = breathingType;
        }
    }

    public enum BreathingTrainingType {
        RELAX(0),
        SLEEP(1);

        private int value;

        BreathingTrainingType(int i8) {
            this.value = i8;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum BreathingType {
        BREATHING_INHALE(16),
        BREATHING_HOLD_ON(32),
        BREATHING_EXHALE(48);

        private int value;

        BreathingType(int i8) {
            this.value = i8;
        }

        public int getValue() {
            return this.value;
        }
    }

    public CRPBreathingTrainingInfo(BreathingTrainingType breathingTrainingType, int i8, List<BreathingBean> list) {
        this.type = breathingTrainingType;
        this.times = i8;
        this.breathingList = list;
    }

    public List<BreathingBean> getBreathingList() {
        return this.breathingList;
    }

    public int getTimes() {
        return this.times;
    }

    public BreathingTrainingType getType() {
        return this.type;
    }

    public void setBreathingList(List<BreathingBean> list) {
        this.breathingList = list;
    }

    public void setTimes(int i8) {
        this.times = i8;
    }

    public void setType(BreathingTrainingType breathingTrainingType) {
        this.type = breathingTrainingType;
    }

    public String toString() {
        return "CRPBreathingTrainingInfo{type=" + this.type + ", times=" + this.times + ", breathingList=" + this.breathingList + '}';
    }
}
