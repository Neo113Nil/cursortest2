package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class y34 extends w31 {

    /* renamed from: f, reason: collision with root package name */
    public final z34 f14534f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14535g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y34(Throwable th, z34 z34Var) {
        super(r1.length() != 0 ? "Decoder failed: ".concat(r1) : new String("Decoder failed: "), th);
        String str = null;
        String valueOf = String.valueOf(z34Var == null ? null : z34Var.f14931a);
        this.f14534f = z34Var;
        if (n13.f8865a >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f14535g = str;
    }
}
