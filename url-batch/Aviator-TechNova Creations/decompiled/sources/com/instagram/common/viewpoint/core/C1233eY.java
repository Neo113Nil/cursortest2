package com.instagram.common.viewpoint.core;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.eY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1233eY {
    public float A00;
    public LF A01;
    public Map<String, String> A02;

    public C1233eY(LF lf) {
        this(lf, 0.0f);
    }

    public C1233eY(LF lf, float f) {
        this(lf, f, null);
    }

    public C1233eY(@Nullable LF lf, float f, Map<String, String> windowParams) {
        this.A01 = lf;
        this.A00 = f;
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

    public final LF A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == LF.A0I;
    }
}
