package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.C3218h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i11 {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static i11 f27049b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f27050c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27051d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3218h f27052a;

    public static final class a {
        @NotNull
        public static i11 a() {
            i11 i11Var;
            i11 i11Var2 = i11.f27049b;
            if (i11Var2 != null) {
                return i11Var2;
            }
            synchronized (i11.f27050c) {
                i11Var = i11.f27049b;
                if (i11Var == null) {
                    i11Var = new i11(0);
                    i11.f27049b = i11Var;
                }
            }
            return i11Var;
        }
    }

    private i11() {
        this.f27052a = new C3218h();
    }

    public final void c() {
        synchronized (f27050c) {
            this.f27052a.clear();
            Unit unit = Unit.f41027a;
        }
    }

    @NotNull
    public final List<h11> d() {
        List<h11> list;
        synchronized (f27050c) {
            list = CollectionsKt.toList(this.f27052a);
        }
        return list;
    }

    public final void a(@NotNull x01 type, @NotNull String tag, @NotNull String text) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        if (y01.f34757a.a()) {
            h11 h11Var = new h11(System.currentTimeMillis(), type.name(), tag, text);
            synchronized (f27050c) {
                try {
                    if (this.f27052a.size() > 5000) {
                        this.f27052a.removeFirst();
                    }
                    this.f27052a.add(h11Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ i11(int i4) {
        this();
    }
}
