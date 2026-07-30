package com.unity3d.player;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes.dex */
class AudioDeviceObserver {
    private final AudioManager a;
    private final boolean b = AndroidAudioLoggingEnabled();
    private final C0172j c = new C0172j(this);

    public final native void AndroidAudioDeviceListChanged();

    public final native boolean AndroidAudioLoggingEnabled();

    public AudioDeviceObserver(Context context) {
        this.a = (AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        this.a.registerAudioDeviceCallback(this.c, null);
    }

    public final void b() {
        this.a.unregisterAudioDeviceCallback(this.c);
    }
}
