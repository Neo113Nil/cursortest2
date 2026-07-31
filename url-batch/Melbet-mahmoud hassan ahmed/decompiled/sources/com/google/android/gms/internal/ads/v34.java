package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: classes.dex */
public final class v34 {

    /* renamed from: a, reason: collision with root package name */
    public final z34 f13116a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f13117b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f13118c;

    /* renamed from: d, reason: collision with root package name */
    public final Surface f13119d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCrypto f13120e = null;

    private v34(z34 z34Var, MediaFormat mediaFormat, c0 c0Var, Surface surface, MediaCrypto mediaCrypto, int i7, boolean z6) {
        this.f13116a = z34Var;
        this.f13117b = mediaFormat;
        this.f13118c = c0Var;
        this.f13119d = surface;
    }

    public static v34 a(z34 z34Var, MediaFormat mediaFormat, c0 c0Var, MediaCrypto mediaCrypto) {
        return new v34(z34Var, mediaFormat, c0Var, null, null, 0, false);
    }

    public static v34 b(z34 z34Var, MediaFormat mediaFormat, c0 c0Var, Surface surface, MediaCrypto mediaCrypto) {
        return new v34(z34Var, mediaFormat, c0Var, surface, null, 0, false);
    }
}
