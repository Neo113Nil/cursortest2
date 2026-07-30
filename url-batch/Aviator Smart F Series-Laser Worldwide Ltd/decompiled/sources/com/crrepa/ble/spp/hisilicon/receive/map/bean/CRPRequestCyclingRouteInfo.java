package com.crrepa.ble.spp.hisilicon.receive.map.bean;

/* loaded from: classes3.dex */
public class CRPRequestCyclingRouteInfo {
    private FromBean from;
    private int ridingType;
    private ToBean to;

    public static class FromBean {
        private PtBean pt;

        public static class PtBean {
            private double latitude;
            private double longitude;

            public double getLatitude() {
                return this.latitude;
            }

            public double getLongitude() {
                return this.longitude;
            }

            public void setLatitude(double d8) {
                this.latitude = d8;
            }

            public void setLongitude(double d8) {
                this.longitude = d8;
            }
        }

        public PtBean getPt() {
            return this.pt;
        }

        public void setPt(PtBean ptBean) {
            this.pt = ptBean;
        }
    }

    public static class ToBean {
        private String cityName;
        private String name;
        private PtBean pt;

        public static class PtBean {
            private double latitude;
            private double longitude;

            public double getLatitude() {
                return this.latitude;
            }

            public double getLongitude() {
                return this.longitude;
            }

            public void setLatitude(double d8) {
                this.latitude = d8;
            }

            public void setLongitude(double d8) {
                this.longitude = d8;
            }
        }

        public String getCityName() {
            return this.cityName;
        }

        public String getName() {
            return this.name;
        }

        public PtBean getPt() {
            return this.pt;
        }

        public void setCityName(String str) {
            this.cityName = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPt(PtBean ptBean) {
            this.pt = ptBean;
        }
    }

    public FromBean getFrom() {
        return this.from;
    }

    public int getRidingType() {
        return this.ridingType;
    }

    public ToBean getTo() {
        return this.to;
    }

    public void setFrom(FromBean fromBean) {
        this.from = fromBean;
    }

    public void setRidingType(int i8) {
        this.ridingType = i8;
    }

    public void setTo(ToBean toBean) {
        this.to = toBean;
    }
}
