package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class CRPRouteFarAwayInfo {
    private int msg_type;
    private int navi_type;
    private String yawing_msg;

    public int getMsg_type() {
        return this.msg_type;
    }

    public int getNavi_type() {
        return this.navi_type;
    }

    public String getYawing_msg() {
        return this.yawing_msg;
    }

    public void setMsg_type(int i8) {
        this.msg_type = i8;
    }

    public void setNavi_type(int i8) {
        this.navi_type = i8;
    }

    public void setYawing_msg(String str) {
        this.yawing_msg = str;
    }

    public String toString() {
        return "CRPRouteFarAwayInfo{msg_type=" + this.msg_type + ", navi_type=" + this.navi_type + ", yawing_msg='" + this.yawing_msg + "'}";
    }
}
