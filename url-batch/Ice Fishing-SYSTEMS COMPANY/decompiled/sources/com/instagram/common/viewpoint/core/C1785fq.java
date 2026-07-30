package com.instagram.common.viewpoint.core;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1785fq {
    public float A00;
    public EnumC1063Lr A01;
    public Map<String, String> A02;

    public C1785fq(EnumC1063Lr enumC1063Lr) {
        this(enumC1063Lr, 0.0f);
    }

    public C1785fq(EnumC1063Lr enumC1063Lr, float f6) {
        this(enumC1063Lr, f6, null);
    }

    public C1785fq(@Nullable EnumC1063Lr enumC1063Lr, float f6, Map<String, String> windowParams) {
        this.A01 = enumC1063Lr;
        this.A00 = f6;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC1063Lr A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC1063Lr.A0I;
    }
}
