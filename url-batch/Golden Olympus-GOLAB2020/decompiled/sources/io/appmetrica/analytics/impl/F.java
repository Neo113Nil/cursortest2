package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final int f37488a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37490c;

    public F(int i4, int i5, int i6) {
        this.f37488a = i4;
        this.f37489b = i5;
        this.f37490c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(F.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        F f4 = (F) obj;
        return this.f37488a == f4.f37488a && this.f37489b == f4.f37489b && this.f37490c == f4.f37490c;
    }

    public final int hashCode() {
        return AbstractC2592e8.a(this.f37490c) + ((AbstractC2592e8.a(this.f37489b) + (AbstractC2592e8.a(this.f37488a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + G.a(this.f37488a) + ", canTrackHoaid=" + G.a(this.f37489b) + ", canTrackYandexAdvId=" + G.a(this.f37490c) + ')';
    }
}
