package com.crrepa.band.my.device.watchface.model;

import java.util.List;

/* loaded from: classes2.dex */
public class StoreWatchFaceBean {
    private int download;
    private String file;
    private List<String> firmware;
    private int id;
    private String name;
    private String preview;
    private String remark_en;
    private String remark_zh;
    private int tpl;
    private List<Integer> tpls;

    public int getDownload() {
        return this.download;
    }

    public String getFile() {
        return this.file;
    }

    public List<String> getFirmware() {
        return this.firmware;
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

    public String getRemark_en() {
        return this.remark_en;
    }

    public String getRemark_zh() {
        return this.remark_zh;
    }

    public int getTpl() {
        return this.tpl;
    }

    public List<Integer> getTpls() {
        return this.tpls;
    }

    public void setDownload(int i8) {
        this.download = i8;
    }

    public void setFile(String str) {
        this.file = str;
    }

    public void setFirmware(List<String> list) {
        this.firmware = list;
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

    public void setRemark_en(String str) {
        this.remark_en = str;
    }

    public void setRemark_zh(String str) {
        this.remark_zh = str;
    }

    public void setTpl(int i8) {
        this.tpl = i8;
    }

    public void setTpls(List<Integer> list) {
        this.tpls = list;
    }
}
