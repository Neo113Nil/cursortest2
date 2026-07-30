package com.baidu.mapapi.navi;

import java.util.List;

/* loaded from: classes2.dex */
public class WayPoint {

    /* renamed from: a, reason: collision with root package name */
    private List<WayPointInfo> f6606a;

    public WayPoint(List<WayPointInfo> list) {
        if (list == null) {
            return;
        }
        this.f6606a = list;
    }

    public List<WayPointInfo> getViaPoints() {
        return this.f6606a;
    }
}
