package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class yi extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public final String f14681f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14682g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14683h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yi(xe xeVar, Throwable th, boolean z6, int i7) {
        super(r1.toString(), th);
        String valueOf = String.valueOf(xeVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i7);
        sb.append("], ");
        sb.append(valueOf);
        this.f14681f = xeVar.f14165k;
        this.f14682g = null;
        int abs = Math.abs(i7);
        StringBuilder sb2 = new StringBuilder(68);
        sb2.append("com.google.android.exoplayer.MediaCodecTrackRenderer_neg_");
        sb2.append(abs);
        this.f14683h = sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yi(xe xeVar, Throwable th, boolean z6, String str) {
        super(r2.toString(), th);
        String valueOf = String.valueOf(xeVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + valueOf.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        this.f14681f = xeVar.f14165k;
        this.f14682g = str;
        String str2 = null;
        if (zm.f15186a >= 21 && (th instanceof MediaCodec.CodecException)) {
            str2 = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f14683h = str2;
    }
}
