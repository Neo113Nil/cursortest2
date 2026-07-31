package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oq1;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xm implements uo0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34617a;

    public xm(boolean z4) {
        this.f34617a = z4;
    }

    @Override // com.yandex.mobile.ads.impl.uo0
    @NotNull
    public final oq1 a(@NotNull xn1 chain) {
        boolean z4;
        oq1.a aVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        r50 d4 = chain.d();
        Intrinsics.checkNotNull(d4);
        pp1 f4 = chain.f();
        sp1 a4 = f4.a();
        long currentTimeMillis = System.currentTimeMillis();
        d4.b(f4);
        if (!fh0.a(f4.f()) || a4 == null) {
            d4.l();
            z4 = true;
            aVar = null;
        } else {
            if (StringsKt.w("100-continue", f4.a("Expect"), true)) {
                d4.d();
                aVar = d4.a(true);
                d4.m();
                z4 = false;
            } else {
                z4 = true;
                aVar = null;
            }
            if (aVar == null) {
                okio.f c4 = okio.p.c(d4.a(f4));
                a4.a(c4);
                c4.close();
            } else {
                d4.l();
                if (!d4.f().h()) {
                    d4.k();
                }
            }
        }
        d4.c();
        if (aVar == null) {
            aVar = d4.a(false);
            Intrinsics.checkNotNull(aVar);
            if (z4) {
                d4.m();
                z4 = false;
            }
        }
        oq1 a5 = aVar.a(f4).a(d4.f().f()).b(currentTimeMillis).a(System.currentTimeMillis()).a();
        int d5 = a5.d();
        if (d5 == 100) {
            oq1.a a6 = d4.a(false);
            Intrinsics.checkNotNull(a6);
            if (z4) {
                d4.m();
            }
            a5 = a6.a(f4).a(d4.f().f()).b(currentTimeMillis).a(System.currentTimeMillis()).a();
            d5 = a5.d();
        }
        d4.b(a5);
        oq1 a7 = (this.f34617a && d5 == 101) ? a5.k().a(v82.f33552c).a() : a5.k().a(d4.a(a5)).a();
        if (StringsKt.w("close", a7.o().a("Connection"), true) || StringsKt.w("close", oq1.a(a7, "Connection"), true)) {
            d4.k();
        }
        if (d5 == 204 || d5 == 205) {
            sq1 a8 = a7.a();
            if ((a8 != null ? a8.a() : -1L) > 0) {
                sq1 a9 = a7.a();
                throw new ProtocolException("HTTP " + d5 + " had non-zero Content-Length: " + (a9 != null ? Long.valueOf(a9.a()) : null));
            }
        }
        return a7;
    }
}
