package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ip {

    /* renamed from: a, reason: collision with root package name */
    final long f6731a;

    /* renamed from: b, reason: collision with root package name */
    final String f6732b;

    /* renamed from: c, reason: collision with root package name */
    final int f6733c;

    ip(long j7, String str, int i7) {
        this.f6731a = j7;
        this.f6732b = str;
        this.f6733c = i7;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ip)) {
            ip ipVar = (ip) obj;
            if (ipVar.f6731a == this.f6731a && ipVar.f6733c == this.f6733c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f6731a;
    }
}
