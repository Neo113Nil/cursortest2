package com.instagram.common.viewpoint.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1739f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C06163r A00;

    public C1739f6(C06163r c06163r) {
        this.A00 = c06163r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C0851Dl(this, i));
    }
}
