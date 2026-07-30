package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3750pg {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f33426a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f33427b;

    /* renamed from: c, reason: collision with root package name */
    public final C2777Sj f33428c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f33429d;

    public C3750pg(C4125we c4125we, Handler handler, C2777Sj c2777Sj) {
        AudioFocusRequest audioFocusRequest;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        this.f33427b = handler;
        this.f33428c = c2777Sj;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            this.f33426a = new C3266gg(c4125we, handler);
        } else {
            this.f33426a = c4125we;
        }
        if (i >= 26) {
            audioAttributes = com.anythink.basead.exoplayer.k.A.j().setAudioAttributes(c2777Sj.a());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(false);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(c4125we, handler);
            acceptsDelayedFocusGain = onAudioFocusChangeListener.setAcceptsDelayedFocusGain(true);
            audioFocusRequest = acceptsDelayedFocusGain.build();
        } else {
            audioFocusRequest = null;
        }
        this.f33429d = audioFocusRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3750pg)) {
            return false;
        }
        C3750pg c3750pg = (C3750pg) obj;
        c3750pg.getClass();
        return Objects.equals(this.f33426a, c3750pg.f33426a) && Objects.equals(this.f33427b, c3750pg.f33427b) && Objects.equals(this.f33428c, c3750pg.f33428c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f33426a, this.f33427b, this.f33428c, Boolean.FALSE);
    }
}
