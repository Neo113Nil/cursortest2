package com.baidu.platform.comapi.walknavi.h;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f10079a = new Bundle();

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void a(int i8, int i9, int i10, String str) {
        this.f10079a.putInt("start_x", i8);
        this.f10079a.putInt("start_y", i9);
        this.f10079a.putInt("start_cityid", i10);
        this.f10079a.putString("start_uid", str);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void b(int i8) {
        this.f10079a.putInt("route_data_mode", i8);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void c(int i8) {
        this.f10079a.putInt("vehicle", i8);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void d(String str) {
        this.f10079a.putString("road_prefer", str);
    }

    public void e(int i8) {
        this.f10079a.putInt("wnavi_extra_mode", i8);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public int getInt(String str, int i8) {
        return this.f10079a.getInt(str, i8);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public String getString(String str, String str2) {
        return this.f10079a.getString(str, str2);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public int[] b(String str) {
        return this.f10079a.getIntArray(str);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public byte[] c(String str) {
        return this.f10079a.getByteArray(str);
    }

    public void d(int i8) {
        this.f10079a.putInt("launched_from", i8);
    }

    public void a(int i8, int i9, int i10, String str, String str2, String str3) {
        this.f10079a.putInt("start_x", i8);
        this.f10079a.putInt("start_y", i9);
        this.f10079a.putInt("start_cityid", i10);
        this.f10079a.putString("start_floor", str);
        this.f10079a.putString("start_building", str2);
        this.f10079a.putString("start_uid", str3);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void a(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr) {
        this.f10079a.putIntArray("end_x", iArr);
        this.f10079a.putIntArray("end_y", iArr2);
        this.f10079a.putIntArray("end_cityid", iArr3);
        this.f10079a.putStringArray("end_uid", strArr);
    }

    public void a(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr, String[] strArr2, String[] strArr3) {
        this.f10079a.putIntArray("end_x", iArr);
        this.f10079a.putIntArray("end_y", iArr2);
        this.f10079a.putIntArray("end_cityid", iArr3);
        this.f10079a.putStringArray("end_floor", strArr);
        this.f10079a.putStringArray("end_building", strArr2);
        this.f10079a.putStringArray("end_uid", strArr3);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void a(int i8) {
        this.f10079a.putInt("wnavi_mode", i8);
    }

    public void a(byte[] bArr) {
        this.f10079a.putByteArray("route_buff", bArr);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public String[] a(String str) {
        return this.f10079a.getStringArray(str);
    }
}
