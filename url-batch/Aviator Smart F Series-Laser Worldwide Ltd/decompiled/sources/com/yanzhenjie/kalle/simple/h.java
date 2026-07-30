package com.yanzhenjie.kalle.simple;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public abstract class h extends d {
    @Override // com.yanzhenjie.kalle.simple.d
    public Type getFailed() {
        return String.class;
    }

    @Override // com.yanzhenjie.kalle.simple.d
    public Type getSucceed() {
        return ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override // com.yanzhenjie.kalle.simple.d
    public void onCancel() {
    }

    @Override // com.yanzhenjie.kalle.simple.d
    public void onEnd() {
    }

    @Override // com.yanzhenjie.kalle.simple.d
    public void onException(Exception exc) {
    }

    @Override // com.yanzhenjie.kalle.simple.d
    public void onStart() {
    }
}
