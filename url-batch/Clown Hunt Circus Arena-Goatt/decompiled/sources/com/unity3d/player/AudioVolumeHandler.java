package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.player.a.C0144h;
import com.unity3d.player.a.C0146j;
import com.unity3d.player.a.InterfaceC0145i;

/* loaded from: classes.dex */
public class AudioVolumeHandler implements InterfaceC0145i {
    public C0146j a;

    @Override // com.unity3d.player.a.InterfaceC0145i
    public final native void onAudioVolumeChanged(int i);

    public AudioVolumeHandler(Context context) {
        C0146j c0146j = new C0146j(context);
        this.a = c0146j;
        c0146j.c = new C0144h(new Handler(Looper.getMainLooper()), c0146j.b, this);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c0146j.c);
    }
}
