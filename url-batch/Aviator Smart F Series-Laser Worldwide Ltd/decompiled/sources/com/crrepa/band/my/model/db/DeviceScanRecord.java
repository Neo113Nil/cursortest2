package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class DeviceScanRecord {
    private String address;
    private Long id;
    private String name;
    private String scanRecordBytes;

    public DeviceScanRecord(Long l8, String str, String str2, String str3) {
        this.id = l8;
        this.address = str;
        this.name = str2;
        this.scanRecordBytes = str3;
    }

    public String getAddress() {
        return this.address;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getScanRecordBytes() {
        return this.scanRecordBytes;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setScanRecordBytes(String str) {
        this.scanRecordBytes = str;
    }

    public DeviceScanRecord() {
    }
}
