package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class w61 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f33938b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile w61 f33939c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33940d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<View, n81> f33941a;

    public static final class a {
        @NotNull
        public static w61 a() {
            w61 w61Var;
            w61 w61Var2 = w61.f33939c;
            if (w61Var2 != null) {
                return w61Var2;
            }
            synchronized (w61.f33938b) {
                w61Var = w61.f33939c;
                if (w61Var == null) {
                    w61Var = new w61(new WeakHashMap());
                    w61.f33939c = w61Var;
                }
            }
            return w61Var;
        }
    }

    public w61(@NotNull Map<View, n81> nativeAdViews) {
        Intrinsics.checkNotNullParameter(nativeAdViews, "nativeAdViews");
        this.f33941a = nativeAdViews;
    }

    @Nullable
    public final n81 a(@NotNull View view) {
        n81 n81Var;
        Intrinsics.checkNotNullParameter(view, "view");
        synchronized (f33938b) {
            n81Var = this.f33941a.get(view);
        }
        return n81Var;
    }

    public final void a(@NotNull View view, @NotNull n81 nativeGenericBinder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(nativeGenericBinder, "nativeGenericBinder");
        synchronized (f33938b) {
            this.f33941a.put(view, nativeGenericBinder);
            Unit unit = Unit.f41027a;
        }
    }

    public final boolean a(@NotNull n81 nativeGenericBinder) {
        boolean z4;
        Intrinsics.checkNotNullParameter(nativeGenericBinder, "nativeGenericBinder");
        synchronized (f33938b) {
            Iterator<Map.Entry<View, n81>> it = this.f33941a.entrySet().iterator();
            z4 = false;
            while (it.hasNext()) {
                if (it.next().getValue() == nativeGenericBinder) {
                    it.remove();
                    z4 = true;
                }
            }
        }
        return z4;
    }
}
