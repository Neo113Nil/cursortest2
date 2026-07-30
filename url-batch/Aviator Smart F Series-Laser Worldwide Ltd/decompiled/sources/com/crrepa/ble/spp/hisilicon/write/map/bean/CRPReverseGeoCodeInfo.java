package com.crrepa.ble.spp.hisilicon.write.map.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPReverseGeoCodeInfo {
    private int error_code;
    private Result result;

    public static class AddressDetail {
        private String adCode;
        private String city;
        private String country;
        private String countryCode;
        private String direction;
        private String distance;
        private String district;
        private String province;
        private String streetName;
        private String streetNumber;
        private String town;

        public String getAdCode() {
            return this.adCode;
        }

        public String getCity() {
            return this.city;
        }

        public String getCountry() {
            return this.country;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public String getDirection() {
            return this.direction;
        }

        public String getDistance() {
            return this.distance;
        }

        public String getDistrict() {
            return this.district;
        }

        public String getProvince() {
            return this.province;
        }

        public String getStreetName() {
            return this.streetName;
        }

        public String getStreetNumber() {
            return this.streetNumber;
        }

        public String getTown() {
            return this.town;
        }

        public void setAdCode(String str) {
            this.adCode = str;
        }

        public void setCity(String str) {
            this.city = str;
        }

        public void setCountry(String str) {
            this.country = str;
        }

        public void setCountryCode(String str) {
            this.countryCode = str;
        }

        public void setDirection(String str) {
            this.direction = str;
        }

        public void setDistance(String str) {
            this.distance = str;
        }

        public void setDistrict(String str) {
            this.district = str;
        }

        public void setProvince(String str) {
            this.province = str;
        }

        public void setStreetName(String str) {
            this.streetName = str;
        }

        public void setStreetNumber(String str) {
            this.streetNumber = str;
        }

        public void setTown(String str) {
            this.town = str;
        }

        public String toString() {
            return "AddressDetail{country='" + this.country + "', province='" + this.province + "', city='" + this.city + "', district='" + this.district + "', town='" + this.town + "', streetName='" + this.streetName + "', streetNumber='" + this.streetNumber + "', adCode='" + this.adCode + "', countryCode='" + this.countryCode + "', direction='" + this.direction + "', distance='" + this.distance + "'}";
        }
    }

    public static class DetailInfo {
        private int distance;
        private LocationBean naviLocation;
        private String tag;
        private String type;

        public DetailInfo(int i8, String str, String str2, LocationBean locationBean) {
            this.distance = i8;
            this.type = str;
            this.tag = str2;
            this.naviLocation = locationBean;
        }

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

    public static class POIBean {
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
            return "POIBean{name='" + this.name + "', pt=" + this.pt + ", address='" + this.address + "', phone='" + this.phone + "', UID='" + this.UID + "', adcode='" + this.adcode + "', province='" + this.province + "', city='" + this.city + "', area='" + this.area + "', streetID='" + this.streetID + "', tag='" + this.tag + "', hasDetailInfo=" + this.hasDetailInfo + ", detailInfo=" + this.detailInfo + '}';
        }
    }

    public static class PoiRegions {
        private String regionDescription;
        private String regionName;
        private String regionTag;
        private String regionUID;

        public PoiRegions(String str, String str2, String str3, String str4) {
            this.regionDescription = str;
            this.regionName = str2;
            this.regionTag = str3;
            this.regionUID = str4;
        }

        public String getRegionDescription() {
            return this.regionDescription;
        }

        public String getRegionName() {
            return this.regionName;
        }

        public String getRegionTag() {
            return this.regionTag;
        }

        public String getRegionUID() {
            return this.regionUID;
        }

        public void setRegionDescription(String str) {
            this.regionDescription = str;
        }

        public void setRegionName(String str) {
            this.regionName = str;
        }

        public void setRegionTag(String str) {
            this.regionTag = str;
        }

        public void setRegionUID(String str) {
            this.regionUID = str;
        }

        public String toString() {
            return "PoiRegions{regionDescription='" + this.regionDescription + "', regionName='" + this.regionName + "', regionTag='" + this.regionTag + "', regionUID='" + this.regionUID + "'}";
        }
    }

    public static class Result {
        private String address;
        private AddressDetail addressDetail;
        private String businessCircle;
        private int confidence;
        private LocationBean location;
        private List<POIBean> poiList;
        private List<PoiRegions> poiRegions;
        private String sematicDescription;

        public String getAddress() {
            return this.address;
        }

        public AddressDetail getAddressDetail() {
            return this.addressDetail;
        }

        public String getBusinessCircle() {
            return this.businessCircle;
        }

        public int getConfidence() {
            return this.confidence;
        }

        public LocationBean getLocation() {
            return this.location;
        }

        public List<POIBean> getPoiList() {
            return this.poiList;
        }

        public List<PoiRegions> getPoiRegions() {
            return this.poiRegions;
        }

        public String getSematicDescription() {
            return this.sematicDescription;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public void setAddressDetail(AddressDetail addressDetail) {
            this.addressDetail = addressDetail;
        }

        public void setBusinessCircle(String str) {
            this.businessCircle = str;
        }

        public void setConfidence(int i8) {
            this.confidence = i8;
        }

        public void setLocation(LocationBean locationBean) {
            this.location = locationBean;
        }

        public void setPoiList(List<POIBean> list) {
            this.poiList = list;
        }

        public void setPoiRegions(List<PoiRegions> list) {
            this.poiRegions = list;
        }

        public void setSematicDescription(String str) {
            this.sematicDescription = str;
        }
    }

    public CRPReverseGeoCodeInfo(int i8, Result result) {
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
        return "CRPReverseGeoCodeInfo{error_code=" + this.error_code + ", result=" + this.result + '}';
    }
}
