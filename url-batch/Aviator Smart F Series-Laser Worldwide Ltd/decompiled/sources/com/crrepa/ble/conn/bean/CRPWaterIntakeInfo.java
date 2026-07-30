package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPWaterIntakeInfo {
    private int hour;
    private int id;
    private int minutes;
    private WaterIntakeType type;
    private int waterIntake;

    public enum WaterIntakeType {
        WATCH((byte) 1),
        PHONE((byte) 0);

        private byte value;

        WaterIntakeType(byte b8) {
            this.value = b8;
        }

        public static WaterIntakeType getInstance(byte b8) {
            if (b8 == 0) {
                return PHONE;
            }
            if (b8 != 1) {
                return null;
            }
            return WATCH;
        }

        public byte getValue() {
            return this.value;
        }
    }

    public CRPWaterIntakeInfo() {
    }

    public CRPWaterIntakeInfo(int i8, WaterIntakeType waterIntakeType, int i9, int i10, int i11) {
        this.id = i8;
        this.type = waterIntakeType;
        this.hour = i9;
        this.minutes = i10;
        this.waterIntake = i11;
    }

    public int getHour() {
        return this.hour;
    }

    public int getId() {
        return this.id;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public WaterIntakeType getType() {
        return this.type;
    }

    public int getWaterIntake() {
        return this.waterIntake;
    }

    public void setHour(int i8) {
        this.hour = i8;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setMinutes(int i8) {
        this.minutes = i8;
    }

    public void setType(WaterIntakeType waterIntakeType) {
        this.type = waterIntakeType;
    }

    public void setWaterIntake(int i8) {
        this.waterIntake = i8;
    }

    public String toString() {
        return "CRPWaterIntakeInfo{id=" + this.id + ", type=" + this.type + ", hour=" + this.hour + ", minutes=" + this.minutes + ", waterIntake=" + this.waterIntake + '}';
    }
}
