package com.unity3d.player;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172j extends AudioDeviceCallback {
    public final /* synthetic */ AudioDeviceObserver a;

    public C0172j(AudioDeviceObserver audioDeviceObserver) {
        this.a = audioDeviceObserver;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        boolean unused;
        AudioDeviceObserver audioDeviceObserver = this.a;
        unused = audioDeviceObserver.b;
        audioDeviceObserver.AndroidAudioDeviceListChanged();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        boolean unused;
        AudioDeviceObserver audioDeviceObserver = this.a;
        unused = audioDeviceObserver.b;
        audioDeviceObserver.AndroidAudioDeviceListChanged();
    }
}
