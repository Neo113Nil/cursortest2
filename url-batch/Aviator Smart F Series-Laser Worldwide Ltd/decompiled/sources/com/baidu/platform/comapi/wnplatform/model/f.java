package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f10505a;

    public f(Bundle bundle) {
        this.f10505a = bundle;
    }

    public int a() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("nCurRouteShapeIdx")) {
            return this.f10505a.getInt("nCurRouteShapeIdx", -1);
        }
        return -1;
    }

    public int b() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("mapLevel")) {
            return this.f10505a.getInt("mapLevel", -1);
        }
        return -1;
    }

    public int c() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("naviScene")) {
            return this.f10505a.getInt("naviScene", -1);
        }
        return -1;
    }

    public int d() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("naviType")) {
            return this.f10505a.getInt("naviType", -1);
        }
        return -1;
    }

    public int e() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("rotateAngle")) {
            return this.f10505a.getInt("rotateAngle", -1);
        }
        return -1;
    }

    public int f() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("routeAngle")) {
            return this.f10505a.getInt("routeAngle", -1);
        }
        return -1;
    }

    public LatLng g() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("stCurRouteProjectPosX") && this.f10505a.containsKey("stCurRouteProjectPosY")) {
            return new LatLng(this.f10505a.getDouble("stCurRouteProjectPosY", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), this.f10505a.getDouble("stCurRouteProjectPosX", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON));
        }
        return null;
    }

    public LatLng h() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("stCurStartPosX") && this.f10505a.containsKey("stCurStartPosY")) {
            return new LatLng(this.f10505a.getDouble("stCurStartPosY", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), this.f10505a.getDouble("stCurStartPosX", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON));
        }
        return null;
    }

    public LatLng i() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("stPosX") && this.f10505a.containsKey("stPosY")) {
            return new LatLng(this.f10505a.getDouble("stPosY", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), this.f10505a.getDouble("stPosX", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON));
        }
        return null;
    }

    public boolean j() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("bGuide")) {
            return this.f10505a.getBoolean("bGuide", false);
        }
        return false;
    }

    public boolean k() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("bMatchPosLinkIsUnverified")) {
            return this.f10505a.getBoolean("bMatchPosLinkIsUnverified", false);
        }
        return false;
    }

    public boolean l() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("bIsNearOrFarawayStatus")) {
            return this.f10505a.getBoolean("bIsNearOrFarawayStatus", false);
        }
        return false;
    }

    public boolean m() {
        Bundle bundle = this.f10505a;
        if (bundle != null && bundle.containsKey("bRedLine")) {
            return this.f10505a.getBoolean("bRedLine", false);
        }
        return false;
    }
}
