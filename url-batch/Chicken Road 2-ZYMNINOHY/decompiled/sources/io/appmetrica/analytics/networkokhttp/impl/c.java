package io.appmetrica.analytics.networkokhttp.impl;

import G3.C0051b;
import G3.m;
import G3.n;
import G3.s;
import G3.u;
import G3.v;
import G3.y;
import O3.l;
import io.appmetrica.analytics.coreutils.internal.io.InputStreamUtils;
import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import t3.C1442b;
import t3.C1443c;
import w3.o;

/* loaded from: classes.dex */
public final class c extends Call {

    /* renamed from: a, reason: collision with root package name */
    public final s f13281a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f13282b;

    /* renamed from: c, reason: collision with root package name */
    public final NetworkClientSettings f13283c;

    public c(s sVar, Request request, NetworkClientSettings networkClientSettings) {
        this.f13281a = sVar;
        this.f13282b = request;
        this.f13283c = networkClientSettings;
    }

    public static LinkedHashMap a(n nVar) {
        C1443c H4 = O3.d.H(0, nVar.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = H4.iterator();
        while (((C1442b) it).f15429c) {
            int nextInt = ((C1442b) it).nextInt();
            String c4 = nVar.c(nextInt);
            Object obj = linkedHashMap.get(c4);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c4, obj);
            }
            ((List) obj).add(nVar.e(nextInt));
        }
        return linkedHashMap;
    }

    @Override // io.appmetrica.analytics.networkapi.Call
    public final Response execute() {
        try {
            s sVar = this.f13281a;
            v request = a(this.f13282b);
            sVar.getClass();
            i.e(request, "request");
            y c4 = new K3.i(sVar, request).c();
            return new Response.Builder(true, c4.f1036d, InputStreamUtils.INSTANCE.readSafelyApprox(this.f13283c.getMaxResponseSize(), new b(c4))).withHeaders(a(c4.f1038f)).withUrl(c4.f1033a.f1012a.f954h).build();
        } catch (Throwable th) {
            return new Response.Builder(th).build();
        }
    }

    public static v a(Request request) {
        u uVar = new u();
        String url = request.getUrl();
        i.e(url, "url");
        if (o.a0(url, "ws:", true)) {
            String substring = url.substring(3);
            i.d(substring, "this as java.lang.String).substring(startIndex)");
            url = i.h(substring, "http:");
        } else if (o.a0(url, "wss:", true)) {
            String substring2 = url.substring(4);
            i.d(substring2, "this as java.lang.String).substring(startIndex)");
            url = i.h(substring2, "https:");
        }
        i.e(url, "<this>");
        G3.o oVar = new G3.o();
        oVar.c(null, url);
        uVar.f1007a = oVar.a();
        int i4 = a.f13279a[request.getMethod().ordinal()];
        if (i4 == 1) {
            uVar.g("GET", null);
        } else if (i4 == 2) {
            uVar.g(request.getMethod().getMethodName(), C0051b.c(request.getBody()));
        }
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            String name = entry.getKey();
            String value = entry.getValue();
            i.e(name, "name");
            i.e(value, "value");
            m mVar = (m) uVar.f1009c;
            mVar.getClass();
            l.c(name);
            l.d(value, name);
            mVar.f(name, value);
        }
        return uVar.a();
    }
}
