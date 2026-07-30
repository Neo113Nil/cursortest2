package com.google.android.gms.internal.ads;

import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.we, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4125we implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3749pf f35006a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final /* synthetic */ void onAudioFocusChange(int i) {
        C3749pf c3749pf = this.f35006a;
        c3749pf.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                c3749pf.e(4);
                return;
            } else {
                c3749pf.f(0);
                c3749pf.e(3);
                return;
            }
        }
        if (i == -1) {
            c3749pf.f(-1);
            c3749pf.d();
            c3749pf.e(1);
        } else if (i != 1) {
            com.anythink.basead.b.c.i.s(i, "Unknown focus change type: ", "AudioFocusManager", new StringBuilder(String.valueOf(i).length() + 27));
        } else {
            c3749pf.e(2);
            c3749pf.f(1);
        }
    }
}
