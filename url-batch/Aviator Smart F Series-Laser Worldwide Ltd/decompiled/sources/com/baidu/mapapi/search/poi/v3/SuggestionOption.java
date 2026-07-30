package com.baidu.mapapi.search.poi.v3;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public class SuggestionOption {

    /* renamed from: a, reason: collision with root package name */
    private String f7008a;

    /* renamed from: b, reason: collision with root package name */
    private String f7009b;

    /* renamed from: d, reason: collision with root package name */
    private String f7011d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7014g;

    /* renamed from: i, reason: collision with root package name */
    private LatLng f7016i;

    /* renamed from: k, reason: collision with root package name */
    private List<LatLng> f7018k;

    /* renamed from: c, reason: collision with root package name */
    private int f7010c = 3;

    /* renamed from: e, reason: collision with root package name */
    private String f7012e = "zh";

    /* renamed from: f, reason: collision with root package name */
    private String f7013f = "zh";

    /* renamed from: h, reason: collision with root package name */
    private boolean f7015h = false;

    /* renamed from: j, reason: collision with root package name */
    private int f7017j = 500;

    public List<LatLng> getBounds() {
        return this.f7018k;
    }

    public int getCoordType() {
        return this.f7010c;
    }

    public String getFromLanguage() {
        return this.f7013f;
    }

    public String getLanguage() {
        return this.f7012e;
    }

    public LatLng getLocation() {
        return this.f7016i;
    }

    public String getQuery() {
        return this.f7008a;
    }

    public int getRadius() {
        return this.f7017j;
    }

    public String getRegion() {
        return this.f7009b;
    }

    public String getRetCoordType() {
        return this.f7011d;
    }

    public boolean isHotword() {
        return this.f7014g;
    }

    public boolean isRegionLimit() {
        return this.f7015h;
    }

    public SuggestionOption setBounds(List<LatLng> list) {
        this.f7018k = list;
        return this;
    }

    public SuggestionOption setCoordType(int i8) {
        this.f7010c = i8;
        return this;
    }

    public SuggestionOption setFromLanguage(String str) {
        this.f7013f = str;
        return this;
    }

    public SuggestionOption setHotword(boolean z7) {
        this.f7014g = z7;
        return this;
    }

    public SuggestionOption setLanguage(String str) {
        this.f7012e = str;
        return this;
    }

    public SuggestionOption setLocation(LatLng latLng) {
        this.f7016i = latLng;
        return this;
    }

    public SuggestionOption setQuery(String str) {
        this.f7008a = str;
        return this;
    }

    public SuggestionOption setRadius(int i8) {
        this.f7017j = i8;
        return this;
    }

    public SuggestionOption setRegion(String str) {
        this.f7009b = str;
        return this;
    }

    public SuggestionOption setRegionLimit(boolean z7) {
        this.f7015h = z7;
        return this;
    }

    public SuggestionOption setRetCoordType(String str) {
        this.f7011d = str;
        return this;
    }
}
