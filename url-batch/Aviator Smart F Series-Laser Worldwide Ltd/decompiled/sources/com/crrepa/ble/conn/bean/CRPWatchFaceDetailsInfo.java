package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPWatchFaceDetailsInfo {
    private int download;
    private String file;
    private int id;
    private String name;
    private String preview;
    private List<WatchFaceBean> recommendWatchFaceList;
    private String remark;
    private int size;

    public static class WatchFaceBean {
        private int id;
        private String name;
        private String preview;
        private int size;

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getPreview() {
            return this.preview;
        }

        public int getSize() {
            return this.size;
        }

        public void setId(int i8) {
            this.id = i8;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPreview(String str) {
            this.preview = str;
        }

        public void setSize(int i8) {
            this.size = i8;
        }

        public String toString() {
            return "WatchFaceBean{id=" + this.id + ", name='" + this.name + "', size=" + this.size + ", preview='" + this.preview + "'}";
        }
    }

    public int getDownload() {
        return this.download;
    }

    public String getFile() {
        return this.file;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPreview() {
        return this.preview;
    }

    public List<WatchFaceBean> getRecommendWatchFaceList() {
        return this.recommendWatchFaceList;
    }

    public String getRemark() {
        return this.remark;
    }

    public int getSize() {
        return this.size;
    }

    public void setDownload(int i8) {
        this.download = i8;
    }

    public void setFile(String str) {
        this.file = str;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPreview(String str) {
        this.preview = str;
    }

    public void setRecommendWatchFaceList(List<WatchFaceBean> list) {
        this.recommendWatchFaceList = list;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setSize(int i8) {
        this.size = i8;
    }

    public String toString() {
        return "CRPWatchFaceDetailsInfo{id=" + this.id + ", name='" + this.name + "', download=" + this.download + ", size=" + this.size + ", file='" + this.file + "', preview='" + this.preview + "', remark='" + this.remark + "', recommendWatchFaceList=" + this.recommendWatchFaceList + '}';
    }
}
