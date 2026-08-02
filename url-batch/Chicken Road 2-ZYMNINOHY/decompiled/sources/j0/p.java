package j0;

import T.C0097o;

/* loaded from: classes.dex */
public final class p extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f13778a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13779b;

    /* renamed from: c, reason: collision with root package name */
    public final o f13780c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13781d;

    public p(C0097o c0097o, u uVar, boolean z, int i4) {
        this("Decoder init failed: [" + i4 + "], " + c0097o, uVar, c0097o.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i4 < 0 ? "neg_" : "") + Math.abs(i4));
    }

    public p(String str, Throwable th, String str2, boolean z, o oVar, String str3) {
        super(str, th);
        this.f13778a = str2;
        this.f13779b = z;
        this.f13780c = oVar;
        this.f13781d = str3;
    }
}
