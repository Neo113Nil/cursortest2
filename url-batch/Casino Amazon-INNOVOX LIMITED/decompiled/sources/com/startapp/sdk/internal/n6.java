package com.startapp.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class n6 extends q6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f347a;
    public final String b;

    public n6(String str, int i) {
        this.f347a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return this.f347a == n6Var.f347a && Intrinsics.areEqual(this.b, n6Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f347a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "HttpError(statusCode=" + this.f347a + ", statusMessage=" + this.b + ')';
    }
}
