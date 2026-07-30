package com.baidu.mapapi.search.geocode;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.platform.comapi.map.MapController;

/* loaded from: classes2.dex */
public class ReverseGeoCodeOption {

    /* renamed from: a, reason: collision with root package name */
    private int f6865a = 10;

    /* renamed from: b, reason: collision with root package name */
    private int f6866b = 0;

    /* renamed from: c, reason: collision with root package name */
    private LatLng f6867c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f6868d = 1;

    /* renamed from: e, reason: collision with root package name */
    private int f6869e = 1000;

    /* renamed from: f, reason: collision with root package name */
    private String f6870f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6871g = false;

    /* renamed from: h, reason: collision with root package name */
    private LanguageType f6872h = LanguageType.LanguageTypeChinese;

    /* renamed from: i, reason: collision with root package name */
    private int f6873i = 0;

    /* renamed from: j, reason: collision with root package name */
    private SortStrategyType f6874j = SortStrategyType.DEFAULT;

    public enum SortStrategyType {
        DISTANCE("distance"),
        RANK("rank"),
        DEFAULT(MapController.DEFAULT_LAYER_TAG);


        /* renamed from: b, reason: collision with root package name */
        private String f6876b;

        SortStrategyType(String str) {
            this.f6876b = str;
        }

        public String getDescription() {
            return this.f6876b;
        }
    }

    public ReverseGeoCodeOption entirePoi(int i8) {
        this.f6873i = i8;
        return this;
    }

    public ReverseGeoCodeOption extensionsRoad(boolean z7) {
        this.f6871g = z7;
        return this;
    }

    public int getEntirePoi() {
        return this.f6873i;
    }

    public boolean getExtensionsRoad() {
        return this.f6871g;
    }

    public LanguageType getLanguage() {
        return this.f6872h;
    }

    public int getLatestAdmin() {
        return this.f6868d;
    }

    public LatLng getLocation() {
        return this.f6867c;
    }

    public int getPageNum() {
        return this.f6866b;
    }

    public int getPageSize() {
        return this.f6865a;
    }

    public String getPoiType() {
        return this.f6870f;
    }

    public int getRadius() {
        return this.f6869e;
    }

    public SortStrategyType getSortStrategy() {
        return this.f6874j;
    }

    public ReverseGeoCodeOption language(LanguageType languageType) {
        this.f6872h = languageType;
        return this;
    }

    public ReverseGeoCodeOption location(LatLng latLng) {
        this.f6867c = latLng;
        return this;
    }

    public ReverseGeoCodeOption newVersion(int i8) {
        this.f6868d = i8;
        return this;
    }

    public ReverseGeoCodeOption pageNum(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        this.f6866b = i8;
        return this;
    }

    public ReverseGeoCodeOption pageSize(int i8) {
        if (i8 <= 0) {
            this.f6865a = 10;
        } else if (i8 > 100) {
            this.f6865a = 100;
        } else {
            this.f6865a = i8;
        }
        return this;
    }

    public ReverseGeoCodeOption poiType(String str) {
        this.f6870f = str;
        return this;
    }

    public ReverseGeoCodeOption radius(int i8) {
        if (i8 < 0) {
            this.f6869e = 0;
        } else if (i8 > 1000) {
            this.f6869e = 1000;
        } else {
            this.f6869e = i8;
        }
        return this;
    }

    public ReverseGeoCodeOption sortStrategy(SortStrategyType sortStrategyType) {
        this.f6874j = sortStrategyType;
        return this;
    }
}
