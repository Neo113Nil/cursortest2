package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wn0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f34143c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile wn0 f34144d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f34145a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<yt, rs> f34146b;

    public static final class a {
        private a() {
        }

        @NotNull
        public final wn0 a() {
            wn0 wn0Var;
            wn0 wn0Var2 = wn0.f34144d;
            if (wn0Var2 != null) {
                return wn0Var2;
            }
            synchronized (this) {
                wn0Var = wn0.f34144d;
                if (wn0Var == null) {
                    wn0Var = new wn0(0);
                    wn0.f34144d = wn0Var;
                }
            }
            return wn0Var;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    private wn0() {
        this.f34145a = new Object();
        this.f34146b = new WeakHashMap<>();
    }

    public final void b(@NotNull yt videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        synchronized (this.f34145a) {
            this.f34146b.remove(videoPlayer);
        }
    }

    @Nullable
    public final rs a(@NotNull yt videoPlayer) {
        rs rsVar;
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        synchronized (this.f34145a) {
            rsVar = this.f34146b.get(videoPlayer);
        }
        return rsVar;
    }

    public /* synthetic */ wn0(int i4) {
        this();
    }

    public final void a(@NotNull yt videoPlayer, @NotNull rs adBinder) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(adBinder, "adBinder");
        synchronized (this.f34145a) {
            this.f34146b.put(videoPlayer, adBinder);
            Unit unit = Unit.f41027a;
        }
    }
}
