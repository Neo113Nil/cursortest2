package com.crrepa.ble.conn.listener;

/* loaded from: classes3.dex */
public interface CRPA2DPConnectStateListener {

    public enum A2DPConnectState {
        NOT_CONNECTED((byte) 0),
        CONNECTED((byte) 1),
        DISCONNECTED((byte) 2);

        private byte value;

        A2DPConnectState(byte b8) {
            this.value = b8;
        }

        public static A2DPConnectState getInstance(byte b8) {
            if (b8 == 0) {
                return NOT_CONNECTED;
            }
            if (b8 == 1) {
                return CONNECTED;
            }
            if (b8 != 2) {
                return null;
            }
            return DISCONNECTED;
        }

        public byte getValue() {
            return this.value;
        }
    }

    void onConnectState(A2DPConnectState a2DPConnectState);
}
