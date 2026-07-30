package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class CRPRemainTimeUpdateInfo {
    private int msg_type;
    private int navi_type;
    private String remain_time;

    public int getMsg_type() {
        return this.msg_type;
    }

    public int getNavi_type() {
        return this.navi_type;
    }

    public String getRemain_time() {
        return this.remain_time;
    }

    public void setMsg_type(int i8) {
        this.msg_type = i8;
    }

    public void setNavi_type(int i8) {
        this.navi_type = i8;
    }

    public void setRemain_time(String str) {
        this.remain_time = str;
    }

    public String toString() {
        return "CRPRemainTimeUpdateInfo{msg_type=" + this.msg_type + ", navi_type=" + this.navi_type + ", remain_time='" + this.remain_time + "'}";
    }
}
