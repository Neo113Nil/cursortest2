package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPJieliPhotoWatchFaceInfo {
    private int handX;
    private int handY;
    private int photoCount;
    private List<String> photoList;
    private boolean supportPointer;
    private boolean supportScale;
    private boolean supportSecondHand;
    private int watchHandID;

    public int getHandX() {
        return this.handX;
    }

    public int getHandY() {
        return this.handY;
    }

    public int getPhotoCount() {
        return this.photoCount;
    }

    public List<String> getPhotoList() {
        return this.photoList;
    }

    public int getWatchHandID() {
        return this.watchHandID;
    }

    public boolean isSupportPointer() {
        return this.supportPointer;
    }

    public boolean isSupportScale() {
        return this.supportScale;
    }

    public boolean isSupportSecondHand() {
        return this.supportSecondHand;
    }

    public void setHandX(int i8) {
        this.handX = i8;
    }

    public void setHandY(int i8) {
        this.handY = i8;
    }

    public void setPhotoCount(int i8) {
        this.photoCount = i8;
    }

    public void setPhotoList(List<String> list) {
        this.photoList = list;
    }

    public void setSupportPointer(boolean z7) {
        this.supportPointer = z7;
    }

    public void setSupportScale(boolean z7) {
        this.supportScale = z7;
    }

    public void setSupportSecondHand(boolean z7) {
        this.supportSecondHand = z7;
    }

    public void setWatchHandID(int i8) {
        this.watchHandID = i8;
    }

    public String toString() {
        return "CRPPhotoWatchFaceInfo{photoCount=" + this.photoCount + ", supportHand=" + this.supportPointer + ", supportSecondHand=" + this.supportSecondHand + ", supportScale=" + this.supportScale + ", handX=" + this.handX + ", handYy=" + this.handY + ", photoList=" + this.photoList + ", watchHandID=" + this.watchHandID + '}';
    }
}
