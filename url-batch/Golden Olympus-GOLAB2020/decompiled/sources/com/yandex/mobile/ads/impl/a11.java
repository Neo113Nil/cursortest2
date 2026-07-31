package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C3218h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a11 {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static a11 f23120b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f23121c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23122d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3218h f23123a;

    public static final class a {
        @NotNull
        public static a11 a() {
            a11 a11Var;
            a11 a11Var2 = a11.f23120b;
            if (a11Var2 != null) {
                return a11Var2;
            }
            synchronized (a11.f23121c) {
                a11Var = a11.f23120b;
                if (a11Var == null) {
                    a11Var = new a11(0);
                    a11.f23120b = a11Var;
                }
            }
            return a11Var;
        }
    }

    private a11() {
        this.f23123a = new C3218h();
    }

    public final void c() {
        synchronized (f23121c) {
            this.f23123a.clear();
            Unit unit = Unit.f41027a;
        }
    }

    @NotNull
    public final List<z01> d() {
        List<z01> list;
        synchronized (f23121c) {
            list = CollectionsKt.toList(this.f23123a);
        }
        return list;
    }

    public final void a(long j4, @NotNull String requestMethod, @NotNull String requestUrl, @Nullable Map<String, String> map, @Nullable String str, @Nullable Integer num, @Nullable Map<String, String> map2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        if (y01.f34757a.a()) {
            z01 z01Var = new z01(new b11(j4, requestMethod, requestUrl, map, str), (num == null && map2 == null && str2 == null) ? null : new c11(System.currentTimeMillis(), num, map2, str2));
            synchronized (f23121c) {
                try {
                    if (this.f23123a.size() > 100) {
                        this.f23123a.removeFirst();
                    }
                    this.f23123a.add(z01Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ a11(int i4) {
        this();
    }
}
