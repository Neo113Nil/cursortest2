package com.crrepa.band.my.model.db;

import com.crrepa.ble.conn.bean.CRPNapSleepInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class SleepNap {
    private Date date;
    private Long id;
    private String napListJson;

    public SleepNap(Long l8, String str, Date date) {
        this.id = l8;
        this.napListJson = str;
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public Long getId() {
        return this.id;
    }

    public List<CRPNapSleepInfo> getNapList() {
        return (List) new Gson().fromJson(this.napListJson, new TypeToken<List<CRPNapSleepInfo>>() { // from class: com.crrepa.band.my.model.db.SleepNap.1
        }.getType());
    }

    public String getNapListJson() {
        return this.napListJson;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setNapListJson(String str) {
        this.napListJson = str;
    }

    public SleepNap() {
    }

    public void setNapListJson(List<CRPNapSleepInfo> list) {
        this.napListJson = new Gson().toJson(list);
    }
}
