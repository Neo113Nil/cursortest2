package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f28446a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile l71 f28447b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f28448c = 0;

    public static final class a {
        @NotNull
        public static l71 a() {
            l71 l71Var;
            l71 l71Var2 = l71.f28447b;
            if (l71Var2 != null) {
                return l71Var2;
            }
            synchronized (l71.f28446a) {
                l71Var = l71.f28447b;
                if (l71Var == null) {
                    l71Var = new l71(0);
                    l71.f28447b = l71Var;
                }
            }
            return l71Var;
        }
    }

    private l71() {
    }

    public final boolean c() {
        return true;
    }

    public /* synthetic */ l71(int i4) {
        this();
    }
}
