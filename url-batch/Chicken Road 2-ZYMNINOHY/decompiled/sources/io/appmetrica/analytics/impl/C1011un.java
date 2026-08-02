package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.un, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011un implements TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f12856a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12857b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12858c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f12859d;

    public C1011un(long j4, String str, long j5, byte[] bArr) {
        this.f12856a = j4;
        this.f12857b = str;
        this.f12858c = j5;
        this.f12859d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1011un.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C1011un c1011un = (C1011un) obj;
        if (this.f12856a == c1011un.f12856a && kotlin.jvm.internal.i.a(this.f12857b, c1011un.f12857b) && this.f12858c == c1011un.f12858c) {
            return Arrays.equals(this.f12859d, c1011un.f12859d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f12859d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f12856a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.f12857b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f12858c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12859d) + ((Long.hashCode(this.f12858c) + AbstractC0005f.f(Long.hashCode(this.f12856a) * 31, 31, this.f12857b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TempCacheEntry(id=");
        sb.append(this.f12856a);
        sb.append(", scope='");
        sb.append(this.f12857b);
        sb.append("', timestamp=");
        sb.append(this.f12858c);
        sb.append(", data=array[");
        return AbstractC0005f.o(sb, this.f12859d.length, "])");
    }
}
