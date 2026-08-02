package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823ng {

    /* renamed from: a, reason: collision with root package name */
    public final String f12464a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12465b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12466c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0797mg f12467d;

    public C0823ng(byte[] bArr) {
        C0849og a3 = C0849og.a(bArr);
        this.f12464a = a3.f12521a;
        this.f12465b = a3.f12523c;
        this.f12466c = a3.f12522b;
        this.f12467d = a(a3.f12524d);
    }

    public final byte[] a() {
        C0849og c0849og = new C0849og();
        c0849og.f12521a = this.f12464a;
        c0849og.f12523c = this.f12465b;
        c0849og.f12522b = this.f12466c;
        int ordinal = this.f12467d.ordinal();
        int i4 = 1;
        if (ordinal != 1) {
            i4 = 2;
            if (ordinal != 2) {
                i4 = 0;
            }
        }
        c0849og.f12524d = i4;
        return MessageNano.toByteArray(c0849og);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0823ng.class == obj.getClass()) {
            C0823ng c0823ng = (C0823ng) obj;
            if (this.f12465b == c0823ng.f12465b && this.f12466c == c0823ng.f12466c && this.f12464a.equals(c0823ng.f12464a) && this.f12467d == c0823ng.f12467d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f12464a.hashCode() * 31;
        long j4 = this.f12465b;
        int i4 = (hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f12466c;
        return this.f12467d.hashCode() + ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f12464a + "', referrerClickTimestampSeconds=" + this.f12465b + ", installBeginTimestampSeconds=" + this.f12466c + ", source=" + this.f12467d + '}';
    }

    public C0823ng(String str, long j4, long j5, EnumC0797mg enumC0797mg) {
        this.f12464a = str;
        this.f12465b = j4;
        this.f12466c = j5;
        this.f12467d = enumC0797mg;
    }

    public static EnumC0797mg a(int i4) {
        if (i4 == 1) {
            return EnumC0797mg.f12362c;
        }
        if (i4 != 2) {
            return EnumC0797mg.f12361b;
        }
        return EnumC0797mg.f12363d;
    }
}
