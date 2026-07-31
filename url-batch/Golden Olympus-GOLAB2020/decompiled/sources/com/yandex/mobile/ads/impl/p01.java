package com.yandex.mobile.ads.impl;

import android.content.Context;
import f2.AbstractC2419b;
import f2.AbstractC2420c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p01 extends AbstractC2303vj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nn1 f30257a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mc1 f30258b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ih0 f30259c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC2303vj f30260d;

    public p01(@NotNull Context appContext, @Nullable SSLSocketFactory sSLSocketFactory, @NotNull nn1 readyHttpResponseCreator, @NotNull mc1 networkResponseCreator, @NotNull ih0 httpResponseContentReader, @NotNull qh0 hurlStackFactory) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(readyHttpResponseCreator, "readyHttpResponseCreator");
        Intrinsics.checkNotNullParameter(networkResponseCreator, "networkResponseCreator");
        Intrinsics.checkNotNullParameter(httpResponseContentReader, "httpResponseContentReader");
        Intrinsics.checkNotNullParameter(hurlStackFactory, "hurlStackFactory");
        this.f30257a = readyHttpResponseCreator;
        this.f30258b = networkResponseCreator;
        this.f30259c = httpResponseContentReader;
        hurlStackFactory.getClass();
        this.f30260d = qh0.a(appContext, sSLSocketFactory);
    }

    private final hh0 b(op1<?> op1Var, Map<String, String> map) {
        lc1 networkResponse = this.f30258b.a(op1Var);
        if (networkResponse == null) {
            hh0 a4 = this.f30260d.a(op1Var, map);
            Intrinsics.checkNotNull(a4);
            return a4;
        }
        this.f30257a.getClass();
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        ArrayList arrayList = new ArrayList();
        Map<String, String> map2 = networkResponse.f28507c;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                arrayList.add(new ze0(entry.getKey(), entry.getValue()));
            }
        }
        return new hh0(networkResponse.f28505a, arrayList, networkResponse.f28506b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0 == null) goto L18;
     */
    @Override // com.yandex.mobile.ads.impl.AbstractC2303vj
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hh0 a(@NotNull op1<?> request, @NotNull Map<String, String> additionalHeaders) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(additionalHeaders, "additionalHeaders");
        if (!y01.f34757a.a()) {
            return b(request, additionalHeaders);
        }
        long currentTimeMillis = System.currentTimeMillis();
        hh0 response = b(request, additionalHeaders);
        this.f30259c.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            InputStream a4 = response.a();
            if (a4 != null) {
                try {
                    bArr = AbstractC2419b.c(a4);
                    AbstractC2420c.a(a4, null);
                } finally {
                }
            }
            bArr = new byte[0];
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        hh0 hh0Var = new hh0(response.e(), response.d(), bArr);
        zp1.a(System.currentTimeMillis(), request, new lc1(hh0Var.e(), hh0Var.b(), true, System.currentTimeMillis() - currentTimeMillis, hh0Var.d()));
        return hh0Var;
    }
}
