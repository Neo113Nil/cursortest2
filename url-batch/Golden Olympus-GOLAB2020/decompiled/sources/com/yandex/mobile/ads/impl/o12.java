package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o12 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f29861a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f29862b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2387zb f29863c;

    public o12(@NotNull Context context, @NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29861a = context;
        this.f29862b = videoAdInfo;
        this.f29863c = new C2387zb(videoAdInfo.g());
    }

    @NotNull
    public final vy a() {
        int ordinal = new s12(this.f29863c).a(this.f29862b).ordinal();
        if (ordinal == 0) {
            return new g00(this.f29861a);
        }
        if (ordinal == 1) {
            return new f00(this.f29861a);
        }
        if (ordinal == 2) {
            return new kz();
        }
        throw new W1.m();
    }
}
