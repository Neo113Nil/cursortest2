package com.my.lib;

import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class P implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6.p f15354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f6.l f15355b;

    public P(f6.p pVar, f6.l lVar) {
        this.f15354a = pVar;
        this.f15355b = lVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e8) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(e8, "e");
        B.a("onFailure: ", e8, 1);
        this.f15354a.invoke(Integer.valueOf(e8 instanceof SocketTimeoutException ? 1 : 0), String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        if (!response.isSuccessful()) {
            this.f15354a.invoke(0, "HTTP error code: " + response.code());
            return;
        }
        if (!kotlin.jvm.internal.s.areEqual(response.headers().get("Content-Type"), com.yanzhenjie.kalle.i.VALUE_APPLICATION_JSON)) {
            ResponseBody body = response.body();
            byte[] bytes = body != null ? body.bytes() : null;
            if (bytes != null) {
                this.f15355b.invoke(bytes);
                return;
            } else {
                this.f15354a.invoke(2, "Failed to read file bytes");
                return;
            }
        }
        ResponseBody body2 = response.body();
        if (body2 == null) {
            this.f15354a.invoke(2, "");
            return;
        }
        f6.p pVar = this.f15354a;
        String string = body2.string();
        B.a("onResponse: " + string);
        y5.w wVar = y5.w.INSTANCE;
        pVar.invoke(10, string);
    }
}
