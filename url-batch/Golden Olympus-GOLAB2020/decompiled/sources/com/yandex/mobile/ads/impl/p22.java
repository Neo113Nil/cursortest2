package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.yandex.mobile.ads.impl.h60;
import com.yandex.mobile.ads.impl.p22;

/* loaded from: classes3.dex */
final class p22 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30295a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f30296b;

    /* renamed from: c, reason: collision with root package name */
    private final a f30297c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f30298d;

    /* renamed from: e, reason: collision with root package name */
    private b f30299e;

    /* renamed from: f, reason: collision with root package name */
    private int f30300f;

    /* renamed from: g, reason: collision with root package name */
    private int f30301g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30302h;

    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends BroadcastReceiver {
        /* JADX INFO: Access modifiers changed from: private */
        public static void a(p22 p22Var) {
            int b4 = p22.b(p22Var.f30298d, p22Var.f30300f);
            boolean a4 = p22.a(p22Var.f30298d, p22Var.f30300f);
            if (p22Var.f30301g == b4 && p22Var.f30302h == a4) {
                return;
            }
            p22Var.f30301g = b4;
            p22Var.f30302h = a4;
            ((h60.b) p22Var.f30297c).a(a4, b4);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            final p22 p22Var = p22.this;
            p22Var.f30296b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Sb
                @Override // java.lang.Runnable
                public final void run() {
                    p22.b.a(p22.this);
                }
            });
        }

        private b() {
        }
    }

    public p22(Context context, Handler handler, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f30295a = applicationContext;
        this.f30296b = handler;
        this.f30297c = aVar;
        AudioManager audioManager = (AudioManager) C2253tf.a((AudioManager) applicationContext.getSystemService("audio"));
        this.f30298d = audioManager;
        this.f30300f = 3;
        this.f30301g = b(audioManager, 3);
        this.f30302h = a(audioManager, this.f30300f);
        b bVar = new b();
        try {
            applicationContext.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f30299e = bVar;
        } catch (RuntimeException e4) {
            ms0.b("StreamVolumeManager", "Error registering stream volume receiver", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(AudioManager audioManager, int i4) {
        try {
            return audioManager.getStreamVolume(i4);
        } catch (RuntimeException e4) {
            ms0.b("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i4, e4);
            return audioManager.getStreamMaxVolume(i4);
        }
    }

    public final int a() {
        return this.f30298d.getStreamMaxVolume(this.f30300f);
    }

    public final void c() {
        b bVar = this.f30299e;
        if (bVar != null) {
            try {
                this.f30295a.unregisterReceiver(bVar);
            } catch (RuntimeException e4) {
                ms0.b("StreamVolumeManager", "Error unregistering stream volume receiver", e4);
            }
            this.f30299e = null;
        }
    }

    public final void a(int i4) {
        if (this.f30300f == i4) {
            return;
        }
        this.f30300f = i4;
        int b4 = b(this.f30298d, i4);
        boolean a4 = a(this.f30298d, this.f30300f);
        if (this.f30301g != b4 || this.f30302h != a4) {
            this.f30301g = b4;
            this.f30302h = a4;
            ((h60.b) this.f30297c).a(a4, b4);
        }
        ((h60.b) this.f30297c).d();
    }

    public final int b() {
        int streamMinVolume;
        if (u82.f32873a < 28) {
            return 0;
        }
        streamMinVolume = this.f30298d.getStreamMinVolume(this.f30300f);
        return streamMinVolume;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(AudioManager audioManager, int i4) {
        if (u82.f32873a >= 23) {
            return audioManager.isStreamMute(i4);
        }
        return b(audioManager, i4) == 0;
    }
}
