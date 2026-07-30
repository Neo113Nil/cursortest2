package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPWatchFaceListInfo {
    private int count;
    private List<WatchFaceBean> list;

    public static class WatchFaceBean {
        private int index;
        private String type;
        private int watchFaceId;

        public WatchFaceBean(int i8, String str, int i9) {
            this.index = i8;
            this.type = str;
            this.watchFaceId = i9;
        }

        public int getId() {
            return this.watchFaceId;
        }

        public int getIndex() {
            return this.index;
        }

        public String getType() {
            return this.type;
        }

        public void setId(int i8) {
            this.watchFaceId = i8;
        }

        public void setIndex(int i8) {
            this.index = i8;
        }

        public void setType(String str) {
            this.type = str;
        }

        public String toString() {
            return "WatchFaceBean{index=" + this.index + ", type='" + this.type + "', watchFaceId=" + this.watchFaceId + '}';
        }
    }

    public CRPWatchFaceListInfo(int i8, List<WatchFaceBean> list) {
        this.count = i8;
        this.list = list;
    }

    public int getCount() {
        return this.count;
    }

    public List<WatchFaceBean> getList() {
        return this.list;
    }

    public void setCount(int i8) {
        this.count = i8;
    }

    public void setList(List<WatchFaceBean> list) {
        this.list = list;
    }

    public String toString() {
        return "CRPWatchFaceListInfo{count=" + this.count + ", list=" + this.list + '}';
    }
}
