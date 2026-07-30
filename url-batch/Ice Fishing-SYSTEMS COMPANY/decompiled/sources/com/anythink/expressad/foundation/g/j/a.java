package com.anythink.expressad.foundation.g.j;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private String f19739b;

    /* renamed from: c, reason: collision with root package name */
    private MediaPlayer f19740c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f19741d;

    /* renamed from: f, reason: collision with root package name */
    private volatile MediaPlayer.OnPreparedListener f19743f;

    /* renamed from: a, reason: collision with root package name */
    Object f19738a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f19742e = false;

    public static /* synthetic */ boolean a(a aVar) {
        aVar.f19742e = true;
        return true;
    }

    private String c() {
        return this.f19739b;
    }

    private MediaPlayer d() {
        return this.f19740c;
    }

    private void a(MediaPlayer mediaPlayer, String str) {
        this.f19740c = mediaPlayer;
        this.f19739b = str;
        this.f19741d = true;
        this.f19740c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.anythink.expressad.foundation.g.j.a.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                synchronized (a.this.f19738a) {
                    try {
                        a.a(a.this);
                        if (a.this.f19743f != null) {
                            a.this.f19743f.onPrepared(mediaPlayer2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        try {
            this.f19740c.prepareAsync();
        } catch (Throwable unused) {
        }
    }

    private boolean b() {
        boolean z8;
        synchronized (this.f19738a) {
            z8 = this.f19742e;
        }
        return z8;
    }

    private boolean a() {
        boolean z8;
        synchronized (this.f19738a) {
            z8 = this.f19741d;
        }
        return z8;
    }

    private void a(MediaPlayer.OnPreparedListener onPreparedListener) {
        synchronized (this.f19738a) {
            this.f19743f = onPreparedListener;
        }
    }
}
