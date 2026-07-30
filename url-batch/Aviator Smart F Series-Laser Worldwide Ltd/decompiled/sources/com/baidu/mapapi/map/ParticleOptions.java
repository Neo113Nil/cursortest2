package com.baidu.mapapi.map;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public class ParticleOptions {

    /* renamed from: a, reason: collision with root package name */
    private List<BitmapDescriptor> f6126a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f6127b;

    public List<BitmapDescriptor> getParticleImgs() {
        return this.f6126a;
    }

    public LatLng getParticlePos() {
        return this.f6127b;
    }

    public void setParticleImgs(List<BitmapDescriptor> list) {
        this.f6126a = list;
    }

    public void setParticlePos(LatLng latLng) {
        this.f6127b = latLng;
    }
}
