package com.yanzhenjie.kalle.simple;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public abstract class d {
    public Type getFailed() {
        return ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    public Type getSucceed() {
        return ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public abstract void onCancel();

    public abstract void onEnd();

    public abstract void onException(Exception exc);

    public abstract void onResponse(j jVar);

    public abstract void onStart();
}
