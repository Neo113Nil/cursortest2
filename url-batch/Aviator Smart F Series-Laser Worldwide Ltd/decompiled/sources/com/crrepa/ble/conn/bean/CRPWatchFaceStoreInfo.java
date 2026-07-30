package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPWatchFaceStoreInfo {
    private List<WatchFaceBean> list;
    private int total;

    public static class WatchFaceBean {
        private String file;
        private int id;
        private String preview;

        public WatchFaceBean(int i8, String str, String str2) {
            this.id = i8;
            this.preview = str;
            this.file = str2;
        }

        public String getFile() {
            return this.file;
        }

        public int getId() {
            return this.id;
        }

        public String getPreview() {
            return this.preview;
        }

        public String toString() {
            return "WatchFaceBean{id=" + this.id + ", preview='" + this.preview + "', file='" + this.file + "'}";
        }
    }

    public CRPWatchFaceStoreInfo(int i8, List<WatchFaceBean> list) {
        this.total = i8;
        this.list = list;
    }

    public List<WatchFaceBean> getList() {
        return this.list;
    }

    public int getTotal() {
        return this.total;
    }

    public void setList(List<WatchFaceBean> list) {
        this.list = list;
    }

    public void setTotal(int i8) {
        this.total = i8;
    }

    public String toString() {
        return "CRPWatchFaceStoreInfo{total=" + this.total + ", list=" + this.list + '}';
    }
}
