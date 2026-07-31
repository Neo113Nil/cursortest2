package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1914f3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final aq1 f25598a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<AbstractC2025jj<?>> f25599b;

    /* renamed from: com.yandex.mobile.ads.impl.f3$a */
    public static final class a {
        @NotNull
        public static C1866d3 a(@Nullable C2286v2 c2286v2, @NotNull EnumC1890e3 adFetchStatus) {
            Intrinsics.checkNotNullParameter(adFetchStatus, "adFetchStatus");
            switch (adFetchStatus.ordinal()) {
                case 0:
                case 5:
                    int i4 = C1942g7.f26017A;
                    return C1942g7.a(c2286v2 != null ? c2286v2.c() : null);
                case 1:
                    return C1942g7.k();
                case 2:
                    return C1942g7.q();
                case 3:
                    return C1942g7.j();
                case 4:
                    return C1942g7.v();
                case 6:
                    return C1942g7.h();
                case 7:
                    return C1942g7.g();
                case 8:
                    return C1942g7.u();
                case 9:
                    return C1942g7.p();
                case 10:
                    return C1942g7.w();
                case 11:
                    return C1942g7.a();
                case 12:
                    return C1942g7.c();
                case 13:
                    return C1942g7.r();
                case 14:
                    return C1942g7.n();
                default:
                    throw new W1.m();
            }
        }
    }

    public C1914f3(@NotNull AbstractC2025jj<?> loadController, @NotNull aq1 requestManager, @NotNull WeakReference<AbstractC2025jj<?>> loadControllerRef) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        Intrinsics.checkNotNullParameter(loadControllerRef, "loadControllerRef");
        this.f25598a = requestManager;
        this.f25599b = loadControllerRef;
    }

    public final void a() {
        AbstractC2025jj<?> abstractC2025jj = this.f25599b.get();
        if (abstractC2025jj != null) {
            aq1 aq1Var = this.f25598a;
            Context k4 = abstractC2025jj.k();
            String a4 = C2362y9.a(abstractC2025jj);
            aq1Var.getClass();
            aq1.a(k4, a4);
        }
    }

    public final void b() {
        a();
        this.f25599b.clear();
    }

    public final void a(@NotNull AbstractC1978hj<?> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        AbstractC2025jj<?> abstractC2025jj = this.f25599b.get();
        if (abstractC2025jj != null) {
            aq1 aq1Var = this.f25598a;
            Context context = abstractC2025jj.k();
            synchronized (aq1Var) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(request, "request");
                vc1.a(context).a(request);
            }
        }
    }
}
