package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1100Nd implements Serializable {
    public static final long serialVersionUID = -2102939945352398575L;
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final List<String> A05;

    public C1100Nd(List<String> screenshots, long j9, long j10, boolean z8, boolean z9, boolean z10) {
        this.A05 = screenshots;
        this.A00 = j9;
        this.A01 = j10;
        this.A04 = z8;
        this.A02 = z9;
        this.A03 = z10;
    }

    public final long A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A01;
    }

    public final List<String> A02() {
        return Collections.unmodifiableList(this.A05);
    }

    public final boolean A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }

    public final boolean A05() {
        return this.A04;
    }
}
