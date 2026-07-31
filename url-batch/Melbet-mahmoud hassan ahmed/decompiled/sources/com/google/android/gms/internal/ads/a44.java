package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class a44 extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public final String f2600f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2601g;

    /* renamed from: h, reason: collision with root package name */
    public final z34 f2602h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2603i;

    /* renamed from: j, reason: collision with root package name */
    public final a44 f2604j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a44(c0 c0Var, Throwable th, boolean z6, int i7) {
        this(r1.toString(), th, r5, false, null, r13.toString(), null);
        String valueOf = String.valueOf(c0Var);
        StringBuilder sb = new StringBuilder(valueOf.length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i7);
        sb.append("], ");
        sb.append(valueOf);
        String str = c0Var.f3660l;
        int abs = Math.abs(i7);
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_");
        sb2.append(abs);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a44(c0 c0Var, Throwable th, boolean z6, z34 z34Var) {
        this(r6.toString(), th, c0Var.f3660l, false, z34Var, (n13.f8865a < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
        String str = z34Var.f14931a;
        String valueOf = String.valueOf(c0Var);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + valueOf.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
    }

    private a44(String str, Throwable th, String str2, boolean z6, z34 z34Var, String str3, a44 a44Var) {
        super(str, th);
        this.f2600f = str2;
        this.f2601g = false;
        this.f2602h = z34Var;
        this.f2603i = str3;
        this.f2604j = a44Var;
    }

    static /* bridge */ /* synthetic */ a44 a(a44 a44Var, a44 a44Var2) {
        return new a44(a44Var.getMessage(), a44Var.getCause(), a44Var.f2600f, false, a44Var.f2602h, a44Var.f2603i, a44Var2);
    }
}
