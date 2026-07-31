package com.startapp.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class lh {

    /* renamed from: a, reason: collision with root package name */
    public final String f323a;

    public lh(String str) {
        this.f323a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(lh.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.areEqual(this.f323a, ((lh) obj).f323a);
    }

    public final int hashCode() {
        return this.f323a.hashCode();
    }
}
