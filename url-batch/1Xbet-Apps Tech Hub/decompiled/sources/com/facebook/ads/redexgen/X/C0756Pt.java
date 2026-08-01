package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.Pt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0756Pt implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C02946s A00;

    public C0756Pt(C02946s c02946s) {
        this.A00 = c02946s;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new K1(this, i));
    }
}
