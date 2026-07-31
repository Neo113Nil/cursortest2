package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* loaded from: classes2.dex */
public class AudioVolumeHandler implements h1.C {

    /* renamed from: a, reason: collision with root package name */
    public h1.D f21994a;

    public AudioVolumeHandler(Context context) {
        h1.D d4 = new h1.D(context);
        this.f21994a = d4;
        d4.f36708c = new h1.B(new Handler(Looper.getMainLooper()), d4.f36707b, this);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, d4.f36708c);
    }

    @Override // h1.C
    public final native void onAudioVolumeChanged(int i4);
}
