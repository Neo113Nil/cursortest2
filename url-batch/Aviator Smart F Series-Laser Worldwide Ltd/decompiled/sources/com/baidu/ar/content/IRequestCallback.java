package com.baidu.ar.content;

/* loaded from: classes.dex */
public interface IRequestCallback<T> {
    void onFail(int i8, String str);

    void onResponse(T t7);
}
