package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class k24 implements l14 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l24 f7340a;

    /* synthetic */ k24(l24 l24Var, j24 j24Var) {
        this.f7340a = l24Var;
    }

    @Override // com.google.android.gms.internal.ads.l14
    public final void a() {
        wx3 wx3Var;
        wx3 wx3Var2;
        wx3Var = this.f7340a.Q0;
        if (wx3Var != null) {
            wx3Var2 = this.f7340a.Q0;
            wx3Var2.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.l14
    public final void b(Exception exc) {
        h14 h14Var;
        oc2.a("MediaCodecAudioRenderer", "Audio sink error", exc);
        h14Var = this.f7340a.H0;
        h14Var.b(exc);
    }
}
