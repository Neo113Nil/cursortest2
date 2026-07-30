package com.crrepa.band.my.device.watchface.model;

import java.util.List;

/* loaded from: classes2.dex */
public class StoreWatchFaceTagBean {
    private List<StoreWatchFaceBean> faces;
    private int id;
    private String tag_name;

    public List<StoreWatchFaceBean> getFaces() {
        return this.faces;
    }

    public int getId() {
        return this.id;
    }

    public String getTag_name() {
        return this.tag_name;
    }

    public void setFaces(List<StoreWatchFaceBean> list) {
        this.faces = list;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setTag_name(String str) {
        this.tag_name = str;
    }
}
