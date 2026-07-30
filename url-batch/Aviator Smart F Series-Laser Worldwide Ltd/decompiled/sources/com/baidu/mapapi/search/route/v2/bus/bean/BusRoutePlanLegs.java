package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class BusRoutePlanLegs extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "arrive_time")
    private String f7331a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "depart_time")
    private String f7332b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "distance")
    private int f7333c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "duration")
    private int f7334d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "plan_type")
    private int f7335e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(name = "plan_status")
    private int f7336f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(name = "jam_distance")
    private int f7337g;

    /* renamed from: h, reason: collision with root package name */
    @Properties(name = "jam_text")
    private String f7338h;

    /* renamed from: i, reason: collision with root package name */
    @Properties(name = FirebaseAnalytics.Param.PRICE)
    private int f7339i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(name = "steps")
    private List<List<BusRoutePlanStep>> f7340j;

    public String getArriveTime() {
        return this.f7331a;
    }

    public String getDepartTime() {
        return this.f7332b;
    }

    public int getDistance() {
        return this.f7333c;
    }

    public int getDuration() {
        return this.f7334d;
    }

    public int getJamDistance() {
        return this.f7337g;
    }

    public String getJamText() {
        return this.f7338h;
    }

    public int getPlanStatus() {
        return this.f7336f;
    }

    public int getPlanType() {
        return this.f7335e;
    }

    public int getPrice() {
        return this.f7339i;
    }

    public List<List<BusRoutePlanStep>> getSteps() {
        return this.f7340j;
    }

    public void setArriveTime(String str) {
        this.f7331a = str;
    }

    public void setDepartTime(String str) {
        this.f7332b = str;
    }

    public void setDistance(int i8) {
        this.f7333c = i8;
    }

    public void setDuration(int i8) {
        this.f7334d = i8;
    }

    public void setJamDistance(int i8) {
        this.f7337g = i8;
    }

    public void setJamText(String str) {
        this.f7338h = str;
    }

    public void setPlanStatus(int i8) {
        this.f7336f = i8;
    }

    public void setPlanType(int i8) {
        this.f7335e = i8;
    }

    public void setPrice(int i8) {
        this.f7339i = i8;
    }

    public void setSteps(List<List<BusRoutePlanStep>> list) {
        this.f7340j = list;
    }
}
