package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class Nd extends AbstractC2782lf implements InterfaceC3021ul {
    public Nd(@NotNull InterfaceC2542cb interfaceC2542cb, @Nullable String str) {
        super(interfaceC2542cb, str);
    }

    @Nullable
    public final String c(@NotNull String str, @Nullable String str2) {
        return this.f39400a.getString(f(str), str2);
    }

    @NotNull
    public final InterfaceC3021ul d(@NotNull String str, @Nullable String str2) {
        return (InterfaceC3021ul) b(f(str), str2);
    }

    public final boolean e(@NotNull String str) {
        return this.f39400a.a(f(str));
    }

    @NotNull
    public abstract String f(@NotNull String str);

    @NotNull
    public InterfaceC3021ul g(@NotNull String str) {
        return (InterfaceC3021ul) d(f(str));
    }

    public Nd(@NotNull InterfaceC2542cb interfaceC2542cb) {
        this(interfaceC2542cb, null);
    }

    @NotNull
    public final InterfaceC3021ul d(@NotNull String str, int i4) {
        return (InterfaceC3021ul) b(f(str), i4);
    }

    public final int c(@NotNull String str, int i4) {
        return this.f39400a.getInt(f(str), i4);
    }

    @NotNull
    public final InterfaceC3021ul d(@NotNull String str, long j4) {
        return (InterfaceC3021ul) b(f(str), j4);
    }

    @NotNull
    public final InterfaceC3021ul d(@NotNull String str, boolean z4) {
        return (InterfaceC3021ul) b(f(str), z4);
    }

    public final long c(@NotNull String str, long j4) {
        return this.f39400a.getLong(f(str), j4);
    }

    public final boolean c(@NotNull String str, boolean z4) {
        return this.f39400a.getBoolean(f(str), z4);
    }
}
