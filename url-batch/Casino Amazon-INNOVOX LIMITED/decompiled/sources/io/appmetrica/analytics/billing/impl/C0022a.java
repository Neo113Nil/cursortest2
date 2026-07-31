package io.appmetrica.analytics.billing.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0022a {

    /* renamed from: a, reason: collision with root package name */
    public final List f572a;
    public final boolean b;

    public C0022a(List list, boolean z) {
        this.f572a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0022a)) {
            return false;
        }
        C0022a c0022a = (C0022a) obj;
        return Intrinsics.areEqual(this.f572a, c0022a.f572a) && this.b == c0022a.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f572a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f572a + ", firstInappCheckOccurred=" + this.b + ')';
    }
}
