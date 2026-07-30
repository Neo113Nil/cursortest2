package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class CRPLocationInfo {
    private int error_code;
    private Result result;

    public static class Result {
        private int coord_type;
        private int direction;
        private double latitude;
        private double longitude;
        private float speed;
        private String time;

        public int getCoord_type() {
            return this.coord_type;
        }

        public int getDirection() {
            return this.direction;
        }

        public double getLatitude() {
            return this.latitude;
        }

        public double getLongitude() {
            return this.longitude;
        }

        public float getSpeed() {
            return this.speed;
        }

        public String getTime() {
            return this.time;
        }

        public void setCoord_type(int i8) {
            this.coord_type = i8;
        }

        public void setDirection(int i8) {
            this.direction = i8;
        }

        public void setLatitude(double d8) {
            this.latitude = d8;
        }

        public void setLongitude(double d8) {
            this.longitude = d8;
        }

        public void setSpeed(float f8) {
            this.speed = f8;
        }

        public void setTime(String str) {
            this.time = str;
        }

        public String toString() {
            return "Result{latitude=" + this.latitude + ", longitude=" + this.longitude + ", coord_type=" + this.coord_type + ", speed=" + this.speed + ", direction=" + this.direction + ", time='" + this.time + "'}";
        }
    }

    public int getError_code() {
        return this.error_code;
    }

    public Result getResult() {
        return this.result;
    }

    public void setError_code(int i8) {
        this.error_code = i8;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
