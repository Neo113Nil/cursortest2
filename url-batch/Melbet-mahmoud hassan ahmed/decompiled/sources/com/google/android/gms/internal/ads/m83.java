package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
final class m83 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: f, reason: collision with root package name */
    private final Handler f8456f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ab3 f8457g;

    public m83(ab3 ab3Var, Handler handler) {
        this.f8457g = ab3Var;
        this.f8456f = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i7) {
        this.f8456f.post(new Runnable() { // from class: com.google.android.gms.internal.ads.m73
            @Override // java.lang.Runnable
            public final void run() {
                m83 m83Var = m83.this;
                ab3.c(m83Var.f8457g, i7);
            }
        });
    }
}
