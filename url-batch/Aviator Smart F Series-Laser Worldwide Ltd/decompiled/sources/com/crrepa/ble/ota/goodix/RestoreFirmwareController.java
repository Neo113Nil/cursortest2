package com.crrepa.ble.ota.goodix;

/* loaded from: classes3.dex */
public class RestoreFirmwareController {
    private RestoreFirmwareControllerImpl controller;
    private RestoreDeviceChangeListener restoreDeviceChangeListener;

    private static class Holder {
        private static RestoreFirmwareController INSTANCE = new RestoreFirmwareController();

        private Holder() {
        }
    }

    private RestoreFirmwareController() {
        this.controller = new RestoreFirmwareControllerImpl();
    }

    public static RestoreFirmwareController getInstance() {
        return Holder.INSTANCE;
    }

    public RestoreDeviceChangeListener getRestoreDeviceChangeListener() {
        return this.restoreDeviceChangeListener;
    }

    public void setListener(RestoreFirmwareChangeListener restoreFirmwareChangeListener) {
        this.controller.setListener(restoreFirmwareChangeListener);
    }

    public void setRestoreDeviceChangeListener(RestoreDeviceChangeListener restoreDeviceChangeListener) {
        this.restoreDeviceChangeListener = restoreDeviceChangeListener;
    }

    public void start(String str) {
        this.controller.start(str);
    }
}
