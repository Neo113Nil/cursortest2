package com.baidu.platform.comapi.walknavi.h;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f10080a = new Bundle();

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(int i8, int i9, int i10, String str) {
        this.f10080a.putInt("start_x", i8);
        this.f10080a.putInt("start_y", i9);
        this.f10080a.putInt("start_cityid", i10);
        this.f10080a.putString("start_uid", str);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void b(int i8) {
        this.f10080a.putInt("route_data_mode", i8);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void c(int i8) {
        this.f10080a.putInt("launched_from", i8);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void d(int i8) {
        this.f10080a.putInt("wnavi_extra_mode", i8);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public int getInt(String str, int i8) {
        return this.f10080a.getInt(str, i8);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public String getString(String str, String str2) {
        return this.f10080a.getString(str, str2);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public int[] b(String str) {
        return this.f10080a.getIntArray(str);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public byte[] c(String str) {
        return this.f10080a.getByteArray(str);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(int i8, int i9, int i10, String str, String str2, String str3) {
        this.f10080a.putInt("start_x", i8);
        this.f10080a.putInt("start_y", i9);
        this.f10080a.putInt("start_cityid", i10);
        this.f10080a.putString("start_floor", str);
        this.f10080a.putString("start_building", str2);
        this.f10080a.putString("start_uid", str3);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr) {
        this.f10080a.putIntArray("end_x", iArr);
        this.f10080a.putIntArray("end_y", iArr2);
        this.f10080a.putIntArray("end_cityid", iArr3);
        this.f10080a.putStringArray("end_uid", strArr);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr, String[] strArr2, String[] strArr3) {
        this.f10080a.putIntArray("end_x", iArr);
        this.f10080a.putIntArray("end_y", iArr2);
        this.f10080a.putIntArray("end_cityid", iArr3);
        this.f10080a.putStringArray("end_floor", strArr);
        this.f10080a.putStringArray("end_building", strArr2);
        this.f10080a.putStringArray("end_uid", strArr3);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(int i8) {
        this.f10080a.putInt("wnavi_mode", i8);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(byte[] bArr) {
        this.f10080a.putByteArray("route_buff", bArr);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public String[] a(String str) {
        return this.f10080a.getStringArray(str);
    }
}
