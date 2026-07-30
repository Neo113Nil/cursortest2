package com.baidu.mapapi.map;

/* loaded from: classes2.dex */
public enum BMTrackType {
    Surface(3),
    Default3D(4),
    Track(5),
    TrackGradient(6);


    /* renamed from: b, reason: collision with root package name */
    private int f5586b;

    BMTrackType(int i8) {
        this.f5586b = i8;
    }

    public int getType() {
        return this.f5586b;
    }
}
