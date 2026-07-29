package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.ads.internal.q.c.d;
import com.facebook.ads.internal.view.e.b.b;
import com.facebook.ads.internal.view.e.b.c;
import com.facebook.ads.internal.view.e.b.d;
import com.facebook.ads.internal.view.e.b.e;
import com.facebook.ads.internal.view.e.b.h;
import com.facebook.ads.internal.view.e.b.i;
import com.facebook.ads.internal.view.e.b.j;
import com.facebook.ads.internal.view.e.b.k;
import com.facebook.ads.internal.view.e.b.l;
import com.facebook.ads.internal.view.e.b.m;
import com.facebook.ads.internal.view.e.b.p;
import com.facebook.ads.internal.view.e.b.q;
import com.facebook.ads.internal.view.e.b.v;
import com.facebook.ads.internal.view.e.b.w;
import com.facebook.ads.internal.view.n;
import com.facebook.ads.internal.view.o;

/* loaded from: classes.dex */
public abstract class MediaViewVideoRenderer extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    private static final String f4792d = "MediaViewVideoRenderer";

    /* renamed from: a, reason: collision with root package name */
    protected NativeAd f4793a;

    /* renamed from: b, reason: collision with root package name */
    protected VideoAutoplayBehavior f4794b;

    /* renamed from: c, reason: collision with root package name */
    final n f4795c;
    private final m e;
    private final k f;
    private final i g;
    private final q h;
    private final c i;
    private final w j;
    private final e k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    public MediaViewVideoRenderer(Context context) {
        super(context);
        this.e = new m() { // from class: com.facebook.ads.MediaViewVideoRenderer.1
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                MediaViewVideoRenderer.this.onPrepared();
            }
        };
        this.f = new k() { // from class: com.facebook.ads.MediaViewVideoRenderer.2
            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                MediaViewVideoRenderer.this.onPlayed();
            }
        };
        this.g = new i() { // from class: com.facebook.ads.MediaViewVideoRenderer.3
            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                MediaViewVideoRenderer.this.onPaused();
            }
        };
        this.h = new q() { // from class: com.facebook.ads.MediaViewVideoRenderer.4
            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                MediaViewVideoRenderer.this.onSeek();
            }
        };
        this.i = new c() { // from class: com.facebook.ads.MediaViewVideoRenderer.5
            @Override // com.facebook.ads.internal.j.f
            public void a(b bVar) {
                MediaViewVideoRenderer.this.onCompleted();
            }
        };
        this.j = new w() { // from class: com.facebook.ads.MediaViewVideoRenderer.6
            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                MediaViewVideoRenderer.this.onVolumeChanged();
            }
        };
        this.k = new e() { // from class: com.facebook.ads.MediaViewVideoRenderer.7
            @Override // com.facebook.ads.internal.j.f
            public void a(d dVar) {
                MediaViewVideoRenderer.this.onError();
            }
        };
        this.n = true;
        this.o = true;
        this.f4795c = new n(context);
        a();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new m() { // from class: com.facebook.ads.MediaViewVideoRenderer.1
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                MediaViewVideoRenderer.this.onPrepared();
            }
        };
        this.f = new k() { // from class: com.facebook.ads.MediaViewVideoRenderer.2
            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                MediaViewVideoRenderer.this.onPlayed();
            }
        };
        this.g = new i() { // from class: com.facebook.ads.MediaViewVideoRenderer.3
            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                MediaViewVideoRenderer.this.onPaused();
            }
        };
        this.h = new q() { // from class: com.facebook.ads.MediaViewVideoRenderer.4
            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                MediaViewVideoRenderer.this.onSeek();
            }
        };
        this.i = new c() { // from class: com.facebook.ads.MediaViewVideoRenderer.5
            @Override // com.facebook.ads.internal.j.f
            public void a(b bVar) {
                MediaViewVideoRenderer.this.onCompleted();
            }
        };
        this.j = new w() { // from class: com.facebook.ads.MediaViewVideoRenderer.6
            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                MediaViewVideoRenderer.this.onVolumeChanged();
            }
        };
        this.k = new e() { // from class: com.facebook.ads.MediaViewVideoRenderer.7
            @Override // com.facebook.ads.internal.j.f
            public void a(d dVar) {
                MediaViewVideoRenderer.this.onError();
            }
        };
        this.n = true;
        this.o = true;
        this.f4795c = new n(context, attributeSet);
        a();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new m() { // from class: com.facebook.ads.MediaViewVideoRenderer.1
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                MediaViewVideoRenderer.this.onPrepared();
            }
        };
        this.f = new k() { // from class: com.facebook.ads.MediaViewVideoRenderer.2
            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                MediaViewVideoRenderer.this.onPlayed();
            }
        };
        this.g = new i() { // from class: com.facebook.ads.MediaViewVideoRenderer.3
            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                MediaViewVideoRenderer.this.onPaused();
            }
        };
        this.h = new q() { // from class: com.facebook.ads.MediaViewVideoRenderer.4
            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                MediaViewVideoRenderer.this.onSeek();
            }
        };
        this.i = new c() { // from class: com.facebook.ads.MediaViewVideoRenderer.5
            @Override // com.facebook.ads.internal.j.f
            public void a(b bVar) {
                MediaViewVideoRenderer.this.onCompleted();
            }
        };
        this.j = new w() { // from class: com.facebook.ads.MediaViewVideoRenderer.6
            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                MediaViewVideoRenderer.this.onVolumeChanged();
            }
        };
        this.k = new e() { // from class: com.facebook.ads.MediaViewVideoRenderer.7
            @Override // com.facebook.ads.internal.j.f
            public void a(d dVar) {
                MediaViewVideoRenderer.this.onError();
            }
        };
        this.n = true;
        this.o = true;
        this.f4795c = new n(context, attributeSet, i);
        a();
    }

    @TargetApi(21)
    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new m() { // from class: com.facebook.ads.MediaViewVideoRenderer.1
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                MediaViewVideoRenderer.this.onPrepared();
            }
        };
        this.f = new k() { // from class: com.facebook.ads.MediaViewVideoRenderer.2
            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                MediaViewVideoRenderer.this.onPlayed();
            }
        };
        this.g = new i() { // from class: com.facebook.ads.MediaViewVideoRenderer.3
            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                MediaViewVideoRenderer.this.onPaused();
            }
        };
        this.h = new q() { // from class: com.facebook.ads.MediaViewVideoRenderer.4
            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                MediaViewVideoRenderer.this.onSeek();
            }
        };
        this.i = new c() { // from class: com.facebook.ads.MediaViewVideoRenderer.5
            @Override // com.facebook.ads.internal.j.f
            public void a(b bVar) {
                MediaViewVideoRenderer.this.onCompleted();
            }
        };
        this.j = new w() { // from class: com.facebook.ads.MediaViewVideoRenderer.6
            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                MediaViewVideoRenderer.this.onVolumeChanged();
            }
        };
        this.k = new e() { // from class: com.facebook.ads.MediaViewVideoRenderer.7
            @Override // com.facebook.ads.internal.j.f
            public void a(d dVar) {
                MediaViewVideoRenderer.this.onError();
            }
        };
        this.n = true;
        this.o = true;
        this.f4795c = new n(context, attributeSet, i, i2);
        a();
    }

    private void a() {
        this.f4795c.setEnableBackgroundVideo(shouldAllowBackgroundPlayback());
        this.f4795c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f4795c);
        com.facebook.ads.internal.q.a.i.a(this.f4795c, com.facebook.ads.internal.q.a.i.INTERNAL_AD_MEDIA);
        this.f4795c.getEventBus().a(this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public void destroy() {
        this.f4795c.k();
    }

    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.l) {
            Log.w(f4792d, "disengageSeek called without engageSeek.");
            return;
        }
        this.l = false;
        if (this.m) {
            this.f4795c.a(videoStartReason.a());
        }
        onSeekDisengaged();
    }

    public final void engageSeek() {
        if (this.l) {
            Log.w(f4792d, "engageSeek called without disengageSeek.");
            return;
        }
        this.l = true;
        this.m = com.facebook.ads.internal.view.e.d.d.STARTED.equals(this.f4795c.getState());
        this.f4795c.a(false);
        onSeekEngaged();
    }

    public final int getCurrentTimeMs() {
        return this.f4795c.getCurrentPosition();
    }

    public final int getDuration() {
        return this.f4795c.getDuration();
    }

    public final float getVolume() {
        return this.f4795c.getVolume();
    }

    public void onCompleted() {
    }

    public void onError() {
    }

    public void onPaused() {
    }

    public void onPlayed() {
    }

    public void onPrepared() {
    }

    public void onSeek() {
    }

    public void onSeekDisengaged() {
    }

    public void onSeekEngaged() {
    }

    public void onVolumeChanged() {
    }

    public final void pause(boolean z) {
        this.f4795c.a(z);
    }

    public final void play(VideoStartReason videoStartReason) {
        this.f4795c.a(videoStartReason.a());
    }

    public final void seekTo(int i) {
        if (this.l) {
            this.f4795c.a(i);
        } else {
            Log.w(f4792d, "Seeking must be preceded by a call to engageSeek, and followed by a call to disengageSeek.");
        }
    }

    final void setAdEventManager(com.facebook.ads.internal.m.c cVar) {
        this.f4795c.setAdEventManager(cVar);
    }

    @Deprecated
    void setAutoplay(boolean z) {
        this.n = z;
    }

    @Deprecated
    void setAutoplayOnMobile(boolean z) {
        this.o = z;
    }

    final void setListener(o oVar) {
        this.f4795c.setListener(oVar);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.f4793a = nativeAd;
        this.f4795c.a(nativeAd.d(), nativeAd.g());
        this.f4795c.setVideoMPD(nativeAd.c());
        this.f4795c.setVideoURI(nativeAd.b());
        this.f4795c.setVideoCTA(nativeAd.getAdCallToAction());
        this.f4795c.setNativeAd(nativeAd);
        this.f4794b = nativeAd.e();
    }

    public final void setVolume(float f) {
        this.f4795c.setVolume(f);
    }

    public boolean shouldAllowBackgroundPlayback() {
        return false;
    }

    public boolean shouldAutoplay() {
        if (this.f4795c == null || this.f4795c.getState() == com.facebook.ads.internal.view.e.d.d.PLAYBACK_COMPLETED) {
            return false;
        }
        if (this.f4794b != VideoAutoplayBehavior.DEFAULT) {
            return this.f4794b == VideoAutoplayBehavior.ON;
        }
        if (this.n) {
            return this.o || com.facebook.ads.internal.q.c.d.c(getContext()) == d.a.MOBILE_INTERNET;
        }
        return false;
    }

    public void unsetNativeAd() {
        pause(false);
        this.f4795c.a((String) null, (String) null);
        this.f4795c.setVideoMPD(null);
        this.f4795c.setVideoURI((Uri) null);
        this.f4795c.setVideoCTA(null);
        this.f4795c.setNativeAd(null);
        this.f4794b = VideoAutoplayBehavior.DEFAULT;
        this.f4793a = null;
    }
}
