package com.startapp.sdk.internal;

import android.media.MediaPlayer;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class wc implements MediaPlayer.OnBufferingUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc f482a;

    public wc(xc xcVar) {
        this.f482a = xcVar;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        hj hjVar = this.f482a.f;
        if (hjVar != null) {
            hjVar.a(i);
        }
    }
}
