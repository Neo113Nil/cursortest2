package com.crrepa.band.my.model;

import androidx.annotation.DrawableRes;

/* loaded from: classes2.dex */
public class GpsTrainingModel {

    @DrawableRes
    private int icon;
    private String name;
    private GpsTrainingType type;

    public enum GpsTrainingType {
        INDOOR_WALKING(26),
        INDOOR_RUNNING(27),
        WALKING(30),
        RUNNING(31),
        CYCLING(32),
        TRAIL_RUNNING(33),
        ON_FOOT(34);

        private int value;

        GpsTrainingType(int i8) {
            this.value = i8;
        }

        public static GpsTrainingType getType(int i8) {
            for (GpsTrainingType gpsTrainingType : values()) {
                if (gpsTrainingType.getValue() == i8) {
                    return gpsTrainingType;
                }
            }
            return RUNNING;
        }

        public static boolean isGpsTraining(int i8) {
            for (GpsTrainingType gpsTrainingType : values()) {
                if (gpsTrainingType.getValue() == i8) {
                    return true;
                }
            }
            return false;
        }

        public int getValue() {
            return this.value;
        }
    }

    public GpsTrainingModel(GpsTrainingType gpsTrainingType, int i8, String str) {
        this.type = gpsTrainingType;
        this.icon = i8;
        this.name = str;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public GpsTrainingType getType() {
        return this.type;
    }

    public void setIcon(int i8) {
        this.icon = i8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(GpsTrainingType gpsTrainingType) {
        this.type = gpsTrainingType;
    }
}
