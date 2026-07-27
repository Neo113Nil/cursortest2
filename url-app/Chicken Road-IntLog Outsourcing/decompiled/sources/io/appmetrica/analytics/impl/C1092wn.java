package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092wn implements TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f9555a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9556b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9557c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9558d;

    public C1092wn(long j2, String str, long j6, byte[] bArr) {
        this.f9555a = j2;
        this.f9556b = str;
        this.f9557c = j6;
        this.f9558d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1092wn.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C1092wn c1092wn = (C1092wn) obj;
        if (this.f9555a == c1092wn.f9555a && kotlin.jvm.internal.i.a(this.f9556b, c1092wn.f9556b) && this.f9557c == c1092wn.f9557c) {
            return Arrays.equals(this.f9558d, c1092wn.f9558d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f9558d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f9555a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.f9556b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f9557c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9558d) + ((Long.hashCode(this.f9557c) + B0.o.f(this.f9556b, Long.hashCode(this.f9555a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "TempCacheEntry(id=" + this.f9555a + ", scope='" + this.f9556b + "', timestamp=" + this.f9557c + ", data=array[" + this.f9558d.length + "])";
    }
}
