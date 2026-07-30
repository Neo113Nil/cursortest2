package com.crrepa.band.my.model;

import java.util.List;

/* loaded from: classes2.dex */
public class WatchFaceStoreModel {
    private int pageIndex;
    private List<WatchFace> watchFaceList;

    public static class WatchFace {
        private String fileUrl;
        private int id;
        private String previewUrl;

        public WatchFace(int i8, String str, String str2) {
            this.id = i8;
            this.previewUrl = str;
            this.fileUrl = str2;
        }

        public String getFileUrl() {
            return this.fileUrl;
        }

        public int getId() {
            return this.id;
        }

        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public void setFileUrl(String str) {
            this.fileUrl = str;
        }

        public void setId(int i8) {
            this.id = i8;
        }

        public void setPreviewUrl(String str) {
            this.previewUrl = str;
        }
    }

    public WatchFaceStoreModel(int i8) {
        this.pageIndex = i8;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public List<WatchFace> getWatchFaceList() {
        return this.watchFaceList;
    }

    public void setPageIndex(int i8) {
        this.pageIndex = i8;
    }

    public void setWatchFaceList(List<WatchFace> list) {
        this.watchFaceList = list;
    }

    public WatchFaceStoreModel(int i8, List<WatchFace> list) {
        this.pageIndex = i8;
        this.watchFaceList = list;
    }
}
