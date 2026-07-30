package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPSosInfo {
    private List<String> msgList;

    public CRPSosInfo(List<String> list) {
        this.msgList = list;
    }

    public List<String> getMsgList() {
        return this.msgList;
    }

    public void setMsgList(List<String> list) {
        this.msgList = list;
    }
}
