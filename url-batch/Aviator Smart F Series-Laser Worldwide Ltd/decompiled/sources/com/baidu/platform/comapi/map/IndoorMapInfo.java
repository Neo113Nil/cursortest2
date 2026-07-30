package com.baidu.platform.comapi.map;

import android.text.TextUtils;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class IndoorMapInfo implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f9426a;

    /* renamed from: b, reason: collision with root package name */
    private String f9427b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f9428c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f9429d;

    /* renamed from: e, reason: collision with root package name */
    private int f9430e;

    /* renamed from: f, reason: collision with root package name */
    private int f9431f;

    /* renamed from: g, reason: collision with root package name */
    private String f9432g;

    public IndoorMapInfo(String str, String str2) {
        this.f9426a = str;
        this.f9427b = str2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IndoorMapInfo)) {
            return false;
        }
        IndoorMapInfo indoorMapInfo = (IndoorMapInfo) obj;
        if (TextUtils.equals(this.f9426a, indoorMapInfo.f9426a) && TextUtils.equals(this.f9427b, indoorMapInfo.f9427b) && Arrays.equals(this.f9428c, indoorMapInfo.f9428c)) {
            return Arrays.equals(this.f9429d, indoorMapInfo.f9429d);
        }
        return false;
    }

    public String getBuildingId() {
        return this.f9426a;
    }

    public final int[] getFloorAttribute() {
        return this.f9429d;
    }

    public String getFloorId() {
        return this.f9427b;
    }

    public final String[] getFloorList() {
        return this.f9428c;
    }

    public String getIdrSearch() {
        return this.f9432g;
    }

    public int getIdrguide() {
        return this.f9431f;
    }

    public int getIndoorType() {
        return this.f9430e;
    }

    public String toString() {
        return "IndoorMapInfo:building_id:" + this.f9426a + ";floor_id:" + this.f9427b + ";indoor_type:" + this.f9430e + ";floor_list:" + Arrays.toString(this.f9428c) + ";floor_attribute:" + Arrays.toString(this.f9429d);
    }

    public IndoorMapInfo(String str, String str2, String[] strArr, int[] iArr, int i8) {
        this(str, str2, strArr, iArr, i8, 0, "");
    }

    public IndoorMapInfo(String str, String str2, String[] strArr, int[] iArr, int i8, int i9) {
        this(str, str2, strArr, iArr, i8, i9, "");
    }

    public IndoorMapInfo(String str, String str2, String[] strArr, int[] iArr, int i8, int i9, String str3) {
        this.f9426a = str;
        this.f9427b = str2;
        this.f9430e = i8;
        this.f9431f = i9;
        if (strArr != null) {
            String[] strArr2 = (String[]) Array.newInstance((Class<?>) String.class, strArr.length);
            this.f9428c = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        if (iArr != null) {
            int[] iArr2 = new int[iArr.length];
            this.f9429d = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        }
        this.f9432g = str3;
    }
}
