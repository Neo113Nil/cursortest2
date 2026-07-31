package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d50 {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Object f24427h = new Object();

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private String f24428a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private List<? extends bn1> f24429b = CollectionsKt.emptyList();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Map<String, String> f24430c = MapsKt.emptyMap();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private String f24431d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private String f24432e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24433f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private String f24434g;

    @Nullable
    public final String a() {
        return this.f24432e;
    }

    @Nullable
    public final String b() {
        return this.f24428a;
    }

    public final boolean c() {
        return this.f24433f;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.f24430c;
    }

    @Nullable
    public final String e() {
        return this.f24431d;
    }

    @NotNull
    public final List<bn1> f() {
        return this.f24429b;
    }

    @Nullable
    public final String g() {
        String str;
        synchronized (f24427h) {
            str = this.f24434g;
        }
        return str;
    }

    public final void h() {
        this.f24433f = true;
    }

    public final void a(@Nullable String str) {
        this.f24432e = str;
    }

    public final void b(@Nullable String str) {
        this.f24428a = str;
    }

    public final void c(@Nullable String str) {
        this.f24431d = str;
    }

    public final void d(@Nullable String str) {
        synchronized (f24427h) {
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        this.f24434g = str;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Unit unit = Unit.f41027a;
        }
    }
}
