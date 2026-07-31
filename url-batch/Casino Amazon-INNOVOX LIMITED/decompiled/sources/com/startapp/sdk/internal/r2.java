package com.startapp.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f398a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;

    public r2(String str, String str2, long j, String str3, String str4, long j2) {
        str.getClass();
        str2.getClass();
        this.f398a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return Intrinsics.areEqual(this.f398a, r2Var.f398a) && Intrinsics.areEqual(this.b, r2Var.b) && this.c == r2Var.c && Intrinsics.areEqual(this.d, r2Var.d) && Intrinsics.areEqual(this.e, r2Var.e) && this.f == r2Var.f;
    }

    public final int hashCode() {
        int hashCode = (Long.hashCode(this.c) + ((this.b.hashCode() + (this.f398a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Long.hashCode(this.f) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CachedFileEntry(fileId=" + this.f398a + ", path=" + this.b + ", sizeBytes=" + this.c + ", etag=" + this.d + ", lastModified=" + this.e + ", lastUsedTimestamp=" + this.f + ')';
    }
}
