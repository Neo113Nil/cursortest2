package com.crrepa.band.my.device.watchface.model;

import java.util.List;

/* loaded from: classes2.dex */
public class StoreWatchFaceDetailBean {
    private int download;
    private List<StoreWatchFaceBean> face_list;
    private String file;
    private int id;
    private String name;
    private String preview;
    private String remark_cn;
    private String remark_en;
    private String remark_lang;
    private int size;
    private String uploader;

    public int getDownload() {
        return this.download;
    }

    public List<StoreWatchFaceBean> getFace_list() {
        return this.face_list;
    }

    public String getFile() {
        return this.file;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPreview() {
        return this.preview;
    }

    public String getRemark_cn() {
        return this.remark_cn;
    }

    public String getRemark_en() {
        return this.remark_en;
    }

    public String getRemark_lang() {
        return this.remark_lang;
    }

    public int getSize() {
        return this.size;
    }

    public String getUploader() {
        return this.uploader;
    }

    public void setDownload(int i8) {
        this.download = i8;
    }

    public void setFace_list(List<StoreWatchFaceBean> list) {
        this.face_list = list;
    }

    public void setFile(String str) {
        this.file = str;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPreview(String str) {
        this.preview = str;
    }

    public void setRemark_cn(String str) {
        this.remark_cn = str;
    }

    public void setRemark_en(String str) {
        this.remark_en = str;
    }

    public void setRemark_lang(String str) {
        this.remark_lang = str;
    }

    public void setSize(int i8) {
        this.size = i8;
    }

    public void setUploader(String str) {
        this.uploader = str;
    }
}
