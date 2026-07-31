package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2376z0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f35407b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile C2376z0 f35408c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35409d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<Long, C2353y0> f35410a;

    /* renamed from: com.yandex.mobile.ads.impl.z0$a */
    public static final class a {
        @NotNull
        public static C2376z0 a() {
            C2376z0 c2376z0;
            C2376z0 c2376z02 = C2376z0.f35408c;
            if (c2376z02 != null) {
                return c2376z02;
            }
            synchronized (C2376z0.f35407b) {
                c2376z0 = C2376z0.f35408c;
                if (c2376z0 == null) {
                    c2376z0 = new C2376z0(0);
                    C2376z0.f35408c = c2376z0;
                }
            }
            return c2376z0;
        }
    }

    private C2376z0() {
        this.f35410a = new HashMap<>();
    }

    @Nullable
    public final C2353y0 a(long j4) {
        C2353y0 remove;
        synchronized (f35407b) {
            remove = this.f35410a.remove(Long.valueOf(j4));
        }
        return remove;
    }

    public /* synthetic */ C2376z0(int i4) {
        this();
    }

    public final void a(long j4, @NotNull C2353y0 adActivityData) {
        Intrinsics.checkNotNullParameter(adActivityData, "adActivityData");
        synchronized (f35407b) {
            this.f35410a.put(Long.valueOf(j4), adActivityData);
            Unit unit = Unit.f41027a;
        }
    }
}
