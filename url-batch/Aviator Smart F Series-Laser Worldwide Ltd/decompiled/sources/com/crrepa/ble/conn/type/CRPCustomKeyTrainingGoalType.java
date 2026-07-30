package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPCustomKeyTrainingGoalType {
    GOAL_TIME((byte) 0),
    GOAL_CALORIES((byte) 1),
    GOAL_DISTANCE((byte) 2),
    GOAL_VIEW((byte) 3);

    private byte value;

    CRPCustomKeyTrainingGoalType(byte b8) {
        this.value = b8;
    }

    public byte getValue() {
        return this.value;
    }
}
