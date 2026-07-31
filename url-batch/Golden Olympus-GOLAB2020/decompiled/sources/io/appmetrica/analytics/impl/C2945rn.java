package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.rn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2945rn implements TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f39756a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39757b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39758c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f39759d;

    public C2945rn(long j4, @NotNull String str, long j5, @NotNull byte[] bArr) {
        this.f39756a = j4;
        this.f39757b = str;
        this.f39758c = j5;
        this.f39759d = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C2945rn.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C2945rn c2945rn = (C2945rn) obj;
        if (this.f39756a == c2945rn.f39756a && Intrinsics.areEqual(this.f39757b, c2945rn.f39757b) && this.f39758c == c2945rn.f39758c) {
            return Arrays.equals(this.f39759d, c2945rn.f39759d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final byte[] getData() {
        return this.f39759d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f39756a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final String getScope() {
        return this.f39757b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f39758c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f39759d) + ((Long.hashCode(this.f39758c) + ((this.f39757b.hashCode() + (Long.hashCode(this.f39756a) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TempCacheEntry(id=" + this.f39756a + ", scope='" + this.f39757b + "', timestamp=" + this.f39758c + ", data=array[" + this.f39759d.length + "])";
    }
}
