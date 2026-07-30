package com.baidu.platform.a.f;

import android.text.TextUtils;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.poi.PoiBoundSearchOption;
import com.baidu.mapapi.search.poi.PoiCitySearchOption;
import com.baidu.mapapi.search.poi.PoiFilter;
import com.baidu.mapapi.search.poi.PoiNearbySearchOption;
import com.baidu.mapapi.search.poi.PoiServerType;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.actions.SearchIntents;

/* loaded from: classes2.dex */
public class h extends com.baidu.platform.base.g {

    /* renamed from: e, reason: collision with root package name */
    private PoiServerType f8605e = PoiServerType.POI_SERVER_TYPE_DEFAULT;

    h(PoiNearbySearchOption poiNearbySearchOption) {
        a(poiNearbySearchOption);
    }

    private void a(PoiNearbySearchOption poiNearbySearchOption) {
        PoiFilter poiFilter;
        if (poiNearbySearchOption == null) {
            return;
        }
        this.f8605e = poiNearbySearchOption.mServerType;
        this.f8720d.a(SearchIntents.EXTRA_QUERY, poiNearbySearchOption.mKeyword);
        if (poiNearbySearchOption.mLanguageType == LanguageType.LanguageTypeEnglish) {
            this.f8720d.a("language", "en");
        }
        com.baidu.mapapi.search.base.a aVar = poiNearbySearchOption.mInputLanguageType;
        if (aVar != null) {
            this.f8720d.a("from_language", aVar.a());
        }
        if (poiNearbySearchOption.mLocation != null) {
            LatLng latLng = poiNearbySearchOption.mLocation;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng2 = CoordTrans.gcjToBaidu(latLng2);
            }
            if (latLng2 != null) {
                this.f8720d.a("location", latLng2.latitude + SystemInfoUtil.COMMA + latLng2.longitude);
            }
        }
        this.f8720d.a("photo_show", poiNearbySearchOption.isShowPhoto() ? "true" : "false");
        this.f8720d.a("radius", poiNearbySearchOption.mRadius + "");
        this.f8720d.a("output", BodyData.TYPE_JSON);
        this.f8720d.a("extensions_adcode", poiNearbySearchOption.isExtendAdcode() ? "true" : "false");
        this.f8720d.a("page_num", poiNearbySearchOption.mPageNum + "");
        this.f8720d.a("page_size", poiNearbySearchOption.mPageCapacity + "");
        this.f8720d.a("scope", poiNearbySearchOption.mScope + "");
        this.f8720d.a("tag", poiNearbySearchOption.mTag);
        if (poiNearbySearchOption.mRadiusLimit) {
            this.f8720d.a("radius_limit", "true");
        } else {
            this.f8720d.a("radius_limit", "false");
        }
        if (poiNearbySearchOption.mScope == 2 && (poiFilter = poiNearbySearchOption.mPoiFilter) != null && !TextUtils.isEmpty(poiFilter.toString())) {
            this.f8720d.a("filter", poiNearbySearchOption.mPoiFilter.toString());
        }
        if (poiNearbySearchOption.isExtendChildPoi()) {
            this.f8720d.a("extensions_child_poi", "true");
        } else {
            this.f8720d.a("extensions_child_poi", "false");
        }
        this.f8719c = poiNearbySearchOption.getCustomExtra();
    }

    h(PoiCitySearchOption poiCitySearchOption) {
        a(poiCitySearchOption);
    }

    h(PoiBoundSearchOption poiBoundSearchOption) {
        a(poiBoundSearchOption);
    }

    private void a(PoiCitySearchOption poiCitySearchOption) {
        PoiFilter poiFilter;
        if (poiCitySearchOption == null) {
            return;
        }
        this.f8605e = poiCitySearchOption.mServerType;
        this.f8720d.a(SearchIntents.EXTRA_QUERY, poiCitySearchOption.mKeyword);
        if (poiCitySearchOption.mLanguageType == LanguageType.LanguageTypeEnglish) {
            this.f8720d.a("language", "en");
        }
        com.baidu.mapapi.search.base.a aVar = poiCitySearchOption.mInputLanguageType;
        if (aVar != null) {
            this.f8720d.a("from_language", aVar.a());
        }
        this.f8720d.a("photo_show", poiCitySearchOption.isShowPhoto() ? "true" : "false");
        this.f8720d.a(TtmlNode.TAG_REGION, poiCitySearchOption.mCity);
        this.f8720d.a("output", BodyData.TYPE_JSON);
        this.f8720d.a("extensions_adcode", poiCitySearchOption.isExtendAdcode() ? "true" : "false");
        this.f8720d.a("page_num", poiCitySearchOption.mPageNum + "");
        this.f8720d.a("page_size", poiCitySearchOption.mPageCapacity + "");
        this.f8720d.a("scope", poiCitySearchOption.mScope + "");
        this.f8720d.a("tag", poiCitySearchOption.mTag);
        if (poiCitySearchOption.getCenter() != null) {
            LatLng latLng = new LatLng(poiCitySearchOption.getCenter().latitude, poiCitySearchOption.getCenter().longitude);
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng = CoordTrans.gcjToBaidu(latLng);
            }
            if (latLng != null) {
                this.f8720d.a(TtmlNode.CENTER, latLng.latitude + SystemInfoUtil.COMMA + latLng.longitude);
            }
        }
        if (poiCitySearchOption.getViewBound() != null && poiCitySearchOption.getViewBound().southwest != null && poiCitySearchOption.getViewBound().northeast != null) {
            LatLng latLng2 = new LatLng(poiCitySearchOption.getViewBound().southwest.latitude, poiCitySearchOption.getViewBound().southwest.longitude);
            LatLng latLng3 = new LatLng(poiCitySearchOption.getViewBound().northeast.latitude, poiCitySearchOption.getViewBound().northeast.longitude);
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng2 = CoordTrans.gcjToBaidu(latLng2);
                latLng3 = CoordTrans.gcjToBaidu(latLng3);
            }
            if (latLng2 != null && latLng3 != null) {
                this.f8720d.a("view_bound", latLng2.latitude + SystemInfoUtil.COMMA + latLng2.longitude + SystemInfoUtil.COMMA + latLng3.latitude + SystemInfoUtil.COMMA + latLng3.longitude);
            }
        }
        if (poiCitySearchOption.getSearchBound() != null && poiCitySearchOption.getSearchBound().southwest != null && poiCitySearchOption.getSearchBound().northeast != null) {
            LatLng latLng4 = new LatLng(poiCitySearchOption.getSearchBound().southwest.latitude, poiCitySearchOption.getSearchBound().southwest.longitude);
            LatLng latLng5 = new LatLng(poiCitySearchOption.getSearchBound().northeast.latitude, poiCitySearchOption.getSearchBound().northeast.longitude);
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng4 = CoordTrans.gcjToBaidu(latLng4);
                latLng5 = CoordTrans.gcjToBaidu(latLng5);
            }
            if (latLng4 != null && latLng5 != null) {
                this.f8720d.a("search_bound", latLng4.latitude + SystemInfoUtil.COMMA + latLng4.longitude + SystemInfoUtil.COMMA + latLng5.latitude + SystemInfoUtil.COMMA + latLng5.longitude);
            }
        }
        if (poiCitySearchOption.getFilterDistance() > 0) {
            this.f8720d.a("view_distance", poiCitySearchOption.getFilterDistance() + "");
        }
        if (poiCitySearchOption.mIsCityLimit) {
            this.f8720d.a("city_limit", "true");
        } else {
            this.f8720d.a("city_limit", "false");
        }
        if (poiCitySearchOption.mScope == 2 && (poiFilter = poiCitySearchOption.mPoiFilter) != null && !TextUtils.isEmpty(poiFilter.toString())) {
            this.f8720d.a("filter", poiCitySearchOption.mPoiFilter.toString());
        }
        if (poiCitySearchOption.isExtendChildPoi()) {
            this.f8720d.a("extensions_child_poi", "true");
        } else {
            this.f8720d.a("extensions_child_poi", "false");
        }
        this.f8719c = poiCitySearchOption.getCustomExtra();
    }

    private void a(PoiBoundSearchOption poiBoundSearchOption) {
        PoiFilter poiFilter;
        if (poiBoundSearchOption == null) {
            return;
        }
        this.f8605e = poiBoundSearchOption.mServerType;
        this.f8720d.a(SearchIntents.EXTRA_QUERY, poiBoundSearchOption.mKeyword);
        if (poiBoundSearchOption.mLanguageType == LanguageType.LanguageTypeEnglish) {
            this.f8720d.a("language", "en");
        }
        com.baidu.mapapi.search.base.a aVar = poiBoundSearchOption.mInputLanguageType;
        if (aVar != null) {
            this.f8720d.a("from_language", aVar.a());
        }
        this.f8720d.a("photo_show", poiBoundSearchOption.isShowPhoto() ? "true" : "false");
        this.f8720d.a("tag", poiBoundSearchOption.mTag);
        LatLngBounds latLngBounds = poiBoundSearchOption.mBound;
        if (latLngBounds != null && latLngBounds.southwest != null && latLngBounds.northeast != null) {
            LatLng latLng = poiBoundSearchOption.mBound.southwest;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            LatLng latLng3 = poiBoundSearchOption.mBound.northeast;
            LatLng latLng4 = new LatLng(latLng3.latitude, latLng3.longitude);
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng2 = CoordTrans.gcjToBaidu(latLng2);
                latLng4 = CoordTrans.gcjToBaidu(latLng4);
            }
            if (latLng2 != null && latLng4 != null) {
                this.f8720d.a("bounds", latLng2.latitude + SystemInfoUtil.COMMA + latLng2.longitude + SystemInfoUtil.COMMA + latLng4.latitude + SystemInfoUtil.COMMA + latLng4.longitude);
            }
        }
        this.f8720d.a("output", BodyData.TYPE_JSON);
        this.f8720d.a("extensions_adcode", poiBoundSearchOption.isExtendAdcode() ? "true" : "false");
        this.f8720d.a("scope", poiBoundSearchOption.mScope + "");
        this.f8720d.a("page_num", poiBoundSearchOption.mPageNum + "");
        this.f8720d.a("page_size", poiBoundSearchOption.mPageCapacity + "");
        if (poiBoundSearchOption.mScope == 2 && (poiFilter = poiBoundSearchOption.mPoiFilter) != null && !TextUtils.isEmpty(poiFilter.toString())) {
            this.f8720d.a("filter", poiBoundSearchOption.mPoiFilter.toString());
        }
        if (poiBoundSearchOption.isExtendChildPoi()) {
            this.f8720d.a("extensions_child_poi", "true");
        } else {
            this.f8720d.a("extensions_child_poi", "false");
        }
        this.f8719c = poiBoundSearchOption.getCustomExtra();
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        if (this.f8605e == PoiServerType.POI_SERVER_TYPE_ABROAD) {
            return cVar.q();
        }
        return cVar.t();
    }
}
