package com.onesignal.core.internal.http.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.core.internal.http.impl.HttpClient", f = "HttpClient.kt", l = {292}, m = "makeRequestIODispatcher")
/* loaded from: classes.dex */
public final class HttpClient$makeRequestIODispatcher$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClient$makeRequestIODispatcher$1(HttpClient httpClient, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = httpClient;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object makeRequestIODispatcher;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        makeRequestIODispatcher = this.this$0.makeRequestIODispatcher(null, null, null, 0, null, this);
        return makeRequestIODispatcher;
    }
}
