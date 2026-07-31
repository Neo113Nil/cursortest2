package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ap1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gg2 f23397a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1836bl f23398b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cp1 f23399c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final yo1 f23400d;

    public ap1(@NotNull gg2 videoViewAdapter, @NotNull gp1 replayController) {
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        Intrinsics.checkNotNullParameter(replayController, "replayController");
        this.f23397a = videoViewAdapter;
        this.f23398b = new C1836bl();
        this.f23399c = new cp1(videoViewAdapter, replayController);
        this.f23400d = new yo1();
    }

    public final void a() {
        mb1 b4 = this.f23397a.b();
        if (b4 != null) {
            bp1 b5 = b4.a().b();
            this.f23399c.a(b5);
            Bitmap bitmap = b4.c().getBitmap();
            if (bitmap != null) {
                this.f23398b.a(bitmap, new zo1(this, b4, b5));
            }
        }
    }
}
