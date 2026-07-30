package com.my.lib;

import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* renamed from: com.my.lib.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0417i implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6.p f15374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f6.l f15375b;

    public C0417i(f6.p pVar, f6.l lVar) {
        this.f15374a = pVar;
        this.f15375b = lVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e8) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(e8, "e");
        B.a("onFailure: ", e8, 1);
        this.f15374a.invoke(Integer.valueOf(e8 instanceof SocketTimeoutException ? 1 : 0), String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        if (!response.isSuccessful()) {
            B.a("onResponse: " + response);
            this.f15374a.invoke(0, "HTTP error code: " + response.code());
            return;
        }
        try {
            ResponseBody body = response.body();
            String string = body != null ? body.string() : null;
            B.a("onResponse: " + string);
            if (string == null) {
                this.f15374a.invoke(2, "Response body is null");
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            int optInt = jSONObject.optInt("VzQn");
            if (optInt == 0) {
                String optString = jSONObject.getJSONObject("Wlgj").optString("Voa");
                f6.l lVar = this.f15375b;
                kotlin.jvm.internal.s.checkNotNull(optString);
                lVar.invoke(optString);
                return;
            }
            String optString2 = jSONObject.optString("fpfBsZp");
            f6.p pVar = this.f15374a;
            Integer valueOf = Integer.valueOf(optInt);
            kotlin.jvm.internal.s.checkNotNull(optString2);
            pVar.invoke(valueOf, optString2);
        } catch (Exception e8) {
            B.a("JSON parsing error: ", e8, 1);
            this.f15374a.invoke(2, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "JSON parsing error"));
        }
    }
}
