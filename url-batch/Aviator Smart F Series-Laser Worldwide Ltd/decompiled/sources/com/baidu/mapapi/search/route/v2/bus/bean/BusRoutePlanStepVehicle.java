package com.baidu.mapapi.search.route.v2.bus.bean;

import com.arthenica.ffmpegkit.f;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class BusRoutePlanStepVehicle extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "name")
    private String f7402a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "alias_name")
    private String f7403b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "type")
    private int f7404c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "uid")
    private String f7405d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "start_uid")
    private String f7406e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(name = "end_uid")
    private String f7407f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(name = "direct_text")
    private String f7408g;

    /* renamed from: h, reason: collision with root package name */
    @Properties(name = "entrance_port")
    private BusRoutePlanStepVehiclePortInfo f7409h;

    /* renamed from: i, reason: collision with root package name */
    @Properties(name = "exit_port")
    private BusRoutePlanStepVehiclePortInfo f7410i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(name = "convient_door_info")
    private List<String> f7411j;

    /* renamed from: k, reason: collision with root package name */
    @Properties(name = "side_door_desc")
    private String f7412k;

    /* renamed from: l, reason: collision with root package name */
    @Properties(name = "side_door_type")
    private int f7413l;

    /* renamed from: m, reason: collision with root package name */
    @Properties(name = "start_name")
    private String f7414m;

    /* renamed from: n, reason: collision with root package name */
    @Properties(name = "end_name")
    private String f7415n;

    /* renamed from: o, reason: collision with root package name */
    @Properties(name = "start_time")
    private String f7416o;

    /* renamed from: p, reason: collision with root package name */
    @Properties(name = f.KEY_END_TIME)
    private String f7417p;

    /* renamed from: q, reason: collision with root package name */
    @Properties(name = "stop_num")
    private int f7418q;

    /* renamed from: r, reason: collision with root package name */
    @Properties(name = "start_city_name")
    private String f7419r;

    /* renamed from: s, reason: collision with root package name */
    @Properties(name = "end_city_name")
    private String f7420s;

    /* renamed from: t, reason: collision with root package name */
    @Properties(name = "line_stations")
    private List<BusRoutePlanStepVehicleLineStation> f7421t;

    public String getAliasName() {
        return this.f7403b;
    }

    public List<String> getConvientDoorInfo() {
        return this.f7411j;
    }

    public String getDirectText() {
        return this.f7408g;
    }

    public String getEndName() {
        return this.f7415n;
    }

    public String getEndTime() {
        return this.f7417p;
    }

    public String getEndUid() {
        return this.f7407f;
    }

    public String getEnd_city_name() {
        return this.f7420s;
    }

    public BusRoutePlanStepVehiclePortInfo getEntrancePort() {
        return this.f7409h;
    }

    public BusRoutePlanStepVehiclePortInfo getExitPort() {
        return this.f7410i;
    }

    public List<BusRoutePlanStepVehicleLineStation> getLineStations() {
        return this.f7421t;
    }

    public String getName() {
        return this.f7402a;
    }

    public String getSideDoorDesc() {
        return this.f7412k;
    }

    public int getSideDoorType() {
        return this.f7413l;
    }

    public String getStartCityName() {
        return this.f7419r;
    }

    public String getStartName() {
        return this.f7414m;
    }

    public String getStartTime() {
        return this.f7416o;
    }

    public String getStartUid() {
        return this.f7406e;
    }

    public int getStopNum() {
        return this.f7418q;
    }

    public int getType() {
        return this.f7404c;
    }

    public String getUid() {
        return this.f7405d;
    }

    public void setAliasName(String str) {
        this.f7403b = str;
    }

    public void setConvientDoorInfo(List<String> list) {
        this.f7411j = list;
    }

    public void setDirectText(String str) {
        this.f7408g = str;
    }

    public void setEndName(String str) {
        this.f7415n = str;
    }

    public void setEndTime(String str) {
        this.f7417p = str;
    }

    public void setEndUid(String str) {
        this.f7407f = str;
    }

    public void setEnd_city_name(String str) {
        this.f7420s = str;
    }

    public void setEntrancePort(BusRoutePlanStepVehiclePortInfo busRoutePlanStepVehiclePortInfo) {
        this.f7409h = busRoutePlanStepVehiclePortInfo;
    }

    public void setExitPort(BusRoutePlanStepVehiclePortInfo busRoutePlanStepVehiclePortInfo) {
        this.f7410i = busRoutePlanStepVehiclePortInfo;
    }

    public void setLineStations(List<BusRoutePlanStepVehicleLineStation> list) {
        this.f7421t = list;
    }

    public void setName(String str) {
        this.f7402a = str;
    }

    public void setSideDoorDesc(String str) {
        this.f7412k = str;
    }

    public void setSideDoorType(int i8) {
        this.f7413l = i8;
    }

    public void setStartCityName(String str) {
        this.f7419r = str;
    }

    public void setStartName(String str) {
        this.f7414m = str;
    }

    public void setStartTime(String str) {
        this.f7416o = str;
    }

    public void setStartUid(String str) {
        this.f7406e = str;
    }

    public void setStopNum(int i8) {
        this.f7418q = i8;
    }

    public void setType(int i8) {
        this.f7404c = i8;
    }

    public void setUid(String str) {
        this.f7405d = str;
    }
}
