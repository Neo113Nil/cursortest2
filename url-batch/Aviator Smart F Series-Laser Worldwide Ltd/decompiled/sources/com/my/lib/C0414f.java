package com.my.lib;

import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* renamed from: com.my.lib.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0414f implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6.p f15372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f6.l f15373b;

    public C0414f(f6.p pVar, f6.l lVar) {
        this.f15372a = pVar;
        this.f15373b = lVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e8) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(e8, "e");
        B.a("onFailure: ", e8, 1);
        this.f15372a.invoke(Integer.valueOf(e8 instanceof SocketTimeoutException ? 1 : 0), String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        if (response.isSuccessful()) {
            this.f15373b.invoke(response);
            return;
        }
        this.f15372a.invoke(0, "HTTP error code: " + response.code());
    }
}
