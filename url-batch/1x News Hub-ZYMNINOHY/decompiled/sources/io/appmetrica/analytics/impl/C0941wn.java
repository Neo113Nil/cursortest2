package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941wn implements TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f8599a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8600b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8601c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8602d;

    public C0941wn(long j3, String str, long j4, byte[] bArr) {
        this.f8599a = j3;
        this.f8600b = str;
        this.f8601c = j4;
        this.f8602d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0941wn.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C0941wn c0941wn = (C0941wn) obj;
        if (this.f8599a == c0941wn.f8599a && kotlin.jvm.internal.j.a(this.f8600b, c0941wn.f8600b) && this.f8601c == c0941wn.f8601c) {
            return Arrays.equals(this.f8602d, c0941wn.f8602d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f8602d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f8599a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.f8600b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f8601c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8602d) + ((Long.hashCode(this.f8601c) + ((this.f8600b.hashCode() + (Long.hashCode(this.f8599a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TempCacheEntry(id=" + this.f8599a + ", scope='" + this.f8600b + "', timestamp=" + this.f8601c + ", data=array[" + this.f8602d.length + "])";
    }
}
