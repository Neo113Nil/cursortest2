package com.chartboost.sdk.impl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class h3 {
    public final int a;
    public final byte[] b;

    public h3(int i, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = i;
        this.b = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return this.a == h3Var.a && Intrinsics.areEqual(this.b, h3Var.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public String toString() {
        return "CBNetworkServerResponse(statusCode=" + this.a + ", data=" + Arrays.toString(this.b) + ")";
    }

    public final int b() {
        return this.a;
    }

    public final byte[] a() {
        return this.b;
    }

    public final boolean c() {
        int i = this.a;
        return i >= 200 && i < 300;
    }
}
