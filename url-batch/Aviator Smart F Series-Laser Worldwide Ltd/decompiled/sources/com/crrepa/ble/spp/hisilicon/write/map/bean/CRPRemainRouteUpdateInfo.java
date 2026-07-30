package com.crrepa.ble.spp.hisilicon.write.map.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPRemainRouteUpdateInfo {
    private Line line;
    private int msg_type;
    private int navi_type;

    public static class Line {
        private int distance;
        private int duration;
        private List<LocationBean> points;

        public int getDistance() {
            return this.distance;
        }

        public int getDuration() {
            return this.duration;
        }

        public List<LocationBean> getPoints() {
            return this.points;
        }

        public void setDistance(int i8) {
            this.distance = i8;
        }

        public void setDuration(int i8) {
            this.duration = i8;
        }

        public void setPoints(List<LocationBean> list) {
            this.points = list;
        }

        public String toString() {
            return "Line{distance=" + this.distance + ", duration=" + this.duration + ", points=" + this.points + '}';
        }
    }

    public Line getLine() {
        return this.line;
    }

    public int getMsg_type() {
        return this.msg_type;
    }

    public int getNavi_type() {
        return this.navi_type;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public void setMsg_type(int i8) {
        this.msg_type = i8;
    }

    public void setNavi_type(int i8) {
        this.navi_type = i8;
    }

    public String toString() {
        return "CRPRemainRouteUpdateInfo{msg_type=" + this.msg_type + ", navi_type=" + this.navi_type + ", line=" + this.line + '}';
    }
}
