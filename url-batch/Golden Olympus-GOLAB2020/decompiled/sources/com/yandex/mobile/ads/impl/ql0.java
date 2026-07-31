package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ql0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f30828c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile ql0 f30829d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f30830a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<vs, w72> f30831b;

    public static final class a {
        private a() {
        }

        @NotNull
        public final ql0 a() {
            ql0 ql0Var;
            ql0 ql0Var2 = ql0.f30829d;
            if (ql0Var2 != null) {
                return ql0Var2;
            }
            synchronized (this) {
                ql0Var = ql0.f30829d;
                if (ql0Var == null) {
                    ql0Var = new ql0(0);
                    ql0.f30829d = ql0Var;
                }
            }
            return ql0Var;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    private ql0() {
        this.f30830a = new Object();
        this.f30831b = new WeakHashMap<>();
    }

    public final void b(@NotNull vs instreamAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f30830a) {
            this.f30831b.remove(instreamAdPlayer);
        }
    }

    @Nullable
    public final w72 a(@NotNull vs instreamAdPlayer) {
        w72 w72Var;
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f30830a) {
            w72Var = this.f30831b.get(instreamAdPlayer);
        }
        return w72Var;
    }

    public /* synthetic */ ql0(int i4) {
        this();
    }

    public final void a(@NotNull vs instreamAdPlayer, @NotNull w72 adBinder) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(adBinder, "adBinder");
        synchronized (this.f30830a) {
            this.f30831b.put(instreamAdPlayer, adBinder);
            Unit unit = Unit.f41027a;
        }
    }
}
