package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class CRPRemainDistanceUpdateInfo {
    private int msg_type;
    private int navi_type;
    private String remain_distance;

    public int getMsg_type() {
        return this.msg_type;
    }

    public int getNavi_type() {
        return this.navi_type;
    }

    public String getRemain_distance() {
        return this.remain_distance;
    }

    public void setMsg_type(int i8) {
        this.msg_type = i8;
    }

    public void setNavi_type(int i8) {
        this.navi_type = i8;
    }

    public void setRemain_distance(String str) {
        this.remain_distance = str;
    }

    public String toString() {
        return "CRPRemainDistanceUpdateInfo{msg_type=" + this.msg_type + ", navi_type=" + this.navi_type + ", remain_distance='" + this.remain_distance + "'}";
    }
}
