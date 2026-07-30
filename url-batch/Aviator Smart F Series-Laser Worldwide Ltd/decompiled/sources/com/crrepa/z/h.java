package com.crrepa.z;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14073a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14074b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14075c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14076d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14077e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14078f = 7;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private static k f14079g = new i();

    private h() {
    }

    public static void a() {
        f14079g.a();
    }

    public static k b(@Nullable String str) {
        return f14079g.b(str);
    }

    public static void c(@Nullable String str) {
        f14079g.c(str);
    }

    public static void d(@NonNull String str, @Nullable Object... objArr) {
        f14079g.d(str, objArr);
    }

    public static void e(@NonNull String str, @Nullable Object... objArr) {
        f14079g.f(str, objArr);
    }

    public static void f(@NonNull String str, @Nullable Object... objArr) {
        f14079g.a(str, objArr);
    }

    public static void a(int i8, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        f14079g.a(i8, str, str2, th);
    }

    public static void b(@NonNull String str, @Nullable Object... objArr) {
        f14079g.a(null, str, objArr);
    }

    public static void c(@NonNull String str, @Nullable Object... objArr) {
        f14079g.c(str, objArr);
    }

    public static void a(@NonNull e eVar) {
        f14079g.a((e) l.a(eVar));
    }

    public static void a(@NonNull k kVar) {
        f14079g = (k) l.a(kVar);
    }

    public static void a(@Nullable Object obj) {
        f14079g.a(obj);
    }

    public static void a(@Nullable String str) {
        f14079g.a(str);
    }

    public static void a(@NonNull String str, @Nullable Object... objArr) {
        f14079g.b(str, objArr);
    }

    public static void a(@Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        f14079g.a(th, str, objArr);
    }
}
