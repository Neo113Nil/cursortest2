package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class Ag {

    /* renamed from: a, reason: collision with root package name */
    public final String f37183a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37184b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37185c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC3146zg f37186d;

    public Ag(byte[] bArr) {
        Bg a4 = Bg.a(bArr);
        this.f37183a = a4.f37251a;
        this.f37184b = a4.f37253c;
        this.f37185c = a4.f37252b;
        this.f37186d = a(a4.f37254d);
    }

    public final byte[] a() {
        Bg bg = new Bg();
        bg.f37251a = this.f37183a;
        bg.f37253c = this.f37184b;
        bg.f37252b = this.f37185c;
        int ordinal = this.f37186d.ordinal();
        int i4 = 1;
        if (ordinal != 1) {
            i4 = 2;
            if (ordinal != 2) {
                i4 = 0;
            }
        }
        bg.f37254d = i4;
        return MessageNano.toByteArray(bg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ag.class == obj.getClass()) {
            Ag ag = (Ag) obj;
            if (this.f37184b == ag.f37184b && this.f37185c == ag.f37185c && this.f37183a.equals(ag.f37183a) && this.f37186d == ag.f37186d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f37183a.hashCode() * 31;
        long j4 = this.f37184b;
        int i4 = (hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f37185c;
        return this.f37186d.hashCode() + ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f37183a + "', referrerClickTimestampSeconds=" + this.f37184b + ", installBeginTimestampSeconds=" + this.f37185c + ", source=" + this.f37186d + '}';
    }

    public Ag(String str, long j4, long j5, EnumC3146zg enumC3146zg) {
        this.f37183a = str;
        this.f37184b = j4;
        this.f37185c = j5;
        this.f37186d = enumC3146zg;
    }

    public static EnumC3146zg a(int i4) {
        if (i4 == 1) {
            return EnumC3146zg.f40385c;
        }
        if (i4 != 2) {
            return EnumC3146zg.f40384b;
        }
        return EnumC3146zg.f40386d;
    }
}
