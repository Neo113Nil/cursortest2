package com.crrepa.band.my.device.appmarket.model;

import com.moyoung.dafit.module.common.utils.l0;

/* loaded from: classes2.dex */
public class AppMarketAppVersionBean {
    public int app_id;
    public String bin;
    public long bin_size;
    public String bundle_name;
    public int id;
    public int status;
    public int version_code;
    public String version_name;

    public String getBinSizeWithUnit() {
        return l0.getStorageSize(this.bin_size, 2);
    }
}
