package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b extends com.facebook.ads.internal.view.e.a.c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<AudioManager.OnAudioFocusChangeListener> f5703a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.ads.internal.view.e.b.c f5704b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.ads.internal.view.e.b.i f5705c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.ads.internal.view.e.b.k f5706d;

    public b(Context context) {
        super(context);
        this.f5703a = null;
        this.f5704b = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.b.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                ((AudioManager) b.this.getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(b.this.f5703a == null ? null : (AudioManager.OnAudioFocusChangeListener) b.this.f5703a.get());
            }
        };
        this.f5705c = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.e.c.b.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                ((AudioManager) b.this.getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(b.this.f5703a == null ? null : (AudioManager.OnAudioFocusChangeListener) b.this.f5703a.get());
            }
        };
        this.f5706d = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.e.c.b.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                if (b.this.f5703a == null || b.this.f5703a.get() == null) {
                    b.this.f5703a = new WeakReference(new AudioManager.OnAudioFocusChangeListener() { // from class: com.facebook.ads.internal.view.e.c.b.3.1
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public void onAudioFocusChange(int i) {
                            if (b.this.getVideoView() == null || i > 0) {
                                return;
                            }
                            b.this.getVideoView().a(false);
                        }
                    });
                }
                ((AudioManager) b.this.getContext().getApplicationContext().getSystemService("audio")).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) b.this.f5703a.get(), 3, 1);
            }
        };
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    protected void a() {
        super.a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().a(this.f5706d, this.f5704b, this.f5705c);
        }
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    protected void b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().b(this.f5705c, this.f5704b, this.f5706d);
        }
        super.b();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (getVideoView() == null || i > 0) {
            return;
        }
        getVideoView().a(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(this.f5703a == null ? null : this.f5703a.get());
        super.onDetachedFromWindow();
    }
}
