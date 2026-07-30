package com.crrepa.ble.nrf.dfu.internal.manifest;

import i4.c;

/* loaded from: classes3.dex */
public class SoftDeviceBootloaderFileInfo extends FileInfo {

    @c("bl_size")
    private int bootloaderSize;

    @c("sd_size")
    private int softdeviceSize;

    public int getBootloaderSize() {
        return this.bootloaderSize;
    }

    public int getSoftdeviceSize() {
        return this.softdeviceSize;
    }
}
