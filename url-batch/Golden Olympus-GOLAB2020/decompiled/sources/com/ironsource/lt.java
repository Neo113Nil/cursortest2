package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class lt implements fi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g8 f17115a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<String, Integer> f17116b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<String, Long> f17117c;

    public lt(@NotNull g8 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f17115a = storage;
        this.f17116b = new ConcurrentHashMap<>();
        this.f17117c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.fi
    public int a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Integer num = this.f17116b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer c4 = this.f17115a.c(identifier);
        if (c4 == null) {
            this.f17116b.put(identifier, 0);
            return 0;
        }
        int intValue = c4.intValue();
        this.f17116b.put(identifier, Integer.valueOf(intValue));
        return intValue;
    }

    @Override // com.ironsource.fi
    @Nullable
    public Long b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l4 = this.f17117c.get(identifier);
        if (l4 != null) {
            return l4;
        }
        Long a4 = this.f17115a.a(identifier);
        if (a4 == null) {
            return null;
        }
        long longValue = a4.longValue();
        this.f17117c.put(identifier, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.fi
    public void a(int i4, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f17116b.put(identifier, Integer.valueOf(i4));
        this.f17115a.a(identifier, i4);
    }

    @Override // com.ironsource.fi
    public void a(long j4, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f17117c.put(identifier, Long.valueOf(j4));
        this.f17115a.a(identifier, j4);
    }
}
