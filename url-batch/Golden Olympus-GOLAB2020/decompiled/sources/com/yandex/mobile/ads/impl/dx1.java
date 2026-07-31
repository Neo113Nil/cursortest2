package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface dx1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f24990a = a.f24991a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f24991a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final Object f24992b = new Object();

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private static volatile dx1 f24993c;

        private a() {
        }

        @NotNull
        public static dx1 a(@NotNull Context context) {
            dx1 dx1Var;
            Intrinsics.checkNotNullParameter(context, "context");
            dx1 dx1Var2 = f24993c;
            if (dx1Var2 != null) {
                return dx1Var2;
            }
            synchronized (f24992b) {
                dx1Var = f24993c;
                if (dx1Var == null) {
                    int i4 = zr0.f35758b;
                    Intrinsics.checkNotNullParameter(context, "context");
                    dx1Var = new ex1(zr0.a(context, "YadPreferenceFile"));
                    f24993c = dx1Var;
                }
            }
            return dx1Var;
        }
    }

    @Nullable
    String a();

    void a(@Nullable String str);
}
