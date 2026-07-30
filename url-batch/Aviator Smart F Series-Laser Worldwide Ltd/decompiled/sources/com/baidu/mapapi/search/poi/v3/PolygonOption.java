package com.baidu.mapapi.search.poi.v3;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public class PolygonOption {

    /* renamed from: a, reason: collision with root package name */
    private String f6967a;

    /* renamed from: b, reason: collision with root package name */
    private List<LatLng> f6968b;

    /* renamed from: c, reason: collision with root package name */
    private String f6969c;

    /* renamed from: f, reason: collision with root package name */
    private String f6972f;

    /* renamed from: h, reason: collision with root package name */
    private String f6974h;

    /* renamed from: k, reason: collision with root package name */
    private String f6977k;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6980n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6981o;

    /* renamed from: p, reason: collision with root package name */
    private String f6982p;

    /* renamed from: d, reason: collision with root package name */
    private int f6970d = 1;

    /* renamed from: e, reason: collision with root package name */
    private int f6971e = 3;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6973g = false;

    /* renamed from: i, reason: collision with root package name */
    private int f6975i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f6976j = 10;

    /* renamed from: l, reason: collision with root package name */
    private String f6978l = "zh";

    /* renamed from: m, reason: collision with root package name */
    private String f6979m = "zh";

    /* renamed from: q, reason: collision with root package name */
    private boolean f6983q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6984r = false;

    public String getAddressResult() {
        return this.f6974h;
    }

    public List<LatLng> getBounds() {
        return this.f6968b;
    }

    public int getCoordType() {
        return this.f6971e;
    }

    public String getFilter() {
        return this.f6972f;
    }

    public String getFromLanguage() {
        return this.f6978l;
    }

    public String getLanguage() {
        return this.f6979m;
    }

    public int getPageNum() {
        return this.f6975i;
    }

    public int getPageSize() {
        return this.f6976j;
    }

    public String getQuery() {
        return this.f6967a;
    }

    public String getRetCoordType() {
        return this.f6977k;
    }

    public int getScope() {
        return this.f6970d;
    }

    public String getTag() {
        return this.f6982p;
    }

    public String getType() {
        return this.f6969c;
    }

    public boolean isExtensionsAdcode() {
        return this.f6973g;
    }

    public boolean isExtensionsChildPoi() {
        return this.f6980n;
    }

    public boolean isHomonym() {
        return this.f6981o;
    }

    public boolean isLightVersion() {
        return this.f6984r;
    }

    public boolean isPhotoShow() {
        return this.f6983q;
    }

    public PolygonOption setAddressResult(String str) {
        this.f6974h = str;
        return this;
    }

    public PolygonOption setBounds(List<LatLng> list) {
        this.f6968b = list;
        return this;
    }

    public PolygonOption setCoordType(int i8) {
        this.f6971e = i8;
        return this;
    }

    public PolygonOption setExtensionsAdcode(boolean z7) {
        this.f6973g = z7;
        return this;
    }

    public PolygonOption setExtensionsChildPoi(boolean z7) {
        this.f6980n = z7;
        return this;
    }

    public PolygonOption setFilter(String str) {
        this.f6972f = str;
        return this;
    }

    public PolygonOption setFromLanguage(String str) {
        this.f6978l = str;
        return this;
    }

    public PolygonOption setHomonym(boolean z7) {
        this.f6981o = z7;
        return this;
    }

    public PolygonOption setLanguage(String str) {
        this.f6979m = str;
        return this;
    }

    public PolygonOption setLightVersion(boolean z7) {
        this.f6984r = z7;
        return this;
    }

    public PolygonOption setPageNum(int i8) {
        this.f6975i = i8;
        return this;
    }

    public PolygonOption setPageSize(int i8) {
        this.f6976j = i8;
        return this;
    }

    public PolygonOption setPhotoShow(boolean z7) {
        this.f6983q = z7;
        return this;
    }

    public PolygonOption setQuery(String str) {
        this.f6967a = str;
        return this;
    }

    public PolygonOption setRetCoordType(String str) {
        this.f6977k = str;
        return this;
    }

    public PolygonOption setScope(int i8) {
        this.f6970d = i8;
        return this;
    }

    public PolygonOption setTag(String str) {
        this.f6982p = str;
        return this;
    }

    public PolygonOption setType(String str) {
        this.f6969c = str;
        return this;
    }
}
