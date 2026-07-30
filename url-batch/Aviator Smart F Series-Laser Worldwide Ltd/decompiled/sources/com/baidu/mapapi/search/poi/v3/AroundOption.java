package com.baidu.mapapi.search.poi.v3;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class AroundOption {

    /* renamed from: a, reason: collision with root package name */
    private String f6940a;

    /* renamed from: b, reason: collision with root package name */
    private String f6941b;

    /* renamed from: d, reason: collision with root package name */
    private LatLng f6943d;

    /* renamed from: h, reason: collision with root package name */
    private String f6947h;

    /* renamed from: j, reason: collision with root package name */
    private String f6949j;

    /* renamed from: m, reason: collision with root package name */
    private String f6952m;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6956q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6957r;

    /* renamed from: s, reason: collision with root package name */
    private String f6958s;

    /* renamed from: c, reason: collision with root package name */
    private int f6942c = 1;

    /* renamed from: e, reason: collision with root package name */
    private int f6944e = 500;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6945f = false;

    /* renamed from: g, reason: collision with root package name */
    private int f6946g = 3;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6948i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f6950k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f6951l = 10;

    /* renamed from: n, reason: collision with root package name */
    private String f6953n = "zh";

    /* renamed from: o, reason: collision with root package name */
    private String f6954o = "zh";

    /* renamed from: p, reason: collision with root package name */
    private boolean f6955p = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6959t = false;

    public String getAddressResult() {
        return this.f6949j;
    }

    public int getCoordType() {
        return this.f6946g;
    }

    public String getFilter() {
        return this.f6947h;
    }

    public String getFromLanguage() {
        return this.f6953n;
    }

    public String getLanguage() {
        return this.f6954o;
    }

    public LatLng getLocation() {
        return this.f6943d;
    }

    public int getPageNum() {
        return this.f6950k;
    }

    public int getPageSize() {
        return this.f6951l;
    }

    public String getQuery() {
        return this.f6940a;
    }

    public int getRadius() {
        return this.f6944e;
    }

    public String getRetCoordType() {
        return this.f6952m;
    }

    public int getScope() {
        return this.f6942c;
    }

    public String getTag() {
        return this.f6958s;
    }

    public String getType() {
        return this.f6941b;
    }

    public boolean isExtensionsAdcode() {
        return this.f6948i;
    }

    public boolean isExtensionsChildPoi() {
        return this.f6956q;
    }

    public boolean isHomonym() {
        return this.f6957r;
    }

    public boolean isLightVersion() {
        return this.f6959t;
    }

    public boolean isPhotoShow() {
        return this.f6955p;
    }

    public boolean isRadiusLimit() {
        return this.f6945f;
    }

    public AroundOption setAddressResult(String str) {
        this.f6949j = str;
        return this;
    }

    public AroundOption setCoordType(int i8) {
        this.f6946g = i8;
        return this;
    }

    public AroundOption setExtensionsAdcode(boolean z7) {
        this.f6948i = z7;
        return this;
    }

    public AroundOption setExtensionsChildPoi(boolean z7) {
        this.f6956q = z7;
        return this;
    }

    public AroundOption setFilter(String str) {
        this.f6947h = str;
        return this;
    }

    public AroundOption setFromLanguage(String str) {
        this.f6953n = str;
        return this;
    }

    public AroundOption setHomonym(boolean z7) {
        this.f6957r = z7;
        return this;
    }

    public AroundOption setLanguage(String str) {
        this.f6954o = str;
        return this;
    }

    public AroundOption setLightVersion(boolean z7) {
        this.f6959t = z7;
        return this;
    }

    public AroundOption setLocation(LatLng latLng) {
        this.f6943d = latLng;
        return this;
    }

    public AroundOption setPageNum(int i8) {
        this.f6950k = i8;
        return this;
    }

    public AroundOption setPageSize(int i8) {
        this.f6951l = i8;
        return this;
    }

    public AroundOption setPhotoShow(boolean z7) {
        this.f6955p = z7;
        return this;
    }

    public AroundOption setQuery(String str) {
        this.f6940a = str;
        return this;
    }

    public AroundOption setRadius(int i8) {
        this.f6944e = i8;
        return this;
    }

    public AroundOption setRadiusLimit(boolean z7) {
        this.f6945f = z7;
        return this;
    }

    public AroundOption setRetCoordType(String str) {
        this.f6952m = str;
        return this;
    }

    public AroundOption setScope(int i8) {
        this.f6942c = i8;
        return this;
    }

    public AroundOption setTag(String str) {
        this.f6958s = str;
        return this;
    }

    public AroundOption setType(String str) {
        this.f6941b = str;
        return this;
    }
}
