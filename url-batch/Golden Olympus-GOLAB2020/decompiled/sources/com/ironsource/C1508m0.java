package com.ironsource;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1508m0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1508m0 f17128a = new C1508m0();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, Long> f17129b = new HashMap<>();

    private C1508m0() {
    }

    @NotNull
    public final HashMap<String, Long> a() {
        return f17129b;
    }

    public final long b(@NotNull String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l4 = f17129b.get(instance);
        if (l4 != null) {
            return System.currentTimeMillis() - l4.longValue();
        }
        return -1L;
    }

    public final long c(@NotNull String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l4 = f17129b.get(instance);
        if (l4 != null) {
            return l4.longValue();
        }
        return -1L;
    }

    public final boolean a(@NotNull String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        HashMap<String, Long> hashMap = f17129b;
        if (hashMap.get(instance) == null) {
            return false;
        }
        hashMap.remove(instance);
        return true;
    }

    public final boolean a(@NotNull String instance, long j4) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.length() == 0) {
            return false;
        }
        HashMap<String, Long> hashMap = f17129b;
        if (hashMap.containsKey(instance)) {
            return false;
        }
        hashMap.put(instance, Long.valueOf(j4));
        return true;
    }
}
