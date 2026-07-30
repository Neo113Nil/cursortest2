package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPContactInfo {
    public static final int DEFAULT_NAME_MAX_LENGTH = 20;
    private int address;
    private int height;
    private int id;
    private int maxNameLength = 20;
    private String name;
    private String number;
    private int width;

    public CRPContactInfo() {
    }

    public int getAddress() {
        return this.address;
    }

    public int getHeight() {
        return this.height;
    }

    public int getId() {
        return this.id;
    }

    public int getMaxNameLength() {
        return this.maxNameLength;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAddress(int i8) {
        this.address = i8;
    }

    public void setHeight(int i8) {
        this.height = i8;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setMaxNameLength(int i8) {
        this.maxNameLength = i8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }

    public String toString() {
        return "CRPContactInfo{id=" + this.id + ", width=" + this.width + ", height=" + this.height + ", address=" + this.address + ", name='" + this.name + "', number='" + this.number + "', maxNameLength=" + this.maxNameLength + '}';
    }

    public CRPContactInfo(int i8, int i9, int i10, int i11, String str, String str2) {
        this.id = i8;
        this.width = i9;
        this.height = i10;
        this.address = i11;
        this.name = str;
        this.number = str2;
    }
}
