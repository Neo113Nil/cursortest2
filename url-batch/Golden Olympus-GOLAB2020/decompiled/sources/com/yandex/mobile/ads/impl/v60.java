package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v60 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f33517b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile v60 f33518c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33519d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u60 f33520a;

    public static final class a {
        @NotNull
        public static v60 a() {
            v60 v60Var;
            v60 v60Var2 = v60.f33518c;
            if (v60Var2 != null) {
                return v60Var2;
            }
            synchronized (v60.f33517b) {
                v60Var = v60.f33518c;
                if (v60Var == null) {
                    v60Var = new v60(0);
                    v60.f33518c = v60Var;
                }
            }
            return v60Var;
        }
    }

    private v60() {
        this.f33520a = new u60(cf2.a());
    }

    @Nullable
    public final ga1 a(@NotNull ob2<?> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        return this.f33520a.get(videoAdInfo);
    }

    public /* synthetic */ v60(int i4) {
        this();
    }

    public final void a(@NotNull ob2 videoAdInfo, @NotNull y60 exoVideoAdPlayer) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(exoVideoAdPlayer, "exoVideoAdPlayer");
        this.f33520a.put(videoAdInfo, exoVideoAdPlayer);
    }
}
