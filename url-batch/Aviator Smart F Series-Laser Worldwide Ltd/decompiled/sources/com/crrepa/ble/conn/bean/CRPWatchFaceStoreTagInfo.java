package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPWatchFaceStoreTagInfo {
    private List<WatchFaceBean> list;
    private int tagId;
    private String tagName;

    public static class WatchFaceBean {
        private Integer download;
        private Integer id;
        private String name;
        private String preview;
        private Integer size;

        public Integer getDownload() {
            return this.download;
        }

        public Integer getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getPreview() {
            return this.preview;
        }

        public Integer getSize() {
            return this.size;
        }

        public void setDownload(Integer num) {
            this.download = num;
        }

        public void setId(Integer num) {
            this.id = num;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPreview(String str) {
            this.preview = str;
        }

        public void setSize(Integer num) {
            this.size = num;
        }

        public String toString() {
            return "WatchFaceBean{id=" + this.id + ", name='" + this.name + "', size=" + this.size + ", download=" + this.download + ", preview='" + this.preview + "'}";
        }
    }

    public CRPWatchFaceStoreTagInfo(int i8, String str, List<WatchFaceBean> list) {
        this.tagId = i8;
        this.tagName = str;
        this.list = list;
    }

    public List<WatchFaceBean> getList() {
        return this.list;
    }

    public int getTagId() {
        return this.tagId;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setList(List<WatchFaceBean> list) {
        this.list = list;
    }

    public void setTagId(int i8) {
        this.tagId = i8;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }

    public String toString() {
        return "CRPWatchFaceStoreTagInfo{tagId=" + this.tagId + ", tagName='" + this.tagName + "', list=" + this.list + '}';
    }
}
