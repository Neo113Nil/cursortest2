package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPConnectKitMessage;

/* loaded from: classes3.dex */
public interface CRPConnectKitListener {
    public static final int ERROR_CODE_COMM_FAIL = 206;
    public static final int ERROR_CODE_COMM_SUCCESS = 207;
    public static final int ERROR_CODE_PING_OTHER = 203;
    public static final int ERROR_CODE_PING_PHONE_APP_NOT_EXIST = 204;
    public static final int ERROR_CODE_PING_PHONE_APP_NOT_RUNNING = 205;
    public static final int ERROR_CODE_PING_WATCH_APP_EXIST_RUNNING = 202;
    public static final int ERROR_CODE_PING_WATCH_APP_NOT_EXIST = 200;
    public static final int ERROR_CODE_PING_WATCH_APP_NOT_RUNNING = 201;

    void onAppPingChanged(boolean z7, CRPConnectKitMessage cRPConnectKitMessage, int i8);

    void onAvailableStorageChanged(int i8);

    void onReceiveMessageChanged(CRPConnectKitMessage cRPConnectKitMessage);

    void onSendMessageChanged(CRPConnectKitMessage cRPConnectKitMessage, int i8);
}
