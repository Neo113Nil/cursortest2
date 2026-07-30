package com.crrepa.band.my.device.appmarket.model;

import com.moyoung.dafit.module.common.utils.l0;
import java.util.List;

/* loaded from: classes2.dex */
public class AppMarketAppDetailResp {
    public int code;
    public Data data;

    public static class AppBean {
        public int adminId;
        public String description;
        public String developer;
        public int download;
        public int id;
        public String intro;
        public String logo;
        public String name;
        public int order;
        public String remark;
        public int status;
    }

    public static class Data {
        public AppBean app;
        public VersionBean version;
    }

    public static class VersionBean {
        public int admin_id;
        public int app_id;
        public String bin;
        public long bin_size;
        public String bundle_name;
        public String changelog;
        public int id;
        public int mcu_id;
        public List<String> preview;
        public String preview_language;
        public long release_time;
        public int screen_resolution_id;
        public int status;
        public int version_code;
        public String version_name;

        public String getBinSizeWithUnit() {
            return l0.getStorageSize(this.bin_size, 2);
        }
    }
}
