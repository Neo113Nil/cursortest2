package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
final class f24 extends AudioTrack.StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h24 f4956a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g24 f4957b;

    f24(g24 g24Var, h24 h24Var) {
        this.f4957b = g24Var;
        this.f4956a = h24Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        AudioTrack audioTrack2;
        l14 l14Var;
        boolean z6;
        l14 l14Var2;
        audioTrack2 = this.f4957b.f5423c.f6028n;
        wu1.f(audioTrack == audioTrack2);
        l14Var = this.f4957b.f5423c.f6025k;
        if (l14Var != null) {
            z6 = this.f4957b.f5423c.I;
            if (z6) {
                l14Var2 = this.f4957b.f5423c.f6025k;
                l14Var2.a();
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        l14 l14Var;
        boolean z6;
        l14 l14Var2;
        audioTrack2 = this.f4957b.f5423c.f6028n;
        wu1.f(audioTrack == audioTrack2);
        l14Var = this.f4957b.f5423c.f6025k;
        if (l14Var != null) {
            z6 = this.f4957b.f5423c.I;
            if (z6) {
                l14Var2 = this.f4957b.f5423c.f6025k;
                l14Var2.a();
            }
        }
    }
}
