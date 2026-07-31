package com.startapp.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class m6 extends q6 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f331a;

    public m6(Throwable th) {
        this.f331a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6) && Intrinsics.areEqual(this.f331a, ((m6) obj).f331a);
    }

    public final int hashCode() {
        return this.f331a.hashCode();
    }

    public final String toString() {
        return "Failure(exception=" + this.f331a + ')';
    }
}
