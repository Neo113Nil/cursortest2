package com.crrepa.ble.conn.bean;

import com.github.mikephil.charting.utils.i;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPGpsPathInfo {
    public static final double GPS_NOT_SIGNAL = 200.0d;
    public static final double GPS_PAUSE = 0.0d;
    private List<Location> locationList;
    private long time;

    public static class Location {
        private double latitude;
        private double longitude;

        public Location(double d8, double d9) {
            this.latitude = d8;
            this.longitude = d9;
        }

        public double getLatitude() {
            return this.latitude;
        }

        public double getLongitude() {
            return this.longitude;
        }

        public boolean isNotSingal() {
            double d8 = this.latitude;
            return d8 == this.longitude && d8 == 200.0d;
        }

        public boolean isPause() {
            double d8 = this.latitude;
            return d8 == this.longitude && d8 == i.DOUBLE_EPSILON;
        }

        public void setLatitude(double d8) {
            this.latitude = d8;
        }

        public void setLongitude(double d8) {
            this.longitude = d8;
        }

        public String toString() {
            return "Location{latitude=" + this.latitude + ", longitude=" + this.longitude + '}';
        }
    }

    public CRPGpsPathInfo(long j8, List<Location> list) {
        this.time = j8;
        this.locationList = list;
    }

    public List<Location> getLocationList() {
        return this.locationList;
    }

    public long getTime() {
        return this.time;
    }

    public void setLocationList(List<Location> list) {
        this.locationList = list;
    }

    public void setTime(long j8) {
        this.time = j8;
    }

    public String toString() {
        return "CRPGpsInfo{time=" + this.time + ", locationList=" + this.locationList + '}';
    }
}
