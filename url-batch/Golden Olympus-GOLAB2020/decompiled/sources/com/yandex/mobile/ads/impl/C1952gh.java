package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.yandex.mobile.ads.impl.C1952gh;
import com.yandex.mobile.ads.impl.h60;

/* renamed from: com.yandex.mobile.ads.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1952gh {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f26137a;

    /* renamed from: b, reason: collision with root package name */
    private final a f26138b;

    /* renamed from: c, reason: collision with root package name */
    private b f26139c;

    /* renamed from: d, reason: collision with root package name */
    private C1856ch f26140d;

    /* renamed from: f, reason: collision with root package name */
    private int f26142f;

    /* renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f26144h;

    /* renamed from: g, reason: collision with root package name */
    private float f26143g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f26141e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.gh$a */
    class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f26145a;

        public a(Handler handler) {
            this.f26145a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i4) {
            this.f26145a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.L3
                @Override // java.lang.Runnable
                public final void run() {
                    C1952gh.a.this.a(i4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i4) {
            C1856ch c1856ch;
            C1952gh c1952gh = C1952gh.this;
            if (i4 == -3 || i4 == -2) {
                if (i4 != -2 && ((c1856ch = c1952gh.f26140d) == null || c1856ch.f24208b != 1)) {
                    c1952gh.a(3);
                    return;
                }
                b bVar = c1952gh.f26139c;
                if (bVar != null) {
                    ((h60.b) bVar).a(0);
                }
                c1952gh.a(2);
                return;
            }
            if (i4 == -1) {
                b bVar2 = c1952gh.f26139c;
                if (bVar2 != null) {
                    ((h60.b) bVar2).a(-1);
                }
                c1952gh.a();
                return;
            }
            if (i4 != 1) {
                c1952gh.getClass();
                ms0.d("AudioFocusManager", "Unknown focus change type: " + i4);
                return;
            }
            c1952gh.a(1);
            b bVar3 = c1952gh.f26139c;
            if (bVar3 != null) {
                ((h60.b) bVar3).a(1);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gh$b */
    public interface b {
    }

    public C1952gh(Context context, Handler handler, b bVar) {
        this.f26137a = (AudioManager) C2253tf.a((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f26139c = bVar;
        this.f26138b = new a(handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f26141e == 0) {
            return;
        }
        if (u82.f32873a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f26144h;
            if (audioFocusRequest != null) {
                this.f26137a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f26137a.abandonAudioFocus(this.f26138b);
        }
        a(0);
    }

    public final float b() {
        return this.f26143g;
    }

    public final void c() {
        this.f26139c = null;
        a();
    }

    public final void d() {
        if (u82.a(this.f26140d, (Object) null)) {
            return;
        }
        this.f26140d = null;
        this.f26142f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4) {
        if (this.f26141e == i4) {
            return;
        }
        this.f26141e = i4;
        float f4 = i4 == 3 ? 0.2f : 1.0f;
        if (this.f26143g == f4) {
            return;
        }
        this.f26143g = f4;
        b bVar = this.f26139c;
        if (bVar != null) {
            ((h60.b) bVar).e();
        }
    }

    public final int a(boolean z4, int i4) {
        int requestAudioFocus;
        AudioFocusRequest.Builder a4;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        if (i4 == 1 || this.f26142f != 1) {
            a();
            return z4 ? 1 : -1;
        }
        if (z4) {
            if (this.f26141e == 1) {
                return 1;
            }
            if (u82.f32873a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f26144h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        K3.a();
                        a4 = I3.a(this.f26142f);
                    } else {
                        K3.a();
                        a4 = J3.a(this.f26144h);
                    }
                    C1856ch c1856ch = this.f26140d;
                    boolean z5 = c1856ch != null && c1856ch.f24208b == 1;
                    c1856ch.getClass();
                    audioAttributes = a4.setAudioAttributes(c1856ch.a().f24214a);
                    willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z5);
                    onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.f26138b);
                    build = onAudioFocusChangeListener.build();
                    this.f26144h = build;
                }
                requestAudioFocus = this.f26137a.requestAudioFocus(this.f26144h);
            } else {
                AudioManager audioManager = this.f26137a;
                a aVar = this.f26138b;
                C1856ch c1856ch2 = this.f26140d;
                c1856ch2.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(aVar, u82.c(c1856ch2.f24210d), this.f26142f);
            }
            if (requestAudioFocus == 1) {
                a(1);
                return 1;
            }
            a(0);
        }
        return -1;
    }
}
