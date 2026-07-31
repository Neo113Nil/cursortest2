package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i5 {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final EndpointConfig e;

    public i5(String str, boolean z, String webViewVersion, boolean z2, EndpointConfig nrpWaterfallEndpoints) {
        Intrinsics.checkNotNullParameter(webViewVersion, "webViewVersion");
        Intrinsics.checkNotNullParameter(nrpWaterfallEndpoints, "nrpWaterfallEndpoints");
        this.a = str;
        this.b = z;
        this.c = webViewVersion;
        this.d = z2;
        this.e = nrpWaterfallEndpoints;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return Intrinsics.areEqual(this.a, i5Var.a) && this.b == i5Var.b && Intrinsics.areEqual(this.c, i5Var.c) && this.d == i5Var.d && Intrinsics.areEqual(this.e, i5Var.e);
    }

    public int hashCode() {
        String str = this.a;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "ConfigurationBodyFields(configVariant=" + this.a + ", webViewEnabled=" + this.b + ", webViewVersion=" + this.c + ", nrpWaterfallEnabled=" + this.d + ", nrpWaterfallEndpoints=" + this.e + ")";
    }

    public final String a() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final EndpointConfig c() {
        return this.e;
    }
}
