package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3040cQ extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final String f29706n;

    /* renamed from: u, reason: collision with root package name */
    public final C2986bQ f29707u;

    /* renamed from: v, reason: collision with root package name */
    public final String f29708v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3040cQ(TP tp, C3259gQ c3259gQ, int i) {
        this(r5, c3259gQ, tp.f27776o, null, D.y.j(r13, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(r13).length() + 60)));
        String tp2 = tp.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + tp2.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(tp2);
        String sb2 = sb.toString();
        int abs = Math.abs(i);
    }

    public C3040cQ(String str, Throwable th, String str2, C2986bQ c2986bQ, String str3) {
        super(str, th);
        this.f29706n = str2;
        this.f29707u = c2986bQ;
        this.f29708v = str3;
    }
}
