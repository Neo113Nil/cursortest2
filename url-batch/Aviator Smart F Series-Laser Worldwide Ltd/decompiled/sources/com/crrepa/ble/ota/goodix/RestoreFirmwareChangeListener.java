package com.crrepa.ble.ota.goodix;

/* loaded from: classes3.dex */
public interface RestoreFirmwareChangeListener {
    public static final int ERROR_MAX_CONNECT_COUNT = 100003;
    public static final int ERROR_NOT_BOOTINFO = 100004;
    public static final int ERROR_NULL_ADDRESS = 100001;
    public static final int ERROR_NULL_DEVICE = 100002;
    public static final int ERROR_SEND_BOOTINFO = 100005;

    void onComplete();

    void onError(int i8);

    void onReadBootInfo();

    void onSendBootInfo();
}
