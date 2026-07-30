package com.baidu.mapapi.map.offline;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapsdkplatform.comapi.map.j;
import com.baidu.mapsdkplatform.comapi.map.l;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class OfflineMapUtil {
    public static MKOLSearchRecord getSearchRecordFromLocalCityInfo(j jVar) {
        if (jVar == null) {
            return null;
        }
        MKOLSearchRecord mKOLSearchRecord = new MKOLSearchRecord();
        mKOLSearchRecord.cityID = jVar.f8108a;
        mKOLSearchRecord.cityName = jVar.f8109b;
        mKOLSearchRecord.cityType = jVar.f8111d;
        long j8 = 0;
        if (jVar.a() != null) {
            ArrayList<MKOLSearchRecord> arrayList = new ArrayList<>();
            Iterator<j> it = jVar.a().iterator();
            while (it.hasNext()) {
                arrayList.add(getSearchRecordFromLocalCityInfo(it.next()));
                j8 += r5.f8110c;
                mKOLSearchRecord.childCities = arrayList;
            }
        }
        if (mKOLSearchRecord.cityType == 1) {
            mKOLSearchRecord.dataSize = j8;
        } else {
            mKOLSearchRecord.dataSize = jVar.f8110c;
        }
        return mKOLSearchRecord;
    }

    public static MKOLUpdateElement getUpdatElementFromLocalMapElement(l lVar) {
        if (lVar == null) {
            return null;
        }
        MKOLUpdateElement mKOLUpdateElement = new MKOLUpdateElement();
        mKOLUpdateElement.cityID = lVar.f8118a;
        mKOLUpdateElement.cityName = lVar.f8119b;
        GeoPoint geoPoint = lVar.f8124g;
        if (geoPoint != null) {
            mKOLUpdateElement.geoPt = CoordUtil.mc2ll(geoPoint);
        }
        mKOLUpdateElement.level = lVar.f8122e;
        int i8 = lVar.f8126i;
        mKOLUpdateElement.ratio = i8;
        int i9 = lVar.f8125h;
        mKOLUpdateElement.serversize = i9;
        if (i8 == 100) {
            mKOLUpdateElement.size = i9;
        } else {
            mKOLUpdateElement.size = (i9 / 100) * i8;
        }
        mKOLUpdateElement.status = lVar.f8129l;
        mKOLUpdateElement.update = lVar.f8127j;
        return mKOLUpdateElement;
    }
}
