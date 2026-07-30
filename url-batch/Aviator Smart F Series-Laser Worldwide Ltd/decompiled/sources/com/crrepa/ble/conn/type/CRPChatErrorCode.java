package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPChatErrorCode {
    PERMISSIONS_ERROR((byte) 9),
    VOICE_CONVERSION_ERROR((byte) 10),
    NET_ERROR((byte) 11),
    SERVER_BUSY_ERROR((byte) 12);

    private byte value;

    CRPChatErrorCode(byte b8) {
        this.value = b8;
    }

    public byte getValue() {
        return this.value;
    }
}
