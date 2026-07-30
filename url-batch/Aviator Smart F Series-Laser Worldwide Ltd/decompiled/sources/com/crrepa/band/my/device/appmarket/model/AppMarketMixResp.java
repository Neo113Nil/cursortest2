package com.crrepa.band.my.device.appmarket.model;

import java.util.List;

/* loaded from: classes2.dex */
public class AppMarketMixResp {
    public int code;
    private int hongmeng_store;
    public List<Tag> tags;
    public List<AppMarketAppBean> update_apps;

    public static class Tag {
        public List<AppMarketAppBean> apps;
        public int id;
        public String name;
    }

    public boolean showHongmengStore() {
        return this.hongmeng_store > 0;
    }
}
