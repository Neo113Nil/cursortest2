package com.startapp.sdk.internal;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final class od implements MediaPlayer.OnBufferingUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pd f7394a;

    public od(pd pdVar) {
        this.f7394a = pdVar;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i4) {
        xj xjVar = this.f7394a.f6697f;
        if (xjVar != null) {
            xjVar.a(i4);
        }
    }
}
