package com.crrepa.ble.spp.hisilicon.write.map.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPPoiInfo {
    private int error_code;
    private Result result;

    public static class DetailInfo {
        private int distance;
        private LocationBean naviLocation;
        private String tag;
        private String type;

        public int getDistance() {
            return this.distance;
        }

        public LocationBean getNaviLocation() {
            return this.naviLocation;
        }

        public String getTag() {
            return this.tag;
        }

        public String getType() {
            return this.type;
        }

        public void setDistance(int i8) {
            this.distance = i8;
        }

        public void setNaviLocation(LocationBean locationBean) {
            this.naviLocation = locationBean;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public String toString() {
            return "DetailInfo{distance=" + this.distance + ", type='" + this.type + "', tag='" + this.tag + "', naviLocation=" + this.naviLocation + '}';
        }
    }

    public static class PoiInfo {
        private String UID;
        private String adcode;
        private String address;
        private String area;
        private String city;
        private DetailInfo detailInfo;
        private boolean hasDetailInfo;
        private String name;
        private String phone;
        private String province;
        private LocationBean pt;
        private String streetID;
        private String tag;

        public String getAdcode() {
            return this.adcode;
        }

        public String getAddress() {
            return this.address;
        }

        public String getArea() {
            return this.area;
        }

        public String getCity() {
            return this.city;
        }

        public DetailInfo getDetailInfo() {
            return this.detailInfo;
        }

        public String getName() {
            return this.name;
        }

        public String getPhone() {
            return this.phone;
        }

        public String getProvince() {
            return this.province;
        }

        public LocationBean getPt() {
            return this.pt;
        }

        public String getStreetID() {
            return this.streetID;
        }

        public String getTag() {
            return this.tag;
        }

        public String getUID() {
            return this.UID;
        }

        public boolean isHasDetailInfo() {
            return this.hasDetailInfo;
        }

        public void setAdcode(String str) {
            this.adcode = str;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public void setArea(String str) {
            this.area = str;
        }

        public void setCity(String str) {
            this.city = str;
        }

        public void setDetailInfo(DetailInfo detailInfo) {
            this.detailInfo = detailInfo;
        }

        public void setHasDetailInfo(boolean z7) {
            this.hasDetailInfo = z7;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPhone(String str) {
            this.phone = str;
        }

        public void setProvince(String str) {
            this.province = str;
        }

        public void setPt(LocationBean locationBean) {
            this.pt = locationBean;
        }

        public void setStreetID(String str) {
            this.streetID = str;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setUID(String str) {
            this.UID = str;
        }

        public String toString() {
            return "PoiInfo{name='" + this.name + "', pt=" + this.pt + ", address='" + this.address + "', phone='" + this.phone + "', UID='" + this.UID + "', adcode='" + this.adcode + "', province='" + this.province + "', city='" + this.city + "', area='" + this.area + "', streetID='" + this.streetID + "', tag='" + this.tag + "', hasDetailInfo=" + this.hasDetailInfo + ", detailInfo=" + this.detailInfo + '}';
        }
    }

    public static class Result {
        private int curPOINum;
        private int curPageIndex;
        private List<PoiInfo> poiInfoList;
        private int totalPOINum;
        private int totalPageNum;

        public int getCurPOINum() {
            return this.curPOINum;
        }

        public int getCurPageIndex() {
            return this.curPageIndex;
        }

        public List<PoiInfo> getPoiInfoList() {
            return this.poiInfoList;
        }

        public int getTotalPOINum() {
            return this.totalPOINum;
        }

        public int getTotalPageNum() {
            return this.totalPageNum;
        }

        public void setCurPOINum(int i8) {
            this.curPOINum = i8;
        }

        public void setCurPageIndex(int i8) {
            this.curPageIndex = i8;
        }

        public void setPoiInfoList(List<PoiInfo> list) {
            this.poiInfoList = list;
        }

        public void setTotalPOINum(int i8) {
            this.totalPOINum = i8;
        }

        public void setTotalPageNum(int i8) {
            this.totalPageNum = i8;
        }

        public String toString() {
            return "Result{totalPOINum=" + this.totalPOINum + ", totalPageNum=" + this.totalPageNum + ", curPOINum=" + this.curPOINum + ", curPageIndex=" + this.curPageIndex + ", poiInfoList=" + this.poiInfoList + '}';
        }
    }

    public CRPPoiInfo(int i8, Result result) {
        this.error_code = i8;
        this.result = result;
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

    public String toString() {
        return "CRPPoiInfo{error_code=" + this.error_code + ", result=" + this.result + '}';
    }
}
