package com.startapp.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final Long f401a;
    public final boolean b;
    public final String c;
    public final String d;

    public r6(Long l, boolean z, String str, String str2) {
        this.f401a = l;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return Intrinsics.areEqual(this.f401a, r6Var.f401a) && this.b == r6Var.b && Intrinsics.areEqual(this.c, r6Var.c) && Intrinsics.areEqual(this.d, r6Var.d);
    }

    public final int hashCode() {
        Long l = this.f401a;
        int hashCode = (Boolean.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ServerInfo(contentLength=" + this.f401a + ", acceptsRanges=" + this.b + ", etag=" + this.c + ", lastModified=" + this.d + ')';
    }
}
