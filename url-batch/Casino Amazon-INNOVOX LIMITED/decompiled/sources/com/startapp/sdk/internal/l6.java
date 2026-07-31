package com.startapp.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class l6 extends q6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f315a;
    public final String b;
    public final String c;

    public l6(long j, String str, String str2) {
        this.f315a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return this.f315a == l6Var.f315a && Intrinsics.areEqual(this.b, l6Var.b) && Intrinsics.areEqual(this.c, l6Var.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f315a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Downloaded(sizeBytes=" + this.f315a + ", etag=" + this.b + ", lastModified=" + this.c + ')';
    }
}
