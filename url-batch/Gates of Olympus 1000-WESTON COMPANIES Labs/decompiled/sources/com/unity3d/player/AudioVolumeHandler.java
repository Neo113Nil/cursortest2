package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.player.a.C0114g;
import com.unity3d.player.a.C0116i;
import com.unity3d.player.a.InterfaceC0115h;

/* loaded from: classes2.dex */
public class AudioVolumeHandler implements InterfaceC0115h {
    public C0116i a;

    @Override // com.unity3d.player.a.InterfaceC0115h
    public final native void onAudioVolumeChanged(int i);

    public AudioVolumeHandler(Context context) {
        C0116i c0116i = new C0116i(context);
        this.a = c0116i;
        c0116i.c = new C0114g(new Handler(Looper.getMainLooper()), c0116i.b, this);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c0116i.c);
    }
}
