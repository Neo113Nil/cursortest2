package com.crrepa.band.my.device.appmarket.map;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiChildrenInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPPoiSugInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.LocationBean;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class i {
    public static CRPPoiSugInfo build(SuggestionResult suggestionResult) {
        if (suggestionResult == null || suggestionResult.error != SearchResult.ERRORNO.NO_ERROR) {
            return new CRPPoiSugInfo(8, null);
        }
        ArrayList arrayList = new ArrayList();
        for (SuggestionResult.SuggestionInfo suggestionInfo : suggestionResult.getAllSuggestions()) {
            CRPPoiSugInfo.Suggestion suggestion = new CRPPoiSugInfo.Suggestion();
            suggestion.setKey(suggestionInfo.key);
            suggestion.setUid(suggestionInfo.uid);
            suggestion.setCity(suggestionInfo.city);
            suggestion.setDistrict(suggestionInfo.district);
            suggestion.setTag(suggestionInfo.tag);
            suggestion.setAddress(suggestionInfo.address);
            LatLng latLng = suggestionInfo.pt;
            if (latLng != null) {
                suggestion.setLocation(new LocationBean(latLng.latitude, latLng.longitude));
            }
            List<PoiChildrenInfo> poiChildrenInfoList = suggestionInfo.getPoiChildrenInfoList();
            if (poiChildrenInfoList != null && !poiChildrenInfoList.isEmpty()) {
                PoiChildrenInfo poiChildrenInfo = poiChildrenInfoList.get(0);
                suggestion.setChildren(new CRPPoiSugInfo.Children(poiChildrenInfo.getUid(), poiChildrenInfo.getName(), poiChildrenInfo.getShowName()));
            }
            arrayList.add(suggestion);
        }
        return new CRPPoiSugInfo(0, new CRPPoiSugInfo.Result(arrayList));
    }
}
