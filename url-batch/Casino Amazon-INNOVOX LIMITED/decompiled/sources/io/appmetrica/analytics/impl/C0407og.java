package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0407og {

    /* renamed from: a, reason: collision with root package name */
    public final String f1416a;
    public final long b;
    public final long c;
    public final EnumC0382ng d;

    public C0407og(byte[] bArr) {
        C0432pg a2 = C0432pg.a(bArr);
        this.f1416a = a2.f1435a;
        this.b = a2.c;
        this.c = a2.b;
        this.d = a(a2.d);
    }

    public final byte[] a() {
        C0432pg c0432pg = new C0432pg();
        c0432pg.f1435a = this.f1416a;
        c0432pg.c = this.b;
        c0432pg.b = this.c;
        int ordinal = this.d.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 0;
            }
        }
        c0432pg.d = i;
        return MessageNano.toByteArray(c0432pg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0407og.class == obj.getClass()) {
            C0407og c0407og = (C0407og) obj;
            if (this.b == c0407og.b && this.c == c0407og.c && this.f1416a.equals(c0407og.f1416a) && this.d == c0407og.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f1416a.hashCode() * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return this.d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f1416a + "', referrerClickTimestampSeconds=" + this.b + ", installBeginTimestampSeconds=" + this.c + ", source=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public C0407og(String str, long j, long j2, EnumC0382ng enumC0382ng) {
        this.f1416a = str;
        this.b = j;
        this.c = j2;
        this.d = enumC0382ng;
    }

    public static EnumC0382ng a(int i) {
        if (i == 1) {
            return EnumC0382ng.c;
        }
        if (i != 2) {
            return EnumC0382ng.b;
        }
        return EnumC0382ng.d;
    }
}
