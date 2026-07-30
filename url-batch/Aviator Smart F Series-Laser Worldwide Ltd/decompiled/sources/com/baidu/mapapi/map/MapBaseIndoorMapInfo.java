package com.baidu.mapapi.map;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class MapBaseIndoorMapInfo {

    /* renamed from: a, reason: collision with root package name */
    String f5930a;

    /* renamed from: b, reason: collision with root package name */
    String f5931b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<String> f5932c;

    public enum SwitchFloorError {
        SWITCH_OK,
        FLOOR_INFO_ERROR,
        FLOOR_OVERLFLOW,
        FOCUSED_ID_ERROR,
        SWITCH_ERROR
    }

    public MapBaseIndoorMapInfo() {
    }

    public String getCurFloor() {
        return this.f5931b;
    }

    public ArrayList<String> getFloors() {
        return this.f5932c;
    }

    public String getID() {
        return this.f5930a;
    }

    public MapBaseIndoorMapInfo(String str, String str2, ArrayList<String> arrayList) {
        this.f5930a = str;
        this.f5931b = str2;
        this.f5932c = arrayList;
    }

    public MapBaseIndoorMapInfo(MapBaseIndoorMapInfo mapBaseIndoorMapInfo) {
        this.f5930a = mapBaseIndoorMapInfo.f5930a;
        this.f5931b = mapBaseIndoorMapInfo.f5931b;
        this.f5932c = mapBaseIndoorMapInfo.f5932c;
    }
}
