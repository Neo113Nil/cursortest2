package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;

/* loaded from: classes3.dex */
public class ru0 extends fy {

    /* renamed from: b, reason: collision with root package name */
    public final String f31368b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ru0(IllegalStateException illegalStateException, su0 su0Var) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(su0Var == null ? null : su0Var.f31947a);
        this.f31368b = u82.f32873a >= 21 ? a(illegalStateException) : null;
    }

    private static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
