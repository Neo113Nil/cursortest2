package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class bp implements zf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g8 f15639a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<String, Long> f15640b;

    public bp(@NotNull g8 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f15639a = storage;
        this.f15640b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.zf
    @Nullable
    public Long a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l4 = this.f15640b.get(identifier);
        if (l4 != null) {
            return l4;
        }
        Long b4 = this.f15639a.b(identifier);
        if (b4 == null) {
            return null;
        }
        long longValue = b4.longValue();
        this.f15640b.put(identifier, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.zf
    public void a(long j4, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f15640b.put(identifier, Long.valueOf(j4));
        this.f15639a.b(identifier, j4);
    }
}
