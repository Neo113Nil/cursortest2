package com.squareup.util.android;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class AndroidAudioManager {
    public final AudioManager audioManager;

    public AndroidAudioManager(Context context) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        this.audioManager = (AudioManager) systemService;
    }
}
