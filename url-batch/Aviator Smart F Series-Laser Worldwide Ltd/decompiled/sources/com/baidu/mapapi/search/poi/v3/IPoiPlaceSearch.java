package com.baidu.mapapi.search.poi.v3;

import com.baidu.mapapi.search.poi.v3.bean.PoiResponse;
import com.baidu.mapapi.search.poi.v3.bean.SugResponse;

/* loaded from: classes2.dex */
public interface IPoiPlaceSearch {
    void searchPlaceAround(AroundOption aroundOption, PoiPlaceResultCallback<PoiResponse> poiPlaceResultCallback);

    void searchPlaceDetail(DetailOption detailOption, PoiPlaceResultCallback<PoiResponse> poiPlaceResultCallback);

    void searchPlacePolygon(PolygonOption polygonOption, PoiPlaceResultCallback<PoiResponse> poiPlaceResultCallback);

    void searchPlaceRegion(RegionOption regionOption, PoiPlaceResultCallback<PoiResponse> poiPlaceResultCallback);

    void searchPlaceSuggestion(SuggestionOption suggestionOption, PoiPlaceResultCallback<SugResponse> poiPlaceResultCallback);
}
