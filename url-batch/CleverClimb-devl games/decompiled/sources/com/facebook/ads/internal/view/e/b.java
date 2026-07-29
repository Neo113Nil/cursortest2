package com.facebook.ads.internal.view.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.j.f;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.view.e.b.h;
import com.facebook.ads.internal.view.e.b.j;
import com.facebook.ads.internal.view.e.b.l;
import com.facebook.ads.internal.view.e.b.n;
import com.facebook.ads.internal.view.e.b.p;
import com.facebook.ads.internal.view.e.b.r;
import com.facebook.ads.internal.view.e.b.s;
import com.facebook.ads.internal.view.e.b.t;
import com.facebook.ads.internal.view.e.b.v;
import com.facebook.ads.internal.view.e.b.x;
import com.facebook.ads.internal.view.e.b.y;
import com.facebook.ads.internal.view.e.d;
import com.facebook.ads.internal.view.e.d.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b extends RelativeLayout implements d.a, e {

    /* renamed from: b, reason: collision with root package name */
    private static final l f5644b = new l();

    /* renamed from: c, reason: collision with root package name */
    private static final com.facebook.ads.internal.view.e.b.d f5645c = new com.facebook.ads.internal.view.e.b.d();

    /* renamed from: d, reason: collision with root package name */
    private static final n f5646d = new n();
    private static final r e = new r();
    private static final h f = new h();
    private static final s g = new s();
    private static final j h = new j();
    private static final v i = new v();
    private static final y j = new y();
    private static final x k = new x();

    /* renamed from: a, reason: collision with root package name */
    protected final com.facebook.ads.internal.view.e.d.c f5647a;
    private final List<com.facebook.ads.internal.view.e.a.b> l;
    private final Handler m;
    private final Handler n;
    private final com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d> o;
    private boolean p;
    private boolean q;
    private final View.OnTouchListener r;

    public b(Context context) {
        super(context);
        this.l = new ArrayList();
        this.m = new Handler();
        this.n = new Handler();
        this.o = new com.facebook.ads.internal.j.e<>();
        this.r = new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.b.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.o.a((com.facebook.ads.internal.j.e) new t(view, motionEvent));
                return false;
            }
        };
        this.f5647a = com.facebook.ads.internal.l.a.a(context) ? new com.facebook.ads.internal.view.e.d.a(context) : new com.facebook.ads.internal.view.e.d.b(context);
        a();
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new ArrayList();
        this.m = new Handler();
        this.n = new Handler();
        this.o = new com.facebook.ads.internal.j.e<>();
        this.r = new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.b.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.o.a((com.facebook.ads.internal.j.e) new t(view, motionEvent));
                return false;
            }
        };
        this.f5647a = com.facebook.ads.internal.l.a.a(context) ? new com.facebook.ads.internal.view.e.d.a(context, attributeSet) : new com.facebook.ads.internal.view.e.d.b(context, attributeSet);
        a();
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = new ArrayList();
        this.m = new Handler();
        this.n = new Handler();
        this.o = new com.facebook.ads.internal.j.e<>();
        this.r = new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.b.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.o.a((com.facebook.ads.internal.j.e) new t(view, motionEvent));
                return false;
            }
        };
        this.f5647a = com.facebook.ads.internal.l.a.a(context) ? new com.facebook.ads.internal.view.e.d.a(context, attributeSet, i2) : new com.facebook.ads.internal.view.e.d.b(context, attributeSet, i2);
        a();
    }

    @TargetApi(21)
    public b(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.l = new ArrayList();
        this.m = new Handler();
        this.n = new Handler();
        this.o = new com.facebook.ads.internal.j.e<>();
        this.r = new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.b.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.o.a((com.facebook.ads.internal.j.e) new t(view, motionEvent));
                return false;
            }
        };
        this.f5647a = com.facebook.ads.internal.l.a.a(context) ? new com.facebook.ads.internal.view.e.d.a(context, attributeSet, i2, i3) : new com.facebook.ads.internal.view.e.d.b(context, attributeSet, i2, i3);
        a();
    }

    private void a() {
        if (g() && (this.f5647a instanceof com.facebook.ads.internal.view.e.d.a)) {
            ((com.facebook.ads.internal.view.e.d.a) this.f5647a).setTestMode(AdInternalSettings.isTestMode(getContext()));
        }
        this.f5647a.setRequestedVolume(1.0f);
        this.f5647a.setVideoStateChangeListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView((View) this.f5647a, layoutParams);
        setOnTouchListener(this.r);
    }

    public void a(int i2) {
        this.f5647a.a(i2);
    }

    @Override // com.facebook.ads.internal.view.e.d.e
    public void a(final int i2, final int i3) {
        this.n.post(new Runnable() { // from class: com.facebook.ads.internal.view.e.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.o.a((com.facebook.ads.internal.j.e) new p(i2, i3));
            }
        });
    }

    public void a(com.facebook.ads.internal.view.e.a.a aVar) {
        if (this.p && this.f5647a.getState() == com.facebook.ads.internal.view.e.d.d.PLAYBACK_COMPLETED) {
            this.p = false;
        }
        this.f5647a.a(aVar);
    }

    public void a(com.facebook.ads.internal.view.e.a.b bVar) {
        this.l.add(bVar);
    }

    @Override // com.facebook.ads.internal.view.e.d.e
    public void a(final com.facebook.ads.internal.view.e.d.d dVar) {
        final int currentPosition = getCurrentPosition();
        final int duration = getDuration();
        this.n.post(new Runnable() { // from class: com.facebook.ads.internal.view.e.b.1
            @Override // java.lang.Runnable
            public void run() {
                com.facebook.ads.internal.j.e eVar;
                com.facebook.ads.internal.j.d dVar2;
                com.facebook.ads.internal.j.e eVar2;
                com.facebook.ads.internal.j.d bVar;
                if (dVar == com.facebook.ads.internal.view.e.d.d.PREPARED) {
                    eVar2 = b.this.o;
                    bVar = b.f5644b;
                } else if (dVar == com.facebook.ads.internal.view.e.d.d.ERROR) {
                    b.this.p = true;
                    eVar2 = b.this.o;
                    bVar = b.f5645c;
                } else {
                    if (dVar != com.facebook.ads.internal.view.e.d.d.PLAYBACK_COMPLETED) {
                        if (dVar == com.facebook.ads.internal.view.e.d.d.STARTED) {
                            b.this.o.a((com.facebook.ads.internal.j.e) b.h);
                            b.this.m.removeCallbacksAndMessages(null);
                            b.this.m.postDelayed(new Runnable() { // from class: com.facebook.ads.internal.view.e.b.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (b.this.p) {
                                        return;
                                    }
                                    b.this.o.a((com.facebook.ads.internal.j.e) b.f5646d);
                                    b.this.m.postDelayed(this, 250L);
                                }
                            }, 250L);
                            return;
                        }
                        if (dVar == com.facebook.ads.internal.view.e.d.d.PAUSED) {
                            eVar = b.this.o;
                            dVar2 = b.f;
                        } else {
                            if (dVar != com.facebook.ads.internal.view.e.d.d.IDLE) {
                                return;
                            }
                            eVar = b.this.o;
                            dVar2 = b.g;
                        }
                        eVar.a((com.facebook.ads.internal.j.e) dVar2);
                        b.this.m.removeCallbacksAndMessages(null);
                        return;
                    }
                    b.this.p = true;
                    b.this.m.removeCallbacksAndMessages(null);
                    eVar2 = b.this.o;
                    bVar = new com.facebook.ads.internal.view.e.b.b(currentPosition, duration);
                }
                eVar2.a((com.facebook.ads.internal.j.e) bVar);
            }
        });
    }

    public void a(boolean z) {
        this.f5647a.a(z);
    }

    public void c() {
        for (com.facebook.ads.internal.view.e.a.b bVar : this.l) {
            if (bVar instanceof com.facebook.ads.internal.view.e.a.c) {
                com.facebook.ads.internal.view.e.a.c cVar = (com.facebook.ads.internal.view.e.a.c) bVar;
                if (cVar.getParent() == null) {
                    addView(cVar);
                    cVar.a(this);
                }
            } else {
                bVar.a(this);
            }
        }
    }

    public void d() {
        for (com.facebook.ads.internal.view.e.a.b bVar : this.l) {
            if (bVar instanceof com.facebook.ads.internal.view.e.a.c) {
                com.facebook.ads.internal.view.e.a.c cVar = (com.facebook.ads.internal.view.e.a.c) bVar;
                if (cVar.getParent() != null) {
                    cVar.b(this);
                    removeView(cVar);
                }
            } else {
                bVar.b(this);
            }
        }
    }

    public void e() {
        this.n.post(new Runnable() { // from class: com.facebook.ads.internal.view.e.b.4
            @Override // java.lang.Runnable
            public void run() {
                b.this.getEventBus().a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) b.e);
            }
        });
        this.f5647a.b();
    }

    public void f() {
        this.f5647a.c();
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public boolean g() {
        return com.facebook.ads.internal.l.a.a(getContext());
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public int getCurrentPosition() {
        return this.f5647a.getCurrentPosition();
    }

    public int getDuration() {
        return this.f5647a.getDuration();
    }

    public com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d> getEventBus() {
        return this.o;
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public long getInitialBufferTime() {
        return this.f5647a.getInitialBufferTime();
    }

    public com.facebook.ads.internal.view.e.d.d getState() {
        return this.f5647a.getState();
    }

    protected Handler getStateHandler() {
        return this.n;
    }

    public TextureView getTextureView() {
        return (TextureView) this.f5647a;
    }

    public int getVideoHeight() {
        return this.f5647a.getVideoHeight();
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public com.facebook.ads.internal.view.e.a.a getVideoStartReason() {
        return this.f5647a.getStartReason();
    }

    public View getVideoView() {
        return this.f5647a.getView();
    }

    public int getVideoWidth() {
        return this.f5647a.getVideoWidth();
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public float getVolume() {
        return this.f5647a.getVolume();
    }

    public void h() {
        this.f5647a.b(true);
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public boolean i() {
        return this.q;
    }

    public boolean j() {
        return this.f5647a.d();
    }

    public void k() {
        this.f5647a.setVideoStateChangeListener(null);
        this.f5647a.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) k);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) j);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.f5647a != null) {
            this.f5647a.setControlsAnchorView(view);
        }
    }

    public void setIsFullScreen(boolean z) {
        this.q = z;
        this.f5647a.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(String str) {
        this.f5647a.setVideoMPD(str);
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            d();
        } else {
            c();
            this.f5647a.setup(uri);
        }
        this.p = false;
    }

    public void setVideoURI(String str) {
        setVideoURI(str != null ? Uri.parse(str) : null);
    }

    public void setVolume(float f2) {
        this.f5647a.setRequestedVolume(f2);
        getEventBus().a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) i);
    }
}
