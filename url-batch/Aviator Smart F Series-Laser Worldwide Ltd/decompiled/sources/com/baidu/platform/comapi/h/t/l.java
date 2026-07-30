package com.baidu.platform.comapi.h.t;

import android.media.MediaPlayer;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static l f9288a;

    /* renamed from: b, reason: collision with root package name */
    private MediaPlayer f9289b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9290c = false;

    class a implements MediaPlayer.OnCompletionListener {
        a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.baidu.platform.comapi.wnplatform.tts.c.a().a(false);
        }
    }

    class b implements MediaPlayer.OnCompletionListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            l.this.f9290c = false;
        }
    }

    class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            l.this.f9290c = false;
        }
    }

    private l() {
    }

    private void c() {
        if (this.f9289b == null) {
            this.f9289b = new MediaPlayer();
        }
    }

    private void d() {
        MediaPlayer mediaPlayer = this.f9289b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f9289b = null;
        }
    }

    public boolean b() {
        return this.f9290c;
    }

    public static synchronized l a() {
        l lVar;
        synchronized (l.class) {
            try {
                if (f9288a == null) {
                    f9288a = new l();
                }
                lVar = f9288a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    public void b(String str) {
        com.baidu.platform.comapi.h.g.a.c("yang12", "WN player playEnd-->" + str);
        d();
        c();
        try {
            this.f9290c = true;
            if (com.baidu.platform.comapi.walknavi.b.n().f() != null) {
                this.f9289b.setDataSource(str);
                this.f9289b.prepare();
                this.f9289b.start();
                this.f9289b.setOnCompletionListener(new c());
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void c(String str) {
        com.baidu.platform.comapi.h.g.a.c("yang12", "WN player playStart-->" + str);
        d();
        c();
        try {
            this.f9290c = true;
            if (com.baidu.platform.comapi.walknavi.b.n().f() != null) {
                this.f9289b.setDataSource(str);
                this.f9289b.prepare();
                this.f9289b.start();
                this.f9289b.setOnCompletionListener(new b());
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public boolean a(String str) {
        com.baidu.platform.comapi.h.g.a.b("WN player play-->" + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d();
        c();
        try {
            com.baidu.platform.comapi.wnplatform.tts.c.a().a(true);
            if (com.baidu.platform.comapi.walknavi.b.n().f() == null) {
                return false;
            }
            this.f9289b.setDataSource(str);
            this.f9289b.prepare();
            this.f9289b.start();
            this.f9289b.setOnCompletionListener(new a());
            return true;
        } catch (Exception unused) {
            com.baidu.platform.comapi.wnplatform.tts.c.a().a(false);
            return false;
        }
    }
}
