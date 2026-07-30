package com.crrepa.ble.spp.hisilicon.receive.bean;

/* loaded from: classes3.dex */
public class FileRequestInfo {
    private int offset;
    private int taskID;

    public FileRequestInfo(int i8, int i9) {
        this.taskID = i8;
        this.offset = i9;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getTaskID() {
        return this.taskID;
    }

    public String toString() {
        return "FileRequestInfo{taskID=" + this.taskID + ", offset=" + this.offset + '}';
    }
}
