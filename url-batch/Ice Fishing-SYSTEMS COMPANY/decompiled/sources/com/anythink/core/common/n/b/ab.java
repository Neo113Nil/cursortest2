package com.anythink.core.common.n.b;

import java.io.IOException;

/* loaded from: classes.dex */
public enum ab {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: g, reason: collision with root package name */
    private final String f15628g;

    ab(String str) {
        this.f15628g = str;
    }

    private static /* synthetic */ ab[] a() {
        return new ab[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC};
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f15628g;
    }

    public static ab a(String str) {
        ab abVar = HTTP_1_0;
        if (str.equals(abVar.f15628g)) {
            return abVar;
        }
        ab abVar2 = HTTP_1_1;
        if (str.equals(abVar2.f15628g)) {
            return abVar2;
        }
        ab abVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(abVar3.f15628g)) {
            return abVar3;
        }
        ab abVar4 = HTTP_2;
        if (str.equals(abVar4.f15628g)) {
            return abVar4;
        }
        ab abVar5 = SPDY_3;
        if (str.equals(abVar5.f15628g)) {
            return abVar5;
        }
        ab abVar6 = QUIC;
        if (str.equals(abVar6.f15628g)) {
            return abVar6;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }
}
