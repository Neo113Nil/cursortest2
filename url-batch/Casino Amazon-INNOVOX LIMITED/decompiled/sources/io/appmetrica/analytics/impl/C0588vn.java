package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.vn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0588vn implements TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f1541a;
    public final String b;
    public final long c;
    public final byte[] d;

    public C0588vn(long j, String str, long j2, byte[] bArr) {
        this.f1541a = j;
        this.b = str;
        this.c = j2;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0588vn.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C0588vn c0588vn = (C0588vn) obj;
        if (this.f1541a == c0588vn.f1541a && Intrinsics.areEqual(this.b, c0588vn.b) && this.c == c0588vn.c) {
            return Arrays.equals(this.d, c0588vn.d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f1541a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + ((Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.f1541a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TempCacheEntry(id=" + this.f1541a + ", scope='" + this.b + "', timestamp=" + this.c + ", data=array[" + this.d.length + "])";
    }
}
