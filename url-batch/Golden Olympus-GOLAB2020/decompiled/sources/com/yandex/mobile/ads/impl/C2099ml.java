package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.pp1;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ml, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2099ml implements uo0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ds f29141a;

    public C2099ml(@NotNull ds cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f29141a = cookieJar;
    }

    @Override // com.yandex.mobile.ads.impl.uo0
    @NotNull
    public final oq1 a(@NotNull xn1 chain) {
        boolean z4;
        sq1 a4;
        Intrinsics.checkNotNullParameter(chain, "chain");
        pp1 i4 = chain.i();
        i4.getClass();
        pp1.a aVar = new pp1.a(i4);
        sp1 a5 = i4.a();
        if (a5 != null) {
            kw0 b4 = a5.b();
            if (b4 != null) {
                aVar.b(com.ironsource.cc.f15718K, b4.toString());
            }
            long a6 = a5.a();
            if (a6 != -1) {
                aVar.b("Content-Length", String.valueOf(a6));
                aVar.a("Transfer-Encoding");
            } else {
                aVar.b("Transfer-Encoding", "chunked");
                aVar.a("Content-Length");
            }
        }
        int i5 = 0;
        if (i4.a("Host") == null) {
            aVar.b("Host", v82.a(i4.g(), false));
        }
        if (i4.a("Connection") == null) {
            aVar.b("Connection", "Keep-Alive");
        }
        if (i4.a("Accept-Encoding") == null && i4.a("Range") == null) {
            aVar.b("Accept-Encoding", "gzip");
            z4 = true;
        } else {
            z4 = false;
        }
        List<bs> a7 = this.f29141a.a(i4.g());
        if (!a7.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : a7) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                bs bsVar = (bs) obj;
                if (i5 > 0) {
                    sb.append("; ");
                }
                sb.append(bsVar.e());
                sb.append(com.ironsource.cc.f15727T);
                sb.append(bsVar.f());
                i5 = i6;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            aVar.b("Cookie", sb2);
        }
        if (i4.a("User-Agent") == null) {
            aVar.b("User-Agent", "okhttp/4.9.3");
        }
        oq1 a8 = chain.a(aVar.a());
        dh0.a(this.f29141a, i4.g(), a8.g());
        oq1.a a9 = new oq1.a(a8).a(i4);
        if (z4 && StringsKt.w("gzip", oq1.a(a8, "Content-Encoding"), true) && dh0.a(a8) && (a4 = a8.a()) != null) {
            okio.m mVar = new okio.m(a4.c());
            a9.a(a8.g().b().a("Content-Encoding").a("Content-Length").a());
            a9.a(new yn1(oq1.a(a8, com.ironsource.cc.f15718K), -1L, okio.p.d(mVar)));
        }
        return a9.a();
    }
}
