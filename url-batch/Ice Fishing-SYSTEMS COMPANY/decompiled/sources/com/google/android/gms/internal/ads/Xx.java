package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Xx implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f28740a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28741b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28742c;

    public Xx(long j9, long j10, long j11) {
        this.f28740a = j9;
        this.f28741b = j10;
        this.f28742c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xx)) {
            return false;
        }
        Xx xx = (Xx) obj;
        return this.f28740a == xx.f28740a && this.f28741b == xx.f28741b && this.f28742c == xx.f28742c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28742c) + ((Long.hashCode(this.f28741b) + ((Long.hashCode(this.f28740a) + 527) * 31)) * 31);
    }

    public final String toString() {
        long j9 = this.f28740a;
        int length = String.valueOf(j9).length();
        long j10 = this.f28741b;
        int length2 = String.valueOf(j10).length();
        long j11 = this.f28742c;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j11).length());
        com.anythink.basead.b.c.i.x(sb, "Mp4Timestamp: creation time=", j9, ", modification time=");
        sb.append(j10);
        sb.append(", timescale=");
        sb.append(j11);
        return sb.toString();
    }
}
