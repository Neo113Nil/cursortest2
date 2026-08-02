package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0830sg {

    /* renamed from: a, reason: collision with root package name */
    public final String f8315a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8316b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8317c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0804rg f8318d;

    public C0830sg(byte[] bArr) {
        C0856tg a3 = C0856tg.a(bArr);
        this.f8315a = a3.f8373a;
        this.f8316b = a3.f8375c;
        this.f8317c = a3.f8374b;
        this.f8318d = a(a3.f8376d);
    }

    public final byte[] a() {
        C0856tg c0856tg = new C0856tg();
        c0856tg.f8373a = this.f8315a;
        c0856tg.f8375c = this.f8316b;
        c0856tg.f8374b = this.f8317c;
        int ordinal = this.f8318d.ordinal();
        int i3 = 1;
        if (ordinal != 1) {
            i3 = 2;
            if (ordinal != 2) {
                i3 = 0;
            }
        }
        c0856tg.f8376d = i3;
        return MessageNano.toByteArray(c0856tg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0830sg.class == obj.getClass()) {
            C0830sg c0830sg = (C0830sg) obj;
            if (this.f8316b == c0830sg.f8316b && this.f8317c == c0830sg.f8317c && this.f8315a.equals(c0830sg.f8315a) && this.f8318d == c0830sg.f8318d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f8315a.hashCode() * 31;
        long j3 = this.f8316b;
        int i3 = (hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f8317c;
        return this.f8318d.hashCode() + ((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f8315a + "', referrerClickTimestampSeconds=" + this.f8316b + ", installBeginTimestampSeconds=" + this.f8317c + ", source=" + this.f8318d + '}';
    }

    public C0830sg(String str, long j3, long j4, EnumC0804rg enumC0804rg) {
        this.f8315a = str;
        this.f8316b = j3;
        this.f8317c = j4;
        this.f8318d = enumC0804rg;
    }

    public static EnumC0804rg a(int i3) {
        if (i3 == 1) {
            return EnumC0804rg.f8239c;
        }
        if (i3 != 2) {
            return EnumC0804rg.f8238b;
        }
        return EnumC0804rg.f8240d;
    }
}
