package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPUserInfo {
    public static final int FEMALE = 1;
    public static final int MALE = 0;
    private int age;
    private int gender;
    private int height;
    private int weight;

    public CRPUserInfo(int i8, int i9, int i10, int i11) {
        this.weight = i8;
        this.height = i9;
        this.gender = i10;
        this.age = i11;
    }

    public int getAge() {
        return this.age;
    }

    public int getGender() {
        return this.gender;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setAge(int i8) {
        this.age = i8;
    }

    public void setGender(int i8) {
        this.gender = i8;
    }

    public void setHeight(int i8) {
        this.height = i8;
    }

    public void setWeight(int i8) {
        this.weight = i8;
    }

    public String toString() {
        return "CRPUserInfo{weight=" + this.weight + ", height=" + this.height + ", gender=" + this.gender + ", age=" + this.age + '}';
    }
}
