package com.baidu.mapapi.search.batch.common;

import java.util.List;

/* loaded from: classes2.dex */
public interface BatchResultCallback<T> {
    void onFailed(int i8, String str);

    void onSuccess(List<T> list);
}
