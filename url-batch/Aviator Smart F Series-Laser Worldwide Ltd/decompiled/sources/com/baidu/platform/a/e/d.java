package com.baidu.platform.a.e;

import com.baidu.mapapi.search.geocode.GeoCodeOption;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeOption;

/* loaded from: classes2.dex */
public interface d {
    void a(OnGetGeoCoderResultListener onGetGeoCoderResultListener);

    boolean a(GeoCodeOption geoCodeOption);

    boolean a(ReverseGeoCodeOption reverseGeoCodeOption);

    void destroy();
}
