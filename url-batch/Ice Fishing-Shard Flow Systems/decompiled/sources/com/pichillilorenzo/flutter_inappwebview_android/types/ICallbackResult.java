package com.pichillilorenzo.flutter_inappwebview_android.types;

import s4.p;

/* loaded from: classes.dex */
public interface ICallbackResult<T> extends p {
    T decodeResult(Object obj);

    void defaultBehaviour(T t6);

    @Override // s4.p
    /* synthetic */ void error(String str, String str2, Object obj);

    boolean nonNullSuccess(T t6);

    @Override // s4.p
    /* synthetic */ void notImplemented();

    boolean nullSuccess();

    @Override // s4.p
    /* synthetic */ void success(Object obj);
}
