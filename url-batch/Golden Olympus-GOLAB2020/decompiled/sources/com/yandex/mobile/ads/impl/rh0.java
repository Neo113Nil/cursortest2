package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rh0 extends AbstractC2303vj {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final SSLSocketFactory f31189a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final yd1 f31190b = new yd1();

    public rh0(@Nullable SSLSocketFactory sSLSocketFactory) {
        this.f31189a = sSLSocketFactory;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2303vj
    @NotNull
    public final hh0 a(@NotNull op1<?> request, @NotNull Map<String, String> additionalHeaders) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(additionalHeaders, "additionalHeaders");
        int j4 = request.j();
        int i4 = ud1.f33041c;
        td1 a4 = ud1.a(j4, j4, this.f31189a);
        pp1 request2 = this.f31190b.a(request, additionalHeaders);
        Intrinsics.checkNotNullParameter(request2, "request");
        oq1 response = new tn1(a4, request2, false).b();
        int d4 = response.d();
        TreeMap requestHeaders = response.g().c();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : requestHeaders.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                arrayList.add(new ze0(str, (String) it.next()));
            }
        }
        if (request.f() == 4 || ((100 <= d4 && d4 < 200) || d4 == 204 || d4 == 304)) {
            return new hh0(d4, arrayList, -1, null);
        }
        sq1 a5 = response.a();
        int a6 = a5 != null ? (int) a5.a() : 0;
        Intrinsics.checkNotNullParameter(response, "response");
        sq1 a7 = response.a();
        return new hh0(d4, arrayList, a6, a7 != null ? a7.c().S() : null);
    }
}
