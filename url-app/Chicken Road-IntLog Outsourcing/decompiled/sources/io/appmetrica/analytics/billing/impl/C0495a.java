package io.appmetrica.analytics.billing.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495a {

    /* renamed from: a, reason: collision with root package name */
    public final List f5952a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5953b;

    public C0495a(List list, boolean z) {
        this.f5952a = list;
        this.f5953b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0495a)) {
            return false;
        }
        C0495a c0495a = (C0495a) obj;
        return kotlin.jvm.internal.i.a(this.f5952a, c0495a.f5952a) && this.f5953b == c0495a.f5953b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f5952a.hashCode() * 31;
        boolean z = this.f5953b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f5952a + ", firstInappCheckOccurred=" + this.f5953b + ')';
    }
}
