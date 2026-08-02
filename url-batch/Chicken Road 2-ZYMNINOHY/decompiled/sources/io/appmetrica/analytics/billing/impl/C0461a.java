package io.appmetrica.analytics.billing.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461a {

    /* renamed from: a, reason: collision with root package name */
    public final List f9443a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9444b;

    public C0461a(List list, boolean z) {
        this.f9443a = list;
        this.f9444b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0461a)) {
            return false;
        }
        C0461a c0461a = (C0461a) obj;
        return kotlin.jvm.internal.i.a(this.f9443a, c0461a.f9443a) && this.f9444b == c0461a.f9444b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f9443a.hashCode() * 31;
        boolean z = this.f9444b;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f9443a + ", firstInappCheckOccurred=" + this.f9444b + ')';
    }
}
