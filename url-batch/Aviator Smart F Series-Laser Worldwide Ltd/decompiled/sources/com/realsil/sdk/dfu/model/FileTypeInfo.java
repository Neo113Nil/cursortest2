package com.realsil.sdk.dfu.model;

/* loaded from: classes4.dex */
public class FileTypeInfo {

    /* renamed from: a, reason: collision with root package name */
    public int f16219a;

    /* renamed from: b, reason: collision with root package name */
    public String f16220b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16221c;

    public FileTypeInfo(int i8, String str) {
        this.f16219a = i8;
        this.f16220b = str;
    }

    public int getBitNumber() {
        return this.f16219a;
    }

    public String getName() {
        return this.f16220b;
    }

    public boolean isSelected() {
        return this.f16221c;
    }

    public void setBitNumber(int i8) {
        this.f16219a = i8;
    }

    public void setName(String str) {
        this.f16220b = str;
    }

    public void setSelected(boolean z7) {
        this.f16221c = z7;
    }
}
