package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class CRPRoadGuideTextUpdateInfo {
    private String guide_info;
    private int msg_type;
    private int navi_type;

    public String getGuide_info() {
        return this.guide_info;
    }

    public int getMsg_type() {
        return this.msg_type;
    }

    public int getNavi_type() {
        return this.navi_type;
    }

    public void setGuide_info(String str) {
        this.guide_info = str;
    }

    public void setMsg_type(int i8) {
        this.msg_type = i8;
    }

    public void setNavi_type(int i8) {
        this.navi_type = i8;
    }

    public String toString() {
        return "CRPRoadGuideTextUpdateInfo{msg_type=" + this.msg_type + ", navi_type=" + this.navi_type + ", guide_info='" + this.guide_info + "'}";
    }
}
