package io.appmetrica.analytics.billing.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344a {

    /* renamed from: a, reason: collision with root package name */
    public final List f5203a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5204b;

    public C0344a(List list, boolean z) {
        this.f5203a = list;
        this.f5204b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0344a)) {
            return false;
        }
        C0344a c0344a = (C0344a) obj;
        return kotlin.jvm.internal.j.a(this.f5203a, c0344a.f5203a) && this.f5204b == c0344a.f5204b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f5203a.hashCode() * 31;
        boolean z = this.f5204b;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f5203a + ", firstInappCheckOccurred=" + this.f5204b + ')';
    }
}
