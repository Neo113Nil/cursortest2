package com.instagram.common.viewpoint.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02387m {
    public static final C02387m A03;
    public final String A00;
    public final C02377l A01;
    public final Object A02;

    static {
        C02387m c02387m;
        if (AbstractC01484a.A02 < 31) {
            c02387m = new C02387m("");
        } else {
            c02387m = new C02387m(C02377l.A01, "");
        }
        A03 = c02387m;
    }

    public C02387m(C02377l c02377l, String str) {
        this.A01 = c02377l;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C02387m(String str) {
        C3M.A08(AbstractC01484a.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C02377l) C3M.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C02387m)) {
            return false;
        }
        C02387m c02387m = (C02387m) obj;
        if (Objects.equals(this.A00, c02387m.A00) && Objects.equals(this.A01, c02387m.A01) && Objects.equals(this.A02, c02387m.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
