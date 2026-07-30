package com.baidu.vi;

import android.media.MediaPlayer;

/* loaded from: classes2.dex */
public class AudioFilePlayer {

    /* renamed from: a, reason: collision with root package name */
    private MediaPlayer f10679a = new MediaPlayer();

    private AudioFilePlayer() {
    }

    private native boolean onErrorOccured(long j8, int i8);

    private native void onPlayCompleted(long j8);
}
