package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* loaded from: classes.dex */
public final class xq0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: f, reason: collision with root package name */
    private final AudioManager f14306f;

    /* renamed from: g, reason: collision with root package name */
    private final wq0 f14307g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14308h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14309i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14310j;

    /* renamed from: k, reason: collision with root package name */
    private float f14311k = 1.0f;

    public xq0(Context context, wq0 wq0Var) {
        this.f14306f = (AudioManager) context.getSystemService("audio");
        this.f14307g = wq0Var;
    }

    private final void f() {
        boolean z6 = false;
        if (!this.f14309i || this.f14310j || this.f14311k <= 0.0f) {
            if (this.f14308h) {
                AudioManager audioManager = this.f14306f;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z6 = true;
                    }
                    this.f14308h = z6;
                }
                this.f14307g.m();
            }
            return;
        }
        if (this.f14308h) {
            return;
        }
        AudioManager audioManager2 = this.f14306f;
        if (audioManager2 != null) {
            if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                z6 = true;
            }
            this.f14308h = z6;
        }
        this.f14307g.m();
    }

    public final float a() {
        float f7 = this.f14310j ? 0.0f : this.f14311k;
        if (this.f14308h) {
            return f7;
        }
        return 0.0f;
    }

    public final void b() {
        this.f14309i = true;
        f();
    }

    public final void c() {
        this.f14309i = false;
        f();
    }

    public final void d(boolean z6) {
        this.f14310j = z6;
        f();
    }

    public final void e(float f7) {
        this.f14311k = f7;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        this.f14308h = i7 > 0;
        this.f14307g.m();
    }
}
