package com.baidu.mapapi.map;

/* loaded from: classes2.dex */
public class MapCustomStyleOptions {

    /* renamed from: a, reason: collision with root package name */
    private String f5934a;

    /* renamed from: b, reason: collision with root package name */
    private String f5935b;

    public MapCustomStyleOptions customStyleId(String str) {
        this.f5935b = str;
        return this;
    }

    public String getCustomMapStyleId() {
        return this.f5935b;
    }

    public String getLocalCustomStyleFilePath() {
        return this.f5934a;
    }

    public MapCustomStyleOptions localCustomStylePath(String str) {
        this.f5934a = str;
        return this;
    }
}
