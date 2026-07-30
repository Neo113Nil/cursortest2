package com.my.lib;

import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class S implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6.p f15357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f6.l f15358b;

    public S(f6.p pVar, f6.l lVar) {
        this.f15357a = pVar;
        this.f15358b = lVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e8) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(e8, "e");
        B.a("onFailure: ", e8, 1);
        this.f15357a.invoke(Integer.valueOf(e8 instanceof SocketTimeoutException ? 1 : 0), String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        if (!response.isSuccessful()) {
            this.f15357a.invoke(0, "HTTP error code: " + response.code());
            return;
        }
        ResponseBody body = response.body();
        if (body == null) {
            this.f15357a.invoke(2, "response body is null");
            return;
        }
        f6.l lVar = this.f15358b;
        String string = body.string();
        B.a("onResponse: " + string);
        lVar.invoke(string);
    }
}
