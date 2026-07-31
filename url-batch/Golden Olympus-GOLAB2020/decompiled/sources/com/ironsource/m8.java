package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public enum m8 {
    Day("d", 86400000),
    Hour("h", 3600000),
    Second("s", 1000);


    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f17209c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f17214a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17215b;

    @Metadata
    public static final class a {
        private a() {
        }

        @Nullable
        public final m8 a(@Nullable String str) {
            for (m8 m8Var : m8.values()) {
                if (Intrinsics.areEqual(m8Var.f17214a, str)) {
                    return m8Var;
                }
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    m8(String str, long j4) {
        this.f17214a = str;
        this.f17215b = j4;
    }

    public static /* synthetic */ long a(m8 m8Var, Integer num, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i4 & 1) != 0) {
            num = 1;
        }
        return m8Var.a(num);
    }

    public final long a(@Nullable Integer num) {
        return (num != null ? num.intValue() : 1) * this.f17215b;
    }
}
