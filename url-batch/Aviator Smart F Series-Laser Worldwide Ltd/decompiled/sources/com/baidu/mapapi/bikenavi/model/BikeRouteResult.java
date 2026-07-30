package com.baidu.mapapi.bikenavi.model;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public class BikeRouteResult {
    private int lightCount;
    private List<LatLng> positions;
    private int routeIndex = -1;
    private int distance = 0;
    private int duration = 0;

    public int getDistance() {
        return this.distance;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getLightCount() {
        return this.lightCount;
    }

    public List<LatLng> getPositions() {
        return this.positions;
    }

    public int getRouteIndex() {
        return this.routeIndex;
    }

    public void setDistance(int i8) {
        this.distance = i8;
    }

    public void setDuration(int i8) {
        this.duration = i8;
    }

    public void setLightCount(int i8) {
        this.lightCount = i8;
    }

    public void setPositions(List<LatLng> list) {
        this.positions = list;
    }

    public void setRouteIndex(int i8) {
        this.routeIndex = i8;
    }
}
