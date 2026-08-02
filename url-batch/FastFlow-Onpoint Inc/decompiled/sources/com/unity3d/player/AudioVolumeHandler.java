package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.player.a.C0007g;
import com.unity3d.player.a.C0009i;
import com.unity3d.player.a.InterfaceC0008h;

/* loaded from: classes.dex */
public class AudioVolumeHandler implements InterfaceC0008h {
    public C0009i a;

    @Override // com.unity3d.player.a.InterfaceC0008h
    public final native void onAudioVolumeChanged(int i);

    public AudioVolumeHandler(Context context) {
        C0009i c0009i = new C0009i(context);
        this.a = c0009i;
        c0009i.c = new C0007g(new Handler(Looper.getMainLooper()), c0009i.b, this);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c0009i.c);
    }
}
