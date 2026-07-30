package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPCustomKeyType;

/* loaded from: classes3.dex */
public class CRPCustomKeyInfo {
    public static final byte DISENABLE = 0;
    public static final byte ENABLE = 1;
    private byte goalType;
    private int goalValue;
    private CRPCustomKeyType keyType;
    private byte state;

    public CRPCustomKeyInfo(CRPCustomKeyType cRPCustomKeyType, byte b8) {
        this.keyType = cRPCustomKeyType;
        this.state = b8;
    }

    public byte getGoalType() {
        return this.goalType;
    }

    public int getGoalValue() {
        return this.goalValue;
    }

    public CRPCustomKeyType getKeyType() {
        return this.keyType;
    }

    public byte getState() {
        return this.state;
    }

    public void setGoalType(byte b8) {
        this.goalType = b8;
    }

    public void setGoalValue(int i8) {
        this.goalValue = i8;
    }

    public void setKeyType(CRPCustomKeyType cRPCustomKeyType) {
        this.keyType = cRPCustomKeyType;
    }

    public void setState(byte b8) {
        this.state = b8;
    }

    public String toString() {
        return "CRPCustomKeyInfo{keyType=" + this.keyType + ", state=" + ((int) this.state) + ", goalType=" + ((int) this.goalType) + ", goalValue=" + this.goalValue + '}';
    }
}
