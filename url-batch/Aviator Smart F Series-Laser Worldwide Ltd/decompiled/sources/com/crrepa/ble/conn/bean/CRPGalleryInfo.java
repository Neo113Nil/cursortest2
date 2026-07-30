package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPGalleryInfo {
    private int availableSize;
    private int height;
    private int maxPhotoCount;
    private int photoCount;
    private List<String> photoList;
    private int width;

    public int getAvailableSize() {
        return this.availableSize;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxPhotoCount() {
        return this.maxPhotoCount;
    }

    public int getPhotoCount() {
        return this.photoCount;
    }

    public List<String> getPhotoList() {
        return this.photoList;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAvailableSize(int i8) {
        this.availableSize = i8;
    }

    public void setHeight(int i8) {
        this.height = i8;
    }

    public void setMaxPhotoCount(int i8) {
        this.maxPhotoCount = i8;
    }

    public void setPhotoCount(int i8) {
        this.photoCount = i8;
    }

    public void setPhotoList(List<String> list) {
        this.photoList = list;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }

    public String toString() {
        return "CRPGalleryInfo{width=" + this.width + ", height=" + this.height + ", photoCount=" + this.photoCount + ", availableSize=" + this.availableSize + ", maxPhotoCount=" + this.maxPhotoCount + ", photoList=" + this.photoList + '}';
    }
}
