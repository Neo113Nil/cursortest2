package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* loaded from: classes.dex */
final class qg {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f10675a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f10676b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    static /* bridge */ /* synthetic */ void a(qg qgVar, int i7, int i8) {
        qgVar.f10676b.set(0, 0);
        qgVar.f10675a.setPattern(qgVar.f10676b);
    }
}
