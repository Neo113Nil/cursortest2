package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ff0;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.pm;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mm implements uo0 {

    public static final class a {
        private a() {
        }

        public static final ff0 a(ff0 ff0Var, ff0 ff0Var2) {
            ff0.a aVar = new ff0.a();
            int size = ff0Var.size();
            for (int i4 = 0; i4 < size; i4++) {
                String a4 = ff0Var.a(i4);
                String b4 = ff0Var.b(i4);
                if ((!StringsKt.w("Warning", a4, true) || !StringsKt.K(b4, "1", false, 2, null)) && (StringsKt.w("Content-Length", a4, true) || StringsKt.w("Content-Encoding", a4, true) || StringsKt.w(com.ironsource.cc.f15718K, a4, true) || !a(a4) || ff0Var2.a(a4) == null)) {
                    aVar.a(a4, b4);
                }
            }
            int size2 = ff0Var2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String a5 = ff0Var2.a(i5);
                if (!StringsKt.w("Content-Length", a5, true) && !StringsKt.w("Content-Encoding", a5, true) && !StringsKt.w(com.ironsource.cc.f15718K, a5, true) && a(a5)) {
                    aVar.a(a5, ff0Var2.b(i5));
                }
            }
            return aVar.a();
        }

        public /* synthetic */ a(int i4) {
            this();
        }

        public static final oq1 a(oq1 oq1Var) {
            if ((oq1Var != null ? oq1Var.a() : null) == null) {
                return oq1Var;
            }
            oq1Var.getClass();
            return new oq1.a(oq1Var).a((sq1) null).a();
        }

        private static boolean a(String str) {
            return (StringsKt.w("Connection", str, true) || StringsKt.w("Keep-Alive", str, true) || StringsKt.w("Proxy-Authenticate", str, true) || StringsKt.w("Proxy-Authorization", str, true) || StringsKt.w("TE", str, true) || StringsKt.w("Trailers", str, true) || StringsKt.w("Transfer-Encoding", str, true) || StringsKt.w("Upgrade", str, true)) ? false : true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.uo0
    @NotNull
    public final oq1 a(@NotNull xn1 chain) {
        m50 m50Var;
        Intrinsics.checkNotNullParameter(chain, "chain");
        tn1 call = chain.a();
        pm a4 = new pm.a(System.currentTimeMillis(), chain.i()).a();
        pp1 b4 = a4.b();
        oq1 cachedResponse = a4.a();
        tn1 tn1Var = call != null ? call : null;
        if (tn1Var == null || (m50Var = tn1Var.e()) == null) {
            m50Var = m50.f28890a;
        }
        if (b4 == null && cachedResponse == null) {
            oq1 response = new oq1.a().a(chain.i()).a(gm1.f26229e).a(504).a("Unsatisfiable Request (only-if-cached)").a(v82.f33552c).b(-1L).a(System.currentTimeMillis()).a();
            m50Var.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            return response;
        }
        if (b4 == null) {
            Intrinsics.checkNotNull(cachedResponse);
            cachedResponse.getClass();
            oq1 response2 = new oq1.a(cachedResponse).a(a.a(cachedResponse)).a();
            m50Var.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response2, "response");
            return response2;
        }
        if (cachedResponse != null) {
            m50Var.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        }
        oq1 a5 = chain.a(b4);
        if (cachedResponse != null) {
            if (a5.d() == 304) {
                new oq1.a(cachedResponse).a(a.a(cachedResponse.g(), a5.g())).b(a5.p()).a(a5.n()).a(a.a(cachedResponse)).b(a.a(a5)).a();
                sq1 a6 = a5.a();
                Intrinsics.checkNotNull(a6);
                v82.a((Closeable) a6.c());
                Intrinsics.checkNotNull(null);
                throw null;
            }
            sq1 a7 = cachedResponse.a();
            if (a7 != null) {
                v82.a(a7);
            }
        }
        Intrinsics.checkNotNull(a5);
        return new oq1.a(a5).a(a.a(cachedResponse)).b(a.a(a5)).a();
    }
}
