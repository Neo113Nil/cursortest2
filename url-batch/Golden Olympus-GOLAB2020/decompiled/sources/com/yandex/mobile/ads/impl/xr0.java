package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface xr0 {

    public interface a {
        void a(@NotNull xr0 xr0Var, @NotNull String str);
    }

    @NotNull
    Map<String, ?> a();

    @Nullable
    Set<String> a(@NotNull String str, @Nullable Set<String> set);

    void a(int i4, @NotNull String str);

    void a(@NotNull a aVar);

    void a(@NotNull String str);

    void a(@NotNull String str, long j4);

    void a(@NotNull String str, @Nullable String str2);

    void a(@NotNull String str, @Nullable HashSet hashSet);

    boolean a(@NotNull String str, boolean z4);

    int b(int i4, @NotNull String str);

    long b(@NotNull String str);

    void b(@NotNull String str, boolean z4);

    boolean c(@NotNull String str);

    void clear();

    @Nullable
    String d(@NotNull String str);
}
