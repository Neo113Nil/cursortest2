package com.baidu.mapapi.search.route.v2;

/* loaded from: classes2.dex */
public interface RoutePlanResultCallback<T> {
    void failed(int i8, String str);

    void success(T t7);
}
