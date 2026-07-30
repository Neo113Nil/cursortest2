package com.crrepa.band.my.model;

import androidx.exifinterface.media.ExifInterface;

/* loaded from: classes2.dex */
public class WatchFaceModel {
    private boolean checked;
    private boolean customize;
    private int index;
    private String url;
    private int watchFaceId;
    private WatchFaceType watchFaceType;

    public enum WatchFaceType {
        WATCH_FACE_DEFAULT(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
        WATCH_FACE_OPTIONAL("B"),
        WATCH_FACE_STORE("C"),
        WATCH_FACE_AI("D"),
        WATCH_FACE_VIDEO(ExifInterface.LONGITUDE_EAST),
        WATCH_FACE_PHOTO("F");

        private String value;

        WatchFaceType(String str) {
            this.value = str;
        }

        public static WatchFaceType getInstance(String str) {
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            switch (upperCase) {
                case "A":
                    return WATCH_FACE_DEFAULT;
                case "B":
                    return WATCH_FACE_OPTIONAL;
                case "C":
                    return WATCH_FACE_STORE;
                case "D":
                    return WATCH_FACE_AI;
                case "E":
                    return WATCH_FACE_VIDEO;
                case "F":
                    return WATCH_FACE_PHOTO;
                default:
                    return null;
            }
        }

        public String getValue() {
            return this.value;
        }
    }

    public WatchFaceModel(int i8, int i9, WatchFaceType watchFaceType, boolean z7) {
        this.index = i8;
        this.watchFaceId = i9;
        this.watchFaceType = watchFaceType;
        this.customize = z7;
    }

    public int getIndex() {
        return this.index;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWatchFaceId() {
        return this.watchFaceId;
    }

    public WatchFaceType getWatchFaceType() {
        return this.watchFaceType;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isCustomize() {
        return this.customize;
    }

    public void setChecked(boolean z7) {
        this.checked = z7;
    }

    public void setCustomize(boolean z7) {
        this.customize = z7;
    }

    public void setIndex(int i8) {
        this.index = i8;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWatchFaceId(int i8) {
        this.watchFaceId = i8;
    }

    public void setWatchFaceType(WatchFaceType watchFaceType) {
        this.watchFaceType = watchFaceType;
    }

    public String toString() {
        return "WatchFaceModel{index=" + this.index + ", watchFaceId=" + this.watchFaceId + ", watchFaceType=" + this.watchFaceType + ", checked=" + this.checked + ", customize=" + this.customize + ", url='" + this.url + "'}";
    }
}
