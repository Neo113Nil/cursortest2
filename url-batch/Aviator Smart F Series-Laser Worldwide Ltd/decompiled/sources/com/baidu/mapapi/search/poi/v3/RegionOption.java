package com.baidu.mapapi.search.poi.v3;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public class RegionOption {

    /* renamed from: a, reason: collision with root package name */
    private String f6985a;

    /* renamed from: b, reason: collision with root package name */
    private String f6986b;

    /* renamed from: c, reason: collision with root package name */
    private String f6987c;

    /* renamed from: e, reason: collision with root package name */
    private LatLng f6989e;

    /* renamed from: h, reason: collision with root package name */
    private String f6992h;

    /* renamed from: m, reason: collision with root package name */
    private String f6997m;

    /* renamed from: q, reason: collision with root package name */
    private int f7001q;

    /* renamed from: r, reason: collision with root package name */
    private List<LatLng> f7002r;

    /* renamed from: s, reason: collision with root package name */
    private List<LatLng> f7003s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7004t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7005u;

    /* renamed from: v, reason: collision with root package name */
    private String f7006v;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6988d = false;

    /* renamed from: f, reason: collision with root package name */
    private int f6990f = 1;

    /* renamed from: g, reason: collision with root package name */
    private int f6991g = 3;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6993i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6994j = false;

    /* renamed from: k, reason: collision with root package name */
    private int f6995k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f6996l = 10;

    /* renamed from: n, reason: collision with root package name */
    private String f6998n = "zh";

    /* renamed from: o, reason: collision with root package name */
    private String f6999o = "zh";

    /* renamed from: p, reason: collision with root package name */
    private boolean f7000p = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7007w = false;

    public LatLng getCenter() {
        return this.f6989e;
    }

    public int getCoordType() {
        return this.f6991g;
    }

    public String getFilter() {
        return this.f6992h;
    }

    public String getFromLanguage() {
        return this.f6999o;
    }

    public String getLanguage() {
        return this.f6998n;
    }

    public int getPageNum() {
        return this.f6995k;
    }

    public int getPageSize() {
        return this.f6996l;
    }

    public String getQuery() {
        return this.f6985a;
    }

    public String getRegion() {
        return this.f6987c;
    }

    public String getRetCoordType() {
        return this.f6997m;
    }

    public int getScope() {
        return this.f6990f;
    }

    public List<LatLng> getSearchBound() {
        return this.f7003s;
    }

    public String getTag() {
        return this.f7006v;
    }

    public String getType() {
        return this.f6986b;
    }

    public List<LatLng> getViewBound() {
        return this.f7002r;
    }

    public int getViewDistance() {
        return this.f7001q;
    }

    public boolean isAddressResult() {
        return this.f6994j;
    }

    public boolean isExtensionsAdcode() {
        return this.f6993i;
    }

    public boolean isExtensionsChildPoi() {
        return this.f7004t;
    }

    public boolean isHomonym() {
        return this.f7005u;
    }

    public boolean isLightVersion() {
        return this.f7007w;
    }

    public boolean isPhotoShow() {
        return this.f7000p;
    }

    public boolean isRegionLimit() {
        return this.f6988d;
    }

    public RegionOption setAddressResult(boolean z7) {
        this.f6994j = z7;
        return this;
    }

    public RegionOption setCenter(LatLng latLng) {
        this.f6989e = latLng;
        return this;
    }

    public RegionOption setCoordType(int i8) {
        this.f6991g = i8;
        return this;
    }

    public RegionOption setExtensionsAdcode(boolean z7) {
        this.f6993i = z7;
        return this;
    }

    public RegionOption setExtensionsChildPoi(boolean z7) {
        this.f7004t = z7;
        return this;
    }

    public RegionOption setFilter(String str) {
        this.f6992h = str;
        return this;
    }

    public RegionOption setFromLanguage(String str) {
        this.f6999o = str;
        return this;
    }

    public RegionOption setHomonym(boolean z7) {
        this.f7005u = z7;
        return this;
    }

    public RegionOption setLanguage(String str) {
        this.f6998n = str;
        return this;
    }

    public RegionOption setLightVersion(boolean z7) {
        this.f7007w = z7;
        return this;
    }

    public RegionOption setPageNum(int i8) {
        this.f6995k = i8;
        return this;
    }

    public RegionOption setPageSize(int i8) {
        this.f6996l = i8;
        return this;
    }

    public RegionOption setPhotoShow(boolean z7) {
        this.f7000p = z7;
        return this;
    }

    public RegionOption setQuery(String str) {
        this.f6985a = str;
        return this;
    }

    public RegionOption setRegion(String str) {
        this.f6987c = str;
        return this;
    }

    public RegionOption setRegionLimit(boolean z7) {
        this.f6988d = z7;
        return this;
    }

    public RegionOption setRetCoordType(String str) {
        this.f6997m = str;
        return this;
    }

    public RegionOption setScope(int i8) {
        this.f6990f = i8;
        return this;
    }

    public RegionOption setSearchBound(List<LatLng> list) {
        this.f7003s = list;
        return this;
    }

    public RegionOption setTag(String str) {
        this.f7006v = str;
        return this;
    }

    public RegionOption setType(String str) {
        this.f6986b = str;
        return this;
    }

    public RegionOption setViewBound(List<LatLng> list) {
        this.f7002r = list;
        return this;
    }

    public RegionOption setViewDistance(int i8) {
        this.f7001q = i8;
        return this;
    }
}
