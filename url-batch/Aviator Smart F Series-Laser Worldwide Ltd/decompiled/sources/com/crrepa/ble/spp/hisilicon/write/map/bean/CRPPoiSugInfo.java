package com.crrepa.ble.spp.hisilicon.write.map.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPPoiSugInfo {
    private int error_code;
    private Result result;

    public static class Children {
        private String name;
        private String showName;
        private String uid;

        public Children(String str, String str2, String str3) {
            this.uid = str;
            this.name = str2;
            this.showName = str3;
        }

        public String getName() {
            return this.name;
        }

        public String getShowName() {
            return this.showName;
        }

        public String getUid() {
            return this.uid;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setShowName(String str) {
            this.showName = str;
        }

        public void setUid(String str) {
            this.uid = str;
        }

        public String toString() {
            return "Children{uid='" + this.uid + "', name='" + this.name + "', showName='" + this.showName + "'}";
        }
    }

    public static class Result {
        private List<Suggestion> suggestionList;

        public Result(List<Suggestion> list) {
            this.suggestionList = list;
        }

        public List<Suggestion> getSuggestionList() {
            return this.suggestionList;
        }

        public void setSuggestionList(List<Suggestion> list) {
            this.suggestionList = list;
        }

        public String toString() {
            return "Result{suggestionList=" + this.suggestionList + '}';
        }
    }

    public static class Suggestion {
        private String address;
        private Children children;
        private String city;
        private String district;
        private String key;
        private LocationBean location;
        private String tag;
        private String uid;

        public String getAddress() {
            return this.address;
        }

        public Children getChildren() {
            return this.children;
        }

        public String getCity() {
            return this.city;
        }

        public String getDistrict() {
            return this.district;
        }

        public String getKey() {
            return this.key;
        }

        public LocationBean getLocation() {
            return this.location;
        }

        public String getTag() {
            return this.tag;
        }

        public String getUid() {
            return this.uid;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public void setChildren(Children children) {
            this.children = children;
        }

        public void setCity(String str) {
            this.city = str;
        }

        public void setDistrict(String str) {
            this.district = str;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setLocation(LocationBean locationBean) {
            this.location = locationBean;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setUid(String str) {
            this.uid = str;
        }

        public String toString() {
            return "Suggestion{key='" + this.key + "', uid='" + this.uid + "', city='" + this.city + "', district='" + this.district + "', tag='" + this.tag + "', address='" + this.address + "', children=" + this.children + ", location=" + this.location + '}';
        }
    }

    public CRPPoiSugInfo(int i8, Result result) {
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
        return "CRPPoiSugInfo{error_code=" + this.error_code + ", result=" + this.result + '}';
    }
}
