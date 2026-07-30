package com.my.lib;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.my.lib.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0431w implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6.p f15384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f6.l f15386c;

    public C0431w(f6.p pVar, String str, f6.l lVar) {
        this.f15384a = pVar;
        this.f15385b = str;
        this.f15386c = lVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e8) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(e8, "e");
        B.a("onFailure: ", e8, 1);
        this.f15384a.invoke(Integer.valueOf(e8 instanceof SocketTimeoutException ? 1 : 0), String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        if (!response.isSuccessful()) {
            response.close();
            this.f15384a.invoke(0, "HTTP error code: " + response.code());
            return;
        }
        ResponseBody body = response.body();
        if (body == null) {
            f6.p pVar = this.f15384a;
            response.close();
            pVar.invoke(2, "response body is null");
            return;
        }
        String str = this.f15385b;
        f6.l lVar = this.f15386c;
        f6.p pVar2 = this.f15384a;
        byte[] bytes = body.bytes();
        File file = new File(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            response.close();
            lVar.invoke(file);
        } catch (IOException e8) {
            response.close();
            pVar2.invoke(2, String.valueOf(e8.getMessage()));
        }
    }
}
