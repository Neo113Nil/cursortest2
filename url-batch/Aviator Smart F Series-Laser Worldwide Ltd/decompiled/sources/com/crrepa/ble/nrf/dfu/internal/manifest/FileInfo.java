package com.crrepa.ble.nrf.dfu.internal.manifest;

import i4.c;

/* loaded from: classes3.dex */
public class FileInfo {

    @c("bin_file")
    private String binFile;

    @c("dat_file")
    private String datFile;

    public String getBinFileName() {
        return this.binFile;
    }

    public String getDatFileName() {
        return this.datFile;
    }
}
