package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class Recover {
    private String address;
    private String firmwareVersion;
    private Long id;
    private Integer mcu;
    private String name;

    public Recover(Long l8, String str, String str2, String str3, Integer num) {
        this.id = l8;
        this.name = str;
        this.address = str2;
        this.firmwareVersion = str3;
        this.mcu = num;
    }

    public String getAddress() {
        return this.address;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getMcu() {
        return this.mcu;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setMcu(Integer num) {
        this.mcu = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Recover() {
    }
}
