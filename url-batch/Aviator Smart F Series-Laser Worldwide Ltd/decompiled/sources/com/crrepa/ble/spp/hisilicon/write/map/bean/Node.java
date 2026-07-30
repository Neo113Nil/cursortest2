package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class Node {
    private LocationBean location;
    private String title;
    private String uid;

    public Node(String str, String str2, LocationBean locationBean) {
        this.uid = str;
        this.title = str2;
        this.location = locationBean;
    }

    public LocationBean getLocation() {
        return this.location;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUid() {
        return this.uid;
    }

    public void setLocation(LocationBean locationBean) {
        this.location = locationBean;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public String toString() {
        return "Starting{uid='" + this.uid + "', title='" + this.title + "', location=" + this.location + '}';
    }
}
