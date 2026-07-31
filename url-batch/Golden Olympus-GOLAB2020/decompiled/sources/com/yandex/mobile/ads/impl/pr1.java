package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nr1;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pr1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2394zi f30554a;

    public /* synthetic */ pr1() {
        this(new C2394zi());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nr1 a(@NotNull pq1 networkResponse) {
        Integer valueOf;
        String a4;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Map<String, String> responseHeaders = networkResponse.b();
        bh0 httpHeader = bh0.f23749B;
        int i4 = cf0.f24191b;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
        String a5 = cf0.a(responseHeaders, httpHeader);
        int i5 = C2362y9.f34935b;
        gx1 gx1Var = null;
        if (a5 != null) {
            try {
                valueOf = Integer.valueOf(a5);
            } catch (NumberFormatException unused) {
            }
            a4 = cf0.a(responseHeaders, bh0.f23751D);
            if (a4 == null) {
                this.f30554a.getClass();
                str = C2394zi.a(a4);
            } else {
                str = null;
            }
            uo uoVar = (valueOf != null || str == null || str.length() <= 0) ? null : new uo(valueOf.intValue(), str);
            bh0 header = bh0.f23752E;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(header, "header");
            str2 = (String) CollectionsKt.firstOrNull((List) cf0.c(responseHeaders, header));
            if (str2 != null && str2.length() > 0) {
                gx1Var = new gx1(str2);
            }
            bh0 httpHeader2 = bh0.f23757J;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader2, "httpHeader");
            String a6 = cf0.a(responseHeaders, httpHeader2);
            return new nr1.a().a(uoVar).a(gx1Var).a(a6 != null ? false : Boolean.parseBoolean(a6)).a();
        }
        valueOf = null;
        a4 = cf0.a(responseHeaders, bh0.f23751D);
        if (a4 == null) {
        }
        if (valueOf != null) {
        }
        bh0 header2 = bh0.f23752E;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(header2, "header");
        str2 = (String) CollectionsKt.firstOrNull((List) cf0.c(responseHeaders, header2));
        if (str2 != null) {
            gx1Var = new gx1(str2);
        }
        bh0 httpHeader22 = bh0.f23757J;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader22, "httpHeader");
        String a62 = cf0.a(responseHeaders, httpHeader22);
        return new nr1.a().a(uoVar).a(gx1Var).a(a62 != null ? false : Boolean.parseBoolean(a62)).a();
    }

    public pr1(@NotNull C2394zi base64Decoder) {
        Intrinsics.checkNotNullParameter(base64Decoder, "base64Decoder");
        this.f30554a = base64Decoder;
    }
}
