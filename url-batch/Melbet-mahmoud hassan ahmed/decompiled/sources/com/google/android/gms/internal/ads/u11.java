package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
final class u11 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f12562a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f12563b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    static /* bridge */ /* synthetic */ void a(u11 u11Var, int i7, int i8) {
        u11Var.f12563b.set(i7, i8);
        u11Var.f12562a.setPattern(u11Var.f12563b);
    }
}
