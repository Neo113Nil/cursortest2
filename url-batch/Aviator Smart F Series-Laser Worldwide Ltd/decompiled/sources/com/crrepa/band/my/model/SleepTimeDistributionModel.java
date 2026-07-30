package com.crrepa.band.my.model;

import java.util.List;

/* loaded from: classes2.dex */
public class SleepTimeDistributionModel {
    public static final int SLEEP_STATE_AWAKE = 0;
    public static final int SLEEP_STATE_LIGHT = 1;
    public static final int SLEEP_STATE_REM = 3;
    public static final int SLEEP_STATE_RESTFUL = 2;
    private List<DetailBean> detail;

    public static class DetailBean {
        private String end;
        private String start;
        private int total;
        private int type;

        public String getEnd() {
            return this.end;
        }

        public String getStart() {
            return this.start;
        }

        public int getTotal() {
            return this.total;
        }

        public int getType() {
            return this.type;
        }

        public void setEnd(String str) {
            this.end = str;
        }

        public void setStart(String str) {
            this.start = str;
        }

        public void setTotal(int i8) {
            this.total = i8;
        }

        public void setType(int i8) {
            this.type = i8;
        }
    }

    public List<DetailBean> getDetail() {
        return this.detail;
    }

    public void setDetail(List<DetailBean> list) {
        this.detail = list;
    }
}
