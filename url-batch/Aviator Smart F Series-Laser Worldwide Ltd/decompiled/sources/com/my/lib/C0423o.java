package com.my.lib;

import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.my.lib.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0423o implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6.p f15379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f6.l f15380b;

    public C0423o(f6.p pVar, f6.l lVar) {
        this.f15379a = pVar;
        this.f15380b = lVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e8) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(e8, "e");
        B.a(null, e8, 3);
        this.f15379a.invoke(Integer.valueOf(e8 instanceof SocketTimeoutException ? 1 : 0), String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        String string;
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        if (!response.isSuccessful()) {
            this.f15379a.invoke(0, "HTTP error code: " + response.code());
            return;
        }
        ResponseBody body = response.body();
        if (body == null || (string = body.string()) == null) {
            this.f15379a.invoke(2, "response body is null");
            return;
        }
        f6.l lVar = this.f15380b;
        B.a("onResponse: " + string);
        lVar.invoke(string);
    }
}
