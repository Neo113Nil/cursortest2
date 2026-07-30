package com.baidu.mapapi.search.poi.v3;

/* loaded from: classes2.dex */
public interface PoiPlaceResultCallback<T> {
    void failed(int i8, String str);

    void success(T t7);
}
