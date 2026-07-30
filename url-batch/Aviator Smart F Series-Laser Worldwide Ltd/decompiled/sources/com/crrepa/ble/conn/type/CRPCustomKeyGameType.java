package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPCustomKeyGameType {
    GAME_2048((byte) 0),
    GAME_BATTLESHIP((byte) 1),
    GAME_HAMSTER((byte) 2),
    GAME_BIRD((byte) 3);

    private byte value;

    CRPCustomKeyGameType(byte b8) {
        this.value = b8;
    }

    public static CRPCustomKeyGameType getInstance(byte b8) {
        if (b8 == 0) {
            return GAME_2048;
        }
        if (b8 == 1) {
            return GAME_BATTLESHIP;
        }
        if (b8 == 2) {
            return GAME_HAMSTER;
        }
        if (b8 != 3) {
            return null;
        }
        return GAME_BIRD;
    }

    public byte getValue() {
        return this.value;
    }
}
