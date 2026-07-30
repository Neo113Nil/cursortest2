package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3611n2 implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final long f32817n;

    /* renamed from: u, reason: collision with root package name */
    public final long f32818u;

    /* renamed from: v, reason: collision with root package name */
    public final long f32819v;

    public /* synthetic */ C3611n2(long j9, long j10, long j11) {
        this.f32817n = j9;
        this.f32818u = j10;
        this.f32819v = j11;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f32817n, ((C3611n2) obj).f32817n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3611n2)) {
            return false;
        }
        C3611n2 c3611n2 = (C3611n2) obj;
        return this.f32817n == c3611n2.f32817n && this.f32818u == c3611n2.f32818u && this.f32819v == c3611n2.f32819v;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f32817n), Long.valueOf(this.f32818u), Long.valueOf(this.f32819v));
    }
}
